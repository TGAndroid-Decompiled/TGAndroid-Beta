package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pg1 implements TextWatcher {
    public final UsersSelectActivity f42402a;

    public pg1(UsersSelectActivity usersSelectActivity) {
        this.f42402a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f42402a;
        if (usersSelectActivity.f36348c.length() != 0) {
            sg1 sg1Var = usersSelectActivity.h;
            boolean z10 = sg1Var.f43323n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    sg1Var.f43323n = true;
                    sg1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f36349f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f36349f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f36348c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        sg1 sg1Var2 = usersSelectActivity.h;
        if (sg1Var2.f43323n) {
            sg1Var2.f43323n = false;
            sg1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f36349f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
