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
public final class nc0 extends org.telegram.ui.ActionBar.u2 {
    public final TextView f37540m1;
    public final fh0 n1;
    public final ch0 f37541o1;
    public final t70 f37542p1;
    public final long f37543q1;
    public boolean f37544r1;
    public TLRPC.TL_chatInviteExported f37545s1;
    public int f37546t1;
    public int f37547u1;
    public int f37548v1;

    public nc0(Context context, org.telegram.ui.w40 w40Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i7;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f37543q1 = j3;
        this.f29713r0 = true;
        this.f29720w0 = false;
        this.f29718v0 = false;
        Q(org.telegram.ui.ActionBar.j6.f28849d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Aj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(2131231309);
        imageView.setOnClickListener(new y60(this, 3));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ja.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        t70 t70Var = new t70(context, w40Var, this, true, z10);
        this.f37542p1 = t70Var;
        t70Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.n1 = imageView2;
        ch0 ch0Var = new ch0(2131624193, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.f37541o1 = ch0Var;
        ch0Var.P(42);
        imageView2.setAnimation(ch0Var);
        t70Var.d(0, null, false);
        t70Var.b(true);
        t70Var.setDelegate(new gx(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131749149, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i7 = 2131748910;
        } else {
            i7 = 2131748911;
        }
        textView2.setText(org.telegram.messenger.hd.M0(i7, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28957j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f37540m1 = textView3;
        textView3.setText(org.telegram.messenger.hd.M0(2131748695, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(textView3, i11, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new lt(this, chatFull, w40Var, 4));
        linearLayout.addView((View) imageView2, c8.ja.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ja.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(t70Var, c8.ja.o(-1, -2));
        linearLayout.addView(textView3, c8.ja.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).M0(Long.valueOf(j3));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            t70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            t70Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            K0(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.j6.x0(null, i11, z11)));
            int L3 = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o10, o10));
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, z11);
            ch0Var.Q(x02, "Top");
            ch0Var.Q(x02, "Bottom");
            ch0Var.Q(x02, "Center");
            t70Var.f();
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, z11);
            this.f37547u1 = x03;
            v0(x03);
            this.f37546t1 = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.j6.x0(null, i11, z11)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, z11);
        ch0Var.Q(x022, "Top");
        ch0Var.Q(x022, "Bottom");
        ch0Var.Q(x022, "Center");
        t70Var.f();
        int x032 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, z11);
        this.f37547u1 = x032;
        v0(x032);
        this.f37546t1 = x022;
    }

    public static void I0(nc0 nc0Var) {
        super.dismiss();
    }

    public static void J0(nc0 nc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.w40 w40Var) {
        org.telegram.ui.cf0 cf0Var = new org.telegram.ui.cf0(chatFull.f28052id, 0, 0L);
        cf0Var.m0(chatFull, chatFull.exported_invite);
        w40Var.presentFragment(cf0Var);
        super.dismiss();
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29031n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ji));
    }

    public final void K0(boolean z10) {
        if (this.f37544r1) {
            return;
        }
        this.f37544r1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.np.s1(this.f29679a).j1(-this.f37543q1);
        ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_exportChatInvite, new hi.b3(6, this, z10));
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            fh0 fh0Var = this.n1;
            if (fh0Var != null) {
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false), fh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false), 120);
            TextView textView = this.f37540m1;
            if (textView != null && o4 != this.f37548v1) {
                this.f37548v1 = o4;
                org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
            ch0 ch0Var = this.f37541o1;
            if (ch0Var != null && x02 != this.f37546t1) {
                this.f37546t1 = x02;
                ch0Var.Q(x02, "Top");
                ch0Var.Q(x02, "Bottom");
                ch0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
            if (x03 != this.f37547u1) {
                this.f37547u1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new wa0(this, 4), 50L);
    }
}
