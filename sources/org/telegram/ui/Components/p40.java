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
public final class p40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.g6 f29950a;
    public final z5 f29951b;
    public final z5 f29952c;
    public final LinearLayout d;
    public final Paint f29953e;
    public final TextPaint f29954f;
    public boolean h;
    public int f29955n;
    public final Path f29956r;
    public final Path f29957s;

    public p40(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29953e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f29954f = textPaint;
        this.f29956r = new Path();
        this.f29957s = new Path();
        this.f29950a = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.c6.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        z5 z5Var = new z5(new Runnable(this) {
            public final p40 f29666b;

            {
                this.f29666b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p40 p40Var = this.f29666b;
                        p40Var.invalidate();
                        LinearLayout linearLayout2 = p40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        p40 p40Var2 = this.f29666b;
                        p40Var2.invalidate();
                        LinearLayout linearLayout3 = p40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f29951b = z5Var;
        z5Var.f33728g = 180L;
        z5 z5Var2 = new z5(new Runnable(this) {
            public final p40 f29666b;

            {
                this.f29666b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p40 p40Var = this.f29666b;
                        p40Var.invalidate();
                        LinearLayout linearLayout2 = p40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        p40 p40Var2 = this.f29666b;
                        p40Var2.invalidate();
                        LinearLayout linearLayout3 = p40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f29952c = z5Var2;
        z5Var2.f33728g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z4) {
        this.f29955n = i10;
        LinearLayout linearLayout = this.d;
        boolean z10 = !z4;
        this.f29951b.d(linearLayout.getChildAt(i10).getLeft(), z10);
        this.f29952c.d(linearLayout.getChildAt(i10).getRight(), z10);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            fg.h0 h0Var = new fg.h0(getContext(), 12);
            h0Var.setDrawingCacheEnabled(false);
            h0Var.setOnClickListener(new eg.k2(this, i10, intCallback, 11));
            h0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = k7.c6.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            h0Var.f6322b = new l01(charSequence, this.f29954f);
            linearLayout.addView(h0Var, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f29951b.c(), 0.0f, this.f29952c.c(), getMeasuredHeight());
        Path path = this.f29956r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f29957s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z4 = this.h;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29950a;
        if (z4) {
            v02 = org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, g6Var) & 520093695;
        }
        Paint paint = this.f29953e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, g6Var);
        TextPaint textPaint = this.f29954f;
        textPaint.setColor(v04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        } else {
            v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Y8, g6Var);
        }
        textPaint.setColor(v03);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        a(this.f29955n, false);
    }

    public void setAccent(boolean z4) {
        this.h = z4;
    }
}
