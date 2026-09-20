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
public final class of implements Utilities.Callback {
    public final int f36296a;
    public final Object f36297b;
    public final Object f36298c;

    public of(int i10, Object obj, Object obj2) {
        this.f36296a = i10;
        this.f36297b = obj;
        this.f36298c = obj2;
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
        int i12 = this.f36296a;
        float f10 = -0.04f;
        float f11 = 0.25f;
        SendMessageChatArguments sendMessageChatArguments = null;
        int i13 = 0;
        Object obj2 = this.f36298c;
        Object obj3 = this.f36297b;
        switch (i12) {
            case 0:
                zn znVar = (zn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (znVar.R3 == 1) {
                    org.telegram.ui.Components.d5.M(znVar.getParentActivity(), znVar.T5, new b7(znVar, botInlineResult, l4, 2), znVar.f40303ea);
                    return;
                } else {
                    znVar.cb(botInlineResult, true, 0, l4.longValue());
                    return;
                }
            case 1:
                zn.B0((zn) obj3, (i41[]) obj2, (org.telegram.ui.Components.v70) obj);
                return;
            case 2:
                zn znVar2 = (zn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.l0.o(R.string.PollStatsWillLater, org.telegram.ui.Components.xc.a0(znVar2), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(znVar2.getParentActivity(), znVar2.f40303ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 3:
                zn znVar3 = (zn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                znVar3.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    znVar3.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 4:
                hg.a2 a2Var = (hg.a2) obj2;
                String str = (String) obj;
                zn znVar4 = ((mj) obj3).f35746b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                    hg.b2.f(i10).k(a2Var.f10223a, str);
                }
                znVar4.Q3 = str;
                znVar4.f40243a1.setTitle(str);
                return;
            case 5:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                zn znVar5 = ((ln) obj3).f35482a;
                if (znVar5.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), znVar5.T5, znVar5.f40409n5, znVar5.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar5.C8();
                    of2.dice_stake = l10.longValue();
                    znVar5.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                zn znVar6 = ((ln) obj3).f35482a;
                if (((Boolean) obj).booleanValue()) {
                    while (i13 < znVar6.f40530x0.getChildCount()) {
                        View childAt = znVar6.f40530x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                        i13++;
                    }
                    return;
                }
                if (u1Var.getMessageObject() != null) {
                    u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                u1Var.h4();
                return;
            case 7:
                ln lnVar = (ln) obj3;
                of ofVar = (of) obj2;
                zn znVar7 = lnVar.f35482a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.xc.a0(znVar7).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                znVar7.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.xc.a0(znVar7).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new wm(lnVar, 8)), true)).k(true);
                ofVar.run(Boolean.TRUE);
                return;
            case 8:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((ln) obj3).f35482a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f18349id, (String) obj);
                return;
            case 9:
                co coVar = (co) obj3;
                coVar.f32795f.t(((dg.a) obj).f7727b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = coVar.f32793b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.of) obj3).f26903a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject3 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zn znVar8 = chatActivityEnterView.O2;
                if (znVar8 != null) {
                    sendMessageChatArguments = znVar8.C8();
                }
                of3.sendMessageChatArguments = sendMessageChatArguments;
                of3.effect_id = chatActivityEnterView.R4;
                of3.payStars = l11.longValue();
                of3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 11:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj2;
                ((zn) obj3).f40323g5 = (MessageSuggestionParams) obj;
                boolean G1 = viVar.G1(0, true, 0, viVar.s1(), viVar.N0);
                org.telegram.ui.Components.mf mfVar = viVar.f29104h0;
                if (mfVar != null) {
                    mfVar.h(!G1);
                    viVar.f29104h0 = null;
                    return;
                }
                return;
            case 12:
                ((ei.q4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 13:
                org.telegram.ui.Components.gl glVar = ((org.telegram.ui.Components.dl) obj3).f23606b;
                glVar.f24411x0.b(((org.telegram.ui.Components.fl) obj2).f24134c, glVar.f24413y0, true, 0, ((Long) obj).longValue());
                glVar.f26655b.dismiss(true);
                return;
            case 14:
                org.telegram.ui.Components.qv qvVar = (org.telegram.ui.Components.qv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pv(qvVar, 1));
                    return;
                }
                return;
            case 15:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.bv bvVar = (org.telegram.ui.Components.bv) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                bvVar.run();
                return;
            case 16:
                org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) obj3;
                org.telegram.ui.Components.ky kyVar = jyVar.f25558a;
                org.telegram.ui.Components.kz kzVar = kyVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.f25898c1);
                String[] strArr = kzVar.W0;
                String str2 = kyVar.v;
                ai.r5 r5Var = new ai.r5(jyVar, (String) obj2, (Runnable) obj, 28);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(kzVar.f25898c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, r5Var, null, z10, false, true, 25);
                return;
            case 17:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ky kyVar2 = ((org.telegram.ui.Components.jy) obj3).f25558a;
                if (ConnectionsManager.getInstance(kyVar2.F.f25898c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.ky.E(kyVar2, runnable, arrayList2, false);
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(dzVar.f23673w.Q.f25898c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        dzVar.f23670n.add(new org.telegram.ui.Components.dy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 19:
                org.telegram.ui.Components.c10 c10Var = (org.telegram.ui.Components.c10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (c10Var.f23099a0 == null && !(c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.pc M = org.telegram.ui.Components.xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, c10Var.f23104f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f27252j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var);
                int i14 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, c10Var.f23104f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", c10Var.f23106h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.pc M2 = a02.M(replaceTags, formatPluralString, i14);
                M2.f27252j = 5000;
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
                org.telegram.ui.Components.rr0 rr0Var = (org.telegram.ui.Components.rr0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.td(2, U)), true)).k(true);
                    }
                    rr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.Components.jv0.j((org.telegram.ui.Components.jv0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                return;
            case 23:
                st stVar = (st) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l12 = (Long) obj;
                stVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                stVar.p();
                return;
            case 24:
                ot otVar = (ot) obj3;
                Boolean bool = (Boolean) obj;
                otVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    otVar.f36366a.p();
                    return;
                }
                return;
            case 25:
                uy uyVar = (uy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    uyVar.showDialog(new ik0(activity, !org.telegram.ui.Components.le0.c(), new hw(activity, 0)));
                    return;
                }
                return;
            case 26:
                zp0 zp0Var = (zp0) obj2;
                Integer num = (Integer) obj;
                f10 f10Var = ((c10) obj3).e;
                if (!f10Var.getUserConfig().isPremium()) {
                    f10Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) f10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                f10Var.E = intValue;
                zp0Var.a(intValue, true);
                t00 t00Var = f10Var.I;
                if (t00Var != null) {
                    if (!f10Var.getUserConfig().isPremium()) {
                        i11 = -1;
                    } else {
                        i11 = f10Var.E;
                    }
                    t00Var.d(i11, true);
                }
                f10Var.i0(true);
                return;
            case 27:
                r50 r50Var = (r50) obj3;
                s50 s50Var = (s50) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (s50Var != null) {
                    r50Var.getClass();
                    s50Var.setVisibility(0);
                }
                r50Var.f37048c = bitmap2;
                Paint paint = new Paint(1);
                r50Var.d = paint;
                Bitmap bitmap3 = r50Var.f37048c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                r50Var.e = bitmapShader;
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
                r50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 28:
                hc0 hc0Var = (hc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                hc0Var.a();
                if (user != null) {
                    long j10 = userArr[0].f18475id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f18475id);
                    hc0Var.n(new gc0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            default:
                uj0 uj0Var = (uj0) obj3;
                String str3 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = uj0Var.f38119f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f18475id)) && uj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f18475id));
                        }
                    }
                }
                Boolean bool2 = uj0Var.f38130r0;
                if (bool2 != null && bool2.booleanValue()) {
                    pj0 pj0Var = new pj0(0, uj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str3 != null && !str3.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f18374q = str3;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new bj1(3, messagesController2, pj0Var));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.q1(pj0Var, 6));
                    }
                    uj0Var.m0 = i13;
                    return;
                }
                uj0Var.U(true, true);
                return;
        }
    }

    public of(org.telegram.ui.Components.vi viVar, zn znVar) {
        this.f36296a = 11;
        this.f36298c = viVar;
        this.f36297b = znVar;
    }
}
