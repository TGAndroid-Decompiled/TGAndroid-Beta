package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.lw0;
public abstract class a0 extends ViewGroup implements lw0 {
    public boolean f20890a;
    public androidx.emoji2.text.j f20891b;
    public int f20892c;
    public androidx.activity.i d;
    public Runnable e;

    public a0(Context context) {
        super(context);
        this.f20890a = false;
        this.f20891b = null;
        this.f20892c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float n(Drawable drawable, float f7, float f10, float f11) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f11) / drawable.getIntrinsicHeight();
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f11) + i11);
        return intrinsicWidth;
    }

    public static void o(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void q(Drawable drawable, float f7, float f10) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override
    public final void g(Runnable runnable) {
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

    public final void k() {
        this.f20890a = false;
        androidx.emoji2.text.j jVar = this.f20891b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        androidx.activity.i iVar = this.d;
        if (iVar != null) {
            removeCallbacks(iVar);
        }
    }

    public void l() {
        super.invalidate();
    }

    public boolean m() {
        return true;
    }

    public final void r() {
        if (this.f20890a) {
            return;
        }
        this.f20890a = true;
        if (this.d == null) {
            this.d = new androidx.activity.i(this, 28);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
