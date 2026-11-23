package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gj0 implements TextWatcher {
    public final int f48128a;
    public final Object f48129b;
    public String f48130c;
    public final Object d;

    public gj0(hk0 hk0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.f48128a = i7;
        this.d = hk0Var;
        this.f48129b = editTextBoldCursor;
        this.f48130c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gj0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f48128a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f48130c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48128a;
    }

    public gj0(sg.p pVar) {
        this.f48128a = 3;
        this.d = pVar;
        this.f48129b = Pattern.compile("^[0-9a-fA-F]*$");
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
