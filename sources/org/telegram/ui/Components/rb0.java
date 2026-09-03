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
public final class rb0 extends FrameLayout {
    public final wb0 B;
    public final FrameLayout C;
    public final wb0 D;
    public final wb0 E;
    public final int F;
    public final ChatMessageSharedResources G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public AnimatorSet M;
    public final Rect N;
    public int O;
    public float P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public final xb0 W;
    public final int f28440a;
    public final kh.i4 f28441b;
    public final ah.e f28442c;
    public final org.telegram.ui.Cells.x9 d;
    public final ib0 e;
    public final jb0 f28443f;
    public final lb0 h;
    public final qb0 f28444n;
    public MessagePreviewParams.Messages f28445r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28446s;
    public final hb0 v;
    public final hb0 f28447w;
    public final org.telegram.ui.ActionBar.g1 f28448x;
    public final org.telegram.ui.ActionBar.g1 f28449y;

    public rb0(org.telegram.ui.Components.xb0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rb0.<init>(org.telegram.ui.Components.xb0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(rb0 rb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = rb0Var.f28445r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(rb0 rb0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (rb0Var.f28440a == 2) {
            MessagePreviewParams messagePreviewParams = rb0Var.W.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.Q3(characterStyle);
                return;
            }
        }
        s1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        xb0 xb0Var = this.W;
        MessagePreviewParams.Messages messages = xb0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = xb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.pn pnVar = xb0Var.d.quote;
                    if (pnVar != null) {
                        return pnVar.f37189a;
                    }
                }
                return valueAt.captionMessage;
            }
            return xb0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rb0.d():android.view.View");
    }

    public final void e(float f10, int i10) {
        boolean z4 = this.W.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28446s;
        ah.e eVar = this.f28442c;
        kh.i4 i4Var = this.f28441b;
        if (z4) {
            eVar.setTranslationY(0.0f);
            i4Var.invalidateOutline();
            i4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            eVar.setTranslationY(i10);
            i4Var.invalidateOutline();
            i4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + i4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = i4Var.getX();
        org.telegram.ui.Cells.x9 x9Var = this.d;
        x9Var.setTranslationX(x10);
        x9Var.setTranslationY(i4Var.getY());
    }

    public final void f() {
        xb0 xb0Var = this.W;
        new qc(xb0Var, xb0Var.C).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z4, boolean z10) {
        float f10;
        int i10;
        float f11;
        int i11;
        float f12;
        int i12;
        float f13;
        float f14;
        float f15;
        int i13 = 0;
        if (this.W.f30574b) {
            z4 = false;
        }
        if (!z10 || this.L != z4) {
            this.L = z4;
            AnimatorSet animatorSet = this.M;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.M = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f28449y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f28448x;
            hb0 hb0Var = this.f28447w;
            hb0 hb0Var2 = this.v;
            float f16 = 0.0f;
            if (z10) {
                this.M = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (hb0Var2 != null) {
                    hb0Var2.setVisibility(0);
                    if (!z4) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(hb0Var2, property, f15));
                }
                if (hb0Var != null) {
                    hb0Var.setVisibility(0);
                    if (z4) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(hb0Var, property, f14));
                }
                if (g1Var2 != null) {
                    g1Var2.setVisibility(0);
                    if (!z4) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(g1Var2, property, f13));
                }
                if (g1Var != null) {
                    g1Var.setVisibility(0);
                    if (z4) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(g1Var, property, f16));
                }
                this.M.playTogether(arrayList);
                this.M.setDuration(360L);
                this.M.setInterpolator(mr.h);
                this.M.addListener(new m00(7, this, z4));
                this.M.start();
                return;
            }
            if (hb0Var2 != null) {
                if (!z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                hb0Var2.setAlpha(f12);
                if (!z4) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                hb0Var2.setVisibility(i12);
            }
            if (hb0Var != null) {
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                hb0Var.setAlpha(f11);
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                hb0Var.setVisibility(i11);
            }
            if (g1Var2 != null) {
                if (!z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                g1Var2.setAlpha(f10);
                if (!z4) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                g1Var2.setVisibility(i10);
            }
            if (g1Var != null) {
                if (z4) {
                    f16 = 1.0f;
                }
                g1Var.setAlpha(f16);
                if (!z4) {
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
        xb0 xb0Var = this.W;
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        lb0 lb0Var = this.h;
        if (lb0Var.k()) {
            this.S = true;
            return;
        }
        for (int i11 = 0; i11 < this.f28445r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f28445r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = xb0Var.f30573a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f28440a == 2) {
                TLRPC.WebPage webPage = messagePreviewParams.webpage;
                if (webPage != null && ((messageMedia = (message = messageObject.messageOwner).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    messageMedia2.webpage = messagePreviewParams.webpage;
                    boolean z4 = messagePreviewParams.webpageSmall;
                    messageMedia2.force_large_media = !z4;
                    messageMedia2.force_small_media = z4;
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
        for (int i12 = 0; i12 < this.f28445r.pollChosenAnswers.size(); i12++) {
            this.f28445r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f28445r.groupedMessagesMap.size(); i13++) {
            lb0Var.V(this.f28445r.groupedMessagesMap.valueAt(i13));
        }
        this.f28444n.q(0, this.f28445r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.O;
        float f10 = this.P;
        xb0 xb0Var = this.W;
        boolean z4 = xb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28446s;
        jb0 jb0Var = this.f28443f;
        int i11 = 0;
        if (!z4) {
            int measuredHeight = jb0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < jb0Var.getChildCount(); i13++) {
                View childAt = jb0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f28445r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int c3 = kf.k0.c(4.0f, measuredHeight, 0);
                this.O = c3;
                int measuredHeight2 = (jb0Var.getMeasuredHeight() - this.O) + c3;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.O = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.T) - AndroidUtilities.dp(8.0f))), this.O);
            } else {
                this.O = 0;
            }
            float x10 = e2.c.x(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f28441b.getMeasuredHeight() - this.O) + (this.T - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.O;
            this.P = x10;
            if (x10 > AndroidUtilities.dp(8.0f)) {
                this.P = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.P = 0.0f;
            this.O = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + jb0Var.getMeasuredWidth());
        }
        boolean z10 = this.H;
        if (!z10 && (this.O != i10 || this.P != f10)) {
            ValueAnimator valueAnimator = xb0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            xb0Var.h = ofFloat;
            ofFloat.addUpdateListener(new sj(this, i10, f10, 1));
            xb0Var.h.setDuration(250L);
            xb0Var.h.setInterpolator(wh.n.V);
            xb0Var.h.addListener(new a9(this, 27));
            AndroidUtilities.runOnUIThread(xb0Var.f30582y, 50L);
            this.Q = i10;
            e(f10, i10);
        } else if (z10) {
            float f11 = this.P;
            int i15 = this.O;
            this.Q = i15;
            e(f11, i15);
        }
    }

    public final void j() {
        MessageObject messageObject;
        MessageObject messageObject2;
        xb0 xb0Var = this.W;
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        if (this.f28440a == 0) {
            ib0 ib0Var = this.e;
            if (ib0Var.v - ib0Var.f22637u <= MessagesController.getInstance(xb0Var.f30580w).quoteLengthMax) {
                org.telegram.ui.Cells.t9 t9Var = ib0Var.W;
                if (t9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.s1) t9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c3 = c(messageObject);
                if (messagePreviewParams.quote != null && ib0Var.y()) {
                    messagePreviewParams.quoteStart = ib0Var.f22637u;
                    messagePreviewParams.quoteEnd = ib0Var.v;
                    if (c3 != null && ((messageObject2 = messagePreviewParams.quote.f37189a) == null || messageObject2.getId() != c3.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.pn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c3);
                        xb0Var.b();
                    }
                }
                ib0Var.f(false);
            }
        }
    }

    public final void k(boolean z4) {
        String str;
        int size;
        String string;
        xb0 xb0Var = this.W;
        TLRPC.User user = xb0Var.f30577n;
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        TLRPC.Chat chat = xb0Var.f30578r;
        ah.e eVar = this.f28442c;
        int i10 = this.f28440a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            eVar.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z4);
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
            eVar.c(string, z4);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                eVar.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z4);
                eVar.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z4);
                return;
            }
            eVar.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z4);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            eVar.c(str, z4);
        } else if (i10 == 2) {
            eVar.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z4);
            eVar.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28440a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f28443f, (h5.d) new bb0(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.V = true;
        this.H = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        i();
        this.H = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int size;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z4 = true;
        } else {
            z4 = false;
        }
        xb0 xb0Var = this.W;
        xb0Var.v = z4;
        this.T = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28446s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.T;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.N;
        this.T = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f28443f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z10 = xb0Var.v;
        kh.i4 i4Var = this.f28441b;
        if (z10) {
            i4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            i4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) i4Var.getLayoutParams()).bottomMargin = 0;
            i4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.T;
            if (i4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                i4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            i4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - i4Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.U != size2) {
            for (int i13 = 0; i13 < this.f28445r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f28445r.previewMessages.get(i13);
                if (xb0Var.v) {
                    size = i4Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                qb0 qb0Var = this.f28444n;
                if (qb0Var != null) {
                    qb0Var.l();
                }
            }
            this.H = true;
        }
        this.U = size2;
        super.onMeasure(i10, i11);
    }
}
