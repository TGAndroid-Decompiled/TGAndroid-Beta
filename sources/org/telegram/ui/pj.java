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
public final class pj extends org.telegram.ui.ActionBar.k {
    public final Context f35850a;
    public final eo f35851b;

    public pj(eo eoVar, Context context) {
        this.f35851b = eoVar;
        this.f35850a = context;
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
        ?? r10;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.f35851b;
        SparseArray[] sparseArrayArr = eoVar.Y5;
        SparseArray[] sparseArrayArr2 = eoVar.X5;
        SparseArray[] sparseArrayArr3 = eoVar.W5;
        long j3 = 0;
        if (i10 == -1) {
            if (!eoVar.wc.f12870f) {
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar.s()) {
                    eoVar.z7(false);
                } else if (eoVar.R3 == 5 && (eoVar.f32509u6.isEmpty() || eoVar.f32298d4 == 0)) {
                    eoVar.Qb();
                } else if (eoVar.R3 == 6 && eoVar.Y.w()) {
                    eoVar.wb(new Runnable(this) {
                        public final pj f34986b;

                        {
                            this.f34986b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34986b.f35851b.finishFragment();
                                    return;
                                default:
                                    pj pjVar = this.f34986b;
                                    pjVar.getClass();
                                    eo eoVar2 = pjVar.f35851b;
                                    Intent intent = new Intent(eoVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", eoVar2.P3.link);
                                    eoVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!eoVar.X6(true, true)) {
                    eoVar.finishFragment();
                }
            } else {
                eoVar.ta();
            }
        } else if (i10 == 59) {
            if (eoVar.getUserConfig().getClientUserId() == eoVar.T5) {
                eoVar.getMessagesController().setSavedViewAs(true);
                eoVar.f32256a1.e(false, true);
                return;
            }
            eoVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-eoVar.T5, false);
            ig1.I0(eoVar);
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
                    if (eoVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = eoVar.f32318f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) eo.D8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    eoVar.Q7();
                    eoVar.y3.j(58, 0L, null);
                }
                eoVar.z7(false);
            } else if (i10 == 12) {
                if (eoVar.getParentActivity() != null) {
                    eoVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                eoVar.ba(true);
            } else if (i10 == 69) {
                eo.B1(eoVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = eoVar.e;
                if (chat != null) {
                    eoVar.presentFragment(eo.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = eoVar.T5;
                if (ChatObject.isMonoForum(eoVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, eoVar.e)) {
                        j11 = eoVar.f32298d4;
                        j3 = eoVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                xh.v5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = eoVar.T5;
                if (ChatObject.isMonoForum(eoVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, eoVar.e)) {
                        j12 = eoVar.f32298d4;
                        j3 = eoVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                xh.v5.y(i14, false).C(j13, j14, new mg(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (eoVar.f32279bb == null) {
                    eo.G1(eoVar);
                } else {
                    eoVar.k9();
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
                if (eoVar.f32325f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                eoVar.c9();
                eoVar.yc(0, true);
                eoVar.Wc(false);
                MediaController.saveFilesFromMessages(eoVar.getParentActivity(), eoVar.getAccountInstance(), arrayList2, new nj(0, this, z14));
            } else if (i10 == 13) {
                if (eoVar.getParentActivity() != null) {
                    eoVar.showDialog(org.telegram.ui.Components.d5.V(eoVar.getParentActivity(), eoVar.h, eoVar.f32316ea).f17528a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (eoVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(eoVar.e)) {
                        if (eoVar.f32298d4 != 0 && (user2 = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.f32298d4))) != null) {
                            org.telegram.ui.Components.d5.r(eoVar, -1, user2, eoVar.e, true, new oe(5, this, user2), eoVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = eoVar.Z7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && eoVar.h == null && (((user = eoVar.f32318f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(eoVar.f32318f)) || ((chatFull = eoVar.Z7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.d5.r(eoVar, -1, eoVar.f32318f, eoVar.e, z17, new oj(this, z17), eoVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = eoVar.e;
                    TLRPC.User user4 = eoVar.f32318f;
                    if (eoVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.d5.s(eoVar, z11, chat2, user4, z16, true, false, z10, new i2.s(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (eoVar.f32318f != null && eoVar.getParentActivity() != null) {
                    TextView textView = eoVar.L1;
                    if (textView != null && textView.getTag() != null) {
                        eoVar.rb(null, ((Integer) eoVar.L1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", eoVar.f32318f.f17342id);
                    bundle.putBoolean("addContact", true);
                    eoVar.presentFragment(new ts(bundle));
                }
            } else if (i10 == 18) {
                eoVar.bc(false);
            } else if (i10 == 24) {
                try {
                    eoVar.getMediaDataController().installShortcut(eoVar.f32318f.f17342id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(eoVar.e)) {
                    w5 w5Var = new w5(eoVar.T5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = eoVar.D1;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new m5(w5Var, 0));
                    }
                    eoVar.presentFragment(w5Var);
                    return;
                }
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(eoVar.T5));
            } else if (i10 == 21) {
                int i23 = h41.v;
                int currentAccount = eoVar.getCurrentAccount();
                Activity parentActivity = eoVar.getParentActivity();
                long a2 = eoVar.a();
                if (parentActivity != null) {
                    h41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i24 = 0; i24 < 2; i24++) {
                    for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                        eoVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !eoVar.Z5);
                    }
                }
                eoVar.z7(false);
            } else if (i10 == 23) {
                for (int i26 = 1; i26 >= 0; i26--) {
                    if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                        }
                        messageObject = (MessageObject) eoVar.f32433o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i26].clear();
                    sparseArrayArr2[i26].clear();
                    sparseArrayArr[i26].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    eoVar.f32299d5 = messageObject;
                    eoVar.Ba(109);
                    r10 = 0;
                } else {
                    r10 = 0;
                    eoVar.Xb(messageObject, false);
                }
                eoVar.c9();
                eoVar.yc(r10, true);
                eoVar.Wc(r10);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                gg.j2 c10 = gg.k2.f(i12).c(eoVar.H8());
                Activity parentActivity2 = eoVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                gg.h2.d0(parentActivity2, i13, eoVar.Q3, c10, eoVar.getResourceProvider(), new pf(4, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f35850a, eoVar.getResourceProvider(), true, true);
                g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                g1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.w0 w0Var = eoVar.f32342h0;
                org.telegram.ui.ActionBar.y yVar = eoVar.f32307e0;
                yVar.a();
                w0Var.M(g1Var, yVar.f18767m);
            } else if (i10 == 30) {
                eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (eoVar.E9()) {
                    str = "";
                }
                eoVar.la(str);
            } else if (i10 == 62) {
                eoVar.getMessagesController().getTranslateController().setHideTranslateDialog(eoVar.a(), false, true);
                if (!eoVar.getMessagesController().getTranslateController().toggleTranslatingDialog(eoVar.a(), true)) {
                    eoVar.Qc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    ok okVar = eoVar.Y;
                    if (okVar != null && okVar.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    ok okVar2 = eoVar.Y;
                    if (okVar2 != null && okVar2.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    ok okVar3 = eoVar.Y;
                    if (okVar3 != null && okVar3.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    ok okVar4 = eoVar.Y;
                    if (okVar4 != null && okVar4.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    ok okVar5 = eoVar.Y;
                    if (okVar5 != null && okVar5.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    ok okVar6 = eoVar.Y;
                    if (okVar6 != null && okVar6.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    ok okVar7 = eoVar.Y;
                    if (okVar7 != null && okVar7.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    ok okVar8 = eoVar.Y;
                    if (okVar8 != null && okVar8.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    ok okVar9 = eoVar.Y;
                    if (okVar9 != null && okVar9.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    ok okVar10 = eoVar.Y;
                    if (okVar10 != null && okVar10.getEditField() != null) {
                        eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                        eoVar.Y.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    eoVar.xb();
                } else if (i10 == 60) {
                    if (eoVar.f32286c4 != null) {
                        TopicsController topicsController = eoVar.getMessagesController().getTopicsController();
                        long j15 = eoVar.e.f17195id;
                        TLRPC.TL_forumTopic tL_forumTopic = eoVar.f32286c4;
                        int i28 = tL_forumTopic.f17247id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i28, true);
                        eoVar.Rc();
                        eoVar.hc(false);
                        eoVar.Qc(true);
                    }
                } else if (i10 == 61) {
                    ig1.I0(eoVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(eoVar.P3.link);
                    org.telegram.ui.Components.wc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final pj f34986b;

                        {
                            this.f34986b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34986b.f35851b.finishFragment();
                                    return;
                                default:
                                    pj pjVar = this.f34986b;
                                    pjVar.getClass();
                                    eo eoVar2 = pjVar.f35851b;
                                    Intent intent = new Intent(eoVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", eoVar2.P3.link);
                                    eoVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (eoVar.Y.w()) {
                        eoVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = eoVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = eoVar.P3;
                    f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                    gg.x.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    d2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    eoVar.showDialog(d2Var);
                    TextView textView2 = (TextView) d2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
                    }
                } else if (i10 == 73) {
                    ef1 a02 = ef1.a0(-eoVar.T5, 0L);
                    a02.f32185y = eoVar;
                    eoVar.presentFragment(a02);
                } else if (i10 == 888) {
                    eoVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = j4.f33876b1;
                    org.telegram.ui.Components.wc.a0(eoVar).t("No rich message copied", null).j();
                }
            } else if (eoVar.f32318f != null && eoVar.getParentActivity() != null) {
                TLRPC.User user5 = eoVar.f32318f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = eoVar.f32262a8;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.e2.m(user5, z12, z13, eoVar.getParentActivity(), eoVar.getMessagesController().getUserFull(eoVar.f32318f.f17342id), eoVar.getAccountInstance());
            }
        }
    }
}
