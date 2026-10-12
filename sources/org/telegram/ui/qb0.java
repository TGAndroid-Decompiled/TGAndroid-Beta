package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class qb0 implements TextWatcher {
    public final int f41258a;
    public final wb0 f41259b;

    public qb0(wb0 wb0Var, int i10) {
        this.f41258a = i10;
        this.f41259b = wb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f41258a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f41259b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                wb0 wb0Var = this.f41259b;
                if (!wb0Var.O) {
                    if (editable.toString().equals("0")) {
                        wb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            wb0Var.X();
                            return;
                        } else {
                            wb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        wb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41258a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41258a;
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
