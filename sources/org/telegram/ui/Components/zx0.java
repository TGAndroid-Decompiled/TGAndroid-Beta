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
public final class zx0 implements View.OnClickListener {
    public final int f33681a;
    public final qy0 f33682b;

    public zx0(qy0 qy0Var, int i10) {
        this.f33681a = i10;
        this.f33682b = qy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f33681a) {
            case 0:
                qy0 qy0Var = this.f33682b;
                org.telegram.ui.ActionBar.n2 n2Var = qy0Var.L;
                if (n2Var != null) {
                    new rg.y0(n2Var, 11, false).show();
                    return;
                } else if (qy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) qy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                qy0.F(this.f33682b);
                return;
            case 2:
                this.f33682b.q0();
                return;
            case 3:
                qy0 qy0Var2 = this.f33682b;
                if (qy0Var2.Y != null) {
                    qy0Var2.u0(qy0Var2.U);
                    qy0Var2.q0();
                    qy0Var2.U = null;
                    return;
                }
                qy0Var2.f30194b0.d(qy0Var2.T, null, qy0Var2.S, null, qy0Var2.f30204i0, true, 0, 0);
                qy0Var2.dismiss();
                return;
            case 4:
                this.f33682b.f30208n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                qy0 qy0Var3 = this.f33682b;
                org.telegram.ui.n70 n70Var = qy0Var3.f30197d0;
                org.telegram.ui.s70 s70Var = n70Var.f38843c;
                s4.c0 c0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = c0Var.L0();
                il0 il0Var = (il0) s70Var.d.K(L0);
                if (il0Var != null) {
                    i10 = il0Var.f46531a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = s70Var.f40385n;
                if (n70Var.f38841a) {
                    s70Var.f40386r = null;
                    s70Var.f40387s = true;
                } else {
                    s70Var.f40386r = n70Var.f38842b;
                    s70Var.f40387s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(n70Var, 9), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.f40386r, true);
                if (i11 != -1) {
                    if (!s70Var.M) {
                        for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                            View childAt = s70Var.d.getChildAt(i12);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    s70Var.f40383e.m(i11);
                }
                if (s70Var.f40385n != -1) {
                    if (!s70Var.M) {
                        for (int i13 = 0; i13 < s70Var.d.getChildCount(); i13++) {
                            View childAt2 = s70Var.d.getChildAt(i13);
                            if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.f40385n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    s70Var.f40383e.m(s70Var.f40385n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    s70Var.h.h1(L0 + 1, i10);
                }
                if (s70Var.M) {
                    s70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) s70Var).actionBar;
                    kVar.h(true);
                }
                qy0Var3.dismiss();
                return;
            case 6:
                qy0.r(this.f33682b);
                return;
            case 7:
                qy0.n(this.f33682b);
                return;
            case 8:
                qy0 qy0Var4 = this.f33682b;
                qy0Var4.f30208n.n();
                qy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new by0(qy0Var4, 3), 200L);
                return;
            case 9:
                qy0.A(this.f33682b);
                return;
            case 10:
                qy0 qy0Var5 = this.f33682b;
                if (qy0Var5.R) {
                    qy0Var5.n0();
                    return;
                } else {
                    qy0Var5.p0();
                    return;
                }
            case 11:
                qy0.z(this.f33682b);
                return;
            case 12:
                qy0.q(this.f33682b);
                return;
            case 13:
                qy0 qy0Var6 = this.f33682b;
                Context context = qy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ru(25));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
                f7.setTextColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f21120t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.z5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21138u5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21156v5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f20930j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ey0(qy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f21062q5));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(qy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f33682b.dismiss();
                return;
        }
    }
}
