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
public abstract class wv extends tm0 {
    public static final int[] f30352b0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f30353c0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final sv B;
    public final sv C;
    public final uv D;
    public final HashMap E;
    public final int F;
    public ValueAnimator G;
    public float H;
    public float I;
    public int J;
    public int K;
    public boolean L;
    public final boolean M;
    public final int N;
    public final Runnable O;
    public int P;
    public final int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f30354a0;
    public final int h;
    public final boolean f30355n;
    public boolean f30356r;
    public z5 f30357s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f30358w;
    public final sv f30359x;
    public final sv f30360y;

    public wv(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, boolean z11, boolean z12, int i10, Runnable runnable, int i11, boolean z13) {
        super(context);
        boolean z14;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f30355n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f30356r = true;
        this.E = new HashMap();
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = true;
        this.P = 6;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        this.W = true;
        this.f30354a0 = 11.0f;
        this.f30358w = z12;
        this.v = f6Var;
        this.O = runnable;
        this.Q = i10;
        this.N = i11;
        this.M = z13;
        ov ovVar = new ov(this, context, z12, z13);
        this.f28998b = ovVar;
        ovVar.setClipToPadding(false);
        this.f28998b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f28998b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f28998b;
            sv svVar = new sv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f30359x = svVar;
            linearLayout.addView(svVar);
            svVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z4) {
            LinearLayout linearLayout2 = this.f28998b;
            sv svVar2 = new sv(this, context, this.h, false);
            this.f30360y = svVar2;
            linearLayout2.addView(svVar2);
            svVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            svVar2.f28816a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.f28998b;
            sv svVar3 = new sv(this, context, i12, false);
            this.B = svVar3;
            linearLayout3.addView(svVar3);
            svVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            svVar3.setAlpha(0.0f);
            svVar3.f28816a = Long.valueOf(98352451);
        }
        if (!z12) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f30352b0[i14];
                if (i14 == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                sv svVar4 = new sv(this, context, i15, z14);
                svVar4.setContentDescription(f(i14));
                this.f28998b.addView(svVar4);
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.f28998b;
            uv uvVar = new uv(this, context);
            this.D = uvVar;
            linearLayout4.addView(uvVar);
            uvVar.h = 3552126;
        }
        this.F = this.f28998b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f28998b;
            sv svVar5 = new sv(this, context, i13, true);
            this.C = svVar5;
            linearLayout5.addView(svVar5);
            svVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            svVar5.f28816a = Long.valueOf(1434631203);
            svVar5.setAlpha(0.0f);
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

    public boolean g(vx vxVar) {
        return vxVar.f30066f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.j6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        if (z4 && !this.W) {
            z10 = true;
        } else {
            z10 = false;
        }
        sv svVar = this.f30359x;
        if (svVar != null) {
            i10++;
        }
        if (!this.T || svVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.J;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f28998b.getChildCount()) {
            View childAt = this.f28998b.getChildAt(i13);
            if (childAt instanceof uv) {
                uv uvVar = (uv) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < uvVar.f28998b.getChildCount()) {
                    View childAt2 = uvVar.f28998b.getChildAt(i16);
                    if (childAt2 instanceof sv) {
                        sv svVar2 = (sv) childAt2;
                        if (i10 == i15) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        svVar2.g(z13, z10);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof sv) {
                    sv svVar3 = (sv) childAt;
                    if (i10 == i14) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    svVar3.g(z12, z10);
                }
                i11 = i14;
            }
            if (i10 >= i14 && i10 <= i11) {
                this.J = i13;
            }
            i13++;
            i14 = i11 + 1;
        }
        int i17 = this.J;
        uv uvVar2 = this.D;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.H;
            float f11 = this.J;
            float f12 = 1.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new mv(this, f10, f11, 0));
                this.G.setDuration(350L);
                this.G.setInterpolator(mr.h);
                this.G.start();
            } else {
                this.I = 1.0f;
                this.H = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.f28998b.invalidate();
            }
            if (uvVar2 != null) {
                if (this.J != 1 && !this.f30355n) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 != uvVar2.f29298n) {
                    uvVar2.f29298n = z11;
                    if (!z11) {
                        uvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = uvVar2.f28999c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        float f13 = uvVar2.f29299r;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        uvVar2.f28999c = ofFloat2;
                        ofFloat2.addUpdateListener(new f6(uvVar2, 20));
                        uvVar2.f28999c.setDuration(475L);
                        uvVar2.f28999c.setInterpolator(mr.h);
                        uvVar2.f28999c.start();
                    } else {
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        uvVar2.f29299r = f12;
                        uvVar2.invalidate();
                        uvVar2.requestLayout();
                        uvVar2.c();
                        uvVar2.f29300s.f28998b.invalidate();
                    }
                }
            }
            View childAt3 = this.f28998b.getChildAt(this.J);
            if (this.J >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.K != i10) {
            if (uvVar2 != null && this.J == 1 && i10 >= 1 && i10 <= uvVar2.f28998b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                uvVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.K = i10;
        }
    }

    public final int k() {
        boolean z4 = this.M;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (z4) {
            return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f);
        }
        int i10 = this.Q;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.j6.l1(0.18f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
        }
        return org.telegram.ui.ActionBar.j6.l1(0.09f, this.N);
    }

    public final void l(boolean z4) {
        int i10;
        sv svVar = this.B;
        if (svVar != null) {
            boolean z10 = this.U;
            if (z10 || this.V != z4) {
                this.V = z4;
                float f10 = 0.0f;
                if (z10) {
                    if (z4) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    svVar.setVisibility(i10);
                    if (z4) {
                        f10 = 1.0f;
                    }
                    svVar.setAlpha(f10);
                } else {
                    svVar.setVisibility(0);
                    ViewPropertyAnimator animate = svVar.animate();
                    if (z4) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(mr.h).withEndAction(new jh.f(21, this, z4)).start();
                }
                this.f28998b.requestLayout();
                this.U = false;
            }
        }
    }

    public final void m(boolean z4) {
        sv svVar = this.f30360y;
        if (svVar == null) {
            return;
        }
        if (z4) {
            svVar.setBackground(new vv(k()));
        } else {
            svVar.setBackground(null);
        }
    }

    public final void n(boolean z4) {
        this.f30356r = z4;
        this.f28998b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f28998b.getChildCount()) {
            View childAt = this.f28998b.getChildAt(i10);
            if (childAt instanceof uv) {
                uv uvVar = (uv) childAt;
                int i12 = 0;
                while (i12 < uvVar.f28998b.getChildCount()) {
                    uvVar.f28998b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final wv f27389b;

                        {
                            this.f27389b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f27389b.h(i11);
                                    return;
                                default:
                                    this.f27389b.h(i11);
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
                    public final wv f27389b;

                    {
                        this.f27389b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f27389b.h(i11);
                                return;
                            default:
                                this.f27389b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        sv svVar = this.C;
        if (svVar != null) {
            svVar.setOnClickListener(new g0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28998b.setPadding(AndroidUtilities.dp(this.f30354a0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.P = i10;
    }

    public void setPaddingLeft(float f10) {
        this.f30354a0 = f10;
    }

    public void e() {
    }

    public void i(sv svVar) {
    }
}
