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
public final class gy0 implements View.OnClickListener {
    public final int f26895a;
    public final xy0 f26896b;

    public gy0(xy0 xy0Var, int i10) {
        this.f26895a = i10;
        this.f26896b = xy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f26895a) {
            case 0:
                xy0 xy0Var = this.f26896b;
                org.telegram.ui.ActionBar.n2 n2Var = xy0Var.L;
                if (n2Var != null) {
                    new rg.y0(n2Var, 11, false).show();
                    return;
                } else if (xy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                xy0.I(this.f26896b);
                return;
            case 2:
                this.f26896b.r0();
                return;
            case 3:
                xy0 xy0Var2 = this.f26896b;
                if (xy0Var2.Y != null) {
                    xy0Var2.v0(xy0Var2.U);
                    xy0Var2.r0();
                    xy0Var2.U = null;
                    return;
                }
                xy0Var2.f33024b0.d(xy0Var2.T, null, xy0Var2.S, null, xy0Var2.f33034i0, true, 0, 0);
                xy0Var2.dismiss();
                return;
            case 4:
                this.f26896b.f33038n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                xy0 xy0Var3 = this.f26896b;
                org.telegram.ui.n70 n70Var = xy0Var3.f33027d0;
                org.telegram.ui.s70 s70Var = n70Var.f40095c;
                s4.d0 d0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = d0Var.L0();
                am0 am0Var = (am0) s70Var.d.K(L0);
                if (am0Var != null) {
                    i10 = am0Var.f47658a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = s70Var.f41598n;
                if (n70Var.f40093a) {
                    s70Var.f41599r = null;
                    s70Var.f41600s = true;
                } else {
                    s70Var.f41599r = n70Var.f40094b;
                    s70Var.f41600s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.uz(n70Var, 10), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.f41599r, true);
                if (i11 != -1) {
                    if (!s70Var.M) {
                        for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                            View childAt = s70Var.d.getChildAt(i12);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i11) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    s70Var.f41596e.m(i11);
                }
                if (s70Var.f41598n != -1) {
                    if (!s70Var.M) {
                        for (int i13 = 0; i13 < s70Var.d.getChildCount(); i13++) {
                            View childAt2 = s70Var.d.getChildAt(i13);
                            if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.f41598n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    s70Var.f41596e.m(s70Var.f41598n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    s70Var.h.h1(L0 + 1, i10);
                }
                if (s70Var.M) {
                    s70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) s70Var).actionBar;
                    kVar.h(true);
                }
                xy0Var3.dismiss();
                return;
            case 6:
                xy0.t(this.f26896b);
                return;
            case 7:
                xy0.p(this.f26896b);
                return;
            case 8:
                xy0 xy0Var4 = this.f26896b;
                xy0Var4.f33038n.n();
                xy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new iy0(xy0Var4, 3), 200L);
                return;
            case 9:
                xy0.D(this.f26896b);
                return;
            case 10:
                xy0 xy0Var5 = this.f26896b;
                if (xy0Var5.R) {
                    xy0Var5.o0();
                    return;
                } else {
                    xy0Var5.q0();
                    return;
                }
            case 11:
                xy0.C(this.f26896b);
                return;
            case 12:
                xy0.s(this.f26896b);
                return;
            case 13:
                xy0 xy0Var6 = this.f26896b;
                Context context = xy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new fe0(15));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
                f7.setTextColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f21091t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21109u5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21127v5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f20905j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ly0(xy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bw(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.f21036q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(xy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                return;
            default:
                this.f26896b.dismiss();
                return;
        }
    }
}
