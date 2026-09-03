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
    public final Context f35789a;
    public final zn f35790b;

    public lj(zn znVar, Context context) {
        this.f35790b = znVar;
        this.f35789a = context;
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
        org.telegram.ui.ActionBar.f6 f6Var;
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
        zn znVar = this.f35790b;
        SparseArray[] sparseArrayArr = znVar.V5;
        SparseArray[] sparseArrayArr2 = znVar.U5;
        SparseArray[] sparseArrayArr3 = znVar.T5;
        long j10 = 0;
        if (i10 == -1) {
            if (!znVar.f40758tc.f46961f) {
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar.s()) {
                    znVar.z7(false);
                } else if (znVar.O3 == 5 && (znVar.f40730r6.isEmpty() || znVar.f40514a4 == 0)) {
                    znVar.Qb();
                } else if (znVar.O3 == 6 && znVar.V.w()) {
                    znVar.wb(new Runnable(this) {
                        public final lj f34990b;

                        {
                            this.f34990b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34990b.f35790b.finishFragment();
                                    return;
                                default:
                                    lj ljVar = this.f34990b;
                                    ljVar.getClass();
                                    zn znVar2 = ljVar.f35790b;
                                    Intent intent = new Intent(znVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", znVar2.M3.link);
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
            if (znVar.getUserConfig().getClientUserId() == znVar.Q5) {
                znVar.getMessagesController().setSavedViewAs(true);
                znVar.X0.e(false, true);
                return;
            }
            znVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-znVar.Q5, false);
            sf1.I0(znVar);
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
                        if (arrayList.size() != 1 && ((user3 = znVar.f40575f) == null || !user3.self)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        spannableStringBuilder.append((CharSequence) zn.D8(messageObject2, z14, j11));
                        j11 = messageObject2.getFromChatId();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    znVar.Q7();
                    znVar.f40775v3.j(58, 0L, null);
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
                long j12 = znVar.Q5;
                if (ChatObject.isMonoForum(znVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, znVar.e)) {
                        j12 = znVar.f40514a4;
                        j10 = znVar.Q5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                lh.t7.y(i16, false).i0(j12, j10, false, false);
            } else if (i10 == 71) {
                long j13 = znVar.Q5;
                if (ChatObject.isMonoForum(znVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, znVar.e)) {
                        j13 = znVar.f40514a4;
                        j10 = znVar.Q5;
                    }
                }
                long j14 = j13;
                long j15 = j10;
                i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                lh.t7.y(i14, false).C(j14, j15, new lh.t3(this, j14, j15, 2));
            } else if (i10 == 28) {
                if (znVar.Ya == null) {
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
                if (znVar.f40543c6 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                znVar.c9();
                znVar.yc(0, true);
                znVar.Wc(false);
                MediaController.saveFilesFromMessages(znVar.getParentActivity(), znVar.getAccountInstance(), arrayList2, new jj(0, this, z13));
            } else if (i10 == 13) {
                if (znVar.getParentActivity() != null) {
                    znVar.showDialog(org.telegram.ui.Components.z4.V(znVar.getParentActivity(), znVar.h, znVar.f40534ba).f19478a);
                }
            } else if (i10 == 15 || i10 == 16 || i10 == 26) {
                boolean z15 = false;
                if (znVar.getParentActivity() != null) {
                    if (i10 == 15 && ChatObject.isMonoForum(znVar.e)) {
                        if (znVar.f40514a4 != 0 && (user2 = znVar.getMessagesController().getUser(Long.valueOf(znVar.f40514a4))) != null) {
                            org.telegram.ui.Components.z4.r(znVar, -1, user2, znVar.e, true, new mg.w(18, this, user2), znVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = znVar.W7;
                    if (chatFull2 != null && chatFull2.can_delete_channel) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i10 != 26) {
                        int i23 = 15;
                        if (i10 == 15) {
                            if (znVar.h != null || (((user = znVar.f40575f) == null || UserObject.isUserSelf(user) || UserObject.isDeleted(znVar.f40575f)) && ((chatFull = znVar.W7) == null || !chatFull.can_delete_channel))) {
                                i23 = 15;
                            }
                        }
                        if (i10 == i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        TLRPC.Chat chat2 = znVar.e;
                        TLRPC.User user4 = znVar.f40575f;
                        if (znVar.h != null) {
                            z15 = true;
                        }
                        org.telegram.ui.Components.z4.s(znVar, z10, chat2, user4, z15, true, false, z4, new gg.m2(this, i10, z4));
                        return;
                    }
                    boolean z16 = z4;
                    org.telegram.ui.Components.z4.r(znVar, -1, znVar.f40575f, znVar.e, z16, new kj(this, z16), znVar.getResourceProvider());
                }
            } else if (i10 == 17) {
                if (znVar.f40575f != null && znVar.getParentActivity() != null) {
                    TextView textView = znVar.I1;
                    if (textView != null && textView.getTag() != null) {
                        znVar.rb(null, ((Integer) znVar.I1.getTag()).intValue());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", znVar.f40575f.f19306id);
                    bundle.putBoolean("addContact", true);
                    znVar.presentFragment(new ps(bundle));
                }
            } else if (i10 == 18) {
                znVar.bc(false);
            } else if (i10 == 24) {
                try {
                    znVar.getMediaDataController().installShortcut(znVar.f40575f.f19306id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 29) {
                if (ChatObject.hasAdminRights(znVar.e)) {
                    a6 a6Var = new a6(znVar.Q5);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = znVar.A1;
                    a6Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        a6Var.getMessagesController().getBoostsController().userCanBoostChannel(a6Var.M, a6Var.O, new r5(a6Var, 0));
                    }
                    znVar.presentFragment(a6Var);
                    return;
                }
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.Q5));
            } else if (i10 == 21) {
                int i24 = q31.v;
                int currentAccount = znVar.getCurrentAccount();
                Activity parentActivity = znVar.getParentActivity();
                long a2 = znVar.a();
                if (parentActivity != null) {
                    q31.J(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                }
            } else if (i10 == 22) {
                for (int i25 = 0; i25 < 2; i25++) {
                    for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                        znVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !znVar.W5);
                    }
                }
                znVar.z7(false);
            } else if (i10 == 23) {
                for (int i27 = 1; i27 >= 0; i27--) {
                    if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                        }
                        messageObject = (MessageObject) znVar.f40655l6[i27].get(((Integer) arrayList3.get(0)).intValue());
                    }
                    sparseArrayArr3[i27].clear();
                    sparseArrayArr2[i27].clear();
                    sparseArrayArr[i27].clear();
                }
                if (messageObject != null && messageObject.isTodo()) {
                    znVar.f40515a5 = messageObject;
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
                i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                uf.o1 c3 = uf.p1.f(i12).c(znVar.H8());
                Activity parentActivity2 = znVar.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                uf.m1.d0(parentActivity2, i13, znVar.N3, c3, znVar.getResourceProvider(), new kh.a1(21, this, c3));
            } else if (i10 == 14) {
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f35789a, znVar.getResourceProvider(), true, true);
                g1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                g1Var.setOnClickListener(new a(this, 13));
                org.telegram.ui.ActionBar.w0 w0Var = znVar.f40563e0;
                org.telegram.ui.ActionBar.y yVar = znVar.f40524b0;
                yVar.a();
                w0Var.M(g1Var, yVar.f20717m);
            } else if (i10 == 30) {
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", znVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
            } else if (i10 == 31) {
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", znVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                    lk lkVar = znVar.V;
                    if (lkVar != null && lkVar.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedBold();
                    }
                } else if (i10 == 51) {
                    lk lkVar2 = znVar.V;
                    if (lkVar2 != null && lkVar2.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedItalic();
                    }
                } else if (i10 == 57) {
                    lk lkVar3 = znVar.V;
                    if (lkVar3 != null && lkVar3.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedSpoiler();
                    }
                } else if (i10 == 58) {
                    lk lkVar4 = znVar.V;
                    if (lkVar4 != null && lkVar4.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedQuote();
                    }
                } else if (i10 == 52) {
                    lk lkVar5 = znVar.V;
                    if (lkVar5 != null && lkVar5.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedMono();
                    }
                } else if (i10 == 55) {
                    lk lkVar6 = znVar.V;
                    if (lkVar6 != null && lkVar6.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedStrike();
                    }
                } else if (i10 == 56) {
                    lk lkVar7 = znVar.V;
                    if (lkVar7 != null && lkVar7.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedUnderline();
                    }
                } else if (i10 == 74) {
                    lk lkVar8 = znVar.V;
                    if (lkVar8 != null && lkVar8.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedDate();
                    }
                } else if (i10 == 53) {
                    lk lkVar9 = znVar.V;
                    if (lkVar9 != null && lkVar9.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedUrl();
                    }
                } else if (i10 == 54) {
                    lk lkVar10 = znVar.V;
                    if (lkVar10 != null && lkVar10.getEditField() != null) {
                        znVar.V.getEditField().setSelectionOverride(znVar.f40804x4, znVar.f40818y4);
                        znVar.V.getEditField().makeSelectedRegular();
                    }
                } else if (i10 == 27) {
                    znVar.xb();
                } else if (i10 == 60) {
                    if (znVar.Z3 != null) {
                        TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                        long j16 = znVar.e.f19159id;
                        TLRPC.TL_forumTopic tL_forumTopic = znVar.Z3;
                        int i29 = tL_forumTopic.f19211id;
                        tL_forumTopic.closed = true;
                        topicsController.toggleCloseTopic(j16, i29, true);
                        znVar.Rc();
                        znVar.hc(false);
                        znVar.Qc(true);
                    }
                } else if (i10 == 61) {
                    sf1.I0(znVar);
                } else if (i10 == 65) {
                    AndroidUtilities.addToClipboard(znVar.M3.link);
                    org.telegram.ui.Components.qc.a0(LaunchActivity.R()).k(false).j();
                } else if (i10 == 66) {
                    Runnable runnable = new Runnable(this) {
                        public final lj f34990b;

                        {
                            this.f34990b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f34990b.f35790b.finishFragment();
                                    return;
                                default:
                                    lj ljVar = this.f34990b;
                                    ljVar.getClass();
                                    zn znVar2 = ljVar.f35790b;
                                    Intent intent = new Intent(znVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", znVar2.M3.link);
                                    znVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    };
                    if (znVar.V.w()) {
                        znVar.wb(runnable);
                    } else {
                        runnable.run();
                    }
                } else if (i10 == 67) {
                    Activity parentActivity3 = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    TL_account.TL_businessChatLink tL_businessChatLink = znVar.M3;
                    f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                    uf.q.b0(parentActivity3, i11, tL_businessChatLink, f6Var);
                } else if (i10 == 68) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
                    String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    znVar.showDialog(d2Var);
                    TextView textView2 = (TextView) d2Var.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
                    }
                } else if (i10 == 73) {
                    ne1 a02 = ne1.a0(-znVar.Q5, 0L);
                    a02.f36500y = znVar;
                    znVar.presentFragment(a02);
                } else if (i10 == 888) {
                    znVar.dumpCanvas();
                } else if (i10 == 889) {
                    HashSet hashSet = n4.Y0;
                    org.telegram.ui.Components.qc.a0(znVar).t("No rich message copied", null).j();
                }
            } else if (znVar.f40575f != null && znVar.getParentActivity() != null) {
                TLRPC.User user5 = znVar.f40575f;
                if (i10 == 33) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = znVar.X7;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user5, z11, z12, znVar.getParentActivity(), znVar.getMessagesController().getUserFull(znVar.f40575f.f19306id), znVar.getAccountInstance());
            }
        }
    }
}
