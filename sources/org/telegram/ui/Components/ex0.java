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
public final class ex0 implements View.OnClickListener {
    public final int f23761a;
    public final vx0 f23762b;

    public ex0(vx0 vx0Var, int i10) {
        this.f23761a = i10;
        this.f23762b = vx0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f23761a) {
            case 0:
                vx0 vx0Var = this.f23762b;
                org.telegram.ui.ActionBar.n2 n2Var = vx0Var.L;
                if (n2Var != null) {
                    new rg.x0(n2Var, 11, false).show();
                    return;
                } else if (vx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) vx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                vx0.H(this.f23762b);
                return;
            case 2:
                this.f23762b.q0();
                return;
            case 3:
                vx0 vx0Var2 = this.f23762b;
                if (vx0Var2.Y != null) {
                    vx0Var2.u0(vx0Var2.U);
                    vx0Var2.q0();
                    vx0Var2.U = null;
                    return;
                }
                vx0Var2.f29456b0.d(vx0Var2.T, null, vx0Var2.S, null, vx0Var2.f29465i0, true, 0, 0);
                vx0Var2.dismiss();
                return;
            case 4:
                this.f23762b.f29469n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                vx0 vx0Var3 = this.f23762b;
                org.telegram.ui.o70 o70Var = vx0Var3.f29459d0;
                org.telegram.ui.t70 t70Var = o70Var.f36116c;
                s4.c0 c0Var = t70Var.h;
                boolean z10 = t70Var.N;
                int L0 = c0Var.L0();
                vk0 vk0Var = (vk0) t70Var.d.K(L0);
                if (vk0Var != null) {
                    i10 = vk0Var.f42675a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = t70Var.f37575n;
                if (o70Var.f36114a) {
                    t70Var.f37576r = null;
                    t70Var.f37577s = true;
                } else {
                    t70Var.f37576r = o70Var.f36115b;
                    t70Var.f37577s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(o70Var, 9), 350L);
                }
                t70Var.h0();
                t70Var.f0(t70Var.f37576r, true);
                if (i11 != -1) {
                    if (!t70Var.M) {
                        for (int i12 = 0; i12 < t70Var.d.getChildCount(); i12++) {
                            View childAt = t70Var.d.getChildAt(i12);
                            if (t70Var.d.T(childAt).b() == t70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    t70Var.e.m(i11);
                }
                if (t70Var.f37575n != -1) {
                    if (!t70Var.M) {
                        for (int i13 = 0; i13 < t70Var.d.getChildCount(); i13++) {
                            View childAt2 = t70Var.d.getChildAt(i13);
                            if (t70Var.d.T(childAt2).b() == t70Var.E + t70Var.f37575n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    t70Var.e.m(t70Var.f37575n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    t70Var.h.h1(L0 + 1, i10);
                }
                if (t70Var.M) {
                    t70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) t70Var).actionBar;
                    kVar.h(true);
                }
                vx0Var3.dismiss();
                return;
            case 6:
                vx0.r(this.f23762b);
                return;
            case 7:
                vx0.n(this.f23762b);
                return;
            case 8:
                vx0 vx0Var4 = this.f23762b;
                vx0Var4.f29469n.n();
                vx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new gx0(vx0Var4, 3), 200L);
                return;
            case 9:
                vx0.A(this.f23762b);
                return;
            case 10:
                vx0 vx0Var5 = this.f23762b;
                if (vx0Var5.R) {
                    vx0Var5.n0();
                    return;
                } else {
                    vx0Var5.p0();
                    return;
                }
            case 11:
                vx0.z(this.f23762b);
                return;
            case 12:
                vx0.q(this.f23762b);
                return;
            case 13:
                vx0 vx0Var6 = this.f23762b;
                Context context = vx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new an0(8));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
                g10.setTextColor(vx0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f19129t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19147u5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19165v5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(vx0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f18943j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(vx0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new jx0(vx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(vx0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f19073q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(vx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                return;
            default:
                this.f23762b.dismiss();
                return;
        }
    }
}
