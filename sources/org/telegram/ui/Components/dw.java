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
public abstract class dw extends ym0 {
    public static final int[] f23738e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f23739f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final zv E;
    public final zv F;
    public final bw G;
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
    public boolean f23740a0;
    public boolean f23741b0;
    public boolean f23742c0;
    public float f23743d0;
    public final int h;
    public final boolean f23744n;
    public boolean f23745r;
    public e6 f23746s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f23747w;
    public final zv f23748x;
    public final zv f23749y;

    public dw(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f23744n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f23745r = true;
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
        this.f23740a0 = true;
        this.f23741b0 = false;
        this.f23742c0 = true;
        this.f23743d0 = 11.0f;
        this.f23747w = z13;
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        vv vvVar = new vv(this, context, z13, z14);
        this.f30651b = vvVar;
        vvVar.setClipToPadding(false);
        this.f30651b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f30651b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f30651b;
            zv zvVar = new zv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f23748x = zvVar;
            linearLayout.addView(zvVar);
            zvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f30651b;
            zv zvVar2 = new zv(this, context, this.h, false);
            this.f23749y = zvVar2;
            linearLayout2.addView(zvVar2);
            zvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            zvVar2.f30998a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f30651b;
            zv zvVar3 = new zv(this, context, i12, false);
            this.E = zvVar3;
            linearLayout3.addView(zvVar3);
            zvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            zvVar3.setAlpha(0.0f);
            zvVar3.f30998a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f23738e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zv zvVar4 = new zv(this, context, i15, z15);
                zvVar4.setContentDescription(f(i14));
                this.f30651b.addView(zvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f30651b;
            bw bwVar = new bw(this, context);
            this.G = bwVar;
            linearLayout4.addView(bwVar);
            bwVar.h = 3552126;
        }
        this.I = this.f30651b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f30651b;
            zv zvVar5 = new zv(this, context, i13, true);
            this.F = zvVar5;
            linearLayout5.addView(zvVar5);
            zvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            zvVar5.f30998a = Long.valueOf(1434631203);
            zvVar5.setAlpha(0.0f);
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

    public boolean g(yx yxVar) {
        return yxVar.f30718f;
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
        if (z10 && !this.f23742c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zv zvVar = this.f23748x;
        if (zvVar != null) {
            i10++;
        }
        if (!this.W || zvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f30651b.getChildCount()) {
            View childAt = this.f30651b.getChildAt(i13);
            if (childAt instanceof bw) {
                bw bwVar = (bw) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < bwVar.f30651b.getChildCount()) {
                    View childAt2 = bwVar.f30651b.getChildAt(i16);
                    if (childAt2 instanceof zv) {
                        zv zvVar2 = (zv) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zvVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof zv) {
                    zv zvVar3 = (zv) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zvVar3.g(z13, z11);
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
        bw bwVar2 = this.G;
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
                this.J.setInterpolator(rr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f30651b.invalidate();
            }
            if (bwVar2 != null) {
                if (this.M != 1 && !this.f23744n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != bwVar2.f23109n) {
                    bwVar2.f23109n = z12;
                    if (!z12) {
                        bwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = bwVar2.f30652c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = bwVar2.f23110r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        bwVar2.f30652c = ofFloat2;
                        ofFloat2.addUpdateListener(new k6(bwVar2, 20));
                        bwVar2.f30652c.setDuration(475L);
                        bwVar2.f30652c.setInterpolator(rr.h);
                        bwVar2.f30652c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        bwVar2.f23110r = f11;
                        bwVar2.invalidate();
                        bwVar2.requestLayout();
                        bwVar2.c();
                        bwVar2.f23111s.f30651b.invalidate();
                    }
                }
            }
            View childAt3 = this.f30651b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (bwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= bwVar2.f30651b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                bwVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
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
        zv zvVar = this.E;
        if (zvVar != null) {
            boolean z11 = this.f23740a0;
            if (z11 || this.f23741b0 != z10) {
                this.f23741b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    zvVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    zvVar.setAlpha(f7);
                } else {
                    zvVar.setVisibility(0);
                    ViewPropertyAnimator animate = zvVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(rr.h).withEndAction(new bi.f(23, this, z10)).start();
                }
                this.f30651b.requestLayout();
                this.f23740a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        zv zvVar = this.f23749y;
        if (zvVar == null) {
            return;
        }
        if (z10) {
            zvVar.setBackground(new cw(k()));
        } else {
            zvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f23745r = z10;
        this.f30651b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f30651b.getChildCount()) {
            View childAt = this.f30651b.getChildAt(i10);
            if (childAt instanceof bw) {
                bw bwVar = (bw) childAt;
                int i12 = 0;
                while (i12 < bwVar.f30651b.getChildCount()) {
                    bwVar.f30651b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final dw f28931b;

                        {
                            this.f28931b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f28931b.h(i11);
                                    return;
                                default:
                                    this.f28931b.h(i11);
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
                    public final dw f28931b;

                    {
                        this.f28931b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f28931b.h(i11);
                                return;
                            default:
                                this.f28931b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        zv zvVar = this.F;
        if (zvVar != null) {
            zvVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30651b.setPadding(AndroidUtilities.dp(this.f23743d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f23743d0 = f7;
    }

    public void e() {
    }

    public void i(zv zvVar) {
    }
}
