package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public abstract class zv extends um0 {
    public static final int[] f34018b0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f34019c0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final vv B;
    public final vv C;
    public final xv D;
    public final HashMap E;
    public final int F;
    public ValueAnimator G;
    public float H;
    public float I;
    public int J;
    public int K;
    public boolean L;
    public final boolean M;
    public final int N;
    public final Runnable O;
    public int P;
    public final int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f34020a0;
    public final int h;
    public final boolean f34021n;
    public boolean f34022r;
    public z5 f34023s;
    public final org.telegram.ui.ActionBar.g6 v;
    public final boolean f34024w;
    public final vv f34025x;
    public final vv f34026y;

    public zv(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, boolean z11, boolean z12, int i10, Runnable runnable, int i11, boolean z13) {
        super(context);
        boolean z14;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f34021n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f34022r = true;
        this.E = new HashMap();
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = true;
        this.P = 6;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        this.W = true;
        this.f34020a0 = 11.0f;
        this.f34024w = z12;
        this.v = g6Var;
        this.O = runnable;
        this.Q = i10;
        this.N = i11;
        this.M = z13;
        rv rvVar = new rv(this, context, z12, z13);
        this.f31649b = rvVar;
        rvVar.setClipToPadding(false);
        this.f31649b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f31649b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f31649b;
            vv vvVar = new vv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f34025x = vvVar;
            linearLayout.addView(vvVar);
            vvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z4) {
            LinearLayout linearLayout2 = this.f31649b;
            vv vvVar2 = new vv(this, context, this.h, false);
            this.f34026y = vvVar2;
            linearLayout2.addView(vvVar2);
            vvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            vvVar2.f32555a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.f31649b;
            vv vvVar3 = new vv(this, context, i12, false);
            this.B = vvVar3;
            linearLayout3.addView(vvVar3);
            vvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            vvVar3.setAlpha(0.0f);
            vvVar3.f32555a = Long.valueOf(98352451);
        }
        if (!z12) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f34018b0[i14];
                if (i14 == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                vv vvVar4 = new vv(this, context, i15, z14);
                vvVar4.setContentDescription(f(i14));
                this.f31649b.addView(vvVar4);
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.f31649b;
            xv xvVar = new xv(this, context);
            this.D = xvVar;
            linearLayout4.addView(xvVar);
            xvVar.h = 3552126;
        }
        this.F = this.f31649b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f31649b;
            vv vvVar5 = new vv(this, context, i13, true);
            this.C = vvVar5;
            linearLayout5.addView(vvVar5);
            vvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            vvVar5.f32555a = Long.valueOf(1434631203);
            vvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i10) {
        switch (i10) {
            case 0:
                return LocaleController.getString(R.string.Emoji1);
            case 1:
                return LocaleController.getString(R.string.Emoji2);
            case 2:
                return LocaleController.getString(R.string.Emoji3);
            case 3:
                return LocaleController.getString(R.string.Emoji4);
            case 4:
                return LocaleController.getString(R.string.Emoji5);
            case 5:
                return LocaleController.getString(R.string.Emoji6);
            case 6:
                return LocaleController.getString(R.string.Emoji7);
            case 7:
                return LocaleController.getString(R.string.Emoji8);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(xx xxVar) {
        return xxVar.f33215f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        if (z4 && !this.W) {
            z10 = true;
        } else {
            z10 = false;
        }
        vv vvVar = this.f34025x;
        if (vvVar != null) {
            i10++;
        }
        if (!this.T || vvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.J;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f31649b.getChildCount()) {
            View childAt = this.f31649b.getChildAt(i13);
            if (childAt instanceof xv) {
                xv xvVar = (xv) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < xvVar.f31649b.getChildCount()) {
                    View childAt2 = xvVar.f31649b.getChildAt(i16);
                    if (childAt2 instanceof vv) {
                        vv vvVar2 = (vv) childAt2;
                        if (i10 == i15) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        vvVar2.g(z13, z10);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof vv) {
                    vv vvVar3 = (vv) childAt;
                    if (i10 == i14) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    vvVar3.g(z12, z10);
                }
                i11 = i14;
            }
            if (i10 >= i14 && i10 <= i11) {
                this.J = i13;
            }
            i13++;
            i14 = i11 + 1;
        }
        int i17 = this.J;
        xv xvVar2 = this.D;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.H;
            float f11 = this.J;
            float f12 = 1.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new pv(this, f10, f11, 0));
                this.G.setDuration(350L);
                this.G.setInterpolator(pr.h);
                this.G.start();
            } else {
                this.I = 1.0f;
                this.H = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.f31649b.invalidate();
            }
            if (xvVar2 != null) {
                if (this.J != 1 && !this.f34021n) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 != xvVar2.f33181n) {
                    xvVar2.f33181n = z11;
                    if (!z11) {
                        xvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = xvVar2.f31650c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        float f13 = xvVar2.f33182r;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        xvVar2.f31650c = ofFloat2;
                        ofFloat2.addUpdateListener(new f6(xvVar2, 20));
                        xvVar2.f31650c.setDuration(475L);
                        xvVar2.f31650c.setInterpolator(pr.h);
                        xvVar2.f31650c.start();
                    } else {
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        xvVar2.f33182r = f12;
                        xvVar2.invalidate();
                        xvVar2.requestLayout();
                        xvVar2.c();
                        xvVar2.f33183s.f31649b.invalidate();
                    }
                }
            }
            View childAt3 = this.f31649b.getChildAt(this.J);
            if (this.J >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.K != i10) {
            if (xvVar2 != null && this.J == 1 && i10 >= 1 && i10 <= xvVar2.f31649b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                xvVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.K = i10;
        }
    }

    public final int k() {
        boolean z4 = this.M;
        org.telegram.ui.ActionBar.g6 g6Var = this.v;
        if (z4) {
            return i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f);
        }
        int i10 = this.Q;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.k6.l1(0.18f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var));
        }
        return org.telegram.ui.ActionBar.k6.l1(0.09f, this.N);
    }

    public final void l(boolean z4) {
        int i10;
        vv vvVar = this.B;
        if (vvVar != null) {
            boolean z10 = this.U;
            if (z10 || this.V != z4) {
                this.V = z4;
                float f10 = 0.0f;
                if (z10) {
                    if (z4) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    vvVar.setVisibility(i10);
                    if (z4) {
                        f10 = 1.0f;
                    }
                    vvVar.setAlpha(f10);
                } else {
                    vvVar.setVisibility(0);
                    ViewPropertyAnimator animate = vvVar.animate();
                    if (z4) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(pr.h).withEndAction(new kh.f(20, this, z4)).start();
                }
                this.f31649b.requestLayout();
                this.U = false;
            }
        }
    }

    public final void m(boolean z4) {
        vv vvVar = this.f34026y;
        if (vvVar == null) {
            return;
        }
        if (z4) {
            vvVar.setBackground(new yv(k()));
        } else {
            vvVar.setBackground(null);
        }
    }

    public final void n(boolean z4) {
        this.f34022r = z4;
        this.f31649b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f31649b.getChildCount()) {
            View childAt = this.f31649b.getChildAt(i10);
            if (childAt instanceof xv) {
                xv xvVar = (xv) childAt;
                int i12 = 0;
                while (i12 < xvVar.f31649b.getChildCount()) {
                    xvVar.f31649b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final zv f30540b;

                        {
                            this.f30540b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f30540b.h(i11);
                                    return;
                                default:
                                    this.f30540b.h(i11);
                                    return;
                            }
                        }
                    });
                    i12++;
                    i11++;
                }
                i11--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) {
                    public final zv f30540b;

                    {
                        this.f30540b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f30540b.h(i11);
                                return;
                            default:
                                this.f30540b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        vv vvVar = this.C;
        if (vvVar != null) {
            vvVar.setOnClickListener(new g0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31649b.setPadding(AndroidUtilities.dp(this.f34020a0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.P = i10;
    }

    public void setPaddingLeft(float f10) {
        this.f34020a0 = f10;
    }

    public void e() {
    }

    public void i(vv vvVar) {
    }
}
