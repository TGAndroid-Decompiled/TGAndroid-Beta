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
public final class bc0 extends FrameLayout {
    public final gc0 E;
    public final FrameLayout F;
    public final gc0 G;
    public final gc0 H;
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
    public final int f22933a;
    public int f22934a0;
    public final org.telegram.ui.w8 f22935b;
    public boolean f22936b0;
    public final ci.m6 f22937c;
    public final hc0 f22938c0;
    public final org.telegram.ui.Cells.ca d;
    public final tb0 e;
    public final ub0 f22939f;
    public final wb0 h;
    public final ac0 f22940n;
    public MessagePreviewParams.Messages f22941r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f22942s;
    public final sb0 v;
    public final sb0 f22943w;
    public final org.telegram.ui.ActionBar.e1 f22944x;
    public final org.telegram.ui.ActionBar.e1 f22945y;

    public bc0(org.telegram.ui.Components.hc0 r34, android.content.Context r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bc0.<init>(org.telegram.ui.Components.hc0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(bc0 bc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = bc0Var.f22941r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(bc0 bc0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (bc0Var.f22933a == 2) {
            MessagePreviewParams messagePreviewParams = bc0Var.f22938c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        hc0 hc0Var = this.f22938c0;
        MessagePreviewParams.Messages messages = hc0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = hc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.mn mnVar = hc0Var.d.quote;
                    if (mnVar != null) {
                        return mnVar.f35628a;
                    }
                }
                return valueAt.captionMessage;
            }
            return hc0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bc0.d():android.view.View");
    }

    public final void e(float f7, int i10) {
        boolean z10 = this.f22938c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22942s;
        ci.m6 m6Var = this.f22937c;
        org.telegram.ui.w8 w8Var = this.f22935b;
        if (z10) {
            m6Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            m6Var.setTranslationY(i10);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + w8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.ca caVar = this.d;
        caVar.setTranslationX(x10);
        caVar.setTranslationY(w8Var.getY());
    }

    public final void f() {
        hc0 hc0Var = this.f22938c0;
        new yc(hc0Var, hc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z10, boolean z11) {
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
        if (this.f22938c0.f24773b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.f22945y;
            org.telegram.ui.ActionBar.e1 e1Var2 = this.f22944x;
            sb0 sb0Var = this.f22943w;
            sb0 sb0Var2 = this.v;
            float f15 = 0.0f;
            if (z11) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (sb0Var2 != null) {
                    sb0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(sb0Var2, property, f14));
                }
                if (sb0Var != null) {
                    sb0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(sb0Var, property, f13));
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
                this.P.setInterpolator(sr.h);
                this.P.addListener(new ca(15, this, z10));
                this.P.start();
                return;
            }
            if (sb0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                sb0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                sb0Var2.setVisibility(i12);
            }
            if (sb0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sb0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                sb0Var.setVisibility(i11);
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

    public final void h() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        hc0 hc0Var = this.f22938c0;
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        wb0 wb0Var = this.h;
        if (wb0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f22941r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f22941r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = hc0Var.f24772a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f22933a == 2) {
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
        for (int i12 = 0; i12 < this.f22941r.pollChosenAnswers.size(); i12++) {
            this.f22941r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f22941r.groupedMessagesMap.size(); i13++) {
            wb0Var.V(this.f22941r.groupedMessagesMap.valueAt(i13));
        }
        this.f22940n.q(0, this.f22941r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        hc0 hc0Var = this.f22938c0;
        boolean z10 = hc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22942s;
        ub0 ub0Var = this.f22939f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = ub0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < ub0Var.getChildCount(); i13++) {
                View childAt = ub0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f22941r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int b10 = org.telegram.messenger.f0.b(4.0f, measuredHeight, 0);
                this.R = b10;
                int measuredHeight2 = (ub0Var.getMeasuredHeight() - this.R) + b10;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f22935b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ub0Var.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (!z11 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = hc0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            hc0Var.h = ofFloat;
            ofFloat.addUpdateListener(new ck(this, i10, f7, 1));
            hc0Var.h.setDuration(250L);
            hc0Var.h.setInterpolator(ji.n.V);
            hc0Var.h.addListener(new r8(this, 29));
            AndroidUtilities.runOnUIThread(hc0Var.f24781y, 50L);
            this.T = i10;
            e(f7, i10);
        } else if (z11) {
            float f10 = this.S;
            int i15 = this.R;
            this.T = i15;
            e(f10, i15);
        }
    }

    public final void j() {
        MessageObject messageObject;
        MessageObject messageObject2;
        hc0 hc0Var = this.f22938c0;
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        if (this.f22933a == 0) {
            tb0 tb0Var = this.e;
            if (tb0Var.v - tb0Var.f20193u <= MessagesController.getInstance(hc0Var.f24779w).quoteLengthMax) {
                org.telegram.ui.Cells.y9 y9Var = tb0Var.W;
                if (y9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.u1) y9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && tb0Var.y()) {
                    messagePreviewParams.quoteStart = tb0Var.f20193u;
                    messagePreviewParams.quoteEnd = tb0Var.v;
                    if (c10 != null && ((messageObject2 = messagePreviewParams.quote.f35628a) == null || messageObject2.getId() != c10.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.mn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                        hc0Var.b();
                    }
                }
                tb0Var.f(false);
            }
        }
    }

    public final void k(boolean z10) {
        String str;
        int size;
        String string;
        hc0 hc0Var = this.f22938c0;
        TLRPC.User user = hc0Var.f24776n;
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        TLRPC.Chat chat = hc0Var.f24777r;
        ci.m6 m6Var = this.f22937c;
        int i10 = this.f22933a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            m6Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
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
            m6Var.a(string, z10);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                m6Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                m6Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            m6Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            m6Var.a(str, z10);
        } else if (i10 == 2) {
            m6Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            m6Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22933a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f22939f, (Utilities.Callback<View>) new y2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.f22936b0 = true;
        this.K = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i();
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
        hc0 hc0Var = this.f22938c0;
        hc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22942s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f22939f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = hc0Var.v;
        org.telegram.ui.w8 w8Var = this.f22935b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - w8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.f22934a0 != size2) {
            for (int i13 = 0; i13 < this.f22941r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f22941r.previewMessages.get(i13);
                if (hc0Var.v) {
                    size = w8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                ac0 ac0Var = this.f22940n;
                if (ac0Var != null) {
                    ac0Var.l();
                }
            }
            this.K = true;
        }
        this.f22934a0 = size2;
        super.onMeasure(i10, i11);
    }
}
