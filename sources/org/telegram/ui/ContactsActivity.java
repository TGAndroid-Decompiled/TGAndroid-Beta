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
public class ContactsActivity extends org.telegram.ui.ActionBar.k2 implements fe.e, org.telegram.messenger.vs, nf0, hh.d {
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
    public vs U;
    public String V;
    public org.telegram.ui.ActionBar.x1 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final fe.f f33285a;
    public org.telegram.ui.ActionBar.p5 f33286a0;
    public ss f33287b;
    public String f33288b0;
    public org.telegram.ui.Components.ew0 f33289c;
    public boolean f33290c0;
    public org.telegram.ui.Components.uk0 d;
    public long f33291d0;
    public org.telegram.ui.Components.wj0 e;
    public ViewPropertyAnimator f33292e0;
    public s4.a0 f33293f;
    public boolean f33294f0;
    public final m4 f33295g0;
    public rs h;
    public int f33296h0;
    public int f33297i0;
    public float f33298j0;
    public int f33299k0;
    public int f33300l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.p5 f33301n;
    public boolean f33302n0;
    public int phonebookRow;
    public boolean f33303r;
    public org.telegram.ui.Components.f10 f33304s;
    public boolean f33305w;
    public w8 f33306x;
    public boolean f33307y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f33285a = new fe.f(0, this, org.telegram.ui.Components.gr.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f33305w = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.S = null;
        this.T = true;
        this.X = true;
        this.Z = new a0.h();
        this.f33290c0 = true;
        this.f33295g0 = new m4(this, 3);
    }

    public static void Z(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(contactsActivity.currentAccount).s(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void a0(ContactsActivity contactsActivity, int i10) {
        boolean z10;
        org.telegram.messenger.wp.e1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.at.f(contactsActivity.currentAccount).k(org.telegram.messenger.at.P5, new Object[0]);
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.X = z10;
        if (i10 == 0) {
            return;
        }
        contactsActivity.h0(false);
    }

    public static void b0(ContactsActivity contactsActivity) {
        if (org.telegram.messenger.wp.r1(contactsActivity.currentAccount).u2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new ei0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i10, View view, int i11) {
        String str;
        a0.h hVar = contactsActivity.Z;
        s4.g0 adapter = contactsActivity.d.getAdapter();
        rs rsVar = contactsActivity.h;
        if (adapter == rsVar) {
            rsVar.getClass();
            Object E = contactsActivity.h.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.k6)) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                if (k6Var.getUser() != null && k6Var.getUser().contact) {
                    contactsActivity.p0(k6Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                rs rsVar2 = contactsActivity.h;
                int size = rsVar2.d.size();
                int size2 = rsVar2.H.size();
                zf.m1 m1Var = rsVar2.f55503f;
                int size3 = m1Var.e.size();
                int size4 = m1Var.f55599j.size();
                if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().V3(arrayList, false);
                    org.telegram.messenger.is.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
                }
                if (contactsActivity.I) {
                    contactsActivity.l0(user, true, null);
                    return;
                } else if (contactsActivity.J) {
                    if (user.f19943id != org.telegram.messenger.e20.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.K = true;
                        org.telegram.messenger.pw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19943id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new un(bundle), contactsActivity.O);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (org.telegram.messenger.wp.r1(contactsActivity.currentAccount).u2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    ei0 ei0Var = new ei0(contactsActivity.getParentActivity(), contactsActivity);
                    ei0Var.N0(str2, true);
                    ei0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                org.telegram.ui.Components.s4.u(contactsActivity, f5Var.f15697i, f5Var.f15698j, (String) f5Var.e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f33287b.getClass();
        int S = contactsActivity.f33287b.S(i11);
        int Q = contactsActivity.f33287b.Q(i11);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.hq)) {
                org.telegram.ui.Components.f10 f10Var = contactsActivity.f33304s;
                if (f10Var != null) {
                    f10Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.pa)) {
                contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            } else if ((!contactsActivity.E || i10 != 0) && S == 0) {
                if (contactsActivity.F) {
                    if (Q == 0) {
                        if (org.telegram.messenger.wp.r1(contactsActivity.currentAccount).u2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new x60());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new j9(null));
                    }
                } else if (i10 != 0) {
                    if (Q == 0) {
                        if (org.telegram.messenger.wp.r1(contactsActivity.currentAccount).u2()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j10 = contactsActivity.R;
                        if (j10 == 0) {
                            j10 = contactsActivity.Q;
                        }
                        ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                        k2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                    }
                } else if (Q == 0) {
                    if (org.telegram.messenger.wp.r1(contactsActivity.currentAccount).u2()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new u50(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.wp.r1(contactsActivity.currentAccount).u2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences d12 = org.telegram.messenger.wp.d1();
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    contactsActivity.presentFragment(new f(0));
                    d12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f33287b.O(contactsActivity.f33287b.S(i11), contactsActivity.f33287b.Q(i11));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.I) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.J) {
                        contactsActivity.K = true;
                        org.telegram.messenger.pw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f19943id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new un(bundle2), contactsActivity.O);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.f5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.f5) O).e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131749116, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.T = L0;
                        x1Var.R = org.telegram.messenger.dd.L0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new org.telegram.ui.Components.f2(27, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        contactsActivity.showDialog(x1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        ss ssVar;
        boolean z10;
        org.telegram.ui.Components.f10 f10Var = contactsActivity.f33304s;
        if (f10Var != null && (ssVar = contactsActivity.f33287b) != null) {
            if (contactsActivity.f33305w && !contactsActivity.D && !ssVar.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            f10Var.e(z10, true);
        }
    }

    @Override
    public final hi.f C() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ei.r.f().f6693a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final View S() {
        return this.fragmentView;
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.uk0 uk0Var = this.d;
        if (uk0Var != null && uk0Var.getFastScroll() != null && this.d.getFastScroll().f24427n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21334z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        this.D = false;
        this.f33307y = false;
        if (this.H) {
            if (this.I) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745678, null));
            } else {
                org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
                if (this.J) {
                    i12 = 2131748280;
                } else {
                    i12 = 2131748287;
                }
                i5Var.setTitle(org.telegram.messenger.dd.L0(i12, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751780, null));
        }
        if (!this.G) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        }
        this.simpleActionBar.l().d(100, 2131232107, org.telegram.messenger.dd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 12));
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, 2131232485);
        this.f33286a0 = b10;
        b10.setContentDescription(org.telegram.messenger.dd.L0(2131745829, null));
        org.telegram.ui.ActionBar.p5 p5Var = this.f33286a0;
        p5Var.N();
        p5Var.B0 = new ag.l3(this, 8);
        if (!this.J && !this.I) {
            if (this.f33303r) {
                i11 = 2131232101;
            } else {
                i11 = 2131232100;
            }
            org.telegram.ui.ActionBar.p5 b11 = o10.b(1, i11);
            this.f33301n = b11;
            b11.setContentDescription(org.telegram.messenger.dd.L0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.uk0(context, null);
        this.h = new rs(this, context, this.Z, this.T, this.M, this.L);
        int i13 = 2;
        if (this.R != 0) {
            i10 = org.telegram.messenger.w3.y(3, getMessagesController().L0(Long.valueOf(this.R))) ? 1 : 0;
        } else {
            if (this.Q != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Q));
                if (org.telegram.messenger.w3.y(3, L0) && !org.telegram.messenger.w3.t0(L0)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        ss ssVar = new ss(this, context, this.E ? 1 : 0, this.F, this.Z, i10);
        this.f33287b = ssVar;
        if (this.f33301n != null) {
            if (this.f33303r) {
                i13 = 1;
            }
        } else {
            i13 = 0;
        }
        ssVar.Y(i13, false);
        ss ssVar2 = this.f33287b;
        ssVar2.M = 17.0f;
        ssVar2.H = this.Y;
        w8 w8Var = new w8(this, context, 3);
        this.f33306x = w8Var;
        this.fragmentView = w8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, this.f33306x, getResourceProvider());
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(29);
        zzVar.f33280x = false;
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, zzVar, 1, null);
        this.f33289c = ew0Var;
        ew0Var.addView(zzVar, 0);
        this.f33289c.setAnimateLayoutChange(true);
        this.f33289c.e(true, false);
        this.f33289c.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        this.f33289c.e.setText(org.telegram.messenger.dd.L0(2131745824, null));
        this.f33306x.addView(this.f33289c, w7.b6.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.f47938m = false;
        this.d.setItemAnimator(jVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.uk0 uk0Var = this.d;
        s4.a0 a0Var = new s4.a0(1, false);
        this.f33293f = a0Var;
        uk0Var.setLayoutManager(a0Var);
        this.d.setAdapter(this.f33287b);
        this.d.setClipToPadding(false);
        this.e = new org.telegram.ui.Components.wj0(this.d, this.f33293f);
        this.f33306x.addView(this.d, w7.b6.c(-1.0f, -1));
        this.d.setEmptyView(this.f33289c);
        org.telegram.ui.Components.uk0 uk0Var2 = this.d;
        uk0Var2.W1 = true;
        uk0Var2.X1 = 0;
        uk0Var2.setOnItemClickListener(new i2.q(this, i10, 11));
        this.d.setOnItemLongClickListener(new qs(this));
        this.d.setOnScrollListener(new ts(this));
        if (!this.J && !this.I) {
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
            this.f33304s = f10Var;
            this.f33306x.addView(f10Var, org.telegram.ui.Components.f10.b());
            this.f33304s.setOnClickListener(new a(this, 15));
            this.f33304s.f26022c.f(2131624364, 44, 44, null);
            this.f33304s.f26022c.getAnimatedDrawable().M(this.f33304s.f26022c.getAnimatedDrawable().e[0] - 1);
            this.f33304s.setContentDescription(org.telegram.messenger.dd.L0(2131751718, null));
        }
        String str = this.V;
        if (str != null) {
            org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
            if (i5Var2.w(true, false)) {
                i5Var2.setSearchFieldText(str);
            }
            this.V = null;
        }
        k0();
        setBulletinDelegate(new z8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33369h1.d.add(this);
        }
        View view = this.fragmentView;
        qs qsVar = new qs(this);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(view, qsVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.uk0 uk0Var;
        if (i10 == org.telegram.messenger.at.O) {
            ss ssVar = this.f33287b;
            if (ssVar != null) {
                if (!this.f33303r) {
                    ssVar.Y(2, true);
                }
                this.f33287b.f();
            }
            if (this.h != null) {
                s4.g0 adapter = this.d.getAdapter();
                rs rsVar = this.h;
                if (adapter == rsVar) {
                    rsVar.G(this.f33288b0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.wp.D8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (uk0Var = this.d) != null) {
                int childCount = uk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.d.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
            }
            int i14 = org.telegram.messenger.wp.D8;
            if ((intValue & 4) != 0 && !this.f33303r && this.f33287b != null && !this.f33294f0) {
                this.f33294f0 = true;
                m4 m4Var = this.f33295g0;
                org.telegram.messenger.i0.r(m4Var);
                org.telegram.messenger.i0.h3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i15 = org.telegram.messenger.at.f14675a0;
        int i16 = org.telegram.messenger.at.f14786t;
        if (i10 == i15) {
            if (this.J && this.K) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f19802id);
                org.telegram.messenger.at.f(this.currentAccount).k(i16, new Object[0]);
                presentFragment(new un(bundle), false);
            }
        } else if (i10 == i16 && !this.K) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return !this.G;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(6, this);
        if (!this.G) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21207s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21078l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21097m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21117n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 262148, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21135o6));
        org.telegram.ui.Components.f10 f10Var = this.f33304s;
        if (f10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(f10Var.f26022c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33304s.f26022c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.e20.i(this.currentAccount).U && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.X) {
                showDialog(org.telegram.ui.Components.s4.v(parentActivity, new os(this, 1)).f20135a);
                return;
            }
            this.f33291d0 = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void i0() {
        org.telegram.ui.Components.ew0 ew0Var = this.f33289c;
        if (ew0Var != null) {
            ew0Var.b(Math.max(this.f33299k0 + this.f33296h0, this.f33300l0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.f10 f10Var = this.f33304s;
        if (f10Var != null) {
            f10Var.setTranslationY(((-this.f33299k0) - this.f33297i0) - this.f33298j0);
        }
    }

    @Override
    public final hi.f k() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ei.r.f().f6693a) {
            return baseSimpleGlass.f6602i;
        }
        return null;
    }

    public final void k0() {
        boolean z10;
        int i10;
        ss ssVar = this.f33287b;
        if (ssVar != null && ssVar.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.m0 == z10 && this.f33302n0) {
            return;
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.f33286a0;
        if (z10) {
            i10 = 2131745751;
        } else {
            i10 = 2131745829;
        }
        p5Var.setSearchFieldHint(org.telegram.messenger.dd.L0(i10, null));
        this.m0 = z10;
        this.f33302n0 = true;
    }

    public final void l0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.S != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.cc.a0(this).t(org.telegram.messenger.dd.L0(2131753108, null), null).j();
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    } else if (this.Q != 0) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Q));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w9 = org.telegram.messenger.w3.w(4, L0);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        if (w9) {
                            x1Var.R = org.telegram.messenger.dd.L0(2131754461, null);
                            x1Var.T = org.telegram.messenger.dd.L0(2131754460, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754466, null), new org.telegram.ui.Components.f2(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        } else {
                            x1Var.T = org.telegram.messenger.dd.L0(2131752566, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                        }
                        showDialog(x1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String L02 = org.telegram.messenger.dd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                x1Var2.R = L02;
                String b02 = org.telegram.messenger.dd.b0(this.S, org.telegram.messenger.i20.p(user));
                if (!user.bot && this.N) {
                    b02 = a1.g.C(b02, "\n\n", org.telegram.messenger.dd.L0(2131754365, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21038j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.t6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new us(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                x1Var2.T = b02;
                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), new a7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                showDialog(x1Var2);
                if (editTextBoldCursor != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                        }
                        int L = org.telegram.messenger.i0.L(24.0f);
                        marginLayoutParams.leftMargin = L;
                        marginLayoutParams.rightMargin = L;
                        marginLayoutParams.height = org.telegram.messenger.i0.L(36.0f);
                        editTextBoldCursor.setLayoutParams(marginLayoutParams);
                    }
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    return;
                }
                return;
            }
            return;
        }
        vs vsVar = this.U;
        if (vsVar != null) {
            vsVar.c(user);
            if (this.P) {
                this.U = null;
            }
        }
        if (this.O) {
            finishFragment();
        }
    }

    @Override
    public final void m(r0.j1 j1Var) {
        this.f33300l0 = j1Var.f46143a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.r();
        int childCount = this.d.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i10 < childCount) {
                View childAt = this.d.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.pa) {
                    org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                    if (hVar.h(paVar.getDialogId()) >= 0) {
                        paVar.c(false, true);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                    if (hVar.h(k6Var.getDialogId()) >= 0) {
                        k6Var.y(false, true);
                    }
                }
                i10++;
            } else {
                hVar.b();
                return;
            }
        }
    }

    public final void n0(ag.v0 v0Var) {
        this.U = v0Var;
    }

    public final void o0(String str) {
        this.V = str;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.s()) {
            if (z10) {
                m0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var.F) {
                if (z10) {
                    i5Var.j(true);
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
        if (this.f33290c0 && (parentActivity = getParentActivity()) != null) {
            this.f33290c0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(parentActivity, new os(this, 0)).f20135a;
                    this.W = x1Var;
                    showDialog(x1Var);
                    return;
                }
                h0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.x1 x1Var = this.W;
        if (x1Var != null && dialog == x1Var && getParentActivity() != null && this.X) {
            h0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.O);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14675a0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14786t);
        this.f33290c0 = org.telegram.messenger.e20.i(this.currentAccount).U;
        Bundle bundle = this.arguments;
        int i11 = 0;
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
            this.f33303r = org.telegram.messenger.uz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.G) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        this.f33296h0 = i10;
        if (this.G) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        }
        this.f33297i0 = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.O);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14675a0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14786t);
        this.U = null;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33299k0 = i13;
        ei.b.e(this.d, i11, i13, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), this.f33296h0);
        j0();
        i0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.j(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
                        org.telegram.messenger.i5.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.e1().edit();
                    this.X = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f33291d0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.w0.f18945b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
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
        ss ssVar = this.f33287b;
        if (ssVar != null) {
            ssVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.uk0 uk0Var = this.d;
                if (uk0Var != null) {
                    uk0Var.x1();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.pa;
        boolean z12 = true;
        a0.h hVar = this.Z;
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
        } else if (viewGroup instanceof org.telegram.ui.Cells.k6) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) viewGroup;
            long dialogId2 = k6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                k6Var.y(false, true);
            } else if (k6Var.getUser() != null) {
                hVar.k(k6Var.getUser(), dialogId2);
                k6Var.y(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            return;
        }
        if (this.simpleActionBar.s()) {
            if (hVar.i()) {
                m0();
                return;
            }
        } else {
            if (z10) {
                org.telegram.messenger.i0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.y(hVar.m(), false);
                this.simpleActionBar.C();
            }
            z12 = false;
        }
        this.simpleActionBar.y(hVar.m(), z12);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ss ssVar = this.f33287b;
            ArrayList arrayList = ssVar.N;
            ssVar.L = f7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Cells.u4) arrayList.get(i11)).setLetterProgress(f7);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final void w() {
        if (this.f33293f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.wj0 wj0Var = this.e;
        wj0Var.f32267b = 1;
        wj0Var.d(0, 0, false, false);
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
