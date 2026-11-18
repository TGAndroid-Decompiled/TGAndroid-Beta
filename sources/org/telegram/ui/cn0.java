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
public final class cn0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final org.telegram.messenger.ue K;
    public org.telegram.ui.Components.ck0 L;
    public l4 M;
    public zm0 N;
    public org.telegram.ui.Components.kv0 O;
    public hi.r2 P;
    public org.telegram.ui.ActionBar.r0 Q;
    public org.telegram.ui.ActionBar.z0 R;
    public int S;
    public boolean T;
    public final int U;
    public final bn V;
    public org.telegram.ui.Components.gk0 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final int f46537a;
    public FrameLayout f46538a0;
    public final HashMap f46539b;
    public k0 f46540b0;
    public final ArrayList f46541c;
    public uv f46542c0;
    public CharSequence d;
    public View f46543d0;
    public boolean f46544e;
    public org.telegram.ui.Components.wt f46545e0;
    public final ArrayList f46546f;
    public ImageView f46547f0;
    public ym0 f46548g0;
    public final HashMap h;
    public int f46549h0;
    public final TextPaint f46550i0;
    public final RectF f46551j0;
    public final Paint f46552k0;
    public AnimatorSet f46553l0;
    public boolean m0;
    public final ArrayList f46554n;
    public org.telegram.ui.ActionBar.h1 f46555n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f46556o0;
    public org.telegram.ui.ActionBar.z0[] f46557p0;
    public String f46558q0;
    public boolean f46559r;
    public boolean f46560r0;
    public boolean f46561s;
    public final boolean f46562s0;
    public bn0 f46563t0;
    public dn0 f46564u0;
    public final int f46565v0;
    public String f46566w;
    public final int f46567w0;
    public String f46568x;
    public final int f46569x0;
    public int f46570y;
    public final wm0 f46571y0;

    public cn0(int i7, org.telegram.messenger.ue ueVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, bn bnVar, boolean z11) {
        super(null);
        this.f46546f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f46554n = new ArrayList();
        this.f46561s = true;
        this.J = true;
        this.S = 100;
        this.f46549h0 = 3;
        this.f46550i0 = new TextPaint(1);
        this.f46551j0 = new RectF();
        this.f46552k0 = new Paint(1);
        this.f46560r0 = true;
        this.f46571y0 = new wm0(this);
        this.K = ueVar;
        this.f46539b = hashMap;
        this.f46541c = arrayList;
        this.f46537a = i7;
        this.U = i10;
        this.V = bnVar;
        this.F = z10;
        this.f46562s0 = z11;
        if (ueVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.f46554n.add(string);
            }
        }
        if (z11) {
            this.f46565v0 = org.telegram.ui.ActionBar.n6.f29551lh;
            this.f46567w0 = org.telegram.ui.ActionBar.n6.Yg;
            this.f46569x0 = org.telegram.ui.ActionBar.n6.Zg;
            return;
        }
        this.f46565v0 = org.telegram.ui.ActionBar.n6.f29467h5;
        this.f46567w0 = org.telegram.ui.ActionBar.n6.f29502j5;
        this.f46569x0 = org.telegram.ui.ActionBar.n6.I5;
    }

    public static void Z(cn0 cn0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.mp.u1(cn0Var.currentAccount).f4(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.mp.u1(cn0Var.currentAccount).Z3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.tr.a0(cn0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = cn0Var.H;
        cn0Var.H = null;
        cn0Var.i0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.s5 a0(cn0 cn0Var, int i7) {
        int childCount = cn0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cn0Var.L.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                org.telegram.messenger.ue ueVar = cn0Var.K;
                if (ueVar == null ? !(intValue < 0 || intValue >= cn0Var.f46546f.size()) : !(intValue < 0 || intValue >= ueVar.f27158e.size())) {
                    if (intValue == i7) {
                        return s5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int b0(cn0 cn0Var) {
        return cn0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29398da));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Z = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = this.f46565v0;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.f46567w0;
        org.telegram.ui.ActionBar.u6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, this.f46569x0, null);
        this.actionBar.setBackButtonImage(2131231240);
        int i11 = this.f46537a;
        org.telegram.messenger.ue ueVar = this.K;
        if (ueVar != null) {
            this.actionBar.setTitle(ueVar.f27157c);
        } else if (i11 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131745566, null));
        } else if (i11 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131745569, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 27));
        if (this.m0) {
            org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, 2131231244);
            a10.setSubMenuDelegate(new xm0(this));
            this.R = a10.e(1, 2131232210, org.telegram.messenger.gd.M0(2131745150, null));
            a10.e(2, 2131232267, org.telegram.messenger.gd.M0(2131747603, null));
        }
        if (ueVar == null) {
            org.telegram.ui.ActionBar.r0 a11 = this.actionBar.t().a(0, 2131232488);
            a11.O();
            a11.I = new hi.t2(this);
            this.Q = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.u6.U(searchField, i10, null);
            org.telegram.ui.ActionBar.u6.v(searchField, i10, null);
            org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, null);
        }
        if (ueVar == null) {
            if (i11 == 0) {
                this.Q.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745566, null));
            } else if (i11 == 1) {
                this.Q.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745569, null));
            }
        }
        ym0 ym0Var = new ym0(this, context);
        this.f46548g0 = ym0Var;
        org.telegram.ui.ActionBar.u6.h(i7, ym0Var, null);
        this.fragmentView = this.f46548g0;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.L = ck0Var;
        ck0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        org.telegram.ui.Components.ck0 ck0Var2 = this.L;
        ?? tVar = new v4.t(4);
        this.N = tVar;
        ck0Var2.setLayoutManager(tVar);
        this.N.O = new bi.s2(this, 16);
        this.f46548g0.addView(this.L, c8.ma.e(-1, -1, 51));
        org.telegram.ui.Components.ck0 ck0Var3 = this.L;
        l4 l4Var = new l4(14, this, context);
        this.M = l4Var;
        ck0Var3.setAdapter(l4Var);
        org.telegram.ui.ActionBar.u6.H(this.L, i7, null);
        this.L.setOnItemClickListener(new h(this, 21));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new um0(this, 2));
        }
        org.telegram.ui.Components.gk0 gk0Var = new org.telegram.ui.Components.gk0(new xm0(this));
        this.W = gk0Var;
        if (this.I != 1) {
            this.L.F.add(gk0Var);
        }
        hi.r2 r2Var = new hi.r2(1, context, getResourceProvider());
        this.P = r2Var;
        r2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(context, this.P, 1, getResourceProvider());
        this.O = kv0Var;
        kv0Var.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(this.O.d, org.telegram.ui.ActionBar.n6.f29786y6, getResourceProvider());
        this.O.addView(this.P, 0);
        if (ueVar != null) {
            this.O.d.setText(org.telegram.messenger.gd.M0(2131747988, null));
        } else {
            this.O.d.setText(org.telegram.messenger.gd.M0(2131747977, null));
        }
        this.O.e(false, false);
        this.f46548g0.addView(this.O, c8.ma.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new g3(this, 23));
        if (ueVar == null) {
            o0();
        }
        if (this.f46560r0) {
            View view = new View(context);
            this.f46543d0 = view;
            view.setBackgroundResource(2131231238);
            this.f46543d0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f46548g0.addView(this.f46543d0, c8.ma.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.f46538a0 = frameLayout;
            org.telegram.ui.ActionBar.u6.h(i7, frameLayout, null);
            this.f46538a0.setVisibility(4);
            this.f46538a0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f46548g0.addView(this.f46538a0, c8.ma.e(-1, 48, 83));
            this.f46538a0.setOnTouchListener(new gi.a(2));
            org.telegram.ui.Components.wt wtVar = this.f46545e0;
            if (wtVar != null) {
                wtVar.o();
            }
            this.f46545e0 = new org.telegram.ui.Components.wt(context, this.f46548g0, null, 1, false, null);
            this.f46545e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).J0())});
            this.f46545e0.setHint(org.telegram.messenger.gd.M0(2131754452, null));
            this.f46545e0.s();
            org.telegram.ui.Components.mt editText = this.f46545e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.f46538a0.addView(this.f46545e0, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f46545e0.setText(charSequence);
            }
            this.f46545e0.getEditText().addTextChangedListener(new m0(this, 14));
            k0 k0Var = new k0(18, context, this);
            this.f46540b0 = k0Var;
            k0Var.setFocusable(true);
            this.f46540b0.setFocusableInTouchMode(true);
            this.f46540b0.setVisibility(4);
            this.f46540b0.setScaleX(0.2f);
            this.f46540b0.setScaleY(0.2f);
            this.f46540b0.setAlpha(0.0f);
            this.f46548g0.addView(this.f46540b0, c8.ma.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f46547f0 = new ImageView(context);
            this.f46547f0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S5, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T5, false)));
            this.f46547f0.setImageResource(2131230876);
            this.f46547f0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.u6.s(this.f46547f0, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f46547f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f46547f0.setOutlineProvider(new bg.q0(20));
            this.f46540b0.addView(this.f46547f0, c8.ma.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f46547f0.setOnClickListener(new j40(this, 19));
            this.f46547f0.setOnLongClickListener(new t(this, 4));
            TextPaint textPaint = this.f46550i0;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            uv uvVar = new uv(5, context, this);
            this.f46542c0 = uvVar;
            uvVar.setAlpha(0.0f);
            this.f46542c0.setScaleX(0.2f);
            this.f46542c0.setScaleY(0.2f);
            this.f46548g0.addView(this.f46542c0, c8.ma.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.f46545e0.setVisibility(8);
            }
        }
        if ((ueVar != null || i11 == 0 || i11 == 1) && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46544e = z10;
        this.L.setEmptyView(this.O);
        org.telegram.ui.Components.ck0 ck0Var4 = this.L;
        ck0Var4.X1 = true;
        ck0Var4.Y1 = 0;
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
        HashMap hashMap = this.f46539b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f46541c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f46544e) {
                m0();
            }
            if (i7 >= 0) {
                if (z10) {
                    ((org.telegram.messenger.ef) obj).e();
                } else if (obj instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj).e();
                }
                this.f46571y0.X(i7);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25190t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.f46554n.clear();
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
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(this.f46541c.contains(Integer.valueOf(((org.telegram.messenger.ef) this.K.f27158e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z10) {
            i7 = 2;
        }
        n0(i7);
        this.f46563t0.u();
    }

    public final void g0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f46546f.clear();
        this.h.clear();
        this.f46561s = true;
        if (this.f46537a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(obj, "", z10, true);
        this.f46566w = obj;
        if (obj.length() == 0) {
            this.f46566w = null;
            this.O.d.setText(org.telegram.messenger.gd.M0(2131747977, null));
        } else {
            this.O.d.setText(org.telegram.messenger.gd.a0("NoResultFoundFor", null, 2131747974, this.f46566w));
        }
        o0();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f46548g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46565v0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46565v0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46567w0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46567w0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46569x0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46567w0));
        org.telegram.ui.ActionBar.r0 r0Var = this.Q;
        if (r0Var != null) {
            editTextBoldCursor = r0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46567w0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f46565v0));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f46554n.size());
        int size = this.f46554n.size();
        for (int i7 = 0; i7 < size; i7++) {
            edit.putString(i5.c.i(i7, "recent"), (String) this.f46554n.get(i7));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f46559r) {
            this.f46559r = false;
            if (this.f46570y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f46570y, true);
                this.f46570y = 0;
            }
        }
        this.H = str;
        this.f46559r = true;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new hi.c3(10, this, z10));
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
        this.f46570y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.an(this, str, i7, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f46570y, this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29337a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i7, boolean z10) {
        HashMap hashMap = this.f46539b;
        if (!hashMap.isEmpty() && this.f46563t0 != null && !this.T) {
            org.telegram.ui.Components.wt wtVar = this.f46545e0;
            if (wtVar != null && wtVar.f41786a.length() > 0) {
                Object obj = hashMap.get(this.f46541c.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj).f27846a = this.f46545e0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj).I = this.f46545e0.getText().toString();
                }
            }
            this.T = true;
            this.f46563t0.v0(i7, false, z10);
            if (this.U != 2) {
                bn0 bn0Var = this.f46563t0;
                if (bn0Var == null || bn0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void k0(int i7, boolean z10) {
        this.I = i7;
        this.J = z10;
        if (i7 > 0 && this.f46537a == 1) {
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
        if (this.f46545e0 != null) {
            if (this.f46538a0.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f46553l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.f46538a0;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f46545e0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.f46545e0.getEditText());
                }
                this.f46545e0.k(true);
                if (z10) {
                    this.f46538a0.setVisibility(0);
                    this.f46540b0.setVisibility(0);
                }
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z11) {
                    this.f46553l0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    k0 k0Var = this.f46540b0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f14));
                    k0 k0Var2 = this.f46540b0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, f15));
                    k0 k0Var3 = this.f46540b0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var3, property3, f16));
                    uv uvVar = this.f46542c0;
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(uvVar, property, f17));
                    uv uvVar2 = this.f46542c0;
                    if (z10) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(uvVar2, property2, f19));
                    uv uvVar3 = this.f46542c0;
                    if (!z10) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(uvVar3, property3, f20));
                    FrameLayout frameLayout2 = this.f46538a0;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f46543d0;
                    if (!z10) {
                        f18 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f46553l0.playTogether(arrayList);
                    this.f46553l0.setInterpolator(new DecelerateInterpolator());
                    this.f46553l0.setDuration(180L);
                    this.f46553l0.addListener(new c30(4, this, z10));
                    this.f46553l0.start();
                    return true;
                }
                k0 k0Var4 = this.f46540b0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                k0Var4.setScaleX(f10);
                k0 k0Var5 = this.f46540b0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                k0Var5.setScaleY(f11);
                k0 k0Var6 = this.f46540b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                k0Var6.setAlpha(f12);
                uv uvVar4 = this.f46542c0;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                uvVar4.setScaleX(f13);
                uv uvVar5 = this.f46542c0;
                if (z10) {
                    f19 = 1.0f;
                }
                uvVar5.setScaleY(f19);
                uv uvVar6 = this.f46542c0;
                if (!z10) {
                    f20 = 0.0f;
                }
                uvVar6.setAlpha(f20);
                FrameLayout frameLayout3 = this.f46538a0;
                if (z10) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f46543d0;
                if (!z10) {
                    f18 = org.telegram.messenger.g0.L(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z10) {
                    this.f46538a0.setVisibility(4);
                    this.f46540b0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        boolean z10;
        if (this.f46544e) {
            int childCount = this.L.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.L.getChildAt(i7);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.s5;
                org.telegram.messenger.ue ueVar = this.K;
                ArrayList arrayList = this.f46541c;
                if (z11) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i10 = -1;
                    if (ueVar != null) {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27158e.get(num.intValue());
                        if (this.f46544e) {
                            i10 = arrayList.indexOf(Integer.valueOf(efVar.C));
                        }
                        s5Var.setNum(i10);
                    } else {
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) this.f46546f.get(num.intValue());
                        if (this.f46544e) {
                            i10 = arrayList.indexOf(hfVar.B);
                        }
                        s5Var.setNum(i10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ef) ueVar.f27158e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i7Var.b(z10, false);
                }
            }
        }
    }

    public final void n0(int i7) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (this.f46539b.size() == 0) {
            this.f46542c0.setPivotX(0.0f);
            this.f46542c0.setPivotY(0.0f);
            if (i7 == 0) {
                z11 = false;
            }
            l0(false, z11);
            return;
        }
        this.f46542c0.invalidate();
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l0(true, z10) && i7 != 0) {
            this.f46542c0.setPivotX(org.telegram.messenger.g0.L(21.0f));
            this.f46542c0.setPivotY(org.telegram.messenger.g0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            uv uvVar = this.f46542c0;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i7 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uvVar, property, f10, 1.0f);
            uv uvVar2 = this.f46542c0;
            Property property2 = View.SCALE_Y;
            if (i7 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(uvVar2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f46542c0.setPivotX(0.0f);
        this.f46542c0.setPivotY(0.0f);
    }

    public final void o0() {
        String str;
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        if (!this.f46559r && (this.f46554n.size() <= 0 || ((str = this.f46566w) != null && !TextUtils.isEmpty(str)))) {
            this.O.e(false, true);
        } else {
            this.O.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.f46545e0;
        if (wtVar != null && wtVar.f41789e) {
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
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25190t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25190t);
        if (this.f46570y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f46570y, true);
            this.f46570y = 0;
        }
        org.telegram.ui.Components.wt wtVar = this.f46545e0;
        if (wtVar != null) {
            wtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.ck0 ck0Var = this.L;
        if (ck0Var == null) {
            return;
        }
        if (this.f46545e0.f41789e) {
            this.fragmentView.setTranslationY(f10);
            this.L.setTranslationY(0.0f);
            return;
        }
        ck0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.wt wtVar = this.f46545e0;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.Q;
        if (r0Var != null) {
            r0Var.G(true);
            if (!TextUtils.isEmpty(this.f46558q0)) {
                this.Q.Q(this.f46558q0, false);
                this.f46558q0 = null;
                g0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (z10 && (r0Var = this.Q) != null) {
            org.telegram.messenger.g0.I3(r0Var.getSearchField());
        }
    }
}
