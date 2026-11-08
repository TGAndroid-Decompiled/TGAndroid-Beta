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
public final class mm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final boolean D;
    public final boolean E;
    public final an F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.g1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.z0[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.lt M;
    public k0 N;
    public ImageView O;
    public km0 P;
    public l00 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public lm0 V;
    public CharSequence f47834a;
    public final HashMap f47835b;
    public final ArrayList f47836c;
    public ArrayList d;
    public boolean f47837e;
    public int f47838f;
    public org.telegram.ui.Components.pj0 h;
    public l4 f47839n;
    public FrameLayout f47840r;
    public TextView f47841s;
    public boolean f47842w;
    public final int f47843x;
    public boolean f47844y;

    public mm0(int i7, boolean z9, boolean z10, an anVar) {
        super(null);
        this.f47835b = new HashMap();
        this.f47836c = new ArrayList();
        this.d = null;
        this.f47837e = false;
        this.f47838f = 2;
        this.f47844y = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = anVar;
        this.f47843x = i7;
        this.D = z9;
        this.E = z10;
    }

    public static void Z(mm0 mm0Var, org.telegram.messenger.we weVar) {
        if (weVar != null) {
            xm0 xm0Var = new xm0(0, weVar, mm0Var.f47835b, mm0Var.f47836c, mm0Var.f47843x, mm0Var.E, mm0Var.F, false);
            Editable text = mm0Var.M.getText();
            mm0Var.f47834a = text;
            xm0Var.d = text;
            org.telegram.ui.Components.lt ltVar = xm0Var.f51909d0;
            if (ltVar != null) {
                ltVar.setText(text);
            }
            xm0Var.f51928s0 = new f(mm0Var, 29);
            xm0Var.k0(mm0Var.G, mm0Var.H);
            mm0Var.presentFragment(xm0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (mm0Var.D) {
            an0 an0Var = new an0(hashMap, arrayList, mm0Var.f47843x, mm0Var.E, mm0Var.F);
            Editable text2 = mm0Var.M.getText();
            mm0Var.f47834a = text2;
            xm0 xm0Var2 = an0Var.f44055a;
            if (xm0Var2 != null) {
                xm0Var2.d = text2;
                org.telegram.ui.Components.lt ltVar2 = xm0Var2.f51909d0;
                if (ltVar2 != null) {
                    ltVar2.setText(text2);
                }
            }
            jm0 jm0Var = new jm0(mm0Var, hashMap, arrayList, 1);
            xm0 xm0Var3 = an0Var.f44055a;
            xm0Var3.f51928s0 = jm0Var;
            xm0 xm0Var4 = an0Var.f44056b;
            xm0Var4.f51928s0 = jm0Var;
            xm0Var3.f51929t0 = new ym0(an0Var, 1);
            xm0Var4.f51929t0 = new ym0(an0Var, 2);
            int i7 = mm0Var.G;
            boolean z9 = mm0Var.H;
            xm0Var3.k0(i7, z9);
            an0Var.f44056b.k0(i7, z9);
            mm0Var.presentFragment(an0Var);
            return;
        }
        xm0 xm0Var5 = new xm0(0, weVar, hashMap, arrayList, mm0Var.f47843x, mm0Var.E, mm0Var.F, false);
        Editable text3 = mm0Var.M.getText();
        mm0Var.f47834a = text3;
        xm0Var5.d = text3;
        org.telegram.ui.Components.lt ltVar3 = xm0Var5.f51909d0;
        if (ltVar3 != null) {
            ltVar3.setText(text3);
        }
        xm0Var5.f51928s0 = new jm0(mm0Var, hashMap, arrayList, 0);
        xm0Var5.k0(mm0Var.G, mm0Var.H);
        mm0Var.presentFragment(xm0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z9, int i7) {
        if (!hashMap.isEmpty() && this.V != null && !this.f47842w) {
            this.f47842w = true;
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
                        obj2.f22512c = str2;
                    } else {
                        obj2.f22512c = gfVar.I;
                    }
                    obj2.f22513e = gfVar.f26846c;
                    obj2.f22514f = gfVar.f26849g;
                    obj2.f22518k = gfVar.f26860s;
                    obj2.f22522o = gfVar.f26845b;
                    CharSequence charSequence = gfVar.f26844a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f22516i = gfVar.f26855n;
                    obj2.f22517j = gfVar.f26859r;
                    obj2.h = gfVar.f26864x;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str3 = kfVar.h;
                    if (str3 != null) {
                        obj2.f22512c = str3;
                    } else {
                        obj2.f22519l = kfVar;
                    }
                    obj2.f22513e = kfVar.f26846c;
                    obj2.f22514f = kfVar.f26849g;
                    obj2.f22518k = kfVar.f26860s;
                    CharSequence charSequence2 = kfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f22516i = kfVar.f26855n;
                    obj2.f22517j = kfVar.f26859r;
                    obj2.h = kfVar.f26864x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        obj2.f22520m = botInlineResult;
                        obj2.f22521n = kfVar.O;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27856da));
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
        l00 l00Var = this.Q;
        if (z9) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        l00Var.setScaleX(f13);
        l00 l00Var2 = this.Q;
        if (z9) {
            f14 = 1.0f;
        }
        l00Var2.setScaleY(f14);
        l00 l00Var3 = this.Q;
        if (!z9) {
            f15 = 0.0f;
        }
        l00Var3.setAlpha(f15);
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
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.f27925h5;
        org.telegram.ui.ActionBar.r6.i(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 22));
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        if (this.f47844y) {
            q10.a(2, 2131232486).setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
        }
        org.telegram.ui.ActionBar.r0 a10 = q10.a(0, 2131231244);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        a10.e(1, 2131232265, org.telegram.messenger.id.M0(2131747797, null));
        km0 km0Var = new km0(this, context);
        this.P = km0Var;
        org.telegram.ui.ActionBar.r6.i(i7, km0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750485, null));
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
        this.f47839n = l4Var;
        pj0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.r6.I(this.h, i7, null);
        TextView textView = new TextView(context);
        this.f47841s = textView;
        textView.setTextColor(-8355712);
        this.f47841s.setTextSize(1, 20.0f);
        this.f47841s.setGravity(17);
        this.f47841s.setVisibility(8);
        this.f47841s.setText(org.telegram.messenger.id.M0(2131748181, null));
        this.P.addView(this.f47841s, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f47841s.setOnTouchListener(new ei.b(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47840r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f47840r, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f47840r.addView(radialProgressView, c8.ha.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(2131231238);
        this.R.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.P.addView(this.R, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i7, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.P.addView(this.L, c8.ha.e(-1, 48, 83));
        this.L.setOnTouchListener(new ei.b(2));
        org.telegram.ui.Components.lt ltVar = this.M;
        if (ltVar != null) {
            ltVar.o();
        }
        this.M = new org.telegram.ui.Components.lt(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).H0())});
        this.M.setHint(org.telegram.messenger.id.M0(2131754454, null));
        org.telegram.ui.Components.zs editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f47834a;
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
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T5, false)));
        this.O.setImageResource(2131230876);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.t(this.O, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bg.q0(19));
        this.N.addView(this.O, c8.ha.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new g40(this, 18));
        this.O.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        l00 l00Var = new l00(3, context, this);
        this.Q = l00Var;
        l00Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f47843x != 0) {
            this.M.setVisibility(8);
        }
        if (this.f47837e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f47840r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f47840r.setVisibility(8);
            this.h.setEmptyView(this.f47841s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25066r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f47843x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f47844y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f47840r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.pj0 pj0Var = this.h;
                if (pj0Var != null && pj0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f47841s);
                }
                l4 l4Var = this.f47839n;
                if (l4Var != null) {
                    l4Var.f();
                }
                this.f47837e = false;
            }
        } else if (i7 == org.telegram.messenger.qs.f25076t) {
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
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.lt ltVar = this.M;
        if (ltVar != null && ltVar.f35780e) {
            if (z9) {
                ltVar.k(true);
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
        int i7 = this.f47843x;
        boolean z9 = true;
        if (i7 != 1 && i7 != 2 && i7 != 10 && this.f47844y) {
            this.d = MediaController.f21245b2;
        } else {
            this.d = MediaController.f21246c2;
        }
        if (this.d != null) {
            z9 = false;
        }
        this.f47837e = z9;
        MediaController.O(this.classGuid);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25066r2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25076t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.lt ltVar = this.M;
        if (ltVar != null) {
            ltVar.o();
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25066r2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25076t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f47839n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.lt ltVar = this.M;
        if (ltVar != null) {
            ltVar.s();
        }
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
