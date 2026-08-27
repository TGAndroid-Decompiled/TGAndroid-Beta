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

public final class ow0 implements View.OnClickListener {

    public final int f31421a;

    public final ex0 f31422b;

    public ow0(ex0 ex0Var, int i10) {
        this.f31421a = i10;
        this.f31422b = ex0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31421a) {
            case 0:
                ex0 ex0Var = this.f31422b;
                org.telegram.ui.ActionBar.n2 n2Var = ex0Var.H;
                if (n2Var != null) {
                    new ag.g2(n2Var, 11, false).show();
                } else if (ex0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ex0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                }
                break;
            case 1:
                ex0.H(this.f31422b);
                break;
            case 2:
                this.f31422b.q0();
                break;
            case 3:
                ex0 ex0Var2 = this.f31422b;
                if (ex0Var2.U == null) {
                    ex0Var2.X.e(ex0Var2.P, null, ex0Var2.O, null, ex0Var2.f28177e0, true, 0, 0);
                    ex0Var2.dismiss();
                } else {
                    ex0Var2.u0(ex0Var2.Q);
                    ex0Var2.q0();
                    ex0Var2.Q = null;
                }
                break;
            case 4:
                this.f31422b.f28186n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                ex0 ex0Var3 = this.f31422b;
                org.telegram.ui.x60 x60Var = ex0Var3.Z;
                org.telegram.ui.c70 c70Var = x60Var.f44292c;
                f2.k0 k0Var = c70Var.h;
                boolean z10 = c70Var.J;
                int iL0 = k0Var.L0();
                lk0 lk0Var = (lk0) c70Var.d.K(iL0);
                int top = lk0Var != null ? lk0Var.f5789a.getTop() : Integer.MAX_VALUE;
                int i10 = c70Var.f36983n;
                if (x60Var.f44290a) {
                    c70Var.f36984r = null;
                    c70Var.f36985s = true;
                } else {
                    c70Var.f36984r = x60Var.f44291b;
                    c70Var.f36985s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r00(x60Var, 9), 350L);
                }
                c70Var.h0();
                c70Var.f0(c70Var.f36984r, true);
                if (i10 != -1) {
                    if (c70Var.I) {
                        c70Var.f36981e.m(i10);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < c70Var.d.getChildCount()) {
                                View childAt = c70Var.d.getChildAt(i11);
                                if (c70Var.d.T(childAt).b() == c70Var.A + i10) {
                                    ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                                } else {
                                    i11++;
                                }
                            } else {
                                c70Var.f36981e.m(i10);
                            }
                        }
                    }
                }
                if (c70Var.f36983n != -1) {
                    if (c70Var.I) {
                        c70Var.f36981e.m(c70Var.f36983n);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < c70Var.d.getChildCount()) {
                                View childAt2 = c70Var.d.getChildAt(i12);
                                if (c70Var.d.T(childAt2).b() == c70Var.A + c70Var.f36983n) {
                                    ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                                } else {
                                    i12++;
                                }
                            } else {
                                c70Var.f36981e.m(c70Var.f36983n);
                            }
                        }
                    }
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    c70Var.h.h1(iL0 + 1, top);
                }
                if (c70Var.I) {
                    c70Var.H.H("", false);
                    ((org.telegram.ui.ActionBar.n2) c70Var).actionBar.h(true);
                }
                ex0Var3.dismiss();
                break;
            case 6:
                ex0.s(this.f31422b);
                break;
            case 7:
                ex0.n(this.f31422b);
                break;
            case 8:
                ex0 ex0Var4 = this.f31422b;
                ex0Var4.f28186n.n();
                ex0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new qw0(ex0Var4, 3), 200L);
                break;
            case 9:
                ex0.C(this.f31422b);
                break;
            case 10:
                ex0 ex0Var5 = this.f31422b;
                if (!ex0Var5.N) {
                    ex0Var5.p0();
                } else {
                    ex0Var5.n0();
                }
                break;
            case 11:
                ex0.B(this.f31422b);
                break;
            case 12:
                ex0.r(this.f31422b);
                break;
            case 13:
                ex0 ex0Var6 = this.f31422b;
                Context context = ex0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new pc0(15));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textViewH = org.telegram.messenger.y1.h(context, 1, 16.0f);
                textViewH.setTextColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f23338t5));
                textViewH.setMaxLines(1);
                textViewH.setLines(1);
                textViewH.setText("t.me/addstickers/");
                textViewH.setInputType(16385);
                textViewH.setGravity(51);
                textViewH.setSingleLine(true);
                textViewH.setVisibility(4);
                textViewH.setImeOptions(6);
                textViewH.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(textViewH, h7.z5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23372v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new sw0(ex0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, h7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new c1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vu(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f23283q5));
                linearLayout.addView(textView, h7.z5.n(-1, -2));
                d1 d1Var = new d1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.setOnShowListener(d1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new cg.f(ex0Var6, iArr, editTextBoldCursor, textView, textViewH, alertDialog$Builder, 4));
                break;
            default:
                this.f31422b.dismiss();
                break;
        }
    }
}
