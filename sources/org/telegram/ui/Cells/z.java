package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.qt0;
public abstract class z extends ViewGroup implements qt0 {
    public boolean f30948a;
    public androidx.emoji2.text.j f30949b;
    public int f30950c;
    public m.f3 d;
    public Runnable f30951e;

    public z(Context context) {
        super(context);
        this.f30948a = false;
        this.f30949b = null;
        this.f30950c = 0;
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
    public final void f(Runnable runnable) {
        this.f30951e = runnable;
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
        Runnable runnable = this.f30951e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void n() {
        this.f30948a = false;
        androidx.emoji2.text.j jVar = this.f30949b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m.f3 f3Var = this.d;
        if (f3Var != null) {
            removeCallbacks(f3Var);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean q() {
        return true;
    }

    public final void u() {
        if (this.f30948a) {
            return;
        }
        this.f30948a = true;
        if (this.d == null) {
            this.d = new m.f3(this, 19);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
