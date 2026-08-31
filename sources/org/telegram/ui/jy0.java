package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class jy0 implements Utilities.Callback {
    public final int f38237a;
    public final ProfileActivity f38238b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f38237a = i10;
        this.f38238b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38237a) {
            case 0:
                ProfileActivity profileActivity = this.f38238b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.ov(profileActivity, profileActivity.getParentActivity(), profileActivity.f34714w0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f38238b, (Boolean) obj);
                return;
        }
    }
}
