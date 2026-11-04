package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
public final class sp implements TextWatcher {
    public final int f38102a = 1;
    public final int f38103b;
    public final View f38104c;

    public sp(vp vpVar, int i3) {
        this.f38104c = vpVar;
        this.f38103b = i3;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3;
        int i10 = this.f38102a;
        int i11 = this.f38103b;
        View view = this.f38104c;
        boolean z10 = false;
        switch (i10) {
            case 0:
                vp vpVar = (vp) view;
                EditTextBoldCursor[] editTextBoldCursorArr = vpVar.F;
                if (!vpVar.f39761r) {
                    vpVar.f39761r = true;
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
                        vpVar.f39761r = false;
                        return;
                    }
                    try {
                        i3 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i3 = -1;
                    }
                    vpVar.setColorInner(i3);
                    int color = vpVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i11].setSelection(editable.length());
                    }
                    vpVar.f39763w[vpVar.T].a(color);
                    vpVar.f39749a.c(color, vpVar.T, true);
                    vpVar.f39761r = false;
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
                    org.telegram.messenger.g0.X3(numberTextView, true);
                    return;
                }
                org.telegram.messenger.g0.X3(numberTextView, false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f38102a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f38102a;
    }

    public sp(int i3, NumberTextView numberTextView) {
        this.f38103b = i3;
        this.f38104c = numberTextView;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
