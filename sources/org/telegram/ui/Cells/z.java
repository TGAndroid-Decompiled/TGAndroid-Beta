package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.sw0;
public abstract class z extends ViewGroup implements sw0 {
    public boolean f25769a;
    public androidx.emoji2.text.j f25770b;
    public int f25771c;
    public m.g3 d;
    public Runnable e;

    public z(Context context) {
        super(context);
        this.f25769a = false;
        this.f25770b = null;
        this.f25771c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float m(Drawable drawable, float f7, float f10, float f11) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f11) / drawable.getIntrinsicHeight();
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f11) + i11);
        return intrinsicWidth;
    }

    public static void n(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void o(Drawable drawable, float f7, float f10) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override
    public final void e(Runnable runnable) {
        this.e = runnable;
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
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void j() {
        this.f25769a = false;
        androidx.emoji2.text.j jVar = this.f25770b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m.g3 g3Var = this.d;
        if (g3Var != null) {
            removeCallbacks(g3Var);
        }
    }

    public void k() {
        super.invalidate();
    }

    public boolean l() {
        return true;
    }

    public final void p() {
        if (this.f25769a) {
            return;
        }
        this.f25769a = true;
        if (this.d == null) {
            this.d = new m.g3(this, 3);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
