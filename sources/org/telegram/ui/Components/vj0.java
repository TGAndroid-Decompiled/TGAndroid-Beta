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
public final class vj0 extends zf.b {
    public final fk0 d;

    public vj0(fk0 fk0Var) {
        this.d = fk0Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((wj0) this.d.d.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        dk0 dk0Var = (dk0) n1Var.f6432a;
        dk0Var.setScaleX(1.0f);
        dk0Var.setScaleY(1.0f);
        dk0.a(dk0Var, ((wj0) this.d.d.get(i10)).f34434c, i10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        fk0 fk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new dk0(fk0Var, fk0Var.getContext());
            } else {
                fk0Var.O = new bg.d1(fk0Var, fk0Var.getContext());
                lr lrVar = new lr(fk0Var, fk0Var.getContext());
                fk0Var.f28460r0 = lrVar;
                lrVar.setImageResource(R.drawable.msg_reactions_expand);
                fk0Var.f28460r0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = fk0Var.I0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    fk0Var.f28460r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    fk0Var.f28460r0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                fk0Var.f28460r0.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 40)));
                fk0Var.f28460r0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                fk0Var.f28460r0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                fk0Var.O.addView(fk0Var.f28460r0, i7.f6.e(30, 30, 17));
                fk0Var.f28460r0.setOnClickListener(new View.OnClickListener(this) {
                    public final vj0 f33249b;

                    {
                        this.f33249b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vj0 vj0Var = this.f33249b;
                                vj0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                fk0 fk0Var2 = vj0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                fk0Var2.getClass();
                                new cg.p1(fk0Var2.f28457p0, 4, true).show();
                                return;
                            default:
                                fk0.a(this.f33249b.d);
                                return;
                        }
                    }
                });
                view = fk0Var.O;
            }
        } else {
            fk0Var.N = new FrameLayout(fk0Var.getContext());
            cg.t1 t1Var = new cg.t1(fk0Var.getContext(), 0, null);
            fk0Var.f28458q0 = t1Var;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F8, false);
            int i12 = org.telegram.ui.ActionBar.g6.f23133h5;
            t1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
            fk0Var.f28458q0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            fk0Var.f28458q0.setScaleX(0.0f);
            fk0Var.f28458q0.setScaleY(0.0f);
            fk0Var.f28458q0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            fk0Var.N.addView(fk0Var.f28458q0, i7.f6.e(26, 26, 17));
            fk0Var.f28458q0.setOnClickListener(new View.OnClickListener(this) {
                public final vj0 f33249b;

                {
                    this.f33249b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            vj0 vj0Var = this.f33249b;
                            vj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fk0 fk0Var2 = vj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fk0Var2.getClass();
                            new cg.p1(fk0Var2.f28457p0, 4, true).show();
                            return;
                        default:
                            fk0.a(this.f33249b.d);
                            return;
                    }
                }
            });
            view = fk0Var.N;
        }
        int topOffset = ((fk0Var.getLayoutParams().height - ((int) fk0Var.getTopOffset())) - fk0Var.getPaddingTop()) - fk0Var.getPaddingBottom();
        view.setLayoutParams(new f2.x0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new f2.n1(view);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = n1Var.f6436f;
        if ((i10 == 0 || i10 == 3) && (b10 = n1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((dk0) n1Var.f6432a).f(((wj0) arrayList.get(b10)).f34434c, false);
        }
    }
}
