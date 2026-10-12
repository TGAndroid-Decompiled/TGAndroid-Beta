package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m80 implements TextWatcher {
    public final n80 f38187a;

    public m80(n80 n80Var) {
        this.f38187a = n80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        p80 p80Var = this.f38187a.f38570f;
        if (p80Var.d.d.length() != 0) {
            p80Var.E = true;
            p80Var.f39151y = true;
            l80 l80Var = p80Var.f39148s;
            if (!l80Var.h) {
                l80Var.h = true;
                l80Var.l();
            }
            p80Var.f39148s.E(p80Var.d.d.toString());
            p80Var.h.setFastScrollVisible(false);
            p80Var.h.setVerticalScrollBarEnabled(true);
            p80Var.f39147r.e(true, true);
            p80Var.f39147r.setStickerType(1);
            p80Var.f39147r.d.setText(LocaleController.getString(R.string.NoResult));
            p80Var.f39147r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        p80Var.E = false;
        p80Var.f39151y = false;
        l80 l80Var2 = p80Var.f39148s;
        if (l80Var2.h) {
            l80Var2.h = false;
            l80Var2.l();
        }
        p80Var.f39148s.E(null);
        p80Var.h.setFastScrollVisible(true);
        p80Var.h.setVerticalScrollBarEnabled(false);
        p80Var.f39147r.e(false, true);
        p80Var.f39147r.setStickerType(0);
        p80Var.f39147r.d.setText(LocaleController.getString(R.string.NoContacts));
        p80Var.f39147r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
