package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

public abstract class IUpdateButton extends FrameLayout {
    public abstract void onTranslationUpdate(Utilities.Callback callback);

    public abstract void update(boolean z);

    public IUpdateButton(Context context) {
        super(context);
    }
}
