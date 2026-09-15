package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class km0 implements TextWatcher {
    public final int f35193a;
    public final Object f35194b;
    public String f35195c;
    public final Object d;

    public km0(on0 on0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f35193a = i10;
        this.d = on0Var;
        this.f35194b = editTextBoldCursor;
        this.f35195c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35193a) {
            case 0:
            case 1:
                return;
            default:
                this.f35195c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35193a;
    }

    public km0(pg.w wVar) {
        this.f35193a = 2;
        this.d = wVar;
        this.f35194b = Pattern.compile("^[0-9a-fA-F]*$");
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
