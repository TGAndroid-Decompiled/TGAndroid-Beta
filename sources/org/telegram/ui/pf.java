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
    public final int f36618a;
    public final Object f36619b;
    public final Object f36620c;

    public pf(int i10, Object obj, Object obj2) {
        this.f36618a = i10;
        this.f36619b = obj;
        this.f36620c = obj2;
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
        int i12 = this.f36618a;
        float f10 = -0.04f;
        float f11 = 0.25f;
        SendMessageChatArguments sendMessageChatArguments = null;
        int i13 = 0;
        Object obj2 = this.f36620c;
        Object obj3 = this.f36619b;
        switch (i12) {
            case 0:
                bo boVar = (bo) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (boVar.R3 == 1) {
                    org.telegram.ui.Components.c5.M(boVar.getParentActivity(), boVar.T5, new c7(boVar, botInlineResult, l4, 2), boVar.f32279ea);
                    return;
                } else {
                    boVar.cb(botInlineResult, true, 0, l4.longValue());
                    return;
                }
            case 1:
                bo.q1((bo) obj3, (j41[]) obj2, (org.telegram.ui.Components.n70) obj);
                return;
            case 2:
                bo boVar2 = (bo) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.w1.o(R.string.PollStatsWillLater, org.telegram.ui.Components.vc.a0(boVar2), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(boVar2.getParentActivity(), boVar2.f32279ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 3:
                bo boVar3 = (bo) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                boVar3.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    boVar3.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 4:
                hg.a2 a2Var = (hg.a2) obj2;
                String str = (String) obj;
                bo boVar4 = ((oj) obj3).f36367b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) boVar4).currentAccount;
                    hg.b2.f(i10).k(a2Var.f10222a, str);
                }
                boVar4.Q3 = str;
                boVar4.f32219a1.setTitle(str);
                return;
            case 5:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                bo boVar5 = ((nn) obj3).f36139a;
                if (boVar5.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), boVar5.T5, boVar5.f32385n5, boVar5.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = boVar5.C8();
                    of2.dice_stake = l10.longValue();
                    boVar5.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                bo boVar6 = ((nn) obj3).f36139a;
                if (((Boolean) obj).booleanValue()) {
                    while (i13 < boVar6.f32506x0.getChildCount()) {
                        View childAt = boVar6.f32506x0.getChildAt(i13);
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
                nn nnVar = (nn) obj3;
                pf pfVar = (pf) obj2;
                bo boVar7 = nnVar.f36139a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.vc.a0(boVar7).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                boVar7.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.vc.a0(boVar7).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new ym(nnVar, 8)), true)).k(true);
                pfVar.run(Boolean.TRUE);
                return;
            case 8:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((nn) obj3).f36139a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f18142id, (String) obj);
                return;
            case 9:
                fo foVar = (fo) obj3;
                foVar.f33732f.t(((dg.a) obj).f7727b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = foVar.f33730b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.nf) obj3).f26452a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject3 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                bo boVar8 = chatActivityEnterView.O2;
                if (boVar8 != null) {
                    sendMessageChatArguments = boVar8.C8();
                }
                of3.sendMessageChatArguments = sendMessageChatArguments;
                of3.effect_id = chatActivityEnterView.S4;
                of3.payStars = l11.longValue();
                of3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ve veVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                veVar.setEffect(0L);
                return;
            case 11:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj2;
                ((bo) obj3).f32299g5 = (MessageSuggestionParams) obj;
                boolean G1 = viVar.G1(0, true, 0, viVar.s1(), viVar.N0);
                org.telegram.ui.Components.kf kfVar = viVar.f28751h0;
                if (kfVar != null) {
                    kfVar.h(!G1);
                    viVar.f28751h0 = null;
                    return;
                }
                return;
            case 12:
                ((ei.q4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 13:
                org.telegram.ui.Components.gl glVar = ((org.telegram.ui.Components.dl) obj3).f23361b;
                glVar.f24340x0.b(((org.telegram.ui.Components.fl) obj2).f23960c, glVar.f24342y0, true, 0, ((Long) obj).longValue());
                glVar.f26463b.dismiss(true);
                return;
            case 14:
                org.telegram.ui.Components.pv pvVar = (org.telegram.ui.Components.pv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ov(pvVar, 1));
                    return;
                }
                return;
            case 15:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.oh ohVar = (org.telegram.ui.Components.oh) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                ohVar.run();
                return;
            case 16:
                org.telegram.ui.Components.iy iyVar = (org.telegram.ui.Components.iy) obj3;
                org.telegram.ui.Components.jy jyVar = iyVar.f25050a;
                org.telegram.ui.Components.kz kzVar = jyVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.f25716c1);
                String[] strArr = kzVar.W0;
                String str2 = jyVar.v;
                ai.r5 r5Var = new ai.r5(iyVar, (String) obj2, (Runnable) obj, 28);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(kzVar.f25716c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, r5Var, null, z10, false, true, 25);
                return;
            case 17:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.jy jyVar2 = ((org.telegram.ui.Components.iy) obj3).f25050a;
                if (ConnectionsManager.getInstance(jyVar2.F.f25716c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.jy.E(jyVar2, runnable, arrayList2, false);
                    return;
                }
            case 18:
                org.telegram.ui.Components.dz dzVar = (org.telegram.ui.Components.dz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(dzVar.f23415w.Q.f25716c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        dzVar.f23412n.add(new org.telegram.ui.Components.cy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 19:
                org.telegram.ui.Components.c10 c10Var = (org.telegram.ui.Components.c10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (c10Var.f22872a0 == null && !(c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, c10Var.f22877f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f26705j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(o2Var);
                int i14 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, c10Var.f22877f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", c10Var.f22879h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.oc M2 = a02.M(replaceTags, formatPluralString, i14);
                M2.f26705j = 5000;
                M2.j();
                return;
            case 20:
                View view2 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
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
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 21:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.hr0 hr0Var = (org.telegram.ui.Components.hr0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.vc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.rd(2, U)), true)).k(true);
                    }
                    hr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.vc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.Components.zu0.j((org.telegram.ui.Components.zu0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                return;
            case 23:
                ut utVar = (ut) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l12 = (Long) obj;
                utVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                utVar.p();
                return;
            case 24:
                qt qtVar = (qt) obj3;
                Boolean bool = (Boolean) obj;
                qtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    qtVar.f37022a.p();
                    return;
                }
                return;
            case 25:
                wy wyVar = (wy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    wyVar.showDialog(new hk0(activity, !org.telegram.ui.Components.de0.c(), new iw(activity, 0)));
                    return;
                }
                return;
            case 26:
                zp0 zp0Var = (zp0) obj2;
                Integer num = (Integer) obj;
                h10 h10Var = ((e10) obj3).e;
                if (!h10Var.getUserConfig().isPremium()) {
                    h10Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) h10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                h10Var.E = intValue;
                zp0Var.a(intValue, true);
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
                t50 t50Var = (t50) obj3;
                u50 u50Var = (u50) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (u50Var != null) {
                    t50Var.getClass();
                    u50Var.setVisibility(0);
                }
                t50Var.f37661c = bitmap2;
                Paint paint = new Paint(1);
                t50Var.d = paint;
                Bitmap bitmap3 = t50Var.f37661c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                t50Var.e = bitmapShader;
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
                t50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 28:
                hc0 hc0Var = (hc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                hc0Var.a();
                if (user != null) {
                    long j10 = userArr[0].f18268id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f18268id);
                    hc0Var.n(new gc0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            default:
                tj0 tj0Var = (tj0) obj3;
                String str3 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = tj0Var.f37816f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f18268id)) && tj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f18268id));
                        }
                    }
                }
                Boolean bool2 = tj0Var.f37827r0;
                if (bool2 != null && bool2.booleanValue()) {
                    oj0 oj0Var = new oj0(0, tj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str3 != null && !str3.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f18167q = str3;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new bj1(3, messagesController2, oj0Var));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.w1(oj0Var, 5));
                    }
                    tj0Var.m0 = i13;
                    return;
                }
                tj0Var.U(true, true);
                return;
        }
    }

    public pf(org.telegram.ui.Components.vi viVar, bo boVar) {
        this.f36618a = 11;
        this.f36620c = viVar;
        this.f36619b = boVar;
    }
}
