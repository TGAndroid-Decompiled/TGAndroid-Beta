package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
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

public final class df implements Utilities.Callback {

    public final int f37386a;

    public final Object f37387b;

    public final Object f37388c;

    public df(int i10, Object obj, Object obj2) {
        this.f37386a = i10;
        this.f37387b = obj;
        this.f37388c = obj2;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.f37386a;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.f37388c;
        Object obj3 = this.f37387b;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = rnVar.getMessagesController().getInputPeer(rnVar.P5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((qf.p1) obj2).f46418a;
                rnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ck ckVar = rnVar.U;
                if (ckVar != null) {
                    ckVar.setFieldText(null);
                }
                break;
            case 1:
                rn rnVar2 = (rn) obj3;
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of((String) obj2, rnVar2.P5, rnVar2.f42095j5, rnVar2.T3, null, false, null, null, null, true, 0, 0, null, false);
                sendMessageParamsOf.sendMessageChatArguments = rnVar2.C8();
                sendMessageParamsOf.payStars = ((Long) obj).longValue();
                sendMessageParamsOf.monoForumPeer = rnVar2.N8();
                sendMessageParamsOf.suggestionParams = rnVar2.f42006c5;
                rnVar2.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                rnVar2.U.setFieldText("");
                rnVar2.e9(false);
                break;
            case 2:
                rn rnVar3 = (rn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (rnVar3.N3 != 1) {
                    rnVar3.cb(botInlineResult, true, 0, l10.longValue());
                } else {
                    org.telegram.ui.Components.y4.M(rnVar3.getParentActivity(), rnVar3.P5, new b7(rnVar3, botInlineResult, l10, i11), rnVar3.f41983aa);
                }
                break;
            case 3:
                rn.q1((rn) obj3, (c31[]) obj2, (org.telegram.ui.Components.b70) obj);
                break;
            case 4:
                rn rnVar4 = (rn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new ch.i(rnVar4.getParentActivity(), rnVar4.f41983aa, tL_statsPollStats).show();
                    } else {
                        org.telegram.messenger.y1.q(R.string.PollStatsWillLater, org.telegram.ui.Components.mc.a0(rnVar4), R.raw.timer_toast, 24);
                    }
                }
                break;
            case 5:
                rn rnVar5 = (rn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                rnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    rnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 6:
                qf.p1 p1Var = (qf.p1) obj2;
                String str = (String) obj;
                rn rnVar6 = ((dj) obj3).f37415b;
                if (p1Var != null) {
                    qf.q1.f(((org.telegram.ui.ActionBar.n2) rnVar6).currentAccount).k(p1Var.f46418a, str);
                }
                rnVar6.M3 = str;
                rnVar6.W0.setTitle(str);
                break;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                rn rnVar7 = ((dn) obj3).f37446a;
                if (rnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), rnVar7.P5, rnVar7.f42095j5, rnVar7.T3, null, false, null, null, null, true, 0, 0, null, false);
                    sendMessageParamsOf2.sendMessageChatArguments = rnVar7.C8();
                    sendMessageParamsOf2.dice_stake = l11.longValue();
                    rnVar7.getSendMessagesHelper().sendMessage(sendMessageParamsOf2);
                }
                break;
            case 8:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                rn rnVar8 = ((dn) obj3).f37446a;
                if (!((Boolean) obj).booleanValue()) {
                    if (s1Var.getMessageObject() != null) {
                        s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    s1Var.g4();
                } else {
                    while (i12 < rnVar8.f42213t0.getChildCount()) {
                        View childAt = rnVar8.f42213t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.g4();
                            }
                        }
                        i12++;
                    }
                }
                break;
            case 9:
                dn dnVar = (dn) obj3;
                df dfVar = (df) obj2;
                rn rnVar9 = dnVar.f37446a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.mc.a0(rnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                } else {
                    rnVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.mc.a0(rnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new om(dnVar, 8)), true)).k(true);
                    dfVar.run(Boolean.TRUE);
                }
                break;
            case 10:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((dn) obj3).f37446a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f22401id, (String) obj);
                break;
            case 11:
                un unVar = (un) obj3;
                unVar.f43258f.t(((mf.a) obj).f18037b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = unVar.f43255b;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 12:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.af) obj3).f26736a;
                SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of((String) obj2, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                rn rnVar10 = chatActivityEnterView.K2;
                sendMessageParamsOf3.sendMessageChatArguments = rnVar10 != null ? rnVar10.C8() : null;
                sendMessageParamsOf3.effect_id = chatActivityEnterView.N4;
                sendMessageParamsOf3.payStars = l12.longValue();
                sendMessageParamsOf3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                sendMessageParamsOf3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(sendMessageParamsOf3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f26122i0.c();
                org.telegram.ui.Components.ke keVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                keVar.setEffect(0L);
                break;
            case 13:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) obj2;
                ((rn) obj3).f42006c5 = (MessageSuggestionParams) obj;
                boolean zG1 = giVar.G1(0, true, 0, giVar.s1(), giVar.J0);
                org.telegram.ui.Components.ye yeVar = giVar.f28642d0;
                if (yeVar != null) {
                    yeVar.h(!zG1);
                    giVar.f28642d0 = null;
                }
                break;
            case 14:
                ((nh.e4) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                break;
            case 15:
                org.telegram.ui.Components.tk tkVar = ((org.telegram.ui.Components.qk) obj3).f31920b;
                tkVar.f32819t0.d(((org.telegram.ui.Components.sk) obj2).f32479c, tkVar.f32820u0, true, 0, ((Long) obj).longValue());
                tkVar.f34900b.dismiss(true);
                break;
            case 16:
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yu(zuVar, i13));
                    break;
                }
                break;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.xq xqVar = (org.telegram.ui.Components.xq) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                xqVar.run();
                break;
            case 18:
                org.telegram.ui.Components.vx vxVar = (org.telegram.ui.Components.vx) obj3;
                org.telegram.ui.Components.wx wxVar = vxVar.f34062a;
                org.telegram.ui.Components.yy yyVar = wxVar.B;
                MediaDataController.getInstance(yyVar.Y0).getEmojiSuggestions(yyVar.S0, wxVar.v, false, new ag.l0(vxVar, (String) obj2, (Runnable) obj, 27), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(yyVar.Y0).isPremium(), false, true, 25);
                break;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.wx wxVar2 = ((org.telegram.ui.Components.vx) obj3).f34062a;
                if (ConnectionsManager.getInstance(wxVar2.B.Y0).getConnectionState() == 3) {
                    org.telegram.ui.Components.wx.E(wxVar2, runnable, arrayList2, false);
                } else {
                    runnable.run();
                }
                break;
            case 20:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ryVar.f32277w.M.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ryVar.f32274n.add(new org.telegram.ui.Components.px(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 21:
                org.telegram.ui.Components.q00 q00Var = (org.telegram.ui.Components.q00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (q00Var.W == null && !(q00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.ec ecVarM = org.telegram.ui.Components.mc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, q00Var.f31723b0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    ecVarM.f28020j = 5000;
                    ecVarM.j();
                } else {
                    org.telegram.ui.Components.ec ecVarM2 = org.telegram.ui.Components.mc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, q00Var.f31723b0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", q00Var.f31725d0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    ecVarM2.f28020j = 5000;
                    ecVarM2.j();
                }
                break;
            case 22:
                View view2 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmapCreateBitmap = (Bitmap) obj;
                if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    int iClamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmapCreateBitmap.getWidth()), bitmapCreateBitmap.getWidth(), 0);
                    int iClamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmapCreateBitmap.getHeight()), bitmapCreateBitmap.getHeight(), 0);
                    int iClamp3 = Utilities.clamp((int) ((view2.getWidth() / AndroidUtilities.displaySize.x) * bitmapCreateBitmap.getWidth()), bitmapCreateBitmap.getWidth() - iClamp, 0);
                    int iClamp4 = Utilities.clamp((int) ((view2.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmapCreateBitmap.getHeight()), bitmapCreateBitmap.getHeight() - iClamp2, 0);
                    if ((iClamp != 0 || iClamp2 != 0 || iClamp3 != bitmapCreateBitmap.getWidth() || iClamp4 != bitmapCreateBitmap.getHeight()) && iClamp3 > 0 && iClamp4 > 0) {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, iClamp, iClamp2, iClamp3, iClamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.04f : -0.07f);
                Bitmap bitmapApplyColorMatrix = AndroidUtilities.applyColorMatrix(bitmapCreateBitmap, colorMatrix);
                bitmapApplyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.g6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.2f : -0.07f);
                Bitmap bitmapApplyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmapCreateBitmap, colorMatrix2);
                bitmapApplyColorMatrix2.setHasAlpha(false);
                bitmapCreateBitmap.recycle();
                dVar.run(bitmapApplyColorMatrix, bitmapApplyColorMatrix2);
                break;
            case 23:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.pq0 pq0Var = (org.telegram.ui.Components.pq0) obj2;
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (n2VarU != null) {
                        org.telegram.ui.Components.mc.a0(n2VarU).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.fd(i11, n2VarU)), true)).k(true);
                    }
                    pq0Var.run(Boolean.TRUE);
                } else if (n2VarU != null) {
                    org.telegram.ui.Components.mc.a0(n2VarU).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                }
                break;
            case 24:
                org.telegram.ui.Components.hu0.j((org.telegram.ui.Components.hu0) obj3, (TL_stories.StoryItem) obj2, (jh.k6) obj);
                break;
            case 25:
                kt ktVar = (kt) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l13 = (Long) obj;
                ktVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                ktVar.p();
                break;
            case 26:
                ft ftVar = (ft) obj3;
                Boolean bool = (Boolean) obj;
                ftVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ftVar.f38203a.p();
                }
                break;
            case 27:
                gy gyVar = (gy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    gyVar.showDialog(new rj0(activity, !org.telegram.ui.Components.pd0.c(), new vv(activity, 0)));
                }
                break;
            case 28:
                yo0 yo0Var = (yo0) obj2;
                Integer num = (Integer) obj;
                q00 q00Var2 = ((n00) obj3).f40618e;
                if (!q00Var2.getUserConfig().isPremium()) {
                    q00Var2.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) q00Var2, 35, true));
                } else {
                    int iIntValue = num.intValue();
                    q00Var2.A = iIntValue;
                    yo0Var.a(iIntValue, true);
                    e00 e00Var = q00Var2.E;
                    if (e00Var != null) {
                        e00Var.d(!q00Var2.getUserConfig().isPremium() ? -1 : q00Var2.A, true);
                    }
                    q00Var2.i0(true);
                }
                break;
            default:
                b50 b50Var = (b50) obj3;
                ag.s0 s0Var = (ag.s0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (s0Var != null) {
                    b50Var.getClass();
                    s0Var.setVisibility(0);
                }
                b50Var.f36701c = bitmap;
                Paint paint = new Paint(1);
                b50Var.d = paint;
                Bitmap bitmap2 = b50Var.f36701c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                b50Var.f36702e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                b50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
        }
    }

    public df(org.telegram.ui.Components.gi giVar, rn rnVar) {
        this.f37386a = 13;
        this.f37388c = giVar;
        this.f37387b = rnVar;
    }
}
