package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class hb0 implements TextWatcher {
    public final int f34807a;
    public final nb0 f34808b;

    public hb0(nb0 nb0Var, int i10) {
        this.f34807a = i10;
        this.f34808b = nb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f34807a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f34808b.H.getPaint().getFontMetricsInt(), false);
                return;
            default:
                nb0 nb0Var = this.f34808b;
                if (!nb0Var.L) {
                    if (editable.toString().equals("0")) {
                        nb0Var.C.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            nb0Var.X();
                            return;
                        } else {
                            nb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        nb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34807a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34807a;
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
