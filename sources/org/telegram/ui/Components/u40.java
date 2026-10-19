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
public final class u40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.d6 f30880a;
    public final f6 f30881b;
    public final f6 f30882c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f30883f;
    public boolean h;
    public int f30884n;
    public final Path f30885r;
    public final Path f30886s;

    public u40(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f30883f = textPaint;
        this.f30885r = new Path();
        this.f30886s = new Path();
        this.f30880a = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        f6 f6Var = new f6(new Runnable(this) {
            public final u40 f30417b;

            {
                this.f30417b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u40 u40Var = this.f30417b;
                        u40Var.invalidate();
                        LinearLayout linearLayout2 = u40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        u40 u40Var2 = this.f30417b;
                        u40Var2.invalidate();
                        LinearLayout linearLayout3 = u40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f30881b = f6Var;
        f6Var.f26110g = 180L;
        f6 f6Var2 = new f6(new Runnable(this) {
            public final u40 f30417b;

            {
                this.f30417b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u40 u40Var = this.f30417b;
                        u40Var.invalidate();
                        LinearLayout linearLayout2 = u40Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        return;
                    default:
                        u40 u40Var2 = this.f30417b;
                        u40Var2.invalidate();
                        LinearLayout linearLayout3 = u40Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        return;
                }
            }
        });
        this.f30882c = f6Var2;
        f6Var2.f26110g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.f30884n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.f30881b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.f30882c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            ai.ic icVar = new ai.ic(getContext());
            icVar.setDrawingCacheEnabled(false);
            icVar.setOnClickListener(new ai.ha(this, i10, intCallback, 9));
            icVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.z5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            icVar.f1512b = new e11(charSequence, this.f30883f);
            linearLayout.addView(icVar, n10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        RectF rectF = v;
        rectF.set(this.f30881b.c(), 0.0f, this.f30882c.c(), getMeasuredHeight());
        Path path = this.f30885r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), direction);
        path.close();
        Path path2 = this.f30886s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30880a;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, d6Var) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(w02);
        canvas.drawPath(path, paint);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, d6Var);
        TextPaint textPaint = this.f30883f;
        textPaint.setColor(w04);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Y8, d6Var);
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
        a(this.f30884n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
