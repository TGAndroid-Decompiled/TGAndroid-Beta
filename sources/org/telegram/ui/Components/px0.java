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
public final class px0 implements View.OnClickListener {
    public final int f26258a;
    public final hy0 f26259b;

    public px0(hy0 hy0Var, int i10) {
        this.f26258a = i10;
        this.f26259b = hy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f26258a) {
            case 0:
                hy0 hy0Var = this.f26259b;
                org.telegram.ui.ActionBar.p2 p2Var = hy0Var.L;
                if (p2Var != null) {
                    new qg.a1(p2Var, 11, false).show();
                    return;
                } else if (hy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) hy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                hy0.H(this.f26259b);
                return;
            case 2:
                this.f26259b.q0();
                return;
            case 3:
                hy0 hy0Var2 = this.f26259b;
                if (hy0Var2.Y != null) {
                    hy0Var2.u0(hy0Var2.U);
                    hy0Var2.q0();
                    hy0Var2.U = null;
                    return;
                }
                hy0Var2.f23805b0.d(hy0Var2.T, null, hy0Var2.S, null, hy0Var2.f23814i0, true, 0, 0);
                hy0Var2.dismiss();
                return;
            case 4:
                this.f26259b.f23818n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                hy0 hy0Var3 = this.f26259b;
                org.telegram.ui.n70 n70Var = hy0Var3.f23808d0;
                org.telegram.ui.s70 s70Var = n70Var.f35148c;
                s4.c0 c0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = c0Var.L0();
                fl0 fl0Var = (fl0) s70Var.d.K(L0);
                if (fl0Var != null) {
                    i10 = fl0Var.f41610a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = s70Var.f36570n;
                if (n70Var.f35146a) {
                    s70Var.f36571r = null;
                    s70Var.f36572s = true;
                } else {
                    s70Var.f36571r = n70Var.f35147b;
                    s70Var.f36572s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i10(n70Var, 9), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.f36571r, true);
                if (i11 != -1) {
                    if (!s70Var.M) {
                        for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                            View childAt = s70Var.d.getChildAt(i12);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i11) {
                                ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                            }
                        }
                    }
                    s70Var.e.m(i11);
                }
                if (s70Var.f36570n != -1) {
                    if (!s70Var.M) {
                        for (int i13 = 0; i13 < s70Var.d.getChildCount(); i13++) {
                            View childAt2 = s70Var.d.getChildAt(i13);
                            if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.f36570n) {
                                ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                            }
                        }
                    }
                    s70Var.e.m(s70Var.f36570n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    s70Var.h.h1(L0 + 1, i10);
                }
                if (s70Var.M) {
                    s70Var.L.H("", false);
                    lVar = ((org.telegram.ui.ActionBar.p2) s70Var).actionBar;
                    lVar.h(true);
                }
                hy0Var3.dismiss();
                return;
            case 6:
                hy0.r(this.f26259b);
                return;
            case 7:
                hy0.n(this.f26259b);
                return;
            case 8:
                hy0 hy0Var4 = this.f26259b;
                hy0Var4.f23818n.n();
                hy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new rx0(hy0Var4, 3), 200L);
                return;
            case 9:
                hy0.A(this.f26259b);
                return;
            case 10:
                hy0 hy0Var5 = this.f26259b;
                if (hy0Var5.R) {
                    hy0Var5.n0();
                    return;
                } else {
                    hy0Var5.p0();
                    return;
                }
            case 11:
                hy0.z(this.f26259b);
                return;
            case 12:
                hy0.q(this.f26259b);
                return;
            case 13:
                hy0 hy0Var6 = this.f26259b;
                Context context = hy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new gp0(6));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.a2.g(context, 1, 16.0f);
                g10.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f18217t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18235u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18253v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new vx0(hy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.a6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new g1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f18161q5));
                linearLayout.addView(textView, w7.a6.n(-1, -2));
                h1 h1Var = new h1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.setOnShowListener(h1Var);
                d2Var.show();
                editTextBoldCursor.requestFocus();
                d2Var.d(-1).setOnClickListener(new o0(hy0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f26259b.dismiss();
                return;
        }
    }
}
