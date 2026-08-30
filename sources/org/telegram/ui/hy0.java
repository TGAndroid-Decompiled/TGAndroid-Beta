package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class hy0 implements Utilities.Callback {
    public final int f34972a;
    public final ProfileActivity f34973b;

    public hy0(ProfileActivity profileActivity, int i10) {
        this.f34972a = i10;
        this.f34973b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34972a) {
            case 0:
                ProfileActivity profileActivity = this.f34973b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.mv(profileActivity, profileActivity.getParentActivity(), profileActivity.f32181w0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f34973b, (Boolean) obj);
                return;
        }
    }
}
