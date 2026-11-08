package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.id;
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f30881a;
    public final org.telegram.ui.ActionBar.k5 f30882b;
    public final ImageView f30883c;
    public boolean d;
    public int f30884e;

    public x4(Context context) {
        super(context);
        int i7;
        this.f30884e = 0;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f30881a = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(16);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k5Var.setGravity(i7);
        addView(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f30882b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.I6, null);
        k5Var2.setTextSize(16);
        k5Var2.setGravity(id.f23157a0 ? 3 : 5);
        addView(k5Var2);
        ImageView imageView = new ImageView(context);
        this.f30883c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28017m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f30881a;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, null);
        k5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f30883c;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z9) {
        this.f30881a.l(str, false);
        this.f30882b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.f30883c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z9;
        setWillNotDraw(!z9);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.f30881a;
    }

    public org.telegram.ui.ActionBar.k5 getValueTextView() {
        return this.f30882b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i7 = this.f30884e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.k6.f27994l0.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            }
            float L = org.telegram.messenger.g0.L(71.0f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f30884e != 0) {
                paint = org.telegram.ui.ActionBar.k6.f27994l0;
            } else {
                paint = org.telegram.ui.ActionBar.k6.f27975k0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int L;
        int measuredWidth;
        int i14 = i12 - i10;
        int i15 = i11 - i7;
        org.telegram.ui.ActionBar.k5 k5Var = this.f30882b;
        int textHeight = (i14 - k5Var.getTextHeight()) / 2;
        if (id.f23157a0) {
            i13 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i13 = 0;
        }
        k5Var.layout(i13, textHeight, k5Var.getMeasuredWidth() + i13, k5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f30881a;
        int textHeight2 = (i14 - k5Var2.getTextHeight()) / 2;
        if (!id.f23157a0) {
            L = org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        k5Var2.layout(L, textHeight2, k5Var2.getMeasuredWidth() + L, k5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        boolean z10 = id.f23157a0;
        ImageView imageView = this.f30883c;
        if (!z10) {
            measuredWidth = org.telegram.messenger.g0.L(21.0f);
        } else {
            measuredWidth = (i15 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(48.0f);
        this.f30882b.measure(org.telegram.messenger.camera.q.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30881a.measure(org.telegram.messenger.camera.q.c(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30883c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i7) {
        this.f30884e = i7;
    }

    public void setTextColor(int i7) {
        this.f30881a.setTextColor(i7);
    }
}
