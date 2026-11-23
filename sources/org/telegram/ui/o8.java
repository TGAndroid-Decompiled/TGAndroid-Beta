package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o8 implements RequestDelegate {
    public final int f50597a;
    public final j9 f50598b;
    public final org.telegram.ui.ActionBar.t1 f50599c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f50600e;
    public final boolean f50601f;

    public o8(j9 j9Var, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i7) {
        this.f50597a = i7;
        this.f50598b = j9Var;
        this.f50599c = t1Var;
        this.d = hashSet;
        this.f50600e = tL_inputGroupCallInviteMessage;
        this.f50601f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50597a) {
            case 0:
                final j9 j9Var = this.f50598b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.f50599c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f50600e;
                final boolean z10 = this.f50601f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                j9.b0(j9Var, t1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                j9.c0(j9Var, t1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j9 j9Var2 = this.f50598b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.f50599c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f50600e;
                final boolean z11 = this.f50601f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                j9.b0(j9Var2, t1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                j9.c0(j9Var2, t1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
