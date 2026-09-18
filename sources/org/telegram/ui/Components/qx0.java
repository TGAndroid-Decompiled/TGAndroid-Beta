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
    public final int f27748a;
    public final hy0 f27749b;

    public qx0(hy0 hy0Var, int i10) {
        this.f27748a = i10;
        this.f27749b = hy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f27748a) {
            case 0:
                hy0 hy0Var = this.f27749b;
                org.telegram.ui.ActionBar.n2 n2Var = hy0Var.L;
                if (n2Var != null) {
                    new rg.x0(n2Var, 11, false).show();
                    return;
                } else if (hy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) hy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                hy0.H(this.f27749b);
                return;
            case 2:
                this.f27749b.q0();
                return;
            case 3:
                hy0 hy0Var2 = this.f27749b;
                if (hy0Var2.Y != null) {
                    hy0Var2.u0(hy0Var2.U);
                    hy0Var2.q0();
                    hy0Var2.U = null;
                    return;
                }
                hy0Var2.f24754b0.d(hy0Var2.T, null, hy0Var2.S, null, hy0Var2.f24763i0, true, 0, 0);
                hy0Var2.dismiss();
                return;
            case 4:
                this.f27749b.f24767n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                hy0 hy0Var3 = this.f27749b;
                org.telegram.ui.o70 o70Var = hy0Var3.f24757d0;
                org.telegram.ui.t70 t70Var = o70Var.f36119c;
                s4.c0 c0Var = t70Var.h;
                boolean z10 = t70Var.N;
                int L0 = c0Var.L0();
                gl0 gl0Var = (gl0) t70Var.d.L(L0);
                if (gl0Var != null) {
                    i10 = gl0Var.f42929a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = t70Var.f37600n;
                if (o70Var.f36117a) {
                    t70Var.f37601r = null;
                    t70Var.f37602s = true;
                } else {
                    t70Var.f37601r = o70Var.f36118b;
                    t70Var.f37602s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(o70Var, 9), 350L);
                }
                t70Var.h0();
                t70Var.f0(t70Var.f37601r, true);
                if (i11 != -1) {
                    if (!t70Var.M) {
                        for (int i12 = 0; i12 < t70Var.d.getChildCount(); i12++) {
                            View childAt = t70Var.d.getChildAt(i12);
                            if (t70Var.d.U(childAt).b() == t70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    t70Var.e.m(i11);
                }
                if (t70Var.f37600n != -1) {
                    if (!t70Var.M) {
                        for (int i13 = 0; i13 < t70Var.d.getChildCount(); i13++) {
                            View childAt2 = t70Var.d.getChildAt(i13);
                            if (t70Var.d.U(childAt2).b() == t70Var.E + t70Var.f37600n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    t70Var.e.m(t70Var.f37600n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    t70Var.h.h1(L0 + 1, i10);
                }
                if (t70Var.M) {
                    t70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) t70Var).actionBar;
                    kVar.h(true);
                }
                hy0Var3.dismiss();
                return;
            case 6:
                hy0.r(this.f27749b);
                return;
            case 7:
                hy0.n(this.f27749b);
                return;
            case 8:
                hy0 hy0Var4 = this.f27749b;
                hy0Var4.f24767n.n();
                hy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new sx0(hy0Var4, 3), 200L);
                return;
            case 9:
                hy0.A(this.f27749b);
                return;
            case 10:
                hy0 hy0Var5 = this.f27749b;
                if (hy0Var5.R) {
                    hy0Var5.n0();
                    return;
                } else {
                    hy0Var5.p0();
                    return;
                }
            case 11:
                hy0.z(this.f27749b);
                return;
            case 12:
                hy0.q(this.f27749b);
                return;
            case 13:
                hy0 hy0Var6 = this.f27749b;
                Context context = hy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new jg0(10));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
                g10.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19356t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.y5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19374u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19392v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19169j5));
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
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19300q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(hy0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f27749b.dismiss();
                return;
        }
    }
}
