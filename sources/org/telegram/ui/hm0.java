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
public final class hm0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public final boolean E;
    public final boolean F;
    public final wm G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.f1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.y0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.jt N;
    public l0 O;
    public ImageView P;
    public fm0 Q;
    public org.telegram.ui.Components.voip.r0 R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public gm0 W;
    public CharSequence f45935a;
    public final HashMap f45936b;
    public final ArrayList f45937c;
    public ArrayList d;
    public boolean f45938e;
    public int f45939f;
    public org.telegram.ui.Components.tj0 h;
    public n4 f45940n;
    public FrameLayout f45941r;
    public TextView f45942s;
    public boolean f45943w;
    public final int f45944x;
    public boolean f45945y;

    public hm0(int i3, boolean z10, boolean z11, wm wmVar) {
        super(null);
        this.f45936b = new HashMap();
        this.f45937c = new ArrayList();
        this.d = null;
        this.f45938e = false;
        this.f45939f = 2;
        this.f45945y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = wmVar;
        this.f45944x = i3;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(hm0 hm0Var, org.telegram.messenger.pe peVar) {
        if (peVar != null) {
            sm0 sm0Var = new sm0(0, peVar, hm0Var.f45936b, hm0Var.f45937c, hm0Var.f45944x, hm0Var.F, hm0Var.G, false);
            Editable text = hm0Var.N.getText();
            hm0Var.f45935a = text;
            sm0Var.d = text;
            org.telegram.ui.Components.jt jtVar = sm0Var.f49546e0;
            if (jtVar != null) {
                jtVar.setText(text);
            }
            sm0Var.f49564t0 = new f(hm0Var, 29);
            sm0Var.k0(hm0Var.H, hm0Var.I);
            hm0Var.presentFragment(sm0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (hm0Var.E) {
            vm0 vm0Var = new vm0(hashMap, arrayList, hm0Var.f45944x, hm0Var.F, hm0Var.G);
            Editable text2 = hm0Var.N.getText();
            hm0Var.f45935a = text2;
            sm0 sm0Var2 = vm0Var.f50553a;
            if (sm0Var2 != null) {
                sm0Var2.d = text2;
                org.telegram.ui.Components.jt jtVar2 = sm0Var2.f49546e0;
                if (jtVar2 != null) {
                    jtVar2.setText(text2);
                }
            }
            em0 em0Var = new em0(hm0Var, hashMap, arrayList, 1);
            sm0 sm0Var3 = vm0Var.f50553a;
            sm0Var3.f49564t0 = em0Var;
            sm0 sm0Var4 = vm0Var.f50554b;
            sm0Var4.f49564t0 = em0Var;
            sm0Var3.f49565u0 = new tm0(vm0Var, 1);
            sm0Var4.f49565u0 = new tm0(vm0Var, 2);
            int i3 = hm0Var.H;
            boolean z10 = hm0Var.I;
            sm0Var3.k0(i3, z10);
            vm0Var.f50554b.k0(i3, z10);
            hm0Var.presentFragment(vm0Var);
            return;
        }
        sm0 sm0Var5 = new sm0(0, peVar, hashMap, arrayList, hm0Var.f45944x, hm0Var.F, hm0Var.G, false);
        Editable text3 = hm0Var.N.getText();
        hm0Var.f45935a = text3;
        sm0Var5.d = text3;
        org.telegram.ui.Components.jt jtVar3 = sm0Var5.f49546e0;
        if (jtVar3 != null) {
            jtVar3.setText(text3);
        }
        sm0Var5.f49564t0 = new em0(hm0Var, hashMap, arrayList, 0);
        sm0Var5.k0(hm0Var.H, hm0Var.I);
        hm0Var.presentFragment(sm0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i3) {
        if (!hashMap.isEmpty() && this.W != null && !this.f45943w) {
            this.f45943w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    String str2 = yeVar.h;
                    if (str2 != null) {
                        obj2.f26477c = str2;
                    } else {
                        obj2.f26477c = yeVar.I;
                    }
                    obj2.f26478e = yeVar.f25311c;
                    obj2.f26479f = yeVar.f25314g;
                    obj2.f26483k = yeVar.f25325s;
                    obj2.f26487o = yeVar.f25310b;
                    CharSequence charSequence = yeVar.f25309a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f26481i = yeVar.f25320n;
                    obj2.f26482j = yeVar.f25324r;
                    obj2.h = yeVar.f25329x;
                } else if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    String str3 = bfVar.h;
                    if (str3 != null) {
                        obj2.f26477c = str3;
                    } else {
                        obj2.f26484l = bfVar;
                    }
                    obj2.f26478e = bfVar.f25311c;
                    obj2.f26479f = bfVar.f25314g;
                    obj2.f26483k = bfVar.f25325s;
                    CharSequence charSequence2 = bfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f26481i = bfVar.f25320n;
                    obj2.f26482j = bfVar.f25324r;
                    obj2.h = bfVar.f25329x;
                    TLRPC.BotInlineResult botInlineResult = bfVar.N;
                    if (botInlineResult != null && bfVar.H == 1) {
                        obj2.f26485m = botInlineResult;
                        obj2.f26486n = bfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.a(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27882da));
    }

    public final void b0(boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float L;
        if (this.M.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.M;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.N.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(this.N.getEditText());
        }
        this.N.k(true);
        if (z10) {
            this.M.setVisibility(0);
            this.O.setVisibility(0);
        } else {
            this.M.setVisibility(4);
            this.O.setVisibility(4);
        }
        l0 l0Var = this.O;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        l0Var.setScaleX(f10);
        l0 l0Var2 = this.O;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        l0Var2.setScaleY(f11);
        l0 l0Var3 = this.O;
        float f16 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        l0Var3.setAlpha(f12);
        org.telegram.ui.Components.voip.r0 r0Var = this.R;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        r0Var.setScaleX(f13);
        org.telegram.ui.Components.voip.r0 r0Var2 = this.R;
        if (z10) {
            f14 = 1.0f;
        }
        r0Var2.setScaleY(f14);
        org.telegram.ui.Components.voip.r0 r0Var3 = this.R;
        if (!z10) {
            f15 = 0.0f;
        }
        r0Var3.setAlpha(f15);
        FrameLayout frameLayout2 = this.M;
        if (z10) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(48.0f);
        }
        frameLayout2.setTranslationY(L);
        View view = this.S;
        if (!z10) {
            f16 = org.telegram.messenger.g0.L(48.0f);
        }
        view.setTranslationY(f16);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        org.telegram.ui.ActionBar.r6.i(i3, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 23));
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        if (this.f45945y) {
            q10.a(2, 2131232486).setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        }
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, 2131231244);
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        a10.e(1, 2131232265, org.telegram.messenger.bd.M0(2131747804, null));
        fm0 fm0Var = new fm0(this, context);
        this.Q = fm0Var;
        org.telegram.ui.ActionBar.r6.i(i3, fm0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750492, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.h = tj0Var;
        tj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new u4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, b8.mf.e(-1, -1, 51));
        org.telegram.ui.Components.tj0 tj0Var2 = this.h;
        n4 n4Var = new n4(13, this, context);
        this.f45940n = n4Var;
        tj0Var2.setAdapter(n4Var);
        org.telegram.ui.ActionBar.r6.I(this.h, i3, null);
        TextView textView = new TextView(context);
        this.f45942s = textView;
        textView.setTextColor(-8355712);
        this.f45942s.setTextSize(1, 20.0f);
        this.f45942s.setGravity(17);
        this.f45942s.setVisibility(8);
        this.f45942s.setText(org.telegram.messenger.bd.M0(2131748188, null));
        this.Q.addView(this.f45942s, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f45942s.setOnTouchListener(new fi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45941r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.f45941r, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f45941r.addView(radialProgressView, b8.mf.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231238);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, b8.mf.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i3, frameLayout2, null);
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, b8.mf.e(-1, 48, 83));
        this.M.setOnTouchListener(new fi.a(2));
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null) {
            jtVar.o();
        }
        this.N = new org.telegram.ui.Components.jt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).H0())});
        this.N.setHint(org.telegram.messenger.bd.M0(2131754454, null));
        org.telegram.ui.Components.xs editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f45935a;
        if (charSequence != null) {
            this.N.setText(charSequence);
        }
        l0 l0Var = new l0(17, context, this);
        this.O = l0Var;
        l0Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, b8.mf.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.t(this.P, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new cg.p0(22));
        this.O.addView(this.P, b8.mf.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new b40(this, 18));
        this.P.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(5, context, this);
        this.R = r0Var;
        r0Var.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, b8.mf.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f45944x != 0) {
            this.N.setVisibility(8);
        }
        if (this.f45938e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f45941r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f45941r.setVisibility(8);
            this.h.setEmptyView(this.f45942s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23295r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f45944x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f45945y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f45941r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.tj0 tj0Var = this.h;
                if (tj0Var != null && tj0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f45942s);
                }
                n4 n4Var = this.f45940n;
                if (n4Var != null) {
                    n4Var.f();
                }
                this.f45938e = false;
            }
        } else if (i3 == org.telegram.messenger.hs.f23305t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null && jtVar.f35191e) {
            if (z10) {
                jtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tj0 tj0Var = this.h;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3 = this.f45944x;
        boolean z10 = true;
        if (i3 != 1 && i3 != 2 && i3 != 10 && this.f45945y) {
            this.d = MediaController.c2;
        } else {
            this.d = MediaController.f21296d2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f45938e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23295r2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23305t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null) {
            jtVar.o();
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23295r2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23305t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.f45940n;
        if (n4Var != null) {
            n4Var.f();
        }
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null) {
            jtVar.s();
        }
        org.telegram.ui.Components.tj0 tj0Var = this.h;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 3));
        }
    }
}
