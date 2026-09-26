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
public final class k61 extends org.telegram.ui.Components.wl0 {
    public int f34949c;
    public int d;
    public int h;
    public final a71 f34953s;
    public int e = -1;
    public int f34950f = -1;
    public int f34951n = 1;
    public final ArrayList f34952r = new ArrayList();

    public k61(a71 a71Var) {
        this.f34953s = a71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        a71 a71Var = this.f34953s;
        int i10 = a71Var.W;
        boolean z11 = a71Var.I;
        ArrayList arrayList = this.f34952r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f34949c = -1;
        boolean z12 = false;
        this.f34951n = 0;
        arrayList.clear();
        ArrayList arrayList2 = a71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f34951n;
                this.f34951n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f34951n;
            for (int i12 = 0; i12 < a71Var.A1.size(); i12++) {
                this.f34951n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, a71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = a71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f34951n;
                this.f34951n = i13 + 1;
                this.f34950f = i13;
                arrayList.add(2);
                this.f34949c = this.f34951n;
                for (int i14 = 0; i14 < a71Var.B1.size(); i14++) {
                    this.f34951n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = a71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f34951n;
                    this.f34951n = i15 + 1;
                    this.f34950f = i15;
                    arrayList.add(2);
                }
                this.f34949c = this.f34951n;
                for (int i16 = 0; i16 < a71Var.C1.size(); i16++) {
                    this.f34951n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, a71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = a71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f34951n;
            this.h = i17;
            this.f34951n = arrayList5.size() + i17;
        }
        l();
        if (a71Var.f32065y1 && this.f34951n == 0) {
            z12 = true;
        }
        if (a71Var.G1 != z12) {
            a71Var.G1 = z12;
            ValueAnimator valueAnimator = a71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            a71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new g51(a71Var, z12, 1));
            a71Var.H1.addListener(new t51(a71Var, z12, 1));
            a71Var.H1.setInterpolator(org.telegram.ui.Components.sr.h);
            a71Var.H1.setDuration(100L);
            a71Var.H1.start();
            if (z12) {
                a71.D(a71Var.V, a71Var.f32034l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f34951n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f34950f) {
            return 6;
        }
        a71 a71Var = this.f34953s;
        if (a71Var.W == 14) {
            ArrayList arrayList = a71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f34949c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f34949c;
            if (i10 > i12 && (i10 - i12) - 1 < a71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = a71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (a71Var.W == 13 || ((zg.o0) a71Var.A1.get((i10 - this.d) - 1)).f49396g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= a71Var.D1.size()) {
            return 4;
        }
        if (a71Var.D1.get(i10 - this.h) instanceof x61) {
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
        a71 a71Var = this.f34953s;
        HashSet hashSet = a71Var.K;
        int i14 = a71Var.W;
        int i15 = a71Var.V;
        n51 n51Var = a71Var.f32028i0;
        int i16 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i16 == 6) {
            f61 f61Var = (f61) view;
            ArrayList arrayList = a71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) a71Var.D1.get(i10 - this.h);
                if (document2 instanceof x61) {
                    CharSequence charSequence = ((x61) document2).f39848a;
                    String str = a71Var.f32067z1;
                    f61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ue, f61Var.f33562f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    f61Var.f33559a.setText(charSequence);
                    f61Var.b(false);
                }
            } else if (i10 == this.e) {
                f61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                f61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                f61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            f61Var.f33561c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) a71Var.C1.get((i10 - this.f34949c) - 1);
            j61 j61Var = (j61) view;
            j61Var.a(n51Var);
            j61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.f19223m6, 0.2f), 0L, "tgs", document3, 0);
            j61Var.Q = true;
            j61Var.d = document3;
            j61Var.e = null;
        } else if (i16 == 4) {
            j61 j61Var2 = (j61) view;
            j61Var2.f34663c = i10;
            ImageReceiver imageReceiver = j61Var2.f34665n;
            ArrayList arrayList2 = a71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                o0Var = (zg.o0) a71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = a71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f34949c) && i10 - i12 < arrayList3.size()) {
                    o0Var = (zg.o0) a71Var.B1.get(i10 - this.f34949c);
                } else {
                    return;
                }
            }
            if (j61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(j61Var2);
                j61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                j61Var2.h.onAttachedToWindow();
            }
            j61Var2.h.setParentView(n51Var);
            j61Var2.f34669x = o0Var;
            j61Var2.f34670y = false;
            j61Var2.d(a71Var.J.contains(o0Var), false);
            j61Var2.f34662b = false;
            j61Var2.invalidate();
            if (i14 == 13) {
                j61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var.f49395f));
            } else if (!o0Var.f49393b && o0Var.f49395f != null) {
                j61Var2.f34667s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(o0Var.f49395f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.f19223m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        j61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                    } else {
                        zg.o0 o0Var2 = o0Var;
                        j61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                } else {
                    j61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                j61Var2.e = null;
                j61Var2.d = null;
                j61Var2.setDrawable(null);
                i61 i61Var = j61Var2.J;
                if (i61Var != null) {
                    i61Var.setVisibility(8);
                    j61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && o0Var.f49393b) {
                    j61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var.f49395f));
                }
            } else {
                j61Var2.f34667s = false;
                j61Var2.e = new org.telegram.ui.Components.z5(o0Var.f49396g, (Paint.FontMetricsInt) null);
                j61Var2.d = null;
                j61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) n51Var.f32583d3.get(j61Var2.e.getDocumentId());
                if (q5Var == null) {
                    cacheType2 = a71Var.getCacheType();
                    q5Var = org.telegram.ui.Components.q5.n(i15, j61Var2.e.getDocumentId(), null, cacheType2);
                    n51Var.f32583d3.put(j61Var2.e.getDocumentId(), q5Var);
                }
                j61Var2.setDrawable(q5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && o0Var.f49393b && o0Var.d) {
                j61Var2.b();
                j61Var2.J.setVisibility(0);
                j61Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                j61Var2.setEmojicon(o0Var.f49395f);
            } else {
                j61Var2.setEmojicon(null);
            }
            i61 i61Var2 = j61Var2.J;
            if (i61Var2 != null) {
                i61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            j61 j61Var3 = (j61) view;
            j61Var3.f34661a = false;
            j61Var3.f34663c = i10;
            j61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            j61Var3.setDrawable(null);
            ArrayList arrayList4 = a71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.o0 o0Var3 = (zg.o0) a71Var.A1.get(i10);
                j61Var3.f34669x = o0Var3;
                long j3 = o0Var3.f49396g;
                if (j3 == 0) {
                    boolean contains2 = a71Var.J.contains(o0Var3);
                    j61Var3.f34670y = true;
                    j61Var3.setDrawable(Emoji.getEmojiDrawable(o0Var3.f49395f));
                    j61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && o0Var3.f49393b && o0Var3.d) {
                    j61Var3.b();
                    j61Var3.J.setVisibility(0);
                } else {
                    i61 i61Var3 = j61Var3.J;
                    if (i61Var3 != null) {
                        i61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = a71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) a71Var.D1.get(i10 - this.h);
                    if (!(document instanceof x61)) {
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
                    j61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                    j61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f18341id));
                } else {
                    org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                    j61Var3.e = z5Var;
                    j61Var3.d = z5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) n51Var.f32583d3.get(j61Var3.e.getDocumentId());
                if (q5Var2 == null) {
                    cacheType = a71Var.getCacheType();
                    q5Var2 = org.telegram.ui.Components.q5.n(i15, j61Var3.e.getDocumentId(), null, cacheType);
                    n51Var.f32583d3.put(j61Var3.e.getDocumentId(), q5Var2);
                }
                j61Var3.setDrawable(q5Var2);
            }
            j61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View j61Var;
        boolean z10;
        a71 a71Var = this.f34953s;
        if (i10 == 6) {
            Context context = a71Var.getContext();
            if (a71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            j61Var = new f61(a71Var, context, z10);
        } else if (i10 == 7) {
            j61Var = new org.telegram.ui.Components.mn(a71Var.getContext(), 25);
            j61Var.setTag("searchbox");
        } else {
            j61Var = new j61(a71Var, a71Var.getContext());
        }
        if (a71.c(a71Var)) {
            j61Var.setScaleX(0.0f);
            j61Var.setScaleY(0.0f);
        }
        return new s4.c1(j61Var);
    }
}
