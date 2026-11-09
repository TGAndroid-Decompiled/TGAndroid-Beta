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
public final class j90 extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Cells.z8 D;
    public org.telegram.ui.Cells.n4 E;
    public e90 F;
    public org.telegram.ui.Cells.z8 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.w9 I;
    public org.telegram.ui.Components.im0 J;
    public e90 K;
    public org.telegram.ui.Cells.z8 L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final int[] P;
    public final ArrayList Q;
    public final int[] R;
    public i90 S;
    public org.telegram.ui.ActionBar.u1 T;
    public boolean U;
    public int V;
    public final int f46886a;
    public final long f46887b;
    public org.telegram.ui.Components.xt0 f46888c;
    public org.telegram.ui.Components.xt0 d;
    public TLRPC.TL_chatInviteExported f46889e;
    public g90 f46890f;
    public org.telegram.ui.Cells.z8 h;
    public org.telegram.ui.Cells.r8 f46891n;
    public h90 f46892r;
    public TextView f46893s;
    public org.telegram.ui.Cells.z8 f46894w;
    public TextView f46895x;
    public org.telegram.ui.Cells.n4 f46896y;

    public j90(int i7, long j3) {
        super(null);
        this.M = -3;
        this.O = new ArrayList();
        this.P = new int[]{3600, 86400, 604800};
        this.Q = new ArrayList();
        this.R = new int[]{1, 10, 100};
        this.f46886a = i7;
        this.f46887b = j3;
    }

    public final void a0(int i7) {
        int[] iArr;
        long j3 = i7;
        this.f46895x.setText(org.telegram.messenger.id.s(j3, false));
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
                strArr[i13] = org.telegram.messenger.id.M0(2131748202, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.id.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.id.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.id.G(1, "Weeks", new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i13] = org.telegram.messenger.id.M0(2131748531, null);
                } else if (j10 < 31449600) {
                    strArr[i13] = org.telegram.messenger.id.E0().w0().format(1000 * j3);
                } else {
                    strArr[i13] = org.telegram.messenger.id.E0().C0().format(1000 * j3);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
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
                strArr[i14] = org.telegram.messenger.id.M0(2131748202, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.f46888c.b(i12, null, strArr);
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
                this.f46888c.b(3, null, "1", "10", "100", org.telegram.messenger.id.M0(2131748202, null));
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
        int i11 = this.f46886a;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748272, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751277, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 11));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (i11 == 0) {
            i7 = 2131751753;
        } else {
            i7 = 2131745946;
        }
        y4Var.o(org.telegram.messenger.id.M0(i7, null));
        d90 d90Var = new d90(this, context);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, d90Var, this.resourceProvider, true);
        this.J = im0Var;
        im0Var.setDrawBackground(true);
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
        d90Var.setLayoutTransition(layoutTransition);
        d90Var.setOrientation(1);
        d90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.J.addView(d90Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.f46896y = n4Var;
        n4Var.setText(org.telegram.messenger.id.M0(2131748982, null));
        d90Var.addView(this.f46896y);
        org.telegram.ui.Components.xt0 xt0Var = new org.telegram.ui.Components.xt0(context, null);
        this.d = xt0Var;
        d90Var.addView(xt0Var);
        TextView textView = new TextView(context);
        this.f46895x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.f46895x.setGravity(16);
        this.f46895x.setTextSize(1, 16.0f);
        this.f46895x.setHint(org.telegram.messenger.id.M0(2131744139, null));
        this.f46895x.setOnClickListener(new org.telegram.ui.Components.u41(21, this, context));
        this.d.setCallback(new z80(this, 2));
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
        this.d.b(3, null, org.telegram.messenger.id.G(1, "Hours", new Object[0]), org.telegram.messenger.id.G(1, "Days", new Object[0]), org.telegram.messenger.id.G(1, "Weeks", new Object[0]), org.telegram.messenger.id.M0(2131748202, null));
        d90Var.addView(this.f46895x, c8.ha.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.D = z8Var;
        z8Var.setText(org.telegram.messenger.id.M0(2131744140, null));
        d90Var.addView(this.D);
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
        this.E = n4Var2;
        n4Var2.setText(org.telegram.messenger.id.M0(2131748980, null));
        d90Var.addView(this.E);
        org.telegram.ui.Components.xt0 xt0Var2 = new org.telegram.ui.Components.xt0(context, null);
        this.f46888c = xt0Var2;
        xt0Var2.setCallback(new z80(this, 3));
        c0();
        d90Var.addView(this.f46888c);
        e90 e90Var = new e90(context, 0);
        this.F = e90Var;
        e90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(org.telegram.messenger.id.M0(2131743620, null));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new f90(this, 0));
        d90Var.addView(this.F, c8.ha.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.G = z8Var2;
        z8Var2.setText(org.telegram.messenger.id.M0(2131743621, null));
        d90Var.addView(this.G);
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f46887b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.t0(M0) && !M0.join_request && !M0.join_to_send) {
            z9 = true;
        } else {
            z9 = false;
        }
        ?? r8Var = new org.telegram.ui.Cells.r8(context);
        this.f46890f = r8Var;
        int i13 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.s6.h(i13, r8Var, null);
        this.f46890f.setTag(Integer.valueOf(i13));
        this.f46890f.f(org.telegram.messenger.id.M0(2131754207, null), false, false);
        this.f46890f.setOnClickListener(new di.a2(6, this, z9));
        d90Var.addView(this.f46890f, c8.ha.o(-1, 56));
        org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.h = z8Var3;
        if (z9) {
            this.f46890f.setCheckBoxIcon(2131232513);
            this.h.setText(org.telegram.messenger.id.M0(2131754181, null));
        } else {
            z8Var3.setText(org.telegram.messenger.id.M0(2131754202, null));
        }
        d90Var.addView(this.h);
        if (M0 == null || M0.username == null) {
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.currentAccount).N0(j3);
            if ((this.f46889e == null && org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j3))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.f46889e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
                this.f46891n = r8Var2;
                org.telegram.ui.ActionBar.s6.h(i13, r8Var2, null);
                this.f46891n.setDrawCheckRipple(true);
                this.f46891n.f(org.telegram.messenger.id.M0(2131746159, null), false, true);
                if (this.f46889e != null) {
                    this.f46891n.setCheckBoxIcon(2131232513);
                    this.f46891n.setEnabled(false);
                }
                this.f46891n.setOnClickListener(new org.telegram.ui.Components.u41(22, this, new Runnable[1]));
                d90Var.addView(this.f46891n, c8.ha.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.f46893s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(this.f46893s, org.telegram.ui.ActionBar.l6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = 2131746153;
                } else {
                    i10 = 2131746154;
                }
                h90 h90Var = new h90(this, context, org.telegram.messenger.id.M0(i10, null), this.resourceProvider);
                this.f46892r = h90Var;
                h90Var.d.setInputType(2);
                this.f46892r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.s6.h(i13, this.f46892r, getResourceProvider());
                h90 h90Var2 = this.f46892r;
                h90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(h90Var2, 4);
                org.telegram.ui.Cells.i3 i3Var = h90Var2.d;
                i3Var.setImeOptions(6);
                i3Var.setOnEditorActionListener(new m.s2(fVar, 2));
                this.f46892r.addView(this.f46893s, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                h90 h90Var3 = this.f46892r;
                Drawable mutate = getParentActivity().getResources().getDrawable(2131232752).mutate();
                h90Var3.getClass();
                ImageView imageView = new ImageView(h90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                h90Var3.addView(imageView, c8.ha.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.i3 i3Var2 = h90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                i3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                d90Var.addView(this.f46892r, c8.ha.o(-1, 48));
                this.f46892r.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
                this.f46894w = z8Var4;
                if (this.f46889e != null) {
                    z8Var4.setText(org.telegram.messenger.id.M0(2131746157, null));
                } else {
                    z8Var4.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.id.M0(2131746158, null), new c90(this, 0)));
                }
                d90Var.addView(this.f46894w, c8.ha.o(-1, -2));
            }
        }
        e90 e90Var2 = new e90(context, 1);
        this.K = e90Var2;
        e90Var2.addTextChangedListener(new f90(this, 1));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(org.telegram.messenger.id.M0(2131748896, null));
        e90 e90Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.l6.f28257y6;
        org.telegram.ui.ActionBar.s6.D(e90Var3, i14, null);
        this.K.setLines(1);
        this.K.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.K.setSingleLine();
        e90 e90Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(e90Var4, i15, null);
        this.K.setTextSize(1, 16.0f);
        d90Var.addView(this.K, c8.ha.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.L = z8Var5;
        z8Var5.setText(org.telegram.messenger.id.M0(2131748897, null));
        d90Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.I = w9Var;
            org.telegram.ui.ActionBar.s6.h(i13, w9Var, null);
            this.I.b(org.telegram.messenger.id.M0(2131746023, null), false);
            org.telegram.ui.ActionBar.s6.U(this.I.getTextView(), org.telegram.ui.ActionBar.l6.f28086p7, null);
            this.I.setOnClickListener(new i40(this, 5));
            d90Var.addView(this.I);
        }
        v8Var.addView(this.J, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, frameLayout, getResourceProvider());
        new fi.q3(v8Var, false, new di.e(18));
        v8Var.addView(this.H, c8.ha.e(-1, -2, 80));
        org.telegram.ui.ActionBar.s6.h(i13, this.f46896y, null);
        org.telegram.ui.ActionBar.s6.h(i13, this.d, null);
        org.telegram.ui.ActionBar.s6.h(i13, this.f46895x, null);
        org.telegram.ui.ActionBar.s6.h(i13, this.E, null);
        org.telegram.ui.ActionBar.s6.h(i13, this.f46888c, null);
        org.telegram.ui.ActionBar.s6.h(i13, this.F, null);
        org.telegram.ui.ActionBar.s6.h(i13, this.K, null);
        org.telegram.ui.ActionBar.s6.U(this.F, i15, null);
        org.telegram.ui.ActionBar.s6.D(this.F, i14, null);
        org.telegram.ui.ActionBar.s6.U(this.f46895x, i15, null);
        org.telegram.ui.ActionBar.s6.D(this.f46895x, i14, null);
        this.F.setCursorVisible(false);
        d0(this.f46889e);
        v8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        d90Var.setClipChildren(false);
        return v8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        this.f46889e = tL_chatInviteExported;
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
            g90 g90Var = this.f46890f;
            if (g90Var != null) {
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, g90Var, null);
                this.f46890f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z9 = true;
            e0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                org.telegram.messenger.i6.l(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.r8 r8Var = this.f46891n;
            if (r8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z9 = false;
                }
                r8Var.setChecked(z9);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                g90 g90Var2 = this.f46890f;
                if (g90Var2 != null) {
                    g90Var2.setChecked(false);
                    this.f46890f.setCheckBoxIcon(2131232513);
                }
                org.telegram.ui.Cells.z8 z8Var = this.h;
                if (z8Var != null) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131754201, null));
                }
            }
            h90 h90Var = this.f46892r;
            if (h90Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                h90Var.setVisibility(i7);
                this.f46892r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f46892r.d.setClickable(false);
                this.f46892r.d.setFocusable(false);
                this.f46892r.d.setFocusableInTouchMode(false);
                this.f46892r.d.setLongClickable(false);
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
        org.telegram.ui.Components.xt0 xt0Var = this.f46888c;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        xt0Var.setVisibility(i10);
        e90 e90Var = this.F;
        if (z9) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        e90Var.setVisibility(i11);
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
    public final org.telegram.ui.Components.im0 getScrollViewForSimpleGlass() {
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
