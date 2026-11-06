package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.r41;
public final class y1 extends View implements org.telegram.ui.ActionBar.a6 {
    public final r41 f30909a;
    public final org.telegram.ui.ActionBar.f6 f30910b;
    public int f30911c;
    public int d;
    public l1 f30912e;
    public float f30913f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30910b = f6Var;
        r41 r41Var = new r41();
        this.f30909a = r41Var;
        r41Var.setCallback(this);
        r41Var.f37542n = hd.M0(2131743828, null);
        r41Var.f37543o = hd.M0(2131743829, null);
        r41Var.f37544p = hd.M0(2131743827, null);
        r41Var.f37538j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30910b;
        if (f6Var != null) {
            f6Var.b(0.0f, this.f30913f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, this.f30913f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f30911c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (f6Var != null) {
            paint = f6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (f6Var != null) {
            d12 = f6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.k6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f30911c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f27918h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f30913f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f30911c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        r41 r41Var = this.f30909a;
        r41Var.setBounds(L, L2, L3, L4);
        r41Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f30911c = L;
        int a10 = this.f30909a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30909a.f37537i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f30912e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f30909a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f30909a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
    }
}
