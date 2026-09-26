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
public abstract class ew extends zm0 {
    public static final int[] f24059e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f24060f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final aw E;
    public final aw F;
    public final cw G;
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
    public boolean f24061a0;
    public boolean f24062b0;
    public boolean f24063c0;
    public float f24064d0;
    public final int h;
    public final boolean f24065n;
    public boolean f24066r;
    public e6 f24067s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f24068w;
    public final aw f24069x;
    public final aw f24070y;

    public ew(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f24065n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f24066r = true;
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
        this.f24061a0 = true;
        this.f24062b0 = false;
        this.f24063c0 = true;
        this.f24064d0 = 11.0f;
        this.f24068w = z13;
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        wv wvVar = new wv(this, context, z13, z14);
        this.f30927b = wvVar;
        wvVar.setClipToPadding(false);
        this.f30927b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f30927b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f30927b;
            aw awVar = new aw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f24069x = awVar;
            linearLayout.addView(awVar);
            awVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f30927b;
            aw awVar2 = new aw(this, context, this.h, false);
            this.f24070y = awVar2;
            linearLayout2.addView(awVar2);
            awVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            awVar2.f22768a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f30927b;
            aw awVar3 = new aw(this, context, i12, false);
            this.E = awVar3;
            linearLayout3.addView(awVar3);
            awVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            awVar3.setAlpha(0.0f);
            awVar3.f22768a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f24059e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                aw awVar4 = new aw(this, context, i15, z15);
                awVar4.setContentDescription(f(i14));
                this.f30927b.addView(awVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f30927b;
            cw cwVar = new cw(this, context);
            this.G = cwVar;
            linearLayout4.addView(cwVar);
            cwVar.h = 3552126;
        }
        this.I = this.f30927b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f30927b;
            aw awVar5 = new aw(this, context, i13, true);
            this.F = awVar5;
            linearLayout5.addView(awVar5);
            awVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            awVar5.f22768a = Long.valueOf(1434631203);
            awVar5.setAlpha(0.0f);
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

    public boolean g(zx zxVar) {
        return zxVar.f30994f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.h6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f24063c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aw awVar = this.f24069x;
        if (awVar != null) {
            i10++;
        }
        if (!this.W || awVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f30927b.getChildCount()) {
            View childAt = this.f30927b.getChildAt(i13);
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < cwVar.f30927b.getChildCount()) {
                    View childAt2 = cwVar.f30927b.getChildAt(i16);
                    if (childAt2 instanceof aw) {
                        aw awVar2 = (aw) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        awVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof aw) {
                    aw awVar3 = (aw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    awVar3.g(z13, z11);
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
        cw cwVar2 = this.G;
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
                ofFloat.addUpdateListener(new ci.ya(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(sr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f30927b.invalidate();
            }
            if (cwVar2 != null) {
                if (this.M != 1 && !this.f24065n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != cwVar2.f23418n) {
                    cwVar2.f23418n = z12;
                    if (!z12) {
                        cwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = cwVar2.f30928c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = cwVar2.f23419r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        cwVar2.f30928c = ofFloat2;
                        ofFloat2.addUpdateListener(new k6(cwVar2, 20));
                        cwVar2.f30928c.setDuration(475L);
                        cwVar2.f30928c.setInterpolator(sr.h);
                        cwVar2.f30928c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        cwVar2.f23419r = f11;
                        cwVar2.invalidate();
                        cwVar2.requestLayout();
                        cwVar2.c();
                        cwVar2.f23420s.f30927b.invalidate();
                    }
                }
            }
            View childAt3 = this.f30927b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (cwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= cwVar2.f30927b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                cwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.d6 d6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.h6.l1(0.18f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Me, d6Var));
        }
        return org.telegram.ui.ActionBar.h6.l1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        aw awVar = this.E;
        if (awVar != null) {
            boolean z11 = this.f24061a0;
            if (z11 || this.f24062b0 != z10) {
                this.f24062b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    awVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    awVar.setAlpha(f7);
                } else {
                    awVar.setVisibility(0);
                    ViewPropertyAnimator animate = awVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(sr.h).withEndAction(new bi.f(23, this, z10)).start();
                }
                this.f30927b.requestLayout();
                this.f24061a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        aw awVar = this.f24070y;
        if (awVar == null) {
            return;
        }
        if (z10) {
            awVar.setBackground(new dw(k()));
        } else {
            awVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f24066r = z10;
        this.f30927b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f30927b.getChildCount()) {
            View childAt = this.f30927b.getChildAt(i10);
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                int i12 = 0;
                while (i12 < cwVar.f30927b.getChildCount()) {
                    cwVar.f30927b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final ew f29772b;

                        {
                            this.f29772b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f29772b.h(i11);
                                    return;
                                default:
                                    this.f29772b.h(i11);
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
                    public final ew f29772b;

                    {
                        this.f29772b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f29772b.h(i11);
                                return;
                            default:
                                this.f29772b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        aw awVar = this.F;
        if (awVar != null) {
            awVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30927b.setPadding(AndroidUtilities.dp(this.f24064d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ew.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f24064d0 = f7;
    }

    public void e() {
    }

    public void i(aw awVar) {
    }
}
