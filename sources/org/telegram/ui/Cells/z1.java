package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.j51;
public final class z1 extends View implements org.telegram.ui.ActionBar.c6 {
    public final j51 f32583a;
    public final org.telegram.ui.ActionBar.i6 f32584b;
    public int f32585c;
    public int d;
    public m1 f32586e;
    public float f32587f;
    public int h;

    public z1(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f32584b = i6Var;
        j51 j51Var = new j51();
        this.f32583a = j51Var;
        j51Var.setCallback(this);
        j51Var.f36288n = gd.N0(2131743580, null);
        j51Var.f36289o = gd.N0(2131743581, null);
        j51Var.f36290p = gd.N0(2131743579, null);
        j51Var.f36284j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32584b;
        if (i6Var != null) {
            i6Var.c(0.0f, this.f32587f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, this.f32587f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f32585c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (i6Var != null) {
            paint = i6Var.e("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (i6Var != null) {
            d12 = i6Var.h();
        } else {
            d12 = org.telegram.ui.ActionBar.n6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f32585c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.f29521h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f32587f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f32585c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        j51 j51Var = this.f32583a;
        j51Var.setBounds(L, L2, L3, L4);
        j51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f32585c = L;
        int a10 = this.f32583a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f32583a.f36283i.a(this, motionEvent);
    }

    public void setDelegate(m1 m1Var) {
        this.f32586e = m1Var;
    }

    @Override
    public final void updateColors() {
        this.f32583a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32583a) {
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
