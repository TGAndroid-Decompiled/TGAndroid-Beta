package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements Utilities.Callback {
    public final int f35605a;
    public final ProfileActivity f35606b;

    public cz0(ProfileActivity profileActivity, int i10) {
        this.f35605a = i10;
        this.f35606b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35605a) {
            case 0:
                ProfileActivity profileActivity = this.f35606b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.rv(profileActivity, profileActivity.getParentActivity(), profileActivity.f34058z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f35606b, (Boolean) obj);
                return;
        }
    }
}
