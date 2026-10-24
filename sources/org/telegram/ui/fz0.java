package org.telegram.ui;
public final class fz0 extends bu0 {
    public final ProfileActivity f37399a;

    public fz0(ProfileActivity profileActivity) {
        this.f37399a = profileActivity;
    }

    @Override
    public final org.telegram.ui.lu0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fz0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    @Override
    public final void G() {
        this.f37399a.f33922f0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f37399a.f34003r0.p(str, str2, z10);
    }
}
