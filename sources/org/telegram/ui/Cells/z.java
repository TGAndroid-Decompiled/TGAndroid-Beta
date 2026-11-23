package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.zt0;
public abstract class z extends ViewGroup implements zt0 {
    public boolean f32577a;
    public androidx.emoji2.text.j f32578b;
    public int f32579c;
    public i6.g d;
    public Runnable f32580e;

    public z(Context context) {
        super(context);
        this.f32577a = false;
        this.f32578b = null;
        this.f32579c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float s(Drawable drawable, float f10, float f11, float f12) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f12) / drawable.getIntrinsicHeight();
        int i7 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i7, i10, ((int) intrinsicWidth) + i7, ((int) f12) + i10);
        return intrinsicWidth;
    }

    public static void t(int i7, int i10, Drawable drawable) {
        drawable.setBounds(i7, i10, drawable.getIntrinsicWidth() + i7, drawable.getIntrinsicHeight() + i10);
    }

    public static void u(Drawable drawable, float f10, float f11) {
        int i7 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i7, i10, drawable.getIntrinsicWidth() + i7, drawable.getIntrinsicHeight() + i10);
    }

    @Override
    public final void d(Runnable runnable) {
        this.f32580e = runnable;
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
        Runnable runnable = this.f32580e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void n() {
        this.f32577a = false;
        androidx.emoji2.text.j jVar = this.f32578b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        i6.g gVar = this.d;
        if (gVar != null) {
            removeCallbacks(gVar);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean q() {
        return true;
    }

    public final void v() {
        if (this.f32577a) {
            return;
        }
        this.f32577a = true;
        if (this.d == null) {
            this.d = new i6.g(this, 23);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
