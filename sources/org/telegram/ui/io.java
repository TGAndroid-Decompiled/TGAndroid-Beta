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
public final class io extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.g80 H;
    public org.telegram.ui.Cells.n8 I;
    public org.telegram.ui.Cells.a9 J;
    public org.telegram.ui.Cells.z6 K;
    public ho L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ia P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.o4 S;
    public org.telegram.ui.Cells.s8 T;
    public org.telegram.ui.Cells.a9 U;
    public eo V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public zn f48777a;
    public long f48778a0;
    public ah.i f48779b;
    public boolean f48780b0;
    public EditTextBoldCursor f48781c;
    public boolean f48782c0;
    public org.telegram.ui.Cells.a9 d;
    public boolean f48783d0;
    public org.telegram.ui.Cells.o4 f48784e;
    public boolean f48785e0;
    public org.telegram.ui.Cells.o4 f48786f;
    public org.telegram.ui.Cells.z6 f48787f0;
    public ArrayList f48788g0;
    public bo h;
    public org.telegram.ui.Cells.u4 f48789h0;
    public int f48790i0;
    public String f48791j0;
    public ci f48792k0;
    public boolean f48793l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.um0 f48794n;
    public boolean f48795n0;
    public boolean f48796o0;
    public HashMap f48797p0;
    public org.telegram.ui.Components.a60 f48798q0;
    public org.telegram.ui.ActionBar.c5 f48799r;
    public tn f48800r0;
    public LinearLayout f48801s;
    public Boolean f48802s0;
    public boolean f48803t0;
    public org.telegram.ui.Cells.i6 f48804w;
    public org.telegram.ui.Cells.i6 f48805x;
    public LinearLayout f48806y;

    public static org.telegram.ui.ActionBar.h6 Z(io ioVar) {
        return ioVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29512m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29739y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29758z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29403g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29701w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var = this.f48799r;
        if (!this.W && this.f48779b.length() <= 0) {
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
        ci ciVar = this.f48792k0;
        if (ciVar != null) {
            org.telegram.messenger.g0.r(ciVar);
            this.f48792k0 = null;
            this.f48791j0 = null;
            if (this.f48790i0 != 0) {
                getConnectionsManager().cancelRequest(this.f48790i0, true);
            }
        }
        this.f48793l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f48780b0) {
                            this.h.setText(org.telegram.messenger.hd.N0(2131748712, null));
                        } else {
                            this.h.setText(org.telegram.messenger.hd.N0(2131748711, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29568p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.hd.N0(2131748716, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29568p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.hd.N0(2131748716, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29568p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.hd.N0(2131748715, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29568p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.hd.N0(2131748729, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.F6);
            this.f48791j0 = str;
            ci ciVar2 = new ci(5, this, str);
            this.f48792k0 = ciVar2;
            org.telegram.messenger.g0.h3(ciVar2, 300L);
            return true;
        }
        if (this.f48780b0) {
            this.h.setText(org.telegram.messenger.hd.N0(2131748714, null));
        } else {
            this.h.setText(org.telegram.messenger.hd.N0(2131748713, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29568p7);
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new yn(this, context));
        this.f48799r = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        this.f48794n = new org.telegram.ui.Components.um0(context);
        this.f48777a = new zn(this, context, this.f48794n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f48777a, c8.na.g());
        this.fragmentView = frameLayout;
        this.f48777a.setFillViewport(true);
        this.f48777a.setDrawBackground(true);
        this.f48777a.setOverScrollMode(0);
        this.f48777a.addView(this.f48794n, new FrameLayout.LayoutParams(-1, -2));
        this.f48794n.setOrientation(1);
        boolean z11 = this.f48796o0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131743687, null));
        } else if (this.f48780b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752285, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131749207, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48801s = linearLayout;
        linearLayout.setOrientation(1);
        this.f48794n.addView(this.f48801s, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f48786f = o4Var;
        o4Var.setHeight(46);
        if (this.f48780b0) {
            this.f48786f.setText(org.telegram.messenger.hd.N0(2131752263, null));
        } else {
            this.f48786f.setText(org.telegram.messenger.hd.N0(2131749198, null));
        }
        this.f48801s.addView(this.f48786f);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f48805x = i6Var;
        if (this.f48780b0) {
            i6Var.b(org.telegram.messenger.hd.N0(2131752317, null), org.telegram.messenger.hd.N0(2131752316, null), false, this.W);
        } else {
            i6Var.b(org.telegram.messenger.hd.N0(2131748448, null), org.telegram.messenger.hd.N0(2131748447, null), false, this.W);
        }
        this.f48801s.addView(this.f48805x, c8.na.o(-1, -2));
        this.f48805x.setOnClickListener(new wn(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.f48804w = i6Var2;
        if (this.f48780b0) {
            i6Var2.b(org.telegram.messenger.hd.N0(2131752306, null), org.telegram.messenger.hd.N0(2131752303, null), false, !this.W);
        } else {
            i6Var2.b(org.telegram.messenger.hd.N0(2131748445, null), org.telegram.messenger.hd.N0(2131748444, null), false, !this.W);
        }
        this.f48801s.addView(this.f48804w, c8.na.o(-1, -2));
        this.f48804w.setOnClickListener(new wn(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.K = z6Var;
        this.f48794n.addView(z6Var, c8.na.o(-1, -2));
        if (z11) {
            this.f48805x.setVisibility(8);
            this.f48804w.setVisibility(8);
            this.K.setVisibility(8);
            this.f48786f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f48794n.addView(this.E, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, 23);
        this.f48784e = o4Var2;
        this.E.addView(o4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, c8.na.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f48781c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().X2 + "/");
        this.f48781c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f48781c;
        int i12 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f48781c;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor3, i13, null);
        this.f48781c.setMaxLines(1);
        this.f48781c.setLines(1);
        this.f48781c.setEnabled(false);
        this.f48781c.setBackground(null);
        this.f48781c.setPadding(0, 0, 0, 0);
        this.f48781c.setSingleLine(true);
        this.f48781c.setInputType(163840);
        this.f48781c.setImeOptions(6);
        this.F.addView(this.f48781c, c8.na.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f48779b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f48779b, i12, null);
        org.telegram.ui.ActionBar.t6.U(this.f48779b, i13, null);
        this.f48779b.setMaxLines(1);
        this.f48779b.setLines(1);
        this.f48779b.setBackground(null);
        this.f48779b.setPadding(0, 0, 0, 0);
        this.f48779b.setSingleLine(true);
        this.f48779b.setInputType(163872);
        this.f48779b.setImeOptions(6);
        this.f48779b.setHint(org.telegram.messenger.hd.N0(2131752254, null));
        org.telegram.ui.ActionBar.t6.v(this.f48779b, i13, null);
        this.f48779b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f48779b.setCursorWidth(1.5f);
        this.F.addView(this.f48779b, c8.na.o(-1, 36));
        this.f48779b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, c8.na.o(-1, -2));
        org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(context, this, null, true, org.telegram.messenger.v3.T(this.Y));
        this.H = g80Var;
        g80Var.setDelegate(new ao(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        bo boVar = new bo(this, context, this.resourceProvider);
        this.h = boVar;
        boVar.setBottomPadding(6);
        this.f48794n.addView(this.h, c8.na.o(-2, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.d = a9Var;
        a9Var.setImportantForAccessibility(1);
        this.f48794n.addView(this.d, c8.na.o(-1, -2));
        org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
        this.f48789h0 = u4Var;
        this.f48794n.addView(u4Var, c8.na.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f48806y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f48794n.addView(this.f48806y, c8.na.o(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.f48787f0 = z6Var2;
        this.f48794n.addView(z6Var2, c8.na.o(-1, -2));
        org.telegram.ui.Components.um0 um0Var = this.f48794n;
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
        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
        this.I = n8Var;
        n8Var.o(2131232206, org.telegram.messenger.hd.N0(2131748502, null), false);
        this.I.setOnClickListener(new wn(this, 3));
        this.f48794n.addView(this.I, c8.na.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.J = a9Var2;
        this.f48794n.addView(a9Var2, c8.na.o(-1, -2));
        eo eoVar = new eo(this, context, this.Y, context);
        this.V = eoVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f48780b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.c(z10);
        eo eoVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.a9 a9Var3 = eoVar2.f40653e;
        boolean V = org.telegram.messenger.v3.V(eoVar2.f40655n);
        boolean t02 = org.telegram.messenger.v3.t0(eoVar2.f40655n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.n5.r(org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).c2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752289;
            } else if (t02) {
                i11 = 2131749209;
            } else {
                i11 = 2131749212;
            }
            a9Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, i11, str), org.telegram.ui.ActionBar.m6.Zl, null, new org.telegram.ui.Components.fw(16, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752290;
            } else if (t02) {
                i10 = 2131749210;
            } else {
                i10 = 2131749213;
            }
            a9Var3.setText(org.telegram.messenger.hd.N0(i10, null));
        }
        this.f48794n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f48794n.addView(this.R);
        org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context, 23);
        this.S = o4Var3;
        o4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.hd.N0(2131745667, null));
        this.R.addView(this.S, c8.na.o(-1, -2));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.T = s8Var;
        s8Var.f(org.telegram.messenger.hd.N0(2131745866, null), this.f48782c0, false);
        this.T.setOnClickListener(new wn(this, 4));
        this.R.addView(this.T, c8.na.o(-1, -2));
        this.U = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        if (this.f48780b0 && !org.telegram.messenger.v3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.hd.N0(2131745865, null));
        } else {
            this.U.setText(org.telegram.messenger.hd.N0(2131745864, null));
        }
        this.R.addView(this.U, c8.na.o(-1, -2));
        String K = org.telegram.messenger.v3.K(this.Y, true);
        if (!this.W && K != null) {
            this.f48795n0 = true;
            this.f48779b.setText(K);
            this.f48779b.setSelection(K.length());
            this.f48795n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.f48778a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hi.b3(5, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28399id == this.f48778a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.ls.f25384y1) {
            if ((-this.f48778a0) == ((Long) objArr[0]).longValue()) {
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
        k0Var.f58749r2 = this.f48780b0;
        k0Var.D2 = new tn(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.f48800r0);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.f48799r;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.vm0 getScrollViewForSimpleGlass() {
        return this.f48777a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.f29439i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29568p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        LinearLayout linearLayout = this.f48801s;
        int i10 = org.telegram.ui.ActionBar.m6.f29347d6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48806y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48789h0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29421h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48804w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48805x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
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
        if (!this.W && !this.f48783d0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.hd.N0(2131752521, null));
            org.telegram.ui.Cells.a9 a9Var = this.d;
            int i17 = org.telegram.ui.ActionBar.m6.f29568p7;
            a9Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.t6.U(this.d.getTextView(), i17, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f48787f0.setVisibility(0);
            if (this.f48785e0) {
                this.f48789h0.setVisibility(0);
                this.f48806y.setVisibility(8);
            } else {
                this.f48789h0.setVisibility(8);
                this.f48806y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.m6.B6;
            a9Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.t6.U(this.d.getTextView(), i18, null);
            if (this.f48796o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f48787f0.setVisibility(8);
            this.f48806y.setVisibility(8);
            this.E.setVisibility(0);
            this.f48789h0.setVisibility(8);
            if (this.f48780b0) {
                org.telegram.ui.Cells.a9 a9Var3 = this.d;
                if (this.W) {
                    i14 = 2131752315;
                } else {
                    i14 = 2131752255;
                }
                a9Var3.setText(org.telegram.messenger.hd.N0(i14, null));
                org.telegram.ui.Cells.o4 o4Var = this.f48784e;
                if (this.W) {
                    N02 = org.telegram.messenger.hd.N0(2131752391, null);
                } else {
                    N02 = org.telegram.messenger.hd.N0(2131752373, null);
                }
                o4Var.setText(N02);
            } else {
                org.telegram.ui.Cells.a9 a9Var4 = this.d;
                if (this.W) {
                    i7 = 2131748446;
                } else {
                    i7 = 2131748443;
                }
                a9Var4.setText(org.telegram.messenger.hd.N0(i7, null));
                org.telegram.ui.Cells.o4 o4Var2 = this.f48784e;
                if (this.W) {
                    N0 = org.telegram.messenger.hd.N0(2131752391, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131752373, null);
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
            org.telegram.ui.Components.g80 g80Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            g80Var.setLink(str);
            this.H.c(this.m0, this.f48778a0);
            bo boVar = this.h;
            if (!this.W && boVar.f30394a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            boVar.setVisibility(i12);
            TLRPC.ChatFull P0 = getMessagesController().P0(this.f48778a0);
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f48778a0));
            org.telegram.ui.Cells.a9 a9Var5 = this.J;
            if (P0 != null && P0.paid_media_allowed && org.telegram.messenger.v3.V(O0)) {
                i13 = 2131748500;
            } else {
                i13 = 2131748501;
            }
            a9Var5.setText(org.telegram.messenger.hd.N0(i13, null));
        }
        boolean z10 = true;
        this.f48804w.a(!this.W);
        this.f48805x.a(this.W);
        this.f48779b.clearFocus();
        eo eoVar = this.V;
        if (eoVar != null) {
            if (this.f48780b0 && !this.W) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            eoVar.setVisibility(i15);
            eo eoVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f48780b0) {
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
        if (this.f48796o0 && (iVar = this.f48779b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.I3(this.f48779b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.T);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25384y1);
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
            org.telegram.ui.Components.g80 g80Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            g80Var.setLink(str);
            this.H.c(this.m0, this.f48778a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.u4 u4Var = this.f48789h0;
            if (u4Var != null && u4Var.getChildCount() > 0 && (this.f48789h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f48789h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29421h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f48806y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f48806y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f31089f);
                        nVar.f31085a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.a60 a60Var = this.f48798q0;
            if (a60Var != null) {
                a60Var.updateColors();
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
