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
public final class w40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.u6 f34358a;
    public final h6 f34359b;
    public final h6 f34360c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f34361f;
    public boolean h;
    public int f34362n;
    public final Path f34363r;
    public final Path f34364s;

    public w40(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f34361f = textPaint;
        this.f34363r = new Path();
        this.f34364s = new Path();
        this.f34358a = u6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, gb1.B(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        h6 h6Var = new h6(new Runnable(this) {
            public final w40 f33565b;

            {
                this.f33565b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        w40 w40Var = this.f33565b;
                        w40Var.invalidate();
                        LinearLayout linearLayout2 = w40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        w40 w40Var2 = this.f33565b;
                        w40Var2.invalidate();
                        LinearLayout linearLayout3 = w40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f34359b = h6Var;
        h6Var.f28813g = 180L;
        h6 h6Var2 = new h6(new Runnable(this) {
            public final w40 f33565b;

            {
                this.f33565b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        w40 w40Var = this.f33565b;
                        w40Var.invalidate();
                        LinearLayout linearLayout2 = w40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        w40 w40Var2 = this.f33565b;
                        w40Var2.invalidate();
                        LinearLayout linearLayout3 = w40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f34360c = h6Var2;
        h6Var2.f28813g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f34362n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f34359b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f34360c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            bi.cc ccVar = new bi.cc(getContext());
            ccVar.setDrawingCacheEnabled(false);
            ccVar.setOnClickListener(new bi.pa(this, i10, intCallback, 10));
            ccVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams r6 = gb1.r(-2, -2);
            if (i10 < arrayList.size() - 1) {
                r6.rightMargin = AndroidUtilities.dp(4.0f);
            }
            ccVar.f4466b = new q11(charSequence, this.f34361f);
            linearLayout.addView(ccVar, r6);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = v;
        rectF.set(this.f34359b.c(), 0.0f, this.f34360c.c(), getMeasuredHeight());
        Path path = this.f34363r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f34364s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34358a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23748y6, u6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23748y6, u6Var);
        TextPaint textPaint = this.f34361f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Y8, u6Var);
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
        a(this.f34362n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
