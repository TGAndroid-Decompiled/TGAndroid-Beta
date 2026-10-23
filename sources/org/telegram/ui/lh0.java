package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lh0 extends org.telegram.ui.Components.lm0 {
    public final Context f39258c;
    public final mh0 d;

    public lh0(mh0 mh0Var, Context context) {
        this.d = mh0Var;
        this.f39258c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        mh0 mh0Var = this.d;
        if (mh0Var.Q != b10 && mh0Var.f39603x != b10) {
            if (b10 < mh0Var.f39604y || b10 >= mh0Var.E) {
                if ((b10 < mh0Var.H || b10 >= mh0Var.I) && b10 != mh0Var.N) {
                    if (b10 >= mh0Var.U && b10 < mh0Var.V) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.X;
    }

    @Override
    public final int j(int i10) {
        mh0 mh0Var = this.d;
        if (i10 == mh0Var.f39597r) {
            return 0;
        }
        if (i10 == mh0Var.f39599s || i10 == mh0Var.L || i10 == mh0Var.S || i10 == mh0Var.P) {
            return 1;
        }
        if (i10 == mh0Var.v) {
            return 2;
        }
        if (i10 == mh0Var.f39603x) {
            return 3;
        }
        if (i10 != mh0Var.f39602w && i10 != mh0Var.J && i10 != mh0Var.M && i10 != mh0Var.R && i10 != mh0Var.T) {
            if (i10 < mh0Var.f39604y || i10 >= mh0Var.E) {
                if (i10 >= mh0Var.H && i10 < mh0Var.I) {
                    return 5;
                }
                if (i10 == mh0Var.F) {
                    return 6;
                }
                if (i10 == mh0Var.K) {
                    return 7;
                }
                if (i10 == mh0Var.N) {
                    return 8;
                }
                if (i10 == mh0Var.O) {
                    return 9;
                }
                if (i10 != mh0Var.Q) {
                    if (i10 < mh0Var.U || i10 >= mh0Var.V) {
                        if (i10 != mh0Var.G) {
                            return 1;
                        }
                        return 11;
                    }
                    return 10;
                }
                return 10;
            }
            return 5;
        }
        return 4;
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.r90 r90Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.b10 b10Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        mh0 mh0Var = this.d;
        Context context = this.f39258c;
        switch (i10) {
            case 1:
                r90Var = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r90 r90Var2 = new org.telegram.ui.Components.r90(this.f39258c, mh0Var, null, true, mh0Var.h);
                r90Var2.setPermanent(true);
                r90Var2.setDelegate(new kh0(this, r90Var2));
                r90Var = r90Var2;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.o2) mh0Var).resourceProvider;
                r90Var = new org.telegram.ui.Cells.f2(context, 64, g6Var);
                break;
            case 4:
                r90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 5:
                r90Var = new jh0(mh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.b10 b10Var2 = new org.telegram.ui.Components.b10(context, null);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(9);
                b10Var2.f24923w = false;
                b10Var = b10Var2;
                r90Var = b10Var;
                break;
            case 7:
                r90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.f21404p7, null);
                b10Var = caVar;
                r90Var = b10Var;
                break;
            case 9:
                r90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                r90Var = new org.telegram.ui.Cells.a5(8, 6, this.f39258c, null, false);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.o2) mh0Var).resourceProvider;
                r90Var = new org.telegram.ui.Cells.e9(context, g6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new eh0(context), w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21239g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (mh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                r90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(r90Var, r90Var, -1, -2);
    }
}
