package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dq0 extends FrameLayout {
    public int E;
    public op0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final eq0 L;
    public final v60 f35118a;
    public final s4.b0 f35119b;
    public final a8 f35120c;
    public int d;
    public final org.telegram.ui.Components.g6 e;
    public final ArrayList f35121f;
    public qp0 h;
    public final RectF f35122n;
    public final RectF f35123r;
    public final RectF f35124s;
    public final Paint v;
    public final Paint f35125w;
    public int f35126x;
    public int f35127y;

    public dq0(eq0 eq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.L = eq0Var;
        this.f35121f = new ArrayList();
        this.f35122n = new RectF();
        this.f35123r = new RectF();
        this.f35124s = new RectF();
        this.v = new Paint(1);
        this.f35125w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        v60 v60Var = new v60(this, context, c6Var, 1);
        this.f35118a = v60Var;
        v60Var.setClipToPadding(false);
        v60Var.setClipChildren(false);
        v60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        v60Var.setOverScrollMode(2);
        v60Var.setHorizontalScrollBarEnabled(false);
        v60Var.setItemAnimator(null);
        s4.b0 b0Var = new s4.b0(0, false);
        this.f35119b = b0Var;
        v60Var.setLayoutManager(b0Var);
        a8 a8Var = new a8(this, 5);
        this.f35120c = a8Var;
        v60Var.setAdapter(a8Var);
        v60Var.setOnItemClickListener(new i(this, 21));
        addView(v60Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.g6(v60Var, 0L, 320L, org.telegram.ui.Components.es.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f35121f;
        boolean isEmpty = arrayList.isEmpty();
        v60 v60Var = this.f35118a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                v60Var.x0(clamp);
            } else {
                v60Var.u0(clamp);
            }
        }
        v60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f35119b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f35127y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dh.d dVar;
        zf.q.g(this.G, 0, 0, getWidth(), getHeight());
        zf.q.g(this.H, 0, 0, getWidth(), getHeight());
        if (this.I) {
            dVar = this.H;
        } else {
            dVar = this.G;
        }
        dVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(f7, f7, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
