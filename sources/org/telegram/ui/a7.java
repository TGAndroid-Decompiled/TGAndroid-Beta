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
public final class a7 implements org.telegram.ui.Components.jj0, org.telegram.ui.Components.th0, org.telegram.ui.Components.r4, org.telegram.messenger.oc, u4, org.telegram.ui.ActionBar.q1, org.telegram.messenger.qr, org.telegram.ui.Components.hj0, sw, ka1, org.telegram.ui.Components.voip.d3, OnSuccessListener {
    public final int f44947a;
    public final Object f44948b;
    public final Object f44949c;
    public final Object d;

    public a7(Object obj, Object obj2, Object obj3, int i7) {
        this.f44947a = i7;
        this.f44948b = obj;
        this.f44949c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean H() {
        switch (this.f44947a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f44947a) {
            case 2:
                an anVar = (an) this.f44948b;
                anVar.getClass();
                anVar.Hb((TLRPC.BotInlineResult) this.f44949c, z10, i7, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                an anVar2 = (an) this.f44948b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f44949c;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
                anVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    cg.a l10 = cg.a.l(starsAmount);
                    long j3 = i7;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (l10 != null && !l10.k()) {
                        suggestedPost2.price = l10.o();
                    }
                    if (j3 > 0) {
                        suggestedPost2.schedule_date = (int) j3;
                        suggestedPost2.flags |= 1;
                    }
                    if (gjVar != null && gjVar.f23819k != null) {
                        anVar2.getMessagesController().h(gjVar, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                an.C0((an) this.f44948b, (org.telegram.messenger.bj) this.f44949c, (org.telegram.messenger.gj) this.d, i7, i10);
                return;
        }
    }

    @Override
    public boolean P(yw ywVar) {
        switch (this.f44947a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        an anVar = (an) this.f44948b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f44949c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.hd.E0().f24132y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !oy0.d0().contains(str))) {
            f0Var.setOnClickListener(new fi.d0(anVar, str, language, charSequence, f0Var, 7));
        } else {
            f0Var.setClickable(false);
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vh0 vh0Var, int i7) {
        int i10;
        View view = (View) this.f44948b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44949c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(vh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.k5.C(52.0f, i10, i7), true);
    }

    @Override
    public void c(c5 c5Var) {
        switch (this.f44947a) {
            case 6:
                lm lmVar = (lm) this.f44948b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f44949c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                lmVar.f49001a.Pa(user);
                                return;
                            }
                            return;
                        }
                        lmVar.b(user);
                        return;
                    }
                    lmVar.l(q1Var, user);
                    return;
                }
                lmVar.q(user, false);
                return;
            default:
                lm lmVar2 = (lm) this.f44948b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44949c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                lmVar2.f49001a.Na(chat);
                                return;
                            }
                            return;
                        }
                        lmVar2.a(chat);
                        return;
                    }
                    lmVar2.i(q1Var2, chat, 0, false);
                    return;
                }
                lmVar2.n(chat);
                return;
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.e3 e3Var) {
        String M0;
        ec1 ec1Var = (ec1) this.f44948b;
        VoIPService voIPService = (VoIPService) this.f44949c;
        org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(ec1Var.S0);
            ec1Var.R0 = false;
            if (ec1Var.f46712w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    M0 = org.telegram.messenger.hd.M0(2131754731, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754730, null);
                }
                e3Var.announceForAccessibility(M0);
            }
            f3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    public boolean e(TLRPC.Message message) {
        kl0 kl0Var = (kl0) this.f44948b;
        org.telegram.ui.ActionBar.o4 o4Var = (org.telegram.ui.ActionBar.o4) this.f44949c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.gj.B1(message.peer_id) == kl0Var.m0.f28200id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80(kl0Var, o4Var, activity, message, 29));
            return true;
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        c40.I0((c40) this.f44948b, (Activity) this.f44949c, (org.telegram.messenger.r3) this.d, view, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str;
        int i10;
        switch (this.f44947a) {
            case 8:
                eo eoVar = (eo) this.f44948b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f44949c;
                View view = (View) this.d;
                ho hoVar = eoVar.f46872a.f47487i3;
                if (tL_username.editable) {
                    if (hoVar.f47773s0 == null) {
                        hoVar.f47773s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = hoVar.Y;
                    tL_inputChannel.channel_id = chat.f28051id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    hoVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new di.f3(eoVar, tL_channels_toggleUsername, tL_username, z10, 5));
                    hoVar.Q.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                hoVar.b0();
                return;
            case 9:
                to toVar = (to) this.f44948b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                toVar.getClass();
                if (((TLRPC.ChatFull) this.f44949c).hidden_prehistory) {
                    toVar.getMessagesController().c5(chat2.f28051id, false);
                }
                toVar.d0(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                c61 c61Var = (c61) this.f44948b;
                boolean z11 = true;
                if (org.telegram.ui.ActionBar.j6.l0(((e61) this.f44949c).d, (org.telegram.ui.ActionBar.g6) this.d, true)) {
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                    org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                    if (c61Var.f46027e.f43393f != 1) {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.j6.K1(i6Var, z11, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44948b;
                TLRPC.User user = (TLRPC.User) this.f44949c;
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f44948b;
                org.telegram.messenger.gz.f23952h0 = (String) this.f44949c;
                org.telegram.messenger.gz.y();
                org.telegram.messenger.gz.f23935b = false;
                dataSettingsActivity.s0(dataSettingsActivity.f42573n);
                org.telegram.messenger.fc.D().i(new zs(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f28392a.M0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f44949c;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f28392a.M0.run();
                hy hyVar = ((fy) this.f44948b).F.f47540c;
                hyVar.d.title = editTextBoldCursor.getText().toString();
                hyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hyVar.d;
                if (hyVar.F != 0) {
                    hyVar.getConnectionsManager().cancelRequest(hyVar.F, true);
                    hyVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = hyVar.f47834c.f26552a;
                tL_chatlists_editExportedInvite.slug = hyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                hyVar.F = hyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ux(hyVar, 1));
                org.telegram.messenger.z10 z10Var = hyVar.f47842y;
                if (z10Var != null) {
                    z10Var.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f44949c;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.r3 r3Var = ((h30) this.f44948b).f47588b.V2;
                String obj = editTextBoldCursor2.getText().toString();
                r3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = r3Var.g(r3Var.f26215a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(r3Var.C.f22782a).sendRequest(editgroupcalltitle, new org.telegram.messenger.k3(r3Var, 1));
                ((AlertDialog$Builder) this.d).f28392a.M0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f44948b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f44949c, (ArrayList) this.d, false));
                return;
            case 21:
                s21 s21Var = (s21) this.f44949c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.e2) s21Var.f51078a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new b00(28, s21Var, tL_authorization));
                ((h21) this.f44948b).d.dismiss();
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((x11) this.f44948b).e1((TLRPC.User) this.f44949c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        a8.r7 r7Var = (a8.r7) this.f44948b;
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) r7Var.d));
        ((hi.d) this.f44949c).setLoading(false);
        int i7 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) r7Var.f620f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26609b;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    e6Var = T.getResourceProvider();
                } else {
                    e6Var = null;
                }
                org.telegram.ui.ActionBar.u2 u2Var = vc1.f52195c;
                if (u2Var != null) {
                    u2Var.dismiss();
                    vc1.f52195c = null;
                }
                org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                k10.O = frameLayout;
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                frameLayout.addView(f11, c8.ja.e(-1, -1, 119));
                TextView b10 = c8.sa.b(context, 20.0f, org.telegram.ui.ActionBar.j6.f28957j5, true, e6Var);
                org.telegram.messenger.k5.l(b10, 17, null, 2131742947);
                f11.addView(b10, c8.ja.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.f6 f12 = org.telegram.messenger.j6.f((String) arrayList.get(i10));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f12);
                    org.telegram.messenger.ns.i(imageView);
                    int L = org.telegram.messenger.g0.L(80.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.Fi;
                    ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.r1(0.15f, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)));
                    org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.15f, i11);
                    imageView.setBackground(L2);
                    org.telegram.ui.ActionBar.q6.j(imageView, L2, K, null, e6Var);
                    if (i10 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, c8.ja.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f11.addView(linearLayout, c8.ja.t(-2, -2, 49, 32, 12, 32, 12));
                hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
                g10.setText(org.telegram.messenger.hd.M0(2131742946, null));
                f11.addView(g10, c8.ja.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.j6.f28792a7;
                k10.w0(i12);
                k10.Q(i12);
                vc1.f52195c = k10;
                k10.show();
                g10.setOnClickListener(new bi.x2(g10, i7, k10, 23));
            }
        }
    }

    @Override
    public void run(long j3) {
        mp.f0((mp) this.f44948b, (TLRPC.InputCheckPasswordSRP) this.f44949c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        long j3;
        int i11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.f44947a;
        Object obj = this.d;
        Object obj2 = this.f44949c;
        Object obj3 = this.f44948b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                an anVar = (an) obj;
                PhotoViewer photoViewer = ((oo0) obj3).f50016b;
                if (arrayList.size() <= 1 && ((org.telegram.messenger.ur) arrayList.get(0)).f26861a != org.telegram.messenger.m10.i(photoViewer.U).e() && charSequence == null) {
                    org.telegram.messenger.ur urVar = (org.telegram.messenger.ur) arrayList.get(0);
                    long j10 = urVar.f26861a;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.m5.C(j10)) {
                        k10.putInt("enc_id", (int) (j10 & 4294967295L));
                    } else if (org.telegram.messenger.m5.E(j10)) {
                        k10.putLong("user_id", j10);
                    } else {
                        k10.putLong("chat_id", -j10);
                    }
                    an anVar2 = new an(k10);
                    if (urVar.f26862b != 0) {
                        qg.c.a(anVar2, urVar);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(anVar2, true, false)) {
                        anVar2.hc(arrayList2);
                    } else {
                        ywVar.finishFragment();
                    }
                } else {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j11 = ((org.telegram.messenger.ur) arrayList.get(i13)).f26861a;
                        if (charSequence != null) {
                            j3 = j11;
                            org.telegram.messenger.ez.C(photoViewer.U).r0(org.telegram.messenger.cz.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j11;
                        }
                        org.telegram.messenger.ez.C(photoViewer.U).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    ywVar.finishFragment();
                    if (anVar != null) {
                        anVar.h8();
                        UndoView undoView = anVar.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.ur) arrayList.get(0)).f26861a, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                pv0 pv0Var = (pv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                yw ywVar2 = (yw) obj;
                long j12 = ((org.telegram.messenger.ur) arrayList.get(0)).f26861a;
                ProfileActivity profileActivity = pv0Var.f50374b;
                i11 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(-j12));
                if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().K(M0, user, new di.h(pv0Var, j12, ywVar2, 8));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String M02 = org.telegram.messenger.hd.M0(2131754463, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M02;
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.q10.p(user), str));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754463, null), new bg.e0(pv0Var, j12, ywVar, user, 5));
                    profileActivity.showDialog(t1Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, final View view) {
        String str;
        final d7 d7Var = (d7) this.f44948b;
        org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) this.f44949c;
        y6 y6Var = (y6) this.d;
        t7 t7Var = d7Var.f46298f;
        f7 f7Var = (f7) uj0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.f47004e.get(i7);
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.n7)) {
            i7 i7Var = t7Var.G;
            if (i7Var != null) {
                i7Var.N(m7Var.f49142c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232421, org.telegram.messenger.hd.M0(2131752648, null), false, null).setOnClickListener(new fi.d0(d7Var, m7Var, f7Var, uj0Var, view, 5));
            str = null;
        } else if (((k7) view).f48559b.getChildAt(0) instanceof org.telegram.ui.Cells.f7) {
            str = null;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232299, org.telegram.messenger.hd.M0(2131747220, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            t7.b(d7Var2.f46298f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var = d7Var2.f46294a;
                            if (g1Var != null) {
                                g1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            t7.b(d7Var3.f46298f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var2 = d7Var3.f46294a;
                            if (g1Var2 != null) {
                                g1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            str = null;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232421, org.telegram.messenger.hd.M0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            t7.b(d7Var2.f46298f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var = d7Var2.f46294a;
                            if (g1Var != null) {
                                g1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            t7.b(d7Var3.f46298f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var2 = d7Var3.f46294a;
                            if (g1Var2 != null) {
                                g1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ei.b bVar = m7Var.d;
        if (bVar.f10647b != 0 && bVar.f10651g != 0) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232423, org.telegram.messenger.hd.M0(2131743552, str), false, null).setOnClickListener(new y(d7Var, m7Var, y6Var, 1));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232358, org.telegram.messenger.hd.M0(!t7Var.h.f10659j.contains(m7Var.d) ? 2131745672 : 2131751458, str), false, null).setOnClickListener(new org.telegram.messenger.video.e(12, d7Var, m7Var));
        d7Var.f46294a = org.telegram.ui.Components.t4.N(y6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        t7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
