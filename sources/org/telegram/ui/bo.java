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
public final class bo extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.m70 H;
    public org.telegram.ui.Cells.l8 I;
    public org.telegram.ui.Cells.y8 J;
    public org.telegram.ui.Cells.x6 K;
    public ao L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ha P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.n4 S;
    public org.telegram.ui.Cells.q8 T;
    public org.telegram.ui.Cells.y8 U;
    public xn V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public tn f44088a;
    public long f44089a0;
    public bh.g f44090b;
    public boolean f44091b0;
    public EditTextBoldCursor f44092c;
    public boolean f44093c0;
    public org.telegram.ui.Cells.y8 d;
    public boolean f44094d0;
    public org.telegram.ui.Cells.n4 f44095e;
    public boolean f44096e0;
    public org.telegram.ui.Cells.n4 f44097f;
    public org.telegram.ui.Cells.x6 f44098f0;
    public ArrayList f44099g0;
    public vn h;
    public org.telegram.ui.Cells.t4 f44100h0;
    public int f44101i0;
    public String f44102j0;
    public sc f44103k0;
    public boolean f44104l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.jm0 f44105n;
    public boolean f44106n0;
    public boolean f44107o0;
    public HashMap f44108p0;
    public org.telegram.ui.Components.i50 f44109q0;
    public org.telegram.ui.ActionBar.b5 f44110r;
    public nn f44111r0;
    public LinearLayout f44112s;
    public Boolean f44113s0;
    public boolean f44114t0;
    public org.telegram.ui.Cells.g6 f44115w;
    public org.telegram.ui.Cells.g6 f44116x;
    public LinearLayout f44117y;

    public static org.telegram.ui.ActionBar.e6 Z(bo boVar) {
        return boVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28234w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var = this.f44110r;
        if (!this.W && this.f44090b.length() <= 0) {
            ArrayList arrayList = this.O;
            z10 = false;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i3);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            b5Var.a(z10, true);
        }
        z10 = true;
        b5Var.a(z10, true);
    }

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        sc scVar = this.f44103k0;
        if (scVar != null) {
            org.telegram.messenger.g0.r(scVar);
            this.f44103k0 = null;
            this.f44102j0 = null;
            if (this.f44101i0 != 0) {
                getConnectionsManager().cancelRequest(this.f44101i0, true);
            }
        }
        this.f44104l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (i3 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f44091b0) {
                            this.h.setText(org.telegram.messenger.bd.M0(2131748913, null));
                        } else {
                            this.h.setText(org.telegram.messenger.bd.M0(2131748912, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28102p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.bd.M0(2131748917, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28102p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.bd.M0(2131748917, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28102p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.bd.M0(2131748916, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28102p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.bd.M0(2131748930, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
            this.f44102j0 = str;
            sc scVar2 = new sc(25, this, str);
            this.f44103k0 = scVar2;
            org.telegram.messenger.g0.i3(scVar2, 300L);
            return true;
        }
        if (this.f44091b0) {
            this.h.setText(org.telegram.messenger.bd.M0(2131748915, null));
        } else {
            this.h.setText(org.telegram.messenger.bd.M0(2131748914, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28102p7);
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i3;
        boolean z10;
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new sn(this, context));
        this.f44110r = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        this.f44105n = new org.telegram.ui.Components.jm0(context);
        this.f44088a = new tn(this, context, this.f44105n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f44088a, b8.mf.g());
        this.fragmentView = frameLayout;
        this.f44088a.setFillViewport(true);
        this.f44088a.setDrawBackground(true);
        this.f44088a.setOverScrollMode(0);
        this.f44088a.addView(this.f44105n, new FrameLayout.LayoutParams(-1, -2));
        this.f44105n.setOrientation(1);
        boolean z11 = this.f44107o0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743940, null));
        } else if (this.f44091b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749408, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44112s = linearLayout;
        linearLayout.setOrientation(1);
        this.f44105n.addView(this.f44112s, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f44097f = n4Var;
        n4Var.setHeight(46);
        if (this.f44091b0) {
            this.f44097f.setText(org.telegram.messenger.bd.M0(2131752275, null));
        } else {
            this.f44097f.setText(org.telegram.messenger.bd.M0(2131749399, null));
        }
        this.f44112s.addView(this.f44097f);
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
        this.f44116x = g6Var;
        if (this.f44091b0) {
            g6Var.b(org.telegram.messenger.bd.M0(2131752329, null), org.telegram.messenger.bd.M0(2131752328, null), false, this.W);
        } else {
            g6Var.b(org.telegram.messenger.bd.M0(2131748649, null), org.telegram.messenger.bd.M0(2131748648, null), false, this.W);
        }
        this.f44112s.addView(this.f44116x, b8.mf.o(-1, -2));
        this.f44116x.setOnClickListener(new qn(this, 1));
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
        this.f44115w = g6Var2;
        if (this.f44091b0) {
            g6Var2.b(org.telegram.messenger.bd.M0(2131752318, null), org.telegram.messenger.bd.M0(2131752315, null), false, !this.W);
        } else {
            g6Var2.b(org.telegram.messenger.bd.M0(2131748646, null), org.telegram.messenger.bd.M0(2131748645, null), false, !this.W);
        }
        this.f44112s.addView(this.f44115w, b8.mf.o(-1, -2));
        this.f44115w.setOnClickListener(new qn(this, 2));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        this.K = x6Var;
        this.f44105n.addView(x6Var, b8.mf.o(-1, -2));
        if (z11) {
            this.f44116x.setVisibility(8);
            this.f44115w.setVisibility(8);
            this.K.setVisibility(8);
            this.f44097f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f44105n.addView(this.E, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.f44095e = n4Var2;
        this.E.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, b8.mf.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44092c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().V2 + "/");
        this.f44092c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f44092c;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f44092c;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i13, null);
        this.f44092c.setMaxLines(1);
        this.f44092c.setLines(1);
        this.f44092c.setEnabled(false);
        this.f44092c.setBackground(null);
        this.f44092c.setPadding(0, 0, 0, 0);
        this.f44092c.setSingleLine(true);
        this.f44092c.setInputType(163840);
        this.f44092c.setImeOptions(6);
        this.F.addView(this.f44092c, b8.mf.o(-2, 36));
        bh.g gVar = new bh.g(5, context, this);
        this.f44090b = gVar;
        gVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f44090b, i12, null);
        org.telegram.ui.ActionBar.r6.V(this.f44090b, i13, null);
        this.f44090b.setMaxLines(1);
        this.f44090b.setLines(1);
        this.f44090b.setBackground(null);
        this.f44090b.setPadding(0, 0, 0, 0);
        this.f44090b.setSingleLine(true);
        this.f44090b.setInputType(163872);
        this.f44090b.setImeOptions(6);
        this.f44090b.setHint(org.telegram.messenger.bd.M0(2131752266, null));
        org.telegram.ui.ActionBar.r6.w(this.f44090b, i13, null);
        this.f44090b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f44090b.setCursorWidth(1.5f);
        this.F.addView(this.f44090b, b8.mf.o(-1, 36));
        this.f44090b.addTextChangedListener(new n0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, b8.mf.o(-1, -2));
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, this, null, true, org.telegram.messenger.t3.T(this.Y));
        this.H = m70Var;
        m70Var.setDelegate(new un(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        vn vnVar = new vn(this, context, this.resourceProvider);
        this.h = vnVar;
        vnVar.setBottomPadding(6);
        this.f44105n.addView(this.h, b8.mf.o(-2, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.d = y8Var;
        y8Var.setImportantForAccessibility(1);
        this.f44105n.addView(this.d, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.f44100h0 = t4Var;
        this.f44105n.addView(t4Var, b8.mf.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f44117y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f44105n.addView(this.f44117y, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        this.f44098f0 = x6Var2;
        this.f44105n.addView(x6Var2, b8.mf.o(-1, -2));
        org.telegram.ui.Components.jm0 jm0Var = this.f44105n;
        ao aoVar = new ao(this, context);
        this.L = aoVar;
        jm0Var.addView(aoVar, b8.mf.o(-1, -2));
        ao aoVar2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        aoVar2.setVisibility(i3);
        org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
        this.I = l8Var;
        l8Var.o(2131232204, org.telegram.messenger.bd.M0(2131748703, null), false);
        this.I.setOnClickListener(new qn(this, 3));
        this.f44105n.addView(this.I, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.J = y8Var2;
        this.f44105n.addView(y8Var2, b8.mf.o(-1, -2));
        xn xnVar = new xn(this, context, this.Y, context);
        this.V = xnVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f44091b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.c(z10);
        xn xnVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.y8 y8Var3 = xnVar2.f32109e;
        boolean V = org.telegram.messenger.t3.V(xnVar2.f32111n);
        boolean t02 = org.telegram.messenger.t3.t0(xnVar2.f32111n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.m5.r(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).a2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752301;
            } else if (t02) {
                i11 = 2131749410;
            } else {
                i11 = 2131749413;
            }
            y8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.bd.a0(null, null, i11, str), org.telegram.ui.ActionBar.k6.Wl, null, new org.telegram.ui.Components.j50(1, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752302;
            } else if (t02) {
                i10 = 2131749411;
            } else {
                i10 = 2131749414;
            }
            y8Var3.setText(org.telegram.messenger.bd.M0(i10, null));
        }
        this.f44105n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f44105n.addView(this.R);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.S = n4Var3;
        n4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.bd.M0(2131745873, null));
        this.R.addView(this.S, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.T = q8Var;
        q8Var.f(org.telegram.messenger.bd.M0(2131746072, null), this.f44093c0, false);
        this.T.setOnClickListener(new qn(this, 4));
        this.R.addView(this.T, b8.mf.o(-1, -2));
        this.U = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        if (this.f44091b0 && !org.telegram.messenger.t3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.bd.M0(2131746071, null));
        } else {
            this.U.setText(org.telegram.messenger.bd.M0(2131746070, null));
        }
        this.R.addView(this.U, b8.mf.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.Y, true);
        if (!this.W && K != null) {
            this.f44106n0 = true;
            this.f44090b.setText(K);
            this.f44090b.setSelection(K.length());
            this.f44106n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.f44089a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new gi.b3(5, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f27002id == this.f44089a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i3 == org.telegram.messenger.hs.f23341y1) {
            if ((-this.f44089a0) == ((Long) objArr[0]).longValue()) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.e0():void");
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.f56664o2 = this.f44091b0;
        i0Var.A2 = new nn(this, 0);
        showDialog(i0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.f44111r0);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.f44110r;
        if (b5Var != null) {
            b5Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.f44088a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        LinearLayout linearLayout = this.f44112s;
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44117y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44100h0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44115w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44116x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    public final void h0() {
        int i3;
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
        if (this.K == null) {
            return;
        }
        int i16 = 8;
        if (!this.W && !this.f44094d0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.bd.M0(2131752533, null));
            org.telegram.ui.Cells.y8 y8Var = this.d;
            int i17 = org.telegram.ui.ActionBar.k6.f28102p7;
            y8Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i17, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f44098f0.setVisibility(0);
            if (this.f44096e0) {
                this.f44100h0.setVisibility(0);
                this.f44117y.setVisibility(8);
            } else {
                this.f44100h0.setVisibility(8);
                this.f44117y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.k6.B6;
            y8Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i18, null);
            if (this.f44107o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f44098f0.setVisibility(8);
            this.f44117y.setVisibility(8);
            this.E.setVisibility(0);
            this.f44100h0.setVisibility(8);
            if (this.f44091b0) {
                org.telegram.ui.Cells.y8 y8Var3 = this.d;
                if (this.W) {
                    i14 = 2131752327;
                } else {
                    i14 = 2131752267;
                }
                y8Var3.setText(org.telegram.messenger.bd.M0(i14, null));
                org.telegram.ui.Cells.n4 n4Var = this.f44095e;
                if (this.W) {
                    M02 = org.telegram.messenger.bd.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.bd.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.y8 y8Var4 = this.d;
                if (this.W) {
                    i3 = 2131748647;
                } else {
                    i3 = 2131748644;
                }
                y8Var4.setText(org.telegram.messenger.bd.M0(i3, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.f44095e;
                if (this.W) {
                    M0 = org.telegram.messenger.bd.M0(2131752403, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131752385, null);
                }
                n4Var2.setText(M0);
            }
            LinearLayout linearLayout = this.F;
            if (this.W) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = this.G;
            if (this.W) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            LinearLayout linearLayout3 = this.E;
            if (this.W) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.m70 m70Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            m70Var.setLink(str);
            this.H.c(this.m0, this.f44089a0);
            vn vnVar = this.h;
            if (!this.W && vnVar.f31003a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            vnVar.setVisibility(i12);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.f44089a0);
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.f44089a0));
            org.telegram.ui.Cells.y8 y8Var5 = this.J;
            if (N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(M03)) {
                i13 = 2131748701;
            } else {
                i13 = 2131748702;
            }
            y8Var5.setText(org.telegram.messenger.bd.M0(i13, null));
        }
        boolean z10 = true;
        this.f44115w.a(!this.W);
        this.f44116x.a(this.W);
        this.f44090b.clearFocus();
        xn xnVar = this.V;
        if (xnVar != null) {
            if (this.f44091b0 && !this.W) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            xnVar.setVisibility(i15);
            xn xnVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f44091b0) {
                z10 = false;
            }
            xnVar2.c(z10);
        }
        ao aoVar = this.L;
        if (aoVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i16 = 0;
            }
            aoVar.setVisibility(i16);
        }
        b0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        bh.g gVar;
        super.onBecomeFullyVisible();
        if (this.f44107o0 && (gVar = this.f44090b) != null) {
            gVar.requestFocus();
            org.telegram.messenger.g0.K3(this.f44090b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            org.telegram.ui.Components.m70 m70Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            m70Var.setLink(str);
            this.H.c(this.m0, this.f44089a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.f44100h0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f44100h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f44100h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f44117y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.f44117y.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f29646f);
                        nVar.f29642a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.i50 i50Var = this.f44109q0;
            if (i50Var != null) {
                i50Var.updateColors();
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
