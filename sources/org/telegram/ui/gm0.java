package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gm0 implements TextWatcher {
    public final int f36672a;
    public final Object f36673b;
    public String f36674c;
    public final Object d;

    public gm0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f36672a = i10;
        this.d = kn0Var;
        this.f36673b = editTextBoldCursor;
        this.f36674c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36672a) {
            case 0:
            case 1:
                return;
            default:
                this.f36674c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36672a;
    }

    public gm0(pg.w wVar) {
        this.f36672a = 2;
        this.d = wVar;
        this.f36673b = Pattern.compile("^[0-9a-fA-F]*$");
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
