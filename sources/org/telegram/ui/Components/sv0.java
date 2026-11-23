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
public final class sv0 implements View.OnClickListener {
    public final int f39720a;
    public final jw0 f39721b;

    public sv0(jw0 jw0Var, int i7) {
        this.f39720a = i7;
        this.f39721b = jw0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i7;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i10 = this.f39720a;
        jw0 jw0Var = this.f39721b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = jw0Var.G1;
                if (g2Var != null) {
                    new ug.y0(g2Var, 11, false).show();
                    return;
                } else if (jw0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) jw0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(jw0Var.f30223a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jw0Var.N1;
                if (tL_messages_stickerSet != null && d02.E0(tL_messages_stickerSet.set.f28519id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = jw0Var.N1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && jw0Var.f36549t1 == null) {
                    jw0Var.f36548s1.e(3, 2131232778, org.telegram.messenger.gd.N0(2131744610, null));
                    jw0Var.f36548s1.e(4, 2131232121, org.telegram.messenger.gd.N0(2131751252, null));
                    if (z10) {
                        jw0Var.f36549t1 = jw0Var.f36548s1.e(5, 2131232113, org.telegram.messenger.gd.N0(2131751586, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, jw0Var.getContext(), jw0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232062, org.telegram.messenger.gd.N0(2131753753, null), false, jw0Var.J0).setOnClickListener(new sv0(jw0Var, 4));
                        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131744620, null), false, jw0Var.J0);
                        int i11 = org.telegram.ui.ActionBar.n6.f29692q7;
                        jw0Var.W(i11);
                        c10.c(i11, i11);
                        c10.h(0.1f, i11);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131744613, null), false, jw0Var.J0).setOnClickListener(new sv0(jw0Var, 6));
                        c10.setOnClickListener(new sv0(jw0Var, 7));
                        jw0Var.f36549t1 = jw0Var.f36548s1.i(2131232113, null, org.telegram.messenger.gd.N0(2131751586, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    jw0Var.f36548s1.a(-1);
                    x90 x90Var = new x90(jw0Var.f30223a, 4, jw0Var.getContext(), new ArrayList(), jw0Var.J0);
                    x90Var.setOnClickListener(new sv0(jw0Var, 8));
                    x90Var.setTag(2131296439, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = jw0Var.f36548s1;
                    q0Var.q();
                    q0Var.f29959b.a(x90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29692q7, jw0Var.J0);
                    jw0Var.f36549t1.d(w02, w02);
                    jw0Var.f36549t1.setSelectorColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
                    if (jw0Var.f36549t1.getRightIcon() != null) {
                        jw0Var.f36549t1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (jw0Var.f36548s1.getPopupLayout() != null) {
                    jw0Var.f36548s1.getPopupLayout().requestLayout();
                }
                jw0Var.f36548s1.V(null, null);
                return;
            case 2:
                jw0Var.P0();
                return;
            case 3:
                if (jw0Var.T1 != null) {
                    jw0Var.T0(jw0Var.P1);
                    jw0Var.P0();
                    jw0Var.P1 = null;
                    return;
                }
                jw0Var.W1.d(jw0Var.O1, null, jw0Var.N1, null, jw0Var.d2, true, 0, 0);
                jw0Var.dismiss();
                return;
            case 4:
                jw0Var.f36548s1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.h50 h50Var = jw0Var.Y1;
                org.telegram.ui.n50 n50Var = h50Var.f48433c;
                v4.c0 c0Var = n50Var.h;
                boolean z11 = n50Var.O;
                int L0 = c0Var.L0();
                mj0 mj0Var = (mj0) n50Var.d.K(L0);
                if (mj0Var != null) {
                    i7 = mj0Var.f59245a.getTop();
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                int i12 = n50Var.f50226n;
                if (h50Var.f48431a) {
                    n50Var.f50227r = null;
                    n50Var.f50228s = true;
                } else {
                    n50Var.f50227r = h50Var.f48432b;
                    n50Var.f50228s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.kz(h50Var, 10), 350L);
                }
                n50Var.m0();
                n50Var.k0(n50Var.f50227r, true);
                if (i12 != -1) {
                    if (!n50Var.N) {
                        for (int i13 = 0; i13 < n50Var.d.getChildCount(); i13++) {
                            View childAt = n50Var.d.getChildAt(i13);
                            if (n50Var.d.T(childAt).b() == n50Var.F + i12) {
                                ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                            }
                        }
                    }
                    n50Var.f50224e.g(i12);
                }
                if (n50Var.f50226n != -1) {
                    if (!n50Var.N) {
                        for (int i14 = 0; i14 < n50Var.d.getChildCount(); i14++) {
                            View childAt2 = n50Var.d.getChildAt(i14);
                            if (n50Var.d.T(childAt2).b() == n50Var.F + n50Var.f50226n) {
                                ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                            }
                        }
                    }
                    n50Var.f50224e.g(n50Var.f50226n);
                }
                if (i7 != Integer.MAX_VALUE && !z11) {
                    n50Var.h.h1(L0 + 1, i7);
                }
                if (n50Var.N) {
                    n50Var.M.Q("", false);
                    z4Var = ((org.telegram.ui.ActionBar.g2) n50Var).simpleActionBar;
                    z4Var.o(true);
                }
                jw0Var.dismiss();
                return;
            case 6:
                jw0Var.f36548s1.p();
                jw0Var.dismiss();
                org.telegram.messenger.ri.d0(jw0Var.f30223a).k2(jw0Var.getContext(), jw0Var.N1, 1, jw0Var.G1, true, true);
                return;
            case 7:
                jw0Var.f36548s1.p();
                ow0.b(jw0Var.N1.set, jw0Var.J0, jw0Var.getContext(), new uv0(jw0Var, 4));
                return;
            case 8:
                jw0Var.f36548s1.p();
                jw0Var.dismiss();
                org.telegram.messenger.g0.h3(new uv0(jw0Var, 3), 200L);
                return;
            case 9:
                jw0Var.dismiss();
                hw0 hw0Var = jw0Var.X1;
                if (hw0Var != null) {
                    hw0Var.a();
                }
                if (jw0Var.Q1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ri.d0(jw0Var.f30223a).U.f(jw0Var.Q1.f28512id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = jw0Var.Q1;
                    ConnectionsManager.getInstance(jw0Var.f30223a).sendRequest(tL_messages_installStickerSet, new e2(jw0Var, 12));
                    return;
                }
                return;
            case 10:
                if (jw0Var.M1) {
                    jw0Var.M0();
                    return;
                } else {
                    jw0Var.O0();
                    return;
                }
            case 11:
                jw0Var.dismiss();
                org.telegram.messenger.ri.d0(jw0Var.f30223a).k2(jw0Var.getContext(), jw0Var.N1, 1, jw0Var.G1, true, jw0Var.f36530e2);
                return;
            case 12:
                jw0Var.dismiss();
                org.telegram.messenger.ri.d0(jw0Var.f30223a).k2(jw0Var.getContext(), jw0Var.N1, 0, jw0Var.G1, true, jw0Var.f36530e2);
                return;
            case 13:
                jw0 jw0Var2 = this.f39721b;
                Context context = jw0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String N0 = org.telegram.messenger.gd.N0(2131749046, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748057, null), new ub0(17));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.na.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29747t5, jw0Var2.J0);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setText("t.me/addstickers/");
                textView2.setInputType(16385);
                textView2.setGravity(51);
                textView2.setSingleLine(true);
                textView2.setVisibility(4);
                textView2.setImeOptions(6);
                textView2.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(textView2, c8.na.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29766u5, org.telegram.ui.ActionBar.n6.f29785v5, org.telegram.ui.ActionBar.n6.f29692q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29559j5, jw0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.G6, jw0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new wv0(jw0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.na.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new g(alertDialog$Builder, 9));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new ot(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749045, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29690q5, jw0Var2.J0);
                linearLayout.addView(textView, c8.na.o(-1, -2));
                t1Var.setOnShowListener(new o2(editTextBoldCursor, 2));
                t1Var.show();
                editTextBoldCursor.requestFocus();
                t1Var.d(-1).setOnClickListener(new v1(jw0Var2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, 3));
                return;
            default:
                jw0Var.dismiss();
                return;
        }
    }
}
