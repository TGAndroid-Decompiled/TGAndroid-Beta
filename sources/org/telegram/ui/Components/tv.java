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
public abstract class tv extends km0 {
    public static final int[] f33041a0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f33042b0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final pv A;
    public final pv B;
    public final rv C;
    public final HashMap D;
    public final int E;
    public ValueAnimator F;
    public float G;
    public float H;
    public int I;
    public int J;
    public boolean K;
    public final boolean L;
    public final int M;
    public final Runnable N;
    public int O;
    public final int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int h;
    public final boolean f33043n;
    public boolean f33044r;
    public d6 f33045s;
    public final org.telegram.ui.ActionBar.c6 v;
    public final boolean f33046w;
    public final pv f33047x;
    public final pv f33048y;

    public tv(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f33043n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f33044r = true;
        this.D = new HashMap();
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0;
        this.J = 0;
        this.K = true;
        this.O = 6;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        this.V = true;
        this.W = 11.0f;
        this.f33046w = z13;
        this.v = c6Var;
        this.N = runnable;
        this.P = i10;
        this.M = i11;
        this.L = z14;
        lv lvVar = new lv(this, context, z13, z14);
        this.f30108b = lvVar;
        lvVar.setClipToPadding(false);
        this.f30108b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f30108b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f30108b;
            pv pvVar = new pv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f33047x = pvVar;
            linearLayout.addView(pvVar);
            pvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f30108b;
            pv pvVar2 = new pv(this, context, this.h, false);
            this.f33048y = pvVar2;
            linearLayout2.addView(pvVar2);
            pvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            pvVar2.f31777a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f30108b;
            pv pvVar3 = new pv(this, context, i12, false);
            this.A = pvVar3;
            linearLayout3.addView(pvVar3);
            pvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            pvVar3.setAlpha(0.0f);
            pvVar3.f31777a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f33041a0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                pv pvVar4 = new pv(this, context, i15, z15);
                pvVar4.setContentDescription(f(i14));
                this.f30108b.addView(pvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f30108b;
            rv rvVar = new rv(this, context);
            this.C = rvVar;
            linearLayout4.addView(rvVar);
            rvVar.h = 3552126;
        }
        this.E = this.f30108b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f30108b;
            pv pvVar5 = new pv(this, context, i13, true);
            this.B = pvVar5;
            linearLayout5.addView(pvVar5);
            pvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            pvVar5.f31777a = Long.valueOf(1434631203);
            pvVar5.setAlpha(0.0f);
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

    public boolean g(rx rxVar) {
        return rxVar.f32405f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.g6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.V) {
            z11 = true;
        } else {
            z11 = false;
        }
        pv pvVar = this.f33047x;
        if (pvVar != null) {
            i10++;
        }
        if (!this.S || pvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.I;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f30108b.getChildCount()) {
            View childAt = this.f30108b.getChildAt(i13);
            if (childAt instanceof rv) {
                rv rvVar = (rv) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < rvVar.f30108b.getChildCount()) {
                    View childAt2 = rvVar.f30108b.getChildAt(i16);
                    if (childAt2 instanceof pv) {
                        pv pvVar2 = (pv) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pvVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof pv) {
                    pv pvVar3 = (pv) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pvVar3.g(z13, z11);
                }
                i11 = i14;
            }
            if (i10 >= i14 && i10 <= i11) {
                this.I = i13;
            }
            i13++;
            i14 = i11 + 1;
        }
        int i17 = this.I;
        rv rvVar2 = this.C;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f9 = this.G;
            float f10 = this.I;
            float f11 = 1.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new nh.v9(this, f9, f10, 1));
                this.F.setDuration(350L);
                this.F.setInterpolator(jr.h);
                this.F.start();
            } else {
                this.H = 1.0f;
                this.G = AndroidUtilities.lerp(f9, f10, 1.0f);
                this.f30108b.invalidate();
            }
            if (rvVar2 != null) {
                if (this.I != 1 && !this.f33043n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != rvVar2.f32388n) {
                    rvVar2.f32388n = z12;
                    if (!z12) {
                        rvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = rvVar2.f30109c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = rvVar2.f32389r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        rvVar2.f30109c = ofFloat2;
                        ofFloat2.addUpdateListener(new j6(rvVar2, 20));
                        rvVar2.f30109c.setDuration(475L);
                        rvVar2.f30109c.setInterpolator(jr.h);
                        rvVar2.f30109c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        rvVar2.f32389r = f11;
                        rvVar2.invalidate();
                        rvVar2.requestLayout();
                        rvVar2.c();
                        rvVar2.f32390s.f30108b.invalidate();
                    }
                }
            }
            View childAt3 = this.f30108b.getChildAt(this.I);
            if (this.I >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.J != i10) {
            if (rvVar2 != null && this.I == 1 && i10 >= 1 && i10 <= rvVar2.f30108b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                rvVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.J = i10;
        }
    }

    public final int k() {
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f);
        }
        int i10 = this.P;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.g6.l1(0.18f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var));
        }
        return org.telegram.ui.ActionBar.g6.l1(0.09f, this.M);
    }

    public final void l(boolean z10) {
        int i10;
        pv pvVar = this.A;
        if (pvVar != null) {
            boolean z11 = this.T;
            if (z11 || this.U != z10) {
                this.U = z10;
                float f9 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    pvVar.setVisibility(i10);
                    if (z10) {
                        f9 = 1.0f;
                    }
                    pvVar.setAlpha(f9);
                } else {
                    pvVar.setVisibility(0);
                    ViewPropertyAnimator animate = pvVar.animate();
                    if (z10) {
                        f9 = 1.0f;
                    }
                    animate.alpha(f9).setDuration(200L).setInterpolator(jr.h).withEndAction(new hh.f(26, this, z10)).start();
                }
                this.f30108b.requestLayout();
                this.T = false;
            }
        }
    }

    public final void m(boolean z10) {
        pv pvVar = this.f33048y;
        if (pvVar == null) {
            return;
        }
        if (z10) {
            pvVar.setBackground(new sv(k()));
        } else {
            pvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f33044r = z10;
        this.f30108b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f30108b.getChildCount()) {
            View childAt = this.f30108b.getChildAt(i10);
            if (childAt instanceof rv) {
                rv rvVar = (rv) childAt;
                int i12 = 0;
                while (i12 < rvVar.f30108b.getChildCount()) {
                    rvVar.f30108b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final tv f30154b;

                        {
                            this.f30154b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f30154b.h(i11);
                                    return;
                                default:
                                    this.f30154b.h(i11);
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
                    public final tv f30154b;

                    {
                        this.f30154b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f30154b.h(i11);
                                return;
                            default:
                                this.f30154b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        pv pvVar = this.B;
        if (pvVar != null) {
            pvVar.setOnClickListener(new h0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30108b.setPadding(AndroidUtilities.dp(this.W), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.O = i10;
    }

    public void setPaddingLeft(float f9) {
        this.W = f9;
    }

    public void e() {
    }

    public void i(pv pvVar) {
    }
}
