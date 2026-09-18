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
public final class gk0 extends og.b {
    public final qk0 d;

    public gk0(qk0 qk0Var) {
        this.d = qk0Var;
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
        return ((hk0) this.d.d.get(i10)).f15672a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42932f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        ok0 ok0Var = (ok0) c1Var.f42929a;
        ok0Var.setScaleX(1.0f);
        ok0Var.setScaleY(1.0f);
        ok0.a(ok0Var, ((hk0) this.d.d.get(i10)).f24687c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        qk0 qk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new ok0(qk0Var, qk0Var.getContext());
            } else {
                qk0Var.S = new ci.n6(qk0Var, qk0Var.getContext());
                sr srVar = new sr(qk0Var, qk0Var.getContext());
                qk0Var.f27671v0 = srVar;
                srVar.setImageResource(R.drawable.msg_reactions_expand);
                qk0Var.f27671v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = qk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    qk0Var.f27671v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19133h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    qk0Var.f27671v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                qk0Var.f27671v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false), 40)));
                qk0Var.f27671v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                qk0Var.f27671v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                qk0Var.S.addView(qk0Var.f27671v0, w7.y5.e(30, 30, 17));
                qk0Var.f27671v0.setOnClickListener(new View.OnClickListener(this) {
                    public final gk0 f24179b;

                    {
                        this.f24179b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                gk0 gk0Var = this.f24179b;
                                gk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                qk0 qk0Var2 = gk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                qk0Var2.getClass();
                                new rg.x0(qk0Var2.f27669t0, 4, true).show();
                                return;
                            default:
                                qk0.a(this.f24179b.d);
                                return;
                        }
                    }
                });
                view = qk0Var.S;
            }
        } else {
            qk0Var.R = new FrameLayout(qk0Var.getContext());
            rg.b1 b1Var = new rg.b1(qk0Var.getContext(), 0, null);
            qk0Var.f27670u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i12 = org.telegram.ui.ActionBar.j6.f19133h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
            qk0Var.f27670u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            qk0Var.f27670u0.setScaleX(0.0f);
            qk0Var.f27670u0.setScaleY(0.0f);
            qk0Var.f27670u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            qk0Var.R.addView(qk0Var.f27670u0, w7.y5.e(26, 26, 17));
            qk0Var.f27670u0.setOnClickListener(new View.OnClickListener(this) {
                public final gk0 f24179b;

                {
                    this.f24179b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            gk0 gk0Var = this.f24179b;
                            gk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            qk0 qk0Var2 = gk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            qk0Var2.getClass();
                            new rg.x0(qk0Var2.f27669t0, 4, true).show();
                            return;
                        default:
                            qk0.a(this.f24179b.d);
                            return;
                    }
                }
            });
            view = qk0Var.R;
        }
        int topOffset = ((qk0Var.getLayoutParams().height - ((int) qk0Var.getTopOffset())) - qk0Var.getPaddingTop()) - qk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f42932f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((ok0) c1Var.f42929a).f(((hk0) arrayList.get(b10)).f24687c, false);
        }
    }
}
