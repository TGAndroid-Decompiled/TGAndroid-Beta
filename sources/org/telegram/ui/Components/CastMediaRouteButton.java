package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

public abstract class CastMediaRouteButton extends MediaRouteButton {
    private boolean lastConnected;

    @Override
    public void setBackground(Drawable drawable) {
    }

    public abstract void stateUpdated(boolean z);

    public CastMediaRouteButton(Context context) {
        super(context);
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
    protected void dispatchDraw(Canvas canvas) {
        checkConnected();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        checkConnected();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        checkConnected();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        checkConnected();
    }

    private void checkConnected() {
        boolean zIsConnected = isConnected();
        if (this.lastConnected != zIsConnected) {
            this.lastConnected = zIsConnected;
            stateUpdated(zIsConnected);
        }
    }
}
