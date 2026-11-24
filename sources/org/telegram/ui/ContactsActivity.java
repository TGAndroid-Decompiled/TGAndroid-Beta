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
public class ContactsActivity extends org.telegram.ui.ActionBar.d implements g94, jm7, aj6, tyc {
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
    public cv2 V;
    public String W;
    public he X;
    public boolean Y;
    public boolean Z;
    public final h94 a;
    public final vh6 a0;
    public zu2 b;
    public zja b0;
    public a1b c;
    public String c0;
    public r59 d;
    public boolean d0;
    public cw6 e;
    public long e0;
    public u46 f;
    public ViewPropertyAnimator f0;
    public boolean g0;
    public yu2 h;
    public final o1 h0;
    public int i0;
    public int j0;
    public float k0;
    public int l0;
    public int m0;
    public zja n;
    public boolean n0;
    public boolean o0;
    public int phonebookRow;
    public boolean r;
    public wp4 s;
    public boolean w;
    public w91 x;
    public boolean y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.a = new h94(0, this, d53.h, 380L, 1.0f);
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
        this.a0 = new vh6();
        this.d0 = true;
        this.h0 = new o1(this, (byte) 19);
    }

    public static rja a0(ContactsActivity contactsActivity) {
        return contactsActivity.simpleActionBar;
    }

    public static rja b0(ContactsActivity contactsActivity) {
        return contactsActivity.simpleActionBar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            zu2 zu2Var = this.b;
            ArrayList arrayList = zu2Var.O;
            zu2Var.M = f;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((p26) arrayList.get(i2)).setLetterProgress(f);
            }
            this.d.invalidate();
        }
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z) {
        r59 r59Var = this.d;
        if (r59Var != null && r59Var.getFastScroll() != null && this.d.getFastScroll().n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.o6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void c0(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && z8c.h(this.currentAccount).V && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z && this.Y) {
                showDialog(ik.v(parentActivity, new uu2(this, (byte) 1)).a);
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
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContactsActivity.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        a1b a1bVar = this.c;
        if (a1bVar != null) {
            a1bVar.b(Math.max(this.l0 + this.i0, this.m0), false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r59 r59Var;
        if (i == nm7.N) {
            zu2 zu2Var = this.b;
            if (zu2Var != null) {
                if (!this.r) {
                    zu2Var.Y(2, true);
                }
                this.b.f();
            }
            if (this.h != null) {
                y59 adapter = this.d.getAdapter();
                yu2 yu2Var = this.h;
                if (adapter == yu2Var) {
                    yu2Var.G(this.c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = oc7.s5;
            if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (r59Var = this.d) != null) {
                int childCount = r59Var.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.d.getChildAt(i4);
                    if (childAt instanceof w8c) {
                        ((w8c) childAt).i(intValue);
                    }
                }
            }
            int i5 = oc7.s5;
            if ((intValue & 4) != 0 && !this.r && this.b != null && !this.g0) {
                this.g0 = true;
                o1 o1Var = this.h0;
                gm.r(o1Var);
                gm.d3(o1Var, 5000L);
                return;
            }
            return;
        }
        int i6 = nm7.a0;
        int i7 = nm7.s;
        if (i == i6) {
            if (this.K && this.L) {
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) objArr[0]).id);
                nm7.f(this.currentAccount).k(i7, new Object[0]);
                presentFragment(new yv1(bundle), false);
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
        wp4 wp4Var = this.s;
        if (wp4Var != null) {
            wp4Var.setTranslationY(((-this.l0) - this.j0) - this.k0);
        }
    }

    public final void f0() {
        zu2 zu2Var;
        boolean z;
        wp4 wp4Var = this.s;
        if (wp4Var != null && (zu2Var = this.b) != null) {
            if (this.w && !this.E && !zu2Var.J) {
                z = true;
            } else {
                z = false;
            }
            wp4Var.e(z, true);
        }
    }

    public final void g0() {
        boolean z;
        int i;
        zu2 zu2Var = this.b;
        if (zu2Var != null && zu2Var.J) {
            z = true;
        } else {
            z = false;
        }
        if (this.n0 == z && this.o0) {
            return;
        }
        zja zjaVar = this.b0;
        if (z) {
            i = 2131745468;
        } else {
            i = 2131745546;
        }
        zjaVar.setSearchFieldHint(jb6.M0(i, null));
        this.n0 = z;
        this.o0 = true;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 3);
        if (!this.H) {
            arrayList.add(new cnb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        }
        arrayList.add(new cnb(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.d, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        arrayList.add(new cnb(this.d, 262148, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.n6));
        wp4 wp4Var = this.s;
        if (wp4Var != null) {
            arrayList.add(new cnb(wp4Var.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.O9));
            arrayList.add(new cnb(this.s.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.P9));
        }
        return arrayList;
    }

    public final void h0(TLRPC.User user, boolean z, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (z && this.T != null) {
            if (getParentActivity() != null) {
                if (user.bot) {
                    if (user.bot_nochats) {
                        try {
                            c41.b0(this).t(jb6.M0(2131753073, null), null).j();
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    } else if (this.R != 0) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.R));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        boolean w = sd2.w(4, L0);
                        he heVar = alertDialog$Builder.a;
                        if (w) {
                            heVar.S = jb6.M0(2131754458, null);
                            heVar.U = jb6.M0(2131754457, null);
                            alertDialog$Builder.j(jb6.M0(2131754463, null), new x92(this, user, str));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        } else {
                            heVar.U = jb6.M0(2131752519, null);
                            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        }
                        showDialog(heVar);
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131689472, null);
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M0;
                String b0 = jb6.b0(this.T, m9c.r(user));
                if (!user.bot && this.O) {
                    b0 = kt6.o(b0, "\n\n", jb6.M0(2131754362, null));
                    editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                    editTextBoldCursor.setTextSize(1, 18.0f);
                    editTextBoldCursor.setText("50");
                    anb.X(editTextBoldCursor, cmb.i5, getResourceProvider());
                    editTextBoldCursor.setGravity(17);
                    editTextBoldCursor.setInputType(2);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setBackground(cmb.T(getParentActivity()));
                    editTextBoldCursor.addTextChangedListener(new bv2(editTextBoldCursor));
                    alertDialog$Builder2.n(editTextBoldCursor);
                } else {
                    editTextBoldCursor = null;
                }
                heVar2.U = b0;
                alertDialog$Builder2.j(jb6.M0(2131747564, null), new wu2(this, user, editTextBoldCursor, (byte) 0));
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                showDialog(heVar2);
                if (editTextBoldCursor != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                        }
                        int L = gm.L(24.0f);
                        marginLayoutParams.leftMargin = L;
                        marginLayoutParams.rightMargin = L;
                        marginLayoutParams.height = gm.L(36.0f);
                        editTextBoldCursor.setLayoutParams(marginLayoutParams);
                    }
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    return;
                }
                return;
            }
            return;
        }
        cv2 cv2Var = this.V;
        if (cv2Var != null) {
            cv2Var.b(user);
            if (this.Q) {
                this.V = null;
            }
        }
        if (this.P) {
            finishFragment();
        }
    }

    public final void i0() {
        this.simpleActionBar.w();
        int childCount = this.d.getChildCount();
        int i = 0;
        while (true) {
            vh6 vh6Var = this.a0;
            if (i < childCount) {
                View childAt = this.d.getChildAt(i);
                if (childAt instanceof w8c) {
                    w8c w8cVar = (w8c) childAt;
                    if (vh6Var.h(w8cVar.getDialogId()) >= 0) {
                        w8cVar.c(false, true);
                    }
                } else if (childAt instanceof ut8) {
                    ut8 ut8Var = (ut8) childAt;
                    if (vh6Var.h(ut8Var.getDialogId()) >= 0) {
                        ut8Var.w(false, true);
                    }
                }
                i++;
            } else {
                vh6Var.b();
                return;
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final nz4 j() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(int i) {
        boolean z;
        oc7.e1().edit().putBoolean("askAboutContacts2", false).commit();
        nm7.f(this.currentAccount).k(nm7.T5, new Object[0]);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.Y = z;
        if (i == 0) {
            return;
        }
        c0(false);
    }

    public final void k0(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", bw2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void l0(View view, int i, int i2) {
        String str;
        y59 adapter = this.d.getAdapter();
        yu2 yu2Var = this.h;
        vh6 vh6Var = this.a0;
        if (adapter == yu2Var) {
            yu2Var.getClass();
            Object E = this.h.E(i2);
            if (!vh6Var.i() && (view instanceof ut8)) {
                ut8 ut8Var = (ut8) view;
                if (ut8Var.getUser() != null && ut8Var.getUser().contact) {
                    n0(ut8Var);
                    return;
                }
                return;
            } else if (E instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) E;
                yu2 yu2Var2 = this.h;
                int size = yu2Var2.d.size();
                int size2 = yu2Var2.I.size();
                bu9 bu9Var = yu2Var2.f;
                int size3 = bu9Var.e.size();
                int size4 = bu9Var.j.size();
                if ((i2 < 0 || i2 >= size) && ((i2 <= size || i2 >= size + size2 + 1) && ((i2 <= size + size2 + 1 || i2 >= size + size4 + size2 + 1) && i2 > size + size4 + size2 + 1 && i2 <= size3 + size4 + size + size2 + 1))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    getMessagesController().d4(arrayList, false);
                    cf7.Y(this.currentAccount).j1(arrayList, null, false, true);
                }
                if (this.J) {
                    h0(user, true, null);
                    return;
                } else if (this.K) {
                    if (user.id != z8c.h(this.currentAccount).e()) {
                        this.L = true;
                        dw9.i(this.currentAccount).A(getParentActivity(), user);
                        return;
                    }
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    if (getMessagesController().A(bundle, this, null, null)) {
                        presentFragment(new yv1(bundle), this.P);
                        return;
                    }
                    return;
                }
            } else if (E instanceof String) {
                String str2 = (String) E;
                if (!str2.equals("section")) {
                    if (oc7.r1(this.currentAccount).u2()) {
                        h5.b(this.currentAccount);
                        return;
                    }
                    ml7 ml7Var = new ml7(this, getParentActivity());
                    ml7Var.H0(str2, true);
                    ml7Var.show();
                    return;
                }
                return;
            } else if (E instanceof yv2) {
                yv2 yv2Var = (yv2) E;
                ik.u(this, yv2Var.i, yv2Var.j, (String) yv2Var.e.get(0));
                return;
            } else {
                return;
            }
        }
        this.b.getClass();
        int S = this.b.S(i2);
        int Q = this.b.Q(i2);
        if (Q >= 0 && S >= 0) {
            if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof cw2)) {
                wp4 wp4Var = this.s;
                if (wp4Var != null) {
                    wp4Var.performClick();
                }
            } else if (!vh6Var.i() && (view instanceof w8c)) {
                n0((w8c) view);
            } else if ((!this.F || i != 0) && S == 0) {
                if (this.G) {
                    if (Q == 0) {
                        if (oc7.r1(this.currentAccount).u2()) {
                            h5.b(this.currentAccount);
                        } else {
                            presentFragment(new es5());
                        }
                    } else if (Q == 1) {
                        presentFragment(new ia1(null));
                    }
                } else if (i != 0) {
                    if (Q == 0) {
                        if (oc7.r1(this.currentAccount).u2()) {
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
                    if (oc7.r1(this.currentAccount).u2()) {
                        h5.b(this.currentAccount);
                    } else {
                        presentFragment(new oc5(new Bundle()), false);
                    }
                } else if (Q == 1) {
                    if (oc7.r1(this.currentAccount).u2()) {
                        h5.b(this.currentAccount);
                        return;
                    }
                    SharedPreferences d1 = oc7.d1();
                    boolean z = e21.a;
                    presentFragment(new u8(0));
                    d1.edit().putBoolean("channel_intro", true).commit();
                }
            } else {
                Object O = this.b.O(this.b.S(i2), this.b.Q(i2));
                if (O instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) O;
                    if (this.J) {
                        h0(user2, true, null);
                    } else if (this.K) {
                        this.L = true;
                        dw9.i(this.currentAccount).A(getParentActivity(), user2);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user2.id);
                        if (getMessagesController().A(bundle2, this, null, null)) {
                            presentFragment(new yv1(bundle2), this.P);
                        }
                    }
                } else if (O instanceof yv2) {
                    ArrayList arrayList2 = ((yv2) O).e;
                    if (!arrayList2.isEmpty()) {
                        str = (String) arrayList2.get(0);
                    } else {
                        str = null;
                    }
                    if (str != null && getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = jb6.M0(2131748863, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.U = M0;
                        heVar.S = jb6.M0(2131689472, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), new x92(this, str, (byte) 11));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        showDialog(heVar);
                    }
                }
            }
        }
    }

    public final void m0() {
        if (oc7.r1(this.currentAccount).u2()) {
            h5.b(this.currentAccount);
        } else {
            new ml7(this, getParentActivity()).show();
        }
    }

    public final void n0(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = viewGroup instanceof w8c;
        boolean z3 = true;
        vh6 vh6Var = this.a0;
        if (z2) {
            w8c w8cVar = (w8c) viewGroup;
            long dialogId = w8cVar.getDialogId();
            if (vh6Var.h(dialogId) >= 0) {
                vh6Var.l(dialogId);
                w8cVar.c(false, true);
            } else if (w8cVar.getCurrentObject() instanceof TLRPC.User) {
                vh6Var.k((TLRPC.User) w8cVar.getCurrentObject(), dialogId);
                w8cVar.c(true, true);
                z = true;
            }
            z = false;
        } else if (viewGroup instanceof ut8) {
            ut8 ut8Var = (ut8) viewGroup;
            long dialogId2 = ut8Var.getDialogId();
            if (vh6Var.h(dialogId2) >= 0) {
                vh6Var.l(dialogId2);
                ut8Var.w(false, true);
            } else if (ut8Var.getUser() != null) {
                vh6Var.k(ut8Var.getUser(), dialogId2);
                ut8Var.w(true, true);
                z = true;
            }
            z = false;
        } else {
            return;
        }
        if (this.simpleActionBar.x()) {
            if (vh6Var.i()) {
                i0();
                return;
            }
        } else {
            if (z) {
                gm.t1(this.fragmentView.findFocus());
                this.simpleActionBar.F(vh6Var.m(), false);
                this.simpleActionBar.J();
            }
            z3 = false;
        }
        this.simpleActionBar.F(vh6Var.m(), z3);
    }

    @Override
    public final void o(wzc wzcVar) {
        this.m0 = wzcVar.a.f(8).d;
        d0();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.simpleActionBar.x()) {
            if (z) {
                i0();
                return false;
            }
        } else {
            rja rjaVar = this.simpleActionBar;
            if (rjaVar.G) {
                if (z) {
                    rjaVar.o(true);
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
                    he heVar = ik.v(parentActivity, new uu2(this, (byte) 0)).a;
                    this.X = heVar;
                    showDialog(heVar);
                    return;
                }
                c0(true);
            }
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        he heVar = this.X;
        if (heVar != null && dialog == heVar && getParentActivity() != null && this.Y) {
            c0(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i;
        super.onFragmentCreate();
        nm7.f(this.currentAccount).b(this, nm7.N);
        nm7.f(this.currentAccount).b(this, 2);
        nm7.f(this.currentAccount).b(this, nm7.a0);
        nm7.f(this.currentAccount).b(this, nm7.s);
        this.d0 = z8c.h(this.currentAccount).V;
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
            this.r = gda.H0;
        }
        getContactsController().f();
        getContactsController().J(false);
        if (this.H) {
            i = gm.L(72.0f);
        } else {
            i = 0;
        }
        this.i0 = i;
        if (this.H) {
            i2 = gm.L(64.0f);
        }
        this.j0 = i2;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.N);
        nm7.f(this.currentAccount).n(this, 2);
        nm7.f(this.currentAccount).n(this, nm7.a0);
        nm7.f(this.currentAccount).n(this, nm7.s);
        this.V = null;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0 = i4;
        eh0.e(this.d, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), this.i0);
        e0();
        d0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.o(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2 && "android.permission.READ_CONTACTS".equals(strArr[i2])) {
                    if (iArr[i2] == 0) {
                        bw2.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = oc7.e1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.a.b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
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
        zu2 zu2Var = this.b;
        if (zu2Var != null) {
            zu2Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                r59 r59Var = this.d;
                if (r59Var != null) {
                    r59Var.x1();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
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
    public final void u() {
        if (this.f.K0() < 15) {
            this.d.z0(0);
            return;
        }
        cw6 cw6Var = this.e;
        cw6Var.b = 1;
        cw6Var.l(0, 0, false, false);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final nz4 z() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void V(float f, int i) {
    }
}
