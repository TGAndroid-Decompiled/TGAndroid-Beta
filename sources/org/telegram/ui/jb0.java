package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class jb0 implements TextWatcher {
    public final int f35159a;
    public final pb0 f35160b;

    public jb0(pb0 pb0Var, int i10) {
        this.f35159a = i10;
        this.f35160b = pb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35159a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f35160b.H.getPaint().getFontMetricsInt(), false);
                return;
            default:
                pb0 pb0Var = this.f35160b;
                if (!pb0Var.L) {
                    if (editable.toString().equals("0")) {
                        pb0Var.C.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            pb0Var.X();
                            return;
                        } else {
                            pb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        pb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35159a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35159a;
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
