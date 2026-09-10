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
public final class pj0 extends FrameLayout {
    public final a10 f26143a;
    public final TextView f26144b;
    public final j9 f26145c;
    public final ImageView d;
    public final w9 e;
    public final int f26146f;
    public boolean h;
    public final ArrayList f26147n;
    public final ArrayList f26148r;
    public final MessageObject f26149s;
    public int v;
    public q0.a f26150w;

    public pj0(Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f26147n = new ArrayList();
        this.f26148r = new ArrayList();
        this.f26146f = i10;
        this.f26149s = messageObject;
        a10 a10Var = new a10(context, null);
        this.f26143a = a10Var;
        a10Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f18017i6, -1);
        a10Var.setViewType(13);
        a10Var.setIsSingleCell(false);
        addView(a10Var, w7.a6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f26144b = textView;
        org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        j9 j9Var = new j9(context, false);
        this.f26145c = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(j9Var, w7.a6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, w7.a6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        w9 w9Var = new w9(context);
        this.e = w9Var;
        addView(w9Var, w7.a6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        j9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.j6.K0(false));
    }

    public final void a() {
        int i10 = this.f26146f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f26149s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f17288id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new z1(this, 10), 64);
    }

    public List<oj0> getSeenUsers() {
        return this.f26147n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        super.onAttachedToWindow();
        int i10 = this.f26146f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        MessageObject messageObject = this.f26149s;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat != null && messageObject.isOutOwner() && messageObject.isSent() && !messageObject.isEditing() && !messageObject.isSending() && !messageObject.isSendError() && !messageObject.isContentUnread() && !messageObject.isUnread() && ConnectionsManager.getInstance(i10).getCurrentTime() - messageObject.messageOwner.date < 604800 && ((ChatObject.isMegagroup(chat) || !ChatObject.isChannel(chat)) && chatFull != null && chatFull.participants_count <= MessagesController.getInstance(i10).chatReadMarkSizeThreshold && !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
            tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
            TLRPC.Peer peer = messageObject.messageOwner.from_id;
            if (peer != null) {
                j3 = peer.user_id;
            } else {
                j3 = 0;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new org.telegram.messenger.voip.h(this, j3, chat, 1), 64);
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
        a10 a10Var = this.f26143a;
        if (a10Var.getVisibility() == 0) {
            this.h = true;
            a10Var.setVisibility(8);
            super.onMeasure(i10, i11);
            a10Var.getLayoutParams().width = getMeasuredWidth();
            a10Var.setVisibility(0);
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
        this.f26150w = aVar;
    }
}
