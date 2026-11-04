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
public final class fv0 implements View.OnClickListener {
    public final int f33876a;
    public final xv0 f33877b;

    public fv0(xv0 xv0Var, int i3) {
        this.f33876a = i3;
        this.f33877b = xv0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i3;
        org.telegram.ui.ActionBar.y4 y4Var;
        int i10 = this.f33876a;
        xv0 xv0Var = this.f33877b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = xv0Var.D1;
                if (d2Var != null) {
                    new vg.v0(d2Var, 11, false).show();
                    return;
                } else if (xv0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xv0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(xv0Var.f28583a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
                if (tL_messages_stickerSet != null && b02.B0(tL_messages_stickerSet.set.f27028id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && xv0Var.f40524q1 == null) {
                    xv0Var.f40523p1.e(3, 2131232771, org.telegram.messenger.bd.M0(2131744861, null));
                    xv0Var.f40523p1.e(4, 2131232116, org.telegram.messenger.bd.M0(2131751265, null));
                    if (z10) {
                        xv0Var.f40524q1 = xv0Var.f40523p1.e(5, 2131232108, org.telegram.messenger.bd.M0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, xv0Var.getContext(), xv0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232057, org.telegram.messenger.bd.M0(2131753756, null), false, xv0Var.J0).setOnClickListener(new fv0(xv0Var, 4));
                        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131744871, null), false, xv0Var.J0);
                        int i11 = org.telegram.ui.ActionBar.k6.f28122q7;
                        xv0Var.V(i11);
                        c2.c(i11, i11);
                        c2.h(0.1f, i11);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131744864, null), false, xv0Var.J0).setOnClickListener(new fv0(xv0Var, 6));
                        c2.setOnClickListener(new fv0(xv0Var, 7));
                        xv0Var.f40524q1 = xv0Var.f40523p1.h(2131232108, null, org.telegram.messenger.bd.M0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    xv0Var.f40523p1.a(-1);
                    h90 h90Var = new h90(xv0Var.f28583a, 4, xv0Var.getContext(), new ArrayList(), xv0Var.J0);
                    h90Var.setOnClickListener(new fv0(xv0Var, 8));
                    h90Var.setTag(2131296437, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = xv0Var.f40523p1;
                    q0Var.p();
                    q0Var.f28440b.a(h90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, xv0Var.J0);
                    xv0Var.f40524q1.d(w02, w02);
                    xv0Var.f40524q1.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
                    if (xv0Var.f40524q1.getRightIcon() != null) {
                        xv0Var.f40524q1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (xv0Var.f40523p1.getPopupLayout() != null) {
                    xv0Var.f40523p1.getPopupLayout().requestLayout();
                }
                xv0Var.f40523p1.U(null, null);
                return;
            case 2:
                xv0Var.O0();
                return;
            case 3:
                if (xv0Var.Q1 != null) {
                    xv0Var.S0(xv0Var.M1);
                    xv0Var.O0();
                    xv0Var.M1 = null;
                    return;
                }
                xv0Var.T1.a(xv0Var.L1, null, xv0Var.K1, null, xv0Var.f40506a2, true, 0, 0);
                xv0Var.dismiss();
                return;
            case 4:
                xv0Var.f40523p1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.b50 b50Var = xv0Var.V1;
                org.telegram.ui.g50 g50Var = b50Var.f43930c;
                u4.b0 b0Var = g50Var.h;
                boolean z11 = g50Var.O;
                int L0 = b0Var.L0();
                bj0 bj0Var = (bj0) g50Var.d.K(L0);
                if (bj0Var != null) {
                    i3 = bj0Var.f55540a.getTop();
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                int i12 = g50Var.f45538n;
                if (b50Var.f43928a) {
                    g50Var.f45539r = null;
                    g50Var.f45540s = true;
                } else {
                    g50Var.f45539r = b50Var.f43929b;
                    g50Var.f45540s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.fz(b50Var, 9), 350L);
                }
                g50Var.m0();
                g50Var.k0(g50Var.f45539r, true);
                if (i12 != -1) {
                    if (!g50Var.N) {
                        for (int i13 = 0; i13 < g50Var.d.getChildCount(); i13++) {
                            View childAt = g50Var.d.getChildAt(i13);
                            if (g50Var.d.T(childAt).b() == g50Var.F + i12) {
                                ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                            }
                        }
                    }
                    g50Var.f45536e.g(i12);
                }
                if (g50Var.f45538n != -1) {
                    if (!g50Var.N) {
                        for (int i14 = 0; i14 < g50Var.d.getChildCount(); i14++) {
                            View childAt2 = g50Var.d.getChildAt(i14);
                            if (g50Var.d.T(childAt2).b() == g50Var.F + g50Var.f45538n) {
                                ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                            }
                        }
                    }
                    g50Var.f45536e.g(g50Var.f45538n);
                }
                if (i3 != Integer.MAX_VALUE && !z11) {
                    g50Var.h.h1(L0 + 1, i3);
                }
                if (g50Var.N) {
                    g50Var.M.P("", false);
                    y4Var = ((org.telegram.ui.ActionBar.d2) g50Var).simpleActionBar;
                    y4Var.j(true);
                }
                xv0Var.dismiss();
                return;
            case 6:
                xv0Var.f40523p1.o();
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.f28583a).f2(xv0Var.getContext(), xv0Var.K1, 1, xv0Var.D1, true, true);
                return;
            case 7:
                xv0Var.f40523p1.o();
                cw0.b(xv0Var.K1.set, xv0Var.J0, xv0Var.getContext(), new hv0(xv0Var, 4));
                return;
            case 8:
                xv0Var.f40523p1.o();
                xv0Var.dismiss();
                org.telegram.messenger.g0.i3(new hv0(xv0Var, 3), 200L);
                return;
            case 9:
                xv0Var.dismiss();
                vv0 vv0Var = xv0Var.U1;
                if (vv0Var != null) {
                    vv0Var.a();
                }
                if (xv0Var.N1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.li.b0(xv0Var.f28583a).U.f(xv0Var.N1.f27021id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = xv0Var.N1;
                    ConnectionsManager.getInstance(xv0Var.f28583a).sendRequest(tL_messages_installStickerSet, new w1(xv0Var, 12));
                    return;
                }
                return;
            case 10:
                if (xv0Var.J1) {
                    xv0Var.L0();
                    return;
                } else {
                    xv0Var.N0();
                    return;
                }
            case 11:
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.f28583a).f2(xv0Var.getContext(), xv0Var.K1, 1, xv0Var.D1, true, xv0Var.f40507b2);
                return;
            case 12:
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.f28583a).f2(xv0Var.getContext(), xv0Var.K1, 0, xv0Var.D1, true, xv0Var.f40507b2);
                return;
            case 13:
                xv0 xv0Var2 = this.f33877b;
                Context context = xv0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.bd.M0(2131749247, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748258, null), new lf0(11));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g7 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.f28176t5, xv0Var2.J0);
                g7.setMaxLines(1);
                g7.setLines(1);
                g7.setText("t.me/addstickers/");
                g7.setInputType(16385);
                g7.setGravity(51);
                g7.setSingleLine(true);
                g7.setVisibility(4);
                g7.setImeOptions(6);
                g7.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(g7, b8.mf.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28195u5, org.telegram.ui.ActionBar.k6.f28213v5, org.telegram.ui.ActionBar.k6.f28122q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27988j5, xv0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, xv0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new kv0(xv0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, b8.mf.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new s0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new at(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749246, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28120q5, xv0Var2.J0);
                linearLayout.addView(textView, b8.mf.o(-1, -2));
                s1Var.setOnShowListener(new e2(editTextBoldCursor, 2));
                s1Var.show();
                editTextBoldCursor.requestFocus();
                s1Var.d(-1).setOnClickListener(new m1(xv0Var2, iArr, editTextBoldCursor, textView, g7, alertDialog$Builder, 3));
                return;
            default:
                xv0Var.dismiss();
                return;
        }
    }
}
