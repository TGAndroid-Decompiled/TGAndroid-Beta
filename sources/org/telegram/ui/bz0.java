package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bz0 implements Utilities.Callback {
    public final int f32599a;
    public final ProfileActivity f32600b;

    public bz0(ProfileActivity profileActivity, int i10) {
        this.f32599a = i10;
        this.f32600b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32599a) {
            case 0:
                ProfileActivity profileActivity = this.f32600b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.sv(profileActivity, profileActivity.getParentActivity(), profileActivity.f31412z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f32600b, (Boolean) obj);
                return;
        }
    }
}
