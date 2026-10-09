package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jm0 implements TextWatcher {
    public final int f38982a;
    public final Object f38983b;
    public String f38984c;
    public final Object d;

    public jm0(nn0 nn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f38982a = i10;
        this.d = nn0Var;
        this.f38983b = editTextBoldCursor;
        this.f38984c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f38982a) {
            case 0:
            case 1:
                return;
            default:
                this.f38984c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38982a;
    }

    public jm0(pg.w wVar) {
        this.f38982a = 2;
        this.d = wVar;
        this.f38983b = Pattern.compile("^[0-9a-fA-F]*$");
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
