package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.UndoView;
public final class hn implements org.telegram.ui.Cells.j1 {
    public final wn f39938a;

    public hn(wn wnVar) {
        this.f39938a = wnVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        wn wnVar = this.f39938a;
        wnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        g(s1Var, true, false, true);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        vi viVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        ag.r0 r0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            wn wnVar = this.f39938a;
            qf.c cVar = wnVar.f45056ac;
            if (cVar != null) {
                cVar.a(true);
                wnVar.f45056ac = null;
            }
            if (s1Var.getMessageObject() == null) {
                wnVar.f45056ac = null;
                viVar = null;
            } else {
                viVar = new vi(wnVar, s1Var.getMessageObject().getId(), s1Var, 1);
                wnVar.f45056ac = viVar;
            }
            i10 = ((org.telegram.ui.ActionBar.r2) this.f39938a).currentAccount;
            bi.ca y3 = bi.ca.y(i10, false);
            Objects.requireNonNull(viVar);
            xi xiVar = new xi(viVar, 8);
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.u6 I = bi.ca.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f4441a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject q5 = hi.m3.q(I, false);
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                r0Var = new ag.r0(y3, ConnectionsManager.getInstance(y3.f4441a).sendRequest(tL_payments_getPaymentForm, new bi.i2(y3, messageObject, tL_inputInvoiceMessage, xiVar, 3)), 3);
            }
            if (r0Var != null) {
                viVar.f47069b = r0Var;
                viVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i11 = -1;
            for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i11 = arrayList.size();
                    }
                    TLRPC.TL_message L7 = wn.L7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        L7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        L7.attachPath = message.attachPath;
                    }
                    L7.media = tL_messageExtendedMedia.media;
                    L7.noforwards = true;
                    arrayList.add(new MessageObject(messageObject.currentAccount, L7, false, true));
                }
            }
            if (i11 > -1 && !arrayList.isEmpty()) {
                PhotoViewer v12 = PhotoViewer.v1();
                wn wnVar2 = this.f39938a;
                v12.N2(null, wnVar2, wnVar2.f45309ua);
                PhotoViewer.v1().e2(arrayList, i11, this.f39938a.a(), 0L, 0L, this.f39938a.Xa);
            }
        }
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        wn wnVar = this.f39938a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            tg.m1 m1Var = new tg.m1(wnVar, i10, user, null, null, wnVar.f45309ua);
            s1Var.getLocationOnScreen(new int[2]);
            m1Var.f48988v0 = s1Var.getNameStatusX();
            m1Var.f48989w0 = s1Var.getNameStatusY();
            m1Var.f48992z0 = s1Var.getScaleX();
            m1Var.f48990x0 = s1Var.getLeft();
            m1Var.f48991y0 = s1Var.getTop();
            m1Var.A0 = s1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
                Integer num = null;
                if (peerColors != null) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor != null) {
                    num = Integer.valueOf(peerColor.getColor1());
                }
                m1Var.f48987u0 = num;
            } else {
                m1Var.f48987u0 = Integer.valueOf(wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23617r8[colorId]));
            }
            org.telegram.ui.Components.r5 r5Var = s1Var.f25099fc;
            if (r5Var != null && (r5Var.f32123f[0] instanceof org.telegram.ui.Components.t5)) {
                m1Var.f48992z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(wnVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if ("video/webm".equals(document.mime_type)) {
                        forDocument = ImageLocation.getForDocument(document);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str2 = "160_160_g";
                    } else {
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        forDocument = ImageLocation.getForDocument(document);
                        str2 = "160_160";
                    }
                    ImageLocation imageLocation = forDocument;
                    String str3 = str2;
                    y9Var.setLayerNum(7);
                    y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    y9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = m1Var.f48987u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23693v6);
                        }
                        y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = y9Var;
                    m1Var.E0 = true;
                }
            }
            wnVar.showDialog(m1Var);
            return;
        }
        qf.d.r(wnVar.getParentActivity(), "https://" + wnVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f19535id;
            TL_stars.StarsAmount starsAmount = null;
            wn wnVar = this.f39938a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                li.s2 s2Var = new li.s2(21, this, message);
                Pattern pattern = org.telegram.ui.Components.g5.f28387a;
                Activity parentActivity = wnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.f7.V(editText, org.telegram.ui.ActionBar.y6.G6, null);
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                org.telegram.ui.ActionBar.f7.E(editText, org.telegram.ui.ActionBar.y6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.y6.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.u4(parentActivity)});
                if (LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(24.0f);
                } else {
                    i12 = 0;
                }
                int dp2 = AndroidUtilities.dp(8.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(24.0f);
                }
                editText.setPadding(i12, dp2, dp, AndroidUtilities.dp(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.p1(0, s2Var, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e2Var.N = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 4), 100L);
                wnVar.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, wnVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, wnVar.e, 5);
                    }
                    bi.s9 s9Var = new bi.s9(this, message, canManageMonoForum, messageObject, 12);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    wnVar.p7(s9Var, bg.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                wnVar.R7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                wnVar.f45089d2.n(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final boolean C0(long j10) {
        wn wnVar = this.f39938a;
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return wnVar.getMessagesController().isOwner(wnVar.e.f22028id, j10);
        }
        return false;
    }

    @Override
    public final boolean C1(org.telegram.ui.Cells.s1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hn.C1(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.f39938a;
        wnVar.Na.k(s1Var, wnVar, true);
        wnVar.f45339x0.I0(false);
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        wn wnVar = this.f39938a;
        wh.i iVar = wnVar.f45221na;
        if (iVar != null) {
            HashMap hashMap = iVar.f51322a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(s1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            wh.h hVar2 = (wh.h) wnVar.f45221na.f51322a.get(wh.i.b(s1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j10 = hVar2.f51319w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.g5.h(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.t.l(messageObject);
                    }
                    if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j11 = j10;
                    a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 17);
                    if (z10) {
                        i0Var2.run();
                        i0Var = null;
                    } else {
                        i0Var = i0Var2;
                    }
                    qcVar = org.telegram.ui.Components.wc.v(wnVar.getParentActivity(), wnVar, null, 1, j11, 1, wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi), 5000, false, i0Var);
                    qcVar.f31862k = true;
                    qcVar.k(qcVar.e instanceof org.telegram.ui.Components.bc);
                }
            }
            wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(s1Var));
            if (hVar3 != null) {
                if (qcVar == null) {
                    hVar3.R = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (!(ubVar instanceof org.telegram.ui.Components.yb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ubVar;
                hVar3.W = ybVar;
                ybVar.f35027a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new bm(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String string;
        int i13;
        TLRPC.User user;
        int i14;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        MessageObject messageObject = s1Var.getMessageObject();
        boolean z11 = false;
        an anVar = null;
        an anVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        an anVar3 = null;
        an anVar4 = null;
        wn wnVar = this.f39938a;
        if (i10 == 19) {
            qf.c cVar = wnVar.f45056ac;
            if (cVar != null) {
                cVar.a(true);
            }
            if (s1Var.getMessageObject() != null) {
                anVar2 = new an(this, s1Var, 2);
            }
            final an anVar5 = anVar2;
            wnVar.f45056ac = anVar5;
            final Activity parentActivity = wnVar.getParentActivity();
            final org.telegram.ui.ActionBar.u6 resourceProvider = wnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            anVar5.d();
            anVar5.f47069b = new vg.e(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b10 = vg.j.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            vg.s.d(messageObject, new Utilities.Callback(atomicBoolean, anVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f50205a;
                public final qf.c f50206b;
                public final boolean f50207c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f50208f;
                public final u6 f50209g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f50208f = parentActivity;
                    this.f50209g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f50205a.get()) {
                        this.f50206b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f50207c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f50208f;
                        u6 u6Var = this.f50209g;
                        if (z12) {
                            j.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, u6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            j.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, u6Var);
                        }
                    }
                }
            }, new vg.g(atomicBoolean, anVar5, 0));
        } else if (i10 == 21) {
            f();
        } else if (i10 == 84) {
            wnVar.Ga(s1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.x8 x8Var = org.telegram.ui.Components.oh0.R;
            if (wnVar.getParentActivity() != null) {
                wnVar.showDialog(new org.telegram.ui.Components.oh0(wnVar.getContext(), wnVar.getCurrentAccount(), messageObject, wnVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                    wnVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j11));
            } else {
                user = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f22177id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    sharingDirectory.mkdirs();
                    file = new File(sharingDirectory, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                wnVar.showDialog(new org.telegram.ui.Components.kf0(wnVar, null, user, null, file, kf.b.d(str, false), str3, str4, wnVar.f45309ua));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            wnVar.presentFragment(new wn(a1.g.h(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.wh.g(new StringBuilder("+"), user2.phone, kf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = kf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f22177id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                wnVar.presentFragment(new ls(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                wnVar.W9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    qf.c cVar2 = wnVar.f45056ac;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        anVar3 = new an(this, s1Var, 4);
                    }
                    wnVar.f45056ac = anVar3;
                    qf.d.q(wnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, wnVar.f45056ac, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage storyMentionWebpage = messageObject.getStoryMentionWebpage();
            if (storyMentionWebpage == null && (message = messageObject.messageOwner) != null && (messageMedia2 = message.media) != null) {
                storyMentionWebpage = messageMedia2.webpage;
            }
            if (storyMentionWebpage != null) {
                if (storyMentionWebpage.attributes != null) {
                    for (int i15 = 0; i15 < storyMentionWebpage.attributes.size(); i15++) {
                        if ((storyMentionWebpage.attributes.get(i15) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i15)).storyItem) != null) {
                            storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            wnVar.getOrCreateStoryViewer().G(wnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.q7.a(wnVar.f45339x0));
                            return;
                        }
                    }
                }
                if (!wnVar.ra(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
                    qf.c cVar3 = wnVar.f45056ac;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        anVar4 = new an(this, s1Var, 5);
                    }
                    wnVar.f45056ac = anVar4;
                    qf.d.q(wnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, wnVar.f45056ac, null, false, true, false);
                }
            }
        } else {
            if (i10 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                qf.c cVar4 = wnVar.f45056ac;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (s1Var.getMessageObject() != null) {
                    anVar = new an(this, s1Var, 3);
                }
                wnVar.f45056ac = anVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        wnVar.f45056ac.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        wnVar.f45056ac.f47069b = new ag.r0(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new fi.m3(4, this, z11)), 29);
                        return;
                    }
                }
                qf.d.q(wnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, wnVar.f45056ac, null, false, true, false);
            }
        }
    }

    @Override
    public final ev0 E1() {
        return this.f39938a.Ma;
    }

    @Override
    public final void F(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ni.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.wh.m(R.string.CodeCopied, org.telegram.ui.Components.wc.b0(this.f39938a));
        }
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        wn wnVar = this.f39938a;
        wnVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, wnVar);
    }

    @Override
    public final boolean G1(long j10) {
        wn wnVar = this.f39938a;
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return wnVar.getMessagesController().isAdmin(wnVar.e.f22028id, j10);
        }
        return false;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hn.H1(org.telegram.ui.Cells.s1, int, float, float, boolean):void");
    }

    @Override
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f39938a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        this.f39938a.d8(characterStyle, z10, s1Var.getMessageObject(), s1Var);
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.s1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hn.I1(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        wn wnVar = this.f39938a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (wnVar.f45168j6 != j10) {
                wnVar.presentFragment(wn.ea(j10));
            } else {
                wnVar.f45198m1.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            wnVar.presentFragment(ProfileActivity.t4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = s1Var.getMessageObject();
        }
        if (messageObject != null) {
            wn wnVar = this.f39938a;
            if (!wnVar.Jc && messageObject.getId() == wnVar.Ic) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - wnVar.Kc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void K(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f39938a.ub(messageObject, true);
        }
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.f39938a;
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.f45168j6), s1Var);
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        wn wnVar = this.f39938a;
        if (AndroidUtilities.isContextSafe(wnVar.getParentActivity()) && (chat = wnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            e(s1Var, wnVar.getMessagesController().getParticipant(wnVar.e.f22028id, currentUser.f22177id));
        }
    }

    @Override
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        wn wnVar = this.f39938a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            b02.R(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!s1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(wnVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            b03.R(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!wnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new sm(this, 9))).k(true);
            return false;
        } else {
            wnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(wnVar.e, wnVar.f45245p8, true), s1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final void L0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.PsaMessageInfoDefault);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            MessageObject.addLinks(false, spannableStringBuilder);
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            wn wnVar = this.f39938a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = wnVar.f45339x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = wnVar.f45339x0.getChildAt(i11);
                                if (childAt instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                                    if (messageObject2.equals(s1Var2.getMessageObject())) {
                                        s1Var = s1Var2;
                                    }
                                }
                            }
                            messageObject = messageObject2;
                        }
                    } else {
                        i10++;
                    }
                }
            }
            wnVar.Zb(messageObject, spannableStringBuilder, 1);
            s1Var.i4(1, false, true);
        }
    }

    @Override
    public final boolean M() {
        wn wnVar = this.f39938a;
        if (wnVar.f45203m6[1].size() + wnVar.f45203m6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle h = a1.g.h(j10, "user_id");
        org.telegram.ui.ActionBar.r2 r2Var = this.f39938a;
        if (r2Var.getMessagesController().checkCanOpenChat(h, r2Var, s1Var.getMessageObject())) {
            r2Var.presentFragment(new wn(h));
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var != null) {
            wn wnVar = this.f39938a;
            if (wnVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(wnVar.e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean O() {
        wn wnVar = this.f39938a;
        if (!UserObject.isReplyUser(wnVar.f45113f) && !UserObject.isUserSelf(wnVar.f45113f)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.f39938a;
        if (wnVar.Wb != 0 && s1Var.getMessageObject() != null && wnVar.Wb == s1Var.getMessageObject().getId() && wnVar.Xb == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        wn wnVar = this.f39938a;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (!kVar.q() && !wnVar.M9()) {
            if (!z10 && chat.signature_profiles && (messageObject = s1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                wnVar.Aa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                o(s1Var, chat, i10, z10);
                return;
            }
        }
        wn.f2(wnVar, s1Var, true, f7, f10);
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
        g(s1Var, true, true, false);
    }

    @Override
    public final boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (s1Var != null && pageBlock != null) {
            wn wnVar = this.f39938a;
            if (wnVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.N2(null, wnVar, null);
                    return v12.h2(null, null, null, null, null, null, null, indexOf, new rm(wnVar, arrayList), null, 0L, 0L, 0L, true, new qm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f39938a.Ic(primaryMessageObject, false);
    }

    @Override
    public final int S() {
        return this.f39938a.f45091d4;
    }

    @Override
    public final boolean S0(MessageObject messageObject) {
        hm hmVar;
        int i10 = (messageObject.getDialogId() > 1271266957L ? 1 : (messageObject.getDialogId() == 1271266957L ? 0 : -1));
        wn wnVar = this.f39938a;
        if ((i10 == 0 || ((hmVar = wnVar.A0) != null && hmVar.N)) && wnVar.f45091d4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void U0() {
        wn wnVar = this.f39938a;
        wnVar.Z7();
        UndoView undoView = wnVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, wnVar.f45168j6, null);
    }

    @Override
    public final jh.a V() {
        return this.f39938a.f45258qc;
    }

    @Override
    public final void V1() {
        this.f39938a.C9();
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        if (s1Var == null) {
            messageObject = null;
        } else {
            messageObject = s1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            wn wnVar = this.f39938a;
            if (wnVar.f45091d4 != 1 && !wnVar.K9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        wn wnVar = this.f39938a;
        if (!wnVar.L9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (wnVar.getParentActivity() != null) {
                if (wnVar.f45046a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    jk jkVar = wnVar.Y;
                    MessageObject messageObject = s1Var.getMessageObject();
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    ui uiVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    qf.c cVar = wnVar.f45056ac;
                    if (cVar != null) {
                        cVar.a(true);
                        wnVar.f45056ac = null;
                    }
                    if (str != null && s1Var.getMessageObject() != null) {
                        ui uiVar2 = new ui(wnVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                        wnVar.f45056ac = uiVar2;
                        uiVar = uiVar2;
                    } else {
                        wnVar.f45056ac = null;
                    }
                    jkVar.Y(keyboardButtonProto, messageObject, messageObject2, uiVar);
                }
            }
        }
    }

    @Override
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f39938a.f8(s1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        a5 b10;
        int i11;
        nk nkVar;
        mk mkVar;
        if (!k()) {
            return false;
        }
        wn wnVar = this.f39938a;
        if (wnVar.e != null && (((nkVar = wnVar.f45046a1) == null || nkVar.getVisibility() != 0) && ((mkVar = wnVar.R) == null || mkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && ((wnVar.f45241p4 == 0 || wnVar.f45290t4) && (!ChatObject.isChannel(chat) || wnVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        g5[] g5VarArr = new g5[r22 + 2 + r42];
        g5VarArr[0] = g5.d;
        g5VarArr[1] = g5.h;
        char c10 = 2;
        if (r22 != 0) {
            g5VarArr[2] = g5.f39501n;
            c10 = 3;
        }
        if (r42 != 0) {
            g5VarArr[c10] = g5.f39502r;
        }
        TLRPC.UserFull userFull = wnVar.getMessagesController().getUserFull(user.f22177id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            b10 = a5.b(user, i10, g5VarArr);
        } else {
            b10 = a5.c(user, userFull, g5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                b10 = a5.b(user, i11, g5VarArr);
            }
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) wnVar.fragmentView, wnVar.f45309ua, b10, new e7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(wnVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final hn f44052b;

            {
                this.f44052b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f44052b.y(user, false);
                        return;
                    case 1:
                        this.f44052b.b(user);
                        return;
                    default:
                        this.f44052b.f39938a.za(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, s1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final hn f44052b;

            {
                this.f44052b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f44052b.y(user, false);
                        return;
                    case 1:
                        this.f44052b.b(user);
                        return;
                    default:
                        this.f44052b.f39938a.za(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final hn f44052b;

            {
                this.f44052b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f44052b.y(user, false);
                        return;
                    case 1:
                        this.f44052b.b(user);
                        return;
                    default:
                        this.f44052b.f39938a.za(user);
                        return;
                }
            }
        }, r42);
        H.f30169t = false;
        H.f30150i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final boolean X1(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        wn wnVar = this.f39938a;
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (z10 && wnVar.Z9) {
            j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                ((ActionBarLayout) j5Var2).r();
            }
            return true;
        }
        return !c();
    }

    @Override
    public final void Z(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        wn wnVar = this.f39938a;
        try {
            if (i10 == 0) {
                wnVar.q7();
                fl flVar = wnVar.L3;
                if (flVar != null) {
                    flVar.l(0L, 84, null, new sm(this, 1));
                    wnVar.L3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (wnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.m41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.m41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.wc.b0(wnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                wnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(wnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new sm(this, 2));
                } else if (wnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new sm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                b02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), b02.f34498c);
                ybVar.c(i13, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i14 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i14 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i14++;
                    }
                }
                ybVar.f35028b.setText(append2);
                ybVar.f35028b.setSingleLine(false);
                ybVar.f35028b.setMaxLines(6);
                b02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var != null && document != null) {
            wn wnVar = this.f39938a;
            if (wnVar.getParentLayout() != null && W(s1Var)) {
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(wnVar, s1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, s1Var, document, 24), false);
                H.f30169t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void Z1() {
        wn wnVar = this.f39938a;
        if (wnVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wnVar.f45168j6);
            bundle.putInt("start_from", 10);
            wnVar.presentFragment(new org.telegram.ui.Components.ua0(bundle, wnVar.f45198m1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", wnVar.getMessagesController().recommendedChannelsLimitPremium), new sm(this, 4))).j();
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        wn wnVar = this.f39938a;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            CharSequence fieldText = jkVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = ChatObject.getPublicUsername(chat);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
                wnVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new sm(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean a0() {
        if (this.f39938a.f45091d4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        wn wnVar = this.f39938a;
        fi.v3 v3Var = wnVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (wnVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            fi.v3 v3Var2 = new fi.v3(wnVar.getParentActivity(), 3);
            v3Var2.p(true);
            v3Var2.K = Layout.Alignment.ALIGN_NORMAL;
            v3Var2.d = -1L;
            v3Var2.T = true;
            v3Var2.e = true;
            v3Var2.q(12.0f);
            wnVar.M1 = v3Var2;
            v3Var2.f11797l0 = new ed(20, this, v3Var2);
            v3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            wnVar.f45163j1.addView(wnVar.M1, org.telegram.ui.Components.kb1.h(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            wnVar.f45163j1.post(new i2.b0(this, s1Var, i11, i10, 4));
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        wn wnVar = this.f39938a;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            CharSequence fieldText = jkVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(org.telegram.ui.Components.b10.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.b71("" + user.f22177id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            wnVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new sm(this, 7), 200L);
        }
    }

    @Override
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        this.f39938a.R7(s1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final org.telegram.ui.Cells.t9 b2() {
        return this.f39938a.f45282s9;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        wn wnVar = this.f39938a;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (!kVar2.q() && !wnVar.M9()) {
                z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
                if (!z10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int c0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar;
        wn wnVar = this.f39938a;
        if (wnVar.Xc.f19326f && (cVar = wnVar.f45100dd) != null && cVar.f48657n == s1Var && cVar.f48653a.getWidth() > 0) {
            return wnVar.f45100dd.f48653a.getHeight();
        }
        return 0;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void d0(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        wn wnVar = this.f39938a;
        if (wnVar.getParentActivity() != null) {
            if (wnVar.f45221na == null) {
                wh.i iVar = new wh.i(wnVar.getParentActivity());
                wnVar.f45221na = iVar;
                wnVar.f45163j1.addView(iVar, org.telegram.ui.Components.kb1.i(-1, -1, 48));
            }
            wh.i iVar2 = wnVar.f45221na;
            HashMap hashMap = iVar2.f51322a;
            ArrayList arrayList = iVar2.f51324c;
            arrayList.clear();
            int i10 = iVar2.d;
            UserConfig userConfig = UserConfig.getInstance(i10);
            long j10 = userConfig.clientUserId;
            arrayList.add(Long.valueOf(j10));
            if (userConfig.suggestContacts) {
                ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                    long j11 = tL_topPeer2.peer.user_id;
                    if (j11 != 0) {
                        int i12 = size;
                        if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
            for (int i13 = 0; i13 < allDialogs.size(); i13++) {
                TLRPC.Dialog dialog = allDialogs.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j12 = dialog.f22032id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f22032id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f22032id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f22177id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22032id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22032id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22032id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22032id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22032id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = wh.i.b(s1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    Long l4 = (Long) obj;
                    if (hashSet.add(l4) && DialogObject.isUserDialog(l4.longValue())) {
                        arrayList4.add(l4);
                    }
                }
                wh.h hVar = new wh.h(iVar2, s1Var, arrayList4, new vi.k0(1, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    public final void e(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        wn wnVar = this.f39938a;
        wnVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(wnVar.getParentActivity()) && (chat = wnVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == wnVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == wnVar.getUserConfig().getClientUserId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                org.telegram.ui.Components.j11.b(parentActivity, i10, -wnVar.e.f22028id, currentUser, str2, z15, z16, z12, u6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == wnVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(wnVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                wnVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(wnVar.e);
                tL_channels_getParticipant.participant = wnVar.getMessagesController().getInputPeer(currentUser.f22177id);
                wnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bi.m5(11, this, s1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
            org.telegram.ui.Components.j11.b(parentActivity2, i10, -wnVar.e.f22028id, currentUser, str2, z152, z162, z12, u6Var);
        }
    }

    @Override
    public final boolean e0() {
        boolean z10;
        wn wnVar = this.f39938a;
        if (!wnVar.M9()) {
            z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        wn wnVar = this.f39938a;
        if (isHuaweiStoreApp) {
            qf.d.r(wnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(wnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        wh.i iVar = this.f39938a.f45221na;
        if (iVar != null && (hVar = (wh.h) iVar.f51322a.get(wh.i.b(s1Var))) != null) {
            wh.d[] dVarArr = hVar.f51319w;
            RectF rectF = hVar.f51317r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = wh.g.f51304a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(wh.g.f51304a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = a8.ee.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f51311a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        wh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f51283p != z10) {
                            ValueAnimator valueAnimator = dVar.f51281n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f51283p = z10;
                            float f15 = dVar.f51282o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f51281n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f51281n.addUpdateListener(dVar);
                            dVar.f51281n.setInterpolator(wh.f.f51287a);
                            dVar.f51281n.start();
                        }
                        wh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f51280m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f51278k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f51280m = z11;
                            float f16 = dVar2.f51279l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f51278k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f51278k.addUpdateListener(dVar2);
                            dVar2.f51278k.setInterpolator(wh.f.f51287a);
                            dVar2.f51278k.start();
                        }
                    }
                }
            }
        }
    }

    public final void g(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        uj ujVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        wn wnVar = this.f39938a;
        rj rjVar = wnVar.f45339x0;
        if (rjVar != null && (ujVar = wnVar.f45364z0) != null && ujVar.f47752y < 0) {
            for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wnVar.f45339x0.getChildAt(childCount);
                wnVar.f45339x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = wnVar.Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i11 = wnVar.Y8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                uj ujVar2 = wnVar.f45364z0;
                wnVar.f45339x0.getClass();
                ujVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) wnVar.I9), false);
            } else {
                wnVar.f45364z0.h1(i10, i11);
            }
        }
        wnVar.Z0 = z11;
        wnVar.Ic(primaryMessageObject, false);
        wnVar.Z0 = false;
    }

    @Override
    public final void g0(String str) {
        wn wnVar = this.f39938a;
        nk nkVar = wnVar.f45046a1;
        if (nkVar == null || nkVar.getVisibility() != 0) {
            mk mkVar = wnVar.R;
            if ((mkVar == null || mkVar.getVisibility() != 0) && wnVar.Y != null && str != null && str.length() > 0) {
                jk jkVar = wnVar.Y;
                jkVar.setFieldText("@" + str + " ");
                wnVar.Y.E0();
            }
        }
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (wnVar = this.f39938a).Wb) != 0 && i10 == s1Var.getMessageObject().getId() && wnVar.Xb == 3) {
            return wnVar.Zb;
        }
        return null;
    }

    @Override
    public final boolean h0(org.telegram.ui.Components.c6 c6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        wn wnVar = this.f39938a;
        if (!wnVar.getMessagesController().premiumFeaturesBlocked() && c6Var != null && !c6Var.standard) {
            long documentId = c6Var.getDocumentId();
            TLRPC.Document document = c6Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                document = org.telegram.ui.Components.t5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(wnVar, wnVar.getParentActivity(), wnVar.f45309ua, arrayList);
                org.telegram.ui.Components.qv qvVar = awVar.f26675f;
                qvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(qvVar);
                qvVar.v = imageReceiver;
                if (qvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                qvVar.f32030w = true;
                qvVar.f32031x.d(1.0f, true);
                qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f, true), 0L, null, null, 0);
                qvVar.v.setLayerNum(7);
                qvVar.v.setAllowStartLottieAnimation(true);
                qvVar.v.setAllowStartAnimation(true);
                qvVar.v.setAutoRepeat(1);
                qvVar.v.setAllowDecodeSingleFrame(true);
                qvVar.v.setParentView(qvVar);
                awVar.setCalcMandatoryInsets(wnVar.I9());
                wnVar.showDialog(awVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = sh.i.a(messageObject);
            boolean a10 = a8.pf.a(a2, 7);
            wn wnVar = this.f39938a;
            if (a10) {
                org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.e_hand_2, 36, sh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                wnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                s1Var.R0(true);
            } else if (wnVar.getParentActivity() != null) {
                if (wnVar.f45366z2 == null) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(5, wnVar.getParentActivity(), wnVar.f45309ua, false);
                    wnVar.f45366z2 = t40Var;
                    t40Var.setAlpha(0.0f);
                    wnVar.f45366z2.setVisibility(4);
                    int indexOfChild = wnVar.f45163j1.indexOfChild(wnVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    wnVar.f45163j1.addView(wnVar.f45366z2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                            float y3 = ((s1Var.getY() + q1Var.f24793b) - AndroidUtilities.dp(4.0f)) - wnVar.I9;
                            wnVar.C2 = AndroidUtilities.dp(13.3f) + q1Var.f24792a;
                            int w10 = d3.w(6.0f, q1Var.f24793b, i12);
                            wnVar.D2 = w10;
                            if (y3 > 0.0f) {
                                i15 = wnVar.C2;
                                i13 = w10;
                                f7 = 0.0f;
                                break;
                            }
                            i16++;
                            f7 = y3;
                        } else {
                            i13 = i12;
                            i15 = i11;
                            break;
                        }
                    }
                    if (f7 != 0.0f) {
                        wnVar.f45339x0.w0(0, (int) f7, null);
                        wnVar.B2 = s1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                wnVar.f45366z2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void j() {
        f();
    }

    @Override
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wn wnVar = this.f39938a;
        wnVar.R7(s1Var, false, false, f7, f10, true, false, false);
        wnVar.f45339x0.getClass();
        wn.g2(wnVar, RecyclerView.R(s1Var));
    }

    public final boolean k() {
        wn wnVar = this.f39938a;
        if (!UserObject.isUserSelf(wnVar.f45113f)) {
            TLRPC.Chat chat = wnVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !wnVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean k1() {
        wn wnVar = this.f39938a;
        if (wnVar.f45163j1.getMeasuredWidth() > wnVar.f45163j1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                v1(s1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            wn wnVar = this.f39938a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(wnVar)) {
                    rc0 rc0Var = new rc0(3);
                    u6Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                    rc0Var.setResourceProvider(u6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = wnVar.getMessagesController().getPeer(wnVar.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    rc0Var.N0 = false;
                    rc0Var.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    wnVar.presentFragment(rc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                ht.o().u(wnVar.getParentActivity());
                ht.o().t(new fn(this, tL_messageMediaPoll, pollAnswer, s1Var));
                ht o10 = ht.o();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = s1Var.getMessageObject();
                u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                o10.r(document4, null, "", null, null, i18, false, messageObject2, u6Var, 200);
            } else {
                long j12 = 0;
                if (MessageObject.isMusicDocument(messageMedia.document)) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                        boolean z12 = playingMessageObject.isPlayingExplanationObject;
                        if (i10 == -3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 == z11) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(playingMessageObject);
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
                                return;
                            }
                        }
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    TLRPC.TL_message L7 = wn.L7(message);
                    L7.media = messageMedia;
                    L7.attachPath = sh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i17, L7, false, true);
                    if (i10 == -3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageObject3.isPlayingExplanationObject = z10;
                    arrayList.add(messageObject3);
                    if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                        MediaController.getInstance().cleanupPlayer(false, true);
                    }
                    MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
                    return;
                }
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !MessageObject.isVideoDocument(document5)) {
                    i15 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i15, messageObject, document6, sh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f48649g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = s1Var.f25367y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            sh.g gVar = s1Var.f25050c6;
                            if (gVar != null) {
                                gVar.d();
                            }
                            sh.g gVar2 = s1Var.f25035b6;
                            if (gVar2 != null) {
                                gVar2.d();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f48648f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = s1Var.f25367y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            sh.g gVar3 = s1Var.f25050c6;
                            if (gVar3 != null) {
                                gVar3.d();
                            }
                            sh.g gVar4 = s1Var.f25035b6;
                            if (gVar4 != null) {
                                gVar4.d();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message L72 = wn.L7(message2);
                        L72.media = messageMedia;
                        L72.attachPath = sh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, L72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.v1().N2(null, wnVar, wnVar.f45309ua);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = wnVar.f45168j6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = wnVar.f45065b7;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = wnVar.b();
                            }
                            v12.i2(messageObject6, wnVar, j10, j11, j12, wnVar.Wa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, wnVar.getParentActivity(), wnVar.f45309ua, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            wnVar.F6(messageObject6);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i11 = arrayList3.size();
                    } else {
                        i11 = -1;
                    }
                    TLRPC.TL_message L73 = wn.L7(message3);
                    L73.media = messageMedia3;
                    L73.attachPath = sh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, L73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message L74 = wn.L7(message3);
                    L74.media = messageMedia2;
                    L74.attachPath = sh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    L74.message = pollResults2.solution;
                    L74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, L74, false, true));
                    arrayList2.add(-3);
                }
                bg.d.b(tL_messageMediaPoll.poll, wnVar.getUserConfig().getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                        if (pollAnswer2.unshuffled_index == i10) {
                            i11 = arrayList3.size();
                        }
                        TLRPC.TL_message L75 = wn.L7(message3);
                        L75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        L75.message = tL_textWithEntities2.text;
                        L75.entities = tL_textWithEntities2.entities;
                        L75.attachPath = sh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, L75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.v1().N2(null, wnVar, wnVar.f45309ua);
                    PhotoViewer.v1().e2(arrayList3, i11, wnVar.a(), 0L, 0L, wnVar.Xa);
                }
            }
        }
    }

    @Override
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
        g(s1Var, z10, false, z11);
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var) {
        if (s1Var.getMessageObject().isImportedForward()) {
            U0();
            return;
        }
        wn wnVar = this.f39938a;
        if (!wnVar.f45342x3 && wnVar.f45339x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
            if (wnVar.G2 == null) {
                om omVar = wnVar.f45163j1;
                int indexOfChild = omVar.indexOfChild(wnVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, wnVar.getParentActivity(), wnVar.f45309ua, false);
                    wnVar.G2 = t40Var;
                    omVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    wnVar.G2.setAlpha(0.0f);
                    wnVar.G2.setVisibility(4);
                } else {
                    return;
                }
            }
            wnVar.G2.e(s1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f39938a;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        boolean z10 = true;
        if (!kVar.q() && !wnVar.M9()) {
            if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
                E0(10, s1Var);
                return;
            }
            if (!ChatObject.isForum(wnVar.e) && !wnVar.R9()) {
                z10 = false;
            }
            y(user, z10);
            return;
        }
        wn.f2(wnVar, s1Var, true, f7, f10);
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
        wn.X4(this.f39938a, s1Var);
    }

    @Override
    public final void n() {
        this.f39938a.f45163j1.getClass();
    }

    @Override
    public final void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
        TLRPC.Message message;
        if (s1Var == null) {
            nVar.run();
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f39938a;
            r2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, r2Var, true);
            return;
        }
        nVar.run();
    }

    @Override
    public final void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        g(s1Var, z10, false, false);
    }

    public final void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, boolean z10) {
        wn wnVar = this.f39938a;
        TLRPC.Chat chat2 = wnVar.e;
        if (chat2 != null && chat.f22028id == chat2.f22028id) {
            lj ljVar = wnVar.f45198m1;
            if (ljVar != null && i10 == 0) {
                ljVar.e(false, false);
            } else if (s1Var.getMessageObject() != null) {
                wnVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f22028id != chat2.f22028id || wnVar.R9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22028id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            vi viVar = null;
            if (z10) {
                qf.c cVar = wnVar.f45056ac;
                if (cVar != null) {
                    cVar.a(true);
                    wnVar.f45056ac = null;
                }
                if (s1Var.getMessageObject() == null) {
                    wnVar.f45056ac = null;
                } else {
                    vi viVar2 = new vi(wnVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    wnVar.f45056ac = viVar2;
                    viVar = viVar2;
                }
            }
            if (wnVar.getMessagesController().checkCanOpenChat(bundle, wnVar, s1Var.getMessageObject(), viVar)) {
                wn wnVar2 = new wn(bundle);
                if (viVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new bi.sb(this, viVar, chat, i10, wnVar2, 18), 5000L);
                    viVar.d();
                    return;
                }
                wnVar.presentFragment(wnVar2);
            }
        }
    }

    @Override
    public final void o0(org.telegram.ui.Cells.s1 r45, float r46, float r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hn.o0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hn.p(org.telegram.ui.Cells.s1):void");
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        a5 a5Var;
        int i17;
        int i18;
        g5 g5Var;
        nk nkVar;
        mk mkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        wn wnVar = this.f39938a;
        if (!isEmpty && wnVar.e != null && (((nkVar = wnVar.f45046a1) == null || nkVar.getVisibility() != 0) && ((mkVar = wnVar.R) == null || mkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = wnVar.e;
        if (chat2 != null && ((wnVar.f45241p4 == 0 || wnVar.f45290t4) && (!ChatObject.isChannel(chat2) || wnVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = wnVar.e;
        if (chat3 != null && chat3.f22028id == chat.f22028id && !wnVar.R9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        g5[] g5VarArr = new g5[i12 + 1 + i10 + i11];
        g5VarArr[0] = g5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                g5Var = g5.e;
            } else {
                g5Var = g5.f39500f;
            }
            g5VarArr[1] = g5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            g5VarArr[i13] = g5.f39501n;
            i13++;
        }
        if (i11 != 0) {
            g5VarArr[i13] = g5.f39502r;
        }
        TLRPC.ChatFull chatFull = wnVar.getMessagesController().getChatFull(chat.f22028id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            int i19 = i11;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i20 = i12;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            BitmapDrawable bitmapDrawable = null;
            if (forUserOrChat2 != null && (forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            }
            z10 = true;
            i15 = i20;
            z11 = i10;
            i16 = i19;
            a5Var = new a5(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, g5VarArr, new c5(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            a5Var = a5.a(chat, chatFull, g5VarArr);
            i16 = i11;
            i15 = i12;
            z10 = true;
            z11 = i10;
        }
        if (c2.b.g(a5Var)) {
            c2.b.m().y((ViewGroup) wnVar.fragmentView, wnVar.f45309ua, a5Var, new e7(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(wnVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new vm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i17 = R.drawable.msg_channel;
        } else {
            i17 = R.drawable.msg_discussion;
        }
        if (z12) {
            i18 = R.string.OpenChannel2;
        } else {
            i18 = R.string.OpenGroup2;
        }
        H.l(i17, LocaleController.getString(i18), new q1(this, s1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new vm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new vm(this, chat, 2), i16);
        H.f30169t = false;
        H.f30150i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }

    @Override
    public final void q() {
        this.f39938a.oc();
    }

    @Override
    public final boolean q0(MessageObject messageObject) {
        return !this.f39938a.f45272s.containsKey(messageObject);
    }

    @Override
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wn wnVar = this.f39938a;
        if (!wnVar.L9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (wnVar.getParentActivity() != null) {
                if (wnVar.f45046a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) wnVar.f45309ua, false);
                        k3Var.fixNavigationBar();
                        k3Var.title = str;
                        k3Var.bigTitle = false;
                        k3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        ng.j jVar = new ng.j(3, wnVar, str);
                        k3Var.items = charSequenceArr;
                        k3Var.onClickListener = jVar;
                        wnVar.showDialog(k3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        wnVar.ma(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
                        try {
                            s1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void r(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        uj ujVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            wn wnVar = this.f39938a;
            rj rjVar = wnVar.f45339x0;
            if (rjVar != null && (ujVar = wnVar.f45364z0) != null && ujVar.f47752y < 0) {
                for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = wnVar.f45339x0.getChildAt(childCount);
                    wnVar.f45339x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = wnVar.Y8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = wnVar.Y8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            wnVar.Ic(primaryMessageObject, false);
            fi.v3 v3Var = wnVar.M1;
            if (v3Var != null) {
                v3Var.e(true);
            }
            if (i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
                wnVar.f45364z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar = this.f39938a.f45100dd;
        if (cVar != null && cVar.f48657n == s1Var) {
            cVar.f48660w.getClass();
        }
    }

    @Override
    public final boolean r1() {
        wn wnVar = this.f39938a;
        if (wnVar.f45163j1.getKeyboardHeight() + wnVar.Ea >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = s1Var.getMessageObject();
        }
        MessageObject messageObject2 = messageObject;
        TLRPC.MessageReplies messageReplies = messageObject2.messageOwner.replies;
        if (messageReplies != null) {
            i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
        } else {
            i10 = -1;
            j10 = 0;
        }
        int i11 = i10;
        long j11 = j10;
        wn wnVar = this.f39938a;
        wnVar.na(wnVar.e.f22028id, messageObject2, messageObject2.getId(), j11, i11, 0, null);
    }

    @Override
    public final void s0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.g6 animation;
        wn wnVar = this.f39938a;
        if (!wnVar.f45342x3 && !SharedConfig.noSoundHintShowed && wnVar.f45339x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
            org.telegram.ui.Components.t40 t40Var = wnVar.F2;
            if (t40Var == null || t40Var.getTag() == null) {
                if (wnVar.F2 == null) {
                    om omVar = wnVar.f45163j1;
                    int indexOfChild = omVar.indexOfChild(wnVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(0, wnVar.getParentActivity(), wnVar.f45309ua, false);
                        wnVar.F2 = t40Var2;
                        t40Var2.setShowingDuration(10000L);
                        omVar.addView(wnVar.F2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        wnVar.F2.setAlpha(0.0f);
                        wnVar.F2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = wnVar.f45339x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = wnVar.f45339x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && wnVar.F2.e(s1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void s1(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        wn wnVar = this.f39938a;
        wnVar.f45291t5 = messageObject;
        wnVar.q9();
    }

    public final void t(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22177id);
            org.telegram.ui.ActionBar.r2 r2Var = this.f39938a;
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var, s1Var.getMessageObject())) {
                r2Var.presentFragment(new wn(bundle));
            }
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        wn wnVar = this.f39938a;
        if (wnVar.getParentActivity() != null && tLObject != null) {
            j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                if (((ActionBarLayout) j5Var2).x()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22028id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f22177id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, wnVar.getParentActivity(), wnVar.getResourceProvider());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, wnVar.getResourceProvider());
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wnVar.getParentActivity(), false, false);
                g1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(wnVar.getParentActivity(), false, false);
                g1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, s1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                wn wnVar2 = new wn(bundle);
                wnVar2.Z9 = true;
                wnVar.presentFragmentAsPreviewWithMenu(wnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                wnVar.m7();
                return;
            }
            wnVar.presentFragment(new wn(bundle));
        }
    }

    @Override
    public final String u(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        wn wnVar = this.f39938a;
        if (UserObject.isBotForum(wnVar.f45113f)) {
            return null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = wnVar.getMessagesController().getAdminRank(wnVar.e.f22028id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = wnVar.f45228o4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        wn wnVar = this.f39938a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(wnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = wnVar.getMessagesController().conferenceCallSizeLimit;
                e2Var.setOnCancelListener(new bi.f0(this, wnVar.getConnectionsManager().sendRequest(getgroupcall, new bi.n9(this, e2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                e2Var.r(600L);
                return;
            }
            TLRPC.User user = wnVar.f45113f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = wnVar.f45255q8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, i11, wnVar.getParentActivity(), wnVar.getMessagesController().getUserFull(wnVar.f45113f.f22177id), wnVar.getAccountInstance());
                return;
            }
            return;
        }
        wnVar.R7(s1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void u1(MessageObject messageObject) {
        this.f39938a.f45272s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            s1Var.t2();
            s1Var.requestLayout();
            this.f39938a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        dn dnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && qf.d.g(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        wn wnVar = this.f39938a;
        qf.c cVar = wnVar.f45056ac;
        if (cVar != null) {
            cVar.a(true);
        }
        if (s1Var.getMessageObject() == null) {
            dnVar = null;
        } else {
            dnVar = new dn(this, s1Var);
        }
        wnVar.f45056ac = dnVar;
        if (!z11 && !qf.d.e(parse, false, null)) {
            org.telegram.ui.Components.g5.q0(wnVar, str, true, true, true, !z11, wnVar.f45056ac, webPage, wnVar.f45309ua);
        } else {
            qf.d.q(wnVar.getParentActivity(), parse, true, true, false, wnVar.f45056ac, null, false, true, false);
        }
    }

    public final void w(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22028id);
            bundle.putBoolean("expandPhoto", false);
            this.f39938a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            wn wnVar = this.f39938a;
            if ((wnVar.Wb != id2 || wnVar.Xb != 7) && (inputPeer = wnVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f22250id = id2;
                qf.c cVar = wnVar.f45056ac;
                if (cVar != null) {
                    cVar.a(true);
                    wnVar.f45056ac = null;
                }
                vi viVar = new vi(wnVar, id2, s1Var, 2);
                viVar.f47069b = new ed(8, wnVar, r3);
                wnVar.f45056ac = viVar;
                viVar.d();
                int[] iArr = {wnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new bi.t3(wnVar, viVar, iArr, s1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (wnVar = this.f39938a).Wb) != 0 && i10 == s1Var.getMessageObject().getId() && wnVar.Xb == 1) {
            return wnVar.Yb;
        }
        return null;
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
        wn wnVar = this.f39938a;
        if (!wnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, null);
            e2Var.r(200L);
            wnVar.getMessagesController().getContentSettings(new y(this, e2Var, s1Var, 6));
            return;
        }
        if (s1Var.getMessageObject() != null) {
            s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        s1Var.j4();
    }

    @Override
    public final void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            wn wnVar = this.f39938a;
            org.telegram.ui.Components.dv.I(wnVar, messageObject, wnVar.Wa, str2, str3, str4, str, i10, i11, -1, wnVar.I9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void y(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f22177id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22177id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            wn wnVar = this.f39938a;
            TLRPC.User user2 = wnVar.f45113f;
            if (user2 != null && user2.f22177id == user.f22177id) {
                i11 = 1;
            }
            profileActivity.X4(i11);
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            wnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
        g(s1Var, z10, true, z11);
    }

    @Override
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        te teVar;
        a3.i0 i0Var;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        bh.p pVar;
        int i10;
        boolean z11;
        int i11;
        d41 d41Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f39938a.A0.L();
                    wn wnVar = this.f39938a;
                    return mediaController.setPlaylist(L, messageObject, wnVar.f45065b7, true ^ wnVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f39938a.a8(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            f41 f41Var = this.f39938a.f45247pa;
            if (f41Var == null || f41Var.f39154b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.wc.b0(this.f39938a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f39938a.f45247pa = new f41(this.f39938a.getParentActivity());
                f41 f41Var2 = this.f39938a.f45247pa;
                if (!messageObject.isOutOwner()) {
                    teVar = this.f39938a.ub(messageObject, true);
                } else {
                    teVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    i0Var = wn.S4(this.f39938a, messageObject);
                } else {
                    i0Var = null;
                }
                Context context = f41Var2.f39151a;
                bh.p pVar2 = f41Var2.f39155c;
                f41Var2.X = teVar;
                f41Var2.Y = i0Var;
                d41 d41Var2 = f41Var2.N;
                if (d41Var2 != null) {
                    pVar2.removeView(d41Var2);
                    f41Var2.N = null;
                }
                f41Var2.O = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                f41Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f41Var2.S = z10;
                org.telegram.ui.Cells.s1 s1Var2 = f41Var2.O;
                if (s1Var2 != null) {
                    u6Var = s1Var2.getResourcesProvider();
                } else {
                    u6Var = null;
                }
                f41Var2.L = u6Var;
                if (f41Var2.O != null) {
                    f41Var2.T = 0.0f;
                    f41Var2.U = s1Var.f25199n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        f41Var2.T = view.getY() + f41Var2.T;
                        f41Var2.U = view.getY() + f41Var2.U;
                    }
                    int width = f41Var2.O.getWidth();
                    int height = f41Var2.O.getHeight();
                    if (f41Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    f41Var2.K = i14 - f41Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    pVar = pVar2;
                    d41 d41Var3 = new d41(f41Var2, f41Var2.getContext(), UserConfig.selectedAccount, f41Var2.O.getResourcesProvider(), width, i14);
                    f41Var2.N = d41Var3;
                    f41Var2.O.j1(d41Var3);
                    f41Var2.N.i1(f41Var2.O);
                    f41Var2.N.setDelegate(new Object());
                    d41 d41Var4 = f41Var2.N;
                    MessageObject messageObject3 = f41Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = f41Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = f41Var2.O;
                    d41Var4.Z3(messageObject3, currentMessagesGroup, s1Var3.F, s1Var3.E, false, false);
                    if (!f41Var2.S) {
                        org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8();
                        f41Var2.V = n8Var;
                        d41 d41Var5 = f41Var2.N;
                        n8Var.f30772i = d41Var5;
                        d41Var5.f25101fe = n8Var;
                        if (d41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.qp0 seekBarWaveform = f41Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = f41Var2.f39162s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.f31990n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    f41Var2.H = false;
                    pVar.addView(f41Var2.N, new FrameLayout.LayoutParams(f41Var2.O.getWidth(), i14, 17));
                } else {
                    pVar = pVar2;
                    i10 = 360;
                }
                TextureView textureView = f41Var2.P;
                if (textureView != null) {
                    pVar.removeView(textureView);
                    f41Var2.P = null;
                }
                if (f41Var2.S) {
                    f41Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    f41Var2.P = textureView2;
                    pVar.addView(textureView2, 0, org.telegram.ui.Components.kb1.g(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.t81 t81Var = f41Var2.f39163w;
                if (t81Var != null) {
                    t81Var.B();
                    f41Var2.f39163w.H();
                    f41Var2.f39163w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = f41Var2.O;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(f41Var2.O.getMessageObject().currentAccount).getPathToAttach(f41Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(f41Var2.O.getMessageObject().currentAccount).getPathToMessage(f41Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && f41Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(f41Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.t81 t81Var2 = new org.telegram.ui.Components.t81();
                        f41Var2.f39163w = t81Var2;
                        t81Var2.J = new e41(f41Var2);
                        if (f41Var2.V != null) {
                            t81Var2.K = new e41(f41Var2);
                        }
                        if (f41Var2.S) {
                            t81Var2.V(f41Var2.P);
                        }
                        f41Var2.f39163w.D(Uri.fromFile(pathToAttach), "other");
                        f41Var2.f39163w.C();
                        org.telegram.ui.Components.tt ttVar = f41Var2.E;
                        if (ttVar != null) {
                            ttVar.f33143s = f41Var2.f39163w;
                            ttVar.a();
                        }
                    }
                    wn wnVar2 = this.f39938a;
                    wnVar2.showDialog(wnVar2.f45247pa);
                    return false;
                }
                fi.v3 v3Var = f41Var2.f39164x;
                if (v3Var != null) {
                    pVar.removeView(v3Var);
                    f41Var2.f39164x = null;
                }
                MessageObject messageObject4 = f41Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = f41Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(f41Var2.M.currentAccount).getClientUserId()) {
                    fi.v3 v3Var2 = new fi.v3(context, 3);
                    f41Var2.f39164x = v3Var2;
                    v3Var2.p(true);
                    if (z11) {
                        long dialogId = f41Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(f41Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(f41Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        fi.v3 v3Var3 = f41Var2.f39164x;
                        if (f41Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        v3Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        fi.v3 v3Var4 = f41Var2.f39164x;
                        if (f41Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        v3Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    f41Var2.f39164x.q(12.0f);
                    fi.v3 v3Var5 = f41Var2.f39164x;
                    if (!z11 && !f41Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    v3Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (f41Var2.S) {
                        f41Var2.f39164x.m(0.5f, 0.0f);
                        f41Var2.f39164x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        f41Var2.f39164x.m(0.0f, AndroidUtilities.dp(34.0f));
                        f41Var2.f39164x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    f41Var2.f39164x.t(14.0f);
                    fi.v3 v3Var6 = f41Var2.f39164x;
                    v3Var6.h = fi.v3.a(v3Var6.getText(), f41Var2.f39164x.getTextPaint());
                    if (f41Var2.S) {
                        pVar.addView(f41Var2.f39164x, org.telegram.ui.Components.kb1.h((int) ((f41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((f41Var2.O.getHeight() + f41Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        pVar.addView(f41Var2.f39164x, org.telegram.ui.Components.kb1.h((int) ((f41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((f41Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + f41Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((f41Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    f41Var2.f39164x.u();
                }
                TextView textView = f41Var2.f39165y;
                if (textView != null) {
                    pVar.removeView(textView);
                    f41Var2.f39165y = null;
                }
                TextView textView2 = new TextView(context);
                f41Var2.f39165y = textView2;
                textView2.setTextColor(-1);
                f41Var2.f39165y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f41Var2.f39165y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    f41Var2.f39165y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                f41Var2.f39165y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                org.telegram.ui.Components.kb1.b(f41Var2.f39165y);
                TextView textView3 = f41Var2.f39165y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                f41Var2.f39165y.setOnClickListener(new b41(f41Var2, 1));
                pVar.addView(f41Var2.f39165y, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (d41Var = f41Var2.N) != null && d41Var.getMessageObject() != null && f41Var2.N.getMessageObject().messageOwner != null) {
                    f41Var2.N.getMessageObject().messageOwner.media_unread = false;
                    f41Var2.N.invalidate();
                }
                wn wnVar22 = this.f39938a;
                wnVar22.showDialog(wnVar22.f45247pa);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void z1() {
        org.telegram.ui.ActionBar.u6 u6Var;
        wn wnVar = this.f39938a;
        if (wnVar.f45163j1 != null && wnVar.getParentActivity() != null) {
            Context context = wnVar.f45163j1.getContext();
            u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
            c31.T(context, wnVar, false, u6Var, null);
        }
    }
}
