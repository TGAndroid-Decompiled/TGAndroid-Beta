package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class b7 implements org.telegram.ui.Components.ij0, org.telegram.ui.Components.sh0, org.telegram.ui.Components.r4, org.telegram.messenger.jc, w4, org.telegram.ui.ActionBar.p1, org.telegram.messenger.lr, org.telegram.ui.Components.gj0, nw, ca1, org.telegram.ui.Components.voip.o2, OnSuccessListener {
    public final int f43940a;
    public final Object f43941b;
    public final Object f43942c;
    public final Object d;

    public b7(Object obj, Object obj2, Object obj3, int i3) {
        this.f43940a = i3;
        this.f43941b = obj;
        this.f43942c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean G() {
        switch (this.f43940a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f43940a) {
            case 2:
                wm wmVar = (wm) this.f43941b;
                wmVar.getClass();
                wmVar.Db((TLRPC.BotInlineResult) this.f43942c, z10, i3, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                wm wmVar2 = (wm) this.f43941b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f43942c;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.d;
                wmVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    dg.a l10 = dg.a.l(starsAmount);
                    long j10 = i3;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (l10 != null && !l10.k()) {
                        suggestedPost2.price = l10.o();
                    }
                    if (j10 > 0) {
                        suggestedPost2.schedule_date = (int) j10;
                        suggestedPost2.flags |= 1;
                    }
                    if (ziVar != null && ziVar.f26868k != null) {
                        wmVar2.getMessagesController().h(ziVar, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wm.T0((wm) this.f43941b, (org.telegram.messenger.ui) this.f43942c, (org.telegram.messenger.zi) this.d, i3, i10);
                return;
        }
    }

    @Override
    public boolean N(uw uwVar) {
        switch (this.f43940a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        wm wmVar = (wm) this.f43941b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f43942c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.bd.E0().f21812y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !gy0.d0().contains(str))) {
            f0Var.setOnClickListener(new ei.f0(wmVar, str, language, charSequence, f0Var, 7));
        } else {
            f0Var.setClickable(false);
        }
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        x30.I0((x30) this.f43941b, (Activity) this.f43942c, (org.telegram.messenger.r3) this.d, view, i3);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(org.telegram.ui.Components.uh0 uh0Var, int i3) {
        int i10;
        View view = (View) this.f43941b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43942c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(uh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.k5.C(52.0f, i10, i3), true);
    }

    @Override
    public void d(e5 e5Var) {
        switch (this.f43940a) {
            case 6:
                hm hmVar = (hm) this.f43941b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f43942c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = e5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                hmVar.f45934a.Ma(user);
                                return;
                            }
                            return;
                        }
                        hmVar.b(user);
                        return;
                    }
                    hmVar.l(q1Var, user);
                    return;
                }
                hmVar.o(user, false);
                return;
            default:
                hm hmVar2 = (hm) this.f43941b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f43942c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = e5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                hmVar2.f45934a.Ka(chat);
                                return;
                            }
                            return;
                        }
                        hmVar2.a(chat);
                        return;
                    }
                    hmVar2.k(q1Var2, chat, 0, false);
                    return;
                }
                hmVar2.m(chat);
                return;
        }
    }

    public boolean e(TLRPC.Message message) {
        dl0 dl0Var = (dl0) this.f43941b;
        org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.f43942c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.zi.C1(message.peer_id) == dl0Var.m0.f27150id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            org.telegram.messenger.g0.h3(new ih0(dl0Var, q4Var, activity, message, 1));
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String str;
        int i10;
        switch (this.f43940a) {
            case 8:
                yn ynVar = (yn) this.f43941b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f43942c;
                View view = (View) this.d;
                bo boVar = ynVar.f52369a.i3;
                if (tL_username.editable) {
                    if (boVar.f44113s0 == null) {
                        boVar.f44113s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = boVar.Y;
                    tL_inputChannel.channel_id = chat.f27001id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    boVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ci.o3(ynVar, tL_channels_toggleUsername, tL_username, z10, 5));
                    boVar.Q.add(tL_username.username);
                    ((ha) view).setLoading(true);
                }
                boVar.b0();
                return;
            case 9:
                qo qoVar = (qo) this.f43941b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                qoVar.getClass();
                if (((TLRPC.ChatFull) this.f43942c).hidden_prehistory) {
                    qoVar.getMessagesController().b5(chat2.f27001id, false);
                }
                qoVar.d0(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                v51 v51Var = (v51) this.f43941b;
                boolean z11 = true;
                if (org.telegram.ui.ActionBar.k6.l0(((x51) this.f43942c).d, (org.telegram.ui.ActionBar.g6) this.d, true)) {
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                    org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                    if (v51Var.f50398e.f42050f != 1) {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.k6.K1(j6Var, z11, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43941b;
                TLRPC.User user = (TLRPC.User) this.f43942c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.l0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f43941b;
                org.telegram.messenger.az.f21632h0 = (String) this.f43942c;
                org.telegram.messenger.az.y();
                org.telegram.messenger.az.f21615b = false;
                dataSettingsActivity.s0(dataSettingsActivity.f41248n);
                org.telegram.messenger.zb.D().i(new us(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f27343a.O0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f43942c;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f27343a.O0.run();
                cy cyVar = ((zx) this.f43941b).F.f43857c;
                cyVar.d.title = editTextBoldCursor.getText().toString();
                cyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = cyVar.d;
                if (cyVar.F != 0) {
                    cyVar.getConnectionsManager().cancelRequest(cyVar.F, true);
                    cyVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = cyVar.f44477c.f24237a;
                tL_chatlists_editExportedInvite.slug = cyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                cyVar.F = cyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new qx(cyVar, 1));
                org.telegram.messenger.u10 u10Var = cyVar.f44485y;
                if (u10Var != null) {
                    u10Var.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f43942c;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.r3 r3Var = ((c30) this.f43941b).f44213b.S2;
                String obj = editTextBoldCursor2.getText().toString();
                r3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = r3Var.g(r3Var.f25048a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(r3Var.C.f21919a).sendRequest(editgroupcalltitle, new org.telegram.messenger.k3(r3Var, 1));
                ((AlertDialog$Builder) this.d).f27343a.O0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f43941b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f43942c, (ArrayList) this.d, false));
                return;
            case 21:
                k21 k21Var = (k21) this.f43942c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.d2) k21Var.f46745a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new xy(29, k21Var, tL_authorization));
                ((a21) this.f43941b).d.dismiss();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.voip.p2 p2Var) {
        String M0;
        zb1 zb1Var = (zb1) this.f43941b;
        VoIPService voIPService = (VoIPService) this.f43942c;
        org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(zb1Var.T0);
            zb1Var.S0 = false;
            if (zb1Var.f52648x0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    M0 = org.telegram.messenger.bd.M0(2131754731, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131754730, null);
                }
                p2Var.announceForAccessibility(M0);
            }
            q2Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q11) this.f43941b).e1((TLRPC.User) this.f43942c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        b8.ke keVar = (b8.ke) this.f43941b;
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) keVar.d));
        ((gi.d) this.f43942c).setLoading(false);
        int i3 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) keVar.f2719f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.K1;
            if (context == null) {
                context = org.telegram.messenger.t0.f25457b;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    e6Var = T.getResourceProvider();
                } else {
                    e6Var = null;
                }
                org.telegram.ui.ActionBar.t2 t2Var = qc1.f48862c;
                if (t2Var != null) {
                    t2Var.dismiss();
                    qc1.f48862c = null;
                }
                org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                l10.O = frameLayout;
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                frameLayout.addView(f11, b8.mf.e(-1, -1, 119));
                TextView b10 = b8.rf.b(context, 20.0f, org.telegram.ui.ActionBar.k6.f27988j5, true, e6Var);
                org.telegram.messenger.k5.m(b10, 17, null, 2131742957);
                f11.addView(b10, b8.mf.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.e6 f12 = org.telegram.messenger.i6.f((String) arrayList.get(i10));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f12);
                    org.telegram.messenger.hs.i(imageView);
                    int L = org.telegram.messenger.g0.L(80.0f);
                    int i11 = org.telegram.ui.ActionBar.k6.Ci;
                    ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)));
                    org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i11);
                    imageView.setBackground(L2);
                    org.telegram.ui.ActionBar.r6.k(imageView, L2, L3, null, e6Var);
                    if (i10 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, b8.mf.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f11.addView(linearLayout, b8.mf.t(-2, -2, 49, 32, 12, 32, 12));
                gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
                h.setText(org.telegram.messenger.bd.M0(2131742956, null));
                f11.addView(h, b8.mf.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.k6.f27824a7;
                l10.w0(i12);
                l10.P(i12);
                qc1.f48862c = l10;
                l10.show();
                h.setOnClickListener(new ai.h3(h, i3, l10, 22));
            }
        }
    }

    @Override
    public void run(long j10) {
        ip.f0((ip) this.f43941b, (TLRPC.InputCheckPasswordSRP) this.f43942c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        long j10;
        int i11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.f43940a;
        Object obj = this.d;
        Object obj2 = this.f43942c;
        Object obj3 = this.f43941b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                wm wmVar = (wm) obj;
                PhotoViewer photoViewer = ((ho0) obj3).f45959b;
                if (arrayList.size() <= 1 && ((org.telegram.messenger.pr) arrayList.get(0)).f24797a != org.telegram.messenger.h10.i(photoViewer.U).e() && charSequence == null) {
                    org.telegram.messenger.pr prVar = (org.telegram.messenger.pr) arrayList.get(0);
                    long j11 = prVar.f24797a;
                    Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.m5.C(j11)) {
                        k10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (org.telegram.messenger.m5.E(j11)) {
                        k10.putLong("user_id", j11);
                    } else {
                        k10.putLong("chat_id", -j11);
                    }
                    wm wmVar2 = new wm(k10);
                    if (prVar.f24798b != 0) {
                        rg.c.a(wmVar2, prVar);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(wmVar2, true, false)) {
                        wmVar2.dc(arrayList2);
                    } else {
                        uwVar.finishFragment();
                    }
                } else {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j12 = ((org.telegram.messenger.pr) arrayList.get(i13)).f24797a;
                        if (charSequence != null) {
                            j10 = j12;
                            org.telegram.messenger.yy.C(photoViewer.U).r0(org.telegram.messenger.wy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        org.telegram.messenger.yy.C(photoViewer.U).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    uwVar.finishFragment();
                    if (wmVar != null) {
                        wmVar.f8();
                        UndoView undoView = wmVar.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.pr) arrayList.get(0)).f24797a, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                iv0 iv0Var = (iv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uw uwVar2 = (uw) obj;
                long j13 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
                ProfileActivity profileActivity = iv0Var.f46427b;
                i11 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(-j13));
                if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().K(M0, user, new ci.i(iv0Var, j13, uwVar2, 8));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String M02 = org.telegram.messenger.bd.M0(2131754463, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M02;
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.l10.p(user), str));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754463, null), new cg.d0(iv0Var, j13, uwVar, user, 5));
                    profileActivity.showDialog(s1Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, final View view) {
        String str;
        final e7 e7Var = (e7) this.f43941b;
        org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) this.f43942c;
        z6 z6Var = (z6) this.d;
        u7 u7Var = e7Var.f44913f;
        g7 g7Var = (g7) tj0Var.getAdapter();
        final n7 n7Var = (n7) g7Var.f45561e.get(i3);
        if (!(view instanceof l7) && !(view instanceof org.telegram.ui.Cells.n7)) {
            j7 j7Var = u7Var.G;
            if (j7Var != null) {
                j7Var.a(n7Var.f47906c, n7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232420, org.telegram.messenger.bd.M0(2131752648, null), false, null).setOnClickListener(new ei.f0(e7Var, n7Var, g7Var, tj0Var, view, 5));
            str = null;
        } else if (((l7) view).f47127b.getChildAt(0) instanceof org.telegram.ui.Cells.f7) {
            str = null;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232298, org.telegram.messenger.bd.M0(2131747228, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            u7.b(e7Var2.f44913f, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.f1 f1Var = e7Var2.f44909a;
                            if (f1Var != null) {
                                f1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            e7 e7Var3 = e7Var;
                            u7.b(e7Var3.f44913f, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.f1 f1Var2 = e7Var3.f44909a;
                            if (f1Var2 != null) {
                                f1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            str = null;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232420, org.telegram.messenger.bd.M0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            u7.b(e7Var2.f44913f, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.f1 f1Var = e7Var2.f44909a;
                            if (f1Var != null) {
                                f1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            e7 e7Var3 = e7Var;
                            u7.b(e7Var3.f44913f, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.f1 f1Var2 = e7Var3.f44909a;
                            if (f1Var2 != null) {
                                f1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        di.b bVar = n7Var.d;
        if (bVar.f9181b != 0 && bVar.f9185g != 0) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232422, org.telegram.messenger.bd.M0(2131743562, str), false, null).setOnClickListener(new a0(e7Var, n7Var, z6Var, 1));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232357, org.telegram.messenger.bd.M0(!u7Var.h.f9193j.contains(n7Var.d) ? 2131745682 : 2131751459, str), false, null).setOnClickListener(new org.telegram.messenger.video.g(11, e7Var, n7Var));
        e7Var.f44909a = org.telegram.ui.Components.t4.P(z6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        u7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void h() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
