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
public final class lj extends org.telegram.ui.ActionBar.j {
    public final Context f38283a;
    public final yn f38284b;

    public lj(yn ynVar, Context context) {
        this.f38284b = ynVar;
        this.f38283a = context;
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
        yn ynVar = this.f38284b;
        SparseArray[] sparseArrayArr = ynVar.W5;
        SparseArray[] sparseArrayArr2 = ynVar.V5;
        SparseArray[] sparseArrayArr3 = ynVar.U5;
        long j3 = 0;
        if (i10 == -1) {
            if (!ynVar.f43519tc.f15437f) {
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (kVar.s()) {
                    ynVar.z7(false);
                } else if (ynVar.P3 == 5 && (ynVar.f43501s6.isEmpty() || ynVar.f43287b4 == 0)) {
                    ynVar.Pb();
                } else if (ynVar.P3 == 6 && ynVar.W.w()) {
                    ynVar.vb(new Runnable(this) {
                        public final lj f37451b;

                        {
                            this.f37451b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f37451b.f38284b.finishFragment();
                                    return;
                                default:
                                    lj ljVar = this.f37451b;
                                    ljVar.getClass();
                                    yn ynVar2 = ljVar.f38284b;
                                    Intent intent = new Intent(ynVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", ynVar2.N3.link);
                                    ynVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!ynVar.X6(true, true)) {
                    ynVar.finishFragment();
                }
            } else {
                ynVar.sa();
            }
        } else if (i10 == 59) {
            if (ynVar.getUserConfig().getClientUserId() == ynVar.R5) {
                ynVar.getMessagesController().setSavedViewAs(true);
                ynVar.Y0.e(false, true);
                return;
            }
            ynVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-ynVar.R5, false);
            yf1.I0(ynVar);
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
                    if (ynVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = ynVar.f43334f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) yn.E8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    ynVar.Q7();
                    ynVar.f43549w3.j(58, 0L, null);
                }
                ynVar.z7(false);
            } else if (i10 == 12) {
                if (ynVar.getParentActivity() != null) {
                    ynVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                ynVar.aa(true);
            } else if (i10 == 69) {
                yn.B1(ynVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = ynVar.f43322e;
                if (chat != null) {
                    ynVar.presentFragment(yn.Q9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = ynVar.R5;
                if (ChatObject.isMonoForum(ynVar.f43322e)) {
                    i17 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, ynVar.f43322e)) {
                        j11 = ynVar.f43287b4;
                        j3 = ynVar.R5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                yh.t5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = ynVar.R5;
                if (ChatObject.isMonoForum(ynVar.f43322e)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, ynVar.f43322e)) {
                        j12 = ynVar.f43287b4;
                        j3 = ynVar.R5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                yh.t5.y(i14, false).C(j13, j14, new kg(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (ynVar.Ya == null) {
                    yn.G1(ynVar);
                } else {
                    ynVar.l9();
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
                if (ynVar.f43315d6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ynVar.d9();
                ynVar.xc(0, true);
                ynVar.Vc(false);
                MediaController.saveFilesFromMessages(ynVar.getParentActivity(), ynVar.getAccountInstance(), arrayList2, new jj(0, this, z14));
            } else if (i10 == 13) {
                if (ynVar.getParentActivity() != null) {
                    ynVar.showDialog(org.telegram.ui.Components.e5.V(ynVar.getParentActivity(), ynVar.h, ynVar.f43307ca).f20372a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z16 = false;
                if (ynVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(ynVar.f43322e)) {
                        if (ynVar.f43287b4 != 0 && (user2 = ynVar.getMessagesController().getUser(Long.valueOf(ynVar.f43287b4))) != null) {
                            org.telegram.ui.Components.e5.r(ynVar, -1, user2, ynVar.f43322e, true, new o(13, this, user2), ynVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = ynVar.X7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == 26 || (i10 == 15 && ynVar.h == null && (((user = ynVar.f43334f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(ynVar.f43334f)) || ((chatFull = ynVar.X7) != null && chatFull.can_delete_channel)))) {
                        boolean z17 = z10;
                        org.telegram.ui.Components.e5.r(ynVar, -1, ynVar.f43334f, ynVar.f43322e, z17, new kj(this, z17), ynVar.getResourceProvider());
                        return;
                    }
                    if (i10 == 15) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = ynVar.f43322e;
                    TLRPC.User user4 = ynVar.f43334f;
                    if (ynVar.h != null) {
                        z16 = true;
                    }
                    org.telegram.ui.Components.e5.s(ynVar, z11, chat2, user4, z16, true, false, z10, new i2.s(this, i10, z10));
                }
            } else if (i10 == 17) {
                if (ynVar.f43334f != null && ynVar.getParentActivity() != null) {
                    TextView textView = ynVar.J1;
                    if (textView != null && textView.getTag() != null) {
                        ynVar.qb(null, ((Integer) ynVar.J1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", ynVar.f43334f.f20189id);
                    bundle.putBoolean("addContact", true);
                    ynVar.presentFragment(new qs(bundle));
                }
            } else if (i10 == 18) {
                ynVar.ac(false);
            } else if (i10 == 24) {
                try {
                    ynVar.getMediaDataController().installShortcut(ynVar.f43334f.f20189id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(ynVar.f43322e)) {
                    w5 w5Var = new w5(ynVar.R5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ynVar.B1;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                    }
                    ynVar.presentFragment(w5Var);
                    return;
                }
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(ynVar.R5));
            } else if (i10 == 21) {
                int i23 = v31.v;
                int currentAccount = ynVar.getCurrentAccount();
                Activity parentActivity = ynVar.getParentActivity();
                long a2 = ynVar.a();
                if (parentActivity != null) {
                    v31.I(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i24 = 0; i24 < 2; i24++) {
                    for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                        ynVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !ynVar.X5);
                    }
                }
                ynVar.z7(false);
            } else if (i10 == 23) {
                for (int i26 = 1; i26 >= 0; i26--) {
                    if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                        }
                        messageObject = (MessageObject) ynVar.f43425m6[i26].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i26].clear();
                    sparseArrayArr2[i26].clear();
                    sparseArrayArr[i26].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    ynVar.f43288b5 = messageObject;
                    ynVar.Aa(109);
                    r92 = 0;
                } else {
                    r92 = 0;
                    ynVar.Wb(messageObject, false);
                }
                ynVar.d9();
                ynVar.xc(r92, true);
                ynVar.Vc(r92);
            } else if (i10 == 64) {
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                hg.a2 c10 = hg.b2.f(i12).c(ynVar.I8());
                Activity parentActivity2 = ynVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                hg.y1.d0(parentActivity2, i13, ynVar.O3, c10, ynVar.getResourceProvider(), new qc(9, this, c10));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f38283a, ynVar.getResourceProvider(), true, true);
                f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                f1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43335f0;
                org.telegram.ui.ActionBar.y yVar = ynVar.f43297c0;
                yVar.a();
                v0Var.M(f1Var, yVar.f21706m);
            } else if (i10 == 30) {
                ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 40) {
                if (ynVar.D9()) {
                    str = "";
                }
                ynVar.ka(str);
            } else if (i10 == 62) {
                ynVar.getMessagesController().getTranslateController().setHideTranslateDialog(ynVar.a(), false, true);
                if (!ynVar.getMessagesController().getTranslateController().toggleTranslatingDialog(ynVar.a(), true)) {
                    ynVar.Pc(true);
                }
            } else if (i10 != 32 && i10 != 33) {
                if (i10 == 50) {
                    jk jkVar = ynVar.W;
                    if (jkVar != null && jkVar.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    jk jkVar2 = ynVar.W;
                    if (jkVar2 != null && jkVar2.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    jk jkVar3 = ynVar.W;
                    if (jkVar3 != null && jkVar3.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    jk jkVar4 = ynVar.W;
                    if (jkVar4 != null && jkVar4.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    jk jkVar5 = ynVar.W;
                    if (jkVar5 != null && jkVar5.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    jk jkVar6 = ynVar.W;
                    if (jkVar6 != null && jkVar6.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    jk jkVar7 = ynVar.W;
                    if (jkVar7 != null && jkVar7.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    jk jkVar8 = ynVar.W;
                    if (jkVar8 != null && jkVar8.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    jk jkVar9 = ynVar.W;
                    if (jkVar9 != null && jkVar9.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    jk jkVar10 = ynVar.W;
                    if (jkVar10 != null && jkVar10.getEditField() != null) {
                        ynVar.W.getEditField().setSelectionOverride(ynVar.f43575y4, ynVar.f43588z4);
                        ynVar.W.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    ynVar.wb();
                } else if (i10 == 60) {
                    if (ynVar.f43273a4 != null) {
                        TopicsController topicsController = ynVar.getMessagesController().getTopicsController();
                        long j15 = ynVar.f43322e.f20042id;
                        TLRPC.TL_forumTopic tL_forumTopic = ynVar.f43273a4;
                        int i28 = tL_forumTopic.f20094id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j15, i28, true);
                        ynVar.Qc();
                        ynVar.gc(false);
                        ynVar.Pc(true);
                    }
                } else if (i10 == 61) {
                    yf1.I0(ynVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(ynVar.N3.link);
                    org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final lj f37451b;

                        {
                            this.f37451b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f37451b.f38284b.finishFragment();
                                    return;
                                default:
                                    lj ljVar = this.f37451b;
                                    ljVar.getClass();
                                    yn ynVar2 = ljVar.f38284b;
                                    Intent intent = new Intent(ynVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", ynVar2.N3.link);
                                    ynVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (ynVar.W.w()) {
                        ynVar.vb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = ynVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = ynVar.N3;
                    d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                    hg.w.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 19));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    ynVar.showDialog(b2Var);
                    TextView textView2 = (TextView) b2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21063q7));
                    }
                } else if (i10 == 73) {
                    ue1 Z = ue1.Z(-ynVar.R5, 0L);
                    Z.f41171y = ynVar;
                    ynVar.presentFragment(Z);
                } else if (i10 == 888) {
                    ynVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = i4.f37236b1;
                    org.telegram.ui.Components.yc.a0(ynVar).t("No rich message copied", null).j();
                }
            } else if (ynVar.f43334f != null && ynVar.getParentActivity() != null) {
                TLRPC.User user5 = ynVar.f43334f;
                if (i10 == 33) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.UserFull userFull = ynVar.Y7;
                if (userFull != null && userFull.video_calls_available) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.ui.Components.voip.g2.m(user5, z12, z13, ynVar.getParentActivity(), ynVar.getMessagesController().getUserFull(ynVar.f43334f.f20189id), ynVar.getAccountInstance());
            }
        }
    }
}
