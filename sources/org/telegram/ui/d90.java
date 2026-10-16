package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class d90 implements org.telegram.ui.ActionBar.z1 {
    public final int f34920a;
    public final int f34921b;
    public final HashMap f34922c;
    public final boolean d;
    public final boolean e;

    public d90(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f34920a = i11;
        this.f34921b = i10;
        this.f34922c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = this.f34920a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f34922c;
        int i12 = this.f34921b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
