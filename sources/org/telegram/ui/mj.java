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
public final class mj extends org.telegram.ui.ActionBar.j {
    public final Context f35713a;
    public final xn f35714b;

    public mj(xn xnVar, Context context) {
        this.f35714b = xnVar;
        this.f35713a = context;
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
        org.telegram.ui.ActionBar.e6 e6Var;
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
        org.telegram.ui.ActionBar.l lVar;
        xn xnVar = this.f35714b;
        SparseArray[] sparseArrayArr = xnVar.Y5;
        SparseArray[] sparseArrayArr2 = xnVar.X5;
        SparseArray[] sparseArrayArr3 = xnVar.W5;
        long j3 = 0;
        if (i10 == -1) {
            if (!xnVar.f39962vc.f14203f) {
                lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                if (lVar.t()) {
                    xnVar.z7(false);
                } else if (xnVar.R3 == 5 && (xnVar.f39944u6.isEmpty() || xnVar.f39732d4 == 0)) {
                    xnVar.Qb();
                } else if (xnVar.R3 == 6 && xnVar.Y.w()) {
                    xnVar.wb(new Runnable(this) {
                        public final mj f34752b;

                        {
                            this.f34752b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34752b.f35714b.finishFragment();
                                    return;
                                default:
                                    mj mjVar = this.f34752b;
                                    mjVar.getClass();
                                    xn xnVar2 = mjVar.f35714b;
                                    Intent intent = new Intent(xnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", xnVar2.P3.link);
                                    xnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!xnVar.X6(true, true)) {
                    xnVar.finishFragment();
                }
            } else {
                xnVar.ta();
            }
        } else if (i10 == 59) {
            if (xnVar.getUserConfig().getClientUserId() == xnVar.T5) {
                xnVar.getMessagesController().setSavedViewAs(true);
                xnVar.f39690a1.e(false, true);
                return;
            }
            xnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-xnVar.T5, false);
            wf1.I0(xnVar);
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
                    if (xnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = xnVar.f39752f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) xn.D8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    xnVar.Q7();
                    xnVar.y3.j(58, 0L, null);
                }
                xnVar.z7(false);
            } else if (i10 == 12) {
                if (xnVar.getParentActivity() != null) {
                    xnVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                xnVar.ba(true);
            } else if (i10 == 69) {
                xn.B1(xnVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = xnVar.e;
                if (chat != null) {
                    xnVar.presentFragment(xn.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = xnVar.T5;
                if (ChatObject.isMonoForum(xnVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, xnVar.e)) {
                        j11 = xnVar.f39732d4;
                        j3 = xnVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                yh.s5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = xnVar.T5;
                if (ChatObject.isMonoForum(xnVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, xnVar.e)) {
                        j12 = xnVar.f39732d4;
                        j3 = xnVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                yh.s5.y(i14, false).C(j13, j14, new eh(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (xnVar.f39699ab == null) {
                    xn.G1(xnVar);
                } else {
                    xnVar.k9();
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
                if (xnVar.f39759f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                xnVar.c9();
                xnVar.yc(0, true);
                xnVar.Wc(false);
                MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList2, new kj(0, this, z14));
            } else if (i10 == 13) {
                if (xnVar.getParentActivity() != null) {
                    xnVar.showDialog(org.telegram.ui.Components.e5.V(xnVar.getParentActivity(), xnVar.h, xnVar.f39750ea).f18655a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (xnVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(xnVar.e)) {
                        if (xnVar.f39732d4 != 0 && (user2 = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.f39732d4))) != null) {
                            org.telegram.ui.Components.e5.r(xnVar, -1, user2, xnVar.e, true, new p(12, this, user2), xnVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = xnVar.Z7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && xnVar.h == null && (((user = xnVar.f39752f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(xnVar.f39752f)) || ((chatFull = xnVar.Z7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.e5.r(xnVar, -1, xnVar.f39752f, xnVar.e, z17, new lj(this, z17), xnVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = xnVar.e;
                    TLRPC.User user4 = xnVar.f39752f;
                    if (xnVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.e5.s(xnVar, z11, chat2, user4, z16, true, false, z10, new i2.s(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (xnVar.f39752f != null && xnVar.getParentActivity() != null) {
                    TextView textView = xnVar.L1;
                    if (textView != null && textView.getTag() != null) {
                        xnVar.rb(null, ((Integer) xnVar.L1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", xnVar.f39752f.f18476id);
                    bundle.putBoolean("addContact", true);
                    xnVar.presentFragment(new ps(bundle));
                }
            } else if (i10 == 18) {
                xnVar.bc(false);
            } else if (i10 == 24) {
                try {
                    xnVar.getMediaDataController().installShortcut(xnVar.f39752f.f18476id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(xnVar.e)) {
                    x5 x5Var = new x5(xnVar.T5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xnVar.D1;
                    x5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.P, x5Var.R, new o5(x5Var, 0));
                    }
                    xnVar.presentFragment(x5Var);
                    return;
                }
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.T5));
            } else if (i10 == 21) {
                int i23 = v31.v;
                int currentAccount = xnVar.getCurrentAccount();
                Activity parentActivity = xnVar.getParentActivity();
                long a2 = xnVar.a();
                if (parentActivity != null) {
                    v31.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i24 = 0; i24 < 2; i24++) {
                    for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                        xnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !xnVar.Z5);
                    }
                }
                xnVar.z7(false);
            } else if (i10 == 23) {
                for (int i26 = 1; i26 >= 0; i26--) {
                    if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                        }
                        messageObject = (MessageObject) xnVar.f39868o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i26].clear();
                    sparseArrayArr2[i26].clear();
                    sparseArrayArr[i26].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    xnVar.f39733d5 = messageObject;
                    xnVar.Ba(109);
                    r92 = 0;
                } else {
                    r92 = 0;
                    xnVar.Xb(messageObject, false);
                }
                xnVar.c9();
                xnVar.yc(r92, true);
                xnVar.Wc(r92);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                hg.a2 c10 = hg.b2.f(i12).c(xnVar.H8());
                Activity parentActivity2 = xnVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                hg.y1.d0(parentActivity2, i13, xnVar.Q3, c10, xnVar.getResourceProvider(), new qc(9, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f35713a, xnVar.getResourceProvider(), true, true);
                g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                g1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39777h0;
                org.telegram.ui.ActionBar.z zVar = xnVar.f39741e0;
                zVar.a();
                w0Var.M(g1Var, zVar.f19962m);
            } else if (i10 == 30) {
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (xnVar.E9()) {
                    str = "";
                }
                xnVar.la(str);
            } else if (i10 == 62) {
                xnVar.getMessagesController().getTranslateController().setHideTranslateDialog(xnVar.a(), false, true);
                if (!xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a(), true)) {
                    xnVar.Qc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    lk lkVar = xnVar.Y;
                    if (lkVar != null && lkVar.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    lk lkVar2 = xnVar.Y;
                    if (lkVar2 != null && lkVar2.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    lk lkVar3 = xnVar.Y;
                    if (lkVar3 != null && lkVar3.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    lk lkVar4 = xnVar.Y;
                    if (lkVar4 != null && lkVar4.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    lk lkVar5 = xnVar.Y;
                    if (lkVar5 != null && lkVar5.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    lk lkVar6 = xnVar.Y;
                    if (lkVar6 != null && lkVar6.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    lk lkVar7 = xnVar.Y;
                    if (lkVar7 != null && lkVar7.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    lk lkVar8 = xnVar.Y;
                    if (lkVar8 != null && lkVar8.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    lk lkVar9 = xnVar.Y;
                    if (lkVar9 != null && lkVar9.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    lk lkVar10 = xnVar.Y;
                    if (lkVar10 != null && lkVar10.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    xnVar.xb();
                } else if (i10 == 60) {
                    if (xnVar.f39720c4 != null) {
                        TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                        long j15 = xnVar.e.f18329id;
                        TLRPC.TL_forumTopic tL_forumTopic = xnVar.f39720c4;
                        int i28 = tL_forumTopic.f18381id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i28, true);
                        xnVar.Rc();
                        xnVar.hc(false);
                        xnVar.Qc(true);
                    }
                } else if (i10 == 61) {
                    wf1.I0(xnVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(xnVar.P3.link);
                    org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final mj f34752b;

                        {
                            this.f34752b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34752b.f35714b.finishFragment();
                                    return;
                                default:
                                    mj mjVar = this.f34752b;
                                    mjVar.getClass();
                                    xn xnVar2 = mjVar.f35714b;
                                    Intent intent = new Intent(xnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", xnVar2.P3.link);
                                    xnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (xnVar.Y.w()) {
                        xnVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = xnVar.P3;
                    e6Var = ((org.telegram.ui.ActionBar.o2) xnVar).resourceProvider;
                    hg.v.b0(parentActivity3, i11, tL_businessChatLink, e6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 19));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    xnVar.showDialog(c2Var);
                    TextView textView2 = (TextView) c2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
                    }
                } else if (i10 == 73) {
                    se1 a02 = se1.a0(-xnVar.T5, 0L);
                    a02.f37419y = xnVar;
                    xnVar.presentFragment(a02);
                } else if (i10 == 888) {
                    xnVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = j4.f34583b1;
                    org.telegram.ui.Components.xc.a0(xnVar).t("No rich message copied", null).j();
                }
            } else if (xnVar.f39752f != null && xnVar.getParentActivity() != null) {
                TLRPC.User user5 = xnVar.f39752f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = xnVar.f39696a8;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.g2.m(user5, z12, z13, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f39752f.f18476id), xnVar.getAccountInstance());
            }
        }
    }
}
