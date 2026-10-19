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
public final class sk0 extends pg.b {
    public final cl0 d;

    public sk0(cl0 cl0Var) {
        this.d = cl0Var;
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
        return ((tk0) this.d.d.get(i10)).f44286a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f45913f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        al0 al0Var = (al0) b1Var.f45910a;
        al0Var.setScaleX(1.0f);
        al0Var.setScaleY(1.0f);
        al0.a(al0Var, ((tk0) this.d.d.get(i10)).f30614c, i10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        cl0 cl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new al0(cl0Var, cl0Var.getContext());
            } else {
                cl0Var.S = new ah.v(cl0Var, cl0Var.getContext());
                ds dsVar = new ds(cl0Var, cl0Var.getContext());
                cl0Var.f25272v0 = dsVar;
                dsVar.setImageResource(R.drawable.msg_reactions_expand);
                cl0Var.f25272v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = cl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    cl0Var.f25272v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21060h5, false), PorterDuff.Mode.MULTIPLY));
                } else {
                    cl0Var.f25272v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                cl0Var.f25272v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i6, false), 40)));
                cl0Var.f25272v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                cl0Var.f25272v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                cl0Var.S.addView(cl0Var.f25272v0, w7.z5.e(30, 30, 17));
                cl0Var.f25272v0.setOnClickListener(new View.OnClickListener(this) {
                    public final sk0 f29969b;

                    {
                        this.f29969b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                sk0 sk0Var = this.f29969b;
                                sk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                cl0 cl0Var2 = sk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                cl0Var2.getClass();
                                new sg.y0(cl0Var2.f25270t0, 4, true).show();
                                return;
                            default:
                                cl0.a(this.f29969b.d);
                                return;
                        }
                    }
                });
                view = cl0Var.S;
            }
        } else {
            cl0Var.R = new FrameLayout(cl0Var.getContext());
            sg.c1 c1Var = new sg.c1(cl0Var.getContext(), 0, null);
            cl0Var.f25271u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i12 = org.telegram.ui.ActionBar.h6.f21060h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
            cl0Var.f25271u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            cl0Var.f25271u0.setScaleX(0.0f);
            cl0Var.f25271u0.setScaleY(0.0f);
            cl0Var.f25271u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            cl0Var.R.addView(cl0Var.f25271u0, w7.z5.e(26, 26, 17));
            cl0Var.f25271u0.setOnClickListener(new View.OnClickListener(this) {
                public final sk0 f29969b;

                {
                    this.f29969b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            sk0 sk0Var = this.f29969b;
                            sk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            cl0 cl0Var2 = sk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            cl0Var2.getClass();
                            new sg.y0(cl0Var2.f25270t0, 4, true).show();
                            return;
                        default:
                            cl0.a(this.f29969b.d);
                            return;
                    }
                }
            });
            view = cl0Var.R;
        }
        int topOffset = ((cl0Var.getLayoutParams().height - ((int) cl0Var.getTopOffset())) - cl0Var.getPaddingTop()) - cl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.b1(view);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f45913f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((al0) b1Var.f45910a).f(((tk0) arrayList.get(b10)).f30614c, false);
        }
    }
}
