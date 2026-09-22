package org.telegram.ui;
public final class a01 extends tu0 {
    public final ProfileActivity f31643a;

    public a01(ProfileActivity profileActivity) {
        this.f31643a = profileActivity;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a01.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void G() {
        this.f31643a.f31265e0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f31643a.f31346q0.q(str, str2, z10);
    }
}
