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
public final class m30 extends HorizontalScrollView {
    public static final RectF f37358w = new RectF();
    public final org.telegram.ui.ActionBar.i6 f37359a;
    public final c6 f37360b;
    public final c6 f37361c;
    public final LinearLayout d;
    public final Paint f37362e;
    public final TextPaint f37363f;
    public boolean h;
    public int f37364n;
    public final Path f37365r;
    public final Path f37366s;

    public m30(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f37362e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f37363f = textPaint;
        this.f37365r = new Path();
        this.f37366s = new Path();
        this.f37359a = i6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.na.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c6 c6Var = new c6(new Runnable(this) {
            public final m30 f37009b;

            {
                this.f37009b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m30 m30Var = this.f37009b;
                        m30Var.invalidate();
                        LinearLayout linearLayout2 = m30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        m30 m30Var2 = this.f37009b;
                        m30Var2.invalidate();
                        LinearLayout linearLayout3 = m30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f37360b = c6Var;
        c6Var.f33934g = 180L;
        c6 c6Var2 = new c6(new Runnable(this) {
            public final m30 f37009b;

            {
                this.f37009b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m30 m30Var = this.f37009b;
                        m30Var.invalidate();
                        LinearLayout linearLayout2 = m30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        m30 m30Var2 = this.f37009b;
                        m30Var2.invalidate();
                        LinearLayout linearLayout3 = m30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f37361c = c6Var2;
        c6Var2.f33934g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i7, boolean z10) {
        this.f37364n = i7;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f37360b.e(z11, linearLayout.getChildAt(i7).getLeft());
        this.f37361c.e(z11, linearLayout.getChildAt(i7).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.nr nrVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i7);
            bi.o3 o3Var = new bi.o3(getContext(), 19);
            o3Var.setDrawingCacheEnabled(false);
            o3Var.setOnClickListener(new bi.k5(this, i7, nrVar, 13));
            o3Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o4 = c8.na.o(-2, -2);
            if (i7 < arrayList.size() - 1) {
                o4.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            o3Var.f3898b = new wy0(charSequence, this.f37363f);
            linearLayout.addView(o3Var, o4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = f37358w;
        rectF.set(this.f37360b.c(), 0.0f, this.f37361c.c(), getMeasuredHeight());
        Path path = this.f37365r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), direction);
        path.close();
        Path path2 = this.f37366s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.i6 i6Var = this.f37359a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29843y6, i6Var) & 520093695;
        }
        Paint paint = this.f37362e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        TextPaint textPaint = this.f37363f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Y8, i6Var);
        }
        textPaint.setColor(w03);
        canvas.save();
        canvas.clipPath(path);
        for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
            View childAt = linearLayout.getChildAt(i7);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a(this.f37364n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
