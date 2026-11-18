package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n8 implements RequestDelegate {
    public final int f50121a;
    public final i9 f50122b;
    public final org.telegram.ui.ActionBar.u1 f50123c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f50124e;
    public final boolean f50125f;

    public n8(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i7) {
        this.f50121a = i7;
        this.f50122b = i9Var;
        this.f50123c = u1Var;
        this.d = hashSet;
        this.f50124e = tL_inputGroupCallInviteMessage;
        this.f50125f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50121a) {
            case 0:
                final i9 i9Var = this.f50122b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.f50123c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f50124e;
                final boolean z10 = this.f50125f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.b0(i9Var, u1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                i9.c0(i9Var, u1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final i9 i9Var2 = this.f50122b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.f50123c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f50124e;
                final boolean z11 = this.f50125f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.b0(i9Var2, u1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                i9.c0(i9Var2, u1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
