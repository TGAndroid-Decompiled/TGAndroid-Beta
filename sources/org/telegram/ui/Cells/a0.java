package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.qw0;
public abstract class a0 extends ViewGroup implements qw0 {
    public boolean f21803a;
    public androidx.emoji2.text.j f21804b;
    public int f21805c;
    public ai.r4 d;
    public Runnable f21806e;

    public a0(Context context) {
        super(context);
        this.f21803a = false;
        this.f21804b = null;
        this.f21805c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float o(Drawable drawable, float f7, float f10, float f11) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f11) / drawable.getIntrinsicHeight();
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f11) + i11);
        return intrinsicWidth;
    }

    public static void p(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void q(Drawable drawable, float f7, float f10) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f21806e = runnable;
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
        Runnable runnable = this.f21806e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void k() {
        this.f21803a = false;
        androidx.emoji2.text.j jVar = this.f21804b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        ai.r4 r4Var = this.d;
        if (r4Var != null) {
            removeCallbacks(r4Var);
        }
    }

    public void l() {
        super.invalidate();
    }

    public boolean m() {
        return true;
    }

    public final void r() {
        if (this.f21803a) {
            return;
        }
        this.f21803a = true;
        if (this.d == null) {
            this.d = new ai.r4(this, 28);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
