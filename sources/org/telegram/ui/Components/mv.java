package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public abstract class mv extends am0 {

    public static final int[] f30750c0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};

    public static final int[] f30751d0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final iv A;
    public final iv B;
    public final kv C;
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
    public boolean O;
    public int P;
    public final int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    public int f30752a0;

    public float f30753b0;
    public final int h;

    public final boolean f30754n;

    public boolean f30755r;

    public y5 f30756s;
    public final org.telegram.ui.ActionBar.c6 v;

    public final boolean f30757w;

    public final iv f30758x;

    public final iv f30759y;

    public mv(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.f30754n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.f30755r = true;
        this.D = new HashMap();
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0;
        this.J = 0;
        this.K = true;
        this.P = 6;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        this.W = true;
        this.f30753b0 = 11.0f;
        this.f30757w = z13;
        this.v = c6Var;
        this.N = runnable;
        this.Q = i10;
        this.M = i11;
        this.L = z14;
        ev evVar = new ev(this, context, z13, z14);
        this.f26767b = evVar;
        evVar.setClipToPadding(false);
        this.f26767b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f26767b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f26767b;
            iv ivVar = new iv(this, context, R.drawable.msg_emoji_stickers, false);
            this.f30758x = ivVar;
            linearLayout.addView(ivVar);
            ivVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f26767b;
            iv ivVar2 = new iv(this, context, this.h, false);
            this.f30759y = ivVar2;
            linearLayout2.addView(ivVar2);
            ivVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            ivVar2.f29489a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f26767b;
            iv ivVar3 = new iv(this, context, i12, false);
            this.A = ivVar3;
            linearLayout3.addView(ivVar3);
            ivVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            ivVar3.setAlpha(0.0f);
            ivVar3.f29489a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i14 = 0;
            while (i14 < 8) {
                iv ivVar4 = new iv(this, context, f30750c0[i14], i14 == 0);
                ivVar4.setContentDescription(f(i14));
                this.f26767b.addView(ivVar4);
                i14++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f26767b;
            kv kvVar = new kv(this, context);
            this.C = kvVar;
            linearLayout4.addView(kvVar);
            kvVar.h = 3552126;
        }
        this.E = this.f26767b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f26767b;
            iv ivVar5 = new iv(this, context, i13, true);
            this.B = ivVar5;
            linearLayout5.addView(ivVar5);
            ivVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            ivVar5.f29489a = Long.valueOf(1434631203);
            ivVar5.setAlpha(0.0f);
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

    public boolean g(kx kxVar) {
        return kxVar.f30208f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.g6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        int i12 = 1;
        boolean z11 = z10 && !this.W;
        iv ivVar = this.f30758x;
        if (ivVar != null) {
            i10++;
        }
        if (!this.T || ivVar != null) {
            i10 = Math.max(1, i10);
        }
        int i13 = this.I;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.f26767b.getChildCount()) {
            View childAt = this.f26767b.getChildAt(i14);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                int i16 = i15;
                int i17 = 0;
                while (i17 < kvVar.f26767b.getChildCount()) {
                    View childAt2 = kvVar.f26767b.getChildAt(i17);
                    if (childAt2 instanceof iv) {
                        ((iv) childAt2).g(i10 == i16, z11);
                    }
                    i17++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof iv) {
                    ((iv) childAt).g(i10 == i15, z11);
                }
                i11 = i15;
            }
            if (i10 >= i15 && i10 <= i11) {
                this.I = i14;
            }
            i14++;
            i15 = i11 + 1;
        }
        int i18 = this.I;
        kv kvVar2 = this.C;
        if (i13 != i18) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.G;
            float f11 = this.I;
            if (z11) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.F = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new lh.ha(this, f10, f11, i12));
                this.F.setDuration(350L);
                this.F.setInterpolator(er.h);
                this.F.start();
            } else {
                this.H = 1.0f;
                this.G = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.f26767b.invalidate();
            }
            if (kvVar2 != null) {
                boolean z12 = this.I == 1 || this.f30754n;
                if (z12 != kvVar2.f30188n) {
                    kvVar2.f30188n = z12;
                    if (!z12) {
                        kvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = kvVar2.f26768c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(kvVar2.f30189r, z12 ? 1.0f : 0.0f);
                        kvVar2.f26768c = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.addUpdateListener(new e6(kvVar2, 20));
                        kvVar2.f26768c.setDuration(475L);
                        kvVar2.f26768c.setInterpolator(er.h);
                        kvVar2.f26768c.start();
                    } else {
                        kvVar2.f30189r = z12 ? 1.0f : 0.0f;
                        kvVar2.invalidate();
                        kvVar2.requestLayout();
                        kvVar2.c();
                        kvVar2.f30190s.f26767b.invalidate();
                    }
                }
            }
            View childAt3 = this.f26767b.getChildAt(this.I);
            if (this.I >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.J != i10) {
            if (kvVar2 != null && this.I == 1 && i10 >= 1 && i10 <= kvVar2.f26767b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                kvVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.J = i10;
        }
    }

    public final int k() {
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (z10) {
            return i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f);
        }
        int i10 = this.Q;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.g6.l1(0.09f, this.M) : org.telegram.ui.ActionBar.g6.l1(0.18f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var));
    }

    public final void l(boolean z10) {
        iv ivVar = this.A;
        if (ivVar != null) {
            boolean z11 = this.U;
            if (z11 || this.V != z10) {
                this.V = z10;
                if (z11) {
                    ivVar.setVisibility(z10 ? 0 : 8);
                    ivVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    ivVar.setVisibility(0);
                    ivVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(er.h).withEndAction(new fh.f(27, this, z10)).start();
                }
                this.f26767b.requestLayout();
                this.U = false;
            }
        }
    }

    public final void m(boolean z10) {
        iv ivVar = this.f30759y;
        if (ivVar == null) {
            return;
        }
        if (z10) {
            ivVar.setBackground(new lv(k()));
        } else {
            ivVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f30755r = z10;
        this.f26767b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f26767b.getChildCount()) {
            View childAt = this.f26767b.getChildAt(i10);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                int i12 = 0;
                while (i12 < kvVar.f26767b.getChildCount()) {
                    final int i13 = 0;
                    kvVar.f26767b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {

                        public final mv f27843b;

                        {
                            this.f27843b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    this.f27843b.h(i11);
                                    break;
                                default:
                                    this.f27843b.h(i11);
                                    break;
                            }
                        }
                    });
                    i12++;
                    i11++;
                }
                i11--;
            } else if (childAt != null) {
                final int i14 = 1;
                childAt.setOnClickListener(new View.OnClickListener(this) {

                    public final mv f27843b;

                    {
                        this.f27843b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.f27843b.h(i11);
                                break;
                            default:
                                this.f27843b.h(i11);
                                break;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        iv ivVar = this.B;
        if (ivVar != null) {
            ivVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f26767b.setPadding(AndroidUtilities.dp(this.f30753b0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(ArrayList arrayList) {
        int i10;
        iv ivVar;
        boolean z10;
        TLRPC.Document document;
        if (this.f30757w) {
            if (!this.W || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.W = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.f26767b.getChildCount();
                int i11 = this.E;
                int i12 = childCount - i11;
                iv ivVar2 = this.B;
                int i13 = i12 - (ivVar2 != null ? 1 : 0);
                if (i13 == 0 && arrayList.size() > 0 && this.f30752a0 != arrayList.size()) {
                    boolean z11 = this.O;
                }
                this.f30752a0 = arrayList.size();
                e();
                boolean z12 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (i14 < Math.max(arrayList.size(), i13)) {
                    iv ivVar3 = i14 < i13 ? (iv) this.f26767b.getChildAt(i14 + i11) : null;
                    kx kxVar = i14 < arrayList.size() ? (kx) arrayList.get(i14) : null;
                    if (kxVar != null) {
                        if (kxVar.f30211j == 0) {
                            boolean z13 = kxVar.f30207e;
                            Long l10 = kxVar.f30204a;
                            if (l10 != null) {
                                if (ivVar3 == null) {
                                    ivVar3 = new iv(this, getContext(), kxVar.f30204a.longValue());
                                    i(ivVar3);
                                    this.f26767b.addView(ivVar3, i11 + i14);
                                } else {
                                    ivVar3.setAnimatedEmojiDocumentId(l10.longValue());
                                }
                                i10 = i11;
                                ivVar = ivVar2;
                                z10 = z12;
                            } else {
                                i13 = i13;
                                TLRPC.StickerSet stickerSet = kxVar.f30205b;
                                ArrayList arrayList3 = kxVar.f30206c;
                                if (stickerSet == null) {
                                    i10 = i11;
                                    ivVar = ivVar2;
                                    z10 = z12;
                                } else {
                                    if (arrayList3 != null) {
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < arrayList3.size()) {
                                                document = (TLRPC.Document) arrayList3.get(i15);
                                                z10 = z12;
                                                i10 = i11;
                                                ivVar = ivVar2;
                                                if (document.f22386id != stickerSet.thumb_document_id) {
                                                    i15++;
                                                    z12 = z10;
                                                    i11 = i10;
                                                    ivVar2 = ivVar;
                                                }
                                            } else {
                                                i10 = i11;
                                                ivVar = ivVar2;
                                                z10 = z12;
                                                if (arrayList3 != null) {
                                                    if (arrayList3.size() >= 1) {
                                                        document = (TLRPC.Document) arrayList3.get(0);
                                                    }
                                                }
                                                document = null;
                                            }
                                        }
                                    } else {
                                        i10 = i11;
                                        ivVar = ivVar2;
                                        z10 = z12;
                                        if (arrayList3 != null) {
                                            if (arrayList3.size() >= 1) {
                                                document = (TLRPC.Document) arrayList3.get(0);
                                            }
                                        }
                                        document = null;
                                    }
                                    if (ivVar3 == null) {
                                        ivVar3 = new iv(this, getContext(), document);
                                        i(ivVar3);
                                        this.f26767b.addView(ivVar3, i10 + i14);
                                    } else {
                                        ivVar3.setAnimatedEmojiDocument(document);
                                    }
                                    if (document == null) {
                                        ivVar3.setStickerThumb(kxVar);
                                    }
                                }
                                document = null;
                                if (ivVar3 == null) {
                                    ivVar3 = new iv(this, getContext(), document);
                                    i(ivVar3);
                                    this.f26767b.addView(ivVar3, i10 + i14);
                                } else {
                                    ivVar3.setAnimatedEmojiDocument(document);
                                }
                                if (document == null) {
                                    ivVar3.setStickerThumb(kxVar);
                                }
                            }
                            ivVar3.f29489a = kxVar.f30210i ? Long.valueOf(439488310) : null;
                            ivVar3.g(this.I == i14, false);
                            int i16 = this.Q;
                            if (i16 == 4) {
                                ivVar3.a((z10 || z13) ? null : Boolean.TRUE);
                            } else if (i16 == 6 || i16 == 5 || i16 == 7) {
                                ivVar3.a(null);
                            } else if (!z10 && !z13) {
                                ivVar3.a(Boolean.TRUE);
                            } else if (g(kxVar)) {
                                ivVar3.a(null);
                            } else {
                                ivVar3.a(Boolean.FALSE);
                            }
                        } else if (ivVar3 == null) {
                            iv ivVar4 = new iv(this, getContext(), kxVar.f30211j, false);
                            i(ivVar4);
                            this.f26767b.addView(ivVar4, i11 + i14);
                        } else {
                            ivVar3.setDrawable(getResources().getDrawable(kxVar.f30211j).mutate());
                            ivVar3.d();
                            ivVar3.a(null);
                        }
                        i14++;
                        i13 = i13;
                        z12 = z10;
                        i11 = i10;
                        ivVar2 = ivVar;
                    } else if (ivVar3 != null) {
                        this.f26767b.removeView(ivVar3);
                    }
                    i13 = i13;
                    i10 = i11;
                    ivVar = ivVar2;
                    z10 = z12;
                    i14++;
                    i13 = i13;
                    z12 = z10;
                    i11 = i10;
                    ivVar2 = ivVar;
                }
                iv ivVar5 = ivVar2;
                if (ivVar5 != null) {
                    ivVar5.bringToFront();
                    if (ivVar5.getAlpha() < 1.0f) {
                        ivVar5.animate().alpha(1.0f).setDuration(ig.g0.d() ? 0L : 200L).setInterpolator(er.f28122f).start();
                    }
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    ((iv) arrayList2.get(i17)).getClass();
                    ((iv) arrayList2.get(i17)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.P = i10;
    }

    public void setPaddingLeft(float f10) {
        this.f30753b0 = f10;
    }

    public void e() {
    }

    public void i(iv ivVar) {
    }
}
