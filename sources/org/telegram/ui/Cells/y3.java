package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
public abstract class y3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.Components.k9 f30981a;
    public org.telegram.ui.ActionBar.k5 f30982b;
    public org.telegram.ui.ActionBar.k5 f30983c;
    public ImageView d;
    public org.telegram.ui.Components.u8 f30984e;
    public TLRPC.User f30985f;
    public Paint h;
    public int f30986n;
    public boolean f30987r;
    public int f30988s;

    public final void a(int i3, int i10) {
        this.f30986n = i3;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f30983c.setTextColor(i10);
        org.telegram.ui.ActionBar.k6.H1(imageView.getDrawable(), i10 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i3;
        if (this.f30987r) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i3 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.f30982b.getText();
    }

    public TLRPC.User getUser() {
        return this.f30985f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z10) {
        this.f30987r = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        int x02;
        try {
            this.h.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            if (this.d != null && this.f30983c != null && (x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f30986n, false)) != this.f30988s) {
                this.f30988s = x02;
                a(this.f30986n, x02);
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
