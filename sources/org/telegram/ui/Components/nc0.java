package org.telegram.ui.Components;

import android.view.View;
public interface nc0 {
    void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

    int getMeasuredHeight();

    int getTop();

    void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);
}
