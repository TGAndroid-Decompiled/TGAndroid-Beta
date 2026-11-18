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
public final class jo extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.e80 H;
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
    public ao f48995a;
    public long f48996a0;
    public ah.i f48997b;
    public boolean f48998b0;
    public EditTextBoldCursor f48999c;
    public boolean f49000c0;
    public org.telegram.ui.Cells.a9 d;
    public boolean f49001d0;
    public org.telegram.ui.Cells.o4 f49002e;
    public boolean f49003e0;
    public org.telegram.ui.Cells.o4 f49004f;
    public org.telegram.ui.Cells.z6 f49005f0;
    public ArrayList f49006g0;
    public co h;
    public org.telegram.ui.Cells.u4 f49007h0;
    public int f49008i0;
    public String f49009j0;
    public ci f49010k0;
    public boolean f49011l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.sm0 f49012n;
    public boolean f49013n0;
    public boolean f49014o0;
    public HashMap f49015p0;
    public org.telegram.ui.Components.x50 f49016q0;
    public org.telegram.ui.ActionBar.d5 f49017r;
    public tn f49018r0;
    public LinearLayout f49019s;
    public Boolean f49020s0;
    public boolean f49021t0;
    public org.telegram.ui.Cells.i6 f49022w;
    public org.telegram.ui.Cells.i6 f49023x;
    public LinearLayout f49024y;

    public static org.telegram.ui.ActionBar.i6 Z(jo joVar) {
        return joVar.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29450g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29748w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var = this.f49017r;
        if (!this.W && this.f48997b.length() <= 0) {
            ArrayList arrayList = this.O;
            z10 = false;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            d5Var.a(z10, true);
        }
        z10 = true;
        d5Var.a(z10, true);
    }

    public final boolean c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        ci ciVar = this.f49010k0;
        if (ciVar != null) {
            org.telegram.messenger.g0.r(ciVar);
            this.f49010k0 = null;
            this.f49009j0 = null;
            if (this.f49008i0 != 0) {
                getConnectionsManager().cancelRequest(this.f49008i0, true);
            }
        }
        this.f49011l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f48998b0) {
                            this.h.setText(org.telegram.messenger.gd.M0(2131748713, null));
                        } else {
                            this.h.setText(org.telegram.messenger.gd.M0(2131748712, null));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29615p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(org.telegram.messenger.gd.M0(2131748717, null));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29615p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(org.telegram.messenger.gd.M0(2131748717, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29615p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(org.telegram.messenger.gd.M0(2131748716, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29615p7);
                return false;
            }
            this.h.setText(org.telegram.messenger.gd.M0(2131748730, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.F6);
            this.f49009j0 = str;
            ci ciVar2 = new ci(5, this, str);
            this.f49010k0 = ciVar2;
            org.telegram.messenger.g0.h3(ciVar2, 300L);
            return true;
        }
        if (this.f48998b0) {
            this.h.setText(org.telegram.messenger.gd.M0(2131748715, null));
        } else {
            this.h.setText(org.telegram.messenger.gd.M0(2131748714, null));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.f29615p7);
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
        this.f49017r = this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null));
        this.f49012n = new org.telegram.ui.Components.sm0(context);
        this.f48995a = new ao(this, context, this.f49012n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f48995a, c8.ma.g());
        this.fragmentView = frameLayout;
        this.f48995a.setFillViewport(true);
        this.f48995a.setDrawBackground(true);
        this.f48995a.setOverScrollMode(0);
        this.f48995a.addView(this.f49012n, new FrameLayout.LayoutParams(-1, -2));
        this.f49012n.setOrientation(1);
        boolean z11 = this.f49014o0;
        if (z11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131743693, null));
        } else if (this.f48998b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752286, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131749208, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49019s = linearLayout;
        linearLayout.setOrientation(1);
        this.f49012n.addView(this.f49019s, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f49004f = o4Var;
        o4Var.setHeight(46);
        if (this.f48998b0) {
            this.f49004f.setText(org.telegram.messenger.gd.M0(2131752264, null));
        } else {
            this.f49004f.setText(org.telegram.messenger.gd.M0(2131749199, null));
        }
        this.f49019s.addView(this.f49004f);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f49023x = i6Var;
        if (this.f48998b0) {
            i6Var.b(org.telegram.messenger.gd.M0(2131752318, null), org.telegram.messenger.gd.M0(2131752317, null), false, this.W);
        } else {
            i6Var.b(org.telegram.messenger.gd.M0(2131748449, null), org.telegram.messenger.gd.M0(2131748448, null), false, this.W);
        }
        this.f49019s.addView(this.f49023x, c8.ma.o(-1, -2));
        this.f49023x.setOnClickListener(new xn(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.f49022w = i6Var2;
        if (this.f48998b0) {
            i6Var2.b(org.telegram.messenger.gd.M0(2131752307, null), org.telegram.messenger.gd.M0(2131752304, null), false, !this.W);
        } else {
            i6Var2.b(org.telegram.messenger.gd.M0(2131748446, null), org.telegram.messenger.gd.M0(2131748445, null), false, !this.W);
        }
        this.f49019s.addView(this.f49022w, c8.ma.o(-1, -2));
        this.f49022w.setOnClickListener(new xn(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.K = z6Var;
        this.f49012n.addView(z6Var, c8.ma.o(-1, -2));
        if (z11) {
            this.f49023x.setVisibility(8);
            this.f49022w.setVisibility(8);
            this.K.setVisibility(8);
            this.f49004f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f49012n.addView(this.E, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, 23);
        this.f49002e = o4Var2;
        this.E.addView(o4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, c8.ma.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f48999c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().X2 + "/");
        this.f48999c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f48999c;
        int i12 = org.telegram.ui.ActionBar.n6.H6;
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f48999c;
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor3, i13, null);
        this.f48999c.setMaxLines(1);
        this.f48999c.setLines(1);
        this.f48999c.setEnabled(false);
        this.f48999c.setBackground(null);
        this.f48999c.setPadding(0, 0, 0, 0);
        this.f48999c.setSingleLine(true);
        this.f48999c.setInputType(163840);
        this.f48999c.setImeOptions(6);
        this.F.addView(this.f48999c, c8.ma.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.f48997b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(this.f48997b, i12, null);
        org.telegram.ui.ActionBar.u6.U(this.f48997b, i13, null);
        this.f48997b.setMaxLines(1);
        this.f48997b.setLines(1);
        this.f48997b.setBackground(null);
        this.f48997b.setPadding(0, 0, 0, 0);
        this.f48997b.setSingleLine(true);
        this.f48997b.setInputType(163872);
        this.f48997b.setImeOptions(6);
        this.f48997b.setHint(org.telegram.messenger.gd.M0(2131752255, null));
        org.telegram.ui.ActionBar.u6.v(this.f48997b, i13, null);
        this.f48997b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f48997b.setCursorWidth(1.5f);
        this.F.addView(this.f48997b, c8.ma.o(-1, 36));
        this.f48997b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, c8.ma.o(-1, -2));
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, this, null, true, org.telegram.messenger.v3.T(this.Y));
        this.H = e80Var;
        e80Var.setDelegate(new bo(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        co coVar = new co(this, context, this.resourceProvider);
        this.h = coVar;
        coVar.setBottomPadding(6);
        this.f49012n.addView(this.h, c8.ma.o(-2, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.d = a9Var;
        a9Var.setImportantForAccessibility(1);
        this.f49012n.addView(this.d, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
        this.f49007h0 = u4Var;
        this.f49012n.addView(u4Var, c8.ma.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f49024y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f49012n.addView(this.f49024y, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.f49005f0 = z6Var2;
        this.f49012n.addView(z6Var2, c8.ma.o(-1, -2));
        org.telegram.ui.Components.sm0 sm0Var = this.f49012n;
        io ioVar = new io(this, context);
        this.L = ioVar;
        sm0Var.addView(ioVar, c8.ma.o(-1, -2));
        io ioVar2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ioVar2.setVisibility(i7);
        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
        this.I = n8Var;
        n8Var.o(2131232206, org.telegram.messenger.gd.M0(2131748503, null), false);
        this.I.setOnClickListener(new xn(this, 3));
        this.f49012n.addView(this.I, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.J = a9Var2;
        this.f49012n.addView(a9Var2, c8.ma.o(-1, -2));
        fo foVar = new fo(this, context, this.Y, context);
        this.V = foVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f48998b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        foVar.c(z10);
        fo foVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.a9 a9Var3 = foVar2.f39934e;
        boolean V = org.telegram.messenger.v3.V(foVar2.f39936n);
        boolean t02 = org.telegram.messenger.v3.t0(foVar2.f39936n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + org.telegram.messenger.n5.r(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).c2(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i11 = 2131752290;
            } else if (t02) {
                i11 = 2131749210;
            } else {
                i11 = 2131749213;
            }
            a9Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.a0(null, null, i11, str), org.telegram.ui.ActionBar.n6.Zl, null, new org.telegram.ui.Components.dw(16, chatFull2, this), false));
        } else {
            if (V) {
                i10 = 2131752291;
            } else if (t02) {
                i10 = 2131749211;
            } else {
                i10 = 2131749214;
            }
            a9Var3.setText(org.telegram.messenger.gd.M0(i10, null));
        }
        this.f49012n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f49012n.addView(this.R);
        org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context, 23);
        this.S = o4Var3;
        o4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.gd.M0(2131745668, null));
        this.R.addView(this.S, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.T = s8Var;
        s8Var.f(org.telegram.messenger.gd.M0(2131745867, null), this.f49000c0, false);
        this.T.setOnClickListener(new xn(this, 4));
        this.R.addView(this.T, c8.ma.o(-1, -2));
        this.U = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        if (this.f48998b0 && !org.telegram.messenger.v3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.gd.M0(2131745866, null));
        } else {
            this.U.setText(org.telegram.messenger.gd.M0(2131745865, null));
        }
        this.R.addView(this.U, c8.ma.o(-1, -2));
        String K = org.telegram.messenger.v3.K(this.Y, true);
        if (!this.W && K != null) {
            this.f49013n0 = true;
            this.f48997b.setText(K);
            this.f48997b.setSelection(K.length());
            this.f49013n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.f48996a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hi.c3(5, this, z10)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28404id == this.f48996a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i7 == org.telegram.messenger.ks.f25226y1) {
            if ((-this.f48996a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
                if (s4Var != null && s4Var.getLastFragment() == this) {
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
        ug.l0 l0Var = new ug.l0(2, this.currentAccount, getParentActivity(), this, null);
        l0Var.f58745r2 = this.f48998b0;
        l0Var.D2 = new tn(this, 0);
        showDialog(l0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.f49018r0);
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.f49017r;
        if (d5Var != null) {
            d5Var.b(z10);
        }
    }

    @Override
    public final org.telegram.ui.Components.tm0 getScrollViewForSimpleGlass() {
        return this.f48995a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.n6.f29486i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29615p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        LinearLayout linearLayout = this.f49019s;
        int i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49024y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49007h0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29468h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49022w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49023x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
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
        if (!this.W && !this.f49001d0 && getUserConfig().q()) {
            this.d.setText(org.telegram.messenger.gd.M0(2131752522, null));
            org.telegram.ui.Cells.a9 a9Var = this.d;
            int i17 = org.telegram.ui.ActionBar.n6.f29615p7;
            a9Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.u6.U(this.d.getTextView(), i17, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f49005f0.setVisibility(0);
            if (this.f49003e0) {
                this.f49007h0.setVisibility(0);
                this.f49024y.setVisibility(8);
            } else {
                this.f49007h0.setVisibility(8);
                this.f49024y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var2 = this.d;
            int i18 = org.telegram.ui.ActionBar.n6.B6;
            a9Var2.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.u6.U(this.d.getTextView(), i18, null);
            if (this.f49014o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f49005f0.setVisibility(8);
            this.f49024y.setVisibility(8);
            this.E.setVisibility(0);
            this.f49007h0.setVisibility(8);
            if (this.f48998b0) {
                org.telegram.ui.Cells.a9 a9Var3 = this.d;
                if (this.W) {
                    i14 = 2131752316;
                } else {
                    i14 = 2131752256;
                }
                a9Var3.setText(org.telegram.messenger.gd.M0(i14, null));
                org.telegram.ui.Cells.o4 o4Var = this.f49002e;
                if (this.W) {
                    M02 = org.telegram.messenger.gd.M0(2131752392, null);
                } else {
                    M02 = org.telegram.messenger.gd.M0(2131752374, null);
                }
                o4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.a9 a9Var4 = this.d;
                if (this.W) {
                    i7 = 2131748447;
                } else {
                    i7 = 2131748444;
                }
                a9Var4.setText(org.telegram.messenger.gd.M0(i7, null));
                org.telegram.ui.Cells.o4 o4Var2 = this.f49002e;
                if (this.W) {
                    M0 = org.telegram.messenger.gd.M0(2131752392, null);
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131752374, null);
                }
                o4Var2.setText(M0);
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
            org.telegram.ui.Components.e80 e80Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            e80Var.setLink(str);
            this.H.c(this.m0, this.f48996a0);
            co coVar = this.h;
            if (!this.W && coVar.f30397a.length() != 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            coVar.setVisibility(i12);
            TLRPC.ChatFull P0 = getMessagesController().P0(this.f48996a0);
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f48996a0));
            org.telegram.ui.Cells.a9 a9Var5 = this.J;
            if (P0 != null && P0.paid_media_allowed && org.telegram.messenger.v3.V(O0)) {
                i13 = 2131748501;
            } else {
                i13 = 2131748502;
            }
            a9Var5.setText(org.telegram.messenger.gd.M0(i13, null));
        }
        boolean z10 = true;
        this.f49022w.a(!this.W);
        this.f49023x.a(this.W);
        this.f48997b.clearFocus();
        fo foVar = this.V;
        if (foVar != null) {
            if (this.f48998b0 && !this.W) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            foVar.setVisibility(i15);
            fo foVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.f48998b0) {
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
        if (this.f49014o0 && (iVar = this.f48997b) != null) {
            iVar.requestFocus();
            org.telegram.messenger.g0.I3(this.f48997b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25226y1);
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
            org.telegram.ui.Components.e80 e80Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            e80Var.setLink(str);
            this.H.c(this.m0, this.f48996a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.u4 u4Var = this.f49007h0;
            if (u4Var != null && u4Var.getChildCount() > 0 && (this.f49007h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f49007h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29468h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f49024y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.f49024y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f31092f);
                        nVar.f31088a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.x50 x50Var = this.f49016q0;
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
