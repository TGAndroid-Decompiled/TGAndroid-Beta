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
public final class hj extends org.telegram.ui.ActionBar.j {
    public final Context f37583a;
    public final sn f37584b;

    public hj(sn snVar, Context context) {
        this.f37584b = snVar;
        this.f37583a = context;
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
        sn snVar = this.f37584b;
        SparseArray[] sparseArrayArr = snVar.Y5;
        SparseArray[] sparseArrayArr2 = snVar.X5;
        SparseArray[] sparseArrayArr3 = snVar.W5;
        long j10 = 0;
        boolean z16 = true;
        int i18 = 0;
        if (i10 == -1) {
            if (!snVar.f41452wc.f17387f) {
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                if (kVar.s()) {
                    snVar.C7(false);
                } else if (snVar.R3 == 5 && (snVar.f41421u6.isEmpty() || snVar.f41209d4 == 0)) {
                    snVar.Ub();
                } else if (snVar.R3 == 6 && snVar.Y.v()) {
                    snVar.Ab(new Runnable(this) {
                        public final hj f36562b;

                        {
                            this.f36562b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f36562b.f37584b.finishFragment();
                                    return;
                                default:
                                    hj hjVar = this.f36562b;
                                    hjVar.getClass();
                                    sn snVar2 = hjVar.f37584b;
                                    Intent intent = new Intent(snVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", snVar2.P3.link);
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
            if (snVar.getUserConfig().getClientUserId() == snVar.T5) {
                snVar.getMessagesController().setSavedViewAs(true);
                snVar.f41166a1.e(false, true);
                return;
            }
            snVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-snVar.T5, false);
            te1.I0(snVar);
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
                        if (arrayList.size() != 1 && ((user3 = snVar.f41229f) == null || !user3.self)) {
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
                    snVar.y3.j(58, 0L, null);
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
                long j12 = snVar.T5;
                if (ChatObject.isMonoForum(snVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, snVar.e)) {
                        j12 = snVar.f41209d4;
                        j10 = snVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                ai.ga.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = snVar.T5;
                if (ChatObject.isMonoForum(snVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, snVar.e)) {
                        j13 = snVar.f41209d4;
                        j10 = snVar.T5;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                ai.ga.y(i14, false).C(j14, j15, new ai.p5(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (snVar.f41189bb == null) {
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
                if (snVar.f41236f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                snVar.h9();
                snVar.Cc(0, true);
                snVar.ad(false);
                MediaController.saveFilesFromMessages(snVar.getParentActivity(), snVar.getAccountInstance(), arrayList2, new fj(0, this, z14));
            } else if (i10 == 13) {
                if (snVar.getParentActivity() != null) {
                    snVar.showDialog(org.telegram.ui.Components.f5.U(snVar.getParentActivity(), snVar.h, snVar.f41226ea).f20608a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (snVar.f41229f != null && snVar.getParentActivity() != null) {
                        TextView textView = snVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            snVar.vb(null, ((Integer) snVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", snVar.f41229f.f20426id);
                        bundle.putBoolean("addContact", true);
                        snVar.presentFragment(new hs(bundle));
                    }
                } else if (i10 == 18) {
                    snVar.fc(false);
                } else if (i10 == 24) {
                    try {
                        snVar.getMediaDataController().installShortcut(snVar.f41229f.f20426id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(snVar.e)) {
                        z5 z5Var = new z5(snVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = snVar.D1;
                        z5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                        }
                        snVar.presentFragment(z5Var);
                        return;
                    }
                    snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.T5));
                } else if (i10 == 21) {
                    int i24 = q21.v;
                    int currentAccount = snVar.getCurrentAccount();
                    Activity parentActivity = snVar.getParentActivity();
                    long a2 = snVar.a();
                    if (parentActivity != null) {
                        q21.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i25 = 0; i25 < 2; i25++) {
                        for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                            snVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !snVar.Z5);
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
                            messageObject = (MessageObject) snVar.f41346o6[i27].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i27].clear();
                        sparseArrayArr2[i27].clear();
                        sparseArrayArr[i27].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        snVar.f41210d5 = messageObject;
                        snVar.Fa(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        snVar.bc(messageObject, false);
                    }
                    snVar.h9();
                    snVar.Cc(r92, true);
                    snVar.ad(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ig.z1 c10 = ig.a2.f(i12).c(snVar.M8());
                    Activity parentActivity2 = snVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ig.x1.d0(parentActivity2, i13, snVar.Q3, c10, snVar.getResourceProvider(), new org.telegram.ui.ActionBar.j3(15, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f37583a, snVar.getResourceProvider(), true, true);
                    e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    e1Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.u0 u0Var = snVar.f41254h0;
                    org.telegram.ui.ActionBar.x xVar = snVar.f41217e0;
                    xVar.a();
                    u0Var.M(e1Var, xVar.f21868m);
                } else if (i10 == 30) {
                    snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (snVar.J9()) {
                        str = "";
                    }
                    snVar.qa(str);
                } else if (i10 == 62) {
                    snVar.getMessagesController().getTranslateController().setHideTranslateDialog(snVar.a(), false, true);
                    if (!snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a(), true)) {
                        snVar.Uc(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        hk hkVar = snVar.Y;
                        if (hkVar != null && hkVar.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        hk hkVar2 = snVar.Y;
                        if (hkVar2 != null && hkVar2.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        hk hkVar3 = snVar.Y;
                        if (hkVar3 != null && hkVar3.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        hk hkVar4 = snVar.Y;
                        if (hkVar4 != null && hkVar4.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        hk hkVar5 = snVar.Y;
                        if (hkVar5 != null && hkVar5.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        hk hkVar6 = snVar.Y;
                        if (hkVar6 != null && hkVar6.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        hk hkVar7 = snVar.Y;
                        if (hkVar7 != null && hkVar7.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        hk hkVar8 = snVar.Y;
                        if (hkVar8 != null && hkVar8.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        hk hkVar9 = snVar.Y;
                        if (hkVar9 != null && hkVar9.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        hk hkVar10 = snVar.Y;
                        if (hkVar10 != null && hkVar10.getEditField() != null) {
                            snVar.Y.getEditField().setSelectionOverride(snVar.A4, snVar.B4);
                            snVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        snVar.Bb();
                    } else if (i10 == 60) {
                        if (snVar.f41196c4 != null) {
                            TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                            long j16 = snVar.e.f20279id;
                            TLRPC.TL_forumTopic tL_forumTopic = snVar.f41196c4;
                            int i29 = tL_forumTopic.f20331id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j16, i29, true);
                            snVar.Vc();
                            snVar.lc(false);
                            snVar.Uc(true);
                        }
                    } else if (i10 == 61) {
                        te1.I0(snVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(snVar.P3.link);
                        org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final hj f36562b;

                            {
                                this.f36562b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f36562b.f37584b.finishFragment();
                                        return;
                                    default:
                                        hj hjVar = this.f36562b;
                                        hjVar.getClass();
                                        sn snVar2 = hjVar.f37584b;
                                        Intent intent = new Intent(snVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", snVar2.P3.link);
                                        snVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (snVar.Y.v()) {
                            snVar.Ab(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = snVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = snVar.P3;
                        d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                        ig.v.b0(parentActivity3, i11, tL_businessChatLink, d6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 17));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21231q7));
                        }
                    } else if (i10 == 73) {
                        pd1 a02 = pd1.a0(-snVar.T5, 0L);
                        a02.f40108y = snVar;
                        snVar.presentFragment(a02);
                    } else if (i10 == 888) {
                        snVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = l4.f38726b1;
                        org.telegram.ui.Components.xc.a0(snVar).t("No rich message copied", null).j();
                    }
                } else if (snVar.f41229f != null && snVar.getParentActivity() != null) {
                    TLRPC.User user4 = snVar.f41229f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = snVar.f41172a8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.d2.m(user4, z12, z13, snVar.getParentActivity(), snVar.getMessagesController().getUserFull(snVar.f41229f.f20426id), snVar.getAccountInstance());
                }
            } else if (snVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(snVar.e)) {
                    if (snVar.f41209d4 != 0 && (user2 = snVar.getMessagesController().getUser(Long.valueOf(snVar.f41209d4))) != null) {
                        org.telegram.ui.Components.f5.q(snVar, -1, user2, snVar.e, true, new m4.w0(16, this, user2), snVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = snVar.Z7;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 26 || (i10 == 15 && snVar.h == null && (((user = snVar.f41229f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(snVar.f41229f)) || ((chatFull = snVar.Z7) != null && chatFull.can_delete_channel)))) {
                    boolean z17 = z10;
                    org.telegram.ui.Components.f5.q(snVar, -1, snVar.f41229f, snVar.e, z17, new gj(this, z17), snVar.getResourceProvider());
                    return;
                }
                if (i10 == 15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.Chat chat2 = snVar.e;
                TLRPC.User user5 = snVar.f41229f;
                if (snVar.h == null) {
                    z16 = false;
                }
                org.telegram.ui.Components.f5.r(snVar, z11, chat2, user5, z16, true, false, z10, new i2.r(this, i10, z10));
            }
        }
    }
}
