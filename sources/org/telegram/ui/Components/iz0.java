package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public interface iz0 {
    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.o2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
