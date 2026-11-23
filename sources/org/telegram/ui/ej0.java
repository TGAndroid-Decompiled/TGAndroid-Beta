package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ej0 implements TextWatcher {
    public final int f47563a;
    public final Object f47564b;
    public String f47565c;
    public final Object d;

    public ej0(fk0 fk0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.f47563a = i7;
        this.d = fk0Var;
        this.f47564b = editTextBoldCursor;
        this.f47565c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ej0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f47563a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f47565c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f47563a;
    }

    public ej0(sg.p pVar) {
        this.f47563a = 3;
        this.d = pVar;
        this.f47564b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
