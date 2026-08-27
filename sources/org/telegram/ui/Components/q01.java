package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

public final class q01 implements TextWatcher {

    public final int f31747a;

    public final r01 f31748b;

    public q01(r01 r01Var, int i10) {
        this.f31748b = r01Var;
        this.f31747a = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        int i12;
        r01 r01Var = this.f31748b;
        EditTextBoldCursor[] editTextBoldCursorArr = r01Var.f32026n;
        ThemeEditorView.EditorAlert editorAlert = r01Var.E;
        if (editorAlert.G) {
            return;
        }
        editorAlert.G = true;
        int iIntValue = Utilities.parseInt((CharSequence) editable.toString()).intValue();
        int i13 = this.f31747a;
        if (iIntValue < 0) {
            editTextBoldCursorArr[i13].setText("0");
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i13];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            iIntValue = 0;
        } else if (iIntValue > 255) {
            editTextBoldCursorArr[i13].setText("255");
            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            iIntValue = 255;
        }
        int iB = r01Var.b();
        if (i13 == 2) {
            i10 = iB & (-256);
            i11 = iIntValue & 255;
        } else if (i13 == 1) {
            i10 = iB & (-65281);
            i11 = (iIntValue & 255) << 8;
        } else {
            if (i13 != 0) {
                if (i13 == 3) {
                    i10 = iB & 16777215;
                    i11 = (iIntValue & 255) << 24;
                }
                r01Var.c(iB);
                for (i12 = 0; i12 < ThemeEditorView.this.f26552c.size(); i12++) {
                    ((org.telegram.ui.ActionBar.i6) ThemeEditorView.this.f26552c.get(i12)).d(r01Var.b(), false, true);
                }
                editorAlert.G = false;
            }
            i10 = iB & (-16711681);
            i11 = (iIntValue & 255) << 16;
        }
        iB = i10 | i11;
        r01Var.c(iB);
        while (i12 < ThemeEditorView.this.f26552c.size()) {
            ((org.telegram.ui.ActionBar.i6) ThemeEditorView.this.f26552c.get(i12)).d(r01Var.b(), false, true);
        }
        editorAlert.G = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
