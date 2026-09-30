package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class vx0 implements TextWatcher {
    public final int f29758a = 0;
    public final EditTextBoldCursor f29759b;
    public final Serializable f29760c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public vx0(hy0 hy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = hy0Var;
        this.f29760c = iArr;
        this.d = textView;
        this.f29759b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f29758a) {
            case 0:
                return;
            default:
                org.telegram.ui.gn0 gn0Var = (org.telegram.ui.gn0) this.e;
                String str = (String) this.f29760c;
                if (((HashMap) this.d) == gn0Var.f34016t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f29759b;
                org.telegram.ui.gn0.J0(gn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = gn0Var.Y[intValue];
                if (intValue == 6) {
                    gn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f29758a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f29758a) {
            case 0:
                if (((int[]) this.f29760c)[0] == 2) {
                    ((hy0) this.e).m0((TextView) this.d, this.f29759b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public vx0(org.telegram.ui.gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = gn0Var;
        this.f29759b = editTextBoldCursor;
        this.f29760c = str;
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
