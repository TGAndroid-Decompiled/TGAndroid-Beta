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
public final class fj extends org.telegram.ui.ActionBar.j {
    public final Context f37012a;
    public final qn f37013b;

    public fj(qn qnVar, Context context) {
        this.f37013b = qnVar;
        this.f37012a = context;
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
        org.telegram.ui.ActionBar.d6 d6Var;
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
        qn qnVar = this.f37013b;
        SparseArray[] sparseArrayArr = qnVar.Y5;
        SparseArray[] sparseArrayArr2 = qnVar.X5;
        SparseArray[] sparseArrayArr3 = qnVar.W5;
        long j10 = 0;
        int i18 = 0;
        if (i10 == -1) {
            if (!qnVar.f40907xc.f17384f) {
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar.t()) {
                    qnVar.C7(false);
                } else if (qnVar.R3 == 5 && (qnVar.f40862u6.isEmpty() || qnVar.f40650d4 == 0)) {
                    qnVar.Ub();
                } else if (qnVar.R3 == 6 && qnVar.Y.v()) {
                    qnVar.Ab(new Runnable(this) {
                        public final fj f35993b;

                        {
                            this.f35993b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f35993b.f37013b.finishFragment();
                                    return;
                                default:
                                    fj fjVar = this.f35993b;
                                    fjVar.getClass();
                                    qn qnVar2 = fjVar.f37013b;
                                    Intent intent = new Intent(qnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", qnVar2.P3.link);
                                    qnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!qnVar.a7(true, true)) {
                    qnVar.finishFragment();
                }
            } else {
                qnVar.xa();
            }
        } else if (i10 == 59) {
            if (qnVar.getUserConfig().getClientUserId() == qnVar.T5) {
                qnVar.getMessagesController().setSavedViewAs(true);
                qnVar.f40607a1.e(false, true);
                return;
            }
            qnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-qnVar.T5, false);
            re1.I0(qnVar);
        } else {
            String str = null;
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                int i19 = 1;
                while (i19 >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = i18; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (qnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = qnVar.f40670f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) qn.I8(messageObject2, z15, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    qnVar.T7();
                    qnVar.y3.j(58, 0L, null);
                }
                qnVar.C7(false);
            } else if (i10 == 12) {
                if (qnVar.getParentActivity() != null) {
                    qnVar.I7(null, null, false);
                }
            } else if (i10 == 11) {
                qnVar.ga(true);
            } else if (i10 == 69) {
                qn.C1(qnVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = qnVar.e;
                if (chat != null) {
                    qnVar.presentFragment(qn.W9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j12 = qnVar.T5;
                if (ChatObject.isMonoForum(qnVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, qnVar.e)) {
                        j12 = qnVar.f40650d4;
                        j10 = qnVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                ai.ga.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = qnVar.T5;
                if (ChatObject.isMonoForum(qnVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, qnVar.e)) {
                        j13 = qnVar.f40650d4;
                        j10 = qnVar.T5;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                ai.ga.y(i14, false).C(j14, j15, new ai.q5(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (qnVar.f40630bb == null) {
                    qn.I1(qnVar);
                } else {
                    qnVar.p9();
                }
            } else if (i10 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i22 = 1; i22 >= 0; i22--) {
                    for (int i23 = 0; i23 < sparseArrayArr3[i22].size(); i23++) {
                        arrayList2.add((MessageObject) sparseArrayArr3[i22].valueAt(i23));
                    }
                    sparseArrayArr3[i22].clear();
                    sparseArrayArr2[i22].clear();
                    sparseArrayArr[i22].clear();
                }
                if (qnVar.f40677f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                qnVar.h9();
                qnVar.Cc(0, true);
                qnVar.ad(false);
                MediaController.saveFilesFromMessages(qnVar.getParentActivity(), qnVar.getAccountInstance(), arrayList2, new dj(0, this, z14));
            } else if (i10 == 13) {
                if (qnVar.getParentActivity() != null) {
                    qnVar.showDialog(org.telegram.ui.Components.f5.U(qnVar.getParentActivity(), qnVar.h, qnVar.f40667ea).f20602a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (qnVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(qnVar.e)) {
                        if (qnVar.f40650d4 != 0 && (user2 = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.f40650d4))) != null) {
                            org.telegram.ui.Components.f5.q(qnVar, -1, user2, qnVar.e, true, new m4.w0(16, this, user2), qnVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = qnVar.Z7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && qnVar.h == null && (((user = qnVar.f40670f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(qnVar.f40670f)) || ((chatFull = qnVar.Z7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.f5.q(qnVar, -1, qnVar.f40670f, qnVar.e, z17, new ej(this, z17), qnVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = qnVar.e;
                    TLRPC.User user4 = qnVar.f40670f;
                    if (qnVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.f5.r(qnVar, z11, chat2, user4, z16, true, false, z10, new i2.s(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (qnVar.f40670f != null && qnVar.getParentActivity() != null) {
                    TextView textView = qnVar.L1;
                    if (textView != null && textView.getTag() != null) {
                        qnVar.vb(null, ((Integer) qnVar.L1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", qnVar.f40670f.f20420id);
                    bundle.putBoolean("addContact", true);
                    qnVar.presentFragment(new fs(bundle));
                }
            } else if (i10 == 18) {
                qnVar.fc(false);
            } else if (i10 == 24) {
                try {
                    qnVar.getMediaDataController().installShortcut(qnVar.f40670f.f20420id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(qnVar.e)) {
                    z5 z5Var = new z5(qnVar.T5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qnVar.D1;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                    }
                    qnVar.presentFragment(z5Var);
                    return;
                }
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.T5));
            } else if (i10 == 21) {
                int i24 = o21.v;
                int currentAccount = qnVar.getCurrentAccount();
                Activity parentActivity = qnVar.getParentActivity();
                long a2 = qnVar.a();
                if (parentActivity != null) {
                    o21.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i25 = 0; i25 < 2; i25++) {
                    for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                        qnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !qnVar.Z5);
                    }
                }
                qnVar.C7(false);
            } else if (i10 == 23) {
                for (int i27 = 1; i27 >= 0; i27--) {
                    if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                        }
                        messageObject = (MessageObject) qnVar.f40787o6[i27].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i27].clear();
                    sparseArrayArr2[i27].clear();
                    sparseArrayArr[i27].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    qnVar.f40651d5 = messageObject;
                    qnVar.Fa(109);
                    r92 = 0;
                } else {
                    r92 = 0;
                    qnVar.bc(messageObject, false);
                }
                qnVar.h9();
                qnVar.Cc(r92, true);
                qnVar.ad(r92);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                ig.z1 c10 = ig.a2.f(i12).c(qnVar.M8());
                Activity parentActivity2 = qnVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                ig.x1.d0(parentActivity2, i13, qnVar.Q3, c10, qnVar.getResourceProvider(), new org.telegram.ui.ActionBar.j3(15, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f37012a, qnVar.getResourceProvider(), true, true);
                e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                e1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40695h0;
                org.telegram.ui.ActionBar.x xVar = qnVar.f40658e0;
                xVar.a();
                u0Var.M(e1Var, xVar.f21862m);
            } else if (i10 == 30) {
                qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (qnVar.J9()) {
                    str = "";
                }
                qnVar.qa(str);
            } else if (i10 == 62) {
                qnVar.getMessagesController().getTranslateController().setHideTranslateDialog(qnVar.a(), false, true);
                if (!qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a(), true)) {
                    qnVar.Uc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    fk fkVar = qnVar.Y;
                    if (fkVar != null && fkVar.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    fk fkVar2 = qnVar.Y;
                    if (fkVar2 != null && fkVar2.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    fk fkVar3 = qnVar.Y;
                    if (fkVar3 != null && fkVar3.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    fk fkVar4 = qnVar.Y;
                    if (fkVar4 != null && fkVar4.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    fk fkVar5 = qnVar.Y;
                    if (fkVar5 != null && fkVar5.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    fk fkVar6 = qnVar.Y;
                    if (fkVar6 != null && fkVar6.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    fk fkVar7 = qnVar.Y;
                    if (fkVar7 != null && fkVar7.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    fk fkVar8 = qnVar.Y;
                    if (fkVar8 != null && fkVar8.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    fk fkVar9 = qnVar.Y;
                    if (fkVar9 != null && fkVar9.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    fk fkVar10 = qnVar.Y;
                    if (fkVar10 != null && fkVar10.getEditField() != null) {
                        qnVar.Y.getEditField().setSelectionOverride(qnVar.A4, qnVar.B4);
                        qnVar.Y.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    qnVar.Bb();
                } else if (i10 == 60) {
                    if (qnVar.f40637c4 != null) {
                        TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                        long j16 = qnVar.e.f20273id;
                        TLRPC.TL_forumTopic tL_forumTopic = qnVar.f40637c4;
                        int i29 = tL_forumTopic.f20325id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i29, true);
                        qnVar.Vc();
                        qnVar.lc(false);
                        qnVar.Uc(true);
                    }
                } else if (i10 == 61) {
                    re1.I0(qnVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(qnVar.P3.link);
                    org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final fj f35993b;

                        {
                            this.f35993b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f35993b.f37013b.finishFragment();
                                    return;
                                default:
                                    fj fjVar = this.f35993b;
                                    fjVar.getClass();
                                    qn qnVar2 = fjVar.f37013b;
                                    Intent intent = new Intent(qnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", qnVar2.P3.link);
                                    qnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (qnVar.Y.v()) {
                        qnVar.Ab(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = qnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = qnVar.P3;
                    d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                    ig.v.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    qnVar.showDialog(b2Var);
                    TextView textView2 = (TextView) b2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7));
                    }
                } else if (i10 == 73) {
                    nd1 a02 = nd1.a0(-qnVar.T5, 0L);
                    a02.f39544y = qnVar;
                    qnVar.presentFragment(a02);
                } else if (i10 == 888) {
                    qnVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = l4.f38728b1;
                    org.telegram.ui.Components.xc.a0(qnVar).t("No rich message copied", null).j();
                }
            } else if (qnVar.f40670f != null && qnVar.getParentActivity() != null) {
                TLRPC.User user5 = qnVar.f40670f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = qnVar.f40613a8;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.d2.m(user5, z12, z13, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f40670f.f20420id), qnVar.getAccountInstance());
            }
        }
    }
}
