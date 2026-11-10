package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class pm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final boolean D;
    public final boolean E;
    public final cn F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.g1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.z0[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.kt M;
    public k0 N;
    public ImageView O;
    public nm0 P;
    public o00 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public om0 V;
    public CharSequence f48793a;
    public final HashMap f48794b;
    public final ArrayList f48795c;
    public ArrayList d;
    public boolean f48796e;
    public int f48797f;
    public org.telegram.ui.Components.pj0 h;
    public l4 f48798n;
    public FrameLayout f48799r;
    public TextView f48800s;
    public boolean f48801w;
    public final int f48802x;
    public boolean f48803y;

    public pm0(int i7, boolean z9, boolean z10, cn cnVar) {
        super(null);
        this.f48794b = new HashMap();
        this.f48795c = new ArrayList();
        this.d = null;
        this.f48796e = false;
        this.f48797f = 2;
        this.f48803y = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = cnVar;
        this.f48802x = i7;
        this.D = z9;
        this.E = z10;
    }

    public static void Z(pm0 pm0Var, org.telegram.messenger.we weVar) {
        if (weVar != null) {
            an0 an0Var = new an0(0, weVar, pm0Var.f48794b, pm0Var.f48795c, pm0Var.f48802x, pm0Var.E, pm0Var.F, false);
            Editable text = pm0Var.M.getText();
            pm0Var.f48793a = text;
            an0Var.d = text;
            org.telegram.ui.Components.kt ktVar = an0Var.f43754d0;
            if (ktVar != null) {
                ktVar.setText(text);
            }
            an0Var.f43773s0 = new f(pm0Var, 29);
            an0Var.k0(pm0Var.G, pm0Var.H);
            pm0Var.presentFragment(an0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (pm0Var.D) {
            dn0 dn0Var = new dn0(hashMap, arrayList, pm0Var.f48802x, pm0Var.E, pm0Var.F);
            Editable text2 = pm0Var.M.getText();
            pm0Var.f48793a = text2;
            an0 an0Var2 = dn0Var.f45014a;
            if (an0Var2 != null) {
                an0Var2.d = text2;
                org.telegram.ui.Components.kt ktVar2 = an0Var2.f43754d0;
                if (ktVar2 != null) {
                    ktVar2.setText(text2);
                }
            }
            mm0 mm0Var = new mm0(pm0Var, hashMap, arrayList, 1);
            an0 an0Var3 = dn0Var.f45014a;
            an0Var3.f43773s0 = mm0Var;
            an0 an0Var4 = dn0Var.f45015b;
            an0Var4.f43773s0 = mm0Var;
            an0Var3.f43774t0 = new bn0(dn0Var, 1);
            an0Var4.f43774t0 = new bn0(dn0Var, 2);
            int i7 = pm0Var.G;
            boolean z9 = pm0Var.H;
            an0Var3.k0(i7, z9);
            dn0Var.f45015b.k0(i7, z9);
            pm0Var.presentFragment(dn0Var);
            return;
        }
        an0 an0Var5 = new an0(0, weVar, hashMap, arrayList, pm0Var.f48802x, pm0Var.E, pm0Var.F, false);
        Editable text3 = pm0Var.M.getText();
        pm0Var.f48793a = text3;
        an0Var5.d = text3;
        org.telegram.ui.Components.kt ktVar3 = an0Var5.f43754d0;
        if (ktVar3 != null) {
            ktVar3.setText(text3);
        }
        an0Var5.f43773s0 = new mm0(pm0Var, hashMap, arrayList, 0);
        an0Var5.k0(pm0Var.G, pm0Var.H);
        pm0Var.presentFragment(an0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z9, int i7) {
        if (!hashMap.isEmpty() && this.V != null && !this.f48801w) {
            this.f48801w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    String str2 = gfVar.h;
                    if (str2 != null) {
                        obj2.f22516c = str2;
                    } else {
                        obj2.f22516c = gfVar.I;
                    }
                    obj2.f22517e = gfVar.f26850c;
                    obj2.f22518f = gfVar.f26853g;
                    obj2.f22522k = gfVar.f26864s;
                    obj2.f22526o = gfVar.f26849b;
                    CharSequence charSequence = gfVar.f26848a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22520i = gfVar.f26859n;
                    obj2.f22521j = gfVar.f26863r;
                    obj2.h = gfVar.f26868x;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22516c = str3;
                    } else {
                        obj2.f22523l = kfVar;
                    }
                    obj2.f22517e = kfVar.f26850c;
                    obj2.f22518f = kfVar.f26853g;
                    obj2.f22522k = kfVar.f26864s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22520i = kfVar.f26859n;
                    obj2.f22521j = kfVar.f26863r;
                    obj2.h = kfVar.f26868x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22524m = botInlineResult;
                        obj2.f22525n = kfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.V.c(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27894da));
    }

    public final void b0(boolean z9) {
        boolean z10;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float L;
        if (this.L.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(this.M.getEditText());
        }
        this.M.k(true);
        if (z9) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        k0 k0Var = this.N;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        k0Var.setScaleX(f10);
        k0 k0Var2 = this.N;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        k0Var2.setScaleY(f11);
        k0 k0Var3 = this.N;
        float f16 = 0.0f;
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        k0Var3.setAlpha(f12);
        o00 o00Var = this.Q;
        if (z9) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        o00Var.setScaleX(f13);
        o00 o00Var2 = this.Q;
        if (z9) {
            f14 = 1.0f;
        }
        o00Var2.setScaleY(f14);
        o00 o00Var3 = this.Q;
        if (!z9) {
            f15 = 0.0f;
        }
        o00Var3.setAlpha(f15);
        FrameLayout frameLayout2 = this.L;
        if (z9) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(48.0f);
        }
        frameLayout2.setTranslationY(L);
        View view = this.R;
        if (!z9) {
            f16 = org.telegram.messenger.g0.L(48.0f);
        }
        view.setTranslationY(f16);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        org.telegram.ui.ActionBar.t6.h(i7, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.l(lVar2, 5, i10, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new xx(this, 22));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.f48803y) {
            s5.a(2, 2131232486).setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        }
        org.telegram.ui.ActionBar.r0 a10 = s5.a(0, 2131231244);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        a10.e(1, 2131232265, org.telegram.messenger.id.M0(2131747796, null));
        nm0 nm0Var = new nm0(this, context);
        this.P = nm0Var;
        org.telegram.ui.ActionBar.t6.h(i7, nm0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750484, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.h = pj0Var;
        pj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.pj0 pj0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.f48798n = l4Var;
        pj0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.t6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.f48800s = textView;
        textView.setTextColor(-8355712);
        this.f48800s.setTextSize(1, 20.0f);
        this.f48800s.setGravity(17);
        this.f48800s.setVisibility(8);
        this.f48800s.setText(org.telegram.messenger.id.M0(2131748180, null));
        this.P.addView(this.f48800s, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f48800s.setOnTouchListener(new ei.b(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48799r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f48799r, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f48799r.addView(radialProgressView, c8.ha.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(2131231238);
        this.R.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.P.addView(this.R, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.P.addView(this.L, c8.ha.e(-1, 48, 83));
        this.L.setOnTouchListener(new ei.b(2));
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null) {
            ktVar.o();
        }
        this.M = new org.telegram.ui.Components.kt(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).H0())});
        this.M.setHint(org.telegram.messenger.id.M0(2131754454, null));
        org.telegram.ui.Components.ys editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f48793a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        k0 k0Var = new k0(17, context, this);
        this.N = k0Var;
        k0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S5, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T5, false)));
        this.O.setImageResource(2131230876);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.s(this.O, org.telegram.ui.ActionBar.m6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bg.q0(19));
        this.N.addView(this.O, c8.ha.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new j40(this, 18));
        this.O.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        o00 o00Var = new o00(3, context, this);
        this.Q = o00Var;
        o00Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f48802x != 0) {
            this.M.setVisibility(8);
        }
        if (this.f48796e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f48799r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f48799r.setVisibility(8);
            this.h.setEmptyView(this.f48800s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25070r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f48802x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f48803y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f48799r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.pj0 pj0Var = this.h;
                if (pj0Var != null && pj0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f48800s);
                }
                l4 l4Var = this.f48798n;
                if (l4Var != null) {
                    l4Var.f();
                }
                this.f48796e = false;
            }
        } else if (i7 == org.telegram.messenger.qs.f25080t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null && ktVar.f35436e) {
            if (z9) {
                ktVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = this.f48802x;
        boolean z9 = true;
        if (i7 != 1 && i7 != 2 && i7 != 10 && this.f48803y) {
            this.d = MediaController.f21250b2;
        } else {
            this.d = MediaController.f21251c2;
        }
        if (this.d != null) {
            z9 = false;
        }
        this.f48796e = z9;
        MediaController.O(this.classGuid);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25070r2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25080t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null) {
            ktVar.o();
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25070r2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25080t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f48798n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null) {
            ktVar.s();
        }
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
