package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vq implements TextWatcher {
    public final int f34240a = 1;
    public final int f34241b;
    public final View f34242c;

    public vq(yq yqVar, int i10) {
        this.f34242c = yqVar;
        this.f34241b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11 = this.f34240a;
        int i12 = this.f34241b;
        View view = this.f34242c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                yq yqVar = (yq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = yqVar.E;
                if (!yqVar.f35121r) {
                    yqVar.f35121r = true;
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
                        yqVar.f35121r = false;
                        return;
                    }
                    try {
                        i10 = Integer.parseInt(editTextBoldCursorArr[i12].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    yqVar.setColorInner(i10);
                    int color = yqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i12].setSelection(editable.length());
                    }
                    yqVar.v[yqVar.S].a(color);
                    yqVar.f35111a.x0(color, yqVar.S, true);
                    yqVar.f35121r = false;
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
        int i13 = this.f34240a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34240a;
    }

    public vq(int i10, NumberTextView numberTextView) {
        this.f34241b = i10;
        this.f34242c = numberTextView;
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
