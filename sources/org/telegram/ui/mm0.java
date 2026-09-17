package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mm0 implements TextWatcher {
    public final int f35841a;
    public final Object f35842b;
    public String f35843c;
    public final Object d;

    public mm0(qn0 qn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f35841a = i10;
        this.d = qn0Var;
        this.f35842b = editTextBoldCursor;
        this.f35843c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35841a) {
            case 0:
            case 1:
                return;
            default:
                this.f35843c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35841a;
    }

    public mm0(pg.w wVar) {
        this.f35841a = 2;
        this.d = wVar;
        this.f35842b = Pattern.compile("^[0-9a-fA-F]*$");
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
