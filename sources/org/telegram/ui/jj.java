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
public final class jj extends org.telegram.ui.ActionBar.j {
    public final Context f38170a;
    public final xn f38171b;

    public jj(xn xnVar, Context context) {
        this.f38171b = xnVar;
        this.f38170a = context;
    }

    @Override
    public final void b(int i10) {
        boolean z4;
        boolean z10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        boolean z11;
        boolean z12;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i12;
        int i13;
        ?? r92;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f38171b;
        SparseArray[] sparseArrayArr = xnVar.V5;
        SparseArray[] sparseArrayArr2 = xnVar.U5;
        SparseArray[] sparseArrayArr3 = xnVar.T5;
        long j10 = 0;
        if (i10 == -1) {
            if (!xnVar.f43361tc.f50505f) {
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar.s()) {
                    xnVar.z7(false);
                } else if (xnVar.O3 == 5 && (xnVar.f43333r6.isEmpty() || xnVar.f43116a4 == 0)) {
                    xnVar.Qb();
                } else if (xnVar.O3 == 6 && xnVar.V.w()) {
                    xnVar.wb(new Runnable(this) {
                        public final jj f37210b;

                        {
                            this.f37210b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f37210b.f38171b.finishFragment();
                                    return;
                                default:
                                    jj jjVar = this.f37210b;
                                    jjVar.getClass();
                                    xn xnVar2 = jjVar.f38171b;
                                    Intent intent = new Intent(xnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", xnVar2.M3.link);
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
            if (xnVar.getUserConfig().getClientUserId() == xnVar.Q5) {
                xnVar.getMessagesController().setSavedViewAs(true);
                xnVar.X0.e(false, true);
                return;
            }
            xnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-xnVar.Q5, false);
            mf1.I0(xnVar);
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
                        if (arrayList.size() != 1 && ((user3 = xnVar.f43178f) == null || !user3.self)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        spannableStringBuilder.append((CharSequence) xn.D8(messageObject2, z14, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    xnVar.Q7();
                    xnVar.f43378v3.j(58, 0L, null);
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
                TLRPC.Chat chat = xnVar.f43165e;
                if (chat != null) {
                    xnVar.presentFragment(xn.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j12 = xnVar.Q5;
                if (ChatObject.isMonoForum(xnVar.f43165e)) {
                    i17 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, xnVar.f43165e)) {
                        j12 = xnVar.f43116a4;
                        j10 = xnVar.Q5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                mh.t7.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = xnVar.Q5;
                if (ChatObject.isMonoForum(xnVar.f43165e)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, xnVar.f43165e)) {
                        j13 = xnVar.f43116a4;
                        j10 = xnVar.Q5;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                mh.t7.y(i14, false).C(j14, j15, new mh.t3(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (xnVar.Ya == null) {
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
                if (xnVar.f43145c6 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                xnVar.c9();
                xnVar.yc(0, true);
                xnVar.Wc(false);
                MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList2, new hj(0, this, z13));
            } else if (i10 == 13) {
                if (xnVar.getParentActivity() != null) {
                    xnVar.showDialog(org.telegram.ui.Components.z4.V(xnVar.getParentActivity(), xnVar.h, xnVar.f43136ba).f21166a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z15 = false;
                if (xnVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(xnVar.f43165e)) {
                        if (xnVar.f43116a4 != 0 && (user2 = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.f43116a4))) != null) {
                            org.telegram.ui.Components.z4.r(xnVar, -1, user2, xnVar.f43165e, true, new ng.w(18, this, user2), xnVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = xnVar.W7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i10 != 26) {
                        int i23 = 15;
                        if (i10 == 15) {
                            if (xnVar.h != null || (((user = xnVar.f43178f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(xnVar.f43178f)) && ((chatFull = xnVar.W7) == null || !chatFull.can_delete_channel))) {
                                i23 = 15;
                            }
                        }
                        if (i10 == i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        TLRPC.Chat chat2 = xnVar.f43165e;
                        TLRPC.User user4 = xnVar.f43178f;
                        if (xnVar.h != null) {
                            z15 = true;
                        }
                        org.telegram.ui.Components.z4.s(xnVar, z10, chat2, user4, z15, true, false, z4, new hg.m2(this, i10, z4));
                        return;
                    }
                    boolean z16 = z4;
                    org.telegram.ui.Components.z4.r(xnVar, -1, xnVar.f43178f, xnVar.f43165e, z16, new ij(this, z16), xnVar.getResourceProvider());
                }
            } else if (i10 == 17) {
                if (xnVar.f43178f != null && xnVar.getParentActivity() != null) {
                    TextView textView = xnVar.I1;
                    if (textView != null && textView.getTag() != null) {
                        xnVar.rb(null, ((Integer) xnVar.I1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", xnVar.f43178f.f20990id);
                    bundle.putBoolean("addContact", true);
                    xnVar.presentFragment(new os(bundle));
                }
            } else if (i10 == 18) {
                xnVar.bc(false);
            } else if (i10 == 24) {
                try {
                    xnVar.getMediaDataController().installShortcut(xnVar.f43178f.f20990id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(xnVar.f43165e)) {
                    y5 y5Var = new y5(xnVar.Q5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xnVar.A1;
                    y5Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                    }
                    xnVar.presentFragment(y5Var);
                    return;
                }
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.Q5));
            } else if (i10 == 21) {
                int i24 = m31.v;
                int currentAccount = xnVar.getCurrentAccount();
                Activity parentActivity = xnVar.getParentActivity();
                long a2 = xnVar.a();
                if (parentActivity != null) {
                    m31.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i25 = 0; i25 < 2; i25++) {
                    for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                        xnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !xnVar.W5);
                    }
                }
                xnVar.z7(false);
            } else if (i10 == 23) {
                for (int i27 = 1; i27 >= 0; i27--) {
                    if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                        }
                        messageObject = (MessageObject) xnVar.f43258l6[i27].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i27].clear();
                    sparseArrayArr2[i27].clear();
                    sparseArrayArr[i27].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    xnVar.f43117a5 = messageObject;
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
                i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                vf.o1 c3 = vf.p1.f(i12).c(xnVar.H8());
                Activity parentActivity2 = xnVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                vf.m1.d0(parentActivity2, i13, xnVar.N3, c3, xnVar.getResourceProvider(), new lh.a1(21, this, c3));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f38170a, xnVar.getResourceProvider(), true, true);
                g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                g1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f43166e0;
                org.telegram.ui.ActionBar.y yVar = xnVar.f43126b0;
                yVar.a();
                w0Var.M(g1Var, yVar.f22460m);
            } else if (i10 == 30) {
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                    jk jkVar = xnVar.V;
                    if (jkVar != null && jkVar.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    jk jkVar2 = xnVar.V;
                    if (jkVar2 != null && jkVar2.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    jk jkVar3 = xnVar.V;
                    if (jkVar3 != null && jkVar3.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    jk jkVar4 = xnVar.V;
                    if (jkVar4 != null && jkVar4.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    jk jkVar5 = xnVar.V;
                    if (jkVar5 != null && jkVar5.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    jk jkVar6 = xnVar.V;
                    if (jkVar6 != null && jkVar6.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    jk jkVar7 = xnVar.V;
                    if (jkVar7 != null && jkVar7.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    jk jkVar8 = xnVar.V;
                    if (jkVar8 != null && jkVar8.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    jk jkVar9 = xnVar.V;
                    if (jkVar9 != null && jkVar9.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    jk jkVar10 = xnVar.V;
                    if (jkVar10 != null && jkVar10.getEditField() != null) {
                        xnVar.V.getEditField().setSelectionOverride(xnVar.f43407x4, xnVar.f43421y4);
                        xnVar.V.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    xnVar.xb();
                } else if (i10 == 60) {
                    if (xnVar.Z3 != null) {
                        TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                        long j16 = xnVar.f43165e.f20843id;
                        TLRPC.TL_forumTopic tL_forumTopic = xnVar.Z3;
                        int i29 = tL_forumTopic.f20895id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i29, true);
                        xnVar.Rc();
                        xnVar.hc(false);
                        xnVar.Qc(true);
                    }
                } else if (i10 == 61) {
                    mf1.I0(xnVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(xnVar.M3.link);
                    org.telegram.ui.Components.qc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final jj f37210b;

                        {
                            this.f37210b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f37210b.f38171b.finishFragment();
                                    return;
                                default:
                                    jj jjVar = this.f37210b;
                                    jjVar.getClass();
                                    xn xnVar2 = jjVar.f38171b;
                                    Intent intent = new Intent(xnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", xnVar2.M3.link);
                                    xnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (xnVar.V.w()) {
                        xnVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = xnVar.M3;
                    g6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                    vf.q.b0(parentActivity3, i11, tL_businessChatLink, g6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    xnVar.showDialog(d2Var);
                    TextView textView2 = (TextView) d2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
                    }
                } else if (i10 == 73) {
                    ie1 a02 = ie1.a0(-xnVar.Q5, 0L);
                    a02.f37830y = xnVar;
                    xnVar.presentFragment(a02);
                } else if (i10 == 888) {
                    xnVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = l4.Y0;
                    org.telegram.ui.Components.qc.a0(xnVar).t("No rich message copied", null).j();
                }
            } else if (xnVar.f43178f != null && xnVar.getParentActivity() != null) {
                TLRPC.User user5 = xnVar.f43178f;
                if (i10 == 33) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = xnVar.X7;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Components.voip.g2.n(user5, z11, z12, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f43178f.f20990id), xnVar.getAccountInstance());
            }
        }
    }
}
