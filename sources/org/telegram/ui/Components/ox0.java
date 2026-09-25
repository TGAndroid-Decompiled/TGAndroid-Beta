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
public final class ox0 implements View.OnClickListener {
    public final int f27211a;
    public final fy0 f27212b;

    public ox0(fy0 fy0Var, int i10) {
        this.f27211a = i10;
        this.f27212b = fy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f27211a) {
            case 0:
                fy0 fy0Var = this.f27212b;
                org.telegram.ui.ActionBar.m2 m2Var = fy0Var.L;
                if (m2Var != null) {
                    new rg.x0(m2Var, 11, false).show();
                    return;
                } else if (fy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) fy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                fy0.H(this.f27212b);
                return;
            case 2:
                this.f27212b.q0();
                return;
            case 3:
                fy0 fy0Var2 = this.f27212b;
                if (fy0Var2.Y != null) {
                    fy0Var2.u0(fy0Var2.U);
                    fy0Var2.q0();
                    fy0Var2.U = null;
                    return;
                }
                fy0Var2.f24288b0.d(fy0Var2.T, null, fy0Var2.S, null, fy0Var2.f24297i0, true, 0, 0);
                fy0Var2.dismiss();
                return;
            case 4:
                this.f27212b.f24301n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                fy0 fy0Var3 = this.f27212b;
                org.telegram.ui.j70 j70Var = fy0Var3.f24291d0;
                org.telegram.ui.o70 o70Var = j70Var.f34676c;
                s4.c0 c0Var = o70Var.h;
                boolean z10 = o70Var.N;
                int L0 = c0Var.L0();
                gl0 gl0Var = (gl0) o70Var.d.K(L0);
                if (gl0Var != null) {
                    i10 = gl0Var.f42961a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = o70Var.f36071n;
                if (j70Var.f34674a) {
                    o70Var.f36072r = null;
                    o70Var.f36073s = true;
                } else {
                    o70Var.f36072r = j70Var.f34675b;
                    o70Var.f36073s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(j70Var, 9), 350L);
                }
                o70Var.h0();
                o70Var.f0(o70Var.f36072r, true);
                if (i11 != -1) {
                    if (!o70Var.M) {
                        for (int i12 = 0; i12 < o70Var.d.getChildCount(); i12++) {
                            View childAt = o70Var.d.getChildAt(i12);
                            if (o70Var.d.T(childAt).b() == o70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    o70Var.e.m(i11);
                }
                if (o70Var.f36071n != -1) {
                    if (!o70Var.M) {
                        for (int i13 = 0; i13 < o70Var.d.getChildCount(); i13++) {
                            View childAt2 = o70Var.d.getChildAt(i13);
                            if (o70Var.d.T(childAt2).b() == o70Var.E + o70Var.f36071n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    o70Var.e.m(o70Var.f36071n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    o70Var.h.h1(L0 + 1, i10);
                }
                if (o70Var.M) {
                    o70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) o70Var).actionBar;
                    kVar.h(true);
                }
                fy0Var3.dismiss();
                return;
            case 6:
                fy0.r(this.f27212b);
                return;
            case 7:
                fy0.n(this.f27212b);
                return;
            case 8:
                fy0 fy0Var4 = this.f27212b;
                fy0Var4.f24301n.n();
                fy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new qx0(fy0Var4, 3), 200L);
                return;
            case 9:
                fy0.A(this.f27212b);
                return;
            case 10:
                fy0 fy0Var5 = this.f27212b;
                if (fy0Var5.R) {
                    fy0Var5.n0();
                    return;
                } else {
                    fy0Var5.p0();
                    return;
                }
            case 11:
                fy0.z(this.f27212b);
                return;
            case 12:
                fy0.q(this.f27212b);
                return;
            case 13:
                fy0 fy0Var6 = this.f27212b;
                Context context = fy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new fa0(23));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
                f7.setTextColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19354t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19372u5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19390v5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19299q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19166j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new tx0(fy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19298q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(fy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f27212b.dismiss();
                return;
        }
    }
}
