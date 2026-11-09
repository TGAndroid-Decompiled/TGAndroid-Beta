package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ne extends cn0 {
    public final ChatActivityEnterView H;

    public ne(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.cn cnVar, org.telegram.messenger.qp qpVar, final boolean z9, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f27485b = true;
        this.f27486c = 150;
        this.f27488f = -1L;
        this.f27491j = new h2.f((int[]) null);
        e();
        this.f32726z = new ArrayList();
        this.G = new ArrayList();
        this.f32719r = peer;
        this.f32720s = tL_channels_sendAsPeers;
        bi.e5 e5Var = new bi.e5(24, context, this);
        this.f32721t = e5Var;
        e5Var.setLayoutParams(c8.ha.c(-2.0f, -2));
        setContentView(e5Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232567).mutate();
        org.telegram.ui.ActionBar.s6.x(e5Var, mutate, org.telegram.ui.ActionBar.l6.G8, g6Var, PorterDuff.Mode.MULTIPLY);
        e5Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        e5Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (cnVar == null) {
            width = org.telegram.messenger.g0.f22563q.x;
        } else {
            width = cnVar.l1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        wm0 wm0Var = new wm0(context, i7, L);
        this.f32716o = wm0Var;
        wm0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f32717p = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28029m5, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.id.M0(2131745600, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        wm0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        qj0 qj0Var = new qj0(context, null);
        this.v = qj0Var;
        v4.b0 b0Var = new v4.b0();
        this.f32723w = b0Var;
        qj0Var.setLayoutManager(b0Var);
        qj0Var.setAdapter(new xm0(g6Var, arrayList, qpVar, i7, peer));
        qj0Var.j(new ym0(this));
        qj0Var.setOnItemClickListener(new cj0(arrayList, context, cnVar, z9, hVar) {
            public final List f39131b;
            public final Context f39132c;
            public final org.telegram.ui.cn d;
            public final a3.h f39133e;

            {
                this.f39133e = hVar;
            }

            @Override
            public final void c(int i10, View view) {
                cn0.k(ne.this, this.f39131b, this.f39132c, this.d, this.f39133e, view, i10);
            }
        });
        qj0Var.setOverScrollMode(2);
        frameLayout.addView(qj0Var);
        View view = new View(context);
        this.f32722u = view;
        Drawable drawable = context.getDrawable(2131231237);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ha.c(4.0f, -1));
        wm0Var.addView(frameLayout, c8.ha.c(-2.0f, -1));
        e5Var.addView(wm0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f32726z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f31114q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f31114q0 = null;
        int i7 = 0;
        if (!this.f32718q) {
            l(new r1.g[0]);
            chatActivityEnterView.f31108p0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
