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
public final class j61 extends org.telegram.ui.Components.ll0 {
    public int f34340c;
    public int d;
    public int h;
    public final z61 f34344s;
    public int e = -1;
    public int f34341f = -1;
    public int f34342n = 1;
    public final ArrayList f34343r = new ArrayList();

    public j61(z61 z61Var) {
        this.f34344s = z61Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        z61 z61Var = this.f34344s;
        int i10 = z61Var.W;
        boolean z11 = z61Var.I;
        ArrayList arrayList = this.f34343r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f34340c = -1;
        boolean z12 = false;
        this.f34342n = 0;
        arrayList.clear();
        ArrayList arrayList2 = z61Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f34342n;
                this.f34342n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f34342n;
            for (int i12 = 0; i12 < z61Var.A1.size(); i12++) {
                this.f34342n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, z61Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = z61Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f34342n;
                this.f34342n = i13 + 1;
                this.f34341f = i13;
                arrayList.add(2);
                this.f34340c = this.f34342n;
                for (int i14 = 0; i14 < z61Var.B1.size(); i14++) {
                    this.f34342n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, z61Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = z61Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f34342n;
                    this.f34342n = i15 + 1;
                    this.f34341f = i15;
                    arrayList.add(2);
                }
                this.f34340c = this.f34342n;
                for (int i16 = 0; i16 < z61Var.C1.size(); i16++) {
                    this.f34342n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, z61Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = z61Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f34342n;
            this.h = i17;
            this.f34342n = arrayList5.size() + i17;
        }
        l();
        if (z61Var.f40060y1 && this.f34342n == 0) {
            z12 = true;
        }
        if (z61Var.G1 != z12) {
            z61Var.G1 = z12;
            ValueAnimator valueAnimator = z61Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            z61Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new f51(z61Var, z12, 1));
            z61Var.H1.addListener(new s51(z61Var, z12, 1));
            z61Var.H1.setInterpolator(org.telegram.ui.Components.rr.h);
            z61Var.H1.setDuration(100L);
            z61Var.H1.start();
            if (z12) {
                z61.D(z61Var.V, z61Var.f40029l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f34342n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f34341f) {
            return 6;
        }
        z61 z61Var = this.f34344s;
        if (z61Var.W == 14) {
            ArrayList arrayList = z61Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f34340c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f34340c;
            if (i10 > i12 && (i10 - i12) - 1 < z61Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = z61Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (z61Var.W == 13 || ((zg.p0) z61Var.A1.get((i10 - this.d) - 1)).f49072g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= z61Var.D1.size()) {
            return 4;
        }
        if (z61Var.D1.get(i10 - this.h) instanceof w61) {
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
        zg.p0 p0Var;
        int cacheType2;
        int i13;
        int indexOf;
        z61 z61Var = this.f34344s;
        HashSet hashSet = z61Var.K;
        int i14 = z61Var.W;
        int i15 = z61Var.V;
        m51 m51Var = z61Var.f40023i0;
        int i16 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i16 == 6) {
            e61 e61Var = (e61) view;
            ArrayList arrayList = z61Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) z61Var.D1.get(i10 - this.h);
                if (document2 instanceof w61) {
                    CharSequence charSequence = ((w61) document2).f38549a;
                    String str = z61Var.f40062z1;
                    e61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ue, e61Var.f32829f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    e61Var.f32826a.setText(charSequence);
                    e61Var.b(false);
                }
            } else if (i10 == this.e) {
                e61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                e61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                e61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            e61Var.f32828c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) z61Var.C1.get((i10 - this.f34340c) - 1);
            i61 i61Var = (i61) view;
            i61Var.a(m51Var);
            i61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.f18953m6, 0.2f), 0L, "tgs", document3, 0);
            i61Var.Q = true;
            i61Var.d = document3;
            i61Var.e = null;
        } else if (i16 == 4) {
            i61 i61Var2 = (i61) view;
            i61Var2.f34035c = i10;
            ImageReceiver imageReceiver = i61Var2.f34037n;
            ArrayList arrayList2 = z61Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                p0Var = (zg.p0) z61Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = z61Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f34340c) && i10 - i12 < arrayList3.size()) {
                    p0Var = (zg.p0) z61Var.B1.get(i10 - this.f34340c);
                } else {
                    return;
                }
            }
            if (i61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(i61Var2);
                i61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                i61Var2.h.onAttachedToWindow();
            }
            i61Var2.h.setParentView(m51Var);
            i61Var2.f34041x = p0Var;
            i61Var2.f34042y = false;
            i61Var2.d(z61Var.J.contains(p0Var), false);
            i61Var2.f34034b = false;
            i61Var2.invalidate();
            if (i14 == 13) {
                i61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f49071f));
            } else if (!p0Var.f49069b && p0Var.f49071f != null) {
                i61Var2.f34039s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f49071f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.f18953m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        i61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    } else {
                        zg.p0 p0Var2 = p0Var;
                        i61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                } else {
                    i61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                i61Var2.e = null;
                i61Var2.d = null;
                i61Var2.setDrawable(null);
                h61 h61Var = i61Var2.J;
                if (h61Var != null) {
                    h61Var.setVisibility(8);
                    i61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f49069b) {
                    i61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f49071f));
                }
            } else {
                i61Var2.f34039s = false;
                i61Var2.e = new org.telegram.ui.Components.z5(p0Var.f49072g, (Paint.FontMetricsInt) null);
                i61Var2.d = null;
                i61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) m51Var.f31978d3.get(i61Var2.e.getDocumentId());
                if (q5Var == null) {
                    cacheType2 = z61Var.getCacheType();
                    q5Var = org.telegram.ui.Components.q5.n(i15, i61Var2.e.getDocumentId(), null, cacheType2);
                    m51Var.f31978d3.put(i61Var2.e.getDocumentId(), q5Var);
                }
                i61Var2.setDrawable(q5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.f49069b && p0Var.d) {
                i61Var2.b();
                i61Var2.J.setVisibility(0);
                i61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                i61Var2.setEmojicon(p0Var.f49071f);
            } else {
                i61Var2.setEmojicon(null);
            }
            h61 h61Var2 = i61Var2.J;
            if (h61Var2 != null) {
                h61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            i61 i61Var3 = (i61) view;
            i61Var3.f34033a = false;
            i61Var3.f34035c = i10;
            i61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            i61Var3.setDrawable(null);
            ArrayList arrayList4 = z61Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.p0 p0Var3 = (zg.p0) z61Var.A1.get(i10);
                i61Var3.f34041x = p0Var3;
                long j3 = p0Var3.f49072g;
                if (j3 == 0) {
                    boolean contains2 = z61Var.J.contains(p0Var3);
                    i61Var3.f34042y = true;
                    i61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var3.f49071f));
                    i61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var3.f49069b && p0Var3.d) {
                    i61Var3.b();
                    i61Var3.J.setVisibility(0);
                } else {
                    h61 h61Var3 = i61Var3.J;
                    if (h61Var3 != null) {
                        h61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = z61Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) z61Var.D1.get(i10 - this.h);
                    if (!(document instanceof w61)) {
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
                    i61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                    i61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f18089id));
                } else {
                    org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                    i61Var3.e = z5Var;
                    i61Var3.d = z5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) m51Var.f31978d3.get(i61Var3.e.getDocumentId());
                if (q5Var2 == null) {
                    cacheType = z61Var.getCacheType();
                    q5Var2 = org.telegram.ui.Components.q5.n(i15, i61Var3.e.getDocumentId(), null, cacheType);
                    m51Var.f31978d3.put(i61Var3.e.getDocumentId(), q5Var2);
                }
                i61Var3.setDrawable(q5Var2);
            }
            i61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View i61Var;
        boolean z10;
        z61 z61Var = this.f34344s;
        if (i10 == 6) {
            Context context = z61Var.getContext();
            if (z61Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            i61Var = new e61(z61Var, context, z10);
        } else if (i10 == 7) {
            i61Var = new org.telegram.ui.Components.ln(z61Var.getContext(), 25);
            i61Var.setTag("searchbox");
        } else {
            i61Var = new i61(z61Var, z61Var.getContext());
        }
        if (z61.c(z61Var)) {
            i61Var.setScaleX(0.0f);
            i61Var.setScaleY(0.0f);
        }
        return new s4.c1(i61Var);
    }
}
