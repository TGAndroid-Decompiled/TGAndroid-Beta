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
public class ContactsActivity extends org.telegram.ui.ActionBar.g2 implements te.b, org.telegram.messenger.gs, ke0, rh.c {
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
    public org.telegram.ui.ActionBar.t1 X;
    public boolean Y;
    public boolean Z;
    public final te.c f42986a;
    public final a0.h f42987a0;
    public vr f42988b;
    public org.telegram.ui.ActionBar.g5 f42989b0;
    public org.telegram.ui.Components.nv0 f42990c;
    public String f42991c0;
    public org.telegram.ui.Components.ek0 d;
    public boolean f42992d0;
    public org.telegram.ui.ActionBar.k5 f42993e;
    public long f42994e0;
    public v4.b0 f42995f;
    public ViewPropertyAnimator f42996f0;
    public boolean f42997g0;
    public ur h;
    public final m4 f42998h0;
    public int f42999i0;
    public int f43000j0;
    public float f43001k0;
    public int f43002l0;
    public int m0;
    public org.telegram.ui.ActionBar.g5 f43003n;
    public boolean f43004n0;
    public boolean f43005o0;
    public int phonebookRow;
    public boolean f43006r;
    public org.telegram.ui.Components.c10 f43007s;
    public boolean f43008w;
    public v8 f43009x;
    public boolean f43010y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f42986a = new te.c(0, this, org.telegram.ui.Components.nr.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f43008w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.f42987a0 = new a0.h();
        this.f42992d0 = true;
        this.f42998h0 = new m4(this, 3);
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
        org.telegram.messenger.np.h1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.ls.f(contactsActivity.currentAccount).k(org.telegram.messenger.ls.S5, new Object[0]);
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
        if (org.telegram.messenger.np.u1(contactsActivity.currentAccount).A2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new fh0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i7, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.f42987a0;
        v4.h0 adapter = contactsActivity.d.getAdapter();
        ur urVar = contactsActivity.h;
        if (adapter == urVar) {
            urVar.getClass();
            Object E = contactsActivity.h.E(i10);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() != null && h6Var.getUser().contact) {
                    contactsActivity.p0(h6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ur urVar2 = contactsActivity.h;
                int size = urVar2.d.size();
                int size2 = urVar2.I.size();
                jg.z1 z1Var = urVar2.f17646f;
                int size3 = z1Var.f17724e.size();
                int size4 = z1Var.f17728j.size();
                if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().f4(arrayList, false);
                    org.telegram.messenger.ur.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
                }
                if (contactsActivity.J) {
                    contactsActivity.l0(user, true, null);
                    return;
                } else if (contactsActivity.K) {
                    if (user.f28547id != org.telegram.messenger.k10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.L = true;
                        org.telegram.messenger.yv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28547id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new bn(bundle), contactsActivity.P);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (org.telegram.messenger.np.u1(contactsActivity.currentAccount).A2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    fh0 fh0Var = new fh0(contactsActivity.getParentActivity(), contactsActivity);
                    fh0Var.O0(str2, true);
                    fh0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                org.telegram.ui.Components.c5.u(contactsActivity, f5Var.f23830i, f5Var.f23831j, (String) f5Var.f23827e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f42988b.getClass();
        int S = contactsActivity.f42988b.S(i10);
        int Q = contactsActivity.f42988b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.pq)) {
                org.telegram.ui.Components.c10 c10Var = contactsActivity.f43007s;
                if (c10Var != null) {
                    c10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.ra)) {
                contactsActivity.p0((org.telegram.ui.Cells.ra) view);
            } else if ((!contactsActivity.F || i7 != 0) && S == 0) {
                if (contactsActivity.G) {
                    if (Q == 0) {
                        if (org.telegram.messenger.np.u1(contactsActivity.currentAccount).A2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new a60());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new i9(null));
                    }
                } else if (i7 != 0) {
                    if (Q == 0) {
                        if (org.telegram.messenger.np.u1(contactsActivity.currentAccount).A2()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j3 = contactsActivity.S;
                        if (j3 == 0) {
                            j3 = contactsActivity.R;
                        }
                        ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                        g2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                    }
                } else if (Q == 0) {
                    if (org.telegram.messenger.np.u1(contactsActivity.currentAccount).A2()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new z40(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.np.u1(contactsActivity.currentAccount).A2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences g12 = org.telegram.messenger.np.g1();
                    boolean z10 = org.telegram.messenger.s2.f26694a;
                    contactsActivity.presentFragment(new g(0));
                    g12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f42988b.O(contactsActivity.f42988b.S(i10), contactsActivity.f42988b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.J) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.K) {
                        contactsActivity.L = true;
                        org.telegram.messenger.yv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f28547id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new bn(bundle2), contactsActivity.P);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.f5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.f5) O).f23827e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String N0 = org.telegram.messenger.hd.N0(2131748913, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.U = N0;
                        t1Var.S = org.telegram.messenger.hd.N0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new org.telegram.ui.Components.h2(29, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        contactsActivity.showDialog(t1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        vr vrVar;
        boolean z10;
        org.telegram.ui.Components.c10 c10Var = contactsActivity.f43007s;
        if (c10Var != null && (vrVar = contactsActivity.f42988b) != null) {
            if (contactsActivity.f43008w && !contactsActivity.E && !vrVar.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            c10Var.e(z10, true);
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56727a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            vr vrVar = this.f42988b;
            ArrayList arrayList = vrVar.O;
            vrVar.M = f10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Cells.t4) arrayList.get(i10)).setLetterProgress(f10);
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
        org.telegram.ui.Components.ek0 ek0Var = this.d;
        if (ek0Var != null && ek0Var.getFastScroll() != null && this.d.getFastScroll().f36498n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29567p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29761z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29367e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29386f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29512m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29739y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.E = false;
        this.f43010y = false;
        if (this.I) {
            if (this.J) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745465, null));
            } else {
                org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
                if (this.K) {
                    i11 = 2131748070;
                } else {
                    i11 = 2131748077;
                }
                z4Var.setTitle(org.telegram.messenger.hd.N0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131751768, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        }
        this.simpleActionBar.q().d(100, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.N0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 24));
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, 2131232488);
        this.f42989b0 = b10;
        b10.setContentDescription(org.telegram.messenger.hd.N0(2131745616, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f42989b0;
        g5Var.O();
        g5Var.C0 = new bi.x1(this, 9);
        if (!this.K && !this.J) {
            if (this.f43006r) {
                i10 = 2131232104;
            } else {
                i10 = 2131232103;
            }
            org.telegram.ui.ActionBar.g5 b11 = t6.b(1, i10);
            this.f43003n = b11;
            b11.setContentDescription(org.telegram.messenger.hd.N0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.ek0(context, null);
        this.h = new ur(this, context, this.f42987a0, this.U, this.N, this.M);
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
        vr vrVar = new vr(this, context, this.F ? 1 : 0, this.G, this.f42987a0, i7);
        this.f42988b = vrVar;
        if (this.f43003n != null) {
            if (this.f43006r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        vrVar.Y(i12, false);
        vr vrVar2 = this.f42988b;
        vrVar2.N = 17.0f;
        vrVar2.I = this.Z;
        v8 v8Var = new v8(3, context, this);
        this.f43009x = v8Var;
        this.fragmentView = v8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, this.f43009x, getResourceProvider());
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(29);
        yzVar.f42563x = false;
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 1, null);
        this.f42990c = nv0Var;
        nv0Var.addView(yzVar, 0);
        this.f42990c.setAnimateLayoutChange(true);
        this.f42990c.e(true, false);
        this.f42990c.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.f42990c.f37962e.setText(org.telegram.messenger.hd.N0(2131745611, null));
        this.f43009x.addView(this.f42990c, c8.na.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f59139m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.ek0 ek0Var = this.d;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f42995f = b0Var;
        ek0Var.setLayoutManager(b0Var);
        this.d.setAdapter(this.f42988b);
        this.d.setClipToPadding(false);
        this.f42993e = new org.telegram.ui.ActionBar.k5(this.d, this.f42995f);
        this.f43009x.addView(this.d, c8.na.c(-1.0f, -1));
        this.d.setEmptyView(this.f42990c);
        org.telegram.ui.Components.ek0 ek0Var2 = this.d;
        ek0Var2.X1 = true;
        ek0Var2.Y1 = 0;
        ek0Var2.setOnItemClickListener(new ai.m1(this, i7, 11));
        this.d.setOnItemLongClickListener(new tr(this));
        this.d.setOnScrollListener(new wr(this));
        if (!this.K && !this.J) {
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
            this.f43007s = c10Var;
            this.f43009x.addView(c10Var, org.telegram.ui.Components.c10.b());
            this.f43007s.setOnClickListener(new a(this, 15));
            this.f43007s.f33930c.f(2131624367, 44, 44, null);
            this.f43007s.f33930c.getAnimatedDrawable().M(this.f43007s.f33930c.getAnimatedDrawable().f38179e[0] - 1);
            this.f43007s.setContentDescription(org.telegram.messenger.hd.N0(2131751705, null));
        }
        String str = this.W;
        if (str != null) {
            org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
            if (z4Var2.B(true, false)) {
                z4Var2.setSearchFieldText(str);
            }
            this.W = null;
        }
        k0();
        setBulletinDelegate(new y8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43090g1.d.add(this);
        }
        View view = this.fragmentView;
        tr trVar = new tr(this);
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.a0.i(view, trVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ek0 ek0Var;
        if (i7 == org.telegram.messenger.ls.O) {
            vr vrVar = this.f42988b;
            if (vrVar != null) {
                if (!this.f43006r) {
                    vrVar.Y(2, true);
                }
                this.f42988b.f();
            }
            if (this.h != null) {
                v4.h0 adapter = this.d.getAdapter();
                ur urVar = this.h;
                if (adapter == urVar) {
                    urVar.G(this.f42991c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.f25335r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (ek0Var = this.d) != null) {
                int childCount = ek0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.ra) {
                        ((org.telegram.ui.Cells.ra) childAt).i(intValue);
                    }
                }
            }
            int i13 = org.telegram.messenger.np.I8;
            if ((intValue & 4) != 0 && !this.f43006r && this.f42988b != null && !this.f42997g0) {
                this.f42997g0 = true;
                m4 m4Var = this.f42998h0;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.h3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.ls.f25238a0;
        int i15 = org.telegram.messenger.ls.f25348t;
        if (i7 == i14) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f28406id);
                org.telegram.messenger.ls.f(this.currentAccount).k(i15, new Object[0]);
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
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(6, this);
        if (!this.H) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29347d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29627s8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29495l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29513m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29530n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29529n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 262148, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29547o6));
        org.telegram.ui.Components.c10 c10Var = this.f43007s;
        if (c10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(c10Var.f33930c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43007s.f33930c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.k10.i(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.Y) {
                showDialog(org.telegram.ui.Components.c5.v(parentActivity, new rr(this, 1)).f28743a);
                return;
            }
            this.f42994e0 = SystemClock.elapsedRealtime();
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
        org.telegram.ui.Components.nv0 nv0Var = this.f42990c;
        if (nv0Var != null) {
            nv0Var.b(Math.max(this.f43002l0 + this.f42999i0, this.m0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.c10 c10Var = this.f43007s;
        if (c10Var != null) {
            c10Var.setTranslationY(((-this.f43002l0) - this.f43000j0) - this.f43001k0);
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56727a) {
            return baseSimpleGlass.f56630i;
        }
        return null;
    }

    public final void k0() {
        boolean z10;
        int i7;
        vr vrVar = this.f42988b;
        if (vrVar != null && vrVar.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43004n0 == z10 && this.f43005o0) {
            return;
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.f42989b0;
        if (z10) {
            i7 = 2131745538;
        } else {
            i7 = 2131745616;
        }
        g5Var.setSearchFieldHint(org.telegram.messenger.hd.N0(i7, null));
        this.f43004n0 = z10;
        this.f43005o0 = true;
    }

    public final void l0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.lc.b0(this).t(org.telegram.messenger.hd.N0(2131753105, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.v3.w(4, O0);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        if (w10) {
                            t1Var.S = org.telegram.messenger.hd.N0(2131754458, null);
                            t1Var.U = org.telegram.messenger.hd.N0(2131754457, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754463, null), new org.telegram.ui.Components.h2(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        } else {
                            t1Var.U = org.telegram.messenger.hd.N0(2131752554, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                        }
                        showDialog(t1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                t1Var2.S = N0;
                String b02 = org.telegram.messenger.hd.b0(this.T, org.telegram.messenger.p10.q(user));
                if (!user.bot && this.O) {
                    b02 = a8.p0.E(b02, "\n\n", org.telegram.messenger.hd.N0(2131754362, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f29455j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.m6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new xr(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                t1Var2.U = b02;
                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), new z6(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                showDialog(t1Var2);
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
        this.m0 = l1Var.f56268a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.w();
        int childCount = this.d.getChildCount();
        int i7 = 0;
        while (true) {
            a0.h hVar = this.f42987a0;
            if (i7 < childCount) {
                View childAt = this.d.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.ra) {
                    org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) childAt;
                    if (hVar.h(raVar.getDialogId()) >= 0) {
                        raVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (hVar.h(h6Var.getDialogId()) >= 0) {
                        h6Var.w(false, true);
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
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var.G) {
                if (z10) {
                    z4Var.o(true);
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
        if (this.f42992d0 && (parentActivity = getParentActivity()) != null) {
            this.f42992d0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.v(parentActivity, new rr(this, 0)).f28743a;
                    this.X = t1Var;
                    showDialog(t1Var);
                    return;
                }
                h0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.t1 t1Var = this.X;
        if (t1Var != null && dialog == t1Var && getParentActivity() != null && this.Y) {
            h0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        super.onFragmentCreate();
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.O);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25335r);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25238a0);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25348t);
        this.f42992d0 = org.telegram.messenger.k10.i(this.currentAccount).V;
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
            this.f43006r = org.telegram.messenger.cz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f42999i0 = i7;
        if (this.H) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f43000j0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.O);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25335r);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25238a0);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25348t);
        this.V = null;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f43002l0 = i12;
        ri.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f42999i0);
        j0();
        i0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.o(true);
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
                    SharedPreferences.Editor edit = org.telegram.messenger.np.h1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f42994e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f26895b.getPackageName(), null));
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
        vr vrVar = this.f42988b;
        if (vrVar != null) {
            vrVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.ek0 ek0Var = this.d;
                if (ek0Var != null) {
                    ek0Var.x1();
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
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.ra;
        boolean z12 = true;
        a0.h hVar = this.f42987a0;
        if (z11) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) viewGroup;
            long dialogId = raVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                raVar.c(false, true);
            } else if (raVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) raVar.getCurrentObject(), dialogId);
                raVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) viewGroup;
            long dialogId2 = h6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                h6Var.w(false, true);
            } else if (h6Var.getUser() != null) {
                hVar.k(h6Var.getUser(), dialogId2);
                h6Var.w(true, true);
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
        if (this.f42995f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f42993e;
        k5Var.f29152b = 1;
        k5Var.k(0, 0, false, false);
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
