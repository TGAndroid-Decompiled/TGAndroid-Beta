package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zp implements TextWatcher {
    public final int f35351a = 1;
    public final int f35352b;
    public final View f35353c;

    public zp(cq cqVar, int i9) {
        this.f35353c = cqVar;
        this.f35352b = i9;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i9;
        int i10 = this.f35351a;
        int i11 = this.f35352b;
        View view = this.f35353c;
        boolean z10 = false;
        switch (i10) {
            case 0:
                cq cqVar = (cq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = cqVar.A;
                if (!cqVar.f27549r) {
                    cqVar.f27549r = true;
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
                        cqVar.f27549r = false;
                        return;
                    }
                    try {
                        i9 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i9 = -1;
                    }
                    cqVar.setColorInner(i9);
                    int color = cqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i11].setSelection(editable.length());
                    }
                    cqVar.v[cqVar.O].a(color);
                    cqVar.f27543a.n0(color, cqVar.O, true);
                    cqVar.f27549r = false;
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
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
                    return;
                }
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f35351a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f35351a;
    }

    public zp(int i9, NumberTextView numberTextView) {
        this.f35352b = i9;
        this.f35353c = numberTextView;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
