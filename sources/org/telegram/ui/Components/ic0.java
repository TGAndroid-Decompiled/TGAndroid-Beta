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
    public final int f27236a;
    public int f27237a0;
    public final org.telegram.ui.y8 f27238b;
    public boolean f27239b0;
    public final ah.v f27240c;
    public final oc0 f27241c0;
    public final org.telegram.ui.Cells.z9 d;
    public final ac0 e;
    public final bc0 f27242f;
    public final dc0 h;
    public final hc0 f27243n;
    public MessagePreviewParams.Messages f27244r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f27245s;
    public final zb0 v;
    public final zb0 f27246w;
    public final org.telegram.ui.ActionBar.e1 f27247x;
    public final org.telegram.ui.ActionBar.e1 f27248y;

    public ic0(org.telegram.ui.Components.oc0 r35, android.content.Context r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ic0.<init>(org.telegram.ui.Components.oc0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(ic0 ic0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = ic0Var.f27244r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(ic0 ic0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (ic0Var.f27236a == 2) {
            MessagePreviewParams messagePreviewParams = ic0Var.f27241c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        oc0 oc0Var = this.f27241c0;
        MessagePreviewParams.Messages messages = oc0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = oc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.gn gnVar = oc0Var.d.quote;
                    if (gnVar != null) {
                        return gnVar.f37362a;
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

    public final boolean e(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject c10;
        if (u1Var != null && u1Var.getMessageObject() != null && (c10 = c(null)) != null) {
            if (u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.f27241c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27245s;
        ah.v vVar = this.f27240c;
        org.telegram.ui.y8 y8Var = this.f27238b;
        if (z10) {
            vVar.setTranslationY(0.0f);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            vVar.setTranslationY(i10);
            y8Var.invalidateOutline();
            y8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + y8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = y8Var.getX();
        org.telegram.ui.Cells.z9 z9Var = this.d;
        z9Var.setTranslationX(x10);
        z9Var.setTranslationY(y8Var.getY());
    }

    public final void g() {
        oc0 oc0Var = this.f27241c0;
        new xc(oc0Var, oc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        if (this.f27241c0.f28991b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.f27248y;
            org.telegram.ui.ActionBar.e1 e1Var2 = this.f27247x;
            zb0 zb0Var = this.f27246w;
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
                if (e1Var2 != null) {
                    e1Var2.setVisibility(0);
                    if (!z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(e1Var2, property, f12));
                }
                if (e1Var != null) {
                    e1Var.setVisibility(0);
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(e1Var, property, f15));
                }
                this.P.playTogether(arrayList);
                this.P.setDuration(360L);
                this.P.setInterpolator(bs.h);
                this.P.addListener(new org.telegram.ui.fo(16, this, z10));
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
            if (e1Var2 != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e1Var2.setAlpha(f7);
                if (!z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                e1Var2.setVisibility(i10);
            }
            if (e1Var != null) {
                if (z10) {
                    f15 = 1.0f;
                }
                e1Var.setAlpha(f15);
                if (!z10) {
                    i13 = 4;
                }
                e1Var.setVisibility(i13);
            }
        }
    }

    public final void i() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        oc0 oc0Var = this.f27241c0;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        dc0 dc0Var = this.h;
        if (dc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f27244r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f27244r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = oc0Var.f28990a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f27236a == 2) {
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
        for (int i12 = 0; i12 < this.f27244r.pollChosenAnswers.size(); i12++) {
            this.f27244r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f27244r.groupedMessagesMap.size(); i13++) {
            dc0Var.V(this.f27244r.groupedMessagesMap.valueAt(i13));
        }
        this.f27243n.q(0, this.f27244r.previewMessages.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        oc0 oc0Var = this.f27241c0;
        boolean z10 = oc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27245s;
        bc0 bc0Var = this.f27242f;
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
            MessagePreviewParams.Messages messages = this.f27244r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int b10 = org.telegram.messenger.g0.b(4.0f, measuredHeight, 0);
                this.R = b10;
                int measuredHeight2 = (bc0Var.getMeasuredHeight() - this.R) + b10;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float z11 = com.google.android.gms.internal.play_billing.k3.z(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f27238b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = z11;
            if (z11 > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + bc0Var.getMeasuredWidth());
        }
        boolean z12 = this.K;
        if (!z12 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = oc0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            oc0Var.h = ofFloat;
            ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
            oc0Var.h.setDuration(250L);
            oc0Var.h.setInterpolator(li.m.V);
            oc0Var.h.addListener(new c80(this, 4));
            AndroidUtilities.runOnUIThread(oc0Var.f28999y, 50L);
            this.T = i10;
            f(f7, i10);
        } else if (z12) {
            float f10 = this.S;
            int i15 = this.R;
            this.T = i15;
            f(f10, i15);
        }
    }

    public final void k() {
        MessageObject messageObject;
        MessageObject messageObject2;
        oc0 oc0Var = this.f27241c0;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        if (this.f27236a == 0) {
            ac0 ac0Var = this.e;
            if (ac0Var.v - ac0Var.f22017u <= MessagesController.getInstance(oc0Var.f28997w).quoteLengthMax) {
                org.telegram.ui.Cells.v9 v9Var = ac0Var.W;
                if (v9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.u1) v9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && ac0Var.x()) {
                    messagePreviewParams.quoteStart = ac0Var.f22017u;
                    messagePreviewParams.quoteEnd = ac0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.gn gnVar = messagePreviewParams.quote;
                        if (gnVar.f37371m || (messageObject2 = gnVar.f37362a) == null || messageObject2.getId() != c10.getId()) {
                            messagePreviewParams.quote = org.telegram.ui.gn.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
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
        oc0 oc0Var = this.f27241c0;
        TLRPC.User user = oc0Var.f28994n;
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        TLRPC.Chat chat = oc0Var.f28995r;
        ah.v vVar = this.f27240c;
        int i10 = this.f27236a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            vVar.e(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
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
            vVar.d(string, z10);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                vVar.e(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                vVar.d(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            vVar.e(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            vVar.d(str, z10);
        } else if (i10 == 2) {
            vVar.e(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            vVar.d(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27236a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f27242f, (Utilities.Callback<View>) new z2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f27239b0 = true;
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
        oc0 oc0Var = this.f27241c0;
        oc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27245s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f27242f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = oc0Var.v;
        org.telegram.ui.y8 y8Var = this.f27238b;
        if (z11) {
            y8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            y8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) y8Var.getLayoutParams()).bottomMargin = 0;
            y8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (y8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                y8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            y8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - y8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.f27237a0 != size2) {
            for (int i13 = 0; i13 < this.f27244r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f27244r.previewMessages.get(i13);
                if (oc0Var.v) {
                    size = y8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                hc0 hc0Var = this.f27243n;
                if (hc0Var != null) {
                    hc0Var.l();
                }
            }
            this.K = true;
        }
        this.f27237a0 = size2;
        super.onMeasure(i10, i11);
    }
}
