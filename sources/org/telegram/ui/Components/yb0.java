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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yb0 extends FrameLayout {
    public final dc0 E;
    public final FrameLayout F;
    public final dc0 G;
    public final dc0 H;
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
    public final int f29290a;
    public int f29291a0;
    public final org.telegram.ui.w8 f29292b;
    public boolean f29293b0;
    public final bi.n7 f29294c;
    public final ec0 f29295c0;
    public final org.telegram.ui.Cells.ea d;
    public final qb0 e;
    public final rb0 f29296f;
    public final tb0 h;
    public final xb0 f29297n;
    public MessagePreviewParams.Messages f29298r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29299s;
    public final pb0 v;
    public final pb0 f29300w;
    public final org.telegram.ui.ActionBar.g1 f29301x;
    public final org.telegram.ui.ActionBar.g1 f29302y;

    public yb0(org.telegram.ui.Components.ec0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yb0.<init>(org.telegram.ui.Components.ec0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(yb0 yb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = yb0Var.f29298r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(yb0 yb0Var, org.telegram.ui.Cells.t1 t1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (yb0Var.f29290a == 2) {
            MessagePreviewParams messagePreviewParams = yb0Var.f29295c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                t1Var.Q3(characterStyle);
                return;
            }
        }
        t1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        ec0 ec0Var = this.f29295c0;
        MessagePreviewParams.Messages messages = ec0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = ec0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.tn tnVar = ec0Var.d.quote;
                    if (tnVar != null) {
                        return tnVar.f36967a;
                    }
                }
                return valueAt.captionMessage;
            }
            return ec0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yb0.d():android.view.View");
    }

    public final void e(float f7, int i10) {
        boolean z10 = this.f29295c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29299s;
        bi.n7 n7Var = this.f29294c;
        org.telegram.ui.w8 w8Var = this.f29292b;
        if (z10) {
            n7Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            n7Var.setTranslationY(i10);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + w8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.ea eaVar = this.d;
        eaVar.setTranslationX(x10);
        eaVar.setTranslationY(w8Var.getY());
    }

    public final void f() {
        ec0 ec0Var = this.f29295c0;
        new wc(ec0Var, ec0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        if (this.f29295c0.f22662b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f29302y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f29301x;
            pb0 pb0Var = this.f29300w;
            pb0 pb0Var2 = this.v;
            float f15 = 0.0f;
            if (z11) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (pb0Var2 != null) {
                    pb0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(pb0Var2, property, f14));
                }
                if (pb0Var != null) {
                    pb0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(pb0Var, property, f13));
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
                this.P.setInterpolator(wr.h);
                this.P.addListener(new yo(11, this, z10));
                this.P.start();
                return;
            }
            if (pb0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                pb0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                pb0Var2.setVisibility(i12);
            }
            if (pb0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                pb0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                pb0Var.setVisibility(i11);
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

    public final void h() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ec0 ec0Var = this.f29295c0;
        MessagePreviewParams messagePreviewParams = ec0Var.d;
        tb0 tb0Var = this.h;
        if (tb0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f29298r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f29298r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = ec0Var.f22661a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f29290a == 2) {
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
        for (int i12 = 0; i12 < this.f29298r.pollChosenAnswers.size(); i12++) {
            this.f29298r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f29298r.groupedMessagesMap.size(); i13++) {
            tb0Var.V(this.f29298r.groupedMessagesMap.valueAt(i13));
        }
        this.f29297n.q(0, this.f29298r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        ec0 ec0Var = this.f29295c0;
        boolean z10 = ec0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29299s;
        rb0 rb0Var = this.f29296f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = rb0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < rb0Var.getChildCount(); i13++) {
                View childAt = rb0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f29298r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int g10 = hc.b.g(4.0f, measuredHeight, 0);
                this.R = g10;
                int measuredHeight2 = (rb0Var.getMeasuredHeight() - this.R) + g10;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f29292b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + rb0Var.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (!z11 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = ec0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ec0Var.h = ofFloat;
            ofFloat.addUpdateListener(new dk(this, i10, f7, 1));
            ec0Var.h.setDuration(250L);
            ec0Var.h.setInterpolator(ii.n.V);
            ec0Var.h.addListener(new rm(this, 18));
            AndroidUtilities.runOnUIThread(ec0Var.f22670y, 50L);
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
        ec0 ec0Var = this.f29295c0;
        MessagePreviewParams messagePreviewParams = ec0Var.d;
        if (this.f29290a == 0) {
            qb0 qb0Var = this.e;
            if (qb0Var.v - qb0Var.f19164u <= MessagesController.getInstance(ec0Var.f22668w).quoteLengthMax) {
                org.telegram.ui.Cells.aa aaVar = qb0Var.W;
                if (aaVar != null) {
                    messageObject = ((org.telegram.ui.Cells.t1) aaVar).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && qb0Var.y()) {
                    messagePreviewParams.quoteStart = qb0Var.f19164u;
                    messagePreviewParams.quoteEnd = qb0Var.v;
                    if (c10 != null && ((messageObject2 = messagePreviewParams.quote.f36967a) == null || messageObject2.getId() != c10.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.tn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                        ec0Var.b();
                    }
                }
                qb0Var.f(false);
            }
        }
    }

    public final void k(boolean z10) {
        String str;
        int size;
        String string;
        ec0 ec0Var = this.f29295c0;
        TLRPC.User user = ec0Var.f22665n;
        MessagePreviewParams messagePreviewParams = ec0Var.d;
        TLRPC.Chat chat = ec0Var.f22666r;
        bi.n7 n7Var = this.f29294c;
        int i10 = this.f29290a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            n7Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
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
            n7Var.a(string, z10);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                n7Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                n7Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            n7Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            n7Var.a(str, z10);
        } else if (i10 == 2) {
            n7Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            n7Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29290a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29296f, (e2.h) new ib0(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.f29293b0 = true;
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
        ec0 ec0Var = this.f29295c0;
        ec0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29299s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f29296f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z11 = ec0Var.v;
        org.telegram.ui.w8 w8Var = this.f29292b;
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
        if (this.f29291a0 != size2) {
            for (int i13 = 0; i13 < this.f29298r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f29298r.previewMessages.get(i13);
                if (ec0Var.v) {
                    size = w8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                xb0 xb0Var = this.f29297n;
                if (xb0Var != null) {
                    xb0Var.l();
                }
            }
            this.K = true;
        }
        this.f29291a0 = size2;
        super.onMeasure(i10, i11);
    }
}
