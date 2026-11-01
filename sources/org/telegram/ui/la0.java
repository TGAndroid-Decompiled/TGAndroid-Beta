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
public final class la0 extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Cells.b9 D;
    public org.telegram.ui.Cells.p4 E;
    public ga0 F;
    public org.telegram.ui.Cells.b9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.x9 I;
    public org.telegram.ui.Components.jn0 J;
    public ga0 K;
    public org.telegram.ui.Cells.b9 L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final int[] P;
    public final ArrayList Q;
    public final int[] R;
    public ka0 S;
    public org.telegram.ui.ActionBar.x1 T;
    public boolean U;
    public int V;
    public final int f39167a;
    public final long f39168b;
    public org.telegram.ui.Components.zu0 f39169c;
    public org.telegram.ui.Components.zu0 d;
    public TLRPC.TL_chatInviteExported e;
    public ia0 f39170f;
    public org.telegram.ui.Cells.b9 h;
    public org.telegram.ui.Cells.t8 f39171n;
    public ja0 f39172r;
    public TextView f39173s;
    public org.telegram.ui.Cells.b9 f39174w;
    public TextView f39175x;
    public org.telegram.ui.Cells.p4 f39176y;

    public la0(int i10, long j10) {
        super(null);
        this.M = -3;
        this.O = new ArrayList();
        this.P = new int[]{3600, 86400, 604800};
        this.Q = new ArrayList();
        this.R = new int[]{1, 10, 100};
        this.f39167a = i10;
        this.f39168b = j10;
    }

    public final void a0(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f39175x.setText(org.telegram.messenger.dd.s(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.P;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = c3.i0.j(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.dd.L0(2131748219, null);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = org.telegram.messenger.dd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = org.telegram.messenger.dd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = org.telegram.messenger.dd.G(1, "Weeks", new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i14] = org.telegram.messenger.dd.L0(2131748546, null);
                } else if (j11 < 31449600) {
                    strArr[i14] = org.telegram.messenger.dd.D0().v0().format(1000 * j10);
                } else {
                    strArr[i14] = org.telegram.messenger.dd.D0().B0().format(1000 * j10);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
    }

    public final void b0(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.R;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = c3.i0.j(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = org.telegram.messenger.dd.L0(2131748219, null);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.f39169c.b(i13, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.R;
            if (i10 < iArr.length) {
                i10 = c3.i0.j(iArr[i10], i10, 1, arrayList);
            } else {
                this.f39169c.b(3, null, "1", "10", "100", org.telegram.messenger.dd.L0(2131748219, null));
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i12 = this.f39167a;
        if (i12 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131748289, null));
        } else if (i12 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751278, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 2));
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i12 == 0) {
            i10 = 2131751753;
        } else {
            i10 = 2131745963;
        }
        i5Var.n(org.telegram.messenger.dd.L0(i10, null));
        fa0 fa0Var = new fa0(this, context);
        org.telegram.ui.Components.jn0 jn0Var = new org.telegram.ui.Components.jn0(context, fa0Var, this.resourceProvider, true);
        this.J = jn0Var;
        jn0Var.setDrawBackground(true);
        this.J.setOverScrollMode(0);
        w8 w8Var = new w8(this, context, 6);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(4, grVar);
        layoutTransition.setInterpolator(1, grVar);
        layoutTransition.setInterpolator(3, grVar);
        fa0Var.setLayoutTransition(layoutTransition);
        fa0Var.setOrientation(1);
        fa0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(91.0f));
        this.J.addView(fa0Var);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        this.f39176y = p4Var;
        p4Var.setText(org.telegram.messenger.dd.L0(2131748992, null));
        fa0Var.addView(this.f39176y);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, null);
        this.d = zu0Var;
        fa0Var.addView(zu0Var);
        TextView textView = new TextView(context);
        this.f39175x = textView;
        textView.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.f39175x.setGravity(16);
        this.f39175x.setTextSize(1, 16.0f);
        this.f39175x.setHint(org.telegram.messenger.dd.L0(2131744164, null));
        this.f39175x.setOnClickListener(new vu(14, this, context));
        this.d.setCallback(new ba0(this, 2));
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = c3.i0.j(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.dd.G(1, "Hours", new Object[0]), org.telegram.messenger.dd.G(1, "Days", new Object[0]), org.telegram.messenger.dd.G(1, "Weeks", new Object[0]), org.telegram.messenger.dd.L0(2131748219, null));
        fa0Var.addView(this.f39175x, w7.b6.o(-1, 50));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.D = b9Var;
        b9Var.setText(org.telegram.messenger.dd.L0(2131744165, null));
        fa0Var.addView(this.D);
        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context);
        this.E = p4Var2;
        p4Var2.setText(org.telegram.messenger.dd.L0(2131748990, null));
        fa0Var.addView(this.E);
        org.telegram.ui.Components.zu0 zu0Var2 = new org.telegram.ui.Components.zu0(context, null);
        this.f39169c = zu0Var2;
        zu0Var2.setCallback(new ba0(this, 3));
        c0();
        fa0Var.addView(this.f39169c);
        ga0 ga0Var = new ga0(context, 0);
        this.F = ga0Var;
        ga0Var.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(org.telegram.messenger.dd.L0(2131743646, null));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new ha0(this, 0));
        fa0Var.addView(this.F, w7.b6.o(-1, 50));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.G = b9Var2;
        b9Var2.setText(org.telegram.messenger.dd.L0(2131743647, null));
        fa0Var.addView(this.G);
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.f39168b;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (org.telegram.messenger.w3.t0(L0) && !L0.join_request && !L0.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? t8Var = new org.telegram.ui.Cells.t8(context);
        this.f39170f = t8Var;
        int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i14, t8Var, null);
        this.f39170f.setTag(Integer.valueOf(i14));
        this.f39170f.f(org.telegram.messenger.dd.L0(2131754207, null), false, false);
        this.f39170f.setOnClickListener(new org.telegram.ui.ActionBar.c0(5, this, z10));
        fa0Var.addView(this.f39170f, w7.b6.o(-1, 56));
        org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.h = b9Var3;
        if (z10) {
            this.f39170f.setCheckBoxIcon(2131232512);
            this.h.setText(org.telegram.messenger.dd.L0(2131754181, null));
        } else {
            b9Var3.setText(org.telegram.messenger.dd.L0(2131754202, null));
        }
        fa0Var.addView(this.h);
        if (L0 == null || L0.username == null) {
            TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(this.currentAccount).M0(j10);
            if ((this.e == null && org.telegram.messenger.w3.V(org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(j10))) && M0 != null && M0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context);
                this.f39171n = t8Var2;
                org.telegram.ui.ActionBar.a7.i(i14, t8Var2, null);
                this.f39171n.setDrawCheckRipple(true);
                this.f39171n.f(org.telegram.messenger.dd.L0(2131746176, null), false, true);
                if (this.e != null) {
                    this.f39171n.setCheckBoxIcon(2131232512);
                    this.f39171n.setEnabled(false);
                }
                this.f39171n.setOnClickListener(new vu(15, this, new Runnable[1]));
                fa0Var.addView(this.f39171n, w7.b6.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f39173s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(this.f39173s, org.telegram.ui.ActionBar.t6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i11 = 2131746170;
                } else {
                    i11 = 2131746171;
                }
                ja0 ja0Var = new ja0(this, context, org.telegram.messenger.dd.L0(i11, null), this.resourceProvider);
                this.f39172r = ja0Var;
                ja0Var.d.setInputType(2);
                this.f39172r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.a7.i(i14, this.f39172r, getResourceProvider());
                ja0 ja0Var2 = this.f39172r;
                ja0Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(ja0Var2, 4);
                org.telegram.ui.Cells.k3 k3Var = ja0Var2.d;
                k3Var.setImeOptions(6);
                k3Var.setOnEditorActionListener(new m.s2(fVar, 2));
                this.f39172r.addView(this.f39173s, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                ja0 ja0Var3 = this.f39172r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232749).mutate();
                ja0Var3.getClass();
                ImageView imageView = new ImageView(ja0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                ja0Var3.addView(imageView, w7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.k3 k3Var2 = ja0Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.i0.L(24.0f);
                k3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.i0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.i0.L(1.0f));
                fa0Var.addView(this.f39172r, w7.b6.o(-1, 48));
                this.f39172r.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
                this.f39174w = b9Var4;
                if (this.e != null) {
                    b9Var4.setText(org.telegram.messenger.dd.L0(2131746174, null));
                } else {
                    b9Var4.setText(org.telegram.messenger.i0.c4(org.telegram.messenger.dd.L0(2131746175, null), new ea0(this, 0)));
                }
                fa0Var.addView(this.f39174w, w7.b6.o(-1, -2));
            }
        }
        ga0 ga0Var2 = new ga0(context, 1);
        this.K = ga0Var2;
        ga0Var2.addTextChangedListener(new ha0(this, 1));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(org.telegram.messenger.dd.L0(2131748906, null));
        ga0 ga0Var3 = this.K;
        int i15 = org.telegram.ui.ActionBar.t6.f21312y6;
        org.telegram.ui.ActionBar.a7.E(ga0Var3, i15, null);
        this.K.setLines(1);
        this.K.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.K.setSingleLine();
        ga0 ga0Var4 = this.K;
        int i16 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(ga0Var4, i16, null);
        this.K.setTextSize(1, 16.0f);
        fa0Var.addView(this.K, w7.b6.o(-1, 50));
        org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.L = b9Var5;
        b9Var5.setText(org.telegram.messenger.dd.L0(2131748907, null));
        fa0Var.addView(this.L);
        if (i12 == 1) {
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.I = x9Var;
            org.telegram.ui.ActionBar.a7.i(i14, x9Var, null);
            this.I.b(org.telegram.messenger.dd.L0(2131746040, null), false);
            org.telegram.ui.ActionBar.a7.V(this.I.getTextView(), org.telegram.ui.ActionBar.t6.f21154p7, null);
            this.I.setOnClickListener(new e50(this, 5));
            fa0Var.addView(this.I);
        }
        w8Var.addView(this.J, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, frameLayout, getResourceProvider());
        new vh.r2(w8Var, false, new ag.z0(16));
        w8Var.addView(this.H, w7.b6.e(-1, -2, 80));
        org.telegram.ui.ActionBar.a7.i(i14, this.f39176y, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.d, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.f39175x, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.E, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.f39169c, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.F, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.K, null);
        org.telegram.ui.ActionBar.a7.V(this.F, i16, null);
        org.telegram.ui.ActionBar.a7.E(this.F, i15, null);
        org.telegram.ui.ActionBar.a7.V(this.f39175x, i16, null);
        org.telegram.ui.ActionBar.a7.E(this.f39175x, i15, null);
        this.F.setCursorVisible(false);
        d0(this.e);
        w8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        fa0Var.setClipChildren(false);
        return w8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i11 = tL_chatInviteExported.expire_date;
            if (i11 > 0) {
                a0(i11);
                this.V = ((Integer) this.O.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.V = 0;
            }
            int i12 = tL_chatInviteExported.usage_limit;
            if (i12 > 0) {
                b0(i12);
                this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            ia0 ia0Var = this.f39170f;
            if (ia0Var != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, ia0Var, null);
                this.f39170f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.k6.l(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.t8 t8Var = this.f39171n;
            if (t8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                t8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                ia0 ia0Var2 = this.f39170f;
                if (ia0Var2 != null) {
                    ia0Var2.setChecked(false);
                    this.f39170f.setCheckBoxIcon(2131232512);
                }
                org.telegram.ui.Cells.b9 b9Var = this.h;
                if (b9Var != null) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131754201, null));
                }
            }
            ja0 ja0Var = this.f39172r;
            if (ja0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                ja0Var.setVisibility(i10);
                this.f39172r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f39172r.d.setClickable(false);
                this.f39172r.d.setFocusable(false);
                this.f39172r.d.setFocusableInTouchMode(false);
                this.f39172r.d.setLongClickable(false);
            }
        }
    }

    public final void e0(boolean z10) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.p4 p4Var = this.E;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        p4Var.setVisibility(i10);
        org.telegram.ui.Components.zu0 zu0Var = this.f39169c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        zu0Var.setVisibility(i11);
        ga0 ga0Var = this.F;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ga0Var.setVisibility(i12);
        org.telegram.ui.Cells.b9 b9Var = this.G;
        if (z10) {
            i13 = 0;
        }
        b9Var.setVisibility(i13);
    }

    @Override
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override
    public final org.telegram.ui.Components.jn0 getScrollViewForSimpleGlass() {
        return this.J;
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
