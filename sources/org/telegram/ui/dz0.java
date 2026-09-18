package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dz0 implements Utilities.Callback {
    public final int f33243a;
    public final ProfileActivity f33244b;

    public dz0(ProfileActivity profileActivity, int i10) {
        this.f33243a = i10;
        this.f33244b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33243a) {
            case 0:
                ProfileActivity profileActivity = this.f33244b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.sv(profileActivity, profileActivity.getParentActivity(), profileActivity.f31429z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f33244b, (Boolean) obj);
                return;
        }
    }
}
