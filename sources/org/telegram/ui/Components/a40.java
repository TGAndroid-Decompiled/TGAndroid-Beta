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

public final class a40 extends HorizontalScrollView {
    public static final RectF v = new RectF();

    public final org.telegram.ui.ActionBar.c6 f26621a;

    public final y5 f26622b;

    public final y5 f26623c;
    public final LinearLayout d;

    public final Paint f26624e;

    public final TextPaint f26625f;
    public boolean h;

    public int f26626n;

    public final Path f26627r;

    public final Path f26628s;

    public a40(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26624e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f26625f = textPaint;
        this.f26627r = new Path();
        this.f26628s = new Path();
        this.f26621a = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, h7.z5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        final int i10 = 0;
        y5 y5Var = new y5(new Runnable(this) {

            public final a40 f35145b;

            {
                this.f35145b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        a40 a40Var = this.f35145b;
                        a40Var.invalidate();
                        LinearLayout linearLayout2 = a40Var.d;
                        linearLayout2.invalidate();
                        for (int i11 = 0; i11 < linearLayout2.getChildCount(); i11++) {
                            linearLayout2.getChildAt(i11).invalidate();
                        }
                        break;
                    default:
                        a40 a40Var2 = this.f35145b;
                        a40Var2.invalidate();
                        LinearLayout linearLayout3 = a40Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.f26622b = y5Var;
        y5Var.f34815g = 180L;
        final int i11 = 1;
        y5 y5Var2 = new y5(new Runnable(this) {

            public final a40 f35145b;

            {
                this.f35145b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        a40 a40Var = this.f35145b;
                        a40Var.invalidate();
                        LinearLayout linearLayout2 = a40Var.d;
                        linearLayout2.invalidate();
                        for (int i12 = 0; i12 < linearLayout2.getChildCount(); i12++) {
                            linearLayout2.getChildAt(i12).invalidate();
                        }
                        break;
                    default:
                        a40 a40Var2 = this.f35145b;
                        a40Var2.invalidate();
                        LinearLayout linearLayout3 = a40Var2.d;
                        linearLayout3.invalidate();
                        for (int i13 = 0; i13 < linearLayout3.getChildCount(); i13++) {
                            linearLayout3.getChildAt(i13).invalidate();
                        }
                        break;
                }
            }
        });
        this.f26623c = y5Var2;
        y5Var2.f34815g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f26626n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f26622b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f26623c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            ag.s0 s0Var = new ag.s0(getContext(), 16);
            s0Var.setDrawingCacheEnabled(false);
            s0Var.setOnClickListener(new gh.v2(this, i10, intCallback, 10));
            s0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams layoutParamsN = h7.z5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                layoutParamsN.rightMargin = AndroidUtilities.dp(4.0f);
            }
            s0Var.f640b = new pz0(charSequence, this.f26625f);
            linearLayout.addView(s0Var, layoutParamsN);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fC = this.f26622b.c();
        float fC2 = this.f26623c.c();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = v;
        rectF.set(fC, 0.0f, fC2, measuredHeight);
        Path path = this.f26627r;
        path.rewind();
        float fDp = AndroidUtilities.dp(13.0f);
        float fDp2 = AndroidUtilities.dp(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fDp, fDp2, direction);
        path.close();
        Path path2 = this.f26628s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26621a;
        int iL1 = z10 ? org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var) & 520093695;
        Paint paint = this.f26624e;
        paint.setColor(iL1);
        canvas.drawPath(path, paint);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var);
        TextPaint textPaint = this.f26625f;
        textPaint.setColor(iV0);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, c6Var));
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
        a(this.f26626n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
