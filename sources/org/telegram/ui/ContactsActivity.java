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
public class ContactsActivity extends org.telegram.ui.ActionBar.d2 implements qe.b, org.telegram.messenger.cs, de0, sh.c {
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
    public tr V;
    public String W;
    public org.telegram.ui.ActionBar.s1 X;
    public boolean Y;
    public boolean Z;
    public final qe.c f41207a;
    public final a0.h f41208a0;
    public qr f41209b;
    public org.telegram.ui.ActionBar.f5 f41210b0;
    public org.telegram.ui.Components.zu0 f41211c;
    public String f41212c0;
    public org.telegram.ui.Components.tj0 d;
    public boolean f41213d0;
    public org.telegram.ui.Components.vi0 f41214e;
    public long f41215e0;
    public u4.b0 f41216f;
    public ViewPropertyAnimator f41217f0;
    public boolean f41218g0;
    public pr h;
    public final o4 f41219h0;
    public int f41220i0;
    public int f41221j0;
    public float f41222k0;
    public int f41223l0;
    public int m0;
    public org.telegram.ui.ActionBar.f5 f41224n;
    public boolean f41225n0;
    public boolean f41226o0;
    public int phonebookRow;
    public boolean f41227r;
    public org.telegram.ui.Components.l00 f41228s;
    public boolean f41229w;
    public ai.h5 f41230x;
    public boolean f41231y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f41207a = new qe.c(0, this, org.telegram.ui.Components.xq.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f41229w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.f41208a0 = new a0.h();
        this.f41213d0 = true;
        this.f41219h0 = new o4(this, 3);
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

    public static void a0(ContactsActivity contactsActivity, int i3) {
        boolean z10;
        org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.hs.f(contactsActivity.currentAccount).k(org.telegram.messenger.hs.P5, new Object[0]);
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        contactsActivity.Y = z10;
        if (i3 == 0) {
            return;
        }
        contactsActivity.h0(false);
    }

    public static void b0(ContactsActivity contactsActivity) {
        if (org.telegram.messenger.hp.s1(contactsActivity.currentAccount).v2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new vg0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i3, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.f41208a0;
        u4.h0 adapter = contactsActivity.d.getAdapter();
        pr prVar = contactsActivity.h;
        if (adapter == prVar) {
            prVar.getClass();
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
                pr prVar2 = contactsActivity.h;
                int size = prVar2.d.size();
                int size2 = prVar2.I.size();
                kg.v1 v1Var = prVar2.f17128f;
                int size3 = v1Var.f17209e.size();
                int size4 = v1Var.f17213j.size();
                if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    contactsActivity.getMessagesController().Y3(arrayList, false);
                    org.telegram.messenger.qr.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
                }
                if (contactsActivity.J) {
                    contactsActivity.l0(user, true, null);
                    return;
                } else if (contactsActivity.K) {
                    if (user.f27150id != org.telegram.messenger.h10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.L = true;
                        org.telegram.messenger.vv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27150id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new wm(bundle), contactsActivity.P);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (org.telegram.messenger.hp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    vg0 vg0Var = new vg0(contactsActivity.getParentActivity(), contactsActivity);
                    vg0Var.N0(str2, true);
                    vg0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                org.telegram.ui.Components.t4.u(contactsActivity, d5Var.f22153i, d5Var.f22154j, (String) d5Var.f22150e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f41209b.getClass();
        int S = contactsActivity.f41209b.S(i10);
        int Q = contactsActivity.f41209b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.zp)) {
                org.telegram.ui.Components.l00 l00Var = contactsActivity.f41228s;
                if (l00Var != null) {
                    l00Var.performClick();
                }
            } else if (!hVar.i() && (view instanceof org.telegram.ui.Cells.pa)) {
                contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            } else if ((!contactsActivity.F || i3 != 0) && S == 0) {
                if (contactsActivity.G) {
                    if (Q == 0) {
                        if (org.telegram.messenger.hp.s1(contactsActivity.currentAccount).v2()) {
                            b.b(contactsActivity.currentAccount);
                        } else {
                            contactsActivity.presentFragment(new t50());
                        }
                    } else if (Q == 1) {
                        contactsActivity.presentFragment(new h9(null));
                    }
                } else if (i3 != 0) {
                    if (Q == 0) {
                        if (org.telegram.messenger.hp.s1(contactsActivity.currentAccount).v2()) {
                            b.b(contactsActivity.currentAccount);
                            return;
                        }
                        long j10 = contactsActivity.S;
                        if (j10 == 0) {
                            j10 = contactsActivity.R;
                        }
                        ?? d2Var = new org.telegram.ui.ActionBar.d2(null);
                        d2Var.d = j10;
                        contactsActivity.presentFragment((org.telegram.ui.ActionBar.d2) d2Var);
                    }
                } else if (Q == 0) {
                    if (org.telegram.messenger.hp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                    } else {
                        contactsActivity.presentFragment(new r40(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.hp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    boolean z10 = org.telegram.messenger.r2.f25040a;
                    contactsActivity.presentFragment(new g(0));
                    e12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f41209b.O(contactsActivity.f41209b.S(i10), contactsActivity.f41209b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.J) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.K) {
                        contactsActivity.L = true;
                        org.telegram.messenger.vv.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f27150id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new wm(bundle2), contactsActivity.P);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.d5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.d5) O).f22150e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131749114, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.U = M0;
                        s1Var.S = org.telegram.messenger.bd.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new org.telegram.ui.Components.i41(6, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        contactsActivity.showDialog(s1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        qr qrVar;
        boolean z10;
        org.telegram.ui.Components.l00 l00Var = contactsActivity.f41228s;
        if (l00Var != null && (qrVar = contactsActivity.f41209b) != null) {
            if (contactsActivity.f41229w && !contactsActivity.E && !qrVar.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            l00Var.e(z10, true);
        }
    }

    @Override
    public final si.f B() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.tj0 tj0Var = this.d;
        if (tj0Var != null && tj0Var.getFastScroll() != null && this.d.getFastScroll().f40745n) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            qr qrVar = this.f41209b;
            ArrayList arrayList = qrVar.O;
            qrVar.M = f10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f10);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28101p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        int i10;
        int i11;
        this.E = false;
        this.f41231y = false;
        if (this.I) {
            if (this.J) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745671, null));
            } else {
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                if (this.K) {
                    i11 = 2131748271;
                } else {
                    i11 = 2131748278;
                }
                y4Var.setTitle(org.telegram.messenger.bd.M0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751780, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        }
        this.simpleActionBar.l().d(100, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 22));
        org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.f5 b10 = o10.b(0, 2131232486);
        this.f41210b0 = b10;
        b10.setContentDescription(org.telegram.messenger.bd.M0(2131745822, null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f41210b0;
        f5Var.N();
        f5Var.C0 = new lg.w1(this, 8);
        if (!this.K && !this.J) {
            if (this.f41227r) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            org.telegram.ui.ActionBar.f5 b11 = o10.b(1, i10);
            this.f41224n = b11;
            b11.setContentDescription(org.telegram.messenger.bd.M0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.tj0(context, null);
        this.h = new pr(this, context, this.f41208a0, this.U, this.N, this.M);
        int i12 = 2;
        if (this.S != 0) {
            i3 = org.telegram.messenger.t3.y(3, getMessagesController().M0(Long.valueOf(this.S))) ? 1 : 0;
        } else {
            if (this.R != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.R));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i3 = 2;
                }
            }
            i3 = 0;
        }
        qr qrVar = new qr(this, context, this.F ? 1 : 0, this.G, this.f41208a0, i3);
        this.f41209b = qrVar;
        if (this.f41224n != null) {
            if (this.f41227r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        qrVar.Y(i12, false);
        qr qrVar2 = this.f41209b;
        qrVar2.N = 17.0f;
        qrVar2.I = this.Z;
        ai.h5 h5Var = new ai.h5(4, context, this);
        this.f41230x = h5Var;
        this.fragmentView = h5Var;
        this.d.r1();
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, this.f41230x, getResourceProvider());
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(29);
        izVar.f34869x = false;
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, izVar, 1, null);
        this.f41211c = zu0Var;
        zu0Var.addView(izVar, 0);
        this.f41211c.setAnimateLayoutChange(true);
        this.f41211c.e(true, false);
        this.f41211c.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.f41211c.f41128e.setText(org.telegram.messenger.bd.M0(2131745817, null));
        this.f41230x.addView(this.f41211c, b8.mf.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f55567m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.tj0 tj0Var = this.d;
        u4.b0 b0Var = new u4.b0(1, false);
        this.f41216f = b0Var;
        tj0Var.setLayoutManager(b0Var);
        this.d.setAdapter(this.f41209b);
        this.d.setClipToPadding(false);
        this.f41214e = new org.telegram.ui.Components.vi0(this.d, this.f41216f);
        this.f41230x.addView(this.d, b8.mf.c(-1.0f, -1));
        this.d.setEmptyView(this.f41211c);
        org.telegram.ui.Components.tj0 tj0Var2 = this.d;
        tj0Var2.X1 = true;
        tj0Var2.Y1 = 0;
        tj0Var2.setOnItemClickListener(new k2.q(this, i3, 10));
        this.d.setOnItemLongClickListener(new or(this));
        this.d.setOnScrollListener(new rr(this));
        if (!this.K && !this.J) {
            org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
            this.f41228s = l00Var;
            this.f41230x.addView(l00Var, org.telegram.ui.Components.l00.b());
            this.f41228s.setOnClickListener(new a(this, 15));
            this.f41228s.f35530c.f(2131624366, 44, 44, null);
            this.f41228s.f35530c.getAnimatedDrawable().M(this.f41228s.f35530c.getAnimatedDrawable().f32725e[0] - 1);
            this.f41228s.setContentDescription(org.telegram.messenger.bd.M0(2131751718, null));
        }
        String str = this.W;
        if (str != null) {
            org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
            if (y4Var2.v(true, false)) {
                y4Var2.setSearchFieldText(str);
            }
            this.W = null;
        }
        k0();
        setBulletinDelegate(new x8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.f41300i1.d.add(this);
        }
        View view = this.fragmentView;
        or orVar = new or(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(view, orVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.tj0 tj0Var;
        if (i3 == org.telegram.messenger.hs.O) {
            qr qrVar = this.f41209b;
            if (qrVar != null) {
                if (!this.f41227r) {
                    qrVar.Y(2, true);
                }
                this.f41209b.f();
            }
            if (this.h != null) {
                u4.h0 adapter = this.d.getAdapter();
                pr prVar = this.h;
                if (adapter == prVar) {
                    prVar.G(this.f41212c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (tj0Var = this.d) != null) {
                int childCount = tj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.d.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
            }
            int i13 = org.telegram.messenger.hp.C8;
            if ((intValue & 4) != 0 && !this.f41227r && this.f41209b != null && !this.f41218g0) {
                this.f41218g0 = true;
                o4 o4Var = this.f41219h0;
                org.telegram.messenger.g0.r(o4Var);
                org.telegram.messenger.g0.i3(o4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.hs.f23196a0;
        int i15 = org.telegram.messenger.hs.f23305t;
        if (i3 == i14) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f27009id);
                org.telegram.messenger.hs.f(this.currentAccount).k(i15, new Object[0]);
                presentFragment(new wm(bundle), false);
            }
        } else if (i3 == i15 && !this.L) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return !this.H;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(6, this);
        if (!this.H) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28027l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28044m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28063n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 262148, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28081o6));
        org.telegram.ui.Components.l00 l00Var = this.f41228s;
        if (l00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l00Var.f35530c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41228s.f35530c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.h10.i(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10 && this.Y) {
                showDialog(org.telegram.ui.Components.t4.v(parentActivity, new mr(this, 1)).f27343a);
                return;
            }
            this.f41215e0 = SystemClock.elapsedRealtime();
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
        org.telegram.ui.Components.zu0 zu0Var = this.f41211c;
        if (zu0Var != null) {
            zu0Var.b(Math.max(this.f41223l0 + this.f41220i0, this.m0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.l00 l00Var = this.f41228s;
        if (l00Var != null) {
            l00Var.setTranslationY(((-this.f41223l0) - this.f41221j0) - this.f41222k0);
        }
    }

    @Override
    public final si.f k() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.f53529i;
        }
        return null;
    }

    public final void k0() {
        boolean z10;
        int i3;
        qr qrVar = this.f41209b;
        if (qrVar != null && qrVar.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f41225n0 == z10 && this.f41226o0) {
            return;
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.f41210b0;
        if (z10) {
            i3 = 2131745744;
        } else {
            i3 = 2131745822;
        }
        f5Var.setSearchFieldHint(org.telegram.messenger.bd.M0(i3, null));
        this.f41225n0 = z10;
        this.f41226o0 = true;
    }

    public final void l0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z10 && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.fc.a0(this).t(org.telegram.messenger.bd.M0(2131753108, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.t3.w(4, M0);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        if (w10) {
                            s1Var.S = org.telegram.messenger.bd.M0(2131754461, null);
                            s1Var.U = org.telegram.messenger.bd.M0(2131754460, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754466, null), new org.telegram.ui.Components.i41(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        } else {
                            s1Var.U = org.telegram.messenger.bd.M0(2131752566, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        }
                        showDialog(s1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.bd.M0(2131689472, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                s1Var2.S = M02;
                String b02 = org.telegram.messenger.bd.b0(this.T, org.telegram.messenger.l10.p(user));
                if (!user.bot && this.O) {
                    b02 = a1.g.C(b02, "\n\n", org.telegram.messenger.bd.M0(2131754365, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27988j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new sr(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                s1Var2.U = b02;
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), new b7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                showDialog(s1Var2);
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
        tr trVar = this.V;
        if (trVar != null) {
            trVar.c(user);
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
        this.m0 = k1Var.f54026a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.r();
        int childCount = this.d.getChildCount();
        int i3 = 0;
        while (true) {
            a0.h hVar = this.f41208a0;
            if (i3 < childCount) {
                View childAt = this.d.getChildAt(i3);
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
                i3++;
            } else {
                hVar.b();
                return;
            }
        }
    }

    public final void n0(ci.l3 l3Var) {
        this.V = l3Var;
    }

    public final void o0(String str) {
        this.W = str;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.simpleActionBar.s()) {
            if (z10) {
                m0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var.G) {
                if (z10) {
                    y4Var.j(true);
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
        if (this.f41213d0 && (parentActivity = getParentActivity()) != null) {
            this.f41213d0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.v(parentActivity, new mr(this, 0)).f27343a;
                    this.X = s1Var;
                    showDialog(s1Var);
                    return;
                }
                h0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.s1 s1Var = this.X;
        if (s1Var != null && dialog == s1Var && getParentActivity() != null && this.Y) {
            h0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3;
        super.onFragmentCreate();
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.O);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23196a0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23305t);
        this.f41213d0 = org.telegram.messenger.h10.i(this.currentAccount).V;
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
            this.f41227r = org.telegram.messenger.az.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i3 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i3 = 0;
        }
        this.f41220i0 = i3;
        if (this.H) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f41221j0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.O);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23196a0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23305t);
        this.V = null;
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f41223l0 = i12;
        pi.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f41220i0);
        j0();
        i0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.j(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (i3 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10 && "android.permission.READ_CONTACTS".equals(strArr[i10])) {
                    if (iArr[i10] == 0) {
                        org.telegram.messenger.g5.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.f1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.f41215e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f25457b.getPackageName(), null));
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
        qr qrVar = this.f41209b;
        if (qrVar != null) {
            qrVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.tj0 tj0Var = this.d;
                if (tj0Var != null) {
                    tj0Var.x1();
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
        a0.h hVar = this.f41208a0;
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
        if (this.simpleActionBar.s()) {
            if (hVar.i()) {
                m0();
                return;
            }
        } else {
            if (z10) {
                org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.x(hVar.m(), false);
                this.simpleActionBar.B();
            }
            z12 = false;
        }
        this.simpleActionBar.x(hVar.m(), z12);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f41216f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.vi0 vi0Var = this.f41214e;
        vi0Var.f39126b = 1;
        vi0Var.d(0, 0, false, false);
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
