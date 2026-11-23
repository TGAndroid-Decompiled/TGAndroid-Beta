package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public abstract class z3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.Components.q9 f32536a;
    public org.telegram.ui.ActionBar.m5 f32537b;
    public org.telegram.ui.ActionBar.m5 f32538c;
    public ImageView d;
    public org.telegram.ui.Components.b9 f32539e;
    public TLRPC.User f32540f;
    public Paint h;
    public int f32541n;
    public boolean f32542r;
    public int f32543s;

    public final void a(int i7, int i10) {
        this.f32541n = i7;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f32538c.setTextColor(i10);
        org.telegram.ui.ActionBar.m6.H1(imageView.getDrawable(), i10 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i7;
        if (this.f32542r) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.f32537b.getText();
    }

    public TLRPC.User getUser() {
        return this.f32540f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z10) {
        this.f32542r = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        int x02;
        try {
            this.h.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
            if (this.d != null && this.f32538c != null && (x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f32541n, false)) != this.f32543s) {
                this.f32543s = x02;
                a(this.f32541n, x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
