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
public final class p50 extends org.telegram.ui.ActionBar.u2 {
    public static final int f38206i2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public int N1;
    public final k50 O1;
    public final org.telegram.ui.ActionBar.e2 P1;
    public final c50 Q1;
    public final TextView R1;
    public AnimatorSet S1;
    public final View T1;
    public int U1;
    public boolean V1;
    public final boolean W1;
    public final boolean X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList f38207a2;
    public final long f38208b2;
    public final boolean f38209c2;
    public final long d2;
    public org.telegram.ui.ab f38210e2;
    public boolean f38211f2;
    public boolean f38212g2;
    public int f38213h2;
    public final TLRPC.TL_chatInviteExported f38214m1;
    public final HashMap n1;
    public final TLRPC.ChatFull f38215o1;
    public int f38216p1;
    public int f38217q1;
    public int f38218r1;
    public int f38219s1;
    public int f38220t1;
    public int f38221u1;
    public int f38222v1;
    public int f38223w1;
    public int f38224x1;
    public int f38225y1;
    public int f38226z1;

    public p50(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.e2 e2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        float f10;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f38207a2 = new ArrayList();
        this.f38211f2 = true;
        this.f38212g2 = false;
        this.f38214m1 = tL_chatInviteExported;
        this.n1 = hashMap;
        this.P1 = e2Var;
        this.f38215o1 = chatFull;
        this.f38208b2 = j3;
        this.W1 = z10;
        this.f38209c2 = z11;
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        v0(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        Q(i7);
        this.f38213h2 = this.H0;
        this.f29683b0 = -1;
        if (hashMap == null) {
            this.n1 = new HashMap();
        }
        this.d2 = ConnectionsManager.getInstance(this.f29679a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        b50 b50Var = new b50(this, context);
        this.f29682b = b50Var;
        b50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        this.T1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f29682b.addView(view, layoutParams);
        c50 c50Var = new c50(this, context);
        this.Q1 = c50Var;
        c50Var.r1();
        c50Var.setTag(14);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        c50Var.setLayoutManager(b0Var);
        k50 k50Var = new k50(this);
        this.O1 = k50Var;
        c50Var.setAdapter(k50Var);
        c50Var.setVerticalScrollBarEnabled(false);
        c50Var.setClipToPadding(false);
        c50Var.setNestedScrollingEnabled(true);
        c50Var.setOnScrollListener(new d50(this, b0Var));
        c50Var.setOnItemClickListener(new gj0() {
            @Override
            public final void b(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y40.b(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.R1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.hd.M0(2131750875, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.hd.M0(2131746014, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131749149, null));
            }
            this.X1 = true;
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131749149, null));
            this.X1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.j6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.f29682b;
        if (!this.X1) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        viewGroup.addView(c50Var, c8.ja.d(-1, -1.0f, 51, 0.0f, f10, 0.0f, 0.0f));
        this.f29682b.addView(textView, c8.ja.d(-1, this.X1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f28194id.add(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).o1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0).sendRequest(tL_users_getUsers, new v1(this, 5));
        }
        updateColors();
    }

    public static void I0(p50 p50Var) {
        View view = p50Var.T1;
        TextView textView = p50Var.R1;
        c50 c50Var = p50Var.Q1;
        if (c50Var.getChildCount() <= 0) {
            int paddingTop = c50Var.getPaddingTop();
            p50Var.U1 = paddingTop;
            c50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(p50Var.U1);
            view.setTranslationY(p50Var.U1);
            p50Var.f29682b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = c50Var.getChildAt(0);
        cj0 cj0Var = (cj0) c50Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && cj0Var != null && cj0Var.b() == 0) {
            p50Var.L0(false);
            i7 = top;
        } else {
            p50Var.L0(true);
        }
        if (p50Var.U1 != i7) {
            p50Var.U1 = i7;
            c50Var.setTopGlowOffset(i7);
            if (textView != null) {
                textView.setTranslationY(p50Var.U1);
            }
            view.setTranslationY(p50Var.U1);
            p50Var.f29682b.invalidate();
        }
    }

    public static void M0(Context context, int i7, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.e6 e6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        boolean z10;
        String str;
        int i11;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, c8.ja.t(-1, -2, 7, 0, 0, 0, 10));
        ?? i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        if (j3 >= 0) {
            r16 = 0;
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
        } else {
            r16 = 0;
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
        }
        frameLayout.addView(i9Var, c8.ja.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232754);
        int i12 = org.telegram.ui.ActionBar.j6.f28922h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232753);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.q6.x(imageView, drawable, i12, e6Var, mode);
        frameLayout.addView(imageView, c8.ja.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, c8.ja.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var, 1, 20.0f);
        org.telegram.messenger.k5.l(textView, 17, null, 2131744971);
        TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.j6.B6;
        org.telegram.ui.ActionBar.q6.U(f11, i13, e6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f11.setText(di.mb.a1(r16, org.telegram.messenger.hd.a0(null, null, 2131744983, objArr), 0.8f, null));
            i10 = i13;
        } else {
            obj = "min";
            boolean z11 = r16;
            if (i14 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            Locale locale = Locale.US;
            i10 = i13;
            Object[] objArr2 = new Object[2];
            objArr2[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            f11.setText(di.mb.a1(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f12 = org.telegram.messenger.i20.f(f10, f11, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context);
        f12.setTextSize(1, 14.0f);
        f12.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(f12, i10, e6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            f12.setText(org.telegram.messenger.hd.a0(null, null, 2131745058, org.telegram.messenger.r1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.np.s1(i7).f25259d6), "USD")));
        } else {
            if (i15 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            f12.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.r1.i().f((int) (org.telegram.messenger.np.s1(i7).f25259d6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        f10.addView(f12, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
        ?? vx0Var = new vx0(context, e6Var);
        ?? z70Var = new z70(context, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        z70Var.setEllipsize(TextUtils.TruncateAt.END);
        int i16 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.U(z70Var, i16, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, i16, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setSingleLine(true);
        z70Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, z70Var);
        TLRPC.User a23 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_chatInviteImporter.user_id));
        if (a23 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String p10 = org.telegram.messenger.q10.p(a23);
        f5Var.e(a23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p10));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new e50(u2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        z70Var.setText(spannableStringBuilder);
        if (!z10) {
            str = null;
            vx0Var.l(z70Var, org.telegram.messenger.hd.M0(2131745059, null));
        } else {
            str = null;
        }
        vx0Var.c(org.telegram.messenger.hd.M0(2131745054, str), org.telegram.messenger.hd.a0(null, null, 2131742783, org.telegram.messenger.hd.E0().s0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i11 = 2131745055;
            } else {
                i11 = 2131745057;
            }
            vx0Var.c(org.telegram.messenger.hd.M0(i11, null), org.telegram.messenger.hd.a0(null, null, 2131742783, org.telegram.messenger.hd.E0().s0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(vx0Var, c8.ja.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        z70 z70Var2 = new z70(context, e6Var);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i16, e6Var);
        z70Var2.setTextSize(1, 14.0f);
        z70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744926, null), new u10(context, 1)));
        z70Var2.setGravity(17);
        f10.addView(z70Var2, c8.ja.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131747831, null), false, true);
        f10.addView(dVar, c8.ja.o(-1, 48));
        dVar.setOnClickListener(new h2(u2VarArr, 2));
        k10.O = f10;
        u2VarArr[0] = k10;
        k10.U0 = false;
        k10.O();
        u2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.L6, false));
        } else if (view instanceof t70) {
            ((t70) view).f();
        } else if (view instanceof org.telegram.ui.Cells.y8) {
            org.telegram.ui.ActionBar.q6.U(((org.telegram.ui.Cells.y8) view).getTextView(), org.telegram.ui.ActionBar.j6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0() {
        TextView textView = this.R1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28977k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28995l5, false));
                if (!this.X1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        c50 c50Var = this.Q1;
        if (c50Var != null) {
            c50Var.setGlowColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A5, false));
        }
        View view = this.T1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.V5, false));
        }
    }

    public final void K0() {
        boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final ArrayList arrayList;
        if (!this.L1) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38214m1;
            int i7 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.Y1;
            if (i7 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.Z1;
            if (i10 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f38207a2;
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
            tL_messages_getChatInviteImporters.peer = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).j1(-this.f38208b2);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.np.s1(this.f29679a).q1((TLRPC.User) this.n1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.L1 = true;
            ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final p50 p50Var = p50.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a50.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void L0(boolean z10) {
        Integer num;
        float f10;
        View view = this.T1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.R1;
            if (z10) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.S1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S1 = animatorSet2;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            if (!this.X1) {
                AnimatorSet animatorSet3 = this.S1;
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f11));
            }
            this.S1.setDuration(150L);
            this.S1.addListener(new org.telegram.ui.nn(13, this, z10));
            this.S1.start();
        }
    }

    public final void O0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.N1 = 0;
        this.f38220t1 = -1;
        this.f38221u1 = -1;
        this.f38222v1 = -1;
        this.f38223w1 = -1;
        this.f38224x1 = -1;
        this.f38225y1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.H1 = -1;
        this.I1 = -1;
        this.J1 = -1;
        this.K1 = -1;
        this.E1 = -1;
        this.f38216p1 = -1;
        this.f38217q1 = -1;
        this.f38226z1 = -1;
        this.A1 = -1;
        this.B1 = -1;
        boolean z13 = true;
        if (!this.W1) {
            this.C1 = 0;
            this.N1 = 2;
            this.D1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38214m1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i7 = this.N1;
            this.f38216p1 = i7;
            this.N1 = i7 + 2;
            this.f38217q1 = i7 + 1;
        }
        int i10 = this.N1;
        this.f38218r1 = i10;
        this.N1 = i10 + 2;
        this.f38219s1 = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        if (i11 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.Y1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f38207a2;
        ArrayList arrayList3 = this.Z1;
        if (i11 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i12 = this.N1;
            int i13 = i12 + 1;
            this.N1 = i13;
            this.f38223w1 = i12;
            this.f38224x1 = i13;
            int size2 = arrayList.size() + i13;
            this.N1 = size2;
            this.f38225y1 = size2;
            z12 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.N1;
            int i15 = i14 + 1;
            this.N1 = i15;
            this.f38226z1 = i14;
            this.A1 = i15;
            int size3 = arrayList3.size() + i15;
            this.N1 = size3;
            this.B1 = size3;
            z12 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i16 = this.N1;
            int i17 = i16 + 1;
            this.N1 = i17;
            this.I1 = i16;
            this.J1 = i17;
            int size4 = arrayList2.size() + i17;
            this.N1 = size4;
            this.K1 = size4;
        } else {
            z13 = z12;
        }
        if ((z10 || z11) && !z13) {
            int i18 = this.N1;
            this.f38220t1 = i18;
            this.E1 = i18 + 1;
            this.N1 = i18 + 3;
            this.F1 = i18 + 2;
        }
        this.O1.f();
    }

    @Override
    public final void s0() {
        int i7;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
            if (this.f29715s0 != null) {
                v0(w02);
            }
            if (this.G0 < 0 && (i7 = this.H0) == this.f38213h2 && w02 != i7) {
                this.H0 = w02;
                this.f38213h2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f38212g2 = false;
    }

    public final void updateColors() {
        TextView textView = this.R1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28977k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28995l5, false));
            if (!this.X1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A5, false);
        c50 c50Var = this.Q1;
        c50Var.setGlowColor(x02);
        this.T1.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.V5, false));
        v0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false));
        int hiddenChildCount = c50Var.getHiddenChildCount();
        for (int i7 = 0; i7 < c50Var.getChildCount(); i7++) {
            N0(c50Var.getChildAt(i7));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            N0(c50Var.V(i10));
        }
        int cachedChildCount = c50Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            N0(c50Var.P(i11));
        }
        int attachedScrapChildCount = c50Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            N0(c50Var.O(i12));
        }
        this.f29682b.invalidate();
    }
}
