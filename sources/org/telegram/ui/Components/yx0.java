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
public final class yx0 implements View.OnClickListener {
    public final int f32765a;
    public final py0 f32766b;

    public yx0(py0 py0Var, int i10) {
        this.f32765a = i10;
        this.f32766b = py0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f32765a) {
            case 0:
                py0 py0Var = this.f32766b;
                org.telegram.ui.ActionBar.n2 n2Var = py0Var.L;
                if (n2Var != null) {
                    new sg.y0(n2Var, 11, false).show();
                    return;
                } else if (py0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) py0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                py0.I(this.f32766b);
                return;
            case 2:
                this.f32766b.r0();
                return;
            case 3:
                py0 py0Var2 = this.f32766b;
                if (py0Var2.Y != null) {
                    py0Var2.v0(py0Var2.U);
                    py0Var2.r0();
                    py0Var2.U = null;
                    return;
                }
                py0Var2.f29417b0.e(py0Var2.T, null, py0Var2.S, null, py0Var2.f29426i0, true, 0, 0);
                py0Var2.dismiss();
                return;
            case 4:
                this.f32766b.f29430n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                py0 py0Var3 = this.f32766b;
                org.telegram.ui.v60 v60Var = py0Var3.f29420d0;
                org.telegram.ui.a70 a70Var = v60Var.f42113c;
                s4.b0 b0Var = a70Var.h;
                boolean z10 = a70Var.N;
                int L0 = b0Var.L0();
                sl0 sl0Var = (sl0) a70Var.d.K(L0);
                if (sl0Var != null) {
                    i10 = sl0Var.f45912a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = a70Var.f35288n;
                if (v60Var.f42111a) {
                    a70Var.f35289r = null;
                    a70Var.f35290s = true;
                } else {
                    a70Var.f35289r = v60Var.f42112b;
                    a70Var.f35290s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dz(v60Var, 10), 350L);
                }
                a70Var.h0();
                a70Var.f0(a70Var.f35289r, true);
                if (i11 != -1) {
                    if (!a70Var.M) {
                        for (int i12 = 0; i12 < a70Var.d.getChildCount(); i12++) {
                            View childAt = a70Var.d.getChildAt(i12);
                            if (a70Var.d.T(childAt).b() == a70Var.E + i11) {
                                ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                            }
                        }
                    }
                    a70Var.e.m(i11);
                }
                if (a70Var.f35288n != -1) {
                    if (!a70Var.M) {
                        for (int i13 = 0; i13 < a70Var.d.getChildCount(); i13++) {
                            View childAt2 = a70Var.d.getChildAt(i13);
                            if (a70Var.d.T(childAt2).b() == a70Var.E + a70Var.f35288n) {
                                ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                            }
                        }
                    }
                    a70Var.e.m(a70Var.f35288n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    a70Var.h.h1(L0 + 1, i10);
                }
                if (a70Var.M) {
                    a70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) a70Var).actionBar;
                    kVar.h(true);
                }
                py0Var3.dismiss();
                return;
            case 6:
                py0.t(this.f32766b);
                return;
            case 7:
                py0.o(this.f32766b);
                return;
            case 8:
                py0 py0Var4 = this.f32766b;
                py0Var4.f29430n.n();
                py0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ay0(py0Var4, 3), 200L);
                return;
            case 9:
                py0.C(this.f32766b);
                return;
            case 10:
                py0 py0Var5 = this.f32766b;
                if (py0Var5.R) {
                    py0Var5.o0();
                    return;
                } else {
                    py0Var5.q0();
                    return;
                }
            case 11:
                py0.B(this.f32766b);
                return;
            case 12:
                py0.s(this.f32766b);
                return;
            case 13:
                py0 py0Var6 = this.f32766b;
                Context context = py0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new tg0(11));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
                f7.setTextColor(py0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f21282t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21302u5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21319v5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(py0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f21093j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(py0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new dy0(py0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(py0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q5));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(py0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f32766b.dismiss();
                return;
        }
    }
}
