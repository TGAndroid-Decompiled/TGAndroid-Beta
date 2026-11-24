package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
public final class o implements TextWatcher {
    public final int a;
    public final p b;

    public o(p pVar, int i) {
        this.b = pVar;
        this.a = i;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        int i2 = this.a;
        p pVar = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = pVar.F;
        if (pVar.r) {
            return;
        }
        pVar.r = true;
        int i3 = 0;
        while (i3 < editable.length()) {
            char charAt = editable.charAt(i3);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                editable.replace(i3, i3 + 1, "");
                i3--;
            }
            i3++;
        }
        if (editable.length() == 0) {
            pVar.r = false;
            return;
        }
        try {
            i = Integer.parseInt(editTextBoldCursorArr[i2].getText().toString(), 16) | (-16777216);
        } catch (Exception unused) {
            i = -1;
        }
        pVar.setColorInner(i);
        int color = pVar.getColor();
        if (editable.length() == 6) {
            editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
            editTextBoldCursorArr[i2].setSelection(editable.length());
        }
        pVar.w[pVar.T].a(color);
        pVar.a.c(color, pVar.T, true);
        pVar.r = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
