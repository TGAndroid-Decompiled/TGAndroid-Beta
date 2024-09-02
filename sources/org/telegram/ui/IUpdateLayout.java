package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.Keep;

@Keep
public abstract class IUpdateLayout {
    @Keep
    public void createUpdateUI(int i) {
    }

    @Keep
    public void updateAppUpdateViews(int i, boolean z) {
    }

    @Keep
    public void updateFileProgress(Object[] objArr) {
    }

    @Keep
    public IUpdateLayout(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
    }
}
