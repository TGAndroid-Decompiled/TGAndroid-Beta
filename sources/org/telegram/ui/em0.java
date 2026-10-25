package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class em0 implements TextWatcher {
    public final int f39135a;
    public final Object f39136b;
    public String f39137c;
    public final Object d;

    public em0(in0 in0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f39135a = i10;
        this.d = in0Var;
        this.f39136b = editTextBoldCursor;
        this.f39137c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.em0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f39135a) {
            case 0:
            case 1:
                return;
            default:
                this.f39137c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39135a;
    }

    public em0(rg.x xVar) {
        this.f39135a = 2;
        this.d = xVar;
        this.f39136b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
