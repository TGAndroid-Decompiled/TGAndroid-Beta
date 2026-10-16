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
public final class cy0 implements View.OnClickListener {
    public final int f23909a;
    public final uy0 f23910b;

    public cy0(uy0 uy0Var, int i10) {
        this.f23909a = i10;
        this.f23910b = uy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f23909a) {
            case 0:
                uy0 uy0Var = this.f23910b;
                org.telegram.ui.ActionBar.m2 m2Var = uy0Var.L;
                if (m2Var != null) {
                    new sg.y0(m2Var, 11, false).show();
                    return;
                } else if (uy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) uy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                uy0.I(this.f23910b);
                return;
            case 2:
                this.f23910b.r0();
                return;
            case 3:
                uy0 uy0Var2 = this.f23910b;
                if (uy0Var2.Y != null) {
                    uy0Var2.v0(uy0Var2.U);
                    uy0Var2.r0();
                    uy0Var2.U = null;
                    return;
                }
                uy0Var2.f29490b0.a(uy0Var2.T, null, uy0Var2.S, null, uy0Var2.f29499i0, true, 0, 0);
                uy0Var2.dismiss();
                return;
            case 4:
                this.f23910b.f29503n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                uy0 uy0Var3 = this.f23910b;
                org.telegram.ui.t70 t70Var = uy0Var3.f29493d0;
                org.telegram.ui.y70 y70Var = t70Var.f40018c;
                s4.b0 b0Var = y70Var.h;
                boolean z10 = y70Var.N;
                int L0 = b0Var.L0();
                wl0 wl0Var = (wl0) y70Var.d.K(L0);
                if (wl0Var != null) {
                    i10 = wl0Var.f44838a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = y70Var.f41764n;
                if (t70Var.f40016a) {
                    y70Var.f41765r = null;
                    y70Var.f41766s = true;
                } else {
                    y70Var.f41765r = t70Var.f40017b;
                    y70Var.f41766s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.zz(t70Var, 10), 350L);
                }
                y70Var.h0();
                y70Var.f0(y70Var.f41765r, true);
                if (i11 != -1) {
                    if (!y70Var.M) {
                        for (int i12 = 0; i12 < y70Var.d.getChildCount(); i12++) {
                            View childAt = y70Var.d.getChildAt(i12);
                            if (y70Var.d.T(childAt).b() == y70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    y70Var.e.m(i11);
                }
                if (y70Var.f41764n != -1) {
                    if (!y70Var.M) {
                        for (int i13 = 0; i13 < y70Var.d.getChildCount(); i13++) {
                            View childAt2 = y70Var.d.getChildAt(i13);
                            if (y70Var.d.T(childAt2).b() == y70Var.E + y70Var.f41764n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    y70Var.e.m(y70Var.f41764n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    y70Var.h.h1(L0 + 1, i10);
                }
                if (y70Var.M) {
                    y70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) y70Var).actionBar;
                    kVar.h(true);
                }
                uy0Var3.dismiss();
                return;
            case 6:
                uy0.t(this.f23910b);
                return;
            case 7:
                uy0.o(this.f23910b);
                return;
            case 8:
                uy0 uy0Var4 = this.f23910b;
                uy0Var4.f29503n.n();
                uy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new fy0(uy0Var4, 3), 200L);
                return;
            case 9:
                uy0.D(this.f23910b);
                return;
            case 10:
                uy0 uy0Var5 = this.f23910b;
                if (uy0Var5.R) {
                    uy0Var5.o0();
                    return;
                } else {
                    uy0Var5.q0();
                    return;
                }
            case 11:
                uy0.C(this.f23910b);
                return;
            case 12:
                uy0.s(this.f23910b);
                return;
            case 13:
                uy0 uy0Var6 = this.f23910b;
                Context context = uy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new co0(8));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
                f7.setTextColor(uy0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f19896t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19915u5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19932v5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(uy0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f19707j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(uy0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new iy0(uy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(uy0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f19838q5));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(uy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f23910b.dismiss();
                return;
        }
    }
}
