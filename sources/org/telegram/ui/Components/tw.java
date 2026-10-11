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
public abstract class tw extends tn0 {
    public static final int[] f31347e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f31348f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final pw E;
    public final pw F;
    public final rw G;
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
    public boolean f31349a0;
    public boolean f31350b0;
    public boolean f31351c0;
    public float f31352d0;
    public final int h;
    public final boolean f31353n;
    public boolean f31354r;
    public g6 f31355s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f31356w;
    public final pw f31357x;
    public final pw f31358y;

    public tw(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f31353n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f31354r = true;
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
        this.f31349a0 = true;
        this.f31350b0 = false;
        this.f31351c0 = true;
        this.f31352d0 = 11.0f;
        this.f31356w = z13;
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        lw lwVar = new lw(this, context, z13, z14);
        this.f31306b = lwVar;
        lwVar.setClipToPadding(false);
        this.f31306b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f31306b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f31306b;
            pw pwVar = new pw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f31357x = pwVar;
            linearLayout.addView(pwVar);
            pwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f31306b;
            pw pwVar2 = new pw(this, context, this.h, false);
            this.f31358y = pwVar2;
            linearLayout2.addView(pwVar2);
            pwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            pwVar2.f29973a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f31306b;
            pw pwVar3 = new pw(this, context, i12, false);
            this.E = pwVar3;
            linearLayout3.addView(pwVar3);
            pwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            pwVar3.setAlpha(0.0f);
            pwVar3.f29973a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f31347e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                pw pwVar4 = new pw(this, context, i15, z15);
                pwVar4.setContentDescription(f(i14));
                this.f31306b.addView(pwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f31306b;
            rw rwVar = new rw(this, context);
            this.G = rwVar;
            linearLayout4.addView(rwVar);
            rwVar.h = 3552126;
        }
        this.I = this.f31306b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f31306b;
            pw pwVar5 = new pw(this, context, i13, true);
            this.F = pwVar5;
            linearLayout5.addView(pwVar5);
            pwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            pwVar5.f29973a = Long.valueOf(1434631203);
            pwVar5.setAlpha(0.0f);
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

    public boolean g(oy oyVar) {
        return oyVar.f29654f;
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
        if (z10 && !this.f31351c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        pw pwVar = this.f31357x;
        if (pwVar != null) {
            i10++;
        }
        if (!this.W || pwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f31306b.getChildCount()) {
            View childAt = this.f31306b.getChildAt(i13);
            if (childAt instanceof rw) {
                rw rwVar = (rw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < rwVar.f31306b.getChildCount()) {
                    View childAt2 = rwVar.f31306b.getChildAt(i15);
                    if (childAt2 instanceof pw) {
                        pw pwVar2 = (pw) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pwVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof pw) {
                    pw pwVar3 = (pw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pwVar3.g(z13, z11);
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
        rw rwVar2 = this.G;
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
                this.J.setInterpolator(is.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f31306b.invalidate();
            }
            if (rwVar2 != null) {
                if (this.M != 1 && !this.f31353n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != rwVar2.f30658n) {
                    rwVar2.f30658n = z12;
                    if (!z12) {
                        rwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = rwVar2.f31307c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = rwVar2.f30659r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        rwVar2.f31307c = ofFloat2;
                        ofFloat2.addUpdateListener(new m6(rwVar2, 21));
                        rwVar2.f31307c.setDuration(475L);
                        rwVar2.f31307c.setInterpolator(is.h);
                        rwVar2.f31307c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        rwVar2.f30659r = f11;
                        rwVar2.invalidate();
                        rwVar2.requestLayout();
                        rwVar2.c();
                        rwVar2.f30660s.f31306b.invalidate();
                    }
                }
            }
            View childAt3 = this.f31306b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (rwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= rwVar2.f31306b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                rwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.d6 d6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.h6.m1(0.18f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, d6Var));
        }
        return org.telegram.ui.ActionBar.h6.m1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        pw pwVar = this.E;
        if (pwVar != null) {
            boolean z11 = this.f31349a0;
            if (z11 || this.f31350b0 != z10) {
                this.f31350b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    pwVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    pwVar.setAlpha(f7);
                } else {
                    pwVar.setVisibility(0);
                    ViewPropertyAnimator animate = pwVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(is.h).withEndAction(new bi.f(24, this, z10)).start();
                }
                this.f31306b.requestLayout();
                this.f31349a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        pw pwVar = this.f31358y;
        if (pwVar == null) {
            return;
        }
        if (z10) {
            pwVar.setBackground(new sw(k()));
        } else {
            pwVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f31354r = z10;
        this.f31306b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f31306b.getChildCount()) {
            View childAt = this.f31306b.getChildAt(i10);
            if (childAt instanceof rw) {
                rw rwVar = (rw) childAt;
                int i12 = 0;
                while (i12 < rwVar.f31306b.getChildCount()) {
                    rwVar.f31306b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final tw f28143b;

                        {
                            this.f28143b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f28143b.h(i11);
                                    return;
                                default:
                                    this.f28143b.h(i11);
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
                    public final tw f28143b;

                    {
                        this.f28143b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f28143b.h(i11);
                                return;
                            default:
                                this.f28143b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        pw pwVar = this.F;
        if (pwVar != null) {
            pwVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31306b.setPadding(AndroidUtilities.dp(this.f31352d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f31352d0 = f7;
    }

    public void e() {
    }

    public void i(pw pwVar) {
    }
}
