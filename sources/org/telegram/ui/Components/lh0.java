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
public final class lh0 extends FrameLayout {
    public final pz f36803a;
    public final TextView f36804b;
    public final w8 f36805c;
    public final ImageView d;
    public final i9 f36806e;
    public final int f36807f;
    public boolean h;
    public final ArrayList f36808n;
    public final ArrayList f36809r;
    public final org.telegram.messenger.gj f36810s;
    public int f36811w;
    public q0.a f36812x;

    public lh0(Context context, int i7, org.telegram.messenger.gj gjVar) {
        super(context);
        this.f36808n = new ArrayList();
        this.f36809r = new ArrayList();
        this.f36807f = i7;
        this.f36810s = gjVar;
        pz pzVar = new pz(context, null);
        this.f36803a = pzVar;
        pzVar.e(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f28941i6, -1);
        pzVar.setViewType(13);
        pzVar.setIsSingleCell(false);
        addView(pzVar, c8.ja.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.f36804b = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ja.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        w8 w8Var = new w8(context, false);
        this.f36805c = w8Var;
        w8Var.setStyle(11);
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(w8Var, c8.ja.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, c8.ja.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(2131232324).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        i9 i9Var = new i9(context);
        this.f36806e = i9Var;
        addView(i9Var, c8.ja.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        w8Var.setAlpha(0.0f);
        setBackground(org.telegram.ui.ActionBar.j6.N0(false));
    }

    public final void a() {
        int i7 = this.f36807f;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.gj gjVar = this.f36810s;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.gj.B0(gjVar.f23817k));
        tL_messages_getMessageReactionsList.f28146id = gjVar.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new v1(this, 9), 64);
    }

    public List<kh0> getSeenUsers() {
        return this.f36808n;
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        super.onAttachedToWindow();
        int i7 = this.f36807f;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        org.telegram.messenger.gj gjVar = this.f36810s;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(gjVar.x0()));
        TLRPC.ChatFull N0 = s12.N0(gjVar.x0());
        if (M0 != null && gjVar.P3() && gjVar.q4() && !gjVar.Y2() && !gjVar.o4() && !gjVar.n4() && !gjVar.f23817k.media_unread && !gjVar.F4() && ConnectionsManager.getInstance(i7).getCurrentTime() - gjVar.f23817k.date < 604800 && ((org.telegram.messenger.t3.n0(M0) || !org.telegram.messenger.t3.T(M0)) && N0 != null && N0.participants_count <= org.telegram.messenger.np.s1(i7).f25369q3 && !(gjVar.f23817k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = gjVar.e1();
            tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.np.s1(i7).j1(org.telegram.messenger.gj.B0(gjVar.f23817k));
            TLRPC.Peer peer = gjVar.f23817k.from_id;
            if (peer != null) {
                j3 = peer.user_id;
            } else {
                j3 = 0;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.o2(this, j3, M0, 5), 64);
            return;
        }
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f36811w;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        pz pzVar = this.f36803a;
        if (pzVar.getVisibility() == 0) {
            this.h = true;
            pzVar.setVisibility(8);
            super.onMeasure(i7, i10);
            pzVar.getLayoutParams().width = getMeasuredWidth();
            pzVar.setVisibility(0);
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
        this.f36812x = aVar;
    }
}
