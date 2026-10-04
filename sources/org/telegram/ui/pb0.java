package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class pb0 implements TextWatcher {
    public final int f39437a;
    public final vb0 f39438b;

    public pb0(vb0 vb0Var, int i10) {
        this.f39437a = i10;
        this.f39438b = vb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f39437a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f39438b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                vb0 vb0Var = this.f39438b;
                if (!vb0Var.O) {
                    if (editable.toString().equals("0")) {
                        vb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            vb0Var.W();
                            return;
                        } else {
                            vb0Var.U(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        vb0Var.W();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39437a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39437a;
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
