package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.au0;
public abstract class z extends ViewGroup implements au0 {
    public boolean f32520a;
    public androidx.emoji2.text.j f32521b;
    public int f32522c;
    public j6.o d;
    public Runnable f32523e;

    public z(Context context) {
        super(context);
        this.f32520a = false;
        this.f32521b = null;
        this.f32522c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float r(Drawable drawable, float f10, float f11, float f12) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f12) / drawable.getIntrinsicHeight();
        int i7 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i7, i10, ((int) intrinsicWidth) + i7, ((int) f12) + i10);
        return intrinsicWidth;
    }

    public static void s(int i7, int i10, Drawable drawable) {
        drawable.setBounds(i7, i10, drawable.getIntrinsicWidth() + i7, drawable.getIntrinsicHeight() + i10);
    }

    public static void t(Drawable drawable, float f10, float f11) {
        int i7 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i7, i10, drawable.getIntrinsicWidth() + i7, drawable.getIntrinsicHeight() + i10);
    }

    @Override
    public final void e(Runnable runnable) {
        this.f32523e = runnable;
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
        Runnable runnable = this.f32523e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void n() {
        this.f32520a = false;
        androidx.emoji2.text.j jVar = this.f32521b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        j6.o oVar = this.d;
        if (oVar != null) {
            removeCallbacks(oVar);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean q() {
        return true;
    }

    public final void u() {
        if (this.f32520a) {
            return;
        }
        this.f32520a = true;
        if (this.d == null) {
            this.d = new j6.o(this, 22);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
