package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f36120a;
    public final oj f36121b;

    public nj(oj ojVar, boolean z10) {
        this.f36121b = ojVar;
        this.f36120a = z10;
    }

    @Override
    public final void run(boolean z10) {
        bo boVar = this.f36121b.f36367b;
        if (z10) {
            TLRPC.User user = boVar.f32281f;
            boolean z11 = this.f36120a;
            if (user != null || z11) {
                boVar.getMessagesStorage().getMessagesCount(boVar.T5, new mj(1, this, z11));
                return;
            }
        }
        boVar.qa(boVar.f32261d4, z10);
    }
}
