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
public final class lw0 implements View.OnClickListener {
    public final int f28297a;
    public final dx0 f28298b;

    public lw0(dx0 dx0Var, int i10) {
        this.f28297a = i10;
        this.f28298b = dx0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i10;
        int i11 = this.f28297a;
        dx0 dx0Var = this.f28298b;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = dx0Var.C1;
                if (k2Var != null) {
                    new kg.i1(k2Var, 11, false).show();
                    return;
                } else if (dx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) dx0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(dx0Var.f21584a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dx0Var.J1;
                if (tL_messages_stickerSet != null && b02.B0(tL_messages_stickerSet.set.f19821id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dx0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && dx0Var.f25628p1 == null) {
                    dx0Var.f25627o1.e(3, 2131232770, org.telegram.messenger.dd.L0(2131744869, null));
                    dx0Var.f25627o1.e(4, 2131232115, org.telegram.messenger.dd.L0(2131751265, null));
                    if (z10) {
                        dx0Var.f25628p1 = dx0Var.f25627o1.e(5, 2131232107, org.telegram.messenger.dd.L0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, dx0Var.getContext(), dx0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232056, org.telegram.messenger.dd.L0(2131753756, null), false, dx0Var.I0).setOnClickListener(new lw0(dx0Var, 4));
                        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131744879, null), false, dx0Var.I0);
                        int i12 = org.telegram.ui.ActionBar.t6.f21171q7;
                        dx0Var.W(i12);
                        c10.c(i12, i12);
                        c10.h(0.1f, i12);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131744872, null), false, dx0Var.I0).setOnClickListener(new lw0(dx0Var, 6));
                        c10.setOnClickListener(new lw0(dx0Var, 7));
                        dx0Var.f25628p1 = dx0Var.f25627o1.h(2131232107, null, org.telegram.messenger.dd.L0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    dx0Var.f25627o1.a(-1);
                    da0 da0Var = new da0(dx0Var.f21584a, 4, dx0Var.getContext(), new ArrayList(), dx0Var.I0);
                    da0Var.setOnClickListener(new lw0(dx0Var, 8));
                    da0Var.setTag(2131296437, 1);
                    org.telegram.ui.ActionBar.t0 t0Var = dx0Var.f25627o1;
                    t0Var.p();
                    t0Var.f20827b.a(da0Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q7, dx0Var.I0);
                    dx0Var.f25628p1.d(w02, w02);
                    dx0Var.f25628p1.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
                    if (dx0Var.f25628p1.getRightIcon() != null) {
                        dx0Var.f25628p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (dx0Var.f25627o1.getPopupLayout() != null) {
                    dx0Var.f25627o1.getPopupLayout().requestLayout();
                }
                dx0Var.f25627o1.U(null, null);
                return;
            case 2:
                dx0Var.O0();
                return;
            case 3:
                if (dx0Var.P1 != null) {
                    dx0Var.S0(dx0Var.L1);
                    dx0Var.O0();
                    dx0Var.L1 = null;
                    return;
                }
                dx0Var.S1.a(dx0Var.K1, null, dx0Var.J1, null, dx0Var.Z1, true, 0, 0);
                dx0Var.dismiss();
                return;
            case 4:
                dx0Var.f25627o1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.e60 e60Var = dx0Var.U1;
                org.telegram.ui.j60 j60Var = e60Var.f36747c;
                s4.a0 a0Var = j60Var.h;
                boolean z11 = j60Var.N;
                int L0 = a0Var.L0();
                dk0 dk0Var = (dk0) j60Var.d.K(L0);
                if (dk0Var != null) {
                    i10 = dk0Var.f47909a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i13 = j60Var.f38286n;
                if (e60Var.f36745a) {
                    j60Var.f38287r = null;
                    j60Var.f38288s = true;
                } else {
                    j60Var.f38287r = e60Var.f36746b;
                    j60Var.f38288s = false;
                }
                if (z11) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.yy(e60Var, 10), 350L);
                }
                j60Var.m0();
                j60Var.k0(j60Var.f38287r, true);
                if (i13 != -1) {
                    if (!j60Var.M) {
                        for (int i14 = 0; i14 < j60Var.d.getChildCount(); i14++) {
                            View childAt = j60Var.d.getChildAt(i14);
                            if (j60Var.d.T(childAt).b() == j60Var.E + i13) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    j60Var.e.g(i13);
                }
                if (j60Var.f38286n != -1) {
                    if (!j60Var.M) {
                        for (int i15 = 0; i15 < j60Var.d.getChildCount(); i15++) {
                            View childAt2 = j60Var.d.getChildAt(i15);
                            if (j60Var.d.T(childAt2).b() == j60Var.E + j60Var.f38286n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    j60Var.e.g(j60Var.f38286n);
                }
                if (i10 != Integer.MAX_VALUE && !z11) {
                    j60Var.h.h1(L0 + 1, i10);
                }
                if (j60Var.M) {
                    j60Var.L.P("", false);
                    org.telegram.ui.j60.b0(j60Var).j(true);
                }
                dx0Var.dismiss();
                return;
            case 6:
                dx0Var.f25627o1.o();
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.f21584a).f2(dx0Var.getContext(), dx0Var.J1, 1, dx0Var.C1, true, true);
                return;
            case 7:
                dx0Var.f25627o1.o();
                ix0.b(dx0Var.J1.set, dx0Var.I0, dx0Var.getContext(), new nw0(dx0Var, 4));
                return;
            case 8:
                dx0Var.f25627o1.o();
                dx0Var.dismiss();
                org.telegram.messenger.i0.h3(new nw0(dx0Var, 3), 200L);
                return;
            case 9:
                dx0Var.dismiss();
                bx0 bx0Var = dx0Var.T1;
                if (bx0Var != null) {
                    bx0Var.a();
                }
                if (dx0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.vi.b0(dx0Var.f21584a).T.f(dx0Var.M1.f19814id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = dx0Var.M1;
                    ConnectionsManager.getInstance(dx0Var.f21584a).sendRequest(tL_messages_installStickerSet, new x1(dx0Var, 12));
                    return;
                }
                return;
            case 10:
                if (dx0Var.I1) {
                    dx0Var.L0();
                    return;
                } else {
                    dx0Var.N0();
                    return;
                }
            case 11:
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.f21584a).f2(dx0Var.getContext(), dx0Var.J1, 1, dx0Var.C1, true, dx0Var.a2);
                return;
            case 12:
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.f21584a).f2(dx0Var.getContext(), dx0Var.J1, 0, dx0Var.C1, true, dx0Var.a2);
                return;
            case 13:
                dx0 dx0Var2 = this.f28298b;
                Context context = dx0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String L02 = org.telegram.messenger.dd.L0(2131749248, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L02;
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131748267, null), new au(27));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21223t5, dx0Var2.I0);
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
                org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21242u5, org.telegram.ui.ActionBar.t6.f21259v5, org.telegram.ui.ActionBar.t6.f21171q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21038j5, dx0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, dx0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new qw0(dx0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.b6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new pt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749247, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(6.0f));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q5, dx0Var2.I0);
                linearLayout.addView(textView, w7.b6.o(-1, -2));
                x1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                x1Var.show();
                editTextBoldCursor.requestFocus();
                x1Var.d(-1).setOnClickListener(new mg.f(dx0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                return;
            default:
                dx0Var.dismiss();
                return;
        }
    }
}
