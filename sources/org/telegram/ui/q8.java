package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements RequestDelegate {
    public final int f41210a;
    public final m9 f41211b;
    public final org.telegram.ui.ActionBar.a2 f41212c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f41213e;
    public final boolean f41214f;

    public q8(m9 m9Var, org.telegram.ui.ActionBar.a2 a2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f41210a = i10;
        this.f41211b = m9Var;
        this.f41212c = a2Var;
        this.d = hashSet;
        this.f41213e = tL_inputGroupCallInviteMessage;
        this.f41214f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41210a) {
            case 0:
                final m9 m9Var = this.f41211b;
                final org.telegram.ui.ActionBar.a2 a2Var = this.f41212c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f41213e;
                final boolean z10 = this.f41214f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                m9.V(m9Var, a2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                m9.Y(m9Var, a2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final m9 m9Var2 = this.f41211b;
                final org.telegram.ui.ActionBar.a2 a2Var2 = this.f41212c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f41213e;
                final boolean z11 = this.f41214f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                m9.V(m9Var2, a2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                m9.Y(m9Var2, a2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
