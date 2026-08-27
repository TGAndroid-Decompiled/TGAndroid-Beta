package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class xp implements TextWatcher {

    public final int f34664a = 1;

    public final int f34665b;

    public final View f34666c;

    public xp(aq aqVar, int i10) {
        this.f34666c = aqVar;
        this.f34665b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11 = this.f34664a;
        int i12 = this.f34665b;
        View view = this.f34666c;
        switch (i11) {
            case 0:
                aq aqVar = (aq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = aqVar.A;
                if (!aqVar.f26801r) {
                    aqVar.f26801r = true;
                    int i13 = 0;
                    while (i13 < editable.length()) {
                        char cCharAt = editable.charAt(i13);
                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F'))) {
                            editable.replace(i13, i13 + 1, "");
                            i13--;
                        }
                        i13++;
                    }
                    if (editable.length() != 0) {
                        try {
                            i10 = Integer.parseInt(editTextBoldCursorArr[i12].getText().toString(), 16) | (-16777216);
                        } catch (Exception unused) {
                            i10 = -1;
                        }
                        aqVar.setColorInner(i10);
                        int color = aqVar.getColor();
                        if (editable.length() == 6) {
                            editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                            editTextBoldCursorArr[i12].setSelection(editable.length());
                        }
                        aqVar.v[aqVar.O].a(color);
                        aqVar.f26795a.n0(color, aqVar.O, true);
                        aqVar.f26801r = false;
                    } else {
                        aqVar.f26801r = false;
                    }
                    break;
                }
                break;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int iCodePointCount = i12 - Character.codePointCount(editable, 0, editable.length());
                if (iCodePointCount >= 30) {
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
                } else {
                    numberTextView.a(iCodePointCount, numberTextView.getVisibility() == 0);
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34664a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34664a;
    }

    public xp(int i10, NumberTextView numberTextView) {
        this.f34665b = i10;
        this.f34666c = numberTextView;
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
