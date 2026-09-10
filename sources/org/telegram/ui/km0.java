package org.telegram.ui;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class km0 implements TextWatcher {
    public final int f34414a;
    public final Object f34415b;
    public String f34416c;
    public final Object d;

    public km0(on0 on0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f34414a = i10;
        this.d = on0Var;
        this.f34415b = editTextBoldCursor;
        this.f34416c = str;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f34414a) {
            case 0:
            case 1:
                return;
            default:
                this.f34416c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34414a;
    }

    public km0(og.z zVar) {
        this.f34414a = 2;
        this.d = zVar;
        this.f34415b = Pattern.compile("^[0-9a-fA-F]*$");
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
