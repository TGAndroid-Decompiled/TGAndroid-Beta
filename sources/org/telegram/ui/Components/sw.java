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
public abstract class sw extends sn0 {
    public static final int[] f30902e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f30903f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final ow E;
    public final ow F;
    public final qw G;
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
    public boolean f30904a0;
    public boolean f30905b0;
    public boolean f30906c0;
    public float f30907d0;
    public final int h;
    public final boolean f30908n;
    public boolean f30909r;
    public g6 f30910s;
    public final org.telegram.ui.ActionBar.e6 v;
    public final boolean f30911w;
    public final ow f30912x;
    public final ow f30913y;

    public sw(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f30908n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f30909r = true;
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
        this.f30904a0 = true;
        this.f30905b0 = false;
        this.f30906c0 = true;
        this.f30907d0 = 11.0f;
        this.f30911w = z13;
        this.v = e6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        kw kwVar = new kw(this, context, z13, z14);
        this.f30856b = kwVar;
        kwVar.setClipToPadding(false);
        this.f30856b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f30856b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f30856b;
            ow owVar = new ow(this, context, R.drawable.msg_emoji_stickers, false);
            this.f30912x = owVar;
            linearLayout.addView(owVar);
            owVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f30856b;
            ow owVar2 = new ow(this, context, this.h, false);
            this.f30913y = owVar2;
            linearLayout2.addView(owVar2);
            owVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            owVar2.f29583a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f30856b;
            ow owVar3 = new ow(this, context, i12, false);
            this.E = owVar3;
            linearLayout3.addView(owVar3);
            owVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            owVar3.setAlpha(0.0f);
            owVar3.f29583a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f30902e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ow owVar4 = new ow(this, context, i15, z15);
                owVar4.setContentDescription(f(i14));
                this.f30856b.addView(owVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f30856b;
            qw qwVar = new qw(this, context);
            this.G = qwVar;
            linearLayout4.addView(qwVar);
            qwVar.h = 3552126;
        }
        this.I = this.f30856b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f30856b;
            ow owVar5 = new ow(this, context, i13, true);
            this.F = owVar5;
            linearLayout5.addView(owVar5);
            owVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            owVar5.f29583a = Long.valueOf(1434631203);
            owVar5.setAlpha(0.0f);
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

    public boolean g(ny nyVar) {
        return nyVar.f29304f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.i6.o0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f30906c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ow owVar = this.f30912x;
        if (owVar != null) {
            i10++;
        }
        if (!this.W || owVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f30856b.getChildCount()) {
            View childAt = this.f30856b.getChildAt(i13);
            if (childAt instanceof qw) {
                qw qwVar = (qw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < qwVar.f30856b.getChildCount()) {
                    View childAt2 = qwVar.f30856b.getChildAt(i15);
                    if (childAt2 instanceof ow) {
                        ow owVar2 = (ow) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        owVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof ow) {
                    ow owVar3 = (ow) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    owVar3.g(z13, z11);
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
        qw qwVar2 = this.G;
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
                this.J.setInterpolator(hs.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f30856b.invalidate();
            }
            if (qwVar2 != null) {
                if (this.M != 1 && !this.f30908n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != qwVar2.f30295n) {
                    qwVar2.f30295n = z12;
                    if (!z12) {
                        qwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = qwVar2.f30857c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = qwVar2.f30296r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        qwVar2.f30857c = ofFloat2;
                        ofFloat2.addUpdateListener(new m6(qwVar2, 21));
                        qwVar2.f30857c.setDuration(475L);
                        qwVar2.f30857c.setInterpolator(hs.h);
                        qwVar2.f30857c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        qwVar2.f30296r = f11;
                        qwVar2.invalidate();
                        qwVar2.requestLayout();
                        qwVar2.c();
                        qwVar2.f30297s.f30856b.invalidate();
                    }
                }
            }
            View childAt3 = this.f30856b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (qwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= qwVar2.f30856b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                qwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.e6 e6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, e6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.i6.m1(0.18f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Me, e6Var));
        }
        return org.telegram.ui.ActionBar.i6.m1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        ow owVar = this.E;
        if (owVar != null) {
            boolean z11 = this.f30904a0;
            if (z11 || this.f30905b0 != z10) {
                this.f30905b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    owVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    owVar.setAlpha(f7);
                } else {
                    owVar.setVisibility(0);
                    ViewPropertyAnimator animate = owVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(hs.h).withEndAction(new bi.f(24, this, z10)).start();
                }
                this.f30856b.requestLayout();
                this.f30904a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        ow owVar = this.f30913y;
        if (owVar == null) {
            return;
        }
        if (z10) {
            owVar.setBackground(new rw(k()));
        } else {
            owVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f30909r = z10;
        this.f30856b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f30856b.getChildCount()) {
            View childAt = this.f30856b.getChildAt(i10);
            if (childAt instanceof qw) {
                qw qwVar = (qw) childAt;
                int i12 = 0;
                while (i12 < qwVar.f30856b.getChildCount()) {
                    qwVar.f30856b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final sw f27787b;

                        {
                            this.f27787b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f27787b.h(i11);
                                    return;
                                default:
                                    this.f27787b.h(i11);
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
                    public final sw f27787b;

                    {
                        this.f27787b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f27787b.h(i11);
                                return;
                            default:
                                this.f27787b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        ow owVar = this.F;
        if (owVar != null) {
            owVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30856b.setPadding(AndroidUtilities.dp(this.f30907d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f30907d0 = f7;
    }

    public void e() {
    }

    public void i(ow owVar) {
    }
}
