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
public final class n40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.f6 f27183a;
    public final z5 f27184b;
    public final z5 f27185c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f27186f;
    public boolean h;
    public int f27187n;
    public final Path f27188r;
    public final Path f27189s;

    public n40(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f27186f = textPaint;
        this.f27188r = new Path();
        this.f27189s = new Path();
        this.f27183a = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.b6.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        z5 z5Var = new z5(new Runnable(this) {
            public final n40 f26934b;

            {
                this.f26934b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n40 n40Var = this.f26934b;
                        n40Var.invalidate();
                        LinearLayout linearLayout2 = n40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f26934b;
                        n40Var2.invalidate();
                        LinearLayout linearLayout3 = n40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f27184b = z5Var;
        z5Var.f31243g = 180L;
        z5 z5Var2 = new z5(new Runnable(this) {
            public final n40 f26934b;

            {
                this.f26934b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n40 n40Var = this.f26934b;
                        n40Var.invalidate();
                        LinearLayout linearLayout2 = n40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f26934b;
                        n40Var2.invalidate();
                        LinearLayout linearLayout3 = n40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f27185c = z5Var2;
        z5Var2.f31243g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z4) {
        this.f27187n = i10;
        LinearLayout linearLayout = this.d;
        boolean z10 = !z4;
        this.f27184b.d(linearLayout.getChildAt(i10).getLeft(), z10);
        this.f27185c.d(linearLayout.getChildAt(i10).getRight(), z10);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            eg.h0 h0Var = new eg.h0(getContext(), 12);
            h0Var.setDrawingCacheEnabled(false);
            h0Var.setOnClickListener(new dg.m2(this, i10, intCallback, 11));
            h0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = k7.b6.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            h0Var.f5297b = new k01(charSequence, this.f27186f);
            linearLayout.addView(h0Var, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f27184b.c(), 0.0f, this.f27185c.c(), getMeasuredHeight());
        Path path = this.f27188r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f27189s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z4 = this.h;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27183a;
        if (z4) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var);
        TextPaint textPaint = this.f27186f;
        textPaint.setColor(v04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, f6Var);
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
        a(this.f27187n, false);
    }

    public void setAccent(boolean z4) {
        this.h = z4;
    }
}
