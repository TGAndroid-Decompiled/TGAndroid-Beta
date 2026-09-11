package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;
public abstract class md extends MediaRouteButton {
    public boolean f28435a;

    public final void a() {
        boolean b10 = b();
        if (this.f28435a != b10) {
            this.f28435a = b10;
            c(b10);
        }
    }

    public final boolean b() {
        Field declaredField;
        try {
            declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        if (((Integer) declaredField.get(this)).intValue() <= 0) {
            return false;
        }
        return true;
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
