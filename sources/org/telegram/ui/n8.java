package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n8 implements RequestDelegate {
    public final int f49512a;
    public final i9 f49513b;
    public final org.telegram.ui.ActionBar.t1 f49514c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f49515e;
    public final boolean f49516f;

    public n8(i9 i9Var, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i7) {
        this.f49512a = i7;
        this.f49513b = i9Var;
        this.f49514c = t1Var;
        this.d = hashSet;
        this.f49515e = tL_inputGroupCallInviteMessage;
        this.f49516f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49512a) {
            case 0:
                final i9 i9Var = this.f49513b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.f49514c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f49515e;
                final boolean z10 = this.f49516f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.b0(i9Var, t1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                i9.c0(i9Var, t1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final i9 i9Var2 = this.f49513b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.f49514c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f49515e;
                final boolean z11 = this.f49516f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i9.b0(i9Var2, t1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                i9.c0(i9Var2, t1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
