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
public abstract class ow extends on0 {
    public static final int[] f27750e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f27751f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final kw E;
    public final kw F;
    public final mw G;
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
    public boolean f27752a0;
    public boolean f27753b0;
    public boolean f27754c0;
    public float f27755d0;
    public final int h;
    public final boolean f27756n;
    public boolean f27757r;
    public g6 f27758s;
    public final org.telegram.ui.ActionBar.c6 v;
    public final boolean f27759w;
    public final kw f27760x;
    public final kw f27761y;

    public ow(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f27756n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f27757r = true;
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
        this.f27752a0 = true;
        this.f27753b0 = false;
        this.f27754c0 = true;
        this.f27755d0 = 11.0f;
        this.f27759w = z13;
        this.v = c6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        gw gwVar = new gw(this, context, z13, z14);
        this.f27691b = gwVar;
        gwVar.setClipToPadding(false);
        this.f27691b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f27691b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f27691b;
            kw kwVar = new kw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f27760x = kwVar;
            linearLayout.addView(kwVar);
            kwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f27691b;
            kw kwVar2 = new kw(this, context, this.h, false);
            this.f27761y = kwVar2;
            linearLayout2.addView(kwVar2);
            kwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            kwVar2.f26492a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f27691b;
            kw kwVar3 = new kw(this, context, i12, false);
            this.E = kwVar3;
            linearLayout3.addView(kwVar3);
            kwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            kwVar3.setAlpha(0.0f);
            kwVar3.f26492a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f27750e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                kw kwVar4 = new kw(this, context, i15, z15);
                kwVar4.setContentDescription(f(i14));
                this.f27691b.addView(kwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f27691b;
            mw mwVar = new mw(this, context);
            this.G = mwVar;
            linearLayout4.addView(mwVar);
            mwVar.h = 3552126;
        }
        this.I = this.f27691b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f27691b;
            kw kwVar5 = new kw(this, context, i13, true);
            this.F = kwVar5;
            linearLayout5.addView(kwVar5);
            kwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            kwVar5.f26492a = Long.valueOf(1434631203);
            kwVar5.setAlpha(0.0f);
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

    public boolean g(jy jyVar) {
        return jyVar.f26153f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.g6.o0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f27754c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        kw kwVar = this.f27760x;
        if (kwVar != null) {
            i10++;
        }
        if (!this.W || kwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f27691b.getChildCount()) {
            View childAt = this.f27691b.getChildAt(i13);
            if (childAt instanceof mw) {
                mw mwVar = (mw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < mwVar.f27691b.getChildCount()) {
                    View childAt2 = mwVar.f27691b.getChildAt(i15);
                    if (childAt2 instanceof kw) {
                        kw kwVar2 = (kw) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        kwVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof kw) {
                    kw kwVar3 = (kw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kwVar3.g(z13, z11);
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
        mw mwVar2 = this.G;
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
                ofFloat.addUpdateListener(new di.xa(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(es.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f27691b.invalidate();
            }
            if (mwVar2 != null) {
                if (this.M != 1 && !this.f27756n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != mwVar2.f27231n) {
                    mwVar2.f27231n = z12;
                    if (!z12) {
                        mwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = mwVar2.f27692c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = mwVar2.f27232r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        mwVar2.f27692c = ofFloat2;
                        ofFloat2.addUpdateListener(new n6(mwVar2, 21));
                        mwVar2.f27692c.setDuration(475L);
                        mwVar2.f27692c.setInterpolator(es.h);
                        mwVar2.f27692c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        mwVar2.f27232r = f11;
                        mwVar2.invalidate();
                        mwVar2.requestLayout();
                        mwVar2.c();
                        mwVar2.f27233s.f27691b.invalidate();
                    }
                }
            }
            View childAt3 = this.f27691b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (mwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= mwVar2.f27691b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                mwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.g6.m1(0.18f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Me, c6Var));
        }
        return org.telegram.ui.ActionBar.g6.m1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        kw kwVar = this.E;
        if (kwVar != null) {
            boolean z11 = this.f27752a0;
            if (z11 || this.f27753b0 != z10) {
                this.f27753b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    kwVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    kwVar.setAlpha(f7);
                } else {
                    kwVar.setVisibility(0);
                    ViewPropertyAnimator animate = kwVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(es.h).withEndAction(new ah.t(24, this, z10)).start();
                }
                this.f27691b.requestLayout();
                this.f27752a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        kw kwVar = this.f27761y;
        if (kwVar == null) {
            return;
        }
        if (z10) {
            kwVar.setBackground(new nw(k()));
        } else {
            kwVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f27757r = z10;
        this.f27691b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f27691b.getChildCount()) {
            View childAt = this.f27691b.getChildAt(i10);
            if (childAt instanceof mw) {
                mw mwVar = (mw) childAt;
                int i12 = 0;
                while (i12 < mwVar.f27691b.getChildCount()) {
                    mwVar.f27691b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final ow f24819b;

                        {
                            this.f24819b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f24819b.h(i11);
                                    return;
                                default:
                                    this.f24819b.h(i11);
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
                    public final ow f24819b;

                    {
                        this.f24819b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f24819b.h(i11);
                                return;
                            default:
                                this.f24819b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        kw kwVar = this.F;
        if (kwVar != null) {
            kwVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27691b.setPadding(AndroidUtilities.dp(this.f27755d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ow.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f27755d0 = f7;
    }

    public void e() {
    }

    public void i(kw kwVar) {
    }
}
