package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mg1 implements TextWatcher {
    public final UsersSelectActivity f39590a;

    public mg1(UsersSelectActivity usersSelectActivity) {
        this.f39590a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f39590a;
        if (usersSelectActivity.f34261c.length() != 0) {
            pg1 pg1Var = usersSelectActivity.h;
            boolean z10 = pg1Var.f40537n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    pg1Var.f40537n = true;
                    pg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34262f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34262f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34261c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        pg1 pg1Var2 = usersSelectActivity.h;
        if (pg1Var2.f40537n) {
            pg1Var2.f40537n = false;
            pg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34262f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
