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
    public final Context f40549a;
    public final wn f40550b;

    public jj(wn wnVar, Context context) {
        this.f40550b = wnVar;
        this.f40549a = context;
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
        org.telegram.ui.ActionBar.u6 u6Var;
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
        wn wnVar = this.f40550b;
        SparseArray[] sparseArrayArr = wnVar.f45230o6;
        SparseArray[] sparseArrayArr2 = wnVar.f45217n6;
        SparseArray[] sparseArrayArr3 = wnVar.f45203m6;
        long j10 = 0;
        boolean z16 = true;
        int i18 = 0;
        if (i10 == -1) {
            if (!wnVar.Xc.f19326f) {
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar.q()) {
                    wnVar.I7(false);
                } else if (wnVar.f45091d4 == 5 && (wnVar.K6.isEmpty() || wnVar.f45241p4 == 0)) {
                    wnVar.gc();
                } else if (wnVar.f45091d4 == 6 && wnVar.Y.s()) {
                    wnVar.Lb(new Runnable(this) {
                        public final jj f39637b;

                        {
                            this.f39637b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f39637b.f40550b.finishFragment();
                                    return;
                                default:
                                    jj jjVar = this.f39637b;
                                    jjVar.getClass();
                                    wn wnVar2 = jjVar.f40550b;
                                    Intent intent = new Intent(wnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", wnVar2.f45062b4.link);
                                    wnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!wnVar.g7(true, true)) {
                    wnVar.finishFragment();
                }
            } else {
                wnVar.Fa();
            }
        } else if (i10 == 59) {
            if (wnVar.getUserConfig().getClientUserId() == wnVar.f45168j6) {
                wnVar.getMessagesController().setSavedViewAs(true);
                wnVar.f45198m1.e(false, true);
                return;
            }
            wnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-wnVar.f45168j6, false);
            cf1.I0(wnVar);
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
                    if (wnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = wnVar.f45113f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) wn.P8(messageObject2, z15, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    wnVar.Z7();
                    wnVar.K3.j(58, 0L, null);
                }
                wnVar.I7(false);
            } else if (i10 == 12) {
                if (wnVar.getParentActivity() != null) {
                    wnVar.O7(null, null, false);
                }
            } else if (i10 == 11) {
                wnVar.oa(true);
            } else if (i10 == 69) {
                wn.F1(wnVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = wnVar.e;
                if (chat != null) {
                    wnVar.presentFragment(wn.ea(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j12 = wnVar.f45168j6;
                if (ChatObject.isMonoForum(wnVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, wnVar.e)) {
                        j12 = wnVar.f45241p4;
                        j10 = wnVar.f45168j6;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                bi.ca.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = wnVar.f45168j6;
                if (ChatObject.isMonoForum(wnVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, wnVar.e)) {
                        j13 = wnVar.f45241p4;
                        j10 = wnVar.f45168j6;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                bi.ca.y(i14, false).C(j14, j15, new bi.l5(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (wnVar.Ab == null) {
                    wn.L1(wnVar);
                } else {
                    wnVar.x9();
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
                if (wnVar.f45318v6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                wnVar.p9();
                wnVar.Pc(0, true);
                wnVar.nd(false);
                MediaController.saveFilesFromMessages(wnVar.getParentActivity(), wnVar.getAccountInstance(), arrayList2, new hj(0, this, z14));
            } else if (i10 == 13) {
                if (wnVar.getParentActivity() != null) {
                    wnVar.showDialog(org.telegram.ui.Components.g5.U(wnVar.getParentActivity(), wnVar.h, wnVar.f45309ua).f22369a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (wnVar.f45113f != null && wnVar.getParentActivity() != null) {
                        TextView textView = wnVar.X1;
                        if (textView != null && textView.getTag() != null) {
                            wnVar.Gb(null, ((Integer) wnVar.X1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", wnVar.f45113f.f22177id);
                        bundle.putBoolean("addContact", true);
                        wnVar.presentFragment(new ls(bundle));
                    }
                } else if (i10 == 18) {
                    wnVar.rc(false);
                } else if (i10 == 24) {
                    try {
                        wnVar.getMediaDataController().installShortcut(wnVar.f45113f.f22177id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(wnVar.e)) {
                        x5 x5Var = new x5(wnVar.f45168j6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wnVar.P1;
                        x5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                        }
                        wnVar.presentFragment(x5Var);
                        return;
                    }
                    wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.f45168j6));
                } else if (i10 == 21) {
                    int i24 = x21.f45461w;
                    int currentAccount = wnVar.getCurrentAccount();
                    Activity parentActivity = wnVar.getParentActivity();
                    long a2 = wnVar.a();
                    if (parentActivity != null) {
                        x21.N(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i25 = 0; i25 < 2; i25++) {
                        for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                            wnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !wnVar.f45243p6);
                        }
                    }
                    wnVar.I7(false);
                } else if (i10 == 23) {
                    for (int i27 = 1; i27 >= 0; i27--) {
                        if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                            }
                            messageObject = (MessageObject) wnVar.E6[i27].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i27].clear();
                        sparseArrayArr2[i27].clear();
                        sparseArrayArr[i27].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        wnVar.f45291t5 = messageObject;
                        wnVar.Na(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        wnVar.nc(messageObject, false);
                    }
                    wnVar.p9();
                    wnVar.Pc(r92, true);
                    wnVar.nd(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    jg.b2 c10 = jg.c2.f(i12).c(wnVar.U8());
                    Activity parentActivity2 = wnVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    jg.z1.e0(parentActivity2, i13, wnVar.f45077c4, c10, wnVar.getResourceProvider(), new li.s2(17, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f40549a, wnVar.getResourceProvider(), true, true);
                    g1Var.j(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    g1Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45137h0;
                    org.telegram.ui.ActionBar.y yVar = wnVar.f45101e0;
                    yVar.a();
                    w0Var.U(g1Var, yVar.f23281m);
                } else if (i10 == 30) {
                    wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", wnVar.f45168j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", wnVar.f45168j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (wnVar.Q9()) {
                        str = "";
                    }
                    wnVar.ya(str);
                } else if (i10 == 62) {
                    wnVar.getMessagesController().getTranslateController().setHideTranslateDialog(wnVar.a(), false, true);
                    if (!wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a(), true)) {
                        wnVar.hd(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        jk jkVar = wnVar.Y;
                        if (jkVar != null && jkVar.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        jk jkVar2 = wnVar.Y;
                        if (jkVar2 != null && jkVar2.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        jk jkVar3 = wnVar.Y;
                        if (jkVar3 != null && jkVar3.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        jk jkVar4 = wnVar.Y;
                        if (jkVar4 != null && jkVar4.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        jk jkVar5 = wnVar.Y;
                        if (jkVar5 != null && jkVar5.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        jk jkVar6 = wnVar.Y;
                        if (jkVar6 != null && jkVar6.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        jk jkVar7 = wnVar.Y;
                        if (jkVar7 != null && jkVar7.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        jk jkVar8 = wnVar.Y;
                        if (jkVar8 != null && jkVar8.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        jk jkVar9 = wnVar.Y;
                        if (jkVar9 != null && jkVar9.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        jk jkVar10 = wnVar.Y;
                        if (jkVar10 != null && jkVar10.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.M4, wnVar.N4);
                            wnVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        wnVar.Nb();
                    } else if (i10 == 60) {
                        if (wnVar.f45228o4 != null) {
                            TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                            long j16 = wnVar.e.f22028id;
                            TLRPC.TL_forumTopic tL_forumTopic = wnVar.f45228o4;
                            int i29 = tL_forumTopic.f22080id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j16, i29, true);
                            wnVar.id();
                            wnVar.yc(false);
                            wnVar.hd(true);
                        }
                    } else if (i10 == 61) {
                        cf1.I0(wnVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(wnVar.f45062b4.link);
                        org.telegram.ui.Components.wc.b0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final jj f39637b;

                            {
                                this.f39637b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f39637b.f40550b.finishFragment();
                                        return;
                                    default:
                                        jj jjVar = this.f39637b;
                                        jjVar.getClass();
                                        wn wnVar2 = jjVar.f40550b;
                                        Intent intent = new Intent(wnVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", wnVar2.f45062b4.link);
                                        wnVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (wnVar.Y.s()) {
                            wnVar.Lb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = wnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = wnVar.f45062b4;
                        u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                        jg.w.c0(parentActivity3, i11, tL_businessChatLink, u6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 19));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(e2Var);
                        TextView textView2 = (TextView) e2Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23599q7, wnVar.getResourceProvider());
                        }
                    } else if (i10 == 73) {
                        yd1 b02 = yd1.b0(-wnVar.f45168j6, 0L);
                        b02.f45978y = wnVar;
                        wnVar.presentFragment(b02);
                    } else if (i10 == 888) {
                        wnVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = j4.f40370c1;
                        org.telegram.ui.Components.wc.b0(wnVar).t("No rich message copied", null).j();
                    }
                } else if (wnVar.f45113f != null && wnVar.getParentActivity() != null) {
                    TLRPC.User user4 = wnVar.f45113f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = wnVar.f45255q8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.g2.m(user4, z12, z13, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f45113f.f22177id), wnVar.getAccountInstance());
                }
            } else if (wnVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(wnVar.e)) {
                    if (wnVar.f45241p4 != 0 && (user2 = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.f45241p4))) != null) {
                        org.telegram.ui.Components.g5.q(wnVar, -1, user2, wnVar.e, true, new m4.s0(19, this, user2), wnVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = wnVar.f45245p8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 != 26) {
                    int i30 = 15;
                    if (i10 == 15) {
                        if (wnVar.h != null || (((user = wnVar.f45113f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(wnVar.f45113f)) && ((chatFull = wnVar.f45245p8) == null || !chatFull.can_delete_channel))) {
                            i30 = 15;
                        }
                    }
                    if (i10 == i30) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = wnVar.e;
                    TLRPC.User user5 = wnVar.f45113f;
                    if (wnVar.h == null) {
                        z16 = false;
                    }
                    org.telegram.ui.Components.g5.r(wnVar, z11, chat2, user5, z16, true, false, z10, new i2.r(this, i10, z10));
                    return;
                }
                boolean z17 = z10;
                org.telegram.ui.Components.g5.q(wnVar, -1, wnVar.f45113f, wnVar.e, z17, new ij(this, z17), wnVar.getResourceProvider());
            }
        }
    }
}
