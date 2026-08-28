package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class qw0 implements TextWatcher {
    public final int f32037a = 0;
    public final EditTextBoldCursor f32038b;
    public final Serializable f32039c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f32040e;

    public qw0(cx0 cx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f32040e = cx0Var;
        this.f32039c = iArr;
        this.d = textView;
        this.f32038b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f32037a) {
            case 0:
                return;
            default:
                org.telegram.ui.wm0 wm0Var = (org.telegram.ui.wm0) this.f32040e;
                String str = (String) this.f32039c;
                if (((HashMap) this.d) == wm0Var.f44183p1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f32038b;
                org.telegram.ui.wm0.I0(wm0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = wm0Var.U[intValue];
                if (intValue == 6) {
                    wm0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f32037a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.f32037a) {
            case 0:
                if (((int[]) this.f32039c)[0] == 2) {
                    ((cx0) this.f32040e).l0((TextView) this.d, this.f32038b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public qw0(org.telegram.ui.wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f32040e = wm0Var;
        this.f32038b = editTextBoldCursor;
        this.f32039c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
