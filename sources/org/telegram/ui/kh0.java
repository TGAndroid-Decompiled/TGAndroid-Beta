package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kh0 extends org.telegram.ui.Components.km0 {
    public final Context f38927c;
    public final lh0 d;

    public kh0(lh0 lh0Var, Context context) {
        this.d = lh0Var;
        this.f38927c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        lh0 lh0Var = this.d;
        if (lh0Var.Q != b10 && lh0Var.f39298x != b10) {
            if (b10 < lh0Var.f39299y || b10 >= lh0Var.E) {
                if ((b10 < lh0Var.H || b10 >= lh0Var.I) && b10 != lh0Var.N) {
                    if (b10 >= lh0Var.U && b10 < lh0Var.V) {
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
        lh0 lh0Var = this.d;
        if (i10 == lh0Var.f39292r) {
            return 0;
        }
        if (i10 == lh0Var.f39294s || i10 == lh0Var.L || i10 == lh0Var.S || i10 == lh0Var.P) {
            return 1;
        }
        if (i10 == lh0Var.v) {
            return 2;
        }
        if (i10 == lh0Var.f39298x) {
            return 3;
        }
        if (i10 != lh0Var.f39297w && i10 != lh0Var.J && i10 != lh0Var.M && i10 != lh0Var.R && i10 != lh0Var.T) {
            if (i10 < lh0Var.f39299y || i10 >= lh0Var.E) {
                if (i10 >= lh0Var.H && i10 < lh0Var.I) {
                    return 5;
                }
                if (i10 == lh0Var.F) {
                    return 6;
                }
                if (i10 == lh0Var.K) {
                    return 7;
                }
                if (i10 == lh0Var.N) {
                    return 8;
                }
                if (i10 == lh0Var.O) {
                    return 9;
                }
                if (i10 != lh0Var.Q) {
                    if (i10 < lh0Var.U || i10 >= lh0Var.V) {
                        if (i10 != lh0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kh0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.p90 p90Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.z00 z00Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        lh0 lh0Var = this.d;
        Context context = this.f38927c;
        switch (i10) {
            case 1:
                p90Var = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.p90 p90Var2 = new org.telegram.ui.Components.p90(this.f38927c, lh0Var, null, true, lh0Var.h);
                p90Var2.setPermanent(true);
                p90Var2.setDelegate(new jh0(this, p90Var2));
                p90Var = p90Var2;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.o2) lh0Var).resourceProvider;
                p90Var = new org.telegram.ui.Cells.f2(context, 64, g6Var);
                break;
            case 4:
                p90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 5:
                p90Var = new ih0(lh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.z00 z00Var2 = new org.telegram.ui.Components.z00(context, null);
                z00Var2.setIsSingleCell(true);
                z00Var2.setViewType(9);
                z00Var2.f33104w = false;
                z00Var = z00Var2;
                p90Var = z00Var;
                break;
            case 7:
                p90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.f21405p7, null);
                z00Var = caVar;
                p90Var = z00Var;
                break;
            case 9:
                p90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                p90Var = new org.telegram.ui.Cells.a5(8, 6, this.f38927c, null, false);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.o2) lh0Var).resourceProvider;
                p90Var = new org.telegram.ui.Cells.e9(context, g6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new dh0(context), w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21240g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (lh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                p90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(p90Var, p90Var, -1, -2);
    }
}
