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
public final class xe extends qn0 {
    public final ChatActivityEnterView H;

    public xe(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bn bnVar, org.telegram.messenger.mp mpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f28972b = true;
        this.f28973c = 150;
        this.f28975f = -1L;
        this.f28978j = new h2.f((int[]) null);
        e();
        this.f38971z = new ArrayList();
        this.G = new ArrayList();
        this.f38964r = peer;
        this.f38965s = tL_channels_sendAsPeers;
        bi.e3 e3Var = new bi.e3(25, context, this);
        this.f38966t = e3Var;
        e3Var.setLayoutParams(c8.ma.c(-2.0f, -2));
        setContentView(e3Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232569).mutate();
        org.telegram.ui.ActionBar.t6.x(e3Var, mutate, org.telegram.ui.ActionBar.m6.G8, h6Var, PorterDuff.Mode.MULTIPLY);
        e3Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        e3Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (bnVar == null) {
            width = org.telegram.messenger.g0.f24146q.x;
        } else {
            width = bnVar.f46107m1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        kn0 kn0Var = new kn0(context, i7, L);
        this.f38961o = kn0Var;
        kn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f38962p = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29542m5, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.gd.N0(2131745404, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        kn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ek0 ek0Var = new ek0(context, null);
        this.v = ek0Var;
        v4.c0 c0Var = new v4.c0();
        this.f38968w = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setAdapter(new ln0(h6Var, arrayList, mpVar, i7, peer));
        ek0Var.j(new mn0(this));
        ek0Var.setOnItemClickListener(new qj0(arrayList, context, bnVar, z10, hVar) {
            public final List f36574b;
            public final Context f36575c;
            public final org.telegram.ui.bn d;
            public final a3.h f36576e;

            {
                this.f36576e = hVar;
            }

            @Override
            public final void c(int i10, View view) {
                qn0.k(xe.this, this.f36574b, this.f36575c, this.d, this.f36576e, view, i10);
            }
        });
        ek0Var.setOverScrollMode(2);
        frameLayout.addView(ek0Var);
        View view = new View(context);
        this.f38967u = view;
        Drawable drawable = context.getDrawable(2131231237);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ma.c(4.0f, -1));
        kn0Var.addView(frameLayout, c8.ma.c(-2.0f, -1));
        e3Var.addView(kn0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f38971z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f32702r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f32702r0 = null;
        int i7 = 0;
        if (!this.f38963q) {
            l(new r1.g[0]);
            chatActivityEnterView.f32693q0.a(true, true, 0.0f);
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
