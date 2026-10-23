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
public final class wk0 extends pg.b {
    public final gl0 d;

    public wk0(gl0 gl0Var) {
        this.d = gl0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((xk0) this.d.d.get(i10)).f44713a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46346f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        el0 el0Var = (el0) b1Var.f46343a;
        el0Var.setScaleX(1.0f);
        el0Var.setScaleY(1.0f);
        el0.a(el0Var, ((xk0) this.d.d.get(i10)).f32590c, i10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        gl0 gl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new el0(gl0Var, gl0Var.getContext());
            } else {
                gl0Var.S = new ah.v(gl0Var, gl0Var.getContext());
                ds dsVar = new ds(gl0Var, gl0Var.getContext());
                gl0Var.f26666v0 = dsVar;
                dsVar.setImageResource(R.drawable.msg_reactions_expand);
                gl0Var.f26666v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = gl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    org.telegram.ui.ActionBar.r6.t(gl0Var.f26666v0, org.telegram.ui.ActionBar.k6.f21254h5, null, PorterDuff.Mode.MULTIPLY);
                } else {
                    gl0Var.f26666v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                ds dsVar2 = gl0Var.f26666v0;
                int dp = AndroidUtilities.dp(28.0f);
                int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
                org.telegram.ui.ActionBar.r6.S(dsVar2, org.telegram.ui.ActionBar.k6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i12, 40), null);
                gl0Var.f26666v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                gl0Var.f26666v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                gl0Var.S.addView(gl0Var.f26666v0, w7.z5.e(30, 30, 17));
                gl0Var.f26666v0.setOnClickListener(new View.OnClickListener(this) {
                    public final wk0 f31493b;

                    {
                        this.f31493b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wk0 wk0Var = this.f31493b;
                                wk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                gl0 gl0Var2 = wk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                gl0Var2.getClass();
                                new sg.y0(gl0Var2.f26664t0, 4, true).show();
                                return;
                            default:
                                gl0.a(this.f31493b.d);
                                return;
                        }
                    }
                });
                view = gl0Var.S;
            }
        } else {
            gl0Var.R = new FrameLayout(gl0Var.getContext());
            sg.c1 c1Var = new sg.c1(gl0Var.getContext(), 0, null);
            gl0Var.f26665u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false);
            int i13 = org.telegram.ui.ActionBar.k6.f21254h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
            org.telegram.ui.ActionBar.r6.t(gl0Var.f26665u0, i13, null, PorterDuff.Mode.MULTIPLY);
            gl0Var.f26665u0.setScaleX(0.0f);
            gl0Var.f26665u0.setScaleY(0.0f);
            gl0Var.f26665u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            gl0Var.R.addView(gl0Var.f26665u0, w7.z5.e(26, 26, 17));
            gl0Var.f26665u0.setOnClickListener(new View.OnClickListener(this) {
                public final wk0 f31493b;

                {
                    this.f31493b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            wk0 wk0Var = this.f31493b;
                            wk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            gl0 gl0Var2 = wk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            gl0Var2.getClass();
                            new sg.y0(gl0Var2.f26664t0, 4, true).show();
                            return;
                        default:
                            gl0.a(this.f31493b.d);
                            return;
                    }
                }
            });
            view = gl0Var.R;
        }
        int topOffset = ((gl0Var.getLayoutParams().height - ((int) gl0Var.getTopOffset())) - gl0Var.getPaddingTop()) - gl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.b1(view);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f46346f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((el0) b1Var.f46343a).f(((xk0) arrayList.get(b10)).f32590c, false);
        }
    }
}
