package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fj0 extends FrameLayout {
    public final p00 f28411a;
    public final TextView f28412b;
    public final h9 f28413c;
    public final ImageView d;
    public final t9 f28414e;
    public final int f28415f;
    public boolean h;
    public final ArrayList f28416n;
    public final ArrayList f28417r;
    public final MessageObject f28418s;
    public int v;
    public q0.a f28419w;

    public fj0(Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f28416n = new ArrayList();
        this.f28417r = new ArrayList();
        this.f28415f = i10;
        this.f28418s = messageObject;
        p00 p00Var = new p00(context, null);
        this.f28411a = p00Var;
        p00Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f23152i6, -1);
        p00Var.setViewType(13);
        p00Var.setIsSingleCell(false);
        addView(p00Var, i7.f6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f28412b = textView;
        org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, i7.f6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        h9 h9Var = new h9(context, false);
        this.f28413c = h9Var;
        h9Var.setStyle(11);
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(h9Var, i7.f6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, i7.f6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        t9 t9Var = new t9(context);
        this.f28414e = t9Var;
        addView(t9Var, i7.f6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        h9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.g6.K0(false));
    }

    public final void a() {
        int i10 = this.f28415f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f28418s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22485id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new a2(this, 10), 64);
    }

    public List<ej0> getSeenUsers() {
        return this.f28416n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        super.onAttachedToWindow();
        int i10 = this.f28415f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        MessageObject messageObject = this.f28418s;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat != null && messageObject.isOutOwner() && messageObject.isSent() && !messageObject.isEditing() && !messageObject.isSending() && !messageObject.isSendError() && !messageObject.isContentUnread() && !messageObject.isUnread() && ConnectionsManager.getInstance(i10).getCurrentTime() - messageObject.messageOwner.date < 604800 && ((ChatObject.isMegagroup(chat) || !ChatObject.isChannel(chat)) && chatFull != null && chatFull.participants_count <= MessagesController.getInstance(i10).chatReadMarkSizeThreshold && !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
            tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
            TLRPC.Peer peer = messageObject.messageOwner.from_id;
            if (peer != null) {
                j10 = peer.user_id;
            } else {
                j10 = 0;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new eg.d0(this, j10, chat, 5), 64);
            return;
        }
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.v;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        p00 p00Var = this.f28411a;
        if (p00Var.getVisibility() == 0) {
            this.h = true;
            p00Var.setVisibility(8);
            super.onMeasure(i10, i11);
            p00Var.getLayoutParams().width = getMeasuredWidth();
            p00Var.setVisibility(0);
            this.h = false;
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(q0.a aVar) {
        this.f28419w = aVar;
    }
}
