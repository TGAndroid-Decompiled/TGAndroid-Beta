package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class mb0 implements TextWatcher {
    public final int f35250a;
    public final sb0 f35251b;

    public mb0(sb0 sb0Var, int i10) {
        this.f35250a = i10;
        this.f35251b = sb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35250a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f35251b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                sb0 sb0Var = this.f35251b;
                if (!sb0Var.O) {
                    if (editable.toString().equals("0")) {
                        sb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            sb0Var.X();
                            return;
                        } else {
                            sb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        sb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35250a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35250a;
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
