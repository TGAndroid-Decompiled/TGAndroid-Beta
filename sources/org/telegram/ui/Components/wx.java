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
public final class wx extends yl0 {
    public int E;
    public final nz F;
    public ArrayList h;
    public int f30082y;
    public int f30075c = -1;
    public int d = -1;
    public int e = -1;
    public int f30076f = -1;
    public final ArrayList f30077n = new ArrayList();
    public final SparseIntArray f30078r = new SparseIntArray();
    public final SparseIntArray f30079s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f30080w = new SparseIntArray();
    public final ArrayList f30081x = new ArrayList();

    public wx(nz nzVar) {
        this.F = nzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43071f;
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
        nz nzVar = this.F;
        ArrayList arrayList = nzVar.f26860q1;
        int i11 = this.f30080w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            ay ayVar = (ay) arrayList.get(i11);
            if (!ayVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f30081x.get(i11)).intValue();
                nzVar.f26854o1.add(Long.valueOf(ayVar.f22725b.f18379id));
                if (!UserConfig.getInstance(nzVar.f26818c1).isPremium() && !nzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = nzVar.Q.J * 3;
                if ((ayVar.f22727f && !ayVar.f22728g && (ayVar.e || z11)) || ayVar.h) {
                    min = ayVar.f22726c.size();
                } else {
                    min = Math.min(i12, ayVar.f22726c.size());
                }
                Integer num2 = null;
                if (ayVar.f22726c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                ayVar.h = true;
                int size = ayVar.f22726c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    nzVar.f26865r2 = view;
                    nzVar.f26869s2 = num.intValue();
                    nzVar.f26872t2 = num2.intValue() + num.intValue();
                    nzVar.f26875u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        nzVar.post(new vx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        nz nzVar = this.F;
        ArrayList arrayList = nzVar.f26851n1;
        if (nzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f30077n);
        MediaDataController mediaDataController = MediaDataController.getInstance(nzVar.f26818c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18379id) || nzVar.f26857p1.contains(Long.valueOf(stickerSetCovered.set.f18379id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        lz lzVar = nzVar.T;
        if (lzVar != null) {
            lzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        nz nzVar = this.F;
        ArrayList arrayList = nzVar.f26851n1;
        ArrayList arrayList2 = nzVar.f26854o1;
        int i11 = nzVar.f26818c1;
        ArrayList arrayList3 = nzVar.f26860q1;
        arrayList3.clear();
        if (nzVar.f26819c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !nzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = nzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                ay ayVar = new ay();
                ayVar.f22725b = nzVar.J1.emojiset;
                ayVar.f22726c = new ArrayList(groupStickerSetById.documents);
                ayVar.e = true;
                ayVar.f22727f = true;
                ayVar.f22728g = false;
                ayVar.h = true;
                ayVar.f22729i = true;
                arrayList3.add(ayVar);
                TLRPC.StickerSet stickerSet2 = ayVar.f22725b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f18379id == stickerSet2.f18379id) {
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
                        ay ayVar2 = new ay();
                        ayVar2.f22725b = tL_messages_stickerSet2.set;
                        ayVar2.f22726c = new ArrayList(tL_messages_stickerSet2.documents);
                        ayVar2.e = true;
                        ayVar2.f22727f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f18379id);
                        ayVar2.f22728g = false;
                        ayVar2.h = true;
                        arrayList3.add(ayVar2);
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
                    ay ayVar3 = new ay();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    ayVar3.f22725b = stickerSet3;
                    ayVar3.f22726c = tL_messages_stickerSet3.documents;
                    ayVar3.e = false;
                    ayVar3.f22727f = mediaDataController.isStickerPackInstalled(stickerSet3.f18379id);
                    ayVar3.f22728g = false;
                    ayVar3.h = z13;
                    arrayList3.add(ayVar3);
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
                        ay ayVar4 = new ay();
                        ayVar4.f22725b = tL_messages_stickerSet3.set;
                        ayVar4.f22726c = new ArrayList(arrayList5);
                        ayVar4.e = z13;
                        i10 = i14;
                        ayVar4.f22727f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18379id);
                        ayVar4.f22728g = false;
                        ayVar4.h = true;
                        arrayList3.add(ayVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        ay ayVar5 = new ay();
                        ayVar5.f22725b = tL_messages_stickerSet3.set;
                        ayVar5.f22726c = new ArrayList(arrayList6);
                        ayVar5.e = false;
                        ayVar5.f22727f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18379id);
                        ayVar5.f22728g = false;
                        ayVar5.h = arrayList2.contains(Long.valueOf(ayVar5.f22725b.f18379id));
                        arrayList3.add(ayVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ay ayVar6 = new ay();
                ayVar6.f22727f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18379id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                ayVar6.f22725b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    ayVar6.f22726c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        ayVar6.f22726c = stickerSet5.documents;
                    } else {
                        ayVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    ayVar6.f22726c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = ayVar6.f22726c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < ayVar6.f22726c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) ayVar6.f22726c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    ayVar6.e = !z12;
                    ayVar6.h = arrayList2.contains(Long.valueOf(ayVar6.f22725b.f18379id));
                    ayVar6.f22728g = true;
                    arrayList3.add(ayVar6);
                }
            }
            rx rxVar = nzVar.I;
            if (rxVar != null) {
                rxVar.p(nzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wx.H():void");
    }

    @Override
    public final int h() {
        return this.f30082y;
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
        if (i10 == this.f30075c || i10 == this.f30076f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f30078r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f26820d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f30080w.indexOfKey(i10) >= 0) {
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
        ay ayVar;
        int i12;
        int i13 = i10;
        nz nzVar = this.F;
        String[] strArr = nzVar.f26811a1;
        nx nxVar = nzVar.Q;
        int i14 = nzVar.f26818c1;
        ArrayList arrayList = nzVar.f26860q1;
        int i15 = c1Var.f43071f;
        View view = c1Var.f43068a;
        boolean z10 = true;
        ay ayVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f30078r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        dy dyVar = (dy) view;
                        int i16 = this.f30080w.get(i13);
                        int i17 = nxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            ayVar2 = (ay) arrayList.get(i16);
                        }
                        if (ayVar2 != null) {
                            dyVar.f23778a.setText("+" + ((ayVar2.f22726c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                fy fyVar = (fy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                ay ayVar3 = (ay) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    ayVar = (ay) arrayList.get(i18);
                } else {
                    ayVar = null;
                }
                if (ayVar3 == null || !ayVar3.f22728g || (ayVar != null && !ayVar.e && ayVar.f22727f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (ayVar3 != null && ayVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(ayVar3.d, false);
                    ayVar3.d = null;
                }
                rg.p0 p0Var = fyVar.h;
                if (ayVar3 != null) {
                    fyVar.f24384s = ayVar3;
                    fyVar.v = z10;
                    fyVar.f24379b.l(ayVar3.f22725b.title, false);
                    TextView textView = fyVar.f24380c;
                    if (ayVar3.f22729i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (ayVar3.f22727f && !ayVar3.f22725b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new ey(fyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new ey(fyVar, 6), false);
                    }
                    fyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f30075c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f30076f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((ay) arrayList.get(i19 - strArr.length)).f22725b.title);
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
        wy wyVar = (wy) view;
        wyVar.f30086a = i13;
        wyVar.e = null;
        if (nzVar.f26820d0) {
            i13--;
        }
        if (this.f30076f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = nzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = nzVar.getRecentEmoji().get(i13);
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
                            str = nz.g(str4, str5);
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
                int i22 = nxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f30081x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    ay ayVar4 = (ay) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((ayVar4.f22727f && !ayVar4.f22728g && (ayVar4.e || isPremium)) || ayVar4.h) {
                        min = ayVar4.f22726c.size();
                    } else {
                        min = Math.min(i22, ayVar4.f22726c.size());
                    }
                    int i24 = wyVar.f30086a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        wyVar.e = ayVar4;
                        TLRPC.Document document2 = (TLRPC.Document) ayVar4.f22726c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f18358id);
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
            wyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            wyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            wyVar.a(null, z10);
            if (wyVar.getSpan() == null || wyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    wyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                } else {
                    wyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            wyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            wyVar.setSpan(null);
        }
        wyVar.setTag(str2);
        wyVar.setContentDescription(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        nz nzVar = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = nzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(nzVar.getContext());
                                view.setLayoutParams(new s4.p0(-1, nzVar.f26814b1));
                                w0Var = view;
                            } else {
                                Context context = nzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f23778a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new fy(nzVar, nzVar.getContext());
                        }
                    } else {
                        Context context2 = nzVar.getContext();
                        lz lzVar = new lz(nzVar, true);
                        nzVar.T = lzVar;
                        ai.w0 w0Var2 = new ai.w0(nzVar, context2, lzVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(nzVar.getContext());
                    p6 p6Var = new p6(frameLayout2.getContext(), false, false, false);
                    p6Var.b(0.3f, 250L, tr.h);
                    p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    p6Var.setTypeface(AndroidUtilities.bold());
                    p6Var.setTextColor(nzVar.z(org.telegram.ui.ActionBar.h6.Sh));
                    p6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, nzVar.z(org.telegram.ui.ActionBar.h6.Oh)));
                    frameLayout3.addView(p6Var, w7.y5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(nzVar.getContext(), true, false, nzVar.Z1, nzVar.f26838i2);
                o8Var.setOnIconClickListener(new f0(this, 14));
                w0Var = o8Var;
            }
        } else {
            w0Var = new wy(nzVar.getContext());
        }
        return new s4.c1(w0Var);
    }
}
