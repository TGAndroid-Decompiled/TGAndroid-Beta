package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public interface qx0 {
    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.k2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
