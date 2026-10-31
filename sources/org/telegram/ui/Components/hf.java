package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class hf implements Runnable {
    public final int f26719a = 0;
    public final boolean f26720b;
    public final long f26721c;
    public final Object d;
    public final Object e;
    public final Object f26722f;
    public final Object h;

    public hf(lf lfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j10, boolean z10) {
        this.d = lfVar;
        this.e = editTextBoldCursor;
        this.f26722f = str;
        this.h = document;
        this.f26721c = j10;
        this.f26720b = z10;
    }

    @Override
    public final void run() {
        o5 o5Var;
        SpannableStringBuilder W2;
        int i10 = this.f26719a;
        long j10 = this.f26721c;
        boolean z10 = this.f26720b;
        Object obj = this.h;
        Object obj2 = this.f26722f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((lf) obj4).f28100a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.S2 = 2;
                            if (str == null) {
                                str = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str);
                            if (document != null) {
                                o5Var = new o5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                o5Var = new o5(j10, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                o5Var.fromEmojiKeyboard = true;
                            }
                            o5Var.cacheType = f5.f();
                            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        chatActivityEnterView.S2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.S2 = 0;
                        throw th2;
                    }
                }
                return;
            case 1:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj4;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
                    b50Var.z1(null, j10, 3);
                    return;
                } else {
                    s4.e0(b50Var.f21583a, tL_error, (org.telegram.ui.ActionBar.k2) b50Var.Z1.M().getFragmentStack().get(b50Var.Z1.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 2:
                org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) obj4;
                TLObject tLObject = (TLObject) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                int i11 = ua0Var.f42101b;
                ua0Var.c();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    org.telegram.messenger.vp.r1(i11).V3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.vp.r1(i11).P3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (Z1 != null) {
                        org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9(Z1);
                        r9Var.f35145s = j10;
                        r9Var.f35132g0 = str2;
                        r9Var.f35133h0 = z10;
                        r9Var.f35131f0 = true;
                        ua0Var.u(r9Var, false);
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.ua0.d().f0(tL_error2, false);
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.dx0 dx0Var = (org.telegram.ui.dx0) obj4;
                ProfileActivity profileActivity = dx0Var.f36859b;
                org.telegram.ui.iq iqVar = new org.telegram.ui.iq(profileActivity.f33796d1, -j10, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                iqVar.X0 = new org.telegram.ui.cx0(dx0Var, (org.telegram.ui.ay) obj);
                profileActivity.presentFragment(iqVar);
                return;
            case 4:
                rh.i iVar = (rh.i) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    iVar.t0(this.f26720b, this.f26721c, twoStepVerificationActivity.p0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 5:
                th.z2 z2Var = (th.z2) obj4;
                final org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj3;
                String str3 = (String) obj2;
                TLObject tLObject3 = (TLObject) obj;
                th.e5 O1 = vpVar.O1();
                final long j11 = this.f26721c;
                final boolean z11 = this.f26720b;
                O1.l0(j11, z11, false);
                m4.c cVar = new m4.c((char) 0, 15);
                cVar.f12705b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                vpVar.O1().l0(j11, !z11, false);
                                return;
                            default:
                                vpVar.O1().l0(j11, z11, true);
                                return;
                        }
                    }
                };
                cVar.f12706c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                vpVar.O1().l0(j11, !z11, false);
                                return;
                            default:
                                vpVar.O1().l0(j11, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744776, org.telegram.messenger.i5.m(10, str3, null)));
                } else {
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744777, org.telegram.messenger.i5.m(10, str3, null)));
                }
                wb V = new cc(z2Var.M0, z2Var.f49725k0).V(Arrays.asList(tLObject3), W2, null, cVar);
                V.f32129a = 2;
                V.k(true);
                return;
            default:
                th.e5 e5Var = (th.e5) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj2;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                if (tL_error3 != null) {
                    if (tL_error3.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(e5Var.f48904a);
                            org.telegram.messenger.i3 G0 = r12.G0();
                            long j12 = this.f26721c;
                            G0.a(j12, new org.telegram.ui.ko(e5Var, q20Var, r12, j12, 6));
                            return;
                        }
                        q20Var.a(Boolean.FALSE);
                        return;
                    } else if (tL_error3.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        if (z10 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), p6Var);
                            String L0 = org.telegram.messenger.cd.L0(2131748836, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.cd.L0(2131748837, null);
                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                        }
                        q20Var.a(Boolean.FALSE);
                        return;
                    } else if (tL_error3.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                        if (z10 && Q2 != null) {
                            Q2.showDialog(new kg.i1(Q2, 14, true));
                        }
                        q20Var.a(Boolean.FALSE);
                        return;
                    } else {
                        cc X = cc.X();
                        if (X != null) {
                            X.f0(tL_error3, false);
                        }
                        q20Var.a(Boolean.FALSE);
                        return;
                    }
                }
                q20Var.a(Boolean.TRUE);
                return;
        }
    }

    public hf(org.telegram.ui.b50 b50Var, org.telegram.ui.ActionBar.x1[] x1VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = b50Var;
        this.e = x1VarArr;
        this.f26720b = z10;
        this.f26722f = tL_error;
        this.f26721c = j10;
        this.h = invitetogroupcall;
    }

    public hf(org.telegram.ui.ua0 ua0Var, TLObject tLObject, long j10, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = ua0Var;
        this.e = tLObject;
        this.f26721c = j10;
        this.f26722f = str;
        this.f26720b = z10;
        this.h = tL_error;
    }

    public hf(org.telegram.ui.dx0 dx0Var, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, org.telegram.ui.ay ayVar) {
        this.d = dx0Var;
        this.f26721c = j10;
        this.e = tL_chatAdminRights;
        this.f26722f = str;
        this.f26720b = z10;
        this.h = ayVar;
    }

    public hf(rh.i iVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = iVar;
        this.e = tL_error;
        this.f26722f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f26720b = z10;
        this.f26721c = j10;
    }

    public hf(th.z2 z2Var, org.telegram.messenger.vp vpVar, long j10, boolean z10, String str, TLObject tLObject) {
        this.d = z2Var;
        this.e = vpVar;
        this.f26721c = j10;
        this.f26720b = z10;
        this.f26722f = str;
        this.h = tLObject;
    }

    public hf(th.e5 e5Var, TLRPC.TL_error tL_error, boolean z10, long j10, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = e5Var;
        this.e = tL_error;
        this.f26720b = z10;
        this.f26721c = j10;
        this.f26722f = q20Var;
        this.h = p6Var;
    }
}
