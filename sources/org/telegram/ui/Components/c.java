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
    public final int f33821a;
    public final m0 f33822b;

    public c(m0 m0Var, int i7) {
        this.f33821a = i7;
        this.f33822b = m0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        LinearLayout linearLayout;
        int i11 = this.f33821a;
        m0 m0Var = this.f33822b;
        switch (i11) {
            case 0:
                m0Var.dismiss();
                return;
            case 1:
                org.telegram.ui.Cells.l3 l3Var = m0Var.f37304y2;
                org.telegram.messenger.g0.v1(l3Var.d);
                m0Var.G2 = l3Var.getText().toString();
                m0Var.C1();
                m0Var.B1(true);
                m0Var.t1();
                return;
            case 2:
                if (m0Var.f37286g2 != null) {
                    TL_iv.RichMessage o12 = m0Var.o1();
                    if (o12 != null) {
                        m0Var.f37286g2.a(o12);
                    }
                } else if (m0Var.f37285f2 != null && m0Var.p1() != null) {
                    m0Var.f37285f2.a(m0Var.p1());
                }
                m0Var.dismiss();
                return;
            case 3:
                m0Var.dismiss();
                return;
            case 4:
                if (r0.b(m0Var.f30187a, m0Var.f37287h2) != null) {
                    r0.e(m0Var.f30187a, m0Var.f37287h2, null);
                } else {
                    q0 k12 = m0Var.k1();
                    if (k12 == null) {
                        org.telegram.messenger.g0.E3(4.0f, m0Var.R2, null);
                        return;
                    }
                    r0.e(m0Var.f30187a, m0Var.f37287h2, k12);
                }
                m0Var.A1();
                dd ddVar = m0Var.S2;
                if (ddVar != null) {
                    ddVar.run();
                    return;
                }
                return;
            case 5:
                m0Var.Q2 = false;
                m0Var.Y0();
                m0Var.P2.O(true);
                m0Var.J0();
                return;
            case 6:
                final m0 m0Var2 = this.f33822b;
                y60 G = y60.G(m0Var2.f30193c, m0Var2.J0, view);
                G.f42343a0 = org.telegram.messenger.g0.L(450.0f);
                G.f42377t = false;
                G.f42345b0 = true;
                G.f42375s = 51;
                G.f42379u = false;
                G.v = true;
                ScrollView scrollView = new ScrollView(m0Var2.getContext());
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout2 = new LinearLayout(m0Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                int min = Math.min(org.telegram.messenger.g0.L(468.0f), org.telegram.messenger.g0.L(48.0f) + (org.telegram.messenger.g0.f24118q.y / 2));
                G.U = true;
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, m0Var2.J0);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, m0Var2.J0);
                LinearLayout linearLayout3 = new LinearLayout(m0Var2.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(m0Var2.getContext());
                ImageView imageView = new ImageView(m0Var2.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(2131232356);
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.45f, w02);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
                frameLayout.addView(imageView, c8.ma.d(18, 18.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(m0Var2.getContext());
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(w02);
                editTextBoldCursor.setHintText(org.telegram.messenger.gd.M0(2131745641, null));
                editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.n6.r1(0.45f, w02));
                editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, m0Var2.J0));
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(18.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(0, 0, 0, 0);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(524289);
                editTextBoldCursor.setImeOptions(268435459);
                editTextBoldCursor.setGravity(19);
                editTextBoldCursor.setOnEditorActionListener(new g(editTextBoldCursor, 0));
                frameLayout.addView(editTextBoldCursor, c8.ma.d(-1, -1.0f, 119, 42.0f, 0.0f, 40.0f, 0.0f));
                ImageView imageView2 = new ImageView(m0Var2.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setImageResource(2131231269);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.r1(0.75f, w03), mode));
                imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, w02), 1, -1));
                imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131752088, null));
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(new h(editTextBoldCursor, 0));
                frameLayout.addView(imageView2, c8.ma.d(36, 36.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                linearLayout3.addView(frameLayout, c8.ma.o(-1, 48));
                View view2 = new View(m0Var2.getContext());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
                linearLayout3.addView(view2, new LinearLayout.LayoutParams(-1, Math.max(1, org.telegram.messenger.g0.L(0.66f))));
                linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                TextView textView = new TextView(m0Var2.getContext());
                textView.setTextSize(1, 15.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.5f, w02));
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.gd.M0(2131747975, null));
                textView.setVisibility(8);
                linearLayout2.addView(textView, c8.ma.o(-1, 96));
                G.r(linearLayout3, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(196.0f), min));
                G.f42369p = new i(editTextBoldCursor, 0);
                G.o(false);
                l0 l0Var = new l0(m0Var2.getContext(), m0Var2.f30187a, 1, true, m0Var2.J0);
                l0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                l0Var.setRoundRadius(12);
                String M0 = org.telegram.messenger.gd.M0(2131754955, null);
                j jVar = new j(m0Var2, l0Var, 0);
                j0 j0Var = l0Var.f36937c;
                int childCount = j0Var.getChildCount();
                k0 k0Var = new k0(l0Var.f36935a, l0Var.getContext(), l0Var.f36936b);
                k0Var.f36590c = l0Var.f36938e;
                k0Var.updateColors();
                k0Var.a("❌", M0, null);
                k0Var.setOnClickListener(new ci.q(jVar, childCount, 10));
                if (j0Var.getOrientation() == 0) {
                    i7 = 0;
                } else {
                    i7 = -1;
                }
                if (j0Var.getOrientation() == 1) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                j0Var.addView(k0Var, c8.ma.p(i7, i10, 1.0f, 119));
                ArrayList arrayList = m0Var2.f37298s2.f23611b;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    l0Var.b((TL_aicompose.AiComposeTone) obj, new j(m0Var2, l0Var, 1));
                }
                TL_aicompose.AiComposeTone aiComposeTone = m0Var2.f37296q2;
                if (aiComposeTone != null) {
                    l0Var.d(aiComposeTone, false);
                } else {
                    l0Var.c(0, false);
                }
                G.r(l0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(84.0f), min));
                ViewParent parent = linearLayout3.getParent();
                while (parent != null && !(parent instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent = parent.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent;
                ViewParent parent2 = l0Var.getParent();
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
                ArrayList o4 = org.telegram.messenger.z00.o(null);
                ArrayList n10 = org.telegram.messenger.z00.n();
                int childCount2 = linearLayout2.getChildCount();
                if (!TextUtils.isEmpty(m0Var2.f37294o2)) {
                    linearLayout = linearLayout2;
                    m0Var2.h1(G, linearLayout, true, y21.L0(y21.P0(m0Var2.f37294o2, null, null)), null);
                } else {
                    linearLayout = linearLayout2;
                }
                int size2 = o4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = o4.get(i13);
                    i13++;
                    final org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) obj2;
                    if (!TextUtils.equals(s00Var.f26716a, m0Var2.f37294o2)) {
                        m0Var2.h1(G, linearLayout, false, s00Var.f26717b, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m0 m0Var3 = m0Var2;
                                        m0Var3.j1();
                                        m0Var3.f37294o2 = s00Var.f26716a;
                                        m0Var3.t1();
                                        return;
                                    default:
                                        m0 m0Var4 = m0Var2;
                                        m0Var4.j1();
                                        m0Var4.f37294o2 = s00Var.f26716a;
                                        m0Var4.t1();
                                        return;
                                }
                            }
                        });
                    }
                }
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(m0Var2.getContext(), m0Var2.J0);
                e1Var.setTag(2131296437, 1);
                linearLayout.addView(e1Var, c8.ma.o(-1, 8));
                int childCount3 = linearLayout.getChildCount();
                int size3 = n10.size();
                int i14 = 0;
                while (i14 < size3) {
                    int i15 = i14 + 1;
                    final org.telegram.messenger.s00 s00Var2 = (org.telegram.messenger.s00) n10.get(i14);
                    boolean equals = TextUtils.equals(s00Var2.f26716a, m0Var2.f37294o2);
                    String str = s00Var2.f26717b;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    m0 m0Var3 = m0Var2;
                                    m0Var3.j1();
                                    m0Var3.f37294o2 = s00Var2.f26716a;
                                    m0Var3.t1();
                                    return;
                                default:
                                    m0 m0Var4 = m0Var2;
                                    m0Var4.j1();
                                    m0Var4.f37294o2 = s00Var2.f26716a;
                                    m0Var4.t1();
                                    return;
                            }
                        }
                    };
                    LinearLayout linearLayout4 = linearLayout;
                    m0 m0Var3 = m0Var2;
                    y60 y60Var = G;
                    m0Var3.h1(y60Var, linearLayout4, equals, str, runnable);
                    linearLayout = linearLayout4;
                    G = y60Var;
                    size3 = size3;
                    m0Var2 = m0Var3;
                    i14 = i15;
                }
                editTextBoldCursor.addTextChangedListener(new r(imageView2, childCount2, childCount3, linearLayout, n10, textView, scrollView));
                G.a0();
                return;
            case 7:
                m0.e1(m0Var, view);
                return;
            case 8:
                if (!m0Var.W2) {
                    org.telegram.messenger.g0.g(m0Var.p1());
                    return;
                }
                return;
            case 9:
                m0Var.dismiss();
                return;
            default:
                m0Var.u1(0, 0, true);
                m0Var.dismiss();
                return;
        }
    }
}
