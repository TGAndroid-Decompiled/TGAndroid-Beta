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
public final class h51 extends org.telegram.ui.Components.im0 {
    public int f37500c;
    public int d;
    public int h;
    public final x51 f37504s;
    public int e = -1;
    public int f37501f = -1;
    public int f37502n = 1;
    public final ArrayList f37503r = new ArrayList();

    public h51(x51 x51Var) {
        this.f37504s = x51Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45923f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        x51 x51Var = this.f37504s;
        int i10 = x51Var.W;
        boolean z11 = x51Var.I;
        ArrayList arrayList = this.f37503r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f37500c = -1;
        boolean z12 = false;
        this.f37502n = 0;
        arrayList.clear();
        ArrayList arrayList2 = x51Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f37502n;
                this.f37502n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f37502n;
            for (int i12 = 0; i12 < x51Var.A1.size(); i12++) {
                this.f37502n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, x51Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = x51Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f37502n;
                this.f37502n = i13 + 1;
                this.f37501f = i13;
                arrayList.add(2);
                this.f37500c = this.f37502n;
                for (int i14 = 0; i14 < x51Var.B1.size(); i14++) {
                    this.f37502n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, x51Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = x51Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f37502n;
                    this.f37502n = i15 + 1;
                    this.f37501f = i15;
                    arrayList.add(2);
                }
                this.f37500c = this.f37502n;
                for (int i16 = 0; i16 < x51Var.C1.size(); i16++) {
                    this.f37502n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, x51Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = x51Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f37502n;
            this.h = i17;
            this.f37502n = arrayList5.size() + i17;
        }
        l();
        if (x51Var.f43103y1 && this.f37502n == 0) {
            z12 = true;
        }
        if (x51Var.G1 != z12) {
            x51Var.G1 = z12;
            ValueAnimator valueAnimator = x51Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            x51Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new c41(x51Var, z12, 1));
            x51Var.H1.addListener(new q41(x51Var, z12, 1));
            x51Var.H1.setInterpolator(org.telegram.ui.Components.bs.h);
            x51Var.H1.setDuration(100L);
            x51Var.H1.start();
            if (z12) {
                x51.D(x51Var.V, x51Var.f43072l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f37502n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f37501f) {
            return 6;
        }
        x51 x51Var = this.f37504s;
        if (x51Var.W == 14) {
            ArrayList arrayList = x51Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f37500c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f37500c;
            if (i10 > i12 && (i10 - i12) - 1 < x51Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = x51Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (x51Var.W == 13 || ((ah.i1) x51Var.A1.get((i10 - this.d) - 1)).f784g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= x51Var.D1.size()) {
            return 4;
        }
        if (x51Var.D1.get(i10 - this.h) instanceof u51) {
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
        x51 x51Var = this.f37504s;
        HashSet hashSet = x51Var.K;
        int i14 = x51Var.W;
        int i15 = x51Var.V;
        k41 k41Var = x51Var.f43066i0;
        int i16 = b1Var.f45923f;
        View view = b1Var.f45920a;
        if (i16 == 6) {
            c51 c51Var = (c51) view;
            ArrayList arrayList = x51Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) x51Var.D1.get(i10 - this.h);
                if (document2 instanceof u51) {
                    CharSequence charSequence = ((u51) document2).f41810a;
                    String str = x51Var.f43105z1;
                    c51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ue, c51Var.f35828f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    c51Var.f35825a.setText(charSequence);
                    c51Var.b(false);
                }
            } else if (i10 == this.e) {
                c51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                c51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                c51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            c51Var.f35827c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) x51Var.C1.get((i10 - this.f37500c) - 1);
            g51 g51Var = (g51) view;
            g51Var.a(k41Var);
            g51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.f21156m6, 0.2f), 0L, "tgs", document3, 0);
            g51Var.Q = true;
            g51Var.d = document3;
            g51Var.e = null;
        } else if (i16 == 4) {
            g51 g51Var2 = (g51) view;
            g51Var2.f37194c = i10;
            ImageReceiver imageReceiver = g51Var2.f37196n;
            ArrayList arrayList2 = x51Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                i1Var = (ah.i1) x51Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = x51Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f37500c) && i10 - i12 < arrayList3.size()) {
                    i1Var = (ah.i1) x51Var.B1.get(i10 - this.f37500c);
                } else {
                    return;
                }
            }
            if (g51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(g51Var2);
                g51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                g51Var2.h.onAttachedToWindow();
            }
            g51Var2.h.setParentView(k41Var);
            g51Var2.f37200x = i1Var;
            g51Var2.f37201y = false;
            g51Var2.d(x51Var.J.contains(i1Var), false);
            g51Var2.f37193b = false;
            g51Var2.invalidate();
            if (i14 == 13) {
                g51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f783f));
            } else if (!i1Var.f781b && i1Var.f783f != null) {
                g51Var2.f37198s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(i1Var.f783f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.f21156m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        g51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    } else {
                        ah.i1 i1Var2 = i1Var;
                        g51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    g51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                g51Var2.e = null;
                g51Var2.d = null;
                g51Var2.setDrawable(null);
                f51 f51Var = g51Var2.J;
                if (f51Var != null) {
                    f51Var.setVisibility(8);
                    g51Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && i1Var.f781b) {
                    g51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f783f));
                }
            } else {
                g51Var2.f37198s = false;
                g51Var2.e = new org.telegram.ui.Components.a6(i1Var.f784g, (Paint.FontMetricsInt) null);
                g51Var2.d = null;
                g51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) k41Var.f43632b3.get(g51Var2.e.getDocumentId());
                if (r5Var == null) {
                    cacheType2 = x51Var.getCacheType();
                    r5Var = org.telegram.ui.Components.r5.n(i15, g51Var2.e.getDocumentId(), null, cacheType2);
                    k41Var.f43632b3.put(g51Var2.e.getDocumentId(), r5Var);
                }
                g51Var2.setDrawable(r5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && i1Var.f781b && i1Var.d) {
                g51Var2.b();
                g51Var2.J.setVisibility(0);
                g51Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                g51Var2.setEmojicon(i1Var.f783f);
            } else {
                g51Var2.setEmojicon(null);
            }
            f51 f51Var2 = g51Var2.J;
            if (f51Var2 != null) {
                f51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            g51 g51Var3 = (g51) view;
            g51Var3.f37192a = false;
            g51Var3.f37194c = i10;
            g51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            g51Var3.setDrawable(null);
            ArrayList arrayList4 = x51Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                ah.i1 i1Var3 = (ah.i1) x51Var.A1.get(i10);
                g51Var3.f37200x = i1Var3;
                long j10 = i1Var3.f784g;
                if (j10 == 0) {
                    boolean contains2 = x51Var.J.contains(i1Var3);
                    g51Var3.f37201y = true;
                    g51Var3.setDrawable(Emoji.getEmojiDrawable(i1Var3.f783f));
                    g51Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && i1Var3.f781b && i1Var3.d) {
                    g51Var3.b();
                    g51Var3.J.setVisibility(0);
                } else {
                    f51 f51Var3 = g51Var3.J;
                    if (f51Var3 != null) {
                        f51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = x51Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) x51Var.D1.get(i10 - this.h);
                    if (!(document instanceof u51)) {
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
                    g51Var3.e = new org.telegram.ui.Components.a6(document, (Paint.FontMetricsInt) null);
                    g51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20285id));
                } else {
                    org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(l4.longValue(), (Paint.FontMetricsInt) null);
                    g51Var3.e = a6Var;
                    g51Var3.d = a6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.r5 r5Var2 = (org.telegram.ui.Components.r5) k41Var.f43632b3.get(g51Var3.e.getDocumentId());
                if (r5Var2 == null) {
                    cacheType = x51Var.getCacheType();
                    r5Var2 = org.telegram.ui.Components.r5.n(i15, g51Var3.e.getDocumentId(), null, cacheType);
                    k41Var.f43632b3.put(g51Var3.e.getDocumentId(), r5Var2);
                }
                g51Var3.setDrawable(r5Var2);
            }
            g51Var3.d(contains, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View g51Var;
        boolean z10;
        x51 x51Var = this.f37504s;
        if (i10 == 6) {
            Context context = x51Var.getContext();
            if (x51Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            g51Var = new c51(x51Var, context, z10);
        } else if (i10 == 7) {
            g51Var = new org.telegram.ui.Components.un(x51Var.getContext(), 25);
            g51Var.setTag("searchbox");
        } else {
            g51Var = new g51(x51Var, x51Var.getContext());
        }
        if (x51.c(x51Var)) {
            g51Var.setScaleX(0.0f);
            g51Var.setScaleY(0.0f);
        }
        return new s4.b1(g51Var);
    }
}
