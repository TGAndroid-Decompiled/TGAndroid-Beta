package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n8 implements RequestDelegate {
    public final int f47910a;
    public final h9 f47911b;
    public final org.telegram.ui.ActionBar.s1 f47912c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage f47913e;
    public final boolean f47914f;

    public n8(h9 h9Var, org.telegram.ui.ActionBar.s1 s1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i3) {
        this.f47910a = i3;
        this.f47911b = h9Var;
        this.f47912c = s1Var;
        this.d = hashSet;
        this.f47913e = tL_inputGroupCallInviteMessage;
        this.f47914f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47910a) {
            case 0:
                final h9 h9Var = this.f47911b;
                final org.telegram.ui.ActionBar.s1 s1Var = this.f47912c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f47913e;
                final boolean z10 = this.f47914f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                h9.b0(h9Var, s1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                h9.c0(h9Var, s1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final h9 h9Var2 = this.f47911b;
                final org.telegram.ui.ActionBar.s1 s1Var2 = this.f47912c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f47913e;
                final boolean z11 = this.f47914f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                h9.b0(h9Var2, s1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                h9.c0(h9Var2, s1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
