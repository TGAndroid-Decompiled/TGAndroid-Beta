package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.ui.Components.s41;
public final class y1 extends View implements org.telegram.ui.ActionBar.a6 {
    public final s41 f30914a;
    public final org.telegram.ui.ActionBar.f6 f30915b;
    public int f30916c;
    public int d;
    public l1 f30917e;
    public float f30918f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30915b = f6Var;
        s41 s41Var = new s41();
        this.f30914a = s41Var;
        s41Var.setCallback(this);
        s41Var.f37910n = id.M0(2131743830, null);
        s41Var.f37911o = id.M0(2131743831, null);
        s41Var.f37912p = id.M0(2131743829, null);
        s41Var.f37906j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30915b;
        if (f6Var != null) {
            f6Var.b(0.0f, this.f30918f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, this.f30918f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f30916c;
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
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f30916c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.f27922h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f30918f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f30916c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        s41 s41Var = this.f30914a;
        s41Var.setBounds(L, L2, L3, L4);
        s41Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f30916c = L;
        int a10 = this.f30914a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30914a.f37905i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f30917e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f30914a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f30914a) {
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
