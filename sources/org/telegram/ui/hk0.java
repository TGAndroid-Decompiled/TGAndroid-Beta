package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hk0 implements TextWatcher {
    public final int f37826a;
    public final Object f37827b;
    public String f37828c;
    public final Object d;

    public hk0(jl0 jl0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f37826a = i10;
        this.d = jl0Var;
        this.f37827b = editTextBoldCursor;
        this.f37828c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hk0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f37826a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.f37828c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37826a;
    }

    public hk0(ig.t tVar) {
        this.f37826a = 3;
        this.d = tVar;
        this.f37827b = Pattern.compile("^[0-9a-fA-F]*$");
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
