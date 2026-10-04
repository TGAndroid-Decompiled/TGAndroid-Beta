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
public abstract class gw extends en0 {
    public static final int[] f26929e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f26930f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final cw E;
    public final cw F;
    public final ew G;
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
    public boolean f26931a0;
    public boolean f26932b0;
    public boolean f26933c0;
    public float f26934d0;
    public final int h;
    public final boolean f26935n;
    public boolean f26936r;
    public e6 f26937s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f26938w;
    public final cw f26939x;
    public final cw f26940y;

    public gw(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f26935n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f26936r = true;
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
        this.f26931a0 = true;
        this.f26932b0 = false;
        this.f26933c0 = true;
        this.f26934d0 = 11.0f;
        this.f26938w = z13;
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        yv yvVar = new yv(this, context, z13, z14);
        this.f26090b = yvVar;
        yvVar.setClipToPadding(false);
        this.f26090b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f26090b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f26090b;
            cw cwVar = new cw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f26939x = cwVar;
            linearLayout.addView(cwVar);
            cwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f26090b;
            cw cwVar2 = new cw(this, context, this.h, false);
            this.f26940y = cwVar2;
            linearLayout2.addView(cwVar2);
            cwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            cwVar2.f25457a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f26090b;
            cw cwVar3 = new cw(this, context, i12, false);
            this.E = cwVar3;
            linearLayout3.addView(cwVar3);
            cwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            cwVar3.setAlpha(0.0f);
            cwVar3.f25457a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f26929e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                cw cwVar4 = new cw(this, context, i15, z15);
                cwVar4.setContentDescription(f(i14));
                this.f26090b.addView(cwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f26090b;
            ew ewVar = new ew(this, context);
            this.G = ewVar;
            linearLayout4.addView(ewVar);
            ewVar.h = 3552126;
        }
        this.I = this.f26090b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f26090b;
            cw cwVar5 = new cw(this, context, i13, true);
            this.F = cwVar5;
            linearLayout5.addView(cwVar5);
            cwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            cwVar5.f25457a = Long.valueOf(1434631203);
            cwVar5.setAlpha(0.0f);
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

    public boolean g(ay ayVar) {
        return ayVar.f24707f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.i6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f26933c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cw cwVar = this.f26939x;
        if (cwVar != null) {
            i10++;
        }
        if (!this.W || cwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f26090b.getChildCount()) {
            View childAt = this.f26090b.getChildAt(i13);
            if (childAt instanceof ew) {
                ew ewVar = (ew) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < ewVar.f26090b.getChildCount()) {
                    View childAt2 = ewVar.f26090b.getChildAt(i16);
                    if (childAt2 instanceof cw) {
                        cw cwVar2 = (cw) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cwVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof cw) {
                    cw cwVar3 = (cw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cwVar3.g(z13, z11);
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
        ew ewVar2 = this.G;
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
                ofFloat.addUpdateListener(new ci.xa(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(tr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f26090b.invalidate();
            }
            if (ewVar2 != null) {
                if (this.M != 1 && !this.f26935n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != ewVar2.f26160n) {
                    ewVar2.f26160n = z12;
                    if (!z12) {
                        ewVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = ewVar2.f26091c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = ewVar2.f26161r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        ewVar2.f26091c = ofFloat2;
                        ofFloat2.addUpdateListener(new k6(ewVar2, 20));
                        ewVar2.f26091c.setDuration(475L);
                        ewVar2.f26091c.setInterpolator(tr.h);
                        ewVar2.f26091c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ewVar2.f26161r = f11;
                        ewVar2.invalidate();
                        ewVar2.requestLayout();
                        ewVar2.c();
                        ewVar2.f26162s.f26090b.invalidate();
                    }
                }
            }
            View childAt3 = this.f26090b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (ewVar2 != null && this.M == 1 && i10 >= 1 && i10 <= ewVar2.f26090b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                ewVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.d6 d6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, d6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.i6.l1(0.18f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, d6Var));
        }
        return org.telegram.ui.ActionBar.i6.l1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        cw cwVar = this.E;
        if (cwVar != null) {
            boolean z11 = this.f26931a0;
            if (z11 || this.f26932b0 != z10) {
                this.f26932b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    cwVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    cwVar.setAlpha(f7);
                } else {
                    cwVar.setVisibility(0);
                    ViewPropertyAnimator animate = cwVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(tr.h).withEndAction(new bi.f(23, this, z10)).start();
                }
                this.f26090b.requestLayout();
                this.f26931a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        cw cwVar = this.f26940y;
        if (cwVar == null) {
            return;
        }
        if (z10) {
            cwVar.setBackground(new fw(k()));
        } else {
            cwVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f26936r = z10;
        this.f26090b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f26090b.getChildCount()) {
            View childAt = this.f26090b.getChildAt(i10);
            if (childAt instanceof ew) {
                ew ewVar = (ew) childAt;
                int i12 = 0;
                while (i12 < ewVar.f26090b.getChildCount()) {
                    ewVar.f26090b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final gw f32986b;

                        {
                            this.f32986b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f32986b.h(i11);
                                    return;
                                default:
                                    this.f32986b.h(i11);
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
                    public final gw f32986b;

                    {
                        this.f32986b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f32986b.h(i11);
                                return;
                            default:
                                this.f32986b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        cw cwVar = this.F;
        if (cwVar != null) {
            cwVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f26090b.setPadding(AndroidUtilities.dp(this.f26934d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f26934d0 = f7;
    }

    public void e() {
    }

    public void i(cw cwVar) {
    }
}
