package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jm0 implements TextWatcher {
    public final int f38980a;
    public final Object f38981b;
    public String f38982c;
    public final Object d;

    public jm0(nn0 nn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f38980a = i10;
        this.d = nn0Var;
        this.f38981b = editTextBoldCursor;
        this.f38982c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f38980a) {
            case 0:
            case 1:
                return;
            default:
                this.f38982c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38980a;
    }

    public jm0(pg.w wVar) {
        this.f38980a = 2;
        this.d = wVar;
        this.f38981b = Pattern.compile("^[0-9a-fA-F]*$");
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
