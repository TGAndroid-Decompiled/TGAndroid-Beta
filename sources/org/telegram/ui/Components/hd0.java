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
public final class hd0 extends org.telegram.ui.ActionBar.z2 {
    public final TextView f26758i1;
    public final fi0 f26759j1;
    public final ci0 f26760k1;
    public final j80 l1;
    public final long f26761m1;
    public boolean f26762n1;
    public TLRPC.TL_chatInviteExported f26763o1;
    public int f26764p1;
    public int f26765q1;
    public int f26766r1;

    public hd0(Context context, org.telegram.ui.u50 u50Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f26761m1 = j10;
        this.f21611q0 = true;
        this.f21618v0 = false;
        this.f21617u0 = false;
        Q(org.telegram.ui.ActionBar.t6.f20930d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.xj, this.I0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231310);
        imageView.setOnClickListener(new db0(this, 2));
        int L = org.telegram.messenger.i0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, w7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        j80 j80Var = new j80(context, u50Var, this, true, z10);
        this.l1 = j80Var;
        j80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f26759j1 = imageView2;
        ci0 ci0Var = new ci0(2131624190, org.telegram.messenger.i0.L(90.0f), org.telegram.messenger.i0.L(90.0f), false, null);
        this.f26760k1 = ci0Var;
        ci0Var.P(42);
        imageView2.setAnimation(ci0Var);
        j80Var.d(0, null, false);
        j80Var.b(true);
        j80Var.setDelegate(new px(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.dd.L0(2131749159, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i10 = 2131748920;
        } else {
            i10 = 2131748921;
        }
        textView2.setText(org.telegram.messenger.dd.L0(i10, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21038j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f26758i1 = textView3;
        textView3.setText(org.telegram.messenger.dd.L0(2131748710, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.V(textView3, i12, null);
        int L2 = org.telegram.messenger.i0.L(8.0f);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView3, k02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ag.i(this, chatFull, u50Var, 19));
        linearLayout.addView((View) imageView2, w7.b6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(j80Var, w7.b6.o(-1, -2));
        linearLayout.addView(textView3, w7.b6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.N = nestedScrollView;
        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).L0(Long.valueOf(j10));
        if (L0 != null && org.telegram.messenger.w3.t0(L0)) {
            j80Var.setLink("https://t.me/" + org.telegram.messenger.w3.K(L0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            j80Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            K0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(90.0f), org.telegram.ui.ActionBar.t6.x0(null, i12, z11)));
            int L3 = org.telegram.messenger.i0.L(8.0f);
            int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o11, o11));
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, z11);
            ci0Var.Q(x02, "Top");
            ci0Var.Q(x02, "Bottom");
            ci0Var.Q(x02, "Center");
            j80Var.f();
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, z11);
            this.f26765q1 = x03;
            v0(x03);
            this.f26764p1 = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(90.0f), org.telegram.ui.ActionBar.t6.x0(null, i12, z11)));
        int L32 = org.telegram.messenger.i0.L(8.0f);
        int o112 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L32, L32, L32, L32, 0, o112, o112));
        int x022 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, z11);
        ci0Var.Q(x022, "Top");
        ci0Var.Q(x022, "Bottom");
        ci0Var.Q(x022, "Center");
        j80Var.f();
        int x032 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, z11);
        this.f26765q1 = x032;
        v0(x032);
        this.f26764p1 = x022;
    }

    public static void I0(hd0 hd0Var) {
        super.dismiss();
    }

    public static void J0(hd0 hd0Var, TLRPC.ChatFull chatFull, org.telegram.ui.u50 u50Var) {
        org.telegram.ui.ig0 ig0Var = new org.telegram.ui.ig0(chatFull.f19795id, 0, 0L);
        ig0Var.m0(chatFull, chatFull.exported_invite);
        u50Var.presentFragment(ig0Var);
        super.dismiss();
    }

    @Override
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21116n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
    }

    public final void K0(boolean z10) {
        if (this.f26762n1) {
            return;
        }
        this.f26762n1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.wp.r1(this.f21584a).i1(-this.f26761m1);
        ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(5, this, z10));
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            fi0 fi0Var = this.f26759j1;
            if (fi0Var != null) {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), fi0Var.getBackground());
            }
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), 120);
            TextView textView = this.f26758i1;
            if (textView != null && o10 != this.f26766r1) {
                this.f26766r1 = o10;
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), o10, true);
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
            ci0 ci0Var = this.f26760k1;
            if (ci0Var != null && x02 != this.f26764p1) {
                this.f26764p1 = x02;
                ci0Var.Q(x02, "Top");
                ci0Var.Q(x02, "Bottom");
                ci0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false);
            if (x03 != this.f26765q1) {
                this.f26765q1 = x03;
                v0(x03);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new eb0(this, 5), 50L);
    }
}
