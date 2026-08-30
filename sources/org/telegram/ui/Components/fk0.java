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
public final class fk0 extends bg.c {
    public final pk0 d;

    public fk0(pk0 pk0Var) {
        this.d = pk0Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((gk0) this.d.d.get(i10)).f1808a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5788f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        nk0 nk0Var = (nk0) l1Var.f5785a;
        nk0Var.setScaleX(1.0f);
        nk0Var.setScaleY(1.0f);
        nk0.a(nk0Var, ((gk0) this.d.d.get(i10)).f25186c, i10);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        pk0 pk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new nk0(pk0Var, pk0Var.getContext());
            } else {
                pk0Var.P = new ah.d(pk0Var, pk0Var.getContext());
                pr prVar = new pr(pk0Var, pk0Var.getContext());
                pk0Var.f27916s0 = prVar;
                prVar.setImageResource(R.drawable.msg_reactions_expand);
                pk0Var.f27916s0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = pk0Var.J0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    pk0Var.f27916s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    pk0Var.f27916s0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                pk0Var.f27916s0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 40)));
                pk0Var.f27916s0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                pk0Var.f27916s0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                pk0Var.P.addView(pk0Var.f27916s0, k7.b6.e(30, 30, 17));
                pk0Var.f27916s0.setOnClickListener(new View.OnClickListener(this) {
                    public final fk0 f24596b;

                    {
                        this.f24596b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                fk0 fk0Var = this.f24596b;
                                fk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                pk0 pk0Var2 = fk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                pk0Var2.getClass();
                                new eg.o1(pk0Var2.f27912q0, 4, true).show();
                                return;
                            default:
                                pk0.a(this.f24596b.d);
                                return;
                        }
                    }
                });
                view = pk0Var.P;
            }
        } else {
            pk0Var.O = new FrameLayout(pk0Var.getContext());
            eg.s1 s1Var = new eg.s1(pk0Var.getContext(), 0, null);
            pk0Var.f27914r0 = s1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i12 = org.telegram.ui.ActionBar.j6.f19977h5;
            s1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
            pk0Var.f27914r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            pk0Var.f27914r0.setScaleX(0.0f);
            pk0Var.f27914r0.setScaleY(0.0f);
            pk0Var.f27914r0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pk0Var.O.addView(pk0Var.f27914r0, k7.b6.e(26, 26, 17));
            pk0Var.f27914r0.setOnClickListener(new View.OnClickListener(this) {
                public final fk0 f24596b;

                {
                    this.f24596b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            fk0 fk0Var = this.f24596b;
                            fk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            pk0 pk0Var2 = fk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            pk0Var2.getClass();
                            new eg.o1(pk0Var2.f27912q0, 4, true).show();
                            return;
                        default:
                            pk0.a(this.f24596b.d);
                            return;
                    }
                }
            });
            view = pk0Var.O;
        }
        int topOffset = ((pk0Var.getLayoutParams().height - ((int) pk0Var.getTopOffset())) - pk0Var.getPaddingTop()) - pk0Var.getPaddingBottom();
        view.setLayoutParams(new f2.w0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new f2.l1(view);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = l1Var.f5788f;
        if ((i10 == 0 || i10 == 3) && (b10 = l1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((nk0) l1Var.f5785a).f(((gk0) arrayList.get(b10)).f25186c, false);
        }
    }
}
