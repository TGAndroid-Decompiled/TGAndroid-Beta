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
public final class mw0 implements View.OnClickListener {
    public final int f30929a;
    public final cx0 f30930b;

    public mw0(cx0 cx0Var, int i9) {
        this.f30929a = i9;
        this.f30930b = cx0Var;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f30929a) {
            case 0:
                cx0 cx0Var = this.f30930b;
                org.telegram.ui.ActionBar.o2 o2Var = cx0Var.H;
                if (o2Var != null) {
                    new zf.x0(o2Var, 11, false).show();
                    return;
                } else if (cx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) cx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                cx0.G(this.f30930b);
                return;
            case 2:
                this.f30930b.p0();
                return;
            case 3:
                cx0 cx0Var2 = this.f30930b;
                if (cx0Var2.U != null) {
                    cx0Var2.t0(cx0Var2.Q);
                    cx0Var2.p0();
                    cx0Var2.Q = null;
                    return;
                }
                cx0Var2.X.a(cx0Var2.P, null, cx0Var2.O, null, cx0Var2.f27577e0, true, 0, 0);
                cx0Var2.dismiss();
                return;
            case 4:
                this.f30930b.f27586n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                cx0 cx0Var3 = this.f30930b;
                org.telegram.ui.u60 u60Var = cx0Var3.Z;
                org.telegram.ui.z60 z60Var = u60Var.f43147c;
                f2.m0 m0Var = z60Var.h;
                boolean z10 = z60Var.J;
                int L0 = m0Var.L0();
                ik0 ik0Var = (ik0) z60Var.d.K(L0);
                if (ik0Var != null) {
                    i9 = ik0Var.f5501a.getTop();
                } else {
                    i9 = Integer.MAX_VALUE;
                }
                int i10 = z60Var.f45046n;
                if (u60Var.f43145a) {
                    z60Var.f45047r = null;
                    z60Var.f45048s = true;
                } else {
                    z60Var.f45047r = u60Var.f43146b;
                    z60Var.f45048s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.o00(u60Var, 9), 350L);
                }
                z60Var.g0();
                z60Var.e0(z60Var.f45047r, true);
                if (i10 != -1) {
                    if (!z60Var.I) {
                        for (int i11 = 0; i11 < z60Var.d.getChildCount(); i11++) {
                            View childAt = z60Var.d.getChildAt(i11);
                            if (z60Var.d.T(childAt).b() == z60Var.A + i10) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    z60Var.f45044e.m(i10);
                }
                if (z60Var.f45046n != -1) {
                    if (!z60Var.I) {
                        for (int i12 = 0; i12 < z60Var.d.getChildCount(); i12++) {
                            View childAt2 = z60Var.d.getChildAt(i12);
                            if (z60Var.d.T(childAt2).b() == z60Var.A + z60Var.f45046n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    z60Var.f45044e.m(z60Var.f45046n);
                }
                if (i9 != Integer.MAX_VALUE && !z10) {
                    z60Var.h.h1(L0 + 1, i9);
                }
                if (z60Var.I) {
                    z60Var.H.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.o2) z60Var).actionBar;
                    kVar.h(true);
                }
                cx0Var3.dismiss();
                return;
            case 6:
                cx0.r(this.f30930b);
                return;
            case 7:
                cx0.n(this.f30930b);
                return;
            case 8:
                cx0 cx0Var4 = this.f30930b;
                cx0Var4.f27586n.n();
                cx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ow0(cx0Var4, 3), 200L);
                return;
            case 9:
                cx0.A(this.f30930b);
                return;
            case 10:
                cx0 cx0Var5 = this.f30930b;
                if (cx0Var5.N) {
                    cx0Var5.m0();
                    return;
                } else {
                    cx0Var5.o0();
                    return;
                }
            case 11:
                cx0.z(this.f30930b);
                return;
            case 12:
                cx0.q(this.f30930b);
                return;
            case 13:
                cx0 cx0Var6 = this.f30930b;
                Context context = cx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new if0(10));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, g7.e6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
                g10.setTextColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.f23284t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, g7.e6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23302u5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23318v5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new qw0(cx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, g7.e6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new c1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wu(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.f23228q5));
                linearLayout.addView(textView, g7.e6.n(-1, -2));
                d1 d1Var = new d1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.setOnShowListener(d1Var);
                c2Var.show();
                editTextBoldCursor.requestFocus();
                c2Var.d(-1).setOnClickListener(new bg.h(cx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                return;
            default:
                this.f30930b.dismiss();
                return;
        }
    }
}
