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
public final class bq0 extends FrameLayout {
    public int E;
    public mp0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final cq0 L;
    public final q60 f32538a;
    public final s4.c0 f32539b;
    public final x7 f32540c;
    public int d;
    public final org.telegram.ui.Components.d6 e;
    public final ArrayList f32541f;
    public op0 h;
    public final RectF f32542n;
    public final RectF f32543r;
    public final RectF f32544s;
    public final Paint v;
    public final Paint f32545w;
    public int f32546x;
    public int f32547y;

    public bq0(cq0 cq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.L = cq0Var;
        this.f32541f = new ArrayList();
        this.f32542n = new RectF();
        this.f32543r = new RectF();
        this.f32544s = new RectF();
        this.v = new Paint(1);
        this.f32545w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        q60 q60Var = new q60(this, context, f6Var, 1);
        this.f32538a = q60Var;
        q60Var.setClipToPadding(false);
        q60Var.setClipChildren(false);
        q60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        q60Var.setOverScrollMode(2);
        q60Var.setHorizontalScrollBarEnabled(false);
        q60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f32539b = c0Var;
        q60Var.setLayoutManager(c0Var);
        x7 x7Var = new x7(this, 5);
        this.f32540c = x7Var;
        q60Var.setAdapter(x7Var);
        q60Var.setOnItemClickListener(new i(this, 20));
        addView(q60Var, w7.y5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.d6(q60Var, 0L, 320L, org.telegram.ui.Components.qr.h);
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
        ArrayList arrayList = this.f32541f;
        boolean isEmpty = arrayList.isEmpty();
        q60 q60Var = this.f32538a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                q60Var.y0(clamp);
            } else {
                q60Var.v0(clamp);
            }
        }
        q60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f32539b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f32547y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ch.d dVar;
        yf.p.g(this.G, 0, 0, getWidth(), getHeight());
        yf.p.g(this.H, 0, 0, getWidth(), getHeight());
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
