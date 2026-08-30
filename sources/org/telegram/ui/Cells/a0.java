package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.nv0;
public abstract class a0 extends ViewGroup implements nv0 {
    public boolean f20811a;
    public androidx.emoji2.text.j f20812b;
    public int f20813c;
    public m2.b d;
    public Runnable e;

    public a0(Context context) {
        super(context);
        this.f20811a = false;
        this.f20812b = null;
        this.f20813c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float n(Drawable drawable, float f10, float f11, float f12) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f12) / drawable.getIntrinsicHeight();
        int i10 = (int) f10;
        int i11 = (int) f11;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f12) + i11);
        return intrinsicWidth;
    }

    public static void o(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void p(Drawable drawable, float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
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
        this.f20811a = false;
        androidx.emoji2.text.j jVar = this.f20812b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m2.b bVar = this.d;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public void l() {
        super.invalidate();
    }

    public boolean m() {
        return true;
    }

    public final void q() {
        if (this.f20811a) {
            return;
        }
        this.f20811a = true;
        if (this.d == null) {
            this.d = new m2.b(this, 6);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
