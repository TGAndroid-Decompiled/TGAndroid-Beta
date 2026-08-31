package org.telegram.ui;
public final class jz0 extends au0 {
    public final ProfileActivity f38244a;

    public jz0(ProfileActivity profileActivity) {
        this.f38244a = profileActivity;
    }

    @Override
    public final org.telegram.ui.lu0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jz0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    @Override
    public final void G() {
        this.f38244a.f34568b0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f38244a.f34652n0.q(str, str2, z4);
    }
}
