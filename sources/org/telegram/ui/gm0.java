package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gm0 implements TextWatcher {
    public final int f39648a;
    public final Object f39649b;
    public String f39650c;
    public final Object d;

    public gm0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f39648a = i10;
        this.d = kn0Var;
        this.f39649b = editTextBoldCursor;
        this.f39650c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f39648a) {
            case 0:
            case 1:
                return;
            default:
                this.f39650c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39648a;
    }

    public gm0(rg.x xVar) {
        this.f39648a = 2;
        this.d = xVar;
        this.f39649b = Pattern.compile("^[0-9a-fA-F]*$");
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
