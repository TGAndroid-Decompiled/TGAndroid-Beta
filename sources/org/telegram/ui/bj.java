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
public final class bj extends org.telegram.ui.ActionBar.j {
    public final Context f36876a;
    public final qn f36877b;

    public bj(qn qnVar, Context context) {
        this.f36877b = qnVar;
        this.f36876a = context;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i11;
        int i12;
        ?? r10;
        boolean z14;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z15;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f36877b;
        SparseArray[] sparseArrayArr = qnVar.U5;
        SparseArray[] sparseArrayArr2 = qnVar.T5;
        SparseArray[] sparseArrayArr3 = qnVar.S5;
        long j10 = 0;
        boolean z16 = true;
        if (i9 == -1) {
            if (!qnVar.f42076sc.f47776f) {
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar.s()) {
                    qnVar.z7(false);
                } else if (qnVar.N3 == 5 && (qnVar.f42042q6.isEmpty() || qnVar.Z3 == 0)) {
                    qnVar.Qb();
                } else if (qnVar.N3 == 6 && qnVar.U.w()) {
                    qnVar.wb(new Runnable(this) {
                        public final bj f44882b;

                        {
                            this.f44882b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f44882b.f36877b.finishFragment();
                                    return;
                                default:
                                    bj bjVar = this.f44882b;
                                    bjVar.getClass();
                                    qn qnVar2 = bjVar.f36877b;
                                    Intent intent = new Intent(qnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", qnVar2.L3.link);
                                    qnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!qnVar.X6(true, true)) {
                    qnVar.finishFragment();
                }
            } else {
                qnVar.ta();
            }
        } else if (i9 == 59) {
            if (qnVar.getUserConfig().getClientUserId() == qnVar.P5) {
                qnVar.getMessagesController().setSavedViewAs(true);
                qnVar.W0.e(false, true);
                return;
            }
            qnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-qnVar.P5, false);
            we1.H0(qnVar);
        } else {
            String str = null;
            MessageObject messageObject = null;
            if (i9 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                for (int i17 = 1; i17 >= 0; i17--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i18 = 0; i18 < sparseArrayArr2[i17].size(); i18++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i17].keyAt(i18)));
                    }
                    if (qnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i17].get(((Integer) arrayList.get(i19)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = qnVar.f41903f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) qn.D8(messageObject2, z15, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    qnVar.Q7();
                    qnVar.f42093u3.j(58, 0L, null);
                }
                qnVar.z7(false);
            } else if (i9 == 12) {
                if (qnVar.getParentActivity() != null) {
                    qnVar.F7(null, null, false);
                }
            } else if (i9 == 11) {
                qnVar.ba(true);
            } else if (i9 == 69) {
                qn.B1(qnVar);
            } else if (i9 == 70) {
                TLRPC.Chat chat = qnVar.f41890e;
                if (chat != null) {
                    qnVar.presentFragment(qn.R9(-chat.linked_monoforum_id));
                }
            } else if (i9 == 72) {
                long j12 = qnVar.P5;
                if (ChatObject.isMonoForum(qnVar.f41890e)) {
                    i16 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i16, qnVar.f41890e)) {
                        j12 = qnVar.Z3;
                        j10 = qnVar.P5;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                gh.v7.y(i15, false).i0(j12, j10, false, false);
            } else if (i9 == 71) {
                long j13 = qnVar.P5;
                if (ChatObject.isMonoForum(qnVar.f41890e)) {
                    i14 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i14, qnVar.f41890e)) {
                        j13 = qnVar.Z3;
                        j10 = qnVar.P5;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                gh.v7.y(i13, false).C(j14, j15, new gh.w3(this, j14, j15, 2));
            } else if (i9 == 28) {
                if (qnVar.Xa == null) {
                    qn.G1(qnVar);
                } else {
                    qnVar.k9();
                }
            } else if (i9 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i20 = 1; i20 >= 0; i20--) {
                    for (int i21 = 0; i21 < sparseArrayArr3[i20].size(); i21++) {
                        arrayList2.add((MessageObject) sparseArrayArr3[i20].valueAt(i21));
                    }
                    sparseArrayArr3[i20].clear();
                    sparseArrayArr2[i20].clear();
                    sparseArrayArr[i20].clear();
                }
                if (qnVar.f41858b6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                qnVar.c9();
                qnVar.yc(0, true);
                qnVar.Wc(false);
                MediaController.saveFilesFromMessages(qnVar.getParentActivity(), qnVar.getAccountInstance(), arrayList2, new zi(0, this, z14));
            } else if (i9 == 13) {
                if (qnVar.getParentActivity() != null) {
                    qnVar.showDialog(org.telegram.ui.Components.y4.V(qnVar.getParentActivity(), qnVar.h, qnVar.f41848aa).f22702a);
                }
            } else if (i9 != 15 && i9 != 16 && i9 != 26) {
                if (i9 == 17) {
                    if (qnVar.f41903f != null && qnVar.getParentActivity() != null) {
                        TextView textView = qnVar.H1;
                        if (textView != null && textView.getTag() != null) {
                            qnVar.rb(null, ((Integer) qnVar.H1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", qnVar.f41903f.f22527id);
                        bundle.putBoolean("addContact", true);
                        qnVar.presentFragment(new is(bundle));
                    }
                } else if (i9 == 18) {
                    qnVar.bc(false);
                } else if (i9 == 24) {
                    try {
                        qnVar.getMediaDataController().installShortcut(qnVar.f41903f.f22527id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i9 == 29) {
                    if (ChatObject.hasAdminRights(qnVar.f41890e)) {
                        u5 u5Var = new u5(qnVar.P5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qnVar.f42154z1;
                        u5Var.N = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            u5Var.getMessagesController().getBoostsController().userCanBoostChannel(u5Var.L, u5Var.N, new m5(u5Var, 0));
                        }
                        qnVar.presentFragment(u5Var);
                        return;
                    }
                    qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.P5));
                } else if (i9 == 21) {
                    int i22 = y21.v;
                    int currentAccount = qnVar.getCurrentAccount();
                    Activity parentActivity = qnVar.getParentActivity();
                    long a2 = qnVar.a();
                    if (parentActivity != null) {
                        y21.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i9 == 22) {
                    for (int i23 = 0; i23 < 2; i23++) {
                        for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i23].valueAt(i24);
                            qnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !qnVar.V5);
                        }
                    }
                    qnVar.z7(false);
                } else if (i9 == 23) {
                    for (int i25 = 1; i25 >= 0; i25--) {
                        if (messageObject == null && sparseArrayArr3[i25].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                            }
                            messageObject = (MessageObject) qnVar.f41972k6[i25].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i25].clear();
                        sparseArrayArr2[i25].clear();
                        sparseArrayArr[i25].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        qnVar.Z4 = messageObject;
                        qnVar.Ba(109);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        qnVar.Xb(messageObject, false);
                    }
                    qnVar.c9();
                    qnVar.yc(r10, true);
                    qnVar.Wc(r10);
                } else if (i9 == 64) {
                    i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    pf.q1 c10 = pf.r1.f(i11).c(qnVar.H8());
                    Activity parentActivity2 = qnVar.getParentActivity();
                    i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    pf.n1.c0(parentActivity2, i12, qnVar.M3, c10, qnVar.getResourceProvider(), new df(6, this, c10));
                } else if (i9 == 14) {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f36876a, qnVar.getResourceProvider(), true, true);
                    g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    g1Var.setOnClickListener(new a(this, 13));
                    org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
                    org.telegram.ui.ActionBar.y yVar = qnVar.f41840a0;
                    yVar.a();
                    w0Var.M(g1Var, yVar.f23965m);
                } else if (i9 == 30) {
                    qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i9 == 31) {
                    qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i9 == 40) {
                    if (qnVar.E9()) {
                        str = "";
                    }
                    qnVar.la(str);
                } else if (i9 == 62) {
                    qnVar.getMessagesController().getTranslateController().setHideTranslateDialog(qnVar.a(), false, true);
                    if (!qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a(), true)) {
                        qnVar.Qc(true);
                    }
                } else if (i9 != 32 && i9 != 33) {
                    if (i9 == 50) {
                        ak akVar = qnVar.U;
                        if (akVar != null && akVar.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedBold();
                        }
                    } else if (i9 == 51) {
                        ak akVar2 = qnVar.U;
                        if (akVar2 != null && akVar2.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedItalic();
                        }
                    } else if (i9 == 57) {
                        ak akVar3 = qnVar.U;
                        if (akVar3 != null && akVar3.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i9 == 58) {
                        ak akVar4 = qnVar.U;
                        if (akVar4 != null && akVar4.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedQuote();
                        }
                    } else if (i9 == 52) {
                        ak akVar5 = qnVar.U;
                        if (akVar5 != null && akVar5.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedMono();
                        }
                    } else if (i9 == 55) {
                        ak akVar6 = qnVar.U;
                        if (akVar6 != null && akVar6.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedStrike();
                        }
                    } else if (i9 == 56) {
                        ak akVar7 = qnVar.U;
                        if (akVar7 != null && akVar7.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedUnderline();
                        }
                    } else if (i9 == 74) {
                        ak akVar8 = qnVar.U;
                        if (akVar8 != null && akVar8.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedDate();
                        }
                    } else if (i9 == 53) {
                        ak akVar9 = qnVar.U;
                        if (akVar9 != null && akVar9.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedUrl();
                        }
                    } else if (i9 == 54) {
                        ak akVar10 = qnVar.U;
                        if (akVar10 != null && akVar10.getEditField() != null) {
                            qnVar.U.getEditField().setSelectionOverride(qnVar.f42118w4, qnVar.f42131x4);
                            qnVar.U.getEditField().makeSelectedRegular();
                        }
                    } else if (i9 == 27) {
                        qnVar.xb();
                    } else if (i9 == 60) {
                        if (qnVar.Y3 != null) {
                            TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                            long j16 = qnVar.f41890e.f22380id;
                            TLRPC.TL_forumTopic tL_forumTopic = qnVar.Y3;
                            int i27 = tL_forumTopic.f22432id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j16, i27, true);
                            qnVar.Rc();
                            qnVar.hc(false);
                            qnVar.Qc(true);
                        }
                    } else if (i9 == 61) {
                        we1.H0(qnVar);
                    } else if (i9 == 65) {
                        AndroidUtilities.addToClipboard(qnVar.L3.link);
                        org.telegram.ui.Components.oc.a0(LaunchActivity.R()).k(false).j();
                    } else if (i9 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final bj f44882b;

                            {
                                this.f44882b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f44882b.f36877b.finishFragment();
                                        return;
                                    default:
                                        bj bjVar = this.f44882b;
                                        bjVar.getClass();
                                        qn qnVar2 = bjVar.f36877b;
                                        Intent intent = new Intent(qnVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", qnVar2.L3.link);
                                        qnVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (qnVar.U.w()) {
                            qnVar.wb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i9 == 67) {
                        Activity parentActivity3 = qnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = qnVar.L3;
                        b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                        pf.r.a0(parentActivity3, i10, tL_businessChatLink, b6Var);
                    } else if (i9 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 17));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(c2Var);
                        TextView textView2 = (TextView) c2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
                        }
                    } else if (i9 == 73) {
                        rd1 Z = rd1.Z(-qnVar.P5, 0L);
                        Z.f42379y = qnVar;
                        qnVar.presentFragment(Z);
                    } else if (i9 == 888) {
                        qnVar.dumpCanvas();
                    } else if (i9 == 889) {
                        HashSet hashSet = l4.X0;
                        org.telegram.ui.Components.oc.a0(qnVar).t("No rich message copied", null).j();
                    }
                } else if (qnVar.f41903f != null && qnVar.getParentActivity() != null) {
                    TLRPC.User user4 = qnVar.f41903f;
                    if (i9 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = qnVar.W7;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.e2.n(user4, z12, z13, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f41903f.f22527id), qnVar.getAccountInstance());
                }
            } else if (qnVar.getParentActivity() != null) {
                if (i9 == 15 && ChatObject.isMonoForum(qnVar.f41890e)) {
                    if (qnVar.Z3 != 0 && (user2 = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.Z3))) != null) {
                        org.telegram.ui.Components.y4.r(qnVar, -1, user2, qnVar.f41890e, true, new ih.v3(19, this, user2), qnVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = qnVar.V7;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i9 != 26) {
                    int i28 = 15;
                    if (i9 == 15) {
                        if (qnVar.h != null || (((user = qnVar.f41903f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(qnVar.f41903f)) && ((chatFull = qnVar.V7) == null || !chatFull.can_delete_channel))) {
                            i28 = 15;
                        }
                    }
                    if (i9 == i28) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = qnVar.f41890e;
                    TLRPC.User user5 = qnVar.f41903f;
                    if (qnVar.h == null) {
                        z16 = false;
                    }
                    org.telegram.ui.Components.y4.s(qnVar, z11, chat2, user5, z16, true, false, z10, new bg.x2(this, i9, z10));
                    return;
                }
                org.telegram.ui.Components.y4.r(qnVar, -1, qnVar.f41903f, qnVar.f41890e, z10, new aj(this, z10), qnVar.getResourceProvider());
            }
        }
    }
}
