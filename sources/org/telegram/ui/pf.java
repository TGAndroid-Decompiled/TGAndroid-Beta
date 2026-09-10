package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pf implements Utilities.Callback {
    public final int f35823a;
    public final Object f35824b;
    public final Object f35825c;

    public pf(int i10, Object obj, Object obj2) {
        this.f35823a = i10;
        this.f35824b = obj;
        this.f35825c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        MessageObject threadMessage;
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f7;
        int[] iArr;
        int i11;
        int i12 = this.f35823a;
        float f10 = -0.04f;
        float f11 = 0.25f;
        SendMessageChatArguments sendMessageChatArguments = null;
        int i13 = 0;
        Object obj2 = this.f35825c;
        Object obj3 = this.f35824b;
        switch (i12) {
            case 0:
                eo eoVar = (eo) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (eoVar.R3 == 1) {
                    org.telegram.ui.Components.d5.M(eoVar.getParentActivity(), eoVar.T5, new a7(eoVar, botInlineResult, l4, 2), eoVar.f32316ea);
                    return;
                } else {
                    eoVar.cb(botInlineResult, true, 0, l4.longValue());
                    return;
                }
            case 1:
                eo.q1((eo) obj3, (n41[]) obj2, (org.telegram.ui.Components.w70) obj);
                return;
            case 2:
                eo eoVar2 = (eo) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.a2.o(R.string.PollStatsWillLater, org.telegram.ui.Components.wc.a0(eoVar2), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new sh.g(eoVar2.getParentActivity(), eoVar2.f32316ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 3:
                eo eoVar3 = (eo) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                eoVar3.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    eoVar3.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 4:
                gg.j2 j2Var = (gg.j2) obj2;
                String str = (String) obj;
                eo eoVar4 = ((pj) obj3).f35851b;
                if (j2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar4).currentAccount;
                    gg.k2.f(i10).k(j2Var.f8917a, str);
                }
                eoVar4.Q3 = str;
                eoVar4.f32256a1.setTitle(str);
                return;
            case 5:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                eo eoVar5 = ((pn) obj3).f35881a;
                if (eoVar5.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), eoVar5.T5, eoVar5.f32421n5, eoVar5.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = eoVar5.C8();
                    of2.dice_stake = l10.longValue();
                    eoVar5.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                eo eoVar6 = ((pn) obj3).f35881a;
                if (((Boolean) obj).booleanValue()) {
                    while (i13 < eoVar6.f32542x0.getChildCount()) {
                        View childAt = eoVar6.f32542x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                        i13++;
                    }
                    return;
                }
                if (t1Var.getMessageObject() != null) {
                    t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                t1Var.h4();
                return;
            case 7:
                pn pnVar = (pn) obj3;
                pf pfVar = (pf) obj2;
                eo eoVar7 = pnVar.f35881a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.wc.a0(eoVar7).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                eoVar7.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.wc.a0(eoVar7).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new an(pnVar, 8)), true)).k(true);
                pfVar.run(Boolean.TRUE);
                return;
            case 8:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((pn) obj3).f35881a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f17216id, (String) obj);
                return;
            case 9:
                ho hoVar = (ho) obj3;
                hoVar.f33426f.t(((cg.a) obj).f4676b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = hoVar.f33424b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.qf) obj3).f26400a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject3 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                eo eoVar8 = chatActivityEnterView.O2;
                if (eoVar8 != null) {
                    sendMessageChatArguments = eoVar8.C8();
                }
                of3.sendMessageChatArguments = sendMessageChatArguments;
                of3.effect_id = chatActivityEnterView.R4;
                of3.payStars = l11.longValue();
                of3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                yeVar.setEffect(0L);
                return;
            case 11:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) obj2;
                ((eo) obj3).f32336g5 = (MessageSuggestionParams) obj;
                boolean G1 = yiVar.G1(0, true, 0, yiVar.s1(), yiVar.N0);
                org.telegram.ui.Components.of ofVar = yiVar.f29372h0;
                if (ofVar != null) {
                    ofVar.h(!G1);
                    yiVar.f29372h0 = null;
                    return;
                }
                return;
            case 12:
                ((di.u4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 13:
                org.telegram.ui.Components.ll llVar = ((org.telegram.ui.Components.il) obj3).f24042b;
                llVar.f25051x0.b(((org.telegram.ui.Components.kl) obj2).f24747c, llVar.f25053y0, true, 0, ((Long) obj).longValue());
                llVar.f26422b.dismiss(true);
                return;
            case 14:
                org.telegram.ui.Components.tv tvVar = (org.telegram.ui.Components.tv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sv(tvVar, 1));
                    return;
                }
                return;
            case 15:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.hy hyVar = (org.telegram.ui.Components.hy) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                hyVar.run();
                return;
            case 16:
                org.telegram.ui.Components.qy qyVar = (org.telegram.ui.Components.qy) obj3;
                org.telegram.ui.Components.ry ryVar = qyVar.f26493a;
                org.telegram.ui.Components.rz rzVar = ryVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.f26805c1);
                String[] strArr = rzVar.W0;
                String str2 = ryVar.v;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a((Object) qyVar, (String) obj2, (Object) ((Runnable) obj), 26);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(rzVar.f26805c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, z10, false, true, 25);
                return;
            case 17:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ry ryVar2 = ((org.telegram.ui.Components.qy) obj3).f26493a;
                if (ConnectionsManager.getInstance(ryVar2.F.f26805c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.ry.E(ryVar2, runnable, arrayList2, false);
                    return;
                }
            case 18:
                org.telegram.ui.Components.kz kzVar = (org.telegram.ui.Components.kz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(kzVar.f24835w.Q.f26805c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        kzVar.f24832n.add(new org.telegram.ui.Components.jy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 19:
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (k10Var.f24536a0 == null && !(k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, k10Var.f24541f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f26081j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(p2Var);
                int i14 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, k10Var.f24541f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", k10Var.f24543h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.pc M2 = a02.M(replaceTags, formatPluralString, i14);
                M2.f26081j = 5000;
                M2.j();
                return;
            case 20:
                View view2 = (View) obj3;
                org.telegram.ui.Components.e eVar = (org.telegram.ui.Components.e) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                    view2.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view2.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view2.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                float f12 = -0.07f;
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = 2.0f;
                } else {
                    f7 = 3.0f;
                }
                colorMatrix2.setSaturation(f7);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                eVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 21:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.pr0 pr0Var = (org.telegram.ui.Components.pr0) obj2;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.wc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.rd(2, U)), true)).k(true);
                    }
                    pr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.wc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.Components.iv0.j((org.telegram.ui.Components.iv0) obj3, (TL_stories.StoryItem) obj2, (zh.b5) obj);
                return;
            case 23:
                tt ttVar = (tt) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l12 = (Long) obj;
                ttVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                p2Var2.presentFragment(new ProfileActivity(bundle, null));
                ttVar.p();
                return;
            case 24:
                pt ptVar = (pt) obj3;
                Boolean bool = (Boolean) obj;
                ptVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ptVar.f35899a.p();
                    return;
                }
                return;
            case 25:
                wy wyVar = (wy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    wyVar.showDialog(new hk0(activity, !org.telegram.ui.Components.me0.c(), new iw(activity, 0)));
                    return;
                }
                return;
            case 26:
                xp0 xp0Var = (xp0) obj2;
                Integer num = (Integer) obj;
                h10 h10Var = ((e10) obj3).e;
                if (!h10Var.getUserConfig().isPremium()) {
                    h10Var.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) h10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                h10Var.E = intValue;
                xp0Var.a(intValue, true);
                v00 v00Var = h10Var.I;
                if (v00Var != null) {
                    if (!h10Var.getUserConfig().isPremium()) {
                        i11 = -1;
                    } else {
                        i11 = h10Var.E;
                    }
                    v00Var.d(i11, true);
                }
                h10Var.i0(true);
                return;
            case 27:
                s50 s50Var = (s50) obj3;
                t50 t50Var = (t50) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (t50Var != null) {
                    s50Var.getClass();
                    t50Var.setVisibility(0);
                }
                s50Var.f36552c = bitmap2;
                Paint paint = new Paint(1);
                s50Var.d = paint;
                Bitmap bitmap3 = s50Var.f36552c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                s50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f11);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f10);
                s50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 28:
                fc0 fc0Var = (fc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                fc0Var.a();
                if (user != null) {
                    long j10 = userArr[0].f17342id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f17342id);
                    fc0Var.n(new ec0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            default:
                sj0 sj0Var = (sj0) obj3;
                String str3 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = sj0Var.f36699f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f17342id)) && sj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f17342id));
                        }
                    }
                }
                Boolean bool2 = sj0Var.f36710r0;
                if (bool2 != null && bool2.booleanValue()) {
                    nj0 nj0Var = new nj0(0, sj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str3 != null && !str3.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f17241q = str3;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new rg0(28, messagesController2, nj0Var));
                    } else {
                        AndroidUtilities.runOnUIThread(new qg.q0(nj0Var, 12));
                    }
                    sj0Var.m0 = i13;
                    return;
                }
                sj0Var.U(true, true);
                return;
        }
    }

    public pf(org.telegram.ui.Components.yi yiVar, eo eoVar) {
        this.f35823a = 11;
        this.f35825c = yiVar;
        this.f35824b = eoVar;
    }
}
