package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oj extends org.telegram.ui.ActionBar.j {
    public final Context f36361a;
    public final bo f36362b;

    public oj(bo boVar, Context context) {
        this.f36362b = boVar;
        this.f36361a = context;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        boolean z12;
        boolean z13;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i12;
        int i13;
        ?? r92;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f36362b;
        SparseArray[] sparseArrayArr = boVar.Y5;
        SparseArray[] sparseArrayArr2 = boVar.X5;
        SparseArray[] sparseArrayArr3 = boVar.W5;
        long j3 = 0;
        if (i10 == -1) {
            if (!boVar.wc.f13985f) {
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                if (kVar.s()) {
                    boVar.z7(false);
                } else if (boVar.R3 == 5 && (boVar.f32469u6.isEmpty() || boVar.f32257d4 == 0)) {
                    boVar.Qb();
                } else if (boVar.R3 == 6 && boVar.Y.w()) {
                    boVar.wb(new Runnable(this) {
                        public final oj f35560b;

                        {
                            this.f35560b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f35560b.f36362b.finishFragment();
                                    return;
                                default:
                                    oj ojVar = this.f35560b;
                                    ojVar.getClass();
                                    bo boVar2 = ojVar.f36362b;
                                    Intent intent = new Intent(boVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", boVar2.P3.link);
                                    boVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!boVar.X6(true, true)) {
                    boVar.finishFragment();
                }
            } else {
                boVar.ta();
            }
        } else if (i10 == 59) {
            if (boVar.getUserConfig().getClientUserId() == boVar.T5) {
                boVar.getMessagesController().setSavedViewAs(true);
                boVar.f32215a1.e(false, true);
                return;
            }
            boVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-boVar.T5, false);
            fg1.I0(boVar);
        } else {
            String str = null;
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j10 = 0;
                for (int i18 = 1; i18 >= 0; i18--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr2[i18].size(); i19++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i18].keyAt(i19)));
                    }
                    if (boVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = boVar.f32277f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) bo.D8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    boVar.Q7();
                    boVar.y3.j(58, 0L, null);
                }
                boVar.z7(false);
            } else if (i10 == 12) {
                if (boVar.getParentActivity() != null) {
                    boVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                boVar.ba(true);
            } else if (i10 == 69) {
                bo.B1(boVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = boVar.e;
                if (chat != null) {
                    boVar.presentFragment(bo.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = boVar.T5;
                if (ChatObject.isMonoForum(boVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, boVar.e)) {
                        j11 = boVar.f32257d4;
                        j3 = boVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                yh.v5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = boVar.T5;
                if (ChatObject.isMonoForum(boVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, boVar.e)) {
                        j12 = boVar.f32257d4;
                        j3 = boVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                yh.v5.y(i14, false).C(j13, j14, new ng(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (boVar.f32238bb == null) {
                    bo.G1(boVar);
                } else {
                    boVar.k9();
                }
            } else if (i10 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i21 = 1; i21 >= 0; i21--) {
                    for (int i22 = 0; i22 < sparseArrayArr3[i21].size(); i22++) {
                        arrayList2.add((MessageObject) sparseArrayArr3[i21].valueAt(i22));
                    }
                    sparseArrayArr3[i21].clear();
                    sparseArrayArr2[i21].clear();
                    sparseArrayArr[i21].clear();
                }
                if (boVar.f32284f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boVar.c9();
                boVar.yc(0, true);
                boVar.Wc(false);
                MediaController.saveFilesFromMessages(boVar.getParentActivity(), boVar.getAccountInstance(), arrayList2, new mj(0, this, z14));
            } else if (i10 == 13) {
                if (boVar.getParentActivity() != null) {
                    boVar.showDialog(org.telegram.ui.Components.c5.V(boVar.getParentActivity(), boVar.h, boVar.f32275ea).f18446a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (boVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(boVar.e)) {
                        if (boVar.f32257d4 != 0 && (user2 = boVar.getMessagesController().getUser(Long.valueOf(boVar.f32257d4))) != null) {
                            org.telegram.ui.Components.c5.r(boVar, -1, user2, boVar.e, true, new x5(9, this, user2), boVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = boVar.Z7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && boVar.h == null && (((user = boVar.f32277f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(boVar.f32277f)) || ((chatFull = boVar.Z7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.c5.r(boVar, -1, boVar.f32277f, boVar.e, z17, new nj(this, z17), boVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = boVar.e;
                    TLRPC.User user4 = boVar.f32277f;
                    if (boVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.c5.s(boVar, z11, chat2, user4, z16, true, false, z10, new i2.s(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (boVar.f32277f != null && boVar.getParentActivity() != null) {
                    TextView textView = boVar.L1;
                    if (textView != null && textView.getTag() != null) {
                        boVar.rb(null, ((Integer) boVar.L1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", boVar.f32277f.f18268id);
                    bundle.putBoolean("addContact", true);
                    boVar.presentFragment(new us(bundle));
                }
            } else if (i10 == 18) {
                boVar.bc(false);
            } else if (i10 == 24) {
                try {
                    boVar.getMediaDataController().installShortcut(boVar.f32277f.f18268id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(boVar.e)) {
                    v5 v5Var = new v5(boVar.T5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = boVar.D1;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    boVar.presentFragment(v5Var);
                    return;
                }
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(boVar.T5));
            } else if (i10 == 21) {
                int i23 = d41.v;
                int currentAccount = boVar.getCurrentAccount();
                Activity parentActivity = boVar.getParentActivity();
                long a2 = boVar.a();
                if (parentActivity != null) {
                    d41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i24 = 0; i24 < 2; i24++) {
                    for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                        boVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !boVar.Z5);
                    }
                }
                boVar.z7(false);
            } else if (i10 == 23) {
                for (int i26 = 1; i26 >= 0; i26--) {
                    if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                        }
                        messageObject = (MessageObject) boVar.f32393o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i26].clear();
                    sparseArrayArr2[i26].clear();
                    sparseArrayArr[i26].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    boVar.f32258d5 = messageObject;
                    boVar.Ba(109);
                    r92 = 0;
                } else {
                    r92 = 0;
                    boVar.Xb(messageObject, false);
                }
                boVar.c9();
                boVar.yc(r92, true);
                boVar.Wc(r92);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                hg.a2 c10 = hg.b2.f(i12).c(boVar.H8());
                Activity parentActivity2 = boVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                hg.y1.d0(parentActivity2, i13, boVar.Q3, c10, boVar.getResourceProvider(), new pf(4, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f36361a, boVar.getResourceProvider(), true, true);
                g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                g1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.w0 w0Var = boVar.f32302h0;
                org.telegram.ui.ActionBar.z zVar = boVar.f32266e0;
                zVar.a();
                w0Var.M(g1Var, zVar.f19751m);
            } else if (i10 == 30) {
                boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (boVar.E9()) {
                    str = "";
                }
                boVar.la(str);
            } else if (i10 == 62) {
                boVar.getMessagesController().getTranslateController().setHideTranslateDialog(boVar.a(), false, true);
                if (!boVar.getMessagesController().getTranslateController().toggleTranslatingDialog(boVar.a(), true)) {
                    boVar.Qc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    nk nkVar = boVar.Y;
                    if (nkVar != null && nkVar.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    nk nkVar2 = boVar.Y;
                    if (nkVar2 != null && nkVar2.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    nk nkVar3 = boVar.Y;
                    if (nkVar3 != null && nkVar3.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    nk nkVar4 = boVar.Y;
                    if (nkVar4 != null && nkVar4.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    nk nkVar5 = boVar.Y;
                    if (nkVar5 != null && nkVar5.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    nk nkVar6 = boVar.Y;
                    if (nkVar6 != null && nkVar6.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    nk nkVar7 = boVar.Y;
                    if (nkVar7 != null && nkVar7.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    nk nkVar8 = boVar.Y;
                    if (nkVar8 != null && nkVar8.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    nk nkVar9 = boVar.Y;
                    if (nkVar9 != null && nkVar9.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    nk nkVar10 = boVar.Y;
                    if (nkVar10 != null && nkVar10.getEditField() != null) {
                        boVar.Y.getEditField().setSelectionOverride(boVar.A4, boVar.B4);
                        boVar.Y.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    boVar.xb();
                } else if (i10 == 60) {
                    if (boVar.f32245c4 != null) {
                        TopicsController topicsController = boVar.getMessagesController().getTopicsController();
                        long j15 = boVar.e.f18121id;
                        TLRPC.TL_forumTopic tL_forumTopic = boVar.f32245c4;
                        int i28 = tL_forumTopic.f18173id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i28, true);
                        boVar.Rc();
                        boVar.hc(false);
                        boVar.Qc(true);
                    }
                } else if (i10 == 61) {
                    fg1.I0(boVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(boVar.P3.link);
                    org.telegram.ui.Components.vc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final oj f35560b;

                        {
                            this.f35560b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f35560b.f36362b.finishFragment();
                                    return;
                                default:
                                    oj ojVar = this.f35560b;
                                    ojVar.getClass();
                                    bo boVar2 = ojVar.f36362b;
                                    Intent intent = new Intent(boVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", boVar2.P3.link);
                                    boVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (boVar.Y.w()) {
                        boVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = boVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = boVar.P3;
                    f6Var = ((org.telegram.ui.ActionBar.o2) boVar).resourceProvider;
                    hg.v.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 18));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    boVar.showDialog(c2Var);
                    TextView textView2 = (TextView) c2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19100q7));
                    }
                } else if (i10 == 73) {
                    bf1 a02 = bf1.a0(-boVar.T5, 0L);
                    a02.f32124y = boVar;
                    boVar.presentFragment(a02);
                } else if (i10 == 888) {
                    boVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = h4.f34124b1;
                    org.telegram.ui.Components.vc.a0(boVar).t("No rich message copied", null).j();
                }
            } else if (boVar.f32277f != null && boVar.getParentActivity() != null) {
                TLRPC.User user5 = boVar.f32277f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = boVar.f32221a8;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user5, z12, z13, boVar.getParentActivity(), boVar.getMessagesController().getUserFull(boVar.f32277f.f18268id), boVar.getAccountInstance());
            }
        }
    }
}
