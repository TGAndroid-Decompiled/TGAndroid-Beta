package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class wc0 extends org.telegram.ui.ActionBar.w2 {
    public final TextView f41597m1;
    public final qh0 n1;
    public final nh0 f41598o1;
    public final d80 f41599p1;
    public final long f41600q1;
    public boolean f41601r1;
    public TLRPC.TL_chatInviteExported f41602s1;
    public int f41603t1;
    public int f41604u1;
    public int f41605v1;

    public wc0(Context context, org.telegram.ui.y40 y40Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i7;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f41600q1 = j3;
        this.f30257r0 = true;
        this.f30264w0 = false;
        this.f30262v0 = false;
        Q(org.telegram.ui.ActionBar.n6.f29451d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Aj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231312);
        imageView.setOnClickListener(new g70(this, 4));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.na.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        d80 d80Var = new d80(context, y40Var, this, true, z10);
        this.f41599p1 = d80Var;
        d80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.n1 = imageView2;
        nh0 nh0Var = new nh0(2131624193, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.f41598o1 = nh0Var;
        nh0Var.P(42);
        imageView2.setAnimation(nh0Var);
        d80Var.d(0, null, false);
        d80Var.b(true);
        d80Var.setDelegate(new hy(this, 9));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.N0(2131748956, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i7 = 2131748717;
        } else {
            i7 = 2131748718;
        }
        textView2.setText(org.telegram.messenger.gd.N0(i7, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29559j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f41597m1 = textView3;
        textView3.setText(org.telegram.messenger.gd.N0(2131748502, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(textView3, i11, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new qt(this, chatFull, y40Var, 4));
        linearLayout.addView((View) imageView2, c8.na.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.na.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.na.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(d80Var, c8.na.o(-1, -2));
        linearLayout.addView(textView3, c8.na.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(j3));
        if (O0 != null && org.telegram.messenger.v3.t0(O0)) {
            d80Var.setLink("https://t.me/" + org.telegram.messenger.v3.K(O0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            d80Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            L0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.n6.x0(null, i11, z11)));
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o10, o10));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, z11);
            nh0Var.Q(x02, "Top");
            nh0Var.Q(x02, "Bottom");
            nh0Var.Q(x02, "Center");
            d80Var.f();
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, z11);
            this.f41604u1 = x03;
            v0(x03);
            this.f41603t1 = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.n6.x0(null, i11, z11)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, z11);
        nh0Var.Q(x022, "Top");
        nh0Var.Q(x022, "Bottom");
        nh0Var.Q(x022, "Center");
        d80Var.f();
        int x032 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, z11);
        this.f41604u1 = x032;
        v0(x032);
        this.f41603t1 = x022;
    }

    public static void J0(wc0 wc0Var) {
        super.dismiss();
    }

    public static void K0(wc0 wc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.y40 y40Var) {
        org.telegram.ui.ef0 ef0Var = new org.telegram.ui.ef0(chatFull.f28493id, 0, 0L);
        ef0Var.m0(chatFull, chatFull.exported_invite);
        y40Var.presentFragment(ef0Var);
        super.dismiss();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29633n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ji));
    }

    public final void L0(boolean z10) {
        if (this.f41601r1) {
            return;
        }
        this.f41601r1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.mp.u1(this.f30223a).l1(-this.f41600q1);
        ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_messages_exportChatInvite, new hi.k3(6, this, z10));
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            qh0 qh0Var = this.n1;
            if (qh0Var != null) {
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), qh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), 120);
            TextView textView = this.f41597m1;
            if (textView != null && o4 != this.f41605v1) {
                this.f41605v1 = o4;
                org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
            nh0 nh0Var = this.f41598o1;
            if (nh0Var != null && x02 != this.f41603t1) {
                this.f41603t1 = x02;
                nh0Var.Q(x02, "Top");
                nh0Var.Q(x02, "Bottom");
                nh0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
            if (x03 != this.f41604u1) {
                this.f41604u1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new eb0(this, 4), 50L);
    }
}
