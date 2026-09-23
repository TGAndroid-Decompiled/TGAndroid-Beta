package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class em0 implements TextWatcher {
    public final int f32974a;
    public final Object f32975b;
    public String f32976c;
    public final Object d;

    public em0(in0 in0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f32974a = i10;
        this.d = in0Var;
        this.f32975b = editTextBoldCursor;
        this.f32976c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.em0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f32974a) {
            case 0:
            case 1:
                return;
            default:
                this.f32976c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32974a;
    }

    public em0(pg.w wVar) {
        this.f32974a = 2;
        this.d = wVar;
        this.f32975b = Pattern.compile("^[0-9a-fA-F]*$");
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
