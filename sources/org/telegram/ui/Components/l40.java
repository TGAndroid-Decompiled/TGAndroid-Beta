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
public final class l40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.e6 f25823a;
    public final c6 f25824b;
    public final c6 f25825c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f25826f;
    public boolean h;
    public int f25827n;
    public final Path f25828r;
    public final Path f25829s;

    public l40(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f25826f = textPaint;
        this.f25828r = new Path();
        this.f25829s = new Path();
        this.f25823a = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c6 c6Var = new c6(new Runnable(this) {
            public final l40 f25537b;

            {
                this.f25537b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l40 l40Var = this.f25537b;
                        l40Var.invalidate();
                        LinearLayout linearLayout2 = l40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        l40 l40Var2 = this.f25537b;
                        l40Var2.invalidate();
                        LinearLayout linearLayout3 = l40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f25824b = c6Var;
        c6Var.f22955g = 180L;
        c6 c6Var2 = new c6(new Runnable(this) {
            public final l40 f25537b;

            {
                this.f25537b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l40 l40Var = this.f25537b;
                        l40Var.invalidate();
                        LinearLayout linearLayout2 = l40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        l40 l40Var2 = this.f25537b;
                        l40Var2.invalidate();
                        LinearLayout linearLayout3 = l40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f25825c = c6Var2;
        c6Var2.f22955g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f25827n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f25824b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f25825c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            ci.eb ebVar = new ci.eb(getContext());
            ebVar.setDrawingCacheEnabled(false);
            ebVar.setOnClickListener(new org.telegram.ui.Cells.va(this, i10, intCallback, 7));
            ebVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.x5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            ebVar.f4608b = new g01(charSequence, this.f25826f);
            linearLayout.addView(ebVar, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f25824b.c(), 0.0f, this.f25825c.c(), getMeasuredHeight());
        Path path = this.f25828r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f25829s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25823a;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19218y6, e6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19218y6, e6Var);
        TextPaint textPaint = this.f25826f;
        textPaint.setColor(v04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        } else {
            v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Y8, e6Var);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(this.f25827n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
