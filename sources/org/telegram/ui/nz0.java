package org.telegram.ui;
public final class nz0 extends fu0 {
    public final ProfileActivity f36608a;

    public nz0(ProfileActivity profileActivity) {
        this.f36608a = profileActivity;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nz0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void G() {
        this.f36608a.f32010b0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f36608a.f32093n0.q(str, str2, z4);
    }
}
