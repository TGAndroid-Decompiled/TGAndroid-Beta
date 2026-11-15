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
public final class i90 extends org.telegram.ui.ActionBar.e2 {
    public org.telegram.ui.Cells.y8 E;
    public org.telegram.ui.Cells.n4 F;
    public d90 G;
    public org.telegram.ui.Cells.y8 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.v9 J;
    public org.telegram.ui.Components.lm0 K;
    public d90 L;
    public org.telegram.ui.Cells.y8 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public h90 T;
    public org.telegram.ui.ActionBar.t1 U;
    public boolean V;
    public int W;
    public final int f47976a;
    public final long f47977b;
    public org.telegram.ui.Components.wt0 f47978c;
    public org.telegram.ui.Components.wt0 d;
    public TLRPC.TL_chatInviteExported f47979e;
    public f90 f47980f;
    public org.telegram.ui.Cells.y8 h;
    public org.telegram.ui.Cells.q8 f47981n;
    public g90 f47982r;
    public TextView f47983s;
    public org.telegram.ui.Cells.y8 f47984w;
    public TextView f47985x;
    public org.telegram.ui.Cells.n4 f47986y;

    public i90(int i7, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f47976a = i7;
        this.f47977b = j3;
    }

    public final void a0(int i7) {
        int[] iArr;
        long j3 = i7;
        this.f47985x.setText(org.telegram.messenger.hd.s(j3, false));
        int currentTime = i7 - getConnectionsManager().getCurrentTime();
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
            i10 = com.google.android.gms.internal.vision.e2.f(iArr[i10], i10, 1, arrayList);
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
                strArr[i13] = org.telegram.messenger.hd.M0(2131748202, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Weeks", new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i13] = org.telegram.messenger.hd.M0(2131748531, null);
                } else if (j10 < 31449600) {
                    strArr[i13] = org.telegram.messenger.hd.E0().w0().format(1000 * j3);
                } else {
                    strArr[i13] = org.telegram.messenger.hd.E0().C0().format(1000 * j3);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
    }

    public final void b0(int i7) {
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
            if (!z10 && i7 <= (i10 = iArr[i11])) {
                if (i7 != i10) {
                    arrayList.add(Integer.valueOf(i7));
                }
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.gms.internal.vision.e2.f(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i7));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.hd.M0(2131748202, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.f47978c.b(i12, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i7 < iArr.length) {
                i7 = com.google.android.gms.internal.vision.e2.f(iArr[i7], i7, 1, arrayList);
            } else {
                this.f47978c.b(3, null, "1", "10", "100", org.telegram.messenger.hd.M0(2131748202, null));
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        boolean z10;
        float f10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i11 = this.f47976a;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748272, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751277, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 12));
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (i11 == 0) {
            i7 = 2131751753;
        } else {
            i7 = 2131745946;
        }
        w4Var.q(org.telegram.messenger.hd.M0(i7, null));
        c90 c90Var = new c90(this, context);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, c90Var, this.resourceProvider, true);
        this.K = lm0Var;
        lm0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        v8 v8Var = new v8(6, context, this);
        this.fragmentView = v8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        layoutTransition.setInterpolator(2, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(4, erVar);
        layoutTransition.setInterpolator(1, erVar);
        layoutTransition.setInterpolator(3, erVar);
        c90Var.setLayoutTransition(layoutTransition);
        c90Var.setOrientation(1);
        c90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(c90Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.f47986y = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131748982, null));
        c90Var.addView(this.f47986y);
        org.telegram.ui.Components.wt0 wt0Var = new org.telegram.ui.Components.wt0(context, null);
        this.d = wt0Var;
        c90Var.addView(wt0Var);
        TextView textView = new TextView(context);
        this.f47985x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.f47985x.setGravity(16);
        this.f47985x.setTextSize(1, 16.0f);
        this.f47985x.setHint(org.telegram.messenger.hd.M0(2131744139, null));
        this.f47985x.setOnClickListener(new org.telegram.ui.Components.vv0(29, this, context));
        this.d.setCallback(new x80(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = com.google.android.gms.internal.vision.e2.f(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.hd.G(1, "Hours", new Object[0]), org.telegram.messenger.hd.G(1, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.M0(2131748202, null));
        c90Var.addView(this.f47985x, c8.ja.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.E = y8Var;
        y8Var.setText(org.telegram.messenger.hd.M0(2131744140, null));
        c90Var.addView(this.E);
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
        this.F = n4Var2;
        n4Var2.setText(org.telegram.messenger.hd.M0(2131748980, null));
        c90Var.addView(this.F);
        org.telegram.ui.Components.wt0 wt0Var2 = new org.telegram.ui.Components.wt0(context, null);
        this.f47978c = wt0Var2;
        wt0Var2.setCallback(new x80(this, 3));
        c0();
        c90Var.addView(this.f47978c);
        d90 d90Var = new d90(context, 0);
        this.G = d90Var;
        d90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.hd.M0(2131743620, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new e90(this, 0));
        c90Var.addView(this.G, c8.ja.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.H = y8Var2;
        y8Var2.setText(org.telegram.messenger.hd.M0(2131743621, null));
        c90Var.addView(this.H);
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.f47977b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.t0(M0) && !M0.join_request && !M0.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? q8Var = new org.telegram.ui.Cells.q8(context);
        this.f47980f = q8Var;
        int i13 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i13, q8Var, null);
        this.f47980f.setTag(Integer.valueOf(i13));
        this.f47980f.f(org.telegram.messenger.hd.M0(2131754207, null), false, false);
        this.f47980f.setOnClickListener(new fi.x1(6, this, z10));
        c90Var.addView(this.f47980f, c8.ja.o(-1, 56));
        org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.h = y8Var3;
        if (z10) {
            this.f47980f.setCheckBoxIcon(2131232514);
            this.h.setText(org.telegram.messenger.hd.M0(2131754181, null));
        } else {
            y8Var3.setText(org.telegram.messenger.hd.M0(2131754202, null));
        }
        c90Var.addView(this.h);
        if (M0 != null && M0.username != null) {
            f10 = -1.0f;
        } else {
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.currentAccount).N0(j3);
            f10 = -1.0f;
            if ((this.f47979e == null && org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(j3))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.f47979e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context);
                this.f47981n = q8Var2;
                org.telegram.ui.ActionBar.q6.h(i13, q8Var2, null);
                this.f47981n.setDrawCheckRipple(true);
                this.f47981n.f(org.telegram.messenger.hd.M0(2131746159, null), false, true);
                if (this.f47979e != null) {
                    this.f47981n.setCheckBoxIcon(2131232514);
                    this.f47981n.setEnabled(false);
                }
                this.f47981n.setOnClickListener(new a90(0, this, new Runnable[1]));
                c90Var.addView(this.f47981n, c8.ja.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f47983s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(this.f47983s, org.telegram.ui.ActionBar.j6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = 2131746153;
                } else {
                    i10 = 2131746154;
                }
                g90 g90Var = new g90(this, context, org.telegram.messenger.hd.M0(i10, null), this.resourceProvider);
                this.f47982r = g90Var;
                g90Var.d.setInputType(2);
                this.f47982r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.q6.h(i13, this.f47982r, getResourceProvider());
                g90 g90Var2 = this.f47982r;
                g90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(g90Var2, 5);
                org.telegram.ui.Cells.i3 i3Var = g90Var2.d;
                i3Var.setImeOptions(6);
                i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.f47982r.addView(this.f47983s, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                g90 g90Var3 = this.f47982r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232753).mutate();
                g90Var3.getClass();
                ImageView imageView = new ImageView(g90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                g90Var3.addView(imageView, c8.ja.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.i3 i3Var2 = g90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                i3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                c90Var.addView(this.f47982r, c8.ja.o(-1, 48));
                this.f47982r.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
                this.f47984w = y8Var4;
                if (this.f47979e != null) {
                    y8Var4.setText(org.telegram.messenger.hd.M0(2131746157, null));
                } else {
                    y8Var4.setText(org.telegram.messenger.g0.c4(org.telegram.messenger.hd.M0(2131746158, null), new b90(this, 0)));
                }
                c90Var.addView(this.f47984w, c8.ja.o(-1, -2));
            }
        }
        d90 d90Var2 = new d90(context, 1);
        this.L = d90Var2;
        d90Var2.addTextChangedListener(new e90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.hd.M0(2131748896, null));
        d90 d90Var3 = this.L;
        int i14 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.D(d90Var3, i14, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        d90 d90Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(d90Var4, i15, null);
        this.L.setTextSize(1, 16.0f);
        c90Var.addView(this.L, c8.ja.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.M = y8Var5;
        y8Var5.setText(org.telegram.messenger.hd.M0(2131748897, null));
        c90Var.addView(this.M);
        if (i11 == 1) {
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.J = v9Var;
            org.telegram.ui.ActionBar.q6.h(i13, v9Var, null);
            this.J.b(org.telegram.messenger.hd.M0(2131746023, null), false);
            org.telegram.ui.ActionBar.q6.U(this.J.getTextView(), org.telegram.ui.ActionBar.j6.f29070p7, null);
            this.J.setOnClickListener(new g40(this, 5));
            c90Var.addView(this.J);
        }
        v8Var.addView(this.K, c8.ja.c(f10, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout, getResourceProvider());
        new hi.p3(v8Var, false, new fi.e(18));
        v8Var.addView(this.I, c8.ja.e(-1, -2, 80));
        org.telegram.ui.ActionBar.q6.h(i13, this.f47986y, null);
        org.telegram.ui.ActionBar.q6.h(i13, this.d, null);
        org.telegram.ui.ActionBar.q6.h(i13, this.f47985x, null);
        org.telegram.ui.ActionBar.q6.h(i13, this.F, null);
        org.telegram.ui.ActionBar.q6.h(i13, this.f47978c, null);
        org.telegram.ui.ActionBar.q6.h(i13, this.G, null);
        org.telegram.ui.ActionBar.q6.h(i13, this.L, null);
        org.telegram.ui.ActionBar.q6.U(this.G, i15, null);
        org.telegram.ui.ActionBar.q6.D(this.G, i14, null);
        org.telegram.ui.ActionBar.q6.U(this.f47985x, i15, null);
        org.telegram.ui.ActionBar.q6.D(this.f47985x, i14, null);
        this.G.setCursorVisible(false);
        d0(this.f47979e);
        v8Var.setClipChildren(false);
        this.K.setClipChildren(false);
        c90Var.setClipChildren(false);
        return v8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        this.f47979e = tL_chatInviteExported;
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
            f90 f90Var = this.f47980f;
            if (f90Var != null) {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, f90Var, null);
                this.f47980f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.j6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
                this.L.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.q8 q8Var = this.f47981n;
            if (q8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                q8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                f90 f90Var2 = this.f47980f;
                if (f90Var2 != null) {
                    f90Var2.setChecked(false);
                    this.f47980f.setCheckBoxIcon(2131232514);
                }
                org.telegram.ui.Cells.y8 y8Var = this.h;
                if (y8Var != null) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131754201, null));
                }
            }
            g90 g90Var = this.f47982r;
            if (g90Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                g90Var.setVisibility(i7);
                this.f47982r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f47982r.d.setClickable(false);
                this.f47982r.d.setFocusable(false);
                this.f47982r.d.setFocusableInTouchMode(false);
                this.f47982r.d.setLongClickable(false);
            }
        }
    }

    public final void e0(boolean z10) {
        int i7;
        int i10;
        int i11;
        org.telegram.ui.Cells.n4 n4Var = this.F;
        int i12 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        n4Var.setVisibility(i7);
        org.telegram.ui.Components.wt0 wt0Var = this.f47978c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wt0Var.setVisibility(i10);
        d90 d90Var = this.G;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d90Var.setVisibility(i11);
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
    public final org.telegram.ui.Components.lm0 getScrollViewForSimpleGlass() {
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
