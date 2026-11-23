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
public final class yc0 extends org.telegram.ui.ActionBar.w2 {
    public final TextView f42404m1;
    public final rh0 n1;
    public final oh0 f42405o1;
    public final g80 f42406p1;
    public final long f42407q1;
    public boolean f42408r1;
    public TLRPC.TL_chatInviteExported f42409s1;
    public int f42410t1;
    public int f42411u1;
    public int f42412v1;

    public yc0(Context context, org.telegram.ui.z40 z40Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i7;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f42407q1 = j3;
        this.f30207r0 = true;
        this.f30214w0 = false;
        this.f30212v0 = false;
        Q(org.telegram.ui.ActionBar.m6.f29381d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Aj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231309);
        imageView.setOnClickListener(new j70(this, 4));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ma.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        g80 g80Var = new g80(context, z40Var, this, true, z10);
        this.f42406p1 = g80Var;
        g80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.n1 = imageView2;
        oh0 oh0Var = new oh0(2131624193, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.f42405o1 = oh0Var;
        oh0Var.P(42);
        imageView2.setAnimation(oh0Var);
        g80Var.d(0, null, false);
        g80Var.b(true);
        g80Var.setDelegate(new ky(this, 9));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(2131748956, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i7 = 2131748717;
        } else {
            i7 = 2131748718;
        }
        textView2.setText(org.telegram.messenger.hd.N0(i7, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29489j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f42404m1 = textView3;
        textView3.setText(org.telegram.messenger.hd.N0(2131748502, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(textView3, i11, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new st(this, chatFull, z40Var, 4));
        linearLayout.addView((View) imageView2, c8.ma.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(g80Var, c8.ma.o(-1, -2));
        linearLayout.addView(textView3, c8.ma.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).O0(Long.valueOf(j3));
        if (O0 != null && org.telegram.messenger.v3.t0(O0)) {
            g80Var.setLink("https://t.me/" + org.telegram.messenger.v3.K(O0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            g80Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            L0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.m6.x0(null, i11, z11)));
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o10, o10));
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, z11);
            oh0Var.Q(x02, "Top");
            oh0Var.Q(x02, "Bottom");
            oh0Var.Q(x02, "Center");
            g80Var.f();
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, z11);
            this.f42411u1 = x03;
            v0(x03);
            this.f42410t1 = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.m6.x0(null, i11, z11)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, z11);
        oh0Var.Q(x022, "Top");
        oh0Var.Q(x022, "Bottom");
        oh0Var.Q(x022, "Center");
        g80Var.f();
        int x032 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, z11);
        this.f42411u1 = x032;
        v0(x032);
        this.f42410t1 = x022;
    }

    public static void J0(yc0 yc0Var) {
        super.dismiss();
    }

    public static void K0(yc0 yc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.z40 z40Var) {
        org.telegram.ui.ff0 ff0Var = new org.telegram.ui.ff0(chatFull.f28435id, 0, 0L);
        ff0Var.m0(chatFull, chatFull.exported_invite);
        z40Var.presentFragment(ff0Var);
        super.dismiss();
    }

    @Override
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29563n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
    }

    public final void L0(boolean z10) {
        if (this.f42408r1) {
            return;
        }
        this.f42408r1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.np.u1(this.f30173a).l1(-this.f42407q1);
        ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_messages_exportChatInvite, new hi.b3(6, this, z10));
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            rh0 rh0Var = this.n1;
            if (rh0Var != null) {
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), rh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), 120);
            TextView textView = this.f42404m1;
            if (textView != null && o4 != this.f42412v1) {
                this.f42412v1 = o4;
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
            oh0 oh0Var = this.f42405o1;
            if (oh0Var != null && x02 != this.f42410t1) {
                this.f42410t1 = x02;
                oh0Var.Q(x02, "Top");
                oh0Var.Q(x02, "Bottom");
                oh0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false);
            if (x03 != this.f42411u1) {
                this.f42411u1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new hb0(this, 4), 50L);
    }
}
