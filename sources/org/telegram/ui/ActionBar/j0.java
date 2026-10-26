package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.FrameLayout;
public final class j0 implements TextWatcher {
    public final int f22728a;
    public final FrameLayout f22729b;

    public j0(int i10, FrameLayout frameLayout) {
        this.f22728a = i10;
        this.f22729b = frameLayout;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f22728a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f22728a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f22728a) {
            case 0:
                w0 w0Var = (w0) this.f22729b;
                s0 s0Var = w0Var.H;
                if (s0Var != null) {
                    s0Var.l(w0Var.e);
                }
                w0Var.j();
                if (!w0Var.f23184g0.isEmpty() && !TextUtils.isEmpty(w0Var.e.getText()) && w0Var.f23185h0 >= 0) {
                    w0Var.f23185h0 = -1;
                    w0Var.D();
                    return;
                }
                return;
            default:
                r5 r5Var = (r5) this.f22729b;
                r5Var.d();
                s0 b10 = r5.b(r5Var);
                if (b10 != null) {
                    b10.l(r5Var.f23046s);
                    return;
                }
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
