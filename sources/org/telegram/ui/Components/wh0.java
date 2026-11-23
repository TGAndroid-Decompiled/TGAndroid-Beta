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
    public final yz f41795a;
    public final TextView f41796b;
    public final e9 f41797c;
    public final ImageView d;
    public final q9 f41798e;
    public final int f41799f;
    public boolean h;
    public final ArrayList f41800n;
    public final ArrayList f41801r;
    public final org.telegram.messenger.gj f41802s;
    public int f41803w;
    public q0.a f41804x;

    public wh0(Context context, int i7, org.telegram.messenger.gj gjVar) {
        super(context);
        this.f41800n = new ArrayList();
        this.f41801r = new ArrayList();
        this.f41799f = i7;
        this.f41802s = gjVar;
        yz yzVar = new yz(context, null);
        this.f41795a = yzVar;
        yzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f29439i6, -1);
        yzVar.setViewType(13);
        yzVar.setIsSingleCell(false);
        addView(yzVar, c8.na.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f41796b = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.na.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        e9 e9Var = new e9(context, false);
        this.f41797c = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(e9Var, c8.na.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, c8.na.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(2131232325).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        q9 q9Var = new q9(context);
        this.f41798e = q9Var;
        addView(q9Var, c8.na.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        e9Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.m6.N0(false));
    }

    public final void a() {
        int i7 = this.f41799f;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.gj gjVar = this.f41802s;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.gj.B0(gjVar.f24177k));
        tL_messages_getMessageReactionsList.f28493id = gjVar.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new f2(this, 9), 64);
    }

    public List<vh0> getSeenUsers() {
        return this.f41800n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        super.onAttachedToWindow();
        int i7 = this.f41799f;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        org.telegram.messenger.gj gjVar = this.f41802s;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(gjVar.x0()));
        TLRPC.ChatFull P0 = u12.P0(gjVar.x0());
        if (O0 != null && gjVar.P3() && gjVar.q4() && !gjVar.Y2() && !gjVar.o4() && !gjVar.n4() && !gjVar.f24177k.media_unread && !gjVar.F4() && ConnectionsManager.getInstance(i7).getCurrentTime() - gjVar.f24177k.date < 604800 && ((org.telegram.messenger.v3.n0(O0) || !org.telegram.messenger.v3.T(O0)) && P0 != null && P0.participants_count <= org.telegram.messenger.np.u1(i7).f25921s3 && !(gjVar.f24177k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = gjVar.e1();
            tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.np.u1(i7).l1(org.telegram.messenger.gj.B0(gjVar.f24177k));
            TLRPC.Peer peer = gjVar.f24177k.from_id;
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
        int i11 = this.f41803w;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        yz yzVar = this.f41795a;
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
        this.f41804x = aVar;
    }
}
