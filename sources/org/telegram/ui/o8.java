package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o8 implements RequestDelegate {
    public final int f39155a;
    public final k9 f39156b;
    public final org.telegram.ui.ActionBar.b2 f39157c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f39158e;
    public final boolean f39159f;

    public o8(k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f39155a = i10;
        this.f39156b = k9Var;
        this.f39157c = b2Var;
        this.d = hashSet;
        this.f39158e = tL_inputGroupCallInviteMessage;
        this.f39159f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39155a) {
            case 0:
                final k9 k9Var = this.f39156b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f39157c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f39158e;
                final boolean z10 = this.f39159f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                k9.V(k9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                k9.Y(k9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k9 k9Var2 = this.f39156b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f39157c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f39158e;
                final boolean z11 = this.f39159f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                k9.V(k9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                k9.Y(k9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
