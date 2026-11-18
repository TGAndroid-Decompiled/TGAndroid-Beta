package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class uh0 extends FrameLayout {
    public final wz f40354a;
    public final TextView f40355b;
    public final e9 f40356c;
    public final ImageView d;
    public final q9 f40357e;
    public final int f40358f;
    public boolean h;
    public final ArrayList f40359n;
    public final ArrayList f40360r;
    public final org.telegram.messenger.fj f40361s;
    public int f40362w;
    public q0.a f40363x;

    public uh0(Context context, int i7, org.telegram.messenger.fj fjVar) {
        super(context);
        this.f40359n = new ArrayList();
        this.f40360r = new ArrayList();
        this.f40358f = i7;
        this.f40361s = fjVar;
        wz wzVar = new wz(context, null);
        this.f40354a = wzVar;
        wzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29488i6, -1);
        wzVar.setViewType(13);
        wzVar.setIsSingleCell(false);
        addView(wzVar, c8.ma.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f40355b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        e9 e9Var = new e9(context, false);
        this.f40356c = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(e9Var, c8.ma.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, c8.ma.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(2131232325).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        q9 q9Var = new q9(context);
        this.f40357e = q9Var;
        addView(q9Var, c8.ma.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        e9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.n6.N0(false));
    }

    public final void a() {
        int i7 = this.f40358f;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.fj fjVar = this.f40361s;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar.f23968k));
        tL_messages_getMessageReactionsList.f28500id = fjVar.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new e2(this, 9), 64);
    }

    public List<th0> getSeenUsers() {
        return this.f40359n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        super.onAttachedToWindow();
        int i7 = this.f40358f;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        org.telegram.messenger.fj fjVar = this.f40361s;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(fjVar.x0()));
        TLRPC.ChatFull P0 = u12.P0(fjVar.x0());
        if (O0 != null && fjVar.P3() && fjVar.q4() && !fjVar.Y2() && !fjVar.o4() && !fjVar.n4() && !fjVar.f23968k.media_unread && !fjVar.F4() && ConnectionsManager.getInstance(i7).getCurrentTime() - fjVar.f23968k.date < 604800 && ((org.telegram.messenger.v3.n0(O0) || !org.telegram.messenger.v3.T(O0)) && P0 != null && P0.participants_count <= org.telegram.messenger.mp.u1(i7).f25760s3 && !(fjVar.f23968k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
            tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.f23968k));
            TLRPC.Peer peer = fjVar.f23968k.from_id;
            if (peer != null) {
                j3 = peer.user_id;
            } else {
                j3 = 0;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.p2(this, j3, O0, 5), 64);
            return;
        }
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f40362w;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        wz wzVar = this.f40354a;
        if (wzVar.getVisibility() == 0) {
            this.h = true;
            wzVar.setVisibility(8);
            super.onMeasure(i7, i10);
            wzVar.getLayoutParams().width = getMeasuredWidth();
            wzVar.setVisibility(0);
            this.h = false;
            super.onMeasure(i7, i10);
            return;
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(q0.a aVar) {
        this.f40363x = aVar;
    }
}
