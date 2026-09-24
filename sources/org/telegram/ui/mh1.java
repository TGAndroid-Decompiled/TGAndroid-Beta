package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mh1 implements TextWatcher {
    public final UsersSelectActivity f35550a;

    public mh1(UsersSelectActivity usersSelectActivity) {
        this.f35550a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f35550a;
        if (usersSelectActivity.f31882c.length() != 0) {
            ph1 ph1Var = usersSelectActivity.h;
            boolean z10 = ph1Var.f36540n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    ph1Var.f36540n = true;
                    ph1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f31883f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f31883f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f31882c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        ph1 ph1Var2 = usersSelectActivity.h;
        if (ph1Var2.f36540n) {
            ph1Var2.f36540n = false;
            ph1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f31883f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
