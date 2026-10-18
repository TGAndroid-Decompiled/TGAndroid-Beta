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
public final class j51 extends org.telegram.ui.Components.hm0 {
    public int f38063c;
    public int d;
    public int h;
    public final z51 f38067s;
    public int e = -1;
    public int f38064f = -1;
    public int f38065n = 1;
    public final ArrayList f38066r = new ArrayList();

    public j51(z51 z51Var) {
        this.f38067s = z51Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        z51 z51Var = this.f38067s;
        int i10 = z51Var.W;
        boolean z11 = z51Var.I;
        ArrayList arrayList = this.f38066r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f38063c = -1;
        boolean z12 = false;
        this.f38065n = 0;
        arrayList.clear();
        ArrayList arrayList2 = z51Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f38065n;
                this.f38065n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f38065n;
            for (int i12 = 0; i12 < z51Var.A1.size(); i12++) {
                this.f38065n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, z51Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = z51Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f38065n;
                this.f38065n = i13 + 1;
                this.f38064f = i13;
                arrayList.add(2);
                this.f38063c = this.f38065n;
                for (int i14 = 0; i14 < z51Var.B1.size(); i14++) {
                    this.f38065n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, z51Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = z51Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f38065n;
                    this.f38065n = i15 + 1;
                    this.f38064f = i15;
                    arrayList.add(2);
                }
                this.f38063c = this.f38065n;
                for (int i16 = 0; i16 < z51Var.C1.size(); i16++) {
                    this.f38065n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, z51Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = z51Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f38065n;
            this.h = i17;
            this.f38065n = arrayList5.size() + i17;
        }
        l();
        if (z51Var.f43661y1 && this.f38065n == 0) {
            z12 = true;
        }
        if (z51Var.G1 != z12) {
            z51Var.G1 = z12;
            ValueAnimator valueAnimator = z51Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            z51Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new e41(z51Var, z12, 1));
            z51Var.H1.addListener(new s41(z51Var, z12, 1));
            z51Var.H1.setInterpolator(org.telegram.ui.Components.bs.h);
            z51Var.H1.setDuration(100L);
            z51Var.H1.start();
            if (z12) {
                z51.D(z51Var.V, z51Var.f43630l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f38065n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f38064f) {
            return 6;
        }
        z51 z51Var = this.f38067s;
        if (z51Var.W == 14) {
            ArrayList arrayList = z51Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f38063c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f38063c;
            if (i10 > i12 && (i10 - i12) - 1 < z51Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = z51Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (z51Var.W == 13 || ((ah.i1) z51Var.A1.get((i10 - this.d) - 1)).f786g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= z51Var.D1.size()) {
            return 4;
        }
        if (z51Var.D1.get(i10 - this.h) instanceof w51) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ah.i1 i1Var;
        int cacheType2;
        int i13;
        int indexOf;
        z51 z51Var = this.f38067s;
        HashSet hashSet = z51Var.K;
        int i14 = z51Var.W;
        int i15 = z51Var.V;
        m41 m41Var = z51Var.f43624i0;
        int i16 = b1Var.f45961f;
        View view = b1Var.f45958a;
        if (i16 == 6) {
            e51 e51Var = (e51) view;
            ArrayList arrayList = z51Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) z51Var.D1.get(i10 - this.h);
                if (document2 instanceof w51) {
                    CharSequence charSequence = ((w51) document2).f42388a;
                    String str = z51Var.f43663z1;
                    e51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ue, e51Var.f36407f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    e51Var.f36404a.setText(charSequence);
                    e51Var.b(false);
                }
            } else if (i10 == this.e) {
                e51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                e51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                e51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            e51Var.f36406c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) z51Var.C1.get((i10 - this.f38063c) - 1);
            i51 i51Var = (i51) view;
            i51Var.a(m41Var);
            i51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.f21156m6, 0.2f), 0L, "tgs", document3, 0);
            i51Var.Q = true;
            i51Var.d = document3;
            i51Var.e = null;
        } else if (i16 == 4) {
            i51 i51Var2 = (i51) view;
            i51Var2.f37764c = i10;
            ImageReceiver imageReceiver = i51Var2.f37766n;
            ArrayList arrayList2 = z51Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                i1Var = (ah.i1) z51Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = z51Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f38063c) && i10 - i12 < arrayList3.size()) {
                    i1Var = (ah.i1) z51Var.B1.get(i10 - this.f38063c);
                } else {
                    return;
                }
            }
            if (i51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(i51Var2);
                i51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                i51Var2.h.onAttachedToWindow();
            }
            i51Var2.h.setParentView(m41Var);
            i51Var2.f37770x = i1Var;
            i51Var2.f37771y = false;
            i51Var2.d(z51Var.J.contains(i1Var), false);
            i51Var2.f37763b = false;
            i51Var2.invalidate();
            if (i14 == 13) {
                i51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f785f));
            } else if (!i1Var.f783b && i1Var.f785f != null) {
                i51Var2.f37768s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(i1Var.f785f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.f21156m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        i51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    } else {
                        ah.i1 i1Var2 = i1Var;
                        i51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    i51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                i51Var2.e = null;
                i51Var2.d = null;
                i51Var2.setDrawable(null);
                h51 h51Var = i51Var2.J;
                if (h51Var != null) {
                    h51Var.setVisibility(8);
                    i51Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && i1Var.f783b) {
                    i51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f785f));
                }
            } else {
                i51Var2.f37768s = false;
                i51Var2.e = new org.telegram.ui.Components.a6(i1Var.f786g, (Paint.FontMetricsInt) null);
                i51Var2.d = null;
                i51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) m41Var.f35591b3.get(i51Var2.e.getDocumentId());
                if (r5Var == null) {
                    cacheType2 = z51Var.getCacheType();
                    r5Var = org.telegram.ui.Components.r5.n(i15, i51Var2.e.getDocumentId(), null, cacheType2);
                    m41Var.f35591b3.put(i51Var2.e.getDocumentId(), r5Var);
                }
                i51Var2.setDrawable(r5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && i1Var.f783b && i1Var.d) {
                i51Var2.b();
                i51Var2.J.setVisibility(0);
                i51Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                i51Var2.setEmojicon(i1Var.f785f);
            } else {
                i51Var2.setEmojicon(null);
            }
            h51 h51Var2 = i51Var2.J;
            if (h51Var2 != null) {
                h51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            i51 i51Var3 = (i51) view;
            i51Var3.f37762a = false;
            i51Var3.f37764c = i10;
            i51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            i51Var3.setDrawable(null);
            ArrayList arrayList4 = z51Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                ah.i1 i1Var3 = (ah.i1) z51Var.A1.get(i10);
                i51Var3.f37770x = i1Var3;
                long j10 = i1Var3.f786g;
                if (j10 == 0) {
                    boolean contains2 = z51Var.J.contains(i1Var3);
                    i51Var3.f37771y = true;
                    i51Var3.setDrawable(Emoji.getEmojiDrawable(i1Var3.f785f));
                    i51Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && i1Var3.f783b && i1Var3.d) {
                    i51Var3.b();
                    i51Var3.J.setVisibility(0);
                } else {
                    h51 h51Var3 = i51Var3.J;
                    if (h51Var3 != null) {
                        h51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = z51Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) z51Var.D1.get(i10 - this.h);
                    if (!(document instanceof w51)) {
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
                    i51Var3.e = new org.telegram.ui.Components.a6(document, (Paint.FontMetricsInt) null);
                    i51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20285id));
                } else {
                    org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(l4.longValue(), (Paint.FontMetricsInt) null);
                    i51Var3.e = a6Var;
                    i51Var3.d = a6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.r5 r5Var2 = (org.telegram.ui.Components.r5) m41Var.f35591b3.get(i51Var3.e.getDocumentId());
                if (r5Var2 == null) {
                    cacheType = z51Var.getCacheType();
                    r5Var2 = org.telegram.ui.Components.r5.n(i15, i51Var3.e.getDocumentId(), null, cacheType);
                    m41Var.f35591b3.put(i51Var3.e.getDocumentId(), r5Var2);
                }
                i51Var3.setDrawable(r5Var2);
            }
            i51Var3.d(contains, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View i51Var;
        boolean z10;
        z51 z51Var = this.f38067s;
        if (i10 == 6) {
            Context context = z51Var.getContext();
            if (z51Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            i51Var = new e51(z51Var, context, z10);
        } else if (i10 == 7) {
            i51Var = new org.telegram.ui.Components.un(z51Var.getContext(), 25);
            i51Var.setTag("searchbox");
        } else {
            i51Var = new i51(z51Var, z51Var.getContext());
        }
        if (z51.c(z51Var)) {
            i51Var.setScaleX(0.0f);
            i51Var.setScaleY(0.0f);
        }
        return new s4.b1(i51Var);
    }
}
