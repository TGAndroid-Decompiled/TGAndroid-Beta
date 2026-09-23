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
public final class dx0 implements View.OnClickListener {
    public final int f23482a;
    public final ux0 f23483b;

    public dx0(ux0 ux0Var, int i10) {
        this.f23482a = i10;
        this.f23483b = ux0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f23482a) {
            case 0:
                ux0 ux0Var = this.f23483b;
                org.telegram.ui.ActionBar.n2 n2Var = ux0Var.L;
                if (n2Var != null) {
                    new rg.x0(n2Var, 11, false).show();
                    return;
                } else if (ux0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ux0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                ux0.H(this.f23483b);
                return;
            case 2:
                this.f23483b.q0();
                return;
            case 3:
                ux0 ux0Var2 = this.f23483b;
                if (ux0Var2.Y != null) {
                    ux0Var2.u0(ux0Var2.U);
                    ux0Var2.q0();
                    ux0Var2.U = null;
                    return;
                }
                ux0Var2.f28568b0.d(ux0Var2.T, null, ux0Var2.S, null, ux0Var2.f28577i0, true, 0, 0);
                ux0Var2.dismiss();
                return;
            case 4:
                this.f23483b.f28581n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                ux0 ux0Var3 = this.f23483b;
                org.telegram.ui.l70 l70Var = ux0Var3.f28571d0;
                org.telegram.ui.q70 q70Var = l70Var.f34878c;
                s4.c0 c0Var = q70Var.h;
                boolean z10 = q70Var.N;
                int L0 = c0Var.L0();
                wk0 wk0Var = (wk0) q70Var.d.K(L0);
                if (wk0Var != null) {
                    i10 = wk0Var.f42627a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = q70Var.f36310n;
                if (l70Var.f34876a) {
                    q70Var.f36311r = null;
                    q70Var.f36312s = true;
                } else {
                    q70Var.f36311r = l70Var.f34877b;
                    q70Var.f36312s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.d10(l70Var, 9), 350L);
                }
                q70Var.h0();
                q70Var.f0(q70Var.f36311r, true);
                if (i11 != -1) {
                    if (!q70Var.M) {
                        for (int i12 = 0; i12 < q70Var.d.getChildCount(); i12++) {
                            View childAt = q70Var.d.getChildAt(i12);
                            if (q70Var.d.T(childAt).b() == q70Var.E + i11) {
                                ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                            }
                        }
                    }
                    q70Var.e.m(i11);
                }
                if (q70Var.f36310n != -1) {
                    if (!q70Var.M) {
                        for (int i13 = 0; i13 < q70Var.d.getChildCount(); i13++) {
                            View childAt2 = q70Var.d.getChildAt(i13);
                            if (q70Var.d.T(childAt2).b() == q70Var.E + q70Var.f36310n) {
                                ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                            }
                        }
                    }
                    q70Var.e.m(q70Var.f36310n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    q70Var.h.h1(L0 + 1, i10);
                }
                if (q70Var.M) {
                    q70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) q70Var).actionBar;
                    kVar.h(true);
                }
                ux0Var3.dismiss();
                return;
            case 6:
                ux0.r(this.f23483b);
                return;
            case 7:
                ux0.n(this.f23483b);
                return;
            case 8:
                ux0 ux0Var4 = this.f23483b;
                ux0Var4.f28581n.n();
                ux0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new fx0(ux0Var4, 3), 200L);
                return;
            case 9:
                ux0.A(this.f23483b);
                return;
            case 10:
                ux0 ux0Var5 = this.f23483b;
                if (ux0Var5.R) {
                    ux0Var5.n0();
                    return;
                } else {
                    ux0Var5.p0();
                    return;
                }
            case 11:
                ux0.z(this.f23483b);
                return;
            case 12:
                ux0.q(this.f23483b);
                return;
            case 13:
                ux0 ux0Var6 = this.f23483b;
                Context context = ux0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new xc0(21));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.z0.g(context, 1, 16.0f);
                g10.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19081t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19099u5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19117v5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f18895j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ix0(ux0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19025q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(ux0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f23483b.dismiss();
                return;
        }
    }
}
