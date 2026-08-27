package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;

public final class i80 implements org.telegram.ui.ActionBar.a2 {

    public final int f38996a;

    public final int f38997b;

    public final HashMap f38998c;
    public final boolean d;

    public final boolean f38999e;

    public i80(int i10, HashMap map, boolean z10, boolean z11, int i11) {
        this.f38996a = i11;
        this.f38997b = i10;
        this.f38998c = map;
        this.d = z10;
        this.f38999e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f38996a;
        boolean z10 = this.f38999e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> map = this.f38998c;
        int i12 = this.f38997b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(map, z11, z10, true);
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.f35496x1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(map, z11, z10, false);
                break;
            default:
                Pattern pattern3 = LaunchActivity.f35496x1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(map, z11, z10, true);
                break;
        }
    }
}
