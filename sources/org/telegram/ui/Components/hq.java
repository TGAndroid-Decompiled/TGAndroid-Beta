package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
public final class hq implements TextWatcher {
    public final int f35948a = 1;
    public final int f35949b;
    public final View f35950c;

    public hq(kq kqVar, int i7) {
        this.f35950c = kqVar;
        this.f35949b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10 = this.f35948a;
        int i11 = this.f35949b;
        View view = this.f35950c;
        boolean z10 = false;
        switch (i10) {
            case 0:
                kq kqVar = (kq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = kqVar.F;
                if (!kqVar.f36857r) {
                    kqVar.f36857r = true;
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
                        kqVar.f36857r = false;
                        return;
                    }
                    try {
                        i7 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i7 = -1;
                    }
                    kqVar.setColorInner(i7);
                    int color = kqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i11].setSelection(editable.length());
                    }
                    kqVar.f36859w[kqVar.T].a(color);
                    kqVar.f36845a.c(color, kqVar.T, true);
                    kqVar.f36857r = false;
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
        int i12 = this.f35948a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35948a;
    }

    public hq(int i7, NumberTextView numberTextView) {
        this.f35949b = i7;
        this.f35950c = numberTextView;
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
