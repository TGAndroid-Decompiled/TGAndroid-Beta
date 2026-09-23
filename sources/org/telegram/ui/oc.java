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
    public final int f35761a;
    public final Object f35762b;
    public final Object f35763c;

    public oc(int i10, Object obj, Object obj2) {
        this.f35761a = i10;
        this.f35762b = obj;
        this.f35763c = obj2;
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
        int i11 = this.f35761a;
        SendMessageChatArguments sendMessageChatArguments = null;
        TLRPC.User user = null;
        int i12 = 0;
        boolean z11 = false;
        Object obj2 = this.f35763c;
        Object obj3 = this.f35762b;
        switch (i11) {
            case 0:
                rc rcVar = (rc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, rcVar.f36791a));
                    rcVar.f36792b.getClass();
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
                ((je) obj3).f34437w0.showDialog(j0Var);
                return;
            case 2:
                xn xnVar = (xn) obj3;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = xnVar.getMessagesController().getInputPeer(xnVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).f10205a;
                xnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar = xnVar.Y;
                if (jkVar != null) {
                    jkVar.setFieldText(null);
                    return;
                }
                return;
            case 3:
                xn xnVar2 = (xn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, xnVar2.T5, xnVar2.f39475n5, xnVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = xnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = xnVar2.N8();
                of2.suggestionParams = xnVar2.f39390g5;
                xnVar2.getSendMessagesHelper().sendMessage(of2);
                xnVar2.Y.setFieldText("");
                xnVar2.e9(false);
                return;
            case 4:
                xn xnVar3 = (xn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (xnVar3.R3 == 1) {
                    org.telegram.ui.Components.e5.M(xnVar3.getParentActivity(), xnVar3.T5, new b7(xnVar3, botInlineResult, l10, 2), xnVar3.f39370ea);
                    return;
                } else {
                    xnVar3.cb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 5:
                xn.q1((xn) obj3, (a41[]) obj2, (org.telegram.ui.Components.o70) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((xn) obj3).f39419ib = true;
                ((m4) obj2).run();
                return;
            case 7:
                xn xnVar4 = (xn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.z0.o(R.string.PollStatsWillLater, org.telegram.ui.Components.xc.a0(xnVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(xnVar4.getParentActivity(), xnVar4.f39370ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 8:
                xn xnVar5 = (xn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                xnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    xnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                xn xnVar6 = ((kj) obj3).f34737b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) xnVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.f10205a, str);
                }
                xnVar6.Q3 = str;
                xnVar6.f39310a1.setTitle(str);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                xn xnVar7 = ((jn) obj3).f34487a;
                if (xnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), xnVar7.T5, xnVar7.f39475n5, xnVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = xnVar7.C8();
                    of3.dice_stake = l11.longValue();
                    xnVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                xn xnVar8 = ((jn) obj3).f34487a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i13 = 0; i13 < xnVar8.f39596x0.getChildCount(); i13++) {
                        View childAt = xnVar8.f39596x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                    }
                    return;
                }
                if (t1Var.getMessageObject() != null) {
                    t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                t1Var.h4();
                return;
            case 12:
                jn jnVar = (jn) obj3;
                oc ocVar = (oc) obj2;
                xn xnVar9 = jnVar.f34487a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.xc.a0(xnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                xnVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.xc.a0(xnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new um(jnVar, 8)), true)).k(true);
                ocVar.run(Boolean.TRUE);
                return;
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((jn) obj3).f34487a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f18104id, (String) obj);
                return;
            case 14:
                ao aoVar = (ao) obj3;
                aoVar.f31840f.t(((dg.a) obj).f7710b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = aoVar.f31838b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.of) obj3).f26729a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject3 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                xn xnVar10 = chatActivityEnterView.O2;
                if (xnVar10 != null) {
                    sendMessageChatArguments = xnVar10.C8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 16:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) obj3;
                org.telegram.ui.Components.pi piVar = (org.telegram.ui.Components.pi) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = wiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i14).getInputUser(piVar.f27052c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new mo(5, wiVar, piVar), 66);
                return;
            case 17:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) obj3;
                ((xn) obj2).f39390g5 = (MessageSuggestionParams) obj;
                boolean G1 = wiVar2.G1(0, true, 0, wiVar2.s1(), wiVar2.N0);
                org.telegram.ui.Components.mf mfVar = wiVar2.f29671h0;
                if (mfVar != null) {
                    mfVar.h(!G1);
                    wiVar2.f29671h0 = null;
                    return;
                }
                return;
            case 18:
                ((ei.q4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 19:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l13 = (Long) obj;
                hjVar.f24692j0 = false;
                if (l13 != null) {
                    user = messagesController.getUser(l13);
                }
                hjVar.f24691i0 = user;
                if (user == null) {
                    z11 = true;
                }
                hjVar.f24693k0 = z11;
                if (user != null) {
                    hjVar.O();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.hl hlVar = ((org.telegram.ui.Components.el) obj3).f23717b;
                hlVar.f24744x0.b(((org.telegram.ui.Components.gl) obj2).f24365c, hlVar.f24746y0, true, 0, ((Long) obj).longValue());
                hlVar.f26744b.dismiss(true);
                return;
            case 21:
                org.telegram.ui.Components.qv qvVar = (org.telegram.ui.Components.qv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pv(qvVar, 1));
                    return;
                }
                return;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.ph phVar = (org.telegram.ui.Components.ph) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                phVar.run();
                return;
            case 23:
                org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) obj3;
                org.telegram.ui.Components.ky kyVar = jyVar.f25438a;
                org.telegram.ui.Components.lz lzVar = kyVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(lzVar.f25968c1);
                String[] strArr = lzVar.W0;
                String str2 = kyVar.v;
                ai.q5 q5Var = new ai.q5(jyVar, (String) obj2, (Runnable) obj, 28);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(lzVar.f25968c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, q5Var, null, z10, false, true, 25);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ky kyVar2 = ((org.telegram.ui.Components.jy) obj3).f25438a;
                if (ConnectionsManager.getInstance(kyVar2.F.f25968c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.ky.E(kyVar2, runnable, arrayList2, false);
                    return;
                }
            case 25:
                org.telegram.ui.Components.ez ezVar = (org.telegram.ui.Components.ez) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ezVar.f23775w.Q.f25968c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ezVar.f23772n.add(new org.telegram.ui.Components.dy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 26:
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (d10Var.f23179a0 == null && !(d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, d10Var.f23184f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f27306j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var);
                int i15 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, d10Var.f23184f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", d10Var.f23186h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.qc M2 = a02.M(replaceTags, formatPluralString, i15);
                M2.f27306j = 5000;
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
                org.telegram.ui.Components.gr0 gr0Var = (org.telegram.ui.Components.gr0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.td(2, U)), true)).k(true);
                    }
                    gr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.yu0.j((org.telegram.ui.Components.yu0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                return;
        }
    }
}
