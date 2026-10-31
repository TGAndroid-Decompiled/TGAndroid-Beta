package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class kw0 implements View.OnClickListener {
    public final int f27933a;
    public final cx0 f27934b;

    public kw0(cx0 cx0Var, int i10) {
        this.f27933a = i10;
        this.f27934b = cx0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i10;
        int i11 = this.f27933a;
        cx0 cx0Var = this.f27934b;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = cx0Var.C1;
                if (k2Var != null) {
                    new kg.i1(k2Var, 11, false).show();
                    return;
                } else if (cx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) cx0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(cx0Var.f21583a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
                if (tL_messages_stickerSet != null && b02.B0(tL_messages_stickerSet.set.f19820id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && cx0Var.f25215p1 == null) {
                    cx0Var.f25214o1.e(3, 2131232770, org.telegram.messenger.cd.L0(2131744869, null));
                    cx0Var.f25214o1.e(4, 2131232115, org.telegram.messenger.cd.L0(2131751265, null));
                    if (z10) {
                        cx0Var.f25215p1 = cx0Var.f25214o1.e(5, 2131232107, org.telegram.messenger.cd.L0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, cx0Var.getContext(), cx0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232056, org.telegram.messenger.cd.L0(2131753756, null), false, cx0Var.I0).setOnClickListener(new kw0(cx0Var, 4));
                        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131744879, null), false, cx0Var.I0);
                        int i12 = org.telegram.ui.ActionBar.t6.f21170q7;
                        cx0Var.W(i12);
                        c10.c(i12, i12);
                        c10.h(0.1f, i12);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131744872, null), false, cx0Var.I0).setOnClickListener(new kw0(cx0Var, 6));
                        c10.setOnClickListener(new kw0(cx0Var, 7));
                        cx0Var.f25215p1 = cx0Var.f25214o1.h(2131232107, null, org.telegram.messenger.cd.L0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    cx0Var.f25214o1.a(-1);
                    da0 da0Var = new da0(cx0Var.f21583a, 4, cx0Var.getContext(), new ArrayList(), cx0Var.I0);
                    da0Var.setOnClickListener(new kw0(cx0Var, 8));
                    da0Var.setTag(2131296437, 1);
                    org.telegram.ui.ActionBar.t0 t0Var = cx0Var.f25214o1;
                    t0Var.p();
                    t0Var.f20826b.a(da0Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21170q7, cx0Var.I0);
                    cx0Var.f25215p1.d(w02, w02);
                    cx0Var.f25215p1.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
                    if (cx0Var.f25215p1.getRightIcon() != null) {
                        cx0Var.f25215p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (cx0Var.f25214o1.getPopupLayout() != null) {
                    cx0Var.f25214o1.getPopupLayout().requestLayout();
                }
                cx0Var.f25214o1.U(null, null);
                return;
            case 2:
                cx0Var.O0();
                return;
            case 3:
                if (cx0Var.P1 != null) {
                    cx0Var.S0(cx0Var.L1);
                    cx0Var.O0();
                    cx0Var.L1 = null;
                    return;
                }
                cx0Var.S1.a(cx0Var.K1, null, cx0Var.J1, null, cx0Var.Z1, true, 0, 0);
                cx0Var.dismiss();
                return;
            case 4:
                cx0Var.f25214o1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.f60 f60Var = cx0Var.U1;
                org.telegram.ui.k60 k60Var = f60Var.f37186c;
                s4.a0 a0Var = k60Var.h;
                boolean z11 = k60Var.N;
                int L0 = a0Var.L0();
                ck0 ck0Var = (ck0) k60Var.d.K(L0);
                if (ck0Var != null) {
                    i10 = ck0Var.f47898a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i13 = k60Var.f38699n;
                if (f60Var.f37184a) {
                    k60Var.f38700r = null;
                    k60Var.f38701s = true;
                } else {
                    k60Var.f38700r = f60Var.f37185b;
                    k60Var.f38701s = false;
                }
                if (z11) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.zy(f60Var, 10), 350L);
                }
                k60Var.l0();
                k60Var.j0(k60Var.f38700r, true);
                if (i13 != -1) {
                    if (!k60Var.M) {
                        for (int i14 = 0; i14 < k60Var.d.getChildCount(); i14++) {
                            View childAt = k60Var.d.getChildAt(i14);
                            if (k60Var.d.T(childAt).b() == k60Var.E + i13) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    k60Var.e.g(i13);
                }
                if (k60Var.f38699n != -1) {
                    if (!k60Var.M) {
                        for (int i15 = 0; i15 < k60Var.d.getChildCount(); i15++) {
                            View childAt2 = k60Var.d.getChildAt(i15);
                            if (k60Var.d.T(childAt2).b() == k60Var.E + k60Var.f38699n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    k60Var.e.g(k60Var.f38699n);
                }
                if (i10 != Integer.MAX_VALUE && !z11) {
                    k60Var.h.h1(L0 + 1, i10);
                }
                if (k60Var.M) {
                    k60Var.L.P("", false);
                    org.telegram.ui.k60.a0(k60Var).j(true);
                }
                cx0Var.dismiss();
                return;
            case 6:
                cx0Var.f25214o1.o();
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.f21583a).f2(cx0Var.getContext(), cx0Var.J1, 1, cx0Var.C1, true, true);
                return;
            case 7:
                cx0Var.f25214o1.o();
                hx0.b(cx0Var.J1.set, cx0Var.I0, cx0Var.getContext(), new mw0(cx0Var, 4));
                return;
            case 8:
                cx0Var.f25214o1.o();
                cx0Var.dismiss();
                org.telegram.messenger.i0.h3(new mw0(cx0Var, 3), 200L);
                return;
            case 9:
                cx0Var.dismiss();
                ax0 ax0Var = cx0Var.T1;
                if (ax0Var != null) {
                    ax0Var.a();
                }
                if (cx0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(cx0Var.f21583a).T.f(cx0Var.M1.f19813id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = cx0Var.M1;
                    ConnectionsManager.getInstance(cx0Var.f21583a).sendRequest(tL_messages_installStickerSet, new x1(cx0Var, 12));
                    return;
                }
                return;
            case 10:
                if (cx0Var.I1) {
                    cx0Var.L0();
                    return;
                } else {
                    cx0Var.N0();
                    return;
                }
            case 11:
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.f21583a).f2(cx0Var.getContext(), cx0Var.J1, 1, cx0Var.C1, true, cx0Var.a2);
                return;
            case 12:
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.f21583a).f2(cx0Var.getContext(), cx0Var.J1, 0, cx0Var.C1, true, cx0Var.a2);
                return;
            case 13:
                cx0 cx0Var2 = this.f27934b;
                Context context = cx0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String L02 = org.telegram.messenger.cd.L0(2131749248, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L02;
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748267, null), new au(27));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21222t5, cx0Var2.I0);
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                frameLayout.addView(g10, w7.b6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21241u5, org.telegram.ui.ActionBar.t6.f21258v5, org.telegram.ui.ActionBar.t6.f21170q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21037j5, cx0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, cx0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new pw0(cx0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.b6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new pt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749247, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(6.0f));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21169q5, cx0Var2.I0);
                linearLayout.addView(textView, w7.b6.o(-1, -2));
                x1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                x1Var.show();
                editTextBoldCursor.requestFocus();
                x1Var.d(-1).setOnClickListener(new mg.f(cx0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                return;
            default:
                cx0Var.dismiss();
                return;
        }
    }
}
