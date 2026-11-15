package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dj0 implements TextWatcher {
    public final int f46412a;
    public final Object f46413b;
    public String f46414c;
    public final Object d;

    public dj0(ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.f46412a = i7;
        this.d = ek0Var;
        this.f46413b = editTextBoldCursor;
        this.f46414c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dj0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f46412a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f46414c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46412a;
    }

    public dj0(sg.p pVar) {
        this.f46412a = 3;
        this.d = pVar;
        this.f46413b = Pattern.compile("^[0-9a-fA-F]*$");
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
