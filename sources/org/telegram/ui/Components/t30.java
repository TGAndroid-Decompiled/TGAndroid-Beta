package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
public final class t30 extends HorizontalScrollView {
    public static final RectF f30429w = new RectF();
    public final org.telegram.ui.ActionBar.p6 f30430a;
    public final t5 f30431b;
    public final t5 f30432c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f30433f;
    public boolean h;
    public int f30434n;
    public final Path f30435r;
    public final Path f30436s;

    public t30(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f30433f = textPaint;
        this.f30435r = new Path();
        this.f30436s = new Path();
        this.f30430a = p6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        t5 t5Var = new t5(new Runnable(this) {
            public final t30 f30114b;

            {
                this.f30114b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t30 t30Var = this.f30114b;
                        t30Var.invalidate();
                        LinearLayout linearLayout2 = t30Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        t30 t30Var2 = this.f30114b;
                        t30Var2.invalidate();
                        LinearLayout linearLayout3 = t30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f30431b = t5Var;
        t5Var.f30447g = 180L;
        t5 t5Var2 = new t5(new Runnable(this) {
            public final t30 f30114b;

            {
                this.f30114b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t30 t30Var = this.f30114b;
                        t30Var.invalidate();
                        LinearLayout linearLayout2 = t30Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        t30 t30Var2 = this.f30114b;
                        t30Var2.invalidate();
                        LinearLayout linearLayout3 = t30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f30432c = t5Var2;
        t5Var2.f30447g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f30434n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f30431b.e(z11, linearLayout.getChildAt(i10).getLeft());
        this.f30432c.e(z11, linearLayout.getChildAt(i10).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.bs bsVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            bi.t0 t0Var = new bi.t0(getContext());
            t0Var.setDrawingCacheEnabled(false);
            t0Var.setOnClickListener(new jg.w1(this, i10, bsVar, 10));
            t0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f));
            LinearLayout.LayoutParams o10 = w7.b6.o(-2, -2);
            if (i10 < arrayList.size() - 1) {
                o10.rightMargin = org.telegram.messenger.i0.L(4.0f);
            }
            t0Var.f3356b = new qz0(charSequence, this.f30433f);
            linearLayout.addView(t0Var, o10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = f30429w;
        rectF.set(this.f30431b.c(), 0.0f, this.f30432c.c(), getMeasuredHeight());
        Path path = this.f30435r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), direction);
        path.close();
        Path path2 = this.f30436s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30430a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, p6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, p6Var);
        TextPaint textPaint = this.f30433f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y8, p6Var);
        }
        textPaint.setColor(w03);
        canvas.save();
        canvas.clipPath(path);
        for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (rectF.right >= childAt.getLeft() && rectF.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(this.f30434n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
