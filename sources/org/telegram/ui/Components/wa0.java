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
public final class wa0 extends FrameLayout {
    public final bb0 A;
    public final FrameLayout B;
    public final bb0 C;
    public final bb0 D;
    public final int E;
    public final ChatMessageSharedResources F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public AnimatorSet L;
    public final Rect M;
    public int N;
    public float O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public final cb0 V;
    public final int f34168a;
    public final fh.x4 f34169b;
    public final fh.v f34170c;
    public final org.telegram.ui.Cells.z9 d;
    public final oa0 f34171e;
    public final pa0 f34172f;
    public final ra0 h;
    public final va0 f34173n;
    public MessagePreviewParams.Messages f34174r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34175s;
    public final na0 v;
    public final na0 f34176w;
    public final org.telegram.ui.ActionBar.g1 f34177x;
    public final org.telegram.ui.ActionBar.g1 f34178y;

    public wa0(org.telegram.ui.Components.cb0 r40, android.content.Context r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wa0.<init>(org.telegram.ui.Components.cb0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(wa0 wa0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = wa0Var.f34174r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(wa0 wa0Var, org.telegram.ui.Cells.t1 t1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (wa0Var.f34168a == 2) {
            MessagePreviewParams messagePreviewParams = wa0Var.V.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                t1Var.Q3(characterStyle);
                return;
            }
        }
        t1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        cb0 cb0Var = this.V;
        MessagePreviewParams.Messages messages = cb0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = cb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.gn gnVar = cb0Var.d.quote;
                    if (gnVar != null) {
                        return gnVar.f38572a;
                    }
                }
                return valueAt.captionMessage;
            }
            return cb0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wa0.d():android.view.View");
    }

    public final void e(float f10, int i9) {
        boolean z10 = this.V.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f34175s;
        fh.v vVar = this.f34170c;
        fh.x4 x4Var = this.f34169b;
        if (z10) {
            vVar.setTranslationY(0.0f);
            x4Var.invalidateOutline();
            x4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            vVar.setTranslationY(i9);
            x4Var.invalidateOutline();
            x4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + x4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = x4Var.getX();
        org.telegram.ui.Cells.z9 z9Var = this.d;
        z9Var.setTranslationX(x10);
        z9Var.setTranslationY(x4Var.getY());
    }

    public final void f() {
        cb0 cb0Var = this.V;
        new oc(cb0Var, cb0Var.B).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z10, boolean z11) {
        float f10;
        int i9;
        float f11;
        int i10;
        float f12;
        int i11;
        float f13;
        float f14;
        float f15;
        int i12 = 0;
        if (this.V.f27455b) {
            z10 = false;
        }
        if (!z11 || this.K != z10) {
            this.K = z10;
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f34178y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f34177x;
            na0 na0Var = this.f34176w;
            na0 na0Var2 = this.v;
            float f16 = 0.0f;
            if (z11) {
                this.L = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (na0Var2 != null) {
                    na0Var2.setVisibility(0);
                    if (!z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(na0Var2, property, f15));
                }
                if (na0Var != null) {
                    na0Var.setVisibility(0);
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(na0Var, property, f14));
                }
                if (g1Var2 != null) {
                    g1Var2.setVisibility(0);
                    if (!z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(g1Var2, property, f13));
                }
                if (g1Var != null) {
                    g1Var.setVisibility(0);
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(g1Var, property, f16));
                }
                this.L.playTogether(arrayList);
                this.L.setDuration(360L);
                this.L.setInterpolator(gr.h);
                this.L.addListener(new u9(15, this, z10));
                this.L.start();
                return;
            }
            if (na0Var2 != null) {
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                na0Var2.setAlpha(f12);
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                na0Var2.setVisibility(i11);
            }
            if (na0Var != null) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                na0Var.setAlpha(f11);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                na0Var.setVisibility(i10);
            }
            if (g1Var2 != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                g1Var2.setAlpha(f10);
                if (!z10) {
                    i9 = 0;
                } else {
                    i9 = 4;
                }
                g1Var2.setVisibility(i9);
            }
            if (g1Var != null) {
                if (z10) {
                    f16 = 1.0f;
                }
                g1Var.setAlpha(f16);
                if (!z10) {
                    i12 = 4;
                }
                g1Var.setVisibility(i12);
            }
        }
    }

    public final void h() {
        int i9;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        cb0 cb0Var = this.V;
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        ra0 ra0Var = this.h;
        if (ra0Var.k()) {
            this.R = true;
            return;
        }
        for (int i10 = 0; i10 < this.f34174r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.f34174r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = cb0Var.f27454a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f34168a == 2) {
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
                    i9 = 0;
                } else {
                    i9 = previewMediaPoll.totalVotersCached;
                }
                pollResults.total_voters = i9;
            }
        }
        for (int i11 = 0; i11 < this.f34174r.pollChosenAnswers.size(); i11++) {
            this.f34174r.pollChosenAnswers.get(i11).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i12 = 0; i12 < this.f34174r.groupedMessagesMap.size(); i12++) {
            ra0Var.V(this.f34174r.groupedMessagesMap.valueAt(i12));
        }
        this.f34173n.q(0, this.f34174r.previewMessages.size());
    }

    public final void i() {
        int i9 = this.N;
        float f10 = this.O;
        cb0 cb0Var = this.V;
        boolean z10 = cb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f34175s;
        pa0 pa0Var = this.f34172f;
        int i10 = 0;
        if (!z10) {
            int measuredHeight = pa0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < pa0Var.getChildCount(); i12++) {
                View childAt = pa0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.f34174r;
            if (messages != null && i11 != 0 && i11 <= messages.previewMessages.size()) {
                int b10 = org.telegram.messenger.l0.b(4.0f, measuredHeight, 0);
                this.N = b10;
                int measuredHeight2 = (pa0Var.getMeasuredHeight() - this.N) + b10;
                int i13 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i10 = AndroidUtilities.navigationBarHeight;
                }
                this.N = Math.min(measuredHeight2 - ((int) ((((i13 - i10) * 0.8f) - this.S) - AndroidUtilities.dp(8.0f))), this.N);
            } else {
                this.N = 0;
            }
            float A = e2.c.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f34169b.getMeasuredHeight() - this.N) + (this.S - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.N;
            this.O = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.O = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.O = 0.0f;
            this.N = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + pa0Var.getMeasuredWidth());
        }
        boolean z11 = this.G;
        if (!z11 && (this.N != i9 || this.O != f10)) {
            ValueAnimator valueAnimator = cb0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            cb0Var.h = ofFloat;
            ofFloat.addUpdateListener(new rj(this, i9, f10, 1));
            cb0Var.h.setDuration(250L);
            cb0Var.h.setInterpolator(rh.m.V);
            cb0Var.h.addListener(new r60(this, 4));
            AndroidUtilities.runOnUIThread(cb0Var.f27464y, 50L);
            this.P = i9;
            e(f10, i9);
        } else if (z11) {
            float f11 = this.O;
            int i14 = this.N;
            this.P = i14;
            e(f11, i14);
        }
    }

    public final void j() {
        MessageObject messageObject;
        MessageObject messageObject2;
        cb0 cb0Var = this.V;
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        if (this.f34168a == 0) {
            oa0 oa0Var = this.f34171e;
            if (oa0Var.v - oa0Var.f24108u <= MessagesController.getInstance(cb0Var.f27462w).quoteLengthMax) {
                org.telegram.ui.Cells.v9 v9Var = oa0Var.W;
                if (v9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.t1) v9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && oa0Var.y()) {
                    messagePreviewParams.quoteStart = oa0Var.f24108u;
                    messagePreviewParams.quoteEnd = oa0Var.v;
                    if (c10 != null && ((messageObject2 = messagePreviewParams.quote.f38572a) == null || messageObject2.getId() != c10.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.gn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                        cb0Var.b();
                    }
                }
                oa0Var.f(false);
            }
        }
    }

    public final void k(boolean z10) {
        String str;
        int size;
        String string;
        cb0 cb0Var = this.V;
        TLRPC.User user = cb0Var.f27459n;
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        TLRPC.Chat chat = cb0Var.f27460r;
        fh.v vVar = this.f34170c;
        int i9 = this.f34168a;
        if (i9 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            vVar.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
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
            vVar.c(string, z10);
        } else if (i9 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                vVar.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                vVar.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            vVar.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            vVar.c(str, z10);
        } else if (i9 == 2) {
            vVar.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            vVar.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34168a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f34172f, (d5.d) new ha0(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.U = true;
        this.G = true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        i();
        this.G = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int size;
        if (View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        cb0 cb0Var = this.V;
        cb0Var.v = z10;
        this.S = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f34175s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i9, makeMeasureSpec);
        int i11 = this.S;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.M;
        this.S = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f34172f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = cb0Var.v;
        fh.x4 x4Var = this.f34169b;
        if (z11) {
            x4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            x4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i9), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i9) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) x4Var.getLayoutParams()).bottomMargin = 0;
            x4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(6.0f)) - this.S;
            if (x4Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                x4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            x4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - x4Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i9)) << 16;
        if (this.T != size2) {
            for (int i12 = 0; i12 < this.f34174r.previewMessages.size(); i12++) {
                MessageObject messageObject = this.f34174r.previewMessages.get(i12);
                if (cb0Var.v) {
                    size = x4Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                va0 va0Var = this.f34173n;
                if (va0Var != null) {
                    va0Var.l();
                }
            }
            this.G = true;
        }
        this.T = size2;
        super.onMeasure(i9, i10);
    }
}
