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
public final class ho extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.t70 H;
    public org.telegram.ui.Cells.l8 I;
    public org.telegram.ui.Cells.y8 J;
    public org.telegram.ui.Cells.x6 K;
    public go L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ia P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.n4 S;
    public org.telegram.ui.Cells.q8 T;
    public org.telegram.ui.Cells.y8 U;
    public co V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public yn f47758a;
    public long f47759a0;
    public ah.i f47760b;
    public boolean f47761b0;
    public EditTextBoldCursor f47762c;
    public boolean f47763c0;
    public org.telegram.ui.Cells.y8 d;
    public boolean f47764d0;
    public org.telegram.ui.Cells.n4 f47765e;
    public boolean f47766e0;
    public org.telegram.ui.Cells.n4 f47767f;
    public org.telegram.ui.Cells.x6 f47768f0;
    public ArrayList f47769g0;
    public ao h;
    public org.telegram.ui.Cells.t4 f47770h0;
    public int f47771i0;
    public String f47772j0;
    public zg f47773k0;
    public boolean f47774l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.km0 f47775n;
    public boolean f47776n0;
    public boolean f47777o0;
    public HashMap f47778p0;
    public org.telegram.ui.Components.p50 f47779q0;
    public org.telegram.ui.ActionBar.z4 f47780r;
    public sn f47781r0;
    public LinearLayout f47782s;
    public Boolean f47783s0;
    public boolean f47784t0;
    public org.telegram.ui.Cells.g6 f47785w;
    public org.telegram.ui.Cells.g6 f47786x;
    public LinearLayout f47787y;

    public static org.telegram.ui.ActionBar.e6 Z(ho hoVar) {
        return hoVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29203w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.z4 z4Var = this.f47780r;
        if (!this.W && this.f47760b.length() <= 0) {
            ArrayList arrayList = this.O;
            z10 = false;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            z4Var.a(z10, true);
        }
        z10 = true;
        z4Var.a(z10, true);
    }

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        zg zgVar = this.f47773k0;
        if (zgVar != null) {
            org.telegram.messenger.g0.r(zgVar);
            this.f47773k0 = null;
            this.f47772j0 = null;
            if (this.f47771i0 != 0) {
                getConnectionsManager().cancelRequest(this.f47771i0, true);
            }
        }
        this.f47774l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f47761b0) {
                            this.h.setText(org.telegram.messenger.hd.M0(2131748905, null));
                        } else {
                            this.h.setText(org.telegram.messenger.hd.M0(2131748904, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.j6.f29070p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.hd.M0(2131748909, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.j6.f29070p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.hd.M0(2131748909, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.j6.f29070p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.hd.M0(2131748908, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.j6.f29070p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.hd.M0(2131748922, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.j6.F6);
            this.f47772j0 = str;
            zg zgVar2 = new zg(9, this, str);
            this.f47773k0 = zgVar2;
            org.telegram.messenger.g0.i3(zgVar2, 300L);
            return true;
        }
        if (this.f47761b0) {
            this.h.setText(org.telegram.messenger.hd.M0(2131748907, null));
        } else {
            this.h.setText(org.telegram.messenger.hd.M0(2131748906, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.j6.f29070p7);
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new xn(this, context));
        this.f47780r = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        this.f47775n = new org.telegram.ui.Components.km0(context);
        this.f47758a = new yn(this, context, this.f47775n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f47758a, c8.ja.g());
        this.fragmentView = frameLayout;
        this.f47758a.setFillViewport(true);
        this.f47758a.setDrawBackground(true);
        this.f47758a.setOverScrollMode(0);
        this.f47758a.addView(this.f47775n, new FrameLayout.LayoutParams(-1, -2));
        this.f47775n.setOrientation(1);
        boolean z11 = this.f47777o0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743930, null));
        } else if (this.f47761b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749400, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47782s = linearLayout;
        linearLayout.setOrientation(1);
        this.f47775n.addView(this.f47782s, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f47767f = n4Var;
        n4Var.setHeight(46);
        if (this.f47761b0) {
            this.f47767f.setText(org.telegram.messenger.hd.M0(2131752275, null));
        } else {
            this.f47767f.setText(org.telegram.messenger.hd.M0(2131749391, null));
        }
        this.f47782s.addView(this.f47767f);
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
        this.f47786x = g6Var;
        if (this.f47761b0) {
            g6Var.b(org.telegram.messenger.hd.M0(2131752329, null), org.telegram.messenger.hd.M0(2131752328, null), false, this.W);
        } else {
            g6Var.b(org.telegram.messenger.hd.M0(2131748641, null), org.telegram.messenger.hd.M0(2131748640, null), false, this.W);
        }
        this.f47782s.addView(this.f47786x, c8.ja.o(-1, -2));
        this.f47786x.setOnClickListener(new vn(this, 1));
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
        this.f47785w = g6Var2;
        if (this.f47761b0) {
            g6Var2.b(org.telegram.messenger.hd.M0(2131752318, null), org.telegram.messenger.hd.M0(2131752315, null), false, !this.W);
        } else {
            g6Var2.b(org.telegram.messenger.hd.M0(2131748638, null), org.telegram.messenger.hd.M0(2131748637, null), false, !this.W);
        }
        this.f47782s.addView(this.f47785w, c8.ja.o(-1, -2));
        this.f47785w.setOnClickListener(new vn(this, 2));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        this.K = x6Var;
        this.f47775n.addView(x6Var, c8.ja.o(-1, -2));
        if (z11) {
            this.f47786x.setVisibility(8);
            this.f47785w.setVisibility(8);
            this.K.setVisibility(8);
            this.f47767f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f47775n.addView(this.E, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.f47765e = n4Var2;
        this.E.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, c8.ja.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47762c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().V2 + "/");
        this.f47762c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f47762c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.q6.D(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f47762c;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor3, i13, null);
        this.f47762c.setMaxLines(1);
        this.f47762c.setLines(1);
        this.f47762c.setEnabled(false);
        this.f47762c.setBackground(null);
        this.f47762c.setPadding(0, 0, 0, 0);
        this.f47762c.setSingleLine(true);
        this.f47762c.setInputType(163840);
        this.f47762c.setImeOptions(6);
        this.F.addView(this.f47762c, c8.ja.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f47760b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.D(this.f47760b, i12, null);
        org.telegram.ui.ActionBar.q6.U(this.f47760b, i13, null);
        this.f47760b.setMaxLines(1);
        this.f47760b.setLines(1);
        this.f47760b.setBackground(null);
        this.f47760b.setPadding(0, 0, 0, 0);
        this.f47760b.setSingleLine(true);
        this.f47760b.setInputType(163872);
        this.f47760b.setImeOptions(6);
        this.f47760b.setHint(org.telegram.messenger.hd.M0(2131752266, null));
        org.telegram.ui.ActionBar.q6.v(this.f47760b, i13, null);
        this.f47760b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f47760b.setCursorWidth(1.5f);
        this.F.addView(this.f47760b, c8.ja.o(-1, 36));
        this.f47760b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, c8.ja.o(-1, -2));
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(context, this, null, true, org.telegram.messenger.t3.T(this.Y));
        this.H = t70Var;
        t70Var.setDelegate(new zn(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        ao aoVar = new ao(this, context, this.resourceProvider);
        this.h = aoVar;
        aoVar.setBottomPadding(6);
        this.f47775n.addView(this.h, c8.ja.o(-2, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.d = y8Var;
        y8Var.setImportantForAccessibility(1);
        this.f47775n.addView(this.d, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.f47770h0 = t4Var;
        this.f47775n.addView(t4Var, c8.ja.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f47787y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f47775n.addView(this.f47787y, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        this.f47768f0 = x6Var2;
        this.f47775n.addView(x6Var2, c8.ja.o(-1, -2));
        org.telegram.ui.Components.km0 km0Var = this.f47775n;
        go goVar = new go(this, context);
        this.L = goVar;
        km0Var.addView(goVar, c8.ja.o(-1, -2));
        go goVar2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        goVar2.setVisibility(i7);
        org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
        this.I = l8Var;
        l8Var.o(2131232205, org.telegram.messenger.hd.M0(2131748695, null), false);
        this.I.setOnClickListener(new vn(this, 3));
        this.f47775n.addView(this.I, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.J = y8Var2;
        this.f47775n.addView(y8Var2, c8.ja.o(-1, -2));
        co coVar = new co(this, context, this.Y, context);
        this.V = coVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f47761b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        coVar.c(z10);
        co coVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.y8 y8Var3 = coVar2.f35483e;
        boolean V = org.telegram.messenger.t3.V(coVar2.f35485n);
        boolean t02 = org.telegram.messenger.t3.t0(coVar2.f35485n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.m5.r(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).a2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752301;
            } else if (t02) {
                i11 = 2131749402;
            } else {
                i11 = 2131749405;
            }
            y8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, i11, str), org.telegram.ui.ActionBar.j6.Zl, null, new org.telegram.ui.Components.vs(20, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752302;
            } else if (t02) {
                i10 = 2131749403;
            } else {
                i10 = 2131749406;
            }
            y8Var3.setText(org.telegram.messenger.hd.M0(i10, null));
        }
        this.f47775n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f47775n.addView(this.R);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.S = n4Var3;
        n4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.hd.M0(2131745863, null));
        this.R.addView(this.S, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.T = q8Var;
        q8Var.f(org.telegram.messenger.hd.M0(2131746062, null), this.f47763c0, false);
        this.T.setOnClickListener(new vn(this, 4));
        this.R.addView(this.T, c8.ja.o(-1, -2));
        this.U = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        if (this.f47761b0 && !org.telegram.messenger.t3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.hd.M0(2131746061, null));
        } else {
            this.U.setText(org.telegram.messenger.hd.M0(2131746060, null));
        }
        this.R.addView(this.U, c8.ja.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.Y, true);
        if (!this.W && K != null) {
            this.f47776n0 = true;
            this.f47760b.setText(K);
            this.f47760b.setSelection(K.length());
            this.f47776n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.f47759a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hi.b3(5, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28052id == this.f47759a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.ns.f25608y1) {
            if ((-this.f47759a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
                if (o4Var != null && o4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho.e0():void");
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.j0 j0Var = new ug.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f58146r2 = this.f47761b0;
        j0Var.D2 = new sn(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.f47781r0);
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.f47780r;
        if (z4Var != null) {
            z4Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.lm0 getScrollViewForSimpleGlass() {
        return this.f47758a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 4, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29070p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        LinearLayout linearLayout = this.f47782s;
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47787y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47770h0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47785w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47786x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
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
        if (this.K == null) {
            return;
        }
        int i16 = 8;
        if (!this.W && !this.f47764d0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.hd.M0(2131752533, null));
            org.telegram.ui.Cells.y8 y8Var = this.d;
            int i17 = org.telegram.ui.ActionBar.j6.f29070p7;
            y8Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.q6.U(this.d.getTextView(), i17, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f47768f0.setVisibility(0);
            if (this.f47766e0) {
                this.f47770h0.setVisibility(0);
                this.f47787y.setVisibility(8);
            } else {
                this.f47770h0.setVisibility(8);
                this.f47787y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.j6.B6;
            y8Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.q6.U(this.d.getTextView(), i18, null);
            if (this.f47777o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f47768f0.setVisibility(8);
            this.f47787y.setVisibility(8);
            this.E.setVisibility(0);
            this.f47770h0.setVisibility(8);
            if (this.f47761b0) {
                org.telegram.ui.Cells.y8 y8Var3 = this.d;
                if (this.W) {
                    i14 = 2131752327;
                } else {
                    i14 = 2131752267;
                }
                y8Var3.setText(org.telegram.messenger.hd.M0(i14, null));
                org.telegram.ui.Cells.n4 n4Var = this.f47765e;
                if (this.W) {
                    M02 = org.telegram.messenger.hd.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.hd.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.y8 y8Var4 = this.d;
                if (this.W) {
                    i7 = 2131748639;
                } else {
                    i7 = 2131748636;
                }
                y8Var4.setText(org.telegram.messenger.hd.M0(i7, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.f47765e;
                if (this.W) {
                    M0 = org.telegram.messenger.hd.M0(2131752403, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131752385, null);
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
            org.telegram.ui.Components.t70 t70Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            t70Var.setLink(str);
            this.H.c(this.m0, this.f47759a0);
            ao aoVar = this.h;
            if (!this.W && aoVar.f32078a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            aoVar.setVisibility(i12);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.f47759a0);
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.f47759a0));
            org.telegram.ui.Cells.y8 y8Var5 = this.J;
            if (N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(M03)) {
                i13 = 2131748693;
            } else {
                i13 = 2131748694;
            }
            y8Var5.setText(org.telegram.messenger.hd.M0(i13, null));
        }
        boolean z10 = true;
        this.f47785w.a(!this.W);
        this.f47786x.a(this.W);
        this.f47760b.clearFocus();
        co coVar = this.V;
        if (coVar != null) {
            if (this.f47761b0 && !this.W) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            coVar.setVisibility(i15);
            co coVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f47761b0) {
                z10 = false;
            }
            coVar2.c(z10);
        }
        go goVar = this.L;
        if (goVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i16 = 0;
            }
            goVar.setVisibility(i16);
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
        if (this.f47777o0 && (iVar = this.f47760b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.J3(this.f47760b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.T);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25608y1);
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
            org.telegram.ui.Components.t70 t70Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            t70Var.setLink(str);
            this.H.c(this.m0, this.f47759a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.f47770h0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f47770h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f47770h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28923h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f47787y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f47787y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f30707f);
                        nVar.f30703a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.p50 p50Var = this.f47779q0;
            if (p50Var != null) {
                p50Var.updateColors();
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
