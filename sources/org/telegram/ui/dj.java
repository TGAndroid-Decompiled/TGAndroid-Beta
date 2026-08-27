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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class dj extends org.telegram.ui.ActionBar.j {

    public final Context f37414a;

    public final rn f37415b;

    public dj(rn rnVar, Context context) {
        this.f37415b = rnVar;
        this.f37414a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        ?? r10;
        TLRPC.User user3;
        rn rnVar = this.f37415b;
        SparseArray[] sparseArrayArr = rnVar.U5;
        SparseArray[] sparseArrayArr2 = rnVar.T5;
        SparseArray[] sparseArrayArr3 = rnVar.S5;
        int i12 = 6;
        long j10 = 0;
        final int i13 = 1;
        final int i14 = 0;
        if (i10 == -1) {
            if (rnVar.f42212sc.f48498f) {
                rnVar.ta();
                return;
            }
            if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t()) {
                rnVar.z7(false);
                return;
            }
            if (rnVar.N3 == 5 && (rnVar.q6.isEmpty() || rnVar.Z3 == 0)) {
                rnVar.Qb();
            } else if (rnVar.N3 == 6 && rnVar.U.x()) {
                rnVar.wb(new Runnable(this) {

                    public final dj f36552b;

                    {
                        this.f36552b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.f36552b.f37415b.finishFragment();
                                break;
                            default:
                                dj djVar = this.f36552b;
                                djVar.getClass();
                                rn rnVar2 = djVar.f37415b;
                                Intent intent = new Intent(rnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", rnVar2.L3.link);
                                rnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!rnVar.X6(true, true)) {
                rnVar.finishFragment();
            }
        } else {
            if (i10 == 59) {
                if (rnVar.getUserConfig().getClientUserId() == rnVar.P5) {
                    rnVar.getMessagesController().setSavedViewAs(true);
                    rnVar.W0.e(false, true);
                    return;
                } else {
                    rnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-rnVar.P5, false);
                    we1.I0(rnVar);
                    return;
                }
            }
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long fromChatId = 0;
                for (int i15 = 1; i15 >= 0; i15--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = 0; i16 < sparseArrayArr2[i15].size(); i16++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i15].keyAt(i16)));
                    }
                    if (rnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i15].get(((Integer) arrayList.get(i17)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) rn.D8(messageObject2, arrayList.size() != 1 && ((user3 = rnVar.f42039f) == null || !user3.self), fromChatId));
                        fromChatId = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    rnVar.Q7();
                    rnVar.f42229u3.j(58, 0L, null);
                }
                rnVar.z7(false);
                return;
            }
            if (i10 != 12) {
                if (i10 == 11) {
                    rnVar.ba(true);
                    return;
                }
                if (i10 == 69) {
                    rn.B1(rnVar);
                    return;
                }
                if (i10 != 70) {
                    if (i10 == 72) {
                        long j11 = rnVar.P5;
                        if (ChatObject.isMonoForum(rnVar.f42026e) && ChatObject.canManageMonoForum(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f42026e)) {
                            j11 = rnVar.Z3;
                            j10 = rnVar.P5;
                        }
                        hh.u7.y(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, false).i0(j11, j10, false, false);
                        return;
                    }
                    if (i10 == 71) {
                        long j12 = rnVar.P5;
                        if (ChatObject.isMonoForum(rnVar.f42026e) && ChatObject.canManageMonoForum(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f42026e)) {
                            j12 = rnVar.Z3;
                            j10 = rnVar.P5;
                        }
                        long j13 = j12;
                        long j14 = j10;
                        hh.u7.y(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, false).C(j13, j14, new hh.u3(this, j13, j14, 2));
                        return;
                    }
                    if (i10 == 28) {
                        if (rnVar.Xa == null) {
                            rn.G1(rnVar);
                            return;
                        } else {
                            rnVar.k9();
                            return;
                        }
                    }
                    if (i10 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 1; i18 >= 0; i18--) {
                            for (int i19 = 0; i19 < sparseArrayArr3[i18].size(); i19++) {
                                arrayList2.add((MessageObject) sparseArrayArr3[i18].valueAt(i19));
                            }
                            sparseArrayArr3[i18].clear();
                            sparseArrayArr2[i18].clear();
                            sparseArrayArr[i18].clear();
                        }
                        boolean z10 = rnVar.f41993b6 > 0;
                        rnVar.c9();
                        rnVar.yc(0, true);
                        rnVar.Wc(false);
                        MediaController.saveFilesFromMessages(rnVar.getParentActivity(), rnVar.getAccountInstance(), arrayList2, new bj(0, this, z10));
                        return;
                    }
                    int i20 = 13;
                    if (i10 == 13) {
                        if (rnVar.getParentActivity() == null) {
                            return;
                        }
                        rnVar.showDialog(org.telegram.ui.Components.y4.V(rnVar.getParentActivity(), rnVar.h, rnVar.f41983aa).f22702a);
                        return;
                    }
                    if (i10 == 15 || i10 == 16 || i10 == 26) {
                        if (rnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i10 == 15 && ChatObject.isMonoForum(rnVar.f42026e)) {
                            if (rnVar.Z3 == 0 || (user2 = rnVar.getMessagesController().getUser(Long.valueOf(rnVar.Z3))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.y4.r(rnVar, -1, user2, rnVar.f42026e, true, new jh.z1(19, this, user2), rnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = rnVar.V7;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i10 != 26) {
                            if (i10 == 15) {
                                i11 = (rnVar.h != null || (((user = rnVar.f42039f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(rnVar.f42039f)) && ((chatFull = rnVar.V7) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.y4.s(rnVar, i10 == i11, rnVar.f42026e, rnVar.f42039f, rnVar.h == null ? 0 : 1, true, false, z11, new cg.p2(this, i10, z11));
                            return;
                        }
                        org.telegram.ui.Components.y4.r(rnVar, -1, rnVar.f42039f, rnVar.f42026e, z11, new cj(this, z11), rnVar.getResourceProvider());
                        return;
                    }
                    int i21 = 17;
                    if (i10 == 17) {
                        if (rnVar.f42039f == null || rnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = rnVar.H1;
                        if (textView != null && textView.getTag() != null) {
                            rnVar.rb(null, ((Integer) rnVar.H1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", rnVar.f42039f.f22527id);
                        bundle.putBoolean("addContact", true);
                        rnVar.presentFragment(new js(bundle));
                        return;
                    }
                    if (i10 == 18) {
                        rnVar.bc(false);
                        return;
                    }
                    if (i10 == 24) {
                        try {
                            rnVar.getMediaDataController().installShortcut(rnVar.f42039f.f22527id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                    if (i10 == 29) {
                        if (!ChatObject.hasAdminRights(rnVar.f42026e)) {
                            rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(rnVar.P5));
                            return;
                        }
                        v5 v5Var = new v5(rnVar.P5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = rnVar.f42291z1;
                        v5Var.N = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, 0));
                        }
                        rnVar.presentFragment(v5Var);
                        return;
                    }
                    if (i10 == 21) {
                        int i22 = x21.v;
                        int currentAccount = rnVar.getCurrentAccount();
                        Activity parentActivity = rnVar.getParentActivity();
                        long jA = rnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        x21.K(currentAccount, parentActivity, jA, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i10 == 22) {
                        for (int i23 = 0; i23 < 2; i23++) {
                            for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                                MessageObject messageObject3 = (MessageObject) sparseArrayArr[i23].valueAt(i24);
                                rnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !rnVar.V5);
                            }
                        }
                        rnVar.z7(false);
                        return;
                    }
                    if (i10 == 23) {
                        for (int i25 = 1; i25 >= 0; i25--) {
                            if (messageObject == null && sparseArrayArr3[i25].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                                }
                                messageObject = (MessageObject) rnVar.f42109k6[i25].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i25].clear();
                            sparseArrayArr2[i25].clear();
                            sparseArrayArr[i25].clear();
                        }
                        if (messageObject == null || !messageObject.isTodo()) {
                            r10 = 0;
                            rnVar.Xb(messageObject, false);
                        } else {
                            rnVar.Z4 = messageObject;
                            rnVar.Ba(109);
                            r10 = 0;
                        }
                        rnVar.c9();
                        rnVar.yc(r10, true);
                        rnVar.Wc(r10);
                        return;
                    }
                    if (i10 == 64) {
                        qf.p1 p1VarC = qf.q1.f(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).c(rnVar.H8());
                        qf.n1.d0(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.M3, p1VarC, rnVar.getResourceProvider(), new df(i12, this, p1VarC));
                        return;
                    }
                    if (i10 == 14) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f37414a, rnVar.getResourceProvider(), true, true);
                        f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                        f1Var.setOnClickListener(new a(this, i20));
                        org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
                        org.telegram.ui.ActionBar.y yVar = rnVar.f41975a0;
                        yVar.a();
                        v0Var.M(f1Var, yVar.f23967m);
                        return;
                    }
                    if (i10 == 30) {
                        rnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", rnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 31) {
                        rnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", rnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i10 == 40) {
                        rnVar.la(rnVar.E9() ? "" : null);
                        return;
                    }
                    if (i10 == 62) {
                        rnVar.getMessagesController().getTranslateController().setHideTranslateDialog(rnVar.a(), false, true);
                        if (rnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(rnVar.a(), true)) {
                            return;
                        }
                        rnVar.Qc(true);
                        return;
                    }
                    if (i10 == 32 || i10 == 33) {
                        if (rnVar.f42039f == null || rnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user4 = rnVar.f42039f;
                        boolean z12 = i10 == 33;
                        TLRPC.UserFull userFull = rnVar.W7;
                        org.telegram.ui.Components.voip.e2.n(user4, z12, userFull != null && userFull.video_calls_available, rnVar.getParentActivity(), rnVar.getMessagesController().getUserFull(rnVar.f42039f.f22527id), rnVar.getAccountInstance());
                        return;
                    }
                    if (i10 == 50) {
                        ck ckVar = rnVar.U;
                        if (ckVar == null || ckVar.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedBold();
                        return;
                    }
                    if (i10 == 51) {
                        ck ckVar2 = rnVar.U;
                        if (ckVar2 == null || ckVar2.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedItalic();
                        return;
                    }
                    if (i10 == 57) {
                        ck ckVar3 = rnVar.U;
                        if (ckVar3 == null || ckVar3.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedSpoiler();
                        return;
                    }
                    if (i10 == 58) {
                        ck ckVar4 = rnVar.U;
                        if (ckVar4 == null || ckVar4.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedQuote();
                        return;
                    }
                    if (i10 == 52) {
                        ck ckVar5 = rnVar.U;
                        if (ckVar5 == null || ckVar5.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedMono();
                        return;
                    }
                    if (i10 == 55) {
                        ck ckVar6 = rnVar.U;
                        if (ckVar6 == null || ckVar6.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedStrike();
                        return;
                    }
                    if (i10 == 56) {
                        ck ckVar7 = rnVar.U;
                        if (ckVar7 == null || ckVar7.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedUnderline();
                        return;
                    }
                    if (i10 == 74) {
                        ck ckVar8 = rnVar.U;
                        if (ckVar8 == null || ckVar8.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedDate();
                        return;
                    }
                    if (i10 == 53) {
                        ck ckVar9 = rnVar.U;
                        if (ckVar9 == null || ckVar9.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedUrl();
                        return;
                    }
                    if (i10 == 54) {
                        ck ckVar10 = rnVar.U;
                        if (ckVar10 == null || ckVar10.getEditField() == null) {
                            return;
                        }
                        rnVar.U.getEditField().setSelectionOverride(rnVar.f42256w4, rnVar.f42268x4);
                        rnVar.U.getEditField().makeSelectedRegular();
                        return;
                    }
                    if (i10 == 27) {
                        rnVar.xb();
                        return;
                    }
                    if (i10 == 60) {
                        if (rnVar.Y3 == null) {
                            return;
                        }
                        TopicsController topicsController = rnVar.getMessagesController().getTopicsController();
                        long j15 = rnVar.f42026e.f22380id;
                        TLRPC.TL_forumTopic tL_forumTopic = rnVar.Y3;
                        int i27 = tL_forumTopic.f22432id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i27, true);
                        rnVar.Rc();
                        rnVar.hc(false);
                        rnVar.Qc(true);
                        return;
                    }
                    if (i10 == 61) {
                        we1.I0(rnVar);
                        return;
                    }
                    if (i10 == 65) {
                        AndroidUtilities.addToClipboard(rnVar.L3.link);
                        org.telegram.ui.Components.mc.a0(LaunchActivity.R()).k(false).j();
                        return;
                    }
                    if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {

                            public final dj f36552b;

                            {
                                this.f36552b = this;
                            }

                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        this.f36552b.f37415b.finishFragment();
                                        break;
                                    default:
                                        dj djVar = this.f36552b;
                                        djVar.getClass();
                                        rn rnVar2 = djVar.f37415b;
                                        Intent intent = new Intent(rnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", rnVar2.L3.link);
                                        rnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (rnVar.U.x()) {
                            rnVar.wb(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i10 == 67) {
                        qf.s.b0(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.L3, ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider);
                        return;
                    }
                    if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, i21));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        rnVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
                            return;
                        }
                        return;
                    }
                    if (i10 == 73) {
                        sd1 sd1VarA0 = sd1.a0(-rnVar.P5, 0L);
                        sd1VarA0.f42601y = rnVar;
                        rnVar.presentFragment(sd1VarA0);
                        return;
                    } else if (i10 == 888) {
                        rnVar.dumpCanvas();
                        return;
                    } else {
                        if (i10 == 889) {
                            HashSet hashSet = m4.X0;
                            org.telegram.ui.Components.mc.a0(rnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = rnVar.f42026e;
                if (chat != null) {
                    rnVar.presentFragment(rn.R9(-chat.linked_monoforum_id));
                }
            } else if (rnVar.getParentActivity() != null) {
                rnVar.F7(null, null, false);
            }
        }
    }
}
