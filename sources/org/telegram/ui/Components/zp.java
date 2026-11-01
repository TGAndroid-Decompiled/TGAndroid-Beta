package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
public final class zp implements TextWatcher {
    public final int f33200a = 1;
    public final int f33201b;
    public final View f33202c;

    public zp(cq cqVar, int i10) {
        this.f33202c = cqVar;
        this.f33201b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11 = this.f33200a;
        int i12 = this.f33201b;
        View view = this.f33202c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                cq cqVar = (cq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = cqVar.E;
                if (!cqVar.f25221r) {
                    cqVar.f25221r = true;
                    int i13 = 0;
                    while (i13 < editable.length()) {
                        char charAt = editable.charAt(i13);
                        if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                            editable.replace(i13, i13 + 1, "");
                            i13--;
                        }
                        i13++;
                    }
                    if (editable.length() == 0) {
                        cqVar.f25221r = false;
                        return;
                    }
                    try {
                        i10 = Integer.parseInt(editTextBoldCursorArr[i12].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    cqVar.setColorInner(i10);
                    int color = cqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i12].setSelection(editable.length());
                    }
                    cqVar.f25223w[cqVar.S].a(color);
                    cqVar.f25211a.c(color, cqVar.S, true);
                    cqVar.f25221r = false;
                    return;
                }
                return;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int codePointCount = i12 - Character.codePointCount(editable, 0, editable.length());
                if (codePointCount < 30) {
                    if (numberTextView.getVisibility() == 0) {
                        z10 = true;
                    }
                    numberTextView.a(codePointCount, z10);
                    org.telegram.messenger.i0.W3(numberTextView, true);
                    return;
                }
                org.telegram.messenger.i0.W3(numberTextView, false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33200a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33200a;
    }

    public zp(int i10, NumberTextView numberTextView) {
        this.f33201b = i10;
        this.f33202c = numberTextView;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
