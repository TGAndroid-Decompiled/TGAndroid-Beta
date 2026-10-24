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
public final class s40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.g6 f30434a;
    public final d6 f30435b;
    public final d6 f30436c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f30437f;
    public boolean h;
    public int f30438n;
    public final Path f30439r;
    public final Path f30440s;

    public s40(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f30437f = textPaint;
        this.f30439r = new Path();
        this.f30440s = new Path();
        this.f30434a = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        d6 d6Var = new d6(new Runnable(this) {
            public final s40 f30061b;

            {
                this.f30061b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        s40 s40Var = this.f30061b;
                        s40Var.invalidate();
                        LinearLayout linearLayout2 = s40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        s40 s40Var2 = this.f30061b;
                        s40Var2.invalidate();
                        LinearLayout linearLayout3 = s40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f30435b = d6Var;
        d6Var.f25570g = 180L;
        d6 d6Var2 = new d6(new Runnable(this) {
            public final s40 f30061b;

            {
                this.f30061b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        s40 s40Var = this.f30061b;
                        s40Var.invalidate();
                        LinearLayout linearLayout2 = s40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        s40 s40Var2 = this.f30061b;
                        s40Var2.invalidate();
                        LinearLayout linearLayout3 = s40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f30436c = d6Var2;
        d6Var2.f25570g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f30438n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f30435b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f30436c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            ai.jc jcVar = new ai.jc(getContext());
            jcVar.setDrawingCacheEnabled(false);
            jcVar.setOnClickListener(new ai.ia(this, i10, intCallback, 9));
            jcVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.z5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            jcVar.f1569b = new h11(charSequence, this.f30437f);
            linearLayout.addView(jcVar, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = v;
        rectF.set(this.f30435b.c(), 0.0f, this.f30436c.c(), getMeasuredHeight());
        Path path = this.f30439r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f30440s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30434a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
        TextPaint textPaint = this.f30437f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, g6Var);
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
        a(this.f30438n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
