package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class l80 implements org.telegram.ui.ActionBar.b2 {
    public final int f41002a;
    public final int f41003b;
    public final HashMap f41004c;
    public final boolean d;
    public final boolean e;

    public l80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f41002a = i11;
        this.f41003b = i10;
        this.f41004c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11 = this.f41002a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f41004c;
        int i12 = this.f41003b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.D1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
