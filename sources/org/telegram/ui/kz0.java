package org.telegram.ui;
public final class kz0 extends gu0 {
    public final ProfileActivity f41092a;

    public kz0(ProfileActivity profileActivity) {
        this.f41092a = profileActivity;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kz0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void G() {
        this.f41092a.f35978e0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f41092a.f36061q0.p(str, str2, z10);
    }
}
