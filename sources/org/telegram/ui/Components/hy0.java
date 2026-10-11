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
public final class hy0 implements View.OnClickListener {
    public final int f27253a;
    public final yy0 f27254b;

    public hy0(yy0 yy0Var, int i10) {
        this.f27253a = i10;
        this.f27254b = yy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f27253a) {
            case 0:
                yy0 yy0Var = this.f27254b;
                org.telegram.ui.ActionBar.m2 m2Var = yy0Var.L;
                if (m2Var != null) {
                    new rg.y0(m2Var, 11, false).show();
                    return;
                } else if (yy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) yy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                yy0.I(this.f27254b);
                return;
            case 2:
                this.f27254b.r0();
                return;
            case 3:
                yy0 yy0Var2 = this.f27254b;
                if (yy0Var2.Y != null) {
                    yy0Var2.v0(yy0Var2.U);
                    yy0Var2.r0();
                    yy0Var2.U = null;
                    return;
                }
                yy0Var2.f33476b0.d(yy0Var2.T, null, yy0Var2.S, null, yy0Var2.f33486i0, true, 0, 0);
                yy0Var2.dismiss();
                return;
            case 4:
                this.f27254b.f33490n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                yy0 yy0Var3 = this.f27254b;
                org.telegram.ui.m70 m70Var = yy0Var3.f33479d0;
                org.telegram.ui.s70 s70Var = m70Var.f39862c;
                s4.d0 d0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = d0Var.L0();
                bm0 bm0Var = (bm0) s70Var.d.K(L0);
                if (bm0Var != null) {
                    i10 = bm0Var.f47782a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = s70Var.f41653n;
                if (m70Var.f39860a) {
                    s70Var.f41654r = null;
                    s70Var.f41655s = true;
                } else {
                    s70Var.f41654r = m70Var.f39861b;
                    s70Var.f41655s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.tz(m70Var, 10), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.f41654r, true);
                if (i11 != -1) {
                    if (!s70Var.M) {
                        for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                            View childAt = s70Var.d.getChildAt(i12);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    s70Var.f41651e.m(i11);
                }
                if (s70Var.f41653n != -1) {
                    if (!s70Var.M) {
                        for (int i13 = 0; i13 < s70Var.d.getChildCount(); i13++) {
                            View childAt2 = s70Var.d.getChildAt(i13);
                            if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.f41653n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    s70Var.f41651e.m(s70Var.f41653n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    s70Var.h.h1(L0 + 1, i10);
                }
                if (s70Var.M) {
                    s70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) s70Var).actionBar;
                    kVar.h(true);
                }
                yy0Var3.dismiss();
                return;
            case 6:
                yy0.t(this.f27254b);
                return;
            case 7:
                yy0.p(this.f27254b);
                return;
            case 8:
                yy0 yy0Var4 = this.f27254b;
                yy0Var4.f33490n.n();
                yy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new jy0(yy0Var4, 3), 200L);
                return;
            case 9:
                yy0.D(this.f27254b);
                return;
            case 10:
                yy0 yy0Var5 = this.f27254b;
                if (yy0Var5.R) {
                    yy0Var5.o0();
                    return;
                } else {
                    yy0Var5.q0();
                    return;
                }
            case 11:
                yy0.C(this.f27254b);
                return;
            case 12:
                yy0.s(this.f27254b);
                return;
            case 13:
                yy0 yy0Var6 = this.f27254b;
                Context context = yy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new zd0(17));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
                f7.setTextColor(yy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f21117t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21135u5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21153v5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(yy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(yy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new my0(yy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cw(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(yy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f21061q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(yy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f27254b.dismiss();
                return;
        }
    }
}
