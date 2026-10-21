package org.telegram.ui;
public final class cz0 extends zt0 {
    public final ProfileActivity f36207a;

    public cz0(ProfileActivity profileActivity) {
        this.f36207a = profileActivity;
    }

    @Override
    public final org.telegram.ui.ju0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cz0.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ju0");
    }

    @Override
    public final void G() {
        this.f36207a.f33619f0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f36207a.f33700r0.p(str, str2, z10);
    }
}
