package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.y51;
public final class y1 extends View implements org.telegram.ui.ActionBar.k6 {
    public final y51 f23611a;
    public final org.telegram.ui.ActionBar.p6 f23612b;
    public int f23613c;
    public int d;
    public l1 e;
    public float f23614f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f23612b = p6Var;
        y51 y51Var = new y51();
        this.f23611a = y51Var;
        y51Var.setCallback(this);
        y51Var.f32736n = dd.L0(2131743853, null);
        y51Var.f32737o = dd.L0(2131743854, null);
        y51Var.f32738p = dd.L0(2131743852, null);
        y51Var.f32732j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.p6 p6Var = this.f23612b;
        if (p6Var != null) {
            p6Var.b(0.0f, this.f23614f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.t6.r(0.0f, this.f23614f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.i0.L(18.0f);
        float L2 = org.telegram.messenger.i0.L(6.0f);
        float L3 = org.telegram.messenger.i0.L(18.0f) + this.f23613c;
        float L4 = org.telegram.messenger.i0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.i0.L(18.0f);
        float L6 = org.telegram.messenger.i0.L(18.0f);
        if (p6Var != null) {
            paint = p6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (p6Var != null) {
            d12 = p6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.t6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(18.0f) + this.f23613c, org.telegram.messenger.i0.L(6.0f) + this.d, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.f20999h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23614f = f7;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(18.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int L3 = org.telegram.messenger.i0.L(18.0f) + this.f23613c;
        int L4 = org.telegram.messenger.i0.L(6.0f) + this.d;
        y51 y51Var = this.f23611a;
        y51Var.setBounds(L, L2, L3, L4);
        y51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(36.0f);
        this.f23613c = L;
        int a2 = this.f23611a.a(L);
        this.d = a2;
        setMeasuredDimension(size, org.telegram.messenger.i0.L(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23611a.f32731i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f23611a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23611a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
