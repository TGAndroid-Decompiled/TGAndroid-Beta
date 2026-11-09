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
public final class a7 implements org.telegram.ui.Components.fj0, org.telegram.ui.Components.qh0, org.telegram.ui.Components.t4, org.telegram.messenger.pc, u4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, org.telegram.ui.Components.dj0, sw, oa1, org.telegram.ui.Components.voip.z2, OnSuccessListener {
    public final int f43601a;
    public final Object f43602b;
    public final Object f43603c;
    public final Object d;

    public a7(Object obj, Object obj2, Object obj3, int i7) {
        this.f43601a = i7;
        this.f43602b = obj;
        this.f43603c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean G() {
        switch (this.f43601a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f43601a) {
            case 2:
                cn cnVar = (cn) this.f43602b;
                cnVar.getClass();
                cnVar.Gb((TLRPC.BotInlineResult) this.f43603c, z9, i7, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                cn cnVar2 = (cn) this.f43602b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f43603c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                cnVar2.getClass();
                if (z9) {
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
                    if (ijVar != null && ijVar.f23262k != null) {
                        cnVar2.getMessagesController().h(ijVar, suggestedPost2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                cn.C0((cn) this.f43602b, (org.telegram.messenger.dj) this.f43603c, (org.telegram.messenger.ij) this.d, i7, i10);
                return;
        }
    }

    @Override
    public boolean N(yw ywVar) {
        switch (this.f43601a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        cn cnVar = (cn) this.f43602b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f43603c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.id.E0().f23185y.getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !ty0.d0().contains(str))) {
            f0Var.setOnClickListener(new di.d0(cnVar, str, language, charSequence, f0Var, 7));
        } else {
            f0Var.setClickable(false);
        }
    }

    @Override
    public void b(org.telegram.ui.Components.sh0 sh0Var, int i7) {
        int i10;
        View view = (View) this.f43602b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43603c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(sh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.k5.C(52.0f, i10, i7), true);
    }

    @Override
    public void c(c5 c5Var) {
        switch (this.f43601a) {
            case 6:
                nm nmVar = (nm) this.f43602b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f43603c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                nmVar.f48207a.Oa(user);
                                return;
                            }
                            return;
                        }
                        nmVar.b(user);
                        return;
                    }
                    nmVar.l(q1Var, user);
                    return;
                }
                nmVar.q(user, false);
                return;
            default:
                nm nmVar2 = (nm) this.f43602b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f43603c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                nmVar2.f48207a.Ma(chat);
                                return;
                            }
                            return;
                        }
                        nmVar2.a(chat);
                        return;
                    }
                    nmVar2.i(q1Var2, chat, 0, false);
                    return;
                }
                nmVar2.m(chat);
                return;
        }
    }

    @Override
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        String M0;
        ic1 ic1Var = (ic1) this.f43602b;
        VoIPService voIPService = (VoIPService) this.f43603c;
        org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(ic1Var.R0);
            ic1Var.Q0 = false;
            if (ic1Var.f46610v0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    M0 = org.telegram.messenger.id.M0(2131754731, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131754730, null);
                }
                a3Var.announceForAccessibility(M0);
            }
            b3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    public boolean e(TLRPC.Message message) {
        jl0 jl0Var = (jl0) this.f43602b;
        org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.f43603c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.ij.B1(message.peer_id) == jl0Var.f47015l0.f27105id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0(jl0Var, q4Var, activity, message, 25));
            return true;
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        e40.I0((e40) this.f43602b, (Activity) this.f43603c, (org.telegram.messenger.r3) this.d, view, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str;
        int i10;
        switch (this.f43601a) {
            case 8:
                fo foVar = (fo) this.f43602b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f43603c;
                View view = (View) this.d;
                io ioVar = foVar.f45769a.f46362h3;
                if (tL_username.editable) {
                    if (ioVar.f46731r0 == null) {
                        ioVar.f46731r0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = ioVar.X;
                    tL_inputChannel.channel_id = chat.f26956id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z9 = tL_username.active;
                    tL_channels_toggleUsername.active = !z9;
                    ioVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new bi.d4(foVar, tL_channels_toggleUsername, tL_username, z9, 5));
                    ioVar.P.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                ioVar.b0();
                return;
            case 9:
                uo uoVar = (uo) this.f43602b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                uoVar.getClass();
                if (((TLRPC.ChatFull) this.f43603c).hidden_prehistory) {
                    uoVar.getMessagesController().b5(chat2.f26956id, false);
                }
                uoVar.d0(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                g61 g61Var = (g61) this.f43602b;
                boolean z10 = true;
                if (org.telegram.ui.ActionBar.l6.l0(((i61) this.f43603c).d, (org.telegram.ui.ActionBar.i6) this.d, true)) {
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                    org.telegram.ui.ActionBar.k6 k6Var = org.telegram.ui.ActionBar.l6.I;
                    if (g61Var.f45922e.f42027f != 1) {
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.l6.K1(k6Var, z10, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43602b;
                TLRPC.User user = (TLRPC.User) this.f43603c;
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f43602b;
                org.telegram.messenger.iz.f23405h0 = (String) this.f43603c;
                org.telegram.messenger.iz.y();
                org.telegram.messenger.iz.f23388b = false;
                dataSettingsActivity.s0(dataSettingsActivity.f41226n);
                org.telegram.messenger.gc.D().i(new ys(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f27296a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f43603c;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f27296a.L0.run();
                iy iyVar = ((gy) this.f43602b).E.f46425c;
                iyVar.d.title = editTextBoldCursor.getText().toString();
                iyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = iyVar.d;
                if (iyVar.E != 0) {
                    iyVar.getConnectionsManager().cancelRequest(iyVar.E, true);
                    iyVar.E = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = iyVar.f46776c.f26070a;
                tL_chatlists_editExportedInvite.slug = iyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                iyVar.E = iyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vx(iyVar, 1));
                org.telegram.messenger.c20 c20Var = iyVar.f46784y;
                if (c20Var != null) {
                    c20Var.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f43603c;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.r3 r3Var = ((j30) this.f43602b).f46823b.R2;
                String obj = editTextBoldCursor2.getText().toString();
                r3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = r3Var.g(r3Var.f25221a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(r3Var.C.f21765a).sendRequest(editgroupcalltitle, new org.telegram.messenger.k3(r3Var, 1));
                ((AlertDialog$Builder) this.d).f27296a.L0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f43602b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f43603c, (ArrayList) this.d, false));
                return;
            case 21:
                x21 x21Var = (x21) this.f43603c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.f2) x21Var.f51531a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new j50(26, x21Var, tL_authorization));
                ((m21) this.f43602b).d.dismiss();
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((c21) this.f43602b).e1((TLRPC.User) this.f43603c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        a8.r7 r7Var = (a8.r7) this.f43602b;
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) r7Var.d));
        ((fi.d) this.f43603c).setLoading(false);
        int i7 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) r7Var.f617f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = org.telegram.messenger.t0.f25566b;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    g6Var = T.getResourceProvider();
                } else {
                    g6Var = null;
                }
                org.telegram.ui.ActionBar.v2 v2Var = yc1.f52085c;
                if (v2Var != null) {
                    v2Var.dismiss();
                    yc1.f52085c = null;
                }
                org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                l10.N = frameLayout;
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                frameLayout.addView(f11, c8.ha.e(-1, -1, 119));
                TextView b10 = c8.qa.b(context, 20.0f, org.telegram.ui.ActionBar.l6.f27973j5, true, g6Var);
                org.telegram.messenger.k5.m(b10, 17, null, 2131742947);
                f11.addView(b10, c8.ha.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.e6 f12 = org.telegram.messenger.i6.f((String) arrayList.get(i10));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f12);
                    org.telegram.messenger.qs.i(imageView);
                    int L = org.telegram.messenger.g0.L(80.0f);
                    int i11 = org.telegram.ui.ActionBar.l6.Ci;
                    ShapeDrawable L2 = org.telegram.ui.ActionBar.l6.L(L, org.telegram.ui.ActionBar.l6.r1(0.15f, org.telegram.ui.ActionBar.l6.w0(i11, g6Var)));
                    org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.15f, i11);
                    imageView.setBackground(L2);
                    org.telegram.ui.ActionBar.s6.j(imageView, L2, K, null, g6Var);
                    if (i10 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, c8.ha.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f11.addView(linearLayout, c8.ha.t(-2, -2, 49, 32, 12, 32, 12));
                fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
                h.setText(org.telegram.messenger.id.M0(2131742946, null));
                f11.addView(h, c8.ha.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.l6.f27809a7;
                l10.w0(i12);
                l10.P(i12);
                yc1.f52085c = l10;
                l10.show();
                h.setOnClickListener(new bi.la(h, i7, l10, 20));
            }
        }
    }

    @Override
    public void run(long j3) {
        mp.f0((mp) this.f43602b, (TLRPC.InputCheckPasswordSRP) this.f43603c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        long j3;
        int i11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.f43601a;
        Object obj = this.d;
        Object obj2 = this.f43603c;
        Object obj3 = this.f43602b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                cn cnVar = (cn) obj;
                PhotoViewer photoViewer = ((so0) obj3).f49967b;
                if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).f26520a != org.telegram.messenger.p10.i(photoViewer.T).e() && charSequence == null) {
                    org.telegram.messenger.xr xrVar = (org.telegram.messenger.xr) arrayList.get(0);
                    long j10 = xrVar.f26520a;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.m5.C(j10)) {
                        k10.putInt("enc_id", (int) (j10 & 4294967295L));
                    } else if (org.telegram.messenger.m5.E(j10)) {
                        k10.putLong("user_id", j10);
                    } else {
                        k10.putLong("chat_id", -j10);
                    }
                    cn cnVar2 = new cn(k10);
                    if (xrVar.f26521b != 0) {
                        qg.d.a(cnVar2, xrVar);
                    }
                    if (((LaunchActivity) photoViewer.D).u0(cnVar2, true, false)) {
                        cnVar2.gc(arrayList2);
                    } else {
                        ywVar.finishFragment();
                    }
                } else {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j11 = ((org.telegram.messenger.xr) arrayList.get(i13)).f26520a;
                        if (charSequence != null) {
                            j3 = j11;
                            org.telegram.messenger.gz.C(photoViewer.T).r0(org.telegram.messenger.ez.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j11;
                        }
                        org.telegram.messenger.gz.C(photoViewer.T).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    ywVar.finishFragment();
                    if (cnVar != null) {
                        cnVar.g8();
                        UndoView undoView = cnVar.M3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.xr) arrayList.get(0)).f26520a, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                tv0 tv0Var = (tv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                yw ywVar2 = (yw) obj;
                long j12 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
                ProfileActivity profileActivity = tv0Var.f50246b;
                i11 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-j12));
                if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().K(M0, user, new bi.i(tv0Var, j12, ywVar2, 8));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41876z0);
                    String M02 = org.telegram.messenger.id.M0(2131754463, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M02;
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.t10.p(user), str));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754463, null), new bg.e0(tv0Var, j12, ywVar, user, 5));
                    profileActivity.showDialog(u1Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, final View view) {
        String str;
        final d7 d7Var = (d7) this.f43602b;
        org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) this.f43603c;
        y6 y6Var = (y6) this.d;
        t7 t7Var = d7Var.f44872f;
        f7 f7Var = (f7) qj0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.f45604e.get(i7);
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.o7)) {
            i7 i7Var = t7Var.F;
            if (i7Var != null) {
                i7Var.o(m7Var.f47784c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232420, org.telegram.messenger.id.M0(2131752648, null), false, null).setOnClickListener(new di.d0(d7Var, m7Var, f7Var, qj0Var, view, 5));
            str = null;
        } else if (((k7) view).f47216b.getChildAt(0) instanceof org.telegram.ui.Cells.g7) {
            str = null;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232298, org.telegram.messenger.id.M0(2131747220, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            t7.b(d7Var2.f44872f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var = d7Var2.f44868a;
                            if (g1Var != null) {
                                g1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            t7.b(d7Var3.f44872f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var2 = d7Var3.f44868a;
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
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232420, org.telegram.messenger.id.M0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            t7.b(d7Var2.f44872f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var = d7Var2.f44868a;
                            if (g1Var != null) {
                                g1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            t7.b(d7Var3.f44872f, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.g1 g1Var2 = d7Var3.f44868a;
                            if (g1Var2 != null) {
                                g1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ci.b bVar = m7Var.d;
        if (bVar.f6416b != 0 && bVar.f6420g != 0) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232422, org.telegram.messenger.id.M0(2131743552, str), false, null).setOnClickListener(new z(d7Var, m7Var, y6Var, 1));
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232357, org.telegram.messenger.id.M0(!t7Var.h.f6428j.contains(m7Var.d) ? 2131745672 : 2131751458, str), false, null).setOnClickListener(new org.telegram.ui.ActionBar.l1(5, d7Var, m7Var));
        d7Var.f44868a = org.telegram.ui.Components.v4.N(y6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
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
