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
public final class ww0 implements View.OnClickListener {
    public final int f34501a;
    public final nx0 f34502b;

    public ww0(nx0 nx0Var, int i10) {
        this.f34501a = i10;
        this.f34502b = nx0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f34501a) {
            case 0:
                nx0 nx0Var = this.f34502b;
                org.telegram.ui.ActionBar.o2 o2Var = nx0Var.H;
                if (o2Var != null) {
                    new cg.p1(o2Var, 11, false).show();
                    return;
                } else if (nx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) nx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                nx0.G(this.f34502b);
                return;
            case 2:
                this.f34502b.q0();
                return;
            case 3:
                nx0 nx0Var2 = this.f34502b;
                if (nx0Var2.U != null) {
                    nx0Var2.u0(nx0Var2.Q);
                    nx0Var2.q0();
                    nx0Var2.Q = null;
                    return;
                }
                nx0Var2.X.a(nx0Var2.P, null, nx0Var2.O, null, nx0Var2.f31175e0, true, 0, 0);
                nx0Var2.dismiss();
                return;
            case 4:
                this.f34502b.f31184n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                nx0 nx0Var3 = this.f34502b;
                org.telegram.ui.w60 w60Var = nx0Var3.Z;
                org.telegram.ui.c70 c70Var = w60Var.f43851c;
                f2.j0 j0Var = c70Var.h;
                boolean z10 = c70Var.J;
                int L0 = j0Var.L0();
                vk0 vk0Var = (vk0) c70Var.d.K(L0);
                if (vk0Var != null) {
                    i10 = vk0Var.f6432a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = c70Var.f37017n;
                if (w60Var.f43849a) {
                    c70Var.f37018r = null;
                    c70Var.f37019s = true;
                } else {
                    c70Var.f37018r = w60Var.f43850b;
                    c70Var.f37019s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.q00(w60Var, 9), 350L);
                }
                c70Var.h0();
                c70Var.f0(c70Var.f37018r, true);
                if (i11 != -1) {
                    if (!c70Var.I) {
                        for (int i12 = 0; i12 < c70Var.d.getChildCount(); i12++) {
                            View childAt = c70Var.d.getChildAt(i12);
                            if (c70Var.d.T(childAt).b() == c70Var.A + i11) {
                                ((org.telegram.ui.Cells.i8) childAt).b(false, true);
                            }
                        }
                    }
                    c70Var.f37015e.m(i11);
                }
                if (c70Var.f37017n != -1) {
                    if (!c70Var.I) {
                        for (int i13 = 0; i13 < c70Var.d.getChildCount(); i13++) {
                            View childAt2 = c70Var.d.getChildAt(i13);
                            if (c70Var.d.T(childAt2).b() == c70Var.A + c70Var.f37017n) {
                                ((org.telegram.ui.Cells.i8) childAt2).b(true, true);
                            }
                        }
                    }
                    c70Var.f37015e.m(c70Var.f37017n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    c70Var.h.h1(L0 + 1, i10);
                }
                if (c70Var.I) {
                    c70Var.H.H("", false);
                    lVar = ((org.telegram.ui.ActionBar.o2) c70Var).actionBar;
                    lVar.h(true);
                }
                nx0Var3.dismiss();
                return;
            case 6:
                nx0.r(this.f34502b);
                return;
            case 7:
                nx0.n(this.f34502b);
                return;
            case 8:
                nx0 nx0Var4 = this.f34502b;
                nx0Var4.f31184n.n();
                nx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new zw0(nx0Var4, 3), 200L);
                return;
            case 9:
                nx0.B(this.f34502b);
                return;
            case 10:
                nx0 nx0Var5 = this.f34502b;
                if (nx0Var5.N) {
                    nx0Var5.n0();
                    return;
                } else {
                    nx0Var5.p0();
                    return;
                }
            case 11:
                nx0.A(this.f34502b);
                return;
            case 12:
                nx0.q(this.f34502b);
                return;
            case 13:
                nx0 nx0Var6 = this.f34502b;
                Context context = nx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new xo0(4));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, i7.f6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView h = org.telegram.messenger.x3.h(context, 1, 16.0f);
                h.setTextColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f23345t5));
                h.setMaxLines(1);
                h.setLines(1);
                h.setText("t.me/addstickers/");
                h.setInputType(16385);
                h.setGravity(51);
                h.setSingleLine(true);
                h.setVisibility(4);
                h.setImeOptions(6);
                h.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(h, i7.f6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23364u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23382v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new bx0(nx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, i7.f6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new f1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.f23294q5));
                linearLayout.addView(textView, i7.f6.n(-1, -2));
                g1 g1Var = new g1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.setOnShowListener(g1Var);
                c2Var.show();
                editTextBoldCursor.requestFocus();
                c2Var.d(-1).setOnClickListener(new eg.f(nx0Var6, iArr, editTextBoldCursor, textView, h, alertDialog$Builder, 4));
                return;
            default:
                this.f34502b.dismiss();
                return;
        }
    }
}
