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
public final class vj0 extends og.b {
    public final fk0 d;

    public vj0(fk0 fk0Var) {
        this.d = fk0Var;
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
        return ((wj0) this.d.d.get(i10)).f15533a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42678f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        dk0 dk0Var = (dk0) c1Var.f42675a;
        dk0Var.setScaleX(1.0f);
        dk0Var.setScaleY(1.0f);
        dk0.a(dk0Var, ((wj0) this.d.d.get(i10)).f29732c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        fk0 fk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new dk0(fk0Var, fk0Var.getContext());
            } else {
                fk0Var.S = new ci.n6(fk0Var, fk0Var.getContext());
                sr srVar = new sr(fk0Var, fk0Var.getContext());
                fk0Var.f24003v0 = srVar;
                srVar.setImageResource(R.drawable.msg_reactions_expand);
                fk0Var.f24003v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = fk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    fk0Var.f24003v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18907h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    fk0Var.f24003v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                fk0Var.f24003v0.setBackground(org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18926i6, false), 40)));
                fk0Var.f24003v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                fk0Var.f24003v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                fk0Var.S.addView(fk0Var.f24003v0, w7.x5.e(30, 30, 17));
                fk0Var.f24003v0.setOnClickListener(new View.OnClickListener(this) {
                    public final vj0 f28420b;

                    {
                        this.f28420b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vj0 vj0Var = this.f28420b;
                                vj0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                fk0 fk0Var2 = vj0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                fk0Var2.getClass();
                                new rg.x0(fk0Var2.f24001t0, 4, true).show();
                                return;
                            default:
                                fk0.a(this.f28420b.d);
                                return;
                        }
                    }
                });
                view = fk0Var.S;
            }
        } else {
            fk0Var.R = new FrameLayout(fk0Var.getContext());
            rg.b1 b1Var = new rg.b1(fk0Var.getContext(), 0, null);
            fk0Var.f24002u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.F8, false);
            int i12 = org.telegram.ui.ActionBar.i6.f18907h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
            fk0Var.f24002u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            fk0Var.f24002u0.setScaleX(0.0f);
            fk0Var.f24002u0.setScaleY(0.0f);
            fk0Var.f24002u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            fk0Var.R.addView(fk0Var.f24002u0, w7.x5.e(26, 26, 17));
            fk0Var.f24002u0.setOnClickListener(new View.OnClickListener(this) {
                public final vj0 f28420b;

                {
                    this.f28420b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            vj0 vj0Var = this.f28420b;
                            vj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fk0 fk0Var2 = vj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fk0Var2.getClass();
                            new rg.x0(fk0Var2.f24001t0, 4, true).show();
                            return;
                        default:
                            fk0.a(this.f28420b.d);
                            return;
                    }
                }
            });
            view = fk0Var.R;
        }
        int topOffset = ((fk0Var.getLayoutParams().height - ((int) fk0Var.getTopOffset())) - fk0Var.getPaddingTop()) - fk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f42678f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((dk0) c1Var.f42675a).f(((wj0) arrayList.get(b10)).f29732c, false);
        }
    }
}
