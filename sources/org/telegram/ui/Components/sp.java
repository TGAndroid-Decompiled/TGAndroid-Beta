package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
public final class sp implements TextWatcher {
    public final int f38135a = 1;
    public final int f38136b;
    public final View f38137c;

    public sp(vp vpVar, int i7) {
        this.f38137c = vpVar;
        this.f38136b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10 = this.f38135a;
        int i11 = this.f38136b;
        View view = this.f38137c;
        boolean z9 = false;
        switch (i10) {
            case 0:
                vp vpVar = (vp) view;
                EditTextBoldCursor[] editTextBoldCursorArr = vpVar.E;
                if (!vpVar.f39783r) {
                    vpVar.f39783r = true;
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
                        vpVar.f39783r = false;
                        return;
                    }
                    try {
                        i7 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i7 = -1;
                    }
                    vpVar.setColorInner(i7);
                    int color = vpVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i11].setSelection(editable.length());
                    }
                    vpVar.f39785w[vpVar.S].a(color);
                    vpVar.f39772a.c(color, vpVar.S, true);
                    vpVar.f39783r = false;
                    return;
                }
                return;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int codePointCount = i11 - Character.codePointCount(editable, 0, editable.length());
                if (codePointCount < 30) {
                    if (numberTextView.getVisibility() == 0) {
                        z9 = true;
                    }
                    numberTextView.a(codePointCount, z9);
                    org.telegram.messenger.g0.X3(numberTextView, true);
                    return;
                }
                org.telegram.messenger.g0.X3(numberTextView, false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38135a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38135a;
    }

    public sp(int i7, NumberTextView numberTextView) {
        this.f38136b = i7;
        this.f38137c = numberTextView;
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
