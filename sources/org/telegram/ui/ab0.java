package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class ab0 implements TextWatcher {
    public final int f35721a;
    public final gb0 f35722b;

    public ab0(gb0 gb0Var, int i10) {
        this.f35721a = i10;
        this.f35722b = gb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35721a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f35722b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                gb0 gb0Var = this.f35722b;
                if (!gb0Var.O) {
                    if (editable.toString().equals("0")) {
                        gb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            gb0Var.X();
                            return;
                        } else {
                            gb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        gb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35721a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35721a;
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
