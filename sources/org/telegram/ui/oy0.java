package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements Utilities.Callback {
    public final int f39833a;
    public final ProfileActivity f39834b;

    public oy0(ProfileActivity profileActivity, int i10) {
        this.f39833a = i10;
        this.f39834b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39833a) {
            case 0:
                ProfileActivity profileActivity = this.f39834b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.ov(profileActivity, profileActivity.getParentActivity(), profileActivity.f34714w0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f39834b, (Boolean) obj);
                return;
        }
    }
}
