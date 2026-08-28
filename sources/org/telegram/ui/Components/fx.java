package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fx extends vk0 {
    public int A;
    public final wy B;
    public ArrayList h;
    public int f28596y;
    public int f28588c = -1;
    public int d = -1;
    public int f28589e = -1;
    public int f28590f = -1;
    public final ArrayList f28591n = new ArrayList();
    public final SparseIntArray f28592r = new SparseIntArray();
    public final SparseIntArray f28593s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f28594w = new SparseIntArray();
    public final ArrayList f28595x = new ArrayList();

    public fx(wy wyVar) {
        this.B = wyVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 4 && i9 != 3 && i9 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i9, View view) {
        boolean z10;
        boolean z11;
        int min;
        Integer num;
        float f10;
        wy wyVar = this.B;
        ArrayList arrayList = wyVar.f34422m1;
        int i10 = this.f28594w.get(i9);
        if (i10 >= 0 && i10 < arrayList.size()) {
            jx jxVar = (jx) arrayList.get(i10);
            if (!jxVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f28595x.get(i10)).intValue();
                wyVar.f34418k1.add(Long.valueOf(jxVar.f29865b.f22407id));
                if (!UserConfig.getInstance(wyVar.Y0).isPremium() && !wyVar.Q0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i11 = wyVar.M.J * 3;
                if ((jxVar.f29868f && !jxVar.f29869g && (jxVar.f29867e || z11)) || jxVar.h) {
                    min = jxVar.f29866c.size();
                } else {
                    min = Math.min(i11, jxVar.f29866c.size());
                }
                Integer num2 = null;
                if (jxVar.f29866c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                jxVar.h = true;
                int size = jxVar.f29866c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    wyVar.f34430o2 = view;
                    wyVar.f34433p2 = num.intValue();
                    wyVar.f34436q2 = num2.intValue() + num.intValue();
                    wyVar.f34440r2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        wyVar.post(new ex(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        wy wyVar = this.B;
        ArrayList arrayList = wyVar.f34415j1;
        if (wyVar.J2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f28591n);
        MediaDataController mediaDataController = MediaDataController.getInstance(wyVar.Y0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i9);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22407id) || wyVar.l1.contains(Long.valueOf(stickerSetCovered.set.f22407id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        uy uyVar = wyVar.P;
        if (uyVar != null) {
            uyVar.l();
        }
        f2.s.c(new of.g(this, arrayList2, 1), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i9;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        wy wyVar = this.B;
        ArrayList arrayList = wyVar.f34415j1;
        ArrayList arrayList2 = wyVar.f34418k1;
        int i10 = wyVar.Y0;
        ArrayList arrayList3 = wyVar.f34422m1;
        arrayList3.clear();
        if (wyVar.Y1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i10).isPremium() && !wyVar.Q0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = wyVar.F1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                jx jxVar = new jx();
                jxVar.f29865b = wyVar.F1.emojiset;
                jxVar.f29866c = new ArrayList(groupStickerSetById.documents);
                jxVar.f29867e = true;
                jxVar.f29868f = true;
                jxVar.f29869g = false;
                jxVar.h = true;
                jxVar.f29870i = true;
                arrayList3.add(jxVar);
                TLRPC.StickerSet stickerSet2 = jxVar.f29865b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f22407id == stickerSet2.f22407id) {
                        arrayList4.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (!z11) {
                int i12 = 0;
                while (i12 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        jx jxVar2 = new jx();
                        jxVar2.f29865b = tL_messages_stickerSet2.set;
                        jxVar2.f29866c = new ArrayList(tL_messages_stickerSet2.documents);
                        jxVar2.f29867e = true;
                        jxVar2.f29868f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id);
                        jxVar2.f29869g = false;
                        jxVar2.h = true;
                        arrayList3.add(jxVar2);
                        arrayList4.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            int i13 = 0;
            while (i13 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z11) {
                    jx jxVar3 = new jx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    jxVar3.f29865b = stickerSet3;
                    jxVar3.f29866c = tL_messages_stickerSet3.documents;
                    jxVar3.f29867e = false;
                    jxVar3.f29868f = mediaDataController.isStickerPackInstalled(stickerSet3.f22407id);
                    jxVar3.f29869g = false;
                    jxVar3.h = z13;
                    arrayList3.add(jxVar3);
                    i9 = i13;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        jx jxVar4 = new jx();
                        jxVar4.f29865b = tL_messages_stickerSet3.set;
                        jxVar4.f29866c = new ArrayList(arrayList5);
                        jxVar4.f29867e = z13;
                        i9 = i13;
                        jxVar4.f29868f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f22407id);
                        jxVar4.f29869g = false;
                        jxVar4.h = true;
                        arrayList3.add(jxVar4);
                    } else {
                        i9 = i13;
                    }
                    if (arrayList6.size() > 0) {
                        jx jxVar5 = new jx();
                        jxVar5.f29865b = tL_messages_stickerSet3.set;
                        jxVar5.f29866c = new ArrayList(arrayList6);
                        jxVar5.f29867e = false;
                        jxVar5.f29868f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f22407id);
                        jxVar5.f29869g = false;
                        jxVar5.h = arrayList2.contains(Long.valueOf(jxVar5.f29865b.f22407id));
                        arrayList3.add(jxVar5);
                    }
                }
                i13 = i9 + 1;
                z13 = true;
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                jx jxVar6 = new jx();
                jxVar6.f29868f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22407id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                jxVar6.f29865b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    jxVar6.f29866c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        jxVar6.f29866c = stickerSet5.documents;
                    } else {
                        jxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    jxVar6.f29866c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = jxVar6.f29866c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < jxVar6.f29866c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) jxVar6.f29866c.get(i16))) {
                                z12 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    jxVar6.f29867e = !z12;
                    jxVar6.h = arrayList2.contains(Long.valueOf(jxVar6.f29865b.f22407id));
                    jxVar6.f29869g = true;
                    arrayList3.add(jxVar6);
                }
            }
            vv vvVar = wyVar.E;
            if (vvVar != null) {
                vvVar.p(wyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fx.H():void");
    }

    @Override
    public final int h() {
        return this.f28596y;
    }

    @Override
    public final long i(int i9) {
        return i9;
    }

    @Override
    public final int j(int i9) {
        if (i9 == this.d) {
            return 4;
        }
        if (i9 == this.f28588c || i9 == this.f28590f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f28592r;
        if (sparseIntArray.indexOfKey(i9) >= 0) {
            if (sparseIntArray.get(i9) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.B.W && i9 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i9) >= 0) {
                return 3;
            }
            if (this.f28594w.indexOfKey(i9) >= 0) {
                return 6;
            }
            return 0;
        }
    }

    @Override
    public final void l() {
        F(false);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i10;
        Long valueOf;
        jx jxVar;
        int i11;
        int i12 = i9;
        wy wyVar = this.B;
        String[] strArr = wyVar.W0;
        xw xwVar = wyVar.M;
        int i13 = wyVar.Y0;
        ArrayList arrayList = wyVar.f34422m1;
        int i14 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = true;
        jx jxVar2 = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.f28592r;
            if (i14 != 1) {
                if (i14 != 5) {
                    if (i14 == 6) {
                        lx lxVar = (lx) view;
                        int i15 = this.f28594w.get(i12);
                        int i16 = xwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            jxVar2 = (jx) arrayList.get(i15);
                        }
                        if (jxVar2 != null) {
                            lxVar.f30579a.setText("+" + ((jxVar2.f29866c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                nx nxVar = (nx) view;
                int length = sparseIntArray.get(i12) - strArr.length;
                jx jxVar3 = (jx) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    jxVar = (jx) arrayList.get(i17);
                } else {
                    jxVar = null;
                }
                if (jxVar3 == null || !jxVar3.f29869g || (jxVar != null && !jxVar.f29867e && jxVar.f29868f && !UserConfig.getInstance(i13).isPremium())) {
                    z10 = false;
                }
                if (jxVar3 != null && jxVar3.d != null) {
                    MediaDataController.getInstance(i13).getStickerSet(jxVar3.d, false);
                    jxVar3.d = null;
                }
                zf.p0 p0Var = nxVar.h;
                if (jxVar3 != null) {
                    nxVar.f31200s = jxVar3;
                    nxVar.v = z10;
                    nxVar.f31194b.l(jxVar3.f29865b.title, false);
                    TextView textView = nxVar.f31195c;
                    if (jxVar3.f29870i) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    if (jxVar3.f29868f && !jxVar3.f29865b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new mx(nxVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new mx(nxVar, 6), false);
                    }
                    nxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.getClass();
            int i18 = sparseIntArray.get(i12);
            if (i12 == this.f28588c) {
                m8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i12 == this.f28590f) {
                m8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    m8Var.b(0, ((jx) arrayList.get(i18 - strArr.length)).f29865b.title);
                    return;
                } catch (Exception unused) {
                    m8Var.b(0, "");
                    return;
                }
            } else {
                m8Var.b(0, strArr[i18]);
                return;
            }
        }
        fy fyVar = (fy) view;
        fyVar.f28598a = i12;
        fyVar.f28601e = null;
        if (wyVar.W) {
            i12--;
        }
        if (this.f28590f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = wyVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = wyVar.getRecentEmoji().get(i12);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l10 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l10 = null;
            str2 = str;
            document = null;
        } else {
            int i19 = 0;
            while (true) {
                String[][] strArr2 = EmojiData.dataColored;
                if (i19 < strArr2.length) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i12 - size) - 1;
                    if (i20 >= 0 && i12 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = Emoji.emojiColor.get(str4);
                        if (str5 != null) {
                            str = wy.g(str4, str5);
                            str2 = str4;
                        } else {
                            str = str4;
                        }
                    } else {
                        size += length2;
                        i19++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i13).isPremium();
                int i21 = xwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28595x;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    jx jxVar4 = (jx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((jxVar4.f29868f && !jxVar4.f29869g && (jxVar4.f29867e || isPremium)) || jxVar4.h) {
                        min = jxVar4.f29866c.size();
                    } else {
                        min = Math.min(i21, jxVar4.f29866c.size());
                    }
                    int i23 = fyVar.f28598a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        fyVar.f28601e = jxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) jxVar4.f29866c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f22386id);
                        }
                        Long l11 = valueOf;
                        document = document2;
                        l10 = l11;
                    } else {
                        i22++;
                    }
                }
            }
            l10 = null;
            document = null;
            z10 = false;
        }
        if (l10 != null) {
            fyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            fyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            fyVar.a(null, z10);
            if (fyVar.getSpan() == null || fyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    fyVar.setSpan(new t5(document, (Paint.FontMetricsInt) null));
                } else {
                    fyVar.setSpan(new t5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            fyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            fyVar.setSpan(null);
        }
        fyVar.setTag(str2);
        fyVar.setContentDescription(str);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        gh.f1 f1Var;
        wy wyVar = this.B;
        org.telegram.ui.ActionBar.b6 b6Var = wyVar.V1;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                View view = new View(wyVar.getContext());
                                view.setLayoutParams(new f2.a1(-1, wyVar.X0));
                                f1Var = view;
                            } else {
                                Context context = wyVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f30579a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, g7.e6.e(-2, -2, 17));
                                f1Var = frameLayout;
                            }
                        } else {
                            f1Var = new nx(wyVar, wyVar.getContext());
                        }
                    } else {
                        Context context2 = wyVar.getContext();
                        uy uyVar = new uy(wyVar, true);
                        wyVar.P = uyVar;
                        gh.f1 f1Var2 = new gh.f1(wyVar, context2, uyVar);
                        f1Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        f1Var2.setClipToPadding(false);
                        f1Var2.i(new ih.l(2));
                        f1Var2.setOnItemClickListener(new j(this, 5));
                        f1Var = f1Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(wyVar.getContext());
                    j6 j6Var = new j6(frameLayout2.getContext(), false, false, false);
                    j6Var.b(0.3f, 250L, gr.h);
                    j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    j6Var.setTypeface(AndroidUtilities.bold());
                    j6Var.setTextColor(wyVar.z(org.telegram.ui.ActionBar.f6.Sh));
                    j6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{8.0f}, wyVar.z(org.telegram.ui.ActionBar.f6.Oh)));
                    frameLayout3.addView(j6Var, g7.e6.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, g7.e6.c(-1.0f, -1));
                    zf.p0 p0Var = new zf.p0(frameLayout2.getContext(), b6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, g7.e6.c(-1.0f, -1));
                    f1Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(wyVar.getContext(), true, false, wyVar.V1, wyVar.f34400e2);
                m8Var.setOnIconClickListener(new f0(this, 14));
                f1Var = m8Var;
            }
        } else {
            f1Var = new fy(wyVar.getContext());
        }
        return new f2.q1(f1Var);
    }
}
