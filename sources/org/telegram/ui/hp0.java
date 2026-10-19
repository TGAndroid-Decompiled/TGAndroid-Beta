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
public final class hp0 extends FrameLayout {
    public int E;
    public so0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final ip0 L;
    public final g10 f37694a;
    public final s4.b0 f37695b;
    public final z7 f37696c;
    public int d;
    public final org.telegram.ui.Components.f6 e;
    public final ArrayList f37697f;
    public uo0 h;
    public final RectF f37698n;
    public final RectF f37699r;
    public final RectF f37700s;
    public final Paint v;
    public final Paint f37701w;
    public int f37702x;
    public int f37703y;

    public hp0(ip0 ip0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = ip0Var;
        this.f37697f = new ArrayList();
        this.f37698n = new RectF();
        this.f37699r = new RectF();
        this.f37700s = new RectF();
        this.v = new Paint(1);
        this.f37701w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        g10 g10Var = new g10(this, context, d6Var, 2);
        this.f37694a = g10Var;
        g10Var.setClipToPadding(false);
        g10Var.setClipChildren(false);
        g10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        g10Var.setOverScrollMode(2);
        g10Var.setHorizontalScrollBarEnabled(false);
        g10Var.setItemAnimator(null);
        s4.b0 b0Var = new s4.b0(0, false);
        this.f37695b = b0Var;
        g10Var.setLayoutManager(b0Var);
        z7 z7Var = new z7(this, 5);
        this.f37696c = z7Var;
        g10Var.setAdapter(z7Var);
        g10Var.setOnItemClickListener(new i(this, 21));
        addView(g10Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.f6(g10Var, 0L, 320L, org.telegram.ui.Components.bs.h);
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
        ArrayList arrayList = this.f37697f;
        boolean isEmpty = arrayList.isEmpty();
        g10 g10Var = this.f37694a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                g10Var.x0(clamp);
            } else {
                g10Var.u0(clamp);
            }
        }
        g10Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f37695b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f37703y;
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
