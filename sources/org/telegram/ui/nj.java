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
public final class nj extends org.telegram.ui.ActionBar.j {
    public final Context f38993a;
    public final co f38994b;

    public nj(co coVar, Context context) {
        this.f38994b = coVar;
        this.f38993a = context;
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
        ?? r92;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.f38994b;
        SparseArray[] sparseArrayArr = coVar.Y5;
        SparseArray[] sparseArrayArr2 = coVar.X5;
        SparseArray[] sparseArrayArr3 = coVar.W5;
        long j3 = 0;
        boolean z16 = true;
        if (i10 == -1) {
            if (!coVar.wc.f15396f) {
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar.s()) {
                    coVar.z7(false);
                } else if (coVar.R3 == 5 && (coVar.f35467u6.isEmpty() || coVar.f35255d4 == 0)) {
                    coVar.Qb();
                } else if (coVar.R3 == 6 && coVar.Y.w()) {
                    coVar.wb(new Runnable(this) {
                        public final nj f38104b;

                        {
                            this.f38104b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f38104b.f38994b.finishFragment();
                                    return;
                                default:
                                    nj njVar = this.f38104b;
                                    njVar.getClass();
                                    co coVar2 = njVar.f38994b;
                                    Intent intent = new Intent(coVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", coVar2.P3.link);
                                    coVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!coVar.X6(true, true)) {
                    coVar.finishFragment();
                }
            } else {
                coVar.ta();
            }
        } else if (i10 == 59) {
            if (coVar.getUserConfig().getClientUserId() == coVar.T5) {
                coVar.getMessagesController().setSavedViewAs(true);
                coVar.f35213a1.e(false, true);
                return;
            }
            coVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-coVar.T5, false);
            eg1.I0(coVar);
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
                    if (coVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = coVar.f35276f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) co.D8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    coVar.Q7();
                    coVar.y3.j(58, 0L, null);
                }
                coVar.z7(false);
            } else if (i10 == 12) {
                if (coVar.getParentActivity() != null) {
                    coVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                coVar.ba(true);
            } else if (i10 == 69) {
                co.B1(coVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = coVar.f35264e;
                if (chat != null) {
                    coVar.presentFragment(co.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = coVar.T5;
                if (ChatObject.isMonoForum(coVar.f35264e)) {
                    i17 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, coVar.f35264e)) {
                        j11 = coVar.f35255d4;
                        j3 = coVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                zh.s5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = coVar.T5;
                if (ChatObject.isMonoForum(coVar.f35264e)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, coVar.f35264e)) {
                        j12 = coVar.f35255d4;
                        j3 = coVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                zh.s5.y(i14, false).C(j13, j14, new lg(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (coVar.f35236bb == null) {
                    co.G1(coVar);
                } else {
                    coVar.k9();
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
                if (coVar.f35283f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                coVar.c9();
                coVar.yc(0, true);
                coVar.Wc(false);
                MediaController.saveFilesFromMessages(coVar.getParentActivity(), coVar.getAccountInstance(), arrayList2, new lj(0, this, z14));
            } else if (i10 == 13) {
                if (coVar.getParentActivity() != null) {
                    coVar.showDialog(org.telegram.ui.Components.e5.V(coVar.getParentActivity(), coVar.h, coVar.f35274ea).f20225a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (coVar.f35276f != null && coVar.getParentActivity() != null) {
                        TextView textView = coVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            coVar.rb(null, ((Integer) coVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", coVar.f35276f.f20043id);
                        bundle.putBoolean("addContact", true);
                        coVar.presentFragment(new ss(bundle));
                    }
                } else if (i10 == 18) {
                    coVar.bc(false);
                } else if (i10 == 24) {
                    try {
                        coVar.getMediaDataController().installShortcut(coVar.f35276f.f20043id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(coVar.f35264e)) {
                        v5 v5Var = new v5(coVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = coVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        coVar.presentFragment(v5Var);
                        return;
                    }
                    coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(coVar.T5));
                } else if (i10 == 21) {
                    int i23 = e41.v;
                    int currentAccount = coVar.getCurrentAccount();
                    Activity parentActivity = coVar.getParentActivity();
                    long a2 = coVar.a();
                    if (parentActivity != null) {
                        e41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i24 = 0; i24 < 2; i24++) {
                        for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                            coVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !coVar.Z5);
                        }
                    }
                    coVar.z7(false);
                } else if (i10 == 23) {
                    for (int i26 = 1; i26 >= 0; i26--) {
                        if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                            }
                            messageObject = (MessageObject) coVar.f35391o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i26].clear();
                        sparseArrayArr2[i26].clear();
                        sparseArrayArr[i26].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        coVar.f35256d5 = messageObject;
                        coVar.Ba(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        coVar.Xb(messageObject, false);
                    }
                    coVar.c9();
                    coVar.yc(r92, true);
                    coVar.Wc(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ig.a2 c10 = ig.b2.f(i12).c(coVar.H8());
                    Activity parentActivity2 = coVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ig.y1.d0(parentActivity2, i13, coVar.Q3, c10, coVar.getResourceProvider(), new nf(4, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f38993a, coVar.getResourceProvider(), true, true);
                    f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    f1Var.setOnClickListener(new a(this, 13));
                    org.telegram.ui.ActionBar.v0 v0Var = coVar.f35300h0;
                    org.telegram.ui.ActionBar.y yVar = coVar.f35265e0;
                    yVar.a();
                    v0Var.M(f1Var, yVar.f21560m);
                } else if (i10 == 30) {
                    coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (coVar.E9()) {
                        str = "";
                    }
                    coVar.la(str);
                } else if (i10 == 62) {
                    coVar.getMessagesController().getTranslateController().setHideTranslateDialog(coVar.a(), false, true);
                    if (!coVar.getMessagesController().getTranslateController().toggleTranslatingDialog(coVar.a(), true)) {
                        coVar.Qc(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        mk mkVar = coVar.Y;
                        if (mkVar != null && mkVar.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        mk mkVar2 = coVar.Y;
                        if (mkVar2 != null && mkVar2.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        mk mkVar3 = coVar.Y;
                        if (mkVar3 != null && mkVar3.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        mk mkVar4 = coVar.Y;
                        if (mkVar4 != null && mkVar4.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        mk mkVar5 = coVar.Y;
                        if (mkVar5 != null && mkVar5.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        mk mkVar6 = coVar.Y;
                        if (mkVar6 != null && mkVar6.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        mk mkVar7 = coVar.Y;
                        if (mkVar7 != null && mkVar7.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        mk mkVar8 = coVar.Y;
                        if (mkVar8 != null && mkVar8.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        mk mkVar9 = coVar.Y;
                        if (mkVar9 != null && mkVar9.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        mk mkVar10 = coVar.Y;
                        if (mkVar10 != null && mkVar10.getEditField() != null) {
                            coVar.Y.getEditField().setSelectionOverride(coVar.A4, coVar.B4);
                            coVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        coVar.xb();
                    } else if (i10 == 60) {
                        if (coVar.f35243c4 != null) {
                            TopicsController topicsController = coVar.getMessagesController().getTopicsController();
                            long j15 = coVar.f35264e.f19896id;
                            TLRPC.TL_forumTopic tL_forumTopic = coVar.f35243c4;
                            int i28 = tL_forumTopic.f19948id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j15, i28, true);
                            coVar.Rc();
                            coVar.hc(false);
                            coVar.Qc(true);
                        }
                    } else if (i10 == 61) {
                        eg1.I0(coVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(coVar.P3.link);
                        org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final nj f38104b;

                            {
                                this.f38104b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f38104b.f38994b.finishFragment();
                                        return;
                                    default:
                                        nj njVar = this.f38104b;
                                        njVar.getClass();
                                        co coVar2 = njVar.f38994b;
                                        Intent intent = new Intent(coVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", coVar2.P3.link);
                                        coVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (coVar.Y.w()) {
                            coVar.wb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = coVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = coVar.P3;
                        f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                        ig.v.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 17));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        coVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20925q7));
                        }
                    } else if (i10 == 73) {
                        af1 a02 = af1.a0(-coVar.T5, 0L);
                        a02.f34447y = coVar;
                        coVar.presentFragment(a02);
                    } else if (i10 == 888) {
                        coVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = i4.f37215b1;
                        org.telegram.ui.Components.yc.a0(coVar).t("No rich message copied", null).j();
                    }
                } else if (coVar.f35276f != null && coVar.getParentActivity() != null) {
                    TLRPC.User user4 = coVar.f35276f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = coVar.f35219a8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.d2.m(user4, z12, z13, coVar.getParentActivity(), coVar.getMessagesController().getUserFull(coVar.f35276f.f20043id), coVar.getAccountInstance());
                }
            } else if (coVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(coVar.f35264e)) {
                    if (coVar.f35255d4 != 0 && (user2 = coVar.getMessagesController().getUser(Long.valueOf(coVar.f35255d4))) != null) {
                        org.telegram.ui.Components.e5.r(coVar, -1, user2, coVar.f35264e, true, new m4(10, this, user2), coVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = coVar.Z7;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 26 || (i10 == 15 && coVar.h == null && (((user = coVar.f35276f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(coVar.f35276f)) || ((chatFull = coVar.Z7) != null && chatFull.can_delete_channel)))) {
                    boolean z17 = z10;
                    org.telegram.ui.Components.e5.r(coVar, -1, coVar.f35276f, coVar.f35264e, z17, new mj(this, z17), coVar.getResourceProvider());
                    return;
                }
                if (i10 == 15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.Chat chat2 = coVar.f35264e;
                TLRPC.User user5 = coVar.f35276f;
                if (coVar.h == null) {
                    z16 = false;
                }
                org.telegram.ui.Components.e5.s(coVar, z11, chat2, user5, z16, true, false, z10, new i2.t(this, i10, z10));
            }
        }
    }
}
