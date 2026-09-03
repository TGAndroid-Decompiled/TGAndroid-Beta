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
public final class gx0 implements View.OnClickListener {
    public final int f27293a;
    public final xx0 f27294b;

    public gx0(xx0 xx0Var, int i10) {
        this.f27293a = i10;
        this.f27294b = xx0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f27293a) {
            case 0:
                xx0 xx0Var = this.f27294b;
                org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
                if (p2Var != null) {
                    new fg.n1(p2Var, 11, false).show();
                    return;
                } else if (xx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                xx0.G(this.f27294b);
                return;
            case 2:
                this.f27294b.q0();
                return;
            case 3:
                xx0 xx0Var2 = this.f27294b;
                if (xx0Var2.V != null) {
                    xx0Var2.u0(xx0Var2.R);
                    xx0Var2.q0();
                    xx0Var2.R = null;
                    return;
                }
                xx0Var2.Y.d(xx0Var2.Q, null, xx0Var2.P, null, xx0Var2.f33229f0, true, 0, 0);
                xx0Var2.dismiss();
                return;
            case 4:
                this.f27294b.f33236n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                xx0 xx0Var3 = this.f27294b;
                org.telegram.ui.i70 i70Var = xx0Var3.f33220a0;
                org.telegram.ui.n70 n70Var = i70Var.f37567c;
                f2.j0 j0Var = n70Var.h;
                boolean z4 = n70Var.K;
                int L0 = j0Var.L0();
                el0 el0Var = (el0) n70Var.d.K(L0);
                if (el0Var != null) {
                    i10 = el0Var.f5875a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = n70Var.f39214n;
                if (i70Var.f37565a) {
                    n70Var.f39215r = null;
                    n70Var.f39216s = true;
                } else {
                    n70Var.f39215r = i70Var.f37566b;
                    n70Var.f39216s = false;
                }
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(i70Var, 9), 350L);
                }
                n70Var.h0();
                n70Var.f0(n70Var.f39215r, true);
                if (i11 != -1) {
                    if (!n70Var.J) {
                        for (int i12 = 0; i12 < n70Var.d.getChildCount(); i12++) {
                            View childAt = n70Var.d.getChildAt(i12);
                            if (n70Var.d.T(childAt).b() == n70Var.B + i11) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    n70Var.f39212e.m(i11);
                }
                if (n70Var.f39214n != -1) {
                    if (!n70Var.J) {
                        for (int i13 = 0; i13 < n70Var.d.getChildCount(); i13++) {
                            View childAt2 = n70Var.d.getChildAt(i13);
                            if (n70Var.d.T(childAt2).b() == n70Var.B + n70Var.f39214n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    n70Var.f39212e.m(n70Var.f39214n);
                }
                if (i10 != Integer.MAX_VALUE && !z4) {
                    n70Var.h.h1(L0 + 1, i10);
                }
                if (n70Var.J) {
                    n70Var.I.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.p2) n70Var).actionBar;
                    kVar.h(true);
                }
                xx0Var3.dismiss();
                return;
            case 6:
                xx0.r(this.f27294b);
                return;
            case 7:
                xx0.n(this.f27294b);
                return;
            case 8:
                xx0 xx0Var4 = this.f27294b;
                xx0Var4.f33236n.n();
                xx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ix0(xx0Var4, 3), 200L);
                return;
            case 9:
                xx0.B(this.f27294b);
                return;
            case 10:
                xx0 xx0Var5 = this.f27294b;
                if (xx0Var5.O) {
                    xx0Var5.n0();
                    return;
                } else {
                    xx0Var5.p0();
                    return;
                }
            case 11:
                xx0.A(this.f27294b);
                return;
            case 12:
                xx0.q(this.f27294b);
                return;
            case 13:
                xx0 xx0Var6 = this.f27294b;
                Context context = xx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new mh0(9));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, k7.c6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
                g10.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.f21946t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, k7.c6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21962u5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21980v5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.f21768j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new kx0(xx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, k7.c6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q5));
                linearLayout.addView(textView, k7.c6.n(-1, -2));
                e1 e1Var = new e1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.setOnShowListener(e1Var);
                d2Var.show();
                editTextBoldCursor.requestFocus();
                d2Var.d(-1).setOnClickListener(new hg.e(xx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                return;
            default:
                this.f27294b.dismiss();
                return;
        }
    }
}
