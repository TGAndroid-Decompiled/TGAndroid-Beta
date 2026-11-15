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
public final class iv0 implements View.OnClickListener {
    public final int f35741a;
    public final bw0 f35742b;

    public iv0(bw0 bw0Var, int i7) {
        this.f35741a = i7;
        this.f35742b = bw0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i7;
        org.telegram.ui.ActionBar.w4 w4Var;
        int i10 = this.f35741a;
        bw0 bw0Var = this.f35742b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = bw0Var.G1;
                if (e2Var != null) {
                    new ug.x0(e2Var, 11, false).show();
                    return;
                } else if (bw0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) bw0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(bw0Var.f29679a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
                if (tL_messages_stickerSet != null && b02.B0(tL_messages_stickerSet.set.f28078id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = bw0Var.N1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && bw0Var.f33418t1 == null) {
                    bw0Var.f33417s1.e(3, 2131232774, org.telegram.messenger.hd.M0(2131744851, null));
                    bw0Var.f33417s1.e(4, 2131232117, org.telegram.messenger.hd.M0(2131751264, null));
                    if (z10) {
                        bw0Var.f33418t1 = bw0Var.f33417s1.e(5, 2131232109, org.telegram.messenger.hd.M0(2131751598, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, bw0Var.getContext(), bw0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232058, org.telegram.messenger.hd.M0(2131753756, null), false, bw0Var.J0).setOnClickListener(new iv0(bw0Var, 4));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131744861, null), false, bw0Var.J0);
                        int i11 = org.telegram.ui.ActionBar.j6.f29090q7;
                        bw0Var.W(i11);
                        c10.c(i11, i11);
                        c10.h(0.1f, i11);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131744854, null), false, bw0Var.J0).setOnClickListener(new iv0(bw0Var, 6));
                        c10.setOnClickListener(new iv0(bw0Var, 7));
                        bw0Var.f33418t1 = bw0Var.f33417s1.i(2131232109, null, org.telegram.messenger.hd.M0(2131751598, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    bw0Var.f33417s1.a(-1);
                    n90 n90Var = new n90(bw0Var.f29679a, 4, bw0Var.getContext(), new ArrayList(), bw0Var.J0);
                    n90Var.setOnClickListener(new iv0(bw0Var, 8));
                    n90Var.setTag(2131296437, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = bw0Var.f33417s1;
                    q0Var.q();
                    q0Var.f29497b.a(n90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29090q7, bw0Var.J0);
                    bw0Var.f33418t1.d(w02, w02);
                    bw0Var.f33418t1.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
                    if (bw0Var.f33418t1.getRightIcon() != null) {
                        bw0Var.f33418t1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (bw0Var.f33417s1.getPopupLayout() != null) {
                    bw0Var.f33417s1.getPopupLayout().requestLayout();
                }
                bw0Var.f33417s1.V(null, null);
                return;
            case 2:
                bw0Var.O0();
                return;
            case 3:
                if (bw0Var.T1 != null) {
                    bw0Var.S0(bw0Var.P1);
                    bw0Var.O0();
                    bw0Var.P1 = null;
                    return;
                }
                bw0Var.W1.d(bw0Var.O1, null, bw0Var.N1, null, bw0Var.d2, true, 0, 0);
                bw0Var.dismiss();
                return;
            case 4:
                bw0Var.f33417s1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.f50 f50Var = bw0Var.Y1;
                org.telegram.ui.l50 l50Var = f50Var.f47010c;
                v4.b0 b0Var = l50Var.h;
                boolean z11 = l50Var.O;
                int L0 = b0Var.L0();
                cj0 cj0Var = (cj0) l50Var.d.K(L0);
                if (cj0Var != null) {
                    i7 = cj0Var.f58535a.getTop();
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                int i12 = l50Var.f48850n;
                if (f50Var.f47008a) {
                    l50Var.f48851r = null;
                    l50Var.f48852s = true;
                } else {
                    l50Var.f48851r = f50Var.f47009b;
                    l50Var.f48852s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.iz(f50Var, 10), 350L);
                }
                l50Var.m0();
                l50Var.k0(l50Var.f48851r, true);
                if (i12 != -1) {
                    if (!l50Var.N) {
                        for (int i13 = 0; i13 < l50Var.d.getChildCount(); i13++) {
                            View childAt = l50Var.d.getChildAt(i13);
                            if (l50Var.d.T(childAt).b() == l50Var.F + i12) {
                                ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                            }
                        }
                    }
                    l50Var.f48848e.g(i12);
                }
                if (l50Var.f48850n != -1) {
                    if (!l50Var.N) {
                        for (int i14 = 0; i14 < l50Var.d.getChildCount(); i14++) {
                            View childAt2 = l50Var.d.getChildAt(i14);
                            if (l50Var.d.T(childAt2).b() == l50Var.F + l50Var.f48850n) {
                                ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                            }
                        }
                    }
                    l50Var.f48848e.g(l50Var.f48850n);
                }
                if (i7 != Integer.MAX_VALUE && !z11) {
                    l50Var.h.h1(L0 + 1, i7);
                }
                if (l50Var.N) {
                    l50Var.M.Q("", false);
                    w4Var = ((org.telegram.ui.ActionBar.e2) l50Var).simpleActionBar;
                    w4Var.m(true);
                }
                bw0Var.dismiss();
                return;
            case 6:
                bw0Var.f33417s1.p();
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.f29679a).f2(bw0Var.getContext(), bw0Var.N1, 1, bw0Var.G1, true, true);
                return;
            case 7:
                bw0Var.f33417s1.p();
                gw0.b(bw0Var.N1.set, bw0Var.J0, bw0Var.getContext(), new kv0(bw0Var, 4));
                return;
            case 8:
                bw0Var.f33417s1.p();
                bw0Var.dismiss();
                org.telegram.messenger.g0.i3(new kv0(bw0Var, 3), 200L);
                return;
            case 9:
                bw0Var.dismiss();
                zv0 zv0Var = bw0Var.X1;
                if (zv0Var != null) {
                    zv0Var.a();
                }
                if (bw0Var.Q1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.si.b0(bw0Var.f29679a).U.f(bw0Var.Q1.f28071id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = bw0Var.Q1;
                    ConnectionsManager.getInstance(bw0Var.f29679a).sendRequest(tL_messages_installStickerSet, new v1(bw0Var, 12));
                    return;
                }
                return;
            case 10:
                if (bw0Var.M1) {
                    bw0Var.L0();
                    return;
                } else {
                    bw0Var.N0();
                    return;
                }
            case 11:
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.f29679a).f2(bw0Var.getContext(), bw0Var.N1, 1, bw0Var.G1, true, bw0Var.f33399e2);
                return;
            case 12:
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.f29679a).f2(bw0Var.getContext(), bw0Var.N1, 0, bw0Var.G1, true, bw0Var.f33399e2);
                return;
            case 13:
                bw0 bw0Var2 = this.f35742b;
                Context context = bw0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.hd.M0(2131749239, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748250, null), new rb0(16));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ja.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.f29145t5, bw0Var2.J0);
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(g10, c8.ja.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.q6.F(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f29164u5, org.telegram.ui.ActionBar.j6.f29183v5, org.telegram.ui.ActionBar.j6.f29090q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f28957j5, bw0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.G6, bw0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new nv0(bw0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ja.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new q0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new jt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749238, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29088q5, bw0Var2.J0);
                linearLayout.addView(textView, c8.ja.o(-1, -2));
                t1Var.setOnShowListener(new f2(editTextBoldCursor, 2));
                t1Var.show();
                editTextBoldCursor.requestFocus();
                t1Var.d(-1).setOnClickListener(new l1(bw0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                bw0Var.dismiss();
                return;
        }
    }
}
