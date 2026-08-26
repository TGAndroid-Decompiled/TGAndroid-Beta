package org.telegram.ui.Components;

import android.view.View;

public abstract class LazyView {
    private View view;
    private int visibility = 8;

    public View forceView() {
        if (this.view == null) {
            this.view = makeView();
        }
        return this.view;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public View makeView() {
        return null;
    }

    public void setVisibility(int i) {
        this.visibility = i;
        if (i == 0 && this.view == null) {
            this.view = makeView();
        }
        View view = this.view;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public View view() {
        return this.view;
    }
}
