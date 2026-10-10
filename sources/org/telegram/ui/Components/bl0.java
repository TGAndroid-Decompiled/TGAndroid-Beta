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
public final class bl0 extends og.b {
    public final ll0 d;

    public bl0(ll0 ll0Var) {
        this.d = ll0Var;
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
        return ((cl0) this.d.d.get(i10)).f17129a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47706f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        jl0 jl0Var = (jl0) d1Var.f47702a;
        jl0Var.setScaleX(1.0f);
        jl0Var.setScaleY(1.0f);
        jl0.a(jl0Var, ((cl0) this.d.d.get(i10)).f25322c, i10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        ll0 ll0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new jl0(ll0Var, ll0Var.getContext());
            } else {
                ll0Var.S = new ci.m6(ll0Var, ll0Var.getContext());
                ks ksVar = new ks(ll0Var, ll0Var.getContext());
                ll0Var.f28417v0 = ksVar;
                ksVar.setImageResource(R.drawable.msg_reactions_expand);
                ll0Var.f28417v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = ll0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    ll0Var.f28417v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    ll0Var.f28417v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                ll0Var.f28417v0.setBackground(org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false), 40)));
                ll0Var.f28417v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                ll0Var.f28417v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                ll0Var.S.addView(ll0Var.f28417v0, w7.x5.e(30, 30, 17));
                ll0Var.f28417v0.setOnClickListener(new View.OnClickListener(this) {
                    public final bl0 f24581b;

                    {
                        this.f24581b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                bl0 bl0Var = this.f24581b;
                                bl0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                ll0 ll0Var2 = bl0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                ll0Var2.getClass();
                                new rg.y0(ll0Var2.f28415t0, 4, true).show();
                                return;
                            default:
                                ll0.a(this.f24581b.d);
                                return;
                        }
                    }
                });
                view = ll0Var.S;
            }
        } else {
            ll0Var.R = new FrameLayout(ll0Var.getContext());
            rg.c1 c1Var = new rg.c1(ll0Var.getContext(), 0, null);
            ll0Var.f28416u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.F8, false);
            int i12 = org.telegram.ui.ActionBar.i6.f20872h5;
            c1Var.setColor(i0.a.d(0.7f, x02, org.telegram.ui.ActionBar.i6.x0(null, i12, false)));
            ll0Var.f28416u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            ll0Var.f28416u0.setScaleX(0.0f);
            ll0Var.f28416u0.setScaleY(0.0f);
            ll0Var.f28416u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ll0Var.R.addView(ll0Var.f28416u0, w7.x5.e(26, 26, 17));
            ll0Var.f28416u0.setOnClickListener(new View.OnClickListener(this) {
                public final bl0 f24581b;

                {
                    this.f24581b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            bl0 bl0Var = this.f24581b;
                            bl0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            ll0 ll0Var2 = bl0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            ll0Var2.getClass();
                            new rg.y0(ll0Var2.f28415t0, 4, true).show();
                            return;
                        default:
                            ll0.a(this.f24581b.d);
                            return;
                    }
                }
            });
            view = ll0Var.R;
        }
        int topOffset = ((ll0Var.getLayoutParams().height - ((int) ll0Var.getTopOffset())) - ll0Var.getPaddingTop()) - ll0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.d1(view);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = d1Var.f47706f;
        if ((i10 == 0 || i10 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((jl0) d1Var.f47702a).f(((cl0) arrayList.get(b10)).f25322c, false);
        }
    }
}
