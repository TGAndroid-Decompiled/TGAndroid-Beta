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
public final class n51 extends org.telegram.ui.Components.il0 {
    public int f40718c;
    public int d;
    public int h;
    public final d61 f40723s;
    public int f40719e = -1;
    public int f40720f = -1;
    public int f40721n = 1;
    public final ArrayList f40722r = new ArrayList();

    public n51(d61 d61Var) {
        this.f40723s = d61Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        d61 d61Var = this.f40723s;
        int i10 = d61Var.S;
        boolean z11 = d61Var.E;
        ArrayList arrayList = this.f40722r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f40718c = -1;
        boolean z12 = false;
        this.f40721n = 0;
        arrayList.clear();
        ArrayList arrayList2 = d61Var.f37369w1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f40721n;
                this.f40721n = i11 + 1;
                this.f40719e = i11;
                arrayList.add(1);
            }
            this.d = this.f40721n;
            for (int i12 = 0; i12 < d61Var.f37369w1.size(); i12++) {
                this.f40721n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, d61Var.f37369w1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = d61Var.f37372x1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f40721n;
                this.f40721n = i13 + 1;
                this.f40720f = i13;
                arrayList.add(2);
                this.f40718c = this.f40721n;
                for (int i14 = 0; i14 < d61Var.f37372x1.size(); i14++) {
                    this.f40721n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, d61Var.f37372x1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = d61Var.f37375y1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f40721n;
                    this.f40721n = i15 + 1;
                    this.f40720f = i15;
                    arrayList.add(2);
                }
                this.f40718c = this.f40721n;
                for (int i16 = 0; i16 < d61Var.f37375y1.size(); i16++) {
                    this.f40721n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, d61Var.f37375y1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = d61Var.f37377z1;
        if (arrayList5 != null) {
            int i17 = this.f40721n;
            this.h = i17;
            this.f40721n = arrayList5.size() + i17;
        }
        l();
        if (d61Var.f37364u1 && this.f40721n == 0) {
            z12 = true;
        }
        if (d61Var.C1 != z12) {
            d61Var.C1 = z12;
            ValueAnimator valueAnimator = d61Var.D1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            d61Var.D1 = ofFloat;
            ofFloat.addUpdateListener(new k41(d61Var, z12, 1));
            d61Var.D1.addListener(new w41(d61Var, z12, 1));
            d61Var.D1.setInterpolator(org.telegram.ui.Components.jr.h);
            d61Var.D1.setDuration(100L);
            d61Var.D1.start();
            if (z12) {
                d61.D(d61Var.R, d61Var.f37336h0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f40721n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f40719e || i10 == this.f40720f) {
            return 6;
        }
        d61 d61Var = this.f40723s;
        if (d61Var.S == 14) {
            ArrayList arrayList = d61Var.f37372x1;
            if (arrayList != null && i10 >= (i11 = this.f40718c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f40718c;
            if (i10 > i12 && (i10 - i12) - 1 < d61Var.f37375y1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = d61Var.f37369w1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (d61Var.S == 13 || ((kg.q0) d61Var.f37369w1.get((i10 - this.d) - 1)).f13826g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= d61Var.f37377z1.size()) {
            return 4;
        }
        if (d61Var.f37377z1.get(i10 - this.h) instanceof a61) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        kg.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        d61 d61Var = this.f40723s;
        HashSet hashSet = d61Var.G;
        int i14 = d61Var.S;
        int i15 = d61Var.R;
        q41 q41Var = d61Var.f37329e0;
        int i16 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i16 == 6) {
            i51 i51Var = (i51) view;
            ArrayList arrayList = d61Var.f37377z1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) d61Var.f37377z1.get(i10 - this.h);
                if (document2 instanceof a61) {
                    CharSequence charSequence = ((a61) document2).f36443a;
                    String str = d61Var.f37366v1;
                    i51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, i51Var.f39133f.V0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    i51Var.f39129a.setText(charSequence);
                    i51Var.b(false);
                }
            } else if (i10 == this.f40719e) {
                i51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                i51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                i51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            i51Var.f39131c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) d61Var.f37375y1.get((i10 - this.f40718c) - 1);
            m51 m51Var = (m51) view;
            m51Var.a(q41Var);
            m51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f), 0L, "tgs", document3, 0);
            m51Var.M = true;
            m51Var.d = document3;
            m51Var.f40429e = null;
        } else if (i16 == 4) {
            m51 m51Var2 = (m51) view;
            m51Var2.f40428c = i10;
            ImageReceiver imageReceiver = m51Var2.f40431n;
            ArrayList arrayList2 = d61Var.f37369w1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                q0Var = (kg.q0) d61Var.f37369w1.get(i10);
            } else {
                ArrayList arrayList3 = d61Var.f37372x1;
                if (arrayList3 != null && i10 >= (i12 = this.f40718c) && i10 - i12 < arrayList3.size()) {
                    q0Var = (kg.q0) d61Var.f37372x1.get(i10 - this.f40718c);
                } else {
                    return;
                }
            }
            if (m51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(m51Var2);
                m51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                m51Var2.h.onAttachedToWindow();
            }
            m51Var2.h.setParentView(q41Var);
            m51Var2.f40435x = q0Var;
            m51Var2.f40436y = false;
            m51Var2.d(d61Var.F.contains(q0Var), false);
            m51Var2.f40427b = false;
            m51Var2.invalidate();
            if (i14 == 13) {
                m51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f13825f));
            } else if (!q0Var.f13822b && q0Var.f13825f != null) {
                m51Var2.f40433s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f13825f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        m51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    } else {
                        kg.q0 q0Var2 = q0Var;
                        m51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), kg.m0.a());
                } else {
                    m51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                m51Var2.f40429e = null;
                m51Var2.d = null;
                m51Var2.setDrawable(null);
                l51 l51Var = m51Var2.F;
                if (l51Var != null) {
                    l51Var.setVisibility(8);
                    m51Var2.F.setImageReceiver(null);
                }
                if (tL_availableReaction == null && q0Var.f13822b) {
                    m51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f13825f));
                }
            } else {
                m51Var2.f40433s = false;
                m51Var2.f40429e = new org.telegram.ui.Components.y5(q0Var.f13826g, (Paint.FontMetricsInt) null);
                m51Var2.d = null;
                m51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) q41Var.Z2.get(m51Var2.f40429e.getDocumentId());
                if (p5Var == null) {
                    cacheType2 = d61Var.getCacheType();
                    p5Var = org.telegram.ui.Components.p5.n(i15, m51Var2.f40429e.getDocumentId(), null, cacheType2);
                    q41Var.Z2.put(m51Var2.f40429e.getDocumentId(), p5Var);
                }
                m51Var2.setDrawable(p5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.f13822b && q0Var.d) {
                m51Var2.b();
                m51Var2.F.setVisibility(0);
                m51Var2.setEmojicon(null);
                return;
            }
            if (q0Var.f13824e) {
                m51Var2.setEmojicon(q0Var.f13825f);
            } else {
                m51Var2.setEmojicon(null);
            }
            l51 l51Var2 = m51Var2.F;
            if (l51Var2 != null) {
                l51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            m51 m51Var3 = (m51) view;
            m51Var3.f40426a = false;
            m51Var3.f40428c = i10;
            m51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            m51Var3.setDrawable(null);
            ArrayList arrayList4 = d61Var.f37369w1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                kg.q0 q0Var3 = (kg.q0) d61Var.f37369w1.get(i10);
                m51Var3.f40435x = q0Var3;
                long j10 = q0Var3.f13826g;
                if (j10 == 0) {
                    boolean contains2 = d61Var.F.contains(q0Var3);
                    m51Var3.f40436y = true;
                    m51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var3.f13825f));
                    m51Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var3.f13822b && q0Var3.d) {
                    m51Var3.b();
                    m51Var3.F.setVisibility(0);
                } else {
                    l51 l51Var3 = m51Var3.F;
                    if (l51Var3 != null) {
                        l51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = d61Var.f37377z1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) d61Var.f37377z1.get(i10 - this.h);
                    if (!(document instanceof a61)) {
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
                    m51Var3.f40429e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                    m51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f22398id));
                } else {
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(l10.longValue(), (Paint.FontMetricsInt) null);
                    m51Var3.f40429e = y5Var;
                    m51Var3.d = y5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) q41Var.Z2.get(m51Var3.f40429e.getDocumentId());
                if (p5Var2 == null) {
                    cacheType = d61Var.getCacheType();
                    p5Var2 = org.telegram.ui.Components.p5.n(i15, m51Var3.f40429e.getDocumentId(), null, cacheType);
                    q41Var.Z2.put(m51Var3.f40429e.getDocumentId(), p5Var2);
                }
                m51Var3.setDrawable(p5Var2);
            }
            m51Var3.d(contains, false);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m51Var;
        boolean z10;
        d61 d61Var = this.f40723s;
        if (i10 == 6) {
            Context context = d61Var.getContext();
            if (d61Var.S == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            m51Var = new i51(d61Var, context, z10);
        } else if (i10 == 7) {
            m51Var = new org.telegram.ui.Components.fn(d61Var.getContext(), 23);
            m51Var.setTag("searchbox");
        } else {
            m51Var = new m51(d61Var, d61Var.getContext());
        }
        if (d61.c(d61Var)) {
            m51Var.setScaleX(0.0f);
            m51Var.setScaleY(0.0f);
        }
        return new f2.n1(m51Var);
    }
}
