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
public final class j90 extends org.telegram.ui.ActionBar.g2 {
    public org.telegram.ui.Cells.z8 E;
    public org.telegram.ui.Cells.o4 F;
    public e90 G;
    public org.telegram.ui.Cells.z8 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.w9 J;
    public org.telegram.ui.Components.vm0 K;
    public e90 L;
    public org.telegram.ui.Cells.z8 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public i90 T;
    public org.telegram.ui.ActionBar.t1 U;
    public boolean V;
    public int W;
    public final int f49059a;
    public final long f49060b;
    public org.telegram.ui.Components.gu0 f49061c;
    public org.telegram.ui.Components.gu0 d;
    public TLRPC.TL_chatInviteExported f49062e;
    public g90 f49063f;
    public org.telegram.ui.Cells.z8 h;
    public org.telegram.ui.Cells.r8 f49064n;
    public h90 f49065r;
    public TextView f49066s;
    public org.telegram.ui.Cells.z8 f49067w;
    public TextView f49068x;
    public org.telegram.ui.Cells.o4 f49069y;

    public j90(int i7, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f49059a = i7;
        this.f49060b = j3;
    }

    public final void a0(int i7) {
        int[] iArr;
        long j3 = i7;
        this.f49068x.setText(org.telegram.messenger.gd.s(j3, false));
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
                strArr[i13] = org.telegram.messenger.gd.N0(2131748009, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.gd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.gd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.gd.G(1, "Weeks", new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i13] = org.telegram.messenger.gd.N0(2131748338, null);
                } else if (j10 < 31449600) {
                    strArr[i13] = org.telegram.messenger.gd.E0().w0().format(1000 * j3);
                } else {
                    strArr[i13] = org.telegram.messenger.gd.E0().C0().format(1000 * j3);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
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
                strArr[i14] = org.telegram.messenger.gd.N0(2131748009, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.f49061c.b(i12, null, strArr);
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
                this.f49061c.b(3, null, "1", "10", "100", org.telegram.messenger.gd.N0(2131748009, null));
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
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i11 = this.f49059a;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748079, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751265, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 14));
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (i11 == 0) {
            i7 = 2131751741;
        } else {
            i7 = 2131745750;
        }
        z4Var.s(org.telegram.messenger.gd.N0(i7, null));
        d90 d90Var = new d90(this, context);
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(context, d90Var, this.resourceProvider, true);
        this.K = vm0Var;
        vm0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        w8 w8Var = new w8(6, context, this);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        layoutTransition.setInterpolator(2, krVar);
        layoutTransition.setInterpolator(0, krVar);
        layoutTransition.setInterpolator(4, krVar);
        layoutTransition.setInterpolator(1, krVar);
        layoutTransition.setInterpolator(3, krVar);
        d90Var.setLayoutTransition(layoutTransition);
        d90Var.setOrientation(1);
        d90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(d90Var);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        this.f49069y = o4Var;
        o4Var.setText(org.telegram.messenger.gd.N0(2131748789, null));
        d90Var.addView(this.f49069y);
        org.telegram.ui.Components.gu0 gu0Var = new org.telegram.ui.Components.gu0(context, null);
        this.d = gu0Var;
        d90Var.addView(gu0Var);
        TextView textView = new TextView(context);
        this.f49068x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.f49068x.setGravity(16);
        this.f49068x.setTextSize(1, 16.0f);
        this.f49068x.setHint(org.telegram.messenger.gd.N0(2131743894, null));
        this.f49068x.setOnClickListener(new org.telegram.ui.Components.p31(23, this, context));
        this.d.setCallback(new z80(this, 2));
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
        this.d.b(3, null, org.telegram.messenger.gd.G(1, "Hours", new Object[0]), org.telegram.messenger.gd.G(1, "Days", new Object[0]), org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), org.telegram.messenger.gd.N0(2131748009, null));
        d90Var.addView(this.f49068x, c8.na.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.E = z8Var;
        z8Var.setText(org.telegram.messenger.gd.N0(2131743895, null));
        d90Var.addView(this.E);
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context);
        this.F = o4Var2;
        o4Var2.setText(org.telegram.messenger.gd.N0(2131748787, null));
        d90Var.addView(this.F);
        org.telegram.ui.Components.gu0 gu0Var2 = new org.telegram.ui.Components.gu0(context, null);
        this.f49061c = gu0Var2;
        gu0Var2.setCallback(new z80(this, 3));
        c0();
        d90Var.addView(this.f49061c);
        e90 e90Var = new e90(context, 0);
        this.G = e90Var;
        e90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.gd.N0(2131743373, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new f90(this, 0));
        d90Var.addView(this.G, c8.na.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.H = z8Var2;
        z8Var2.setText(org.telegram.messenger.gd.N0(2131743374, null));
        d90Var.addView(this.H);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f49060b;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.t0(O0) && !O0.join_request && !O0.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? r8Var = new org.telegram.ui.Cells.r8(context);
        this.f49063f = r8Var;
        int i13 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.u6.h(i13, r8Var, null);
        this.f49063f.setTag(Integer.valueOf(i13));
        this.f49063f.f(org.telegram.messenger.gd.N0(2131754204, null), false, false);
        this.f49063f.setOnClickListener(new fi.v1(6, this, z10));
        d90Var.addView(this.f49063f, c8.na.o(-1, 56));
        org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.h = z8Var3;
        if (z10) {
            this.f49063f.setCheckBoxIcon(2131232518);
            this.h.setText(org.telegram.messenger.gd.N0(2131754178, null));
        } else {
            z8Var3.setText(org.telegram.messenger.gd.N0(2131754199, null));
        }
        d90Var.addView(this.h);
        if (O0 != null && O0.username != null) {
            f10 = -1.0f;
        } else {
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.currentAccount).P0(j3);
            f10 = -1.0f;
            if ((this.f49062e == null && org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j3))) && P0 != null && P0.paid_media_allowed) || ((tL_chatInviteExported = this.f49062e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
                this.f49064n = r8Var2;
                org.telegram.ui.ActionBar.u6.h(i13, r8Var2, null);
                this.f49064n.setDrawCheckRipple(true);
                this.f49064n.f(org.telegram.messenger.gd.N0(2131745963, null), false, true);
                if (this.f49062e != null) {
                    this.f49064n.setCheckBoxIcon(2131232518);
                    this.f49064n.setEnabled(false);
                }
                this.f49064n.setOnClickListener(new org.telegram.ui.Components.p31(24, this, new Runnable[1]));
                d90Var.addView(this.f49064n, c8.na.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f49066s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(this.f49066s, org.telegram.ui.ActionBar.n6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = 2131745957;
                } else {
                    i10 = 2131745958;
                }
                h90 h90Var = new h90(this, context, org.telegram.messenger.gd.N0(i10, null), this.resourceProvider);
                this.f49065r = h90Var;
                h90Var.d.setInputType(2);
                this.f49065r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.u6.h(i13, this.f49065r, getResourceProvider());
                h90 h90Var2 = this.f49065r;
                h90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(h90Var2, 5);
                org.telegram.ui.Cells.j3 j3Var = h90Var2.d;
                j3Var.setImeOptions(6);
                j3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.f49065r.addView(this.f49066s, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                h90 h90Var3 = this.f49065r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232757).mutate();
                h90Var3.getClass();
                ImageView imageView = new ImageView(h90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                h90Var3.addView(imageView, c8.na.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.j3 j3Var2 = h90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                j3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                d90Var.addView(this.f49065r, c8.na.o(-1, 48));
                this.f49065r.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
                this.f49067w = z8Var4;
                if (this.f49062e != null) {
                    z8Var4.setText(org.telegram.messenger.gd.N0(2131745961, null));
                } else {
                    z8Var4.setText(org.telegram.messenger.g0.b4(org.telegram.messenger.gd.N0(2131745962, null), new c90(this, 0)));
                }
                d90Var.addView(this.f49067w, c8.na.o(-1, -2));
            }
        }
        e90 e90Var2 = new e90(context, 1);
        this.L = e90Var2;
        e90Var2.addTextChangedListener(new f90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.gd.N0(2131748703, null));
        e90 e90Var3 = this.L;
        int i14 = org.telegram.ui.ActionBar.n6.f29843y6;
        org.telegram.ui.ActionBar.u6.D(e90Var3, i14, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        e90 e90Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(e90Var4, i15, null);
        this.L.setTextSize(1, 16.0f);
        d90Var.addView(this.L, c8.na.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.M = z8Var5;
        z8Var5.setText(org.telegram.messenger.gd.N0(2131748704, null));
        d90Var.addView(this.M);
        if (i11 == 1) {
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.J = w9Var;
            org.telegram.ui.ActionBar.u6.h(i13, w9Var, null);
            this.J.b(org.telegram.messenger.gd.N0(2131745827, null), false);
            org.telegram.ui.ActionBar.u6.U(this.J.getTextView(), org.telegram.ui.ActionBar.n6.f29672p7, null);
            this.J.setOnClickListener(new i40(this, 5));
            d90Var.addView(this.J);
        }
        w8Var.addView(this.K, c8.na.c(f10, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, frameLayout, getResourceProvider());
        new hi.x3(w8Var, false, new fi.e(19));
        w8Var.addView(this.I, c8.na.e(-1, -2, 80));
        org.telegram.ui.ActionBar.u6.h(i13, this.f49069y, null);
        org.telegram.ui.ActionBar.u6.h(i13, this.d, null);
        org.telegram.ui.ActionBar.u6.h(i13, this.f49068x, null);
        org.telegram.ui.ActionBar.u6.h(i13, this.F, null);
        org.telegram.ui.ActionBar.u6.h(i13, this.f49061c, null);
        org.telegram.ui.ActionBar.u6.h(i13, this.G, null);
        org.telegram.ui.ActionBar.u6.h(i13, this.L, null);
        org.telegram.ui.ActionBar.u6.U(this.G, i15, null);
        org.telegram.ui.ActionBar.u6.D(this.G, i14, null);
        org.telegram.ui.ActionBar.u6.U(this.f49068x, i15, null);
        org.telegram.ui.ActionBar.u6.D(this.f49068x, i14, null);
        this.G.setCursorVisible(false);
        d0(this.f49062e);
        w8Var.setClipChildren(false);
        this.K.setClipChildren(false);
        d90Var.setClipChildren(false);
        return w8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        this.f49062e = tL_chatInviteExported;
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
            g90 g90Var = this.f49063f;
            if (g90Var != null) {
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, g90Var, null);
                this.f49063f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.j6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
                this.L.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.r8 r8Var = this.f49064n;
            if (r8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                r8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                g90 g90Var2 = this.f49063f;
                if (g90Var2 != null) {
                    g90Var2.setChecked(false);
                    this.f49063f.setCheckBoxIcon(2131232518);
                }
                org.telegram.ui.Cells.z8 z8Var = this.h;
                if (z8Var != null) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131754198, null));
                }
            }
            h90 h90Var = this.f49065r;
            if (h90Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                h90Var.setVisibility(i7);
                this.f49065r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f49065r.d.setClickable(false);
                this.f49065r.d.setFocusable(false);
                this.f49065r.d.setFocusableInTouchMode(false);
                this.f49065r.d.setLongClickable(false);
            }
        }
    }

    public final void e0(boolean z10) {
        int i7;
        int i10;
        int i11;
        org.telegram.ui.Cells.o4 o4Var = this.F;
        int i12 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        o4Var.setVisibility(i7);
        org.telegram.ui.Components.gu0 gu0Var = this.f49061c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gu0Var.setVisibility(i10);
        e90 e90Var = this.G;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        e90Var.setVisibility(i11);
        org.telegram.ui.Cells.z8 z8Var = this.H;
        if (z10) {
            i12 = 0;
        }
        z8Var.setVisibility(i12);
    }

    @Override
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override
    public final org.telegram.ui.Components.vm0 getScrollViewForSimpleGlass() {
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
