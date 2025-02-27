package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.app.MediaRouteChooserDialog;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialog;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import androidx.mediarouter.app.MediaRouteDialogFactory;
import java.lang.reflect.Field;
import org.telegram.messenger.R;

public abstract class CastMediaRouteButton extends MediaRouteButton {
    private boolean lastConnected;

    public static class MyMediaRouteChooserDialogFragment extends MediaRouteChooserDialogFragment {
        @Override
        public MediaRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle) {
            return new MediaRouteChooserDialog(new ContextThemeWrapper(context, R.style.Theme_CastDialog));
        }

        @Override
        public void onStart() {
            super.onStart();
            if (getDialog() == null || getDialog().getWindow() == null) {
                return;
            }
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-115203550, PorterDuff.Mode.SRC_IN));
            getDialog().getWindow().setBackgroundDrawable(mutate);
        }
    }

    public static class MyMediaRouteControllerDialogFragment extends MediaRouteControllerDialogFragment {
        @Override
        public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle) {
            return new MediaRouteControllerDialog(new ContextThemeWrapper(context, R.style.Theme_CastDialog));
        }
    }

    public CastMediaRouteButton(Context context) {
        super(context);
        setDialogFactory(new MediaRouteDialogFactory() {
            @Override
            public MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
                return new MyMediaRouteChooserDialogFragment();
            }

            @Override
            public MediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
                return new MyMediaRouteControllerDialogFragment();
            }
        });
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
