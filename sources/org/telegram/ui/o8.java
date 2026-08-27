package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class o8 implements RequestDelegate {

    public final int f41027a;

    public final j9 f41028b;

    public final org.telegram.ui.ActionBar.b2 f41029c;
    public final HashSet d;

    public final TLRPC.TL_inputGroupCallInviteMessage f41030e;

    public final boolean f41031f;

    public o8(j9 j9Var, org.telegram.ui.ActionBar.b2 b2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f41027a = i10;
        this.f41028b = j9Var;
        this.f41029c = b2Var;
        this.d = hashSet;
        this.f41030e = tL_inputGroupCallInviteMessage;
        this.f41031f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41027a) {
            case 0:
                final int i10 = 0;
                final j9 j9Var = this.f41028b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.f41029c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f41030e;
                final boolean z10 = this.f41031f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j9.V(j9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                            default:
                                j9.Y(j9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final j9 j9Var2 = this.f41028b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.f41029c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f41030e;
                final boolean z11 = this.f41031f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                j9.V(j9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                            default:
                                j9.Y(j9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
