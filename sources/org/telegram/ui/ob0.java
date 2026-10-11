package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class ob0 implements TextWatcher {
    public final int f40501a;
    public final ub0 f40502b;

    public ob0(ub0 ub0Var, int i10) {
        this.f40501a = i10;
        this.f40502b = ub0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f40501a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f40502b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                ub0 ub0Var = this.f40502b;
                if (!ub0Var.O) {
                    if (editable.toString().equals("0")) {
                        ub0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            ub0Var.X();
                            return;
                        } else {
                            ub0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        ub0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40501a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40501a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
