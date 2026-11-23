package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class an0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final org.telegram.messenger.ue K;
    public org.telegram.ui.Components.ek0 L;
    public l4 M;
    public xm0 N;
    public org.telegram.ui.Components.mv0 O;
    public hi.z2 P;
    public org.telegram.ui.ActionBar.q0 Q;
    public org.telegram.ui.ActionBar.y0 R;
    public int S;
    public boolean T;
    public final int U;
    public final bn V;
    public org.telegram.ui.Components.ik0 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final int f45743a;
    public FrameLayout f45744a0;
    public final HashMap f45745b;
    public k0 f45746b0;
    public final ArrayList f45747c;
    public tv f45748c0;
    public CharSequence d;
    public View f45749d0;
    public boolean f45750e;
    public org.telegram.ui.Components.wt f45751e0;
    public final ArrayList f45752f;
    public ImageView f45753f0;
    public wm0 f45754g0;
    public final HashMap h;
    public int f45755h0;
    public final TextPaint f45756i0;
    public final RectF f45757j0;
    public final Paint f45758k0;
    public AnimatorSet f45759l0;
    public boolean m0;
    public final ArrayList f45760n;
    public org.telegram.ui.ActionBar.g1 f45761n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f45762o0;
    public org.telegram.ui.ActionBar.y0[] f45763p0;
    public String f45764q0;
    public boolean f45765r;
    public boolean f45766r0;
    public boolean f45767s;
    public final boolean f45768s0;
    public zm0 f45769t0;
    public bn0 f45770u0;
    public final int f45771v0;
    public String f45772w;
    public final int f45773w0;
    public String f45774x;
    public final int f45775x0;
    public int f45776y;
    public final um0 f45777y0;

    public an0(int i7, org.telegram.messenger.ue ueVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, bn bnVar, boolean z11) {
        super(null);
        this.f45752f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f45760n = new ArrayList();
        this.f45767s = true;
        this.J = true;
        this.S = 100;
        this.f45755h0 = 3;
        this.f45756i0 = new TextPaint(1);
        this.f45757j0 = new RectF();
        this.f45758k0 = new Paint(1);
        this.f45766r0 = true;
        this.f45777y0 = new um0(this);
        this.K = ueVar;
        this.f45745b = hashMap;
        this.f45747c = arrayList;
        this.f45743a = i7;
        this.U = i10;
        this.V = bnVar;
        this.F = z10;
        this.f45768s0 = z11;
        if (ueVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.f45760n.add(string);
            }
        }
        if (z11) {
            this.f45771v0 = org.telegram.ui.ActionBar.n6.f29608lh;
            this.f45773w0 = org.telegram.ui.ActionBar.n6.Yg;
            this.f45775x0 = org.telegram.ui.ActionBar.n6.Zg;
            return;
        }
        this.f45771v0 = org.telegram.ui.ActionBar.n6.f29524h5;
        this.f45773w0 = org.telegram.ui.ActionBar.n6.f29559j5;
        this.f45775x0 = org.telegram.ui.ActionBar.n6.I5;
    }

    public static void Z(an0 an0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.mp.u1(an0Var.currentAccount).f4(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.mp.u1(an0Var.currentAccount).Z3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.tr.a0(an0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = an0Var.H;
        an0Var.H = null;
        an0Var.i0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.r5 a0(an0 an0Var, int i7) {
        int childCount = an0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = an0Var.L.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                org.telegram.messenger.ue ueVar = an0Var.K;
                if (ueVar == null ? !(intValue < 0 || intValue >= an0Var.f45752f.size()) : !(intValue < 0 || intValue >= ueVar.f27262e.size())) {
                    if (intValue == i7) {
                        return r5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int b0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29455da));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Z = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = this.f45771v0;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.f45773w0;
        org.telegram.ui.ActionBar.u6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, this.f45775x0, null);
        this.actionBar.setBackButtonImage(2131231243);
        int i11 = this.f45743a;
        org.telegram.messenger.ue ueVar = this.K;
        if (ueVar != null) {
            this.actionBar.setTitle(ueVar.f27261c);
        } else if (i11 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131745565, null));
        } else if (i11 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131745568, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, 27));
        if (this.m0) {
            org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131231247);
            a10.setSubMenuDelegate(new vm0(this));
            this.R = a10.e(1, 2131232213, org.telegram.messenger.gd.N0(2131745149, null));
            a10.e(2, 2131232270, org.telegram.messenger.gd.N0(2131747602, null));
        }
        if (ueVar == null) {
            org.telegram.ui.ActionBar.q0 a11 = this.actionBar.s().a(0, 2131232491);
            a11.O();
            a11.I = new hi.b3(this);
            this.Q = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.u6.U(searchField, i10, null);
            org.telegram.ui.ActionBar.u6.v(searchField, i10, null);
            org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, null);
        }
        if (ueVar == null) {
            if (i11 == 0) {
                this.Q.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745565, null));
            } else if (i11 == 1) {
                this.Q.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745568, null));
            }
        }
        wm0 wm0Var = new wm0(this, context);
        this.f45754g0 = wm0Var;
        org.telegram.ui.ActionBar.u6.h(i7, wm0Var, null);
        this.fragmentView = this.f45754g0;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.L = ek0Var;
        ek0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        org.telegram.ui.Components.ek0 ek0Var2 = this.L;
        ?? tVar = new v4.t(4);
        this.N = tVar;
        ek0Var2.setLayoutManager(tVar);
        this.N.O = new bi.y2(this, 16);
        this.f45754g0.addView(this.L, c8.na.e(-1, -1, 51));
        org.telegram.ui.Components.ek0 ek0Var3 = this.L;
        l4 l4Var = new l4(14, this, context);
        this.M = l4Var;
        ek0Var3.setAdapter(l4Var);
        org.telegram.ui.ActionBar.u6.H(this.L, i7, null);
        this.L.setOnItemClickListener(new h(this, 21));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new sm0(this, 2));
        }
        org.telegram.ui.Components.ik0 ik0Var = new org.telegram.ui.Components.ik0(new vm0(this));
        this.W = ik0Var;
        if (this.I != 1) {
            this.L.F.add(ik0Var);
        }
        hi.z2 z2Var = new hi.z2(1, context, getResourceProvider());
        this.P = z2Var;
        z2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(context, this.P, 1, getResourceProvider());
        this.O = mv0Var;
        mv0Var.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(this.O.d, org.telegram.ui.ActionBar.n6.f29843y6, getResourceProvider());
        this.O.addView(this.P, 0);
        if (ueVar != null) {
            this.O.d.setText(org.telegram.messenger.gd.N0(2131747987, null));
        } else {
            this.O.d.setText(org.telegram.messenger.gd.N0(2131747976, null));
        }
        this.O.e(false, false);
        this.f45754g0.addView(this.O, c8.na.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new g3(this, 23));
        if (ueVar == null) {
            o0();
        }
        if (this.f45766r0) {
            View view = new View(context);
            this.f45749d0 = view;
            view.setBackgroundResource(2131231241);
            this.f45749d0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f45754g0.addView(this.f45749d0, c8.na.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.f45744a0 = frameLayout;
            org.telegram.ui.ActionBar.u6.h(i7, frameLayout, null);
            this.f45744a0.setVisibility(4);
            this.f45744a0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f45754g0.addView(this.f45744a0, c8.na.e(-1, 48, 83));
            this.f45744a0.setOnTouchListener(new gi.a(2));
            org.telegram.ui.Components.wt wtVar = this.f45751e0;
            if (wtVar != null) {
                wtVar.o();
            }
            this.f45751e0 = new org.telegram.ui.Components.wt(context, this.f45754g0, null, 1, false, null);
            this.f45751e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).J0())});
            this.f45751e0.setHint(org.telegram.messenger.gd.N0(2131754451, null));
            this.f45751e0.s();
            org.telegram.ui.Components.mt editText = this.f45751e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.f45744a0.addView(this.f45751e0, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f45751e0.setText(charSequence);
            }
            this.f45751e0.getEditText().addTextChangedListener(new m0(this, 14));
            k0 k0Var = new k0(18, context, this);
            this.f45746b0 = k0Var;
            k0Var.setFocusable(true);
            this.f45746b0.setFocusableInTouchMode(true);
            this.f45746b0.setVisibility(4);
            this.f45746b0.setScaleX(0.2f);
            this.f45746b0.setScaleY(0.2f);
            this.f45746b0.setAlpha(0.0f);
            this.f45754g0.addView(this.f45746b0, c8.na.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f45753f0 = new ImageView(context);
            this.f45753f0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S5, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T5, false)));
            this.f45753f0.setImageResource(2131230876);
            this.f45753f0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.u6.s(this.f45753f0, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f45753f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f45753f0.setOutlineProvider(new bg.q0(20));
            this.f45746b0.addView(this.f45753f0, c8.na.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f45753f0.setOnClickListener(new i40(this, 19));
            this.f45753f0.setOnLongClickListener(new t(this, 4));
            TextPaint textPaint = this.f45756i0;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            tv tvVar = new tv(5, context, this);
            this.f45748c0 = tvVar;
            tvVar.setAlpha(0.0f);
            this.f45748c0.setScaleX(0.2f);
            this.f45748c0.setScaleY(0.2f);
            this.f45754g0.addView(this.f45748c0, c8.na.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.f45751e0.setVisibility(8);
            }
        }
        if ((ueVar != null || i11 == 0 || i11 == 1) && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45750e = z10;
        this.L.setEmptyView(this.O);
        org.telegram.ui.Components.ek0 ek0Var4 = this.L;
        ek0Var4.X1 = true;
        ek0Var4.Y1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i7, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof org.telegram.messenger.ef;
        if (z10) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        } else if (obj instanceof org.telegram.messenger.hf) {
            obj2 = ((org.telegram.messenger.hf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f45745b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f45747c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f45750e) {
                m0();
            }
            if (i7 >= 0) {
                if (z10) {
                    ((org.telegram.messenger.ef) obj).e();
                } else if (obj instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj).e();
                }
                this.f45777y0.X(i7);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25289t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.f45760n.clear();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        this.O.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z10;
        int i7 = 1;
        if (d0(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(this.f45747c.contains(Integer.valueOf(((org.telegram.messenger.ef) this.K.f27262e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z10) {
            i7 = 2;
        }
        n0(i7);
        this.f45769t0.o();
    }

    public final void g0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f45752f.clear();
        this.h.clear();
        this.f45767s = true;
        if (this.f45743a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(obj, "", z10, true);
        this.f45772w = obj;
        if (obj.length() == 0) {
            this.f45772w = null;
            this.O.d.setText(org.telegram.messenger.gd.N0(2131747976, null));
        } else {
            this.O.d.setText(org.telegram.messenger.gd.a0("NoResultFoundFor", null, 2131747973, this.f45772w));
        }
        o0();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45754g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45771v0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45771v0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45773w0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45773w0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45775x0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45773w0));
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45773w0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f45771v0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f45760n.size());
        int size = this.f45760n.size();
        for (int i7 = 0; i7 < size; i7++) {
            edit.putString(i5.c.i(i7, "recent"), (String) this.f45760n.get(i7));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f45765r) {
            this.f45765r = false;
            if (this.f45776y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45776y, true);
                this.f45776y = 0;
            }
        }
        this.H = str;
        this.f45765r = true;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.currentAccount);
        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(this.currentAccount);
        if (z10) {
            str3 = u13.N3;
        } else {
            str3 = u13.O3;
        }
        TLObject h22 = u12.h2(str3);
        if (!(h22 instanceof TLRPC.User)) {
            if (z11 && !this.G) {
                this.G = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(this.currentAccount);
                if (z10) {
                    str5 = u14.N3;
                } else {
                    str5 = u14.O3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new hi.k3(10, this, z10));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) h22;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.mp.u1(this.currentAccount).s1(user);
        tL_messages_getInlineBotResults.offset = str2;
        bn bnVar = this.V;
        if (bnVar != null) {
            long a10 = bnVar.a();
            if (org.telegram.messenger.n5.C(a10)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().l1(a10);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i7 = this.E + 1;
        this.E = i7;
        this.f45776y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.an(this, str, i7, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f45776y, this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i7, boolean z10) {
        HashMap hashMap = this.f45745b;
        if (!hashMap.isEmpty() && this.f45769t0 != null && !this.T) {
            org.telegram.ui.Components.wt wtVar = this.f45751e0;
            if (wtVar != null && wtVar.f41719a.length() > 0) {
                Object obj = hashMap.get(this.f45747c.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj).f27962a = this.f45751e0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj).I = this.f45751e0.getText().toString();
                }
            }
            this.T = true;
            this.f45769t0.g0(i7, false, z10);
            if (this.U != 2) {
                zm0 zm0Var = this.f45769t0;
                if (zm0Var == null || zm0Var.f()) {
                    finishFragment();
                }
            }
        }
    }

    public final void k0(int i7, boolean z10) {
        this.I = i7;
        this.J = z10;
        if (i7 > 0 && this.f45743a == 1) {
            this.I = 1;
        }
    }

    public final boolean l0(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float L;
        float f14;
        float f15;
        float f16;
        float f17;
        float L2;
        if (this.f45751e0 != null) {
            if (this.f45744a0.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f45759l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.f45744a0;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f45751e0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.f45751e0.getEditText());
                }
                this.f45751e0.k(true);
                if (z10) {
                    this.f45744a0.setVisibility(0);
                    this.f45746b0.setVisibility(0);
                }
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z11) {
                    this.f45759l0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    k0 k0Var = this.f45746b0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f14));
                    k0 k0Var2 = this.f45746b0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, f15));
                    k0 k0Var3 = this.f45746b0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var3, property3, f16));
                    tv tvVar = this.f45748c0;
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(tvVar, property, f17));
                    tv tvVar2 = this.f45748c0;
                    if (z10) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(tvVar2, property2, f19));
                    tv tvVar3 = this.f45748c0;
                    if (!z10) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(tvVar3, property3, f20));
                    FrameLayout frameLayout2 = this.f45744a0;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f45749d0;
                    if (!z10) {
                        f18 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f45759l0.playTogether(arrayList);
                    this.f45759l0.setInterpolator(new DecelerateInterpolator());
                    this.f45759l0.setDuration(180L);
                    this.f45759l0.addListener(new b30(4, this, z10));
                    this.f45759l0.start();
                    return true;
                }
                k0 k0Var4 = this.f45746b0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                k0Var4.setScaleX(f10);
                k0 k0Var5 = this.f45746b0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                k0Var5.setScaleY(f11);
                k0 k0Var6 = this.f45746b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                k0Var6.setAlpha(f12);
                tv tvVar4 = this.f45748c0;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                tvVar4.setScaleX(f13);
                tv tvVar5 = this.f45748c0;
                if (z10) {
                    f19 = 1.0f;
                }
                tvVar5.setScaleY(f19);
                tv tvVar6 = this.f45748c0;
                if (!z10) {
                    f20 = 0.0f;
                }
                tvVar6.setAlpha(f20);
                FrameLayout frameLayout3 = this.f45744a0;
                if (z10) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f45749d0;
                if (!z10) {
                    f18 = org.telegram.messenger.g0.L(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z10) {
                    this.f45744a0.setVisibility(4);
                    this.f45746b0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        boolean z10;
        if (this.f45750e) {
            int childCount = this.L.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.L.getChildAt(i7);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.r5;
                org.telegram.messenger.ue ueVar = this.K;
                ArrayList arrayList = this.f45747c;
                if (z11) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i10 = -1;
                    if (ueVar != null) {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27262e.get(num.intValue());
                        if (this.f45750e) {
                            i10 = arrayList.indexOf(Integer.valueOf(efVar.C));
                        }
                        r5Var.setNum(i10);
                    } else {
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) this.f45752f.get(num.intValue());
                        if (this.f45750e) {
                            i10 = arrayList.indexOf(hfVar.B);
                        }
                        r5Var.setNum(i10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ef) ueVar.f27262e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h7Var.b(z10, false);
                }
            }
        }
    }

    public final void n0(int i7) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (this.f45745b.size() == 0) {
            this.f45748c0.setPivotX(0.0f);
            this.f45748c0.setPivotY(0.0f);
            if (i7 == 0) {
                z11 = false;
            }
            l0(false, z11);
            return;
        }
        this.f45748c0.invalidate();
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l0(true, z10) && i7 != 0) {
            this.f45748c0.setPivotX(org.telegram.messenger.g0.L(21.0f));
            this.f45748c0.setPivotY(org.telegram.messenger.g0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            tv tvVar = this.f45748c0;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i7 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tvVar, property, f10, 1.0f);
            tv tvVar2 = this.f45748c0;
            Property property2 = View.SCALE_Y;
            if (i7 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(tvVar2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f45748c0.setPivotX(0.0f);
        this.f45748c0.setPivotY(0.0f);
    }

    public final void o0() {
        String str;
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        if (!this.f45765r && (this.f45760n.size() <= 0 || ((str = this.f45772w) != null && !TextUtils.isEmpty(str)))) {
            this.O.e(false, true);
        } else {
            this.O.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.f45751e0;
        if (wtVar != null && wtVar.f41722e) {
            if (z10) {
                wtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25289t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25289t);
        if (this.f45776y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45776y, true);
            this.f45776y = 0;
        }
        org.telegram.ui.Components.wt wtVar = this.f45751e0;
        if (wtVar != null) {
            wtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.ek0 ek0Var = this.L;
        if (ek0Var == null) {
            return;
        }
        if (this.f45751e0.f41722e) {
            this.fragmentView.setTranslationY(f10);
            this.L.setTranslationY(0.0f);
            return;
        }
        ek0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.wt wtVar = this.f45751e0;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            q0Var.G(true);
            if (!TextUtils.isEmpty(this.f45764q0)) {
                this.Q.Q(this.f45764q0, false);
                this.f45764q0 = null;
                g0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (z10 && (q0Var = this.Q) != null) {
            org.telegram.messenger.g0.I3(q0Var.getSearchField());
        }
    }
}
