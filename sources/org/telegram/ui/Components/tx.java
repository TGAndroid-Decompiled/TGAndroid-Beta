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
public final class tx extends xl0 {
    public int E;
    public final kz F;
    public ArrayList h;
    public int f28553y;
    public int f28546c = -1;
    public int d = -1;
    public int e = -1;
    public int f28547f = -1;
    public final ArrayList f28548n = new ArrayList();
    public final SparseIntArray f28549r = new SparseIntArray();
    public final SparseIntArray f28550s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f28551w = new SparseIntArray();
    public final ArrayList f28552x = new ArrayList();

    public tx(kz kzVar) {
        this.F = kzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42998f;
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
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.f25900q1;
        int i11 = this.f28551w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            xx xxVar = (xx) arrayList.get(i11);
            if (!xxVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f28552x.get(i11)).intValue();
                kzVar.f25894o1.add(Long.valueOf(xxVar.f30422b.f18370id));
                if (!UserConfig.getInstance(kzVar.f25858c1).isPremium() && !kzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = kzVar.Q.J * 3;
                if ((xxVar.f30424f && !xxVar.f30425g && (xxVar.e || z11)) || xxVar.h) {
                    min = xxVar.f30423c.size();
                } else {
                    min = Math.min(i12, xxVar.f30423c.size());
                }
                Integer num2 = null;
                if (xxVar.f30423c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                xxVar.h = true;
                int size = xxVar.f30423c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    kzVar.f25905r2 = view;
                    kzVar.f25909s2 = num.intValue();
                    kzVar.f25912t2 = num2.intValue() + num.intValue();
                    kzVar.f25915u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        kzVar.post(new sx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.f25891n1;
        if (kzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f28548n);
        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.f25858c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18370id) || kzVar.f25897p1.contains(Long.valueOf(stickerSetCovered.set.f18370id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        iz izVar = kzVar.T;
        if (izVar != null) {
            izVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        kz kzVar = this.F;
        ArrayList arrayList = kzVar.f25891n1;
        ArrayList arrayList2 = kzVar.f25894o1;
        int i11 = kzVar.f25858c1;
        ArrayList arrayList3 = kzVar.f25900q1;
        arrayList3.clear();
        if (kzVar.f25859c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !kzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = kzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                xx xxVar = new xx();
                xxVar.f30422b = kzVar.J1.emojiset;
                xxVar.f30423c = new ArrayList(groupStickerSetById.documents);
                xxVar.e = true;
                xxVar.f30424f = true;
                xxVar.f30425g = false;
                xxVar.h = true;
                xxVar.f30426i = true;
                arrayList3.add(xxVar);
                TLRPC.StickerSet stickerSet2 = xxVar.f30422b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f18370id == stickerSet2.f18370id) {
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
                        xx xxVar2 = new xx();
                        xxVar2.f30422b = tL_messages_stickerSet2.set;
                        xxVar2.f30423c = new ArrayList(tL_messages_stickerSet2.documents);
                        xxVar2.e = true;
                        xxVar2.f30424f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f18370id);
                        xxVar2.f30425g = false;
                        xxVar2.h = true;
                        arrayList3.add(xxVar2);
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
                    xx xxVar3 = new xx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    xxVar3.f30422b = stickerSet3;
                    xxVar3.f30423c = tL_messages_stickerSet3.documents;
                    xxVar3.e = false;
                    xxVar3.f30424f = mediaDataController.isStickerPackInstalled(stickerSet3.f18370id);
                    xxVar3.f30425g = false;
                    xxVar3.h = z13;
                    arrayList3.add(xxVar3);
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
                        xx xxVar4 = new xx();
                        xxVar4.f30422b = tL_messages_stickerSet3.set;
                        xxVar4.f30423c = new ArrayList(arrayList5);
                        xxVar4.e = z13;
                        i10 = i14;
                        xxVar4.f30424f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18370id);
                        xxVar4.f30425g = false;
                        xxVar4.h = true;
                        arrayList3.add(xxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        xx xxVar5 = new xx();
                        xxVar5.f30422b = tL_messages_stickerSet3.set;
                        xxVar5.f30423c = new ArrayList(arrayList6);
                        xxVar5.e = false;
                        xxVar5.f30424f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18370id);
                        xxVar5.f30425g = false;
                        xxVar5.h = arrayList2.contains(Long.valueOf(xxVar5.f30422b.f18370id));
                        arrayList3.add(xxVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                xx xxVar6 = new xx();
                xxVar6.f30424f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18370id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                xxVar6.f30422b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    xxVar6.f30423c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        xxVar6.f30423c = stickerSet5.documents;
                    } else {
                        xxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    xxVar6.f30423c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = xxVar6.f30423c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < xxVar6.f30423c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) xxVar6.f30423c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    xxVar6.e = !z12;
                    xxVar6.h = arrayList2.contains(Long.valueOf(xxVar6.f30422b.f18370id));
                    xxVar6.f30425g = true;
                    arrayList3.add(xxVar6);
                }
            }
            ox oxVar = kzVar.I;
            if (oxVar != null) {
                oxVar.p(kzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tx.H():void");
    }

    @Override
    public final int h() {
        return this.f28553y;
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
        if (i10 == this.f28546c || i10 == this.f28547f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f28549r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f25860d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f28551w.indexOfKey(i10) >= 0) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        xx xxVar;
        int i12;
        int i13 = i10;
        kz kzVar = this.F;
        String[] strArr = kzVar.f25851a1;
        kx kxVar = kzVar.Q;
        int i14 = kzVar.f25858c1;
        ArrayList arrayList = kzVar.f25900q1;
        int i15 = c1Var.f42998f;
        View view = c1Var.f42995a;
        boolean z10 = true;
        xx xxVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f28549r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        zx zxVar = (zx) view;
                        int i16 = this.f28551w.get(i13);
                        int i17 = kxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            xxVar2 = (xx) arrayList.get(i16);
                        }
                        if (xxVar2 != null) {
                            zxVar.f30973a.setText("+" + ((xxVar2.f30423c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                cy cyVar = (cy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                xx xxVar3 = (xx) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    xxVar = (xx) arrayList.get(i18);
                } else {
                    xxVar = null;
                }
                if (xxVar3 == null || !xxVar3.f30425g || (xxVar != null && !xxVar.e && xxVar.f30424f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (xxVar3 != null && xxVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(xxVar3.d, false);
                    xxVar3.d = null;
                }
                rg.p0 p0Var = cyVar.h;
                if (xxVar3 != null) {
                    cyVar.f23496s = xxVar3;
                    cyVar.v = z10;
                    cyVar.f23491b.l(xxVar3.f30422b.title, false);
                    TextView textView = cyVar.f23492c;
                    if (xxVar3.f30426i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (xxVar3.f30424f && !xxVar3.f30422b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new ay(cyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new ay(cyVar, 6), false);
                    }
                    cyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f28546c) {
                p8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f28547f) {
                p8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    p8Var.b(0, ((xx) arrayList.get(i19 - strArr.length)).f30422b.title);
                    return;
                } catch (Exception unused) {
                    p8Var.b(0, "");
                    return;
                }
            } else {
                p8Var.b(0, strArr[i19]);
                return;
            }
        }
        ty tyVar = (ty) view;
        tyVar.f28556a = i13;
        tyVar.e = null;
        if (kzVar.f25860d0) {
            i13--;
        }
        if (this.f28547f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = kzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = kzVar.getRecentEmoji().get(i13);
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
                            str = kz.g(str4, str5);
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
                int i22 = kxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28552x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    xx xxVar4 = (xx) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((xxVar4.f30424f && !xxVar4.f30425g && (xxVar4.e || isPremium)) || xxVar4.h) {
                        min = xxVar4.f30423c.size();
                    } else {
                        min = Math.min(i22, xxVar4.f30423c.size());
                    }
                    int i24 = tyVar.f28556a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        tyVar.e = xxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) xxVar4.f30423c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f18349id);
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
            tyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            tyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            tyVar.a(null, z10);
            if (tyVar.getSpan() == null || tyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    tyVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                } else {
                    tyVar.setSpan(new y5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            tyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            tyVar.setSpan(null);
        }
        tyVar.setTag(str2);
        tyVar.setContentDescription(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        kz kzVar = this.F;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(kzVar.getContext());
                                view.setLayoutParams(new s4.p0(-1, kzVar.f25854b1));
                                w0Var = view;
                            } else {
                                Context context = kzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f30973a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, f6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new cy(kzVar, kzVar.getContext());
                        }
                    } else {
                        Context context2 = kzVar.getContext();
                        iz izVar = new iz(kzVar, true);
                        kzVar.T = izVar;
                        ai.w0 w0Var2 = new ai.w0(kzVar, context2, izVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(kzVar.getContext());
                    o6 o6Var = new o6(frameLayout2.getContext(), false, false, false);
                    o6Var.b(0.3f, 250L, qr.h);
                    o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    o6Var.setTypeface(AndroidUtilities.bold());
                    o6Var.setTextColor(kzVar.z(org.telegram.ui.ActionBar.j6.Sh));
                    o6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, kzVar.z(org.telegram.ui.ActionBar.j6.Oh)));
                    frameLayout3.addView(o6Var, w7.y5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), f6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(kzVar.getContext(), true, false, kzVar.Z1, kzVar.f25878i2);
                p8Var.setOnIconClickListener(new f0(this, 14));
                w0Var = p8Var;
            }
        } else {
            w0Var = new ty(kzVar.getContext());
        }
        return new s4.c1(w0Var);
    }
}
