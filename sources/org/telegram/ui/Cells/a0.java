package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.ev0;
public abstract class a0 extends ViewGroup implements ev0 {
    public boolean f24061a;
    public androidx.emoji2.text.j f24062b;
    public int f24063c;
    public lh.m7 d;
    public Runnable f24064e;

    public a0(Context context) {
        super(context);
        this.f24061a = false;
        this.f24062b = null;
        this.f24063c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float n(Drawable drawable, float f9, float f10, float f11) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f11) / drawable.getIntrinsicHeight();
        int i10 = (int) f9;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f11) + i11);
        return intrinsicWidth;
    }

    public static void o(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void p(Drawable drawable, float f9, float f10) {
        int i10 = (int) f9;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f24064e = runnable;
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
        Runnable runnable = this.f24064e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void k() {
        this.f24061a = false;
        androidx.emoji2.text.j jVar = this.f24062b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        lh.m7 m7Var = this.d;
        if (m7Var != null) {
            removeCallbacks(m7Var);
        }
    }

    public void l() {
        super.invalidate();
    }

    public boolean m() {
        return true;
    }

    public final void q() {
        if (this.f24061a) {
            return;
        }
        this.f24061a = true;
        if (this.d == null) {
            this.d = new lh.m7(this, 7);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
