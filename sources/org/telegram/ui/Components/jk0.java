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
public final class jk0 extends og.b {
    public final tk0 d;

    public jk0(tk0 tk0Var) {
        this.d = tk0Var;
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
        return ((kk0) this.d.d.get(i10)).f15731a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f43071f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        rk0 rk0Var = (rk0) c1Var.f43068a;
        rk0Var.setScaleX(1.0f);
        rk0Var.setScaleY(1.0f);
        rk0.a(rk0Var, ((kk0) this.d.d.get(i10)).f25781c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        tk0 tk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new rk0(tk0Var, tk0Var.getContext());
            } else {
                tk0Var.S = new ci.m6(tk0Var, tk0Var.getContext());
                vr vrVar = new vr(tk0Var, tk0Var.getContext());
                tk0Var.f28589v0 = vrVar;
                vrVar.setImageResource(R.drawable.msg_reactions_expand);
                tk0Var.f28589v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = tk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    tk0Var.f28589v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19146h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    tk0Var.f28589v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                tk0Var.f28589v0.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165i6, false), 40)));
                tk0Var.f28589v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                tk0Var.f28589v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                tk0Var.S.addView(tk0Var.f28589v0, w7.y5.e(30, 30, 17));
                tk0Var.f28589v0.setOnClickListener(new View.OnClickListener(this) {
                    public final jk0 f25144b;

                    {
                        this.f25144b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                jk0 jk0Var = this.f25144b;
                                jk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                tk0 tk0Var2 = jk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                tk0Var2.getClass();
                                new rg.x0(tk0Var2.f28587t0, 4, true).show();
                                return;
                            default:
                                tk0.a(this.f25144b.d);
                                return;
                        }
                    }
                });
                view = tk0Var.S;
            }
        } else {
            tk0Var.R = new FrameLayout(tk0Var.getContext());
            rg.b1 b1Var = new rg.b1(tk0Var.getContext(), 0, null);
            tk0Var.f28588u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f19146h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
            tk0Var.f28588u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            tk0Var.f28588u0.setScaleX(0.0f);
            tk0Var.f28588u0.setScaleY(0.0f);
            tk0Var.f28588u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            tk0Var.R.addView(tk0Var.f28588u0, w7.y5.e(26, 26, 17));
            tk0Var.f28588u0.setOnClickListener(new View.OnClickListener(this) {
                public final jk0 f25144b;

                {
                    this.f25144b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            jk0 jk0Var = this.f25144b;
                            jk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            tk0 tk0Var2 = jk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            tk0Var2.getClass();
                            new rg.x0(tk0Var2.f28587t0, 4, true).show();
                            return;
                        default:
                            tk0.a(this.f25144b.d);
                            return;
                    }
                }
            });
            view = tk0Var.R;
        }
        int topOffset = ((tk0Var.getLayoutParams().height - ((int) tk0Var.getTopOffset())) - tk0Var.getPaddingTop()) - tk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f43071f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((rk0) c1Var.f43068a).f(((kk0) arrayList.get(b10)).f25781c, false);
        }
    }
}
