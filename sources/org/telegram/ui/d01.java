package org.telegram.ui;
public final class d01 extends tu0 {
    public final ProfileActivity f31800a;

    public d01(ProfileActivity profileActivity) {
        this.f31800a = profileActivity;
    }

    @Override
    public final org.telegram.ui.ev0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d01.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ev0");
    }

    @Override
    public final void G() {
        this.f31800a.f30380e0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f31800a.f30461q0.q(str, str2, z10);
    }
}
