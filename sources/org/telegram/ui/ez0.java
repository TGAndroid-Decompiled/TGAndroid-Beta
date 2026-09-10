package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ez0 implements Utilities.Callback {
    public final int f32653a;
    public final ProfileActivity f32654b;

    public ez0(ProfileActivity profileActivity, int i10) {
        this.f32653a = i10;
        this.f32654b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32653a) {
            case 0:
                ProfileActivity profileActivity = this.f32654b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.wv(profileActivity, profileActivity.getParentActivity(), profileActivity.f30524z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f32654b, (Boolean) obj);
                return;
        }
    }
}
