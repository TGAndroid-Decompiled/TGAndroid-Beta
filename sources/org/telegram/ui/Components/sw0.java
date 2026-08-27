package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;

public final class sw0 implements TextWatcher {

    public final int f32591a = 0;

    public final EditTextBoldCursor f32592b;

    public final Serializable f32593c;
    public final Object d;

    public final NotificationCenter.NotificationCenterDelegate f32594e;

    public sw0(ex0 ex0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f32594e = ex0Var;
        this.f32593c = iArr;
        this.d = textView;
        this.f32592b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f32591a) {
            case 0:
                break;
            default:
                org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) this.f32594e;
                String str = (String) this.f32593c;
                boolean z10 = ((HashMap) this.d) == xm0Var.f44514p1;
                EditTextBoldCursor editTextBoldCursor = this.f32592b;
                org.telegram.ui.xm0.J0(xm0Var, editTextBoldCursor, str, editable, z10);
                int iIntValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = xm0Var.U[iIntValue];
                if (iIntValue == 6) {
                    xm0Var.Y0(true);
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32591a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f32591a) {
            case 0:
                if (((int[]) this.f32593c)[0] == 2) {
                    ((ex0) this.f32594e).m0((TextView) this.d, this.f32592b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public sw0(org.telegram.ui.xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap map) {
        this.f32594e = xm0Var;
        this.f32592b = editTextBoldCursor;
        this.f32593c = str;
        this.d = map;
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
