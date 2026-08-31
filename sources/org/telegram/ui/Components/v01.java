package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public class v01 extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z4, boolean z10) {
        if (z10 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (z4) {
                getNextView().setText(charSequence);
                showNext();
                return;
            }
            getCurrentView().setText(charSequence);
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i10, layoutParams);
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
