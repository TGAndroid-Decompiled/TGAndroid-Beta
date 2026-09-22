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
    public final Context f36058a;
    public final zn f36059b;

    public nj(zn znVar, Context context) {
        this.f36059b = znVar;
        this.f36058a = context;
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
        zn znVar = this.f36059b;
        SparseArray[] sparseArrayArr = znVar.Y5;
        SparseArray[] sparseArrayArr2 = znVar.X5;
        SparseArray[] sparseArrayArr3 = znVar.W5;
        long j3 = 0;
        boolean z16 = true;
        if (i10 == -1) {
            if (!znVar.f40536vc.f14185f) {
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar.s()) {
                    znVar.z7(false);
                } else if (znVar.R3 == 5 && (znVar.f40518u6.isEmpty() || znVar.f40306d4 == 0)) {
                    znVar.Qb();
                } else if (znVar.R3 == 6 && znVar.Y.w()) {
                    znVar.wb(new Runnable(this) {
                        public final nj f35218b;

                        {
                            this.f35218b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f35218b.f36059b.finishFragment();
                                    return;
                                default:
                                    nj njVar = this.f35218b;
                                    njVar.getClass();
                                    zn znVar2 = njVar.f36059b;
                                    Intent intent = new Intent(znVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", znVar2.P3.link);
                                    znVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!znVar.X6(true, true)) {
                    znVar.finishFragment();
                }
            } else {
                znVar.ta();
            }
        } else if (i10 == 59) {
            if (znVar.getUserConfig().getClientUserId() == znVar.T5) {
                znVar.getMessagesController().setSavedViewAs(true);
                znVar.f40264a1.e(false, true);
                return;
            }
            znVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-znVar.T5, false);
            fg1.I0(znVar);
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
                    if (znVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = znVar.f40326f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) zn.D8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    znVar.Q7();
                    znVar.y3.j(58, 0L, null);
                }
                znVar.z7(false);
            } else if (i10 == 12) {
                if (znVar.getParentActivity() != null) {
                    znVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                znVar.ba(true);
            } else if (i10 == 69) {
                zn.B1(znVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = znVar.e;
                if (chat != null) {
                    znVar.presentFragment(zn.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = znVar.T5;
                if (ChatObject.isMonoForum(znVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, znVar.e)) {
                        j11 = znVar.f40306d4;
                        j3 = znVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                yh.u5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = znVar.T5;
                if (ChatObject.isMonoForum(znVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, znVar.e)) {
                        j12 = znVar.f40306d4;
                        j3 = znVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                yh.u5.y(i14, false).C(j13, j14, new eh(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (znVar.f40273ab == null) {
                    zn.G1(znVar);
                } else {
                    znVar.k9();
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
                if (znVar.f40333f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                znVar.c9();
                znVar.yc(0, true);
                znVar.Wc(false);
                MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList2, new lj(0, this, z14));
            } else if (i10 == 13) {
                if (znVar.getParentActivity() != null) {
                    znVar.showDialog(org.telegram.ui.Components.d5.V(znVar.getParentActivity(), znVar.h, znVar.f40324ea).f18669a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (znVar.f40326f != null && znVar.getParentActivity() != null) {
                        TextView textView = znVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            znVar.rb(null, ((Integer) znVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", znVar.f40326f.f18490id);
                        bundle.putBoolean("addContact", true);
                        znVar.presentFragment(new ss(bundle));
                    }
                } else if (i10 == 18) {
                    znVar.bc(false);
                } else if (i10 == 24) {
                    try {
                        znVar.getMediaDataController().installShortcut(znVar.f40326f.f18490id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(znVar.e)) {
                        v5 v5Var = new v5(znVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = znVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        znVar.presentFragment(v5Var);
                        return;
                    }
                    znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.T5));
                } else if (i10 == 21) {
                    int i23 = c41.v;
                    int currentAccount = znVar.getCurrentAccount();
                    Activity parentActivity = znVar.getParentActivity();
                    long a2 = znVar.a();
                    if (parentActivity != null) {
                        c41.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i24 = 0; i24 < 2; i24++) {
                        for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                            znVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !znVar.Z5);
                        }
                    }
                    znVar.z7(false);
                } else if (i10 == 23) {
                    for (int i26 = 1; i26 >= 0; i26--) {
                        if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                            }
                            messageObject = (MessageObject) znVar.f40442o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i26].clear();
                        sparseArrayArr2[i26].clear();
                        sparseArrayArr[i26].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        znVar.f40307d5 = messageObject;
                        znVar.Ba(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        znVar.Xb(messageObject, false);
                    }
                    znVar.c9();
                    znVar.yc(r92, true);
                    znVar.Wc(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    hg.a2 c10 = hg.b2.f(i12).c(znVar.H8());
                    Activity parentActivity2 = znVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    hg.y1.d0(parentActivity2, i13, znVar.Q3, c10, znVar.getResourceProvider(), new of(4, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f36058a, znVar.getResourceProvider(), true, true);
                    f1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    f1Var.setOnClickListener(new a(this, 13));
                    org.telegram.ui.ActionBar.v0 v0Var = znVar.f40351h0;
                    org.telegram.ui.ActionBar.y yVar = znVar.f40315e0;
                    yVar.a();
                    v0Var.M(f1Var, yVar.f19958m);
                } else if (i10 == 30) {
                    znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (znVar.E9()) {
                        str = "";
                    }
                    znVar.la(str);
                } else if (i10 == 62) {
                    znVar.getMessagesController().getTranslateController().setHideTranslateDialog(znVar.a(), false, true);
                    if (!znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a(), true)) {
                        znVar.Qc(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        mk mkVar = znVar.Y;
                        if (mkVar != null && mkVar.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        mk mkVar2 = znVar.Y;
                        if (mkVar2 != null && mkVar2.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        mk mkVar3 = znVar.Y;
                        if (mkVar3 != null && mkVar3.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        mk mkVar4 = znVar.Y;
                        if (mkVar4 != null && mkVar4.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        mk mkVar5 = znVar.Y;
                        if (mkVar5 != null && mkVar5.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        mk mkVar6 = znVar.Y;
                        if (mkVar6 != null && mkVar6.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        mk mkVar7 = znVar.Y;
                        if (mkVar7 != null && mkVar7.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        mk mkVar8 = znVar.Y;
                        if (mkVar8 != null && mkVar8.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        mk mkVar9 = znVar.Y;
                        if (mkVar9 != null && mkVar9.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        mk mkVar10 = znVar.Y;
                        if (mkVar10 != null && mkVar10.getEditField() != null) {
                            znVar.Y.getEditField().setSelectionOverride(znVar.A4, znVar.B4);
                            znVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        znVar.xb();
                    } else if (i10 == 60) {
                        if (znVar.f40294c4 != null) {
                            TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                            long j15 = znVar.e.f18343id;
                            TLRPC.TL_forumTopic tL_forumTopic = znVar.f40294c4;
                            int i28 = tL_forumTopic.f18395id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j15, i28, true);
                            znVar.Rc();
                            znVar.hc(false);
                            znVar.Qc(true);
                        }
                    } else if (i10 == 61) {
                        fg1.I0(znVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(znVar.P3.link);
                        org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final nj f35218b;

                            {
                                this.f35218b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f35218b.f36059b.finishFragment();
                                        return;
                                    default:
                                        nj njVar = this.f35218b;
                                        njVar.getClass();
                                        zn znVar2 = njVar.f36059b;
                                        Intent intent = new Intent(znVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", znVar2.P3.link);
                                        znVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (znVar.Y.w()) {
                            znVar.wb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = znVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = znVar.P3;
                        f6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                        hg.v.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 18));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7));
                        }
                    } else if (i10 == 73) {
                        bf1 a02 = bf1.a0(-znVar.T5, 0L);
                        a02.f32425y = znVar;
                        znVar.presentFragment(a02);
                    } else if (i10 == 888) {
                        znVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = h4.f34086b1;
                        org.telegram.ui.Components.xc.a0(znVar).t("No rich message copied", null).j();
                    }
                } else if (znVar.f40326f != null && znVar.getParentActivity() != null) {
                    TLRPC.User user4 = znVar.f40326f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = znVar.f40270a8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.f2.m(user4, z12, z13, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f40326f.f18490id), znVar.getAccountInstance());
                }
            } else if (znVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(znVar.e)) {
                    if (znVar.f40306d4 != 0 && (user2 = znVar.getMessagesController().getUser(Long.valueOf(znVar.f40306d4))) != null) {
                        org.telegram.ui.Components.d5.r(znVar, -1, user2, znVar.e, true, new l4(10, this, user2), znVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = znVar.Z7;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 26 || (i10 == 15 && znVar.h == null && (((user = znVar.f40326f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(znVar.f40326f)) || ((chatFull = znVar.Z7) != null && chatFull.can_delete_channel)))) {
                    boolean z17 = z10;
                    org.telegram.ui.Components.d5.r(znVar, -1, znVar.f40326f, znVar.e, z17, new mj(this, z17), znVar.getResourceProvider());
                    return;
                }
                if (i10 == 15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.Chat chat2 = znVar.e;
                TLRPC.User user5 = znVar.f40326f;
                if (znVar.h == null) {
                    z16 = false;
                }
                org.telegram.ui.Components.d5.s(znVar, z11, chat2, user5, z16, true, false, z10, new i2.s(this, i10, z10));
            }
        }
    }
}
