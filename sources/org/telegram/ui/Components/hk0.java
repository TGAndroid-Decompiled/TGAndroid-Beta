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
public final class hk0 extends og.b {
    public final rk0 d;

    public hk0(rk0 rk0Var) {
        this.d = rk0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((ik0) this.d.d.get(i10)).f15715a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42962f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        pk0 pk0Var = (pk0) c1Var.f42959a;
        pk0Var.setScaleX(1.0f);
        pk0Var.setScaleY(1.0f);
        pk0.a(pk0Var, ((ik0) this.d.d.get(i10)).f25119c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        rk0 rk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new pk0(rk0Var, rk0Var.getContext());
            } else {
                rk0Var.S = new ci.m6(rk0Var, rk0Var.getContext());
                ur urVar = new ur(rk0Var, rk0Var.getContext());
                rk0Var.f27985v0 = urVar;
                urVar.setImageResource(R.drawable.msg_reactions_expand);
                rk0Var.f27985v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = rk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    rk0Var.f27985v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    rk0Var.f27985v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                rk0Var.f27985v0.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19148i6, false), 40)));
                rk0Var.f27985v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                rk0Var.f27985v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                rk0Var.S.addView(rk0Var.f27985v0, w7.y5.e(30, 30, 17));
                rk0Var.f27985v0.setOnClickListener(new View.OnClickListener(this) {
                    public final hk0 f24518b;

                    {
                        this.f24518b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                hk0 hk0Var = this.f24518b;
                                hk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                rk0 rk0Var2 = hk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                rk0Var2.getClass();
                                new rg.x0(rk0Var2.f27983t0, 4, true).show();
                                return;
                            default:
                                rk0.a(this.f24518b.d);
                                return;
                        }
                    }
                });
                view = rk0Var.S;
            }
        } else {
            rk0Var.R = new FrameLayout(rk0Var.getContext());
            rg.b1 b1Var = new rg.b1(rk0Var.getContext(), 0, null);
            rk0Var.f27984u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f19129h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
            rk0Var.f27984u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            rk0Var.f27984u0.setScaleX(0.0f);
            rk0Var.f27984u0.setScaleY(0.0f);
            rk0Var.f27984u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            rk0Var.R.addView(rk0Var.f27984u0, w7.y5.e(26, 26, 17));
            rk0Var.f27984u0.setOnClickListener(new View.OnClickListener(this) {
                public final hk0 f24518b;

                {
                    this.f24518b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            hk0 hk0Var = this.f24518b;
                            hk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            rk0 rk0Var2 = hk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            rk0Var2.getClass();
                            new rg.x0(rk0Var2.f27983t0, 4, true).show();
                            return;
                        default:
                            rk0.a(this.f24518b.d);
                            return;
                    }
                }
            });
            view = rk0Var.R;
        }
        int topOffset = ((rk0Var.getLayoutParams().height - ((int) rk0Var.getTopOffset())) - rk0Var.getPaddingTop()) - rk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f42962f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((pk0) c1Var.f42959a).f(((ik0) arrayList.get(b10)).f25119c, false);
        }
    }
}
