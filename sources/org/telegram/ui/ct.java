package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ct implements TextWatcher {
    public final EditTextBoldCursor f35557a;

    public ct(EditTextBoldCursor editTextBoldCursor) {
        this.f35557a = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        try {
            String obj = editable.toString();
            if (!obj.isEmpty()) {
                int intValue = Utilities.parseInt((CharSequence) obj).intValue();
                EditTextBoldCursor editTextBoldCursor = this.f35557a;
                if (intValue < 0) {
                    editTextBoldCursor.setText("0");
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                } else if (intValue > 300) {
                    editTextBoldCursor.setText("300");
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                } else {
                    if (!obj.equals("" + intValue)) {
                        editTextBoldCursor.setText("" + intValue);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
