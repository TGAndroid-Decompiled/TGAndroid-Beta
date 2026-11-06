package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aj0 implements TextWatcher {
    public final int f43688a;
    public final Object f43689b;
    public String f43690c;
    public final Object d;

    public aj0(bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.f43688a = i7;
        this.d = bk0Var;
        this.f43689b = editTextBoldCursor;
        this.f43690c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f43688a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f43690c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f43688a;
    }

    public aj0(sg.p pVar) {
        this.f43688a = 3;
        this.d = pVar;
        this.f43689b = Pattern.compile("^[0-9a-fA-F]*$");
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
