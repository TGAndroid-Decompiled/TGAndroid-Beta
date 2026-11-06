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
public final class go extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.q70 G;
    public org.telegram.ui.Cells.m8 H;
    public org.telegram.ui.Cells.z8 I;
    public org.telegram.ui.Cells.y6 J;
    public fo K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ia O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.n4 R;
    public org.telegram.ui.Cells.r8 S;
    public org.telegram.ui.Cells.z8 T;
    public bo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public xn f46045a;
    public boolean f46046a0;
    public ah.i f46047b;
    public boolean f46048b0;
    public EditTextBoldCursor f46049c;
    public boolean f46050c0;
    public org.telegram.ui.Cells.z8 d;
    public boolean f46051d0;
    public org.telegram.ui.Cells.n4 f46052e;
    public org.telegram.ui.Cells.y6 f46053e0;
    public org.telegram.ui.Cells.n4 f46054f;
    public ArrayList f46055f0;
    public org.telegram.ui.Cells.t4 f46056g0;
    public zn h;
    public int f46057h0;
    public String f46058i0;
    public qf f46059j0;
    public boolean f46060k0;
    public TLRPC.TL_chatInviteExported f46061l0;
    public boolean m0;
    public org.telegram.ui.Components.gm0 f46062n;
    public boolean f46063n0;
    public HashMap f46064o0;
    public org.telegram.ui.Components.m50 f46065p0;
    public rn f46066q0;
    public org.telegram.ui.ActionBar.b5 f46067r;
    public Boolean f46068r0;
    public LinearLayout f46069s;
    public boolean f46070s0;
    public org.telegram.ui.Cells.h6 f46071w;
    public org.telegram.ui.Cells.h6 f46072x;
    public LinearLayout f46073y;

    public static org.telegram.ui.ActionBar.f6 Z(go goVar) {
        return goVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28203w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final void b0() {
        boolean z9;
        org.telegram.ui.ActionBar.b5 b5Var = this.f46067r;
        if (!this.V && this.f46047b.length() <= 0) {
            ArrayList arrayList = this.N;
            z9 = false;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            b5Var.a(z9, true);
        }
        z9 = true;
        b5Var.a(z9, true);
    }

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        qf qfVar = this.f46059j0;
        if (qfVar != null) {
            org.telegram.messenger.g0.r(qfVar);
            this.f46059j0 = null;
            this.f46058i0 = null;
            if (this.f46057h0 != 0) {
                getConnectionsManager().cancelRequest(this.f46057h0, true);
            }
        }
        this.f46060k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f46046a0) {
                            this.h.setText(org.telegram.messenger.hd.M0(2131748904, null));
                        } else {
                            this.h.setText(org.telegram.messenger.hd.M0(2131748903, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28070p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.hd.M0(2131748908, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28070p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.hd.M0(2131748908, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28070p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.hd.M0(2131748907, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28070p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.hd.M0(2131748921, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
            this.f46058i0 = str;
            qf qfVar2 = new qf(20, this, str);
            this.f46059j0 = qfVar2;
            org.telegram.messenger.g0.i3(qfVar2, 300L);
            return true;
        }
        if (this.f46046a0) {
            this.h.setText(org.telegram.messenger.hd.M0(2131748906, null));
        } else {
            this.h.setText(org.telegram.messenger.hd.M0(2131748905, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28070p7);
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        boolean z9;
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new wn(this, context));
        this.f46067r = this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null));
        this.f46062n = new org.telegram.ui.Components.gm0(context);
        this.f46045a = new xn(this, context, this.f46062n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f46045a, c8.ha.g());
        this.fragmentView = frameLayout;
        this.f46045a.setFillViewport(true);
        this.f46045a.setDrawBackground(true);
        this.f46045a.setOverScrollMode(0);
        this.f46045a.addView(this.f46062n, new FrameLayout.LayoutParams(-1, -2));
        this.f46062n.setOrientation(1);
        boolean z10 = this.f46063n0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743931, null));
        } else if (this.f46046a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749399, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46069s = linearLayout;
        linearLayout.setOrientation(1);
        this.f46062n.addView(this.f46069s, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f46054f = n4Var;
        n4Var.setHeight(46);
        if (this.f46046a0) {
            this.f46054f.setText(org.telegram.messenger.hd.M0(2131752275, null));
        } else {
            this.f46054f.setText(org.telegram.messenger.hd.M0(2131749390, null));
        }
        this.f46069s.addView(this.f46054f);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.f46072x = h6Var;
        if (this.f46046a0) {
            h6Var.b(org.telegram.messenger.hd.M0(2131752329, null), org.telegram.messenger.hd.M0(2131752328, null), false, this.V);
        } else {
            h6Var.b(org.telegram.messenger.hd.M0(2131748640, null), org.telegram.messenger.hd.M0(2131748639, null), false, this.V);
        }
        this.f46069s.addView(this.f46072x, c8.ha.o(-1, -2));
        this.f46072x.setOnClickListener(new un(this, 1));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.f46071w = h6Var2;
        if (this.f46046a0) {
            h6Var2.b(org.telegram.messenger.hd.M0(2131752318, null), org.telegram.messenger.hd.M0(2131752315, null), false, !this.V);
        } else {
            h6Var2.b(org.telegram.messenger.hd.M0(2131748637, null), org.telegram.messenger.hd.M0(2131748636, null), false, !this.V);
        }
        this.f46069s.addView(this.f46071w, c8.ha.o(-1, -2));
        this.f46071w.setOnClickListener(new un(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.J = y6Var;
        this.f46062n.addView(y6Var, c8.ha.o(-1, -2));
        if (z10) {
            this.f46072x.setVisibility(8);
            this.f46071w.setVisibility(8);
            this.J.setVisibility(8);
            this.f46054f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46062n.addView(this.D, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.f46052e = n4Var2;
        this.D.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, c8.ha.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f46049c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
        this.f46049c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f46049c;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f46049c;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i13, null);
        this.f46049c.setMaxLines(1);
        this.f46049c.setLines(1);
        this.f46049c.setEnabled(false);
        this.f46049c.setBackground(null);
        this.f46049c.setPadding(0, 0, 0, 0);
        this.f46049c.setSingleLine(true);
        this.f46049c.setInputType(163840);
        this.f46049c.setImeOptions(6);
        this.E.addView(this.f46049c, c8.ha.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f46047b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f46047b, i12, null);
        org.telegram.ui.ActionBar.r6.V(this.f46047b, i13, null);
        this.f46047b.setMaxLines(1);
        this.f46047b.setLines(1);
        this.f46047b.setBackground(null);
        this.f46047b.setPadding(0, 0, 0, 0);
        this.f46047b.setSingleLine(true);
        this.f46047b.setInputType(163872);
        this.f46047b.setImeOptions(6);
        this.f46047b.setHint(org.telegram.messenger.hd.M0(2131752266, null));
        org.telegram.ui.ActionBar.r6.w(this.f46047b, i13, null);
        this.f46047b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f46047b.setCursorWidth(1.5f);
        this.E.addView(this.f46047b, c8.ha.o(-1, 36));
        this.f46047b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.D.addView(this.F, c8.ha.o(-1, -2));
        org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, this, null, true, org.telegram.messenger.t3.T(this.X));
        this.G = q70Var;
        q70Var.setDelegate(new yn(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        zn znVar = new zn(this, context, this.resourceProvider);
        this.h = znVar;
        znVar.setBottomPadding(6);
        this.f46062n.addView(this.h, c8.ha.o(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.d = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.f46062n.addView(this.d, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.f46056g0 = t4Var;
        this.f46062n.addView(t4Var, c8.ha.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f46073y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f46062n.addView(this.f46073y, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.f46053e0 = y6Var2;
        this.f46062n.addView(y6Var2, c8.ha.o(-1, -2));
        org.telegram.ui.Components.gm0 gm0Var = this.f46062n;
        fo foVar = new fo(this, context);
        this.K = foVar;
        gm0Var.addView(foVar, c8.ha.o(-1, -2));
        fo foVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        foVar2.setVisibility(i7);
        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
        this.H = m8Var;
        m8Var.o(2131232204, org.telegram.messenger.hd.M0(2131748694, null), false);
        this.H.setOnClickListener(new un(this, 3));
        this.f46062n.addView(this.H, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.I = z8Var2;
        this.f46062n.addView(z8Var2, c8.ha.o(-1, -2));
        bo boVar = new bo(this, context, this.X, context);
        this.U = boVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f46046a0) {
            z9 = true;
        } else {
            z9 = false;
        }
        boVar.c(z9);
        bo boVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.z8 z8Var3 = boVar2.f33482e;
        boolean V = org.telegram.messenger.t3.V(boVar2.f33484n);
        boolean t02 = org.telegram.messenger.t3.t0(boVar2.f33484n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.m5.r(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).a2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752301;
            } else if (t02) {
                i11 = 2131749401;
            } else {
                i11 = 2131749404;
            }
            z8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, i11, str), org.telegram.ui.ActionBar.k6.Wl, null, new org.telegram.ui.Components.fq(26, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752302;
            } else if (t02) {
                i10 = 2131749402;
            } else {
                i10 = 2131749405;
            }
            z8Var3.setText(org.telegram.messenger.hd.M0(i10, null));
        }
        this.f46062n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f46062n.addView(this.Q);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.R = n4Var3;
        n4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.hd.M0(2131745864, null));
        this.Q.addView(this.R, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.S = r8Var;
        r8Var.f(org.telegram.messenger.hd.M0(2131746063, null), this.f46048b0, false);
        this.S.setOnClickListener(new un(this, 4));
        this.Q.addView(this.S, c8.ha.o(-1, -2));
        this.T = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        if (this.f46046a0 && !org.telegram.messenger.t3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.hd.M0(2131746062, null));
        } else {
            this.T.setText(org.telegram.messenger.hd.M0(2131746061, null));
        }
        this.Q.addView(this.T, c8.ha.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.f46047b.setText(K);
            this.f46047b.setSelection(K.length());
            this.m0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z9) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new fi.d3(5, this, z9)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26954id == this.Z) {
                this.Y = chatFull;
                this.f46061l0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.qs.f25103y1) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.go.e0():void");
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.f56523n2 = this.f46046a0;
        i0Var.f56535z2 = new rn(this, 0);
        showDialog(i0Var);
    }

    public final void g0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.f46066q0);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.f46067r;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    @Override
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.f46045a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.k6.f27941i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28070p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        LinearLayout linearLayout = this.f46069s;
        int i10 = org.telegram.ui.ActionBar.k6.f27849d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46073y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46056g0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27923h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46071w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46072x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    public final void h0() {
        int i7;
        String M0;
        int i10;
        int i11;
        int L;
        String str;
        int i12;
        int i13;
        int i14;
        String M02;
        int i15;
        if (this.J == null) {
            return;
        }
        int i16 = 8;
        if (!this.V && !this.f46050c0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.hd.M0(2131752533, null));
            org.telegram.ui.Cells.z8 z8Var = this.d;
            int i17 = org.telegram.ui.ActionBar.k6.f28070p7;
            z8Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i17, null);
            this.D.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f46053e0.setVisibility(0);
            if (this.f46051d0) {
                this.f46056g0.setVisibility(0);
                this.f46073y.setVisibility(8);
            } else {
                this.f46056g0.setVisibility(8);
                this.f46073y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.k6.B6;
            z8Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i18, null);
            if (this.f46063n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f46053e0.setVisibility(8);
            this.f46073y.setVisibility(8);
            this.D.setVisibility(0);
            this.f46056g0.setVisibility(8);
            if (this.f46046a0) {
                org.telegram.ui.Cells.z8 z8Var3 = this.d;
                if (this.V) {
                    i14 = 2131752327;
                } else {
                    i14 = 2131752267;
                }
                z8Var3.setText(org.telegram.messenger.hd.M0(i14, null));
                org.telegram.ui.Cells.n4 n4Var = this.f46052e;
                if (this.V) {
                    M02 = org.telegram.messenger.hd.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.hd.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.z8 z8Var4 = this.d;
                if (this.V) {
                    i7 = 2131748638;
                } else {
                    i7 = 2131748635;
                }
                z8Var4.setText(org.telegram.messenger.hd.M0(i7, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.f46052e;
                if (this.V) {
                    M0 = org.telegram.messenger.hd.M0(2131752403, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131752385, null);
                }
                n4Var2.setText(M0);
            }
            LinearLayout linearLayout = this.E;
            if (this.V) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = this.F;
            if (this.V) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            LinearLayout linearLayout3 = this.D;
            if (this.V) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.q70 q70Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f46061l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            q70Var.setLink(str);
            this.G.c(this.f46061l0, this.Z);
            zn znVar = this.h;
            if (!this.V && znVar.f30979a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            znVar.setVisibility(i12);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.Z);
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.Z));
            org.telegram.ui.Cells.z8 z8Var5 = this.I;
            if (N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(M03)) {
                i13 = 2131748692;
            } else {
                i13 = 2131748693;
            }
            z8Var5.setText(org.telegram.messenger.hd.M0(i13, null));
        }
        boolean z9 = true;
        this.f46071w.a(!this.V);
        this.f46072x.a(this.V);
        this.f46047b.clearFocus();
        bo boVar = this.U;
        if (boVar != null) {
            if (this.f46046a0 && !this.V) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            boVar.setVisibility(i15);
            bo boVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f46046a0) {
                z9 = false;
            }
            boVar2.c(z9);
        }
        fo foVar = this.K;
        if (foVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i16 = 0;
            }
            foVar.setVisibility(i16);
        }
        b0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ah.i iVar;
        super.onBecomeFullyVisible();
        if (this.f46063n0 && (iVar = this.f46047b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.K3(this.f46047b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.go.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25103y1);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f46061l0 = tL_chatInviteExported;
            org.telegram.ui.Components.q70 q70Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            q70Var.setLink(str);
            this.G.c(this.f46061l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.f46056g0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f46056g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f46056g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27923h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f46073y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f46073y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f29586f);
                        nVar.f29582a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.m50 m50Var = this.f46065p0;
            if (m50Var != null) {
                m50Var.updateColors();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
