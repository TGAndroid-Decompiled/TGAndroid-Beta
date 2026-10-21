package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg1 implements TextWatcher {
    public final UsersSelectActivity f37625a;

    public hg1(UsersSelectActivity usersSelectActivity) {
        this.f37625a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f37625a;
        if (usersSelectActivity.f33958c.length() != 0) {
            kg1 kg1Var = usersSelectActivity.h;
            boolean z10 = kg1Var.f38605n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    kg1Var.f38605n = true;
                    kg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f33959f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f33959f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f33958c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        kg1 kg1Var2 = usersSelectActivity.h;
        if (kg1Var2.f38605n) {
            kg1Var2.f38605n = false;
            kg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f33959f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
