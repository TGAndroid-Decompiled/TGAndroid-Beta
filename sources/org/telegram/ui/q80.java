package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class q80 implements org.telegram.ui.ActionBar.c2 {
    public final int f37666a;
    public final int f37667b;
    public final HashMap f37668c;
    public final boolean d;
    public final boolean e;

    public q80(int i10, HashMap hashMap, boolean z4, boolean z10, int i11) {
        this.f37666a = i11;
        this.f37667b = i10;
        this.f37668c = hashMap;
        this.d = z4;
        this.e = z10;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f37666a;
        boolean z4 = this.e;
        boolean z10 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f37668c;
        int i12 = this.f37667b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.f31612y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.f31612y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                return;
        }
    }
}
