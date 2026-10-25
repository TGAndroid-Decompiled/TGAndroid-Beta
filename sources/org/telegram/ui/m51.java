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
public final class m51 extends org.telegram.ui.Components.lm0 {
    public int f41465c;
    public int d;
    public int h;
    public final c61 f41469s;
    public int e = -1;
    public int f41466f = -1;
    public int f41467n = 1;
    public final ArrayList f41468r = new ArrayList();

    public m51(c61 c61Var) {
        this.f41469s = c61Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        c61 c61Var = this.f41469s;
        int i10 = c61Var.W;
        boolean z11 = c61Var.I;
        ArrayList arrayList = this.f41468r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f41465c = -1;
        boolean z12 = false;
        this.f41467n = 0;
        arrayList.clear();
        ArrayList arrayList2 = c61Var.B1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f41467n;
                this.f41467n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f41467n;
            for (int i12 = 0; i12 < c61Var.B1.size(); i12++) {
                this.f41467n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, c61Var.B1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = c61Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f41467n;
                this.f41467n = i13 + 1;
                this.f41466f = i13;
                arrayList.add(2);
                this.f41465c = this.f41467n;
                for (int i14 = 0; i14 < c61Var.C1.size(); i14++) {
                    this.f41467n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, c61Var.C1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = c61Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f41467n;
                    this.f41467n = i15 + 1;
                    this.f41466f = i15;
                    arrayList.add(2);
                }
                this.f41465c = this.f41467n;
                for (int i16 = 0; i16 < c61Var.D1.size(); i16++) {
                    this.f41467n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, c61Var.D1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = c61Var.E1;
        if (arrayList5 != null) {
            int i17 = this.f41467n;
            this.h = i17;
            this.f41467n = arrayList5.size() + i17;
        }
        l();
        if (c61Var.f38337z1 && this.f41467n == 0) {
            z12 = true;
        }
        if (c61Var.H1 != z12) {
            c61Var.H1 = z12;
            ValueAnimator valueAnimator = c61Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            c61Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new h41(c61Var, z12, 1));
            c61Var.I1.addListener(new v41(c61Var, z12, 1));
            c61Var.I1.setInterpolator(org.telegram.ui.Components.ds.h);
            c61Var.I1.setDuration(100L);
            c61Var.I1.start();
            if (z12) {
                c61.D(c61Var.V, c61Var.f38304l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f41467n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f41466f) {
            return 6;
        }
        c61 c61Var = this.f41469s;
        if (c61Var.W == 14) {
            ArrayList arrayList = c61Var.C1;
            if (arrayList != null && i10 >= (i11 = this.f41465c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f41465c;
            if (i10 > i12 && (i10 - i12) - 1 < c61Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = c61Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (c61Var.W == 13 || ((bh.x0) c61Var.B1.get((i10 - this.d) - 1)).f4209g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= c61Var.E1.size()) {
            return 4;
        }
        if (c61Var.E1.get(i10 - this.h) instanceof z51) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        bh.x0 x0Var;
        int cacheType2;
        int i13;
        int indexOf;
        c61 c61Var = this.f41469s;
        HashSet hashSet = c61Var.K;
        int i14 = c61Var.W;
        int i15 = c61Var.V;
        p41 p41Var = c61Var.f38298i0;
        int i16 = e1Var.f47738f;
        View view = e1Var.f47735a;
        if (i16 == 6) {
            h51 h51Var = (h51) view;
            ArrayList arrayList = c61Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) c61Var.E1.get(i10 - this.h);
                if (document2 instanceof z51) {
                    CharSequence charSequence = ((z51) document2).f46178a;
                    String str = c61Var.A1;
                    h51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ue, h51Var.f39905f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    h51Var.f39902a.setText(charSequence);
                    h51Var.b(false);
                }
            } else if (i10 == this.e) {
                h51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                h51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                h51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            h51Var.f39904c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) c61Var.D1.get((i10 - this.f41465c) - 1);
            l51 l51Var = (l51) view;
            l51Var.a(p41Var);
            l51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.y6.f23518m6, 0.2f), 0L, "tgs", document3, 0);
            l51Var.Q = true;
            l51Var.d = document3;
            l51Var.e = null;
        } else if (i16 == 4) {
            l51 l51Var2 = (l51) view;
            l51Var2.f41140c = i10;
            ImageReceiver imageReceiver = l51Var2.f41142n;
            ArrayList arrayList2 = c61Var.B1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                x0Var = (bh.x0) c61Var.B1.get(i10);
            } else {
                ArrayList arrayList3 = c61Var.C1;
                if (arrayList3 != null && i10 >= (i12 = this.f41465c) && i10 - i12 < arrayList3.size()) {
                    x0Var = (bh.x0) c61Var.C1.get(i10 - this.f41465c);
                } else {
                    return;
                }
            }
            if (l51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(l51Var2);
                l51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                l51Var2.h.onAttachedToWindow();
            }
            l51Var2.h.setParentView(p41Var);
            l51Var2.f41146x = x0Var;
            l51Var2.f41147y = false;
            l51Var2.d(c61Var.J.contains(x0Var), false);
            l51Var2.f41139b = false;
            l51Var2.invalidate();
            if (i14 == 13) {
                l51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var.f4208f));
            } else if (!x0Var.f4206b && x0Var.f4208f != null) {
                l51Var2.f41144s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(x0Var.f4208f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.y6.f23518m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        l51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                    } else {
                        bh.x0 x0Var2 = x0Var;
                        l51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", x0Var2, 0);
                        x0Var = x0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
                } else {
                    l51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                l51Var2.e = null;
                l51Var2.d = null;
                l51Var2.setDrawable(null);
                k51 k51Var = l51Var2.J;
                if (k51Var != null) {
                    k51Var.setVisibility(8);
                    l51Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && x0Var.f4206b) {
                    l51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var.f4208f));
                }
            } else {
                l51Var2.f41144s = false;
                l51Var2.e = new org.telegram.ui.Components.c6(x0Var.f4209g, (Paint.FontMetricsInt) null);
                l51Var2.d = null;
                l51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) p41Var.f39001l3.get(l51Var2.e.getDocumentId());
                if (t5Var == null) {
                    cacheType2 = c61Var.getCacheType();
                    t5Var = org.telegram.ui.Components.t5.n(i15, l51Var2.e.getDocumentId(), null, cacheType2);
                    p41Var.f39001l3.put(l51Var2.e.getDocumentId(), t5Var);
                }
                l51Var2.setDrawable(t5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && x0Var.f4206b && x0Var.d) {
                l51Var2.b();
                l51Var2.J.setVisibility(0);
                l51Var2.setEmojicon(null);
                return;
            }
            if (x0Var.e) {
                l51Var2.setEmojicon(x0Var.f4208f);
            } else {
                l51Var2.setEmojicon(null);
            }
            k51 k51Var2 = l51Var2.J;
            if (k51Var2 != null) {
                k51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            l51 l51Var3 = (l51) view;
            l51Var3.f41138a = false;
            l51Var3.f41140c = i10;
            l51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            l51Var3.setDrawable(null);
            ArrayList arrayList4 = c61Var.B1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                bh.x0 x0Var3 = (bh.x0) c61Var.B1.get(i10);
                l51Var3.f41146x = x0Var3;
                long j10 = x0Var3.f4209g;
                if (j10 == 0) {
                    boolean contains2 = c61Var.J.contains(x0Var3);
                    l51Var3.f41147y = true;
                    l51Var3.setDrawable(Emoji.getEmojiDrawable(x0Var3.f4208f));
                    l51Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && x0Var3.f4206b && x0Var3.d) {
                    l51Var3.b();
                    l51Var3.J.setVisibility(0);
                } else {
                    k51 k51Var3 = l51Var3.J;
                    if (k51Var3 != null) {
                        k51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = c61Var.E1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) c61Var.E1.get(i10 - this.h);
                    if (!(document instanceof z51)) {
                        l4 = null;
                    }
                }
                document = null;
                l4 = null;
            }
            if (l4 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    l51Var3.e = new org.telegram.ui.Components.c6(document, (Paint.FontMetricsInt) null);
                    l51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f22033id));
                } else {
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(l4.longValue(), (Paint.FontMetricsInt) null);
                    l51Var3.e = c6Var;
                    l51Var3.d = c6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) p41Var.f39001l3.get(l51Var3.e.getDocumentId());
                if (t5Var2 == null) {
                    cacheType = c61Var.getCacheType();
                    t5Var2 = org.telegram.ui.Components.t5.n(i15, l51Var3.e.getDocumentId(), null, cacheType);
                    p41Var.f39001l3.put(l51Var3.e.getDocumentId(), t5Var2);
                }
                l51Var3.setDrawable(t5Var2);
            }
            l51Var3.d(contains, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View l51Var;
        boolean z10;
        c61 c61Var = this.f41469s;
        if (i10 == 6) {
            Context context = c61Var.getContext();
            if (c61Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            l51Var = new h51(c61Var, context, z10);
        } else if (i10 == 7) {
            l51Var = new org.telegram.ui.Components.vn(c61Var.getContext(), 25);
            l51Var.setTag("searchbox");
        } else {
            l51Var = new l51(c61Var, c61Var.getContext());
        }
        if (c61.c(c61Var)) {
            l51Var.setScaleX(0.0f);
            l51Var.setScaleY(0.0f);
        }
        return new s4.e1(l51Var);
    }
}
