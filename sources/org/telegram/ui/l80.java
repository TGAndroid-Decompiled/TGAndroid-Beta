package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class l80 implements org.telegram.ui.ActionBar.z1 {
    public final int f39164a;
    public final int f39165b;
    public final HashMap f39166c;
    public final boolean d;
    public final boolean e;

    public l80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f39164a = i11;
        this.f39165b = i10;
        this.f39166c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = this.f39164a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f39166c;
        int i12 = this.f39165b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.E1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.E1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
