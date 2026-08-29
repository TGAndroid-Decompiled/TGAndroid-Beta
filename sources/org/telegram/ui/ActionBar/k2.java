package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import org.telegram.ui.Components.tc;
public interface k2 {
    boolean attachedToParent();

    void dismiss();

    void dismiss(boolean z10);

    tc getBulletinFactory();

    int getNavigationBarColor(int i10);

    View getWindowView();

    boolean isAttachedLightStatusBar();

    boolean isFullyVisible();

    boolean isShown();

    boolean onAttachedBackPressed();

    void setKeyboardHeightFromParent(int i10);

    void setLastVisible(boolean z10);

    void setOnDismissListener(Runnable runnable);

    boolean showDialog(Dialog dialog);
}
