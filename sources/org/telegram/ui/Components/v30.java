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
public final class v30 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.b6 f33248a;
    public final y5 f33249b;
    public final y5 f33250c;
    public final LinearLayout d;
    public final Paint f33251e;
    public final TextPaint f33252f;
    public boolean h;
    public int f33253n;
    public final Path f33254r;
    public final Path f33255s;

    public v30(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f33251e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f33252f = textPaint;
        this.f33254r = new Path();
        this.f33255s = new Path();
        this.f33248a = b6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        y5 y5Var = new y5(new Runnable(this) {
            public final v30 f32911b;

            {
                this.f32911b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v30 v30Var = this.f32911b;
                        v30Var.invalidate();
                        LinearLayout linearLayout2 = v30Var.d;
                        linearLayout2.invalidate();
                        for (int i9 = 0; i9 < linearLayout2.getChildCount(); i9++) {
                            linearLayout2.getChildAt(i9).invalidate();
                        }
                        return;
                    default:
                        v30 v30Var2 = this.f32911b;
                        v30Var2.invalidate();
                        LinearLayout linearLayout3 = v30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f33249b = y5Var;
        y5Var.f34857g = 180L;
        y5 y5Var2 = new y5(new Runnable(this) {
            public final v30 f32911b;

            {
                this.f32911b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v30 v30Var = this.f32911b;
                        v30Var.invalidate();
                        LinearLayout linearLayout2 = v30Var.d;
                        linearLayout2.invalidate();
                        for (int i9 = 0; i9 < linearLayout2.getChildCount(); i9++) {
                            linearLayout2.getChildAt(i9).invalidate();
                        }
                        return;
                    default:
                        v30 v30Var2 = this.f32911b;
                        v30Var2.invalidate();
                        LinearLayout linearLayout3 = v30Var2.d;
                        linearLayout3.invalidate();
                        for (int i10 = 0; i10 < linearLayout3.getChildCount(); i10++) {
                            linearLayout3.getChildAt(i10).invalidate();
                        }
                        return;
                }
            }
        });
        this.f33250c = y5Var2;
        y5Var2.f34857g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i9, boolean z10) {
        this.f33253n = i9;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f33249b.d(linearLayout.getChildAt(i9).getLeft(), z11);
        this.f33250c.d(linearLayout.getChildAt(i9).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i9);
            fh.l2 l2Var = new fh.l2(getContext(), 16);
            l2Var.setDrawingCacheEnabled(false);
            l2Var.setOnClickListener(new fh.a3(this, i9, intCallback, 10));
            l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = g7.e6.n(-2, -2);
            if (i9 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            l2Var.f6602b = new nz0(charSequence, this.f33252f);
            linearLayout.addView(l2Var, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f33249b.c(), 0.0f, this.f33250c.c(), getMeasuredHeight());
        Path path = this.f33254r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f33255s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.b6 b6Var = this.f33248a;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var) & 520093695;
        }
        Paint paint = this.f33251e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var);
        TextPaint textPaint = this.f33252f;
        textPaint.setColor(v04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Y8, b6Var);
        }
        textPaint.setColor(v03);
        canvas.save();
        canvas.clipPath(path);
        for (int i9 = 0; i9 < linearLayout.getChildCount(); i9++) {
            View childAt = linearLayout.getChildAt(i9);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a(this.f33253n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
