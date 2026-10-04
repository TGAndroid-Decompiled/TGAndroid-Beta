package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gm0 implements TextWatcher {
    public final int f36673a;
    public final Object f36674b;
    public String f36675c;
    public final Object d;

    public gm0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f36673a = i10;
        this.d = kn0Var;
        this.f36674b = editTextBoldCursor;
        this.f36675c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36673a) {
            case 0:
            case 1:
                return;
            default:
                this.f36675c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36673a;
    }

    public gm0(pg.w wVar) {
        this.f36673a = 2;
        this.d = wVar;
        this.f36674b = Pattern.compile("^[0-9a-fA-F]*$");
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
