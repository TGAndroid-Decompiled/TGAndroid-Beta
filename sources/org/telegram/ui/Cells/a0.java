package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.mv0;
public abstract class a0 extends ViewGroup implements mv0 {
    public boolean f22533a;
    public androidx.emoji2.text.j f22534b;
    public int f22535c;
    public m2.b d;
    public Runnable f22536e;

    public a0(Context context) {
        super(context);
        this.f22533a = false;
        this.f22534b = null;
        this.f22535c = 0;
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
        this.f22536e = runnable;
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
        Runnable runnable = this.f22536e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void k() {
        this.f22533a = false;
        androidx.emoji2.text.j jVar = this.f22534b;
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
        if (this.f22533a) {
            return;
        }
        this.f22533a = true;
        if (this.d == null) {
            this.d = new m2.b(this, 6);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
