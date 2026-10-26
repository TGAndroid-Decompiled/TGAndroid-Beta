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
public final class vk0 extends qg.b {
    public final fl0 d;

    public vk0(fl0 fl0Var) {
        this.d = fl0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((wk0) this.d.d.get(i10)).f47040a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47741f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        dl0 dl0Var = (dl0) e1Var.f47738a;
        dl0Var.setScaleX(1.0f);
        dl0Var.setScaleY(1.0f);
        dl0.a(dl0Var, ((wk0) this.d.d.get(i10)).f34474c, i10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        fl0 fl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new dl0(fl0Var, fl0Var.getContext());
            } else {
                fl0Var.S = new bh.p(fl0Var, fl0Var.getContext());
                fs fsVar = new fs(fl0Var, fl0Var.getContext());
                fl0Var.f28266v0 = fsVar;
                fsVar.setImageResource(R.drawable.msg_reactions_expand);
                fl0Var.f28266v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = fl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    org.telegram.ui.ActionBar.f7.t(fl0Var.f28266v0, org.telegram.ui.ActionBar.y6.f23427h5, null, PorterDuff.Mode.MULTIPLY);
                } else {
                    fl0Var.f28266v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                fs fsVar2 = fl0Var.f28266v0;
                int dp = AndroidUtilities.dp(28.0f);
                int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
                org.telegram.ui.ActionBar.f7.R(fsVar2, org.telegram.ui.ActionBar.y6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.f7.h(i12, 40), null);
                fl0Var.f28266v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                fl0Var.f28266v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                fl0Var.S.addView(fl0Var.f28266v0, gb1.i(30, 30, 17));
                fl0Var.f28266v0.setOnClickListener(new View.OnClickListener(this) {
                    public final vk0 f33434b;

                    {
                        this.f33434b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vk0 vk0Var = this.f33434b;
                                vk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                fl0 fl0Var2 = vk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                fl0Var2.getClass();
                                new tg.y0(fl0Var2.f28264t0, 4, true).show();
                                return;
                            default:
                                fl0.a(this.f33434b.d);
                                return;
                        }
                    }
                });
                view = fl0Var.S;
            }
        } else {
            fl0Var.R = new FrameLayout(fl0Var.getContext());
            tg.c1 c1Var = new tg.c1(fl0Var.getContext(), 0, null);
            fl0Var.f28265u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.F8, false);
            int i13 = org.telegram.ui.ActionBar.y6.f23427h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.y6.x0(null, i13, false)));
            org.telegram.ui.ActionBar.f7.t(fl0Var.f28265u0, i13, null, PorterDuff.Mode.MULTIPLY);
            fl0Var.f28265u0.setScaleX(0.0f);
            fl0Var.f28265u0.setScaleY(0.0f);
            fl0Var.f28265u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            fl0Var.R.addView(fl0Var.f28265u0, gb1.i(26, 26, 17));
            fl0Var.f28265u0.setOnClickListener(new View.OnClickListener(this) {
                public final vk0 f33434b;

                {
                    this.f33434b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            vk0 vk0Var = this.f33434b;
                            vk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fl0 fl0Var2 = vk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fl0Var2.getClass();
                            new tg.y0(fl0Var2.f28264t0, 4, true).show();
                            return;
                        default:
                            fl0.a(this.f33434b.d);
                            return;
                    }
                }
            });
            view = fl0Var.R;
        }
        int topOffset = ((fl0Var.getLayoutParams().height - ((int) fl0Var.getTopOffset())) - fl0Var.getPaddingTop()) - fl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.e1(view);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = e1Var.f47741f;
        if ((i10 == 0 || i10 == 3) && (b10 = e1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((dl0) e1Var.f47738a).f(((wk0) arrayList.get(b10)).f34474c, false);
        }
    }
}
