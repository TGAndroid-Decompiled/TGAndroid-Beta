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
public final class mc0 extends org.telegram.ui.ActionBar.v2 {
    public final TextView f35935i1;
    public final ch0 f35936j1;
    public final zg0 f35937k1;
    public final q70 l1;
    public final long f35938m1;
    public boolean n1;
    public TLRPC.TL_chatInviteExported f35939o1;
    public int f35940p1;
    public int f35941q1;
    public int f35942r1;

    public mc0(Context context, org.telegram.ui.w40 w40Var, TLRPC.ChatFull chatFull, long j3, boolean z9) {
        super(context, false);
        int i7;
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f35938m1 = j3;
        this.f28641q0 = true;
        this.f28648v0 = false;
        this.f28647u0 = false;
        P(org.telegram.ui.ActionBar.k6.f27849d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, this.I0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231309);
        imageView.setOnClickListener(new la0(this, 2));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        q70 q70Var = new q70(context, w40Var, this, true, z9);
        this.l1 = q70Var;
        q70Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f35936j1 = imageView2;
        zg0 zg0Var = new zg0(2131624192, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.f35937k1 = zg0Var;
        zg0Var.P(42);
        imageView2.setAnimation(zg0Var);
        q70Var.d(0, null, false);
        q70Var.b(true);
        q70Var.setDelegate(new ax(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131749148, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        TextView textView2 = new TextView(context);
        if (z9) {
            i7 = 2131748909;
        } else {
            i7 = 2131748910;
        }
        textView2.setText(org.telegram.messenger.hd.M0(i7, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27957j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f35935i1 = textView3;
        textView3.setText(org.telegram.messenger.hd.M0(2131748694, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView3, k02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ah.g(this, chatFull, w40Var, 29));
        linearLayout.addView((View) imageView2, c8.ha.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(q70Var, c8.ha.o(-1, -2));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.N = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).M0(Long.valueOf(j3));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            q70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            q70Var.setLink(tL_chatInviteExported.link);
        } else {
            z10 = false;
            K0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i11, z10)));
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, z10), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o10, o10));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, z10);
            zg0Var.Q(x02, "Top");
            zg0Var.Q(x02, "Bottom");
            zg0Var.Q(x02, "Center");
            q70Var.f();
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h5, z10);
            this.f35941q1 = x03;
            v0(x03);
            this.f35940p1 = x02;
        }
        z10 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i11, z10)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, z10), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, z10);
        zg0Var.Q(x022, "Top");
        zg0Var.Q(x022, "Bottom");
        zg0Var.Q(x022, "Center");
        q70Var.f();
        int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h5, z10);
        this.f35941q1 = x032;
        v0(x032);
        this.f35940p1 = x022;
    }

    public static void I0(mc0 mc0Var) {
        super.dismiss();
    }

    public static void J0(mc0 mc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.w40 w40Var) {
        org.telegram.ui.cf0 cf0Var = new org.telegram.ui.cf0(chatFull.f26954id, 0, 0L);
        cf0Var.m0(chatFull, chatFull.exported_invite);
        w40Var.presentFragment(cf0Var);
        super.dismiss();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28031n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
    }

    public final void K0(boolean z9) {
        if (this.n1) {
            return;
        }
        this.n1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.s1(this.f28613a).j1(-this.f35938m1);
        ConnectionsManager.getInstance(this.f28613a).sendRequest(tL_messages_exportChatInvite, new fi.d3(6, this, z9));
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            ch0 ch0Var = this.f35936j1;
            if (ch0Var != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), ch0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), 120);
            TextView textView = this.f35935i1;
            if (textView != null && o4 != this.f35942r1) {
                this.f35942r1 = o4;
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
            zg0 zg0Var = this.f35937k1;
            if (zg0Var != null && x02 != this.f35940p1) {
                this.f35940p1 = x02;
                zg0Var.Q(x02, "Top");
                zg0Var.Q(x02, "Bottom");
                zg0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h5, false);
            if (x03 != this.f35941q1) {
                this.f35941q1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ob0(this, 2), 50L);
    }
}
