package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.ru0;
public abstract class z extends ViewGroup implements ru0 {
    public boolean f23630a;
    public androidx.emoji2.text.j f23631b;
    public int f23632c;
    public mg.c2 d;
    public Runnable e;

    public z(Context context) {
        super(context);
        this.f23630a = false;
        this.f23631b = null;
        this.f23632c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float s(Drawable drawable, float f7, float f10, float f11) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f11) / drawable.getIntrinsicHeight();
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f11) + i11);
        return intrinsicWidth;
    }

    public static void t(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void u(Drawable drawable, float f7, float f10) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override
    public final void f(Runnable runnable) {
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

    public final void m() {
        this.f23630a = false;
        androidx.emoji2.text.j jVar = this.f23631b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        mg.c2 c2Var = this.d;
        if (c2Var != null) {
            removeCallbacks(c2Var);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean r() {
        return true;
    }

    public final void w() {
        if (this.f23630a) {
            return;
        }
        this.f23630a = true;
        if (this.d == null) {
            this.d = new mg.c2(this, 17);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
