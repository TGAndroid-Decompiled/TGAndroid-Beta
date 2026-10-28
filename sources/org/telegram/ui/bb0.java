package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class bb0 implements TextWatcher {
    public final int f37967a;
    public final fb0 f37968b;

    public bb0(fb0 fb0Var, int i10) {
        this.f37967a = i10;
        this.f37968b = fb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f37967a) {
            case 0:
                fb0 fb0Var = this.f37968b;
                if (!fb0Var.N) {
                    if (editable.toString().equals("0")) {
                        fb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            fb0Var.Y();
                            return;
                        } else {
                            fb0Var.X(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        fb0Var.Y();
                        return;
                    }
                }
                return;
            default:
                Emoji.replaceEmoji(editable, this.f37968b.K.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37967a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37967a;
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
