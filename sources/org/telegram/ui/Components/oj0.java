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
public final class oj0 extends FrameLayout {
    public final t00 f27575a;
    public final TextView f27576b;
    public final d9 f27577c;
    public final ImageView d;
    public final p9 e;
    public final int f27578f;
    public boolean h;
    public final ArrayList f27579n;
    public final ArrayList f27580r;
    public final MessageObject f27581s;
    public int v;
    public q0.a f27582w;

    public oj0(Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f27579n = new ArrayList();
        this.f27580r = new ArrayList();
        this.f27578f = i10;
        this.f27581s = messageObject;
        t00 t00Var = new t00(context, null);
        this.f27575a = t00Var;
        t00Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19996i6, -1);
        t00Var.setViewType(13);
        t00Var.setIsSingleCell(false);
        addView(t00Var, k7.b6.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f27576b = textView;
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.b6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        d9 d9Var = new d9(context, false);
        this.f27577c = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(d9Var, k7.b6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, k7.b6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        p9 p9Var = new p9(context);
        this.e = p9Var;
        addView(p9Var, k7.b6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        d9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.j6.K0(false));
    }

    public final void a() {
        int i10 = this.f27578f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f27581s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f19277id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 10), 64);
    }

    public List<nj0> getSeenUsers() {
        return this.f27579n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        super.onAttachedToWindow();
        int i10 = this.f27578f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        MessageObject messageObject = this.f27581s;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new gg.c0(this, j10, chat, 5), 64);
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
        t00 t00Var = this.f27575a;
        if (t00Var.getVisibility() == 0) {
            this.h = true;
            t00Var.setVisibility(8);
            super.onMeasure(i10, i11);
            t00Var.getLayoutParams().width = getMeasuredWidth();
            t00Var.setVisibility(0);
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
        this.f27582w = aVar;
    }
}
