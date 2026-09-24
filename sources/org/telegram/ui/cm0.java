package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 implements TextWatcher {
    public final int f32730a;
    public final Object f32731b;
    public String f32732c;
    public final Object d;

    public cm0(gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f32730a = i10;
        this.d = gn0Var;
        this.f32731b = editTextBoldCursor;
        this.f32732c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f32730a) {
            case 0:
            case 1:
                return;
            default:
                this.f32732c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32730a;
    }

    public cm0(pg.w wVar) {
        this.f32730a = 2;
        this.d = wVar;
        this.f32731b = Pattern.compile("^[0-9a-fA-F]*$");
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
