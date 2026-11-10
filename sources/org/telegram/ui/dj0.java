package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dj0 implements TextWatcher {
    public final int f45000a;
    public final Object f45001b;
    public String f45002c;
    public final Object d;

    public dj0(ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.f45000a = i7;
        this.d = ek0Var;
        this.f45001b = editTextBoldCursor;
        this.f45002c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dj0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f45000a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f45002c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f45000a;
    }

    public dj0(sg.p pVar) {
        this.f45000a = 3;
        this.d = pVar;
        this.f45001b = Pattern.compile("^[0-9a-fA-F]*$");
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
