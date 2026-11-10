package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
public abstract class y3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.Components.k9 f30937a;
    public org.telegram.ui.ActionBar.m5 f30938b;
    public org.telegram.ui.ActionBar.m5 f30939c;
    public ImageView d;
    public org.telegram.ui.Components.v8 f30940e;
    public TLRPC.User f30941f;
    public Paint h;
    public int f30942n;
    public boolean f30943r;
    public int f30944s;

    public final void a(int i7, int i10) {
        this.f30942n = i7;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.f30939c.setTextColor(i10);
        org.telegram.ui.ActionBar.m6.H1(imageView.getDrawable(), i10 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i7;
        if (this.f30943r) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
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
        return this.f30938b.getText();
    }

    public TLRPC.User getUser() {
        return this.f30941f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z9) {
        this.f30943r = z9;
        invalidate();
    }

    @Override
    public final void updateColors() {
        int x02;
        try {
            this.h.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
            if (this.d != null && this.f30939c != null && (x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f30942n, false)) != this.f30944s) {
                this.f30944s = x02;
                a(this.f30942n, x02);
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
