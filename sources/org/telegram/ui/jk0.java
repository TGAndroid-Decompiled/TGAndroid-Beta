package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jk0 implements TextWatcher {
    public final int f38538a;
    public final Object f38539b;
    public String f38540c;
    public final Object d;

    public jk0(ll0 ll0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f38538a = i10;
        this.d = ll0Var;
        this.f38539b = editTextBoldCursor;
        this.f38540c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jk0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f38538a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f38540c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38538a;
    }

    public jk0(ig.t tVar) {
        this.f38538a = 3;
        this.d = tVar;
        this.f38539b = Pattern.compile("^[0-9a-fA-F]*$");
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

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
