package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class k51 extends org.telegram.ui.Components.yk0 {

    public int f39605c;
    public int d;
    public int h;

    public final a61 f39610s;

    public int f39606e = -1;

    public int f39607f = -1;

    public int f39608n = 1;

    public final ArrayList f39609r = new ArrayList();

    public k51(a61 a61Var) {
        this.f39610s = a61Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        a61 a61Var = this.f39610s;
        int i10 = a61Var.S;
        boolean z11 = a61Var.E;
        ArrayList arrayList = this.f39609r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f39605c = -1;
        boolean z12 = false;
        this.f39608n = 0;
        arrayList.clear();
        ArrayList arrayList2 = a61Var.f36435w1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.f39608n;
                this.f39608n = i12 + 1;
                this.f39606e = i12;
                arrayList.add(1);
            }
            this.d = this.f39608n;
            for (int i13 = 0; i13 < a61Var.f36435w1.size(); i13++) {
                this.f39608n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, a61Var.f36435w1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = a61Var.f36438x1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.f39608n;
                this.f39608n = i14 + 1;
                this.f39607f = i14;
                arrayList.add(2);
                this.f39605c = this.f39608n;
                for (int i15 = 0; i15 < a61Var.f36438x1.size(); i15++) {
                    this.f39608n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a61Var.f36438x1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = a61Var.f36441y1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.f39608n;
                    this.f39608n = i16 + 1;
                    this.f39607f = i16;
                    arrayList.add(2);
                }
                this.f39605c = this.f39608n;
                for (int i17 = 0; i17 < a61Var.f36441y1.size(); i17++) {
                    this.f39608n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a61Var.f36441y1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = a61Var.f36443z1;
        if (arrayList5 != null) {
            int i18 = this.f39608n;
            this.h = i18;
            this.f39608n = arrayList5.size() + i18;
        }
        l();
        if (a61Var.f36430u1 && this.f39608n == 0) {
            z12 = true;
        }
        if (a61Var.C1 == z12) {
            return;
        }
        a61Var.C1 = z12;
        ValueAnimator valueAnimator = a61Var.D1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        a61Var.D1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new h41(a61Var, z12, i11));
        a61Var.D1.addListener(new t41(a61Var, z12, i11));
        a61Var.D1.setInterpolator(org.telegram.ui.Components.er.h);
        a61Var.D1.setDuration(100L);
        a61Var.D1.start();
        if (z12) {
            a61.D(a61Var.R, a61Var.f36402h0);
        }
    }

    @Override
    public final int h() {
        return this.f39608n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f39606e || i10 == this.f39607f) {
            return 6;
        }
        a61 a61Var = this.f39610s;
        if (a61Var.S == 14) {
            ArrayList arrayList = a61Var.f36438x1;
            if (arrayList != null && i10 >= (i11 = this.f39605c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f39605c;
            if (i10 > i12 && (i10 - i12) - 1 < a61Var.f36441y1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = a61Var.f36435w1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (a61Var.S == 13 || ((ig.q0) a61Var.f36435w1.get((i10 - this.d) - 1)).f11413g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= a61Var.f36443z1.size()) {
            return 4;
        }
        return a61Var.f36443z1.get(i10 - this.h) instanceof x51 ? 6 : 3;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Document document;
        Long lValueOf;
        int i11;
        boolean zContains;
        int i12;
        ig.q0 q0Var;
        int i13;
        int iIndexOf;
        a61 a61Var = this.f39610s;
        HashSet hashSet = a61Var.G;
        int i14 = a61Var.S;
        int i15 = a61Var.R;
        n41 n41Var = a61Var.f36395e0;
        int i16 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i16 == 6) {
            f51 f51Var = (f51) view;
            ArrayList arrayList = a61Var.f36443z1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) a61Var.f36443z1.get(i10 - this.h);
                if (document2 instanceof x51) {
                    CharSequence charSequence = ((x51) document2).f44288a;
                    String str = a61Var.f36432v1;
                    f51Var.getClass();
                    if (charSequence != null && str != null && (iIndexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, f51Var.f37944f.V0)), iIndexOf, str.length() + iIndexOf, 33);
                        charSequence = spannableString;
                    }
                    f51Var.f37940a.setText(charSequence);
                    f51Var.b(false);
                }
            } else if (i10 == this.f39606e) {
                f51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                f51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                f51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            f51Var.f37942c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) a61Var.f36441y1.get((i10 - this.f39605c) - 1);
            j51 j51Var = (j51) view;
            j51Var.a(n41Var);
            j51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f), 0L, "tgs", document3, 0);
            j51Var.M = true;
            j51Var.d = document3;
            j51Var.f39259e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                j51 j51Var2 = (j51) view;
                j51Var2.f39256a = false;
                j51Var2.f39258c = i10;
                j51Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                j51Var2.setDrawable(null);
                ArrayList arrayList2 = a61Var.f36435w1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = a61Var.f36443z1;
                    if (arrayList3 == null || (i11 = i10 - this.h) < 0 || i11 >= arrayList3.size()) {
                        document = null;
                        lValueOf = null;
                    } else {
                        document = (TLRPC.Document) a61Var.f36443z1.get(i10 - this.h);
                        if (document instanceof x51) {
                            document = null;
                            lValueOf = null;
                        } else {
                            lValueOf = null;
                        }
                    }
                } else {
                    ig.q0 q0Var2 = (ig.q0) a61Var.f36435w1.get(i10);
                    j51Var2.f39265x = q0Var2;
                    long j10 = q0Var2.f11413g;
                    if (j10 == 0) {
                        boolean zContains2 = a61Var.F.contains(q0Var2);
                        j51Var2.f39266y = true;
                        j51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var2.f11412f));
                        j51Var2.d(zContains2, false);
                        return;
                    }
                    lValueOf = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var2.f11409b && q0Var2.d) {
                        j51Var2.b();
                        j51Var2.F.setVisibility(0);
                    } else {
                        i51 i51Var = j51Var2.F;
                        if (i51Var != null) {
                            i51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (lValueOf == null && document == null) {
                    zContains = false;
                } else {
                    if (document != null) {
                        j51Var2.f39259e = new org.telegram.ui.Components.t5(document, (Paint.FontMetricsInt) null);
                        j51Var2.d = document;
                        zContains = hashSet.contains(Long.valueOf(document.f22386id));
                    } else {
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(lValueOf.longValue(), (Paint.FontMetricsInt) null);
                        j51Var2.f39259e = t5Var;
                        j51Var2.d = t5Var.document;
                        zContains = hashSet.contains(lValueOf);
                    }
                    org.telegram.ui.Components.k5 k5VarN = (org.telegram.ui.Components.k5) n41Var.Z2.get(j51Var2.f39259e.getDocumentId());
                    if (k5VarN == null) {
                        k5VarN = org.telegram.ui.Components.k5.n(i15, j51Var2.f39259e.getDocumentId(), null, a61Var.getCacheType());
                        n41Var.Z2.put(j51Var2.f39259e.getDocumentId(), k5VarN);
                    }
                    j51Var2.setDrawable(k5VarN);
                }
                j51Var2.d(zContains, false);
                return;
            }
            return;
        }
        j51 j51Var3 = (j51) view;
        j51Var3.f39258c = i10;
        ImageReceiver imageReceiver = j51Var3.f39261n;
        ArrayList arrayList4 = a61Var.f36435w1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = a61Var.f36438x1;
            if (arrayList5 == null || i10 < (i12 = this.f39605c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                q0Var = (ig.q0) a61Var.f36438x1.get(i10 - this.f39605c);
            }
        } else {
            q0Var = (ig.q0) a61Var.f36435w1.get(i10);
        }
        if (j51Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(j51Var3);
            j51Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            j51Var3.h.onAttachedToWindow();
        }
        j51Var3.h.setParentView(n41Var);
        j51Var3.f39265x = q0Var;
        j51Var3.f39266y = false;
        j51Var3.d(a61Var.F.contains(q0Var), false);
        j51Var3.f39257b = false;
        j51Var3.invalidate();
        if (i14 == 13) {
            j51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f11412f));
        } else if (q0Var.f11409b || q0Var.f11412f == null) {
            j51Var3.f39263s = false;
            j51Var3.f39259e = new org.telegram.ui.Components.t5(q0Var.f11413g, (Paint.FontMetricsInt) null);
            j51Var3.d = null;
            j51Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.k5 k5VarN2 = (org.telegram.ui.Components.k5) n41Var.Z2.get(j51Var3.f39259e.getDocumentId());
            if (k5VarN2 == null) {
                k5VarN2 = org.telegram.ui.Components.k5.n(i15, j51Var3.f39259e.getDocumentId(), null, a61Var.getCacheType());
                n41Var.Z2.put(j51Var3.f39259e.getDocumentId(), k5VarN2);
            }
            j51Var3.setDrawable(k5VarN2);
        } else {
            j51Var3.f39263s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f11412f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
                if (LiteMode.isEnabled(8200)) {
                    ig.q0 q0Var3 = q0Var;
                    j51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var3, 0);
                    q0Var = q0Var3;
                } else {
                    j51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ig.m0.a());
            } else {
                j51Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            j51Var3.f39259e = null;
            j51Var3.d = null;
            j51Var3.setDrawable(null);
            i51 i51Var2 = j51Var3.F;
            if (i51Var2 != null) {
                i51Var2.setVisibility(8);
                j51Var3.F.setImageReceiver(null);
            }
            if (tL_availableReaction == null && q0Var.f11409b) {
                j51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f11412f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.f11409b && q0Var.d) {
            j51Var3.b();
            j51Var3.F.setVisibility(0);
            j51Var3.setEmojicon(null);
            return;
        }
        if (q0Var.f11411e) {
            j51Var3.setEmojicon(q0Var.f11412f);
        } else {
            j51Var3.setEmojicon(null);
        }
        i51 i51Var3 = j51Var3.F;
        if (i51Var3 != null) {
            i51Var3.setVisibility(4);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j51Var;
        a61 a61Var = this.f39610s;
        if (i10 == 6) {
            j51Var = new f51(a61Var, a61Var.getContext(), a61Var.S == 6);
        } else if (i10 == 7) {
            j51Var = new org.telegram.ui.Components.zm(a61Var.getContext(), 24);
            j51Var.setTag("searchbox");
        } else {
            j51Var = new j51(a61Var, a61Var.getContext());
        }
        if (a61.c(a61Var)) {
            j51Var.setScaleX(0.0f);
            j51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.lk0(j51Var);
    }
}
