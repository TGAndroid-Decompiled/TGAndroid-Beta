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
public final class tk0 extends pg.b {
    public final dl0 d;

    public tk0(dl0 dl0Var) {
        this.d = dl0Var;
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
        return ((uk0) this.d.d.get(i10)).f44300a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f45924f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        bl0 bl0Var = (bl0) b1Var.f45921a;
        bl0Var.setScaleX(1.0f);
        bl0Var.setScaleY(1.0f);
        bl0.a(bl0Var, ((uk0) this.d.d.get(i10)).f30960c, i10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        dl0 dl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new bl0(dl0Var, dl0Var.getContext());
            } else {
                dl0Var.S = new ah.v(dl0Var, dl0Var.getContext());
                ds dsVar = new ds(dl0Var, dl0Var.getContext());
                dl0Var.f25563v0 = dsVar;
                dsVar.setImageResource(R.drawable.msg_reactions_expand);
                dl0Var.f25563v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = dl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    dl0Var.f25563v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    dl0Var.f25563v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                dl0Var.f25563v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 40)));
                dl0Var.f25563v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                dl0Var.f25563v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                dl0Var.S.addView(dl0Var.f25563v0, w7.z5.e(30, 30, 17));
                dl0Var.f25563v0.setOnClickListener(new View.OnClickListener(this) {
                    public final tk0 f30316b;

                    {
                        this.f30316b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                tk0 tk0Var = this.f30316b;
                                tk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                dl0 dl0Var2 = tk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                dl0Var2.getClass();
                                new sg.y0(dl0Var2.f25561t0, 4, true).show();
                                return;
                            default:
                                dl0.a(this.f30316b.d);
                                return;
                        }
                    }
                });
                view = dl0Var.S;
            }
        } else {
            dl0Var.R = new FrameLayout(dl0Var.getContext());
            sg.c1 c1Var = new sg.c1(dl0Var.getContext(), 0, null);
            dl0Var.f25562u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f21065h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
            dl0Var.f25562u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            dl0Var.f25562u0.setScaleX(0.0f);
            dl0Var.f25562u0.setScaleY(0.0f);
            dl0Var.f25562u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            dl0Var.R.addView(dl0Var.f25562u0, w7.z5.e(26, 26, 17));
            dl0Var.f25562u0.setOnClickListener(new View.OnClickListener(this) {
                public final tk0 f30316b;

                {
                    this.f30316b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            tk0 tk0Var = this.f30316b;
                            tk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            dl0 dl0Var2 = tk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            dl0Var2.getClass();
                            new sg.y0(dl0Var2.f25561t0, 4, true).show();
                            return;
                        default:
                            dl0.a(this.f30316b.d);
                            return;
                    }
                }
            });
            view = dl0Var.R;
        }
        int topOffset = ((dl0Var.getLayoutParams().height - ((int) dl0Var.getTopOffset())) - dl0Var.getPaddingTop()) - dl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.b1(view);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f45924f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((bl0) b1Var.f45921a).f(((uk0) arrayList.get(b10)).f30960c, false);
        }
    }
}
