package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class hy0 implements TextWatcher {
    public final int f25777a = 0;
    public final EditTextBoldCursor f25778b;
    public final Serializable f25779c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public hy0(ty0 ty0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = ty0Var;
        this.f25779c = iArr;
        this.d = textView;
        this.f25778b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25777a) {
            case 0:
                return;
            default:
                org.telegram.ui.un0 un0Var = (org.telegram.ui.un0) this.e;
                String str = (String) this.f25779c;
                if (((HashMap) this.d) == un0Var.f40763t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25778b;
                org.telegram.ui.un0.I0(un0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = un0Var.Y[intValue];
                if (intValue == 6) {
                    un0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25777a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25777a) {
            case 0:
                if (((int[]) this.f25779c)[0] == 2) {
                    ((ty0) this.e).n0((TextView) this.d, this.f25778b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public hy0(org.telegram.ui.un0 un0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = un0Var;
        this.f25778b = editTextBoldCursor;
        this.f25779c = str;
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
