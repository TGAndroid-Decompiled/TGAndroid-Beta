package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n8 implements RequestDelegate {
    public final int f50141a;
    public final j9 f50142b;
    public final org.telegram.ui.ActionBar.t1 f50143c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f50144e;
    public final boolean f50145f;

    public n8(j9 j9Var, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i7) {
        this.f50141a = i7;
        this.f50142b = j9Var;
        this.f50143c = t1Var;
        this.d = hashSet;
        this.f50144e = tL_inputGroupCallInviteMessage;
        this.f50145f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50141a) {
            case 0:
                final j9 j9Var = this.f50142b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.f50143c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f50144e;
                final boolean z10 = this.f50145f;
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
                final j9 j9Var2 = this.f50142b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.f50143c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f50144e;
                final boolean z11 = this.f50145f;
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
