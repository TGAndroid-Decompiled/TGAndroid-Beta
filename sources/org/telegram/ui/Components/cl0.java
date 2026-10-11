package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cl0 extends og.b {
    public final ml0 d;

    public cl0(ml0 ml0Var) {
        this.d = ml0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((dl0) this.d.d.get(i10)).f17175a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47752f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        kl0 kl0Var = (kl0) d1Var.f47748a;
        kl0Var.setScaleX(1.0f);
        kl0Var.setScaleY(1.0f);
        kl0.a(kl0Var, ((dl0) this.d.d.get(i10)).f25626c, i10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        ml0 ml0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new kl0(ml0Var, ml0Var.getContext());
            } else {
                ml0Var.S = new ci.m6(ml0Var, ml0Var.getContext());
                ks ksVar = new ks(ml0Var, ml0Var.getContext());
                ml0Var.f28788v0 = ksVar;
                ksVar.setImageResource(R.drawable.msg_reactions_expand);
                ml0Var.f28788v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = ml0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    ml0Var.f28788v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    ml0Var.f28788v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                ml0Var.f28788v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false), 40)));
                ml0Var.f28788v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                ml0Var.f28788v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                ml0Var.S.addView(ml0Var.f28788v0, w7.x5.e(30, 30, 17));
                ml0Var.f28788v0.setOnClickListener(new View.OnClickListener(this) {
                    public final cl0 f24985b;

                    {
                        this.f24985b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                cl0 cl0Var = this.f24985b;
                                cl0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                ml0 ml0Var2 = cl0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                ml0Var2.getClass();
                                new rg.y0(ml0Var2.f28786t0, 4, true).show();
                                return;
                            default:
                                ml0.a(this.f24985b.d);
                                return;
                        }
                    }
                });
                view = ml0Var.S;
            }
        } else {
            ml0Var.R = new FrameLayout(ml0Var.getContext());
            rg.c1 c1Var = new rg.c1(ml0Var.getContext(), 0, null);
            ml0Var.f28787u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f20857h5;
            c1Var.setColor(i0.a.d(0.7f, x02, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
            ml0Var.f28787u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            ml0Var.f28787u0.setScaleX(0.0f);
            ml0Var.f28787u0.setScaleY(0.0f);
            ml0Var.f28787u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ml0Var.R.addView(ml0Var.f28787u0, w7.x5.e(26, 26, 17));
            ml0Var.f28787u0.setOnClickListener(new View.OnClickListener(this) {
                public final cl0 f24985b;

                {
                    this.f24985b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            cl0 cl0Var = this.f24985b;
                            cl0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            ml0 ml0Var2 = cl0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            ml0Var2.getClass();
                            new rg.y0(ml0Var2.f28786t0, 4, true).show();
                            return;
                        default:
                            ml0.a(this.f24985b.d);
                            return;
                    }
                }
            });
            view = ml0Var.R;
        }
        int topOffset = ((ml0Var.getLayoutParams().height - ((int) ml0Var.getTopOffset())) - ml0Var.getPaddingTop()) - ml0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.d1(view);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = d1Var.f47752f;
        if ((i10 == 0 || i10 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((kl0) d1Var.f47748a).f(((dl0) arrayList.get(b10)).f25626c, false);
        }
    }
}
