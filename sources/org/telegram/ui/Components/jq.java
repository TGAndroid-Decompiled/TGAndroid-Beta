package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
public final class jq implements TextWatcher {
    public final int f36537a = 1;
    public final int f36538b;
    public final View f36539c;

    public jq(mq mqVar, int i7) {
        this.f36539c = mqVar;
        this.f36538b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10 = this.f36537a;
        int i11 = this.f36538b;
        View view = this.f36539c;
        boolean z10 = false;
        switch (i10) {
            case 0:
                mq mqVar = (mq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = mqVar.F;
                if (!mqVar.f37567r) {
                    mqVar.f37567r = true;
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
                        mqVar.f37567r = false;
                        return;
                    }
                    try {
                        i7 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                    } catch (Exception unused) {
                        i7 = -1;
                    }
                    mqVar.setColorInner(i7);
                    int color = mqVar.getColor();
                    if (editable.length() == 6) {
                        editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                        editTextBoldCursorArr[i11].setSelection(editable.length());
                    }
                    mqVar.f37569w[mqVar.T].a(color);
                    mqVar.f37555a.c(color, mqVar.T, true);
                    mqVar.f37567r = false;
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
        int i12 = this.f36537a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f36537a;
    }

    public jq(int i7, NumberTextView numberTextView) {
        this.f36538b = i7;
        this.f36539c = numberTextView;
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
