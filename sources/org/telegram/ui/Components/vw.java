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
public abstract class vw extends yn0 {
    public static final int[] f32181e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f32182f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final rw E;
    public final rw F;
    public final tw G;
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
    public boolean f32183a0;
    public boolean f32184b0;
    public boolean f32185c0;
    public float f32186d0;
    public final int h;
    public final boolean f32187n;
    public boolean f32188r;
    public g6 f32189s;
    public final org.telegram.ui.ActionBar.c6 v;
    public final boolean f32190w;
    public final rw f32191x;
    public final rw f32192y;

    public vw(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f32187n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f32188r = true;
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
        this.f32183a0 = true;
        this.f32184b0 = false;
        this.f32185c0 = true;
        this.f32186d0 = 11.0f;
        this.f32190w = z13;
        this.v = c6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        nw nwVar = new nw(this, context, z13, z14);
        this.f33147b = nwVar;
        nwVar.setClipToPadding(false);
        this.f33147b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f33147b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f33147b;
            rw rwVar = new rw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f32191x = rwVar;
            linearLayout.addView(rwVar);
            rwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f33147b;
            rw rwVar2 = new rw(this, context, this.h, false);
            this.f32192y = rwVar2;
            linearLayout2.addView(rwVar2);
            rwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            rwVar2.f30255a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f33147b;
            rw rwVar3 = new rw(this, context, i12, false);
            this.E = rwVar3;
            linearLayout3.addView(rwVar3);
            rwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            rwVar3.setAlpha(0.0f);
            rwVar3.f30255a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f32181e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                rw rwVar4 = new rw(this, context, i15, z15);
                rwVar4.setContentDescription(f(i14));
                this.f33147b.addView(rwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f33147b;
            tw twVar = new tw(this, context);
            this.G = twVar;
            linearLayout4.addView(twVar);
            twVar.h = 3552126;
        }
        this.I = this.f33147b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f33147b;
            rw rwVar5 = new rw(this, context, i13, true);
            this.F = rwVar5;
            linearLayout5.addView(rwVar5);
            rwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            rwVar5.f30255a = Long.valueOf(1434631203);
            rwVar5.setAlpha(0.0f);
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

    public boolean g(qy qyVar) {
        return qyVar.f29951f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.h6.o0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f32185c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        rw rwVar = this.f32191x;
        if (rwVar != null) {
            i10++;
        }
        if (!this.W || rwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f33147b.getChildCount()) {
            View childAt = this.f33147b.getChildAt(i13);
            if (childAt instanceof tw) {
                tw twVar = (tw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < twVar.f33147b.getChildCount()) {
                    View childAt2 = twVar.f33147b.getChildAt(i15);
                    if (childAt2 instanceof rw) {
                        rw rwVar2 = (rw) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        rwVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof rw) {
                    rw rwVar3 = (rw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    rwVar3.g(z13, z11);
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
        tw twVar2 = this.G;
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
                this.J.setInterpolator(js.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f33147b.invalidate();
            }
            if (twVar2 != null) {
                if (this.M != 1 && !this.f32187n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != twVar2.f30983n) {
                    twVar2.f30983n = z12;
                    if (!z12) {
                        twVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = twVar2.f33148c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = twVar2.f30984r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        twVar2.f33148c = ofFloat2;
                        ofFloat2.addUpdateListener(new m6(twVar2, 21));
                        twVar2.f33148c.setDuration(475L);
                        twVar2.f33148c.setInterpolator(js.h);
                        twVar2.f33148c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        twVar2.f30984r = f11;
                        twVar2.invalidate();
                        twVar2.requestLayout();
                        twVar2.c();
                        twVar2.f30985s.f33147b.invalidate();
                    }
                }
            }
            View childAt3 = this.f33147b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (twVar2 != null && this.M == 1 && i10 >= 1 && i10 <= twVar2.f33147b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                twVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, c6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.h6.m1(0.18f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, c6Var));
        }
        return org.telegram.ui.ActionBar.h6.m1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        rw rwVar = this.E;
        if (rwVar != null) {
            boolean z11 = this.f32183a0;
            if (z11 || this.f32184b0 != z10) {
                this.f32184b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    rwVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    rwVar.setAlpha(f7);
                } else {
                    rwVar.setVisibility(0);
                    ViewPropertyAnimator animate = rwVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(js.h).withEndAction(new bi.f(24, this, z10)).start();
                }
                this.f33147b.requestLayout();
                this.f32183a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        rw rwVar = this.f32192y;
        if (rwVar == null) {
            return;
        }
        if (z10) {
            rwVar.setBackground(new uw(k()));
        } else {
            rwVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f32188r = z10;
        this.f33147b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f33147b.getChildCount()) {
            View childAt = this.f33147b.getChildAt(i10);
            if (childAt instanceof tw) {
                tw twVar = (tw) childAt;
                int i12 = 0;
                while (i12 < twVar.f33147b.getChildCount()) {
                    twVar.f33147b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final vw f28659b;

                        {
                            this.f28659b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f28659b.h(i11);
                                    return;
                                default:
                                    this.f28659b.h(i11);
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
                    public final vw f28659b;

                    {
                        this.f28659b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f28659b.h(i11);
                                return;
                            default:
                                this.f28659b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        rw rwVar = this.F;
        if (rwVar != null) {
            rwVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f33147b.setPadding(AndroidUtilities.dp(this.f32186d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f32186d0 = f7;
    }

    public void e() {
    }

    public void i(rw rwVar) {
    }
}
