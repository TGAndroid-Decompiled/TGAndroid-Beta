package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class f80 implements org.telegram.ui.ActionBar.a2 {
    public final int f36918a;
    public final int f36919b;
    public final HashMap f36920c;
    public final boolean d;
    public final boolean e;

    public f80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f36918a = i11;
        this.f36919b = i10;
        this.f36920c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f36918a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f36920c;
        int i12 = this.f36919b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.C1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.C1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
