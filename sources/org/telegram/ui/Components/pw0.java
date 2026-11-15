package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public interface pw0 {
    boolean a();

    void e(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.e2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
