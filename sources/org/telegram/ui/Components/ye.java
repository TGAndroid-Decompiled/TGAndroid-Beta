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
public final class ye extends pn0 {
    public final ChatActivityEnterView H;

    public ye(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bn bnVar, org.telegram.messenger.mp mpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f29034b = true;
        this.f29035c = 150;
        this.f29037f = -1L;
        this.f29040j = new h2.f((int[]) null);
        e();
        this.f38525z = new ArrayList();
        this.G = new ArrayList();
        this.f38518r = peer;
        this.f38519s = tL_channels_sendAsPeers;
        bi.g3 g3Var = new bi.g3(25, context, this);
        this.f38520t = g3Var;
        g3Var.setLayoutParams(c8.na.c(-2.0f, -2));
        setContentView(g3Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232572).mutate();
        org.telegram.ui.ActionBar.u6.x(g3Var, mutate, org.telegram.ui.ActionBar.n6.G8, i6Var, PorterDuff.Mode.MULTIPLY);
        g3Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        g3Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (bnVar == null) {
            width = org.telegram.messenger.g0.f24226q.x;
        } else {
            width = bnVar.f46279m1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        jn0 jn0Var = new jn0(context, i7, L);
        this.f38515o = jn0Var;
        jn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f38516p = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29615m5, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.gd.N0(2131745404, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        jn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ek0 ek0Var = new ek0(context, null);
        this.v = ek0Var;
        v4.c0 c0Var = new v4.c0();
        this.f38522w = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setAdapter(new kn0(i6Var, arrayList, mpVar, i7, peer));
        ek0Var.j(new ln0(this));
        ek0Var.setOnItemClickListener(new qj0(arrayList, context, bnVar, z10, hVar) {
            public final List f36059b;
            public final Context f36060c;
            public final org.telegram.ui.bn d;
            public final a3.h f36061e;

            {
                this.f36061e = hVar;
            }

            @Override
            public final void b(int i10, View view) {
                pn0.k(ye.this, this.f36059b, this.f36060c, this.d, this.f36061e, view, i10);
            }
        });
        ek0Var.setOverScrollMode(2);
        frameLayout.addView(ek0Var);
        View view = new View(context);
        this.f38521u = view;
        Drawable drawable = context.getDrawable(2131231240);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.na.c(4.0f, -1));
        jn0Var.addView(frameLayout, c8.na.c(-2.0f, -1));
        g3Var.addView(jn0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f38525z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f32769r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f32769r0 = null;
        int i7 = 0;
        if (!this.f38517q) {
            l(new r1.g[0]);
            chatActivityEnterView.f32760q0.a(true, true, 0.0f);
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
