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
public final class lb0 extends FrameLayout {
    public final qb0 A;
    public final FrameLayout B;
    public final qb0 C;
    public final qb0 D;
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
    public final rb0 V;
    public final int f30273a;
    public final ih.j4 f30274b;
    public final bg.d1 f30275c;
    public final org.telegram.ui.Cells.w9 d;
    public final db0 f30276e;
    public final eb0 f30277f;
    public final gb0 h;
    public final kb0 f30278n;
    public MessagePreviewParams.Messages f30279r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f30280s;
    public final cb0 v;
    public final cb0 f30281w;
    public final org.telegram.ui.ActionBar.g1 f30282x;
    public final org.telegram.ui.ActionBar.g1 f30283y;

    public lb0(org.telegram.ui.Components.rb0 r35, android.content.Context r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lb0.<init>(org.telegram.ui.Components.rb0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(lb0 lb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = lb0Var.f30279r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(lb0 lb0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (lb0Var.f30273a == 2) {
            MessagePreviewParams messagePreviewParams = lb0Var.V.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.Q3(characterStyle);
                return;
            }
        }
        s1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        rb0 rb0Var = this.V;
        MessagePreviewParams.Messages messages = rb0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = rb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.jn jnVar = rb0Var.d.quote;
                    if (jnVar != null) {
                        return jnVar.f39590a;
                    }
                }
                return valueAt.captionMessage;
            }
            return rb0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lb0.d():android.view.View");
    }

    public final void e(float f9, int i10) {
        boolean z10 = this.V.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30280s;
        bg.d1 d1Var = this.f30275c;
        ih.j4 j4Var = this.f30274b;
        if (z10) {
            d1Var.setTranslationY(0.0f);
            j4Var.invalidateOutline();
            j4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            d1Var.setTranslationY(i10);
            j4Var.invalidateOutline();
            j4Var.setTranslationY(f9);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f9 + j4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x4 = j4Var.getX();
        org.telegram.ui.Cells.w9 w9Var = this.d;
        w9Var.setTranslationX(x4);
        w9Var.setTranslationY(j4Var.getY());
    }

    public final void f() {
        rb0 rb0Var = this.V;
        new tc(rb0Var, rb0Var.B).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z10, boolean z11) {
        float f9;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        int i13 = 0;
        if (this.V.f32250b) {
            z10 = false;
        }
        if (!z11 || this.K != z10) {
            this.K = z10;
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f30283y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f30282x;
            cb0 cb0Var = this.f30281w;
            cb0 cb0Var2 = this.v;
            float f15 = 0.0f;
            if (z11) {
                this.L = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (cb0Var2 != null) {
                    cb0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(cb0Var2, property, f14));
                }
                if (cb0Var != null) {
                    cb0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(cb0Var, property, f13));
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
                this.L.playTogether(arrayList);
                this.L.setDuration(360L);
                this.L.setInterpolator(jr.h);
                this.L.addListener(new z9(15, this, z10));
                this.L.start();
                return;
            }
            if (cb0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cb0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                cb0Var2.setVisibility(i12);
            }
            if (cb0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                cb0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                cb0Var.setVisibility(i11);
            }
            if (g1Var2 != null) {
                if (!z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                g1Var2.setAlpha(f9);
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
        rb0 rb0Var = this.V;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        gb0 gb0Var = this.h;
        if (gb0Var.k()) {
            this.R = true;
            return;
        }
        for (int i11 = 0; i11 < this.f30279r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f30279r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = rb0Var.f32249a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f30273a == 2) {
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
        for (int i12 = 0; i12 < this.f30279r.pollChosenAnswers.size(); i12++) {
            this.f30279r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f30279r.groupedMessagesMap.size(); i13++) {
            gb0Var.V(this.f30279r.groupedMessagesMap.valueAt(i13));
        }
        this.f30278n.q(0, this.f30279r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.N;
        float f9 = this.O;
        rb0 rb0Var = this.V;
        boolean z10 = rb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30280s;
        eb0 eb0Var = this.f30277f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = eb0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < eb0Var.getChildCount(); i13++) {
                View childAt = eb0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f30279r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int d = j7.l1.d(4.0f, measuredHeight, 0);
                this.N = d;
                int measuredHeight2 = (eb0Var.getMeasuredHeight() - this.N) + d;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.N = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.S) - AndroidUtilities.dp(8.0f))), this.N);
            } else {
                this.N = 0;
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f30274b.getMeasuredHeight() - this.N) + (this.S - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.N;
            this.O = A;
            if (A > AndroidUtilities.dp(8.0f)) {
                this.O = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.O = 0.0f;
            this.N = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + eb0Var.getMeasuredWidth());
        }
        boolean z11 = this.G;
        if (!z11 && (this.N != i10 || this.O != f9)) {
            ValueAnimator valueAnimator = rb0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            rb0Var.h = ofFloat;
            ofFloat.addUpdateListener(new uj(this, i10, f9, 1));
            rb0Var.h.setDuration(250L);
            rb0Var.h.setInterpolator(uh.m.V);
            rb0Var.h.addListener(new zz(this, 6));
            AndroidUtilities.runOnUIThread(rb0Var.f32259y, 50L);
            this.P = i10;
            e(f9, i10);
        } else if (z11) {
            float f10 = this.O;
            int i15 = this.N;
            this.P = i15;
            e(f10, i15);
        }
    }

    public final void j() {
        MessageObject messageObject;
        MessageObject messageObject2;
        rb0 rb0Var = this.V;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        if (this.f30273a == 0) {
            db0 db0Var = this.f30276e;
            if (db0Var.v - db0Var.f25969u <= MessagesController.getInstance(rb0Var.f32257w).quoteLengthMax) {
                org.telegram.ui.Cells.s9 s9Var = db0Var.W;
                if (s9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.s1) s9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c3 = c(messageObject);
                if (messagePreviewParams.quote != null && db0Var.y()) {
                    messagePreviewParams.quoteStart = db0Var.f25969u;
                    messagePreviewParams.quoteEnd = db0Var.v;
                    if (c3 != null && ((messageObject2 = messagePreviewParams.quote.f39590a) == null || messageObject2.getId() != c3.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.jn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c3);
                        rb0Var.b();
                    }
                }
                db0Var.f(false);
            }
        }
    }

    public final void k(boolean z10) {
        String str;
        int size;
        String string;
        rb0 rb0Var = this.V;
        TLRPC.User user = rb0Var.f32254n;
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        TLRPC.Chat chat = rb0Var.f32255r;
        bg.d1 d1Var = this.f30275c;
        int i10 = this.f30273a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            d1Var.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
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
            d1Var.c(string, z10);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                d1Var.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                d1Var.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            d1Var.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            d1Var.c(str, z10);
        } else if (i10 == 2) {
            d1Var.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            d1Var.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30273a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f30277f, (f5.d) new va0(this, 0));
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i();
        this.G = false;
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
        rb0 rb0Var = this.V;
        rb0Var.v = z10;
        this.S = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f30280s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.S;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.M;
        this.S = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f30277f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z11 = rb0Var.v;
        ih.j4 j4Var = this.f30274b;
        if (z11) {
            j4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            j4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).bottomMargin = 0;
            j4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.S;
            if (j4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                j4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            j4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - j4Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.T != size2) {
            for (int i13 = 0; i13 < this.f30279r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f30279r.previewMessages.get(i13);
                if (rb0Var.v) {
                    size = j4Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                kb0 kb0Var = this.f30278n;
                if (kb0Var != null) {
                    kb0Var.l();
                }
            }
            this.G = true;
        }
        this.T = size2;
        super.onMeasure(i10, i11);
    }
}
