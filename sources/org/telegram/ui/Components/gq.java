package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
public final class gq implements TextWatcher {
    public final int f35513a = 1;
    public final int f35514b;
    public final View f35515c;

    public gq(jq jqVar, int i7) {
        this.f35515c = jqVar;
        this.f35514b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10 = this.f35513a;
        int i11 = this.f35514b;
        View view = this.f35515c;
        boolean z10 = false;
        switch (i10) {
            case 0:
                jq jqVar = (jq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = jqVar.F;
                if (!jqVar.f36491r) {
                    jqVar.f36491r = true;
                    int i12 = 0;
                    while (i12 < editable.length()) {
                        char charAt = editable.charAt(i12);
                        if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                            editable.replace(i12, i12 + 1, "");
                            i12--;
                        }
                        i12++;
                    }
                    if (editable.length() == 0) {
                        jqVar.f36491r = false;
                        return;
                    }
                    try {
                        i7 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i7 = -1;
                    }
                    jqVar.setColorInner(i7);
                    int color = jqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i11].setSelection(editable.length());
                    }
                    jqVar.f36493w[jqVar.T].a(color);
                    jqVar.f36479a.c(color, jqVar.T, true);
                    jqVar.f36491r = false;
                    return;
                }
                return;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int codePointCount = i11 - Character.codePointCount(editable, 0, editable.length());
                if (codePointCount < 30) {
                    if (numberTextView.getVisibility() == 0) {
                        z10 = true;
                    }
                    numberTextView.a(codePointCount, z10);
                    org.telegram.messenger.g0.V3(numberTextView, true);
                    return;
                }
                org.telegram.messenger.g0.V3(numberTextView, false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35513a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35513a;
    }

    public gq(int i7, NumberTextView numberTextView) {
        this.f35514b = i7;
        this.f35515c = numberTextView;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
