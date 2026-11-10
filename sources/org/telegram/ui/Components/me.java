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
public final class me extends bn0 {
    public final ChatActivityEnterView H;

    public me(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.cn cnVar, org.telegram.messenger.qp qpVar, final boolean z9, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f27491b = true;
        this.f27492c = 150;
        this.f27494f = -1L;
        this.f27497j = new h2.f((int[]) null);
        e();
        this.f32301z = new ArrayList();
        this.G = new ArrayList();
        this.f32294r = peer;
        this.f32295s = tL_channels_sendAsPeers;
        bi.e5 e5Var = new bi.e5(24, context, this);
        this.f32296t = e5Var;
        e5Var.setLayoutParams(c8.ha.c(-2.0f, -2));
        setContentView(e5Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232567).mutate();
        org.telegram.ui.ActionBar.t6.x(e5Var, mutate, org.telegram.ui.ActionBar.m6.G8, h6Var, PorterDuff.Mode.MULTIPLY);
        e5Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        e5Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (cnVar == null) {
            width = org.telegram.messenger.g0.f22567q.x;
        } else {
            width = cnVar.l1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        vm0 vm0Var = new vm0(context, i7, L);
        this.f32291o = vm0Var;
        vm0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f32292p = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28054m5, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.id.M0(2131745600, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        vm0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        pj0 pj0Var = new pj0(context, null);
        this.v = pj0Var;
        v4.b0 b0Var = new v4.b0();
        this.f32298w = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setAdapter(new wm0(h6Var, arrayList, qpVar, i7, peer));
        pj0Var.j(new xm0(this));
        pj0Var.setOnItemClickListener(new bj0(arrayList, context, cnVar, z9, hVar) {
            public final List f38716b;
            public final Context f38717c;
            public final org.telegram.ui.cn d;
            public final a3.h f38718e;

            {
                this.f38718e = hVar;
            }

            @Override
            public final void c(int i10, View view) {
                bn0.k(me.this, this.f38716b, this.f38717c, this.d, this.f38718e, view, i10);
            }
        });
        pj0Var.setOverScrollMode(2);
        frameLayout.addView(pj0Var);
        View view = new View(context);
        this.f32297u = view;
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
        ArrayList arrayList = this.f32301z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f31125q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f31125q0 = null;
        int i7 = 0;
        if (!this.f32293q) {
            l(new r1.g[0]);
            chatActivityEnterView.f31119p0.a(true, true, 0.0f);
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
