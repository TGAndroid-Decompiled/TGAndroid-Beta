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
public final class ie extends do0 {
    public final ChatActivityEnterView H;

    public ie(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.un unVar, org.telegram.messenger.wp wpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f20456b = true;
        this.f20457c = 150;
        this.f20458f = -1L;
        this.f20461j = new e2.f((int[]) null);
        e();
        this.f25536z = new ArrayList();
        this.G = new ArrayList();
        this.f25529r = peer;
        this.f25530s = tL_channels_sendAsPeers;
        jg.l0 l0Var = new jg.l0(this, context, 23);
        this.f25531t = l0Var;
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
            width = org.telegram.messenger.i0.f16172q.x;
        } else {
            width = unVar.l1.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        xn0 xn0Var = new xn0(context, i10, L);
        this.f25526o = xn0Var;
        xn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f25527p = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21095m5, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.dd.L0(2131745617, null));
        textView.setTypeface(org.telegram.messenger.i0.o(), 1);
        int L2 = org.telegram.messenger.i0.L(18.0f);
        textView.setPadding(L2, org.telegram.messenger.i0.L(12.0f), L2, org.telegram.messenger.i0.L(12.0f));
        xn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        uk0 uk0Var = new uk0(context, null);
        this.v = uk0Var;
        s4.a0 a0Var = new s4.a0();
        this.f25533w = a0Var;
        uk0Var.setLayoutManager(a0Var);
        uk0Var.setAdapter(new yn0(p6Var, arrayList, wpVar, i10, peer));
        uk0Var.j(new zn0(this));
        uk0Var.setOnItemClickListener(new hk0(arrayList, context, unVar, z10, aVar) {
            public final List f32287b;
            public final Context f32288c;
            public final org.telegram.ui.un d;
            public final androidx.car.app.utils.a e;

            {
                this.e = aVar;
            }

            @Override
            public final void f(int i11, View view) {
                do0.k(ie.this, this.f32287b, this.f32288c, this.d, this.e, view, i11);
            }
        });
        uk0Var.setOverScrollMode(2);
        frameLayout.addView(uk0Var);
        View view = new View(context);
        this.f25532u = view;
        Drawable drawable = context.getDrawable(2131231238);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.b6.c(4.0f, -1));
        xn0Var.addView(frameLayout, w7.b6.c(-2.0f, -1));
        l0Var.addView(xn0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f25536z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f23770q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f23770q0 = null;
        int i10 = 0;
        if (!this.f25528q) {
            l(new o1.j[0]);
            chatActivityEnterView.f23765p0.a(true, true, 0.0f);
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
