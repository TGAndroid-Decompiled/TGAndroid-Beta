package org.telegram.ui;
public final class f01 extends zu0 {
    public final ProfileActivity f35412a;

    public f01(ProfileActivity profileActivity) {
        this.f35412a = profileActivity;
    }

    @Override
    public final org.telegram.ui.jv0 E(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f01.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.jv0");
    }

    @Override
    public final void G() {
        this.f35412a.f32260e0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f35412a.f32342q0.p(str, str2, z10);
    }
}
