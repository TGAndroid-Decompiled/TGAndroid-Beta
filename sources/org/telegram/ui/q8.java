package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements RequestDelegate {
    public final int f39731a;
    public final m9 f39732b;
    public final org.telegram.ui.ActionBar.b2 f39733c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f39734e;
    public final boolean f39735f;

    public q8(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f39731a = i10;
        this.f39732b = m9Var;
        this.f39733c = b2Var;
        this.d = hashSet;
        this.f39734e = tL_inputGroupCallInviteMessage;
        this.f39735f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39731a) {
            case 0:
                final m9 m9Var = this.f39732b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f39733c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f39734e;
                final boolean z10 = this.f39735f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                m9.X(m9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                m9.W(m9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final m9 m9Var2 = this.f39732b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f39733c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f39734e;
                final boolean z11 = this.f39735f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                m9.X(m9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                m9.W(m9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
