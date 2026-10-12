package org.telegram.ui;
public final class b01 extends wu0 {
    public final ProfileActivity f36007a;

    public b01(ProfileActivity profileActivity) {
        this.f36007a = profileActivity;
    }

    @Override
    public final org.telegram.ui.gv0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b01.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gv0");
    }

    @Override
    public final void G() {
        this.f36007a.f34079e0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f36007a.f34160q0.p(str, str2, z10);
    }
}
