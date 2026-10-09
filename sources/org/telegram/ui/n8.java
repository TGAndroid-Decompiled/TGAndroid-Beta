package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n8 implements RequestDelegate {
    public final int f40096a;
    public final j9 f40097b;
    public final org.telegram.ui.ActionBar.b2 f40098c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f40099e;
    public final boolean f40100f;

    public n8(j9 j9Var, org.telegram.ui.ActionBar.b2 b2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f40096a = i10;
        this.f40097b = j9Var;
        this.f40098c = b2Var;
        this.d = hashSet;
        this.f40099e = tL_inputGroupCallInviteMessage;
        this.f40100f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40096a) {
            case 0:
                final j9 j9Var = this.f40097b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f40098c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f40099e;
                final boolean z10 = this.f40100f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                j9.V(j9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                j9.Y(j9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j9 j9Var2 = this.f40097b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f40098c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f40099e;
                final boolean z11 = this.f40100f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                j9.V(j9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                j9.Y(j9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
