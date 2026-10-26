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
public final class hc0 extends FrameLayout {
    public final mc0 E;
    public final FrameLayout F;
    public final mc0 G;
    public final mc0 H;
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
    public final int f28914a;
    public int f28915a0;
    public final org.telegram.ui.a9 f28916b;
    public boolean f28917b0;
    public final qb0 f28918c;
    public final nc0 f28919c0;
    public final org.telegram.ui.Cells.ea d;
    public final zb0 e;
    public final ac0 f28920f;
    public final cc0 h;
    public final gc0 f28921n;
    public MessagePreviewParams.Messages f28922r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28923s;
    public final yb0 v;
    public final yb0 f28924w;
    public final org.telegram.ui.ActionBar.g1 f28925x;
    public final org.telegram.ui.ActionBar.g1 f28926y;

    public hc0(org.telegram.ui.Components.nc0 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hc0.<init>(org.telegram.ui.Components.nc0, android.content.Context, int):void");
    }

    public static MessageObject.GroupedMessages a(hc0 hc0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = hc0Var.f28922r.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
        }
        return null;
    }

    public static void b(hc0 hc0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (hc0Var.f28914a == 2) {
            MessagePreviewParams messagePreviewParams = hc0Var.f28919c0.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.S3(characterStyle);
                return;
            }
        }
        s1Var.S3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages valueAt;
        nc0 nc0Var = this.f28919c0;
        MessagePreviewParams.Messages messages = nc0Var.d.replyMessage;
        if (messages != null) {
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0 && (valueAt = nc0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) != null) {
                if (valueAt.isDocuments) {
                    if (messageObject != null) {
                        return messageObject;
                    }
                    org.telegram.ui.kn knVar = nc0Var.d.quote;
                    if (knVar != null) {
                        return knVar.f40979a;
                    }
                }
                return valueAt.captionMessage;
            }
            return nc0Var.d.replyMessage.messages.get(0);
        }
        return null;
    }

    public final android.view.View d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hc0.d():android.view.View");
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
        boolean z10 = this.f28919c0.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28923s;
        qb0 qb0Var = this.f28918c;
        org.telegram.ui.a9 a9Var = this.f28916b;
        if (z10) {
            qb0Var.setTranslationY(0.0f);
            a9Var.invalidateOutline();
            a9Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            qb0Var.setTranslationY(i10);
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
        nc0 nc0Var = this.f28919c0;
        new wc(nc0Var, nc0Var.F).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
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
        if (this.f28919c0.f30957b) {
            z10 = false;
        }
        if (!z11 || this.O != z10) {
            this.O = z10;
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f28926y;
            org.telegram.ui.ActionBar.g1 g1Var2 = this.f28925x;
            yb0 yb0Var = this.f28924w;
            yb0 yb0Var2 = this.v;
            float f15 = 0.0f;
            if (z11) {
                this.P = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (yb0Var2 != null) {
                    yb0Var2.setVisibility(0);
                    if (!z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(yb0Var2, property, f14));
                }
                if (yb0Var != null) {
                    yb0Var.setVisibility(0);
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(yb0Var, property, f13));
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
                this.P.addListener(new org.telegram.ui.jo(16, this, z10));
                this.P.start();
                return;
            }
            if (yb0Var2 != null) {
                if (!z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                yb0Var2.setAlpha(f11);
                if (!z10) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                yb0Var2.setVisibility(i12);
            }
            if (yb0Var != null) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                yb0Var.setAlpha(f10);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                yb0Var.setVisibility(i11);
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
        nc0 nc0Var = this.f28919c0;
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        cc0 cc0Var = this.h;
        if (cc0Var.k()) {
            this.V = true;
            return;
        }
        for (int i11 = 0; i11 < this.f28922r.previewMessages.size(); i11++) {
            MessageObject messageObject = this.f28922r.previewMessages.get(i11);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = nc0Var.f30956a;
            if (!messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            } else {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            }
            if (this.f28914a == 2) {
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
        for (int i12 = 0; i12 < this.f28922r.pollChosenAnswers.size(); i12++) {
            this.f28922r.pollChosenAnswers.get(i12).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i13 = 0; i13 < this.f28922r.groupedMessagesMap.size(); i13++) {
            cc0Var.V(this.f28922r.groupedMessagesMap.valueAt(i13));
        }
        this.f28921n.q(0, this.f28922r.previewMessages.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        nc0 nc0Var = this.f28919c0;
        boolean z10 = nc0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28923s;
        ac0 ac0Var = this.f28920f;
        int i11 = 0;
        if (!z10) {
            int measuredHeight = ac0Var.getMeasuredHeight();
            int i12 = 0;
            for (int i13 = 0; i13 < ac0Var.getChildCount(); i13++) {
                View childAt = ac0Var.getChildAt(i13);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i12++;
                }
            }
            MessagePreviewParams.Messages messages = this.f28922r;
            if (messages != null && i12 != 0 && i12 <= messages.previewMessages.size()) {
                int c10 = org.telegram.messenger.t.c(4.0f, measuredHeight, 0);
                this.R = c10;
                int measuredHeight2 = (ac0Var.getMeasuredHeight() - this.R) + c10;
                int i14 = AndroidUtilities.displaySize.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i11 = AndroidUtilities.navigationBarHeight;
                }
                this.R = Math.min(measuredHeight2 - ((int) ((((i14 - i11) * 0.8f) - this.W) - AndroidUtilities.dp(8.0f))), this.R);
            } else {
                this.R = 0;
            }
            float B = c3.h0.B(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f28916b.getMeasuredHeight() - this.R) + (this.W - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.R;
            this.S = B;
            if (B > AndroidUtilities.dp(8.0f)) {
                this.S = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ac0Var.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (!z11 && (this.R != i10 || this.S != f7)) {
            ValueAnimator valueAnimator = nc0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            nc0Var.h = ofFloat;
            ofFloat.addUpdateListener(new zj(this, i10, f7, 1));
            nc0Var.h.setDuration(250L);
            nc0Var.h.setInterpolator(mi.m.V);
            nc0Var.h.addListener(new i10(this, 6));
            AndroidUtilities.runOnUIThread(nc0Var.f30965y, 50L);
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
        nc0 nc0Var = this.f28919c0;
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        if (this.f28914a == 0) {
            zb0 zb0Var = this.e;
            if (zb0Var.v - zb0Var.f24118u <= MessagesController.getInstance(nc0Var.f30963w).quoteLengthMax) {
                org.telegram.ui.Cells.aa aaVar = zb0Var.W;
                if (aaVar != null) {
                    messageObject = ((org.telegram.ui.Cells.s1) aaVar).getMessageObject();
                } else {
                    messageObject = null;
                }
                MessageObject c10 = c(messageObject);
                if (messagePreviewParams.quote != null && zb0Var.x()) {
                    messagePreviewParams.quoteStart = zb0Var.f24118u;
                    messagePreviewParams.quoteEnd = zb0Var.v;
                    if (c10 != null) {
                        org.telegram.ui.kn knVar = messagePreviewParams.quote;
                        if (knVar.f40988m || (messageObject2 = knVar.f40979a) == null || messageObject2.getId() != c10.getId()) {
                            messagePreviewParams.quote = org.telegram.ui.kn.c(c10, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                            nc0Var.b();
                        }
                    }
                }
                zb0Var.f(false);
            }
        }
    }

    public final void l(boolean z10) {
        String str;
        int size;
        String string;
        nc0 nc0Var = this.f28919c0;
        TLRPC.User user = nc0Var.f30960n;
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        TLRPC.Chat chat = nc0Var.f30961r;
        qb0 qb0Var = this.f28918c;
        int i10 = this.f28914a;
        if (i10 == 1) {
            MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
            if (messages == null) {
                size = 0;
            } else {
                size = messages.selectedIds.size();
            }
            qb0Var.b(LocaleController.formatPluralString("PreviewForwardMessagesCount", size, new Object[0]), z10);
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
            qb0Var.a(string, z10);
        } else if (i10 == 0) {
            if (messagePreviewParams.quote != null && messagePreviewParams.replyMessage.hasText) {
                qb0Var.b(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                qb0Var.a(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
            qb0Var.b(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
            if (messagePreviewParams.replyMessage.hasText) {
                str = LocaleController.getString(R.string.MessageOptionsReplySubtitle);
            } else {
                str = "";
            }
            qb0Var.a(str, z10);
        } else if (i10 == 2) {
            qb0Var.b(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
            qb0Var.a(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28914a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f28920f, (Utilities.Callback<View>) new b3(this, 7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.f28917b0 = true;
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
        nc0 nc0Var = this.f28919c0;
        nc0Var.v = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28923s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f28920f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = nc0Var.v;
        org.telegram.ui.a9 a9Var = this.f28916b;
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
        if (this.f28915a0 != size2) {
            for (int i13 = 0; i13 < this.f28922r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f28922r.previewMessages.get(i13);
                if (nc0Var.v) {
                    size = a9Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                }
                messageObject.parentWidth = size;
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                gc0 gc0Var = this.f28921n;
                if (gc0Var != null) {
                    gc0Var.l();
                }
            }
            this.K = true;
        }
        this.f28915a0 = size2;
        super.onMeasure(i10, i11);
    }
}
