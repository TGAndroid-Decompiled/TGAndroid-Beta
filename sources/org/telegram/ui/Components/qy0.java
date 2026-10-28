package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class qy0 implements TextWatcher {
    public final int f32064a = 0;
    public final EditTextBoldCursor f32065b;
    public final Serializable f32066c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public qy0(dz0 dz0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = dz0Var;
        this.f32066c = iArr;
        this.d = textView;
        this.f32065b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f32064a) {
            case 0:
                return;
            default:
                org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) this.e;
                String str = (String) this.f32066c;
                if (((HashMap) this.d) == kn0Var.f40879t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f32065b;
                org.telegram.ui.kn0.J0(kn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[intValue];
                if (intValue == 6) {
                    kn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32064a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f32064a) {
            case 0:
                if (((int[]) this.f32066c)[0] == 2) {
                    ((dz0) this.e).o0((TextView) this.d, this.f32065b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public qy0(org.telegram.ui.kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = kn0Var;
        this.f32065b = editTextBoldCursor;
        this.f32066c = str;
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
