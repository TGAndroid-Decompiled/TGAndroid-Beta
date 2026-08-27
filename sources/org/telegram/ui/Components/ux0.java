package org.telegram.ui.Components;

import android.text.Editable;

public interface ux0 {
    void a(ch.e eVar);

    EditTextBoldCursor getEditField();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.n2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
