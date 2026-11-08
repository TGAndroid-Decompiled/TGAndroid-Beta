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
    public xn f46047a;
    public boolean f46048a0;
    public ah.i f46049b;
    public boolean f46050b0;
    public EditTextBoldCursor f46051c;
    public boolean f46052c0;
    public org.telegram.ui.Cells.z8 d;
    public boolean f46053d0;
    public org.telegram.ui.Cells.n4 f46054e;
    public org.telegram.ui.Cells.y6 f46055e0;
    public org.telegram.ui.Cells.n4 f46056f;
    public ArrayList f46057f0;
    public org.telegram.ui.Cells.t4 f46058g0;
    public zn h;
    public int f46059h0;
    public String f46060i0;
    public qf f46061j0;
    public boolean f46062k0;
    public TLRPC.TL_chatInviteExported f46063l0;
    public boolean m0;
    public org.telegram.ui.Components.gm0 f46064n;
    public boolean f46065n0;
    public HashMap f46066o0;
    public org.telegram.ui.Components.m50 f46067p0;
    public rn f46068q0;
    public org.telegram.ui.ActionBar.b5 f46069r;
    public Boolean f46070r0;
    public LinearLayout f46071s;
    public boolean f46072s0;
    public org.telegram.ui.Cells.h6 f46073w;
    public org.telegram.ui.Cells.h6 f46074x;
    public LinearLayout f46075y;

    public static org.telegram.ui.ActionBar.f6 Z(go goVar) {
        return goVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28017m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28244y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27908g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28206w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final void b0() {
        boolean z9;
        org.telegram.ui.ActionBar.b5 b5Var = this.f46069r;
        if (!this.V && this.f46049b.length() <= 0) {
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
        qf qfVar = this.f46061j0;
        if (qfVar != null) {
            org.telegram.messenger.g0.r(qfVar);
            this.f46061j0 = null;
            this.f46060i0 = null;
            if (this.f46059h0 != 0) {
                getConnectionsManager().cancelRequest(this.f46059h0, true);
            }
        }
        this.f46062k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f46048a0) {
                            this.h.setText(org.telegram.messenger.id.M0(2131748906, null));
                        } else {
                            this.h.setText(org.telegram.messenger.id.M0(2131748905, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28073p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.id.M0(2131748910, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28073p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.id.M0(2131748910, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28073p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.id.M0(2131748909, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28073p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.id.M0(2131748923, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
            this.f46060i0 = str;
            qf qfVar2 = new qf(20, this, str);
            this.f46061j0 = qfVar2;
            org.telegram.messenger.g0.i3(qfVar2, 300L);
            return true;
        }
        if (this.f46048a0) {
            this.h.setText(org.telegram.messenger.id.M0(2131748908, null));
        } else {
            this.h.setText(org.telegram.messenger.id.M0(2131748907, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.f28073p7);
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
        this.f46069r = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        this.f46064n = new org.telegram.ui.Components.gm0(context);
        this.f46047a = new xn(this, context, this.f46064n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f46047a, c8.ha.g());
        this.fragmentView = frameLayout;
        this.f46047a.setFillViewport(true);
        this.f46047a.setDrawBackground(true);
        this.f46047a.setOverScrollMode(0);
        this.f46047a.addView(this.f46064n, new FrameLayout.LayoutParams(-1, -2));
        this.f46064n.setOrientation(1);
        boolean z10 = this.f46065n0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743933, null));
        } else if (this.f46048a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749401, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46071s = linearLayout;
        linearLayout.setOrientation(1);
        this.f46064n.addView(this.f46071s, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f46056f = n4Var;
        n4Var.setHeight(46);
        if (this.f46048a0) {
            this.f46056f.setText(org.telegram.messenger.id.M0(2131752275, null));
        } else {
            this.f46056f.setText(org.telegram.messenger.id.M0(2131749392, null));
        }
        this.f46071s.addView(this.f46056f);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.f46074x = h6Var;
        if (this.f46048a0) {
            h6Var.b(org.telegram.messenger.id.M0(2131752329, null), org.telegram.messenger.id.M0(2131752328, null), false, this.V);
        } else {
            h6Var.b(org.telegram.messenger.id.M0(2131748642, null), org.telegram.messenger.id.M0(2131748641, null), false, this.V);
        }
        this.f46071s.addView(this.f46074x, c8.ha.o(-1, -2));
        this.f46074x.setOnClickListener(new un(this, 1));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.f46073w = h6Var2;
        if (this.f46048a0) {
            h6Var2.b(org.telegram.messenger.id.M0(2131752318, null), org.telegram.messenger.id.M0(2131752315, null), false, !this.V);
        } else {
            h6Var2.b(org.telegram.messenger.id.M0(2131748639, null), org.telegram.messenger.id.M0(2131748638, null), false, !this.V);
        }
        this.f46071s.addView(this.f46073w, c8.ha.o(-1, -2));
        this.f46073w.setOnClickListener(new un(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.J = y6Var;
        this.f46064n.addView(y6Var, c8.ha.o(-1, -2));
        if (z10) {
            this.f46074x.setVisibility(8);
            this.f46073w.setVisibility(8);
            this.J.setVisibility(8);
            this.f46056f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46064n.addView(this.D, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.f46054e = n4Var2;
        this.D.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, c8.ha.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f46051c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
        this.f46051c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f46051c;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f46051c;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i13, null);
        this.f46051c.setMaxLines(1);
        this.f46051c.setLines(1);
        this.f46051c.setEnabled(false);
        this.f46051c.setBackground(null);
        this.f46051c.setPadding(0, 0, 0, 0);
        this.f46051c.setSingleLine(true);
        this.f46051c.setInputType(163840);
        this.f46051c.setImeOptions(6);
        this.E.addView(this.f46051c, c8.ha.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f46049b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f46049b, i12, null);
        org.telegram.ui.ActionBar.r6.V(this.f46049b, i13, null);
        this.f46049b.setMaxLines(1);
        this.f46049b.setLines(1);
        this.f46049b.setBackground(null);
        this.f46049b.setPadding(0, 0, 0, 0);
        this.f46049b.setSingleLine(true);
        this.f46049b.setInputType(163872);
        this.f46049b.setImeOptions(6);
        this.f46049b.setHint(org.telegram.messenger.id.M0(2131752266, null));
        org.telegram.ui.ActionBar.r6.w(this.f46049b, i13, null);
        this.f46049b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f46049b.setCursorWidth(1.5f);
        this.E.addView(this.f46049b, c8.ha.o(-1, 36));
        this.f46049b.addTextChangedListener(new m0(this, 4));
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
        this.f46064n.addView(this.h, c8.ha.o(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.d = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.f46064n.addView(this.d, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.f46058g0 = t4Var;
        this.f46064n.addView(t4Var, c8.ha.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f46075y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f46064n.addView(this.f46075y, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.f46055e0 = y6Var2;
        this.f46064n.addView(y6Var2, c8.ha.o(-1, -2));
        org.telegram.ui.Components.gm0 gm0Var = this.f46064n;
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
        m8Var.o(2131232204, org.telegram.messenger.id.M0(2131748696, null), false);
        this.H.setOnClickListener(new un(this, 3));
        this.f46064n.addView(this.H, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.I = z8Var2;
        this.f46064n.addView(z8Var2, c8.ha.o(-1, -2));
        bo boVar = new bo(this, context, this.X, context);
        this.U = boVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f46048a0) {
            z9 = true;
        } else {
            z9 = false;
        }
        boVar.c(z9);
        bo boVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.z8 z8Var3 = boVar2.f33489e;
        boolean V = org.telegram.messenger.t3.V(boVar2.f33491n);
        boolean t02 = org.telegram.messenger.t3.t0(boVar2.f33491n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.m5.r(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).a2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752301;
            } else if (t02) {
                i11 = 2131749403;
            } else {
                i11 = 2131749406;
            }
            z8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.id.a0(null, null, i11, str), org.telegram.ui.ActionBar.k6.Wl, null, new org.telegram.ui.Components.fq(26, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752302;
            } else if (t02) {
                i10 = 2131749404;
            } else {
                i10 = 2131749407;
            }
            z8Var3.setText(org.telegram.messenger.id.M0(i10, null));
        }
        this.f46064n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f46064n.addView(this.Q);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.R = n4Var3;
        n4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.id.M0(2131745866, null));
        this.Q.addView(this.R, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.S = r8Var;
        r8Var.f(org.telegram.messenger.id.M0(2131746065, null), this.f46050b0, false);
        this.S.setOnClickListener(new un(this, 4));
        this.Q.addView(this.S, c8.ha.o(-1, -2));
        this.T = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        if (this.f46048a0 && !org.telegram.messenger.t3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.id.M0(2131746064, null));
        } else {
            this.T.setText(org.telegram.messenger.id.M0(2131746063, null));
        }
        this.Q.addView(this.T, c8.ha.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.f46049b.setText(K);
            this.f46049b.setSelection(K.length());
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
            if (chatFull.f26957id == this.Z) {
                this.Y = chatFull;
                this.f46063l0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.qs.f25112y1) {
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
        i0Var.f56616n2 = this.f46048a0;
        i0Var.f56628z2 = new rn(this, 0);
        showDialog(i0Var);
    }

    public final void g0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.f46068q0);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.f46069r;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    @Override
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.f46047a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.k6.f27944i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28073p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        LinearLayout linearLayout = this.f46071s;
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46075y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46058g0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27926h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46073w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46074x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
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
        if (!this.V && !this.f46052c0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.id.M0(2131752533, null));
            org.telegram.ui.Cells.z8 z8Var = this.d;
            int i17 = org.telegram.ui.ActionBar.k6.f28073p7;
            z8Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i17, null);
            this.D.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f46055e0.setVisibility(0);
            if (this.f46053d0) {
                this.f46058g0.setVisibility(0);
                this.f46075y.setVisibility(8);
            } else {
                this.f46058g0.setVisibility(8);
                this.f46075y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.k6.B6;
            z8Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i18, null);
            if (this.f46065n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f46055e0.setVisibility(8);
            this.f46075y.setVisibility(8);
            this.D.setVisibility(0);
            this.f46058g0.setVisibility(8);
            if (this.f46048a0) {
                org.telegram.ui.Cells.z8 z8Var3 = this.d;
                if (this.V) {
                    i14 = 2131752327;
                } else {
                    i14 = 2131752267;
                }
                z8Var3.setText(org.telegram.messenger.id.M0(i14, null));
                org.telegram.ui.Cells.n4 n4Var = this.f46054e;
                if (this.V) {
                    M02 = org.telegram.messenger.id.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.id.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.z8 z8Var4 = this.d;
                if (this.V) {
                    i7 = 2131748640;
                } else {
                    i7 = 2131748637;
                }
                z8Var4.setText(org.telegram.messenger.id.M0(i7, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.f46054e;
                if (this.V) {
                    M0 = org.telegram.messenger.id.M0(2131752403, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131752385, null);
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f46063l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            q70Var.setLink(str);
            this.G.c(this.f46063l0, this.Z);
            zn znVar = this.h;
            if (!this.V && znVar.f30983a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            znVar.setVisibility(i12);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.Z);
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.Z));
            org.telegram.ui.Cells.z8 z8Var5 = this.I;
            if (N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(M03)) {
                i13 = 2131748694;
            } else {
                i13 = 2131748695;
            }
            z8Var5.setText(org.telegram.messenger.id.M0(i13, null));
        }
        boolean z9 = true;
        this.f46073w.a(!this.V);
        this.f46074x.a(this.V);
        this.f46049b.clearFocus();
        bo boVar = this.U;
        if (boVar != null) {
            if (this.f46048a0 && !this.V) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            boVar.setVisibility(i15);
            bo boVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f46048a0) {
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
        if (this.f46065n0 && (iVar = this.f46049b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.K3(this.f46049b);
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
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25112y1);
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
            this.f46063l0 = tL_chatInviteExported;
            org.telegram.ui.Components.q70 q70Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            q70Var.setLink(str);
            this.G.c(this.f46063l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.f46058g0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f46058g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f46058g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27926h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f46075y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f46075y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f29589f);
                        nVar.f29585a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.m50 m50Var = this.f46067p0;
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
