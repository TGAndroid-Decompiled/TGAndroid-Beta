package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c implements View.OnClickListener {
    public final int f33912a;
    public final n0 f33913b;

    public c(n0 n0Var, int i7) {
        this.f33912a = i7;
        this.f33913b = n0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        LinearLayout linearLayout;
        int i11 = this.f33912a;
        n0 n0Var = this.f33913b;
        switch (i11) {
            case 0:
                n0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.l3 l3Var = n0Var.f37660y2;
                org.telegram.messenger.g0.v1(l3Var.d);
                n0Var.G2 = l3Var.getText().toString();
                n0Var.C1();
                n0Var.B1(true);
                n0Var.t1();
                return;
            case 2:
                if (n0Var.f37642g2 != null) {
                    TL_iv.RichMessage o12 = n0Var.o1();
                    if (o12 != null) {
                        n0Var.f37642g2.a(o12);
                    }
                } else if (n0Var.f37641f2 != null && n0Var.p1() != null) {
                    n0Var.f37641f2.a(n0Var.p1());
                }
                n0Var.dismiss();
                return;
            case 3:
                n0Var.dismiss();
                return;
            case 4:
                if (s0.b(n0Var.f30139a, n0Var.f37643h2) != null) {
                    s0.e(n0Var.f30139a, n0Var.f37643h2, null);
                } else {
                    r0 k12 = n0Var.k1();
                    if (k12 == null) {
                        org.telegram.messenger.g0.E3(4.0f, n0Var.R2, null);
                        return;
                    }
                    s0.e(n0Var.f30139a, n0Var.f37643h2, k12);
                }
                n0Var.A1();
                dd ddVar = n0Var.S2;
                if (ddVar != null) {
                    ddVar.run();
                    return;
                }
                return;
            case 5:
                n0Var.Q2 = false;
                n0Var.Y0();
                n0Var.P2.O(true);
                n0Var.J0();
                return;
            case 6:
                final n0 n0Var2 = this.f33913b;
                a70 G = a70.G(n0Var2.f30145c, n0Var2.J0, view);
                G.f33331a0 = org.telegram.messenger.g0.L(450.0f);
                G.f33365t = false;
                G.f33333b0 = true;
                G.f33363s = 51;
                G.f33367u = false;
                G.v = true;
                ScrollView scrollView = new ScrollView(n0Var2.getContext());
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout2 = new LinearLayout(n0Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                int min = Math.min(org.telegram.messenger.g0.L(468.0f), org.telegram.messenger.g0.L(48.0f) + (org.telegram.messenger.g0.f24010q.y / 2));
                G.U = true;
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, n0Var2.J0);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, n0Var2.J0);
                LinearLayout linearLayout3 = new LinearLayout(n0Var2.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(n0Var2.getContext());
                ImageView imageView = new ImageView(n0Var2.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(2131232356);
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.45f, w02);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
                frameLayout.addView(imageView, c8.na.d(18, 18.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(n0Var2.getContext());
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(w02);
                editTextBoldCursor.setHintText(org.telegram.messenger.hd.N0(2131745640, null));
                editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.m6.r1(0.45f, w02));
                editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, n0Var2.J0));
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(18.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(0, 0, 0, 0);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(524289);
                editTextBoldCursor.setImeOptions(268435459);
                editTextBoldCursor.setGravity(19);
                editTextBoldCursor.setOnEditorActionListener(new h(editTextBoldCursor, 0));
                frameLayout.addView(editTextBoldCursor, c8.na.d(-1, -1.0f, 119, 42.0f, 0.0f, 40.0f, 0.0f));
                ImageView imageView2 = new ImageView(n0Var2.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setImageResource(2131231269);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.r1(0.75f, w03), mode));
                imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, w02), 1, -1));
                imageView2.setContentDescription(org.telegram.messenger.hd.N0(2131752087, null));
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(new i(editTextBoldCursor, 0));
                frameLayout.addView(imageView2, c8.na.d(36, 36.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                linearLayout3.addView(frameLayout, c8.na.o(-1, 48));
                View view2 = new View(n0Var2.getContext());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
                linearLayout3.addView(view2, new LinearLayout.LayoutParams(-1, Math.max(1, org.telegram.messenger.g0.L(0.66f))));
                linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                TextView textView = new TextView(n0Var2.getContext());
                textView.setTextSize(1, 15.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.5f, w02));
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.hd.N0(2131747974, null));
                textView.setVisibility(8);
                linearLayout2.addView(textView, c8.na.o(-1, 96));
                G.r(linearLayout3, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(196.0f), min));
                G.f33357p = new j(editTextBoldCursor, 0);
                G.o(false);
                m0 m0Var = new m0(n0Var2.getContext(), n0Var2.f30139a, 1, true, n0Var2.J0);
                m0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                m0Var.setRoundRadius(12);
                String N0 = org.telegram.messenger.hd.N0(2131754955, null);
                k kVar = new k(n0Var2, m0Var, 0);
                k0 k0Var = m0Var.f37319c;
                int childCount = k0Var.getChildCount();
                l0 l0Var = new l0(m0Var.f37317a, m0Var.getContext(), m0Var.f37318b);
                l0Var.f37006c = m0Var.f37320e;
                l0Var.updateColors();
                l0Var.a("❌", N0, null);
                l0Var.setOnClickListener(new ci.q(kVar, childCount, 10));
                if (k0Var.getOrientation() == 0) {
                    i7 = 0;
                } else {
                    i7 = -1;
                }
                if (k0Var.getOrientation() == 1) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                k0Var.addView(l0Var, c8.na.p(i7, i10, 1.0f, 119));
                ArrayList arrayList = n0Var2.f37654s2.f23609b;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    m0Var.b((TL_aicompose.AiComposeTone) obj, new k(n0Var2, m0Var, 1));
                }
                TL_aicompose.AiComposeTone aiComposeTone = n0Var2.f37652q2;
                if (aiComposeTone != null) {
                    m0Var.d(aiComposeTone, false);
                } else {
                    m0Var.c(0, false);
                }
                G.r(m0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(84.0f), min));
                ViewParent parent = linearLayout3.getParent();
                while (parent != null && !(parent instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent = parent.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent;
                ViewParent parent2 = m0Var.getParent();
                while (parent2 != null && !(parent2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent2 = parent2.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent2;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = (org.telegram.messenger.g0.L(8.0f) - actionBarPopupWindow$ActionBarPopupWindowLayout.getPadding().right) - actionBarPopupWindow$ActionBarPopupWindowLayout2.getPadding().left;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setLayoutParams(layoutParams);
                }
                ArrayList o4 = org.telegram.messenger.a10.o(null);
                ArrayList n10 = org.telegram.messenger.a10.n();
                int childCount2 = linearLayout2.getChildCount();
                if (!TextUtils.isEmpty(n0Var2.f37650o2)) {
                    linearLayout = linearLayout2;
                    n0Var2.h1(G, linearLayout, true, b31.L0(b31.P0(n0Var2.f37650o2, null, null)), null);
                } else {
                    linearLayout = linearLayout2;
                }
                int size2 = o4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = o4.get(i13);
                    i13++;
                    final org.telegram.messenger.t00 t00Var = (org.telegram.messenger.t00) obj2;
                    if (!TextUtils.equals(t00Var.f26905a, n0Var2.f37650o2)) {
                        n0Var2.h1(G, linearLayout, false, t00Var.f26906b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n0 n0Var3 = n0Var2;
                                        n0Var3.j1();
                                        n0Var3.f37650o2 = t00Var.f26905a;
                                        n0Var3.t1();
                                        return;
                                    default:
                                        n0 n0Var4 = n0Var2;
                                        n0Var4.j1();
                                        n0Var4.f37650o2 = t00Var.f26905a;
                                        n0Var4.t1();
                                        return;
                                }
                            }
                        });
                    }
                }
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(n0Var2.getContext(), n0Var2.J0);
                d1Var.setTag(2131296439, 1);
                linearLayout.addView(d1Var, c8.na.o(-1, 8));
                int childCount3 = linearLayout.getChildCount();
                int size3 = n10.size();
                int i14 = 0;
                while (i14 < size3) {
                    int i15 = i14 + 1;
                    final org.telegram.messenger.t00 t00Var2 = (org.telegram.messenger.t00) n10.get(i14);
                    boolean equals = TextUtils.equals(t00Var2.f26905a, n0Var2.f37650o2);
                    String str = t00Var2.f26906b;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    n0 n0Var3 = n0Var2;
                                    n0Var3.j1();
                                    n0Var3.f37650o2 = t00Var2.f26905a;
                                    n0Var3.t1();
                                    return;
                                default:
                                    n0 n0Var4 = n0Var2;
                                    n0Var4.j1();
                                    n0Var4.f37650o2 = t00Var2.f26905a;
                                    n0Var4.t1();
                                    return;
                            }
                        }
                    };
                    LinearLayout linearLayout4 = linearLayout;
                    n0 n0Var3 = n0Var2;
                    a70 a70Var = G;
                    n0Var3.h1(a70Var, linearLayout4, equals, str, runnable);
                    linearLayout = linearLayout4;
                    G = a70Var;
                    size3 = size3;
                    n0Var2 = n0Var3;
                    i14 = i15;
                }
                editTextBoldCursor.addTextChangedListener(new s(imageView2, childCount2, childCount3, linearLayout, n10, textView, scrollView));
                G.a0();
                return;
            case 7:
                n0.e1(n0Var, view);
                return;
            case 8:
                if (!n0Var.W2) {
                    org.telegram.messenger.g0.g(n0Var.p1());
                    return;
                }
                return;
            case 9:
                n0Var.dismiss();
                return;
            default:
                n0Var.u1(0, 0, true);
                n0Var.dismiss();
                return;
        }
    }
}
