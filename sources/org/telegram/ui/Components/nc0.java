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
public final class nc0 extends org.telegram.ui.ActionBar.v2 {
    public final TextView f36338i1;
    public final dh0 f36339j1;
    public final ah0 f36340k1;
    public final r70 l1;
    public final long f36341m1;
    public boolean n1;
    public TLRPC.TL_chatInviteExported f36342o1;
    public int f36343p1;
    public int f36344q1;
    public int f36345r1;

    public nc0(Context context, org.telegram.ui.y40 y40Var, TLRPC.ChatFull chatFull, long j3, boolean z9) {
        super(context, false);
        int i7;
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f36341m1 = j3;
        this.f28649q0 = true;
        this.f28656v0 = false;
        this.f28655u0 = false;
        P(org.telegram.ui.ActionBar.l6.f27865d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i10, this.I0), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        org.telegram.ui.ActionBar.g6 g6Var = this.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.xj, this.I0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231309);
        imageView.setOnClickListener(new ma0(this, 2));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        r70 r70Var = new r70(context, y40Var, this, true, z9);
        this.l1 = r70Var;
        r70Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f36339j1 = imageView2;
        ah0 ah0Var = new ah0(2131624192, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.f36340k1 = ah0Var;
        ah0Var.P(42);
        imageView2.setAnimation(ah0Var);
        r70Var.d(0, null, false);
        r70Var.b(true);
        r70Var.setDelegate(new bx(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131749149, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
        TextView textView2 = new TextView(context);
        if (z9) {
            i7 = 2131748910;
        } else {
            i7 = 2131748911;
        }
        textView2.setText(org.telegram.messenger.id.M0(i7, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f27973j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f36338i1 = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131748695, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.l6.Ci;
        org.telegram.ui.ActionBar.s6.U(textView3, i11, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.s6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ah.g(this, chatFull, y40Var, 29));
        linearLayout.addView((View) imageView2, c8.ha.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(r70Var, c8.ha.o(-1, -2));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.N = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(j3));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            r70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            r70Var.setLink(tL_chatInviteExported.link);
        } else {
            z10 = false;
            K0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.l6.x0(null, i11, z10)));
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i11, z10), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.l6.k0(L3, L3, L3, L3, 0, o10, o10));
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, z10);
            ah0Var.Q(x02, "Top");
            ah0Var.Q(x02, "Bottom");
            ah0Var.Q(x02, "Center");
            r70Var.f();
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, z10);
            this.f36344q1 = x03;
            v0(x03);
            this.f36343p1 = x02;
        }
        z10 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.l6.x0(null, i11, z10)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i11, z10), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.l6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, z10);
        ah0Var.Q(x022, "Top");
        ah0Var.Q(x022, "Bottom");
        ah0Var.Q(x022, "Center");
        r70Var.f();
        int x032 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, z10);
        this.f36344q1 = x032;
        v0(x032);
        this.f36343p1 = x022;
    }

    public static void I0(nc0 nc0Var) {
        super.dismiss();
    }

    public static void J0(nc0 nc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.y40 y40Var) {
        org.telegram.ui.ef0 ef0Var = new org.telegram.ui.ef0(chatFull.f26957id, 0, 0L);
        ef0Var.m0(chatFull, chatFull.exported_invite);
        y40Var.presentFragment(ef0Var);
        super.dismiss();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28047n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Gi));
    }

    public final void K0(boolean z9) {
        if (this.n1) {
            return;
        }
        this.n1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.s1(this.f28621a).j1(-this.f36341m1);
        ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_messages_exportChatInvite, new fi.d3(6, this, z9));
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            dh0 dh0Var = this.f36339j1;
            if (dh0Var != null) {
                org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false), dh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false), 120);
            TextView textView = this.f36338i1;
            if (textView != null && o4 != this.f36345r1) {
                this.f36345r1 = o4;
                org.telegram.ui.ActionBar.l6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false);
            ah0 ah0Var = this.f36340k1;
            if (ah0Var != null && x02 != this.f36343p1) {
                this.f36343p1 = x02;
                ah0Var.Q(x02, "Top");
                ah0Var.Q(x02, "Bottom");
                ah0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
            if (x03 != this.f36344q1) {
                this.f36344q1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new pb0(this, 2), 50L);
    }
}
