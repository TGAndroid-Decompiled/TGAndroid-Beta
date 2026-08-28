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
public final class l51 extends org.telegram.ui.Components.vk0 {
    public int f40053c;
    public int d;
    public int h;
    public final b61 f40058s;
    public int f40054e = -1;
    public int f40055f = -1;
    public int f40056n = 1;
    public final ArrayList f40057r = new ArrayList();

    public l51(b61 b61Var) {
        this.f40058s = b61Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        b61 b61Var = this.f40058s;
        int i9 = b61Var.S;
        boolean z11 = b61Var.E;
        ArrayList arrayList = this.f40057r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f40053c = -1;
        boolean z12 = false;
        this.f40056n = 0;
        arrayList.clear();
        ArrayList arrayList2 = b61Var.f36712w1;
        if (arrayList2 != null) {
            if (i9 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f40056n;
                this.f40056n = i10 + 1;
                this.f40054e = i10;
                arrayList.add(1);
            }
            this.d = this.f40056n;
            for (int i11 = 0; i11 < b61Var.f36712w1.size(); i11++) {
                this.f40056n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, b61Var.f36712w1.get(i11))));
            }
        }
        if (i9 == 14) {
            ArrayList arrayList3 = b61Var.f36715x1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f40056n;
                this.f40056n = i12 + 1;
                this.f40055f = i12;
                arrayList.add(2);
                this.f40053c = this.f40056n;
                for (int i13 = 0; i13 < b61Var.f36715x1.size(); i13++) {
                    this.f40056n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, b61Var.f36715x1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = b61Var.f36718y1;
            if (arrayList4 != null) {
                if (i9 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f40056n;
                    this.f40056n = i14 + 1;
                    this.f40055f = i14;
                    arrayList.add(2);
                }
                this.f40053c = this.f40056n;
                for (int i15 = 0; i15 < b61Var.f36718y1.size(); i15++) {
                    this.f40056n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, b61Var.f36718y1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = b61Var.f36720z1;
        if (arrayList5 != null) {
            int i16 = this.f40056n;
            this.h = i16;
            this.f40056n = arrayList5.size() + i16;
        }
        l();
        if (b61Var.f36707u1 && this.f40056n == 0) {
            z12 = true;
        }
        if (b61Var.C1 != z12) {
            b61Var.C1 = z12;
            ValueAnimator valueAnimator = b61Var.D1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            b61Var.D1 = ofFloat;
            ofFloat.addUpdateListener(new i41(b61Var, z12, 1));
            b61Var.D1.addListener(new u41(b61Var, z12, 1));
            b61Var.D1.setInterpolator(org.telegram.ui.Components.gr.h);
            b61Var.D1.setDuration(100L);
            b61Var.D1.start();
            if (z12) {
                b61.D(b61Var.R, b61Var.f36679h0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f40056n;
    }

    @Override
    public final int j(int i9) {
        int i10;
        if (i9 == this.f40054e || i9 == this.f40055f) {
            return 6;
        }
        b61 b61Var = this.f40058s;
        if (b61Var.S == 14) {
            ArrayList arrayList = b61Var.f36715x1;
            if (arrayList != null && i9 >= (i10 = this.f40053c) && i9 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f40053c;
            if (i9 > i11 && (i9 - i11) - 1 < b61Var.f36718y1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = b61Var.f36712w1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i9 > i12 && (i9 - i12) - 1 < arrayList2.size() && (b61Var.S == 13 || ((hg.r0) b61Var.f36712w1.get((i9 - this.d) - 1)).f10718g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i9 - i13 < 0 || i9 - i13 >= b61Var.f36720z1.size()) {
            return 4;
        }
        if (b61Var.f36720z1.get(i9 - this.h) instanceof y51) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        hg.r0 r0Var;
        int cacheType2;
        int i12;
        int indexOf;
        b61 b61Var = this.f40058s;
        HashSet hashSet = b61Var.G;
        int i13 = b61Var.S;
        int i14 = b61Var.R;
        o41 o41Var = b61Var.f36672e0;
        int i15 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i15 == 6) {
            g51 g51Var = (g51) view;
            ArrayList arrayList = b61Var.f36720z1;
            if (arrayList != null && (i12 = i9 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) b61Var.f36720z1.get(i9 - this.h);
                if (document2 instanceof y51) {
                    CharSequence charSequence = ((y51) document2).f44730a;
                    String str = b61Var.f36709v1;
                    g51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ue, g51Var.f38431f.V0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    g51Var.f38427a.setText(charSequence);
                    g51Var.b(false);
                }
            } else if (i9 == this.f40054e) {
                g51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i13 == 14) {
                g51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                g51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            g51Var.f38429c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) b61Var.f36718y1.get((i9 - this.f40053c) - 1);
            k51 k51Var = (k51) view;
            k51Var.a(o41Var);
            k51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f), 0L, "tgs", document3, 0);
            k51Var.M = true;
            k51Var.d = document3;
            k51Var.f39713e = null;
        } else if (i15 == 4) {
            k51 k51Var2 = (k51) view;
            k51Var2.f39712c = i9;
            ImageReceiver imageReceiver = k51Var2.f39715n;
            ArrayList arrayList2 = b61Var.f36712w1;
            if (arrayList2 != null && i9 >= 0 && i9 < arrayList2.size()) {
                r0Var = (hg.r0) b61Var.f36712w1.get(i9);
            } else {
                ArrayList arrayList3 = b61Var.f36715x1;
                if (arrayList3 != null && i9 >= (i11 = this.f40053c) && i9 - i11 < arrayList3.size()) {
                    r0Var = (hg.r0) b61Var.f36715x1.get(i9 - this.f40053c);
                } else {
                    return;
                }
            }
            if (k51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(k51Var2);
                k51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                k51Var2.h.onAttachedToWindow();
            }
            k51Var2.h.setParentView(o41Var);
            k51Var2.f39719x = r0Var;
            k51Var2.f39720y = false;
            k51Var2.d(b61Var.F.contains(r0Var), false);
            k51Var2.f39711b = false;
            k51Var2.invalidate();
            if (i13 == 13) {
                k51Var2.setDrawable(Emoji.getEmojiDrawable(r0Var.f10717f));
            } else if (!r0Var.f10714b && r0Var.f10717f != null) {
                k51Var2.f39717s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(r0Var.f10717f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        k51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", r0Var, 0);
                    } else {
                        hg.r0 r0Var2 = r0Var;
                        k51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", r0Var2, 0);
                        r0Var = r0Var2;
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), hg.n0.a());
                } else {
                    k51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                k51Var2.f39713e = null;
                k51Var2.d = null;
                k51Var2.setDrawable(null);
                j51 j51Var = k51Var2.F;
                if (j51Var != null) {
                    j51Var.setVisibility(8);
                    k51Var2.F.setImageReceiver(null);
                }
                if (tL_availableReaction == null && r0Var.f10714b) {
                    k51Var2.setDrawable(Emoji.getEmojiDrawable(r0Var.f10717f));
                }
            } else {
                k51Var2.f39717s = false;
                k51Var2.f39713e = new org.telegram.ui.Components.t5(r0Var.f10718g, (Paint.FontMetricsInt) null);
                k51Var2.d = null;
                k51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) o41Var.Z2.get(k51Var2.f39713e.getDocumentId());
                if (k5Var == null) {
                    cacheType2 = b61Var.getCacheType();
                    k5Var = org.telegram.ui.Components.k5.n(i14, k51Var2.f39713e.getDocumentId(), null, cacheType2);
                    o41Var.Z2.put(k51Var2.f39713e.getDocumentId(), k5Var);
                }
                k51Var2.setDrawable(k5Var);
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && r0Var.f10714b && r0Var.d) {
                k51Var2.b();
                k51Var2.F.setVisibility(0);
                k51Var2.setEmojicon(null);
                return;
            }
            if (r0Var.f10716e) {
                k51Var2.setEmojicon(r0Var.f10717f);
            } else {
                k51Var2.setEmojicon(null);
            }
            j51 j51Var2 = k51Var2.F;
            if (j51Var2 != null) {
                j51Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            k51 k51Var3 = (k51) view;
            k51Var3.f39710a = false;
            k51Var3.f39712c = i9;
            k51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            k51Var3.setDrawable(null);
            ArrayList arrayList4 = b61Var.f36712w1;
            if (arrayList4 != null && i9 >= 0 && i9 < arrayList4.size()) {
                hg.r0 r0Var3 = (hg.r0) b61Var.f36712w1.get(i9);
                k51Var3.f39719x = r0Var3;
                long j10 = r0Var3.f10718g;
                if (j10 == 0) {
                    boolean contains2 = b61Var.F.contains(r0Var3);
                    k51Var3.f39720y = true;
                    k51Var3.setDrawable(Emoji.getEmojiDrawable(r0Var3.f10717f));
                    k51Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i13 == 14 && !UserConfig.getInstance(i14).isPremium() && r0Var3.f10714b && r0Var3.d) {
                    k51Var3.b();
                    k51Var3.F.setVisibility(0);
                } else {
                    j51 j51Var3 = k51Var3.F;
                    if (j51Var3 != null) {
                        j51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = b61Var.f36720z1;
                if (arrayList5 != null && (i10 = i9 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) b61Var.f36720z1.get(i9 - this.h);
                    if (!(document instanceof y51)) {
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
                    k51Var3.f39713e = new org.telegram.ui.Components.t5(document, (Paint.FontMetricsInt) null);
                    k51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f22386id));
                } else {
                    org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(l10.longValue(), (Paint.FontMetricsInt) null);
                    k51Var3.f39713e = t5Var;
                    k51Var3.d = t5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.k5 k5Var2 = (org.telegram.ui.Components.k5) o41Var.Z2.get(k51Var3.f39713e.getDocumentId());
                if (k5Var2 == null) {
                    cacheType = b61Var.getCacheType();
                    k5Var2 = org.telegram.ui.Components.k5.n(i14, k51Var3.f39713e.getDocumentId(), null, cacheType);
                    o41Var.Z2.put(k51Var3.f39713e.getDocumentId(), k5Var2);
                }
                k51Var3.setDrawable(k5Var2);
            }
            k51Var3.d(contains, false);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View k51Var;
        boolean z10;
        b61 b61Var = this.f40058s;
        if (i9 == 6) {
            Context context = b61Var.getContext();
            if (b61Var.S == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            k51Var = new g51(b61Var, context, z10);
        } else if (i9 == 7) {
            k51Var = new org.telegram.ui.Components.an(b61Var.getContext(), 26);
            k51Var.setTag("searchbox");
        } else {
            k51Var = new k51(b61Var, b61Var.getContext());
        }
        if (b61.c(b61Var)) {
            k51Var.setScaleX(0.0f);
            k51Var.setScaleY(0.0f);
        }
        return new f2.q1(k51Var);
    }
}
