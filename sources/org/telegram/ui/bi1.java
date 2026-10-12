package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi1 implements TextWatcher {
    public final UsersSelectActivity f34584a;

    public bi1(UsersSelectActivity usersSelectActivity) {
        this.f34584a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f34584a;
        if (usersSelectActivity.f32901c.length() != 0) {
            ei1 ei1Var = usersSelectActivity.h;
            boolean z10 = ei1Var.f35615n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    ei1Var.f35615n = true;
                    ei1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f32902f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f32902f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f32901c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        ei1 ei1Var2 = usersSelectActivity.h;
        if (ei1Var2.f35615n) {
            ei1Var2.f35615n = false;
            ei1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f32902f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
