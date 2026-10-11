package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m8 implements RequestDelegate {
    public final int f39831a;
    public final i9 f39832b;
    public final org.telegram.ui.ActionBar.a2 f39833c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f39834e;
    public final boolean f39835f;

    public m8(i9 i9Var, org.telegram.ui.ActionBar.a2 a2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f39831a = i10;
        this.f39832b = i9Var;
        this.f39833c = a2Var;
        this.d = hashSet;
        this.f39834e = tL_inputGroupCallInviteMessage;
        this.f39835f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39831a) {
            case 0:
                final i9 i9Var = this.f39832b;
                final org.telegram.ui.ActionBar.a2 a2Var = this.f39833c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f39834e;
                final boolean z10 = this.f39835f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.V(i9Var, a2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                i9.Y(i9Var, a2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final i9 i9Var2 = this.f39832b;
                final org.telegram.ui.ActionBar.a2 a2Var2 = this.f39833c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f39834e;
                final boolean z11 = this.f39835f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.V(i9Var2, a2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                i9.Y(i9Var2, a2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
