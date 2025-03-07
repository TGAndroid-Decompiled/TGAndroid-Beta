package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

public abstract class CastMediaRouteButton extends MediaRouteButton {
    private boolean lastConnected;

    public CastMediaRouteButton(Context context) {
        super(context);
    }

    private void checkConnected() {
        boolean isConnected = isConnected();
        if (this.lastConnected != isConnected) {
            this.lastConnected = isConnected;
            stateUpdated(isConnected);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        checkConnected();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        checkConnected();
    }

    public boolean isConnected() {
        try {
            Field declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(this)).intValue() > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        checkConnected();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        checkConnected();
    }

    @Override
    public void setBackground(Drawable drawable) {
    }

    public abstract void stateUpdated(boolean z);
}
