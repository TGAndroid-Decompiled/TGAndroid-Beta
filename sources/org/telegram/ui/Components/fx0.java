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
public final class fx0 implements View.OnClickListener {
    public final int f24027a;
    public final wx0 f24028b;

    public fx0(wx0 wx0Var, int i10) {
        this.f24027a = i10;
        this.f24028b = wx0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f24027a) {
            case 0:
                wx0 wx0Var = this.f24028b;
                org.telegram.ui.ActionBar.o2 o2Var = wx0Var.L;
                if (o2Var != null) {
                    new rg.x0(o2Var, 11, false).show();
                    return;
                } else if (wx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) wx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                wx0.H(this.f24028b);
                return;
            case 2:
                this.f24028b.q0();
                return;
            case 3:
                wx0 wx0Var2 = this.f24028b;
                if (wx0Var2.Y != null) {
                    wx0Var2.u0(wx0Var2.U);
                    wx0Var2.q0();
                    wx0Var2.U = null;
                    return;
                }
                wx0Var2.f29771b0.d(wx0Var2.T, null, wx0Var2.S, null, wx0Var2.f29780i0, true, 0, 0);
                wx0Var2.dismiss();
                return;
            case 4:
                this.f24028b.f29784n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                wx0 wx0Var3 = this.f24028b;
                org.telegram.ui.q70 q70Var = wx0Var3.f29774d0;
                org.telegram.ui.v70 v70Var = q70Var.f36826c;
                s4.c0 c0Var = v70Var.h;
                boolean z10 = v70Var.N;
                int L0 = c0Var.L0();
                wk0 wk0Var = (wk0) v70Var.d.L(L0);
                if (wk0Var != null) {
                    i10 = wk0Var.f42702a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = v70Var.f38319n;
                if (q70Var.f36824a) {
                    v70Var.f38320r = null;
                    v70Var.f38321s = true;
                } else {
                    v70Var.f38320r = q70Var.f36825b;
                    v70Var.f38321s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i10(q70Var, 9), 350L);
                }
                v70Var.h0();
                v70Var.f0(v70Var.f38320r, true);
                if (i11 != -1) {
                    if (!v70Var.M) {
                        for (int i12 = 0; i12 < v70Var.d.getChildCount(); i12++) {
                            View childAt = v70Var.d.getChildAt(i12);
                            if (v70Var.d.U(childAt).b() == v70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    v70Var.e.m(i11);
                }
                if (v70Var.f38319n != -1) {
                    if (!v70Var.M) {
                        for (int i13 = 0; i13 < v70Var.d.getChildCount(); i13++) {
                            View childAt2 = v70Var.d.getChildAt(i13);
                            if (v70Var.d.U(childAt2).b() == v70Var.E + v70Var.f38319n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    v70Var.e.m(v70Var.f38319n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    v70Var.h.h1(L0 + 1, i10);
                }
                if (v70Var.M) {
                    v70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.o2) v70Var).actionBar;
                    kVar.h(true);
                }
                wx0Var3.dismiss();
                return;
            case 6:
                wx0.r(this.f24028b);
                return;
            case 7:
                wx0.n(this.f24028b);
                return;
            case 8:
                wx0 wx0Var4 = this.f24028b;
                wx0Var4.f29784n.n();
                wx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new hx0(wx0Var4, 3), 200L);
                return;
            case 9:
                wx0.A(this.f24028b);
                return;
            case 10:
                wx0 wx0Var5 = this.f24028b;
                if (wx0Var5.R) {
                    wx0Var5.n0();
                    return;
                } else {
                    wx0Var5.p0();
                    return;
                }
            case 11:
                wx0.z(this.f24028b);
                return;
            case 12:
                wx0.q(this.f24028b);
                return;
            case 13:
                wx0 wx0Var6 = this.f24028b;
                Context context = wx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new bn0(8));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
                g10.setTextColor(wx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19156t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19174u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19192v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(wx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f18970j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(wx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new kx0(wx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(wx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19100q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.setOnShowListener(f1Var);
                c2Var.show();
                editTextBoldCursor.requestFocus();
                c2Var.d(-1).setOnClickListener(new m0(wx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f24028b.dismiss();
                return;
        }
    }
}
