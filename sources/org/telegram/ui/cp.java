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
public final class cp extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
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
    public uo f36357a;
    public boolean f36358a0;
    public org.telegram.ui.ActionBar.n0 f36359b;
    public boolean f36360b0;
    public EditTextBoldCursor f36361c;
    public boolean f36362c0;
    public org.telegram.ui.Cells.b9 d;
    public boolean f36363d0;
    public org.telegram.ui.Cells.p4 e;
    public org.telegram.ui.Cells.c7 f36364e0;
    public org.telegram.ui.Cells.p4 f36365f;
    public ArrayList f36366f0;
    public org.telegram.ui.Cells.v4 f36367g0;
    public wo h;
    public int f36368h0;
    public String f36369i0;
    public ch f36370j0;
    public boolean f36371k0;
    public TLRPC.TL_chatInviteExported f36372l0;
    public boolean m0;
    public org.telegram.ui.Components.in0 f36373n;
    public boolean f36374n0;
    public HashMap f36375o0;
    public org.telegram.ui.Components.c60 f36376p0;
    public ro f36377q0;
    public org.telegram.ui.ActionBar.l5 f36378r;
    public Boolean f36379r0;
    public LinearLayout f36380s;
    public boolean f36381s0;
    public org.telegram.ui.Cells.l6 f36382w;
    public org.telegram.ui.Cells.l6 f36383x;
    public LinearLayout f36384y;

    public static org.telegram.ui.ActionBar.p6 Z(cp cpVar) {
        return cpVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21004h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20987g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21278w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.l5 l5Var = this.f36378r;
        if (!this.V && this.f36359b.length() <= 0) {
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

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        ch chVar = this.f36370j0;
        if (chVar != null) {
            org.telegram.messenger.i0.r(chVar);
            this.f36370j0 = null;
            this.f36369i0 = null;
            if (this.f36368h0 != 0) {
                getConnectionsManager().cancelRequest(this.f36368h0, true);
            }
        }
        this.f36371k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f36358a0) {
                            this.h.setText(org.telegram.messenger.dd.L0(2131748915, null));
                        } else {
                            this.h.setText(org.telegram.messenger.dd.L0(2131748914, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21154p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.dd.L0(2131748919, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21154p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.dd.L0(2131748919, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21154p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.dd.L0(2131748918, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21154p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.dd.L0(2131748932, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.F6);
            this.f36369i0 = str;
            ch chVar2 = new ch(14, this, str);
            this.f36370j0 = chVar2;
            org.telegram.messenger.i0.h3(chVar2, 300L);
            return true;
        }
        if (this.f36358a0) {
            this.h.setText(org.telegram.messenger.dd.L0(2131748917, null));
        } else {
            this.h.setText(org.telegram.messenger.dd.L0(2131748916, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.f21154p7);
        return false;
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
        this.f36378r = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        this.f36373n = new org.telegram.ui.Components.in0(context);
        this.f36357a = new uo(this, context, this.f36373n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f36357a, w7.b6.g());
        this.fragmentView = frameLayout;
        this.f36357a.setFillViewport(true);
        this.f36357a.setDrawBackground(true);
        this.f36357a.setOverScrollMode(0);
        this.f36357a.addView(this.f36373n, new FrameLayout.LayoutParams(-1, -2));
        this.f36373n.setOrientation(1);
        boolean z11 = this.f36374n0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131743955, null));
        } else if (this.f36358a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131749409, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36380s = linearLayout;
        linearLayout.setOrientation(1);
        this.f36373n.addView(this.f36380s, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
        this.f36365f = p4Var;
        p4Var.setHeight(46);
        if (this.f36358a0) {
            this.f36365f.setText(org.telegram.messenger.dd.L0(2131752275, null));
        } else {
            this.f36365f.setText(org.telegram.messenger.dd.L0(2131749400, null));
        }
        this.f36380s.addView(this.f36365f);
        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, false);
        this.f36383x = l6Var;
        if (this.f36358a0) {
            l6Var.b(org.telegram.messenger.dd.L0(2131752329, null), org.telegram.messenger.dd.L0(2131752328, null), false, this.V);
        } else {
            l6Var.b(org.telegram.messenger.dd.L0(2131748656, null), org.telegram.messenger.dd.L0(2131748655, null), false, this.V);
        }
        this.f36380s.addView(this.f36383x, w7.b6.o(-1, -2));
        this.f36383x.setOnClickListener(new to(this, 1));
        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, false);
        this.f36382w = l6Var2;
        if (this.f36358a0) {
            l6Var2.b(org.telegram.messenger.dd.L0(2131752318, null), org.telegram.messenger.dd.L0(2131752315, null), false, !this.V);
        } else {
            l6Var2.b(org.telegram.messenger.dd.L0(2131748653, null), org.telegram.messenger.dd.L0(2131748652, null), false, !this.V);
        }
        this.f36380s.addView(this.f36382w, w7.b6.o(-1, -2));
        this.f36382w.setOnClickListener(new to(this, 2));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.J = c7Var;
        this.f36373n.addView(c7Var, w7.b6.o(-1, -2));
        if (z11) {
            this.f36383x.setVisibility(8);
            this.f36382w.setVisibility(8);
            this.J.setVisibility(8);
            this.f36365f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f36373n.addView(this.D, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context, 23);
        this.e = p4Var2;
        this.D.addView(p4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, w7.b6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36361c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
        this.f36361c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36361c;
        int i13 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor2, i13, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f36361c;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor3, i14, null);
        this.f36361c.setMaxLines(1);
        this.f36361c.setLines(1);
        this.f36361c.setEnabled(false);
        this.f36361c.setBackground(null);
        this.f36361c.setPadding(0, 0, 0, 0);
        this.f36361c.setSingleLine(true);
        this.f36361c.setInputType(163840);
        this.f36361c.setImeOptions(6);
        this.E.addView(this.f36361c, w7.b6.o(-2, 36));
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 2);
        this.f36359b = n0Var;
        n0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f36359b, i13, null);
        org.telegram.ui.ActionBar.a7.V(this.f36359b, i14, null);
        this.f36359b.setMaxLines(1);
        this.f36359b.setLines(1);
        this.f36359b.setBackground(null);
        this.f36359b.setPadding(0, 0, 0, 0);
        this.f36359b.setSingleLine(true);
        this.f36359b.setInputType(163872);
        this.f36359b.setImeOptions(6);
        this.f36359b.setHint(org.telegram.messenger.dd.L0(2131752266, null));
        org.telegram.ui.ActionBar.a7.w(this.f36359b, i14, null);
        this.f36359b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f36359b.setCursorWidth(1.5f);
        this.E.addView(this.f36359b, w7.b6.o(-1, 36));
        this.f36359b.addTextChangedListener(new n0(this, 4));
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
        this.f36373n.addView(this.h, w7.b6.o(-2, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.d = b9Var;
        b9Var.setImportantForAccessibility(1);
        this.f36373n.addView(this.d, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
        this.f36367g0 = v4Var;
        this.f36373n.addView(v4Var, w7.b6.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f36384y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f36373n.addView(this.f36384y, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.f36364e0 = c7Var2;
        this.f36373n.addView(c7Var2, w7.b6.o(-1, -2));
        org.telegram.ui.Components.in0 in0Var = this.f36373n;
        bp bpVar = new bp(this, context);
        this.K = bpVar;
        in0Var.addView(bpVar, w7.b6.o(-1, -2));
        bp bpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bpVar2.setVisibility(i10);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
        this.H = p8Var;
        p8Var.o(2131232203, org.telegram.messenger.dd.L0(2131748710, null), false);
        this.H.setOnClickListener(new to(this, 3));
        this.f36373n.addView(this.H, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.I = b9Var2;
        this.f36373n.addView(b9Var2, w7.b6.o(-1, -2));
        yo yoVar = new yo(this, context, this.X, context);
        this.U = yoVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f36358a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yoVar.c(z10);
        yo yoVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.b9 b9Var3 = yoVar2.e;
        boolean V = org.telegram.messenger.w3.V(yoVar2.f32758n);
        boolean t02 = org.telegram.messenger.w3.t0(yoVar2.f32758n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.o5.r(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).Z1(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i12 = 2131752301;
            } else if (t02) {
                i12 = 2131749411;
            } else {
                i12 = 2131749414;
            }
            b9Var3.setText(org.telegram.messenger.i0.P2(org.telegram.messenger.dd.a0(null, null, i12, str), org.telegram.ui.ActionBar.t6.Wl, null, new org.telegram.ui.Components.at(20, chatFull2, this), false));
        } else {
            if (V) {
                i11 = 2131752302;
            } else if (t02) {
                i11 = 2131749412;
            } else {
                i11 = 2131749415;
            }
            b9Var3.setText(org.telegram.messenger.dd.L0(i11, null));
        }
        this.f36373n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f36373n.addView(this.Q);
        org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context, 23);
        this.R = p4Var3;
        p4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.dd.L0(2131745880, null));
        this.Q.addView(this.R, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.S = t8Var;
        t8Var.f(org.telegram.messenger.dd.L0(2131746079, null), this.f36360b0, false);
        this.S.setOnClickListener(new to(this, 4));
        this.Q.addView(this.S, w7.b6.o(-1, -2));
        this.T = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        if (this.f36358a0 && !org.telegram.messenger.w3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.dd.L0(2131746078, null));
        } else {
            this.T.setText(org.telegram.messenger.dd.L0(2131746077, null));
        }
        this.Q.addView(this.T, w7.b6.o(-1, -2));
        String K = org.telegram.messenger.w3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.f36359b.setText(K);
            this.f36359b.setSelection(K.length());
            this.m0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(4, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19795id == this.Z) {
                this.Y = chatFull;
                this.f36372l0 = chatFull.exported_invite;
                h0();
            }
        } else if (i10 == org.telegram.messenger.at.f14822y1) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp.e0():void");
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(2, this.currentAccount, getParentActivity(), this, null);
        q0Var.f11238n2 = this.f36358a0;
        q0Var.f11250z2 = new ro(this, 0);
        showDialog(q0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.f36377q0);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f36378r;
        if (l5Var != null) {
            l5Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.jn0 getScrollViewForSimpleGlass() {
        return this.f36357a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        LinearLayout linearLayout = this.f36380s;
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36384y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36367g0, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36382w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36383x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    public final void h0() {
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
        if (!this.V && !this.f36362c0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.dd.L0(2131752533, null));
            org.telegram.ui.Cells.b9 b9Var = this.d;
            int i18 = org.telegram.ui.ActionBar.t6.f21154p7;
            b9Var.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.a7.V(this.d.getTextView(), i18, null);
            this.D.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f36364e0.setVisibility(0);
            if (this.f36363d0) {
                this.f36367g0.setVisibility(0);
                this.f36384y.setVisibility(8);
            } else {
                this.f36367g0.setVisibility(8);
                this.f36384y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var2 = this.d;
            int i19 = org.telegram.ui.ActionBar.t6.B6;
            b9Var2.setTag(Integer.valueOf(i19));
            org.telegram.ui.ActionBar.a7.V(this.d.getTextView(), i19, null);
            if (this.f36374n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f36364e0.setVisibility(8);
            this.f36384y.setVisibility(8);
            this.D.setVisibility(0);
            this.f36367g0.setVisibility(8);
            if (this.f36358a0) {
                org.telegram.ui.Cells.b9 b9Var3 = this.d;
                if (this.V) {
                    i15 = 2131752327;
                } else {
                    i15 = 2131752267;
                }
                b9Var3.setText(org.telegram.messenger.dd.L0(i15, null));
                org.telegram.ui.Cells.p4 p4Var = this.e;
                if (this.V) {
                    L02 = org.telegram.messenger.dd.L0(2131752403, null);
                } else {
                    L02 = org.telegram.messenger.dd.L0(2131752385, null);
                }
                p4Var.setText(L02);
            } else {
                org.telegram.ui.Cells.b9 b9Var4 = this.d;
                if (this.V) {
                    i10 = 2131748654;
                } else {
                    i10 = 2131748651;
                }
                b9Var4.setText(org.telegram.messenger.dd.L0(i10, null));
                org.telegram.ui.Cells.p4 p4Var2 = this.e;
                if (this.V) {
                    L0 = org.telegram.messenger.dd.L0(2131752403, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131752385, null);
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f36372l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            j80Var.setLink(str);
            this.G.c(this.f36372l0, this.Z);
            wo woVar = this.h;
            if (!this.V && woVar.f21744a.length() != 0) {
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
            b9Var5.setText(org.telegram.messenger.dd.L0(i14, null));
        }
        boolean z10 = true;
        this.f36382w.a(!this.V);
        this.f36383x.a(this.V);
        this.f36359b.clearFocus();
        yo yoVar = this.U;
        if (yoVar != null) {
            if (this.f36358a0 && !this.V) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            yoVar.setVisibility(i16);
            yo yoVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f36358a0) {
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
        b0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        org.telegram.ui.ActionBar.n0 n0Var;
        super.onBecomeFullyVisible();
        if (this.f36374n0 && (n0Var = this.f36359b) != null) {
            n0Var.requestFocus();
            org.telegram.messenger.i0.J3(this.f36359b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.T);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
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
            this.f36372l0 = tL_chatInviteExported;
            org.telegram.ui.Components.j80 j80Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            j80Var.setLink(str);
            this.G.c(this.f36372l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.v4 v4Var = this.f36367g0;
            if (v4Var != null && v4Var.getChildCount() > 0 && (this.f36367g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f36367g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f36384y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f36384y.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.m) {
                        org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) childAt;
                        mVar.d.q(mVar.f22273f);
                        mVar.f22270a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.c60 c60Var = this.f36376p0;
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
