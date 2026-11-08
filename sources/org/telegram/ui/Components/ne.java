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
public final class ne extends bn0 {
    public final ChatActivityEnterView H;

    public ne(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.an anVar, org.telegram.messenger.qp qpVar, final boolean z9, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f27483b = true;
        this.f27484c = 150;
        this.f27486f = -1L;
        this.f27489j = new h2.f((int[]) null);
        e();
        this.f32282z = new ArrayList();
        this.G = new ArrayList();
        this.f32275r = peer;
        this.f32276s = tL_channels_sendAsPeers;
        bi.e5 e5Var = new bi.e5(24, context, this);
        this.f32277t = e5Var;
        e5Var.setLayoutParams(c8.ha.c(-2.0f, -2));
        setContentView(e5Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232567).mutate();
        org.telegram.ui.ActionBar.r6.y(e5Var, mutate, org.telegram.ui.ActionBar.k6.G8, f6Var, PorterDuff.Mode.MULTIPLY);
        e5Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        e5Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (anVar == null) {
            width = org.telegram.messenger.g0.f22563q.x;
        } else {
            width = anVar.l1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        vm0 vm0Var = new vm0(context, i7, L);
        this.f32272o = vm0Var;
        vm0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f32273p = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28016m5, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.id.M0(2131745603, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        vm0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        pj0 pj0Var = new pj0(context, null);
        this.v = pj0Var;
        v4.b0 b0Var = new v4.b0();
        this.f32279w = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setAdapter(new wm0(f6Var, arrayList, qpVar, i7, peer));
        pj0Var.j(new xm0(this));
        pj0Var.setOnItemClickListener(new bj0(arrayList, context, anVar, z9, hVar) {
            public final List f38692b;
            public final Context f38693c;
            public final org.telegram.ui.an d;
            public final a3.h f38694e;

            {
                this.f38694e = hVar;
            }

            @Override
            public final void c(int i10, View view) {
                bn0.k(ne.this, this.f38692b, this.f38693c, this.d, this.f38694e, view, i10);
            }
        });
        pj0Var.setOverScrollMode(2);
        frameLayout.addView(pj0Var);
        View view = new View(context);
        this.f32278u = view;
        Drawable drawable = context.getDrawable(2131231237);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ha.c(4.0f, -1));
        vm0Var.addView(frameLayout, c8.ha.c(-2.0f, -1));
        e5Var.addView(vm0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f32282z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f31109q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f31109q0 = null;
        int i7 = 0;
        if (!this.f32274q) {
            l(new r1.g[0]);
            chatActivityEnterView.f31103p0.a(true, true, 0.0f);
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
