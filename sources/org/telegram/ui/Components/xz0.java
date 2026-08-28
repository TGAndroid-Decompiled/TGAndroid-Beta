package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public class xz0 extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z10, boolean z11) {
        if (z11 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (z10) {
                getNextView().setText(charSequence);
                showNext();
                return;
            }
            getCurrentView().setText(charSequence);
        }
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i9, layoutParams);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setText(CharSequence charSequence) {
        a(charSequence, true, false);
    }

    @Override
    public TextView getCurrentView() {
        return (TextView) super.getCurrentView();
    }

    @Override
    public TextView getNextView() {
        return (TextView) super.getNextView();
    }
}
