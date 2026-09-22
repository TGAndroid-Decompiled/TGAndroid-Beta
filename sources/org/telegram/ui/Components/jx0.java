package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class jx0 implements TextWatcher {
    public final int f25444a = 0;
    public final EditTextBoldCursor f25445b;
    public final Serializable f25446c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public jx0(vx0 vx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = vx0Var;
        this.f25446c = iArr;
        this.d = textView;
        this.f25445b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25444a) {
            case 0:
                return;
            default:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.e;
                String str = (String) this.f25446c;
                if (((HashMap) this.d) == on0Var.f36300t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25445b;
                org.telegram.ui.on0.J0(on0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = on0Var.Y[intValue];
                if (intValue == 6) {
                    on0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25444a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25444a) {
            case 0:
                if (((int[]) this.f25446c)[0] == 2) {
                    ((vx0) this.e).m0((TextView) this.d, this.f25445b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public jx0(org.telegram.ui.on0 on0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = on0Var;
        this.f25445b = editTextBoldCursor;
        this.f25446c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
