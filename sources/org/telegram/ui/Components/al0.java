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
public final class al0 extends og.b {
    public final kl0 d;

    public al0(kl0 kl0Var) {
        this.d = kl0Var;
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
        return ((bl0) this.d.d.get(i10)).f17125a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47662f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        il0 il0Var = (il0) d1Var.f47658a;
        il0Var.setScaleX(1.0f);
        il0Var.setScaleY(1.0f);
        il0.a(il0Var, ((bl0) this.d.d.get(i10)).f25046c, i10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        kl0 kl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new il0(kl0Var, kl0Var.getContext());
            } else {
                kl0Var.S = new ci.m6(kl0Var, kl0Var.getContext());
                js jsVar = new js(kl0Var, kl0Var.getContext());
                kl0Var.f28102v0 = jsVar;
                jsVar.setImageResource(R.drawable.msg_reactions_expand);
                kl0Var.f28102v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = kl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    kl0Var.f28102v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    kl0Var.f28102v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                kl0Var.f28102v0.setBackground(org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 40)));
                kl0Var.f28102v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                kl0Var.f28102v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                kl0Var.S.addView(kl0Var.f28102v0, w7.x5.e(30, 30, 17));
                kl0Var.f28102v0.setOnClickListener(new View.OnClickListener(this) {
                    public final al0 f33594b;

                    {
                        this.f33594b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                al0 al0Var = this.f33594b;
                                al0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                kl0 kl0Var2 = al0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                kl0Var2.getClass();
                                new rg.y0(kl0Var2.f28100t0, 4, true).show();
                                return;
                            default:
                                kl0.a(this.f33594b.d);
                                return;
                        }
                    }
                });
                view = kl0Var.S;
            }
        } else {
            kl0Var.R = new FrameLayout(kl0Var.getContext());
            rg.c1 c1Var = new rg.c1(kl0Var.getContext(), 0, null);
            kl0Var.f28101u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.F8, false);
            int i12 = org.telegram.ui.ActionBar.i6.f20868h5;
            c1Var.setColor(i0.a.d(0.7f, x02, org.telegram.ui.ActionBar.i6.x0(null, i12, false)));
            kl0Var.f28101u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            kl0Var.f28101u0.setScaleX(0.0f);
            kl0Var.f28101u0.setScaleY(0.0f);
            kl0Var.f28101u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            kl0Var.R.addView(kl0Var.f28101u0, w7.x5.e(26, 26, 17));
            kl0Var.f28101u0.setOnClickListener(new View.OnClickListener(this) {
                public final al0 f33594b;

                {
                    this.f33594b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            al0 al0Var = this.f33594b;
                            al0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            kl0 kl0Var2 = al0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            kl0Var2.getClass();
                            new rg.y0(kl0Var2.f28100t0, 4, true).show();
                            return;
                        default:
                            kl0.a(this.f33594b.d);
                            return;
                    }
                }
            });
            view = kl0Var.R;
        }
        int topOffset = ((kl0Var.getLayoutParams().height - ((int) kl0Var.getTopOffset())) - kl0Var.getPaddingTop()) - kl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.d1(view);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = d1Var.f47662f;
        if ((i10 == 0 || i10 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((il0) d1Var.f47658a).f(((bl0) arrayList.get(b10)).f25046c, false);
        }
    }
}
