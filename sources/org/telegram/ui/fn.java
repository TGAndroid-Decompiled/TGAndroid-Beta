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
public final class fn implements org.telegram.ui.Cells.j1 {
    public final un f39420a;

    public fn(un unVar) {
        this.f39420a = unVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        un unVar = this.f39420a;
        unVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        unVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        g(s1Var, true, false, true);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        si siVar;
        int i10;
        MessageObject messageObject = s1Var.getMessageObject();
        ag.r0 r0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            un unVar = this.f39420a;
            qf.c cVar = unVar.Wb;
            if (cVar != null) {
                cVar.a(true);
                unVar.Wb = null;
            }
            if (s1Var.getMessageObject() == null) {
                unVar.Wb = null;
                siVar = null;
            } else {
                siVar = new si(unVar, s1Var.getMessageObject().getId(), s1Var, 1);
                unVar.Wb = siVar;
            }
            i10 = ((org.telegram.ui.ActionBar.r2) this.f39420a).currentAccount;
            bi.ca y3 = bi.ca.y(i10, false);
            Objects.requireNonNull(siVar);
            ui uiVar = new ui(siVar, 8);
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
                r0Var = new ag.r0(y3, ConnectionsManager.getInstance(y3.f4441a).sendRequest(tL_payments_getPaymentForm, new bi.i2(y3, messageObject, tL_inputInvoiceMessage, uiVar, 3)), 3);
            }
            if (r0Var != null) {
                siVar.f47031b = r0Var;
                siVar.d();
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
                    TLRPC.TL_message J7 = un.J7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        J7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        J7.attachPath = message.attachPath;
                    }
                    J7.media = tL_messageExtendedMedia.media;
                    J7.noforwards = true;
                    arrayList.add(new MessageObject(messageObject.currentAccount, J7, false, true));
                }
            }
            if (i11 > -1 && !arrayList.isEmpty()) {
                PhotoViewer u12 = PhotoViewer.u1();
                un unVar2 = this.f39420a;
                u12.M2(null, unVar2, unVar2.f44385qa);
                PhotoViewer.u1().d2(arrayList, i11, this.f39420a.a(), 0L, 0L, this.f39420a.Ta);
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
        un unVar = this.f39420a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            tg.m1 m1Var = new tg.m1(unVar, i10, user, null, null, unVar.f44385qa);
            s1Var.getLocationOnScreen(new int[2]);
            m1Var.f48950v0 = s1Var.getNameStatusX();
            m1Var.f48951w0 = s1Var.getNameStatusY();
            m1Var.f48954z0 = s1Var.getScaleX();
            m1Var.f48952x0 = s1Var.getLeft();
            m1Var.f48953y0 = s1Var.getTop();
            m1Var.A0 = s1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
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
                m1Var.f48949u0 = num;
            } else {
                m1Var.f48949u0 = Integer.valueOf(unVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23614r8[colorId]));
            }
            org.telegram.ui.Components.r5 r5Var = s1Var.f25095fc;
            if (r5Var != null && (r5Var.f32094f[0] instanceof org.telegram.ui.Components.t5)) {
                m1Var.f48954z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(unVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23518m6, 0.2f);
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
                        Integer num2 = m1Var.f48949u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = unVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23690v6);
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
            unVar.showDialog(m1Var);
            return;
        }
        qf.d.r(unVar.getParentActivity(), "https://" + unVar.getMessagesController().linkPrefix + "/nft/" + str);
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
            int i13 = buttonCustom.f19536id;
            TL_stars.StarsAmount starsAmount = null;
            un unVar = this.f39420a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                li.s2 s2Var = new li.s2(21, this, message);
                Pattern pattern = org.telegram.ui.Components.g5.f28418a;
                Activity parentActivity = unVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
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
                frameLayout.addView(editText, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pg(editText, 4), 100L);
                unVar.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, unVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, unVar.e, 5);
                    }
                    bi.s9 s9Var = new bi.s9(this, message, canManageMonoForum, messageObject, 12);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    unVar.n7(s9Var, bg.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                unVar.P7(s1Var, true, false, s1Var.getLastTouchX(), s1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                unVar.f44219d2.n(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final boolean C0(long j10) {
        un unVar = this.f39420a;
        TLRPC.Chat chat = unVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return unVar.getMessagesController().isOwner(unVar.e.f22027id, j10);
        }
        return false;
    }

    @Override
    public final boolean C1(org.telegram.ui.Cells.s1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.C1(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.f39420a;
        unVar.Ja.k(s1Var, unVar, true);
        unVar.f44468x0.I0(false);
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
        un unVar = this.f39420a;
        wh.i iVar = unVar.ja;
        if (iVar != null) {
            HashMap hashMap = iVar.f51261a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(s1Var));
            org.telegram.ui.Components.qc qcVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            wh.h hVar2 = (wh.h) unVar.ja.f51261a.get(wh.i.b(s1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j10 = hVar2.f51258w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.g5.h(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) unVar.J6.f(messageObject.getGroupId())) != null) {
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
                    qcVar = org.telegram.ui.Components.wc.v(unVar.getParentActivity(), unVar, null, 1, j11, 1, unVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), unVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi), 5000, false, i0Var);
                    qcVar.f31888k = true;
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
                ybVar.f34997a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new zl(2, hVar3, viewTreeObserver));
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
        ym ymVar = null;
        ym ymVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        ym ymVar3 = null;
        ym ymVar4 = null;
        un unVar = this.f39420a;
        if (i10 == 19) {
            qf.c cVar = unVar.Wb;
            if (cVar != null) {
                cVar.a(true);
            }
            if (s1Var.getMessageObject() != null) {
                ymVar2 = new ym(this, s1Var, 2);
            }
            final ym ymVar5 = ymVar2;
            unVar.Wb = ymVar5;
            final Activity parentActivity = unVar.getParentActivity();
            final org.telegram.ui.ActionBar.u6 resourceProvider = unVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ymVar5.d();
            ymVar5.f47031b = new vg.e(atomicBoolean, 0);
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
            vg.s.d(messageObject, new Utilities.Callback(atomicBoolean, ymVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f50167a;
                public final qf.c f50168b;
                public final boolean f50169c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f50170f;
                public final u6 f50171g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f50170f = parentActivity;
                    this.f50171g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f50167a.get()) {
                        this.f50168b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f50169c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f50170f;
                        u6 u6Var = this.f50171g;
                        if (z12) {
                            j.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, u6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            j.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, u6Var);
                        }
                    }
                }
            }, new vg.g(atomicBoolean, ymVar5, 0));
        } else if (i10 == 21) {
            f();
        } else if (i10 == 84) {
            unVar.Da(s1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.x8 x8Var = org.telegram.ui.Components.nh0.R;
            if (unVar.getParentActivity() != null) {
                unVar.showDialog(new org.telegram.ui.Components.nh0(unVar.getContext(), unVar.getCurrentAccount(), messageObject, unVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                    unVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
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
                bundle.putLong("user_id", user.f22174id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                unVar.presentFragment(new ProfileActivity(bundle, null));
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
                unVar.showDialog(new org.telegram.ui.Components.jf0(unVar, null, user, null, file, kf.b.d(str, false), str3, str4, unVar.f44385qa));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            unVar.presentFragment(new un(a1.g.h(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.vh.g(new StringBuilder("+"), user2.phone, kf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = kf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f22174id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                unVar.presentFragment(new js(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                unVar.T9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    qf.c cVar2 = unVar.Wb;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        ymVar3 = new ym(this, s1Var, 4);
                    }
                    unVar.Wb = ymVar3;
                    qf.d.q(unVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, unVar.Wb, null, false, unVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                            unVar.getOrCreateStoryViewer().F(unVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.q7.a(unVar.f44468x0));
                            return;
                        }
                    }
                }
                if (!unVar.oa(storyMentionWebpage.url, s1Var, null, messageObject.getId(), 2)) {
                    qf.c cVar3 = unVar.Wb;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (s1Var.getMessageObject() != null) {
                        ymVar4 = new ym(this, s1Var, 5);
                    }
                    unVar.Wb = ymVar4;
                    qf.d.q(unVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, unVar.Wb, null, false, true, false);
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
                qf.c cVar4 = unVar.Wb;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (s1Var.getMessageObject() != null) {
                    ymVar = new ym(this, s1Var, 3);
                }
                unVar.Wb = ymVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        unVar.Wb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        unVar.Wb.f47031b = new ag.r0(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new fi.m3(4, this, z11)), 29);
                        return;
                    }
                }
                qf.d.q(unVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, unVar.Wb, null, false, true, false);
            }
        }
    }

    @Override
    public final cv0 E1() {
        return this.f39420a.Ia;
    }

    @Override
    public final void F(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ni.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.vh.m(R.string.CodeCopied, org.telegram.ui.Components.wc.b0(this.f39420a));
        }
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        un unVar = this.f39420a;
        unVar.getSendMessagesHelper().sendCallback(true, s1Var.getMessageObject(), keyboardInlineButton, unVar);
    }

    @Override
    public final boolean G1(long j10) {
        un unVar = this.f39420a;
        TLRPC.Chat chat = unVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return unVar.getMessagesController().isAdmin(unVar.e.f22027id, j10);
        }
        return false;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.H1(org.telegram.ui.Cells.s1, int, float, float, boolean):void");
    }

    @Override
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f39420a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        this.f39420a.b8(characterStyle, z10, s1Var.getMessageObject(), s1Var);
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.s1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.I1(org.telegram.ui.Cells.s1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
        boolean z10 = s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        un unVar = this.f39420a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) s1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (unVar.f44249f6 != j10) {
                unVar.presentFragment(un.ba(j10));
            } else {
                unVar.f44327m1.e(false, false);
            }
        }
        if (s1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            unVar.presentFragment(ProfileActivity.t4(((TLRPC.TL_messageMediaGiveawayResults) s1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
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
            un unVar = this.f39420a;
            if (!unVar.Fc && messageObject.getId() == unVar.Ec) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - unVar.Gc > 1000) {
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
            this.f39420a.qb(messageObject, true);
        }
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.f39420a;
        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(unVar.f44249f6), s1Var);
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = s1Var.getCurrentUser();
        un unVar = this.f39420a;
        if (AndroidUtilities.isContextSafe(unVar.getParentActivity()) && (chat = unVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            e(s1Var, unVar.getMessagesController().getParticipant(unVar.e.f22027id, currentUser.f22174id));
        }
    }

    @Override
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = s1Var.getMessageObject().isForwarded();
        un unVar = this.f39420a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            b02.R(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!s1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(s1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(unVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            b03.R(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!unVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(unVar).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new qm(this, 9))).k(true);
            return false;
        } else {
            unVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(unVar.e, unVar.f44322l8, true), s1Var.getMessageObject(), todoItem, z10, null);
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
            un unVar = this.f39420a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = unVar.f44468x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = unVar.f44468x0.getChildAt(i11);
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
            unVar.Vb(messageObject, spannableStringBuilder, 1);
            s1Var.i4(1, false, true);
        }
    }

    @Override
    public final boolean M() {
        un unVar = this.f39420a;
        if (unVar.f44285i6[1].size() + unVar.f44285i6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
        Bundle h = a1.g.h(j10, "user_id");
        org.telegram.ui.ActionBar.r2 r2Var = this.f39420a;
        if (r2Var.getMessagesController().checkCanOpenChat(h, r2Var, s1Var.getMessageObject())) {
            r2Var.presentFragment(new un(h));
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (s1Var != null) {
            un unVar = this.f39420a;
            if (unVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(unVar.e);
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
        un unVar = this.f39420a;
        if (!UserObject.isReplyUser(unVar.f44242f) && !UserObject.isUserSelf(unVar.f44242f)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.f39420a;
        if (unVar.Sb != 0 && s1Var.getMessageObject() != null && unVar.Sb == s1Var.getMessageObject().getId() && unVar.Tb == i10) {
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
        un unVar = this.f39420a;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (!kVar.q() && !unVar.J9()) {
            if (!z10 && chat.signature_profiles && (messageObject = s1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                unVar.xa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                o(s1Var, chat, i10, z10);
                return;
            }
        }
        un.e2(unVar, s1Var, true, f7, f10);
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
            un unVar = this.f39420a;
            if (unVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer u12 = PhotoViewer.u1();
                    u12.M2(null, unVar, null);
                    return u12.g2(null, null, null, null, null, null, null, indexOf, new pm(unVar, arrayList), null, 0L, 0L, 0L, true, new om(richMessage, arrayList, messageObject), null);
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
        this.f39420a.Ec(primaryMessageObject, false);
    }

    @Override
    public final int S() {
        return this.f39420a.f44221d4;
    }

    @Override
    public final boolean S0(MessageObject messageObject) {
        fm fmVar;
        int i10 = (messageObject.getDialogId() > 1271266957L ? 1 : (messageObject.getDialogId() == 1271266957L ? 0 : -1));
        un unVar = this.f39420a;
        if ((i10 == 0 || ((fmVar = unVar.A0) != null && fmVar.N)) && unVar.f44221d4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void U0() {
        un unVar = this.f39420a;
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, unVar.f44249f6, null);
    }

    @Override
    public final jh.a V() {
        return this.f39420a.f44338mc;
    }

    @Override
    public final void V1() {
        this.f39420a.z9();
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
            un unVar = this.f39420a;
            if (unVar.f44221d4 != 1 && !unVar.H9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        un unVar = this.f39420a;
        if (!unVar.I9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (unVar.getParentActivity() != null) {
                if (unVar.f44178a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    hk hkVar = unVar.Y;
                    MessageObject messageObject = s1Var.getMessageObject();
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    ri riVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    qf.c cVar = unVar.Wb;
                    if (cVar != null) {
                        cVar.a(true);
                        unVar.Wb = null;
                    }
                    if (str != null && s1Var.getMessageObject() != null) {
                        ri riVar2 = new ri(unVar, s1Var.getMessageObject().getId(), str, s1Var, 1);
                        unVar.Wb = riVar2;
                        riVar = riVar2;
                    } else {
                        unVar.Wb = null;
                    }
                    hkVar.Z(keyboardButtonProto, messageObject, messageObject2, riVar);
                }
            }
        }
    }

    @Override
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f39420a.d8(s1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        a5 b10;
        int i11;
        lk lkVar;
        kk kkVar;
        if (!k()) {
            return false;
        }
        un unVar = this.f39420a;
        if (unVar.e != null && (((lkVar = unVar.f44178a1) == null || lkVar.getVisibility() != 0) && ((kkVar = unVar.R) == null || kkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && ((unVar.f44370p4 == 0 || unVar.f44419t4) && (!ChatObject.isChannel(chat) || unVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        g5[] g5VarArr = new g5[r22 + 2 + r42];
        g5VarArr[0] = g5.d;
        g5VarArr[1] = g5.h;
        char c10 = 2;
        if (r22 != 0) {
            g5VarArr[2] = g5.f39543n;
            c10 = 3;
        }
        if (r42 != 0) {
            g5VarArr[c10] = g5.f39544r;
        }
        TLRPC.UserFull userFull = unVar.getMessagesController().getUserFull(user.f22174id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            b10 = a5.b(user, i10, g5VarArr);
        } else {
            b10 = a5.c(user, userFull, g5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                b10 = a5.b(user, i11, g5VarArr);
            }
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) unVar.fragmentView, unVar.f44385qa, b10, new e7(this, s1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(unVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final fn f43535b;

            {
                this.f43535b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f43535b.y(user, false);
                        return;
                    case 1:
                        this.f43535b.b(user);
                        return;
                    default:
                        this.f43535b.f39420a.wa(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new q1(this, s1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final fn f43535b;

            {
                this.f43535b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f43535b.y(user, false);
                        return;
                    case 1:
                        this.f43535b.b(user);
                        return;
                    default:
                        this.f43535b.f39420a.wa(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final fn f43535b;

            {
                this.f43535b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f43535b.y(user, false);
                        return;
                    case 1:
                        this.f43535b.b(user);
                        return;
                    default:
                        this.f43535b.f39420a.wa(user);
                        return;
                }
            }
        }, r42);
        H.f29867t = false;
        H.f29848i = 3;
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
        un unVar = this.f39420a;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
        if (z10 && unVar.V9) {
            j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
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
        un unVar = this.f39420a;
        try {
            if (i10 == 0) {
                unVar.o7();
                dl dlVar = unVar.L3;
                if (dlVar != null) {
                    dlVar.l(0L, 84, null, new qm(this, 1));
                    unVar.L3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(unVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (unVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.l41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.l41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.wc.b0(unVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                unVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(unVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", unVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new qm(this, 2));
                } else if (unVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new qm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                b02.getClass();
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), b02.f34407c);
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
                ybVar.f34998b.setText(append2);
                ybVar.f34998b.setSingleLine(false);
                ybVar.f34998b.setMaxLines(6);
                b02.b(ybVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
        if (s1Var != null && document != null) {
            un unVar = this.f39420a;
            if (unVar.getParentLayout() != null && W(s1Var)) {
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(unVar, s1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new q1(this, s1Var, document, 24), false);
                H.f29867t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void Z1() {
        un unVar = this.f39420a;
        if (unVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", unVar.f44249f6);
            bundle.putInt("start_from", 10);
            unVar.presentFragment(new org.telegram.ui.Components.ta0(bundle, unVar.f44327m1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.wc.b0(unVar).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", unVar.getMessagesController().recommendedChannelsLimitPremium), new qm(this, 4))).j();
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.f39420a;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            CharSequence fieldText = hkVar.getFieldText();
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
                unVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new qm(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean a0() {
        if (this.f39420a.f44221d4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        un unVar = this.f39420a;
        fi.v3 v3Var = unVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (unVar.getParentActivity() != null && (messageObject = s1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            fi.v3 v3Var2 = new fi.v3(unVar.getParentActivity(), 3);
            v3Var2.p(true);
            v3Var2.K = Layout.Alignment.ALIGN_NORMAL;
            v3Var2.d = -1L;
            v3Var2.T = true;
            v3Var2.e = true;
            v3Var2.q(12.0f);
            unVar.M1 = v3Var2;
            v3Var2.f11798l0 = new ed(20, this, v3Var2);
            v3Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            unVar.f44292j1.addView(unVar.M1, org.telegram.ui.Components.gb1.h(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            unVar.f44292j1.post(new i2.b0(this, s1Var, i11, i10, 4));
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        un unVar = this.f39420a;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            CharSequence fieldText = hkVar.getFieldText();
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
                spannableString.setSpan(new org.telegram.ui.Components.a71("" + user.f22174id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            unVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new qm(this, 7), 200L);
        }
    }

    @Override
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        this.f39420a.P7(s1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final org.telegram.ui.Cells.t9 b2() {
        return this.f39420a.f44362o9;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        un unVar = this.f39420a;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (!kVar2.q() && !unVar.J9()) {
                z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
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
        un unVar = this.f39420a;
        if (unVar.Tc.f19327f && (cVar = unVar.Zc) != null && cVar.f48619n == s1Var && cVar.f48615a.getWidth() > 0) {
            return unVar.Zc.f48615a.getHeight();
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
        un unVar = this.f39420a;
        if (unVar.getParentActivity() != null) {
            if (unVar.ja == null) {
                wh.i iVar = new wh.i(unVar.getParentActivity());
                unVar.ja = iVar;
                unVar.f44292j1.addView(iVar, org.telegram.ui.Components.gb1.i(-1, -1, 48));
            }
            wh.i iVar2 = unVar.ja;
            HashMap hashMap = iVar2.f51261a;
            ArrayList arrayList = iVar2.f51263c;
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
                    long j12 = dialog.f22031id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f22031id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f22031id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f22174id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22031id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22031id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22031id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22031id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22031id));
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
                wh.h hVar = new wh.h(iVar2, s1Var, arrayList4, new vi.i0(1, iVar2, b10));
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
        un unVar = this.f39420a;
        unVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(unVar.getParentActivity()) && (chat = unVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == unVar.getUserConfig().getClientUserId()) {
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
                    if (channelParticipant2.promoted_by == unVar.getUserConfig().getClientUserId()) {
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
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                org.telegram.ui.Components.i11.b(parentActivity, i10, -unVar.e.f22027id, currentUser, str2, z15, z16, z12, u6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == unVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(unVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                unVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(unVar.e);
                tL_channels_getParticipant.participant = unVar.getMessagesController().getInputPeer(currentUser.f22174id);
                unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bi.m5(11, this, s1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
            org.telegram.ui.Components.i11.b(parentActivity2, i10, -unVar.e.f22027id, currentUser, str2, z152, z162, z12, u6Var);
        }
    }

    @Override
    public final boolean e0() {
        boolean z10;
        un unVar = this.f39420a;
        if (!unVar.J9()) {
            z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
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
        un unVar = this.f39420a;
        if (isHuaweiStoreApp) {
            qf.d.r(unVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(unVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        wh.i iVar = this.f39420a.ja;
        if (iVar != null && (hVar = (wh.h) iVar.f51261a.get(wh.i.b(s1Var))) != null) {
            wh.d[] dVarArr = hVar.f51258w;
            RectF rectF = hVar.f51256r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = wh.g.f51243a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(wh.g.f51243a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = a8.ee.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f51250a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        wh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f51222p != z10) {
                            ValueAnimator valueAnimator = dVar.f51220n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f51222p = z10;
                            float f15 = dVar.f51221o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f51220n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f51220n.addUpdateListener(dVar);
                            dVar.f51220n.setInterpolator(wh.f.f51226a);
                            dVar.f51220n.start();
                        }
                        wh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f51219m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f51217k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f51219m = z11;
                            float f16 = dVar2.f51218l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f51217k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f51217k.addUpdateListener(dVar2);
                            dVar2.f51217k.setInterpolator(wh.f.f51226a);
                            dVar2.f51217k.start();
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
        rj rjVar;
        if (s1Var == null || (primaryMessageObject = s1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        un unVar = this.f39420a;
        oj ojVar = unVar.f44468x0;
        if (ojVar != null && (rjVar = unVar.f44493z0) != null && rjVar.f47714y < 0) {
            for (int childCount = ojVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = unVar.f44468x0.getChildAt(childCount);
                unVar.f44468x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = unVar.V8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i11 = unVar.V8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                rj rjVar2 = unVar.f44493z0;
                unVar.f44468x0.getClass();
                rjVar2.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) unVar.E9), false);
            } else {
                unVar.f44493z0.h1(i10, i11);
            }
        }
        unVar.Z0 = z11;
        unVar.Ec(primaryMessageObject, false);
        unVar.Z0 = false;
    }

    @Override
    public final void g0(String str) {
        un unVar = this.f39420a;
        lk lkVar = unVar.f44178a1;
        if (lkVar == null || lkVar.getVisibility() != 0) {
            kk kkVar = unVar.R;
            if ((kkVar == null || kkVar.getVisibility() != 0) && unVar.Y != null && str != null && str.length() > 0) {
                hk hkVar = unVar.Y;
                hkVar.setFieldText("@" + str + " ");
                unVar.Y.F0();
            }
        }
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        un unVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (unVar = this.f39420a).Sb) != 0 && i10 == s1Var.getMessageObject().getId() && unVar.Tb == 3) {
            return unVar.Vb;
        }
        return null;
    }

    @Override
    public final boolean h0(org.telegram.ui.Components.c6 c6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        un unVar = this.f39420a;
        if (!unVar.getMessagesController().premiumFeaturesBlocked() && c6Var != null && !c6Var.standard) {
            long documentId = c6Var.getDocumentId();
            TLRPC.Document document = c6Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                document = org.telegram.ui.Components.t5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.aw awVar = new org.telegram.ui.Components.aw(unVar, unVar.getParentActivity(), unVar.f44385qa, arrayList);
                org.telegram.ui.Components.qv qvVar = awVar.f26625f;
                qvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(qvVar);
                qvVar.v = imageReceiver;
                if (qvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                qvVar.f32034w = true;
                qvVar.f32035x.d(1.0f, true);
                qvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23518m6, 0.2f, true), 0L, null, null, 0);
                qvVar.v.setLayerNum(7);
                qvVar.v.setAllowStartLottieAnimation(true);
                qvVar.v.setAllowStartAnimation(true);
                qvVar.v.setAutoRepeat(1);
                qvVar.v.setAllowDecodeSingleFrame(true);
                qvVar.v.setParentView(qvVar);
                awVar.setCalcMandatoryInsets(unVar.F9());
                unVar.showDialog(awVar);
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
            un unVar = this.f39420a;
            if (a10) {
                org.telegram.ui.Components.wc.b0(unVar).R(R.raw.e_hand_2, 36, sh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                unVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                s1Var.R0(true);
            } else if (unVar.getParentActivity() != null) {
                if (unVar.f44495z2 == null) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(5, unVar.getParentActivity(), unVar.f44385qa, false);
                    unVar.f44495z2 = t40Var;
                    t40Var.setAlpha(0.0f);
                    unVar.f44495z2.setVisibility(4);
                    int indexOfChild = unVar.f44292j1.indexOfChild(unVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    unVar.f44292j1.addView(unVar.f44495z2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.q1> pollButtons = s1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i16);
                            float y3 = ((s1Var.getY() + q1Var.f24789b) - AndroidUtilities.dp(4.0f)) - unVar.E9;
                            unVar.C2 = AndroidUtilities.dp(13.3f) + q1Var.f24788a;
                            int w10 = d3.w(6.0f, q1Var.f24789b, i12);
                            unVar.D2 = w10;
                            if (y3 > 0.0f) {
                                i15 = unVar.C2;
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
                        unVar.f44468x0.w0(0, (int) f7, null);
                        unVar.B2 = s1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                unVar.f44495z2.e(s1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void j() {
        f();
    }

    @Override
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        un unVar = this.f39420a;
        unVar.P7(s1Var, false, false, f7, f10, true, false, false);
        unVar.f44468x0.getClass();
        un.f2(unVar, RecyclerView.R(s1Var));
    }

    public final boolean k() {
        un unVar = this.f39420a;
        if (!UserObject.isUserSelf(unVar.f44242f)) {
            TLRPC.Chat chat = unVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !unVar.e.megagroup) {
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
        un unVar = this.f39420a;
        if (unVar.f44292j1.getMeasuredWidth() > unVar.f44292j1.getMeasuredHeight()) {
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
            un unVar = this.f39420a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(unVar)) {
                    pc0 pc0Var = new pc0(3);
                    u6Var2 = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                    pc0Var.setResourceProvider(u6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = unVar.getMessagesController().getPeer(unVar.a());
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
                    pc0Var.N0 = false;
                    pc0Var.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    unVar.presentFragment(pc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                ft.o().u(unVar.getParentActivity());
                ft.o().t(new dn(this, tL_messageMediaPoll, pollAnswer, s1Var));
                ft o10 = ft.o();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = s1Var.getMessageObject();
                u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
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
                    TLRPC.TL_message J7 = un.J7(message);
                    J7.media = messageMedia;
                    J7.attachPath = sh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i17, J7, false, true);
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
                    i15 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i15, messageObject, document6, sh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f48611g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = s1Var.f25363y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            sh.g gVar = s1Var.f25046c6;
                            if (gVar != null) {
                                gVar.d();
                            }
                            sh.g gVar2 = s1Var.f25031b6;
                            if (gVar2 != null) {
                                gVar2.d();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f48610f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = s1Var.f25363y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            sh.g gVar3 = s1Var.f25046c6;
                            if (gVar3 != null) {
                                gVar3.d();
                            }
                            sh.g gVar4 = s1Var.f25031b6;
                            if (gVar4 != null) {
                                gVar4.d();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message J72 = un.J7(message2);
                        J72.media = messageMedia;
                        J72.attachPath = sh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, J72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.u1().M2(null, unVar, unVar.f44385qa);
                            PhotoViewer u12 = PhotoViewer.u1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = unVar.f44249f6;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = unVar.X6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = unVar.b();
                            }
                            u12.h2(messageObject6, unVar, j10, j11, j12, unVar.Sa);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, unVar.getParentActivity(), unVar.f44385qa, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            unVar.E6(messageObject6);
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
                    TLRPC.TL_message J73 = un.J7(message3);
                    J73.media = messageMedia3;
                    J73.attachPath = sh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, J73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message J74 = un.J7(message3);
                    J74.media = messageMedia2;
                    J74.attachPath = sh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    J74.message = pollResults2.solution;
                    J74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, J74, false, true));
                    arrayList2.add(-3);
                }
                bg.d.b(tL_messageMediaPoll.poll, unVar.getUserConfig().getClientUserId());
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
                        TLRPC.TL_message J75 = un.J7(message3);
                        J75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        J75.message = tL_textWithEntities2.text;
                        J75.entities = tL_textWithEntities2.entities;
                        J75.attachPath = sh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, J75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.u1().M2(null, unVar, unVar.f44385qa);
                    PhotoViewer.u1().d2(arrayList3, i11, unVar.a(), 0L, 0L, unVar.Ta);
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
        un unVar = this.f39420a;
        if (!unVar.f44471x3 && unVar.f44468x0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
            if (unVar.G2 == null) {
                mm mmVar = unVar.f44292j1;
                int indexOfChild = mmVar.indexOfChild(unVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, unVar.getParentActivity(), unVar.f44385qa, false);
                    unVar.G2 = t40Var;
                    mmVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    unVar.G2.setAlpha(0.0f);
                    unVar.G2.setVisibility(4);
                } else {
                    return;
                }
            }
            unVar.G2.e(s1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.f39420a;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        boolean z10 = true;
        if (!kVar.q() && !unVar.J9()) {
            if (s1Var.getMessageObject() != null && s1Var.getMessageObject().isSponsored()) {
                E0(10, s1Var);
                return;
            }
            if (!ChatObject.isForum(unVar.e) && !unVar.O9()) {
                z10 = false;
            }
            y(user, z10);
            return;
        }
        un.e2(unVar, s1Var, true, f7, f10);
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
        un.W4(this.f39420a, s1Var);
    }

    @Override
    public final void n() {
        this.f39420a.f44292j1.getClass();
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
            org.telegram.ui.ActionBar.r2 r2Var = this.f39420a;
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
        un unVar = this.f39420a;
        TLRPC.Chat chat2 = unVar.e;
        if (chat2 != null && chat.f22027id == chat2.f22027id) {
            ij ijVar = unVar.f44327m1;
            if (ijVar != null && i10 == 0) {
                ijVar.e(false, false);
            } else if (s1Var.getMessageObject() != null) {
                unVar.j(i10, s1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f22027id != chat2.f22027id || unVar.O9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22027id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            si siVar = null;
            if (z10) {
                qf.c cVar = unVar.Wb;
                if (cVar != null) {
                    cVar.a(true);
                    unVar.Wb = null;
                }
                if (s1Var.getMessageObject() == null) {
                    unVar.Wb = null;
                } else {
                    si siVar2 = new si(unVar, s1Var.getMessageObject().getId(), s1Var, 0);
                    unVar.Wb = siVar2;
                    siVar = siVar2;
                }
            }
            if (unVar.getMessagesController().checkCanOpenChat(bundle, unVar, s1Var.getMessageObject(), siVar)) {
                un unVar2 = new un(bundle);
                if (siVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new bi.sb(this, siVar, chat, i10, unVar2, 18), 5000L);
                    siVar.d();
                    return;
                }
                unVar.presentFragment(unVar2);
            }
        }
    }

    @Override
    public final void o0(org.telegram.ui.Cells.s1 r46, float r47, float r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.o0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn.p(org.telegram.ui.Cells.s1):void");
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
        lk lkVar;
        kk kkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        un unVar = this.f39420a;
        if (!isEmpty && unVar.e != null && (((lkVar = unVar.f44178a1) == null || lkVar.getVisibility() != 0) && ((kkVar = unVar.R) == null || kkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = unVar.e;
        if (chat2 != null && ((unVar.f44370p4 == 0 || unVar.f44419t4) && (!ChatObject.isChannel(chat2) || unVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = unVar.e;
        if (chat3 != null && chat3.f22027id == chat.f22027id && !unVar.O9()) {
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
                g5Var = g5.f39542f;
            }
            g5VarArr[1] = g5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            g5VarArr[i13] = g5.f39543n;
            i13++;
        }
        if (i11 != 0) {
            g5VarArr[i13] = g5.f39544r;
        }
        TLRPC.ChatFull chatFull = unVar.getMessagesController().getChatFull(chat.f22027id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
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
            c2.b.m().y((ViewGroup) unVar.fragmentView, unVar.f44385qa, a5Var, new e7(this, chat, s1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(unVar, s1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new tm(this, chat, 0), false);
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
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new tm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new tm(this, chat, 2), i16);
        H.f29867t = false;
        H.f29848i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }

    @Override
    public final void q() {
        this.f39420a.kc();
    }

    @Override
    public final boolean q0(MessageObject messageObject) {
        return !this.f39420a.f44401s.containsKey(messageObject);
    }

    @Override
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        un unVar = this.f39420a;
        if (!unVar.I9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (unVar.getParentActivity() != null) {
                if (unVar.f44178a1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) unVar.f44385qa, false);
                        k3Var.fixNavigationBar();
                        k3Var.title = str;
                        k3Var.bigTitle = false;
                        k3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        ng.j jVar = new ng.j(3, unVar, str);
                        k3Var.items = charSequenceArr;
                        k3Var.onClickListener = jVar;
                        unVar.showDialog(k3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        unVar.ja(null, tL_inlineButtonTypeUrl.url, true, s1Var, s1Var.getMessageObject());
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
        rj rjVar;
        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            un unVar = this.f39420a;
            oj ojVar = unVar.f44468x0;
            if (ojVar != null && (rjVar = unVar.f44493z0) != null && rjVar.f47714y < 0) {
                for (int childCount = ojVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = unVar.f44468x0.getChildAt(childCount);
                    unVar.f44468x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = unVar.V8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i11 = unVar.V8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            unVar.Ec(primaryMessageObject, false);
            fi.v3 v3Var = unVar.M1;
            if (v3Var != null) {
                v3Var.e(true);
            }
            if (i10 >= 0 && s1Var.getCurrentMessagesGroup() == null) {
                unVar.f44493z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar = this.f39420a.Zc;
        if (cVar != null && cVar.f48619n == s1Var) {
            cVar.f48622w.getClass();
        }
    }

    @Override
    public final boolean r1() {
        un unVar = this.f39420a;
        if (unVar.f44292j1.getKeyboardHeight() + unVar.Aa >= AndroidUtilities.dp(20.0f)) {
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
        un unVar = this.f39420a;
        unVar.ka(unVar.e.f22027id, messageObject2, messageObject2.getId(), j11, i11, 0, null);
    }

    @Override
    public final void s0() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.g6 animation;
        un unVar = this.f39420a;
        if (!unVar.f44471x3 && !SharedConfig.noSoundHintShowed && unVar.f44468x0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
            org.telegram.ui.Components.t40 t40Var = unVar.F2;
            if (t40Var == null || t40Var.getTag() == null) {
                if (unVar.F2 == null) {
                    mm mmVar = unVar.f44292j1;
                    int indexOfChild = mmVar.indexOfChild(unVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(0, unVar.getParentActivity(), unVar.f44385qa, false);
                        unVar.F2 = t40Var2;
                        t40Var2.setShowingDuration(10000L);
                        mmVar.addView(unVar.F2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        unVar.F2.setAlpha(0.0f);
                        unVar.F2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = unVar.f44468x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = unVar.f44468x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = s1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && unVar.F2.e(s1Var, null, 0, 0, true)) {
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
        un unVar = this.f39420a;
        unVar.f44371p5 = messageObject;
        unVar.n9();
    }

    public final void t(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22174id);
            org.telegram.ui.ActionBar.r2 r2Var = this.f39420a;
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var, s1Var.getMessageObject())) {
                r2Var.presentFragment(new un(bundle));
            }
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        un unVar = this.f39420a;
        if (unVar.getParentActivity() != null && tLObject != null) {
            j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
                if (((ActionBarLayout) j5Var2).x()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22027id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f22174id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, unVar.getParentActivity(), unVar.getResourceProvider());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, unVar.getResourceProvider());
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(unVar.getParentActivity(), false, false);
                g1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(unVar.getParentActivity(), false, false);
                g1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, s1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                un unVar2 = new un(bundle);
                unVar2.V9 = true;
                unVar.presentFragmentAsPreviewWithMenu(unVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                unVar.k7();
                return;
            }
            unVar.presentFragment(new un(bundle));
        }
    }

    @Override
    public final String u(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        un unVar = this.f39420a;
        if (UserObject.isBotForum(unVar.f44242f)) {
            return null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = unVar.getMessagesController().getAdminRank(unVar.e.f22027id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = unVar.f44357o4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        MessageObject messageObject = s1Var.getMessageObject();
        int i10 = messageObject.type;
        un unVar = this.f39420a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(unVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = unVar.getMessagesController().conferenceCallSizeLimit;
                e2Var.setOnCancelListener(new bi.f0(this, unVar.getConnectionsManager().sendRequest(getgroupcall, new bi.n9(this, e2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                e2Var.r(600L);
                return;
            }
            TLRPC.User user = unVar.f44242f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = unVar.f44334m8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.g2.m(user, isVideoCall, i11, unVar.getParentActivity(), unVar.getMessagesController().getUserFull(unVar.f44242f.f22174id), unVar.getAccountInstance());
                return;
            }
            return;
        }
        unVar.P7(s1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void u1(MessageObject messageObject) {
        this.f39420a.f44401s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            s1Var.t2();
            s1Var.requestLayout();
            this.f39420a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        bn bnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && qf.d.g(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        un unVar = this.f39420a;
        qf.c cVar = unVar.Wb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (s1Var.getMessageObject() == null) {
            bnVar = null;
        } else {
            bnVar = new bn(this, s1Var);
        }
        unVar.Wb = bnVar;
        if (!z11 && !qf.d.e(parse, false, null)) {
            org.telegram.ui.Components.g5.q0(unVar, str, true, true, true, !z11, unVar.Wb, webPage, unVar.f44385qa);
        } else {
            qf.d.q(unVar.getParentActivity(), parse, true, true, false, unVar.Wb, null, false, true, false);
        }
    }

    public final void w(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22027id);
            bundle.putBoolean("expandPhoto", false);
            this.f39420a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            un unVar = this.f39420a;
            if ((unVar.Sb != id2 || unVar.Tb != 7) && (inputPeer = unVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f22247id = id2;
                qf.c cVar = unVar.Wb;
                if (cVar != null) {
                    cVar.a(true);
                    unVar.Wb = null;
                }
                si siVar = new si(unVar, id2, s1Var, 2);
                siVar.f47031b = new ed(8, unVar, r3);
                unVar.Wb = siVar;
                siVar.d();
                int[] iArr = {unVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new bi.t3(unVar, siVar, iArr, s1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        un unVar;
        int i10;
        if (s1Var.getMessageObject() != null && (i10 = (unVar = this.f39420a).Sb) != 0 && i10 == s1Var.getMessageObject().getId() && unVar.Tb == 1) {
            return unVar.Ub;
        }
        return null;
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
        un unVar = this.f39420a;
        if (!unVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, null);
            e2Var.r(200L);
            unVar.getMessagesController().getContentSettings(new y(this, e2Var, s1Var, 6));
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
            un unVar = this.f39420a;
            org.telegram.ui.Components.dv.I(unVar, messageObject, unVar.Sa, str2, str3, str4, str, i10, i11, -1, unVar.F9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void y(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f22174id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22174id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            un unVar = this.f39420a;
            TLRPC.User user2 = unVar.f44242f;
            if (user2 != null && user2.f22174id == user.f22174id) {
                i11 = 1;
            }
            profileActivity.X4(i11);
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            unVar.presentFragment(profileActivity);
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
        a41 a41Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f39420a.A0.L();
                    un unVar = this.f39420a;
                    return mediaController.setPlaylist(L, messageObject, unVar.X6, true ^ unVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f39420a.Y7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            c41 c41Var = this.f39420a.f44324la;
            if (c41Var == null || c41Var.f38249b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.wc.b0(this.f39420a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f39420a.f44324la = new c41(this.f39420a.getParentActivity());
                c41 c41Var2 = this.f39420a.f44324la;
                if (!messageObject.isOutOwner()) {
                    teVar = this.f39420a.qb(messageObject, true);
                } else {
                    teVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    i0Var = un.R4(this.f39420a, messageObject);
                } else {
                    i0Var = null;
                }
                Context context = c41Var2.f38246a;
                bh.p pVar2 = c41Var2.f38250c;
                c41Var2.X = teVar;
                c41Var2.Y = i0Var;
                a41 a41Var2 = c41Var2.N;
                if (a41Var2 != null) {
                    pVar2.removeView(a41Var2);
                    c41Var2.N = null;
                }
                c41Var2.O = s1Var;
                MessageObject messageObject2 = s1Var.getMessageObject();
                c41Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c41Var2.S = z10;
                org.telegram.ui.Cells.s1 s1Var2 = c41Var2.O;
                if (s1Var2 != null) {
                    u6Var = s1Var2.getResourcesProvider();
                } else {
                    u6Var = null;
                }
                c41Var2.L = u6Var;
                if (c41Var2.O != null) {
                    c41Var2.T = 0.0f;
                    c41Var2.U = s1Var.f25195n;
                    if (s1Var.getParent() instanceof View) {
                        View view = (View) s1Var.getParent();
                        c41Var2.T = view.getY() + c41Var2.T;
                        c41Var2.U = view.getY() + c41Var2.U;
                    }
                    int width = c41Var2.O.getWidth();
                    int height = c41Var2.O.getHeight();
                    if (c41Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    c41Var2.K = i14 - c41Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    pVar = pVar2;
                    a41 a41Var3 = new a41(c41Var2, c41Var2.getContext(), UserConfig.selectedAccount, c41Var2.O.getResourcesProvider(), width, i14);
                    c41Var2.N = a41Var3;
                    c41Var2.O.j1(a41Var3);
                    c41Var2.N.i1(c41Var2.O);
                    c41Var2.N.setDelegate(new Object());
                    a41 a41Var4 = c41Var2.N;
                    MessageObject messageObject3 = c41Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = c41Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.s1 s1Var3 = c41Var2.O;
                    a41Var4.Z3(messageObject3, currentMessagesGroup, s1Var3.F, s1Var3.E, false, false);
                    if (!c41Var2.S) {
                        org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8();
                        c41Var2.V = n8Var;
                        a41 a41Var5 = c41Var2.N;
                        n8Var.f30909i = a41Var5;
                        a41Var5.f25097fe = n8Var;
                        if (a41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.pp0 seekBarWaveform = c41Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = c41Var2.f38257s;
                            org.telegram.ui.Cells.s1 s1Var4 = seekBarWaveform.f31683n;
                            if (s1Var4 != null) {
                                s1Var4.invalidate();
                            }
                        }
                    }
                    c41Var2.H = false;
                    pVar.addView(c41Var2.N, new FrameLayout.LayoutParams(c41Var2.O.getWidth(), i14, 17));
                } else {
                    pVar = pVar2;
                    i10 = 360;
                }
                TextureView textureView = c41Var2.P;
                if (textureView != null) {
                    pVar.removeView(textureView);
                    c41Var2.P = null;
                }
                if (c41Var2.S) {
                    c41Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    c41Var2.P = textureView2;
                    pVar.addView(textureView2, 0, org.telegram.ui.Components.gb1.g(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.s81 s81Var = c41Var2.f38258w;
                if (s81Var != null) {
                    s81Var.B();
                    c41Var2.f38258w.H();
                    c41Var2.f38258w = null;
                }
                org.telegram.ui.Cells.s1 s1Var5 = c41Var2.O;
                if (s1Var5 != null && s1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(c41Var2.O.getMessageObject().currentAccount).getPathToAttach(c41Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(c41Var2.O.getMessageObject().currentAccount).getPathToMessage(c41Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && c41Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(c41Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.s81 s81Var2 = new org.telegram.ui.Components.s81();
                        c41Var2.f38258w = s81Var2;
                        s81Var2.J = new b41(c41Var2);
                        if (c41Var2.V != null) {
                            s81Var2.K = new b41(c41Var2);
                        }
                        if (c41Var2.S) {
                            s81Var2.V(c41Var2.P);
                        }
                        c41Var2.f38258w.D(Uri.fromFile(pathToAttach), "other");
                        c41Var2.f38258w.C();
                        org.telegram.ui.Components.tt ttVar = c41Var2.E;
                        if (ttVar != null) {
                            ttVar.f33144s = c41Var2.f38258w;
                            ttVar.a();
                        }
                    }
                    un unVar2 = this.f39420a;
                    unVar2.showDialog(unVar2.f44324la);
                    return false;
                }
                fi.v3 v3Var = c41Var2.f38259x;
                if (v3Var != null) {
                    pVar.removeView(v3Var);
                    c41Var2.f38259x = null;
                }
                MessageObject messageObject4 = c41Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = c41Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(c41Var2.M.currentAccount).getClientUserId()) {
                    fi.v3 v3Var2 = new fi.v3(context, 3);
                    c41Var2.f38259x = v3Var2;
                    v3Var2.p(true);
                    if (z11) {
                        long dialogId = c41Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(c41Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(c41Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        fi.v3 v3Var3 = c41Var2.f38259x;
                        if (c41Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        v3Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        fi.v3 v3Var4 = c41Var2.f38259x;
                        if (c41Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        v3Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    c41Var2.f38259x.q(12.0f);
                    fi.v3 v3Var5 = c41Var2.f38259x;
                    if (!z11 && !c41Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    v3Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (c41Var2.S) {
                        c41Var2.f38259x.m(0.5f, 0.0f);
                        c41Var2.f38259x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        c41Var2.f38259x.m(0.0f, AndroidUtilities.dp(34.0f));
                        c41Var2.f38259x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    c41Var2.f38259x.t(14.0f);
                    fi.v3 v3Var6 = c41Var2.f38259x;
                    v3Var6.h = fi.v3.a(v3Var6.getText(), c41Var2.f38259x.getTextPaint());
                    if (c41Var2.S) {
                        pVar.addView(c41Var2.f38259x, org.telegram.ui.Components.gb1.h((int) ((c41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((c41Var2.O.getHeight() + c41Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        pVar.addView(c41Var2.f38259x, org.telegram.ui.Components.gb1.h((int) ((c41Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((c41Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + c41Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((c41Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    c41Var2.f38259x.u();
                }
                TextView textView = c41Var2.f38260y;
                if (textView != null) {
                    pVar.removeView(textView);
                    c41Var2.f38260y = null;
                }
                TextView textView2 = new TextView(context);
                c41Var2.f38260y = textView2;
                textView2.setTextColor(-1);
                c41Var2.f38260y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    c41Var2.f38260y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    c41Var2.f38260y.setBackground(org.telegram.ui.ActionBar.y6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                c41Var2.f38260y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                org.telegram.ui.Components.gb1.b(c41Var2.f38260y);
                TextView textView3 = c41Var2.f38260y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                c41Var2.f38260y.setOnClickListener(new y31(c41Var2, 1));
                pVar.addView(c41Var2.f38260y, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (a41Var = c41Var2.N) != null && a41Var.getMessageObject() != null && c41Var2.N.getMessageObject().messageOwner != null) {
                    c41Var2.N.getMessageObject().messageOwner.media_unread = false;
                    c41Var2.N.invalidate();
                }
                un unVar22 = this.f39420a;
                unVar22.showDialog(unVar22.f44324la);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void z1() {
        org.telegram.ui.ActionBar.u6 u6Var;
        un unVar = this.f39420a;
        if (unVar.f44292j1 != null && unVar.getParentActivity() != null) {
            Context context = unVar.f44292j1.getContext();
            u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
            a31.T(context, unVar, false, u6Var, null);
        }
    }
}
