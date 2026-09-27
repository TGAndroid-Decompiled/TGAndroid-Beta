package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fm0 implements TextWatcher {
    public final int f33585a;
    public final Object f33586b;
    public String f33587c;
    public final Object d;

    public fm0(jn0 jn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f33585a = i10;
        this.d = jn0Var;
        this.f33586b = editTextBoldCursor;
        this.f33587c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f33585a) {
            case 0:
            case 1:
                return;
            default:
                this.f33587c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33585a;
    }

    public fm0(pg.w wVar) {
        this.f33585a = 2;
        this.d = wVar;
        this.f33586b = Pattern.compile("^[0-9a-fA-F]*$");
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
