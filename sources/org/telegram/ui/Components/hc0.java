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
public final class hc0 extends org.telegram.ui.ActionBar.t2 {
    public final TextView f34361j1;
    public final fh0 k1;
    public final ch0 f34362l1;
    public final m70 m1;
    public final long f34363n1;
    public boolean f34364o1;
    public TLRPC.TL_chatInviteExported f34365p1;
    public int f34366q1;
    public int f34367r1;
    public int f34368s1;

    public hc0(Context context, org.telegram.ui.r40 r40Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i3;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f34363n1 = j10;
        this.f28614r0 = true;
        this.f28621w0 = false;
        this.f28619v0 = false;
        P(org.telegram.ui.ActionBar.k6.f27878d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231309);
        imageView.setOnClickListener(new ga0(this, 2));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, b8.mf.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        m70 m70Var = new m70(context, r40Var, this, true, z10);
        this.m1 = m70Var;
        m70Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.k1 = imageView2;
        ch0 ch0Var = new ch0(2131624192, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.f34362l1 = ch0Var;
        ch0Var.P(42);
        imageView2.setAnimation(ch0Var);
        m70Var.d(0, null, false);
        m70Var.b(true);
        m70Var.setDelegate(new zw(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131749157, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i3 = 2131748918;
        } else {
            i3 = 2131748919;
        }
        textView2.setText(org.telegram.messenger.bd.M0(i3, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f34361j1 = textView3;
        textView3.setText(org.telegram.messenger.bd.M0(2131748703, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView3, k02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ct(this, chatFull, r40Var, 4));
        linearLayout.addView((View) imageView2, b8.mf.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, b8.mf.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(m70Var, b8.mf.o(-1, -2));
        linearLayout.addView(textView3, b8.mf.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(j10));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            m70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            m70Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            K0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i11, z11)));
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o11, o11));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, z11);
            ch0Var.Q(x02, "Top");
            ch0Var.Q(x02, "Bottom");
            ch0Var.Q(x02, "Center");
            m70Var.f();
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, z11);
            this.f34367r1 = x03;
            v0(x03);
            this.f34366q1 = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i11, z11)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o112 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L32, L32, L32, L32, 0, o112, o112));
        int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, z11);
        ch0Var.Q(x022, "Top");
        ch0Var.Q(x022, "Bottom");
        ch0Var.Q(x022, "Center");
        m70Var.f();
        int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, z11);
        this.f34367r1 = x032;
        v0(x032);
        this.f34366q1 = x022;
    }

    public static void I0(hc0 hc0Var) {
        super.dismiss();
    }

    public static void J0(hc0 hc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.r40 r40Var) {
        org.telegram.ui.xe0 xe0Var = new org.telegram.ui.xe0(chatFull.f27002id, 0, 0L);
        xe0Var.m0(chatFull, chatFull.exported_invite);
        r40Var.presentFragment(xe0Var);
        super.dismiss();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
    }

    public final void K0(boolean z10) {
        if (this.f34364o1) {
            return;
        }
        this.f34364o1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.hp.s1(this.f28583a).j1(-this.f34363n1);
        ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_exportChatInvite, new gi.b3(6, this, z10));
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            fh0 fh0Var = this.k1;
            if (fh0Var != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), fh0Var.getBackground());
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), 120);
            TextView textView = this.f34361j1;
            if (textView != null && o10 != this.f34368s1) {
                this.f34368s1 = o10;
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), o10, true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
            ch0 ch0Var = this.f34362l1;
            if (ch0Var != null && x02 != this.f34366q1) {
                this.f34366q1 = x02;
                ch0Var.Q(x02, "Top");
                ch0Var.Q(x02, "Bottom");
                ch0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
            if (x03 != this.f34367r1) {
                this.f34367r1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new jb0(this, 2), 50L);
    }
}
