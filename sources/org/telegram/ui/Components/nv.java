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
public abstract class nv extends xl0 {
    public static final int[] f31182a0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f31183b0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final jv A;
    public final jv B;
    public final lv C;
    public final HashMap D;
    public final int E;
    public ValueAnimator F;
    public float G;
    public float H;
    public int I;
    public int J;
    public boolean K;
    public final boolean L;
    public final int M;
    public final Runnable N;
    public int O;
    public final int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int h;
    public final boolean f31184n;
    public boolean f31185r;
    public y5 f31186s;
    public final org.telegram.ui.ActionBar.b6 v;
    public final boolean f31187w;
    public final jv f31188x;
    public final jv f31189y;

    public nv(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i9, Runnable runnable, int i10, boolean z14) {
        super(context);
        boolean z15;
        this.h = R.drawable.msg_emoji_recent;
        int i11 = R.drawable.msg_emoji_gem;
        int i12 = R.drawable.smiles_tab_settings;
        this.f31184n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f31185r = true;
        this.D = new HashMap();
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0;
        this.J = 0;
        this.K = true;
        this.O = 6;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        this.V = true;
        this.W = 11.0f;
        this.f31187w = z13;
        this.v = b6Var;
        this.N = runnable;
        this.P = i9;
        this.M = i10;
        this.L = z14;
        fv fvVar = new fv(this, context, z13, z14);
        this.f34720b = fvVar;
        fvVar.setClipToPadding(false);
        this.f34720b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f34720b);
        if (i9 == 4) {
            LinearLayout linearLayout = this.f34720b;
            jv jvVar = new jv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f31188x = jvVar;
            linearLayout.addView(jvVar);
            jvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i9 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i9 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f34720b;
            jv jvVar2 = new jv(this, context, this.h, false);
            this.f31189y = jvVar2;
            linearLayout2.addView(jvVar2);
            jvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            jvVar2.f29845a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f34720b;
            jv jvVar3 = new jv(this, context, i11, false);
            this.A = jvVar3;
            linearLayout3.addView(jvVar3);
            jvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            jvVar3.setAlpha(0.0f);
            jvVar3.f29845a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = f31182a0[i13];
                if (i13 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                jv jvVar4 = new jv(this, context, i14, z15);
                jvVar4.setContentDescription(f(i13));
                this.f34720b.addView(jvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f34720b;
            lv lvVar = new lv(this, context);
            this.C = lvVar;
            linearLayout4.addView(lvVar);
            lvVar.h = 3552126;
        }
        this.E = this.f34720b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f34720b;
            jv jvVar5 = new jv(this, context, i12, true);
            this.B = jvVar5;
            linearLayout5.addView(jvVar5);
            jvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            jvVar5.f29845a = Long.valueOf(1434631203);
            jvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i9) {
        switch (i9) {
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

    public boolean g(jx jxVar) {
        return jxVar.f29868f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.f6.n0(this.v);
    }

    public abstract boolean h(int i9);

    public final void j(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        if (z10 && !this.V) {
            z11 = true;
        } else {
            z11 = false;
        }
        jv jvVar = this.f31188x;
        if (jvVar != null) {
            i9++;
        }
        if (!this.S || jvVar != null) {
            i9 = Math.max(1, i9);
        }
        int i11 = this.I;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f34720b.getChildCount()) {
            View childAt = this.f34720b.getChildAt(i12);
            if (childAt instanceof lv) {
                lv lvVar = (lv) childAt;
                int i14 = i13;
                int i15 = 0;
                while (i15 < lvVar.f34720b.getChildCount()) {
                    View childAt2 = lvVar.f34720b.getChildAt(i15);
                    if (childAt2 instanceof jv) {
                        jv jvVar2 = (jv) childAt2;
                        if (i9 == i14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        jvVar2.g(z14, z11);
                    }
                    i15++;
                    i14++;
                }
                i10 = i14 - 1;
            } else {
                if (childAt instanceof jv) {
                    jv jvVar3 = (jv) childAt;
                    if (i9 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jvVar3.g(z13, z11);
                }
                i10 = i13;
            }
            if (i9 >= i13 && i9 <= i10) {
                this.I = i12;
            }
            i12++;
            i13 = i10 + 1;
        }
        int i16 = this.I;
        lv lvVar2 = this.C;
        if (i11 != i16) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.G;
            float f11 = this.I;
            float f12 = 1.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new kh.ka(this, f10, f11, 1));
                this.F.setDuration(350L);
                this.F.setInterpolator(gr.h);
                this.F.start();
            } else {
                this.H = 1.0f;
                this.G = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.f34720b.invalidate();
            }
            if (lvVar2 != null) {
                if (this.I != 1 && !this.f31184n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != lvVar2.f30560n) {
                    lvVar2.f30560n = z12;
                    if (!z12) {
                        lvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = lvVar2.f34721c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f13 = lvVar2.f30561r;
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        lvVar2.f34721c = ofFloat2;
                        ofFloat2.addUpdateListener(new e6(lvVar2, 20));
                        lvVar2.f34721c.setDuration(475L);
                        lvVar2.f34721c.setInterpolator(gr.h);
                        lvVar2.f34721c.start();
                    } else {
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        lvVar2.f30561r = f12;
                        lvVar2.invalidate();
                        lvVar2.requestLayout();
                        lvVar2.c();
                        lvVar2.f30562s.f34720b.invalidate();
                    }
                }
            }
            View childAt3 = this.f34720b.getChildAt(this.I);
            if (this.I >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.J != i9) {
            if (lvVar2 != null && this.I == 1 && i9 >= 1 && i9 <= lvVar2.f34720b.getChildCount() + 1) {
                int i17 = (i9 - 1) * 36;
                lvVar2.b(AndroidUtilities.dp(i17 - 6), AndroidUtilities.dp(i17 + 24));
            }
            this.J = i9;
        }
    }

    public final int k() {
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) 12.75f);
        }
        int i9 = this.P;
        if (i9 != 5 && i9 != 7) {
            return org.telegram.ui.ActionBar.f6.l1(0.18f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var));
        }
        return org.telegram.ui.ActionBar.f6.l1(0.09f, this.M);
    }

    public final void l(boolean z10) {
        int i9;
        jv jvVar = this.A;
        if (jvVar != null) {
            boolean z11 = this.T;
            if (z11 || this.U != z10) {
                this.U = z10;
                float f10 = 0.0f;
                if (z11) {
                    if (z10) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    jvVar.setVisibility(i9);
                    if (z10) {
                        f10 = 1.0f;
                    }
                    jvVar.setAlpha(f10);
                } else {
                    jvVar.setVisibility(0);
                    ViewPropertyAnimator animate = jvVar.animate();
                    if (z10) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(gr.h).withEndAction(new eh.f(27, this, z10)).start();
                }
                this.f34720b.requestLayout();
                this.T = false;
            }
        }
    }

    public final void m(boolean z10) {
        jv jvVar = this.f31189y;
        if (jvVar == null) {
            return;
        }
        if (z10) {
            jvVar.setBackground(new mv(k()));
        } else {
            jvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f31185r = z10;
        this.f34720b.invalidate();
    }

    public final void o() {
        int i9 = 0;
        final int i10 = 0;
        while (i9 < this.f34720b.getChildCount()) {
            View childAt = this.f34720b.getChildAt(i9);
            if (childAt instanceof lv) {
                lv lvVar = (lv) childAt;
                int i11 = 0;
                while (i11 < lvVar.f34720b.getChildCount()) {
                    lvVar.f34720b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final nv f28182b;

                        {
                            this.f28182b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f28182b.h(i10);
                                    return;
                                default:
                                    this.f28182b.h(i10);
                                    return;
                            }
                        }
                    });
                    i11++;
                    i10++;
                }
                i10--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) {
                    public final nv f28182b;

                    {
                        this.f28182b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f28182b.h(i10);
                                return;
                            default:
                                this.f28182b.h(i10);
                                return;
                        }
                    }
                });
            }
            i9++;
            i10++;
        }
        jv jvVar = this.B;
        if (jvVar != null) {
            jvVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.f34720b.setPadding(AndroidUtilities.dp(this.W), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i9, i10);
    }

    public final void p(java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i9) {
        this.O = i9;
    }

    public void setPaddingLeft(float f10) {
        this.W = f10;
    }

    public void e() {
    }

    public void i(jv jvVar) {
    }
}
