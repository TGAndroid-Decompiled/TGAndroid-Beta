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
public final class kj0 extends wf.b {
    public final uj0 d;

    public kj0(uj0 uj0Var) {
        this.d = uj0Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i9) {
        return ((lj0) this.d.d.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        if (i10 != 0 && i10 != 3) {
            return;
        }
        sj0 sj0Var = (sj0) q1Var.f5501a;
        sj0Var.setScaleX(1.0f);
        sj0Var.setScaleY(1.0f);
        sj0.a(sj0Var, ((lj0) this.d.d.get(i9)).f30466c, i9);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        uj0 uj0Var = this.d;
        if (i9 != 1) {
            if (i9 != 2) {
                view = new sj0(uj0Var, uj0Var.getContext());
            } else {
                uj0Var.O = new fh.v(uj0Var, uj0Var.getContext());
                ir irVar = new ir(uj0Var, uj0Var.getContext());
                uj0Var.f33071r0 = irVar;
                irVar.setImageResource(R.drawable.msg_reactions_expand);
                uj0Var.f33071r0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i10 = uj0Var.I0;
                if (i10 != 1 && i10 != 2 && i10 != 4) {
                    uj0Var.f33071r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    uj0Var.f33071r0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                uj0Var.f33071r0.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 40)));
                uj0Var.f33071r0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                uj0Var.f33071r0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                uj0Var.O.addView(uj0Var.f33071r0, g7.e6.e(30, 30, 17));
                uj0Var.f33071r0.setOnClickListener(new View.OnClickListener(this) {
                    public final kj0 f29752b;

                    {
                        this.f29752b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                kj0 kj0Var = this.f29752b;
                                kj0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                uj0 uj0Var2 = kj0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                uj0Var2.getClass();
                                new zf.x0(uj0Var2.f33068p0, 4, true).show();
                                return;
                            default:
                                uj0.a(this.f29752b.d);
                                return;
                        }
                    }
                });
                view = uj0Var.O;
            }
        } else {
            uj0Var.N = new FrameLayout(uj0Var.getContext());
            zf.b1 b1Var = new zf.b1(uj0Var.getContext(), 0, null);
            uj0Var.f33069q0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.F8, false);
            int i11 = org.telegram.ui.ActionBar.f6.f23072h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
            uj0Var.f33069q0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            uj0Var.f33069q0.setScaleX(0.0f);
            uj0Var.f33069q0.setScaleY(0.0f);
            uj0Var.f33069q0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            uj0Var.N.addView(uj0Var.f33069q0, g7.e6.e(26, 26, 17));
            uj0Var.f33069q0.setOnClickListener(new View.OnClickListener(this) {
                public final kj0 f29752b;

                {
                    this.f29752b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            kj0 kj0Var = this.f29752b;
                            kj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            uj0 uj0Var2 = kj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            uj0Var2.getClass();
                            new zf.x0(uj0Var2.f33068p0, 4, true).show();
                            return;
                        default:
                            uj0.a(this.f29752b.d);
                            return;
                    }
                }
            });
            view = uj0Var.N;
        }
        int topOffset = ((uj0Var.getLayoutParams().height - ((int) uj0Var.getTopOffset())) - uj0Var.getPaddingTop()) - uj0Var.getPaddingBottom();
        view.setLayoutParams(new f2.a1(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new f2.q1(view);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i9 = q1Var.f5505f;
        if ((i9 == 0 || i9 == 3) && (b10 = q1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((sj0) q1Var.f5501a).f(((lj0) arrayList.get(b10)).f30466c, false);
        }
    }
}
