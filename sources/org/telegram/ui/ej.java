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
public final class ej extends org.telegram.ui.ActionBar.k {
    public final Context f37847a;
    public final tn f37848b;

    public ej(tn tnVar, Context context) {
        this.f37848b = tnVar;
        this.f37847a = context;
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
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        int i13;
        ?? r9;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f37848b;
        SparseArray[] sparseArrayArr = tnVar.U5;
        SparseArray[] sparseArrayArr2 = tnVar.T5;
        SparseArray[] sparseArrayArr3 = tnVar.S5;
        long j10 = 0;
        if (i10 == -1) {
            if (!tnVar.f42972sc.f49506f) {
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar.s()) {
                    tnVar.z7(false);
                } else if (tnVar.N3 == 5 && (tnVar.q6.isEmpty() || tnVar.Z3 == 0)) {
                    tnVar.Qb();
                } else if (tnVar.N3 == 6 && tnVar.U.w()) {
                    tnVar.wb(new Runnable(this) {
                        public final ej f36817b;

                        {
                            this.f36817b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f36817b.f37848b.finishFragment();
                                    return;
                                default:
                                    ej ejVar = this.f36817b;
                                    ejVar.getClass();
                                    tn tnVar2 = ejVar.f37848b;
                                    Intent intent = new Intent(tnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", tnVar2.L3.link);
                                    tnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!tnVar.X6(true, true)) {
                    tnVar.finishFragment();
                }
            } else {
                tnVar.ta();
            }
        } else if (i10 == 59) {
            if (tnVar.getUserConfig().getClientUserId() == tnVar.P5) {
                tnVar.getMessagesController().setSavedViewAs(true);
                tnVar.W0.e(false, true);
                return;
            }
            tnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-tnVar.P5, false);
            ze1.I0(tnVar);
        } else {
            String str = null;
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                for (int i18 = 1; i18 >= 0; i18--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr2[i18].size(); i19++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i18].keyAt(i19)));
                    }
                    if (tnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = tnVar.f42801f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) tn.D8(messageObject2, z15, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    tnVar.Q7();
                    tnVar.f42989u3.j(58, 0L, null);
                }
                tnVar.z7(false);
            } else if (i10 == 12) {
                if (tnVar.getParentActivity() != null) {
                    tnVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                tnVar.ba(true);
            } else if (i10 == 69) {
                tn.B1(tnVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = tnVar.f42787e;
                if (chat != null) {
                    tnVar.presentFragment(tn.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j12 = tnVar.P5;
                if (ChatObject.isMonoForum(tnVar.f42787e)) {
                    i17 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, tnVar.f42787e)) {
                        j12 = tnVar.Z3;
                        j10 = tnVar.P5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                jh.s7.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = tnVar.P5;
                if (ChatObject.isMonoForum(tnVar.f42787e)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, tnVar.f42787e)) {
                        j13 = tnVar.Z3;
                        j10 = tnVar.P5;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                jh.s7.y(i14, false).C(j14, j15, new jh.u3(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (tnVar.Xa == null) {
                    tn.G1(tnVar);
                } else {
                    tnVar.k9();
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
                if (tnVar.f42756b6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                tnVar.c9();
                tnVar.yc(0, true);
                tnVar.Wc(false);
                MediaController.saveFilesFromMessages(tnVar.getParentActivity(), tnVar.getAccountInstance(), arrayList2, new cj(0, this, z14));
            } else if (i10 == 13) {
                if (tnVar.getParentActivity() != null) {
                    tnVar.showDialog(org.telegram.ui.Components.c5.V(tnVar.getParentActivity(), tnVar.h, tnVar.f42746aa).f22714a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (tnVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(tnVar.f42787e)) {
                        if (tnVar.Z3 != 0 && (user2 = tnVar.getMessagesController().getUser(Long.valueOf(tnVar.Z3))) != null) {
                            org.telegram.ui.Components.c5.r(tnVar, -1, user2, tnVar.f42787e, true, new kg.w(19, this, user2), tnVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = tnVar.V7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && tnVar.h == null && (((user = tnVar.f42801f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(tnVar.f42801f)) || ((chatFull = tnVar.V7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.c5.r(tnVar, -1, tnVar.f42801f, tnVar.f42787e, z17, new dj(this, z17), tnVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = tnVar.f42787e;
                    TLRPC.User user4 = tnVar.f42801f;
                    if (tnVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.c5.s(tnVar, z11, chat2, user4, z16, true, false, z10, new eg.n2(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (tnVar.f42801f != null && tnVar.getParentActivity() != null) {
                    TextView textView = tnVar.H1;
                    if (textView != null && textView.getTag() != null) {
                        tnVar.rb(null, ((Integer) tnVar.H1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", tnVar.f42801f.f22539id);
                    bundle.putBoolean("addContact", true);
                    tnVar.presentFragment(new hs(bundle));
                }
            } else if (i10 == 18) {
                tnVar.bc(false);
            } else if (i10 == 24) {
                try {
                    tnVar.getMediaDataController().installShortcut(tnVar.f42801f.f22539id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(tnVar.f42787e)) {
                    v5 v5Var = new v5(tnVar.P5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = tnVar.f43051z1;
                    v5Var.N = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, 0));
                    }
                    tnVar.presentFragment(v5Var);
                    return;
                }
                tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(tnVar.P5));
            } else if (i10 == 21) {
                int i23 = y21.v;
                int currentAccount = tnVar.getCurrentAccount();
                Activity parentActivity = tnVar.getParentActivity();
                long a2 = tnVar.a();
                if (parentActivity != null) {
                    y21.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i24 = 0; i24 < 2; i24++) {
                    for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                        tnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !tnVar.V5);
                    }
                }
                tnVar.z7(false);
            } else if (i10 == 23) {
                for (int i26 = 1; i26 >= 0; i26--) {
                    if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                        }
                        messageObject = (MessageObject) tnVar.f42870k6[i26].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i26].clear();
                    sparseArrayArr2[i26].clear();
                    sparseArrayArr[i26].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    tnVar.Z4 = messageObject;
                    tnVar.Ba(109);
                    r9 = 0;
                } else {
                    r9 = 0;
                    tnVar.Xb(messageObject, false);
                }
                tnVar.c9();
                tnVar.yc(r9, true);
                tnVar.Wc(r9);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                sf.r1 c3 = sf.s1.f(i12).c(tnVar.H8());
                Activity parentActivity2 = tnVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                sf.n1.d0(parentActivity2, i13, tnVar.M3, c3, tnVar.getResourceProvider(), new ih.b1(29, this, c3));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f37847a, tnVar.getResourceProvider(), true, true);
                g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                g1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
                org.telegram.ui.ActionBar.z zVar = tnVar.f42737a0;
                zVar.a();
                w0Var.M(g1Var, zVar.f24004m);
            } else if (i10 == 30) {
                tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (tnVar.E9()) {
                    str = "";
                }
                tnVar.la(str);
            } else if (i10 == 62) {
                tnVar.getMessagesController().getTranslateController().setHideTranslateDialog(tnVar.a(), false, true);
                if (!tnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(tnVar.a(), true)) {
                    tnVar.Qc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    dk dkVar = tnVar.U;
                    if (dkVar != null && dkVar.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    dk dkVar2 = tnVar.U;
                    if (dkVar2 != null && dkVar2.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    dk dkVar3 = tnVar.U;
                    if (dkVar3 != null && dkVar3.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    dk dkVar4 = tnVar.U;
                    if (dkVar4 != null && dkVar4.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    dk dkVar5 = tnVar.U;
                    if (dkVar5 != null && dkVar5.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    dk dkVar6 = tnVar.U;
                    if (dkVar6 != null && dkVar6.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    dk dkVar7 = tnVar.U;
                    if (dkVar7 != null && dkVar7.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    dk dkVar8 = tnVar.U;
                    if (dkVar8 != null && dkVar8.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    dk dkVar9 = tnVar.U;
                    if (dkVar9 != null && dkVar9.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    dk dkVar10 = tnVar.U;
                    if (dkVar10 != null && dkVar10.getEditField() != null) {
                        tnVar.U.getEditField().setSelectionOverride(tnVar.f43017w4, tnVar.x4);
                        tnVar.U.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    tnVar.xb();
                } else if (i10 == 60) {
                    if (tnVar.Y3 != null) {
                        TopicsController topicsController = tnVar.getMessagesController().getTopicsController();
                        long j16 = tnVar.f42787e.f22392id;
                        TLRPC.TL_forumTopic tL_forumTopic = tnVar.Y3;
                        int i28 = tL_forumTopic.f22444id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i28, true);
                        tnVar.Rc();
                        tnVar.hc(false);
                        tnVar.Qc(true);
                    }
                } else if (i10 == 61) {
                    ze1.I0(tnVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(tnVar.L3.link);
                    org.telegram.ui.Components.tc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final ej f36817b;

                        {
                            this.f36817b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f36817b.f37848b.finishFragment();
                                    return;
                                default:
                                    ej ejVar = this.f36817b;
                                    ejVar.getClass();
                                    tn tnVar2 = ejVar.f37848b;
                                    Intent intent = new Intent(tnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", tnVar2.L3.link);
                                    tnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (tnVar.U.w()) {
                        tnVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = tnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = tnVar.L3;
                    c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                    sf.r.b0(parentActivity3, i11, tL_businessChatLink, c6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    tnVar.showDialog(c2Var);
                    TextView textView2 = (TextView) c2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
                    }
                } else if (i10 == 73) {
                    td1 a02 = td1.a0(-tnVar.P5, 0L);
                    a02.f42670y = tnVar;
                    tnVar.presentFragment(a02);
                } else if (i10 == 888) {
                    tnVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = m4.X0;
                    org.telegram.ui.Components.tc.a0(tnVar).t("No rich message copied", null).j();
                }
            } else if (tnVar.f42801f != null && tnVar.getParentActivity() != null) {
                TLRPC.User user5 = tnVar.f42801f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = tnVar.W7;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.h2.n(user5, z12, z13, tnVar.getParentActivity(), tnVar.getMessagesController().getUserFull(tnVar.f42801f.f22539id), tnVar.getAccountInstance());
            }
        }
    }
}
