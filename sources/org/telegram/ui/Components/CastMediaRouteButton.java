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

    public boolean isConnected() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(this)).intValue() > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) throws NoSuchFieldException, SecurityException {
        checkConnected();
    }

    @Override
    protected void onDraw(Canvas canvas) throws NoSuchFieldException, SecurityException {
        checkConnected();
    }

    @Override
    public void invalidate() throws NoSuchFieldException, SecurityException {
        super.invalidate();
        checkConnected();
    }

    @Override
    public void onAttachedToWindow() throws NoSuchFieldException, SecurityException {
        super.onAttachedToWindow();
        checkConnected();
    }

    private void checkConnected() throws NoSuchFieldException, SecurityException {
        boolean zIsConnected = isConnected();
        if (this.lastConnected != zIsConnected) {
            this.lastConnected = zIsConnected;
            stateUpdated(zIsConnected);
        }
    }
}
