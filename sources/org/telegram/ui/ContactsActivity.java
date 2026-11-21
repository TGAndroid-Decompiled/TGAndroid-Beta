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
public class ContactsActivity extends org.telegram.ui.ActionBar.g2 implements te.b, org.telegram.messenger.fs, le0, rh.c {
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
    public final te.c f43017a;
    public final a0.h f43018a0;
    public vr f43019b;
    public org.telegram.ui.ActionBar.g5 f43020b0;
    public org.telegram.ui.Components.nv0 f43021c;
    public String f43022c0;
    public org.telegram.ui.Components.ek0 d;
    public boolean f43023d0;
    public org.telegram.ui.ActionBar.k5 f43024e;
    public long f43025e0;
    public v4.c0 f43026f;
    public ViewPropertyAnimator f43027f0;
    public boolean f43028g0;
    public ur h;
    public final m4 f43029h0;
    public int f43030i0;
    public int f43031j0;
    public float f43032k0;
    public int f43033l0;
    public int m0;
    public org.telegram.ui.ActionBar.g5 f43034n;
    public boolean f43035n0;
    public boolean f43036o0;
    public int phonebookRow;
    public boolean f43037r;
    public org.telegram.ui.Components.c10 f43038s;
    public boolean f43039w;
    public w8 f43040x;
    public boolean f43041y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f43017a = new te.c(0, this, org.telegram.ui.Components.nr.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f43039w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.f43018a0 = new a0.h();
        this.f43023d0 = true;
        this.f43029h0 = new m4(this, 3);
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
        org.telegram.messenger.ks.f(contactsActivity.currentAccount).k(org.telegram.messenger.ks.S5, new Object[0]);
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
            new fh0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i7, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.f43018a0;
        v4.i0 adapter = contactsActivity.d.getAdapter();
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
                jg.z1 z1Var = urVar2.f17677f;
                int size3 = z1Var.f17755e.size();
                int size4 = z1Var.f17759j.size();
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
                    if (user.f28580id != org.telegram.messenger.j10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.L = true;
                        org.telegram.messenger.xv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28580id);
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
                    fh0 fh0Var = new fh0(contactsActivity.getParentActivity(), contactsActivity);
                    fh0Var.O0(str2, true);
                    fh0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                org.telegram.ui.Components.c5.u(contactsActivity, f5Var.f23871i, f5Var.f23872j, (String) f5Var.f23868e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f43019b.getClass();
        int S = contactsActivity.f43019b.S(i10);
        int Q = contactsActivity.f43019b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.pq)) {
                org.telegram.ui.Components.c10 c10Var = contactsActivity.f43038s;
                if (c10Var != null) {
                    c10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.ra)) {
                contactsActivity.p0((org.telegram.ui.Cells.ra) view);
            } else if ((!contactsActivity.F || i7 != 0) && S == 0) {
                if (contactsActivity.G) {
                    if (Q == 0) {
                        if (org.telegram.messenger.mp.u1(contactsActivity.currentAccount).A2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new a60());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new j9(null));
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
                        ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                        g2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
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
                    boolean z10 = org.telegram.messenger.s2.f26749a;
                    contactsActivity.presentFragment(new g(0));
                    g12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f43019b.O(contactsActivity.f43019b.S(i10), contactsActivity.f43019b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.J) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.K) {
                        contactsActivity.L = true;
                        org.telegram.messenger.xv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f28580id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new bn(bundle2), contactsActivity.P);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.f5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.f5) O).f23868e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(2131748913, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                        t1Var.U = N0;
                        t1Var.S = org.telegram.messenger.gd.N0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new org.telegram.ui.Components.h2(29, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        contactsActivity.showDialog(t1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        vr vrVar;
        boolean z10;
        org.telegram.ui.Components.c10 c10Var = contactsActivity.f43038s;
        if (c10Var != null && (vrVar = contactsActivity.f43019b) != null) {
            if (contactsActivity.f43039w && !contactsActivity.E && !vrVar.J) {
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
        if (ri.q.f().f56758a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            vr vrVar = this.f43019b;
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
        if (ek0Var != null && ek0Var.getFastScroll() != null && this.d.getFastScroll().f36545n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29598p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29398e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29417f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29543m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29770y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.E = false;
        this.f43041y = false;
        if (this.I) {
            if (this.J) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745465, null));
            } else {
                org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
                if (this.K) {
                    i11 = 2131748070;
                } else {
                    i11 = 2131748077;
                }
                z4Var.setTitle(org.telegram.messenger.gd.N0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751768, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        }
        this.simpleActionBar.q().d(100, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 24));
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, 2131232488);
        this.f43020b0 = b10;
        b10.setContentDescription(org.telegram.messenger.gd.N0(2131745616, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f43020b0;
        g5Var.O();
        g5Var.C0 = new bi.w1(this, 9);
        if (!this.K && !this.J) {
            if (this.f43037r) {
                i10 = 2131232104;
            } else {
                i10 = 2131232103;
            }
            org.telegram.ui.ActionBar.g5 b11 = t6.b(1, i10);
            this.f43034n = b11;
            b11.setContentDescription(org.telegram.messenger.gd.N0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.ek0(context, null);
        this.h = new ur(this, context, this.f43018a0, this.U, this.N, this.M);
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
        vr vrVar = new vr(this, context, this.F ? 1 : 0, this.G, this.f43018a0, i7);
        this.f43019b = vrVar;
        if (this.f43034n != null) {
            if (this.f43037r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        vrVar.Y(i12, false);
        vr vrVar2 = this.f43019b;
        vrVar2.N = 17.0f;
        vrVar2.I = this.Z;
        w8 w8Var = new w8(3, context, this);
        this.f43040x = w8Var;
        this.fragmentView = w8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29321a7, this.f43040x, getResourceProvider());
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(29);
        yzVar.f42613x = false;
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 1, null);
        this.f43021c = nv0Var;
        nv0Var.addView(yzVar, 0);
        this.f43021c.setAnimateLayoutChange(true);
        this.f43021c.e(true, false);
        this.f43021c.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.f43021c.f37991e.setText(org.telegram.messenger.gd.N0(2131745611, null));
        this.f43040x.addView(this.f43021c, c8.ma.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f59190m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.ek0 ek0Var = this.d;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f43026f = c0Var;
        ek0Var.setLayoutManager(c0Var);
        this.d.setAdapter(this.f43019b);
        this.d.setClipToPadding(false);
        this.f43024e = new org.telegram.ui.ActionBar.k5(this.d, this.f43026f);
        this.f43040x.addView(this.d, c8.ma.c(-1.0f, -1));
        this.d.setEmptyView(this.f43021c);
        org.telegram.ui.Components.ek0 ek0Var2 = this.d;
        ek0Var2.X1 = true;
        ek0Var2.Y1 = 0;
        ek0Var2.setOnItemClickListener(new ai.u1(this, i7, 12));
        this.d.setOnItemLongClickListener(new tr(this));
        this.d.setOnScrollListener(new wr(this));
        if (!this.K && !this.J) {
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
            this.f43038s = c10Var;
            this.f43040x.addView(c10Var, org.telegram.ui.Components.c10.b());
            this.f43038s.setOnClickListener(new a(this, 15));
            this.f43038s.f33973c.f(2131624367, 44, 44, null);
            this.f43038s.f33973c.getAnimatedDrawable().M(this.f43038s.f33973c.getAnimatedDrawable().f38217e[0] - 1);
            this.f43038s.setContentDescription(org.telegram.messenger.gd.N0(2131751705, null));
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
        setBulletinDelegate(new z8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43121g1.d.add(this);
        }
        View view = this.fragmentView;
        tr trVar = new tr(this);
        WeakHashMap weakHashMap = r0.i0.f56285a;
        r0.a0.i(view, trVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ek0 ek0Var;
        if (i7 == org.telegram.messenger.ks.O) {
            vr vrVar = this.f43019b;
            if (vrVar != null) {
                if (!this.f43037r) {
                    vrVar.Y(2, true);
                }
                this.f43019b.f();
            }
            if (this.h != null) {
                v4.i0 adapter = this.d.getAdapter();
                ur urVar = this.h;
                if (adapter == urVar) {
                    urVar.G(this.f43022c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.f25205r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (ek0Var = this.d) != null) {
                int childCount = ek0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.ra) {
                        ((org.telegram.ui.Cells.ra) childAt).i(intValue);
                    }
                }
            }
            int i13 = org.telegram.messenger.mp.I8;
            if ((intValue & 4) != 0 && !this.f43037r && this.f43019b != null && !this.f43028g0) {
                this.f43028g0 = true;
                m4 m4Var = this.f43029h0;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.h3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.ks.f25108a0;
        int i15 = org.telegram.messenger.ks.f25218t;
        if (i7 == i14) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f28439id);
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
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(6, this);
        if (!this.H) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29378d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29658s8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29526l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29544m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29561n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29560n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 262148, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29578o6));
        org.telegram.ui.Components.c10 c10Var = this.f43038s;
        if (c10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(c10Var.f33973c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43038s.f33973c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.j10.i(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.Y) {
                showDialog(org.telegram.ui.Components.c5.v(parentActivity, new rr(this, 1)).f28774a);
                return;
            }
            this.f43025e0 = SystemClock.elapsedRealtime();
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
        org.telegram.ui.Components.nv0 nv0Var = this.f43021c;
        if (nv0Var != null) {
            nv0Var.b(Math.max(this.f43033l0 + this.f43030i0, this.m0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.c10 c10Var = this.f43038s;
        if (c10Var != null) {
            c10Var.setTranslationY(((-this.f43033l0) - this.f43031j0) - this.f43032k0);
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56758a) {
            return baseSimpleGlass.f56661i;
        }
        return null;
    }

    public final void k0() {
        boolean z10;
        int i7;
        vr vrVar = this.f43019b;
        if (vrVar != null && vrVar.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43035n0 == z10 && this.f43036o0) {
            return;
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.f43020b0;
        if (z10) {
            i7 = 2131745538;
        } else {
            i7 = 2131745616;
        }
        g5Var.setSearchFieldHint(org.telegram.messenger.gd.N0(i7, null));
        this.f43035n0 = z10;
        this.f43036o0 = true;
    }

    public final void l0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.lc.b0(this).t(org.telegram.messenger.gd.N0(2131753105, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.v3.w(4, O0);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                        if (w10) {
                            t1Var.S = org.telegram.messenger.gd.N0(2131754458, null);
                            t1Var.U = org.telegram.messenger.gd.N0(2131754457, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754463, null), new org.telegram.ui.Components.h2(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        } else {
                            t1Var.U = org.telegram.messenger.gd.N0(2131752554, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        }
                        showDialog(t1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28774a;
                t1Var2.S = N0;
                String b02 = org.telegram.messenger.gd.b0(this.T, org.telegram.messenger.o10.q(user));
                if (!user.bot && this.O) {
                    b02 = a8.p0.E(b02, "\n\n", org.telegram.messenger.gd.N0(2131754362, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f29486j5, getResourceProvider());
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
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), new z6(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
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
        this.m0 = l1Var.f56299a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.w();
        int childCount = this.d.getChildCount();
        int i7 = 0;
        while (true) {
            a0.h hVar = this.f43018a0;
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
        if (this.f43023d0 && (parentActivity = getParentActivity()) != null) {
            this.f43023d0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.v(parentActivity, new rr(this, 0)).f28774a;
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
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25205r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25108a0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25218t);
        this.f43023d0 = org.telegram.messenger.j10.i(this.currentAccount).V;
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
            this.f43037r = org.telegram.messenger.bz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f43030i0 = i7;
        if (this.H) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f43031j0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.O);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25205r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25108a0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25218t);
        this.V = null;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f43033l0 = i12;
        ri.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f43030i0);
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
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.h1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f43025e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f26941b.getPackageName(), null));
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
        vr vrVar = this.f43019b;
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
        a0.h hVar = this.f43018a0;
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
        if (this.f43026f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f43024e;
        k5Var.f29183b = 1;
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
