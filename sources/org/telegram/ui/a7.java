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
public final class a7 implements org.telegram.ui.Components.jk0, org.telegram.ui.Components.ti0, org.telegram.ui.Components.q4, org.telegram.messenger.qc, t4, org.telegram.ui.ActionBar.u1, org.telegram.messenger.cs, org.telegram.ui.Components.hk0, ux, gc1, org.telegram.ui.Components.voip.p2, OnSuccessListener {
    public final int f35575a;
    public final Object f35576b;
    public final Object f35577c;
    public final Object d;

    public a7(Object obj, Object obj2, Object obj3, int i10) {
        this.f35575a = i10;
        this.f35576b = obj;
        this.f35577c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean G() {
        switch (this.f35575a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f35575a) {
            case 2:
                un unVar = (un) this.f35576b;
                unVar.getClass();
                unVar.tb((TLRPC.BotInlineResult) this.f35577c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                un unVar2 = (un) this.f35576b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f35577c;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
                unVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    sf.a l4 = sf.a.l(starsAmount);
                    long j10 = i10;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (l4 != null && !l4.k()) {
                        suggestedPost2.price = l4.o();
                    }
                    if (j10 > 0) {
                        suggestedPost2.schedule_date = (int) j10;
                        suggestedPost2.flags |= 1;
                    }
                    if (jjVar != null && jjVar.f16337k != null) {
                        unVar2.getMessagesController().h(jjVar, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                un.l1((un) this.f35576b, (org.telegram.messenger.ej) this.f35577c, (org.telegram.messenger.jj) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean N(ay ayVar) {
        switch (this.f35575a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        un unVar = (un) this.f35576b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f35577c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.cd.D0().f15003y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !e01.c0().contains(str))) {
            f0Var.setOnClickListener(new bi.c(unVar, str, language, charSequence, f0Var, 3));
        } else {
            f0Var.setClickable(false);
        }
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        b50.I0((b50) this.f35576b, (Activity) this.f35577c, (org.telegram.messenger.u3) this.d, view, i10);
    }

    @Override
    public void c(org.telegram.ui.Components.vi0 vi0Var, int i10) {
        int i11;
        View view = (View) this.f35576b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35577c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(vi0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.m5.C(52.0f, i11, i10), true);
    }

    @Override
    public void d(b5 b5Var) {
        switch (this.f35575a) {
            case 6:
                fn fnVar = (fn) this.f35576b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f35577c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = b5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                fnVar.f37301a.Ca(user);
                                return;
                            }
                            return;
                        }
                        fnVar.b(user);
                        return;
                    }
                    fnVar.m(q1Var, user);
                    return;
                }
                fnVar.r(user, false);
                return;
            default:
                fn fnVar2 = (fn) this.f35576b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f35577c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = b5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                fnVar2.f37301a.Aa(chat);
                                return;
                            }
                            return;
                        }
                        fnVar2.a(chat);
                        return;
                    }
                    fnVar2.k(q1Var2, chat, 0, false);
                    return;
                }
                fnVar2.p(chat);
                return;
        }
    }

    public boolean e(TLRPC.Message message) {
        sm0 sm0Var = (sm0) this.f35576b;
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) this.f35577c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.jj.C1(message.peer_id) == sm0Var.f41567l0.f19942id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            org.telegram.messenger.i0.g3(new w50(sm0Var, z4Var, activity, message, 15));
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        String str;
        int i11;
        switch (this.f35575a) {
            case 8:
                zo zoVar = (zo) this.f35576b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f35577c;
                View view = (View) this.d;
                cp cpVar = zoVar.f44204a.f36291h3;
                if (tL_username.editable) {
                    if (cpVar.f36518r0 == null) {
                        cpVar.f36518r0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = cpVar.X;
                    tL_inputChannel.channel_id = chat.f19793id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    cpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new org.telegram.messenger.s6(zoVar, tL_channels_toggleUsername, tL_username, z10, 3));
                    cpVar.P.add(tL_username.username);
                    ((la) view).setLoading(true);
                }
                cpVar.a0();
                return;
            case 9:
                qp qpVar = (qp) this.f35576b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                qpVar.getClass();
                if (((TLRPC.ChatFull) this.f35577c).hidden_prehistory) {
                    qpVar.getMessagesController().Y4(chat2.f19793id, false);
                }
                qpVar.c0(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                x71 x71Var = (x71) this.f35576b;
                boolean z11 = true;
                if (org.telegram.ui.ActionBar.t6.l0(((z71) this.f35577c).d, (org.telegram.ui.ActionBar.r6) this.d, true)) {
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                    org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
                    if (x71Var.e.f34095f != 1) {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.t6.K1(s6Var, z11, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35576b;
                TLRPC.User user = (TLRPC.User) this.f35577c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.k0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35576b;
                org.telegram.messenger.tz.f18150h0 = (String) this.f35577c;
                org.telegram.messenger.tz.y();
                org.telegram.messenger.tz.f18134b = false;
                dataSettingsActivity.r0(dataSettingsActivity.f33315n);
                org.telegram.messenger.hc.D().i(new zt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f20134a.N0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f35577c;
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f20134a.N0.run();
                iz izVar = ((gz) this.f35576b).E.f38061c;
                izVar.d.title = editTextBoldCursor.getText().toString();
                izVar.h0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = izVar.d;
                if (izVar.E != 0) {
                    izVar.getConnectionsManager().cancelRequest(izVar.E, true);
                    izVar.E = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = izVar.f38380c.f14645a;
                tL_chatlists_editExportedInvite.slug = izVar.f0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                izVar.E = izVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new wy(izVar, 1));
                org.telegram.messenger.q20 q20Var = izVar.f38387y;
                if (q20Var != null) {
                    q20Var.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f35577c;
                org.telegram.messenger.i0.v1(editTextBoldCursor2);
                org.telegram.messenger.u3 u3Var = ((f40) this.f35576b).f37176b.R2;
                String obj = editTextBoldCursor2.getText().toString();
                u3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = u3Var.g(u3Var.f18227a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(u3Var.C.f14863a).sendRequest(editgroupcalltitle, new org.telegram.messenger.m3(u3Var, 1));
                ((AlertDialog$Builder) this.d).f20134a.N0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f35576b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f35577c, (ArrayList) this.d, false));
                return;
            case 21:
                m41 m41Var = (m41) this.f35577c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.k2) m41Var.f39474a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new ul0(10, m41Var, tL_authorization));
                ((b41) this.f35576b).d.dismiss();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void j(org.telegram.ui.Components.voip.q2 q2Var) {
        String L0;
        be1 be1Var = (be1) this.f35576b;
        VoIPService voIPService = (VoIPService) this.f35577c;
        org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.i0.r(be1Var.S0);
            be1Var.R0 = false;
            if (be1Var.f36237w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    L0 = org.telegram.messenger.cd.L0(2131754731, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131754730, null);
                }
                q2Var.announceForAccessibility(L0);
            }
            r2Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((s31) this.f35576b).e1((TLRPC.User) this.f35577c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.p6 p6Var;
        float f7;
        bh.d dVar = (bh.d) this.f35576b;
        Integer num = (Integer) obj;
        org.telegram.messenger.f8.b("wear-auth: /answer delivered to " + ((String) dVar.f2779c));
        ((vh.d) this.f35577c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) dVar.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = org.telegram.messenger.w0.f19025b;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    p6Var = T.getResourceProvider();
                } else {
                    p6Var = null;
                }
                org.telegram.ui.ActionBar.z2 z2Var = se1.f41494c;
                if (z2Var != null) {
                    z2Var.dismiss();
                    se1.f41494c = null;
                }
                org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                k10.N = frameLayout;
                LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
                frameLayout.addView(f10, w7.b6.e(-1, -1, 119));
                TextView b10 = w7.g6.b(context, 20.0f, org.telegram.ui.ActionBar.t6.f21037j5, true, p6Var);
                org.telegram.messenger.m5.l(b10, 17, null, 2131742973);
                f10.addView(b10, w7.b6.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.g6 f11 = org.telegram.messenger.k6.f((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f11);
                    org.telegram.messenger.zs.i(imageView);
                    int L = org.telegram.messenger.i0.L(80.0f);
                    int i12 = org.telegram.ui.ActionBar.t6.Ci;
                    ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
                    org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.15f, i12);
                    imageView.setBackground(L2);
                    org.telegram.ui.ActionBar.a7.k(imageView, L2, L3, null, p6Var);
                    if (i11 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.b6.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f10.addView(linearLayout, w7.b6.t(-2, -2, 49, 32, 12, 32, 12));
                vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
                i13.setText(org.telegram.messenger.cd.L0(2131742972, null));
                f10.addView(i13, w7.b6.t(-1, 48, 7, 12, 12, 12, 8));
                int i14 = org.telegram.ui.ActionBar.t6.f20872a7;
                k10.w0(i14);
                k10.Q(i14);
                se1.f41494c = k10;
                k10.show();
                i13.setOnClickListener(new jg.w1(i13, i10, k10, 20));
            }
        }
    }

    @Override
    public void run(long j10) {
        iq.e0((iq) this.f35576b, (TLRPC.InputCheckPasswordSRP) this.f35577c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f35575a;
        Object obj = this.d;
        Object obj2 = this.f35577c;
        Object obj3 = this.f35576b;
        switch (i13) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                un unVar = (un) obj;
                PhotoViewer photoViewer = ((aq0) obj3).f35697b;
                if (arrayList.size() <= 1 && ((org.telegram.messenger.gs) arrayList.get(0)).f15760a != org.telegram.messenger.d20.i(photoViewer.T).e() && charSequence == null) {
                    org.telegram.messenger.gs gsVar = (org.telegram.messenger.gs) arrayList.get(0);
                    long j11 = gsVar.f15760a;
                    Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                    if (org.telegram.messenger.o5.C(j11)) {
                        g10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (org.telegram.messenger.o5.E(j11)) {
                        g10.putLong("user_id", j11);
                    } else {
                        g10.putLong("chat_id", -j11);
                    }
                    un unVar2 = new un(g10);
                    if (gsVar.f15761b != 0) {
                        gg.e.a(unVar2, gsVar);
                    }
                    if (((LaunchActivity) photoViewer.D).u0(unVar2, true, false)) {
                        unVar2.Tb(arrayList2);
                    } else {
                        ayVar.finishFragment();
                    }
                } else {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j12 = ((org.telegram.messenger.gs) arrayList.get(i14)).f15760a;
                        if (charSequence != null) {
                            j10 = j12;
                            org.telegram.messenger.qz.C(photoViewer.T).r0(org.telegram.messenger.oz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        org.telegram.messenger.qz.C(photoViewer.T).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    ayVar.finishFragment();
                    if (unVar != null) {
                        unVar.Y7();
                        UndoView undoView = unVar.M3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.gs) arrayList.get(0)).f15760a, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                dx0 dx0Var = (dx0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ay ayVar2 = (ay) obj;
                long j13 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
                ProfileActivity profileActivity = dx0Var.f36859b;
                i12 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-j13));
                if (L0 != null && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().K(false, L0, user, new org.telegram.messenger.voip.d0(dx0Var, j13, ayVar2, 5));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33950z0);
                    String L02 = org.telegram.messenger.cd.L0(2131754463, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L02;
                    if (L0 == null) {
                        str = "";
                    } else {
                        str = L0.title;
                    }
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.h20.p(user), str));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754463, null), new vg(dx0Var, j13, ayVar, user, 2));
                    profileActivity.showDialog(x1Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, final View view) {
        String str;
        final d7 d7Var = (d7) this.f35576b;
        org.telegram.ui.Components.tk0 tk0Var = (org.telegram.ui.Components.tk0) this.f35577c;
        y6 y6Var = (y6) this.d;
        t7 t7Var = d7Var.f36633f;
        f7 f7Var = (f7) tk0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.e.get(i10);
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.s7)) {
            i7 i7Var = t7Var.F;
            if (i7Var != null) {
                i7Var.a(m7Var.f39493c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232419, org.telegram.messenger.cd.L0(2131752648, null), false, null).setOnClickListener(new bi.c(d7Var, m7Var, f7Var, tk0Var, view, 1));
            str = null;
        } else if (((k7) view).f38710b.getChildAt(0) instanceof org.telegram.ui.Cells.k7) {
            str = null;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232297, org.telegram.messenger.cd.L0(2131747235, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            t7.b(d7Var2.f36633f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.k1 k1Var = d7Var2.f36630a;
                            if (k1Var != null) {
                                k1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            t7.b(d7Var3.f36633f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.k1 k1Var2 = d7Var3.f36630a;
                            if (k1Var2 != null) {
                                k1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            str = null;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232419, org.telegram.messenger.cd.L0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            t7.b(d7Var2.f36633f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.k1 k1Var = d7Var2.f36630a;
                            if (k1Var != null) {
                                k1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            t7.b(d7Var3.f36633f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.k1 k1Var2 = d7Var3.f36630a;
                            if (k1Var2 != null) {
                                k1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        sh.a aVar = m7Var.d;
        if (aVar.f48493b != 0 && aVar.f48496g != 0) {
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232421, org.telegram.messenger.cd.L0(2131743578, str), false, null).setOnClickListener(new x(d7Var, m7Var, y6Var, 1));
        }
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232356, org.telegram.messenger.cd.L0(!t7Var.h.f48503j.contains(m7Var.d) ? 2131745689 : 2131751459, str), false, null).setOnClickListener(new ag.t0(27, d7Var, m7Var));
        d7Var.f36630a = org.telegram.ui.Components.s4.P(y6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        t7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void g() {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
