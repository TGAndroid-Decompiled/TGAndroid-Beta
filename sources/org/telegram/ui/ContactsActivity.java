package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class ContactsActivity extends org.telegram.ui.ActionBar.h2 implements te.b, org.telegram.messenger.fs, ke0, rh.c {
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
    public yr V;
    public String W;
    public org.telegram.ui.ActionBar.u1 X;
    public boolean Y;
    public boolean Z;
    public final te.c f42976a;
    public final a0.h f42977a0;
    public vr f42978b;
    public org.telegram.ui.ActionBar.h5 f42979b0;
    public org.telegram.ui.Components.kv0 f42980c;
    public String f42981c0;
    public org.telegram.ui.Components.ck0 d;
    public boolean f42982d0;
    public org.telegram.ui.ActionBar.l5 f42983e;
    public long f42984e0;
    public v4.c0 f42985f;
    public ViewPropertyAnimator f42986f0;
    public boolean f42987g0;
    public ur h;
    public final m4 f42988h0;
    public int f42989i0;
    public int f42990j0;
    public float f42991k0;
    public int f42992l0;
    public int m0;
    public org.telegram.ui.ActionBar.h5 f42993n;
    public boolean f42994n0;
    public boolean f42995o0;
    public int phonebookRow;
    public boolean f42996r;
    public org.telegram.ui.Components.a10 f42997s;
    public boolean f42998w;
    public v8 f42999x;
    public boolean f43000y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f42976a = new te.c(0, this, org.telegram.ui.Components.lr.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f42998w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.f42977a0 = new a0.h();
        this.f42982d0 = true;
        this.f42988h0 = new m4(this, 3);
    }

    public static void Z(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(contactsActivity.currentAccount).s(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void a0(ContactsActivity contactsActivity, int i7) {
        boolean z10;
        org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.ks.f(contactsActivity.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.Y = z10;
        if (i7 == 0) {
            return;
        }
        contactsActivity.h0(false);
    }

    public static void b0(ContactsActivity contactsActivity) {
        if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new eh0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i7, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.f42977a0;
        v4.i0 adapter = contactsActivity.d.getAdapter();
        ur urVar = contactsActivity.h;
        if (adapter == urVar) {
            urVar.getClass();
            Object E = contactsActivity.h.E(i10);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.g6)) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                if (g6Var.getUser() != null && g6Var.getUser().contact) {
                    contactsActivity.p0(g6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ur urVar2 = contactsActivity.h;
                int size = urVar2.d.size();
                int size2 = urVar2.I.size();
                jg.z1 z1Var = urVar2.f17655f;
                int size3 = z1Var.f17733e.size();
                int size4 = z1Var.f17737j.size();
                if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().f4(arrayList, false);
                    org.telegram.messenger.tr.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
                }
                if (contactsActivity.J) {
                    contactsActivity.l0(user, true, null);
                    return;
                } else if (contactsActivity.K) {
                    if (user.f28554id != org.telegram.messenger.j10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.L = true;
                        org.telegram.messenger.xv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28554id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new bn(bundle), contactsActivity.P);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    eh0 eh0Var = new eh0(contactsActivity.getParentActivity(), contactsActivity);
                    eh0Var.O0(str2, true);
                    eh0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                org.telegram.ui.Components.b5.u(contactsActivity, f5Var.f23846i, f5Var.f23847j, (String) f5Var.f23843e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f42978b.getClass();
        int S = contactsActivity.f42978b.S(i10);
        int Q = contactsActivity.f42978b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.nq)) {
                org.telegram.ui.Components.a10 a10Var = contactsActivity.f42997s;
                if (a10Var != null) {
                    a10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.qa)) {
                contactsActivity.p0((org.telegram.ui.Cells.qa) view);
            } else if ((!contactsActivity.F || i7 != 0) && S == 0) {
                if (contactsActivity.G) {
                    if (Q == 0) {
                        if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new a60());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new i9(null));
                    }
                } else if (i7 != 0) {
                    if (Q == 0) {
                        if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j3 = contactsActivity.S;
                        if (j3 == 0) {
                            j3 = contactsActivity.R;
                        }
                        ?? h2Var = new org.telegram.ui.ActionBar.h2(null);
                        h2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.h2) h2Var);
                    }
                } else if (Q == 0) {
                    if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new z40(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    boolean z10 = org.telegram.messenger.s2.f26723a;
                    contactsActivity.presentFragment(new g(0));
                    g12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f42978b.O(contactsActivity.f42978b.S(i10), contactsActivity.f42978b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.J) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.K) {
                        contactsActivity.L = true;
                        org.telegram.messenger.xv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f28554id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new bn(bundle2), contactsActivity.P);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.f5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.f5) O).f23843e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(2131748914, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.U = M0;
                        u1Var.S = org.telegram.messenger.gd.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new org.telegram.ui.Components.g2(29, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        contactsActivity.showDialog(u1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        vr vrVar;
        boolean z10;
        org.telegram.ui.Components.a10 a10Var = contactsActivity.f42997s;
        if (a10Var != null && (vrVar = contactsActivity.f42978b) != null) {
            if (contactsActivity.f42998w && !contactsActivity.E && !vrVar.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            a10Var.e(z10, true);
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56717a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            vr vrVar = this.f42978b;
            ArrayList arrayList = vrVar.O;
            vrVar.M = f10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f10);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final View S() {
        return this.fragmentView;
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null && ck0Var.getFastScroll() != null && this.d.getFastScroll().f35909n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29810z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29416e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29435f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29561m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.E = false;
        this.f43000y = false;
        if (this.I) {
            if (this.J) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745466, null));
            } else {
                org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
                if (this.K) {
                    i11 = 2131748071;
                } else {
                    i11 = 2131748078;
                }
                a5Var.setTitle(org.telegram.messenger.gd.M0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131751769, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.q().d(100, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 24));
        org.telegram.ui.ActionBar.g5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.h5 b10 = t6.b(0, 2131232488);
        this.f42979b0 = b10;
        b10.setContentDescription(org.telegram.messenger.gd.M0(2131745617, null));
        org.telegram.ui.ActionBar.h5 h5Var = this.f42979b0;
        h5Var.O();
        h5Var.C0 = new bi.s1(this, 9);
        if (!this.K && !this.J) {
            if (this.f42996r) {
                i10 = 2131232104;
            } else {
                i10 = 2131232103;
            }
            org.telegram.ui.ActionBar.h5 b11 = t6.b(1, i10);
            this.f42993n = b11;
            b11.setContentDescription(org.telegram.messenger.gd.M0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.ck0(context, null);
        this.h = new ur(this, context, this.f42977a0, this.U, this.N, this.M);
        int i12 = 2;
        if (this.S != 0) {
            i7 = org.telegram.messenger.v3.y(3, getMessagesController().O0(Long.valueOf(this.S))) ? 1 : 0;
        } else {
            if (this.R != 0) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.R));
                if (org.telegram.messenger.v3.y(3, O0) && !org.telegram.messenger.v3.t0(O0)) {
                    i7 = 2;
                }
            }
            i7 = 0;
        }
        vr vrVar = new vr(this, context, this.F ? 1 : 0, this.G, this.f42977a0, i7);
        this.f42978b = vrVar;
        if (this.f42993n != null) {
            if (this.f42996r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        vrVar.Y(i12, false);
        vr vrVar2 = this.f42978b;
        vrVar2.N = 17.0f;
        vrVar2.I = this.Z;
        v8 v8Var = new v8(3, context, this);
        this.f42999x = v8Var;
        this.fragmentView = v8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29339a7, this.f42999x, getResourceProvider());
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        wzVar.setViewType(29);
        wzVar.f41829x = false;
        org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(context, wzVar, 1, null);
        this.f42980c = kv0Var;
        kv0Var.addView(wzVar, 0);
        this.f42980c.setAnimateLayoutChange(true);
        this.f42980c.e(true, false);
        this.f42980c.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        this.f42980c.f36896e.setText(org.telegram.messenger.gd.M0(2131745612, null));
        this.f42999x.addView(this.f42980c, c8.ma.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f59151m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f42985f = c0Var;
        ck0Var.setLayoutManager(c0Var);
        this.d.setAdapter(this.f42978b);
        this.d.setClipToPadding(false);
        this.f42983e = new org.telegram.ui.ActionBar.l5(this.d, this.f42985f);
        this.f42999x.addView(this.d, c8.ma.c(-1.0f, -1));
        this.d.setEmptyView(this.f42980c);
        org.telegram.ui.Components.ck0 ck0Var2 = this.d;
        ck0Var2.X1 = true;
        ck0Var2.Y1 = 0;
        ck0Var2.setOnItemClickListener(new ai.s1(this, i7, 12));
        this.d.setOnItemLongClickListener(new tr(this));
        this.d.setOnScrollListener(new wr(this));
        if (!this.K && !this.J) {
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
            this.f42997s = a10Var;
            this.f42999x.addView(a10Var, org.telegram.ui.Components.a10.b());
            this.f42997s.setOnClickListener(new a(this, 15));
            this.f42997s.f33212c.f(2131624367, 44, 44, null);
            this.f42997s.f33212c.getAnimatedDrawable().M(this.f42997s.f33212c.getAnimatedDrawable().f37486e[0] - 1);
            this.f42997s.setContentDescription(org.telegram.messenger.gd.M0(2131751706, null));
        }
        String str = this.W;
        if (str != null) {
            org.telegram.ui.ActionBar.a5 a5Var2 = this.simpleActionBar;
            if (a5Var2.B(true, false)) {
                a5Var2.setSearchFieldText(str);
            }
            this.W = null;
        }
        k0();
        setBulletinDelegate(new y8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43080g1.d.add(this);
        }
        View view = this.fragmentView;
        tr trVar = new tr(this);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(view, trVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ck0 ck0Var;
        if (i7 == org.telegram.messenger.ks.O) {
            vr vrVar = this.f42978b;
            if (vrVar != null) {
                if (!this.f42996r) {
                    vrVar.Y(2, true);
                }
                this.f42978b.f();
            }
            if (this.h != null) {
                v4.i0 adapter = this.d.getAdapter();
                ur urVar = this.h;
                if (adapter == urVar) {
                    urVar.G(this.f42981c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.f25179r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (ck0Var = this.d) != null) {
                int childCount = ck0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.qa) {
                        ((org.telegram.ui.Cells.qa) childAt).i(intValue);
                    }
                }
            }
            int i13 = org.telegram.messenger.mp.I8;
            if ((intValue & 4) != 0 && !this.f42996r && this.f42978b != null && !this.f42987g0) {
                this.f42987g0 = true;
                m4 m4Var = this.f42988h0;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.h3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.ks.f25083a0;
        int i15 = org.telegram.messenger.ks.f25192t;
        if (i7 == i14) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f28413id);
                org.telegram.messenger.ks.f(this.currentAccount).k(i15, new Object[0]);
                presentFragment(new bn(bundle), false);
            }
        } else if (i7 == i15 && !this.L) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return !this.H;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(6, this);
        if (!this.H) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29396d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29676s8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29544l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29562m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29579n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29578n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29596o6));
        org.telegram.ui.Components.a10 a10Var = this.f42997s;
        if (a10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(a10Var.f33212c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f42997s.f33212c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.j10.i(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.Y) {
                showDialog(org.telegram.ui.Components.b5.v(parentActivity, new rr(this, 1)).f28746a);
                return;
            }
            this.f42984e0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void i0() {
        org.telegram.ui.Components.kv0 kv0Var = this.f42980c;
        if (kv0Var != null) {
            kv0Var.b(Math.max(this.f42992l0 + this.f42989i0, this.m0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.a10 a10Var = this.f42997s;
        if (a10Var != null) {
            a10Var.setTranslationY(((-this.f42992l0) - this.f42990j0) - this.f42991k0);
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56717a) {
            return baseSimpleGlass.f56620i;
        }
        return null;
    }

    public final void k0() {
        boolean z10;
        int i7;
        vr vrVar = this.f42978b;
        if (vrVar != null && vrVar.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42994n0 == z10 && this.f42995o0) {
            return;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f42979b0;
        if (z10) {
            i7 = 2131745539;
        } else {
            i7 = 2131745617;
        }
        h5Var.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
        this.f42994n0 = z10;
        this.f42995o0 = true;
    }

    public final void l0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.lc.b0(this).t(org.telegram.messenger.gd.M0(2131753106, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.v3.w(4, O0);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        if (w10) {
                            u1Var.S = org.telegram.messenger.gd.M0(2131754459, null);
                            u1Var.U = org.telegram.messenger.gd.M0(2131754458, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754464, null), new org.telegram.ui.Components.g2(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        } else {
                            u1Var.U = org.telegram.messenger.gd.M0(2131752555, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                        }
                        showDialog(u1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                u1Var2.S = M0;
                String b02 = org.telegram.messenger.gd.b0(this.T, org.telegram.messenger.o10.q(user));
                if (!user.bot && this.O) {
                    b02 = a8.p0.E(b02, "\n\n", org.telegram.messenger.gd.M0(2131754363, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29504j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.n6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new xr(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                u1Var2.U = b02;
                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), new z6(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                showDialog(u1Var2);
                if (editTextBoldCursor != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                        }
                        int L = org.telegram.messenger.g0.L(24.0f);
                        marginLayoutParams.leftMargin = L;
                        marginLayoutParams.rightMargin = L;
                        marginLayoutParams.height = org.telegram.messenger.g0.L(36.0f);
                        editTextBoldCursor.setLayoutParams(marginLayoutParams);
                    }
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    return;
                }
                return;
            }
            return;
        }
        yr yrVar = this.V;
        if (yrVar != null) {
            yrVar.b(user);
            if (this.Q) {
                this.V = null;
            }
        }
        if (this.P) {
            finishFragment();
        }
    }

    @Override
    public final void m(r0.l1 l1Var) {
        this.m0 = l1Var.f56258a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.w();
        int childCount = this.d.getChildCount();
        int i7 = 0;
        while (true) {
            a0.h hVar = this.f42977a0;
            if (i7 < childCount) {
                View childAt = this.d.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.qa) {
                    org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) childAt;
                    if (hVar.h(qaVar.getDialogId()) >= 0) {
                        qaVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (hVar.h(g6Var.getDialogId()) >= 0) {
                        g6Var.w(false, true);
                    }
                }
                i7++;
            } else {
                hVar.b();
                return;
            }
        }
    }

    public final void n0(ab.j jVar) {
        this.V = jVar;
    }

    public final void o0(String str) {
        this.W = str;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.x()) {
            if (z10) {
                m0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
            if (a5Var.G) {
                if (z10) {
                    a5Var.o(true);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (this.f42982d0 && (parentActivity = getParentActivity()) != null) {
            this.f42982d0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.v(parentActivity, new rr(this, 0)).f28746a;
                    this.X = u1Var;
                    showDialog(u1Var);
                    return;
                }
                h0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.u1 u1Var = this.X;
        if (u1Var != null && dialog == u1Var && getParentActivity() != null && this.Y) {
            h0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        super.onFragmentCreate();
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25179r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25083a0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25192t);
        this.f42982d0 = org.telegram.messenger.j10.i(this.currentAccount).V;
        Bundle bundle = this.arguments;
        int i10 = 0;
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
            this.f42996r = org.telegram.messenger.bz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f42989i0 = i7;
        if (this.H) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f42990j0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25179r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25083a0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25192t);
        this.V = null;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f42992l0 = i12;
        ri.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f42989i0);
        j0();
        i0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.o(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10 && "android.permission.READ_CONTACTS".equals(strArr[i10])) {
                    if (iArr[i10] == 0) {
                        org.telegram.messenger.i5.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.h1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f42984e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f26915b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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
        vr vrVar = this.f42978b;
        if (vrVar != null) {
            vrVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.ck0 ck0Var = this.d;
                if (ck0Var != null) {
                    ck0Var.x1();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.qa;
        boolean z12 = true;
        a0.h hVar = this.f42977a0;
        if (z11) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) viewGroup;
            long dialogId = qaVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                qaVar.c(false, true);
            } else if (qaVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) qaVar.getCurrentObject(), dialogId);
                qaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) viewGroup;
            long dialogId2 = g6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                g6Var.w(false, true);
            } else if (g6Var.getUser() != null) {
                hVar.k(g6Var.getUser(), dialogId2);
                g6Var.w(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.simpleActionBar.x()) {
            if (hVar.i()) {
                m0();
                return;
            }
        } else {
            if (z10) {
                org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.E(hVar.m(), false);
                this.simpleActionBar.J();
            }
            z12 = false;
        }
        this.simpleActionBar.E(hVar.m(), z12);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f42985f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f42983e;
        l5Var.f29201b = 1;
        l5Var.k(0, 0, false, false);
    }

    @Override
    public final void O() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
