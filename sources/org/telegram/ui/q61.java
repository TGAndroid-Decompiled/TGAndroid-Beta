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
public final class q61 extends org.telegram.ui.Components.vl0 {
    public int f36700c;
    public int d;
    public int h;
    public final g71 f36704s;
    public int e = -1;
    public int f36701f = -1;
    public int f36702n = 1;
    public final ArrayList f36703r = new ArrayList();

    public q61(g71 g71Var) {
        this.f36704s = g71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        g71 g71Var = this.f36704s;
        int i10 = g71Var.W;
        boolean z11 = g71Var.I;
        ArrayList arrayList = this.f36703r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f36700c = -1;
        boolean z12 = false;
        this.f36702n = 0;
        arrayList.clear();
        ArrayList arrayList2 = g71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f36702n;
                this.f36702n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f36702n;
            for (int i12 = 0; i12 < g71Var.A1.size(); i12++) {
                this.f36702n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, g71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = g71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f36702n;
                this.f36702n = i13 + 1;
                this.f36701f = i13;
                arrayList.add(2);
                this.f36700c = this.f36702n;
                for (int i14 = 0; i14 < g71Var.B1.size(); i14++) {
                    this.f36702n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = g71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f36702n;
                    this.f36702n = i15 + 1;
                    this.f36701f = i15;
                    arrayList.add(2);
                }
                this.f36700c = this.f36702n;
                for (int i16 = 0; i16 < g71Var.C1.size(); i16++) {
                    this.f36702n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = g71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f36702n;
            this.h = i17;
            this.f36702n = arrayList5.size() + i17;
        }
        l();
        if (g71Var.f33767y1 && this.f36702n == 0) {
            z12 = true;
        }
        if (g71Var.G1 != z12) {
            g71Var.G1 = z12;
            ValueAnimator valueAnimator = g71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            g71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new n51(g71Var, z12, 1));
            g71Var.H1.addListener(new z51(g71Var, z12, 1));
            g71Var.H1.setInterpolator(org.telegram.ui.Components.qr.h);
            g71Var.H1.setDuration(100L);
            g71Var.H1.start();
            if (z12) {
                g71.D(g71Var.V, g71Var.f33736l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f36702n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f36701f) {
            return 6;
        }
        g71 g71Var = this.f36704s;
        if (g71Var.W == 14) {
            ArrayList arrayList = g71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f36700c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f36700c;
            if (i10 > i12 && (i10 - i12) - 1 < g71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = g71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (g71Var.W == 13 || ((zg.o0) g71Var.A1.get((i10 - this.d) - 1)).f49378g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= g71Var.D1.size()) {
            return 4;
        }
        if (g71Var.D1.get(i10 - this.h) instanceof d71) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.o0 o0Var;
        int cacheType2;
        int i13;
        int indexOf;
        g71 g71Var = this.f36704s;
        HashSet hashSet = g71Var.K;
        int i14 = g71Var.W;
        int i15 = g71Var.V;
        t51 t51Var = g71Var.f33730i0;
        int i16 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i16 == 6) {
            l61 l61Var = (l61) view;
            ArrayList arrayList = g71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) g71Var.D1.get(i10 - this.h);
                if (document2 instanceof d71) {
                    CharSequence charSequence = ((d71) document2).f32887a;
                    String str = g71Var.f33769z1;
                    l61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, l61Var.f35262f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    l61Var.f35259a.setText(charSequence);
                    l61Var.b(false);
                }
            } else if (i10 == this.e) {
                l61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                l61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                l61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            l61Var.f35261c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) g71Var.C1.get((i10 - this.f36700c) - 1);
            p61 p61Var = (p61) view;
            p61Var.a(t51Var);
            p61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.f19227m6, 0.2f), 0L, "tgs", document3, 0);
            p61Var.Q = true;
            p61Var.d = document3;
            p61Var.e = null;
        } else if (i16 == 4) {
            p61 p61Var2 = (p61) view;
            p61Var2.f36353c = i10;
            ImageReceiver imageReceiver = p61Var2.f36355n;
            ArrayList arrayList2 = g71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                o0Var = (zg.o0) g71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = g71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f36700c) && i10 - i12 < arrayList3.size()) {
                    o0Var = (zg.o0) g71Var.B1.get(i10 - this.f36700c);
                } else {
                    return;
                }
            }
            if (p61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(p61Var2);
                p61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                p61Var2.h.onAttachedToWindow();
            }
            p61Var2.h.setParentView(t51Var);
            p61Var2.f36359x = o0Var;
            p61Var2.f36360y = false;
            p61Var2.d(g71Var.J.contains(o0Var), false);
            p61Var2.f36352b = false;
            p61Var2.invalidate();
            if (i14 == 13) {
                p61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var.f49377f));
            } else if (!o0Var.f49375b && o0Var.f49377f != null) {
                p61Var2.f36357s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(o0Var.f49377f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.f19227m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        p61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                    } else {
                        zg.o0 o0Var2 = o0Var;
                        p61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                } else {
                    p61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                p61Var2.e = null;
                p61Var2.d = null;
                p61Var2.setDrawable(null);
                o61 o61Var = p61Var2.J;
                if (o61Var != null) {
                    o61Var.setVisibility(8);
                    p61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && o0Var.f49375b) {
                    p61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var.f49377f));
                }
            } else {
                p61Var2.f36357s = false;
                p61Var2.e = new org.telegram.ui.Components.z5(o0Var.f49378g, (Paint.FontMetricsInt) null);
                p61Var2.d = null;
                p61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) t51Var.f34439d3.get(p61Var2.e.getDocumentId());
                if (q5Var == null) {
                    cacheType2 = g71Var.getCacheType();
                    q5Var = org.telegram.ui.Components.q5.n(i15, p61Var2.e.getDocumentId(), null, cacheType2);
                    t51Var.f34439d3.put(p61Var2.e.getDocumentId(), q5Var);
                }
                p61Var2.setDrawable(q5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && o0Var.f49375b && o0Var.d) {
                p61Var2.b();
                p61Var2.J.setVisibility(0);
                p61Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                p61Var2.setEmojicon(o0Var.f49377f);
            } else {
                p61Var2.setEmojicon(null);
            }
            o61 o61Var2 = p61Var2.J;
            if (o61Var2 != null) {
                o61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            p61 p61Var3 = (p61) view;
            p61Var3.f36351a = false;
            p61Var3.f36353c = i10;
            p61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            p61Var3.setDrawable(null);
            ArrayList arrayList4 = g71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.o0 o0Var3 = (zg.o0) g71Var.A1.get(i10);
                p61Var3.f36359x = o0Var3;
                long j3 = o0Var3.f49378g;
                if (j3 == 0) {
                    boolean contains2 = g71Var.J.contains(o0Var3);
                    p61Var3.f36360y = true;
                    p61Var3.setDrawable(Emoji.getEmojiDrawable(o0Var3.f49377f));
                    p61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && o0Var3.f49375b && o0Var3.d) {
                    p61Var3.b();
                    p61Var3.J.setVisibility(0);
                } else {
                    o61 o61Var3 = p61Var3.J;
                    if (o61Var3 != null) {
                        o61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = g71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) g71Var.D1.get(i10 - this.h);
                    if (!(document instanceof d71)) {
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
                    p61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                    p61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f18302id));
                } else {
                    org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                    p61Var3.e = z5Var;
                    p61Var3.d = z5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) t51Var.f34439d3.get(p61Var3.e.getDocumentId());
                if (q5Var2 == null) {
                    cacheType = g71Var.getCacheType();
                    q5Var2 = org.telegram.ui.Components.q5.n(i15, p61Var3.e.getDocumentId(), null, cacheType);
                    t51Var.f34439d3.put(p61Var3.e.getDocumentId(), q5Var2);
                }
                p61Var3.setDrawable(q5Var2);
            }
            p61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View p61Var;
        boolean z10;
        g71 g71Var = this.f36704s;
        if (i10 == 6) {
            Context context = g71Var.getContext();
            if (g71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            p61Var = new l61(g71Var, context, z10);
        } else if (i10 == 7) {
            p61Var = new org.telegram.ui.Components.kn(g71Var.getContext(), 25);
            p61Var.setTag("searchbox");
        } else {
            p61Var = new p61(g71Var, g71Var.getContext());
        }
        if (g71.c(g71Var)) {
            p61Var.setScaleX(0.0f);
            p61Var.setScaleY(0.0f);
        }
        return new s4.c1(p61Var);
    }
}
