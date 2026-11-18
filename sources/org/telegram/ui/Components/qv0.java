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
public final class qv0 implements View.OnClickListener {
    public final int f38921a;
    public final iw0 f38922b;

    public qv0(iw0 iw0Var, int i7) {
        this.f38921a = i7;
        this.f38922b = iw0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i7;
        int i10 = this.f38921a;
        iw0 iw0Var = this.f38922b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = iw0Var.G1;
                if (h2Var != null) {
                    new ug.z0(h2Var, 11, false).show();
                    return;
                } else if (iw0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) iw0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(iw0Var.f30189a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iw0Var.N1;
                if (tL_messages_stickerSet != null && d02.E0(tL_messages_stickerSet.set.f28432id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iw0Var.N1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && iw0Var.f36255t1 == null) {
                    iw0Var.f36254s1.e(3, 2131232775, org.telegram.messenger.gd.M0(2131744616, null));
                    iw0Var.f36254s1.e(4, 2131232118, org.telegram.messenger.gd.M0(2131751253, null));
                    if (z10) {
                        iw0Var.f36255t1 = iw0Var.f36254s1.e(5, 2131232110, org.telegram.messenger.gd.M0(2131751587, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, iw0Var.getContext(), iw0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232059, org.telegram.messenger.gd.M0(2131753754, null), false, iw0Var.J0).setOnClickListener(new qv0(iw0Var, 4));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131744626, null), false, iw0Var.J0);
                        int i11 = org.telegram.ui.ActionBar.n6.f29637q7;
                        iw0Var.W(i11);
                        c10.c(i11, i11);
                        c10.h(0.1f, i11);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131744619, null), false, iw0Var.J0).setOnClickListener(new qv0(iw0Var, 6));
                        c10.setOnClickListener(new qv0(iw0Var, 7));
                        iw0Var.f36255t1 = iw0Var.f36254s1.i(2131232110, null, org.telegram.messenger.gd.M0(2131751587, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    iw0Var.f36254s1.a(-1);
                    y90 y90Var = new y90(iw0Var.f30189a, 4, iw0Var.getContext(), new ArrayList(), iw0Var.J0);
                    y90Var.setOnClickListener(new qv0(iw0Var, 8));
                    y90Var.setTag(2131296437, 1);
                    org.telegram.ui.ActionBar.r0 r0Var = iw0Var.f36254s1;
                    r0Var.q();
                    r0Var.f29918b.a(y90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29637q7, iw0Var.J0);
                    iw0Var.f36255t1.d(w02, w02);
                    iw0Var.f36255t1.setSelectorColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
                    if (iw0Var.f36255t1.getRightIcon() != null) {
                        iw0Var.f36255t1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (iw0Var.f36254s1.getPopupLayout() != null) {
                    iw0Var.f36254s1.getPopupLayout().requestLayout();
                }
                iw0Var.f36254s1.V(null, null);
                return;
            case 2:
                iw0Var.P0();
                return;
            case 3:
                if (iw0Var.T1 != null) {
                    iw0Var.T0(iw0Var.P1);
                    iw0Var.P0();
                    iw0Var.P1 = null;
                    return;
                }
                iw0Var.W1.d(iw0Var.O1, null, iw0Var.N1, null, iw0Var.d2, true, 0, 0);
                iw0Var.dismiss();
                return;
            case 4:
                iw0Var.f36254s1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.i50 i50Var = iw0Var.Y1;
                org.telegram.ui.n50 n50Var = i50Var.f48586c;
                v4.c0 c0Var = n50Var.h;
                boolean z11 = n50Var.O;
                int L0 = c0Var.L0();
                kj0 kj0Var = (kj0) n50Var.d.K(L0);
                if (kj0Var != null) {
                    i7 = kj0Var.f59122a.getTop();
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                int i12 = n50Var.f50088n;
                if (i50Var.f48584a) {
                    n50Var.f50089r = null;
                    n50Var.f50090s = true;
                } else {
                    n50Var.f50089r = i50Var.f48585b;
                    n50Var.f50090s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.lz(i50Var, 10), 350L);
                }
                n50Var.m0();
                n50Var.k0(n50Var.f50089r, true);
                if (i12 != -1) {
                    if (!n50Var.N) {
                        for (int i13 = 0; i13 < n50Var.d.getChildCount(); i13++) {
                            View childAt = n50Var.d.getChildAt(i13);
                            if (n50Var.d.T(childAt).b() == n50Var.F + i12) {
                                ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                            }
                        }
                    }
                    n50Var.f50086e.g(i12);
                }
                if (n50Var.f50088n != -1) {
                    if (!n50Var.N) {
                        for (int i14 = 0; i14 < n50Var.d.getChildCount(); i14++) {
                            View childAt2 = n50Var.d.getChildAt(i14);
                            if (n50Var.d.T(childAt2).b() == n50Var.F + n50Var.f50088n) {
                                ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                            }
                        }
                    }
                    n50Var.f50086e.g(n50Var.f50088n);
                }
                if (i7 != Integer.MAX_VALUE && !z11) {
                    n50Var.h.h1(L0 + 1, i7);
                }
                if (n50Var.N) {
                    n50Var.M.Q("", false);
                    org.telegram.ui.n50.b0(n50Var).o(true);
                }
                iw0Var.dismiss();
                return;
            case 6:
                iw0Var.f36254s1.p();
                iw0Var.dismiss();
                org.telegram.messenger.ri.d0(iw0Var.f30189a).k2(iw0Var.getContext(), iw0Var.N1, 1, iw0Var.G1, true, true);
                return;
            case 7:
                iw0Var.f36254s1.p();
                nw0.b(iw0Var.N1.set, iw0Var.J0, iw0Var.getContext(), new tv0(iw0Var, 4));
                return;
            case 8:
                iw0Var.f36254s1.p();
                iw0Var.dismiss();
                org.telegram.messenger.g0.h3(new tv0(iw0Var, 3), 200L);
                return;
            case 9:
                iw0Var.dismiss();
                gw0 gw0Var = iw0Var.X1;
                if (gw0Var != null) {
                    gw0Var.a();
                }
                if (iw0Var.Q1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ri.d0(iw0Var.f30189a).U.f(iw0Var.Q1.f28425id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = iw0Var.Q1;
                    ConnectionsManager.getInstance(iw0Var.f30189a).sendRequest(tL_messages_installStickerSet, new e2(iw0Var, 12));
                    return;
                }
                return;
            case 10:
                if (iw0Var.M1) {
                    iw0Var.M0();
                    return;
                } else {
                    iw0Var.O0();
                    return;
                }
            case 11:
                iw0Var.dismiss();
                org.telegram.messenger.ri.d0(iw0Var.f30189a).k2(iw0Var.getContext(), iw0Var.N1, 1, iw0Var.G1, true, iw0Var.f36236e2);
                return;
            case 12:
                iw0Var.dismiss();
                org.telegram.messenger.ri.d0(iw0Var.f30189a).k2(iw0Var.getContext(), iw0Var.N1, 0, iw0Var.G1, true, iw0Var.f36236e2);
                return;
            case 13:
                iw0 iw0Var2 = this.f38922b;
                Context context = iw0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.gd.M0(2131749047, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131748058, null), new wb0(17));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29692t5, iw0Var2.J0);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setText("t.me/addstickers/");
                textView2.setInputType(16385);
                textView2.setGravity(51);
                textView2.setSingleLine(true);
                textView2.setVisibility(4);
                textView2.setImeOptions(6);
                textView2.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(textView2, c8.ma.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29711u5, org.telegram.ui.ActionBar.n6.f29730v5, org.telegram.ui.ActionBar.n6.f29637q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29504j5, iw0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.G6, iw0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new vv0(iw0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ma.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new g(alertDialog$Builder, 9));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new ot(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749046, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q5, iw0Var2.J0);
                linearLayout.addView(textView, c8.ma.o(-1, -2));
                u1Var.setOnShowListener(new o2(editTextBoldCursor, 2));
                u1Var.show();
                editTextBoldCursor.requestFocus();
                u1Var.d(-1).setOnClickListener(new v1(iw0Var2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, 3));
                return;
            default:
                iw0Var.dismiss();
                return;
        }
    }
}
