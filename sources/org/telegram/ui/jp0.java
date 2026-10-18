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
public final class jp0 extends FrameLayout {
    public int E;
    public uo0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final kp0 L;
    public final i10 f38243a;
    public final s4.b0 f38244b;
    public final z7 f38245c;
    public int d;
    public final org.telegram.ui.Components.f6 e;
    public final ArrayList f38246f;
    public wo0 h;
    public final RectF f38247n;
    public final RectF f38248r;
    public final RectF f38249s;
    public final Paint v;
    public final Paint f38250w;
    public int f38251x;
    public int f38252y;

    public jp0(kp0 kp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = kp0Var;
        this.f38246f = new ArrayList();
        this.f38247n = new RectF();
        this.f38248r = new RectF();
        this.f38249s = new RectF();
        this.v = new Paint(1);
        this.f38250w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        i10 i10Var = new i10(this, context, d6Var, 2);
        this.f38243a = i10Var;
        i10Var.setClipToPadding(false);
        i10Var.setClipChildren(false);
        i10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        i10Var.setOverScrollMode(2);
        i10Var.setHorizontalScrollBarEnabled(false);
        i10Var.setItemAnimator(null);
        s4.b0 b0Var = new s4.b0(0, false);
        this.f38244b = b0Var;
        i10Var.setLayoutManager(b0Var);
        z7 z7Var = new z7(this, 5);
        this.f38245c = z7Var;
        i10Var.setAdapter(z7Var);
        i10Var.setOnItemClickListener(new i(this, 21));
        addView(i10Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.f6(i10Var, 0L, 320L, org.telegram.ui.Components.bs.h);
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
        ArrayList arrayList = this.f38246f;
        boolean isEmpty = arrayList.isEmpty();
        i10 i10Var = this.f38243a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                i10Var.x0(clamp);
            } else {
                i10Var.u0(clamp);
            }
        }
        i10Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f38244b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f38252y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dh.d dVar;
        zf.p.g(this.G, 0, 0, getWidth(), getHeight());
        zf.p.g(this.H, 0, 0, getWidth(), getHeight());
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
