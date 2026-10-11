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
public final class d50 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.d6 f25624a;
    public final g6 f25625b;
    public final g6 f25626c;
    public final LinearLayout d;
    public final Paint f25627e;
    public final TextPaint f25628f;
    public boolean h;
    public int f25629n;
    public final Path f25630r;
    public final Path f25631s;

    public d50(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25627e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f25628f = textPaint;
        this.f25630r = new Path();
        this.f25631s = new Path();
        this.f25624a = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        g6 g6Var = new g6(new Runnable(this) {
            public final d50 f25228b;

            {
                this.f25228b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d50 d50Var = this.f25228b;
                        d50Var.invalidate();
                        LinearLayout linearLayout2 = d50Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        d50 d50Var2 = this.f25228b;
                        d50Var2.invalidate();
                        LinearLayout linearLayout3 = d50Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f25625b = g6Var;
        g6Var.f26668g = 180L;
        g6 g6Var2 = new g6(new Runnable(this) {
            public final d50 f25228b;

            {
                this.f25228b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d50 d50Var = this.f25228b;
                        d50Var.invalidate();
                        LinearLayout linearLayout2 = d50Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        d50 d50Var2 = this.f25228b;
                        d50Var2.invalidate();
                        LinearLayout linearLayout3 = d50Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f25626c = g6Var2;
        g6Var2.f26668g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f25629n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f25625b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f25626c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            ci.bb bbVar = new ci.bb(getContext());
            bbVar.setDrawingCacheEnabled(false);
            bbVar.setOnClickListener(new org.telegram.ui.Cells.sa(this, i10, intCallback, 8));
            bbVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.x5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            bbVar.f4802b = new m11(charSequence, this.f25628f);
            linearLayout.addView(bbVar, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = v;
        rectF.set(this.f25625b.c(), 0.0f, this.f25626c.c(), getMeasuredHeight());
        Path path = this.f25630r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f25631s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25624a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207y6, d6Var) & 520093695;
        }
        Paint paint = this.f25627e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207y6, d6Var);
        TextPaint textPaint = this.f25628f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Y8, d6Var);
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
        a(this.f25629n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
