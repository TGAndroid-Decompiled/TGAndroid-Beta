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
public final class rx0 implements View.OnClickListener {
    public final int f28141a;
    public final iy0 f28142b;

    public rx0(iy0 iy0Var, int i10) {
        this.f28141a = i10;
        this.f28142b = iy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f28141a) {
            case 0:
                iy0 iy0Var = this.f28142b;
                org.telegram.ui.ActionBar.m2 m2Var = iy0Var.L;
                if (m2Var != null) {
                    new rg.x0(m2Var, 11, false).show();
                    return;
                } else if (iy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) iy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                iy0.H(this.f28142b);
                return;
            case 2:
                this.f28142b.q0();
                return;
            case 3:
                iy0 iy0Var2 = this.f28142b;
                if (iy0Var2.Y != null) {
                    iy0Var2.u0(iy0Var2.U);
                    iy0Var2.q0();
                    iy0Var2.U = null;
                    return;
                }
                iy0Var2.f25213b0.d(iy0Var2.T, null, iy0Var2.S, null, iy0Var2.f25222i0, true, 0, 0);
                iy0Var2.dismiss();
                return;
            case 4:
                this.f28142b.f25226n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                iy0 iy0Var3 = this.f28142b;
                org.telegram.ui.j70 j70Var = iy0Var3.f25216d0;
                org.telegram.ui.o70 o70Var = j70Var.f34764c;
                s4.c0 c0Var = o70Var.h;
                boolean z10 = o70Var.N;
                int L0 = c0Var.L0();
                jl0 jl0Var = (jl0) o70Var.d.K(L0);
                if (jl0Var != null) {
                    i10 = jl0Var.f43068a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = o70Var.f36207n;
                if (j70Var.f34762a) {
                    o70Var.f36208r = null;
                    o70Var.f36209s = true;
                } else {
                    o70Var.f36208r = j70Var.f34763b;
                    o70Var.f36209s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(j70Var, 9), 350L);
                }
                o70Var.h0();
                o70Var.f0(o70Var.f36208r, true);
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
                if (o70Var.f36207n != -1) {
                    if (!o70Var.M) {
                        for (int i13 = 0; i13 < o70Var.d.getChildCount(); i13++) {
                            View childAt2 = o70Var.d.getChildAt(i13);
                            if (o70Var.d.T(childAt2).b() == o70Var.E + o70Var.f36207n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    o70Var.e.m(o70Var.f36207n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    o70Var.h.h1(L0 + 1, i10);
                }
                if (o70Var.M) {
                    o70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) o70Var).actionBar;
                    kVar.h(true);
                }
                iy0Var3.dismiss();
                return;
            case 6:
                iy0.r(this.f28142b);
                return;
            case 7:
                iy0.n(this.f28142b);
                return;
            case 8:
                iy0 iy0Var4 = this.f28142b;
                iy0Var4.f25226n.n();
                iy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new tx0(iy0Var4, 3), 200L);
                return;
            case 9:
                iy0.A(this.f28142b);
                return;
            case 10:
                iy0 iy0Var5 = this.f28142b;
                if (iy0Var5.R) {
                    iy0Var5.n0();
                    return;
                } else {
                    iy0Var5.p0();
                    return;
                }
            case 11:
                iy0.z(this.f28142b);
                return;
            case 12:
                iy0.q(this.f28142b);
                return;
            case 13:
                iy0 iy0Var6 = this.f28142b;
                Context context = iy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ia0(23));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
                f7.setTextColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19370t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19388u5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19406v5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19182j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new wx0(iy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ov(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f19314q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(iy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f28142b.dismiss();
                return;
        }
    }
}
