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
    public final int f34863a;
    public final zv0 f34864b;

    public iv0(zv0 zv0Var, int i7) {
        this.f34863a = i7;
        this.f34864b = zv0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        TLRPC.StickerSet stickerSet;
        int i7;
        org.telegram.ui.ActionBar.y4 y4Var;
        int i10 = this.f34863a;
        zv0 zv0Var = this.f34864b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = zv0Var.C1;
                if (f2Var != null) {
                    new ug.w0(f2Var, 11, false).show();
                    return;
                } else if (zv0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) zv0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(zv0Var.f28621a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
                if (tL_messages_stickerSet != null && b02.B0(tL_messages_stickerSet.set.f26983id, true)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = zv0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && zv0Var.f41161p1 == null) {
                    zv0Var.f41160o1.e(3, 2131232773, org.telegram.messenger.id.M0(2131744851, null));
                    zv0Var.f41160o1.e(4, 2131232116, org.telegram.messenger.id.M0(2131751264, null));
                    if (z9) {
                        zv0Var.f41161p1 = zv0Var.f41160o1.e(5, 2131232108, org.telegram.messenger.id.M0(2131751598, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, zv0Var.getContext(), zv0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232057, org.telegram.messenger.id.M0(2131753756, null), false, zv0Var.I0).setOnClickListener(new iv0(zv0Var, 4));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131744861, null), false, zv0Var.I0);
                        int i11 = org.telegram.ui.ActionBar.l6.f28106q7;
                        zv0Var.V(i11);
                        c10.c(i11, i11);
                        c10.h(0.1f, i11);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131744854, null), false, zv0Var.I0).setOnClickListener(new iv0(zv0Var, 6));
                        c10.setOnClickListener(new iv0(zv0Var, 7));
                        zv0Var.f41161p1 = zv0Var.f41160o1.h(2131232108, null, org.telegram.messenger.id.M0(2131751598, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    zv0Var.f41160o1.a(-1);
                    m90 m90Var = new m90(zv0Var.f28621a, 4, zv0Var.getContext(), new ArrayList(), zv0Var.I0);
                    m90Var.setOnClickListener(new iv0(zv0Var, 8));
                    m90Var.setTag(2131296437, 1);
                    org.telegram.ui.ActionBar.r0 r0Var = zv0Var.f41160o1;
                    r0Var.p();
                    r0Var.f28425b.a(m90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28106q7, zv0Var.I0);
                    zv0Var.f41161p1.d(w02, w02);
                    zv0Var.f41161p1.setSelectorColor(org.telegram.ui.ActionBar.l6.r1(0.1f, w02));
                    if (zv0Var.f41161p1.getRightIcon() != null) {
                        zv0Var.f41161p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (zv0Var.f41160o1.getPopupLayout() != null) {
                    zv0Var.f41160o1.getPopupLayout().requestLayout();
                }
                zv0Var.f41160o1.U(null, null);
                return;
            case 2:
                zv0Var.O0();
                return;
            case 3:
                if (zv0Var.P1 != null) {
                    zv0Var.S0(zv0Var.L1);
                    zv0Var.O0();
                    zv0Var.L1 = null;
                    return;
                }
                zv0Var.S1.a(zv0Var.K1, null, zv0Var.J1, null, zv0Var.Z1, true, 0, 0);
                zv0Var.dismiss();
                return;
            case 4:
                zv0Var.f41160o1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.i50 i50Var = zv0Var.U1;
                org.telegram.ui.o50 o50Var = i50Var.f46471c;
                v4.b0 b0Var = o50Var.h;
                boolean z10 = o50Var.N;
                int L0 = b0Var.L0();
                yi0 yi0Var = (yi0) o50Var.d.K(L0);
                if (yi0Var != null) {
                    i7 = yi0Var.f57056a.getTop();
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                int i12 = o50Var.f48345n;
                if (i50Var.f46469a) {
                    o50Var.f48346r = null;
                    o50Var.f48347s = true;
                } else {
                    o50Var.f48346r = i50Var.f46470b;
                    o50Var.f48347s = false;
                }
                if (z10) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.jz(i50Var, 10), 350L);
                }
                o50Var.m0();
                o50Var.k0(o50Var.f48346r, true);
                if (i12 != -1) {
                    if (!o50Var.M) {
                        for (int i13 = 0; i13 < o50Var.d.getChildCount(); i13++) {
                            View childAt = o50Var.d.getChildAt(i13);
                            if (o50Var.d.T(childAt).b() == o50Var.E + i12) {
                                ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                            }
                        }
                    }
                    o50Var.f48343e.g(i12);
                }
                if (o50Var.f48345n != -1) {
                    if (!o50Var.M) {
                        for (int i14 = 0; i14 < o50Var.d.getChildCount(); i14++) {
                            View childAt2 = o50Var.d.getChildAt(i14);
                            if (o50Var.d.T(childAt2).b() == o50Var.E + o50Var.f48345n) {
                                ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                            }
                        }
                    }
                    o50Var.f48343e.g(o50Var.f48345n);
                }
                if (i7 != Integer.MAX_VALUE && !z10) {
                    o50Var.h.h1(L0 + 1, i7);
                }
                if (o50Var.M) {
                    o50Var.L.P("", false);
                    y4Var = ((org.telegram.ui.ActionBar.f2) o50Var).simpleActionBar;
                    y4Var.k(true);
                }
                zv0Var.dismiss();
                return;
            case 6:
                zv0Var.f41160o1.o();
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.f28621a).f2(zv0Var.getContext(), zv0Var.J1, 1, zv0Var.C1, true, true);
                return;
            case 7:
                zv0Var.f41160o1.o();
                ew0.b(zv0Var.J1.set, zv0Var.I0, zv0Var.getContext(), new kv0(zv0Var, 4));
                return;
            case 8:
                zv0Var.f41160o1.o();
                zv0Var.dismiss();
                org.telegram.messenger.g0.i3(new kv0(zv0Var, 3), 200L);
                return;
            case 9:
                zv0Var.dismiss();
                xv0 xv0Var = zv0Var.T1;
                if (xv0Var != null) {
                    xv0Var.a();
                }
                if (zv0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(zv0Var.f28621a).T.f(zv0Var.M1.f26976id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = zv0Var.M1;
                    ConnectionsManager.getInstance(zv0Var.f28621a).sendRequest(tL_messages_installStickerSet, new x1(zv0Var, 12));
                    return;
                }
                return;
            case 10:
                if (zv0Var.I1) {
                    zv0Var.L0();
                    return;
                } else {
                    zv0Var.N0();
                    return;
                }
            case 11:
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.f28621a).f2(zv0Var.getContext(), zv0Var.J1, 1, zv0Var.C1, true, zv0Var.f41144a2);
                return;
            case 12:
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.f28621a).f2(zv0Var.getContext(), zv0Var.J1, 0, zv0Var.C1, true, zv0Var.f41144a2);
                return;
            case 13:
                zv0 zv0Var2 = this.f34864b;
                Context context = zv0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.id.M0(2131749239, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131748250, null), new jl0(10));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.f28161t5, zv0Var2.I0);
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(g10, c8.ha.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.s6.F(editTextBoldCursor, org.telegram.ui.ActionBar.l6.f28180u5, org.telegram.ui.ActionBar.l6.f28199v5, org.telegram.ui.ActionBar.l6.f28106q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, org.telegram.ui.ActionBar.l6.f27973j5, zv0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.l6.G6, zv0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new mv0(zv0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ha.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new ct(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749238, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28104q5, zv0Var2.I0);
                linearLayout.addView(textView, c8.ha.o(-1, -2));
                u1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                u1Var.show();
                editTextBoldCursor.requestFocus();
                u1Var.d(-1).setOnClickListener(new n1(zv0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                zv0Var.dismiss();
                return;
        }
    }
}
