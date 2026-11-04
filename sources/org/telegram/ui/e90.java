package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class e90 extends org.telegram.ui.ActionBar.d2 {
    public org.telegram.ui.Cells.y8 E;
    public org.telegram.ui.Cells.n4 F;
    public z80 G;
    public org.telegram.ui.Cells.y8 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.v9 J;
    public org.telegram.ui.Components.km0 K;
    public z80 L;
    public org.telegram.ui.Cells.y8 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public d90 T;
    public org.telegram.ui.ActionBar.s1 U;
    public boolean V;
    public int W;
    public final int f44930a;
    public final long f44931b;
    public org.telegram.ui.Components.ut0 f44932c;
    public org.telegram.ui.Components.ut0 d;
    public TLRPC.TL_chatInviteExported f44933e;
    public b90 f44934f;
    public org.telegram.ui.Cells.y8 h;
    public org.telegram.ui.Cells.q8 f44935n;
    public c90 f44936r;
    public TextView f44937s;
    public org.telegram.ui.Cells.y8 f44938w;
    public TextView f44939x;
    public org.telegram.ui.Cells.n4 f44940y;

    public e90(int i3, long j10) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f44930a = i3;
        this.f44931b = j10;
    }

    public final void a0(int i3) {
        int[] iArr;
        long j10 = i3;
        this.f44939x.setText(org.telegram.messenger.bd.s(j10, false));
        int currentTime = i3 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            iArr = this.Q;
            if (i10 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i10]) {
                arrayList.add(Integer.valueOf(currentTime));
                i11 = i10;
                z10 = true;
            }
            i10 = com.google.android.recaptcha.internal.a.f(iArr[i10], i10, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i11 = iArr.length;
        }
        int size = arrayList.size();
        int i12 = size + 1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == size) {
                strArr[i13] = org.telegram.messenger.bd.M0(2131748210, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.bd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.bd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.bd.G(1, "Weeks", new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i13] = org.telegram.messenger.bd.M0(2131748539, null);
                } else if (j11 < 31449600) {
                    strArr[i13] = org.telegram.messenger.bd.E0().w0().format(1000 * j10);
                } else {
                    strArr[i13] = org.telegram.messenger.bd.E0().C0().format(1000 * j10);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    public final void b0(int i3) {
        int[] iArr;
        int i10;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.S;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && i3 <= (i10 = iArr[i11])) {
                if (i3 != i10) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.recaptcha.internal.a.f(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i3));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.bd.M0(2131748210, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.f44932c.b(i12, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i3 < iArr.length) {
                i3 = com.google.android.recaptcha.internal.a.f(iArr[i3], i3, 1, arrayList);
            } else {
                this.f44932c.b(3, null, "1", "10", "100", org.telegram.messenger.bd.M0(2131748210, null));
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i3;
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i11 = this.f44930a;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748280, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751278, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 12));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (i11 == 0) {
            i3 = 2131751753;
        } else {
            i3 = 2131745956;
        }
        y4Var.n(org.telegram.messenger.bd.M0(i3, null));
        y80 y80Var = new y80(this, context);
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(context, y80Var, this.resourceProvider, true);
        this.K = km0Var;
        km0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        ai.h5 h5Var = new ai.h5(7, context, this);
        this.fragmentView = h5Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        layoutTransition.setInterpolator(2, xqVar);
        layoutTransition.setInterpolator(0, xqVar);
        layoutTransition.setInterpolator(4, xqVar);
        layoutTransition.setInterpolator(1, xqVar);
        layoutTransition.setInterpolator(3, xqVar);
        y80Var.setLayoutTransition(layoutTransition);
        y80Var.setOrientation(1);
        y80Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(y80Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.f44940y = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131748990, null));
        y80Var.addView(this.f44940y);
        org.telegram.ui.Components.ut0 ut0Var = new org.telegram.ui.Components.ut0(context, null);
        this.d = ut0Var;
        y80Var.addView(ut0Var);
        TextView textView = new TextView(context);
        this.f44939x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.f44939x.setGravity(16);
        this.f44939x.setTextSize(1, 16.0f);
        this.f44939x.setHint(org.telegram.messenger.bd.M0(2131744149, null));
        this.f44939x.setOnClickListener(new org.telegram.ui.Components.ux0(27, this, context));
        this.d.setCallback(new u80(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = com.google.android.recaptcha.internal.a.f(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.bd.G(1, "Hours", new Object[0]), org.telegram.messenger.bd.G(1, "Days", new Object[0]), org.telegram.messenger.bd.G(1, "Weeks", new Object[0]), org.telegram.messenger.bd.M0(2131748210, null));
        y80Var.addView(this.f44939x, b8.mf.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.E = y8Var;
        y8Var.setText(org.telegram.messenger.bd.M0(2131744150, null));
        y80Var.addView(this.E);
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
        this.F = n4Var2;
        n4Var2.setText(org.telegram.messenger.bd.M0(2131748988, null));
        y80Var.addView(this.F);
        org.telegram.ui.Components.ut0 ut0Var2 = new org.telegram.ui.Components.ut0(context, null);
        this.f44932c = ut0Var2;
        ut0Var2.setCallback(new u80(this, 3));
        c0();
        y80Var.addView(this.f44932c);
        z80 z80Var = new z80(context, 0);
        this.G = z80Var;
        z80Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.bd.M0(2131743630, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new a90(this, 0));
        y80Var.addView(this.G, b8.mf.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.H = y8Var2;
        y8Var2.setText(org.telegram.messenger.bd.M0(2131743631, null));
        y80Var.addView(this.H);
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.f44931b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (org.telegram.messenger.t3.t0(M0) && !M0.join_request && !M0.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? q8Var = new org.telegram.ui.Cells.q8(context);
        this.f44934f = q8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i13, q8Var, null);
        this.f44934f.setTag(Integer.valueOf(i13));
        this.f44934f.f(org.telegram.messenger.bd.M0(2131754207, null), false, false);
        this.f44934f.setOnClickListener(new ei.e2(7, this, z10));
        y80Var.addView(this.f44934f, b8.mf.o(-1, 56));
        org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.h = y8Var3;
        if (z10) {
            this.f44934f.setCheckBoxIcon(2131232513);
            this.h.setText(org.telegram.messenger.bd.M0(2131754181, null));
        } else {
            y8Var3.setText(org.telegram.messenger.bd.M0(2131754202, null));
        }
        y80Var.addView(this.h);
        if (M0 == null || M0.username == null) {
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.currentAccount).N0(j10);
            if ((this.f44933e == null && org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(j10))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.f44933e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context);
                this.f44935n = q8Var2;
                org.telegram.ui.ActionBar.r6.i(i13, q8Var2, null);
                this.f44935n.setDrawCheckRipple(true);
                this.f44935n.f(org.telegram.messenger.bd.M0(2131746169, null), false, true);
                if (this.f44933e != null) {
                    this.f44935n.setCheckBoxIcon(2131232513);
                    this.f44935n.setEnabled(false);
                }
                this.f44935n.setOnClickListener(new org.telegram.ui.Components.ux0(28, this, new Runnable[1]));
                y80Var.addView(this.f44935n, b8.mf.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f44937s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(this.f44937s, org.telegram.ui.ActionBar.k6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = 2131746163;
                } else {
                    i10 = 2131746164;
                }
                c90 c90Var = new c90(this, context, org.telegram.messenger.bd.M0(i10, null), this.resourceProvider);
                this.f44936r = c90Var;
                c90Var.d.setInputType(2);
                this.f44936r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.r6.i(i13, this.f44936r, getResourceProvider());
                c90 c90Var2 = this.f44936r;
                c90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(c90Var2, 4);
                org.telegram.ui.Cells.i3 i3Var = c90Var2.d;
                i3Var.setImeOptions(6);
                i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.f44936r.addView(this.f44937s, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                c90 c90Var3 = this.f44936r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232750).mutate();
                c90Var3.getClass();
                ImageView imageView = new ImageView(c90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                c90Var3.addView(imageView, b8.mf.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.i3 i3Var2 = c90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                i3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                y80Var.addView(this.f44936r, b8.mf.o(-1, 48));
                this.f44936r.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
                this.f44938w = y8Var4;
                if (this.f44933e != null) {
                    y8Var4.setText(org.telegram.messenger.bd.M0(2131746167, null));
                } else {
                    y8Var4.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.bd.M0(2131746168, null), new x80(this, 0)));
                }
                y80Var.addView(this.f44938w, b8.mf.o(-1, -2));
            }
        }
        z80 z80Var2 = new z80(context, 1);
        this.L = z80Var2;
        z80Var2.addTextChangedListener(new a90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.bd.M0(2131748904, null));
        z80 z80Var3 = this.L;
        int i14 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.E(z80Var3, i14, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        z80 z80Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(z80Var4, i15, null);
        this.L.setTextSize(1, 16.0f);
        y80Var.addView(this.L, b8.mf.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.M = y8Var5;
        y8Var5.setText(org.telegram.messenger.bd.M0(2131748905, null));
        y80Var.addView(this.M);
        if (i11 == 1) {
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.J = v9Var;
            org.telegram.ui.ActionBar.r6.i(i13, v9Var, null);
            this.J.b(org.telegram.messenger.bd.M0(2131746033, null), false);
            org.telegram.ui.ActionBar.r6.V(this.J.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, null);
            this.J.setOnClickListener(new b40(this, 5));
            y80Var.addView(this.J);
        }
        h5Var.addView(this.K, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, getResourceProvider());
        new gi.p3(h5Var, false, new ei.e(17));
        h5Var.addView(this.I, b8.mf.e(-1, -2, 80));
        org.telegram.ui.ActionBar.r6.i(i13, this.f44940y, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.d, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.f44939x, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.F, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.f44932c, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.G, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.L, null);
        org.telegram.ui.ActionBar.r6.V(this.G, i15, null);
        org.telegram.ui.ActionBar.r6.E(this.G, i14, null);
        org.telegram.ui.ActionBar.r6.V(this.f44939x, i15, null);
        org.telegram.ui.ActionBar.r6.E(this.f44939x, i14, null);
        this.G.setCursorVisible(false);
        d0(this.f44933e);
        h5Var.setClipChildren(false);
        this.K.setClipChildren(false);
        y80Var.setClipChildren(false);
        return h5Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i3;
        this.f44933e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i10 = tL_chatInviteExported.expire_date;
            if (i10 > 0) {
                a0(i10);
                this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.W = 0;
            }
            int i11 = tL_chatInviteExported.usage_limit;
            if (i11 > 0) {
                b0(i11);
                this.G.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            b90 b90Var = this.f44934f;
            if (b90Var != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, b90Var, null);
                this.f44934f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.i6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
                this.L.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.q8 q8Var = this.f44935n;
            if (q8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                q8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                b90 b90Var2 = this.f44934f;
                if (b90Var2 != null) {
                    b90Var2.setChecked(false);
                    this.f44934f.setCheckBoxIcon(2131232513);
                }
                org.telegram.ui.Cells.y8 y8Var = this.h;
                if (y8Var != null) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131754201, null));
                }
            }
            c90 c90Var = this.f44936r;
            if (c90Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                c90Var.setVisibility(i3);
                this.f44936r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f44936r.d.setClickable(false);
                this.f44936r.d.setFocusable(false);
                this.f44936r.d.setFocusableInTouchMode(false);
                this.f44936r.d.setLongClickable(false);
            }
        }
    }

    public final void e0(boolean z10) {
        int i3;
        int i10;
        int i11;
        org.telegram.ui.Cells.n4 n4Var = this.F;
        int i12 = 8;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        n4Var.setVisibility(i3);
        org.telegram.ui.Components.ut0 ut0Var = this.f44932c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ut0Var.setVisibility(i10);
        z80 z80Var = this.G;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        z80Var.setVisibility(i11);
        org.telegram.ui.Cells.y8 y8Var = this.H;
        if (z10) {
            i12 = 0;
        }
        y8Var.setVisibility(i12);
    }

    @Override
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.K;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
