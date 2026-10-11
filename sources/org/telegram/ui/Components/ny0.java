package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ny0 implements TextWatcher {
    public final int f29175a = 0;
    public final EditTextBoldCursor f29176b;
    public final Serializable f29177c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f29178e;

    public ny0(zy0 zy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f29178e = zy0Var;
        this.f29177c = iArr;
        this.d = textView;
        this.f29176b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f29175a) {
            case 0:
                return;
            default:
                org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) this.f29178e;
                String str = (String) this.f29177c;
                if (((HashMap) this.d) == mn0Var.f40027t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f29176b;
                org.telegram.ui.mn0.I0(mn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = mn0Var.Y[intValue];
                if (intValue == 6) {
                    mn0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f29175a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f29175a) {
            case 0:
                if (((int[]) this.f29177c)[0] == 2) {
                    ((zy0) this.f29178e).n0((TextView) this.d, this.f29176b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ny0(org.telegram.ui.mn0 mn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f29178e = mn0Var;
        this.f29176b = editTextBoldCursor;
        this.f29177c = str;
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
