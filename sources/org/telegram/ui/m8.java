package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m8 implements RequestDelegate {
    public final int f39464a;
    public final j9 f39465b;
    public final org.telegram.ui.ActionBar.x1 f39466c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f39467f;

    public m8(j9 j9Var, org.telegram.ui.ActionBar.x1 x1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f39464a = i10;
        this.f39465b = j9Var;
        this.f39466c = x1Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f39467f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39464a) {
            case 0:
                final j9 j9Var = this.f39465b;
                final org.telegram.ui.ActionBar.x1 x1Var = this.f39466c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f39467f;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                j9.b0(j9Var, x1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                j9.c0(j9Var, x1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j9 j9Var2 = this.f39465b;
                final org.telegram.ui.ActionBar.x1 x1Var2 = this.f39466c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f39467f;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                j9.b0(j9Var2, x1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                j9.c0(j9Var2, x1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
