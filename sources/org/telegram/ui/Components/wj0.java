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
public final class wj0 extends og.b {
    public final gk0 d;

    public wj0(gk0 gk0Var) {
        this.d = gk0Var;
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
        return ((xj0) this.d.d.get(i10)).f15508a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42630f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        ek0 ek0Var = (ek0) c1Var.f42627a;
        ek0Var.setScaleX(1.0f);
        ek0Var.setScaleY(1.0f);
        ek0.a(ek0Var, ((xj0) this.d.d.get(i10)).f30001c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        gk0 gk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new ek0(gk0Var, gk0Var.getContext());
            } else {
                gk0Var.S = new ci.m6(gk0Var, gk0Var.getContext());
                tr trVar = new tr(gk0Var, gk0Var.getContext());
                gk0Var.f24355v0 = trVar;
                trVar.setImageResource(R.drawable.msg_reactions_expand);
                gk0Var.f24355v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = gk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    gk0Var.f24355v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    gk0Var.f24355v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                gk0Var.f24355v0.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 40)));
                gk0Var.f24355v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                gk0Var.f24355v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                gk0Var.S.addView(gk0Var.f24355v0, w7.x5.e(30, 30, 17));
                gk0Var.f24355v0.setOnClickListener(new View.OnClickListener(this) {
                    public final wj0 f28762b;

                    {
                        this.f28762b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wj0 wj0Var = this.f28762b;
                                wj0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                gk0 gk0Var2 = wj0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                gk0Var2.getClass();
                                new rg.x0(gk0Var2.f24353t0, 4, true).show();
                                return;
                            default:
                                gk0.a(this.f28762b.d);
                                return;
                        }
                    }
                });
                view = gk0Var.S;
            }
        } else {
            gk0Var.R = new FrameLayout(gk0Var.getContext());
            rg.b1 b1Var = new rg.b1(gk0Var.getContext(), 0, null);
            gk0Var.f24354u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f18859h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
            gk0Var.f24354u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            gk0Var.f24354u0.setScaleX(0.0f);
            gk0Var.f24354u0.setScaleY(0.0f);
            gk0Var.f24354u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            gk0Var.R.addView(gk0Var.f24354u0, w7.x5.e(26, 26, 17));
            gk0Var.f24354u0.setOnClickListener(new View.OnClickListener(this) {
                public final wj0 f28762b;

                {
                    this.f28762b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            wj0 wj0Var = this.f28762b;
                            wj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            gk0 gk0Var2 = wj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            gk0Var2.getClass();
                            new rg.x0(gk0Var2.f24353t0, 4, true).show();
                            return;
                        default:
                            gk0.a(this.f28762b.d);
                            return;
                    }
                }
            });
            view = gk0Var.R;
        }
        int topOffset = ((gk0Var.getLayoutParams().height - ((int) gk0Var.getTopOffset())) - gk0Var.getPaddingTop()) - gk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f42630f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((ek0) c1Var.f42627a).f(((xj0) arrayList.get(b10)).f30001c, false);
        }
    }
}
