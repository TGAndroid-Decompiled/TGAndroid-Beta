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
    public final org.telegram.ui.ActionBar.m5 f30896a;
    public final org.telegram.ui.ActionBar.m5 f30897b;
    public final ImageView f30898c;
    public boolean d;
    public int f30899e;
    public int f30900f;

    public x4(Context context) {
        super(context);
        int i7;
        this.f30899e = 0;
        this.f30900f = 71;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f30896a = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(16);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        addView(m5Var);
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f30897b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.I6, null);
        m5Var2.setTextSize(16);
        m5Var2.setGravity(id.f23161a0 ? 3 : 5);
        addView(m5Var2);
        ImageView imageView = new ImageView(context);
        this.f30898c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f28055m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f30896a;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, null);
        m5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f30898c;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z9) {
        this.f30896a.l(str, false);
        this.f30897b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.f30898c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z9;
        setWillNotDraw(!z9);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.m5 getTextView() {
        return this.f30896a;
    }

    public org.telegram.ui.ActionBar.m5 getValueTextView() {
        return this.f30897b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i7 = this.f30899e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.m6.f28032l0.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            }
            float L = org.telegram.messenger.g0.L(this.f30900f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f30899e != 0) {
                paint = org.telegram.ui.ActionBar.m6.f28032l0;
            } else {
                paint = org.telegram.ui.ActionBar.m6.f28013k0;
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
        org.telegram.ui.ActionBar.m5 m5Var = this.f30897b;
        int textHeight = (i14 - m5Var.getTextHeight()) / 2;
        if (id.f23161a0) {
            i13 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i13 = 0;
        }
        m5Var.layout(i13, textHeight, m5Var.getMeasuredWidth() + i13, m5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f30896a;
        int textHeight2 = (i14 - m5Var2.getTextHeight()) / 2;
        if (!id.f23161a0) {
            L = org.telegram.messenger.g0.L(this.f30900f);
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        m5Var2.layout(L, textHeight2, m5Var2.getMeasuredWidth() + L, m5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        boolean z10 = id.f23161a0;
        ImageView imageView = this.f30898c;
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
        this.f30897b.measure(org.telegram.messenger.camera.q.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30896a.measure(org.telegram.messenger.camera.q.c(this.f30900f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30898c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i7) {
        this.f30899e = i7;
    }

    public void setTextColor(int i7) {
        this.f30896a.setTextColor(i7);
    }

    public void setTextLeft(int i7) {
        this.f30900f = i7;
        requestLayout();
    }
}
