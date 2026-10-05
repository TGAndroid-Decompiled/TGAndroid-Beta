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
public final class ay0 implements View.OnClickListener {
    public final int f24767a;
    public final ry0 f24768b;

    public ay0(ry0 ry0Var, int i10) {
        this.f24767a = i10;
        this.f24768b = ry0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f24767a) {
            case 0:
                ry0 ry0Var = this.f24768b;
                org.telegram.ui.ActionBar.n2 n2Var = ry0Var.L;
                if (n2Var != null) {
                    new rg.y0(n2Var, 11, false).show();
                    return;
                } else if (ry0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ry0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                ry0.F(this.f24768b);
                return;
            case 2:
                this.f24768b.q0();
                return;
            case 3:
                ry0 ry0Var2 = this.f24768b;
                if (ry0Var2.Y != null) {
                    ry0Var2.u0(ry0Var2.U);
                    ry0Var2.q0();
                    ry0Var2.U = null;
                    return;
                }
                ry0Var2.f30609b0.d(ry0Var2.T, null, ry0Var2.S, null, ry0Var2.f30619i0, true, 0, 0);
                ry0Var2.dismiss();
                return;
            case 4:
                this.f24768b.f30623n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                ry0 ry0Var3 = this.f24768b;
                org.telegram.ui.n70 n70Var = ry0Var3.f30612d0;
                org.telegram.ui.s70 s70Var = n70Var.f38823c;
                s4.c0 c0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = c0Var.L0();
                il0 il0Var = (il0) s70Var.d.K(L0);
                if (il0Var != null) {
                    i10 = il0Var.f46538a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = s70Var.f40365n;
                if (n70Var.f38821a) {
                    s70Var.f40366r = null;
                    s70Var.f40367s = true;
                } else {
                    s70Var.f40366r = n70Var.f38822b;
                    s70Var.f40367s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(n70Var, 9), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.f40366r, true);
                if (i11 != -1) {
                    if (!s70Var.M) {
                        for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                            View childAt = s70Var.d.getChildAt(i12);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    s70Var.f40363e.m(i11);
                }
                if (s70Var.f40365n != -1) {
                    if (!s70Var.M) {
                        for (int i13 = 0; i13 < s70Var.d.getChildCount(); i13++) {
                            View childAt2 = s70Var.d.getChildAt(i13);
                            if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.f40365n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    s70Var.f40363e.m(s70Var.f40365n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    s70Var.h.h1(L0 + 1, i10);
                }
                if (s70Var.M) {
                    s70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) s70Var).actionBar;
                    kVar.h(true);
                }
                ry0Var3.dismiss();
                return;
            case 6:
                ry0.r(this.f24768b);
                return;
            case 7:
                ry0.n(this.f24768b);
                return;
            case 8:
                ry0 ry0Var4 = this.f24768b;
                ry0Var4.f30623n.n();
                ry0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new cy0(ry0Var4, 3), 200L);
                return;
            case 9:
                ry0.A(this.f24768b);
                return;
            case 10:
                ry0 ry0Var5 = this.f24768b;
                if (ry0Var5.R) {
                    ry0Var5.n0();
                    return;
                } else {
                    ry0Var5.p0();
                    return;
                }
            case 11:
                ry0.z(this.f24768b);
                return;
            case 12:
                ry0.q(this.f24768b);
                return;
            case 13:
                ry0 ry0Var6 = this.f24768b;
                Context context = ry0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ru(25));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
                f7.setTextColor(ry0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f21125t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21143u5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21161v5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ry0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f20935j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ry0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new fy0(ry0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ry0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f21067q5));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(ry0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f24768b.dismiss();
                return;
        }
    }
}
