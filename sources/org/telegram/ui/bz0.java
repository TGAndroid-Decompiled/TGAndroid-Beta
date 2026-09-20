package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bz0 implements Utilities.Callback {
    public final int f32558a;
    public final ProfileActivity f32559b;

    public bz0(ProfileActivity profileActivity, int i10) {
        this.f32558a = i10;
        this.f32559b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32558a) {
            case 0:
                ProfileActivity profileActivity = this.f32559b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.tv(profileActivity, profileActivity.getParentActivity(), profileActivity.f31696z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f32559b, (Boolean) obj);
                return;
        }
    }
}
