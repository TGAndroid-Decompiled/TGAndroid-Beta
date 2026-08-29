package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class h80 implements org.telegram.ui.ActionBar.b2 {
    public final int f38780a;
    public final int f38781b;
    public final HashMap f38782c;
    public final boolean d;
    public final boolean f38783e;

    public h80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f38780a = i11;
        this.f38781b = i10;
        this.f38782c = hashMap;
        this.d = z10;
        this.f38783e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = this.f38780a;
        boolean z10 = this.f38783e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f38782c;
        int i12 = this.f38781b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.f35560x1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.f35560x1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
