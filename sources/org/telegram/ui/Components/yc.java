package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

public abstract class yc extends MediaRouteButton {

    public boolean f34879a;

    public final void a() {
        boolean zB = b();
        if (this.f34879a != zB) {
            this.f34879a = zB;
            c(zB);
        }
    }

    public final boolean b() {
        try {
            Field declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(this)).intValue() > 0;
        } catch (Exception unused) {
        }
    }

    public abstract void c(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a();
    }

    @Override
    public void setBackground(Drawable drawable) {
    }
}
