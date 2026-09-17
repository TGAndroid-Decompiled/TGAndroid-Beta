package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f36115a;
    public final oj f36116b;

    public nj(oj ojVar, boolean z10) {
        this.f36116b = ojVar;
        this.f36115a = z10;
    }

    @Override
    public final void run(boolean z10) {
        bo boVar = this.f36116b.f36362b;
        if (z10) {
            TLRPC.User user = boVar.f32277f;
            boolean z11 = this.f36115a;
            if (user != null || z11) {
                boVar.getMessagesStorage().getMessagesCount(boVar.T5, new mj(1, this, z11));
                return;
            }
        }
        boVar.qa(boVar.f32257d4, z10);
    }
}
