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
public final class io extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.r70 G;
    public org.telegram.ui.Cells.m8 H;
    public org.telegram.ui.Cells.z8 I;
    public org.telegram.ui.Cells.y6 J;
    public ho K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ia O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.n4 R;
    public org.telegram.ui.Cells.r8 S;
    public org.telegram.ui.Cells.z8 T;
    public eo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public zn f46708a;
    public boolean f46709a0;
    public ah.i f46710b;
    public boolean f46711b0;
    public EditTextBoldCursor f46712c;
    public boolean f46713c0;
    public org.telegram.ui.Cells.z8 d;
    public boolean f46714d0;
    public org.telegram.ui.Cells.n4 f46715e;
    public org.telegram.ui.Cells.y6 f46716e0;
    public org.telegram.ui.Cells.n4 f46717f;
    public ArrayList f46718f0;
    public org.telegram.ui.Cells.t4 f46719g0;
    public bo h;
    public int f46720h0;
    public String f46721i0;
    public rf f46722j0;
    public boolean f46723k0;
    public TLRPC.TL_chatInviteExported f46724l0;
    public boolean m0;
    public org.telegram.ui.Components.hm0 f46725n;
    public boolean f46726n0;
    public HashMap f46727o0;
    public org.telegram.ui.Components.n50 f46728p0;
    public tn f46729q0;
    public org.telegram.ui.ActionBar.b5 f46730r;
    public Boolean f46731r0;
    public LinearLayout f46732s;
    public boolean f46733s0;
    public org.telegram.ui.Cells.h6 f46734w;
    public org.telegram.ui.Cells.h6 f46735x;
    public LinearLayout f46736y;

    public static org.telegram.ui.ActionBar.g6 Z(io ioVar) {
        return ioVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27921g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28219w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
    }

    public final void b0() {
        boolean z9;
        org.telegram.ui.ActionBar.b5 b5Var = this.f46730r;
        if (!this.V && this.f46710b.length() <= 0) {
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
        rf rfVar = this.f46722j0;
        if (rfVar != null) {
            org.telegram.messenger.g0.r(rfVar);
            this.f46722j0 = null;
            this.f46721i0 = null;
            if (this.f46720h0 != 0) {
                getConnectionsManager().cancelRequest(this.f46720h0, true);
            }
        }
        this.f46723k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f46709a0) {
                            this.h.setText(org.telegram.messenger.id.M0(2131748905, null));
                        } else {
                            this.h.setText(org.telegram.messenger.id.M0(2131748904, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28086p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.id.M0(2131748909, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28086p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.id.M0(2131748909, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28086p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.id.M0(2131748908, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28086p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.id.M0(2131748922, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.F6);
            this.f46721i0 = str;
            rf rfVar2 = new rf(20, this, str);
            this.f46722j0 = rfVar2;
            org.telegram.messenger.g0.i3(rfVar2, 300L);
            return true;
        }
        if (this.f46709a0) {
            this.h.setText(org.telegram.messenger.id.M0(2131748907, null));
        } else {
            this.h.setText(org.telegram.messenger.id.M0(2131748906, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.f28086p7);
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new yn(this, context));
        this.f46730r = this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
        this.f46725n = new org.telegram.ui.Components.hm0(context);
        this.f46708a = new zn(this, context, this.f46725n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f46708a, c8.ha.g());
        this.fragmentView = frameLayout;
        this.f46708a.setFillViewport(true);
        this.f46708a.setDrawBackground(true);
        this.f46708a.setOverScrollMode(0);
        this.f46708a.addView(this.f46725n, new FrameLayout.LayoutParams(-1, -2));
        this.f46725n.setOrientation(1);
        boolean z10 = this.f46726n0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743930, null));
        } else if (this.f46709a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749400, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46732s = linearLayout;
        linearLayout.setOrientation(1);
        this.f46725n.addView(this.f46732s, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f46717f = n4Var;
        n4Var.setHeight(46);
        if (this.f46709a0) {
            this.f46717f.setText(org.telegram.messenger.id.M0(2131752275, null));
        } else {
            this.f46717f.setText(org.telegram.messenger.id.M0(2131749391, null));
        }
        this.f46732s.addView(this.f46717f);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.f46735x = h6Var;
        if (this.f46709a0) {
            h6Var.b(org.telegram.messenger.id.M0(2131752329, null), org.telegram.messenger.id.M0(2131752328, null), false, this.V);
        } else {
            h6Var.b(org.telegram.messenger.id.M0(2131748641, null), org.telegram.messenger.id.M0(2131748640, null), false, this.V);
        }
        this.f46732s.addView(this.f46735x, c8.ha.o(-1, -2));
        this.f46735x.setOnClickListener(new wn(this, 1));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.f46734w = h6Var2;
        if (this.f46709a0) {
            h6Var2.b(org.telegram.messenger.id.M0(2131752318, null), org.telegram.messenger.id.M0(2131752315, null), false, !this.V);
        } else {
            h6Var2.b(org.telegram.messenger.id.M0(2131748638, null), org.telegram.messenger.id.M0(2131748637, null), false, !this.V);
        }
        this.f46732s.addView(this.f46734w, c8.ha.o(-1, -2));
        this.f46734w.setOnClickListener(new wn(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.J = y6Var;
        this.f46725n.addView(y6Var, c8.ha.o(-1, -2));
        if (z10) {
            this.f46735x.setVisibility(8);
            this.f46734w.setVisibility(8);
            this.J.setVisibility(8);
            this.f46717f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46725n.addView(this.D, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.f46715e = n4Var2;
        this.D.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, c8.ha.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f46712c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
        this.f46712c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f46712c;
        int i12 = org.telegram.ui.ActionBar.l6.H6;
        org.telegram.ui.ActionBar.s6.D(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f46712c;
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(editTextBoldCursor3, i13, null);
        this.f46712c.setMaxLines(1);
        this.f46712c.setLines(1);
        this.f46712c.setEnabled(false);
        this.f46712c.setBackground(null);
        this.f46712c.setPadding(0, 0, 0, 0);
        this.f46712c.setSingleLine(true);
        this.f46712c.setInputType(163840);
        this.f46712c.setImeOptions(6);
        this.E.addView(this.f46712c, c8.ha.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f46710b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.s6.D(this.f46710b, i12, null);
        org.telegram.ui.ActionBar.s6.U(this.f46710b, i13, null);
        this.f46710b.setMaxLines(1);
        this.f46710b.setLines(1);
        this.f46710b.setBackground(null);
        this.f46710b.setPadding(0, 0, 0, 0);
        this.f46710b.setSingleLine(true);
        this.f46710b.setInputType(163872);
        this.f46710b.setImeOptions(6);
        this.f46710b.setHint(org.telegram.messenger.id.M0(2131752266, null));
        org.telegram.ui.ActionBar.s6.v(this.f46710b, i13, null);
        this.f46710b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f46710b.setCursorWidth(1.5f);
        this.E.addView(this.f46710b, c8.ha.o(-1, 36));
        this.f46710b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.D.addView(this.F, c8.ha.o(-1, -2));
        org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(context, this, null, true, org.telegram.messenger.t3.T(this.X));
        this.G = r70Var;
        r70Var.setDelegate(new ao(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        bo boVar = new bo(this, context, this.resourceProvider);
        this.h = boVar;
        boVar.setBottomPadding(6);
        this.f46725n.addView(this.h, c8.ha.o(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.d = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.f46725n.addView(this.d, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.f46719g0 = t4Var;
        this.f46725n.addView(t4Var, c8.ha.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f46736y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f46725n.addView(this.f46736y, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.f46716e0 = y6Var2;
        this.f46725n.addView(y6Var2, c8.ha.o(-1, -2));
        org.telegram.ui.Components.hm0 hm0Var = this.f46725n;
        ho hoVar = new ho(this, context);
        this.K = hoVar;
        hm0Var.addView(hoVar, c8.ha.o(-1, -2));
        ho hoVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hoVar2.setVisibility(i7);
        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
        this.H = m8Var;
        m8Var.o(2131232204, org.telegram.messenger.id.M0(2131748695, null), false);
        this.H.setOnClickListener(new wn(this, 3));
        this.f46725n.addView(this.H, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.I = z8Var2;
        this.f46725n.addView(z8Var2, c8.ha.o(-1, -2));
        eo eoVar = new eo(this, context, this.X, context);
        this.U = eoVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f46709a0) {
            z9 = true;
        } else {
            z9 = false;
        }
        eoVar.c(z9);
        eo eoVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.z8 z8Var3 = eoVar2.f33893e;
        boolean V = org.telegram.messenger.t3.V(eoVar2.f33895n);
        boolean t02 = org.telegram.messenger.t3.t0(eoVar2.f33895n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.m5.r(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).a2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752301;
            } else if (t02) {
                i11 = 2131749402;
            } else {
                i11 = 2131749405;
            }
            z8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.id.a0(null, null, i11, str), org.telegram.ui.ActionBar.l6.Wl, null, new org.telegram.ui.Components.fq(26, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752302;
            } else if (t02) {
                i10 = 2131749403;
            } else {
                i10 = 2131749406;
            }
            z8Var3.setText(org.telegram.messenger.id.M0(i10, null));
        }
        this.f46725n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f46725n.addView(this.Q);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.R = n4Var3;
        n4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.id.M0(2131745863, null));
        this.Q.addView(this.R, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.S = r8Var;
        r8Var.f(org.telegram.messenger.id.M0(2131746062, null), this.f46711b0, false);
        this.S.setOnClickListener(new wn(this, 4));
        this.Q.addView(this.S, c8.ha.o(-1, -2));
        this.T = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        if (this.f46709a0 && !org.telegram.messenger.t3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.id.M0(2131746061, null));
        } else {
            this.T.setText(org.telegram.messenger.id.M0(2131746060, null));
        }
        this.Q.addView(this.T, c8.ha.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.f46710b.setText(K);
            this.f46710b.setSelection(K.length());
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
                this.f46724l0 = chatFull.exported_invite;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io.e0():void");
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.f56628n2 = this.f46709a0;
        i0Var.f56640z2 = new tn(this, 0);
        showDialog(i0Var);
    }

    public final void g0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.f46729q0);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.f46730r;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    @Override
    public final org.telegram.ui.Components.im0 getScrollViewForSimpleGlass() {
        return this.f46708a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.l6.f27957i6;
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28086p7));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        LinearLayout linearLayout = this.f46732s;
        int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46736y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46719g0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27939h6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46734w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46735x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
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
        if (!this.V && !this.f46713c0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.id.M0(2131752533, null));
            org.telegram.ui.Cells.z8 z8Var = this.d;
            int i17 = org.telegram.ui.ActionBar.l6.f28086p7;
            z8Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.s6.U(this.d.getTextView(), i17, null);
            this.D.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f46716e0.setVisibility(0);
            if (this.f46714d0) {
                this.f46719g0.setVisibility(0);
                this.f46736y.setVisibility(8);
            } else {
                this.f46719g0.setVisibility(8);
                this.f46736y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.l6.B6;
            z8Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.s6.U(this.d.getTextView(), i18, null);
            if (this.f46726n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f46716e0.setVisibility(8);
            this.f46736y.setVisibility(8);
            this.D.setVisibility(0);
            this.f46719g0.setVisibility(8);
            if (this.f46709a0) {
                org.telegram.ui.Cells.z8 z8Var3 = this.d;
                if (this.V) {
                    i14 = 2131752327;
                } else {
                    i14 = 2131752267;
                }
                z8Var3.setText(org.telegram.messenger.id.M0(i14, null));
                org.telegram.ui.Cells.n4 n4Var = this.f46715e;
                if (this.V) {
                    M02 = org.telegram.messenger.id.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.id.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.z8 z8Var4 = this.d;
                if (this.V) {
                    i7 = 2131748639;
                } else {
                    i7 = 2131748636;
                }
                z8Var4.setText(org.telegram.messenger.id.M0(i7, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.f46715e;
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
            org.telegram.ui.Components.r70 r70Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f46724l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            r70Var.setLink(str);
            this.G.c(this.f46724l0, this.Z);
            bo boVar = this.h;
            if (!this.V && boVar.f30988a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            boVar.setVisibility(i12);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.Z);
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.Z));
            org.telegram.ui.Cells.z8 z8Var5 = this.I;
            if (N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(M03)) {
                i13 = 2131748693;
            } else {
                i13 = 2131748694;
            }
            z8Var5.setText(org.telegram.messenger.id.M0(i13, null));
        }
        boolean z9 = true;
        this.f46734w.a(!this.V);
        this.f46735x.a(this.V);
        this.f46710b.clearFocus();
        eo eoVar = this.U;
        if (eoVar != null) {
            if (this.f46709a0 && !this.V) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            eoVar.setVisibility(i15);
            eo eoVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f46709a0) {
                z9 = false;
            }
            eoVar2.c(z9);
        }
        ho hoVar = this.K;
        if (hoVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i16 = 0;
            }
            hoVar.setVisibility(i16);
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
        if (this.f46726n0 && (iVar = this.f46710b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.K3(this.f46710b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io.onFragmentCreate():boolean");
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
            this.f46724l0 = tL_chatInviteExported;
            org.telegram.ui.Components.r70 r70Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            r70Var.setLink(str);
            this.G.c(this.f46724l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.f46719g0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f46719g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f46719g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27939h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f46736y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f46736y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f29593f);
                        nVar.f29589a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.n50 n50Var = this.f46728p0;
            if (n50Var != null) {
                n50Var.updateColors();
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
