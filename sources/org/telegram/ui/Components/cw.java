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
public abstract class cw extends nm0 {
    public static final int[] f23134e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f23135f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final yv E;
    public final yv F;
    public final aw G;
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
    public boolean f23136a0;
    public boolean f23137b0;
    public boolean f23138c0;
    public float f23139d0;
    public final int h;
    public final boolean f23140n;
    public boolean f23141r;
    public c6 f23142s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f23143w;
    public final yv f23144x;
    public final yv f23145y;

    public cw(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f23140n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f23141r = true;
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
        this.f23136a0 = true;
        this.f23137b0 = false;
        this.f23138c0 = true;
        this.f23139d0 = 11.0f;
        this.f23143w = z13;
        this.v = f6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        uv uvVar = new uv(this, context, z13, z14);
        this.f26502b = uvVar;
        uvVar.setClipToPadding(false);
        this.f26502b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f26502b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f26502b;
            yv yvVar = new yv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f23144x = yvVar;
            linearLayout.addView(yvVar);
            yvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f26502b;
            yv yvVar2 = new yv(this, context, this.h, false);
            this.f23145y = yvVar2;
            linearLayout2.addView(yvVar2);
            yvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            yvVar2.f30328a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f26502b;
            yv yvVar3 = new yv(this, context, i12, false);
            this.E = yvVar3;
            linearLayout3.addView(yvVar3);
            yvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            yvVar3.setAlpha(0.0f);
            yvVar3.f30328a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = f23134e0[i14];
                if (i14 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                yv yvVar4 = new yv(this, context, i15, z15);
                yvVar4.setContentDescription(f(i14));
                this.f26502b.addView(yvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f26502b;
            aw awVar = new aw(this, context);
            this.G = awVar;
            linearLayout4.addView(awVar);
            awVar.h = 3552126;
        }
        this.I = this.f26502b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f26502b;
            yv yvVar5 = new yv(this, context, i13, true);
            this.F = yvVar5;
            linearLayout5.addView(yvVar5);
            yvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            yvVar5.f30328a = Long.valueOf(1434631203);
            yvVar5.setAlpha(0.0f);
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

    public boolean g(wx wxVar) {
        return wxVar.f29761f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.j6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f23138c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yv yvVar = this.f23144x;
        if (yvVar != null) {
            i10++;
        }
        if (!this.W || yvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f26502b.getChildCount()) {
            View childAt = this.f26502b.getChildAt(i13);
            if (childAt instanceof aw) {
                aw awVar = (aw) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < awVar.f26502b.getChildCount()) {
                    View childAt2 = awVar.f26502b.getChildAt(i16);
                    if (childAt2 instanceof yv) {
                        yv yvVar2 = (yv) childAt2;
                        if (i10 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        yvVar2.g(z14, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof yv) {
                    yv yvVar3 = (yv) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    yvVar3.g(z13, z11);
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
        aw awVar2 = this.G;
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
                ofFloat.addUpdateListener(new ci.bb(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(qr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.f26502b.invalidate();
            }
            if (awVar2 != null) {
                if (this.M != 1 && !this.f23140n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != awVar2.f22492n) {
                    awVar2.f22492n = z12;
                    if (!z12) {
                        awVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = awVar2.f26503c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = awVar2.f22493r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        awVar2.f26503c = ofFloat2;
                        ofFloat2.addUpdateListener(new i6(awVar2, 20));
                        awVar2.f26503c.setDuration(475L);
                        awVar2.f26503c.setInterpolator(qr.h);
                        awVar2.f26503c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        awVar2.f22493r = f11;
                        awVar2.invalidate();
                        awVar2.requestLayout();
                        awVar2.c();
                        awVar2.f22494s.f26502b.invalidate();
                    }
                }
            }
            View childAt3 = this.f26502b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (awVar2 != null && this.M == 1 && i10 >= 1 && i10 <= awVar2.f26502b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                awVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.j6.l1(0.18f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
        }
        return org.telegram.ui.ActionBar.j6.l1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        yv yvVar = this.E;
        if (yvVar != null) {
            boolean z11 = this.f23136a0;
            if (z11 || this.f23137b0 != z10) {
                this.f23137b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    yvVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    yvVar.setAlpha(f7);
                } else {
                    yvVar.setVisibility(0);
                    ViewPropertyAnimator animate = yvVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(qr.h).withEndAction(new bi.f(22, this, z10)).start();
                }
                this.f26502b.requestLayout();
                this.f23136a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        yv yvVar = this.f23145y;
        if (yvVar == null) {
            return;
        }
        if (z10) {
            yvVar.setBackground(new bw(k()));
        } else {
            yvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f23141r = z10;
        this.f26502b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f26502b.getChildCount()) {
            View childAt = this.f26502b.getChildAt(i10);
            if (childAt instanceof aw) {
                aw awVar = (aw) childAt;
                int i12 = 0;
                while (i12 < awVar.f26502b.getChildCount()) {
                    awVar.f26502b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final cw f28210b;

                        {
                            this.f28210b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f28210b.h(i11);
                                    return;
                                default:
                                    this.f28210b.h(i11);
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
                    public final cw f28210b;

                    {
                        this.f28210b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f28210b.h(i11);
                                return;
                            default:
                                this.f28210b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        yv yvVar = this.F;
        if (yvVar != null) {
            yvVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f26502b.setPadding(AndroidUtilities.dp(this.f23139d0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cw.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f23139d0 = f7;
    }

    public void e() {
    }

    public void i(yv yvVar) {
    }
}
