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
    public final org.telegram.ui.ActionBar.f6 f28042a;
    public final e6 f28043b;
    public final e6 f28044c;
    public final LinearLayout d;
    public final Paint f28045e;
    public final TextPaint f28046f;
    public boolean h;
    public int f28047n;
    public final Path f28048r;
    public final Path f28049s;

    public l40(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28045e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f28046f = textPaint;
        this.f28048r = new Path();
        this.f28049s = new Path();
        this.f28042a = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        e6 e6Var = new e6(new Runnable(this) {
            public final l40 f27686b;

            {
                this.f27686b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l40 l40Var = this.f27686b;
                        l40Var.invalidate();
                        LinearLayout linearLayout2 = l40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        l40 l40Var2 = this.f27686b;
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
        this.f28043b = e6Var;
        e6Var.f25568g = 180L;
        e6 e6Var2 = new e6(new Runnable(this) {
            public final l40 f27686b;

            {
                this.f27686b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l40 l40Var = this.f27686b;
                        l40Var.invalidate();
                        LinearLayout linearLayout2 = l40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        l40 l40Var2 = this.f27686b;
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
        this.f28044c = e6Var2;
        e6Var2.f25568g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f28047n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f28043b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f28044c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            di.eb ebVar = new di.eb(getContext());
            ebVar.setDrawingCacheEnabled(false);
            ebVar.setOnClickListener(new org.telegram.ui.Cells.ua(this, i10, intCallback, 7));
            ebVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.x5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            ebVar.f7181b = new f01(charSequence, this.f28046f);
            linearLayout.addView(ebVar, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        RectF rectF = v;
        rectF.set(this.f28043b.c(), 0.0f, this.f28044c.c(), getMeasuredHeight());
        Path path = this.f28048r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f28049s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28042a;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, f6Var) & 520093695;
        }
        Paint paint = this.f28045e;
        paint.setColor(v02);
        canvas.drawPath(path, paint);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, f6Var);
        TextPaint textPaint = this.f28046f;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(this.f28047n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
