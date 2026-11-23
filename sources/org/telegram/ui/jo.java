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
public final class jo extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.g80 H;
    public org.telegram.ui.Cells.n8 I;
    public org.telegram.ui.Cells.a9 J;
    public org.telegram.ui.Cells.z6 K;
    public io L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ia P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.o4 S;
    public org.telegram.ui.Cells.s8 T;
    public org.telegram.ui.Cells.a9 U;
    public fo V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public ao f49032a;
    public long f49033a0;
    public ah.i f49034b;
    public boolean f49035b0;
    public EditTextBoldCursor f49036c;
    public boolean f49037c0;
    public org.telegram.ui.Cells.a9 d;
    public boolean f49038d0;
    public org.telegram.ui.Cells.o4 f49039e;
    public boolean f49040e0;
    public org.telegram.ui.Cells.o4 f49041f;
    public org.telegram.ui.Cells.z6 f49042f0;
    public ArrayList f49043g0;
    public co h;
    public org.telegram.ui.Cells.u4 f49044h0;
    public int f49045i0;
    public String f49046j0;
    public eh f49047k0;
    public boolean f49048l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.vm0 f49049n;
    public boolean f49050n0;
    public boolean f49051o0;
    public HashMap f49052p0;
    public org.telegram.ui.Components.a60 f49053q0;
    public org.telegram.ui.ActionBar.c5 f49054r;
    public tn f49055r0;
    public LinearLayout f49056s;
    public Boolean f49057s0;
    public boolean f49058t0;
    public org.telegram.ui.Cells.i6 f49059w;
    public org.telegram.ui.Cells.i6 f49060x;
    public LinearLayout f49061y;

    public static org.telegram.ui.ActionBar.h6 Z(jo joVar) {
        return joVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29437g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29735w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var = this.f49054r;
        if (!this.W && this.f49034b.length() <= 0) {
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
        eh ehVar = this.f49047k0;
        if (ehVar != null) {
            org.telegram.messenger.g0.r(ehVar);
            this.f49047k0 = null;
            this.f49046j0 = null;
            if (this.f49045i0 != 0) {
                getConnectionsManager().cancelRequest(this.f49045i0, true);
            }
        }
        this.f49048l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f49035b0) {
                            this.h.setText(org.telegram.messenger.hd.N0(2131748712, null));
                        } else {
                            this.h.setText(org.telegram.messenger.hd.N0(2131748711, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29602p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.hd.N0(2131748716, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29602p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.hd.N0(2131748716, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29602p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.hd.N0(2131748715, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29602p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.hd.N0(2131748729, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.F6);
            this.f49046j0 = str;
            eh ehVar2 = new eh(7, this, str);
            this.f49047k0 = ehVar2;
            org.telegram.messenger.g0.h3(ehVar2, 300L);
            return true;
        }
        if (this.f49035b0) {
            this.h.setText(org.telegram.messenger.hd.N0(2131748714, null));
        } else {
            this.h.setText(org.telegram.messenger.hd.N0(2131748713, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.f29602p7);
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new zn(this, context));
        this.f49054r = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        this.f49049n = new org.telegram.ui.Components.vm0(context);
        this.f49032a = new ao(this, context, this.f49049n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f49032a, c8.ma.g());
        this.fragmentView = frameLayout;
        this.f49032a.setFillViewport(true);
        this.f49032a.setDrawBackground(true);
        this.f49032a.setOverScrollMode(0);
        this.f49032a.addView(this.f49049n, new FrameLayout.LayoutParams(-1, -2));
        this.f49049n.setOrientation(1);
        boolean z11 = this.f49051o0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131743685, null));
        } else if (this.f49035b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752285, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131749207, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49056s = linearLayout;
        linearLayout.setOrientation(1);
        this.f49049n.addView(this.f49056s, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f49041f = o4Var;
        o4Var.setHeight(46);
        if (this.f49035b0) {
            this.f49041f.setText(org.telegram.messenger.hd.N0(2131752263, null));
        } else {
            this.f49041f.setText(org.telegram.messenger.hd.N0(2131749198, null));
        }
        this.f49056s.addView(this.f49041f);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f49060x = i6Var;
        if (this.f49035b0) {
            i6Var.b(org.telegram.messenger.hd.N0(2131752317, null), org.telegram.messenger.hd.N0(2131752316, null), false, this.W);
        } else {
            i6Var.b(org.telegram.messenger.hd.N0(2131748448, null), org.telegram.messenger.hd.N0(2131748447, null), false, this.W);
        }
        this.f49056s.addView(this.f49060x, c8.ma.o(-1, -2));
        this.f49060x.setOnClickListener(new xn(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.f49059w = i6Var2;
        if (this.f49035b0) {
            i6Var2.b(org.telegram.messenger.hd.N0(2131752306, null), org.telegram.messenger.hd.N0(2131752303, null), false, !this.W);
        } else {
            i6Var2.b(org.telegram.messenger.hd.N0(2131748445, null), org.telegram.messenger.hd.N0(2131748444, null), false, !this.W);
        }
        this.f49056s.addView(this.f49059w, c8.ma.o(-1, -2));
        this.f49059w.setOnClickListener(new xn(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.K = z6Var;
        this.f49049n.addView(z6Var, c8.ma.o(-1, -2));
        if (z11) {
            this.f49060x.setVisibility(8);
            this.f49059w.setVisibility(8);
            this.K.setVisibility(8);
            this.f49041f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f49049n.addView(this.E, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, 23);
        this.f49039e = o4Var2;
        this.E.addView(o4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, c8.ma.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f49036c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().X2 + "/");
        this.f49036c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f49036c;
        int i12 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f49036c;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor3, i13, null);
        this.f49036c.setMaxLines(1);
        this.f49036c.setLines(1);
        this.f49036c.setEnabled(false);
        this.f49036c.setBackground(null);
        this.f49036c.setPadding(0, 0, 0, 0);
        this.f49036c.setSingleLine(true);
        this.f49036c.setInputType(163840);
        this.f49036c.setImeOptions(6);
        this.F.addView(this.f49036c, c8.ma.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f49034b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f49034b, i12, null);
        org.telegram.ui.ActionBar.t6.U(this.f49034b, i13, null);
        this.f49034b.setMaxLines(1);
        this.f49034b.setLines(1);
        this.f49034b.setBackground(null);
        this.f49034b.setPadding(0, 0, 0, 0);
        this.f49034b.setSingleLine(true);
        this.f49034b.setInputType(163872);
        this.f49034b.setImeOptions(6);
        this.f49034b.setHint(org.telegram.messenger.hd.N0(2131752254, null));
        org.telegram.ui.ActionBar.t6.v(this.f49034b, i13, null);
        this.f49034b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f49034b.setCursorWidth(1.5f);
        this.F.addView(this.f49034b, c8.ma.o(-1, 36));
        this.f49034b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, c8.ma.o(-1, -2));
        org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(context, this, null, true, org.telegram.messenger.v3.T(this.Y));
        this.H = g80Var;
        g80Var.setDelegate(new bo(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        co coVar = new co(this, context, this.resourceProvider);
        this.h = coVar;
        coVar.setBottomPadding(6);
        this.f49049n.addView(this.h, c8.ma.o(-2, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.d = a9Var;
        a9Var.setImportantForAccessibility(1);
        this.f49049n.addView(this.d, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
        this.f49044h0 = u4Var;
        this.f49049n.addView(u4Var, c8.ma.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f49061y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f49049n.addView(this.f49061y, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.f49042f0 = z6Var2;
        this.f49049n.addView(z6Var2, c8.ma.o(-1, -2));
        org.telegram.ui.Components.vm0 vm0Var = this.f49049n;
        io ioVar = new io(this, context);
        this.L = ioVar;
        vm0Var.addView(ioVar, c8.ma.o(-1, -2));
        io ioVar2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ioVar2.setVisibility(i7);
        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
        this.I = n8Var;
        n8Var.o(2131232206, org.telegram.messenger.hd.N0(2131748502, null), false);
        this.I.setOnClickListener(new xn(this, 3));
        this.f49049n.addView(this.I, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.J = a9Var2;
        this.f49049n.addView(a9Var2, c8.ma.o(-1, -2));
        fo foVar = new fo(this, context, this.Y, context);
        this.V = foVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f49035b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        foVar.c(z10);
        fo foVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.a9 a9Var3 = foVar2.f40702e;
        boolean V = org.telegram.messenger.v3.V(foVar2.f40704n);
        boolean t02 = org.telegram.messenger.v3.t0(foVar2.f40704n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.n5.r(org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).c2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752289;
            } else if (t02) {
                i11 = 2131749209;
            } else {
                i11 = 2131749212;
            }
            a9Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, i11, str), org.telegram.ui.ActionBar.m6.Zl, null, new org.telegram.ui.Components.ou(18, chatFull2, this), false));
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
        this.f49049n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f49049n.addView(this.R);
        org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context, 23);
        this.S = o4Var3;
        o4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.hd.N0(2131745667, null));
        this.R.addView(this.S, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.T = s8Var;
        s8Var.f(org.telegram.messenger.hd.N0(2131745866, null), this.f49037c0, false);
        this.T.setOnClickListener(new xn(this, 4));
        this.R.addView(this.T, c8.ma.o(-1, -2));
        this.U = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        if (this.f49035b0 && !org.telegram.messenger.v3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.hd.N0(2131745865, null));
        } else {
            this.U.setText(org.telegram.messenger.hd.N0(2131745864, null));
        }
        this.R.addView(this.U, c8.ma.o(-1, -2));
        String K = org.telegram.messenger.v3.K(this.Y, true);
        if (!this.W && K != null) {
            this.f49050n0 = true;
            this.f49034b.setText(K);
            this.f49034b.setSelection(K.length());
            this.f49050n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.f49033a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hi.b3(5, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28435id == this.f49033a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.ls.f25420y1) {
            if ((-this.f49033a0) == ((Long) objArr[0]).longValue()) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jo.e0():void");
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f58784r2 = this.f49035b0;
        k0Var.D2 = new tn(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.f49055r0);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.f49054r;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.wm0 getScrollViewForSimpleGlass() {
        return this.f49032a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.f29473i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29602p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        LinearLayout linearLayout = this.f49056s;
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49061y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49044h0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49059w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49060x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
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
        if (!this.W && !this.f49038d0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.hd.N0(2131752521, null));
            org.telegram.ui.Cells.a9 a9Var = this.d;
            int i17 = org.telegram.ui.ActionBar.m6.f29602p7;
            a9Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.t6.U(this.d.getTextView(), i17, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f49042f0.setVisibility(0);
            if (this.f49040e0) {
                this.f49044h0.setVisibility(0);
                this.f49061y.setVisibility(8);
            } else {
                this.f49044h0.setVisibility(8);
                this.f49061y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.m6.B6;
            a9Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.t6.U(this.d.getTextView(), i18, null);
            if (this.f49051o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f49042f0.setVisibility(8);
            this.f49061y.setVisibility(8);
            this.E.setVisibility(0);
            this.f49044h0.setVisibility(8);
            if (this.f49035b0) {
                org.telegram.ui.Cells.a9 a9Var3 = this.d;
                if (this.W) {
                    i14 = 2131752315;
                } else {
                    i14 = 2131752255;
                }
                a9Var3.setText(org.telegram.messenger.hd.N0(i14, null));
                org.telegram.ui.Cells.o4 o4Var = this.f49039e;
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
                org.telegram.ui.Cells.o4 o4Var2 = this.f49039e;
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
            this.H.c(this.m0, this.f49033a0);
            co coVar = this.h;
            if (!this.W && coVar.f30428a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            coVar.setVisibility(i12);
            TLRPC.ChatFull P0 = getMessagesController().P0(this.f49033a0);
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f49033a0));
            org.telegram.ui.Cells.a9 a9Var5 = this.J;
            if (P0 != null && P0.paid_media_allowed && org.telegram.messenger.v3.V(O0)) {
                i13 = 2131748500;
            } else {
                i13 = 2131748501;
            }
            a9Var5.setText(org.telegram.messenger.hd.N0(i13, null));
        }
        boolean z10 = true;
        this.f49059w.a(!this.W);
        this.f49060x.a(this.W);
        this.f49034b.clearFocus();
        fo foVar = this.V;
        if (foVar != null) {
            if (this.f49035b0 && !this.W) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            foVar.setVisibility(i15);
            fo foVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f49035b0) {
                z10 = false;
            }
            foVar2.c(z10);
        }
        io ioVar = this.L;
        if (ioVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i16 = 0;
            }
            ioVar.setVisibility(i16);
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
        if (this.f49051o0 && (iVar = this.f49034b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.I3(this.f49034b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.T);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25420y1);
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
            this.H.c(this.m0, this.f49033a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.u4 u4Var = this.f49044h0;
            if (u4Var != null && u4Var.getChildCount() > 0 && (this.f49044h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f49044h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29455h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f49061y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f49061y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f31123f);
                        nVar.f31119a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.a60 a60Var = this.f49053q0;
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
