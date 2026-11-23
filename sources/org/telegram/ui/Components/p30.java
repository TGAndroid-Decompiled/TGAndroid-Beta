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
public final class p30 extends HorizontalScrollView {
    public static final RectF f38465w = new RectF();
    public final org.telegram.ui.ActionBar.h6 f38466a;
    public final d6 f38467b;
    public final d6 f38468c;
    public final LinearLayout d;
    public final Paint f38469e;
    public final TextPaint f38470f;
    public boolean h;
    public int f38471n;
    public final Path f38472r;
    public final Path f38473s;

    public p30(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38469e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f38470f = textPaint;
        this.f38472r = new Path();
        this.f38473s = new Path();
        this.f38466a = h6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ma.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        d6 d6Var = new d6(new Runnable(this) {
            public final p30 f38069b;

            {
                this.f38069b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p30 p30Var = this.f38069b;
                        p30Var.invalidate();
                        LinearLayout linearLayout2 = p30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        p30 p30Var2 = this.f38069b;
                        p30Var2.invalidate();
                        LinearLayout linearLayout3 = p30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f38467b = d6Var;
        d6Var.f34389g = 180L;
        d6 d6Var2 = new d6(new Runnable(this) {
            public final p30 f38069b;

            {
                this.f38069b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p30 p30Var = this.f38069b;
                        p30Var.invalidate();
                        LinearLayout linearLayout2 = p30Var.d;
                        linearLayout2.invalidate();
                        for (int i7 = 0; i7 < linearLayout2.getChildCount(); i7++) {
                            linearLayout2.getChildAt(i7).invalidate();
                        }
                        return;
                    default:
                        p30 p30Var2 = this.f38069b;
                        p30Var2.invalidate();
                        LinearLayout linearLayout3 = p30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f38468c = d6Var2;
        d6Var2.f34389g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i7, boolean z10) {
        this.f38471n = i7;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f38467b.e(z11, linearLayout.getChildAt(i7).getLeft());
        this.f38468c.e(z11, linearLayout.getChildAt(i7).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.or orVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i7);
            bi.m3 m3Var = new bi.m3(getContext(), 19);
            m3Var.setDrawingCacheEnabled(false);
            m3Var.setOnClickListener(new bi.h5(this, i7, orVar, 13));
            m3Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o4 = c8.ma.o(-2, -2);
            if (i7 < arrayList.size() - 1) {
                o4.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            m3Var.f3887b = new xy0(charSequence, this.f38470f);
            linearLayout.addView(m3Var, o4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = f38465w;
        rectF.set(this.f38467b.c(), 0.0f, this.f38468c.c(), getMeasuredHeight());
        Path path = this.f38472r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), direction);
        path.close();
        Path path2 = this.f38473s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38466a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, h6Var) & 520093695;
        }
        Paint paint = this.f38469e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        TextPaint textPaint = this.f38470f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a(this.f38471n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
