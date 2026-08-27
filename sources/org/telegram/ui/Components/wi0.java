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

public final class wi0 extends FrameLayout {

    public final h00 f34216a;

    public final TextView f34217b;

    public final b9 f34218c;
    public final ImageView d;

    public final n9 f34219e;

    public final int f34220f;
    public boolean h;

    public final ArrayList f34221n;

    public final ArrayList f34222r;

    public final MessageObject f34223s;
    public int v;

    public q0.a f34224w;

    public wi0(Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f34221n = new ArrayList();
        this.f34222r = new ArrayList();
        this.f34220f = i10;
        this.f34223s = messageObject;
        h00 h00Var = new h00(context, null);
        this.f34216a = h00Var;
        h00Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f23144i6, -1);
        h00Var.setViewType(13);
        h00Var.setIsSingleCell(false);
        addView(h00Var, h7.z5.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f34217b = textView;
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false), 1, 16.0f, 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, h7.z5.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        b9 b9Var = new b9(context, false);
        this.f34218c = b9Var;
        b9Var.setStyle(11);
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(b9Var, h7.z5.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, h7.z5.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        imageView.setVisibility(8);
        n9 n9Var = new n9(context);
        this.f34219e = n9Var;
        addView(n9Var, h7.z5.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        b9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.g6.K0(false));
    }

    public final void a() {
        int i10 = this.f34220f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f34223s;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22473id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 10), 64);
    }

    public List<vi0> getSeenUsers() {
        return this.f34221n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f34220f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        MessageObject messageObject = this.f34223s;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat == null || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || ConnectionsManager.getInstance(i10).getCurrentTime() - messageObject.messageOwner.date >= 604800 || ((!ChatObject.isMegagroup(chat) && ChatObject.isChannel(chat)) || chatFull == null || chatFull.participants_count > MessagesController.getInstance(i10).chatReadMarkSizeThreshold || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new cg.c0(this, peer != null ? peer.user_id : 0L, chat, 5), 64);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.v;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        h00 h00Var = this.f34216a;
        if (h00Var.getVisibility() != 0) {
            super.onMeasure(i10, i11);
            return;
        }
        this.h = true;
        h00Var.setVisibility(8);
        super.onMeasure(i10, i11);
        h00Var.getLayoutParams().width = getMeasuredWidth();
        h00Var.setVisibility(0);
        this.h = false;
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
        this.f34224w = aVar;
    }
}
