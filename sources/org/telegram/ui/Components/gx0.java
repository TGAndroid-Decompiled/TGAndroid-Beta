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
public final class gx0 implements View.OnClickListener {
    public final int f25250a;
    public final xx0 f25251b;

    public gx0(xx0 xx0Var, int i10) {
        this.f25250a = i10;
        this.f25251b = xx0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f25250a) {
            case 0:
                xx0 xx0Var = this.f25251b;
                org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
                if (p2Var != null) {
                    new eg.o1(p2Var, 11, false).show();
                    return;
                } else if (xx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                xx0.G(this.f25251b);
                return;
            case 2:
                this.f25251b.q0();
                return;
            case 3:
                xx0 xx0Var2 = this.f25251b;
                if (xx0Var2.V != null) {
                    xx0Var2.u0(xx0Var2.R);
                    xx0Var2.q0();
                    xx0Var2.R = null;
                    return;
                }
                xx0Var2.Y.d(xx0Var2.Q, null, xx0Var2.P, null, xx0Var2.f30757f0, true, 0, 0);
                xx0Var2.dismiss();
                return;
            case 4:
                this.f25251b.f30764n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                xx0 xx0Var3 = this.f25251b;
                org.telegram.ui.j70 j70Var = xx0Var3.f30749a0;
                org.telegram.ui.o70 o70Var = j70Var.f35103c;
                f2.i0 i0Var = o70Var.h;
                boolean z4 = o70Var.K;
                int L0 = i0Var.L0();
                dl0 dl0Var = (dl0) o70Var.d.K(L0);
                if (dl0Var != null) {
                    i10 = dl0Var.f5774a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = o70Var.f36674n;
                if (j70Var.f35101a) {
                    o70Var.f36675r = null;
                    o70Var.f36676s = true;
                } else {
                    o70Var.f36675r = j70Var.f35102b;
                    o70Var.f36676s = false;
                }
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.d10(j70Var, 9), 350L);
                }
                o70Var.h0();
                o70Var.f0(o70Var.f36675r, true);
                if (i11 != -1) {
                    if (!o70Var.J) {
                        for (int i12 = 0; i12 < o70Var.d.getChildCount(); i12++) {
                            View childAt = o70Var.d.getChildAt(i12);
                            if (o70Var.d.T(childAt).b() == o70Var.B + i11) {
                                ((org.telegram.ui.Cells.j8) childAt).b(false, true);
                            }
                        }
                    }
                    o70Var.e.m(i11);
                }
                if (o70Var.f36674n != -1) {
                    if (!o70Var.J) {
                        for (int i13 = 0; i13 < o70Var.d.getChildCount(); i13++) {
                            View childAt2 = o70Var.d.getChildAt(i13);
                            if (o70Var.d.T(childAt2).b() == o70Var.B + o70Var.f36674n) {
                                ((org.telegram.ui.Cells.j8) childAt2).b(true, true);
                            }
                        }
                    }
                    o70Var.e.m(o70Var.f36674n);
                }
                if (i10 != Integer.MAX_VALUE && !z4) {
                    o70Var.h.h1(L0 + 1, i10);
                }
                if (o70Var.J) {
                    o70Var.I.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.p2) o70Var).actionBar;
                    kVar.h(true);
                }
                xx0Var3.dismiss();
                return;
            case 6:
                xx0.r(this.f25251b);
                return;
            case 7:
                xx0.n(this.f25251b);
                return;
            case 8:
                xx0 xx0Var4 = this.f25251b;
                xx0Var4.f30764n.n();
                xx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ix0(xx0Var4, 3), 200L);
                return;
            case 9:
                xx0.B(this.f25251b);
                return;
            case 10:
                xx0 xx0Var5 = this.f25251b;
                if (xx0Var5.O) {
                    xx0Var5.n0();
                    return;
                } else {
                    xx0Var5.p0();
                    return;
                }
            case 11:
                xx0.A(this.f25251b);
                return;
            case 12:
                xx0.q(this.f25251b);
                return;
            case 13:
                xx0 xx0Var6 = this.f25251b;
                Context context = xx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new lh0(9));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
                g10.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f20165t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, k7.b6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20181u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20199v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f19987j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new kx0(xx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, k7.b6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ev(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.f20114q5));
                linearLayout.addView(textView, k7.b6.n(-1, -2));
                e1 e1Var = new e1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.setOnShowListener(e1Var);
                d2Var.show();
                editTextBoldCursor.requestFocus();
                d2Var.d(-1).setOnClickListener(new gg.e(xx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                return;
            default:
                this.f25251b.dismiss();
                return;
        }
    }
}
