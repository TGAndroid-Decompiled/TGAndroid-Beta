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
public final class lo0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final org.telegram.messenger.we J;
    public org.telegram.ui.Components.tk0 K;
    public fg.j L;
    public io0 M;
    public org.telegram.ui.Components.dw0 N;
    public oh.i O;
    public org.telegram.ui.ActionBar.t0 P;
    public org.telegram.ui.ActionBar.b1 Q;
    public int R;
    public boolean S;
    public final int T;
    public final un U;
    public org.telegram.ui.Components.xk0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int f39327a;
    public l0 f39328a0;
    public final HashMap f39329b;
    public do0 f39330b0;
    public final ArrayList f39331c;
    public View f39332c0;
    public CharSequence d;
    public org.telegram.ui.Components.wt f39333d0;
    public boolean e;
    public ImageView f39334e0;
    public final ArrayList f39335f;
    public ho0 f39336f0;
    public int f39337g0;
    public final HashMap h;
    public final TextPaint f39338h0;
    public final RectF f39339i0;
    public final Paint f39340j0;
    public AnimatorSet f39341k0;
    public boolean f39342l0;
    public org.telegram.ui.ActionBar.k1 m0;
    public final ArrayList f39343n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f39344n0;
    public org.telegram.ui.ActionBar.b1[] f39345o0;
    public String f39346p0;
    public boolean f39347q0;
    public boolean f39348r;
    public final boolean f39349r0;
    public boolean f39350s;
    public ko0 f39351s0;
    public mo0 f39352t0;
    public final int f39353u0;
    public final int f39354v0;
    public String f39355w;
    public final int f39356w0;
    public String f39357x;
    public final eo0 f39358x0;
    public int f39359y;

    public lo0(int i10, org.telegram.messenger.we weVar, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, un unVar, boolean z11) {
        super(null);
        this.f39335f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f39343n = new ArrayList();
        this.f39350s = true;
        this.I = true;
        this.R = 100;
        this.f39337g0 = 3;
        this.f39338h0 = new TextPaint(1);
        this.f39339i0 = new RectF();
        this.f39340j0 = new Paint(1);
        this.f39347q0 = true;
        this.f39358x0 = new eo0(this);
        this.J = weVar;
        this.f39329b = hashMap;
        this.f39331c = arrayList;
        this.f39327a = i10;
        this.T = i11;
        this.U = unVar;
        this.E = z10;
        this.f39349r0 = z11;
        if (weVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f39343n.add(string);
            }
        }
        if (z11) {
            this.f39353u0 = org.telegram.ui.ActionBar.t6.f21029ih;
            this.f39354v0 = org.telegram.ui.ActionBar.t6.Vg;
            this.f39356w0 = org.telegram.ui.ActionBar.t6.Wg;
            return;
        }
        this.f39353u0 = org.telegram.ui.ActionBar.t6.f21001h5;
        this.f39354v0 = org.telegram.ui.ActionBar.t6.f21037j5;
        this.f39356w0 = org.telegram.ui.ActionBar.t6.I5;
    }

    public static void Y(lo0 lo0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.vp.r1(lo0Var.currentAccount).V3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.vp.r1(lo0Var.currentAccount).P3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.hs.a0(lo0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = lo0Var.G;
        lo0Var.G = null;
        lo0Var.h0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.v5 Z(lo0 lo0Var, int i10) {
        int childCount = lo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lo0Var.K.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                org.telegram.messenger.we weVar = lo0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= lo0Var.f39335f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i10) {
                        return v5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int a0(lo0 lo0Var) {
        return lo0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20933da));
    }

    public final int c0(int i10, Object obj) {
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
        HashMap hashMap = this.f39329b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f39331c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.e) {
                l0();
            }
            if (i10 >= 0) {
                if (z10) {
                    ((org.telegram.messenger.ef) obj).e();
                } else if (obj instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj).e();
                }
                this.f39358x0.X(i10);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Y = false;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = this.f39353u0;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = this.f39354v0;
        org.telegram.ui.ActionBar.a7.m(lVar2, 5, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, this.f39356w0, null);
        this.actionBar.setBackButtonImage(2131231241);
        int i12 = this.f39327a;
        org.telegram.messenger.we weVar = this.J;
        if (weVar != null) {
            this.actionBar.setTitle(weVar.f19087c);
        } else if (i12 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131745778, null));
        } else if (i12 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131745781, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 15));
        if (this.f39342l0) {
            org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131231245);
            a2.setSubMenuDelegate(new fo0(this));
            this.Q = a2.e(1, 2131232207, org.telegram.messenger.cd.L0(2131745363, null));
            a2.e(2, 2131232264, org.telegram.messenger.cd.L0(2131747812, null));
        }
        if (weVar == null) {
            org.telegram.ui.ActionBar.t0 a10 = this.actionBar.p().a(0, 2131232485);
            a10.N();
            a10.H = new go0(this);
            this.P = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            org.telegram.ui.ActionBar.a7.V(searchField, i11, null);
            org.telegram.ui.ActionBar.a7.w(searchField, i11, null);
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, null);
        }
        if (weVar == null) {
            if (i12 == 0) {
                this.P.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745778, null));
            } else if (i12 == 1) {
                this.P.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745781, null));
            }
        }
        ho0 ho0Var = new ho0(this, context);
        this.f39336f0 = ho0Var;
        org.telegram.ui.ActionBar.a7.i(i10, ho0Var, null);
        this.fragmentView = this.f39336f0;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.K = tk0Var;
        tk0Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.tk0 tk0Var2 = this.K;
        ?? rVar = new s4.r(4);
        this.M = rVar;
        tk0Var2.setLayoutManager(rVar);
        this.M.O = new jg.h1(this, 9);
        this.f39336f0.addView(this.K, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.tk0 tk0Var3 = this.K;
        fg.j jVar = new fg.j(15, this, context);
        this.L = jVar;
        tk0Var3.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.K, i10, null);
        this.K.setOnItemClickListener(new g(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new co0(this, 2));
        }
        org.telegram.ui.Components.xk0 xk0Var = new org.telegram.ui.Components.xk0(new fo0(this));
        this.V = xk0Var;
        if (this.H != 1) {
            this.K.E.add(xk0Var);
        }
        oh.i iVar = new oh.i(1, context, getResourceProvider());
        this.O = iVar;
        iVar.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, this.O, 1, getResourceProvider());
        this.N = dw0Var;
        dw0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(this.N.d, org.telegram.ui.ActionBar.t6.f21311y6, getResourceProvider());
        this.N.addView(this.O, 0);
        if (weVar != null) {
            this.N.d.setText(org.telegram.messenger.cd.L0(2131748197, null));
        } else {
            this.N.d.setText(org.telegram.messenger.cd.L0(2131748185, null));
        }
        this.N.e(false, false);
        this.f39336f0.addView(this.N, w7.b6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new h3(this, 23));
        if (weVar == null) {
            n0();
        }
        if (this.f39347q0) {
            View view = new View(context);
            this.f39332c0 = view;
            view.setBackgroundResource(2131231239);
            this.f39332c0.setTranslationY(org.telegram.messenger.i0.L(48.0f));
            this.f39336f0.addView(this.f39332c0, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            org.telegram.ui.ActionBar.a7.i(i10, frameLayout, null);
            this.Z.setVisibility(4);
            this.Z.setTranslationY(org.telegram.messenger.i0.L(48.0f));
            this.f39336f0.addView(this.Z, w7.b6.e(-1, 48, 83));
            this.Z.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
            org.telegram.ui.Components.wt wtVar = this.f39333d0;
            if (wtVar != null) {
                wtVar.o();
            }
            this.f39333d0 = new org.telegram.ui.Components.wt(context, this.f39336f0, null, 1, false, null);
            this.f39333d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18915u3)});
            this.f39333d0.setHint(org.telegram.messenger.cd.L0(2131754454, null));
            this.f39333d0.s();
            org.telegram.ui.Components.mt editText = this.f39333d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.f39333d0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f39333d0.setText(charSequence);
            }
            this.f39333d0.getEditText().addTextChangedListener(new n0(this, 14));
            l0 l0Var = new l0(this, context, 19);
            this.f39328a0 = l0Var;
            l0Var.setFocusable(true);
            this.f39328a0.setFocusableInTouchMode(true);
            this.f39328a0.setVisibility(4);
            this.f39328a0.setScaleX(0.2f);
            this.f39328a0.setScaleY(0.2f);
            this.f39328a0.setAlpha(0.0f);
            this.f39336f0.addView(this.f39328a0, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f39334e0 = new ImageView(context);
            this.f39334e0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S5, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T5, false)));
            this.f39334e0.setImageResource(2131230876);
            this.f39334e0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.a7.t(this.f39334e0, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f39334e0.setScaleType(ImageView.ScaleType.CENTER);
            this.f39334e0.setOutlineProvider(new bi.d2(20));
            this.f39328a0.addView(this.f39334e0, w7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f39334e0.setOnClickListener(new f50(this, 19));
            this.f39334e0.setOnLongClickListener(new s(this, 4));
            TextPaint textPaint = this.f39338h0;
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            do0 do0Var = new do0(this, context, 0);
            this.f39330b0 = do0Var;
            do0Var.setAlpha(0.0f);
            this.f39330b0.setScaleX(0.2f);
            this.f39330b0.setScaleY(0.2f);
            this.f39336f0.addView(this.f39330b0, w7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.f39333d0.setVisibility(8);
            }
        }
        if ((weVar != null || i12 == 0 || i12 == 1) && this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.tk0 tk0Var4 = this.K;
        tk0Var4.W1 = true;
        tk0Var4.X1 = 0;
        m0(0);
        return this.fragmentView;
    }

    public final void d0() {
        this.f39343n.clear();
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        this.N.e(false, true);
        g0();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19690t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(View view, Object obj) {
        boolean z10;
        int i10 = 1;
        if (c0(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).b(this.f39331c.contains(Integer.valueOf(((org.telegram.messenger.ef) this.J.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z10) {
            i10 = 2;
        }
        m0(i10);
        this.f39351s0.y();
    }

    public final void f0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f39335f.clear();
        this.h.clear();
        this.f39350s = true;
        if (this.f39327a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0(obj, "", z10, true);
        this.f39355w = obj;
        if (obj.length() == 0) {
            this.f39355w = null;
            this.N.d.setText(org.telegram.messenger.cd.L0(2131748185, null));
        } else {
            this.N.d.setText(org.telegram.messenger.cd.a0("NoResultFoundFor", null, 2131748182, this.f39355w));
        }
        n0();
    }

    public final void g0() {
        SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f39343n.size());
        int size = this.f39343n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(i0.a.i(i10, "recent"), (String) this.f39343n.get(i10));
        }
        edit.commit();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39336f0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39353u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39353u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39354v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39354v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39356w0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39354v0));
        org.telegram.ui.ActionBar.t0 t0Var = this.P;
        if (t0Var != null) {
            editTextBoldCursor = t0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39354v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f39353u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X9));
        return arrayList;
    }

    public final void h0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f39348r) {
            this.f39348r = false;
            if (this.f39359y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39359y, true);
                this.f39359y = 0;
            }
        }
        this.G = str;
        this.f39348r = true;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.currentAccount);
        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(this.currentAccount);
        if (z10) {
            str3 = r13.M3;
        } else {
            str3 = r13.N3;
        }
        TLObject e22 = r12.e2(str3);
        if (!(e22 instanceof TLRPC.User)) {
            if (z11 && !this.F) {
                this.F = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(this.currentAccount);
                if (z10) {
                    str5 = r14.M3;
                } else {
                    str5 = r14.N3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.voip.u0(9, this, z10));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) e22;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.vp.r1(this.currentAccount).p1(user);
        tL_messages_getInlineBotResults.offset = str2;
        un unVar = this.U;
        if (unVar != null) {
            long a2 = unVar.a();
            if (org.telegram.messenger.o5.C(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().i1(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.D + 1;
        this.D = i10;
        this.f39359y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.ln(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f39359y, this.classGuid);
    }

    public final void i0(int i10, boolean z10) {
        HashMap hashMap = this.f39329b;
        if (!hashMap.isEmpty() && this.f39351s0 != null && !this.S) {
            org.telegram.ui.Components.wt wtVar = this.f39333d0;
            if (wtVar != null && wtVar.f32239a.length() > 0) {
                Object obj = hashMap.get(this.f39331c.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj).f19506a = this.f39333d0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj).I = this.f39333d0.getText().toString();
                }
            }
            this.S = true;
            this.f39351s0.u0(i10, false, z10);
            if (this.T != 2) {
                ko0 ko0Var = this.f39351s0;
                if (ko0Var == null || ko0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i10, boolean z10) {
        this.H = i10;
        this.I = z10;
        if (i10 > 0 && this.f39327a == 1) {
            this.H = 1;
        }
    }

    public final boolean k0(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float L;
        float f13;
        float f14;
        float f15;
        float f16;
        float L2;
        if (this.f39333d0 != null) {
            if (this.Z.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f39341k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.Z;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f39333d0.getEditText().isFocused()) {
                    org.telegram.messenger.i0.v1(this.f39333d0.getEditText());
                }
                this.f39333d0.k(true);
                if (z10) {
                    this.Z.setVisibility(0);
                    this.f39328a0.setVisibility(0);
                }
                float f17 = 0.0f;
                float f18 = 0.2f;
                float f19 = 1.0f;
                if (z11) {
                    this.f39341k0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    l0 l0Var = this.f39328a0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property, f13));
                    l0 l0Var2 = this.f39328a0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, f14));
                    l0 l0Var3 = this.f39328a0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var3, property3, f15));
                    do0 do0Var = this.f39330b0;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(do0Var, property, f16));
                    do0 do0Var2 = this.f39330b0;
                    if (z10) {
                        f18 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(do0Var2, property2, f18));
                    do0 do0Var3 = this.f39330b0;
                    if (!z10) {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(do0Var3, property3, f19));
                    FrameLayout frameLayout2 = this.Z;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.i0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f39332c0;
                    if (!z10) {
                        f17 = org.telegram.messenger.i0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f17));
                    this.f39341k0.playTogether(arrayList);
                    this.f39341k0.setInterpolator(new DecelerateInterpolator());
                    this.f39341k0.setDuration(180L);
                    this.f39341k0.addListener(new org.telegram.ui.Components.ha0(19, this, z10));
                    this.f39341k0.start();
                    return true;
                }
                l0 l0Var4 = this.f39328a0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                l0Var4.setScaleX(f7);
                l0 l0Var5 = this.f39328a0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                l0Var5.setScaleY(f10);
                l0 l0Var6 = this.f39328a0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                l0Var6.setAlpha(f11);
                do0 do0Var4 = this.f39330b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.2f;
                }
                do0Var4.setScaleX(f12);
                do0 do0Var5 = this.f39330b0;
                if (z10) {
                    f18 = 1.0f;
                }
                do0Var5.setScaleY(f18);
                do0 do0Var6 = this.f39330b0;
                if (!z10) {
                    f19 = 0.0f;
                }
                do0Var6.setAlpha(f19);
                FrameLayout frameLayout3 = this.Z;
                if (z10) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f39332c0;
                if (!z10) {
                    f17 = org.telegram.messenger.i0.L(48.0f);
                }
                view2.setTranslationY(f17);
                if (!z10) {
                    this.Z.setVisibility(4);
                    this.f39328a0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        boolean z10;
        if (this.e) {
            int childCount = this.K.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.K.getChildAt(i10);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.v5;
                org.telegram.messenger.we weVar = this.J;
                ArrayList arrayList = this.f39331c;
                if (z11) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i11 = -1;
                    if (weVar != null) {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) weVar.e.get(num.intValue());
                        if (this.e) {
                            i11 = arrayList.indexOf(Integer.valueOf(efVar.C));
                        }
                        v5Var.setNum(i11);
                    } else {
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) this.f39335f.get(num.intValue());
                        if (this.e) {
                            i11 = arrayList.indexOf(hfVar.B);
                        }
                        v5Var.setNum(i11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ef) weVar.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l7Var.b(z10, false);
                }
            }
        }
    }

    public final void m0(int i10) {
        boolean z10;
        float f7;
        boolean z11 = true;
        if (this.f39329b.size() == 0) {
            this.f39330b0.setPivotX(0.0f);
            this.f39330b0.setPivotY(0.0f);
            if (i10 == 0) {
                z11 = false;
            }
            k0(false, z11);
            return;
        }
        this.f39330b0.invalidate();
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!k0(true, z10) && i10 != 0) {
            this.f39330b0.setPivotX(org.telegram.messenger.i0.L(21.0f));
            this.f39330b0.setPivotY(org.telegram.messenger.i0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            do0 do0Var = this.f39330b0;
            Property property = View.SCALE_X;
            float f10 = 0.9f;
            if (i10 == 1) {
                f7 = 1.1f;
            } else {
                f7 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(do0Var, property, f7, 1.0f);
            do0 do0Var2 = this.f39330b0;
            Property property2 = View.SCALE_Y;
            if (i10 == 1) {
                f10 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(do0Var2, property2, f10, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f39330b0.setPivotX(0.0f);
        this.f39330b0.setPivotY(0.0f);
    }

    public final void n0() {
        String str;
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        if (!this.f39348r && (this.f39343n.size() <= 0 || ((str = this.f39355w) != null && !TextUtils.isEmpty(str)))) {
            this.N.e(false, true);
        } else {
            this.N.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.f39333d0;
        if (wtVar != null && wtVar.e) {
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
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19690t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19690t);
        if (this.f39359y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39359y, true);
            this.f39359y = 0;
        }
        org.telegram.ui.Components.wt wtVar = this.f39333d0;
        if (wtVar != null) {
            wtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        org.telegram.ui.Components.tk0 tk0Var = this.K;
        if (tk0Var == null) {
            return;
        }
        if (this.f39333d0.e) {
            this.fragmentView.setTranslationY(f7);
            this.K.setTranslationY(0.0f);
            return;
        }
        tk0Var.setTranslationY(f7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        org.telegram.ui.Components.wt wtVar = this.f39333d0;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.P;
        if (t0Var != null) {
            t0Var.F(true);
            if (!TextUtils.isEmpty(this.f39346p0)) {
                this.P.P(this.f39346p0, false);
                this.f39346p0 = null;
                f0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.t0 t0Var;
        if (z10 && (t0Var = this.P) != null) {
            org.telegram.messenger.i0.J3(t0Var.getSearchField());
        }
    }
}
