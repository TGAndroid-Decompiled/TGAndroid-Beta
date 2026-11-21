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
public final class k90 extends org.telegram.ui.ActionBar.g2 {
    public org.telegram.ui.Cells.a9 E;
    public org.telegram.ui.Cells.o4 F;
    public f90 G;
    public org.telegram.ui.Cells.a9 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.x9 J;
    public org.telegram.ui.Components.wm0 K;
    public f90 L;
    public org.telegram.ui.Cells.a9 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public j90 T;
    public org.telegram.ui.ActionBar.t1 U;
    public boolean V;
    public int W;
    public final int f49246a;
    public final long f49247b;
    public org.telegram.ui.Components.hu0 f49248c;
    public org.telegram.ui.Components.hu0 d;
    public TLRPC.TL_chatInviteExported f49249e;
    public h90 f49250f;
    public org.telegram.ui.Cells.a9 h;
    public org.telegram.ui.Cells.s8 f49251n;
    public i90 f49252r;
    public TextView f49253s;
    public org.telegram.ui.Cells.a9 f49254w;
    public TextView f49255x;
    public org.telegram.ui.Cells.o4 f49256y;

    public k90(int i7, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f49246a = i7;
        this.f49247b = j3;
    }

    public final void a0(int i7) {
        int[] iArr;
        long j3 = i7;
        this.f49255x.setText(org.telegram.messenger.gd.s(j3, false));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
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
        this.f49248c.b(i12, null, strArr);
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
                this.f49248c.b(3, null, "1", "10", "100", org.telegram.messenger.gd.N0(2131748009, null));
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
        int i11 = this.f49246a;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748079, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751265, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 14));
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (i11 == 0) {
            i7 = 2131751741;
        } else {
            i7 = 2131745750;
        }
        z4Var.s(org.telegram.messenger.gd.N0(i7, null));
        e90 e90Var = new e90(this, context);
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, e90Var, this.resourceProvider, true);
        this.K = wm0Var;
        wm0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        w8 w8Var = new w8(6, context, this);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        layoutTransition.setInterpolator(2, nrVar);
        layoutTransition.setInterpolator(0, nrVar);
        layoutTransition.setInterpolator(4, nrVar);
        layoutTransition.setInterpolator(1, nrVar);
        layoutTransition.setInterpolator(3, nrVar);
        e90Var.setLayoutTransition(layoutTransition);
        e90Var.setOrientation(1);
        e90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(e90Var);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        this.f49256y = o4Var;
        o4Var.setText(org.telegram.messenger.gd.N0(2131748789, null));
        e90Var.addView(this.f49256y);
        org.telegram.ui.Components.hu0 hu0Var = new org.telegram.ui.Components.hu0(context, null);
        this.d = hu0Var;
        e90Var.addView(hu0Var);
        TextView textView = new TextView(context);
        this.f49255x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.f49255x.setGravity(16);
        this.f49255x.setTextSize(1, 16.0f);
        this.f49255x.setHint(org.telegram.messenger.gd.N0(2131743898, null));
        this.f49255x.setOnClickListener(new org.telegram.ui.Components.q31(23, this, context));
        this.d.setCallback(new a90(this, 2));
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
        e90Var.addView(this.f49255x, c8.ma.o(-1, 50));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.E = a9Var;
        a9Var.setText(org.telegram.messenger.gd.N0(2131743899, null));
        e90Var.addView(this.E);
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context);
        this.F = o4Var2;
        o4Var2.setText(org.telegram.messenger.gd.N0(2131748787, null));
        e90Var.addView(this.F);
        org.telegram.ui.Components.hu0 hu0Var2 = new org.telegram.ui.Components.hu0(context, null);
        this.f49248c = hu0Var2;
        hu0Var2.setCallback(new a90(this, 3));
        c0();
        e90Var.addView(this.f49248c);
        f90 f90Var = new f90(context, 0);
        this.G = f90Var;
        f90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.gd.N0(2131743377, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new g90(this, 0));
        e90Var.addView(this.G, c8.ma.o(-1, 50));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.H = a9Var2;
        a9Var2.setText(org.telegram.messenger.gd.N0(2131743378, null));
        e90Var.addView(this.H);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f49247b;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.t0(O0) && !O0.join_request && !O0.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? s8Var = new org.telegram.ui.Cells.s8(context);
        this.f49250f = s8Var;
        int i13 = org.telegram.ui.ActionBar.m6.f29378d6;
        org.telegram.ui.ActionBar.t6.h(i13, s8Var, null);
        this.f49250f.setTag(Integer.valueOf(i13));
        this.f49250f.f(org.telegram.messenger.gd.N0(2131754204, null), false, false);
        this.f49250f.setOnClickListener(new fi.v1(6, this, z10));
        e90Var.addView(this.f49250f, c8.ma.o(-1, 56));
        org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.h = a9Var3;
        if (z10) {
            this.f49250f.setCheckBoxIcon(2131232515);
            this.h.setText(org.telegram.messenger.gd.N0(2131754178, null));
        } else {
            a9Var3.setText(org.telegram.messenger.gd.N0(2131754199, null));
        }
        e90Var.addView(this.h);
        if (O0 != null && O0.username != null) {
            f10 = -1.0f;
        } else {
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.currentAccount).P0(j3);
            f10 = -1.0f;
            if ((this.f49249e == null && org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j3))) && P0 != null && P0.paid_media_allowed) || ((tL_chatInviteExported = this.f49249e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
                this.f49251n = s8Var2;
                org.telegram.ui.ActionBar.t6.h(i13, s8Var2, null);
                this.f49251n.setDrawCheckRipple(true);
                this.f49251n.f(org.telegram.messenger.gd.N0(2131745963, null), false, true);
                if (this.f49249e != null) {
                    this.f49251n.setCheckBoxIcon(2131232515);
                    this.f49251n.setEnabled(false);
                }
                this.f49251n.setOnClickListener(new org.telegram.ui.Components.q31(24, this, new Runnable[1]));
                e90Var.addView(this.f49251n, c8.ma.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f49253s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(this.f49253s, org.telegram.ui.ActionBar.m6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = 2131745957;
                } else {
                    i10 = 2131745958;
                }
                i90 i90Var = new i90(this, context, org.telegram.messenger.gd.N0(i10, null), this.resourceProvider);
                this.f49252r = i90Var;
                i90Var.d.setInputType(2);
                this.f49252r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.t6.h(i13, this.f49252r, getResourceProvider());
                i90 i90Var2 = this.f49252r;
                i90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(i90Var2, 5);
                org.telegram.ui.Cells.j3 j3Var = i90Var2.d;
                j3Var.setImeOptions(6);
                j3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.f49252r.addView(this.f49253s, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                i90 i90Var3 = this.f49252r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232754).mutate();
                i90Var3.getClass();
                ImageView imageView = new ImageView(i90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                i90Var3.addView(imageView, c8.ma.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.j3 j3Var2 = i90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                j3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                e90Var.addView(this.f49252r, c8.ma.o(-1, 48));
                this.f49252r.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
                this.f49254w = a9Var4;
                if (this.f49249e != null) {
                    a9Var4.setText(org.telegram.messenger.gd.N0(2131745961, null));
                } else {
                    a9Var4.setText(org.telegram.messenger.g0.b4(org.telegram.messenger.gd.N0(2131745962, null), new d90(this, 0)));
                }
                e90Var.addView(this.f49254w, c8.ma.o(-1, -2));
            }
        }
        f90 f90Var2 = new f90(context, 1);
        this.L = f90Var2;
        f90Var2.addTextChangedListener(new g90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.gd.N0(2131748703, null));
        f90 f90Var3 = this.L;
        int i14 = org.telegram.ui.ActionBar.m6.f29770y6;
        org.telegram.ui.ActionBar.t6.D(f90Var3, i14, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        f90 f90Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(f90Var4, i15, null);
        this.L.setTextSize(1, 16.0f);
        e90Var.addView(this.L, c8.ma.o(-1, 50));
        org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.M = a9Var5;
        a9Var5.setText(org.telegram.messenger.gd.N0(2131748704, null));
        e90Var.addView(this.M);
        if (i11 == 1) {
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.J = x9Var;
            org.telegram.ui.ActionBar.t6.h(i13, x9Var, null);
            this.J.b(org.telegram.messenger.gd.N0(2131745827, null), false);
            org.telegram.ui.ActionBar.t6.U(this.J.getTextView(), org.telegram.ui.ActionBar.m6.f29599p7, null);
            this.J.setOnClickListener(new j40(this, 5));
            e90Var.addView(this.J);
        }
        w8Var.addView(this.K, c8.ma.c(f10, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29321a7, frameLayout, getResourceProvider());
        new hi.o3(w8Var, false, new fi.e(19));
        w8Var.addView(this.I, c8.ma.e(-1, -2, 80));
        org.telegram.ui.ActionBar.t6.h(i13, this.f49256y, null);
        org.telegram.ui.ActionBar.t6.h(i13, this.d, null);
        org.telegram.ui.ActionBar.t6.h(i13, this.f49255x, null);
        org.telegram.ui.ActionBar.t6.h(i13, this.F, null);
        org.telegram.ui.ActionBar.t6.h(i13, this.f49248c, null);
        org.telegram.ui.ActionBar.t6.h(i13, this.G, null);
        org.telegram.ui.ActionBar.t6.h(i13, this.L, null);
        org.telegram.ui.ActionBar.t6.U(this.G, i15, null);
        org.telegram.ui.ActionBar.t6.D(this.G, i14, null);
        org.telegram.ui.ActionBar.t6.U(this.f49255x, i15, null);
        org.telegram.ui.ActionBar.t6.D(this.f49255x, i14, null);
        this.G.setCursorVisible(false);
        d0(this.f49249e);
        w8Var.setClipChildren(false);
        this.K.setClipChildren(false);
        e90Var.setClipChildren(false);
        return w8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        this.f49249e = tL_chatInviteExported;
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
            h90 h90Var = this.f49250f;
            if (h90Var != null) {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, h90Var, null);
                this.f49250f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.j6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
                this.L.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.s8 s8Var = this.f49251n;
            if (s8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                s8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                h90 h90Var2 = this.f49250f;
                if (h90Var2 != null) {
                    h90Var2.setChecked(false);
                    this.f49250f.setCheckBoxIcon(2131232515);
                }
                org.telegram.ui.Cells.a9 a9Var = this.h;
                if (a9Var != null) {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131754198, null));
                }
            }
            i90 i90Var = this.f49252r;
            if (i90Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                i90Var.setVisibility(i7);
                this.f49252r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f49252r.d.setClickable(false);
                this.f49252r.d.setFocusable(false);
                this.f49252r.d.setFocusableInTouchMode(false);
                this.f49252r.d.setLongClickable(false);
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
        org.telegram.ui.Components.hu0 hu0Var = this.f49248c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hu0Var.setVisibility(i10);
        f90 f90Var = this.G;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        f90Var.setVisibility(i11);
        org.telegram.ui.Cells.a9 a9Var = this.H;
        if (z10) {
            i12 = 0;
        }
        a9Var.setVisibility(i12);
    }

    @Override
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override
    public final org.telegram.ui.Components.wm0 getScrollViewForSimpleGlass() {
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
