package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m8 implements RequestDelegate {
    public final int f47821a;
    public final i9 f47822b;
    public final org.telegram.ui.ActionBar.u1 f47823c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f47824e;
    public final boolean f47825f;

    public m8(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z9, int i7) {
        this.f47821a = i7;
        this.f47822b = i9Var;
        this.f47823c = u1Var;
        this.d = hashSet;
        this.f47824e = tL_inputGroupCallInviteMessage;
        this.f47825f = z9;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47821a) {
            case 0:
                final i9 i9Var = this.f47822b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.f47823c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f47824e;
                final boolean z9 = this.f47825f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.b0(i9Var, u1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z9, tL_error);
                                return;
                            default:
                                i9.c0(i9Var, u1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z9, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final i9 i9Var2 = this.f47822b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.f47823c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f47824e;
                final boolean z10 = this.f47825f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.b0(i9Var2, u1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                return;
                            default:
                                i9.c0(i9Var2, u1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
