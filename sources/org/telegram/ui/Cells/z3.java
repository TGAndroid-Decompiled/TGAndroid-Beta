package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
public abstract class z3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.Components.p9 f32590a;
    public org.telegram.ui.ActionBar.n5 f32591b;
    public org.telegram.ui.ActionBar.n5 f32592c;
    public ImageView d;
    public org.telegram.ui.Components.a9 f32593e;
    public TLRPC.User f32594f;
    public Paint h;
    public int f32595n;
    public boolean f32596r;
    public int f32597s;

    public final void a(int i7, int i10) {
        this.f32595n = i7;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f32592c.setTextColor(i10);
        org.telegram.ui.ActionBar.n6.H1(imageView.getDrawable(), i10 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i7;
        if (this.f32596r) {
            if (gd.f24314a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24314a0) {
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
        return this.f32591b.getText();
    }

    public TLRPC.User getUser() {
        return this.f32594f;
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
        this.f32596r = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        int x02;
        try {
            this.h.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false));
            if (this.d != null && this.f32592c != null && (x02 = org.telegram.ui.ActionBar.n6.x0(null, this.f32595n, false)) != this.f32597s) {
                this.f32597s = x02;
                a(this.f32595n, x02);
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
