package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements Utilities.Callback {
    public final int f35578a;
    public final ProfileActivity f35579b;

    public cz0(ProfileActivity profileActivity, int i10) {
        this.f35578a = i10;
        this.f35579b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35578a) {
            case 0:
                ProfileActivity profileActivity = this.f35579b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.rv(profileActivity, profileActivity.getParentActivity(), profileActivity.f34031z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f35579b, (Boolean) obj);
                return;
        }
    }
}
