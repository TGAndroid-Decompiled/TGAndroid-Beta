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
public final class kj extends org.telegram.ui.ActionBar.j {
    public final Context f34736a;
    public final xn f34737b;

    public kj(xn xnVar, Context context) {
        this.f34737b = xnVar;
        this.f34736a = context;
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
        xn xnVar = this.f34737b;
        SparseArray[] sparseArrayArr = xnVar.Y5;
        SparseArray[] sparseArrayArr2 = xnVar.X5;
        SparseArray[] sparseArrayArr3 = xnVar.W5;
        long j3 = 0;
        if (i10 == -1) {
            if (!xnVar.f39581vc.f13963f) {
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar.s()) {
                    xnVar.z7(false);
                } else if (xnVar.R3 == 5 && (xnVar.f39563u6.isEmpty() || xnVar.f39352d4 == 0)) {
                    xnVar.Qb();
                } else if (xnVar.R3 == 6 && xnVar.Y.x()) {
                    xnVar.wb(new Runnable(this) {
                        public final kj f33867b;

                        {
                            this.f33867b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f33867b.f34737b.finishFragment();
                                    return;
                                default:
                                    kj kjVar = this.f33867b;
                                    kjVar.getClass();
                                    xn xnVar2 = kjVar.f34737b;
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
                xnVar.f39310a1.e(false, true);
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
                        if (arrayList.size() != 1 && ((user3 = xnVar.f39372f) == null || !user3.self)) {
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
                    i17 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, xnVar.e)) {
                        j11 = xnVar.f39352d4;
                        j3 = xnVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                yh.t5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = xnVar.T5;
                if (ChatObject.isMonoForum(xnVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, xnVar.e)) {
                        j12 = xnVar.f39352d4;
                        j3 = xnVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                yh.t5.y(i14, false).C(j13, j14, new jg(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (xnVar.f39319ab == null) {
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
                if (xnVar.f39379f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                xnVar.c9();
                xnVar.yc(0, true);
                xnVar.Wc(false);
                MediaController.saveFilesFromMessages(xnVar.getParentActivity(), xnVar.getAccountInstance(), arrayList2, new ij(0, this, z14));
            } else if (i10 == 13) {
                if (xnVar.getParentActivity() != null) {
                    xnVar.showDialog(org.telegram.ui.Components.e5.V(xnVar.getParentActivity(), xnVar.h, xnVar.f39370ea).f18409a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (xnVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(xnVar.e)) {
                        if (xnVar.f39352d4 != 0 && (user2 = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.f39352d4))) != null) {
                            org.telegram.ui.Components.e5.r(xnVar, -1, user2, xnVar.e, true, new u(11, this, user2), xnVar.getResourceProvider());
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
                    if (i10 == 26 || (i10 == 15 && xnVar.h == null && (((user = xnVar.f39372f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(xnVar.f39372f)) || ((chatFull = xnVar.Z7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.e5.r(xnVar, -1, xnVar.f39372f, xnVar.e, z17, new jj(this, z17), xnVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = xnVar.e;
                    TLRPC.User user4 = xnVar.f39372f;
                    if (xnVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.e5.s(xnVar, z11, chat2, user4, z16, true, false, z10, new i2.s(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (xnVar.f39372f != null && xnVar.getParentActivity() != null) {
                    TextView textView = xnVar.L1;
                    if (textView != null && textView.getTag() != null) {
                        xnVar.rb(null, ((Integer) xnVar.L1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", xnVar.f39372f.f18230id);
                    bundle.putBoolean("addContact", true);
                    xnVar.presentFragment(new ns(bundle));
                }
            } else if (i10 == 18) {
                xnVar.bc(false);
            } else if (i10 == 24) {
                try {
                    xnVar.getMediaDataController().installShortcut(xnVar.f39372f.f18230id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(xnVar.e)) {
                    w5 w5Var = new w5(xnVar.T5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xnVar.D1;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                    }
                    xnVar.presentFragment(w5Var);
                    return;
                }
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(xnVar.T5));
            } else if (i10 == 21) {
                int i23 = u31.v;
                int currentAccount = xnVar.getCurrentAccount();
                Activity parentActivity = xnVar.getParentActivity();
                long a2 = xnVar.a();
                if (parentActivity != null) {
                    u31.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
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
                        messageObject = (MessageObject) xnVar.f39487o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i26].clear();
                    sparseArrayArr2[i26].clear();
                    sparseArrayArr[i26].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    xnVar.f39353d5 = messageObject;
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
                i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                hg.b2 c10 = hg.c2.f(i12).c(xnVar.H8());
                Activity parentActivity2 = xnVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                hg.z1.d0(parentActivity2, i13, xnVar.Q3, c10, xnVar.getResourceProvider(), new oc(9, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f34736a, xnVar.getResourceProvider(), true, true);
                f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                f1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39396h0;
                org.telegram.ui.ActionBar.y yVar = xnVar.f39361e0;
                yVar.a();
                v0Var.M(f1Var, yVar.f19685m);
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
                    jk jkVar = xnVar.Y;
                    if (jkVar != null && jkVar.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    jk jkVar2 = xnVar.Y;
                    if (jkVar2 != null && jkVar2.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    jk jkVar3 = xnVar.Y;
                    if (jkVar3 != null && jkVar3.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    jk jkVar4 = xnVar.Y;
                    if (jkVar4 != null && jkVar4.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    jk jkVar5 = xnVar.Y;
                    if (jkVar5 != null && jkVar5.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    jk jkVar6 = xnVar.Y;
                    if (jkVar6 != null && jkVar6.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    jk jkVar7 = xnVar.Y;
                    if (jkVar7 != null && jkVar7.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    jk jkVar8 = xnVar.Y;
                    if (jkVar8 != null && jkVar8.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    jk jkVar9 = xnVar.Y;
                    if (jkVar9 != null && jkVar9.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    jk jkVar10 = xnVar.Y;
                    if (jkVar10 != null && jkVar10.getEditField() != null) {
                        xnVar.Y.getEditField().setSelectionOverride(xnVar.A4, xnVar.B4);
                        xnVar.Y.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    xnVar.xb();
                } else if (i10 == 60) {
                    if (xnVar.f39340c4 != null) {
                        TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                        long j15 = xnVar.e.f18083id;
                        TLRPC.TL_forumTopic tL_forumTopic = xnVar.f39340c4;
                        int i28 = tL_forumTopic.f18135id;
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
                        public final kj f33867b;

                        {
                            this.f33867b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f33867b.f34737b.finishFragment();
                                    return;
                                default:
                                    kj kjVar = this.f33867b;
                                    kjVar.getClass();
                                    xn xnVar2 = kjVar.f34737b;
                                    Intent intent = new Intent(xnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", xnVar2.P3.link);
                                    xnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (xnVar.Y.x()) {
                        xnVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = xnVar.P3;
                    d6Var = ((org.telegram.ui.ActionBar.n2) xnVar).resourceProvider;
                    hg.x.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    xnVar.showDialog(b2Var);
                    TextView textView2 = (TextView) b2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
                    }
                } else if (i10 == 73) {
                    se1 a02 = se1.a0(-xnVar.T5, 0L);
                    a02.f37272y = xnVar;
                    xnVar.presentFragment(a02);
                } else if (i10 == 888) {
                    xnVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = i4.f33977b1;
                    org.telegram.ui.Components.xc.a0(xnVar).t("No rich message copied", null).j();
                }
            } else if (xnVar.f39372f != null && xnVar.getParentActivity() != null) {
                TLRPC.User user5 = xnVar.f39372f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = xnVar.f39316a8;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user5, z12, z13, xnVar.getParentActivity(), xnVar.getMessagesController().getUserFull(xnVar.f39372f.f18230id), xnVar.getAccountInstance());
            }
        }
    }
}
