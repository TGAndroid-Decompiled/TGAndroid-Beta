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
public final class x20 extends HorizontalScrollView {
    public static final RectF f40201w = new RectF();
    public final org.telegram.ui.ActionBar.e6 f40202a;
    public final u5 f40203b;
    public final u5 f40204c;
    public final LinearLayout d;
    public final Paint f40205e;
    public final TextPaint f40206f;
    public boolean h;
    public int f40207n;
    public final Path f40208r;
    public final Path f40209s;

    public x20(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f40205e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f40206f = textPaint;
        this.f40208r = new Path();
        this.f40209s = new Path();
        this.f40202a = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        u5 u5Var = new u5(new Runnable(this) {
            public final x20 f39863b;

            {
                this.f39863b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x20 x20Var = this.f39863b;
                        x20Var.invalidate();
                        LinearLayout linearLayout2 = x20Var.d;
                        linearLayout2.invalidate();
                        for (int i3 = 0; i3 < linearLayout2.getChildCount(); i3++) {
                            linearLayout2.getChildAt(i3).invalidate();
                        }
                        return;
                    default:
                        x20 x20Var2 = this.f39863b;
                        x20Var2.invalidate();
                        LinearLayout linearLayout3 = x20Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f40203b = u5Var;
        u5Var.f38648g = 180L;
        u5 u5Var2 = new u5(new Runnable(this) {
            public final x20 f39863b;

            {
                this.f39863b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x20 x20Var = this.f39863b;
                        x20Var.invalidate();
                        LinearLayout linearLayout2 = x20Var.d;
                        linearLayout2.invalidate();
                        for (int i3 = 0; i3 < linearLayout2.getChildCount(); i3++) {
                            linearLayout2.getChildAt(i3).invalidate();
                        }
                        return;
                    default:
                        x20 x20Var2 = this.f39863b;
                        x20Var2.invalidate();
                        LinearLayout linearLayout3 = x20Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f40204c = u5Var2;
        u5Var2.f38648g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i3, boolean z10) {
        this.f40207n = i3;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f40203b.e(z11, linearLayout.getChildAt(i3).getLeft());
        this.f40204c.e(z11, linearLayout.getChildAt(i3).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.kr krVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i3);
            ai.x2 x2Var = new ai.x2(getContext(), 19);
            x2Var.setDrawingCacheEnabled(false);
            x2Var.setOnClickListener(new ai.h3(this, i3, krVar, 12));
            x2Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o10 = b8.mf.o(-2, -2);
            if (i3 < arrayList.size() - 1) {
                o10.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            x2Var.f1094b = new ly0(charSequence, this.f40206f);
            linearLayout.addView(x2Var, o10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = f40201w;
        rectF.set(this.f40203b.c(), 0.0f, this.f40204c.c(), getMeasuredHeight());
        Path path = this.f40208r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), direction);
        path.close();
        Path path2 = this.f40209s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40202a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var) & 520093695;
        }
        Paint paint = this.f40205e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        TextPaint textPaint = this.f40206f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, e6Var);
        }
        textPaint.setColor(w03);
        canvas.save();
        canvas.clipPath(path);
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            View childAt = linearLayout.getChildAt(i3);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a(this.f40207n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
