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
public final class hk0 extends cg.c {
    public final rk0 d;

    public hk0(rk0 rk0Var) {
        this.d = rk0Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((ik0) this.d.d.get(i10)).f2505a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f5879f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        pk0 pk0Var = (pk0) m1Var.f5875a;
        pk0Var.setScaleX(1.0f);
        pk0Var.setScaleY(1.0f);
        pk0.a(pk0Var, ((ik0) this.d.d.get(i10)).f27851c, i10);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        rk0 rk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new pk0(rk0Var, rk0Var.getContext());
            } else {
                rk0Var.P = new ag.l(rk0Var, rk0Var.getContext());
                rr rrVar = new rr(rk0Var, rk0Var.getContext());
                rk0Var.f30784s0 = rrVar;
                rrVar.setImageResource(R.drawable.msg_reactions_expand);
                rk0Var.f30784s0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = rk0Var.J0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    rk0Var.f30784s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    rk0Var.f30784s0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                rk0Var.f30784s0.setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 40)));
                rk0Var.f30784s0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                rk0Var.f30784s0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                rk0Var.P.addView(rk0Var.f30784s0, k7.c6.e(30, 30, 17));
                rk0Var.f30784s0.setOnClickListener(new View.OnClickListener(this) {
                    public final hk0 f27214b;

                    {
                        this.f27214b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                hk0 hk0Var = this.f27214b;
                                hk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                rk0 rk0Var2 = hk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                rk0Var2.getClass();
                                new fg.n1(rk0Var2.f30780q0, 4, true).show();
                                return;
                            default:
                                rk0.a(this.f27214b.d);
                                return;
                        }
                    }
                });
                view = rk0Var.P;
            }
        } else {
            rk0Var.O = new FrameLayout(rk0Var.getContext());
            fg.r1 r1Var = new fg.r1(rk0Var.getContext(), 0, null);
            rk0Var.f30782r0 = r1Var;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.F8, false);
            int i12 = org.telegram.ui.ActionBar.k6.f21731h5;
            r1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.k6.w0(null, i12, false)));
            rk0Var.f30782r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            rk0Var.f30782r0.setScaleX(0.0f);
            rk0Var.f30782r0.setScaleY(0.0f);
            rk0Var.f30782r0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            rk0Var.O.addView(rk0Var.f30782r0, k7.c6.e(26, 26, 17));
            rk0Var.f30782r0.setOnClickListener(new View.OnClickListener(this) {
                public final hk0 f27214b;

                {
                    this.f27214b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            hk0 hk0Var = this.f27214b;
                            hk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            rk0 rk0Var2 = hk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            rk0Var2.getClass();
                            new fg.n1(rk0Var2.f30780q0, 4, true).show();
                            return;
                        default:
                            rk0.a(this.f27214b.d);
                            return;
                    }
                }
            });
            view = rk0Var.O;
        }
        int topOffset = ((rk0Var.getLayoutParams().height - ((int) rk0Var.getTopOffset())) - rk0Var.getPaddingTop()) - rk0Var.getPaddingBottom();
        view.setLayoutParams(new f2.x0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new f2.m1(view);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = m1Var.f5879f;
        if ((i10 == 0 || i10 == 3) && (b10 = m1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((pk0) m1Var.f5875a).f(((ik0) arrayList.get(b10)).f27851c, false);
        }
    }
}
