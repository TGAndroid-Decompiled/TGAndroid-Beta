package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dq implements TextWatcher {
    public final int f27824a = 1;
    public final int f27825b;
    public final View f27826c;

    public dq(gq gqVar, int i10) {
        this.f27826c = gqVar;
        this.f27825b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11 = this.f27824a;
        int i12 = this.f27825b;
        View view = this.f27826c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                gq gqVar = (gq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = gqVar.A;
                if (!gqVar.f28952r) {
                    gqVar.f28952r = true;
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
                        gqVar.f28952r = false;
                        return;
                    }
                    try {
                        i10 = Integer.parseInt(editTextBoldCursorArr[i12].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    gqVar.setColorInner(i10);
                    int color = gqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i12].setSelection(editable.length());
                    }
                    gqVar.v[gqVar.O].a(color);
                    gqVar.f28946a.s0(color, gqVar.O, true);
                    gqVar.f28952r = false;
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
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
                    return;
                }
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27824a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27824a;
    }

    public dq(int i10, NumberTextView numberTextView) {
        this.f27825b = i10;
        this.f27826c = numberTextView;
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
