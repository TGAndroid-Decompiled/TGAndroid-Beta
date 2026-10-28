package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ic0 extends FrameLayout {
    public final nc0 E;
    public final FrameLayout F;
    public final nc0 G;
    public final nc0 H;
    public final int I;
    public final ChatMessageSharedResources J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public AnimatorSet P;
    public final Rect Q;
    public int R;
    public float S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public final int f29301a;
    public int f29302a0;
    public final org.telegram.ui.a9 f29303b;
    public boolean f29304b0;
    public final rb0 f29305c;
    public final oc0 f29306c0;
    public final org.telegram.ui.Cells.ea d;
    public final ac0 e;
    public final bc0 f29307f;
    public final dc0 h;
    public final hc0 f29308n;
    public MessagePreviewParams.Messages f29309r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29310s;
    public final zb0 v;
    public final zb0 f29311w;
    public final org.telegram.ui.ActionBar.g1 f29312x;
    public final org.telegram.ui.ActionBar.g1 f29313y;

    public ic0(org.telegram.ui.Components.oc0 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ic0.<init>(org.telegram.ui.Components.oc0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(ic0 ic0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = ic0Var.f29309r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(ic0 ic0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (ic0Var.f29301a == 2) {
            MessagePreviewParams messagePreviewParams = ic0Var.f29306c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.S3(characterStyle);
                return;
            }
        }
        s1Var.S3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        oc0 oc0Var = this.f29306c0;
        MessagePreviewParams.Messages messages = oc0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = oc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.mn mnVar = oc0Var.d.quote;
                    if (mnVar != null) {
                        return mnVar.f41477a;
                    }
                }
                return valueAt.captionMessage;
            }
            return oc0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ic0.d():android.view.View");
    }

    public final boolean e(org.telegram.ui.Cells.s1 s1Var) {
        MessageObject c10;
        if (s1Var != null && s1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (s1Var.getMessageObject() == c10 || s1Var.getMessageObject().getId() == c10.getId()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.f29306c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29310s;
        rb0 rb0Var = this.f29305c;
        org.telegram.ui.a9 a9Var = this.f29303b;
        if (z10) {
            rb0Var.setTranslationY(0.0f);
            a9Var.invalidateOutline();
            a9Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            rb0Var.setTranslationY(i10);
            a9Var.invalidateOutline();
            a9Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + a9Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x9 = a9Var.getX();
        org.telegram.ui.Cells.ea eaVar = this.d;
        eaVar.setTranslationX(x9);
        eaVar.setTranslationY(a9Var.getY());
    }

    public final void g() {
        oc0 oc0Var = this.f29306c0;
        new wc(oc0Var, oc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void h(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        int i13 = 0;
        if (this.f29306c0.f31264b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f29313y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f29312x;
            zb0 zb0Var = this.f29311w;
            zb0 zb0Var2 = this.v;
            float f15 = 0.0f;
            if (z11) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (zb0Var2 != null) {
                    zb0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(zb0Var2, property, f14));
                }
                if (zb0Var != null) {
                    zb0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(zb0Var, property, f13));
                }
                if (g1Var2 != null) {
                    g1Var2.setVisibility(0);
                    if (!z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(g1Var2, property, f12));
                }
                if (g1Var != null) {
                    g1Var.setVisibility(0);
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(g1Var, property, f15));
                }
                this.P.playTogether(arrayList);
                this.P.setDuration(360L);
                this.P.setInterpolator(ds.h);
                this.P.addListener(new org.telegram.ui.lo(16, this, z10));
                this.P.start();
                return;
            }
            if (zb0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                zb0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                zb0Var2.setVisibility(i12);
            }
            if (zb0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                zb0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                zb0Var.setVisibility(i11);
            }
            if (g1Var2 != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g1Var2.setAlpha(f7);
                if (!z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                g1Var2.setVisibility(i10);
            }
            if (g1Var != null) {
                if (z10) {
                    f15 = 1.0f;
                }
                g1Var.setAlpha(f15);
                if (!z10) {
                    i13 = 4;
                }
                g1Var.setVisibility(i13);
            }
        }
    }

    public final void i() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        oc0 oc0Var = this.f29306c0;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        dc0 dc0Var = this.h;
        if (dc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f29309r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f29309r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = oc0Var.f31263a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f29301a == 2) {
                TLRPC.WebPage webPage = messagePreviewParams.webpage;
                if (webPage != null && ((messageMedia = (message = messageObject.messageOwner).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    messageMedia2.webpage = messagePreviewParams.webpage;
                    boolean z10 = messagePreviewParams.webpageSmall;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    messageObject.linkDescription = null;
                    messageObject.generateLinkDescription();
                    messageObject.photoThumbs = null;
                    messageObject.photoThumbs2 = null;
                    messageObject.photoThumbsObject = null;
                    messageObject.photoThumbsObject2 = null;
                    messageObject.generateThumbs(true);
                    messageObject.checkMediaExistance();
                } else if (webPage == null) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (messagePreviewParams.hideCaption) {
                messageObject.caption = null;
            } else {
                messageObject.generateCaption();
            }
            if (messageObject.isPoll()) {
                MessagePreviewParams.PreviewMediaPoll previewMediaPoll = (MessagePreviewParams.PreviewMediaPoll) messageObject.messageOwner.media;
                TLRPC.PollResults pollResults = previewMediaPoll.results;
                if (messagePreviewParams.hideCaption) {
                    i10 = 0;
                } else {
                    i10 = previewMediaPoll.totalVotersCached;
                }
                pollResults.total_voters = i10;
            }
        }
        for (int i12 = 0; i12 < this.f29309r.pollChosenAnswers.size(); i12++) {
            this.f29309r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f29309r.groupedMessagesMap.size(); i13++) {
            dc0Var.V(this.f29309r.groupedMessagesMap.valueAt(i13));
        }
        this.f29308n.q(0, this.f29309r.previewMessages.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        oc0 oc0Var = this.f29306c0;
        boolean z10 = oc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29310s;
        bc0 bc0Var = this.f29307f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = bc0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < bc0Var.getChildCount(); i13++) {
                View childAt = bc0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f29309r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int c10 = org.telegram.messenger.t.c(4.0f, measuredHeight, 0);
                this.R = c10;
                int measuredHeight2 = (bc0Var.getMeasuredHeight() - this.R) + c10;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float B = c3.h0.B(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f29303b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = B;
            if (B > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + bc0Var.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (!z11 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = oc0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            oc0Var.h = ofFloat;
            ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
            oc0Var.h.setDuration(250L);
            oc0Var.h.setInterpolator(mi.m.V);
            oc0Var.h.addListener(new i10(this, 6));
            AndroidUtilities.runOnUIThread(oc0Var.f31272y, 50L);
            this.T = i10;
            f(f7, i10);
        } else if (z11) {
            float f10 = this.S;
            int i15 = this.R;
            this.T = i15;
            f(f10, i15);
        }
    }

    public final void k() {
        MessageObject messageObject;
        MessageObject messageObject2;
        oc0 oc0Var = this.f29306c0;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        if (this.f29301a == 0) {
            ac0 ac0Var = this.e;
            if (ac0Var.v - ac0Var.f24120u <= MessagesController.getInstance(oc0Var.f31270w).quoteLengthMax) {
                org.telegram.ui.Cells.aa aaVar = ac0Var.W;
                if (aaVar != null) {
                    messageObject = ((org.telegram.ui.Cells.s1) aaVar).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && ac0Var.x()) {
                    messagePreviewParams.quoteStart = ac0Var.f24120u;
                    messagePreviewParams.quoteEnd = ac0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.mn mnVar = messagePreviewParams.quote;
                        if (mnVar.f41486m || (messageObject2 = mnVar.f41477a) == null || messageObject2.getId() != c10.getId()) {
                            messagePreviewParams.quote = org.telegram.ui.mn.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                            oc0Var.b();
                        }
                    }
                }
                ac0Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String string;
        oc0 oc0Var = this.f29306c0;
        TLRPC.User user = oc0Var.f31267n;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        TLRPC.Chat chat = oc0Var.f31268r;
        rb0 rb0Var = this.f29305c;
        int i10 = this.f29301a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            rb0Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
            if (!messagePreviewParams.hasSenders) {
                if (messagePreviewParams.willSeeSenders) {
                    if (user != null) {
                        string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
                    } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        string = LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
                    } else {
                        string = LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup);
                    }
                } else if (user != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
                } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    string = LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
                } else {
                    string = LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup);
                }
            } else if (!messagePreviewParams.hideForwardSendersName) {
                if (user != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
                } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    string = LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
                } else {
                    string = LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup);
                }
            } else if (user != null) {
                string = LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name));
            } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                string = LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup);
            }
            rb0Var.a(string, z10);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                rb0Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                rb0Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            rb0Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            rb0Var.a(str, z10);
        } else if (i10 == 2) {
            rb0Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            rb0Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29301a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29307f, (Utilities.Callback<View>) new b3(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f29304b0 = true;
        this.K = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
        this.K = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        oc0 oc0Var = this.f29306c0;
        oc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29310s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f29307f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = oc0Var.v;
        org.telegram.ui.a9 a9Var = this.f29303b;
        if (z11) {
            a9Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            a9Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) a9Var.getLayoutParams()).bottomMargin = 0;
            a9Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (a9Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                a9Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            a9Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - a9Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.f29302a0 != size2) {
            for (int i13 = 0; i13 < this.f29309r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f29309r.previewMessages.get(i13);
                if (oc0Var.v) {
                    size = a9Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                hc0 hc0Var = this.f29308n;
                if (hc0Var != null) {
                    hc0Var.l();
                }
            }
            this.K = true;
        }
        this.f29302a0 = size2;
        super.onMeasure(i10, i11);
    }
}
