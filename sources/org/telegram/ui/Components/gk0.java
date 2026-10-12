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
public final class gk0 extends FrameLayout {
    public final f10 f25306a;
    public final TextView f25307b;
    public final n9 f25308c;
    public final ImageView d;
    public final z9 e;
    public final int f25309f;
    public boolean h;
    public final ArrayList f25310n;
    public final ArrayList f25311r;
    public final MessageObject f25312s;
    public int v;
    public q0.a f25313w;

    public gk0(Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f25310n = new ArrayList();
        this.f25311r = new ArrayList();
        this.f25309f = i10;
        this.f25312s = messageObject;
        f10 f10Var = new f10(context, null);
        this.f25306a = f10Var;
        f10Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f19990i6, -1);
        f10Var.setViewType(13);
        f10Var.setIsSingleCell(false);
        addView(f10Var, w7.a6.d(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f25307b = textView;
        org.telegram.messenger.yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        n9 n9Var = new n9(context, false);
        this.f25308c = n9Var;
        n9Var.setStyle(11);
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(n9Var, w7.a6.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, w7.a6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        z9 z9Var = new z9(context);
        this.e = z9Var;
        addView(z9Var, w7.a6.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        n9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.g6.L0(false));
    }

    public final void a() {
        int i10 = this.f25309f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f25312s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f19309id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 10), 64);
    }

    public List<fk0> getSeenUsers() {
        return this.f25310n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        super.onAttachedToWindow();
        int i10 = this.f25309f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        MessageObject messageObject = this.f25312s;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new bi.l1(this, j10, chat, 2), 64);
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
        f10 f10Var = this.f25306a;
        if (f10Var.getVisibility() == 0) {
            this.h = true;
            f10Var.setVisibility(8);
            super.onMeasure(i10, i11);
            f10Var.getLayoutParams().width = getMeasuredWidth();
            f10Var.setVisibility(0);
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
        this.f25313w = aVar;
    }
}
