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
public final class oe extends fn0 {
    public final ChatActivityEnterView H;

    public oe(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.an anVar, org.telegram.messenger.np npVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f28553b = true;
        this.f28554c = 150;
        this.f28556f = -1L;
        this.f28559j = new h2.f((int[]) null);
        e();
        this.f34660z = new ArrayList();
        this.G = new ArrayList();
        this.f34653r = peer;
        this.f34654s = tL_channels_sendAsPeers;
        bi.g2 g2Var = new bi.g2(25, context, this);
        this.f34655t = g2Var;
        g2Var.setLayoutParams(c8.ja.c(-2.0f, -2));
        setContentView(g2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232568).mutate();
        org.telegram.ui.ActionBar.q6.x(g2Var, mutate, org.telegram.ui.ActionBar.j6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
        g2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        g2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (anVar == null) {
            width = org.telegram.messenger.g0.f23609q.x;
        } else {
            width = anVar.f45278m1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        zm0 zm0Var = new zm0(context, i7, L);
        this.f34650o = zm0Var;
        zm0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f34651p = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29013m5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131745600, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        zm0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        uj0 uj0Var = new uj0(context, null);
        this.v = uj0Var;
        v4.b0 b0Var = new v4.b0();
        this.f34657w = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setAdapter(new an0(e6Var, arrayList, npVar, i7, peer));
        uj0Var.j(new bn0(this));
        uj0Var.setOnItemClickListener(new gj0(arrayList, context, anVar, z10, hVar) {
            public final List f42040b;
            public final Context f42041c;
            public final org.telegram.ui.an d;
            public final a3.h f42042e;

            {
                this.f42042e = hVar;
            }

            @Override
            public final void b(int i10, View view) {
                fn0.k(oe.this, this.f42040b, this.f42041c, this.d, this.f42042e, view, i10);
            }
        });
        uj0Var.setOverScrollMode(2);
        frameLayout.addView(uj0Var);
        View view = new View(context);
        this.f34656u = view;
        Drawable drawable = context.getDrawable(2131231237);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ja.c(4.0f, -1));
        zm0Var.addView(frameLayout, c8.ja.c(-2.0f, -1));
        g2Var.addView(zm0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f34660z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f32273r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f32273r0 = null;
        int i7 = 0;
        if (!this.f34652q) {
            l(new r1.g[0]);
            chatActivityEnterView.f32265q0.a(true, true, 0.0f);
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
