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
public class ContactsActivity extends org.telegram.ui.ActionBar.e2 implements te.b, org.telegram.messenger.is, ie0, rh.c {
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
    public final te.c f42532a;
    public final a0.h f42533a0;
    public vr f42534b;
    public org.telegram.ui.ActionBar.d5 f42535b0;
    public org.telegram.ui.Components.cv0 f42536c;
    public String f42537c0;
    public org.telegram.ui.Components.uj0 d;
    public boolean f42538d0;
    public org.telegram.ui.Components.wi0 f42539e;
    public long f42540e0;
    public v4.b0 f42541f;
    public ViewPropertyAnimator f42542f0;
    public boolean f42543g0;
    public ur h;
    public final m4 f42544h0;
    public int f42545i0;
    public int f42546j0;
    public float f42547k0;
    public int f42548l0;
    public int m0;
    public org.telegram.ui.ActionBar.d5 f42549n;
    public boolean f42550n0;
    public boolean f42551o0;
    public int phonebookRow;
    public boolean f42552r;
    public org.telegram.ui.Components.t00 f42553s;
    public boolean f42554w;
    public v8 f42555x;
    public boolean f42556y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f42532a = new te.c(0, this, org.telegram.ui.Components.er.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f42554w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.f42533a0 = new a0.h();
        this.f42538d0 = true;
        this.f42544h0 = new m4(this, 3);
    }

    public static void Z(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(contactsActivity.currentAccount).s(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void a0(ContactsActivity contactsActivity, int i7) {
        boolean z10;
        org.telegram.messenger.np.f1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.ns.f(contactsActivity.currentAccount).k(org.telegram.messenger.ns.P5, new Object[0]);
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
        if (org.telegram.messenger.np.s1(contactsActivity.currentAccount).v2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new bh0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i7, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.f42533a0;
        v4.h0 adapter = contactsActivity.d.getAdapter();
        ur urVar = contactsActivity.h;
        if (adapter == urVar) {
            urVar.getClass();
            Object E = contactsActivity.h.E(i10);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.f6)) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                if (f6Var.getUser() != null && f6Var.getUser().contact) {
                    contactsActivity.p0(f6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                ur urVar2 = contactsActivity.h;
                int size = urVar2.d.size();
                int size2 = urVar2.I.size();
                jg.z1 z1Var = urVar2.f17269f;
                int size3 = z1Var.f17347e.size();
                int size4 = z1Var.f17351j.size();
                if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().Y3(arrayList, false);
                    org.telegram.messenger.vr.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
                }
                if (contactsActivity.J) {
                    contactsActivity.l0(user, true, null);
                    return;
                } else if (contactsActivity.K) {
                    if (user.f28200id != org.telegram.messenger.m10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.L = true;
                        org.telegram.messenger.bw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28200id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new an(bundle), contactsActivity.P);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (org.telegram.messenger.np.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    bh0 bh0Var = new bh0(contactsActivity.getParentActivity(), contactsActivity);
                    bh0Var.N0(str2, true);
                    bh0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                org.telegram.ui.Components.t4.u(contactsActivity, d5Var.f23045i, d5Var.f23046j, (String) d5Var.f23042e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f42534b.getClass();
        int S = contactsActivity.f42534b.S(i10);
        int Q = contactsActivity.f42534b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.gq)) {
                org.telegram.ui.Components.t00 t00Var = contactsActivity.f42553s;
                if (t00Var != null) {
                    t00Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.pa)) {
                contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            } else if ((!contactsActivity.F || i7 != 0) && S == 0) {
                if (contactsActivity.G) {
                    if (Q == 0) {
                        if (org.telegram.messenger.np.s1(contactsActivity.currentAccount).v2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new y50());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new i9(null));
                    }
                } else if (i7 != 0) {
                    if (Q == 0) {
                        if (org.telegram.messenger.np.s1(contactsActivity.currentAccount).v2()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j3 = contactsActivity.S;
                        if (j3 == 0) {
                            j3 = contactsActivity.R;
                        }
                        ?? e2Var = new org.telegram.ui.ActionBar.e2(null);
                        e2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.e2) e2Var);
                    }
                } else if (Q == 0) {
                    if (org.telegram.messenger.np.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new w40(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.np.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
                    boolean z10 = org.telegram.messenger.r2.f26206a;
                    contactsActivity.presentFragment(new g(0));
                    e12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f42534b.O(contactsActivity.f42534b.S(i10), contactsActivity.f42534b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.J) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.K) {
                        contactsActivity.L = true;
                        org.telegram.messenger.bw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f28200id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new an(bundle2), contactsActivity.P);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.d5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.d5) O).f23042e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131749106, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.U = M0;
                        t1Var.S = org.telegram.messenger.hd.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new tr(0, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        contactsActivity.showDialog(t1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        vr vrVar;
        boolean z10;
        org.telegram.ui.Components.t00 t00Var = contactsActivity.f42553s;
        if (t00Var != null && (vrVar = contactsActivity.f42534b) != null) {
            if (contactsActivity.f42554w && !contactsActivity.E && !vrVar.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            t00Var.e(z10, true);
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            vr vrVar = this.f42534b;
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
        org.telegram.ui.Components.uj0 uj0Var = this.d;
        if (uj0Var != null && uj0Var.getFastScroll() != null && this.d.getFastScroll().f42385n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29069p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28888f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.E = false;
        this.f42556y = false;
        if (this.I) {
            if (this.J) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745661, null));
            } else {
                org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
                if (this.K) {
                    i11 = 2131748263;
                } else {
                    i11 = 2131748270;
                }
                w4Var.setTitle(org.telegram.messenger.hd.M0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751780, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        }
        this.simpleActionBar.o().d(100, 2131232109, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 22));
        org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
        org.telegram.ui.ActionBar.d5 b10 = r10.b(0, 2131232487);
        this.f42535b0 = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131745812, null));
        org.telegram.ui.ActionBar.d5 d5Var = this.f42535b0;
        d5Var.O();
        d5Var.C0 = new kg.x1(this, 8);
        if (!this.K && !this.J) {
            if (this.f42552r) {
                i10 = 2131232103;
            } else {
                i10 = 2131232102;
            }
            org.telegram.ui.ActionBar.d5 b11 = r10.b(1, i10);
            this.f42549n = b11;
            b11.setContentDescription(org.telegram.messenger.hd.M0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.uj0(context, null);
        this.h = new ur(this, context, this.f42533a0, this.U, this.N, this.M);
        int i12 = 2;
        if (this.S != 0) {
            i7 = org.telegram.messenger.t3.y(3, getMessagesController().M0(Long.valueOf(this.S))) ? 1 : 0;
        } else {
            if (this.R != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.R));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i7 = 2;
                }
            }
            i7 = 0;
        }
        vr vrVar = new vr(this, context, this.F ? 1 : 0, this.G, this.f42533a0, i7);
        this.f42534b = vrVar;
        if (this.f42549n != null) {
            if (this.f42552r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        vrVar.Y(i12, false);
        vr vrVar2 = this.f42534b;
        vrVar2.N = 17.0f;
        vrVar2.I = this.Z;
        v8 v8Var = new v8(3, context, this);
        this.f42555x = v8Var;
        this.fragmentView = v8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, this.f42555x, getResourceProvider());
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(29);
        pzVar.f38448x = false;
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, pzVar, 1, null);
        this.f42536c = cv0Var;
        cv0Var.addView(pzVar, 0);
        this.f42536c.setAnimateLayoutChange(true);
        this.f42536c.e(true, false);
        this.f42536c.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.f42536c.f33709e.setText(org.telegram.messenger.hd.M0(2131745807, null));
        this.f42555x.addView(this.f42536c, c8.ja.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f58564m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.uj0 uj0Var = this.d;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f42541f = b0Var;
        uj0Var.setLayoutManager(b0Var);
        this.d.setAdapter(this.f42534b);
        this.d.setClipToPadding(false);
        this.f42539e = new org.telegram.ui.Components.wi0(this.d, this.f42541f);
        this.f42555x.addView(this.d, c8.ja.c(-1.0f, -1));
        this.d.setEmptyView(this.f42536c);
        org.telegram.ui.Components.uj0 uj0Var2 = this.d;
        uj0Var2.X1 = true;
        uj0Var2.Y1 = 0;
        uj0Var2.setOnItemClickListener(new ai.s1(this, i7, 12));
        this.d.setOnItemLongClickListener(new sr(this));
        this.d.setOnScrollListener(new wr(this));
        if (!this.K && !this.J) {
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
            this.f42553s = t00Var;
            this.f42555x.addView(t00Var, org.telegram.ui.Components.t00.b());
            this.f42553s.setOnClickListener(new a(this, 15));
            this.f42553s.f39465c.f(2131624367, 44, 44, null);
            this.f42553s.f39465c.getAnimatedDrawable().M(this.f42553s.f39465c.getAnimatedDrawable().f33579e[0] - 1);
            this.f42553s.setContentDescription(org.telegram.messenger.hd.M0(2131751717, null));
        }
        String str = this.W;
        if (str != null) {
            org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
            if (w4Var2.y(true, false)) {
                w4Var2.setSearchFieldText(str);
            }
            this.W = null;
        }
        k0();
        setBulletinDelegate(new y8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f42635g1.d.add(this);
        }
        View view = this.fragmentView;
        sr srVar = new sr(this);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(view, srVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.uj0 uj0Var;
        if (i7 == org.telegram.messenger.ns.O) {
            vr vrVar = this.f42534b;
            if (vrVar != null) {
                if (!this.f42552r) {
                    vrVar.Y(2, true);
                }
                this.f42534b.f();
            }
            if (this.h != null) {
                v4.h0 adapter = this.d.getAdapter();
                ur urVar = this.h;
                if (adapter == urVar) {
                    urVar.G(this.f42537c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.f25560r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.D8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (uj0Var = this.d) != null) {
                int childCount = uj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
            }
            int i13 = org.telegram.messenger.np.D8;
            if ((intValue & 4) != 0 && !this.f42552r && this.f42534b != null && !this.f42543g0) {
                this.f42543g0 = true;
                m4 m4Var = this.f42544h0;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.ns.f25464a0;
        int i15 = org.telegram.messenger.ns.f25573t;
        if (i7 == i14) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f28059id);
                org.telegram.messenger.ns.f(this.currentAccount).k(i15, new Object[0]);
                presentFragment(new an(bundle), false);
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
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(6, this);
        if (!this.H) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28997l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29015m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29032n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 262148, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29049o6));
        org.telegram.ui.Components.t00 t00Var = this.f42553s;
        if (t00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(t00Var.f39465c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42553s.f39465c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.m10.i(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.Y) {
                showDialog(org.telegram.ui.Components.t4.v(parentActivity, new qr(this, 1)).f28392a);
                return;
            }
            this.f42540e0 = SystemClock.elapsedRealtime();
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
        org.telegram.ui.Components.cv0 cv0Var = this.f42536c;
        if (cv0Var != null) {
            cv0Var.b(Math.max(this.f42548l0 + this.f42545i0, this.m0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.t00 t00Var = this.f42553s;
        if (t00Var != null) {
            t00Var.setTranslationY(((-this.f42548l0) - this.f42546j0) - this.f42547k0);
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.f56046i;
        }
        return null;
    }

    public final void k0() {
        boolean z10;
        int i7;
        vr vrVar = this.f42534b;
        if (vrVar != null && vrVar.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42550n0 == z10 && this.f42551o0) {
            return;
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.f42535b0;
        if (z10) {
            i7 = 2131745734;
        } else {
            i7 = 2131745812;
        }
        d5Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        this.f42550n0 = z10;
        this.f42551o0 = true;
    }

    public final void l0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.cc.a0(this).t(org.telegram.messenger.hd.M0(2131753108, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.t3.w(4, M0);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        if (w10) {
                            t1Var.S = org.telegram.messenger.hd.M0(2131754461, null);
                            t1Var.U = org.telegram.messenger.hd.M0(2131754460, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754466, null), new org.telegram.ui.Components.f1(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        } else {
                            t1Var.U = org.telegram.messenger.hd.M0(2131752566, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        }
                        showDialog(t1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                t1Var2.S = M02;
                String b02 = org.telegram.messenger.hd.b0(this.T, org.telegram.messenger.q10.p(user));
                if (!user.bot && this.O) {
                    b02 = a8.p0.E(b02, "\n\n", org.telegram.messenger.hd.M0(2131754365, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f28957j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.j6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new xr(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                t1Var2.U = b02;
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), new a7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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
    public final void m(r0.k1 k1Var) {
        this.m0 = k1Var.f55682a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.u();
        int childCount = this.d.getChildCount();
        int i7 = 0;
        while (true) {
            a0.h hVar = this.f42533a0;
            if (i7 < childCount) {
                View childAt = this.d.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.pa) {
                    org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                    if (hVar.h(paVar.getDialogId()) >= 0) {
                        paVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (hVar.h(f6Var.getDialogId()) >= 0) {
                        f6Var.w(false, true);
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
        if (this.simpleActionBar.v()) {
            if (z10) {
                m0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            if (w4Var.G) {
                if (z10) {
                    w4Var.m(true);
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
        if (this.f42538d0 && (parentActivity = getParentActivity()) != null) {
            this.f42538d0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.v(parentActivity, new qr(this, 0)).f28392a;
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
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.O);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25560r);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25464a0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25573t);
        this.f42538d0 = org.telegram.messenger.m10.i(this.currentAccount).V;
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
            this.f42552r = org.telegram.messenger.gz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f42545i0 = i7;
        if (this.H) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f42546j0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.O);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25560r);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25464a0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25573t);
        this.V = null;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f42548l0 = i12;
        ri.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f42545i0);
        j0();
        i0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.m(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10 && "android.permission.READ_CONTACTS".equals(strArr[i10])) {
                    if (iArr[i10] == 0) {
                        org.telegram.messenger.g5.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = org.telegram.messenger.np.f1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f42540e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f26609b.getPackageName(), null));
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
        vr vrVar = this.f42534b;
        if (vrVar != null) {
            vrVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.uj0 uj0Var = this.d;
                if (uj0Var != null) {
                    uj0Var.x1();
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
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.pa;
        boolean z12 = true;
        a0.h hVar = this.f42533a0;
        if (z11) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) viewGroup;
            long dialogId = paVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                paVar.c(false, true);
            } else if (paVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) paVar.getCurrentObject(), dialogId);
                paVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) viewGroup;
            long dialogId2 = f6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                f6Var.w(false, true);
            } else if (f6Var.getUser() != null) {
                hVar.k(f6Var.getUser(), dialogId2);
                f6Var.w(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.simpleActionBar.v()) {
            if (hVar.i()) {
                m0();
                return;
            }
        } else {
            if (z10) {
                org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.A(hVar.m(), false);
                this.simpleActionBar.F();
            }
            z12 = false;
        }
        this.simpleActionBar.A(hVar.m(), z12);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f42541f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.wi0 wi0Var = this.f42539e;
        wi0Var.f41357b = 1;
        wi0Var.d(0, 0, false, false);
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
