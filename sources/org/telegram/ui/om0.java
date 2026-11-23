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
public final class om0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public final boolean E;
    public final boolean F;
    public final bn G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.g1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.y0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.wt N;
    public k0 O;
    public ImageView P;
    public mm0 Q;
    public tv R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public nm0 W;
    public CharSequence f50717a;
    public final HashMap f50718b;
    public final ArrayList f50719c;
    public ArrayList d;
    public boolean f50720e;
    public int f50721f;
    public org.telegram.ui.Components.ek0 h;
    public l4 f50722n;
    public FrameLayout f50723r;
    public TextView f50724s;
    public boolean f50725w;
    public final int f50726x;
    public boolean f50727y;

    public om0(int i7, boolean z10, boolean z11, bn bnVar) {
        super(null);
        this.f50718b = new HashMap();
        this.f50719c = new ArrayList();
        this.d = null;
        this.f50720e = false;
        this.f50721f = 2;
        this.f50727y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = bnVar;
        this.f50726x = i7;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(om0 om0Var, org.telegram.messenger.ue ueVar) {
        if (ueVar != null) {
            an0 an0Var = new an0(0, ueVar, om0Var.f50718b, om0Var.f50719c, om0Var.f50726x, om0Var.F, om0Var.G, false);
            Editable text = om0Var.N.getText();
            om0Var.f50717a = text;
            an0Var.d = text;
            org.telegram.ui.Components.wt wtVar = an0Var.f45751e0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            an0Var.f45769t0 = new f(om0Var, 29);
            an0Var.k0(om0Var.H, om0Var.I);
            om0Var.presentFragment(an0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (om0Var.E) {
            dn0 dn0Var = new dn0(hashMap, arrayList, om0Var.f50726x, om0Var.F, om0Var.G);
            Editable text2 = om0Var.N.getText();
            om0Var.f50717a = text2;
            an0 an0Var2 = dn0Var.f47195a;
            if (an0Var2 != null) {
                an0Var2.d = text2;
                org.telegram.ui.Components.wt wtVar2 = an0Var2.f45751e0;
                if (wtVar2 != null) {
                    wtVar2.setText(text2);
                }
            }
            lm0 lm0Var = new lm0(om0Var, hashMap, arrayList, 1);
            an0 an0Var3 = dn0Var.f47195a;
            an0Var3.f45769t0 = lm0Var;
            an0 an0Var4 = dn0Var.f47196b;
            an0Var4.f45769t0 = lm0Var;
            an0Var3.f45770u0 = new bn0(dn0Var, 1);
            an0Var4.f45770u0 = new bn0(dn0Var, 2);
            int i7 = om0Var.H;
            boolean z10 = om0Var.I;
            an0Var3.k0(i7, z10);
            dn0Var.f47196b.k0(i7, z10);
            om0Var.presentFragment(dn0Var);
            return;
        }
        an0 an0Var5 = new an0(0, ueVar, hashMap, arrayList, om0Var.f50726x, om0Var.F, om0Var.G, false);
        Editable text3 = om0Var.N.getText();
        om0Var.f50717a = text3;
        an0Var5.d = text3;
        org.telegram.ui.Components.wt wtVar3 = an0Var5.f45751e0;
        if (wtVar3 != null) {
            wtVar3.setText(text3);
        }
        an0Var5.f45769t0 = new lm0(om0Var, hashMap, arrayList, 0);
        an0Var5.k0(om0Var.H, om0Var.I);
        om0Var.presentFragment(an0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i7) {
        if (!hashMap.isEmpty() && this.W != null && !this.f50725w) {
            this.f50725w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    String str2 = efVar.h;
                    if (str2 != null) {
                        obj2.f28311c = str2;
                    } else {
                        obj2.f28311c = efVar.I;
                    }
                    obj2.f28312e = efVar.f27964c;
                    obj2.f28313f = efVar.f27967g;
                    obj2.f28317k = efVar.f27978s;
                    obj2.f28321o = efVar.f27963b;
                    CharSequence charSequence = efVar.f27962a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28315i = efVar.f27973n;
                    obj2.f28316j = efVar.f27977r;
                    obj2.h = efVar.f27982x;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28311c = str3;
                    } else {
                        obj2.f28318l = hfVar;
                    }
                    obj2.f28312e = hfVar.f27964c;
                    obj2.f28313f = hfVar.f27967g;
                    obj2.f28317k = hfVar.f27978s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28315i = hfVar.f27973n;
                    obj2.f28316j = hfVar.f27977r;
                    obj2.h = hfVar.f27982x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28319m = botInlineResult;
                        obj2.f28320n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.b(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29455da));
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
        tv tvVar = this.R;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        tvVar.setScaleX(f13);
        tv tvVar2 = this.R;
        if (z10) {
            f14 = 1.0f;
        }
        tvVar2.setScaleY(f14);
        tv tvVar3 = this.R;
        if (!z10) {
            f15 = 0.0f;
        }
        tvVar3.setAlpha(f15);
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
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.I5, null);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, 25));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.f50727y) {
            s5.a(2, 2131232491).setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        }
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131231247);
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        a10.e(1, 2131232270, org.telegram.messenger.gd.N0(2131747602, null));
        mm0 mm0Var = new mm0(this, context);
        this.Q = mm0Var;
        org.telegram.ui.ActionBar.u6.h(i7, mm0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131750467, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.h = ek0Var;
        ek0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, c8.na.e(-1, -1, 51));
        org.telegram.ui.Components.ek0 ek0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.f50722n = l4Var;
        ek0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.u6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.f50724s = textView;
        textView.setTextColor(-8355712);
        this.f50724s.setTextSize(1, 20.0f);
        this.f50724s.setGravity(17);
        this.f50724s.setVisibility(8);
        this.f50724s.setText(org.telegram.messenger.gd.N0(2131747987, null));
        this.Q.addView(this.f50724s, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f50724s.setOnTouchListener(new gi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50723r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.f50723r, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f50723r.addView(radialProgressView, c8.na.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231241);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, c8.na.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout2, null);
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, c8.na.e(-1, 48, 83));
        this.M.setOnTouchListener(new gi.a(2));
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.o();
        }
        this.N = new org.telegram.ui.Components.wt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).J0())});
        this.N.setHint(org.telegram.messenger.gd.N0(2131754451, null));
        org.telegram.ui.Components.mt editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f50717a;
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
        this.Q.addView(this.O, c8.na.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S5, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.s(this.P, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new bg.q0(19));
        this.O.addView(this.P, c8.na.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new i40(this, 18));
        this.P.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        tv tvVar = new tv(4, context, this);
        this.R = tvVar;
        tvVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, c8.na.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f50726x != 0) {
            this.N.setVisibility(8);
        }
        if (this.f50720e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f50723r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f50723r.setVisibility(8);
            this.h.setEmptyView(this.f50724s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25279r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f50726x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f50727y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f50723r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.ek0 ek0Var = this.h;
                if (ek0Var != null && ek0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f50724s);
                }
                l4 l4Var = this.f50722n;
                if (l4Var != null) {
                    l4Var.f();
                }
                this.f50720e = false;
            }
        } else if (i7 == org.telegram.messenger.ks.f25289t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.N;
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
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ek0 ek0Var = this.h;
        if (ek0Var != null) {
            ek0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = this.f50726x;
        boolean z10 = true;
        if (i7 != 1 && i7 != 2 && i7 != 10 && this.f50727y) {
            this.d = MediaController.f22786c2;
        } else {
            this.d = MediaController.d2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f50720e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25279r2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25289t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25279r2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25289t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f50722n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.Components.ek0 ek0Var = this.h;
        if (ek0Var != null) {
            ek0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
