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
public final class qc implements Utilities.Callback {
    public final int f36706a;
    public final Object f36707b;
    public final Object f36708c;

    public qc(int i10, Object obj, Object obj2) {
        this.f36706a = i10;
        this.f36707b = obj;
        this.f36708c = obj2;
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
        int i11 = this.f36706a;
        SendMessageChatArguments sendMessageChatArguments = null;
        TLRPC.User user = null;
        int i12 = 0;
        boolean z11 = false;
        Object obj2 = this.f36708c;
        Object obj3 = this.f36707b;
        switch (i11) {
            case 0:
                tc tcVar = (tc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                tcVar.getClass();
                if (view instanceof sc) {
                    sc scVar = (sc) view;
                    scVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, tcVar.f37751a));
                    tcVar.f37752b.getClass();
                    int S = RecyclerView.S(view);
                    if (peerColors != null && S >= 0 && S < peerColors.colors.size()) {
                        scVar.a(peerColors.colors.get(S));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.j0 j0Var = (rg.j0) obj2;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((me) obj3).f35662w0.showDialog(j0Var);
                return;
            case 2:
                xn xnVar = (xn) obj3;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = xnVar.getMessagesController().getInputPeer(xnVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.a2) obj2).f10210a;
                xnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                lk lkVar = xnVar.Y;
                if (lkVar != null) {
                    lkVar.setFieldText(null);
                    return;
                }
                return;
            case 3:
                xn xnVar2 = (xn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, xnVar2.T5, xnVar2.f39856n5, xnVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = xnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = xnVar2.N8();
                of2.suggestionParams = xnVar2.f39770g5;
                xnVar2.getSendMessagesHelper().sendMessage(of2);
                xnVar2.Y.setFieldText("");
                xnVar2.e9(false);
                return;
            case 4:
                xn xnVar3 = (xn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (xnVar3.R3 == 1) {
                    org.telegram.ui.Components.e5.M(xnVar3.getParentActivity(), xnVar3.T5, new d7(xnVar3, botInlineResult, l10, 2), xnVar3.f39750ea);
                    return;
                } else {
                    xnVar3.cb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 5:
                xn.A0((xn) obj3, (b41[]) obj2, (org.telegram.ui.Components.a80) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((xn) obj3).f39800ib = true;
                ((n) obj2).run();
                return;
            case 7:
                xn xnVar4 = (xn) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.l0.o(R.string.PollStatsWillLater, org.telegram.ui.Components.xc.a0(xnVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(xnVar4.getParentActivity(), xnVar4.f39750ea, tL_statsPollStats).show();
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
                hg.a2 a2Var = (hg.a2) obj2;
                String str = (String) obj;
                xn xnVar6 = ((mj) obj3).f35714b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) xnVar6).currentAccount;
                    hg.b2.f(i10).k(a2Var.f10210a, str);
                }
                xnVar6.Q3 = str;
                xnVar6.f39690a1.setTitle(str);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                xn xnVar7 = ((jn) obj3).f34766a;
                if (xnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), xnVar7.T5, xnVar7.f39856n5, xnVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = xnVar7.C8();
                    of3.dice_stake = l11.longValue();
                    xnVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                xn xnVar8 = ((jn) obj3).f34766a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i13 = 0; i13 < xnVar8.f39977x0.getChildCount(); i13++) {
                        View childAt = xnVar8.f39977x0.getChildAt(i13);
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
                jn jnVar = (jn) obj3;
                qc qcVar = (qc) obj2;
                xn xnVar9 = jnVar.f34766a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.xc.a0(xnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                xnVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.xc.a0(xnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new um(jnVar, 8)), true)).k(true);
                qcVar.run(Boolean.TRUE);
                return;
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((jn) obj3).f34766a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f18350id, (String) obj);
                return;
            case 14:
                ao aoVar = (ao) obj3;
                aoVar.f32113f.t(((dg.a) obj).f7711b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = aoVar.f32111b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.pf) obj3).f27363a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                xn xnVar10 = chatActivityEnterView.P2;
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
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i14).getInputUser(piVar.f27377c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new mo(6, wiVar, piVar), 66);
                return;
            case 17:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) obj3;
                ((xn) obj2).f39770g5 = (MessageSuggestionParams) obj;
                boolean D1 = wiVar2.D1(0, true, 0, wiVar2.p1(), wiVar2.N0);
                org.telegram.ui.Components.nf nfVar = wiVar2.f29968h0;
                if (nfVar != null) {
                    nfVar.h(!D1);
                    wiVar2.f29968h0 = null;
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
                ijVar.f25155i0 = false;
                if (l13 != null) {
                    user = messagesController.getUser(l13);
                }
                ijVar.f25154h0 = user;
                if (user == null) {
                    z11 = true;
                }
                ijVar.f25156j0 = z11;
                if (user != null) {
                    ijVar.O();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.il ilVar = ((org.telegram.ui.Components.fl) obj3).f24307b;
                ilVar.f25195x0.b(((org.telegram.ui.Components.hl) obj2).f24861c, ilVar.f25197y0, true, 0, ((Long) obj).longValue());
                ilVar.f27104b.dismiss(true);
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
                org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                jyVar.run();
                return;
            case 23:
                org.telegram.ui.Components.ly lyVar = (org.telegram.ui.Components.ly) obj3;
                org.telegram.ui.Components.my myVar = lyVar.f26231a;
                org.telegram.ui.Components.mz mzVar = myVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.f26574c1);
                String[] strArr = mzVar.W0;
                String str2 = myVar.v;
                ai.q5 q5Var = new ai.q5(lyVar, (String) obj2, (Runnable) obj, 28);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(mzVar.f26574c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, q5Var, null, z10, false, true, 25);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.my myVar2 = ((org.telegram.ui.Components.ly) obj3).f26231a;
                if (ConnectionsManager.getInstance(myVar2.F.f26574c1).getConnectionState() != 3) {
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(fzVar.f24403w.Q.f26574c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fzVar.f24400n.add(new org.telegram.ui.Components.ey(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 26:
                org.telegram.ui.Components.e10 e10Var = (org.telegram.ui.Components.e10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (e10Var.f23814a0 == null && !(e10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, e10Var.f23819f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f27691j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(o2Var);
                int i15 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, e10Var.f23819f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", e10Var.f23821h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.qc M2 = a02.M(replaceTags, formatPluralString, i15);
                M2.f27691j = 5000;
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
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f12 = -0.07f;
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
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
                org.telegram.ui.Components.tr0 tr0Var = (org.telegram.ui.Components.tr0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.td(2, U)), true)).k(true);
                    }
                    tr0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.lv0.j((org.telegram.ui.Components.lv0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                return;
        }
    }
}
