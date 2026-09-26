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
    public final Context f35075a;
    public final wn f35076b;

    public kj(wn wnVar, Context context) {
        this.f35076b = wnVar;
        this.f35075a = context;
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
        wn wnVar = this.f35076b;
        SparseArray[] sparseArrayArr = wnVar.Y5;
        SparseArray[] sparseArrayArr2 = wnVar.X5;
        SparseArray[] sparseArrayArr3 = wnVar.W5;
        long j3 = 0;
        boolean z16 = true;
        if (i10 == -1) {
            if (!wnVar.f39679vc.f14201f) {
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar.s()) {
                    wnVar.z7(false);
                } else if (wnVar.R3 == 5 && (wnVar.f39661u6.isEmpty() || wnVar.f39450d4 == 0)) {
                    wnVar.Qb();
                } else if (wnVar.R3 == 6 && wnVar.Y.w()) {
                    wnVar.wb(new Runnable(this) {
                        public final kj f34233b;

                        {
                            this.f34233b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34233b.f35076b.finishFragment();
                                    return;
                                default:
                                    kj kjVar = this.f34233b;
                                    kjVar.getClass();
                                    wn wnVar2 = kjVar.f35076b;
                                    Intent intent = new Intent(wnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", wnVar2.P3.link);
                                    wnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!wnVar.X6(true, true)) {
                    wnVar.finishFragment();
                }
            } else {
                wnVar.ta();
            }
        } else if (i10 == 59) {
            if (wnVar.getUserConfig().getClientUserId() == wnVar.T5) {
                wnVar.getMessagesController().setSavedViewAs(true);
                wnVar.f39408a1.e(false, true);
                return;
            }
            wnVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-wnVar.T5, false);
            wf1.I0(wnVar);
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
                    if (wnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = wnVar.f39470f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) wn.D8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    wnVar.Q7();
                    wnVar.y3.j(58, 0L, null);
                }
                wnVar.z7(false);
            } else if (i10 == 12) {
                if (wnVar.getParentActivity() != null) {
                    wnVar.F7(null, null, false);
                }
            } else if (i10 == 11) {
                wnVar.ba(true);
            } else if (i10 == 69) {
                wn.B1(wnVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = wnVar.e;
                if (chat != null) {
                    wnVar.presentFragment(wn.R9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = wnVar.T5;
                if (ChatObject.isMonoForum(wnVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, wnVar.e)) {
                        j11 = wnVar.f39450d4;
                        j3 = wnVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                yh.s5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = wnVar.T5;
                if (ChatObject.isMonoForum(wnVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, wnVar.e)) {
                        j12 = wnVar.f39450d4;
                        j3 = wnVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                yh.s5.y(i14, false).C(j13, j14, new bh(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (wnVar.f39417ab == null) {
                    wn.G1(wnVar);
                } else {
                    wnVar.k9();
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
                if (wnVar.f39477f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                wnVar.c9();
                wnVar.yc(0, true);
                wnVar.Wc(false);
                MediaController.saveFilesFromMessages(wnVar.getParentActivity(), wnVar.getAccountInstance(), arrayList2, new ij(0, this, z14));
            } else if (i10 == 13) {
                if (wnVar.getParentActivity() != null) {
                    wnVar.showDialog(org.telegram.ui.Components.e5.V(wnVar.getParentActivity(), wnVar.h, wnVar.f39468ea).f18661a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (wnVar.f39470f != null && wnVar.getParentActivity() != null) {
                        TextView textView = wnVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            wnVar.rb(null, ((Integer) wnVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", wnVar.f39470f.f18482id);
                        bundle.putBoolean("addContact", true);
                        wnVar.presentFragment(new ms(bundle));
                    }
                } else if (i10 == 18) {
                    wnVar.bc(false);
                } else if (i10 == 24) {
                    try {
                        wnVar.getMediaDataController().installShortcut(wnVar.f39470f.f18482id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(wnVar.e)) {
                        v5 v5Var = new v5(wnVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wnVar.D1;
                        v5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                        }
                        wnVar.presentFragment(v5Var);
                        return;
                    }
                    wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.T5));
                } else if (i10 == 21) {
                    int i23 = t31.v;
                    int currentAccount = wnVar.getCurrentAccount();
                    Activity parentActivity = wnVar.getParentActivity();
                    long a2 = wnVar.a();
                    if (parentActivity != null) {
                        t31.K(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i24 = 0; i24 < 2; i24++) {
                        for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i24].valueAt(i25);
                            wnVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !wnVar.Z5);
                        }
                    }
                    wnVar.z7(false);
                } else if (i10 == 23) {
                    for (int i26 = 1; i26 >= 0; i26--) {
                        if (messageObject == null && sparseArrayArr3[i26].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                            }
                            messageObject = (MessageObject) wnVar.f39585o6[i26].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i26].clear();
                        sparseArrayArr2[i26].clear();
                        sparseArrayArr[i26].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        wnVar.f39451d5 = messageObject;
                        wnVar.Ba(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        wnVar.Xb(messageObject, false);
                    }
                    wnVar.c9();
                    wnVar.yc(r92, true);
                    wnVar.Wc(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    hg.b2 c10 = hg.c2.f(i12).c(wnVar.H8());
                    Activity parentActivity2 = wnVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    hg.z1.d0(parentActivity2, i13, wnVar.Q3, c10, wnVar.getResourceProvider(), new oc(9, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f35075a, wnVar.getResourceProvider(), true, true);
                    e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    e1Var.setOnClickListener(new a(this, 13));
                    org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39494h0;
                    org.telegram.ui.ActionBar.x xVar = wnVar.f39459e0;
                    xVar.a();
                    u0Var.M(e1Var, xVar.f19912m);
                } else if (i10 == 30) {
                    wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", wnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", wnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (wnVar.E9()) {
                        str = "";
                    }
                    wnVar.la(str);
                } else if (i10 == 62) {
                    wnVar.getMessagesController().getTranslateController().setHideTranslateDialog(wnVar.a(), false, true);
                    if (!wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a(), true)) {
                        wnVar.Qc(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        jk jkVar = wnVar.Y;
                        if (jkVar != null && jkVar.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        jk jkVar2 = wnVar.Y;
                        if (jkVar2 != null && jkVar2.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        jk jkVar3 = wnVar.Y;
                        if (jkVar3 != null && jkVar3.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        jk jkVar4 = wnVar.Y;
                        if (jkVar4 != null && jkVar4.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        jk jkVar5 = wnVar.Y;
                        if (jkVar5 != null && jkVar5.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        jk jkVar6 = wnVar.Y;
                        if (jkVar6 != null && jkVar6.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        jk jkVar7 = wnVar.Y;
                        if (jkVar7 != null && jkVar7.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        jk jkVar8 = wnVar.Y;
                        if (jkVar8 != null && jkVar8.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        jk jkVar9 = wnVar.Y;
                        if (jkVar9 != null && jkVar9.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        jk jkVar10 = wnVar.Y;
                        if (jkVar10 != null && jkVar10.getEditField() != null) {
                            wnVar.Y.getEditField().setSelectionOverride(wnVar.A4, wnVar.B4);
                            wnVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        wnVar.xb();
                    } else if (i10 == 60) {
                        if (wnVar.f39438c4 != null) {
                            TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                            long j15 = wnVar.e.f18335id;
                            TLRPC.TL_forumTopic tL_forumTopic = wnVar.f39438c4;
                            int i28 = tL_forumTopic.f18387id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j15, i28, true);
                            wnVar.Rc();
                            wnVar.hc(false);
                            wnVar.Qc(true);
                        }
                    } else if (i10 == 61) {
                        wf1.I0(wnVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(wnVar.P3.link);
                        org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final kj f34233b;

                            {
                                this.f34233b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f34233b.f35076b.finishFragment();
                                        return;
                                    default:
                                        kj kjVar = this.f34233b;
                                        kjVar.getClass();
                                        wn wnVar2 = kjVar.f35076b;
                                        Intent intent = new Intent(wnVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", wnVar2.P3.link);
                                        wnVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (wnVar.Y.w()) {
                            wnVar.wb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = wnVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = wnVar.P3;
                        d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                        hg.x.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 17));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(a2Var);
                        TextView textView2 = (TextView) a2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19298q7));
                        }
                    } else if (i10 == 73) {
                        se1 a02 = se1.a0(-wnVar.T5, 0L);
                        a02.f37730y = wnVar;
                        wnVar.presentFragment(a02);
                    } else if (i10 == 888) {
                        wnVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = i4.f34362b1;
                        org.telegram.ui.Components.xc.a0(wnVar).t("No rich message copied", null).j();
                    }
                } else if (wnVar.f39470f != null && wnVar.getParentActivity() != null) {
                    TLRPC.User user4 = wnVar.f39470f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = wnVar.f39414a8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.g2.m(user4, z12, z13, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f39470f.f18482id), wnVar.getAccountInstance());
                }
            } else if (wnVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(wnVar.e)) {
                    if (wnVar.f39450d4 != 0 && (user2 = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.f39450d4))) != null) {
                        org.telegram.ui.Components.e5.r(wnVar, -1, user2, wnVar.e, true, new o(12, this, user2), wnVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = wnVar.Z7;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 26 || (i10 == 15 && wnVar.h == null && (((user = wnVar.f39470f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(wnVar.f39470f)) || ((chatFull = wnVar.Z7) != null && chatFull.can_delete_channel)))) {
                    boolean z17 = z10;
                    org.telegram.ui.Components.e5.r(wnVar, -1, wnVar.f39470f, wnVar.e, z17, new jj(this, z17), wnVar.getResourceProvider());
                    return;
                }
                if (i10 == 15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.Chat chat2 = wnVar.e;
                TLRPC.User user5 = wnVar.f39470f;
                if (wnVar.h == null) {
                    z16 = false;
                }
                org.telegram.ui.Components.e5.s(wnVar, z11, chat2, user5, z16, true, false, z10, new i2.s(this, i10, z10));
            }
        }
    }
}
