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
public abstract class kw extends un0 {
    public static final int[] f30034e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f30035f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
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
    public boolean f30036a0;
    public boolean f30037b0;
    public boolean f30038c0;
    public float f30039d0;
    public final int h;
    public final boolean f30040n;
    public boolean f30041r;
    public h6 f30042s;
    public final org.telegram.ui.ActionBar.u6 v;
    public final boolean f30043w;
    public final gw f30044x;
    public final gw f30045y;

    public kw(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f30040n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f30041r = true;
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
        this.f30036a0 = true;
        this.f30037b0 = false;
        this.f30038c0 = true;
        this.f30039d0 = 11.0f;
        this.f30043w = z13;
        this.v = u6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        cw cwVar = new cw(this, context, z13, z14);
        this.f33435b = cwVar;
        cwVar.setClipToPadding(false);
        this.f33435b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f33435b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f33435b;
            gw gwVar = new gw(this, context, R.drawable.msg_emoji_stickers, false);
            this.f30044x = gwVar;
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
            LinearLayout linearLayout2 = this.f33435b;
            gw gwVar2 = new gw(this, context, this.h, false);
            this.f30045y = gwVar2;
            linearLayout2.addView(gwVar2);
            gwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            gwVar2.f28763a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f33435b;
            gw gwVar3 = new gw(this, context, i12, false);
            this.E = gwVar3;
            linearLayout3.addView(gwVar3);
            gwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            gwVar3.setAlpha(0.0f);
            gwVar3.f28763a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f30034e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                gw gwVar4 = new gw(this, context, i15, z15);
                gwVar4.setContentDescription(f(i14));
                this.f33435b.addView(gwVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f33435b;
            iw iwVar = new iw(this, context);
            this.G = iwVar;
            linearLayout4.addView(iwVar);
            iwVar.h = 3552126;
        }
        this.I = this.f33435b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f33435b;
            gw gwVar5 = new gw(this, context, i13, true);
            this.F = gwVar5;
            linearLayout5.addView(gwVar5);
            gwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            gwVar5.f28763a = Long.valueOf(1434631203);
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

    public boolean g(ey eyVar) {
        return eyVar.f27960f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.y6.o0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f30038c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        gw gwVar = this.f30044x;
        if (gwVar != null) {
            i10++;
        }
        if (!this.W || gwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f33435b.getChildCount()) {
            View childAt = this.f33435b.getChildAt(i13);
            if (childAt instanceof iw) {
                iw iwVar = (iw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < iwVar.f33435b.getChildCount()) {
                    View childAt2 = iwVar.f33435b.getChildAt(i15);
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
                ofFloat.addUpdateListener(new fi.fa(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(ds.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f33435b.invalidate();
            }
            if (iwVar2 != null) {
                if (this.M != 1 && !this.f30040n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != iwVar2.f29427n) {
                    iwVar2.f29427n = z12;
                    if (!z12) {
                        iwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = iwVar2.f33436c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = iwVar2.f29428r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        iwVar2.f33436c = ofFloat2;
                        ofFloat2.addUpdateListener(new n6(iwVar2, 21));
                        iwVar2.f33436c.setDuration(475L);
                        iwVar2.f33436c.setInterpolator(ds.h);
                        iwVar2.f33436c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        iwVar2.f29428r = f11;
                        iwVar2.invalidate();
                        iwVar2.requestLayout();
                        iwVar2.c();
                        iwVar2.f29429s.f33435b.invalidate();
                    }
                }
            }
            View childAt3 = this.f33435b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (iwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= iwVar2.f33435b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                iwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.u6 u6Var = this.v;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.y6.o1(0.18f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var));
        }
        return org.telegram.ui.ActionBar.y6.o1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        gw gwVar = this.E;
        if (gwVar != null) {
            boolean z11 = this.f30036a0;
            if (z11 || this.f30037b0 != z10) {
                this.f30037b0 = z10;
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
                    animate.alpha(f7).setDuration(200L).setInterpolator(ds.h).withEndAction(new bh.n(27, this, z10)).start();
                }
                this.f33435b.requestLayout();
                this.f30036a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        gw gwVar = this.f30045y;
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
        this.f30041r = z10;
        this.f33435b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f33435b.getChildCount()) {
            View childAt = this.f33435b.getChildAt(i10);
            if (childAt instanceof iw) {
                iw iwVar = (iw) childAt;
                int i12 = 0;
                while (i12 < iwVar.f33435b.getChildCount()) {
                    iwVar.f33435b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final kw f26920b;

                        {
                            this.f26920b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f26920b.h(i11);
                                    return;
                                default:
                                    this.f26920b.h(i11);
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
                    public final kw f26920b;

                    {
                        this.f26920b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f26920b.h(i11);
                                return;
                            default:
                                this.f26920b.h(i11);
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
        this.f33435b.setPadding(AndroidUtilities.dp(this.f30039d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f30039d0 = f7;
    }

    public void e() {
    }

    public void i(gw gwVar) {
    }
}
