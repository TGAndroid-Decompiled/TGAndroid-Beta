package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lm0 implements TextWatcher {
    public final int f38433a;
    public final Object f38434b;
    public String f38435c;
    public final Object d;

    public lm0(pn0 pn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f38433a = i10;
        this.d = pn0Var;
        this.f38434b = editTextBoldCursor;
        this.f38435c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f38433a) {
            case 0:
            case 1:
                return;
            default:
                this.f38435c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38433a;
    }

    public lm0(qg.w wVar) {
        this.f38433a = 2;
        this.d = wVar;
        this.f38434b = Pattern.compile("^[0-9a-fA-F]*$");
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
