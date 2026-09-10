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
public final class aq0 extends FrameLayout {
    public int E;
    public kp0 F;
    public bh.d G;
    public bh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final bq0 L;
    public final zp0 f31051a;
    public final s4.c0 f31052b;
    public final w7 f31053c;
    public int d;
    public final org.telegram.ui.Components.d6 e;
    public final ArrayList f31054f;
    public mp0 h;
    public final RectF f31055n;
    public final RectF f31056r;
    public final RectF f31057s;
    public final Paint v;
    public final Paint f31058w;
    public int f31059x;
    public int f31060y;

    public aq0(bq0 bq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.L = bq0Var;
        this.f31054f = new ArrayList();
        this.f31055n = new RectF();
        this.f31056r = new RectF();
        this.f31057s = new RectF();
        this.v = new Paint(1);
        this.f31058w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        zp0 zp0Var = new zp0(this, context, f6Var, 0);
        this.f31051a = zp0Var;
        zp0Var.setClipToPadding(false);
        zp0Var.setClipChildren(false);
        zp0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        zp0Var.setOverScrollMode(2);
        zp0Var.setHorizontalScrollBarEnabled(false);
        zp0Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f31052b = c0Var;
        zp0Var.setLayoutManager(c0Var);
        w7 w7Var = new w7(this, 5);
        this.f31053c = w7Var;
        zp0Var.setAdapter(w7Var);
        zp0Var.setOnItemClickListener(new i(this, 20));
        addView(zp0Var, w7.a6.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.d6(zp0Var, 0L, 320L, org.telegram.ui.Components.wr.h);
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
        ArrayList arrayList = this.f31054f;
        boolean isEmpty = arrayList.isEmpty();
        zp0 zp0Var = this.f31051a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                zp0Var.x0(clamp);
            } else {
                zp0Var.u0(clamp);
            }
        }
        zp0Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f31052b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f31060y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bh.d dVar;
        xf.p.g(this.G, 0, 0, getWidth(), getHeight());
        xf.p.g(this.H, 0, 0, getWidth(), getHeight());
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
