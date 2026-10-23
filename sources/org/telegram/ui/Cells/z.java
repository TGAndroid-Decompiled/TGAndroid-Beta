package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.lw0;
public abstract class z extends ViewGroup implements lw0 {
    public boolean f24006a;
    public androidx.emoji2.text.j f24007b;
    public int f24008c;
    public androidx.activity.i d;
    public Runnable e;

    public z(Context context) {
        super(context);
        this.f24006a = false;
        this.f24007b = null;
        this.f24008c = 0;
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

    public static void p(Drawable drawable, float f7, float f10) {
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

    public final void j() {
        this.f24006a = false;
        androidx.emoji2.text.j jVar = this.f24007b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        androidx.activity.i iVar = this.d;
        if (iVar != null) {
            removeCallbacks(iVar);
        }
    }

    public void k() {
        super.invalidate();
    }

    public boolean l() {
        return true;
    }

    public final void q() {
        if (this.f24006a) {
            return;
        }
        this.f24006a = true;
        if (this.d == null) {
            this.d = new androidx.activity.i(this, 29);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
