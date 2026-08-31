package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
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
public final class b61 extends org.telegram.ui.Components.sl0 {
    public int f35341c;
    public int d;
    public int h;
    public final r61 f35346s;
    public int f35342e = -1;
    public int f35343f = -1;
    public int f35344n = 1;
    public final ArrayList f35345r = new ArrayList();

    public b61(r61 r61Var) {
        this.f35346s = r61Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z4) {
        r61 r61Var = this.f35346s;
        int i10 = r61Var.T;
        boolean z10 = r61Var.F;
        ArrayList arrayList = this.f35345r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f35341c = -1;
        boolean z11 = false;
        this.f35344n = 0;
        arrayList.clear();
        ArrayList arrayList2 = r61Var.f40834x1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f35344n;
                this.f35344n = i11 + 1;
                this.f35342e = i11;
                arrayList.add(1);
            }
            this.d = this.f35344n;
            for (int i12 = 0; i12 < r61Var.f40834x1.size(); i12++) {
                this.f35344n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, r61Var.f40834x1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = r61Var.f40837y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f35344n;
                this.f35344n = i13 + 1;
                this.f35343f = i13;
                arrayList.add(2);
                this.f35341c = this.f35344n;
                for (int i14 = 0; i14 < r61Var.f40837y1.size(); i14++) {
                    this.f35344n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r61Var.f40837y1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = r61Var.f40839z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f35344n;
                    this.f35344n = i15 + 1;
                    this.f35343f = i15;
                    arrayList.add(2);
                }
                this.f35341c = this.f35344n;
                for (int i16 = 0; i16 < r61Var.f40839z1.size(); i16++) {
                    this.f35344n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r61Var.f40839z1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = r61Var.A1;
        if (arrayList5 != null) {
            int i17 = this.f35344n;
            this.h = i17;
            this.f35344n = arrayList5.size() + i17;
        }
        l();
        if (r61Var.f40828v1 && this.f35344n == 0) {
            z11 = true;
        }
        if (r61Var.D1 != z11) {
            r61Var.D1 = z11;
            ValueAnimator valueAnimator = r61Var.E1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r61Var.E1 = ofFloat;
            ofFloat.addUpdateListener(new w41(r61Var, z11, 1));
            r61Var.E1.addListener(new k51(r61Var, z11, 1));
            r61Var.E1.setInterpolator(org.telegram.ui.Components.pr.h);
            r61Var.E1.setDuration(100L);
            r61Var.E1.start();
            if (z11) {
                r61.D(r61Var.S, r61Var.f40800i0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f35344n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f35342e || i10 == this.f35343f) {
            return 6;
        }
        r61 r61Var = this.f35346s;
        if (r61Var.T == 14) {
            ArrayList arrayList = r61Var.f40837y1;
            if (arrayList != null && i10 >= (i11 = this.f35341c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f35341c;
            if (i10 > i12 && (i10 - i12) - 1 < r61Var.f40839z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = r61Var.f40834x1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (r61Var.T == 13 || ((ng.q0) r61Var.f40834x1.get((i10 - this.d) - 1)).f16179g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= r61Var.A1.size()) {
            return 4;
        }
        if (r61Var.A1.get(i10 - this.h) instanceof o61) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ng.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        r61 r61Var = this.f35346s;
        HashSet hashSet = r61Var.H;
        int i14 = r61Var.T;
        int i15 = r61Var.S;
        d51 d51Var = r61Var.f40794f0;
        int i16 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i16 == 6) {
            w51 w51Var = (w51) view;
            ArrayList arrayList = r61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) r61Var.A1.get(i10 - this.h);
                if (document2 instanceof o61) {
                    CharSequence charSequence = ((o61) document2).f39606a;
                    String str = r61Var.f40831w1;
                    w51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ue, w51Var.f42385f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w51Var.f42381a.setText(charSequence);
                    w51Var.b(false);
                }
            } else if (i10 == this.f35342e) {
                w51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                w51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                w51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            w51Var.f42383c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) r61Var.f40839z1.get((i10 - this.f35341c) - 1);
            a61 a61Var = (a61) view;
            a61Var.a(d51Var);
            a61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.k6.f21821m6, 0.2f), 0L, "tgs", document3, 0);
            a61Var.N = true;
            a61Var.d = document3;
            a61Var.f35040e = null;
        } else if (i16 == 4) {
            a61 a61Var2 = (a61) view;
            a61Var2.f35039c = i10;
            ImageReceiver imageReceiver = a61Var2.f35042n;
            ArrayList arrayList2 = r61Var.f40834x1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                q0Var = (ng.q0) r61Var.f40834x1.get(i10);
            } else {
                ArrayList arrayList3 = r61Var.f40837y1;
                if (arrayList3 != null && i10 >= (i12 = this.f35341c) && i10 - i12 < arrayList3.size()) {
                    q0Var = (ng.q0) r61Var.f40837y1.get(i10 - this.f35341c);
                } else {
                    return;
                }
            }
            if (a61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(a61Var2);
                a61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                a61Var2.h.onAttachedToWindow();
            }
            a61Var2.h.setParentView(d51Var);
            a61Var2.f35046x = q0Var;
            a61Var2.f35047y = false;
            a61Var2.d(r61Var.G.contains(q0Var), false);
            a61Var2.f35038b = false;
            a61Var2.invalidate();
            if (i14 == 13) {
                a61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f16178f));
            } else if (!q0Var.f16175b && q0Var.f16178f != null) {
                a61Var2.f35044s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f16178f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.f21821m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        a61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    } else {
                        ng.q0 q0Var2 = q0Var;
                        a61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
                } else {
                    a61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                a61Var2.f35040e = null;
                a61Var2.d = null;
                a61Var2.setDrawable(null);
                z51 z51Var = a61Var2.G;
                if (z51Var != null) {
                    z51Var.setVisibility(8);
                    a61Var2.G.setImageReceiver(null);
                }
                if (tL_availableReaction == null && q0Var.f16175b) {
                    a61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f16178f));
                }
            } else {
                a61Var2.f35044s = false;
                a61Var2.f35040e = new org.telegram.ui.Components.u5(q0Var.f16179g, (Paint.FontMetricsInt) null);
                a61Var2.d = null;
                a61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) d51Var.f41501a3.get(a61Var2.f35040e.getDocumentId());
                if (l5Var == null) {
                    cacheType2 = r61Var.getCacheType();
                    l5Var = org.telegram.ui.Components.l5.n(i15, a61Var2.f35040e.getDocumentId(), null, cacheType2);
                    d51Var.f41501a3.put(a61Var2.f35040e.getDocumentId(), l5Var);
                }
                a61Var2.setDrawable(l5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.f16175b && q0Var.d) {
                a61Var2.b();
                a61Var2.G.setVisibility(0);
                a61Var2.setEmojicon(null);
                return;
            }
            if (q0Var.f16177e) {
                a61Var2.setEmojicon(q0Var.f16178f);
            } else {
                a61Var2.setEmojicon(null);
            }
            z51 z51Var2 = a61Var2.G;
            if (z51Var2 != null) {
                z51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            a61 a61Var3 = (a61) view;
            a61Var3.f35037a = false;
            a61Var3.f35039c = i10;
            a61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            a61Var3.setDrawable(null);
            ArrayList arrayList4 = r61Var.f40834x1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                ng.q0 q0Var3 = (ng.q0) r61Var.f40834x1.get(i10);
                a61Var3.f35046x = q0Var3;
                long j10 = q0Var3.f16179g;
                if (j10 == 0) {
                    boolean contains2 = r61Var.G.contains(q0Var3);
                    a61Var3.f35047y = true;
                    a61Var3.setDrawable(Emoji.getEmojiDrawable(q0Var3.f16178f));
                    a61Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var3.f16175b && q0Var3.d) {
                    a61Var3.b();
                    a61Var3.G.setVisibility(0);
                } else {
                    z51 z51Var3 = a61Var3.G;
                    if (z51Var3 != null) {
                        z51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = r61Var.A1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) r61Var.A1.get(i10 - this.h);
                    if (!(document instanceof o61)) {
                        l10 = null;
                    }
                }
                document = null;
                l10 = null;
            }
            if (l10 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    a61Var3.f35040e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                    a61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20849id));
                } else {
                    org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                    a61Var3.f35040e = u5Var;
                    a61Var3.d = u5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) d51Var.f41501a3.get(a61Var3.f35040e.getDocumentId());
                if (l5Var2 == null) {
                    cacheType = r61Var.getCacheType();
                    l5Var2 = org.telegram.ui.Components.l5.n(i15, a61Var3.f35040e.getDocumentId(), null, cacheType);
                    d51Var.f41501a3.put(a61Var3.f35040e.getDocumentId(), l5Var2);
                }
                a61Var3.setDrawable(l5Var2);
            }
            a61Var3.d(contains, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a61Var;
        boolean z4;
        r61 r61Var = this.f35346s;
        if (i10 == 6) {
            Context context = r61Var.getContext();
            if (r61Var.T == 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            a61Var = new w51(r61Var, context, z4);
        } else if (i10 == 7) {
            a61Var = new org.telegram.ui.Components.jn(r61Var.getContext(), 22);
            a61Var.setTag("searchbox");
        } else {
            a61Var = new a61(r61Var, r61Var.getContext());
        }
        if (r61.c(r61Var)) {
            a61Var.setScaleX(0.0f);
            a61Var.setScaleY(0.0f);
        }
        return new f2.m1(a61Var);
    }
}
