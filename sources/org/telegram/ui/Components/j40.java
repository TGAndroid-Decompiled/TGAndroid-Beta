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
public final class j40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.c6 f29543a;
    public final d6 f29544b;
    public final d6 f29545c;
    public final LinearLayout d;
    public final Paint f29546e;
    public final TextPaint f29547f;
    public boolean h;
    public int f29548n;
    public final Path f29549r;
    public final Path f29550s;

    public j40(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f29546e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f29547f = textPaint;
        this.f29549r = new Path();
        this.f29550s = new Path();
        this.f29543a = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, i7.f6.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        d6 d6Var = new d6(new Runnable(this) {
            public final j40 f29316b;

            {
                this.f29316b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j40 j40Var = this.f29316b;
                        j40Var.invalidate();
                        LinearLayout linearLayout2 = j40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        j40 j40Var2 = this.f29316b;
                        j40Var2.invalidate();
                        LinearLayout linearLayout3 = j40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f29544b = d6Var;
        d6Var.f27669g = 180L;
        d6 d6Var2 = new d6(new Runnable(this) {
            public final j40 f29316b;

            {
                this.f29316b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j40 j40Var = this.f29316b;
                        j40Var.invalidate();
                        LinearLayout linearLayout2 = j40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        j40 j40Var2 = this.f29316b;
                        j40Var2.invalidate();
                        LinearLayout linearLayout3 = j40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f29545c = d6Var2;
        d6Var2.f27669g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f29548n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f29544b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f29545c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            cg.h0 h0Var = new cg.h0(getContext(), 14);
            h0Var.setDrawingCacheEnabled(false);
            h0Var.setOnClickListener(new bg.p2(this, i10, intCallback, 11));
            h0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = i7.f6.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            h0Var.f3154b = new zz0(charSequence, this.f29547f);
            linearLayout.addView(h0Var, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f29544b.c(), 0.0f, this.f29545c.c(), getMeasuredHeight());
        Path path = this.f29549r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f29550s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.c6 c6Var = this.f29543a;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var) & 520093695;
        }
        Paint paint = this.f29546e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var);
        TextPaint textPaint = this.f29547f;
        textPaint.setColor(v04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, c6Var);
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
        a(this.f29548n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
