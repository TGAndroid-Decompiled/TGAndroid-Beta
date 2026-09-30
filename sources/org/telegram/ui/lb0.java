package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class lb0 implements TextWatcher {
    public final int f35273a;
    public final rb0 f35274b;

    public lb0(rb0 rb0Var, int i10) {
        this.f35273a = i10;
        this.f35274b = rb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35273a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f35274b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                rb0 rb0Var = this.f35274b;
                if (!rb0Var.O) {
                    if (editable.toString().equals("0")) {
                        rb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            rb0Var.X();
                            return;
                        } else {
                            rb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        rb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35273a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35273a;
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
