package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c60 extends org.telegram.ui.ActionBar.z2 {
    public static final int f25014e2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public final x50 K1;
    public final org.telegram.ui.ActionBar.k2 L1;
    public final p50 M1;
    public final TextView N1;
    public AnimatorSet O1;
    public final View P1;
    public int Q1;
    public boolean R1;
    public final boolean S1;
    public final boolean T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final long X1;
    public final boolean Y1;
    public final long Z1;
    public org.telegram.ui.gb a2;
    public boolean f25015b2;
    public boolean f25016c2;
    public int f25017d2;
    public final TLRPC.TL_chatInviteExported f25018i1;
    public final HashMap f25019j1;
    public final TLRPC.ChatFull f25020k1;
    public int l1;
    public int f25021m1;
    public int f25022n1;
    public int f25023o1;
    public int f25024p1;
    public int f25025q1;
    public int f25026r1;
    public int f25027s1;
    public int f25028t1;
    public int f25029u1;
    public int f25030v1;
    public int f25031w1;
    public int f25032x1;
    public int f25033y1;
    public int f25034z1;

    public c60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.k2 k2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.f25015b2 = true;
        this.f25016c2 = false;
        this.f25018i1 = tL_chatInviteExported;
        this.f25019j1 = hashMap;
        this.L1 = k2Var;
        this.f25020k1 = chatFull;
        this.X1 = j10;
        this.S1 = z10;
        this.Y1 = z11;
        int i10 = org.telegram.ui.ActionBar.t6.f20873a7;
        v0(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        Q(i10);
        this.f25017d2 = this.G0;
        this.f21585a0 = -1;
        if (hashMap == null) {
            this.f25019j1 = new HashMap();
        }
        this.Z1 = ConnectionsManager.getInstance(this.f21584a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        o50 o50Var = new o50(this, context);
        this.f21587b = o50Var;
        o50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(48.0f);
        View view = new View(context);
        this.P1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f21587b.addView(view, layoutParams);
        p50 p50Var = new p50(this, context);
        this.M1 = p50Var;
        p50Var.r1();
        p50Var.setTag(14);
        getContext();
        s4.a0 a0Var = new s4.a0(1, false);
        p50Var.setLayoutManager(a0Var);
        x50 x50Var = new x50(this);
        this.K1 = x50Var;
        p50Var.setAdapter(x50Var);
        p50Var.setVerticalScrollBarEnabled(false);
        p50Var.setClipToPadding(false);
        p50Var.setNestedScrollingEnabled(true);
        p50Var.setOnScrollListener(new q50(this, a0Var));
        p50Var.setOnItemClickListener(new hk0() {
            @Override
            public final void f(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l50.f(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.N1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.i0.o());
        if (!z10) {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.dd.L0(2131750876, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.dd.L0(2131746031, null));
            } else {
                textView.setText(org.telegram.messenger.dd.L0(2131749159, null));
            }
            this.T1 = true;
        } else {
            textView.setText(org.telegram.messenger.dd.L0(2131749159, null));
            this.T1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.k6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.f21587b;
        if (!this.T1) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(p50Var, w7.b6.d(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        this.f21587b.addView(textView, w7.b6.d(-1, this.T1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f19937id.add(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).n1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).sendRequest(tL_users_getUsers, new x1(this, 5));
        }
        updateColors();
    }

    public static void I0(c60 c60Var) {
        View view = c60Var.P1;
        TextView textView = c60Var.N1;
        p50 p50Var = c60Var.M1;
        if (p50Var.getChildCount() <= 0) {
            int paddingTop = p50Var.getPaddingTop();
            c60Var.Q1 = paddingTop;
            p50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(c60Var.Q1);
            view.setTranslationY(c60Var.Q1);
            c60Var.f21587b.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = p50Var.getChildAt(0);
        dk0 dk0Var = (dk0) p50Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && dk0Var != null && dk0Var.b() == 0) {
            c60Var.L0(false);
            i10 = top;
        } else {
            c60Var.L0(true);
        }
        if (c60Var.Q1 != i10) {
            c60Var.Q1 = i10;
            p50Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(c60Var.Q1);
            }
            view.setTranslationY(c60Var.Q1);
            c60Var.f21587b.invalidate();
        }
    }

    public static void M0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.p6 p6Var) {
        ?? r16;
        Object obj;
        int i11;
        String str;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        org.telegram.ui.ActionBar.z2[] z2VarArr = new org.telegram.ui.ActionBar.z2[1];
        ?? f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f7.addView(frameLayout, w7.b6.t(-1, -2, 7, 0, 0, 0, 10));
        ?? g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(50.0f));
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        if (j10 >= 0) {
            r16 = 0;
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            r16 = 0;
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-j10));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        frameLayout.addView(g9Var, w7.b6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232750);
        int i12 = org.telegram.ui.ActionBar.t6.f21002h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232749);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.a7.y(imageView, drawable, i12, p6Var, mode);
        frameLayout.addView(imageView, w7.b6.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.i0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.i0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, w7.b6.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.i0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.i0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var, 1, 20.0f);
        org.telegram.messenger.m5.l(textView, 17, null, 2131744989);
        TextView f10 = org.telegram.messenger.a30.f(f7, textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.t6.B6;
        org.telegram.ui.ActionBar.a7.V(f10, i13, p6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f10.setText(rh.h8.a1(r16, org.telegram.messenger.dd.a0(null, null, 2131745001, objArr), 0.8f, null));
            i11 = i13;
        } else {
            obj = "min";
            boolean z10 = r16;
            String str2 = i14 == 300 ? "5min" : obj;
            Locale locale = Locale.US;
            i11 = i13;
            Object[] objArr2 = new Object[2];
            objArr2[z10 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = str2;
            f10.setText(rh.h8.a1(z10, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f11 = org.telegram.messenger.a30.f(f7, f10, w7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(f11, i11, p6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            f11.setText(org.telegram.messenger.dd.a0(null, null, 2131745076, org.telegram.messenger.u1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.wp.r1(i10).f19111d6), "USD")));
        } else {
            f11.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.u1.i().f((int) (org.telegram.messenger.wp.r1(i10).f19111d6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i15 == 300 ? "5min" : obj));
        }
        f7.addView(f11, w7.b6.t(-1, -2, 17, 20, 0, 20, 4));
        ?? xy0Var = new xy0(context, p6Var);
        ?? p80Var = new p80(context, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i16 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.a7.V(p80Var, i16, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, i16, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(true);
        p80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(24.0f, i10, p80Var);
        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z11 = Z12 == null;
        String p5 = org.telegram.messenger.i20.p(Z12);
        e5Var.e(Z12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p5));
        spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new r50(z2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        if (z11) {
            str = null;
        } else {
            str = null;
            xy0Var.l(p80Var, org.telegram.messenger.dd.L0(2131745077, null));
        }
        xy0Var.c(org.telegram.messenger.dd.L0(2131745072, str), org.telegram.messenger.dd.a0(null, null, 2131742808, org.telegram.messenger.dd.D0().r0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.dd.D0().o0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            xy0Var.c(org.telegram.messenger.dd.L0(channelParticipant.subscription_until_date > currentTime ? 2131745073 : 2131745075, null), org.telegram.messenger.dd.a0(null, null, 2131742808, org.telegram.messenger.dd.D0().r0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.dd.D0().o0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f7.addView(xy0Var, w7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        p80 p80Var2 = new p80(context, p6Var);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i16, p6Var);
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131744944, null), new i20(context, 1)));
        p80Var2.setGravity(17);
        f7.addView(p80Var2, w7.b6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.i(org.telegram.messenger.dd.L0(2131747847, null), false, true);
        f7.addView(dVar, w7.b6.o(-1, 48));
        dVar.setOnClickListener(new j2(z2VarArr, 2));
        k10.N = f7;
        z2VarArr[0] = k10;
        k10.T0 = false;
        k10.O();
        z2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.L6, false));
        } else if (view instanceof j80) {
            ((j80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.b9) {
            org.telegram.ui.ActionBar.a7.V(((org.telegram.ui.Cells.b9) view).getTextView(), org.telegram.ui.ActionBar.t6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0() {
        TextView textView = this.N1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21058k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l5, false));
                if (!this.T1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        p50 p50Var = this.M1;
        if (p50Var != null) {
            p50Var.setGlowColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A5, false));
        }
        View view = this.P1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V5, false));
        }
    }

    public final void K0() {
        boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final ArrayList arrayList;
        if (!this.H1) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f25018i1;
            int i10 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.U1;
            if (i10 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.V1;
            if (i11 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.W1;
            if (z15 && tL_chatInviteExported.requested > arrayList4.size()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                z14 = false;
                z13 = false;
            } else if (z11) {
                z14 = false;
                z13 = true;
            } else if (z12) {
                z13 = false;
                z14 = true;
            } else {
                return;
            }
            if (z14) {
                arrayList = arrayList4;
            } else if (z13) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList2;
            }
            TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
            tL_messages_getChatInviteImporters.peer = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).i1(-this.X1);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.wp.r1(this.f21584a).p1((TLRPC.User) this.f25019j1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.H1 = true;
            ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final c60 c60Var = c60.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n50.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void L0(boolean z10) {
        Integer num;
        float f7;
        View view = this.P1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.N1;
            if (z10) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.O1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.O1 = animatorSet2;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            if (!this.T1) {
                AnimatorSet animatorSet3 = this.O1;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.O1.setDuration(150L);
            this.O1.addListener(new eg.m(28, this, z10));
            this.O1.start();
        }
    }

    public final void O0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.J1 = 0;
        this.f25024p1 = -1;
        this.f25025q1 = -1;
        this.f25026r1 = -1;
        this.f25027s1 = -1;
        this.f25028t1 = -1;
        this.f25029u1 = -1;
        this.B1 = -1;
        this.C1 = -1;
        this.f25033y1 = -1;
        this.f25034z1 = -1;
        this.D1 = -1;
        this.E1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.A1 = -1;
        this.l1 = -1;
        this.f25021m1 = -1;
        this.f25030v1 = -1;
        this.f25031w1 = -1;
        this.f25032x1 = -1;
        boolean z13 = true;
        if (!this.S1) {
            this.f25033y1 = 0;
            this.J1 = 2;
            this.f25034z1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f25018i1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.J1;
            this.l1 = i10;
            this.J1 = i10 + 2;
            this.f25021m1 = i10 + 1;
        }
        int i11 = this.J1;
        this.f25022n1 = i11;
        this.J1 = i11 + 2;
        this.f25023o1 = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.U1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = this.V1;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.J1;
            int i14 = i13 + 1;
            this.J1 = i14;
            this.f25027s1 = i13;
            this.f25028t1 = i14;
            int size2 = arrayList.size() + i14;
            this.J1 = size2;
            this.f25029u1 = size2;
            z12 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.J1;
            int i16 = i15 + 1;
            this.J1 = i16;
            this.f25030v1 = i15;
            this.f25031w1 = i16;
            int size3 = arrayList3.size() + i16;
            this.J1 = size3;
            this.f25032x1 = size3;
            z12 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.J1;
            int i18 = i17 + 1;
            this.J1 = i18;
            this.E1 = i17;
            this.F1 = i18;
            int size4 = arrayList2.size() + i18;
            this.J1 = size4;
            this.G1 = size4;
        } else {
            z13 = z12;
        }
        if ((z10 || z11) && !z13) {
            int i19 = this.J1;
            this.f25024p1 = i19;
            this.A1 = i19 + 1;
            this.J1 = i19 + 3;
            this.B1 = i19 + 2;
        }
        this.K1.f();
    }

    @Override
    public final void s0() {
        int i10;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0);
            if (this.f21613r0 != null) {
                v0(w02);
            }
            if (this.F0 < 0 && (i10 = this.G0) == this.f25017d2 && w02 != i10) {
                this.G0 = w02;
                this.f25017d2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f25016c2 = false;
    }

    public final void updateColors() {
        TextView textView = this.N1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21058k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l5, false));
            if (!this.T1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A5, false);
        p50 p50Var = this.M1;
        p50Var.setGlowColor(x02);
        this.P1.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V5, false));
        v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false));
        int hiddenChildCount = p50Var.getHiddenChildCount();
        for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
            N0(p50Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            N0(p50Var.V(i11));
        }
        int cachedChildCount = p50Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            N0(p50Var.P(i12));
        }
        int attachedScrapChildCount = p50Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            N0(p50Var.O(i13));
        }
        this.f21587b.invalidate();
    }
}
