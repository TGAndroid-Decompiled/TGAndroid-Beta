package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class og1 implements TextWatcher {
    public final UsersSelectActivity f41122a;

    public og1(UsersSelectActivity usersSelectActivity) {
        this.f41122a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f41122a;
        if (usersSelectActivity.f36352c.length() != 0) {
            rg1 rg1Var = usersSelectActivity.h;
            boolean z10 = rg1Var.f42101n;
            if (!z10) {
                usersSelectActivity.I = true;
                usersSelectActivity.H = true;
                if (!z10) {
                    rg1Var.f42101n = true;
                    rg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f36354f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f36354f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f36352c.getText().toString());
            return;
        }
        usersSelectActivity.I = false;
        usersSelectActivity.H = false;
        rg1 rg1Var2 = usersSelectActivity.h;
        if (rg1Var2.f42101n) {
            rg1Var2.f42101n = false;
            rg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f36354f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
