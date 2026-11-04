package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.nt0;
public abstract class z extends ViewGroup implements nt0 {
    public boolean f31017a;
    public androidx.emoji2.text.j f31018b;
    public int f31019c;
    public mi.b0 d;
    public Runnable f31020e;

    public z(Context context) {
        super(context);
        this.f31017a = false;
        this.f31018b = null;
        this.f31019c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float r(Drawable drawable, float f10, float f11, float f12) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f12) / drawable.getIntrinsicHeight();
        int i3 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i3, i10, ((int) intrinsicWidth) + i3, ((int) f12) + i10);
        return intrinsicWidth;
    }

    public static void s(int i3, int i10, Drawable drawable) {
        drawable.setBounds(i3, i10, drawable.getIntrinsicWidth() + i3, drawable.getIntrinsicHeight() + i10);
    }

    public static void t(Drawable drawable, float f10, float f11) {
        int i3 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i3, i10, drawable.getIntrinsicWidth() + i3, drawable.getIntrinsicHeight() + i10);
    }

    @Override
    public final void f(Runnable runnable) {
        this.f31020e = runnable;
    }

    public int getBoundsLeft() {
        return 0;
    }

    public int getBoundsRight() {
        return getWidth();
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void invalidate() {
        Runnable runnable = this.f31020e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void n() {
        this.f31017a = false;
        androidx.emoji2.text.j jVar = this.f31018b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        mi.b0 b0Var = this.d;
        if (b0Var != null) {
            removeCallbacks(b0Var);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean q() {
        return true;
    }

    public final void u() {
        if (this.f31017a) {
            return;
        }
        this.f31017a = true;
        if (this.d == null) {
            this.d = new mi.b0(this, 18);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
