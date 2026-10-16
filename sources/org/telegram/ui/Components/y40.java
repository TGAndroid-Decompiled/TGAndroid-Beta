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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
public final class y40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.c6 f31149a;
    public final g6 f31150b;
    public final g6 f31151c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f31152f;
    public boolean h;
    public int f31153n;
    public final Path f31154r;
    public final Path f31155s;

    public y40(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f31152f = textPaint;
        this.f31154r = new Path();
        this.f31155s = new Path();
        this.f31149a = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        g6 g6Var = new g6(new Runnable(this) {
            public final y40 f30863b;

            {
                this.f30863b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        y40 y40Var = this.f30863b;
                        y40Var.invalidate();
                        LinearLayout linearLayout2 = y40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        y40 y40Var2 = this.f30863b;
                        y40Var2.invalidate();
                        LinearLayout linearLayout3 = y40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f31150b = g6Var;
        g6Var.f24887g = 180L;
        g6 g6Var2 = new g6(new Runnable(this) {
            public final y40 f30863b;

            {
                this.f30863b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        y40 y40Var = this.f30863b;
                        y40Var.invalidate();
                        LinearLayout linearLayout2 = y40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        y40 y40Var2 = this.f30863b;
                        y40Var2.invalidate();
                        LinearLayout linearLayout3 = y40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f31151c = g6Var2;
        g6Var2.f24887g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f31153n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f31150b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f31151c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            di.ab abVar = new di.ab(getContext());
            abVar.setDrawingCacheEnabled(false);
            abVar.setOnClickListener(new org.telegram.ui.Cells.sa(this, i10, intCallback, 8));
            abVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.z5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            abVar.f6641b = new i11(charSequence, this.f31152f);
            linearLayout.addView(abVar, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = v;
        rectF.set(this.f31150b.c(), 0.0f, this.f31151c.c(), getMeasuredHeight());
        Path path = this.f31154r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f31155s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31149a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var);
        TextPaint textPaint = this.f31152f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Y8, c6Var);
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
        a(this.f31153n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
