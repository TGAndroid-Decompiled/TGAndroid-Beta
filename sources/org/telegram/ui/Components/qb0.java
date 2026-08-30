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
public final class qb0 extends FrameLayout {
    public final vb0 B;
    public final FrameLayout C;
    public final vb0 D;
    public final vb0 E;
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
    public final wb0 W;
    public final int f28102a;
    public final kh.j4 f28103b;
    public final ah.d f28104c;
    public final org.telegram.ui.Cells.y9 d;
    public final hb0 e;
    public final ib0 f28105f;
    public final kb0 h;
    public final pb0 f28106n;
    public MessagePreviewParams.Messages f28107r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28108s;
    public final gb0 v;
    public final gb0 f28109w;
    public final org.telegram.ui.ActionBar.g1 f28110x;
    public final org.telegram.ui.ActionBar.g1 f28111y;

    public qb0(org.telegram.ui.Components.wb0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qb0.<init>(org.telegram.ui.Components.wb0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(qb0 qb0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = qb0Var.f28107r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(qb0 qb0Var, org.telegram.ui.Cells.t1 t1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (qb0Var.f28102a == 2) {
            MessagePreviewParams messagePreviewParams = qb0Var.W.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                t1Var.Q3(characterStyle);
                return;
            }
        }
        t1Var.Q3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        wb0 wb0Var = this.W;
        MessagePreviewParams.Messages messages = wb0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = wb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.nn nnVar = wb0Var.d.quote;
                    if (nnVar != null) {
                        return nnVar.f36691a;
                    }
                }
                return valueAt.captionMessage;
            }
            return wb0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qb0.d():android.view.View");
    }

    public final void e(float f10, int i10) {
        boolean z4 = this.W.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28108s;
        ah.d dVar = this.f28104c;
        kh.j4 j4Var = this.f28103b;
        if (z4) {
            dVar.setTranslationY(0.0f);
            j4Var.invalidateOutline();
            j4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            dVar.setTranslationY(i10);
            j4Var.invalidateOutline();
            j4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + j4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x10 = j4Var.getX();
        org.telegram.ui.Cells.y9 y9Var = this.d;
        y9Var.setTranslationX(x10);
        y9Var.setTranslationY(j4Var.getY());
    }

    public final void f() {
        wb0 wb0Var = this.W;
        new qc(wb0Var, wb0Var.C).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        if (this.W.f30286b) {
            z4 = false;
        }
        if (!z10 || this.L != z4) {
            this.L = z4;
            AnimatorSet animatorSet = this.M;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.M = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f28111y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f28110x;
            gb0 gb0Var = this.f28109w;
            gb0 gb0Var2 = this.v;
            float f16 = 0.0f;
            if (z10) {
                this.M = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (gb0Var2 != null) {
                    gb0Var2.setVisibility(0);
                    if (!z4) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(gb0Var2, property, f15));
                }
                if (gb0Var != null) {
                    gb0Var.setVisibility(0);
                    if (z4) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(gb0Var, property, f14));
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
                this.M.setInterpolator(nr.h);
                this.M.addListener(new l00(7, this, z4));
                this.M.start();
                return;
            }
            if (gb0Var2 != null) {
                if (!z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                gb0Var2.setAlpha(f12);
                if (!z4) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                gb0Var2.setVisibility(i12);
            }
            if (gb0Var != null) {
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                gb0Var.setAlpha(f11);
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                gb0Var.setVisibility(i11);
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
        wb0 wb0Var = this.W;
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        kb0 kb0Var = this.h;
        if (kb0Var.k()) {
            this.S = true;
            return;
        }
        for (int i11 = 0; i11 < this.f28107r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f28107r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = wb0Var.f30285a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f28102a == 2) {
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
        for (int i12 = 0; i12 < this.f28107r.pollChosenAnswers.size(); i12++) {
            this.f28107r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f28107r.groupedMessagesMap.size(); i13++) {
            kb0Var.V(this.f28107r.groupedMessagesMap.valueAt(i13));
        }
        this.f28106n.q(0, this.f28107r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.O;
        float f10 = this.P;
        wb0 wb0Var = this.W;
        boolean z4 = wb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28108s;
        ib0 ib0Var = this.f28105f;
        int i11 = 0;
        if (!z4) {
            int measuredHeight = ib0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < ib0Var.getChildCount(); i13++) {
                View childAt = ib0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f28107r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int c3 = kh.a2.c(4.0f, measuredHeight, 0);
                this.O = c3;
                int measuredHeight2 = (ib0Var.getMeasuredHeight() - this.O) + c3;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.O = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.T) - AndroidUtilities.dp(8.0f))), this.O);
            } else {
                this.O = 0;
            }
            float x10 = e2.c.x(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f28103b.getMeasuredHeight() - this.O) + (this.T - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.O;
            this.P = x10;
            if (x10 > AndroidUtilities.dp(8.0f)) {
                this.P = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.P = 0.0f;
            this.O = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ib0Var.getMeasuredWidth());
        }
        boolean z10 = this.H;
        if (!z10 && (this.O != i10 || this.P != f10)) {
            ValueAnimator valueAnimator = wb0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            wb0Var.h = ofFloat;
            ofFloat.addUpdateListener(new sj(this, i10, f10, 1));
            wb0Var.h.setDuration(250L);
            wb0Var.h.setInterpolator(wh.n.V);
            wb0Var.h.addListener(new a9(this, 27));
            AndroidUtilities.runOnUIThread(wb0Var.f30294y, 50L);
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
        wb0 wb0Var = this.W;
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        if (this.f28102a == 0) {
            hb0 hb0Var = this.e;
            if (hb0Var.v - hb0Var.f22701u <= MessagesController.getInstance(wb0Var.f30292w).quoteLengthMax) {
                org.telegram.ui.Cells.u9 u9Var = hb0Var.W;
                if (u9Var != null) {
                    messageObject = ((org.telegram.ui.Cells.t1) u9Var).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c3 = c(messageObject);
                if (messagePreviewParams.quote != null && hb0Var.y()) {
                    messagePreviewParams.quoteStart = hb0Var.f22701u;
                    messagePreviewParams.quoteEnd = hb0Var.v;
                    if (c3 != null && ((messageObject2 = messagePreviewParams.quote.f36691a) == null || messageObject2.getId() != c3.getId())) {
                        messagePreviewParams.quote = org.telegram.ui.nn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, c3);
                        wb0Var.b();
                    }
                }
                hb0Var.f(false);
            }
        }
    }

    public final void k(boolean z4) {
        String str;
        int size;
        String string;
        wb0 wb0Var = this.W;
        TLRPC.User user = wb0Var.f30289n;
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        TLRPC.Chat chat = wb0Var.f30290r;
        ah.d dVar = this.f28104c;
        int i10 = this.f28102a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            dVar.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z4);
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
            dVar.c(string, z4);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                dVar.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z4);
                dVar.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z4);
                return;
            }
            dVar.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z4);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            dVar.c(str, z4);
        } else if (i10 == 2) {
            dVar.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z4);
            dVar.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28102a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f28105f, (h5.d) new ab0(this, 0));
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
        wb0 wb0Var = this.W;
        wb0Var.v = z4;
        this.T = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28108s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.T;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.N;
        this.T = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f28105f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z10 = wb0Var.v;
        kh.j4 j4Var = this.f28103b;
        if (z10) {
            j4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            j4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) j4Var.getLayoutParams()).bottomMargin = 0;
            j4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.T;
            if (j4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                j4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            j4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - j4Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.U != size2) {
            for (int i13 = 0; i13 < this.f28107r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f28107r.previewMessages.get(i13);
                if (wb0Var.v) {
                    size = j4Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                pb0 pb0Var = this.f28106n;
                if (pb0Var != null) {
                    pb0Var.l();
                }
            }
            this.H = true;
        }
        this.U = size2;
        super.onMeasure(i10, i11);
    }
}
