package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
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
public final class oc implements Utilities.Callback {
    public final int f40506a;
    public final Object f40507b;
    public final Object f40508c;

    public oc(int i10, Object obj, Object obj2) {
        this.f40506a = i10;
        this.f40507b = obj;
        this.f40508c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        MessageObject threadMessage;
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f7;
        float f10;
        float f11;
        int[] iArr;
        int i11 = this.f40506a;
        SendMessageChatArguments sendMessageChatArguments = null;
        TLRPC.User user = null;
        int i12 = 0;
        boolean z11 = false;
        Object obj2 = this.f40508c;
        Object obj3 = this.f40507b;
        switch (i11) {
            case 0:
                rc rcVar = (rc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, rcVar.f41408a));
                    rcVar.f41409b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.j0 j0Var = (rg.j0) obj2;
                j0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ((je) obj3).f39016w0.showDialog(j0Var);
                return;
            case 2:
                zn znVar = (zn) obj3;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = znVar.getMessagesController().getInputPeer(znVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).f11173a;
                znVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ok okVar = znVar.Y;
                if (okVar != null) {
                    okVar.setFieldText(null);
                    return;
                }
                return;
            case 3:
                zn znVar2 = (zn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, znVar2.T5, znVar2.f44867n5, znVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = znVar2.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = znVar2.S8();
                of2.suggestionParams = znVar2.f44782g5;
                znVar2.getSendMessagesHelper().sendMessage(of2);
                znVar2.Y.setFieldText("");
                znVar2.j9(false);
                return;
            case 4:
                zn znVar3 = (zn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (znVar3.R3 == 1) {
                    org.telegram.ui.Components.g5.L(znVar3.getParentActivity(), znVar3.T5, new z6(znVar3, botInlineResult, l10, 2), znVar3.f44762ea);
                    return;
                } else {
                    znVar3.gb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 5:
                zn.k1((zn) obj3, (g41[]) obj2, (org.telegram.ui.Components.q80) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((zn) obj3).f44823jb = true;
                ((org.telegram.ui.ActionBar.a6) obj2).run();
                return;
            case 7:
                zn znVar4 = (zn) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.q.q(R.string.PollStatsWillLater, org.telegram.ui.Components.ad.a0(znVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(znVar4.getParentActivity(), znVar4.f44762ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 8:
                zn znVar5 = (zn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                znVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    znVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                zn znVar6 = ((oj) obj3).f40556b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) znVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.f11173a, str);
                }
                znVar6.Q3 = str;
                znVar6.f44701a1.setTitle(str);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                zn znVar7 = ((ln) obj3).f39701a;
                if (znVar7.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), znVar7.T5, znVar7.f44867n5, znVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = znVar7.H8();
                    of3.dice_stake = l11.longValue();
                    znVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                zn znVar8 = ((ln) obj3).f39701a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i13 = 0; i13 < znVar8.f44989x0.getChildCount(); i13++) {
                        View childAt = znVar8.f44989x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                    }
                    return;
                }
                if (u1Var.getMessageObject() != null) {
                    u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                u1Var.h4();
                return;
            case 12:
                ln lnVar = (ln) obj3;
                oc ocVar = (oc) obj2;
                zn znVar9 = lnVar.f39701a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.ad.a0(znVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                znVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.ad.a0(znVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new wm(lnVar, 8)), true)).k(true);
                ocVar.run(Boolean.TRUE);
                return;
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((ln) obj3).f39701a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f20053id, (String) obj);
                return;
            case 14:
                co coVar = (co) obj3;
                coVar.f36793f.t(((dg.a) obj).f8349b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = coVar.f36790b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.rf) obj3).f30451a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zn znVar10 = chatActivityEnterView.P2;
                if (znVar10 != null) {
                    sendMessageChatArguments = znVar10.H8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.af afVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                afVar.setEffect(0L);
                return;
            case 16:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) obj3;
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = yiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i14).getInputUser(riVar.f30461c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new oo(5, yiVar, riVar), 66);
                return;
            case 17:
                org.telegram.ui.Components.yi yiVar2 = (org.telegram.ui.Components.yi) obj3;
                ((zn) obj2).f44782g5 = (MessageSuggestionParams) obj;
                boolean J1 = yiVar2.J1(0, true, 0, yiVar2.u1(), yiVar2.Q0);
                org.telegram.ui.Components.pf pfVar = yiVar2.f33222h0;
                if (pfVar != null) {
                    pfVar.h(!J1);
                    yiVar2.f33222h0 = null;
                    return;
                }
                return;
            case 18:
                ((ei.p4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                return;
            case 19:
                org.telegram.ui.Components.kj kjVar = (org.telegram.ui.Components.kj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l13 = (Long) obj;
                kjVar.f28008i0 = false;
                if (l13 != null) {
                    user = messagesController.getUser(l13);
                }
                kjVar.f28007h0 = user;
                if (user == null) {
                    z11 = true;
                }
                kjVar.f28009j0 = z11;
                if (user != null) {
                    kjVar.R();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.xl xlVar = ((org.telegram.ui.Components.ul) obj3).f31485b;
                xlVar.f32975x0.b(((org.telegram.ui.Components.wl) obj2).f32676c, xlVar.f32977y0, true, 0, ((Long) obj).longValue());
                xlVar.f30161b.dismiss(true);
                return;
            case 21:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fw(gwVar, 1));
                    return;
                }
                return;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.bs bsVar = (org.telegram.ui.Components.bs) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                bsVar.run();
                return;
            case 23:
                org.telegram.ui.Components.zy zyVar = (org.telegram.ui.Components.zy) obj3;
                org.telegram.ui.Components.az azVar = zyVar.f33686a;
                org.telegram.ui.Components.b00 b00Var = azVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(b00Var.f24662c1);
                String[] strArr = b00Var.W0;
                String str2 = azVar.v;
                ai.r5 r5Var = new ai.r5(zyVar, (String) obj2, (Runnable) obj, 29);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(b00Var.f24662c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, r5Var, null, z10, false, true, 25);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.az azVar2 = ((org.telegram.ui.Components.zy) obj3).f33686a;
                if (ConnectionsManager.getInstance(azVar2.F.f24662c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.az.E(azVar2, runnable, arrayList2, false);
                    return;
                }
            case 25:
                org.telegram.ui.Components.uz uzVar = (org.telegram.ui.Components.uz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(uzVar.f31619w.Q.f24662c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        uzVar.f31616n.add(new org.telegram.ui.Components.ty(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 26:
                org.telegram.ui.Components.t10 t10Var = (org.telegram.ui.Components.t10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (t10Var.f30930a0 == null && !(t10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.sc M = org.telegram.ui.Components.ad.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, t10Var.f30935f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f30711j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(m2Var);
                int i15 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, t10Var.f30935f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", t10Var.f30937h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.sc M2 = a02.M(replaceTags, formatPluralString, i15);
                M2.f30711j = 5000;
                M2.j();
                return;
            case 27:
                View view3 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view3.getWidth() > 0 && view3.getHeight() > 0) {
                    view3.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view3.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view3.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f12 = -0.07f;
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f12 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 28:
                MessagesController messagesController2 = (MessagesController) obj3;
                org.telegram.ui.Components.ms0 ms0Var = (org.telegram.ui.Components.ms0) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.ad.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.wd(2, U)), true)).k(true);
                    }
                    ms0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.ad.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.dw0.j((org.telegram.ui.Components.dw0) obj3, (TL_stories.StoryItem) obj2, (ai.f9) obj);
                return;
        }
    }
}
