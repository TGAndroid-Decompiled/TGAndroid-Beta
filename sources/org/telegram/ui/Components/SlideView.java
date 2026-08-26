package org.telegram.ui.Components;

import android.os.Bundle;
import android.widget.LinearLayout;
import org.telegram.ui.LoginActivity;

public abstract class SlideView extends LinearLayout {
    public String getHeaderName() {
        return "";
    }

    public boolean hasCustomKeyboard() {
        return this instanceof LoginActivity.LoginActivityEmailCodeView;
    }

    public boolean needBackButton() {
        return this instanceof LoginActivity.LoginActivityEmailCodeView;
    }

    public boolean onBackPressed(boolean z) {
        return true;
    }

    public void onCancelPressed() {
    }

    public void onDestroyActivity() {
    }

    public void onHide() {
    }

    public void onNextPressed(String str) {
    }

    public void onResume() {
    }

    public void onShow() {
    }

    public void restoreStateParams(Bundle bundle) {
    }

    public void saveStateParams(Bundle bundle) {
    }

    public void setParams(Bundle bundle, boolean z) {
    }

    public void updateColors$1() {
    }
}
