package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 implements TextWatcher {
    public final int f32747a;
    public final Object f32748b;
    public String f32749c;
    public final Object d;

    public cm0(gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f32747a = i10;
        this.d = gn0Var;
        this.f32748b = editTextBoldCursor;
        this.f32749c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f32747a) {
            case 0:
            case 1:
                return;
            default:
                this.f32749c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32747a;
    }

    public cm0(pg.w wVar) {
        this.f32747a = 2;
        this.d = wVar;
        this.f32748b = Pattern.compile("^[0-9a-fA-F]*$");
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
