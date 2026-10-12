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
public final class dl0 extends og.b {
    public final nl0 d;

    public dl0(nl0 nl0Var) {
        this.d = nl0Var;
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
        return ((el0) this.d.d.get(i10)).f16877a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47901f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        ll0 ll0Var = (ll0) d1Var.f47897a;
        ll0Var.setScaleX(1.0f);
        ll0Var.setScaleY(1.0f);
        ll0.a(ll0Var, ((el0) this.d.d.get(i10)).f25727c, i10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        nl0 nl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new ll0(nl0Var, nl0Var.getContext());
            } else {
                nl0Var.S = new ci.m6(nl0Var, nl0Var.getContext());
                ls lsVar = new ls(nl0Var, nl0Var.getContext());
                nl0Var.f28862v0 = lsVar;
                lsVar.setImageResource(R.drawable.msg_reactions_expand);
                nl0Var.f28862v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = nl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    nl0Var.f28862v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    nl0Var.f28862v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                nl0Var.f28862v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20651i6, false), 40)));
                nl0Var.f28862v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                nl0Var.f28862v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                nl0Var.S.addView(nl0Var.f28862v0, w7.w5.e(30, 30, 17));
                nl0Var.f28862v0.setOnClickListener(new View.OnClickListener(this) {
                    public final dl0 f24951b;

                    {
                        this.f24951b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                dl0 dl0Var = this.f24951b;
                                dl0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                nl0 nl0Var2 = dl0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                nl0Var2.getClass();
                                new rg.y0(nl0Var2.f28860t0, 4, true).show();
                                return;
                            default:
                                nl0.a(this.f24951b.d);
                                return;
                        }
                    }
                });
                view = nl0Var.S;
            }
        } else {
            nl0Var.R = new FrameLayout(nl0Var.getContext());
            rg.c1 c1Var = new rg.c1(nl0Var.getContext(), 0, null);
            nl0Var.f28861u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f20631h5;
            c1Var.setColor(i0.a.d(0.7f, x02, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
            nl0Var.f28861u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            nl0Var.f28861u0.setScaleX(0.0f);
            nl0Var.f28861u0.setScaleY(0.0f);
            nl0Var.f28861u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            nl0Var.R.addView(nl0Var.f28861u0, w7.w5.e(26, 26, 17));
            nl0Var.f28861u0.setOnClickListener(new View.OnClickListener(this) {
                public final dl0 f24951b;

                {
                    this.f24951b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            dl0 dl0Var = this.f24951b;
                            dl0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            nl0 nl0Var2 = dl0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            nl0Var2.getClass();
                            new rg.y0(nl0Var2.f28860t0, 4, true).show();
                            return;
                        default:
                            nl0.a(this.f24951b.d);
                            return;
                    }
                }
            });
            view = nl0Var.R;
        }
        int topOffset = ((nl0Var.getLayoutParams().height - ((int) nl0Var.getTopOffset())) - nl0Var.getPaddingTop()) - nl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.d1(view);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = d1Var.f47901f;
        if ((i10 == 0 || i10 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((ll0) d1Var.f47897a).f(((el0) arrayList.get(b10)).f25727c, false);
        }
    }
}
