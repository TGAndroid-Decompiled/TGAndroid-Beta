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
    public final Context f37346a;
    public final sn f37347b;

    public fj(sn snVar, Context context) {
        this.f37347b = snVar;
        this.f37346a = context;
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
        org.telegram.ui.ActionBar.g6 g6Var;
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
        sn snVar = this.f37347b;
        SparseArray[] sparseArrayArr = snVar.f41576k6;
        SparseArray[] sparseArrayArr2 = snVar.f41563j6;
        SparseArray[] sparseArrayArr3 = snVar.f41551i6;
        long j10 = 0;
        int i18 = 0;
        if (i10 == -1) {
            if (!snVar.Kc.f17447f) {
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                if (kVar.s()) {
                    snVar.C7(false);
                } else if (snVar.f41489d4 == 5 && (snVar.G6.isEmpty() || snVar.f41635p4 == 0)) {
                    snVar.Wb();
                } else if (snVar.f41489d4 == 6 && snVar.Y.u()) {
                    snVar.Cb(new Runnable(this) {
                        public final fj f36363b;

                        {
                            this.f36363b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f36363b.f37347b.finishFragment();
                                    return;
                                default:
                                    fj fjVar = this.f36363b;
                                    fjVar.getClass();
                                    sn snVar2 = fjVar.f37347b;
                                    Intent intent = new Intent(snVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", snVar2.f41462b4.link);
                                    snVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!snVar.a7(true, true)) {
                    snVar.finishFragment();
                }
            } else {
                snVar.xa();
            }
        } else if (i10 == 59) {
            if (snVar.getUserConfig().getClientUserId() == snVar.f41516f6) {
                snVar.getMessagesController().setSavedViewAs(true);
                snVar.f41594m1.e(false, true);
                return;
            }
            snVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-snVar.f41516f6, false);
            xe1.H0(snVar);
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
                    if (snVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = snVar.f41509f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) sn.I8(messageObject2, z15, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    snVar.T7();
                    snVar.K3.j(58, 0L, null);
                }
                snVar.C7(false);
            } else if (i10 == 12) {
                if (snVar.getParentActivity() != null) {
                    snVar.I7(null, null, false);
                }
            } else if (i10 == 11) {
                snVar.ga(true);
            } else if (i10 == 69) {
                sn.C1(snVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = snVar.e;
                if (chat != null) {
                    snVar.presentFragment(sn.W9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j12 = snVar.f41516f6;
                if (ChatObject.isMonoForum(snVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, snVar.e)) {
                        j12 = snVar.f41635p4;
                        j10 = snVar.f41516f6;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                ai.ha.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = snVar.f41516f6;
                if (ChatObject.isMonoForum(snVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, snVar.e)) {
                        j13 = snVar.f41635p4;
                        j10 = snVar.f41516f6;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                ai.ha.y(i14, false).C(j14, j15, new ai.q5(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (snVar.f41618nb == null) {
                    sn.I1(snVar);
                } else {
                    snVar.p9();
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
                if (snVar.f41661r6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                snVar.h9();
                snVar.Fc(0, true);
                snVar.dd(false);
                MediaController.saveFilesFromMessages(snVar.getParentActivity(), snVar.getAccountInstance(), arrayList2, new dj(0, this, z14));
            } else if (i10 == 13) {
                if (snVar.getParentActivity() != null) {
                    snVar.showDialog(org.telegram.ui.Components.d5.U(snVar.getParentActivity(), snVar.h, snVar.f41651qa).f20679a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (snVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(snVar.e)) {
                        if (snVar.f41635p4 != 0 && (user2 = snVar.getMessagesController().getUser(Long.valueOf(snVar.f41635p4))) != null) {
                            org.telegram.ui.Components.d5.q(snVar, -1, user2, snVar.e, true, new m4.w0(16, this, user2), snVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = snVar.f41589l8;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && snVar.h == null && (((user = snVar.f41509f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(snVar.f41509f)) || ((chatFull = snVar.f41589l8) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.d5.q(snVar, -1, snVar.f41509f, snVar.e, z17, new ej(this, z17), snVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = snVar.e;
                    TLRPC.User user4 = snVar.f41509f;
                    if (snVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.d5.r(snVar, z11, chat2, user4, z16, true, false, z10, new i2.r(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (snVar.f41509f != null && snVar.getParentActivity() != null) {
                    TextView textView = snVar.X1;
                    if (textView != null && textView.getTag() != null) {
                        snVar.xb(null, ((Integer) snVar.X1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", snVar.f41509f.f20491id);
                    bundle.putBoolean("addContact", true);
                    snVar.presentFragment(new hs(bundle));
                }
            } else if (i10 == 18) {
                snVar.hc(false);
            } else if (i10 == 24) {
                try {
                    snVar.getMediaDataController().installShortcut(snVar.f41509f.f20491id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(snVar.e)) {
                    y5 y5Var = new y5(snVar.f41516f6);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = snVar.P1;
                    y5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.R, y5Var.T, new q5(y5Var, 0));
                    }
                    snVar.presentFragment(y5Var);
                    return;
                }
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.f41516f6));
            } else if (i10 == 21) {
                int i24 = r21.f40991w;
                int currentAccount = snVar.getCurrentAccount();
                Activity parentActivity = snVar.getParentActivity();
                long a2 = snVar.a();
                if (parentActivity != null) {
                    r21.N(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i25 = 0; i25 < 2; i25++) {
                    for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                        snVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !snVar.f41587l6);
                    }
                }
                snVar.C7(false);
            } else if (i10 == 23) {
                for (int i27 = 1; i27 >= 0; i27--) {
                    if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                        }
                        messageObject = (MessageObject) snVar.A6[i27].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i27].clear();
                    sparseArrayArr2[i27].clear();
                    sparseArrayArr[i27].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    snVar.p5 = messageObject;
                    snVar.Fa(109);
                    r92 = 0;
                } else {
                    r92 = 0;
                    snVar.dc(messageObject, false);
                }
                snVar.h9();
                snVar.Fc(r92, true);
                snVar.dd(r92);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                ig.y1 c10 = ig.z1.f(i12).c(snVar.M8());
                Activity parentActivity2 = snVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                ig.w1.d0(parentActivity2, i13, snVar.f41476c4, c10, snVar.getResourceProvider(), new org.telegram.ui.ActionBar.m3(15, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f37346a, snVar.getResourceProvider(), true, true);
                e1Var.j(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                e1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41534h0;
                org.telegram.ui.ActionBar.x xVar = snVar.f41497e0;
                xVar.a();
                u0Var.M(e1Var, xVar.f21950m);
            } else if (i10 == 30) {
                snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", snVar.f41516f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", snVar.f41516f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (snVar.J9()) {
                    str = "";
                }
                snVar.qa(str);
            } else if (i10 == 62) {
                snVar.getMessagesController().getTranslateController().setHideTranslateDialog(snVar.a(), false, true);
                if (!snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a(), true)) {
                    snVar.Xc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    gk gkVar = snVar.Y;
                    if (gkVar != null && gkVar.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    gk gkVar2 = snVar.Y;
                    if (gkVar2 != null && gkVar2.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    gk gkVar3 = snVar.Y;
                    if (gkVar3 != null && gkVar3.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    gk gkVar4 = snVar.Y;
                    if (gkVar4 != null && gkVar4.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    gk gkVar5 = snVar.Y;
                    if (gkVar5 != null && gkVar5.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    gk gkVar6 = snVar.Y;
                    if (gkVar6 != null && gkVar6.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    gk gkVar7 = snVar.Y;
                    if (gkVar7 != null && gkVar7.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    gk gkVar8 = snVar.Y;
                    if (gkVar8 != null && gkVar8.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    gk gkVar9 = snVar.Y;
                    if (gkVar9 != null && gkVar9.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    gk gkVar10 = snVar.Y;
                    if (gkVar10 != null && gkVar10.getEditField() != null) {
                        snVar.Y.getEditField().setSelectionOverride(snVar.M4, snVar.N4);
                        snVar.Y.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    snVar.Db();
                } else if (i10 == 60) {
                    if (snVar.f41624o4 != null) {
                        TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                        long j16 = snVar.e.f20344id;
                        TLRPC.TL_forumTopic tL_forumTopic = snVar.f41624o4;
                        int i29 = tL_forumTopic.f20396id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i29, true);
                        snVar.Yc();
                        snVar.oc(false);
                        snVar.Xc(true);
                    }
                } else if (i10 == 61) {
                    xe1.H0(snVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(snVar.f41462b4.link);
                    org.telegram.ui.Components.vc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final fj f36363b;

                        {
                            this.f36363b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f36363b.f37347b.finishFragment();
                                    return;
                                default:
                                    fj fjVar = this.f36363b;
                                    fjVar.getClass();
                                    sn snVar2 = fjVar.f37347b;
                                    Intent intent = new Intent(snVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", snVar2.f41462b4.link);
                                    snVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (snVar.Y.u()) {
                        snVar.Cb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = snVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = snVar.f41462b4;
                    g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                    ig.v.b0(parentActivity3, i11, tL_businessChatLink, g6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    snVar.showDialog(c2Var);
                    TextView textView2 = (TextView) c2Var.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21422q7, snVar.getResourceProvider());
                    }
                } else if (i10 == 73) {
                    sd1 a02 = sd1.a0(-snVar.f41516f6, 0L);
                    a02.f41359y = snVar;
                    snVar.presentFragment(a02);
                } else if (i10 == 888) {
                    snVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = k4.f38730c1;
                    org.telegram.ui.Components.vc.a0(snVar).t("No rich message copied", null).j();
                }
            } else if (snVar.f41509f != null && snVar.getParentActivity() != null) {
                TLRPC.User user5 = snVar.f41509f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = snVar.f41601m8;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.d2.m(user5, z12, z13, snVar.getParentActivity(), snVar.getMessagesController().getUserFull(snVar.f41509f.f20491id), snVar.getAccountInstance());
            }
        }
    }
}
