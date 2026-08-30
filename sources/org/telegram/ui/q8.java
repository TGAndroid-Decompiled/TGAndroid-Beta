package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements RequestDelegate {
    public final int f37662a;
    public final l9 f37663b;
    public final org.telegram.ui.ActionBar.d2 f37664c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f37665f;

    public q8(l9 l9Var, org.telegram.ui.ActionBar.d2 d2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, int i10) {
        this.f37662a = i10;
        this.f37663b = l9Var;
        this.f37664c = d2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f37665f = z4;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37662a) {
            case 0:
                final l9 l9Var = this.f37663b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.f37664c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z4 = this.f37665f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                l9.V(l9Var, d2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z4, tL_error);
                                return;
                            default:
                                l9.Y(l9Var, d2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z4, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final l9 l9Var2 = this.f37663b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.f37664c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z10 = this.f37665f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                l9.V(l9Var2, d2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                return;
                            default:
                                l9.Y(l9Var2, d2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
