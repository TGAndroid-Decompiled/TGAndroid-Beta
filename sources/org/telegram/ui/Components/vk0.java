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
public final class vk0 extends pg.b {
    public final fl0 d;

    public vk0(fl0 fl0Var) {
        this.d = fl0Var;
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
        return ((wk0) this.d.d.get(i10)).f44712a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46345f;
        if (i11 != 0 && i11 != 3) {
            return;
        }
        dl0 dl0Var = (dl0) b1Var.f46342a;
        dl0Var.setScaleX(1.0f);
        dl0Var.setScaleY(1.0f);
        dl0.a(dl0Var, ((wk0) this.d.d.get(i10)).f32262c, i10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        fl0 fl0Var = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                view = new dl0(fl0Var, fl0Var.getContext());
            } else {
                fl0Var.S = new ah.v(fl0Var, fl0Var.getContext());
                bs bsVar = new bs(fl0Var, fl0Var.getContext());
                fl0Var.f26384v0 = bsVar;
                bsVar.setImageResource(R.drawable.msg_reactions_expand);
                fl0Var.f26384v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i11 = fl0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    org.telegram.ui.ActionBar.r6.t(fl0Var.f26384v0, org.telegram.ui.ActionBar.k6.f21255h5, null, PorterDuff.Mode.MULTIPLY);
                } else {
                    fl0Var.f26384v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                }
                bs bsVar2 = fl0Var.f26384v0;
                int dp = AndroidUtilities.dp(28.0f);
                int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
                org.telegram.ui.ActionBar.r6.S(bsVar2, org.telegram.ui.ActionBar.k6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i12, 40), null);
                fl0Var.f26384v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                fl0Var.f26384v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                fl0Var.S.addView(fl0Var.f26384v0, w7.z5.e(30, 30, 17));
                fl0Var.f26384v0.setOnClickListener(new View.OnClickListener(this) {
                    public final vk0 f31156b;

                    {
                        this.f31156b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vk0 vk0Var = this.f31156b;
                                vk0Var.getClass();
                                view2.getLocationOnScreen(new int[2]);
                                fl0 fl0Var2 = vk0Var.d;
                                view2.getMeasuredWidth();
                                view2.getMeasuredHeight();
                                fl0Var2.getClass();
                                new sg.y0(fl0Var2.f26382t0, 4, true).show();
                                return;
                            default:
                                fl0.a(this.f31156b.d);
                                return;
                        }
                    }
                });
                view = fl0Var.S;
            }
        } else {
            fl0Var.R = new FrameLayout(fl0Var.getContext());
            sg.c1 c1Var = new sg.c1(fl0Var.getContext(), 0, null);
            fl0Var.f26383u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false);
            int i13 = org.telegram.ui.ActionBar.k6.f21255h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
            org.telegram.ui.ActionBar.r6.t(fl0Var.f26383u0, i13, null, PorterDuff.Mode.MULTIPLY);
            fl0Var.f26383u0.setScaleX(0.0f);
            fl0Var.f26383u0.setScaleY(0.0f);
            fl0Var.f26383u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            fl0Var.R.addView(fl0Var.f26383u0, w7.z5.e(26, 26, 17));
            fl0Var.f26383u0.setOnClickListener(new View.OnClickListener(this) {
                public final vk0 f31156b;

                {
                    this.f31156b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            vk0 vk0Var = this.f31156b;
                            vk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fl0 fl0Var2 = vk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fl0Var2.getClass();
                            new sg.y0(fl0Var2.f26382t0, 4, true).show();
                            return;
                        default:
                            fl0.a(this.f31156b.d);
                            return;
                    }
                }
            });
            view = fl0Var.R;
        }
        int topOffset = ((fl0Var.getLayoutParams().height - ((int) fl0Var.getTopOffset())) - fl0Var.getPaddingTop()) - fl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new s4.b1(view);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f46345f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((dl0) b1Var.f46342a).f(((wk0) arrayList.get(b10)).f32262c, false);
        }
    }
}
