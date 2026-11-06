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
public final class h90 extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Cells.z8 D;
    public org.telegram.ui.Cells.n4 E;
    public c90 F;
    public org.telegram.ui.Cells.z8 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.w9 I;
    public org.telegram.ui.Components.hm0 J;
    public c90 K;
    public org.telegram.ui.Cells.z8 L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final int[] P;
    public final ArrayList Q;
    public final int[] R;
    public g90 S;
    public org.telegram.ui.ActionBar.u1 T;
    public boolean U;
    public int V;
    public final int f46296a;
    public final long f46297b;
    public org.telegram.ui.Components.vt0 f46298c;
    public org.telegram.ui.Components.vt0 d;
    public TLRPC.TL_chatInviteExported f46299e;
    public e90 f46300f;
    public org.telegram.ui.Cells.z8 h;
    public org.telegram.ui.Cells.r8 f46301n;
    public f90 f46302r;
    public TextView f46303s;
    public org.telegram.ui.Cells.z8 f46304w;
    public TextView f46305x;
    public org.telegram.ui.Cells.n4 f46306y;

    public h90(int i7, long j3) {
        super(null);
        this.M = -3;
        this.O = new ArrayList();
        this.P = new int[]{3600, 86400, 604800};
        this.Q = new ArrayList();
        this.R = new int[]{1, 10, 100};
        this.f46296a = i7;
        this.f46297b = j3;
    }

    public final void a0(int i7) {
        int[] iArr;
        long j3 = i7;
        this.f46305x.setText(org.telegram.messenger.hd.s(j3, false));
        int currentTime = i7 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            iArr = this.P;
            if (i10 >= iArr.length) {
                break;
            }
            if (!z9 && currentTime < iArr[i10]) {
                arrayList.add(Integer.valueOf(currentTime));
                i11 = i10;
                z9 = true;
            }
            i10 = com.google.android.recaptcha.internal.a.f(iArr[i10], i10, 1, arrayList);
        }
        if (!z9) {
            arrayList.add(Integer.valueOf(currentTime));
            i11 = iArr.length;
        }
        int size = arrayList.size();
        int i12 = size + 1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == size) {
                strArr[i13] = org.telegram.messenger.hd.M0(2131748201, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Weeks", new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i13] = org.telegram.messenger.hd.M0(2131748530, null);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    public final void b0(int i7) {
        int[] iArr;
        int i10;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        while (true) {
            iArr = this.R;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z9 && i7 <= (i10 = iArr[i11])) {
                if (i7 != i10) {
                    arrayList.add(Integer.valueOf(i7));
                }
                i12 = i11;
                z9 = true;
            }
            i11 = com.google.android.recaptcha.internal.a.f(iArr[i11], i11, 1, arrayList);
        }
        if (!z9) {
            arrayList.add(Integer.valueOf(i7));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.hd.M0(2131748201, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.f46298c.b(i12, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            int[] iArr = this.R;
            if (i7 < iArr.length) {
                i7 = com.google.android.recaptcha.internal.a.f(iArr[i7], i7, 1, arrayList);
            } else {
                this.f46298c.b(3, null, "1", "10", "100", org.telegram.messenger.hd.M0(2131748201, null));
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        boolean z9;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i11 = this.f46296a;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748271, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751278, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 11));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (i11 == 0) {
            i7 = 2131751753;
        } else {
            i7 = 2131745947;
        }
        y4Var.n(org.telegram.messenger.hd.M0(i7, null));
        b90 b90Var = new b90(this, context);
        org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(context, b90Var, this.resourceProvider, true);
        this.J = hm0Var;
        hm0Var.setDrawBackground(true);
        this.J.setOverScrollMode(0);
        v8 v8Var = new v8(6, context, this);
        this.fragmentView = v8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        layoutTransition.setInterpolator(2, xqVar);
        layoutTransition.setInterpolator(0, xqVar);
        layoutTransition.setInterpolator(4, xqVar);
        layoutTransition.setInterpolator(1, xqVar);
        layoutTransition.setInterpolator(3, xqVar);
        b90Var.setLayoutTransition(layoutTransition);
        b90Var.setOrientation(1);
        b90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.J.addView(b90Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.f46306y = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131748981, null));
        b90Var.addView(this.f46306y);
        org.telegram.ui.Components.vt0 vt0Var = new org.telegram.ui.Components.vt0(context, null);
        this.d = vt0Var;
        b90Var.addView(vt0Var);
        TextView textView = new TextView(context);
        this.f46305x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.f46305x.setGravity(16);
        this.f46305x.setTextSize(1, 16.0f);
        this.f46305x.setHint(org.telegram.messenger.hd.M0(2131744140, null));
        this.f46305x.setOnClickListener(new org.telegram.ui.Components.s41(21, this, context));
        this.d.setCallback(new x80(this, 2));
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = com.google.android.recaptcha.internal.a.f(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.hd.G(1, "Hours", new Object[0]), org.telegram.messenger.hd.G(1, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.M0(2131748201, null));
        b90Var.addView(this.f46305x, c8.ha.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.D = z8Var;
        z8Var.setText(org.telegram.messenger.hd.M0(2131744141, null));
        b90Var.addView(this.D);
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
        this.E = n4Var2;
        n4Var2.setText(org.telegram.messenger.hd.M0(2131748979, null));
        b90Var.addView(this.E);
        org.telegram.ui.Components.vt0 vt0Var2 = new org.telegram.ui.Components.vt0(context, null);
        this.f46298c = vt0Var2;
        vt0Var2.setCallback(new x80(this, 3));
        c0();
        b90Var.addView(this.f46298c);
        c90 c90Var = new c90(context, 0);
        this.F = c90Var;
        c90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(org.telegram.messenger.hd.M0(2131743621, null));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new d90(this, 0));
        b90Var.addView(this.F, c8.ha.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.G = z8Var2;
        z8Var2.setText(org.telegram.messenger.hd.M0(2131743622, null));
        b90Var.addView(this.G);
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f46297b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.t0(M0) && !M0.join_request && !M0.join_to_send) {
            z9 = true;
        } else {
            z9 = false;
        }
        ?? r8Var = new org.telegram.ui.Cells.r8(context);
        this.f46300f = r8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27848d6;
        org.telegram.ui.ActionBar.r6.i(i13, r8Var, null);
        this.f46300f.setTag(Integer.valueOf(i13));
        this.f46300f.f(org.telegram.messenger.hd.M0(2131754207, null), false, false);
        this.f46300f.setOnClickListener(new di.a2(6, this, z9));
        b90Var.addView(this.f46300f, c8.ha.o(-1, 56));
        org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.h = z8Var3;
        if (z9) {
            this.f46300f.setCheckBoxIcon(2131232513);
            this.h.setText(org.telegram.messenger.hd.M0(2131754181, null));
        } else {
            z8Var3.setText(org.telegram.messenger.hd.M0(2131754202, null));
        }
        b90Var.addView(this.h);
        if (M0 == null || M0.username == null) {
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.currentAccount).N0(j3);
            if ((this.f46299e == null && org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j3))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.f46299e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
                this.f46301n = r8Var2;
                org.telegram.ui.ActionBar.r6.i(i13, r8Var2, null);
                this.f46301n.setDrawCheckRipple(true);
                this.f46301n.f(org.telegram.messenger.hd.M0(2131746160, null), false, true);
                if (this.f46299e != null) {
                    this.f46301n.setCheckBoxIcon(2131232513);
                    this.f46301n.setEnabled(false);
                }
                this.f46301n.setOnClickListener(new org.telegram.ui.Components.s41(22, this, new Runnable[1]));
                b90Var.addView(this.f46301n, c8.ha.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f46303s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(this.f46303s, org.telegram.ui.ActionBar.k6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = 2131746154;
                } else {
                    i10 = 2131746155;
                }
                f90 f90Var = new f90(this, context, org.telegram.messenger.hd.M0(i10, null), this.resourceProvider);
                this.f46302r = f90Var;
                f90Var.d.setInputType(2);
                this.f46302r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.r6.i(i13, this.f46302r, getResourceProvider());
                f90 f90Var2 = this.f46302r;
                f90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(f90Var2, 4);
                org.telegram.ui.Cells.i3 i3Var = f90Var2.d;
                i3Var.setImeOptions(6);
                i3Var.setOnEditorActionListener(new m.s2(fVar, 2));
                this.f46302r.addView(this.f46303s, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                f90 f90Var3 = this.f46302r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232752).mutate();
                f90Var3.getClass();
                ImageView imageView = new ImageView(f90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                f90Var3.addView(imageView, c8.ha.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.i3 i3Var2 = f90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                i3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                b90Var.addView(this.f46302r, c8.ha.o(-1, 48));
                this.f46302r.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
                this.f46304w = z8Var4;
                if (this.f46299e != null) {
                    z8Var4.setText(org.telegram.messenger.hd.M0(2131746158, null));
                } else {
                    z8Var4.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.hd.M0(2131746159, null), new a90(this, 0)));
                }
                b90Var.addView(this.f46304w, c8.ha.o(-1, -2));
            }
        }
        c90 c90Var2 = new c90(context, 1);
        this.K = c90Var2;
        c90Var2.addTextChangedListener(new d90(this, 1));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(org.telegram.messenger.hd.M0(2131748895, null));
        c90 c90Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.k6.f28240y6;
        org.telegram.ui.ActionBar.r6.E(c90Var3, i14, null);
        this.K.setLines(1);
        this.K.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.K.setSingleLine();
        c90 c90Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(c90Var4, i15, null);
        this.K.setTextSize(1, 16.0f);
        b90Var.addView(this.K, c8.ha.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.L = z8Var5;
        z8Var5.setText(org.telegram.messenger.hd.M0(2131748896, null));
        b90Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.I = w9Var;
            org.telegram.ui.ActionBar.r6.i(i13, w9Var, null);
            this.I.b(org.telegram.messenger.hd.M0(2131746024, null), false);
            org.telegram.ui.ActionBar.r6.V(this.I.getTextView(), org.telegram.ui.ActionBar.k6.f28069p7, null);
            this.I.setOnClickListener(new g40(this, 5));
            b90Var.addView(this.I);
        }
        v8Var.addView(this.J, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, frameLayout, getResourceProvider());
        new fi.q3(v8Var, false, new di.e(19));
        v8Var.addView(this.H, c8.ha.e(-1, -2, 80));
        org.telegram.ui.ActionBar.r6.i(i13, this.f46306y, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.d, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.f46305x, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.E, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.f46298c, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.F, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.K, null);
        org.telegram.ui.ActionBar.r6.V(this.F, i15, null);
        org.telegram.ui.ActionBar.r6.E(this.F, i14, null);
        org.telegram.ui.ActionBar.r6.V(this.f46305x, i15, null);
        org.telegram.ui.ActionBar.r6.E(this.f46305x, i14, null);
        this.F.setCursorVisible(false);
        d0(this.f46299e);
        v8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        b90Var.setClipChildren(false);
        return v8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        this.f46299e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i10 = tL_chatInviteExported.expire_date;
            if (i10 > 0) {
                a0(i10);
                this.V = ((Integer) this.O.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.V = 0;
            }
            int i11 = tL_chatInviteExported.usage_limit;
            if (i11 > 0) {
                b0(i11);
                this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            e90 e90Var = this.f46300f;
            if (e90Var != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, e90Var, null);
                this.f46300f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z9 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.i6.l(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.r8 r8Var = this.f46301n;
            if (r8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z9 = false;
                }
                r8Var.setChecked(z9);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                e90 e90Var2 = this.f46300f;
                if (e90Var2 != null) {
                    e90Var2.setChecked(false);
                    this.f46300f.setCheckBoxIcon(2131232513);
                }
                org.telegram.ui.Cells.z8 z8Var = this.h;
                if (z8Var != null) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131754201, null));
                }
            }
            f90 f90Var = this.f46302r;
            if (f90Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                f90Var.setVisibility(i7);
                this.f46302r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f46302r.d.setClickable(false);
                this.f46302r.d.setFocusable(false);
                this.f46302r.d.setFocusableInTouchMode(false);
                this.f46302r.d.setLongClickable(false);
            }
        }
    }

    public final void e0(boolean z9) {
        int i7;
        int i10;
        int i11;
        org.telegram.ui.Cells.n4 n4Var = this.E;
        int i12 = 8;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        n4Var.setVisibility(i7);
        org.telegram.ui.Components.vt0 vt0Var = this.f46298c;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        vt0Var.setVisibility(i10);
        c90 c90Var = this.F;
        if (z9) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c90Var.setVisibility(i11);
        org.telegram.ui.Cells.z8 z8Var = this.G;
        if (z9) {
            i12 = 0;
        }
        z8Var.setVisibility(i12);
    }

    @Override
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
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
