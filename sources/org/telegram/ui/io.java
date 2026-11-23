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
public final class io extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.d80 H;
    public org.telegram.ui.Cells.m8 I;
    public org.telegram.ui.Cells.z8 J;
    public org.telegram.ui.Cells.y6 K;
    public ho L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ia P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.o4 S;
    public org.telegram.ui.Cells.r8 T;
    public org.telegram.ui.Cells.z8 U;
    public eo V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public zn f48861a;
    public long f48862a0;
    public ah.i f48863b;
    public boolean f48864b0;
    public EditTextBoldCursor f48865c;
    public boolean f48866c0;
    public org.telegram.ui.Cells.z8 d;
    public boolean f48867d0;
    public org.telegram.ui.Cells.o4 f48868e;
    public boolean f48869e0;
    public org.telegram.ui.Cells.o4 f48870f;
    public org.telegram.ui.Cells.y6 f48871f0;
    public ArrayList f48872g0;
    public bo h;
    public org.telegram.ui.Cells.u4 f48873h0;
    public int f48874i0;
    public String f48875j0;
    public ah f48876k0;
    public boolean f48877l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.um0 f48878n;
    public boolean f48879n0;
    public boolean f48880o0;
    public HashMap f48881p0;
    public org.telegram.ui.Components.x50 f48882q0;
    public org.telegram.ui.ActionBar.c5 f48883r;
    public tn f48884r0;
    public LinearLayout f48885s;
    public Boolean f48886s0;
    public boolean f48887t0;
    public org.telegram.ui.Cells.h6 f48888w;
    public org.telegram.ui.Cells.h6 f48889x;
    public LinearLayout f48890y;

    public static org.telegram.ui.ActionBar.i6 Z(io ioVar) {
        return ioVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29507g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var = this.f48883r;
        if (!this.W && this.f48863b.length() <= 0) {
            ArrayList arrayList = this.O;
            z10 = false;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            c5Var.a(z10, true);
        }
        z10 = true;
        c5Var.a(z10, true);
    }

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        ah ahVar = this.f48876k0;
        if (ahVar != null) {
            org.telegram.messenger.g0.r(ahVar);
            this.f48876k0 = null;
            this.f48875j0 = null;
            if (this.f48874i0 != 0) {
                getConnectionsManager().cancelRequest(this.f48874i0, true);
            }
        }
        this.f48877l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f48864b0) {
                            this.h.setText(org.telegram.messenger.gd.N0(2131748712, null));
                        } else {
                            this.h.setText(org.telegram.messenger.gd.N0(2131748711, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29672p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.gd.N0(2131748716, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29672p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.gd.N0(2131748716, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29672p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.gd.N0(2131748715, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29672p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.gd.N0(2131748729, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.F6);
            this.f48875j0 = str;
            ah ahVar2 = new ah(9, this, str);
            this.f48876k0 = ahVar2;
            org.telegram.messenger.g0.h3(ahVar2, 300L);
            return true;
        }
        if (this.f48864b0) {
            this.h.setText(org.telegram.messenger.gd.N0(2131748714, null));
        } else {
            this.h.setText(org.telegram.messenger.gd.N0(2131748713, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29672p7);
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new yn(this, context));
        this.f48883r = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        this.f48878n = new org.telegram.ui.Components.um0(context);
        this.f48861a = new zn(this, context, this.f48878n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f48861a, c8.na.g());
        this.fragmentView = frameLayout;
        this.f48861a.setFillViewport(true);
        this.f48861a.setDrawBackground(true);
        this.f48861a.setOverScrollMode(0);
        this.f48861a.addView(this.f48878n, new FrameLayout.LayoutParams(-1, -2));
        this.f48878n.setOrientation(1);
        boolean z11 = this.f48880o0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131743683, null));
        } else if (this.f48864b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752285, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131749207, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48885s = linearLayout;
        linearLayout.setOrientation(1);
        this.f48878n.addView(this.f48885s, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f48870f = o4Var;
        o4Var.setHeight(46);
        if (this.f48864b0) {
            this.f48870f.setText(org.telegram.messenger.gd.N0(2131752263, null));
        } else {
            this.f48870f.setText(org.telegram.messenger.gd.N0(2131749198, null));
        }
        this.f48885s.addView(this.f48870f);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.f48889x = h6Var;
        if (this.f48864b0) {
            h6Var.b(org.telegram.messenger.gd.N0(2131752317, null), org.telegram.messenger.gd.N0(2131752316, null), false, this.W);
        } else {
            h6Var.b(org.telegram.messenger.gd.N0(2131748448, null), org.telegram.messenger.gd.N0(2131748447, null), false, this.W);
        }
        this.f48885s.addView(this.f48889x, c8.na.o(-1, -2));
        this.f48889x.setOnClickListener(new wn(this, 1));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.f48888w = h6Var2;
        if (this.f48864b0) {
            h6Var2.b(org.telegram.messenger.gd.N0(2131752306, null), org.telegram.messenger.gd.N0(2131752303, null), false, !this.W);
        } else {
            h6Var2.b(org.telegram.messenger.gd.N0(2131748445, null), org.telegram.messenger.gd.N0(2131748444, null), false, !this.W);
        }
        this.f48885s.addView(this.f48888w, c8.na.o(-1, -2));
        this.f48888w.setOnClickListener(new wn(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        this.K = y6Var;
        this.f48878n.addView(y6Var, c8.na.o(-1, -2));
        if (z11) {
            this.f48889x.setVisibility(8);
            this.f48888w.setVisibility(8);
            this.K.setVisibility(8);
            this.f48870f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f48878n.addView(this.E, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, 23);
        this.f48868e = o4Var2;
        this.E.addView(o4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, c8.na.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f48865c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().X2 + "/");
        this.f48865c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f48865c;
        int i12 = org.telegram.ui.ActionBar.n6.H6;
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f48865c;
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor3, i13, null);
        this.f48865c.setMaxLines(1);
        this.f48865c.setLines(1);
        this.f48865c.setEnabled(false);
        this.f48865c.setBackground(null);
        this.f48865c.setPadding(0, 0, 0, 0);
        this.f48865c.setSingleLine(true);
        this.f48865c.setInputType(163840);
        this.f48865c.setImeOptions(6);
        this.F.addView(this.f48865c, c8.na.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f48863b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(this.f48863b, i12, null);
        org.telegram.ui.ActionBar.u6.U(this.f48863b, i13, null);
        this.f48863b.setMaxLines(1);
        this.f48863b.setLines(1);
        this.f48863b.setBackground(null);
        this.f48863b.setPadding(0, 0, 0, 0);
        this.f48863b.setSingleLine(true);
        this.f48863b.setInputType(163872);
        this.f48863b.setImeOptions(6);
        this.f48863b.setHint(org.telegram.messenger.gd.N0(2131752254, null));
        org.telegram.ui.ActionBar.u6.v(this.f48863b, i13, null);
        this.f48863b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f48863b.setCursorWidth(1.5f);
        this.F.addView(this.f48863b, c8.na.o(-1, 36));
        this.f48863b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, c8.na.o(-1, -2));
        org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(context, this, null, true, org.telegram.messenger.v3.T(this.Y));
        this.H = d80Var;
        d80Var.setDelegate(new ao(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        bo boVar = new bo(this, context, this.resourceProvider);
        this.h = boVar;
        boVar.setBottomPadding(6);
        this.f48878n.addView(this.h, c8.na.o(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.d = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.f48878n.addView(this.d, c8.na.o(-1, -2));
        org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
        this.f48873h0 = u4Var;
        this.f48878n.addView(u4Var, c8.na.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f48890y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f48878n.addView(this.f48890y, c8.na.o(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        this.f48871f0 = y6Var2;
        this.f48878n.addView(y6Var2, c8.na.o(-1, -2));
        org.telegram.ui.Components.um0 um0Var = this.f48878n;
        ho hoVar = new ho(this, context);
        this.L = hoVar;
        um0Var.addView(hoVar, c8.na.o(-1, -2));
        ho hoVar2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hoVar2.setVisibility(i7);
        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
        this.I = m8Var;
        m8Var.o(2131232209, org.telegram.messenger.gd.N0(2131748502, null), false);
        this.I.setOnClickListener(new wn(this, 3));
        this.f48878n.addView(this.I, c8.na.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.J = z8Var2;
        this.f48878n.addView(z8Var2, c8.na.o(-1, -2));
        eo eoVar = new eo(this, context, this.Y, context);
        this.V = eoVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f48864b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.c(z10);
        eo eoVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.z8 z8Var3 = eoVar2.f39521e;
        boolean V = org.telegram.messenger.v3.V(eoVar2.f39523n);
        boolean t02 = org.telegram.messenger.v3.t0(eoVar2.f39523n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.n5.r(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).c2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752289;
            } else if (t02) {
                i11 = 2131749209;
            } else {
                i11 = 2131749212;
            }
            z8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.a0(null, null, i11, str), org.telegram.ui.ActionBar.n6.Zl, null, new org.telegram.ui.Components.bt(20, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752290;
            } else if (t02) {
                i10 = 2131749210;
            } else {
                i10 = 2131749213;
            }
            z8Var3.setText(org.telegram.messenger.gd.N0(i10, null));
        }
        this.f48878n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f48878n.addView(this.R);
        org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context, 23);
        this.S = o4Var3;
        o4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.gd.N0(2131745667, null));
        this.R.addView(this.S, c8.na.o(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.T = r8Var;
        r8Var.f(org.telegram.messenger.gd.N0(2131745866, null), this.f48866c0, false);
        this.T.setOnClickListener(new wn(this, 4));
        this.R.addView(this.T, c8.na.o(-1, -2));
        this.U = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        if (this.f48864b0 && !org.telegram.messenger.v3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.gd.N0(2131745865, null));
        } else {
            this.U.setText(org.telegram.messenger.gd.N0(2131745864, null));
        }
        this.R.addView(this.U, c8.na.o(-1, -2));
        String K = org.telegram.messenger.v3.K(this.Y, true);
        if (!this.W && K != null) {
            this.f48879n0 = true;
            this.f48863b.setText(K);
            this.f48863b.setSelection(K.length());
            this.f48879n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.f48862a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hi.k3(5, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28493id == this.f48862a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.ks.f25325y1) {
            if ((-this.f48862a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getLastFragment() == this) {
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
        ug.k0 k0Var = new ug.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f58864r2 = this.f48864b0;
        k0Var.D2 = new tn(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.f48884r0);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.f48883r;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.vm0 getScrollViewForSimpleGlass() {
        return this.f48861a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        LinearLayout linearLayout = this.f48885s;
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48890y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48873h0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48888w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48889x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    public final void h0() {
        int i7;
        String N0;
        int i10;
        int i11;
        int L;
        String str;
        int i12;
        int i13;
        int i14;
        String N02;
        int i15;
        if (this.K == null) {
            return;
        }
        int i16 = 8;
        if (!this.W && !this.f48867d0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.gd.N0(2131752521, null));
            org.telegram.ui.Cells.z8 z8Var = this.d;
            int i17 = org.telegram.ui.ActionBar.n6.f29672p7;
            z8Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.u6.U(this.d.getTextView(), i17, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f48871f0.setVisibility(0);
            if (this.f48869e0) {
                this.f48873h0.setVisibility(0);
                this.f48890y.setVisibility(8);
            } else {
                this.f48873h0.setVisibility(8);
                this.f48890y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.n6.B6;
            z8Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.u6.U(this.d.getTextView(), i18, null);
            if (this.f48880o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f48871f0.setVisibility(8);
            this.f48890y.setVisibility(8);
            this.E.setVisibility(0);
            this.f48873h0.setVisibility(8);
            if (this.f48864b0) {
                org.telegram.ui.Cells.z8 z8Var3 = this.d;
                if (this.W) {
                    i14 = 2131752315;
                } else {
                    i14 = 2131752255;
                }
                z8Var3.setText(org.telegram.messenger.gd.N0(i14, null));
                org.telegram.ui.Cells.o4 o4Var = this.f48868e;
                if (this.W) {
                    N02 = org.telegram.messenger.gd.N0(2131752391, null);
                } else {
                    N02 = org.telegram.messenger.gd.N0(2131752373, null);
                }
                o4Var.setText(N02);
            } else {
                org.telegram.ui.Cells.z8 z8Var4 = this.d;
                if (this.W) {
                    i7 = 2131748446;
                } else {
                    i7 = 2131748443;
                }
                z8Var4.setText(org.telegram.messenger.gd.N0(i7, null));
                org.telegram.ui.Cells.o4 o4Var2 = this.f48868e;
                if (this.W) {
                    N0 = org.telegram.messenger.gd.N0(2131752391, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131752373, null);
                }
                o4Var2.setText(N0);
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
            org.telegram.ui.Components.d80 d80Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            d80Var.setLink(str);
            this.H.c(this.m0, this.f48862a0);
            bo boVar = this.h;
            if (!this.W && boVar.f32612a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            boVar.setVisibility(i12);
            TLRPC.ChatFull P0 = getMessagesController().P0(this.f48862a0);
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f48862a0));
            org.telegram.ui.Cells.z8 z8Var5 = this.J;
            if (P0 != null && P0.paid_media_allowed && org.telegram.messenger.v3.V(O0)) {
                i13 = 2131748500;
            } else {
                i13 = 2131748501;
            }
            z8Var5.setText(org.telegram.messenger.gd.N0(i13, null));
        }
        boolean z10 = true;
        this.f48888w.a(!this.W);
        this.f48889x.a(this.W);
        this.f48863b.clearFocus();
        eo eoVar = this.V;
        if (eoVar != null) {
            if (this.f48864b0 && !this.W) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            eoVar.setVisibility(i15);
            eo eoVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f48864b0) {
                z10 = false;
            }
            eoVar2.c(z10);
        }
        ho hoVar = this.L;
        if (hoVar != null) {
            if (!this.W && !this.O.isEmpty()) {
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
        if (this.f48880o0 && (iVar = this.f48863b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.I3(this.f48863b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25325y1);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            org.telegram.ui.Components.d80 d80Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            d80Var.setLink(str);
            this.H.c(this.m0, this.f48862a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.u4 u4Var = this.f48873h0;
            if (u4Var != null && u4Var.getChildCount() > 0 && (this.f48873h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f48873h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29525h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f48890y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f48890y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f31192f);
                        nVar.f31188a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.x50 x50Var = this.f48882q0;
            if (x50Var != null) {
                x50Var.updateColors();
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
