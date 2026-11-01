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
public final class jo0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final org.telegram.messenger.xe J;
    public org.telegram.ui.Components.uk0 K;
    public fg.j L;
    public go0 M;
    public org.telegram.ui.Components.ew0 N;
    public oh.i O;
    public org.telegram.ui.ActionBar.t0 P;
    public org.telegram.ui.ActionBar.b1 Q;
    public int R;
    public boolean S;
    public final int T;
    public final un U;
    public org.telegram.ui.Components.yk0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int f38482a;
    public l0 f38483a0;
    public final HashMap f38484b;
    public bo0 f38485b0;
    public final ArrayList f38486c;
    public View f38487c0;
    public CharSequence d;
    public org.telegram.ui.Components.wt f38488d0;
    public boolean e;
    public ImageView f38489e0;
    public final ArrayList f38490f;
    public fo0 f38491f0;
    public int f38492g0;
    public final HashMap h;
    public final TextPaint f38493h0;
    public final RectF f38494i0;
    public final Paint f38495j0;
    public AnimatorSet f38496k0;
    public boolean f38497l0;
    public org.telegram.ui.ActionBar.k1 m0;
    public final ArrayList f38498n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f38499n0;
    public org.telegram.ui.ActionBar.b1[] f38500o0;
    public String f38501p0;
    public boolean f38502q0;
    public boolean f38503r;
    public final boolean f38504r0;
    public boolean f38505s;
    public io0 f38506s0;
    public ko0 f38507t0;
    public final int f38508u0;
    public final int f38509v0;
    public String f38510w;
    public final int f38511w0;
    public String f38512x;
    public final co0 f38513x0;
    public int f38514y;

    public jo0(int i10, org.telegram.messenger.xe xeVar, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, un unVar, boolean z11) {
        super(null);
        this.f38490f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f38498n = new ArrayList();
        this.f38505s = true;
        this.I = true;
        this.R = 100;
        this.f38492g0 = 3;
        this.f38493h0 = new TextPaint(1);
        this.f38494i0 = new RectF();
        this.f38495j0 = new Paint(1);
        this.f38502q0 = true;
        this.f38513x0 = new co0(this);
        this.J = xeVar;
        this.f38484b = hashMap;
        this.f38486c = arrayList;
        this.f38482a = i10;
        this.T = i11;
        this.U = unVar;
        this.E = z10;
        this.f38504r0 = z11;
        if (xeVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f38498n.add(string);
            }
        }
        if (z11) {
            this.f38508u0 = org.telegram.ui.ActionBar.t6.f21030ih;
            this.f38509v0 = org.telegram.ui.ActionBar.t6.Vg;
            this.f38511w0 = org.telegram.ui.ActionBar.t6.Wg;
            return;
        }
        this.f38508u0 = org.telegram.ui.ActionBar.t6.f21002h5;
        this.f38509v0 = org.telegram.ui.ActionBar.t6.f21038j5;
        this.f38511w0 = org.telegram.ui.ActionBar.t6.I5;
    }

    public static void Z(jo0 jo0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.wp.r1(jo0Var.currentAccount).V3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.wp.r1(jo0Var.currentAccount).P3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.is.a0(jo0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = jo0Var.G;
        jo0Var.G = null;
        jo0Var.i0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.v5 a0(jo0 jo0Var, int i10) {
        int childCount = jo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jo0Var.K.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                org.telegram.messenger.xe xeVar = jo0Var.J;
                if (xeVar == null ? !(intValue < 0 || intValue >= jo0Var.f38490f.size()) : !(intValue < 0 || intValue >= xeVar.e.size())) {
                    if (intValue == i10) {
                        return v5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int b0(jo0 jo0Var) {
        return jo0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20934da));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Y = false;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = this.f38508u0;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = this.f38509v0;
        org.telegram.ui.ActionBar.a7.m(lVar2, 5, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, this.f38511w0, null);
        this.actionBar.setBackButtonImage(2131231241);
        int i12 = this.f38482a;
        org.telegram.messenger.xe xeVar = this.J;
        if (xeVar != null) {
            this.actionBar.setTitle(xeVar.f19430c);
        } else if (i12 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131745778, null));
        } else if (i12 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131745781, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 15));
        if (this.f38497l0) {
            org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131231245);
            a2.setSubMenuDelegate(new do0(this));
            this.Q = a2.e(1, 2131232207, org.telegram.messenger.dd.L0(2131745363, null));
            a2.e(2, 2131232264, org.telegram.messenger.dd.L0(2131747812, null));
        }
        if (xeVar == null) {
            org.telegram.ui.ActionBar.t0 a10 = this.actionBar.p().a(0, 2131232485);
            a10.N();
            a10.H = new eo0(this);
            this.P = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            org.telegram.ui.ActionBar.a7.V(searchField, i11, null);
            org.telegram.ui.ActionBar.a7.w(searchField, i11, null);
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, null);
        }
        if (xeVar == null) {
            if (i12 == 0) {
                this.P.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745778, null));
            } else if (i12 == 1) {
                this.P.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745781, null));
            }
        }
        fo0 fo0Var = new fo0(this, context);
        this.f38491f0 = fo0Var;
        org.telegram.ui.ActionBar.a7.i(i10, fo0Var, null);
        this.fragmentView = this.f38491f0;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.K = uk0Var;
        uk0Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.uk0 uk0Var2 = this.K;
        ?? rVar = new s4.r(4);
        this.M = rVar;
        uk0Var2.setLayoutManager(rVar);
        this.M.O = new jg.h1(this, 9);
        this.f38491f0.addView(this.K, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.uk0 uk0Var3 = this.K;
        fg.j jVar = new fg.j(15, this, context);
        this.L = jVar;
        uk0Var3.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.K, i10, null);
        this.K.setOnItemClickListener(new g(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new ao0(this, 2));
        }
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(new do0(this));
        this.V = yk0Var;
        if (this.H != 1) {
            this.K.E.add(yk0Var);
        }
        oh.i iVar = new oh.i(1, context, getResourceProvider());
        this.O = iVar;
        iVar.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, this.O, 1, getResourceProvider());
        this.N = ew0Var;
        ew0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(this.N.d, org.telegram.ui.ActionBar.t6.f21312y6, getResourceProvider());
        this.N.addView(this.O, 0);
        if (xeVar != null) {
            this.N.d.setText(org.telegram.messenger.dd.L0(2131748197, null));
        } else {
            this.N.d.setText(org.telegram.messenger.dd.L0(2131748185, null));
        }
        this.N.e(false, false);
        this.f38491f0.addView(this.N, w7.b6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new h3(this, 23));
        if (xeVar == null) {
            o0();
        }
        if (this.f38502q0) {
            View view = new View(context);
            this.f38487c0 = view;
            view.setBackgroundResource(2131231239);
            this.f38487c0.setTranslationY(org.telegram.messenger.i0.L(48.0f));
            this.f38491f0.addView(this.f38487c0, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            org.telegram.ui.ActionBar.a7.i(i10, frameLayout, null);
            this.Z.setVisibility(4);
            this.Z.setTranslationY(org.telegram.messenger.i0.L(48.0f));
            this.f38491f0.addView(this.Z, w7.b6.e(-1, 48, 83));
            this.Z.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
            org.telegram.ui.Components.wt wtVar = this.f38488d0;
            if (wtVar != null) {
                wtVar.o();
            }
            this.f38488d0 = new org.telegram.ui.Components.wt(context, this.f38491f0, null, 1, false, null);
            this.f38488d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19258u3)});
            this.f38488d0.setHint(org.telegram.messenger.dd.L0(2131754454, null));
            this.f38488d0.s();
            org.telegram.ui.Components.mt editText = this.f38488d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.f38488d0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f38488d0.setText(charSequence);
            }
            this.f38488d0.getEditText().addTextChangedListener(new n0(this, 14));
            l0 l0Var = new l0(this, context, 19);
            this.f38483a0 = l0Var;
            l0Var.setFocusable(true);
            this.f38483a0.setFocusableInTouchMode(true);
            this.f38483a0.setVisibility(4);
            this.f38483a0.setScaleX(0.2f);
            this.f38483a0.setScaleY(0.2f);
            this.f38483a0.setAlpha(0.0f);
            this.f38491f0.addView(this.f38483a0, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f38489e0 = new ImageView(context);
            this.f38489e0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S5, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T5, false)));
            this.f38489e0.setImageResource(2131230876);
            this.f38489e0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.a7.t(this.f38489e0, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f38489e0.setScaleType(ImageView.ScaleType.CENTER);
            this.f38489e0.setOutlineProvider(new bi.d2(20));
            this.f38483a0.addView(this.f38489e0, w7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f38489e0.setOnClickListener(new e50(this, 19));
            this.f38489e0.setOnLongClickListener(new s(this, 4));
            TextPaint textPaint = this.f38493h0;
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            bo0 bo0Var = new bo0(this, context, 0);
            this.f38485b0 = bo0Var;
            bo0Var.setAlpha(0.0f);
            this.f38485b0.setScaleX(0.2f);
            this.f38485b0.setScaleY(0.2f);
            this.f38491f0.addView(this.f38485b0, w7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.f38488d0.setVisibility(8);
            }
        }
        if ((xeVar != null || i12 == 0 || i12 == 1) && this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.uk0 uk0Var4 = this.K;
        uk0Var4.W1 = true;
        uk0Var4.X1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i10, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof org.telegram.messenger.ff;
        if (z10) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        } else if (obj instanceof org.telegram.messenger.jf) {
            obj2 = ((org.telegram.messenger.jf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f38484b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f38486c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.e) {
                m0();
            }
            if (i10 >= 0) {
                if (z10) {
                    ((org.telegram.messenger.ff) obj).e();
                } else if (obj instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj).e();
                }
                this.f38513x0.X(i10);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14786t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.f38498n.clear();
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        this.N.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z10;
        int i10 = 1;
        if (d0(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).b(this.f38486c.contains(Integer.valueOf(((org.telegram.messenger.ff) this.J.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z10) {
            i10 = 2;
        }
        n0(i10);
        this.f38506s0.y();
    }

    public final void g0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f38490f.clear();
        this.h.clear();
        this.f38505s = true;
        if (this.f38482a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(obj, "", z10, true);
        this.f38510w = obj;
        if (obj.length() == 0) {
            this.f38510w = null;
            this.N.d.setText(org.telegram.messenger.dd.L0(2131748185, null));
        } else {
            this.N.d.setText(org.telegram.messenger.dd.a0("NoResultFoundFor", null, 2131748182, this.f38510w));
        }
        o0();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38491f0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38508u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38508u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38509v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38509v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38511w0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38509v0));
        org.telegram.ui.ActionBar.t0 t0Var = this.P;
        if (t0Var != null) {
            editTextBoldCursor = t0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38509v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f38508u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.w0.f18945b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f38498n.size());
        int size = this.f38498n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(i0.a.i(i10, "recent"), (String) this.f38498n.get(i10));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f38503r) {
            this.f38503r = false;
            if (this.f38514y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38514y, true);
                this.f38514y = 0;
            }
        }
        this.G = str;
        this.f38503r = true;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.currentAccount);
        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(this.currentAccount);
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
                org.telegram.messenger.wp r14 = org.telegram.messenger.wp.r1(this.currentAccount);
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
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.wp.r1(this.currentAccount).p1(user);
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
        this.f38514y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.mn(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f38514y, this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i10, boolean z10) {
        HashMap hashMap = this.f38484b;
        if (!hashMap.isEmpty() && this.f38506s0 != null && !this.S) {
            org.telegram.ui.Components.wt wtVar = this.f38488d0;
            if (wtVar != null && wtVar.f32308a.length() > 0) {
                Object obj = hashMap.get(this.f38486c.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    ((org.telegram.messenger.ff) obj).f14602a = this.f38488d0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj).I = this.f38488d0.getText().toString();
                }
            }
            this.S = true;
            this.f38506s0.u0(i10, false, z10);
            if (this.T != 2) {
                io0 io0Var = this.f38506s0;
                if (io0Var == null || io0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void k0(int i10, boolean z10) {
        this.H = i10;
        this.I = z10;
        if (i10 > 0 && this.f38482a == 1) {
            this.H = 1;
        }
    }

    public final boolean l0(boolean z10, boolean z11) {
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
        if (this.f38488d0 != null) {
            if (this.Z.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f38496k0;
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
                if (this.f38488d0.getEditText().isFocused()) {
                    org.telegram.messenger.i0.v1(this.f38488d0.getEditText());
                }
                this.f38488d0.k(true);
                if (z10) {
                    this.Z.setVisibility(0);
                    this.f38483a0.setVisibility(0);
                }
                float f17 = 0.0f;
                float f18 = 0.2f;
                float f19 = 1.0f;
                if (z11) {
                    this.f38496k0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    l0 l0Var = this.f38483a0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property, f13));
                    l0 l0Var2 = this.f38483a0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, f14));
                    l0 l0Var3 = this.f38483a0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var3, property3, f15));
                    bo0 bo0Var = this.f38485b0;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(bo0Var, property, f16));
                    bo0 bo0Var2 = this.f38485b0;
                    if (z10) {
                        f18 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(bo0Var2, property2, f18));
                    bo0 bo0Var3 = this.f38485b0;
                    if (!z10) {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(bo0Var3, property3, f19));
                    FrameLayout frameLayout2 = this.Z;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.i0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f38487c0;
                    if (!z10) {
                        f17 = org.telegram.messenger.i0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f17));
                    this.f38496k0.playTogether(arrayList);
                    this.f38496k0.setInterpolator(new DecelerateInterpolator());
                    this.f38496k0.setDuration(180L);
                    this.f38496k0.addListener(new org.telegram.ui.Components.ha0(19, this, z10));
                    this.f38496k0.start();
                    return true;
                }
                l0 l0Var4 = this.f38483a0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                l0Var4.setScaleX(f7);
                l0 l0Var5 = this.f38483a0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                l0Var5.setScaleY(f10);
                l0 l0Var6 = this.f38483a0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                l0Var6.setAlpha(f11);
                bo0 bo0Var4 = this.f38485b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.2f;
                }
                bo0Var4.setScaleX(f12);
                bo0 bo0Var5 = this.f38485b0;
                if (z10) {
                    f18 = 1.0f;
                }
                bo0Var5.setScaleY(f18);
                bo0 bo0Var6 = this.f38485b0;
                if (!z10) {
                    f19 = 0.0f;
                }
                bo0Var6.setAlpha(f19);
                FrameLayout frameLayout3 = this.Z;
                if (z10) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f38487c0;
                if (!z10) {
                    f17 = org.telegram.messenger.i0.L(48.0f);
                }
                view2.setTranslationY(f17);
                if (!z10) {
                    this.Z.setVisibility(4);
                    this.f38483a0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        boolean z10;
        if (this.e) {
            int childCount = this.K.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.K.getChildAt(i10);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.v5;
                org.telegram.messenger.xe xeVar = this.J;
                ArrayList arrayList = this.f38486c;
                if (z11) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i11 = -1;
                    if (xeVar != null) {
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) xeVar.e.get(num.intValue());
                        if (this.e) {
                            i11 = arrayList.indexOf(Integer.valueOf(ffVar.C));
                        }
                        v5Var.setNum(i11);
                    } else {
                        org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) this.f38490f.get(num.intValue());
                        if (this.e) {
                            i11 = arrayList.indexOf(jfVar.B);
                        }
                        v5Var.setNum(i11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ff) xeVar.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l7Var.b(z10, false);
                }
            }
        }
    }

    public final void n0(int i10) {
        boolean z10;
        float f7;
        boolean z11 = true;
        if (this.f38484b.size() == 0) {
            this.f38485b0.setPivotX(0.0f);
            this.f38485b0.setPivotY(0.0f);
            if (i10 == 0) {
                z11 = false;
            }
            l0(false, z11);
            return;
        }
        this.f38485b0.invalidate();
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l0(true, z10) && i10 != 0) {
            this.f38485b0.setPivotX(org.telegram.messenger.i0.L(21.0f));
            this.f38485b0.setPivotY(org.telegram.messenger.i0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            bo0 bo0Var = this.f38485b0;
            Property property = View.SCALE_X;
            float f10 = 0.9f;
            if (i10 == 1) {
                f7 = 1.1f;
            } else {
                f7 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bo0Var, property, f7, 1.0f);
            bo0 bo0Var2 = this.f38485b0;
            Property property2 = View.SCALE_Y;
            if (i10 == 1) {
                f10 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(bo0Var2, property2, f10, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f38485b0.setPivotX(0.0f);
        this.f38485b0.setPivotY(0.0f);
    }

    public final void o0() {
        String str;
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        if (!this.f38503r && (this.f38498n.size() <= 0 || ((str = this.f38510w) != null && !TextUtils.isEmpty(str)))) {
            this.N.e(false, true);
        } else {
            this.N.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.f38488d0;
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
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14786t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14786t);
        if (this.f38514y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38514y, true);
            this.f38514y = 0;
        }
        org.telegram.ui.Components.wt wtVar = this.f38488d0;
        if (wtVar != null) {
            wtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        org.telegram.ui.Components.uk0 uk0Var = this.K;
        if (uk0Var == null) {
            return;
        }
        if (this.f38488d0.e) {
            this.fragmentView.setTranslationY(f7);
            this.K.setTranslationY(0.0f);
            return;
        }
        uk0Var.setTranslationY(f7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        org.telegram.ui.Components.wt wtVar = this.f38488d0;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.P;
        if (t0Var != null) {
            t0Var.F(true);
            if (!TextUtils.isEmpty(this.f38501p0)) {
                this.P.P(this.f38501p0, false);
                this.f38501p0 = null;
                g0(this.P.getSearchField());
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
