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
public final class b71 extends org.telegram.ui.Components.lm0 {
    public int f34434c;
    public int d;
    public int h;
    public final r71 f34438s;
    public int e = -1;
    public int f34435f = -1;
    public int f34436n = 1;
    public final ArrayList f34437r = new ArrayList();

    public b71(r71 r71Var) {
        this.f34438s = r71Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        r71 r71Var = this.f34438s;
        int i10 = r71Var.W;
        boolean z11 = r71Var.I;
        ArrayList arrayList = this.f34437r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f34434c = -1;
        boolean z12 = false;
        this.f34436n = 0;
        arrayList.clear();
        ArrayList arrayList2 = r71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f34436n;
                this.f34436n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f34436n;
            for (int i12 = 0; i12 < r71Var.A1.size(); i12++) {
                this.f34436n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, r71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = r71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f34436n;
                this.f34436n = i13 + 1;
                this.f34435f = i13;
                arrayList.add(2);
                this.f34434c = this.f34436n;
                for (int i14 = 0; i14 < r71Var.B1.size(); i14++) {
                    this.f34436n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = r71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f34436n;
                    this.f34436n = i15 + 1;
                    this.f34435f = i15;
                    arrayList.add(2);
                }
                this.f34434c = this.f34436n;
                for (int i16 = 0; i16 < r71Var.C1.size(); i16++) {
                    this.f34436n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = r71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f34436n;
            this.h = i17;
            this.f34436n = arrayList5.size() + i17;
        }
        l();
        if (r71Var.f39676y1 && this.f34436n == 0) {
            z12 = true;
        }
        if (r71Var.G1 != z12) {
            r71Var.G1 = z12;
            ValueAnimator valueAnimator = r71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new w51(r71Var, z12, 1));
            r71Var.H1.addListener(new k61(r71Var, z12, 1));
            r71Var.H1.setInterpolator(org.telegram.ui.Components.es.h);
            r71Var.H1.setDuration(100L);
            r71Var.H1.start();
            if (z12) {
                r71.D(r71Var.V, r71Var.f39645l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f34436n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f34435f) {
            return 6;
        }
        r71 r71Var = this.f34438s;
        if (r71Var.W == 14) {
            ArrayList arrayList = r71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f34434c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f34434c;
            if (i10 > i12 && (i10 - i12) - 1 < r71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = r71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (r71Var.W == 13 || ((ah.i1) r71Var.A1.get((i10 - this.d) - 1)).f780g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= r71Var.D1.size()) {
            return 4;
        }
        if (r71Var.D1.get(i10 - this.h) instanceof o71) {
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
        r71 r71Var = this.f34438s;
        HashSet hashSet = r71Var.K;
        int i14 = r71Var.W;
        int i15 = r71Var.V;
        e61 e61Var = r71Var.f39639i0;
        int i16 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i16 == 6) {
            w61 w61Var = (w61) view;
            ArrayList arrayList = r71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) r71Var.D1.get(i10 - this.h);
                if (document2 instanceof o71) {
                    CharSequence charSequence = ((o71) document2).f38881a;
                    String str = r71Var.f39678z1;
                    w61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ue, w61Var.f41169f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w61Var.f41166a.setText(charSequence);
                    w61Var.b(false);
                }
            } else if (i10 == this.e) {
                w61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                w61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                w61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            w61Var.f41168c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) r71Var.C1.get((i10 - this.f34434c) - 1);
            a71 a71Var = (a71) view;
            a71Var.a(e61Var);
            a71Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.g6.f20064m6, 0.2f), 0L, "tgs", document3, 0);
            a71Var.Q = true;
            a71Var.d = document3;
            a71Var.e = null;
        } else if (i16 == 4) {
            a71 a71Var2 = (a71) view;
            a71Var2.f34065c = i10;
            ImageReceiver imageReceiver = a71Var2.f34067n;
            ArrayList arrayList2 = r71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                i1Var = (ah.i1) r71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = r71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f34434c) && i10 - i12 < arrayList3.size()) {
                    i1Var = (ah.i1) r71Var.B1.get(i10 - this.f34434c);
                } else {
                    return;
                }
            }
            if (a71Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(a71Var2);
                a71Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                a71Var2.h.onAttachedToWindow();
            }
            a71Var2.h.setParentView(e61Var);
            a71Var2.f34071x = i1Var;
            a71Var2.f34072y = false;
            a71Var2.d(r71Var.J.contains(i1Var), false);
            a71Var2.f34064b = false;
            a71Var2.invalidate();
            if (i14 == 13) {
                a71Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f779f));
            } else if (!i1Var.f777b && i1Var.f779f != null) {
                a71Var2.f34069s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(i1Var.f779f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.f20064m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        a71Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    } else {
                        ah.i1 i1Var2 = i1Var;
                        a71Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    a71Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                a71Var2.e = null;
                a71Var2.d = null;
                a71Var2.setDrawable(null);
                z61 z61Var = a71Var2.J;
                if (z61Var != null) {
                    z61Var.setVisibility(8);
                    a71Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && i1Var.f777b) {
                    a71Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f779f));
                }
            } else {
                a71Var2.f34069s = false;
                a71Var2.e = new org.telegram.ui.Components.b6(i1Var.f780g, (Paint.FontMetricsInt) null);
                a71Var2.d = null;
                a71Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) e61Var.f40298b3.get(a71Var2.e.getDocumentId());
                if (s5Var == null) {
                    cacheType2 = r71Var.getCacheType();
                    s5Var = org.telegram.ui.Components.s5.n(i15, a71Var2.e.getDocumentId(), null, cacheType2);
                    e61Var.f40298b3.put(a71Var2.e.getDocumentId(), s5Var);
                }
                a71Var2.setDrawable(s5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && i1Var.f777b && i1Var.d) {
                a71Var2.b();
                a71Var2.J.setVisibility(0);
                a71Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                a71Var2.setEmojicon(i1Var.f779f);
            } else {
                a71Var2.setEmojicon(null);
            }
            z61 z61Var2 = a71Var2.J;
            if (z61Var2 != null) {
                z61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            a71 a71Var3 = (a71) view;
            a71Var3.f34063a = false;
            a71Var3.f34065c = i10;
            a71Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            a71Var3.setDrawable(null);
            ArrayList arrayList4 = r71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                ah.i1 i1Var3 = (ah.i1) r71Var.A1.get(i10);
                a71Var3.f34071x = i1Var3;
                long j10 = i1Var3.f780g;
                if (j10 == 0) {
                    boolean contains2 = r71Var.J.contains(i1Var3);
                    a71Var3.f34072y = true;
                    a71Var3.setDrawable(Emoji.getEmojiDrawable(i1Var3.f779f));
                    a71Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && i1Var3.f777b && i1Var3.d) {
                    a71Var3.b();
                    a71Var3.J.setVisibility(0);
                } else {
                    z61 z61Var3 = a71Var3.J;
                    if (z61Var3 != null) {
                        z61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = r71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) r71Var.D1.get(i10 - this.h);
                    if (!(document instanceof o71)) {
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
                    a71Var3.e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                    a71Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f19222id));
                } else {
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(l4.longValue(), (Paint.FontMetricsInt) null);
                    a71Var3.e = b6Var;
                    a71Var3.d = b6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) e61Var.f40298b3.get(a71Var3.e.getDocumentId());
                if (s5Var2 == null) {
                    cacheType = r71Var.getCacheType();
                    s5Var2 = org.telegram.ui.Components.s5.n(i15, a71Var3.e.getDocumentId(), null, cacheType);
                    e61Var.f40298b3.put(a71Var3.e.getDocumentId(), s5Var2);
                }
                a71Var3.setDrawable(s5Var2);
            }
            a71Var3.d(contains, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View a71Var;
        boolean z10;
        r71 r71Var = this.f34438s;
        if (i10 == 6) {
            Context context = r71Var.getContext();
            if (r71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            a71Var = new w61(r71Var, context, z10);
        } else if (i10 == 7) {
            a71Var = new org.telegram.ui.Components.xn(r71Var.getContext(), 25);
            a71Var.setTag("searchbox");
        } else {
            a71Var = new a71(r71Var, r71Var.getContext());
        }
        if (r71.c(r71Var)) {
            a71Var.setScaleX(0.0f);
            a71Var.setScaleY(0.0f);
        }
        return new s4.b1(a71Var);
    }
}
