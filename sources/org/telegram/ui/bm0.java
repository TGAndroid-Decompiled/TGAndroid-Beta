package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bm0 implements TextWatcher {
    public final int f35555a;
    public final Object f35556b;
    public String f35557c;
    public final Object d;

    public bm0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f35555a = i10;
        this.d = fn0Var;
        this.f35556b = editTextBoldCursor;
        this.f35557c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35555a) {
            case 0:
            case 1:
                return;
            default:
                this.f35557c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35555a;
    }

    public bm0(dg.d0 d0Var) {
        this.f35555a = 2;
        this.d = d0Var;
        this.f35556b = Pattern.compile("^[0-9a-fA-F]*$");
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
