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
public final class fk0 extends ng.b {
    public final pk0 d;

    public fk0(pk0 pk0Var) {
        this.d = pk0Var;
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
        return ((gk0) this.d.d.get(i10)).f14046a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f41613f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        nk0 nk0Var = (nk0) c1Var.f41610a;
        nk0Var.setScaleX(1.0f);
        nk0Var.setScaleY(1.0f);
        nk0.a(nk0Var, ((gk0) this.d.d.get(i10)).f23370c, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        pk0 pk0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new nk0(pk0Var, pk0Var.getContext());
            } else {
                pk0Var.S = new bi.n7(pk0Var, pk0Var.getContext());
                yr yrVar = new yr(pk0Var, pk0Var.getContext());
                pk0Var.f26195v0 = yrVar;
                yrVar.setImageResource(R.drawable.msg_reactions_expand);
                pk0Var.f26195v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = pk0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    pk0Var.f26195v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    pk0Var.f26195v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                pk0Var.f26195v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 40)));
                pk0Var.f26195v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                pk0Var.f26195v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                pk0Var.S.addView(pk0Var.f26195v0, w7.a6.e(30, 30, 17));
                pk0Var.f26195v0.setOnClickListener(new View.OnClickListener(this) {
                    public final fk0 f22722b;

                    {
                        this.f22722b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                fk0 fk0Var = this.f22722b;
                                fk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                pk0 pk0Var2 = fk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                pk0Var2.getClass();
                                new qg.a1(pk0Var2.f26193t0, 4, true).show();
                                return;
                            default:
                                pk0.a(this.f22722b.d);
                                return;
                        }
                    }
                });
                view = pk0Var.S;
            }
        } else {
            pk0Var.R = new FrameLayout(pk0Var.getContext());
            qg.e1 e1Var = new qg.e1(pk0Var.getContext(), 0, null);
            pk0Var.f26194u0 = e1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i12 = org.telegram.ui.ActionBar.j6.f17998h5;
            e1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
            pk0Var.f26194u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            pk0Var.f26194u0.setScaleX(0.0f);
            pk0Var.f26194u0.setScaleY(0.0f);
            pk0Var.f26194u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pk0Var.R.addView(pk0Var.f26194u0, w7.a6.e(26, 26, 17));
            pk0Var.f26194u0.setOnClickListener(new View.OnClickListener(this) {
                public final fk0 f22722b;

                {
                    this.f22722b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            fk0 fk0Var = this.f22722b;
                            fk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            pk0 pk0Var2 = fk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            pk0Var2.getClass();
                            new qg.a1(pk0Var2.f26193t0, 4, true).show();
                            return;
                        default:
                            pk0.a(this.f22722b.d);
                            return;
                    }
                }
            });
            view = pk0Var.R;
        }
        int topOffset = ((pk0Var.getLayoutParams().height - ((int) pk0Var.getTopOffset())) - pk0Var.getPaddingTop()) - pk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.c1(view);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f41613f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((nk0) c1Var.f41610a).f(((gk0) arrayList.get(b10)).f23370c, false);
        }
    }
}
