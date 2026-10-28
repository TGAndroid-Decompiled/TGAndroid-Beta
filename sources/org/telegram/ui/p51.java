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
public final class p51 extends org.telegram.ui.Components.mm0 {
    public int f42308c;
    public int d;
    public int h;
    public final f61 f42312s;
    public int e = -1;
    public int f42309f = -1;
    public int f42310n = 1;
    public final ArrayList f42311r = new ArrayList();

    public p51(f61 f61Var) {
        this.f42312s = f61Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        f61 f61Var = this.f42312s;
        int i10 = f61Var.W;
        boolean z11 = f61Var.I;
        ArrayList arrayList = this.f42311r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f42308c = -1;
        boolean z12 = false;
        this.f42310n = 0;
        arrayList.clear();
        ArrayList arrayList2 = f61Var.B1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f42310n;
                this.f42310n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f42310n;
            for (int i12 = 0; i12 < f61Var.B1.size(); i12++) {
                this.f42310n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, f61Var.B1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = f61Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f42310n;
                this.f42310n = i13 + 1;
                this.f42309f = i13;
                arrayList.add(2);
                this.f42308c = this.f42310n;
                for (int i14 = 0; i14 < f61Var.C1.size(); i14++) {
                    this.f42310n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, f61Var.C1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = f61Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f42310n;
                    this.f42310n = i15 + 1;
                    this.f42309f = i15;
                    arrayList.add(2);
                }
                this.f42308c = this.f42310n;
                for (int i16 = 0; i16 < f61Var.D1.size(); i16++) {
                    this.f42310n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, f61Var.D1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = f61Var.E1;
        if (arrayList5 != null) {
            int i17 = this.f42310n;
            this.h = i17;
            this.f42310n = arrayList5.size() + i17;
        }
        l();
        if (f61Var.f39243z1 && this.f42310n == 0) {
            z12 = true;
        }
        if (f61Var.H1 != z12) {
            f61Var.H1 = z12;
            ValueAnimator valueAnimator = f61Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            f61Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new k41(f61Var, z12, 1));
            f61Var.I1.addListener(new y41(f61Var, z12, 1));
            f61Var.I1.setInterpolator(org.telegram.ui.Components.ds.h);
            f61Var.I1.setDuration(100L);
            f61Var.I1.start();
            if (z12) {
                f61.D(f61Var.V, f61Var.f39210l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f42310n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f42309f) {
            return 6;
        }
        f61 f61Var = this.f42312s;
        if (f61Var.W == 14) {
            ArrayList arrayList = f61Var.C1;
            if (arrayList != null && i10 >= (i11 = this.f42308c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f42308c;
            if (i10 > i12 && (i10 - i12) - 1 < f61Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = f61Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (f61Var.W == 13 || ((bh.x0) f61Var.B1.get((i10 - this.d) - 1)).f4209g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= f61Var.E1.size()) {
            return 4;
        }
        if (f61Var.E1.get(i10 - this.h) instanceof c61) {
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
        f61 f61Var = this.f42312s;
        HashSet hashSet = f61Var.K;
        int i14 = f61Var.W;
        int i15 = f61Var.V;
        s41 s41Var = f61Var.f39204i0;
        int i16 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i16 == 6) {
            k51 k51Var = (k51) view;
            ArrayList arrayList = f61Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) f61Var.E1.get(i10 - this.h);
                if (document2 instanceof c61) {
                    CharSequence charSequence = ((c61) document2).f38183a;
                    String str = f61Var.A1;
                    k51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ue, k51Var.f40665f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    k51Var.f40662a.setText(charSequence);
                    k51Var.b(false);
                }
            } else if (i10 == this.e) {
                k51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                k51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                k51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            k51Var.f40664c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) f61Var.D1.get((i10 - this.f42308c) - 1);
            o51 o51Var = (o51) view;
            o51Var.a(s41Var);
            o51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f), 0L, "tgs", document3, 0);
            o51Var.Q = true;
            o51Var.d = document3;
            o51Var.e = null;
        } else if (i16 == 4) {
            o51 o51Var2 = (o51) view;
            o51Var2.f41976c = i10;
            ImageReceiver imageReceiver = o51Var2.f41978n;
            ArrayList arrayList2 = f61Var.B1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                x0Var = (bh.x0) f61Var.B1.get(i10);
            } else {
                ArrayList arrayList3 = f61Var.C1;
                if (arrayList3 != null && i10 >= (i12 = this.f42308c) && i10 - i12 < arrayList3.size()) {
                    x0Var = (bh.x0) f61Var.C1.get(i10 - this.f42308c);
                } else {
                    return;
                }
            }
            if (o51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(o51Var2);
                o51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                o51Var2.h.onAttachedToWindow();
            }
            o51Var2.h.setParentView(s41Var);
            o51Var2.f41982x = x0Var;
            o51Var2.f41983y = false;
            o51Var2.d(f61Var.J.contains(x0Var), false);
            o51Var2.f41975b = false;
            o51Var2.invalidate();
            if (i14 == 13) {
                o51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var.f4208f));
            } else if (!x0Var.f4206b && x0Var.f4208f != null) {
                o51Var2.f41980s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(x0Var.f4208f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        o51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", x0Var, 0);
                    } else {
                        bh.x0 x0Var2 = x0Var;
                        o51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", x0Var2, 0);
                        x0Var = x0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), bh.s0.a());
                } else {
                    o51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                o51Var2.e = null;
                o51Var2.d = null;
                o51Var2.setDrawable(null);
                n51 n51Var = o51Var2.J;
                if (n51Var != null) {
                    n51Var.setVisibility(8);
                    o51Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && x0Var.f4206b) {
                    o51Var2.setDrawable(Emoji.getEmojiDrawable(x0Var.f4208f));
                }
            } else {
                o51Var2.f41980s = false;
                o51Var2.e = new org.telegram.ui.Components.c6(x0Var.f4209g, (Paint.FontMetricsInt) null);
                o51Var2.d = null;
                o51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) s41Var.f39791l3.get(o51Var2.e.getDocumentId());
                if (t5Var == null) {
                    cacheType2 = f61Var.getCacheType();
                    t5Var = org.telegram.ui.Components.t5.n(i15, o51Var2.e.getDocumentId(), null, cacheType2);
                    s41Var.f39791l3.put(o51Var2.e.getDocumentId(), t5Var);
                }
                o51Var2.setDrawable(t5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && x0Var.f4206b && x0Var.d) {
                o51Var2.b();
                o51Var2.J.setVisibility(0);
                o51Var2.setEmojicon(null);
                return;
            }
            if (x0Var.e) {
                o51Var2.setEmojicon(x0Var.f4208f);
            } else {
                o51Var2.setEmojicon(null);
            }
            n51 n51Var2 = o51Var2.J;
            if (n51Var2 != null) {
                n51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            o51 o51Var3 = (o51) view;
            o51Var3.f41974a = false;
            o51Var3.f41976c = i10;
            o51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            o51Var3.setDrawable(null);
            ArrayList arrayList4 = f61Var.B1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                bh.x0 x0Var3 = (bh.x0) f61Var.B1.get(i10);
                o51Var3.f41982x = x0Var3;
                long j10 = x0Var3.f4209g;
                if (j10 == 0) {
                    boolean contains2 = f61Var.J.contains(x0Var3);
                    o51Var3.f41983y = true;
                    o51Var3.setDrawable(Emoji.getEmojiDrawable(x0Var3.f4208f));
                    o51Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && x0Var3.f4206b && x0Var3.d) {
                    o51Var3.b();
                    o51Var3.J.setVisibility(0);
                } else {
                    n51 n51Var3 = o51Var3.J;
                    if (n51Var3 != null) {
                        n51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = f61Var.E1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) f61Var.E1.get(i10 - this.h);
                    if (!(document instanceof c61)) {
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
                    o51Var3.e = new org.telegram.ui.Components.c6(document, (Paint.FontMetricsInt) null);
                    o51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f22034id));
                } else {
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(l4.longValue(), (Paint.FontMetricsInt) null);
                    o51Var3.e = c6Var;
                    o51Var3.d = c6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) s41Var.f39791l3.get(o51Var3.e.getDocumentId());
                if (t5Var2 == null) {
                    cacheType = f61Var.getCacheType();
                    t5Var2 = org.telegram.ui.Components.t5.n(i15, o51Var3.e.getDocumentId(), null, cacheType);
                    s41Var.f39791l3.put(o51Var3.e.getDocumentId(), t5Var2);
                }
                o51Var3.setDrawable(t5Var2);
            }
            o51Var3.d(contains, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View o51Var;
        boolean z10;
        f61 f61Var = this.f42312s;
        if (i10 == 6) {
            Context context = f61Var.getContext();
            if (f61Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            o51Var = new k51(f61Var, context, z10);
        } else if (i10 == 7) {
            o51Var = new org.telegram.ui.Components.vn(f61Var.getContext(), 25);
            o51Var.setTag("searchbox");
        } else {
            o51Var = new o51(f61Var, f61Var.getContext());
        }
        if (f61.c(f61Var)) {
            o51Var.setScaleX(0.0f);
            o51Var.setScaleY(0.0f);
        }
        return new s4.e1(o51Var);
    }
}
