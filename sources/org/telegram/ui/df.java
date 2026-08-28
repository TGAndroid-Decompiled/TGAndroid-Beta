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
import java.util.LinkedHashSet;
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
public final class df implements Utilities.Callback {
    public final int f37524a;
    public final Object f37525b;
    public final Object f37526c;

    public df(int i9, Object obj, Object obj2) {
        this.f37524a = i9;
        this.f37525b = obj;
        this.f37526c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i9;
        MessageObject threadMessage;
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f10;
        int[] iArr;
        int i10;
        int i11 = this.f37524a;
        float f11 = -0.04f;
        float f12 = 0.25f;
        SendMessageChatArguments sendMessageChatArguments = null;
        int i12 = 0;
        Object obj2 = this.f37526c;
        Object obj3 = this.f37525b;
        switch (i11) {
            case 0:
                qn qnVar = (qn) obj3;
                Long l10 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = qnVar.getMessagesController().getInputPeer(qnVar.P5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((pf.q1) obj2).f45756a;
                qnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ak akVar = qnVar.U;
                if (akVar != null) {
                    akVar.setFieldText(null);
                    return;
                }
                return;
            case 1:
                qn qnVar2 = (qn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, qnVar2.P5, qnVar2.f41959j5, qnVar2.T3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = qnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = qnVar2.N8();
                of2.suggestionParams = qnVar2.f41870c5;
                qnVar2.getSendMessagesHelper().sendMessage(of2);
                qnVar2.U.setFieldText("");
                qnVar2.e9(false);
                return;
            case 2:
                qn qnVar3 = (qn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (qnVar3.N3 == 1) {
                    org.telegram.ui.Components.y4.M(qnVar3.getParentActivity(), qnVar3.P5, new a7(qnVar3, botInlineResult, l11, 2), qnVar3.f41848aa);
                    return;
                } else {
                    qnVar3.cb(botInlineResult, true, 0, l11.longValue());
                    return;
                }
            case 3:
                qn.q1((qn) obj3, (d31[]) obj2, (org.telegram.ui.Components.x60) obj);
                return;
            case 4:
                qn qnVar4 = (qn) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.l0.p(R.string.PollStatsWillLater, org.telegram.ui.Components.oc.a0(qnVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new bh.k(qnVar4.getParentActivity(), qnVar4.f41848aa, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 5:
                qn qnVar5 = (qn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                qnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    qnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 6:
                pf.q1 q1Var = (pf.q1) obj2;
                String str = (String) obj;
                qn qnVar6 = ((bj) obj3).f36877b;
                if (q1Var != null) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar6).currentAccount;
                    pf.r1.f(i9).k(q1Var.f45756a, str);
                }
                qnVar6.M3 = str;
                qnVar6.W0.setTitle(str);
                return;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l12 = (Long) obj;
                qn qnVar7 = ((cn) obj3).f37236a;
                if (qnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), qnVar7.P5, qnVar7.f41959j5, qnVar7.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = qnVar7.C8();
                    of3.dice_stake = l12.longValue();
                    qnVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                qn qnVar8 = ((cn) obj3).f37236a;
                if (((Boolean) obj).booleanValue()) {
                    while (i12 < qnVar8.f42077t0.getChildCount()) {
                        View childAt = qnVar8.f42077t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                        i12++;
                    }
                    return;
                }
                if (t1Var.getMessageObject() != null) {
                    t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                t1Var.h4();
                return;
            case 9:
                cn cnVar = (cn) obj3;
                df dfVar = (df) obj2;
                qn qnVar9 = cnVar.f37236a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.oc.a0(qnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                qnVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.oc.a0(qnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new nm(cnVar, 8)), true)).k(true);
                dfVar.run(Boolean.TRUE);
                return;
            case 10:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((cn) obj3).f37236a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f22401id, (String) obj);
                return;
            case 11:
                tn tnVar = (tn) obj3;
                tnVar.f43038f.t(((lf.a) obj).f16853b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = tnVar.f43035b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 12:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.ef) obj3).f28011a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject3 = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                qn qnVar10 = chatActivityEnterView.K2;
                if (qnVar10 != null) {
                    sendMessageChatArguments = qnVar10.C8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.N4;
                of4.payStars = l13.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f26126i0.c();
                org.telegram.ui.Components.oe oeVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 13:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) obj2;
                ((qn) obj3).f41870c5 = (MessageSuggestionParams) obj;
                boolean G1 = kiVar.G1(0, true, 0, kiVar.s1(), kiVar.J0);
                org.telegram.ui.Components.cf cfVar = kiVar.f30106d0;
                if (cfVar != null) {
                    cfVar.h(!G1);
                    kiVar.f30106d0 = null;
                    return;
                }
                return;
            case 14:
                ((mh.g4) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                return;
            case 15:
                org.telegram.ui.Components.xk xkVar = ((org.telegram.ui.Components.uk) obj3).f33085b;
                xkVar.f34709t0.d(((org.telegram.ui.Components.wk) obj2).f34238c, xkVar.f34710u0, true, 0, ((Long) obj).longValue());
                xkVar.f27493b.dismiss(true);
                return;
            case 16:
                org.telegram.ui.Components.av avVar = (org.telegram.ui.Components.av) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zu(avVar, 1));
                    return;
                }
                return;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.zq zqVar = (org.telegram.ui.Components.zq) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                zqVar.run();
                return;
            case 18:
                org.telegram.ui.Components.ux uxVar = (org.telegram.ui.Components.ux) obj3;
                org.telegram.ui.Components.vx vxVar = uxVar.f33157a;
                org.telegram.ui.Components.wy wyVar = vxVar.B;
                MediaDataController mediaDataController = MediaDataController.getInstance(wyVar.Y0);
                String[] strArr = wyVar.S0;
                String str2 = vxVar.v;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(27, uxVar, (Runnable) obj, (String) obj2);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(wyVar.Y0).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, z10, false, true, 25);
                return;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.vx vxVar2 = ((org.telegram.ui.Components.ux) obj3).f33157a;
                if (ConnectionsManager.getInstance(vxVar2.B.Y0).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.vx.E(vxVar2, runnable, arrayList2, false);
                    return;
                }
            case 20:
                org.telegram.ui.Components.py pyVar = (org.telegram.ui.Components.py) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(pyVar.f31778w.M.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pyVar.f31775n.add(new org.telegram.ui.Components.ox(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 21:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (n00Var.W == null && !(n00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, n00Var.f30959b0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f28737j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(o2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, n00Var.f30959b0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", n00Var.f30961d0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.gc M2 = a02.M(replaceTags, formatPluralString, i13);
                M2.f28737j = 5000;
                M2.j();
                return;
            case 22:
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
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f12 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
                float f13 = -0.07f;
                if (!org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f13 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f13);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 23:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.oq0 oq0Var = (org.telegram.ui.Components.oq0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.oc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.id(2, U)), true)).k(true);
                    }
                    oq0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.oc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 24:
                org.telegram.ui.Components.eu0.j((org.telegram.ui.Components.eu0) obj3, (TL_stories.StoryItem) obj2, (ih.o6) obj);
                return;
            case 25:
                ht htVar = (ht) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l14 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle.putLong("user_id", l14.longValue());
                } else {
                    bundle.putLong("chat_id", -l14.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.p();
                return;
            case 26:
                dt dtVar = (dt) obj3;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    dtVar.f37593a.p();
                    return;
                }
                return;
            case 27:
                dy dyVar = (dy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    dyVar.showDialog(new qj0(activity, !org.telegram.ui.Components.kd0.c(), new sv(activity, 0)));
                    return;
                }
                return;
            case 28:
                xo0 xo0Var = (xo0) obj2;
                Integer num = (Integer) obj;
                n00 n00Var2 = ((k00) obj3).f39658e;
                if (!n00Var2.getUserConfig().isPremium()) {
                    n00Var2.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) n00Var2, 35, true));
                    return;
                }
                int intValue = num.intValue();
                n00Var2.A = intValue;
                xo0Var.a(intValue, true);
                b00 b00Var = n00Var2.E;
                if (b00Var != null) {
                    if (!n00Var2.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = n00Var2.A;
                    }
                    b00Var.d(i10, true);
                }
                n00Var2.h0(true);
                return;
            default:
                y40 y40Var = (y40) obj3;
                fh.l2 l2Var = (fh.l2) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (l2Var != null) {
                    y40Var.getClass();
                    l2Var.setVisibility(0);
                }
                y40Var.f44719c = bitmap2;
                Paint paint = new Paint(1);
                y40Var.d = paint;
                Bitmap bitmap3 = y40Var.f44719c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                y40Var.f44720e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f12 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f12);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f11);
                y40Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
        }
    }

    public df(org.telegram.ui.Components.ki kiVar, qn qnVar) {
        this.f37524a = 13;
        this.f37526c = kiVar;
        this.f37525b = qnVar;
    }
}
