package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
public abstract class a4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.Components.g9 f21668a;
    public org.telegram.ui.ActionBar.u5 f21669b;
    public org.telegram.ui.ActionBar.u5 f21670c;
    public ImageView d;
    public org.telegram.ui.Components.r8 e;
    public TLRPC.User f21671f;
    public Paint h;
    public int f21672n;
    public boolean f21673r;
    public int f21674s;

    public final void a(int i10, int i11) {
        this.f21672n = i10;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f21670c.setTextColor(i11);
        org.telegram.ui.ActionBar.t6.H1(imageView.getDrawable(), i11 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i10;
        if (this.f21673r) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(68.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(68.0f);
            } else {
                i10 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.f21669b.getText();
    }

    public TLRPC.User getUser() {
        return this.f21671f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z10) {
        this.f21673r = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        int x02;
        try {
            this.h.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            if (this.d != null && this.f21670c != null && (x02 = org.telegram.ui.ActionBar.t6.x0(null, this.f21672n, false)) != this.f21674s) {
                this.f21674s = x02;
                a(this.f21672n, x02);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
