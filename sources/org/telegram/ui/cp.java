package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class cp extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.j80 G;
    public org.telegram.ui.Cells.p8 H;
    public org.telegram.ui.Cells.b9 I;
    public org.telegram.ui.Cells.c7 J;
    public bp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public la O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.p4 R;
    public org.telegram.ui.Cells.t8 S;
    public org.telegram.ui.Cells.b9 T;
    public yo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public uo f36496a;
    public boolean f36497a0;
    public org.telegram.ui.ActionBar.n0 f36498b;
    public boolean f36499b0;
    public EditTextBoldCursor f36500c;
    public boolean f36501c0;
    public org.telegram.ui.Cells.b9 d;
    public boolean f36502d0;
    public org.telegram.ui.Cells.p4 e;
    public org.telegram.ui.Cells.c7 f36503e0;
    public org.telegram.ui.Cells.p4 f36504f;
    public ArrayList f36505f0;
    public org.telegram.ui.Cells.v4 f36506g0;
    public wo h;
    public int f36507h0;
    public String f36508i0;
    public zg f36509j0;
    public boolean f36510k0;
    public TLRPC.TL_chatInviteExported f36511l0;
    public boolean m0;
    public org.telegram.ui.Components.hn0 f36512n;
    public boolean f36513n0;
    public HashMap f36514o0;
    public org.telegram.ui.Components.c60 f36515p0;
    public ro f36516q0;
    public org.telegram.ui.ActionBar.l5 f36517r;
    public Boolean f36518r0;
    public LinearLayout f36519s;
    public boolean f36520s0;
    public org.telegram.ui.Cells.l6 f36521w;
    public org.telegram.ui.Cells.l6 f36522x;
    public LinearLayout f36523y;

    public static org.telegram.ui.ActionBar.p6 Y(cp cpVar) {
        return cpVar.resourceProvider;
    }

    public final void a0() {
        boolean z10;
        org.telegram.ui.ActionBar.l5 l5Var = this.f36517r;
        if (!this.V && this.f36498b.length() <= 0) {
            ArrayList arrayList = this.N;
            z10 = false;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            l5Var.a(z10, true);
        }
        z10 = true;
        l5Var.a(z10, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21003h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20986g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21277w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
    }

    public final boolean b0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        zg zgVar = this.f36509j0;
        if (zgVar != null) {
            org.telegram.messenger.i0.r(zgVar);
            this.f36509j0 = null;
            this.f36508i0 = null;
            if (this.f36507h0 != 0) {
                getConnectionsManager().cancelRequest(this.f36507h0, true);
            }
        }
        this.f36510k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f36497a0) {
                            this.h.setText(org.telegram.messenger.cd.L0(2131748915, null));
                        } else {
                            this.h.setText(org.telegram.messenger.cd.L0(2131748914, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21153p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.cd.L0(2131748919, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21153p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.cd.L0(2131748919, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21153p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.cd.L0(2131748918, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21153p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.cd.L0(2131748932, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.F6);
            this.f36508i0 = str;
            zg zgVar2 = new zg(14, this, str);
            this.f36509j0 = zgVar2;
            org.telegram.messenger.i0.h3(zgVar2, 300L);
            return true;
        }
        if (this.f36497a0) {
            this.h.setText(org.telegram.messenger.cd.L0(2131748917, null));
        } else {
            this.h.setText(org.telegram.messenger.cd.L0(2131748916, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21153p7);
        return false;
    }

    public final void c0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(4, this, z10)), this.classGuid);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 26));
        this.f36517r = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        this.f36512n = new org.telegram.ui.Components.hn0(context);
        this.f36496a = new uo(this, context, this.f36512n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f36496a, w7.b6.g());
        this.fragmentView = frameLayout;
        this.f36496a.setFillViewport(true);
        this.f36496a.setDrawBackground(true);
        this.f36496a.setOverScrollMode(0);
        this.f36496a.addView(this.f36512n, new FrameLayout.LayoutParams(-1, -2));
        this.f36512n.setOrientation(1);
        boolean z11 = this.f36513n0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131743955, null));
        } else if (this.f36497a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749409, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36519s = linearLayout;
        linearLayout.setOrientation(1);
        this.f36512n.addView(this.f36519s, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
        this.f36504f = p4Var;
        p4Var.setHeight(46);
        if (this.f36497a0) {
            this.f36504f.setText(org.telegram.messenger.cd.L0(2131752275, null));
        } else {
            this.f36504f.setText(org.telegram.messenger.cd.L0(2131749400, null));
        }
        this.f36519s.addView(this.f36504f);
        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, false);
        this.f36522x = l6Var;
        if (this.f36497a0) {
            l6Var.b(org.telegram.messenger.cd.L0(2131752329, null), org.telegram.messenger.cd.L0(2131752328, null), false, this.V);
        } else {
            l6Var.b(org.telegram.messenger.cd.L0(2131748656, null), org.telegram.messenger.cd.L0(2131748655, null), false, this.V);
        }
        this.f36519s.addView(this.f36522x, w7.b6.o(-1, -2));
        this.f36522x.setOnClickListener(new to(this, 1));
        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, false);
        this.f36521w = l6Var2;
        if (this.f36497a0) {
            l6Var2.b(org.telegram.messenger.cd.L0(2131752318, null), org.telegram.messenger.cd.L0(2131752315, null), false, !this.V);
        } else {
            l6Var2.b(org.telegram.messenger.cd.L0(2131748653, null), org.telegram.messenger.cd.L0(2131748652, null), false, !this.V);
        }
        this.f36519s.addView(this.f36521w, w7.b6.o(-1, -2));
        this.f36521w.setOnClickListener(new to(this, 2));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.J = c7Var;
        this.f36512n.addView(c7Var, w7.b6.o(-1, -2));
        if (z11) {
            this.f36522x.setVisibility(8);
            this.f36521w.setVisibility(8);
            this.J.setVisibility(8);
            this.f36504f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f36512n.addView(this.D, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context, 23);
        this.e = p4Var2;
        this.D.addView(p4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, w7.b6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36500c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
        this.f36500c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36500c;
        int i13 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor2, i13, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f36500c;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor3, i14, null);
        this.f36500c.setMaxLines(1);
        this.f36500c.setLines(1);
        this.f36500c.setEnabled(false);
        this.f36500c.setBackground(null);
        this.f36500c.setPadding(0, 0, 0, 0);
        this.f36500c.setSingleLine(true);
        this.f36500c.setInputType(163840);
        this.f36500c.setImeOptions(6);
        this.E.addView(this.f36500c, w7.b6.o(-2, 36));
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 2);
        this.f36498b = n0Var;
        n0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f36498b, i13, null);
        org.telegram.ui.ActionBar.a7.V(this.f36498b, i14, null);
        this.f36498b.setMaxLines(1);
        this.f36498b.setLines(1);
        this.f36498b.setBackground(null);
        this.f36498b.setPadding(0, 0, 0, 0);
        this.f36498b.setSingleLine(true);
        this.f36498b.setInputType(163872);
        this.f36498b.setImeOptions(6);
        this.f36498b.setHint(org.telegram.messenger.cd.L0(2131752266, null));
        org.telegram.ui.ActionBar.a7.w(this.f36498b, i14, null);
        this.f36498b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f36498b.setCursorWidth(1.5f);
        this.E.addView(this.f36498b, w7.b6.o(-1, 36));
        this.f36498b.addTextChangedListener(new n0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.D.addView(this.F, w7.b6.o(-1, -2));
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, this, null, true, org.telegram.messenger.w3.T(this.X));
        this.G = j80Var;
        j80Var.setDelegate(new vo(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        wo woVar = new wo(this, context, this.resourceProvider);
        this.h = woVar;
        woVar.setBottomPadding(6);
        this.f36512n.addView(this.h, w7.b6.o(-2, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.d = b9Var;
        b9Var.setImportantForAccessibility(1);
        this.f36512n.addView(this.d, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
        this.f36506g0 = v4Var;
        this.f36512n.addView(v4Var, w7.b6.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f36523y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f36512n.addView(this.f36523y, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.f36503e0 = c7Var2;
        this.f36512n.addView(c7Var2, w7.b6.o(-1, -2));
        org.telegram.ui.Components.hn0 hn0Var = this.f36512n;
        bp bpVar = new bp(this, context);
        this.K = bpVar;
        hn0Var.addView(bpVar, w7.b6.o(-1, -2));
        bp bpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bpVar2.setVisibility(i10);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
        this.H = p8Var;
        p8Var.o(2131232203, org.telegram.messenger.cd.L0(2131748710, null), false);
        this.H.setOnClickListener(new to(this, 3));
        this.f36512n.addView(this.H, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.I = b9Var2;
        this.f36512n.addView(b9Var2, w7.b6.o(-1, -2));
        yo yoVar = new yo(this, context, this.X, context);
        this.U = yoVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f36497a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yoVar.c(z10);
        yo yoVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.b9 b9Var3 = yoVar2.e;
        boolean V = org.telegram.messenger.w3.V(yoVar2.f32652n);
        boolean t02 = org.telegram.messenger.w3.t0(yoVar2.f32652n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.o5.r(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).Z1(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i12 = 2131752301;
            } else if (t02) {
                i12 = 2131749411;
            } else {
                i12 = 2131749414;
            }
            b9Var3.setText(org.telegram.messenger.i0.P2(org.telegram.messenger.cd.a0(null, null, i12, str), org.telegram.ui.ActionBar.t6.Wl, null, new org.telegram.ui.Components.at(20, chatFull2, this), false));
        } else {
            if (V) {
                i11 = 2131752302;
            } else if (t02) {
                i11 = 2131749412;
            } else {
                i11 = 2131749415;
            }
            b9Var3.setText(org.telegram.messenger.cd.L0(i11, null));
        }
        this.f36512n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f36512n.addView(this.Q);
        org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context, 23);
        this.R = p4Var3;
        p4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.cd.L0(2131745880, null));
        this.Q.addView(this.R, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.S = t8Var;
        t8Var.f(org.telegram.messenger.cd.L0(2131746079, null), this.f36499b0, false);
        this.S.setOnClickListener(new to(this, 4));
        this.Q.addView(this.S, w7.b6.o(-1, -2));
        this.T = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        if (this.f36497a0 && !org.telegram.messenger.w3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.cd.L0(2131746078, null));
        } else {
            this.T.setText(org.telegram.messenger.cd.L0(2131746077, null));
        }
        this.Q.addView(this.T, w7.b6.o(-1, -2));
        String K = org.telegram.messenger.w3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.f36498b.setText(K);
            this.f36498b.setSelection(K.length());
            this.m0 = false;
        }
        g0();
        return this.fragmentView;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19794id == this.Z) {
                this.Y = chatFull;
                this.f36511l0 = chatFull.exported_invite;
                g0();
            }
        } else if (i10 == org.telegram.messenger.zs.f19726y1) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var != null && z4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(2, this.currentAccount, getParentActivity(), this, null);
        q0Var.f11237n2 = this.f36497a0;
        q0Var.f11249z2 = new ro(this, 0);
        showDialog(q0Var);
    }

    public final void f0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.f36516q0);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f36517r;
        if (l5Var != null) {
            l5Var.b(z10);
        }
    }

    public final void g0() {
        int i10;
        String L0;
        int i11;
        int i12;
        int L;
        String str;
        int i13;
        int i14;
        int i15;
        String L02;
        int i16;
        if (this.J == null) {
            return;
        }
        int i17 = 8;
        if (!this.V && !this.f36501c0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.cd.L0(2131752533, null));
            org.telegram.ui.Cells.b9 b9Var = this.d;
            int i18 = org.telegram.ui.ActionBar.t6.f21153p7;
            b9Var.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.a7.V(this.d.getTextView(), i18, null);
            this.D.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f36503e0.setVisibility(0);
            if (this.f36502d0) {
                this.f36506g0.setVisibility(0);
                this.f36523y.setVisibility(8);
            } else {
                this.f36506g0.setVisibility(8);
                this.f36523y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var2 = this.d;
            int i19 = org.telegram.ui.ActionBar.t6.B6;
            b9Var2.setTag(Integer.valueOf(i19));
            org.telegram.ui.ActionBar.a7.V(this.d.getTextView(), i19, null);
            if (this.f36513n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f36503e0.setVisibility(8);
            this.f36523y.setVisibility(8);
            this.D.setVisibility(0);
            this.f36506g0.setVisibility(8);
            if (this.f36497a0) {
                org.telegram.ui.Cells.b9 b9Var3 = this.d;
                if (this.V) {
                    i15 = 2131752327;
                } else {
                    i15 = 2131752267;
                }
                b9Var3.setText(org.telegram.messenger.cd.L0(i15, null));
                org.telegram.ui.Cells.p4 p4Var = this.e;
                if (this.V) {
                    L02 = org.telegram.messenger.cd.L0(2131752403, null);
                } else {
                    L02 = org.telegram.messenger.cd.L0(2131752385, null);
                }
                p4Var.setText(L02);
            } else {
                org.telegram.ui.Cells.b9 b9Var4 = this.d;
                if (this.V) {
                    i10 = 2131748654;
                } else {
                    i10 = 2131748651;
                }
                b9Var4.setText(org.telegram.messenger.cd.L0(i10, null));
                org.telegram.ui.Cells.p4 p4Var2 = this.e;
                if (this.V) {
                    L0 = org.telegram.messenger.cd.L0(2131752403, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131752385, null);
                }
                p4Var2.setText(L0);
            }
            LinearLayout linearLayout = this.E;
            if (this.V) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            LinearLayout linearLayout2 = this.F;
            if (this.V) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            LinearLayout linearLayout3 = this.D;
            if (this.V) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.j80 j80Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f36511l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            j80Var.setLink(str);
            this.G.c(this.f36511l0, this.Z);
            wo woVar = this.h;
            if (!this.V && woVar.f21743a.length() != 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            woVar.setVisibility(i13);
            TLRPC.ChatFull M0 = getMessagesController().M0(this.Z);
            TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(this.Z));
            org.telegram.ui.Cells.b9 b9Var5 = this.I;
            if (M0 != null && M0.paid_media_allowed && org.telegram.messenger.w3.V(L03)) {
                i14 = 2131748708;
            } else {
                i14 = 2131748709;
            }
            b9Var5.setText(org.telegram.messenger.cd.L0(i14, null));
        }
        boolean z10 = true;
        this.f36521w.a(!this.V);
        this.f36522x.a(this.V);
        this.f36498b.clearFocus();
        yo yoVar = this.U;
        if (yoVar != null) {
            if (this.f36497a0 && !this.V) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            yoVar.setVisibility(i16);
            yo yoVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f36497a0) {
                z10 = false;
            }
            yoVar2.c(z10);
        }
        bp bpVar = this.K;
        if (bpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i17 = 0;
            }
            bpVar.setVisibility(i17);
        }
        a0();
    }

    @Override
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.f36496a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.f21020i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        LinearLayout linearLayout = this.f36519s;
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36523y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36506g0, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36521w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36522x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        org.telegram.ui.ActionBar.n0 n0Var;
        super.onBecomeFullyVisible();
        if (this.f36513n0 && (n0Var = this.f36498b) != null) {
            n0Var.requestFocus();
            org.telegram.messenger.i0.J3(this.f36498b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.T);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19726y1);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f36511l0 = tL_chatInviteExported;
            org.telegram.ui.Components.j80 j80Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            j80Var.setLink(str);
            this.G.c(this.f36511l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.v4 v4Var = this.f36506g0;
            if (v4Var != null && v4Var.getChildCount() > 0 && (this.f36506g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f36506g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f36523y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f36523y.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.m) {
                        org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) childAt;
                        mVar.d.q(mVar.f22272f);
                        mVar.f22269a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.c60 c60Var = this.f36515p0;
            if (c60Var != null) {
                c60Var.updateColors();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
