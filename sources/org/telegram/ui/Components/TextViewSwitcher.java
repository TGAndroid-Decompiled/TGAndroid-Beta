package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class TextViewSwitcher extends ViewSwitcher {
    public TextViewSwitcher(Context context) {
        super(context);
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, true);
    }

    public void setText(CharSequence charSequence, boolean z) {
        if (TextUtils.equals(charSequence, getCurrentView().getText())) {
            return;
        }
        if (z) {
            getNextView().setText(charSequence);
            showNext();
            return;
        }
        getCurrentView().setText(charSequence);
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public TextView getCurrentView() {
        return (TextView) super.getCurrentView();
    }

    @Override
    public TextView getNextView() {
        return (TextView) super.getNextView();
    }

    public void invalidateViews() {
        getCurrentView().invalidate();
        getNextView().invalidate();
    }
}
