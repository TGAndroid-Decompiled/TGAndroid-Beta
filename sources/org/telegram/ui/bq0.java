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
    public final q60 f36234a;
    public final s4.d0 f36235b;
    public final y7 f36236c;
    public int d;
    public final org.telegram.ui.Components.g6 f36237e;
    public final ArrayList f36238f;
    public op0 h;
    public final RectF f36239n;
    public final RectF f36240r;
    public final RectF f36241s;
    public final Paint v;
    public final Paint f36242w;
    public int f36243x;
    public int f36244y;

    public bq0(cq0 cq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.L = cq0Var;
        this.f36238f = new ArrayList();
        this.f36239n = new RectF();
        this.f36240r = new RectF();
        this.f36241s = new RectF();
        this.v = new Paint(1);
        this.f36242w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        q60 q60Var = new q60(this, context, c6Var, 1);
        this.f36234a = q60Var;
        q60Var.setClipToPadding(false);
        q60Var.setClipChildren(false);
        q60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        q60Var.setOverScrollMode(2);
        q60Var.setHorizontalScrollBarEnabled(false);
        q60Var.setItemAnimator(null);
        s4.d0 d0Var = new s4.d0(0, false);
        this.f36235b = d0Var;
        q60Var.setLayoutManager(d0Var);
        y7 y7Var = new y7(this, 5);
        this.f36236c = y7Var;
        q60Var.setAdapter(y7Var);
        q60Var.setOnItemClickListener(new i(this, 21));
        addView(q60Var, w7.w5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f36237e = new org.telegram.ui.Components.g6(q60Var, 0L, 320L, org.telegram.ui.Components.js.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.f36237e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f36238f;
        boolean isEmpty = arrayList.isEmpty();
        q60 q60Var = this.f36234a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                q60Var.x0(clamp);
            } else {
                q60Var.u0(clamp);
            }
        }
        q60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f36235b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f36244y;
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
