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
public abstract class bw extends mm0 {
    public static final int[] f24831e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f24832f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final xv E;
    public final xv F;
    public final zv G;
    public final HashMap H;
    public final int I;
    public ValueAnimator J;
    public float K;
    public float L;
    public int M;
    public int N;
    public boolean O;
    public final boolean P;
    public final int Q;
    public final Runnable R;
    public int S;
    public final int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f24833a0;
    public boolean f24834b0;
    public boolean f24835c0;
    public float f24836d0;
    public final int h;
    public final boolean f24837n;
    public boolean f24838r;
    public e6 f24839s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f24840w;
    public final xv f24841x;
    public final xv f24842y;

    public bw(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f24837n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f24838r = true;
        this.H = new HashMap();
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.S = 6;
        this.U = true;
        this.V = true;
        this.W = true;
        this.f24833a0 = true;
        this.f24834b0 = false;
        this.f24835c0 = true;
        this.f24836d0 = 11.0f;
        this.f24840w = z13;
        this.v = f6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        tv tvVar = new tv(this, context, z13, z14);
        this.f28497b = tvVar;
        tvVar.setClipToPadding(false);
        this.f28497b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f28497b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f28497b;
            xv xvVar = new xv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f24841x = xvVar;
            linearLayout.addView(xvVar);
            xvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f28497b;
            xv xvVar2 = new xv(this, context, this.h, false);
            this.f24842y = xvVar2;
            linearLayout2.addView(xvVar2);
            xvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            xvVar2.f32765a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f28497b;
            xv xvVar3 = new xv(this, context, i12, false);
            this.E = xvVar3;
            linearLayout3.addView(xvVar3);
            xvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            xvVar3.setAlpha(0.0f);
            xvVar3.f32765a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f24831e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                xv xvVar4 = new xv(this, context, i15, z15);
                xvVar4.setContentDescription(f(i14));
                this.f28497b.addView(xvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f28497b;
            zv zvVar = new zv(this, context);
            this.G = zvVar;
            linearLayout4.addView(zvVar);
            zvVar.h = 3552126;
        }
        this.I = this.f28497b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f28497b;
            xv xvVar5 = new xv(this, context, i13, true);
            this.F = xvVar5;
            linearLayout5.addView(xvVar5);
            xvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            xvVar5.f32765a = Long.valueOf(1434631203);
            xvVar5.setAlpha(0.0f);
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
        return xxVar.f32794f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.j6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f24835c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xv xvVar = this.f24841x;
        if (xvVar != null) {
            i10++;
        }
        if (!this.W || xvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f28497b.getChildCount()) {
            View childAt = this.f28497b.getChildAt(i13);
            if (childAt instanceof zv) {
                zv zvVar = (zv) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < zvVar.f28497b.getChildCount()) {
                    View childAt2 = zvVar.f28497b.getChildAt(i16);
                    if (childAt2 instanceof xv) {
                        xv xvVar2 = (xv) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        xvVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof xv) {
                    xv xvVar3 = (xv) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    xvVar3.g(z13, z11);
                }
                i11 = i14;
            }
            if (i10 >= i14 && i10 <= i11) {
                this.M = i13;
            }
            i13++;
            i14 = i11 + 1;
        }
        int i17 = this.M;
        zv zvVar2 = this.G;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = this.K;
            float f10 = this.M;
            float f11 = 1.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new di.bb(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(pr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f28497b.invalidate();
            }
            if (zvVar2 != null) {
                if (this.M != 1 && !this.f24837n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != zvVar2.f33262n) {
                    zvVar2.f33262n = z12;
                    if (!z12) {
                        zvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = zvVar2.f28498c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = zvVar2.f33263r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        zvVar2.f28498c = ofFloat2;
                        ofFloat2.addUpdateListener(new l6(zvVar2, 20));
                        zvVar2.f28498c.setDuration(475L);
                        zvVar2.f28498c.setInterpolator(pr.h);
                        zvVar2.f28498c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        zvVar2.f33263r = f11;
                        zvVar2.invalidate();
                        zvVar2.requestLayout();
                        zvVar2.c();
                        zvVar2.f33264s.f28497b.invalidate();
                    }
                }
            }
            View childAt3 = this.f28497b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (zvVar2 != null && this.M == 1 && i10 >= 1 && i10 <= zvVar2.f28497b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                zvVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.j6.l1(0.18f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
        }
        return org.telegram.ui.ActionBar.j6.l1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        xv xvVar = this.E;
        if (xvVar != null) {
            boolean z11 = this.f24833a0;
            if (z11 || this.f24834b0 != z10) {
                this.f24834b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    xvVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    xvVar.setAlpha(f7);
                } else {
                    xvVar.setVisibility(0);
                    ViewPropertyAnimator animate = xvVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(pr.h).withEndAction(new ah.u(23, this, z10)).start();
                }
                this.f28497b.requestLayout();
                this.f24833a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        xv xvVar = this.f24842y;
        if (xvVar == null) {
            return;
        }
        if (z10) {
            xvVar.setBackground(new aw(k()));
        } else {
            xvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f24838r = z10;
        this.f28497b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f28497b.getChildCount()) {
            View childAt = this.f28497b.getChildAt(i10);
            if (childAt instanceof zv) {
                zv zvVar = (zv) childAt;
                int i12 = 0;
                while (i12 < zvVar.f28497b.getChildCount()) {
                    zvVar.f28497b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final bw f30445b;

                        {
                            this.f30445b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f30445b.h(i11);
                                    return;
                                default:
                                    this.f30445b.h(i11);
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
                    public final bw f30445b;

                    {
                        this.f30445b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f30445b.h(i11);
                                return;
                            default:
                                this.f30445b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        xv xvVar = this.F;
        if (xvVar != null) {
            xvVar.setOnClickListener(new g0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28497b.setPadding(AndroidUtilities.dp(this.f24836d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f24836d0 = f7;
    }

    public void e() {
    }

    public void i(xv xvVar) {
    }
}
