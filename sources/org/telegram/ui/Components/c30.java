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
public final class c30 extends HorizontalScrollView {
    public static final RectF f32508w = new RectF();
    public final org.telegram.ui.ActionBar.g6 f32509a;
    public final w5 f32510b;
    public final w5 f32511c;
    public final LinearLayout d;
    public final Paint f32512e;
    public final TextPaint f32513f;
    public boolean h;
    public int f32514n;
    public final Path f32515r;
    public final Path f32516s;

    public c30(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f32512e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f32513f = textPaint;
        this.f32515r = new Path();
        this.f32516s = new Path();
        this.f32509a = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        w5 w5Var = new w5(new Runnable(this) {
            public final c30 f32075b;

            {
                this.f32075b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        c30 c30Var = this.f32075b;
                        c30Var.invalidate();
                        LinearLayout linearLayout2 = c30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        c30 c30Var2 = this.f32075b;
                        c30Var2.invalidate();
                        LinearLayout linearLayout3 = c30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f32510b = w5Var;
        w5Var.f39913g = 180L;
        w5 w5Var2 = new w5(new Runnable(this) {
            public final c30 f32075b;

            {
                this.f32075b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        c30 c30Var = this.f32075b;
                        c30Var.invalidate();
                        LinearLayout linearLayout2 = c30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        c30 c30Var2 = this.f32075b;
                        c30Var2.invalidate();
                        LinearLayout linearLayout3 = c30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f32511c = w5Var2;
        w5Var2.f39913g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i7, boolean z9) {
        this.f32514n = i7;
        LinearLayout linearLayout = this.d;
        boolean z10 = !z9;
        this.f32510b.e(z10, linearLayout.getChildAt(i7).getLeft());
        this.f32511c.e(z10, linearLayout.getChildAt(i7).getRight());
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
            ecVar.f3833b = new ny0(charSequence, this.f32513f);
            linearLayout.addView(ecVar, o4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = f32508w;
        rectF.set(this.f32510b.c(), 0.0f, this.f32511c.c(), getMeasuredHeight());
        Path path = this.f32515r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), direction);
        path.close();
        Path path2 = this.f32516s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.g6 g6Var = this.f32509a;
        if (z9) {
            w02 = org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var) & 520093695;
        }
        Paint paint = this.f32512e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        TextPaint textPaint = this.f32513f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Y8, g6Var);
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
        a(this.f32514n, false);
    }

    public void setAccent(boolean z9) {
        this.h = z9;
    }
}
