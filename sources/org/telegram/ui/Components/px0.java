package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class px0 implements View.OnClickListener {
    public final int f27457a;
    public final gy0 f27458b;

    public px0(gy0 gy0Var, int i10) {
        this.f27457a = i10;
        this.f27458b = gy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f27457a) {
            case 0:
                gy0 gy0Var = this.f27458b;
                org.telegram.ui.ActionBar.n2 n2Var = gy0Var.L;
                if (n2Var != null) {
                    new rg.x0(n2Var, 11, false).show();
                    return;
                } else if (gy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) gy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                gy0.H(this.f27458b);
                return;
            case 2:
                this.f27458b.q0();
                return;
            case 3:
                gy0 gy0Var2 = this.f27458b;
                if (gy0Var2.Y != null) {
                    gy0Var2.u0(gy0Var2.U);
                    gy0Var2.q0();
                    gy0Var2.U = null;
                    return;
                }
                gy0Var2.f24478b0.d(gy0Var2.T, null, gy0Var2.S, null, gy0Var2.f24487i0, true, 0, 0);
                gy0Var2.dismiss();
                return;
            case 4:
                this.f27458b.f24491n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                gy0 gy0Var3 = this.f27458b;
                org.telegram.ui.o70 o70Var = gy0Var3.f24481d0;
                org.telegram.ui.t70 t70Var = o70Var.f36202c;
                s4.c0 c0Var = t70Var.h;
                boolean z10 = t70Var.N;
                int L0 = c0Var.L0();
                fl0 fl0Var = (fl0) t70Var.d.L(L0);
                if (fl0Var != null) {
                    i10 = fl0Var.f42974a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = t70Var.f37659n;
                if (o70Var.f36200a) {
                    t70Var.f37660r = null;
                    t70Var.f37661s = true;
                } else {
                    t70Var.f37660r = o70Var.f36201b;
                    t70Var.f37661s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(o70Var, 9), 350L);
                }
                t70Var.h0();
                t70Var.f0(t70Var.f37660r, true);
                if (i11 != -1) {
                    if (!t70Var.M) {
                        for (int i12 = 0; i12 < t70Var.d.getChildCount(); i12++) {
                            View childAt = t70Var.d.getChildAt(i12);
                            if (t70Var.d.U(childAt).b() == t70Var.E + i11) {
                                ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                            }
                        }
                    }
                    t70Var.e.m(i11);
                }
                if (t70Var.f37659n != -1) {
                    if (!t70Var.M) {
                        for (int i13 = 0; i13 < t70Var.d.getChildCount(); i13++) {
                            View childAt2 = t70Var.d.getChildAt(i13);
                            if (t70Var.d.U(childAt2).b() == t70Var.E + t70Var.f37659n) {
                                ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                            }
                        }
                    }
                    t70Var.e.m(t70Var.f37659n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    t70Var.h.h1(L0 + 1, i10);
                }
                if (t70Var.M) {
                    t70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) t70Var).actionBar;
                    kVar.h(true);
                }
                gy0Var3.dismiss();
                return;
            case 6:
                gy0.r(this.f27458b);
                return;
            case 7:
                gy0.n(this.f27458b);
                return;
            case 8:
                gy0 gy0Var4 = this.f27458b;
                gy0Var4.f24491n.n();
                gy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new rx0(gy0Var4, 3), 200L);
                return;
            case 9:
                gy0.A(this.f27458b);
                return;
            case 10:
                gy0 gy0Var5 = this.f27458b;
                if (gy0Var5.R) {
                    gy0Var5.n0();
                    return;
                } else {
                    gy0Var5.p0();
                    return;
                }
            case 11:
                gy0.z(this.f27458b);
                return;
            case 12:
                gy0.q(this.f27458b);
                return;
            case 13:
                gy0 gy0Var6 = this.f27458b;
                Context context = gy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ig0(12));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.l0.f(context, 1, 16.0f);
                f7.setTextColor(gy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19388t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.y5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19406u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19424v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(gy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19201j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(gy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ux0(gy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(gy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19332q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(gy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f27458b.dismiss();
                return;
        }
    }
}
