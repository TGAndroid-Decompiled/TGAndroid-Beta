package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.zv0;
public abstract class a0 extends ViewGroup implements zv0 {
    public boolean f20012a;
    public androidx.emoji2.text.j f20013b;
    public int f20014c;
    public ai.q4 d;
    public Runnable e;

    public a0(Context context) {
        super(context);
        this.f20012a = false;
        this.f20013b = null;
        this.f20014c = 0;
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

    public static void p(Drawable drawable, float f7, float f10) {
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
        this.f20012a = false;
        androidx.emoji2.text.j jVar = this.f20013b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        ai.q4 q4Var = this.d;
        if (q4Var != null) {
            removeCallbacks(q4Var);
        }
    }

    public void l() {
        super.invalidate();
    }

    public boolean m() {
        return true;
    }

    public final void q() {
        if (this.f20012a) {
            return;
        }
        this.f20012a = true;
        if (this.d == null) {
            this.d = new ai.q4(this, 28);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
