package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements RequestDelegate {
    public final int f40363a;
    public final l9 f40364b;
    public final org.telegram.ui.ActionBar.d2 f40365c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f40366e;
    public final boolean f40367f;

    public q8(l9 l9Var, org.telegram.ui.ActionBar.d2 d2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, int i10) {
        this.f40363a = i10;
        this.f40364b = l9Var;
        this.f40365c = d2Var;
        this.d = hashSet;
        this.f40366e = tL_inputGroupCallInviteMessage;
        this.f40367f = z4;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40363a) {
            case 0:
                final l9 l9Var = this.f40364b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.f40365c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f40366e;
                final boolean z4 = this.f40367f;
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
                final l9 l9Var2 = this.f40364b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.f40365c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f40366e;
                final boolean z10 = this.f40367f;
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
