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
public final class tv0 implements View.OnClickListener {
    public final int f40070a;
    public final kw0 f40071b;

    public tv0(kw0 kw0Var, int i7) {
        this.f40070a = i7;
        this.f40071b = kw0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        int i7;
        int i10 = this.f40070a;
        kw0 kw0Var = this.f40071b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = kw0Var.G1;
                if (g2Var != null) {
                    new ug.y0(g2Var, 11, false).show();
                    return;
                } else if (kw0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) kw0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(kw0Var.f30170a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
                if (tL_messages_stickerSet != null && d02.E0(tL_messages_stickerSet.set.f28458id, true)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kw0Var.N1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && kw0Var.f37024t1 == null) {
                    kw0Var.f37023s1.e(3, 2131232775, org.telegram.messenger.gd.N0(2131744610, null));
                    kw0Var.f37023s1.e(4, 2131232118, org.telegram.messenger.gd.N0(2131751252, null));
                    if (z10) {
                        kw0Var.f37024t1 = kw0Var.f37023s1.e(5, 2131232110, org.telegram.messenger.gd.N0(2131751586, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, kw0Var.getContext(), kw0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232059, org.telegram.messenger.gd.N0(2131753753, null), false, kw0Var.J0).setOnClickListener(new tv0(kw0Var, 4));
                        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131744620, null), false, kw0Var.J0);
                        int i11 = org.telegram.ui.ActionBar.m6.f29619q7;
                        kw0Var.W(i11);
                        c10.c(i11, i11);
                        c10.h(0.1f, i11);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131744613, null), false, kw0Var.J0).setOnClickListener(new tv0(kw0Var, 6));
                        c10.setOnClickListener(new tv0(kw0Var, 7));
                        kw0Var.f37024t1 = kw0Var.f37023s1.i(2131232110, null, org.telegram.messenger.gd.N0(2131751586, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    kw0Var.f37023s1.a(-1);
                    aa0 aa0Var = new aa0(kw0Var.f30170a, 4, kw0Var.getContext(), new ArrayList(), kw0Var.J0);
                    aa0Var.setOnClickListener(new tv0(kw0Var, 8));
                    aa0Var.setTag(2131296439, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = kw0Var.f37023s1;
                    q0Var.q();
                    q0Var.f29899b.a(aa0Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29619q7, kw0Var.J0);
                    kw0Var.f37024t1.d(w02, w02);
                    kw0Var.f37024t1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
                    if (kw0Var.f37024t1.getRightIcon() != null) {
                        kw0Var.f37024t1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (kw0Var.f37023s1.getPopupLayout() != null) {
                    kw0Var.f37023s1.getPopupLayout().requestLayout();
                }
                kw0Var.f37023s1.V(null, null);
                return;
            case 2:
                kw0Var.P0();
                return;
            case 3:
                if (kw0Var.T1 != null) {
                    kw0Var.T0(kw0Var.P1);
                    kw0Var.P0();
                    kw0Var.P1 = null;
                    return;
                }
                kw0Var.W1.d(kw0Var.O1, null, kw0Var.N1, null, kw0Var.d2, true, 0, 0);
                kw0Var.dismiss();
                return;
            case 4:
                kw0Var.f37023s1.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                org.telegram.ui.i50 i50Var = kw0Var.Y1;
                org.telegram.ui.n50 n50Var = i50Var.f48580c;
                v4.c0 c0Var = n50Var.h;
                boolean z11 = n50Var.O;
                int L0 = c0Var.L0();
                mj0 mj0Var = (mj0) n50Var.d.K(L0);
                if (mj0Var != null) {
                    i7 = mj0Var.f59161a.getTop();
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                int i12 = n50Var.f50091n;
                if (i50Var.f48578a) {
                    n50Var.f50092r = null;
                    n50Var.f50093s = true;
                } else {
                    n50Var.f50092r = i50Var.f48579b;
                    n50Var.f50093s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.lz(i50Var, 10), 350L);
                }
                n50Var.m0();
                n50Var.k0(n50Var.f50092r, true);
                if (i12 != -1) {
                    if (!n50Var.N) {
                        for (int i13 = 0; i13 < n50Var.d.getChildCount(); i13++) {
                            View childAt = n50Var.d.getChildAt(i13);
                            if (n50Var.d.T(childAt).b() == n50Var.F + i12) {
                                ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                            }
                        }
                    }
                    n50Var.f50089e.g(i12);
                }
                if (n50Var.f50091n != -1) {
                    if (!n50Var.N) {
                        for (int i14 = 0; i14 < n50Var.d.getChildCount(); i14++) {
                            View childAt2 = n50Var.d.getChildAt(i14);
                            if (n50Var.d.T(childAt2).b() == n50Var.F + n50Var.f50091n) {
                                ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                            }
                        }
                    }
                    n50Var.f50089e.g(n50Var.f50091n);
                }
                if (i7 != Integer.MAX_VALUE && !z11) {
                    n50Var.h.h1(L0 + 1, i7);
                }
                if (n50Var.N) {
                    n50Var.M.Q("", false);
                    org.telegram.ui.n50.b0(n50Var).o(true);
                }
                kw0Var.dismiss();
                return;
            case 6:
                kw0Var.f37023s1.p();
                kw0Var.dismiss();
                org.telegram.messenger.ri.d0(kw0Var.f30170a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, true, true);
                return;
            case 7:
                kw0Var.f37023s1.p();
                pw0.b(kw0Var.N1.set, kw0Var.J0, kw0Var.getContext(), new vv0(kw0Var, 4));
                return;
            case 8:
                kw0Var.f37023s1.p();
                kw0Var.dismiss();
                org.telegram.messenger.g0.h3(new vv0(kw0Var, 3), 200L);
                return;
            case 9:
                kw0Var.dismiss();
                iw0 iw0Var = kw0Var.X1;
                if (iw0Var != null) {
                    iw0Var.a();
                }
                if (kw0Var.Q1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ri.d0(kw0Var.f30170a).U.f(kw0Var.Q1.f28451id);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                    tL_messages_installStickerSet.stickerset = kw0Var.Q1;
                    ConnectionsManager.getInstance(kw0Var.f30170a).sendRequest(tL_messages_installStickerSet, new f2(kw0Var, 12));
                    return;
                }
                return;
            case 10:
                if (kw0Var.M1) {
                    kw0Var.M0();
                    return;
                } else {
                    kw0Var.O0();
                    return;
                }
            case 11:
                kw0Var.dismiss();
                org.telegram.messenger.ri.d0(kw0Var.f30170a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, true, kw0Var.f37005e2);
                return;
            case 12:
                kw0Var.dismiss();
                org.telegram.messenger.ri.d0(kw0Var.f30170a).k2(kw0Var.getContext(), kw0Var.N1, 0, kw0Var.G1, true, kw0Var.f37005e2);
                return;
            case 13:
                kw0 kw0Var2 = this.f40071b;
                Context context = kw0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String N0 = org.telegram.messenger.gd.N0(2131749046, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748057, null), new xb0(17));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29674t5, kw0Var2.J0);
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
                org.telegram.ui.ActionBar.t6.F(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f29693u5, org.telegram.ui.ActionBar.m6.f29712v5, org.telegram.ui.ActionBar.m6.f29619q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f29486j5, kw0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, kw0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new xv0(kw0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ma.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new h(alertDialog$Builder, 9));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new qt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749045, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29617q5, kw0Var2.J0);
                linearLayout.addView(textView, c8.ma.o(-1, -2));
                t1Var.setOnShowListener(new p2(editTextBoldCursor, 2));
                t1Var.show();
                editTextBoldCursor.requestFocus();
                t1Var.d(-1).setOnClickListener(new w1(kw0Var2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, 3));
                return;
            default:
                kw0Var.dismiss();
                return;
        }
    }
}
