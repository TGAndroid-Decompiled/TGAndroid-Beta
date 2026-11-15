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
public final class nm0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public final boolean E;
    public final boolean F;
    public final an G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.g1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.z0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.rt N;
    public k0 O;
    public ImageView P;
    public lm0 Q;
    public rv R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public mm0 W;
    public CharSequence f49583a;
    public final HashMap f49584b;
    public final ArrayList f49585c;
    public ArrayList d;
    public boolean f49586e;
    public int f49587f;
    public org.telegram.ui.Components.uj0 h;
    public l4 f49588n;
    public FrameLayout f49589r;
    public TextView f49590s;
    public boolean f49591w;
    public final int f49592x;
    public boolean f49593y;

    public nm0(int i7, boolean z10, boolean z11, an anVar) {
        super(null);
        this.f49584b = new HashMap();
        this.f49585c = new ArrayList();
        this.d = null;
        this.f49586e = false;
        this.f49587f = 2;
        this.f49593y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = anVar;
        this.f49592x = i7;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(nm0 nm0Var, org.telegram.messenger.ve veVar) {
        if (veVar != null) {
            ym0 ym0Var = new ym0(0, veVar, nm0Var.f49584b, nm0Var.f49585c, nm0Var.f49592x, nm0Var.F, nm0Var.G, false);
            Editable text = nm0Var.N.getText();
            nm0Var.f49583a = text;
            ym0Var.d = text;
            org.telegram.ui.Components.rt rtVar = ym0Var.f53572e0;
            if (rtVar != null) {
                rtVar.setText(text);
            }
            ym0Var.f53590t0 = new f(nm0Var, 29);
            ym0Var.k0(nm0Var.H, nm0Var.I);
            nm0Var.presentFragment(ym0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (nm0Var.E) {
            bn0 bn0Var = new bn0(hashMap, arrayList, nm0Var.f49592x, nm0Var.F, nm0Var.G);
            Editable text2 = nm0Var.N.getText();
            nm0Var.f49583a = text2;
            ym0 ym0Var2 = bn0Var.f45790a;
            if (ym0Var2 != null) {
                ym0Var2.d = text2;
                org.telegram.ui.Components.rt rtVar2 = ym0Var2.f53572e0;
                if (rtVar2 != null) {
                    rtVar2.setText(text2);
                }
            }
            km0 km0Var = new km0(nm0Var, hashMap, arrayList, 1);
            ym0 ym0Var3 = bn0Var.f45790a;
            ym0Var3.f53590t0 = km0Var;
            ym0 ym0Var4 = bn0Var.f45791b;
            ym0Var4.f53590t0 = km0Var;
            ym0Var3.f53591u0 = new zm0(bn0Var, 1);
            ym0Var4.f53591u0 = new zm0(bn0Var, 2);
            int i7 = nm0Var.H;
            boolean z10 = nm0Var.I;
            ym0Var3.k0(i7, z10);
            bn0Var.f45791b.k0(i7, z10);
            nm0Var.presentFragment(bn0Var);
            return;
        }
        ym0 ym0Var5 = new ym0(0, veVar, hashMap, arrayList, nm0Var.f49592x, nm0Var.F, nm0Var.G, false);
        Editable text3 = nm0Var.N.getText();
        nm0Var.f49583a = text3;
        ym0Var5.d = text3;
        org.telegram.ui.Components.rt rtVar3 = ym0Var5.f53572e0;
        if (rtVar3 != null) {
            rtVar3.setText(text3);
        }
        ym0Var5.f53590t0 = new km0(nm0Var, hashMap, arrayList, 0);
        ym0Var5.k0(nm0Var.H, nm0Var.I);
        nm0Var.presentFragment(ym0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i7) {
        if (!hashMap.isEmpty() && this.W != null && !this.f49591w) {
            this.f49591w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    String str2 = ffVar.h;
                    if (str2 != null) {
                        obj2.f23189c = str2;
                    } else {
                        obj2.f23189c = ffVar.I;
                    }
                    obj2.f23190e = ffVar.f27709c;
                    obj2.f23191f = ffVar.f27712g;
                    obj2.f23195k = ffVar.f27723s;
                    obj2.f23199o = ffVar.f27708b;
                    CharSequence charSequence = ffVar.f27707a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f23193i = ffVar.f27718n;
                    obj2.f23194j = ffVar.f27722r;
                    obj2.h = ffVar.f27727x;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f23189c = str3;
                    } else {
                        obj2.f23196l = jfVar;
                    }
                    obj2.f23190e = jfVar.f27709c;
                    obj2.f23191f = jfVar.f27712g;
                    obj2.f23195k = jfVar.f27723s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f23193i = jfVar.f27718n;
                    obj2.f23194j = jfVar.f27722r;
                    obj2.h = jfVar.f27727x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f23197m = botInlineResult;
                        obj2.f23198n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.f(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28853da));
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
        k0 k0Var = this.O;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        k0Var.setScaleX(f10);
        k0 k0Var2 = this.O;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        k0Var2.setScaleY(f11);
        k0 k0Var3 = this.O;
        float f16 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        k0Var3.setAlpha(f12);
        rv rvVar = this.R;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        rvVar.setScaleX(f13);
        rv rvVar2 = this.R;
        if (z10) {
            f14 = 1.0f;
        }
        rvVar2.setScaleY(f14);
        rv rvVar3 = this.R;
        if (!z10) {
            f15 = 0.0f;
        }
        rvVar3.setAlpha(f15);
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
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        org.telegram.ui.ActionBar.q6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 23));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.f49593y) {
            s5.a(2, 2131232487).setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        }
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131231244);
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        a10.e(1, 2131232266, org.telegram.messenger.hd.M0(2131747796, null));
        lm0 lm0Var = new lm0(this, context);
        this.Q = lm0Var;
        org.telegram.ui.ActionBar.q6.h(i7, lm0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750484, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.h = uj0Var;
        uj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, c8.ja.e(-1, -1, 51));
        org.telegram.ui.Components.uj0 uj0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.f49588n = l4Var;
        uj0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.q6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.f49590s = textView;
        textView.setTextColor(-8355712);
        this.f49590s.setTextSize(1, 20.0f);
        this.f49590s.setGravity(17);
        this.f49590s.setVisibility(8);
        this.f49590s.setText(org.telegram.messenger.hd.M0(2131748180, null));
        this.Q.addView(this.f49590s, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f49590s.setOnTouchListener(new gi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49589r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.f49589r, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f49589r.addView(radialProgressView, c8.ja.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231238);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, c8.ja.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.q6.h(i7, frameLayout2, null);
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, c8.ja.e(-1, 48, 83));
        this.M.setOnTouchListener(new gi.a(2));
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null) {
            rtVar.o();
        }
        this.N = new org.telegram.ui.Components.rt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).H0())});
        this.N.setHint(org.telegram.messenger.hd.M0(2131754454, null));
        org.telegram.ui.Components.ft editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f49583a;
        if (charSequence != null) {
            this.N.setText(charSequence);
        }
        k0 k0Var = new k0(17, context, this);
        this.O = k0Var;
        k0Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, c8.ja.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.q6.s(this.P, org.telegram.ui.ActionBar.j6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new bg.p0(19));
        this.O.addView(this.P, c8.ja.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new g40(this, 18));
        this.P.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        rv rvVar = new rv(4, context, this);
        this.R = rvVar;
        rvVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, c8.ja.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f49592x != 0) {
            this.N.setVisibility(8);
        }
        if (this.f49586e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f49589r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f49589r.setVisibility(8);
            this.h.setEmptyView(this.f49590s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25562r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f49592x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f49593y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f49589r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.uj0 uj0Var = this.h;
                if (uj0Var != null && uj0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f49590s);
                }
                l4 l4Var = this.f49588n;
                if (l4Var != null) {
                    l4Var.f();
                }
                this.f49586e = false;
            }
        } else if (i7 == org.telegram.messenger.ns.f25572t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null && rtVar.f39059e) {
            if (z10) {
                rtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.uj0 uj0Var = this.h;
        if (uj0Var != null) {
            uj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = this.f49592x;
        boolean z10 = true;
        if (i7 != 1 && i7 != 2 && i7 != 10 && this.f49593y) {
            this.d = MediaController.f22325c2;
        } else {
            this.d = MediaController.d2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f49586e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25562r2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25572t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null) {
            rtVar.o();
        }
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25562r2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25572t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f49588n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null) {
            rtVar.s();
        }
        org.telegram.ui.Components.uj0 uj0Var = this.h;
        if (uj0Var != null) {
            uj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
