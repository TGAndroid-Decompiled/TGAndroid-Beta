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
public final class ky extends qm0 {
    public int E;
    public final b00 F;
    public ArrayList h;
    public int f28157y;
    public int f28149c = -1;
    public int d = -1;
    public int f28150e = -1;
    public int f28151f = -1;
    public final ArrayList f28152n = new ArrayList();
    public final SparseIntArray f28153r = new SparseIntArray();
    public final SparseIntArray f28154s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f28155w = new SparseIntArray();
    public final ArrayList f28156x = new ArrayList();

    public ky(b00 b00Var) {
        this.F = b00Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 0 && i10 != 4 && i10 != 3 && i10 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i10, View view) {
        boolean z10;
        boolean z11;
        int min;
        Integer num;
        float f7;
        b00 b00Var = this.F;
        ArrayList arrayList = b00Var.f24774q1;
        int i11 = this.f28155w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            oy oyVar = (oy) arrayList.get(i11);
            if (!oyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f28156x.get(i11)).intValue();
                b00Var.f24768o1.add(Long.valueOf(oyVar.f29651b.f20095id));
                if (!UserConfig.getInstance(b00Var.f24731c1).isPremium() && !b00Var.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = b00Var.Q.J * 3;
                if ((oyVar.f29654f && !oyVar.f29655g && (oyVar.f29653e || z11)) || oyVar.h) {
                    min = oyVar.f29652c.size();
                } else {
                    min = Math.min(i12, oyVar.f29652c.size());
                }
                Integer num2 = null;
                if (oyVar.f29652c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                oyVar.h = true;
                int size = oyVar.f29652c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    b00Var.f24779r2 = view;
                    b00Var.f24783s2 = num.intValue();
                    b00Var.f24786t2 = num2.intValue() + num.intValue();
                    b00Var.f24789u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        b00Var.post(new jy(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        b00 b00Var = this.F;
        ArrayList arrayList = b00Var.f24765n1;
        if (b00Var.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f28152n);
        MediaDataController mediaDataController = MediaDataController.getInstance(b00Var.f24731c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20095id) || b00Var.f24771p1.contains(Long.valueOf(stickerSetCovered.set.f20095id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        zz zzVar = b00Var.T;
        if (zzVar != null) {
            zzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        b00 b00Var = this.F;
        ArrayList arrayList = b00Var.f24765n1;
        ArrayList arrayList2 = b00Var.f24768o1;
        int i11 = b00Var.f24731c1;
        ArrayList arrayList3 = b00Var.f24774q1;
        arrayList3.clear();
        if (b00Var.f24732c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !b00Var.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = b00Var.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                oy oyVar = new oy();
                oyVar.f29651b = b00Var.J1.emojiset;
                oyVar.f29652c = new ArrayList(groupStickerSetById.documents);
                oyVar.f29653e = true;
                oyVar.f29654f = true;
                oyVar.f29655g = false;
                oyVar.h = true;
                oyVar.f29656i = true;
                arrayList3.add(oyVar);
                TLRPC.StickerSet stickerSet2 = oyVar.f29651b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f20095id == stickerSet2.f20095id) {
                        arrayList4.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (!z11) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        oy oyVar2 = new oy();
                        oyVar2.f29651b = tL_messages_stickerSet2.set;
                        oyVar2.f29652c = new ArrayList(tL_messages_stickerSet2.documents);
                        oyVar2.f29653e = true;
                        oyVar2.f29654f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f20095id);
                        oyVar2.f29655g = false;
                        oyVar2.h = true;
                        arrayList3.add(oyVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z11) {
                    oy oyVar3 = new oy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    oyVar3.f29651b = stickerSet3;
                    oyVar3.f29652c = tL_messages_stickerSet3.documents;
                    oyVar3.f29653e = false;
                    oyVar3.f29654f = mediaDataController.isStickerPackInstalled(stickerSet3.f20095id);
                    oyVar3.f29655g = false;
                    oyVar3.h = z13;
                    arrayList3.add(oyVar3);
                    i10 = i14;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i15 = 0; i15 < tL_messages_stickerSet3.documents.size(); i15++) {
                            if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i15))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i15));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i15));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        oy oyVar4 = new oy();
                        oyVar4.f29651b = tL_messages_stickerSet3.set;
                        oyVar4.f29652c = new ArrayList(arrayList5);
                        oyVar4.f29653e = z13;
                        i10 = i14;
                        oyVar4.f29654f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20095id);
                        oyVar4.f29655g = false;
                        oyVar4.h = true;
                        arrayList3.add(oyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        oy oyVar5 = new oy();
                        oyVar5.f29651b = tL_messages_stickerSet3.set;
                        oyVar5.f29652c = new ArrayList(arrayList6);
                        oyVar5.f29653e = false;
                        oyVar5.f29654f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20095id);
                        oyVar5.f29655g = false;
                        oyVar5.h = arrayList2.contains(Long.valueOf(oyVar5.f29651b.f20095id));
                        arrayList3.add(oyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                oy oyVar6 = new oy();
                oyVar6.f29654f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20095id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                oyVar6.f29651b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    oyVar6.f29652c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        oyVar6.f29652c = stickerSet5.documents;
                    } else {
                        oyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    oyVar6.f29652c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = oyVar6.f29652c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < oyVar6.f29652c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) oyVar6.f29652c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    oyVar6.f29653e = !z12;
                    oyVar6.h = arrayList2.contains(Long.valueOf(oyVar6.f29651b.f20095id));
                    oyVar6.f29655g = true;
                    arrayList3.add(oyVar6);
                }
            }
            fy fyVar = b00Var.I;
            if (fyVar != null) {
                fyVar.p(b00Var.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ky.H():void");
    }

    @Override
    public final int h() {
        return this.f28157y;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d) {
            return 4;
        }
        if (i10 == this.f28149c || i10 == this.f28151f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f28153r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f24733d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f28155w.indexOfKey(i10) >= 0) {
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
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        oy oyVar;
        int i12;
        int i13 = i10;
        b00 b00Var = this.F;
        String[] strArr = b00Var.f24724a1;
        ay ayVar = b00Var.Q;
        int i14 = b00Var.f24731c1;
        ArrayList arrayList = b00Var.f24774q1;
        int i15 = d1Var.f47786f;
        View view = d1Var.f47782a;
        boolean z10 = true;
        oy oyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f28153r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        qy qyVar = (qy) view;
                        int i16 = this.f28155w.get(i13);
                        int i17 = ayVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            oyVar2 = (oy) arrayList.get(i16);
                        }
                        if (oyVar2 != null) {
                            qyVar.f30341a.setText("+" + ((oyVar2.f29652c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                sy syVar = (sy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                oy oyVar3 = (oy) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    oyVar = (oy) arrayList.get(i18);
                } else {
                    oyVar = null;
                }
                if (oyVar3 == null || !oyVar3.f29655g || (oyVar != null && !oyVar.f29653e && oyVar.f29654f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (oyVar3 != null && oyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(oyVar3.d, false);
                    oyVar3.d = null;
                }
                rg.p0 p0Var = syVar.h;
                if (oyVar3 != null) {
                    syVar.f30973s = oyVar3;
                    syVar.v = z10;
                    syVar.f30967b.l(oyVar3.f29651b.title, false);
                    TextView textView = syVar.f30968c;
                    if (oyVar3.f29656i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (oyVar3.f29654f && !oyVar3.f29651b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new ry(syVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new ry(syVar, 6), false);
                    }
                    syVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f28149c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f28151f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((oy) arrayList.get(i19 - strArr.length)).f29651b.title);
                    return;
                } catch (Exception unused) {
                    o8Var.b(0, "");
                    return;
                }
            } else {
                o8Var.b(0, strArr[i19]);
                return;
            }
        }
        jz jzVar = (jz) view;
        jzVar.f27879a = i13;
        jzVar.f27882e = null;
        if (b00Var.f24733d0) {
            i13--;
        }
        if (this.f28151f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = b00Var.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = b00Var.getRecentEmoji().get(i13);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l4 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l4 = null;
            str2 = str;
            document = null;
        } else {
            int i20 = 0;
            while (true) {
                String[][] strArr2 = EmojiData.dataColored;
                if (i20 < strArr2.length) {
                    String[] strArr3 = strArr2[i20];
                    int length2 = strArr3.length + 1;
                    int i21 = (i13 - size) - 1;
                    if (i21 >= 0 && i13 < size + length2) {
                        String str4 = strArr3[i21];
                        String str5 = Emoji.emojiColor.get(str4);
                        if (str5 != null) {
                            str = b00.g(str4, str5);
                            str2 = str4;
                        } else {
                            str = str4;
                        }
                    } else {
                        size += length2;
                        i20++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i14).isPremium();
                int i22 = ayVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28156x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    oy oyVar4 = (oy) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((oyVar4.f29654f && !oyVar4.f29655g && (oyVar4.f29653e || isPremium)) || oyVar4.h) {
                        min = oyVar4.f29652c.size();
                    } else {
                        min = Math.min(i22, oyVar4.f29652c.size());
                    }
                    int i24 = jzVar.f27879a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        jzVar.f27882e = oyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) oyVar4.f29652c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f20074id);
                        }
                        Long l10 = valueOf;
                        document = document2;
                        l4 = l10;
                    } else {
                        i23++;
                    }
                }
            }
            l4 = null;
            document = null;
            z10 = false;
        }
        if (l4 != null) {
            jzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            jzVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            jzVar.a(null, z10);
            if (jzVar.getSpan() == null || jzVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    jzVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                } else {
                    jzVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            jzVar.a(Emoji.getEmojiBigDrawable(str), z10);
            jzVar.setSpan(null);
        }
        jzVar.setTag(str2);
        jzVar.setContentDescription(str);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        b00 b00Var = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = b00Var.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(b00Var.getContext());
                                view.setLayoutParams(new s4.q0(-1, b00Var.f24727b1));
                                w0Var = view;
                            } else {
                                Context context = b00Var.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f30341a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, d6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new sy(b00Var, b00Var.getContext());
                        }
                    } else {
                        Context context2 = b00Var.getContext();
                        zz zzVar = new zz(b00Var, true);
                        b00Var.T = zzVar;
                        ai.w0 w0Var2 = new ai.w0(b00Var, context2, zzVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(b00Var.getContext());
                    r6 r6Var = new r6(frameLayout2.getContext(), false, false, false);
                    r6Var.b(0.3f, 250L, is.h);
                    r6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    r6Var.setTypeface(AndroidUtilities.bold());
                    r6Var.setTextColor(b00Var.B(org.telegram.ui.ActionBar.h6.Sh));
                    r6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, b00Var.B(org.telegram.ui.ActionBar.h6.Oh)));
                    frameLayout3.addView(r6Var, w7.x5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.x5.d(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.x5.d(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(b00Var.getContext(), true, false, b00Var.Z1, b00Var.f24752i2);
                o8Var.setOnIconClickListener(new f0(this, 13));
                w0Var = o8Var;
            }
        } else {
            w0Var = new jz(b00Var.getContext());
        }
        return new s4.d1(w0Var);
    }
}
