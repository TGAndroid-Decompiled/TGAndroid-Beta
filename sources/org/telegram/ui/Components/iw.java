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
public abstract class iw extends nn0 {
    public static final int[] f27496e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f27497f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final ew E;
    public final ew F;
    public final gw G;
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
    public boolean f27498a0;
    public boolean f27499b0;
    public boolean f27500c0;
    public float f27501d0;
    public final int h;
    public final boolean f27502n;
    public boolean f27503r;
    public d6 f27504s;
    public final org.telegram.ui.ActionBar.g6 v;
    public final boolean f27505w;
    public final ew f27506x;
    public final ew f27507y;

    public iw(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f27502n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f27503r = true;
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
        this.f27498a0 = true;
        this.f27499b0 = false;
        this.f27500c0 = true;
        this.f27501d0 = 11.0f;
        this.f27505w = z13;
        this.v = g6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        aw awVar = new aw(this, context, z13, z14);
        this.f28979b = awVar;
        awVar.setClipToPadding(false);
        this.f28979b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f28979b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f28979b;
            ew ewVar = new ew(this, context, R.drawable.msg_emoji_stickers, false);
            this.f27506x = ewVar;
            linearLayout.addView(ewVar);
            ewVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f28979b;
            ew ewVar2 = new ew(this, context, this.h, false);
            this.f27507y = ewVar2;
            linearLayout2.addView(ewVar2);
            ewVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            ewVar2.f26122a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f28979b;
            ew ewVar3 = new ew(this, context, i12, false);
            this.E = ewVar3;
            linearLayout3.addView(ewVar3);
            ewVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            ewVar3.setAlpha(0.0f);
            ewVar3.f26122a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f27496e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ew ewVar4 = new ew(this, context, i15, z15);
                ewVar4.setContentDescription(f(i14));
                this.f28979b.addView(ewVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f28979b;
            gw gwVar = new gw(this, context);
            this.G = gwVar;
            linearLayout4.addView(gwVar);
            gwVar.h = 3552126;
        }
        this.I = this.f28979b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f28979b;
            ew ewVar5 = new ew(this, context, i13, true);
            this.F = ewVar5;
            linearLayout5.addView(ewVar5);
            ewVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            ewVar5.f26122a = Long.valueOf(1434631203);
            ewVar5.setAlpha(0.0f);
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

    public boolean g(dy dyVar) {
        return dyVar.f25858f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.o0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f27500c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ew ewVar = this.f27506x;
        if (ewVar != null) {
            i10++;
        }
        if (!this.W || ewVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f28979b.getChildCount()) {
            View childAt = this.f28979b.getChildAt(i13);
            if (childAt instanceof gw) {
                gw gwVar = (gw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < gwVar.f28979b.getChildCount()) {
                    View childAt2 = gwVar.f28979b.getChildAt(i15);
                    if (childAt2 instanceof ew) {
                        ew ewVar2 = (ew) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ewVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof ew) {
                    ew ewVar3 = (ew) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ewVar3.g(z13, z11);
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
        gw gwVar2 = this.G;
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
                ofFloat.addUpdateListener(new ei.ja(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(zr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f28979b.invalidate();
            }
            if (gwVar2 != null) {
                if (this.M != 1 && !this.f27502n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != gwVar2.f26801n) {
                    gwVar2.f26801n = z12;
                    if (!z12) {
                        gwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = gwVar2.f28980c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = gwVar2.f26802r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        gwVar2.f28980c = ofFloat2;
                        ofFloat2.addUpdateListener(new j6(gwVar2, 21));
                        gwVar2.f28980c.setDuration(475L);
                        gwVar2.f28980c.setInterpolator(zr.h);
                        gwVar2.f28980c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        gwVar2.f26802r = f11;
                        gwVar2.invalidate();
                        gwVar2.requestLayout();
                        gwVar2.c();
                        gwVar2.f26803s.f28979b.invalidate();
                    }
                }
            }
            View childAt3 = this.f28979b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (gwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= gwVar2.f28979b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                gwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.g6 g6Var = this.v;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.k6.o1(0.18f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, g6Var));
        }
        return org.telegram.ui.ActionBar.k6.o1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        ew ewVar = this.E;
        if (ewVar != null) {
            boolean z11 = this.f27498a0;
            if (z11 || this.f27499b0 != z10) {
                this.f27499b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    ewVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ewVar.setAlpha(f7);
                } else {
                    ewVar.setVisibility(0);
                    ViewPropertyAnimator animate = ewVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(zr.h).withEndAction(new ah.t(27, this, z10)).start();
                }
                this.f28979b.requestLayout();
                this.f27498a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        ew ewVar = this.f27507y;
        if (ewVar == null) {
            return;
        }
        if (z10) {
            ewVar.setBackground(new hw(k()));
        } else {
            ewVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f27503r = z10;
        this.f28979b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f28979b.getChildCount()) {
            View childAt = this.f28979b.getChildAt(i10);
            if (childAt instanceof gw) {
                gw gwVar = (gw) childAt;
                int i12 = 0;
                while (i12 < gwVar.f28979b.getChildCount()) {
                    gwVar.f28979b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final iw f33358b;

                        {
                            this.f33358b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f33358b.h(i11);
                                    return;
                                default:
                                    this.f33358b.h(i11);
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
                    public final iw f33358b;

                    {
                        this.f33358b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f33358b.h(i11);
                                return;
                            default:
                                this.f33358b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        ew ewVar = this.F;
        if (ewVar != null) {
            ewVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28979b.setPadding(AndroidUtilities.dp(this.f27501d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f27501d0 = f7;
    }

    public void e() {
    }

    public void i(ew ewVar) {
    }
}
