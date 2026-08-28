package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class e80 implements org.telegram.ui.ActionBar.b2 {
    public final int f37851a;
    public final int f37852b;
    public final HashMap f37853c;
    public final boolean d;
    public final boolean f37854e;

    public e80(int i9, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.f37851a = i10;
        this.f37852b = i9;
        this.f37853c = hashMap;
        this.d = z10;
        this.f37854e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10 = this.f37851a;
        boolean z10 = this.f37854e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f37853c;
        int i11 = this.f37852b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                ContactsController.getInstance(i11).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.f35493x1;
                ContactsController.getInstance(i11).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.f35493x1;
                ContactsController.getInstance(i11).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
