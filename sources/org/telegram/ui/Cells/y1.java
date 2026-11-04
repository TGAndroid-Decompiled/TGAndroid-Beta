package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.o41;
public final class y1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final o41 f30974a;
    public final org.telegram.ui.ActionBar.e6 f30975b;
    public int f30976c;
    public int d;
    public l1 f30977e;
    public float f30978f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30975b = e6Var;
        o41 o41Var = new o41();
        this.f30974a = o41Var;
        o41Var.setCallback(this);
        o41Var.f36702n = bd.M0(2131743837, null);
        o41Var.f36703o = bd.M0(2131743838, null);
        o41Var.f36704p = bd.M0(2131743836, null);
        o41Var.f36698j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30975b;
        if (e6Var != null) {
            e6Var.b(0.0f, this.f30978f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, this.f30978f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f30976c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (e6Var != null) {
            paint = e6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (e6Var != null) {
            d12 = e6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.k6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f30976c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f27951h2);
        }
    }

    public final void b(float f10, int i3) {
        this.f30978f = f10;
        this.h = i3;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f30976c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        o41 o41Var = this.f30974a;
        o41Var.setBounds(L, L2, L3, L4);
        o41Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f30976c = L;
        int a10 = this.f30974a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30974a.f36697i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f30977e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f30974a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f30974a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
