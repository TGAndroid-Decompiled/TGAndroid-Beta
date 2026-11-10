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
public final class b30 extends HorizontalScrollView {
    public static final RectF f32100w = new RectF();
    public final org.telegram.ui.ActionBar.h6 f32101a;
    public final v5 f32102b;
    public final v5 f32103c;
    public final LinearLayout d;
    public final Paint f32104e;
    public final TextPaint f32105f;
    public boolean h;
    public int f32106n;
    public final Path f32107r;
    public final Path f32108s;

    public b30(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f32104e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f32105f = textPaint;
        this.f32107r = new Path();
        this.f32108s = new Path();
        this.f32101a = h6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        v5 v5Var = new v5(new Runnable(this) {
            public final b30 f31680b;

            {
                this.f31680b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        b30 b30Var = this.f31680b;
                        b30Var.invalidate();
                        LinearLayout linearLayout2 = b30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        b30 b30Var2 = this.f31680b;
                        b30Var2.invalidate();
                        LinearLayout linearLayout3 = b30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f32102b = v5Var;
        v5Var.f38857g = 180L;
        v5 v5Var2 = new v5(new Runnable(this) {
            public final b30 f31680b;

            {
                this.f31680b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        b30 b30Var = this.f31680b;
                        b30Var.invalidate();
                        LinearLayout linearLayout2 = b30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        b30 b30Var2 = this.f31680b;
                        b30Var2.invalidate();
                        LinearLayout linearLayout3 = b30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f32103c = v5Var2;
        v5Var2.f38857g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i7, boolean z9) {
        this.f32106n = i7;
        LinearLayout linearLayout = this.d;
        boolean z10 = !z9;
        this.f32102b.e(z10, linearLayout.getChildAt(i7).getLeft());
        this.f32103c.e(z10, linearLayout.getChildAt(i7).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.sr srVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i7);
            bi.ec ecVar = new bi.ec(getContext());
            ecVar.setDrawingCacheEnabled(false);
            ecVar.setOnClickListener(new bi.la(this, i7, srVar, 10));
            ecVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o4 = c8.ha.o(-2, -2);
            if (i7 < arrayList.size() - 1) {
                o4.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            ecVar.f3830b = new my0(charSequence, this.f32105f);
            linearLayout.addView(ecVar, o4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = f32100w;
        rectF.set(this.f32102b.c(), 0.0f, this.f32103c.c(), getMeasuredHeight());
        Path path = this.f32107r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), direction);
        path.close();
        Path path2 = this.f32108s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32101a;
        if (z9) {
            w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, h6Var) & 520093695;
        }
        Paint paint = this.f32104e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
        TextPaint textPaint = this.f32105f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y8, h6Var);
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a(this.f32106n, false);
    }

    public void setAccent(boolean z9) {
        this.h = z9;
    }
}
