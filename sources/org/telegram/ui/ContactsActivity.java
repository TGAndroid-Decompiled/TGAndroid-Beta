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
public class ContactsActivity extends org.telegram.ui.ActionBar.f2 implements te.b, org.telegram.messenger.ls, le0, rh.c {
    public boolean D;
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
    public long Q;
    public long R;
    public String S;
    public boolean T;
    public yr U;
    public String V;
    public org.telegram.ui.ActionBar.u1 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final te.c f41177a;
    public org.telegram.ui.ActionBar.g5 f41178a0;
    public vr f41179b;
    public String f41180b0;
    public org.telegram.ui.Components.bv0 f41181c;
    public boolean f41182c0;
    public org.telegram.ui.Components.pj0 d;
    public long f41183d0;
    public org.telegram.ui.Components.ri0 f41184e;
    public ViewPropertyAnimator f41185e0;
    public v4.b0 f41186f;
    public boolean f41187f0;
    public final m4 f41188g0;
    public ur h;
    public int f41189h0;
    public int f41190i0;
    public float f41191j0;
    public int f41192k0;
    public int f41193l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.g5 f41194n;
    public boolean f41195n0;
    public int phonebookRow;
    public boolean f41196r;
    public org.telegram.ui.Components.p00 f41197s;
    public boolean f41198w;
    public v8 f41199x;
    public boolean f41200y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f41177a = new te.c(0, this, org.telegram.ui.Components.wq.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f41198w = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.S = null;
        this.T = true;
        this.X = true;
        this.Z = new a0.h();
        this.f41182c0 = true;
        this.f41188g0 = new m4(this, 3);
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
        boolean z9;
        org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.qs.f(contactsActivity.currentAccount).k(org.telegram.messenger.qs.P5, new Object[0]);
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        contactsActivity.X = z9;
        if (i7 == 0) {
            return;
        }
        contactsActivity.h0(false);
    }

    public static void b0(ContactsActivity contactsActivity) {
        if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new dh0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i7, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.Z;
        v4.g0 adapter = contactsActivity.d.getAdapter();
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
                int size2 = urVar2.H.size();
                jg.z1 z1Var = urVar2.f16918f;
                int size3 = z1Var.f16995e.size();
                int size4 = z1Var.f16999j.size();
                if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().Y3(arrayList, false);
                    org.telegram.messenger.yr.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
                }
                if (contactsActivity.I) {
                    contactsActivity.l0(user, true, null);
                    return;
                } else if (contactsActivity.J) {
                    if (user.f27109id != org.telegram.messenger.p10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.K = true;
                        org.telegram.messenger.dw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27109id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new cn(bundle), contactsActivity.O);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    dh0 dh0Var = new dh0(contactsActivity.getParentActivity(), contactsActivity);
                    dh0Var.N0(str2, true);
                    dh0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                org.telegram.ui.Components.u4.u(contactsActivity, d5Var.f21996i, d5Var.f21997j, (String) d5Var.f21993e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f41179b.getClass();
        int S = contactsActivity.f41179b.S(i10);
        int Q = contactsActivity.f41179b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.yp)) {
                org.telegram.ui.Components.p00 p00Var = contactsActivity.f41197s;
                if (p00Var != null) {
                    p00Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.pa)) {
                contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            } else if ((!contactsActivity.E || i7 != 0) && S == 0) {
                if (contactsActivity.F) {
                    if (Q == 0) {
                        if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new c60());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new i9(null));
                    }
                } else if (i7 != 0) {
                    if (Q == 0) {
                        if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j3 = contactsActivity.R;
                        if (j3 == 0) {
                            j3 = contactsActivity.Q;
                        }
                        ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                        f2Var.d = j3;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                    }
                } else if (Q == 0) {
                    if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new z40(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    boolean z9 = org.telegram.messenger.r2.f25216a;
                    contactsActivity.presentFragment(new g(0));
                    e12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f41179b.O(contactsActivity.f41179b.S(i10), contactsActivity.f41179b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.I) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.J) {
                        contactsActivity.K = true;
                        org.telegram.messenger.dw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f27109id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new cn(bundle2), contactsActivity.O);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.d5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.d5) O).f21993e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131749106, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.T = M0;
                        u1Var.R = org.telegram.messenger.id.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new org.telegram.ui.Components.e2(26, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        contactsActivity.showDialog(u1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        vr vrVar;
        boolean z9;
        org.telegram.ui.Components.p00 p00Var = contactsActivity.f41197s;
        if (p00Var != null && (vrVar = contactsActivity.f41179b) != null) {
            if (contactsActivity.f41198w && !contactsActivity.D && !vrVar.I) {
                z9 = true;
            } else {
                z9 = false;
            }
            p00Var.e(z9, true);
        }
    }

    @Override
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21127a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        org.telegram.ui.Components.pj0 pj0Var = this.d;
        if (pj0Var != null && pj0Var.getFastScroll() != null && this.d.getFastScroll().f38681n) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            vr vrVar = this.f41179b;
            ArrayList arrayList = vrVar.N;
            vrVar.L = f10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f10);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28110p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27910e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27929f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.D = false;
        this.f41200y = false;
        if (this.H) {
            if (this.I) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745661, null));
            } else {
                org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
                if (this.J) {
                    i11 = 2131748263;
                } else {
                    i11 = 2131748270;
                }
                z4Var.setTitle(org.telegram.messenger.id.M0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751780, null));
        }
        if (!this.G) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.n().d(100, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751598, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 21));
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        org.telegram.ui.ActionBar.g5 b10 = q10.b(0, 2131232486);
        this.f41178a0 = b10;
        b10.setContentDescription(org.telegram.messenger.id.M0(2131745812, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f41178a0;
        g5Var.N();
        g5Var.B0 = new kg.v1(this, 8);
        if (!this.J && !this.I) {
            if (this.f41196r) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            org.telegram.ui.ActionBar.g5 b11 = q10.b(1, i10);
            this.f41194n = b11;
            b11.setContentDescription(org.telegram.messenger.id.M0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.pj0(context, null);
        this.h = new ur(this, context, this.Z, this.T, this.M, this.L);
        int i12 = 2;
        if (this.R != 0) {
            i7 = org.telegram.messenger.t3.y(3, getMessagesController().M0(Long.valueOf(this.R))) ? 1 : 0;
        } else {
            if (this.Q != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Q));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i7 = 2;
                }
            }
            i7 = 0;
        }
        vr vrVar = new vr(this, context, this.E ? 1 : 0, this.F, this.Z, i7);
        this.f41179b = vrVar;
        if (this.f41194n != null) {
            if (this.f41196r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        vrVar.Y(i12, false);
        vr vrVar2 = this.f41179b;
        vrVar2.M = 17.0f;
        vrVar2.H = this.Y;
        v8 v8Var = new v8(3, context, this);
        this.f41199x = v8Var;
        this.fragmentView = v8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, this.f41199x, getResourceProvider());
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(29);
        lzVar.f35774x = false;
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, lzVar, 1, null);
        this.f41181c = bv0Var;
        bv0Var.addView(lzVar, 0);
        this.f41181c.setAnimateLayoutChange(true);
        this.f41181c.e(true, false);
        this.f41181c.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.f41181c.f32368e.setText(org.telegram.messenger.id.M0(2131745807, null));
        this.f41199x.addView(this.f41181c, c8.ha.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f57079m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.pj0 pj0Var = this.d;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f41186f = b0Var;
        pj0Var.setLayoutManager(b0Var);
        this.d.setAdapter(this.f41179b);
        this.d.setClipToPadding(false);
        this.f41184e = new org.telegram.ui.Components.ri0(this.d, this.f41186f);
        this.f41199x.addView(this.d, c8.ha.c(-1.0f, -1));
        this.d.setEmptyView(this.f41181c);
        org.telegram.ui.Components.pj0 pj0Var2 = this.d;
        pj0Var2.W1 = true;
        pj0Var2.X1 = 0;
        pj0Var2.setOnItemClickListener(new l2.q(this, i7, 9));
        this.d.setOnItemLongClickListener(new tr(this));
        this.d.setOnScrollListener(new wr(this));
        if (!this.J && !this.I) {
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
            this.f41197s = p00Var;
            this.f41199x.addView(p00Var, org.telegram.ui.Components.p00.b());
            this.f41197s.setOnClickListener(new a(this, 15));
            this.f41197s.f36738c.f(2131624366, 44, 44, null);
            this.f41197s.f36738c.getAnimatedDrawable().M(this.f41197s.f36738c.getAnimatedDrawable().f40968e[0] - 1);
            this.f41197s.setContentDescription(org.telegram.messenger.id.M0(2131751717, null));
        }
        String str = this.V;
        if (str != null) {
            org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
            if (z4Var2.x(true, false)) {
                z4Var2.setSearchFieldText(str);
            }
            this.V = null;
        }
        k0();
        setBulletinDelegate(new y8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41263f1.d.add(this);
        }
        View view = this.fragmentView;
        tr trVar = new tr(this);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(view, trVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.pj0 pj0Var;
        if (i7 == org.telegram.messenger.qs.O) {
            vr vrVar = this.f41179b;
            if (vrVar != null) {
                if (!this.f41196r) {
                    vrVar.Y(2, true);
                }
                this.f41179b.f();
            }
            if (this.h != null) {
                v4.g0 adapter = this.d.getAdapter();
                ur urVar = this.h;
                if (adapter == urVar) {
                    urVar.G(this.f41180b0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f25067r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (pj0Var = this.d) != null) {
                int childCount = pj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
            }
            int i13 = org.telegram.messenger.qp.C8;
            if ((intValue & 4) != 0 && !this.f41196r && this.f41179b != null && !this.f41187f0) {
                this.f41187f0 = true;
                m4 m4Var = this.f41188g0;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.qs.f24971a0;
        int i15 = org.telegram.messenger.qs.f25080t;
        if (i7 == i14) {
            if (this.J && this.K) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f26968id);
                org.telegram.messenger.qs.f(this.currentAccount).k(i15, new Object[0]);
                presentFragment(new cn(bundle), false);
            }
        } else if (i7 == i15 && !this.K) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return !this.G;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(6, this);
        if (!this.G) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28170s8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28038l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28056m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28073n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28072n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28090o6));
        org.telegram.ui.Components.p00 p00Var = this.f41197s;
        if (p00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(p00Var.f36738c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f41197s.f36738c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z9) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.p10.i(this.currentAccount).U && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z9 && this.X) {
                showDialog(org.telegram.ui.Components.u4.v(parentActivity, new rr(this, 1)).f27300a);
                return;
            }
            this.f41183d0 = SystemClock.elapsedRealtime();
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
        org.telegram.ui.Components.bv0 bv0Var = this.f41181c;
        if (bv0Var != null) {
            bv0Var.b(Math.max(this.f41192k0 + this.f41189h0, this.f41193l0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.p00 p00Var = this.f41197s;
        if (p00Var != null) {
            p00Var.setTranslationY(((-this.f41192k0) - this.f41190i0) - this.f41191j0);
        }
    }

    @Override
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21127a) {
            return baseSimpleGlass.f21030i;
        }
        return null;
    }

    public final void k0() {
        boolean z9;
        int i7;
        vr vrVar = this.f41179b;
        if (vrVar != null && vrVar.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.m0 == z9 && this.f41195n0) {
            return;
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.f41178a0;
        if (z9) {
            i7 = 2131745734;
        } else {
            i7 = 2131745812;
        }
        g5Var.setSearchFieldHint(org.telegram.messenger.id.M0(i7, null));
        this.m0 = z9;
        this.f41195n0 = true;
    }

    public final void l0(TLRPC.User user, boolean z9, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z9 && this.S != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.gc.a0(this).t(org.telegram.messenger.id.M0(2131753108, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.Q != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Q));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.t3.w(4, M0);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        if (w10) {
                            u1Var.R = org.telegram.messenger.id.M0(2131754461, null);
                            u1Var.T = org.telegram.messenger.id.M0(2131754460, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754466, null), new org.telegram.ui.Components.e2(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        } else {
                            u1Var.T = org.telegram.messenger.id.M0(2131752566, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                        }
                        showDialog(u1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.id.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                u1Var2.R = M02;
                String b02 = org.telegram.messenger.id.b0(this.S, org.telegram.messenger.t10.p(user));
                if (!user.bot && this.N) {
                    b02 = a8.p0.D(b02, "\n\n", org.telegram.messenger.id.M0(2131754365, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f27998j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.m6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new xr(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                u1Var2.T = b02;
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), new a7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
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
        yr yrVar = this.U;
        if (yrVar != null) {
            yrVar.b(user);
            if (this.P) {
                this.U = null;
            }
        }
        if (this.O) {
            finishFragment();
        }
    }

    @Override
    public final void m(r0.k1 k1Var) {
        this.f41193l0 = k1Var.f54213a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.t();
        int childCount = this.d.getChildCount();
        int i7 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i7 < childCount) {
                View childAt = this.d.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.pa) {
                    org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                    if (hVar.h(paVar.getDialogId()) >= 0) {
                        paVar.c(false, true);
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
        this.U = jVar;
    }

    public final void o0(String str) {
        this.V = str;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.simpleActionBar.u()) {
            if (z9) {
                m0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var.F) {
                if (z9) {
                    z4Var.l(true);
                }
            } else {
                return super.onBackPressed(z9);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (this.f41182c0 && (parentActivity = getParentActivity()) != null) {
            this.f41182c0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.v(parentActivity, new rr(this, 0)).f27300a;
                    this.W = u1Var;
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
        org.telegram.ui.ActionBar.u1 u1Var = this.W;
        if (u1Var != null && dialog == u1Var && getParentActivity() != null && this.X) {
            h0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        super.onFragmentCreate();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f24971a0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25080t);
        this.f41182c0 = org.telegram.messenger.p10.i(this.currentAccount).U;
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.E = bundle.getBoolean("onlyUsers", false);
            this.H = this.arguments.getBoolean("destroyAfterSelect", false);
            this.I = this.arguments.getBoolean("returnAsResult", false);
            this.J = this.arguments.getBoolean("createSecretChat", false);
            this.S = this.arguments.getString("selectAlertString");
            this.T = this.arguments.getBoolean("allowUsernameSearch", true);
            this.N = this.arguments.getBoolean("needForwardCount", true);
            this.M = this.arguments.getBoolean("allowBots", true);
            this.L = this.arguments.getBoolean("allowSelf", true);
            this.Q = this.arguments.getLong("channelId", 0L);
            this.O = this.arguments.getBoolean("needFinishFragment", true);
            this.R = this.arguments.getLong("chat_id", 0L);
            this.Y = this.arguments.getBoolean("disableSections", false);
            this.P = this.arguments.getBoolean("resetDelegate", false);
            this.F = this.arguments.getBoolean("needPhonebook", false);
            this.G = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.F = true;
        }
        if (!this.J && !this.I) {
            this.f41196r = org.telegram.messenger.iz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.G) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f41189h0 = i7;
        if (this.G) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f41190i0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24971a0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25080t);
        this.U = null;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f41192k0 = i12;
        oi.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), this.f41189h0);
        j0();
        i0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.l(true);
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
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.f1().edit();
                    this.X = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f41183d0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f25570b.getPackageName(), null));
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
        vr vrVar = this.f41179b;
        if (vrVar != null) {
            vrVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.pj0 pj0Var = this.d;
                if (pj0Var != null) {
                    pj0Var.x1();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(ViewGroup viewGroup) {
        boolean z9;
        boolean z10 = viewGroup instanceof org.telegram.ui.Cells.pa;
        boolean z11 = true;
        a0.h hVar = this.Z;
        if (z10) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) viewGroup;
            long dialogId = paVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                paVar.c(false, true);
            } else if (paVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) paVar.getCurrentObject(), dialogId);
                paVar.c(true, true);
                z9 = true;
            }
            z9 = false;
        } else if (viewGroup instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) viewGroup;
            long dialogId2 = g6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                g6Var.w(false, true);
            } else if (g6Var.getUser() != null) {
                hVar.k(g6Var.getUser(), dialogId2);
                g6Var.w(true, true);
                z9 = true;
            }
            z9 = false;
        } else {
            return;
        }
        if (this.simpleActionBar.u()) {
            if (hVar.i()) {
                m0();
                return;
            }
        } else {
            if (z9) {
                org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.z(hVar.m(), false);
                this.simpleActionBar.D();
            }
            z11 = false;
        }
        this.simpleActionBar.z(hVar.m(), z11);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f41186f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.ri0 ri0Var = this.f41184e;
        ri0Var.f37666b = 1;
        ri0Var.d(0, 0, false, false);
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
