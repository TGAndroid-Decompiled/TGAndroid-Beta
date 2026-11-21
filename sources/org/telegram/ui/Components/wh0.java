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
public final class wh0 extends FrameLayout {
    public final yz f41827a;
    public final TextView f41828b;
    public final e9 f41829c;
    public final ImageView d;
    public final q9 f41830e;
    public final int f41831f;
    public boolean h;
    public final ArrayList f41832n;
    public final ArrayList f41833r;
    public final org.telegram.messenger.fj f41834s;
    public int f41835w;
    public q0.a f41836x;

    public wh0(Context context, int i7, org.telegram.messenger.fj fjVar) {
        super(context);
        this.f41832n = new ArrayList();
        this.f41833r = new ArrayList();
        this.f41831f = i7;
        this.f41834s = fjVar;
        yz yzVar = new yz(context, null);
        this.f41827a = yzVar;
        yzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f29470i6, -1);
        yzVar.setViewType(13);
        yzVar.setIsSingleCell(false);
        addView(yzVar, c8.ma.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f41828b = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        e9 e9Var = new e9(context, false);
        this.f41829c = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(e9Var, c8.ma.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, c8.ma.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(2131232325).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        q9 q9Var = new q9(context);
        this.f41830e = q9Var;
        addView(q9Var, c8.ma.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        e9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.m6.N0(false));
    }

    public final void a() {
        int i7 = this.f41831f;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.fj fjVar = this.f41834s;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar.f23993k));
        tL_messages_getMessageReactionsList.f28526id = fjVar.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new f2(this, 9), 64);
    }

    public List<vh0> getSeenUsers() {
        return this.f41832n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        super.onAttachedToWindow();
        int i7 = this.f41831f;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        org.telegram.messenger.fj fjVar = this.f41834s;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(fjVar.x0()));
        TLRPC.ChatFull P0 = u12.P0(fjVar.x0());
        if (O0 != null && fjVar.P3() && fjVar.q4() && !fjVar.Y2() && !fjVar.o4() && !fjVar.n4() && !fjVar.f23993k.media_unread && !fjVar.F4() && ConnectionsManager.getInstance(i7).getCurrentTime() - fjVar.f23993k.date < 604800 && ((org.telegram.messenger.v3.n0(O0) || !org.telegram.messenger.v3.T(O0)) && P0 != null && P0.participants_count <= org.telegram.messenger.mp.u1(i7).f25786s3 && !(fjVar.f23993k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
            tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.f23993k));
            TLRPC.Peer peer = fjVar.f23993k.from_id;
            if (peer != null) {
                j3 = peer.user_id;
            } else {
                j3 = 0;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.q2(this, j3, O0, 5), 64);
            return;
        }
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f41835w;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        yz yzVar = this.f41827a;
        if (yzVar.getVisibility() == 0) {
            this.h = true;
            yzVar.setVisibility(8);
            super.onMeasure(i7, i10);
            yzVar.getLayoutParams().width = getMeasuredWidth();
            yzVar.setVisibility(0);
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
        this.f41836x = aVar;
    }
}
