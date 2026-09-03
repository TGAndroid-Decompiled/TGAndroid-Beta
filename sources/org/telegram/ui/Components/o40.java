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
public final class o40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.f6 f27453a;
    public final z5 f27454b;
    public final z5 f27455c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f27456f;
    public boolean h;
    public int f27457n;
    public final Path f27458r;
    public final Path f27459s;

    public o40(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f27456f = textPaint;
        this.f27458r = new Path();
        this.f27459s = new Path();
        this.f27453a = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.b6.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        z5 z5Var = new z5(new Runnable(this) {
            public final o40 f27183b;

            {
                this.f27183b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o40 o40Var = this.f27183b;
                        o40Var.invalidate();
                        LinearLayout linearLayout2 = o40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        o40 o40Var2 = this.f27183b;
                        o40Var2.invalidate();
                        LinearLayout linearLayout3 = o40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f27454b = z5Var;
        z5Var.f31255g = 180L;
        z5 z5Var2 = new z5(new Runnable(this) {
            public final o40 f27183b;

            {
                this.f27183b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o40 o40Var = this.f27183b;
                        o40Var.invalidate();
                        LinearLayout linearLayout2 = o40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        o40 o40Var2 = this.f27183b;
                        o40Var2.invalidate();
                        LinearLayout linearLayout3 = o40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f27455c = z5Var2;
        z5Var2.f31255g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z4) {
        this.f27457n = i10;
        LinearLayout linearLayout = this.d;
        boolean z10 = !z4;
        this.f27454b.d(linearLayout.getChildAt(i10).getLeft(), z10);
        this.f27455c.d(linearLayout.getChildAt(i10).getRight(), z10);
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
            h0Var.f5286b = new k01(charSequence, this.f27456f);
            linearLayout.addView(h0Var, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f27454b.c(), 0.0f, this.f27455c.c(), getMeasuredHeight());
        Path path = this.f27458r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f27459s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z4 = this.h;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27453a;
        if (z4) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var);
        TextPaint textPaint = this.f27456f;
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
        a(this.f27457n, false);
    }

    public void setAccent(boolean z4) {
        this.h = z4;
    }
}
