package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.h51;
public final class y1 extends View implements org.telegram.ui.ActionBar.c6 {
    public final h51 f32447a;
    public final org.telegram.ui.ActionBar.i6 f32448b;
    public int f32449c;
    public int d;
    public l1 f32450e;
    public float f32451f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f32448b = i6Var;
        h51 h51Var = new h51();
        this.f32447a = h51Var;
        h51Var.setCallback(this);
        h51Var.f35744n = gd.M0(2131743590, null);
        h51Var.f35745o = gd.M0(2131743591, null);
        h51Var.f35746p = gd.M0(2131743589, null);
        h51Var.f35740j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32448b;
        if (i6Var != null) {
            i6Var.e(0.0f, this.f32451f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, this.f32451f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f32449c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (i6Var != null) {
            paint = i6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (i6Var != null) {
            d12 = i6Var.j();
        } else {
            d12 = org.telegram.ui.ActionBar.n6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f32449c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.f29466h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f32451f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f32449c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        h51 h51Var = this.f32447a;
        h51Var.setBounds(L, L2, L3, L4);
        h51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f32449c = L;
        int a10 = this.f32447a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f32447a.f35739i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f32450e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f32447a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32447a) {
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
