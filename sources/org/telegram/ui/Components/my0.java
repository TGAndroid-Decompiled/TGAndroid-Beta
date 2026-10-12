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
public final class my0 implements View.OnClickListener {
    public final int f28674a;
    public final dz0 f28675b;

    public my0(dz0 dz0Var, int i10) {
        this.f28674a = i10;
        this.f28675b = dz0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f28674a) {
            case 0:
                dz0 dz0Var = this.f28675b;
                org.telegram.ui.ActionBar.m2 m2Var = dz0Var.L;
                if (m2Var != null) {
                    new rg.y0(m2Var, 11, false).show();
                    return;
                } else if (dz0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) dz0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                dz0.I(this.f28675b);
                return;
            case 2:
                this.f28675b.r0();
                return;
            case 3:
                dz0 dz0Var2 = this.f28675b;
                if (dz0Var2.Y != null) {
                    dz0Var2.v0(dz0Var2.U);
                    dz0Var2.r0();
                    dz0Var2.U = null;
                    return;
                }
                dz0Var2.f25484b0.d(dz0Var2.T, null, dz0Var2.S, null, dz0Var2.f25494i0, true, 0, 0);
                dz0Var2.dismiss();
                return;
            case 4:
                this.f28675b.f25498n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                dz0 dz0Var3 = this.f28675b;
                org.telegram.ui.p70 p70Var = dz0Var3.f25487d0;
                org.telegram.ui.v70 v70Var = p70Var.f40870c;
                s4.d0 d0Var = v70Var.h;
                boolean z10 = v70Var.N;
                int L0 = d0Var.L0();
                gm0 gm0Var = (gm0) v70Var.d.K(L0);
                if (gm0Var != null) {
                    i10 = gm0Var.f47897a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = v70Var.f42701n;
                if (p70Var.f40868a) {
                    v70Var.f42702r = null;
                    v70Var.f42703s = true;
                } else {
                    v70Var.f42702r = p70Var.f40869b;
                    v70Var.f42703s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.wz(p70Var, 10), 350L);
                }
                v70Var.h0();
                v70Var.f0(v70Var.f42702r, true);
                if (i11 != -1) {
                    if (!v70Var.M) {
                        for (int i12 = 0; i12 < v70Var.d.getChildCount(); i12++) {
                            View childAt = v70Var.d.getChildAt(i12);
                            if (v70Var.d.T(childAt).b() == v70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    v70Var.f42699e.m(i11);
                }
                if (v70Var.f42701n != -1) {
                    if (!v70Var.M) {
                        for (int i13 = 0; i13 < v70Var.d.getChildCount(); i13++) {
                            View childAt2 = v70Var.d.getChildAt(i13);
                            if (v70Var.d.T(childAt2).b() == v70Var.E + v70Var.f42701n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    v70Var.f42699e.m(v70Var.f42701n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    v70Var.h.h1(L0 + 1, i10);
                }
                if (v70Var.M) {
                    v70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) v70Var).actionBar;
                    kVar.i(true);
                }
                dz0Var3.dismiss();
                return;
            case 6:
                dz0.t(this.f28675b);
                return;
            case 7:
                dz0.p(this.f28675b);
                return;
            case 8:
                dz0 dz0Var4 = this.f28675b;
                dz0Var4.f25498n.n();
                dz0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new oy0(dz0Var4, 3), 200L);
                return;
            case 9:
                dz0.D(this.f28675b);
                return;
            case 10:
                dz0 dz0Var5 = this.f28675b;
                if (dz0Var5.R) {
                    dz0Var5.o0();
                    return;
                } else {
                    dz0Var5.q0();
                    return;
                }
            case 11:
                dz0.B(this.f28675b);
                return;
            case 12:
                dz0.s(this.f28675b);
                return;
            case 13:
                dz0 dz0Var6 = this.f28675b;
                Context context = dz0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new je0(15));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.w5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
                g10.setTextColor(dz0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f20856t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.w5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20874u5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20892v5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(dz0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f20668j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(dz0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ry0(dz0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.w5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ew(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(dz0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f20799q5));
                linearLayout.addView(textView, w7.w5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(dz0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f28675b.dismiss();
                return;
        }
    }
}
