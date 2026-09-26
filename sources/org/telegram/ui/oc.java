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
    public final int f36133a;
    public final Object f36134b;
    public final Object f36135c;

    public oc(int i10, Object obj, Object obj2) {
        this.f36133a = i10;
        this.f36134b = obj;
        this.f36135c = obj2;
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
        int i11 = this.f36133a;
        SendMessageChatArguments sendMessageChatArguments = null;
        TLRPC.User user = null;
        int i12 = 0;
        boolean z11 = false;
        Object obj2 = this.f36135c;
        Object obj3 = this.f36134b;
        switch (i11) {
            case 0:
                rc rcVar = (rc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, rcVar.f37293a));
                    rcVar.f37294b.getClass();
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
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((je) obj3).f34772w0.showDialog(j0Var);
                return;
            case 2:
                wn wnVar = (wn) obj3;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wnVar.getMessagesController().getInputPeer(wnVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).f10205a;
                wnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar = wnVar.Y;
                if (jkVar != null) {
                    jkVar.setFieldText(null);
                    return;
                }
                return;
            case 3:
                wn wnVar2 = (wn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, wnVar2.T5, wnVar2.f39573n5, wnVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = wnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = wnVar2.N8();
                of2.suggestionParams = wnVar2.f39488g5;
                wnVar2.getSendMessagesHelper().sendMessage(of2);
                wnVar2.Y.setFieldText("");
                wnVar2.e9(false);
                return;
            case 4:
                wn wnVar3 = (wn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (wnVar3.R3 == 1) {
                    org.telegram.ui.Components.e5.M(wnVar3.getParentActivity(), wnVar3.T5, new b7(wnVar3, botInlineResult, l10, 2), wnVar3.f39468ea);
                    return;
                } else {
                    wnVar3.cb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 5:
                wn.A0((wn) obj3, (z31[]) obj2, (org.telegram.ui.Components.z70) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((wn) obj3).f39517ib = true;
                ((org.telegram.ui.ActionBar.a6) obj2).run();
                return;
            case 7:
                wn wnVar4 = (wn) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.f0.p(R.string.PollStatsWillLater, org.telegram.ui.Components.xc.a0(wnVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(wnVar4.getParentActivity(), wnVar4.f39468ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 8:
                wn wnVar5 = (wn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                wnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    wnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                wn wnVar6 = ((kj) obj3).f35076b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.f10205a, str);
                }
                wnVar6.Q3 = str;
                wnVar6.f39408a1.setTitle(str);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                wn wnVar7 = ((in) obj3).f34556a;
                if (wnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), wnVar7.T5, wnVar7.f39573n5, wnVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = wnVar7.C8();
                    of3.dice_stake = l11.longValue();
                    wnVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                wn wnVar8 = ((in) obj3).f34556a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i13 = 0; i13 < wnVar8.f39694x0.getChildCount(); i13++) {
                        View childAt = wnVar8.f39694x0.getChildAt(i13);
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
                in inVar = (in) obj3;
                oc ocVar = (oc) obj2;
                wn wnVar9 = inVar.f34556a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.xc.a0(wnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                wnVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.xc.a0(wnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new tm(inVar, 8)), true)).k(true);
                ocVar.run(Boolean.TRUE);
                return;
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((in) obj3).f34556a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f18356id, (String) obj);
                return;
            case 14:
                zn znVar = (zn) obj3;
                znVar.f40543f.t(((dg.a) obj).f7709b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = znVar.f40541b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.pf) obj3).f27345a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                wn wnVar10 = chatActivityEnterView.P2;
                if (wnVar10 != null) {
                    sendMessageChatArguments = wnVar10.C8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                yeVar.setEffect(0L);
                return;
            case 16:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) obj3;
                org.telegram.ui.Components.pi piVar = (org.telegram.ui.Components.pi) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = wiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i14).getInputUser(piVar.f27394c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, wiVar, piVar), 66);
                return;
            case 17:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) obj3;
                ((wn) obj2).f39488g5 = (MessageSuggestionParams) obj;
                boolean G1 = wiVar2.G1(0, true, 0, wiVar2.s1(), wiVar2.N0);
                org.telegram.ui.Components.nf nfVar = wiVar2.f30026h0;
                if (nfVar != null) {
                    nfVar.h(!G1);
                    wiVar2.f30026h0 = null;
                    return;
                }
                return;
            case 18:
                ((ei.q4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 19:
                org.telegram.ui.Components.ij ijVar = (org.telegram.ui.Components.ij) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l13 = (Long) obj;
                ijVar.f25105i0 = false;
                if (l13 != null) {
                    user = messagesController.getUser(l13);
                }
                ijVar.f25104h0 = user;
                if (user == null) {
                    z11 = true;
                }
                ijVar.f25106j0 = z11;
                if (user != null) {
                    ijVar.O();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.il ilVar = ((org.telegram.ui.Components.fl) obj3).f24291b;
                ilVar.f25147x0.b(((org.telegram.ui.Components.hl) obj2).f24816c, ilVar.f25149y0, true, 0, ((Long) obj).longValue());
                ilVar.f27043b.dismiss(true);
                return;
            case 21:
                org.telegram.ui.Components.rv rvVar = (org.telegram.ui.Components.rv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qv(rvVar, 1));
                    return;
                }
                return;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.ww wwVar = (org.telegram.ui.Components.ww) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                wwVar.run();
                return;
            case 23:
                org.telegram.ui.Components.ly lyVar = (org.telegram.ui.Components.ly) obj3;
                org.telegram.ui.Components.my myVar = lyVar.f26196a;
                org.telegram.ui.Components.mz mzVar = myVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.f26548c1);
                String[] strArr = mzVar.W0;
                String str2 = myVar.v;
                ai.q5 q5Var = new ai.q5(lyVar, (String) obj2, (Runnable) obj, 28);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(mzVar.f26548c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, q5Var, null, z10, false, true, 25);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.my myVar2 = ((org.telegram.ui.Components.ly) obj3).f26196a;
                if (ConnectionsManager.getInstance(myVar2.F.f26548c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.my.E(myVar2, runnable, arrayList2, false);
                    return;
                }
            case 25:
                org.telegram.ui.Components.fz fzVar = (org.telegram.ui.Components.fz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(fzVar.f24342w.Q.f26548c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fzVar.f24339n.add(new org.telegram.ui.Components.fy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 26:
                org.telegram.ui.Components.e10 e10Var = (org.telegram.ui.Components.e10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (e10Var.f23806a0 == null && !(e10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, e10Var.f23811f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f27635j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(m2Var);
                int i15 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, e10Var.f23811f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", e10Var.f23813h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.qc M2 = a02.M(replaceTags, formatPluralString, i15);
                M2.f27635j = 5000;
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
                org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.ud(2, U)), true)).k(true);
                    }
                    sr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.kv0.j((org.telegram.ui.Components.kv0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                return;
        }
    }
}
