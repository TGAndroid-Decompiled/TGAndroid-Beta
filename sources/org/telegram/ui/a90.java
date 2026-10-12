package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class a90 implements org.telegram.ui.ActionBar.z1 {
    public final int f35728a;
    public final int f35729b;
    public final HashMap f35730c;
    public final boolean d;
    public final boolean f35731e;

    public a90(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f35728a = i11;
        this.f35729b = i10;
        this.f35730c = hashMap;
        this.d = z10;
        this.f35731e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = this.f35728a;
        boolean z10 = this.f35731e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f35730c;
        int i12 = this.f35729b;
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
