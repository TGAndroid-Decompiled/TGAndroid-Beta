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
public final class gj extends org.telegram.ui.ActionBar.j {
    public final Context f39705a;
    public final un f39706b;

    public gj(un unVar, Context context) {
        this.f39706b = unVar;
        this.f39705a = context;
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
        un unVar = this.f39706b;
        SparseArray[] sparseArrayArr = unVar.f44309k6;
        SparseArray[] sparseArrayArr2 = unVar.f44297j6;
        SparseArray[] sparseArrayArr3 = unVar.f44285i6;
        long j10 = 0;
        boolean z16 = true;
        int i18 = 0;
        if (i10 == -1) {
            if (!unVar.Tc.f19327f) {
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                if (kVar.q()) {
                    unVar.G7(false);
                } else if (unVar.f44221d4 == 5 && (unVar.G6.isEmpty() || unVar.f44370p4 == 0)) {
                    unVar.cc();
                } else if (unVar.f44221d4 == 6 && unVar.Y.t()) {
                    unVar.Hb(new Runnable(this) {
                        public final gj f38896b;

                        {
                            this.f38896b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f38896b.f39706b.finishFragment();
                                    return;
                                default:
                                    gj gjVar = this.f38896b;
                                    gjVar.getClass();
                                    un unVar2 = gjVar.f39706b;
                                    Intent intent = new Intent(unVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", unVar2.f44194b4.link);
                                    unVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!unVar.e7(true, true)) {
                    unVar.finishFragment();
                }
            } else {
                unVar.Ca();
            }
        } else if (i10 == 59) {
            if (unVar.getUserConfig().getClientUserId() == unVar.f44249f6) {
                unVar.getMessagesController().setSavedViewAs(true);
                unVar.f44327m1.e(false, true);
                return;
            }
            unVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-unVar.f44249f6, false);
            af1.I0(unVar);
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
                    if (unVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = unVar.f44242f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) un.M8(messageObject2, z15, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    unVar.X7();
                    unVar.K3.j(58, 0L, null);
                }
                unVar.G7(false);
            } else if (i10 == 12) {
                if (unVar.getParentActivity() != null) {
                    unVar.M7(null, null, false);
                }
            } else if (i10 == 11) {
                unVar.la(true);
            } else if (i10 == 69) {
                un.E1(unVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = unVar.e;
                if (chat != null) {
                    unVar.presentFragment(un.ba(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j12 = unVar.f44249f6;
                if (ChatObject.isMonoForum(unVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, unVar.e)) {
                        j12 = unVar.f44370p4;
                        j10 = unVar.f44249f6;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                bi.ca.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = unVar.f44249f6;
                if (ChatObject.isMonoForum(unVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, unVar.e)) {
                        j13 = unVar.f44370p4;
                        j10 = unVar.f44249f6;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                bi.ca.y(i14, false).C(j14, j15, new bi.l5(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (unVar.f44465wb == null) {
                    un.K1(unVar);
                } else {
                    unVar.u9();
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
                if (unVar.r6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                unVar.m9();
                unVar.Lc(0, true);
                unVar.jd(false);
                MediaController.saveFilesFromMessages(unVar.getParentActivity(), unVar.getAccountInstance(), arrayList2, new ej(0, this, z14));
            } else if (i10 == 13) {
                if (unVar.getParentActivity() != null) {
                    unVar.showDialog(org.telegram.ui.Components.g5.U(unVar.getParentActivity(), unVar.h, unVar.f44385qa).f22366a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (unVar.f44242f != null && unVar.getParentActivity() != null) {
                        TextView textView = unVar.X1;
                        if (textView != null && textView.getTag() != null) {
                            unVar.Cb(null, ((Integer) unVar.X1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", unVar.f44242f.f22174id);
                        bundle.putBoolean("addContact", true);
                        unVar.presentFragment(new js(bundle));
                    }
                } else if (i10 == 18) {
                    unVar.nc(false);
                } else if (i10 == 24) {
                    try {
                        unVar.getMediaDataController().installShortcut(unVar.f44242f.f22174id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(unVar.e)) {
                        x5 x5Var = new x5(unVar.f44249f6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = unVar.P1;
                        x5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                        }
                        unVar.presentFragment(x5Var);
                        return;
                    }
                    unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(unVar.f44249f6));
                } else if (i10 == 21) {
                    int i24 = v21.f44574w;
                    int currentAccount = unVar.getCurrentAccount();
                    Activity parentActivity = unVar.getParentActivity();
                    long a2 = unVar.a();
                    if (parentActivity != null) {
                        v21.N(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i25 = 0; i25 < 2; i25++) {
                        for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                            unVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !unVar.f44320l6);
                        }
                    }
                    unVar.G7(false);
                } else if (i10 == 23) {
                    for (int i27 = 1; i27 >= 0; i27--) {
                        if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                            }
                            messageObject = (MessageObject) unVar.A6[i27].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i27].clear();
                        sparseArrayArr2[i27].clear();
                        sparseArrayArr[i27].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        unVar.f44371p5 = messageObject;
                        unVar.Ka(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        unVar.jc(messageObject, false);
                    }
                    unVar.m9();
                    unVar.Lc(r92, true);
                    unVar.jd(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    jg.b2 c10 = jg.c2.f(i12).c(unVar.R8());
                    Activity parentActivity2 = unVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    jg.z1.e0(parentActivity2, i13, unVar.f44208c4, c10, unVar.getResourceProvider(), new li.s2(17, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f39705a, unVar.getResourceProvider(), true, true);
                    g1Var.j(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    g1Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.w0 w0Var = unVar.f44266h0;
                    org.telegram.ui.ActionBar.y yVar = unVar.f44230e0;
                    yVar.a();
                    w0Var.U(g1Var, yVar.f23278m);
                } else if (i10 == 30) {
                    unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", unVar.f44249f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", unVar.f44249f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (unVar.N9()) {
                        str = "";
                    }
                    unVar.va(str);
                } else if (i10 == 62) {
                    unVar.getMessagesController().getTranslateController().setHideTranslateDialog(unVar.a(), false, true);
                    if (!unVar.getMessagesController().getTranslateController().toggleTranslatingDialog(unVar.a(), true)) {
                        unVar.dd(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        hk hkVar = unVar.Y;
                        if (hkVar != null && hkVar.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        hk hkVar2 = unVar.Y;
                        if (hkVar2 != null && hkVar2.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        hk hkVar3 = unVar.Y;
                        if (hkVar3 != null && hkVar3.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        hk hkVar4 = unVar.Y;
                        if (hkVar4 != null && hkVar4.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        hk hkVar5 = unVar.Y;
                        if (hkVar5 != null && hkVar5.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        hk hkVar6 = unVar.Y;
                        if (hkVar6 != null && hkVar6.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        hk hkVar7 = unVar.Y;
                        if (hkVar7 != null && hkVar7.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        hk hkVar8 = unVar.Y;
                        if (hkVar8 != null && hkVar8.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        hk hkVar9 = unVar.Y;
                        if (hkVar9 != null && hkVar9.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        hk hkVar10 = unVar.Y;
                        if (hkVar10 != null && hkVar10.getEditField() != null) {
                            unVar.Y.getEditField().setSelectionOverride(unVar.M4, unVar.N4);
                            unVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        unVar.Jb();
                    } else if (i10 == 60) {
                        if (unVar.f44357o4 != null) {
                            TopicsController topicsController = unVar.getMessagesController().getTopicsController();
                            long j16 = unVar.e.f22027id;
                            TLRPC.TL_forumTopic tL_forumTopic = unVar.f44357o4;
                            int i29 = tL_forumTopic.f22079id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j16, i29, true);
                            unVar.ed();
                            unVar.uc(false);
                            unVar.dd(true);
                        }
                    } else if (i10 == 61) {
                        af1.I0(unVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(unVar.f44194b4.link);
                        org.telegram.ui.Components.wc.b0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final gj f38896b;

                            {
                                this.f38896b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f38896b.f39706b.finishFragment();
                                        return;
                                    default:
                                        gj gjVar = this.f38896b;
                                        gjVar.getClass();
                                        un unVar2 = gjVar.f39706b;
                                        Intent intent = new Intent(unVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", unVar2.f44194b4.link);
                                        unVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (unVar.Y.t()) {
                            unVar.Hb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = unVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = unVar.f44194b4;
                        u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                        jg.w.c0(parentActivity3, i11, tL_businessChatLink, u6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 19));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        unVar.showDialog(e2Var);
                        TextView textView2 = (TextView) e2Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23596q7, unVar.getResourceProvider());
                        }
                    } else if (i10 == 73) {
                        wd1 b02 = wd1.b0(-unVar.f44249f6, 0L);
                        b02.f45114y = unVar;
                        unVar.presentFragment(b02);
                    } else if (i10 == 888) {
                        unVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = j4.f40402c1;
                        org.telegram.ui.Components.wc.b0(unVar).t("No rich message copied", null).j();
                    }
                } else if (unVar.f44242f != null && unVar.getParentActivity() != null) {
                    TLRPC.User user4 = unVar.f44242f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = unVar.f44334m8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.g2.m(user4, z12, z13, unVar.getParentActivity(), unVar.getMessagesController().getUserFull(unVar.f44242f.f22174id), unVar.getAccountInstance());
                }
            } else if (unVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(unVar.e)) {
                    if (unVar.f44370p4 != 0 && (user2 = unVar.getMessagesController().getUser(Long.valueOf(unVar.f44370p4))) != null) {
                        org.telegram.ui.Components.g5.q(unVar, -1, user2, unVar.e, true, new m4.s0(19, this, user2), unVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = unVar.f44322l8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 != 26) {
                    int i30 = 15;
                    if (i10 == 15) {
                        if (unVar.h != null || (((user = unVar.f44242f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(unVar.f44242f)) && ((chatFull = unVar.f44322l8) == null || !chatFull.can_delete_channel))) {
                            i30 = 15;
                        }
                    }
                    if (i10 == i30) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = unVar.e;
                    TLRPC.User user5 = unVar.f44242f;
                    if (unVar.h == null) {
                        z16 = false;
                    }
                    org.telegram.ui.Components.g5.r(unVar, z11, chat2, user5, z16, true, false, z10, new i2.r(this, i10, z10));
                    return;
                }
                boolean z17 = z10;
                org.telegram.ui.Components.g5.q(unVar, -1, unVar.f44242f, unVar.e, z17, new fj(this, z17), unVar.getResourceProvider());
            }
        }
    }
}
