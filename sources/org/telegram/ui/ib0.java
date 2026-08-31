package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class ib0 implements TextWatcher {
    public final int f37790a;
    public final ob0 f37791b;

    public ib0(ob0 ob0Var, int i10) {
        this.f37790a = i10;
        this.f37791b = ob0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f37790a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f37791b.H.getPaint().getFontMetricsInt(), false);
                return;
            default:
                ob0 ob0Var = this.f37791b;
                if (!ob0Var.L) {
                    if (editable.toString().equals("0")) {
                        ob0Var.C.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            ob0Var.X();
                            return;
                        } else {
                            ob0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        ob0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37790a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37790a;
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
