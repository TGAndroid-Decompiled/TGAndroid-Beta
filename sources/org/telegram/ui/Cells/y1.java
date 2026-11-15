package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.x41;
public final class y1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final x41 f32049a;
    public final org.telegram.ui.ActionBar.e6 f32050b;
    public int f32051c;
    public int d;
    public l1 f32052e;
    public float f32053f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32050b = e6Var;
        x41 x41Var = new x41();
        this.f32049a = x41Var;
        x41Var.setCallback(this);
        x41Var.f41579n = hd.M0(2131743827, null);
        x41Var.f41580o = hd.M0(2131743828, null);
        x41Var.f41581p = hd.M0(2131743826, null);
        x41Var.f41575j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32050b;
        if (e6Var != null) {
            e6Var.b(0.0f, this.f32053f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.r(0.0f, this.f32053f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f32051c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (e6Var != null) {
            paint = e6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (e6Var != null) {
            d12 = e6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.j6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f32051c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.j6.f28919h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f32053f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f32051c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        x41 x41Var = this.f32049a;
        x41Var.setBounds(L, L2, L3, L4);
        x41Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f32051c = L;
        int a10 = this.f32049a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f32049a.f41574i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f32052e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f32049a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32049a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
