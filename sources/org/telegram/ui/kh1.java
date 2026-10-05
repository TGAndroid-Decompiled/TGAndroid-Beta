package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kh1 implements TextWatcher {
    public final UsersSelectActivity f38013a;

    public kh1(UsersSelectActivity usersSelectActivity) {
        this.f38013a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f38013a;
        if (usersSelectActivity.f34604c.length() != 0) {
            nh1 nh1Var = usersSelectActivity.h;
            boolean z10 = nh1Var.f38981n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    nh1Var.f38981n = true;
                    nh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34606f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34606f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34604c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        nh1 nh1Var2 = usersSelectActivity.h;
        if (nh1Var2.f38981n) {
            nh1Var2.f38981n = false;
            nh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34606f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
