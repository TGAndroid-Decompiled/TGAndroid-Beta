package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bz0 implements Utilities.Callback {
    public final int f32470a;
    public final ProfileActivity f32471b;

    public bz0(ProfileActivity profileActivity, int i10) {
        this.f32470a = i10;
        this.f32471b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32470a) {
            case 0:
                ProfileActivity profileActivity = this.f32471b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.sv(profileActivity, profileActivity.getParentActivity(), profileActivity.f31656z0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f32471b, (Boolean) obj);
                return;
        }
    }
}
