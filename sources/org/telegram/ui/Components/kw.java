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
public abstract class kw extends kn0 {
    public static final int[] f27979e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f27980f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final gw E;
    public final gw F;
    public final iw G;
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
    public boolean f27981a0;
    public boolean f27982b0;
    public boolean f27983c0;
    public float f27984d0;
    public final int h;
    public final boolean f27985n;
    public boolean f27986r;
    public f6 f27987s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f27988w;
    public final gw f27989x;
    public final gw f27990y;

    public kw(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f27985n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f27986r = true;
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
        this.f27981a0 = true;
        this.f27982b0 = false;
        this.f27983c0 = true;
        this.f27984d0 = 11.0f;
        this.f27988w = z13;
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        cw cwVar = new cw(this, context, z13, z14);
        this.f27922b = cwVar;
        cwVar.setClipToPadding(false);
        this.f27922b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f27922b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f27922b;
            gw gwVar = new gw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f27989x = gwVar;
            linearLayout.addView(gwVar);
            gwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f27922b;
            gw gwVar2 = new gw(this, context, this.h, false);
            this.f27990y = gwVar2;
            linearLayout2.addView(gwVar2);
            gwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            gwVar2.f26700a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f27922b;
            gw gwVar3 = new gw(this, context, i12, false);
            this.E = gwVar3;
            linearLayout3.addView(gwVar3);
            gwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            gwVar3.setAlpha(0.0f);
            gwVar3.f26700a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f27979e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                gw gwVar4 = new gw(this, context, i15, z15);
                gwVar4.setContentDescription(f(i14));
                this.f27922b.addView(gwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f27922b;
            iw iwVar = new iw(this, context);
            this.G = iwVar;
            linearLayout4.addView(iwVar);
            iwVar.h = 3552126;
        }
        this.I = this.f27922b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f27922b;
            gw gwVar5 = new gw(this, context, i13, true);
            this.F = gwVar5;
            linearLayout5.addView(gwVar5);
            gwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            gwVar5.f26700a = Long.valueOf(1434631203);
            gwVar5.setAlpha(0.0f);
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

    public boolean g(fy fyVar) {
        return fyVar.f26396f;
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
        if (z10 && !this.f27983c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        gw gwVar = this.f27989x;
        if (gwVar != null) {
            i10++;
        }
        if (!this.W || gwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f27922b.getChildCount()) {
            View childAt = this.f27922b.getChildAt(i13);
            if (childAt instanceof iw) {
                iw iwVar = (iw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < iwVar.f27922b.getChildCount()) {
                    View childAt2 = iwVar.f27922b.getChildAt(i15);
                    if (childAt2 instanceof gw) {
                        gw gwVar2 = (gw) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        gwVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof gw) {
                    gw gwVar3 = (gw) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    gwVar3.g(z13, z11);
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
        iw iwVar2 = this.G;
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
                this.J.setInterpolator(bs.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f27922b.invalidate();
            }
            if (iwVar2 != null) {
                if (this.M != 1 && !this.f27985n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != iwVar2.f27381n) {
                    iwVar2.f27381n = z12;
                    if (!z12) {
                        iwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = iwVar2.f27923c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = iwVar2.f27382r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        iwVar2.f27923c = ofFloat2;
                        ofFloat2.addUpdateListener(new l6(iwVar2, 21));
                        iwVar2.f27923c.setDuration(475L);
                        iwVar2.f27923c.setInterpolator(bs.h);
                        iwVar2.f27923c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        iwVar2.f27382r = f11;
                        iwVar2.invalidate();
                        iwVar2.requestLayout();
                        iwVar2.c();
                        iwVar2.f27383s.f27922b.invalidate();
                    }
                }
            }
            View childAt3 = this.f27922b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (iwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= iwVar2.f27922b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                iwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.d6 d6Var = this.v;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.h6.m1(0.18f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, d6Var));
        }
        return org.telegram.ui.ActionBar.h6.m1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        gw gwVar = this.E;
        if (gwVar != null) {
            boolean z11 = this.f27981a0;
            if (z11 || this.f27982b0 != z10) {
                this.f27982b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    gwVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    gwVar.setAlpha(f7);
                } else {
                    gwVar.setVisibility(0);
                    ViewPropertyAnimator animate = gwVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(bs.h).withEndAction(new ah.t(27, this, z10)).start();
                }
                this.f27922b.requestLayout();
                this.f27981a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        gw gwVar = this.f27990y;
        if (gwVar == null) {
            return;
        }
        if (z10) {
            gwVar.setBackground(new jw(k()));
        } else {
            gwVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f27986r = z10;
        this.f27922b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f27922b.getChildCount()) {
            View childAt = this.f27922b.getChildAt(i10);
            if (childAt instanceof iw) {
                iw iwVar = (iw) childAt;
                int i12 = 0;
                while (i12 < iwVar.f27922b.getChildCount()) {
                    iwVar.f27922b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final kw f25031b;

                        {
                            this.f25031b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f25031b.h(i11);
                                    return;
                                default:
                                    this.f25031b.h(i11);
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
                    public final kw f25031b;

                    {
                        this.f25031b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f25031b.h(i11);
                                return;
                            default:
                                this.f25031b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        gw gwVar = this.F;
        if (gwVar != null) {
            gwVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27922b.setPadding(AndroidUtilities.dp(this.f27984d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f27984d0 = f7;
    }

    public void e() {
    }

    public void i(gw gwVar) {
    }
}
