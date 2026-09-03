package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements Utilities.Callback {
    public final int f36902a;
    public final ProfileActivity f36903b;

    public oy0(ProfileActivity profileActivity, int i10) {
        this.f36902a = i10;
        this.f36903b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36902a) {
            case 0:
                ProfileActivity profileActivity = this.f36903b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.lv(profileActivity, profileActivity.getParentActivity(), profileActivity.f32155w0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f36903b, (Boolean) obj);
                return;
        }
    }
}
