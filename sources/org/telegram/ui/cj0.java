package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cj0 implements TextWatcher {
    public final int f44349a;
    public final Object f44350b;
    public String f44351c;
    public final Object d;

    public cj0(dk0 dk0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.f44349a = i7;
        this.d = dk0Var;
        this.f44350b = editTextBoldCursor;
        this.f44351c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cj0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f44349a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f44351c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f44349a;
    }

    public cj0(sg.p pVar) {
        this.f44349a = 3;
        this.d = pVar;
        this.f44350b = Pattern.compile("^[0-9a-fA-F]*$");
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
