package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lq implements TextWatcher {
    public final int f26117a = 1;
    public final int f26118b;
    public final View f26119c;

    public lq(oq oqVar, int i10) {
        this.f26119c = oqVar;
        this.f26118b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11 = this.f26117a;
        int i12 = this.f26118b;
        View view = this.f26119c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                oq oqVar = (oq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = oqVar.E;
                if (!oqVar.f27190r) {
                    oqVar.f27190r = true;
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
                        oqVar.f27190r = false;
                        return;
                    }
                    try {
                        i10 = Integer.parseInt(editTextBoldCursorArr[i12].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    oqVar.setColorInner(i10);
                    int color = oqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i12].setSelection(editable.length());
                    }
                    oqVar.v[oqVar.S].a(color);
                    oqVar.f27181a.x0(color, oqVar.S, true);
                    oqVar.f27190r = false;
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
        int i13 = this.f26117a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f26117a;
    }

    public lq(int i10, NumberTextView numberTextView) {
        this.f26118b = i10;
        this.f26119c = numberTextView;
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
