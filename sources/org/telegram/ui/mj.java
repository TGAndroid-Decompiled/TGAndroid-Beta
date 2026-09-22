package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.BooleanCallback {
    public final boolean f35759a;
    public final nj f35760b;

    public mj(nj njVar, boolean z10) {
        this.f35760b = njVar;
        this.f35759a = z10;
    }

    @Override
    public final void run(boolean z10) {
        bo boVar = this.f35760b.f35998b;
        if (z10) {
            TLRPC.User user = boVar.f32295f;
            boolean z11 = this.f35759a;
            if (user != null || z11) {
                boVar.getMessagesStorage().getMessagesCount(boVar.T5, new lj(1, this, z11));
                return;
            }
        }
        boVar.qa(boVar.f32275d4, z10);
    }
}
