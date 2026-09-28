package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class vx0 implements TextWatcher {
    public final int f29761a = 0;
    public final EditTextBoldCursor f29762b;
    public final Serializable f29763c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public vx0(hy0 hy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = hy0Var;
        this.f29763c = iArr;
        this.d = textView;
        this.f29762b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f29761a) {
            case 0:
                return;
            default:
                org.telegram.ui.gn0 gn0Var = (org.telegram.ui.gn0) this.e;
                String str = (String) this.f29763c;
                if (((HashMap) this.d) == gn0Var.f34013t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f29762b;
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
        int i13 = this.f29761a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f29761a) {
            case 0:
                if (((int[]) this.f29763c)[0] == 2) {
                    ((hy0) this.e).m0((TextView) this.d, this.f29762b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public vx0(org.telegram.ui.gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = gn0Var;
        this.f29762b = editTextBoldCursor;
        this.f29763c = str;
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
