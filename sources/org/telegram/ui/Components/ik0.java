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
public final class ik0 extends og.b {
    public final sk0 d;

    public ik0(sk0 sk0Var) {
        this.d = sk0Var;
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
        return ((jk0) this.d.d.get(i10)).f15716a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42965f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        qk0 qk0Var = (qk0) c1Var.f42962a;
        qk0Var.setScaleX(1.0f);
        qk0Var.setScaleY(1.0f);
        qk0.a(qk0Var, ((jk0) this.d.d.get(i10)).f25472c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        sk0 sk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new qk0(sk0Var, sk0Var.getContext());
            } else {
                sk0Var.S = new ci.m6(sk0Var, sk0Var.getContext());
                ur urVar = new ur(sk0Var, sk0Var.getContext());
                sk0Var.f28299v0 = urVar;
                urVar.setImageResource(R.drawable.msg_reactions_expand);
                sk0Var.f28299v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = sk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    sk0Var.f28299v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19131h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    sk0Var.f28299v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                sk0Var.f28299v0.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19150i6, false), 40)));
                sk0Var.f28299v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                sk0Var.f28299v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                sk0Var.S.addView(sk0Var.f28299v0, w7.y5.e(30, 30, 17));
                sk0Var.f28299v0.setOnClickListener(new View.OnClickListener(this) {
                    public final ik0 f24828b;

                    {
                        this.f24828b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ik0 ik0Var = this.f24828b;
                                ik0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                sk0 sk0Var2 = ik0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                sk0Var2.getClass();
                                new rg.x0(sk0Var2.f28297t0, 4, true).show();
                                return;
                            default:
                                sk0.a(this.f24828b.d);
                                return;
                        }
                    }
                });
                view = sk0Var.S;
            }
        } else {
            sk0Var.R = new FrameLayout(sk0Var.getContext());
            rg.b1 b1Var = new rg.b1(sk0Var.getContext(), 0, null);
            sk0Var.f28298u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f19131h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
            sk0Var.f28298u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            sk0Var.f28298u0.setScaleX(0.0f);
            sk0Var.f28298u0.setScaleY(0.0f);
            sk0Var.f28298u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            sk0Var.R.addView(sk0Var.f28298u0, w7.y5.e(26, 26, 17));
            sk0Var.f28298u0.setOnClickListener(new View.OnClickListener(this) {
                public final ik0 f24828b;

                {
                    this.f24828b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            ik0 ik0Var = this.f24828b;
                            ik0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            sk0 sk0Var2 = ik0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            sk0Var2.getClass();
                            new rg.x0(sk0Var2.f28297t0, 4, true).show();
                            return;
                        default:
                            sk0.a(this.f24828b.d);
                            return;
                    }
                }
            });
            view = sk0Var.R;
        }
        int topOffset = ((sk0Var.getLayoutParams().height - ((int) sk0Var.getTopOffset())) - sk0Var.getPaddingTop()) - sk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f42965f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((qk0) c1Var.f42962a).f(((jk0) arrayList.get(b10)).f25472c, false);
        }
    }
}
