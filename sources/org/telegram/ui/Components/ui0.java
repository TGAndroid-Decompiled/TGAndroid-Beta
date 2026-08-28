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
public final class ui0 extends FrameLayout {
    public final e00 f33032a;
    public final TextView f33033b;
    public final c9 f33034c;
    public final ImageView d;
    public final o9 f33035e;
    public final int f33036f;
    public boolean h;
    public final ArrayList f33037n;
    public final ArrayList f33038r;
    public final MessageObject f33039s;
    public int v;
    public q0.a f33040w;

    public ui0(Context context, int i9, MessageObject messageObject) {
        super(context);
        this.f33037n = new ArrayList();
        this.f33038r = new ArrayList();
        this.f33036f = i9;
        this.f33039s = messageObject;
        e00 e00Var = new e00(context, null);
        this.f33032a = e00Var;
        e00Var.f(org.telegram.ui.ActionBar.f6.G8, org.telegram.ui.ActionBar.f6.f23092i6, -1);
        e00Var.setViewType(13);
        e00Var.setIsSingleCell(false);
        addView(e00Var, g7.e6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f33033b = textView;
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        c9 c9Var = new c9(context, false);
        this.f33034c = c9Var;
        c9Var.setStyle(11);
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(c9Var, g7.e6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, g7.e6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        o9 o9Var = new o9(context);
        this.f33035e = o9Var;
        addView(o9Var, g7.e6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        c9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.f6.K0(false));
    }

    public final void a() {
        int i9 = this.f33036f;
        MessagesController messagesController = MessagesController.getInstance(i9);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f33039s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22473id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 10), 64);
    }

    public List<ti0> getSeenUsers() {
        return this.f33037n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        super.onAttachedToWindow();
        int i9 = this.f33036f;
        MessagesController messagesController = MessagesController.getInstance(i9);
        MessageObject messageObject = this.f33039s;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat != null && messageObject.isOutOwner() && messageObject.isSent() && !messageObject.isEditing() && !messageObject.isSending() && !messageObject.isSendError() && !messageObject.isContentUnread() && !messageObject.isUnread() && ConnectionsManager.getInstance(i9).getCurrentTime() - messageObject.messageOwner.date < 604800 && ((ChatObject.isMegagroup(chat) || !ChatObject.isChannel(chat)) && chatFull != null && chatFull.participants_count <= MessagesController.getInstance(i9).chatReadMarkSizeThreshold && !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
            tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i9).getInputPeer(messageObject.getDialogId());
            TLRPC.Peer peer = messageObject.messageOwner.from_id;
            if (peer != null) {
                j10 = peer.user_id;
            } else {
                j10 = 0;
            }
            ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getMessageReadParticipants, new bg.f0(this, j10, chat, 5), 64);
            return;
        }
        a();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = this.v;
        if (i11 > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        e00 e00Var = this.f33032a;
        if (e00Var.getVisibility() == 0) {
            this.h = true;
            e00Var.setVisibility(8);
            super.onMeasure(i9, i10);
            e00Var.getLayoutParams().width = getMeasuredWidth();
            e00Var.setVisibility(0);
            this.h = false;
            super.onMeasure(i9, i10);
            return;
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(q0.a aVar) {
        this.f33040w = aVar;
    }
}
