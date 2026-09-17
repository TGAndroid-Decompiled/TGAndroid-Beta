package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements Utilities.Callback {
    public final int f35579a;
    public final ProfileActivity f35580b;

    public cz0(ProfileActivity profileActivity, int i10) {
        this.f35579a = i10;
        this.f35580b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35579a) {
            case 0:
                ProfileActivity profileActivity = this.f35580b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.rv(profileActivity, profileActivity.getParentActivity(), profileActivity.f34032z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f35580b, (Boolean) obj);
                return;
        }
    }
}
