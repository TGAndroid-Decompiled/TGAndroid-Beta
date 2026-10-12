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
    public final int f24227a;
    public final ty0 f24228b;

    public cy0(ty0 ty0Var, int i10) {
        this.f24227a = i10;
        this.f24228b = ty0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f24227a) {
            case 0:
                ty0 ty0Var = this.f24228b;
                org.telegram.ui.ActionBar.m2 m2Var = ty0Var.L;
                if (m2Var != null) {
                    new sg.y0(m2Var, 11, false).show();
                    return;
                } else if (ty0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ty0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                ty0.I(this.f24228b);
                return;
            case 2:
                this.f24228b.r0();
                return;
            case 3:
                ty0 ty0Var2 = this.f24228b;
                if (ty0Var2.Y != null) {
                    ty0Var2.v0(ty0Var2.U);
                    ty0Var2.r0();
                    ty0Var2.U = null;
                    return;
                }
                ty0Var2.f29503b0.a(ty0Var2.T, null, ty0Var2.S, null, ty0Var2.f29512i0, true, 0, 0);
                ty0Var2.dismiss();
                return;
            case 4:
                this.f24228b.f29516n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                ty0 ty0Var3 = this.f24228b;
                org.telegram.ui.t70 t70Var = ty0Var3.f29506d0;
                org.telegram.ui.y70 y70Var = t70Var.f40303c;
                s4.b0 b0Var = y70Var.h;
                boolean z10 = y70Var.N;
                int L0 = b0Var.L0();
                wl0 wl0Var = (wl0) y70Var.d.K(L0);
                if (wl0Var != null) {
                    i10 = wl0Var.f44838a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = y70Var.f42061n;
                if (t70Var.f40301a) {
                    y70Var.f42062r = null;
                    y70Var.f42063s = true;
                } else {
                    y70Var.f42062r = t70Var.f40302b;
                    y70Var.f42063s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.zz(t70Var, 10), 350L);
                }
                y70Var.h0();
                y70Var.f0(y70Var.f42062r, true);
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
                if (y70Var.f42061n != -1) {
                    if (!y70Var.M) {
                        for (int i13 = 0; i13 < y70Var.d.getChildCount(); i13++) {
                            View childAt2 = y70Var.d.getChildAt(i13);
                            if (y70Var.d.T(childAt2).b() == y70Var.E + y70Var.f42061n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    y70Var.e.m(y70Var.f42061n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    y70Var.h.h1(L0 + 1, i10);
                }
                if (y70Var.M) {
                    y70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) y70Var).actionBar;
                    kVar.h(true);
                }
                ty0Var3.dismiss();
                return;
            case 6:
                ty0.t(this.f24228b);
                return;
            case 7:
                ty0.o(this.f24228b);
                return;
            case 8:
                ty0 ty0Var4 = this.f24228b;
                ty0Var4.f29516n.n();
                ty0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ey0(ty0Var4, 3), 200L);
                return;
            case 9:
                ty0.D(this.f24228b);
                return;
            case 10:
                ty0 ty0Var5 = this.f24228b;
                if (ty0Var5.R) {
                    ty0Var5.o0();
                    return;
                } else {
                    ty0Var5.q0();
                    return;
                }
            case 11:
                ty0.B(this.f24228b);
                return;
            case 12:
                ty0.s(this.f24228b);
                return;
            case 13:
                ty0 ty0Var6 = this.f24228b;
                Context context = ty0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new zg0(10));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
                g10.setTextColor(ty0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f20196t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.a6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20215u5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20232v5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ty0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ty0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new hy0(ty0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.a6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ty0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f20138q5));
                linearLayout.addView(textView, w7.a6.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(ty0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f24228b.dismiss();
                return;
        }
    }
}
