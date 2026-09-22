package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements Utilities.Callback {
    public final int f32893a;
    public final ProfileActivity f32894b;

    public cz0(ProfileActivity profileActivity, int i10) {
        this.f32893a = i10;
        this.f32894b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32893a) {
            case 0:
                ProfileActivity profileActivity = this.f32894b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.sv(profileActivity, profileActivity.getParentActivity(), profileActivity.f31409z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f32894b, (Boolean) obj);
                return;
        }
    }
}
