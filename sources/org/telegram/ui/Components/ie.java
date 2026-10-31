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
public final class ie extends co0 {
    public final ChatActivityEnterView H;

    public ie(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.un unVar, org.telegram.messenger.vp vpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f20455b = true;
        this.f20456c = 150;
        this.f20457f = -1L;
        this.f20460j = new e2.f(null);
        e();
        this.f25122z = new ArrayList();
        this.G = new ArrayList();
        this.f25115r = peer;
        this.f25116s = tL_channels_sendAsPeers;
        jg.l0 l0Var = new jg.l0(this, context, 23);
        this.f25117t = l0Var;
        l0Var.setLayoutParams(w7.b6.c(-2.0f, -2));
        setContentView(l0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232564).mutate();
        org.telegram.ui.ActionBar.a7.y(l0Var, mutate, org.telegram.ui.ActionBar.t6.G8, p6Var, PorterDuff.Mode.MULTIPLY);
        l0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        l0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.i0.L(450.0f);
        if (unVar == null) {
            width = org.telegram.messenger.i0.f16026q.x;
        } else {
            width = unVar.l1.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        wn0 wn0Var = new wn0(context, i10, L);
        this.f25112o = wn0Var;
        wn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f25113p = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21094m5, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.cd.L0(2131745617, null));
        textView.setTypeface(org.telegram.messenger.i0.o(), 1);
        int L2 = org.telegram.messenger.i0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.i0.L(12.0f), L2, org.telegram.messenger.i0.L(12.0f));
        wn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        tk0 tk0Var = new tk0(context, null);
        this.v = tk0Var;
        s4.a0 a0Var = new s4.a0();
        this.f25119w = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setAdapter(new xn0(p6Var, arrayList, vpVar, i10, peer));
        tk0Var.j(new yn0(this));
        tk0Var.setOnItemClickListener(new gk0(arrayList, context, unVar, z10, aVar) {
            public final List f31295b;
            public final Context f31296c;
            public final org.telegram.ui.un d;
            public final androidx.car.app.utils.a e;

            {
                this.e = aVar;
            }

            @Override
            public final void f(int i11, View view) {
                co0.k(ie.this, this.f31295b, this.f31296c, this.d, this.e, view, i11);
            }
        });
        tk0Var.setOverScrollMode(2);
        frameLayout.addView(tk0Var);
        View view = new View(context);
        this.f25118u = view;
        Drawable drawable = context.getDrawable(2131231238);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.b6.c(4.0f, -1));
        wn0Var.addView(frameLayout, w7.b6.c(-2.0f, -1));
        l0Var.addView(wn0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f25122z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f23769q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f23769q0 = null;
        int i10 = 0;
        if (!this.f25114q) {
            l(new o1.j[0]);
            chatActivityEnterView.f23764p0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.j) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
