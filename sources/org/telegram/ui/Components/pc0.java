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
public final class pc0 extends FrameLayout {
    public final uc0 E;
    public final FrameLayout F;
    public final uc0 G;
    public final uc0 H;
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
    public final int f29840a;
    public int f29841a0;
    public final org.telegram.ui.v8 f29842b;
    public boolean f29843b0;
    public final ci.m6 f29844c;
    public final vc0 f29845c0;
    public final org.telegram.ui.Cells.aa d;
    public final hc0 f29846e;
    public final ic0 f29847f;
    public final kc0 h;
    public final oc0 f29848n;
    public MessagePreviewParams.Messages f29849r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29850s;
    public final gc0 v;
    public final gc0 f29851w;
    public final org.telegram.ui.ActionBar.f1 f29852x;
    public final org.telegram.ui.ActionBar.f1 f29853y;

    public pc0(org.telegram.ui.Components.vc0 r34, android.content.Context r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pc0.<init>(org.telegram.ui.Components.vc0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(pc0 pc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = pc0Var.f29849r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(pc0 pc0Var, org.telegram.ui.Cells.u1 u1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (pc0Var.f29840a == 2) {
            MessagePreviewParams messagePreviewParams = pc0Var.f29845c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                u1Var.Q3(characterStyle);
                return;
            }
        }
        u1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        vc0 vc0Var = this.f29845c0;
        MessagePreviewParams.Messages messages = vc0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = vc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.pn pnVar = vc0Var.d.quote;
                    if (pnVar != null) {
                        return pnVar.f40843a;
                    }
                }
                return valueAt.captionMessage;
            }
            return vc0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pc0.d():android.view.View");
    }

    public final void e(float f7, int i10) {
        boolean z10 = this.f29845c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29850s;
        ci.m6 m6Var = this.f29844c;
        org.telegram.ui.v8 v8Var = this.f29842b;
        if (z10) {
            m6Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            m6Var.setTranslationY(i10);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + v8Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = v8Var.getX();
        org.telegram.ui.Cells.aa aaVar = this.d;
        aaVar.setTranslationX(x10);
        aaVar.setTranslationY(v8Var.getY());
    }

    public final void f() {
        vc0 vc0Var = this.f29845c0;
        new ad(vc0Var, vc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        if (this.f29845c0.f31748b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.f1 f1Var = this.f29853y;
            org.telegram.ui.ActionBar.f1 f1Var2 = this.f29852x;
            gc0 gc0Var = this.f29851w;
            gc0 gc0Var2 = this.v;
            float f15 = 0.0f;
            if (z11) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (gc0Var2 != null) {
                    gc0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(gc0Var2, property, f14));
                }
                if (gc0Var != null) {
                    gc0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(gc0Var, property, f13));
                }
                if (f1Var2 != null) {
                    f1Var2.setVisibility(0);
                    if (!z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(f1Var2, property, f12));
                }
                if (f1Var != null) {
                    f1Var.setVisibility(0);
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(f1Var, property, f15));
                }
                this.P.playTogether(arrayList);
                this.P.setDuration(360L);
                this.P.setInterpolator(hs.h);
                this.P.addListener(new fa(15, this, z10));
                this.P.start();
                return;
            }
            if (gc0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                gc0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                gc0Var2.setVisibility(i12);
            }
            if (gc0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                gc0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                gc0Var.setVisibility(i11);
            }
            if (f1Var2 != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f1Var2.setAlpha(f7);
                if (!z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                f1Var2.setVisibility(i10);
            }
            if (f1Var != null) {
                if (z10) {
                    f15 = 1.0f;
                }
                f1Var.setAlpha(f15);
                if (!z10) {
                    i13 = 4;
                }
                f1Var.setVisibility(i13);
            }
        }
    }

    public final void h() {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        vc0 vc0Var = this.f29845c0;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        kc0 kc0Var = this.h;
        if (kc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f29849r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f29849r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = vc0Var.f31747a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f29840a == 2) {
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
        for (int i12 = 0; i12 < this.f29849r.pollChosenAnswers.size(); i12++) {
            this.f29849r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f29849r.groupedMessagesMap.size(); i13++) {
            kc0Var.V(this.f29849r.groupedMessagesMap.valueAt(i13));
        }
        this.f29848n.q(0, this.f29849r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.R;
        float f7 = this.S;
        vc0 vc0Var = this.f29845c0;
        boolean z10 = vc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29850s;
        ic0 ic0Var = this.f29847f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = ic0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < ic0Var.getChildCount(); i13++) {
                View childAt = ic0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f29849r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int b10 = org.telegram.messenger.q.b(4.0f, measuredHeight, 0);
                this.R = b10;
                int measuredHeight2 = (ic0Var.getMeasuredHeight() - this.R) + b10;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float z11 = com.google.android.gms.internal.vision.e2.z(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f29842b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = z11;
            if (z11 > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ic0Var.getMeasuredWidth());
        }
        boolean z12 = this.K;
        if (!z12 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = vc0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            vc0Var.h = ofFloat;
            ofFloat.addUpdateListener(new ek(this, i10, f7, 1));
            vc0Var.h.setDuration(250L);
            vc0Var.h.setInterpolator(ji.n.V);
            vc0Var.h.addListener(new t8(this, 29));
            AndroidUtilities.runOnUIThread(vc0Var.f31757y, 50L);
            this.T = i10;
            e(f7, i10);
        } else if (z12) {
            float f10 = this.S;
            int i15 = this.R;
            this.T = i15;
            e(f10, i15);
        }
    }

    public final void j() {
        MessageObject messageObject;
        MessageObject messageObject2;
        vc0 vc0Var = this.f29845c0;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        if (this.f29840a == 0) {
            hc0 hc0Var = this.f29846e;
            if (hc0Var.v - hc0Var.f21884u <= MessagesController.getInstance(vc0Var.f31755w).quoteLengthMax) {
                org.telegram.ui.Cells.w9 w9Var = hc0Var.W;
                if (w9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.u1) w9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && hc0Var.x()) {
                    messagePreviewParams.quoteStart = hc0Var.f21884u;
                    messagePreviewParams.quoteEnd = hc0Var.v;
                    if (c10 != null && ((messageObject2 = messagePreviewParams.quote.f40843a) == null || messageObject2.getId() != c10.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.pn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c10);
                        vc0Var.b();
                    }
                }
                hc0Var.f(false);
            }
        }
    }

    public final void k(boolean z10) {
        String str;
        int size;
        String string;
        vc0 vc0Var = this.f29845c0;
        TLRPC.User user = vc0Var.f31752n;
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        TLRPC.Chat chat = vc0Var.f31753r;
        ci.m6 m6Var = this.f29844c;
        int i10 = this.f29840a;
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
        if (this.f29840a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29847f, (Utilities.Callback<View>) new a3(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.f29843b0 = true;
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
        vc0 vc0Var = this.f29845c0;
        vc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29850s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f29847f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = vc0Var.v;
        org.telegram.ui.v8 v8Var = this.f29842b;
        if (z11) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.W;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - v8Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.f29841a0 != size2) {
            for (int i13 = 0; i13 < this.f29849r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f29849r.previewMessages.get(i13);
                if (vc0Var.v) {
                    size = v8Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                oc0 oc0Var = this.f29848n;
                if (oc0Var != null) {
                    oc0Var.l();
                }
            }
            this.K = true;
        }
        this.f29841a0 = size2;
        super.onMeasure(i10, i11);
    }
}
