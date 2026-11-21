package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.k51;
public final class z1 extends View implements org.telegram.ui.ActionBar.b6 {
    public final k51 f32526a;
    public final org.telegram.ui.ActionBar.h6 f32527b;
    public int f32528c;
    public int d;
    public m1 f32529e;
    public float f32530f;
    public int h;

    public z1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f32527b = h6Var;
        k51 k51Var = new k51();
        this.f32526a = k51Var;
        k51Var.setCallback(this);
        k51Var.f36795n = gd.N0(2131743584, null);
        k51Var.f36796o = gd.N0(2131743585, null);
        k51Var.f36797p = gd.N0(2131743583, null);
        k51Var.f36791j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32527b;
        if (h6Var != null) {
            h6Var.e(0.0f, this.f32530f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, this.f32530f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f32528c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (h6Var != null) {
            paint = h6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (h6Var != null) {
            d12 = h6Var.j();
        } else {
            d12 = org.telegram.ui.ActionBar.m6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f32528c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.f29448h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f32530f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f32528c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        k51 k51Var = this.f32526a;
        k51Var.setBounds(L, L2, L3, L4);
        k51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f32528c = L;
        int a10 = this.f32526a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f32526a.f36790i.a(this, motionEvent);
    }

    public void setDelegate(m1 m1Var) {
        this.f32529e = m1Var;
    }

    @Override
    public final void updateColors() {
        this.f32526a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32526a) {
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
