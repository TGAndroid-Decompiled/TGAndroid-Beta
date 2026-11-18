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
public final class xe extends on0 {
    public final ChatActivityEnterView H;

    public xe(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bn bnVar, org.telegram.messenger.mp mpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f28991b = true;
        this.f28992c = 150;
        this.f28994f = -1L;
        this.f28997j = new h2.f((int[]) null);
        e();
        this.f38146z = new ArrayList();
        this.G = new ArrayList();
        this.f38139r = peer;
        this.f38140s = tL_channels_sendAsPeers;
        bi.a3 a3Var = new bi.a3(25, context, this);
        this.f38141t = a3Var;
        a3Var.setLayoutParams(c8.ma.c(-2.0f, -2));
        setContentView(a3Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232569).mutate();
        org.telegram.ui.ActionBar.u6.x(a3Var, mutate, org.telegram.ui.ActionBar.n6.G8, i6Var, PorterDuff.Mode.MULTIPLY);
        a3Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        a3Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = org.telegram.messenger.g0.L(450.0f);
        if (bnVar == null) {
            width = org.telegram.messenger.g0.f24121q.x;
        } else {
            width = bnVar.f46093m1.getWidth();
        }
        int i7 = (int) (width * 0.75f);
        in0 in0Var = new in0(context, i7, L);
        this.f38136o = in0Var;
        in0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f38137p = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29560m5, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.gd.M0(2131745405, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.g0.L(12.0f), L2, org.telegram.messenger.g0.L(12.0f));
        in0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ck0 ck0Var = new ck0(context, null);
        this.v = ck0Var;
        v4.c0 c0Var = new v4.c0();
        this.f38143w = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setAdapter(new jn0(i6Var, arrayList, mpVar, i7, peer));
        ck0Var.j(new kn0(this));
        ck0Var.setOnItemClickListener(new oj0(arrayList, context, bnVar, z10, hVar) {
            public final List f35532b;
            public final Context f35533c;
            public final org.telegram.ui.bn d;
            public final a3.h f35534e;

            {
                this.f35534e = hVar;
            }

            @Override
            public final void c(int i10, View view) {
                on0.k(xe.this, this.f35532b, this.f35533c, this.d, this.f35534e, view, i10);
            }
        });
        ck0Var.setOverScrollMode(2);
        frameLayout.addView(ck0Var);
        View view = new View(context);
        this.f38142u = view;
        Drawable drawable = context.getDrawable(2131231237);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ma.c(4.0f, -1));
        in0Var.addView(frameLayout, c8.ma.c(-2.0f, -1));
        a3Var.addView(in0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f38146z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f32670r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f32670r0 = null;
        int i7 = 0;
        if (!this.f38138q) {
            l(new r1.g[0]);
            chatActivityEnterView.f32662q0.a(true, true, 0.0f);
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
