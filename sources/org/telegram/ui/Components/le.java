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
public final class le extends en0 {
    public final ChatActivityEnterView H;

    public le(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.wm wmVar, org.telegram.messenger.hp hpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final aa.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f27493b = true;
        this.f27494c = 150;
        this.f27496f = -1L;
        this.f27499j = new g2.g((int[]) null);
        e();
        this.f33431z = new ArrayList();
        this.G = new ArrayList();
        this.f33424r = peer;
        this.f33425s = tL_channels_sendAsPeers;
        ai.o2 o2Var = new ai.o2(26, context, this);
        this.f33426t = o2Var;
        o2Var.setLayoutParams(b8.mf.c(-2.0f, -2));
        setContentView(o2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232565).mutate();
        org.telegram.ui.ActionBar.r6.y(o2Var, mutate, org.telegram.ui.ActionBar.k6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
        o2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        o2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (wmVar == null) {
            width = org.telegram.messenger.g0.f22608q.x;
        } else {
            width = wmVar.m1.getWidth();
        }
        int i3 = (int) (width * 0.75f);
        ym0 ym0Var = new ym0(context, i3, L);
        this.f33421o = ym0Var;
        ym0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f33422p = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28042m5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.bd.M0(2131745610, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        ym0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        tj0 tj0Var = new tj0(context, null);
        this.v = tj0Var;
        u4.b0 b0Var = new u4.b0();
        this.f33428w = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setAdapter(new zm0(e6Var, arrayList, hpVar, i3, peer));
        tj0Var.j(new an0(this));
        tj0Var.setOnItemClickListener(new fj0(arrayList, context, wmVar, z10, aVar) {
            public final List f40416b;
            public final Context f40417c;
            public final org.telegram.ui.wm d;
            public final aa.a f40418e;

            {
                this.f40418e = aVar;
            }

            @Override
            public final void f(int i10, View view) {
                en0.k(le.this, this.f40416b, this.f40417c, this.d, this.f40418e, view, i10);
            }
        });
        tj0Var.setOverScrollMode(2);
        frameLayout.addView(tj0Var);
        View view = new View(context);
        this.f33427u = view;
        Drawable drawable = context.getDrawable(2131231237);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, b8.mf.c(4.0f, -1));
        ym0Var.addView(frameLayout, b8.mf.c(-2.0f, -1));
        o2Var.addView(ym0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f33431z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f31186r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f31186r0 = null;
        int i3 = 0;
        if (!this.f33423q) {
            l(new q1.g[0]);
            chatActivityEnterView.f31179q0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((q1.g) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
