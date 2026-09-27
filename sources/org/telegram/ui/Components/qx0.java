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
public final class qx0 implements View.OnClickListener {
    public final int f27845a;
    public final hy0 f27846b;

    public qx0(hy0 hy0Var, int i10) {
        this.f27845a = i10;
        this.f27846b = hy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f27845a) {
            case 0:
                hy0 hy0Var = this.f27846b;
                org.telegram.ui.ActionBar.o2 o2Var = hy0Var.L;
                if (o2Var != null) {
                    new rg.x0(o2Var, 11, false).show();
                    return;
                } else if (hy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) hy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                hy0.H(this.f27846b);
                return;
            case 2:
                this.f27846b.q0();
                return;
            case 3:
                hy0 hy0Var2 = this.f27846b;
                if (hy0Var2.Y != null) {
                    hy0Var2.u0(hy0Var2.U);
                    hy0Var2.q0();
                    hy0Var2.U = null;
                    return;
                }
                hy0Var2.f24933b0.d(hy0Var2.T, null, hy0Var2.S, null, hy0Var2.f24942i0, true, 0, 0);
                hy0Var2.dismiss();
                return;
            case 4:
                this.f27846b.f24946n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                hy0 hy0Var3 = this.f27846b;
                org.telegram.ui.m70 m70Var = hy0Var3.f24936d0;
                org.telegram.ui.r70 r70Var = m70Var.f35536c;
                s4.c0 c0Var = r70Var.h;
                boolean z10 = r70Var.N;
                int L0 = c0Var.L0();
                il0 il0Var = (il0) r70Var.d.L(L0);
                if (il0Var != null) {
                    i10 = il0Var.f43005a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = r70Var.f37023n;
                if (m70Var.f35534a) {
                    r70Var.f37024r = null;
                    r70Var.f37025s = true;
                } else {
                    r70Var.f37024r = m70Var.f35535b;
                    r70Var.f37025s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.f10(m70Var, 9), 350L);
                }
                r70Var.h0();
                r70Var.f0(r70Var.f37024r, true);
                if (i11 != -1) {
                    if (!r70Var.M) {
                        for (int i12 = 0; i12 < r70Var.d.getChildCount(); i12++) {
                            View childAt = r70Var.d.getChildAt(i12);
                            if (r70Var.d.U(childAt).b() == r70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    r70Var.e.m(i11);
                }
                if (r70Var.f37023n != -1) {
                    if (!r70Var.M) {
                        for (int i13 = 0; i13 < r70Var.d.getChildCount(); i13++) {
                            View childAt2 = r70Var.d.getChildAt(i13);
                            if (r70Var.d.U(childAt2).b() == r70Var.E + r70Var.f37023n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    r70Var.e.m(r70Var.f37023n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    r70Var.h.h1(L0 + 1, i10);
                }
                if (r70Var.M) {
                    r70Var.L.H("", false);
                    lVar = ((org.telegram.ui.ActionBar.o2) r70Var).actionBar;
                    lVar.i(true);
                }
                hy0Var3.dismiss();
                return;
            case 6:
                hy0.r(this.f27846b);
                return;
            case 7:
                hy0.n(this.f27846b);
                return;
            case 8:
                hy0 hy0Var4 = this.f27846b;
                hy0Var4.f24946n.n();
                hy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new sx0(hy0Var4, 3), 200L);
                return;
            case 9:
                hy0.A(this.f27846b);
                return;
            case 10:
                hy0 hy0Var5 = this.f27846b;
                if (hy0Var5.R) {
                    hy0Var5.n0();
                    return;
                } else {
                    hy0Var5.p0();
                    return;
                }
            case 11:
                hy0.z(this.f27846b);
                return;
            case 12:
                hy0.q(this.f27846b);
                return;
            case 13:
                hy0 hy0Var6 = this.f27846b;
                Context context = hy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new iw(24));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.l0.f(context, 1, 16.0f);
                f7.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f19353t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19371u5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19389v5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f19164j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new vx0(hy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new nv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f19296q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.setOnShowListener(f1Var);
                c2Var.show();
                editTextBoldCursor.requestFocus();
                c2Var.d(-1).setOnClickListener(new m0(hy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f27846b.dismiss();
                return;
        }
    }
}
