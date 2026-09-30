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
public abstract class fw extends an0 {
    public static final int[] f24335e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f24336f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final bw E;
    public final bw F;
    public final dw G;
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
    public boolean f24337a0;
    public boolean f24338b0;
    public boolean f24339c0;
    public float f24340d0;
    public final int h;
    public final boolean f24341n;
    public boolean f24342r;
    public e6 f24343s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f24344w;
    public final bw f24345x;
    public final bw f24346y;

    public fw(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f24341n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f24342r = true;
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
        this.f24337a0 = true;
        this.f24338b0 = false;
        this.f24339c0 = true;
        this.f24340d0 = 11.0f;
        this.f24344w = z13;
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        xv xvVar = new xv(this, context, z13, z14);
        this.f22697b = xvVar;
        xvVar.setClipToPadding(false);
        this.f22697b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f22697b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f22697b;
            bw bwVar = new bw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f24345x = bwVar;
            linearLayout.addView(bwVar);
            bwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f22697b;
            bw bwVar2 = new bw(this, context, this.h, false);
            this.f24346y = bwVar2;
            linearLayout2.addView(bwVar2);
            bwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            bwVar2.f23097a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f22697b;
            bw bwVar3 = new bw(this, context, i12, false);
            this.E = bwVar3;
            linearLayout3.addView(bwVar3);
            bwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            bwVar3.setAlpha(0.0f);
            bwVar3.f23097a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f24335e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                bw bwVar4 = new bw(this, context, i15, z15);
                bwVar4.setContentDescription(f(i14));
                this.f22697b.addView(bwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f22697b;
            dw dwVar = new dw(this, context);
            this.G = dwVar;
            linearLayout4.addView(dwVar);
            dwVar.h = 3552126;
        }
        this.I = this.f22697b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f22697b;
            bw bwVar5 = new bw(this, context, i13, true);
            this.F = bwVar5;
            linearLayout5.addView(bwVar5);
            bwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            bwVar5.f23097a = Long.valueOf(1434631203);
            bwVar5.setAlpha(0.0f);
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
        return zxVar.f30983f;
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
        if (z10 && !this.f24339c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        bw bwVar = this.f24345x;
        if (bwVar != null) {
            i10++;
        }
        if (!this.W || bwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f22697b.getChildCount()) {
            View childAt = this.f22697b.getChildAt(i13);
            if (childAt instanceof dw) {
                dw dwVar = (dw) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < dwVar.f22697b.getChildCount()) {
                    View childAt2 = dwVar.f22697b.getChildAt(i16);
                    if (childAt2 instanceof bw) {
                        bw bwVar2 = (bw) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        bwVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof bw) {
                    bw bwVar3 = (bw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bwVar3.g(z13, z11);
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
        dw dwVar2 = this.G;
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
                this.f22697b.invalidate();
            }
            if (dwVar2 != null) {
                if (this.M != 1 && !this.f24341n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != dwVar2.f23726n) {
                    dwVar2.f23726n = z12;
                    if (!z12) {
                        dwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = dwVar2.f22698c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = dwVar2.f23727r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        dwVar2.f22698c = ofFloat2;
                        ofFloat2.addUpdateListener(new k6(dwVar2, 20));
                        dwVar2.f22698c.setDuration(475L);
                        dwVar2.f22698c.setInterpolator(sr.h);
                        dwVar2.f22698c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        dwVar2.f23727r = f11;
                        dwVar2.invalidate();
                        dwVar2.requestLayout();
                        dwVar2.c();
                        dwVar2.f23728s.f22697b.invalidate();
                    }
                }
            }
            View childAt3 = this.f22697b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (dwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= dwVar2.f22697b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                dwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
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
        bw bwVar = this.E;
        if (bwVar != null) {
            boolean z11 = this.f24337a0;
            if (z11 || this.f24338b0 != z10) {
                this.f24338b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    bwVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    bwVar.setAlpha(f7);
                } else {
                    bwVar.setVisibility(0);
                    ViewPropertyAnimator animate = bwVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(sr.h).withEndAction(new bi.f(23, this, z10)).start();
                }
                this.f22697b.requestLayout();
                this.f24337a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        bw bwVar = this.f24346y;
        if (bwVar == null) {
            return;
        }
        if (z10) {
            bwVar.setBackground(new ew(k()));
        } else {
            bwVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f24342r = z10;
        this.f22697b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f22697b.getChildCount()) {
            View childAt = this.f22697b.getChildAt(i10);
            if (childAt instanceof dw) {
                dw dwVar = (dw) childAt;
                int i12 = 0;
                while (i12 < dwVar.f22697b.getChildCount()) {
                    dwVar.f22697b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final fw f30180b;

                        {
                            this.f30180b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f30180b.h(i11);
                                    return;
                                default:
                                    this.f30180b.h(i11);
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
                    public final fw f30180b;

                    {
                        this.f30180b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f30180b.h(i11);
                                return;
                            default:
                                this.f30180b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        bw bwVar = this.F;
        if (bwVar != null) {
            bwVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f22697b.setPadding(AndroidUtilities.dp(this.f24340d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f24340d0 = f7;
    }

    public void e() {
    }

    public void i(bw bwVar) {
    }
}
