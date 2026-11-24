package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class ContactsActivity extends org.telegram.ui.ActionBar.d implements x74, gk7, zg6, swc {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public long S;
    public String T;
    public boolean U;
    public rt2 V;
    public String W;
    public hd X;
    public boolean Y;
    public boolean Z;
    public final y74 a;
    public final vf6 a0;
    public ot2 b;
    public xha b0;
    public zya c;
    public String c0;
    public o39 d;
    public boolean d0;
    public cu6 e;
    public long e0;
    public t26 f;
    public ViewPropertyAnimator f0;
    public boolean g0;
    public nt2 h;
    public final o1 h0;
    public int i0;
    public int j0;
    public float k0;
    public int l0;
    public int m0;
    public xha n;
    public boolean n0;
    public boolean o0;
    public int phonebookRow;
    public boolean r;
    public un4 s;
    public boolean w;
    public n81 x;
    public boolean y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.a = new y74(0, this, s33.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.a0 = new vf6();
        this.d0 = true;
        this.h0 = new o1(this, (byte) 19);
    }

    public static pha Z(ContactsActivity contactsActivity) {
        return contactsActivity.simpleActionBar;
    }

    public static pha a0(ContactsActivity contactsActivity) {
        return contactsActivity.simpleActionBar;
    }

    @Override
    public final lx4 A() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        o39 o39Var = this.d;
        if (o39Var != null && o39Var.getFastScroll() != null && this.d.getFastScroll().n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.o6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void b0(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && y6c.h(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z && this.Y) {
                showDialog(ij.v(parentActivity, new jt2(this, (byte) 1)).a);
                return;
            }
            this.e0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void c0() {
        zya zyaVar = this.c;
        if (zyaVar != null) {
            zyaVar.b(Math.max(this.l0 + this.i0, this.m0), false);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContactsActivity.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        un4 un4Var = this.s;
        if (un4Var != null) {
            un4Var.setTranslationY(((-this.l0) - this.j0) - this.k0);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        o39 o39Var;
        if (i == kk7.N) {
            ot2 ot2Var = this.b;
            if (ot2Var != null) {
                if (!this.r) {
                    ot2Var.Y(2, true);
                }
                this.b.f();
            }
            if (this.h != null) {
                w39 adapter = this.d.getAdapter();
                nt2 nt2Var = this.h;
                if (adapter == nt2Var) {
                    nt2Var.G(this.c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = na7.q5;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (o39Var = this.d) != null) {
                int childCount = o39Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.d.getChildAt(i4);
                    if (childAt instanceof v6c) {
                        ((v6c) childAt).i(intValue);
                    }
                }
            }
            int i5 = na7.q5;
            if ((intValue & 4) != 0 && !this.r && this.b != null && !this.g0) {
                this.g0 = true;
                o1 o1Var = this.h0;
                gl.r(o1Var);
                gl.e3(o1Var, 5000L);
                return;
            }
            return;
        }
        int i6 = kk7.Z;
        int i7 = kk7.s;
        if (i == i6) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).id);
                kk7.f(this.currentAccount).k(i7, new Object[0]);
                presentFragment(new mu1(bundle), false);
            }
        } else if (i == i7 && !this.L) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return !this.H;
    }

    public final void e0() {
        ot2 ot2Var;
        boolean z;
        un4 un4Var = this.s;
        if (un4Var != null && (ot2Var = this.b) != null) {
            if (this.w && !this.E && !ot2Var.J) {
                z = true;
            } else {
                z = false;
            }
            un4Var.e(z, true);
        }
    }

    public final void f0() {
        boolean z;
        int i;
        ot2 ot2Var = this.b;
        if (ot2Var != null && ot2Var.J) {
            z = true;
        } else {
            z = false;
        }
        if (this.n0 == z && this.o0) {
            return;
        }
        xha xhaVar = this.b0;
        if (z) {
            i = 2131745542;
        } else {
            i = 2131745620;
        }
        xhaVar.setSearchFieldHint(k96.M0(i, null));
        this.n0 = z;
        this.o0 = true;
    }

    public final void g0(TLRPC.User user, boolean z, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            u21.b0(this).t(k96.M0(2131753105, null), null).j();
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w = hc2.w(4, K0);
                        hd hdVar = alertDialog$Builder.a;
                        if (w) {
                            hdVar.S = k96.M0(2131754458, null);
                            hdVar.U = k96.M0(2131754457, null);
                            alertDialog$Builder.j(k96.M0(2131754463, null), new v82(this, user, str));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        } else {
                            hdVar.U = k96.M0(2131752554, null);
                            alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        }
                        showDialog(hdVar);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131689472, null);
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M0;
                String b0 = k96.b0(this.T, l7c.q(user));
                if (!user.bot && this.O) {
                    b0 = tb4.y(b0, "\n\n", k96.M0(2131754362, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    zkb.X(editTextBoldCursor, bkb.i5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(bkb.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new qt2(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                hdVar2.U = b0;
                alertDialog$Builder2.j(k96.M0(2131747638, null), new lt2(this, user, editTextBoldCursor, (byte) 0));
                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                showDialog(hdVar2);
                if (editTextBoldCursor != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                        }
                        int L = gl.L(24.0f);
                        marginLayoutParams.leftMargin = L;
                        marginLayoutParams.rightMargin = L;
                        marginLayoutParams.height = gl.L(36.0f);
                        editTextBoldCursor.setLayoutParams(marginLayoutParams);
                    }
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    return;
                }
                return;
            }
            return;
        }
        rt2 rt2Var = this.V;
        if (rt2Var != null) {
            rt2Var.b(user);
            if (this.Q) {
                this.V = null;
            }
        }
        if (this.P) {
            finishFragment();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 3);
        if (!this.H) {
            arrayList.add(new blb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        }
        arrayList.add(new blb(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.d, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        arrayList.add(new blb(this.d, 262148, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.n6));
        un4 un4Var = this.s;
        if (un4Var != null) {
            arrayList.add(new blb(un4Var.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.O9));
            arrayList.add(new blb(this.s.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.P9));
        }
        return arrayList;
    }

    public final void h0() {
        this.simpleActionBar.w();
        int childCount = this.d.getChildCount();
        int i = 0;
        while (true) {
            vf6 vf6Var = this.a0;
            if (i < childCount) {
                View childAt = this.d.getChildAt(i);
                if (childAt instanceof v6c) {
                    v6c v6cVar = (v6c) childAt;
                    if (vf6Var.h(v6cVar.getDialogId()) >= 0) {
                        v6cVar.c(false, true);
                    }
                } else if (childAt instanceof rr8) {
                    rr8 rr8Var = (rr8) childAt;
                    if (vf6Var.h(rr8Var.getDialogId()) >= 0) {
                        rr8Var.y(false, true);
                    }
                }
                i++;
            } else {
                vf6Var.b();
                return;
            }
        }
    }

    public final void i0(int i) {
        boolean z;
        na7.d1().edit().putBoolean("askAboutContacts2", false).commit();
        kk7.f(this.currentAccount).k(kk7.R5, new Object[0]);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.Y = z;
        if (i == 0) {
            return;
        }
        b0(false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final lx4 j() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", qu2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void k0(View view, int i, int i2) {
        String str;
        w39 adapter = this.d.getAdapter();
        nt2 nt2Var = this.h;
        vf6 vf6Var = this.a0;
        if (adapter == nt2Var) {
            nt2Var.getClass();
            Object E = this.h.E(i2);
            if (!vf6Var.i() && (view instanceof rr8)) {
                rr8 rr8Var = (rr8) view;
                if (rr8Var.getUser() != null && rr8Var.getUser().contact) {
                    m0(rr8Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                nt2 nt2Var2 = this.h;
                int size = nt2Var2.d.size();
                int size2 = nt2Var2.I.size();
                zr9 zr9Var = nt2Var2.f;
                int size3 = zr9Var.e.size();
                int size4 = zr9Var.j.size();
                if ((i2 < 0 || i2 >= size) && ((i2 <= size || i2 >= size + size2 + 1) && ((i2 <= size + size2 + 1 || i2 >= size + size4 + size2 + 1) && i2 > size + size4 + size2 + 1 && i2 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    getMessagesController().a4(arrayList, false);
                    ad7.Y(this.currentAccount).j1(arrayList, null, false, true);
                }
                if (this.J) {
                    g0(user, true, null);
                    return;
                } else if (this.K) {
                    if (user.id != y6c.h(this.currentAccount).e()) {
                        this.L = true;
                        bu9.i(this.currentAccount).A(getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    if (getMessagesController().A(bundle, this, null, null)) {
                        presentFragment(new mu1(bundle), this.P);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (na7.q1(this.currentAccount).t2()) {
                        h5.b(this.currentAccount);
                        return;
                    }
                    jj7 jj7Var = new jj7(this, getParentActivity());
                    jj7Var.H0(str2, true);
                    jj7Var.show();
                    return;
                }
                return;
            } else if (E instanceof nu2) {
                nu2 nu2Var = (nu2) E;
                ij.u(this, nu2Var.i, nu2Var.j, (String) nu2Var.e.get(0));
                return;
            } else {
                return;
            }
        }
        this.b.getClass();
        int S = this.b.S(i2);
        int Q = this.b.Q(i2);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof ru2)) {
                un4 un4Var = this.s;
                if (un4Var != null) {
                    un4Var.performClick();
                }
            } else if (!vf6Var.i() && (view instanceof v6c)) {
                m0((v6c) view);
            } else if ((!this.F || i != 0) && S == 0) {
                if (this.G) {
                    if (Q == 0) {
                        if (na7.q1(this.currentAccount).t2()) {
                            h5.b(this.currentAccount);
                        } else {
                            presentFragment(new gq5());
                        }
                    } else if (Q == 1) {
                        presentFragment(new z81(null));
                    }
                } else if (i != 0) {
                    if (Q == 0) {
                        if (na7.q1(this.currentAccount).t2()) {
                            h5.b(this.currentAccount);
                            return;
                        }
                        long j = this.S;
                        if (j == 0) {
                            j = this.R;
                        }
                        ?? dVar = new org.telegram.ui.ActionBar.d(null);
                        dVar.d = j;
                        presentFragment((org.telegram.ui.ActionBar.d) dVar);
                    }
                } else if (Q == 0) {
                    if (na7.q1(this.currentAccount).t2()) {
                        h5.b(this.currentAccount);
                    } else {
                        presentFragment(new qa5(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (na7.q1(this.currentAccount).t2()) {
                        h5.b(this.currentAccount);
                        return;
                    }
                    SharedPreferences c1 = na7.c1();
                    boolean z = w01.a;
                    presentFragment(new u8(0));
                    c1.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = this.b.O(this.b.S(i2), this.b.Q(i2));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (this.J) {
                        g0(user2, true, null);
                    } else if (this.K) {
                        this.L = true;
                        bu9.i(this.currentAccount).A(getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.id);
                        if (getMessagesController().A(bundle2, this, null, null)) {
                            presentFragment(new mu1(bundle2), this.P);
                        }
                    }
                } else if (O instanceof nu2) {
                    ArrayList arrayList2 = ((nu2) O).e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = k96.M0(2131748914, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = M0;
                        hdVar.S = k96.M0(2131689472, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), new v82(this, str, (byte) 10));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        showDialog(hdVar);
                    }
                }
            }
        }
    }

    public final void l0() {
        if (na7.q1(this.currentAccount).t2()) {
            h5.b(this.currentAccount);
        } else {
            new jj7(this, getParentActivity()).show();
        }
    }

    public final void m0(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = viewGroup instanceof v6c;
        boolean z3 = true;
        vf6 vf6Var = this.a0;
        if (z2) {
            v6c v6cVar = (v6c) viewGroup;
            long dialogId = v6cVar.getDialogId();
            if (vf6Var.h(dialogId) >= 0) {
                vf6Var.l(dialogId);
                v6cVar.c(false, true);
            } else if (v6cVar.getCurrentObject() instanceof TLRPC.User) {
                vf6Var.k((TLRPC.User) v6cVar.getCurrentObject(), dialogId);
                v6cVar.c(true, true);
                z = true;
            }
            z = false;
        } else if (viewGroup instanceof rr8) {
            rr8 rr8Var = (rr8) viewGroup;
            long dialogId2 = rr8Var.getDialogId();
            if (vf6Var.h(dialogId2) >= 0) {
                vf6Var.l(dialogId2);
                rr8Var.y(false, true);
            } else if (rr8Var.getUser() != null) {
                vf6Var.k(rr8Var.getUser(), dialogId2);
                rr8Var.y(true, true);
                z = true;
            }
            z = false;
        } else {
            return;
        }
        if (this.simpleActionBar.x()) {
            if (vf6Var.i()) {
                h0();
                return;
            }
        } else {
            if (z) {
                gl.t1(this.fragmentView.findFocus());
                this.simpleActionBar.F(vf6Var.m(), false);
                this.simpleActionBar.J();
            }
            z3 = false;
        }
        this.simpleActionBar.F(vf6Var.m(), z3);
    }

    @Override
    public final void o(vxc vxcVar) {
        this.m0 = vxcVar.a.f(8).d;
        c0();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.simpleActionBar.x()) {
            if (z) {
                h0();
                return false;
            }
        } else {
            pha phaVar = this.simpleActionBar;
            if (phaVar.G) {
                if (z) {
                    phaVar.n(true);
                }
            } else {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (this.d0 && (parentActivity = getParentActivity()) != null) {
            this.d0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    hd hdVar = ij.v(parentActivity, new jt2(this, (byte) 0)).a;
                    this.X = hdVar;
                    showDialog(hdVar);
                    return;
                }
                b0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        hd hdVar = this.X;
        if (hdVar != null && dialog == hdVar && getParentActivity() != null && this.Y) {
            b0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i;
        super.onFragmentCreate();
        kk7.f(this.currentAccount).b(this, kk7.N);
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.Z);
        kk7.f(this.currentAccount).b(this, kk7.s);
        this.d0 = y6c.h(this.currentAccount).V;
        Bundle bundle = this.arguments;
        int i2 = 0;
        if (bundle != null) {
            this.F = bundle.getBoolean("onlyUsers", false);
            this.I = this.arguments.getBoolean("destroyAfterSelect", false);
            this.J = this.arguments.getBoolean("returnAsResult", false);
            this.K = this.arguments.getBoolean("createSecretChat", false);
            this.T = this.arguments.getString("selectAlertString");
            this.U = this.arguments.getBoolean("allowUsernameSearch", true);
            this.O = this.arguments.getBoolean("needForwardCount", true);
            this.N = this.arguments.getBoolean("allowBots", true);
            this.M = this.arguments.getBoolean("allowSelf", true);
            this.R = this.arguments.getLong("channelId", 0L);
            this.P = this.arguments.getBoolean("needFinishFragment", true);
            this.S = this.arguments.getLong("chat_id", 0L);
            this.Z = this.arguments.getBoolean("disableSections", false);
            this.Q = this.arguments.getBoolean("resetDelegate", false);
            this.G = this.arguments.getBoolean("needPhonebook", false);
            this.H = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.G = true;
        }
        if (!this.K && !this.J) {
            this.r = gba.I0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i = gl.L(72.0f);
        } else {
            i = 0;
        }
        this.i0 = i;
        if (this.H) {
            i2 = gl.L(64.0f);
        }
        this.j0 = i2;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.N);
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.Z);
        kk7.f(this.currentAccount).n(this, kk7.s);
        this.V = null;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0 = i4;
        dg0.e(this.d, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), this.i0);
        d0();
        c0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.n(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2 && "android.permission.READ_CONTACTS".equals(strArr[i2])) {
                    if (iArr[i2] == 0) {
                        qu2.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = na7.d1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.a.b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ot2 ot2Var = this.b;
        if (ot2Var != null) {
            ot2Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                o39 o39Var = this.d;
                if (o39Var != null) {
                    o39Var.x1();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            ot2 ot2Var = this.b;
            ArrayList arrayList = ot2Var.O;
            ot2Var.M = f;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((p06) arrayList.get(i2)).setLetterProgress(f);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f.K0() < 15) {
            this.d.z0(0);
            return;
        }
        cu6 cu6Var = this.e;
        cu6Var.b = 1;
        cu6Var.k(0, 0, false, false);
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void D(float f, int i) {
    }
}
