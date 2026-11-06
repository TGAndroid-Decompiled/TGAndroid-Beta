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
public class ContactsActivity extends org.telegram.ui.ActionBar.f2 implements te.b, org.telegram.messenger.ls, ie0, rh.c {
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
    public vr U;
    public String V;
    public org.telegram.ui.ActionBar.u1 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final te.c f41176a;
    public org.telegram.ui.ActionBar.f5 f41177a0;
    public sr f41178b;
    public String f41179b0;
    public org.telegram.ui.Components.av0 f41180c;
    public boolean f41181c0;
    public org.telegram.ui.Components.pj0 d;
    public long f41182d0;
    public org.telegram.ui.Components.ri0 f41183e;
    public ViewPropertyAnimator f41184e0;
    public v4.b0 f41185f;
    public boolean f41186f0;
    public final m4 f41187g0;
    public rr h;
    public int f41188h0;
    public int f41189i0;
    public float f41190j0;
    public int f41191k0;
    public int f41192l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.f5 f41193n;
    public boolean f41194n0;
    public int phonebookRow;
    public boolean f41195r;
    public org.telegram.ui.Components.p00 f41196s;
    public boolean f41197w;
    public v8 f41198x;
    public boolean f41199y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.f41176a = new te.c(0, this, org.telegram.ui.Components.xq.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.f41197w = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.S = null;
        this.T = true;
        this.X = true;
        this.Z = new a0.h();
        this.f41181c0 = true;
        this.f41187g0 = new m4(this, 3);
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
            new ah0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity, int i7, View view, int i10) {
        String str;
        a0.h hVar = contactsActivity.Z;
        v4.g0 adapter = contactsActivity.d.getAdapter();
        rr rrVar = contactsActivity.h;
        if (adapter == rrVar) {
            rrVar.getClass();
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
                rr rrVar2 = contactsActivity.h;
                int size = rrVar2.d.size();
                int size2 = rrVar2.H.size();
                jg.z1 z1Var = rrVar2.f16915f;
                int size3 = z1Var.f16992e.size();
                int size4 = z1Var.f16996j.size();
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
                    if (user.f27101id != org.telegram.messenger.p10.i(contactsActivity.currentAccount).e()) {
                        contactsActivity.K = true;
                        org.telegram.messenger.dw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27101id);
                    if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                        contactsActivity.presentFragment(new an(bundle), contactsActivity.O);
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
                    ah0 ah0Var = new ah0(contactsActivity.getParentActivity(), contactsActivity);
                    ah0Var.N0(str2, true);
                    ah0Var.show();
                    return;
                }
                return;
            } else if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                org.telegram.ui.Components.v4.u(contactsActivity, d5Var.f21962i, d5Var.f21963j, (String) d5Var.f21959e.get(0));
                return;
            } else {
                return;
            }
        }
        contactsActivity.f41178b.getClass();
        int S = contactsActivity.f41178b.S(i10);
        int Q = contactsActivity.f41178b.Q(i10);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.yp)) {
                org.telegram.ui.Components.p00 p00Var = contactsActivity.f41196s;
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
                            contactsActivity.presentFragment(new z50());
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
                        contactsActivity.presentFragment(new w40(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (org.telegram.messenger.qp.s1(contactsActivity.currentAccount).v2()) {
                        b.b(contactsActivity.currentAccount);
                        return;
                    }
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    boolean z9 = org.telegram.messenger.r2.f25191a;
                    contactsActivity.presentFragment(new g(0));
                    e12.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = contactsActivity.f41178b.O(contactsActivity.f41178b.S(i10), contactsActivity.f41178b.Q(i10));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (contactsActivity.I) {
                        contactsActivity.l0(user2, true, null);
                    } else if (contactsActivity.J) {
                        contactsActivity.K = true;
                        org.telegram.messenger.dw.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.f27101id);
                        if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                            contactsActivity.presentFragment(new an(bundle2), contactsActivity.O);
                        }
                    }
                } else if (O instanceof org.telegram.messenger.d5) {
                    ArrayList arrayList2 = ((org.telegram.messenger.d5) O).f21959e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && contactsActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131749105, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.T = M0;
                        u1Var.R = org.telegram.messenger.hd.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new org.telegram.ui.Components.f2(26, contactsActivity, str));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        contactsActivity.showDialog(u1Var);
                    }
                }
            }
        }
    }

    public static void g0(ContactsActivity contactsActivity) {
        sr srVar;
        boolean z9;
        org.telegram.ui.Components.p00 p00Var = contactsActivity.f41196s;
        if (p00Var != null && (srVar = contactsActivity.f41178b) != null) {
            if (contactsActivity.f41197w && !contactsActivity.D && !srVar.I) {
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
        if (oi.q.f().f21119a) {
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
        if (pj0Var != null && pj0Var.getFastScroll() != null && this.d.getFastScroll().f38658n) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            sr srVar = this.f41178b;
            ArrayList arrayList = srVar.N;
            srVar.L = f10;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28068p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27868e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27887f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28013m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.D = false;
        this.f41199y = false;
        if (this.H) {
            if (this.I) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745662, null));
            } else {
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                if (this.J) {
                    i11 = 2131748262;
                } else {
                    i11 = 2131748269;
                }
                y4Var.setTitle(org.telegram.messenger.hd.M0(i11, null));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751780, null));
        }
        if (!this.G) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.l().d(100, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 21));
        org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.f5 b10 = o4.b(0, 2131232486);
        this.f41177a0 = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131745813, null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f41177a0;
        f5Var.N();
        f5Var.B0 = new kg.v1(this, 8);
        if (!this.J && !this.I) {
            if (this.f41195r) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            org.telegram.ui.ActionBar.f5 b11 = o4.b(1, i10);
            this.f41193n = b11;
            b11.setContentDescription(org.telegram.messenger.hd.M0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.pj0(context, null);
        this.h = new rr(this, context, this.Z, this.T, this.M, this.L);
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
        sr srVar = new sr(this, context, this.E ? 1 : 0, this.F, this.Z, i7);
        this.f41178b = srVar;
        if (this.f41193n != null) {
            if (this.f41195r) {
                i12 = 1;
            }
        } else {
            i12 = 0;
        }
        srVar.Y(i12, false);
        sr srVar2 = this.f41178b;
        srVar2.M = 17.0f;
        srVar2.H = this.Y;
        v8 v8Var = new v8(3, context, this);
        this.f41198x = v8Var;
        this.fragmentView = v8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, this.f41198x, getResourceProvider());
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(29);
        lzVar.f35807x = false;
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, lzVar, 1, null);
        this.f41180c = av0Var;
        av0Var.addView(lzVar, 0);
        this.f41180c.setAnimateLayoutChange(true);
        this.f41180c.e(true, false);
        this.f41180c.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        this.f41180c.f31929e.setText(org.telegram.messenger.hd.M0(2131745808, null));
        this.f41198x.addView(this.f41180c, c8.ha.d(-1, -1.0f, 119, 12.0f, 12.0f, 12.0f, 0.0f));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.n(150L);
        kVar.f56979m = false;
        this.d.setItemAnimator(kVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.pj0 pj0Var = this.d;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f41185f = b0Var;
        pj0Var.setLayoutManager(b0Var);
        this.d.setAdapter(this.f41178b);
        this.d.setClipToPadding(false);
        this.f41183e = new org.telegram.ui.Components.ri0(this.d, this.f41185f);
        this.f41198x.addView(this.d, c8.ha.c(-1.0f, -1));
        this.d.setEmptyView(this.f41180c);
        org.telegram.ui.Components.pj0 pj0Var2 = this.d;
        pj0Var2.W1 = true;
        pj0Var2.X1 = 0;
        pj0Var2.setOnItemClickListener(new l2.q(this, i7, 9));
        this.d.setOnItemLongClickListener(new qr(this));
        this.d.setOnScrollListener(new tr(this));
        if (!this.J && !this.I) {
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
            this.f41196s = p00Var;
            this.f41198x.addView(p00Var, org.telegram.ui.Components.p00.b());
            this.f41196s.setOnClickListener(new a(this, 15));
            this.f41196s.f36709c.f(2131624366, 44, 44, null);
            this.f41196s.f36709c.getAnimatedDrawable().M(this.f41196s.f36709c.getAnimatedDrawable().f40956e[0] - 1);
            this.f41196s.setContentDescription(org.telegram.messenger.hd.M0(2131751718, null));
        }
        String str = this.V;
        if (str != null) {
            org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
            if (y4Var2.v(true, false)) {
                y4Var2.setSearchFieldText(str);
            }
            this.V = null;
        }
        k0();
        setBulletinDelegate(new y8(this, 3));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41262f1.d.add(this);
        }
        View view = this.fragmentView;
        qr qrVar = new qr(this);
        WeakHashMap weakHashMap = r0.i0.f54098a;
        r0.a0.i(view, qrVar);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.pj0 pj0Var;
        if (i7 == org.telegram.messenger.qs.O) {
            sr srVar = this.f41178b;
            if (srVar != null) {
                if (!this.f41195r) {
                    srVar.Y(2, true);
                }
                this.f41178b.f();
            }
            if (this.h != null) {
                v4.g0 adapter = this.d.getAdapter();
                rr rrVar = this.h;
                if (adapter == rrVar) {
                    rrVar.G(this.f41179b0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f25046r) {
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
            if ((intValue & 4) != 0 && !this.f41195r && this.f41178b != null && !this.f41186f0) {
                this.f41186f0 = true;
                m4 m4Var = this.f41187g0;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 5000L);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.qs.f24950a0;
        int i15 = org.telegram.messenger.qs.f25059t;
        if (i7 == i14) {
            if (this.J && this.K) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).f26960id);
                org.telegram.messenger.qs.f(this.currentAccount).k(i15, new Object[0]);
                presentFragment(new an(bundle), false);
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
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28128s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27996l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28014m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28031n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28030n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28048o6));
        org.telegram.ui.Components.p00 p00Var = this.f41196s;
        if (p00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(p00Var.f36709c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41196s.f36709c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0(boolean z9) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && org.telegram.messenger.p10.i(this.currentAccount).U && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z9 && this.X) {
                showDialog(org.telegram.ui.Components.v4.v(parentActivity, new or(this, 1)).f27292a);
                return;
            }
            this.f41182d0 = SystemClock.elapsedRealtime();
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
        org.telegram.ui.Components.av0 av0Var = this.f41180c;
        if (av0Var != null) {
            av0Var.b(Math.max(this.f41191k0 + this.f41188h0, this.f41192l0), false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.p00 p00Var = this.f41196s;
        if (p00Var != null) {
            p00Var.setTranslationY(((-this.f41191k0) - this.f41189i0) - this.f41190j0);
        }
    }

    @Override
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21119a) {
            return baseSimpleGlass.f21022i;
        }
        return null;
    }

    public final void k0() {
        boolean z9;
        int i7;
        sr srVar = this.f41178b;
        if (srVar != null && srVar.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.m0 == z9 && this.f41194n0) {
            return;
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.f41177a0;
        if (z9) {
            i7 = 2131745735;
        } else {
            i7 = 2131745813;
        }
        f5Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        this.m0 = z9;
        this.f41194n0 = true;
    }

    public final void l0(TLRPC.User user, boolean z9, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z9 && this.S != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            org.telegram.ui.Components.hc.a0(this).t(org.telegram.messenger.hd.M0(2131753108, null), null).j();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (this.Q != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Q));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w10 = org.telegram.messenger.t3.w(4, M0);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        if (w10) {
                            u1Var.R = org.telegram.messenger.hd.M0(2131754461, null);
                            u1Var.T = org.telegram.messenger.hd.M0(2131754460, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754466, null), new org.telegram.ui.Components.f2(this, user, str));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        } else {
                            u1Var.T = org.telegram.messenger.hd.M0(2131752566, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        }
                        showDialog(u1Var);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                u1Var2.R = M02;
                String b02 = org.telegram.messenger.hd.b0(this.S, org.telegram.messenger.t10.p(user));
                if (!user.bot && this.N) {
                    b02 = a8.p0.D(b02, "\n\n", org.telegram.messenger.hd.M0(2131754365, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27956j5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.U(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new ur(editTextBoldCursor));
                    alertDialog$Builder2.o(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                u1Var2.T = b02;
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), new a7(this, user, editTextBoldCursor, 11));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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
        vr vrVar = this.U;
        if (vrVar != null) {
            vrVar.b(user);
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
        this.f41192l0 = k1Var.f54109a.f(8).d;
        i0();
    }

    public final void m0() {
        this.simpleActionBar.r();
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
        if (this.simpleActionBar.s()) {
            if (z9) {
                m0();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var.F) {
                if (z9) {
                    y4Var.j(true);
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
        if (this.f41181c0 && (parentActivity = getParentActivity()) != null) {
            this.f41181c0 = false;
            if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.v(parentActivity, new or(this, 0)).f27292a;
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
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f24950a0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25059t);
        this.f41181c0 = org.telegram.messenger.p10.i(this.currentAccount).U;
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
            this.f41195r = org.telegram.messenger.iz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.G) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f41188h0 = i7;
        if (this.G) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f41189i0 = i10;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24950a0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25059t);
        this.U = null;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f41191k0 = i12;
        oi.a.e(this.d, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.f41188h0);
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
                    if (SystemClock.elapsedRealtime() - this.f41182d0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.t0.f25555b.getPackageName(), null));
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
        sr srVar = this.f41178b;
        if (srVar != null) {
            srVar.f();
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
        if (this.simpleActionBar.s()) {
            if (hVar.i()) {
                m0();
                return;
            }
        } else {
            if (z9) {
                org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.x(hVar.m(), false);
                this.simpleActionBar.B();
            }
            z11 = false;
        }
        this.simpleActionBar.x(hVar.m(), z11);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        if (this.f41185f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.ri0 ri0Var = this.f41183e;
        ri0Var.f37692b = 1;
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
