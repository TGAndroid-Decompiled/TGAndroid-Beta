package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
public class y4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 f32457a;
    public final org.telegram.ui.ActionBar.m5 f32458b;
    public final ImageView f32459c;
    public boolean d;
    public int f32460e;
    public int f32461f;

    public y4(Context context) {
        super(context);
        int i7;
        this.f32460e = 0;
        this.f32461f = 71;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f32457a = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(16);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        addView(m5Var);
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f32458b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.I6, null);
        m5Var2.setTextSize(16);
        m5Var2.setGravity(hd.f24408a0 ? 3 : 5);
        addView(m5Var2);
        ImageView imageView = new ImageView(context);
        this.f32459c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29512m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f32457a;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, null);
        m5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f32459c;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z10) {
        this.f32457a.l(str, false);
        this.f32458b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.f32459c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.m5 getTextView() {
        return this.f32457a;
    }

    public org.telegram.ui.ActionBar.m5 getValueTextView() {
        return this.f32458b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i7 = this.f32460e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.m6.f29489l0.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            }
            float L = org.telegram.messenger.g0.L(this.f32461f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f32460e != 0) {
                paint = org.telegram.ui.ActionBar.m6.f29489l0;
            } else {
                paint = org.telegram.ui.ActionBar.m6.f29470k0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int L;
        int measuredWidth;
        int i14 = i12 - i10;
        int i15 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.f32458b;
        int textHeight = (i14 - m5Var.getTextHeight()) / 2;
        if (hd.f24408a0) {
            i13 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i13 = 0;
        }
        m5Var.layout(i13, textHeight, m5Var.getMeasuredWidth() + i13, m5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f32457a;
        int textHeight2 = (i14 - m5Var2.getTextHeight()) / 2;
        if (!hd.f24408a0) {
            L = org.telegram.messenger.g0.L(this.f32461f);
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        m5Var2.layout(L, textHeight2, m5Var2.getMeasuredWidth() + L, m5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        boolean z11 = hd.f24408a0;
        ImageView imageView = this.f32459c;
        if (!z11) {
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
        this.f32458b.measure(o10.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f32457a.measure(o10.c(this.f32461f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f32459c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i7) {
        this.f32460e = i7;
    }

    public void setTextColor(int i7) {
        this.f32457a.setTextColor(i7);
    }

    public void setTextLeft(int i7) {
        this.f32461f = i7;
        requestLayout();
    }
}
