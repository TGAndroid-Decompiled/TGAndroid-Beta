package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class pb0 implements TextWatcher {
    public final int f40757a;
    public final vb0 f40758b;

    public pb0(vb0 vb0Var, int i10) {
        this.f40757a = i10;
        this.f40758b = vb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f40757a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f40758b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                vb0 vb0Var = this.f40758b;
                if (!vb0Var.O) {
                    if (editable.toString().equals("0")) {
                        vb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            vb0Var.X();
                            return;
                        } else {
                            vb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        vb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40757a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40757a;
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
