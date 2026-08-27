package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class lg1 implements TextWatcher {

    public final UsersSelectActivity f40080a;

    public lg1(UsersSelectActivity usersSelectActivity) {
        this.f40080a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f40080a;
        if (usersSelectActivity.f36290c.length() == 0) {
            usersSelectActivity.I = false;
            usersSelectActivity.H = false;
            og1 og1Var = usersSelectActivity.h;
            if (og1Var.f41095n) {
                og1Var.f41095n = false;
                og1Var.l();
            }
            usersSelectActivity.h.L(null);
            usersSelectActivity.d.setFastScrollVisible(true);
            usersSelectActivity.d.setVerticalScrollBarEnabled(false);
            usersSelectActivity.f36292f.d.setText(LocaleController.getString(R.string.NoContacts));
            return;
        }
        og1 og1Var2 = usersSelectActivity.h;
        boolean z10 = og1Var2.f41095n;
        if (!z10) {
            usersSelectActivity.I = true;
            usersSelectActivity.H = true;
            if (!z10) {
                og1Var2.f41095n = true;
                og1Var2.l();
            }
            usersSelectActivity.d.setFastScrollVisible(false);
            usersSelectActivity.d.setVerticalScrollBarEnabled(true);
            usersSelectActivity.f36292f.d.setText(LocaleController.getString(R.string.NoResult));
        }
        usersSelectActivity.f36292f.e(true, true);
        usersSelectActivity.h.L(usersSelectActivity.f36290c.getText().toString());
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
