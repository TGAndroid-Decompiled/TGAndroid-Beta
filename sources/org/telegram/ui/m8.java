package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m8 implements RequestDelegate {
    public final int f40485a;
    public final h9 f40486b;
    public final org.telegram.ui.ActionBar.c2 f40487c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f40488e;
    public final boolean f40489f;

    public m8(h9 h9Var, org.telegram.ui.ActionBar.c2 c2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f40485a = i10;
        this.f40486b = h9Var;
        this.f40487c = c2Var;
        this.d = hashSet;
        this.f40488e = tL_inputGroupCallInviteMessage;
        this.f40489f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40485a) {
            case 0:
                final h9 h9Var = this.f40486b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.f40487c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f40488e;
                final boolean z10 = this.f40489f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                h9.V(h9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                h9.Y(h9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final h9 h9Var2 = this.f40486b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.f40487c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f40488e;
                final boolean z11 = this.f40489f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                h9.V(h9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                h9.Y(h9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
