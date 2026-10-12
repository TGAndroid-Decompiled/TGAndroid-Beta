package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pm0 implements TextWatcher {
    public final int f39263a;
    public final Object f39264b;
    public String f39265c;
    public final Object d;

    public pm0(un0 un0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f39263a = i10;
        this.d = un0Var;
        this.f39264b = editTextBoldCursor;
        this.f39265c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f39263a) {
            case 0:
            case 1:
                return;
            default:
                this.f39265c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39263a;
    }

    public pm0(qg.w wVar) {
        this.f39263a = 2;
        this.d = wVar;
        this.f39264b = Pattern.compile("^[0-9a-fA-F]*$");
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
