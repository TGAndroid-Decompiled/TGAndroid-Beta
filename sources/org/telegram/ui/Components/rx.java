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
public final class rx extends rl0 {
    public int B;
    public final kz C;
    public ArrayList h;
    public int f28555y;
    public int f28548c = -1;
    public int d = -1;
    public int e = -1;
    public int f28549f = -1;
    public final ArrayList f28550n = new ArrayList();
    public final SparseIntArray f28551r = new SparseIntArray();
    public final SparseIntArray f28552s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f28553w = new SparseIntArray();
    public final ArrayList f28554x = new ArrayList();

    public rx(kz kzVar) {
        this.C = kzVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 0 && i10 != 4 && i10 != 3 && i10 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i10, View view) {
        boolean z4;
        boolean z10;
        int min;
        Integer num;
        float f10;
        kz kzVar = this.C;
        ArrayList arrayList = kzVar.f26451n1;
        int i11 = this.f28553w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            vx vxVar = (vx) arrayList.get(i11);
            if (!vxVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int intValue = ((Integer) this.f28554x.get(i11)).intValue();
                kzVar.l1.add(Long.valueOf(vxVar.f30100b.f19211id));
                if (!UserConfig.getInstance(kzVar.Z0).isPremium() && !kzVar.R0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i12 = kzVar.N.J * 3;
                if ((vxVar.f30102f && !vxVar.f30103g && (vxVar.e || z10)) || vxVar.h) {
                    min = vxVar.f30101c.size();
                } else {
                    min = Math.min(i12, vxVar.f30101c.size());
                }
                Integer num2 = null;
                if (vxVar.f30101c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                vxVar.h = true;
                int size = vxVar.f30101c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    kzVar.f26458p2 = view;
                    kzVar.f26461q2 = num.intValue();
                    kzVar.f26465r2 = num2.intValue() + num.intValue();
                    kzVar.f26469s2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z4) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        kzVar.post(new qx(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z4) {
        kz kzVar = this.C;
        ArrayList arrayList = kzVar.f26443k1;
        if (kzVar.K2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f28550n);
        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.Z0);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19211id) || kzVar.f26447m1.contains(Long.valueOf(stickerSetCovered.set.f19211id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z4);
        H();
        iz izVar = kzVar.Q;
        if (izVar != null) {
            izVar.l();
        }
        f2.q.c(new bg.a(this, arrayList2, 1), false).b(this);
    }

    public final void G(boolean z4) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        kz kzVar = this.C;
        ArrayList arrayList = kzVar.f26443k1;
        ArrayList arrayList2 = kzVar.l1;
        int i11 = kzVar.Z0;
        ArrayList arrayList3 = kzVar.f26451n1;
        arrayList3.clear();
        if (kzVar.Z1) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z4 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z12 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !kzVar.R0) {
                z10 = false;
            } else {
                z10 = true;
            }
            TLRPC.ChatFull chatFull = kzVar.G1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                vx vxVar = new vx();
                vxVar.f30100b = kzVar.G1.emojiset;
                vxVar.f30101c = new ArrayList(groupStickerSetById.documents);
                vxVar.e = true;
                vxVar.f30102f = true;
                vxVar.f30103g = false;
                vxVar.h = true;
                vxVar.f30104i = true;
                arrayList3.add(vxVar);
                TLRPC.StickerSet stickerSet2 = vxVar.f30100b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f19211id == stickerSet2.f19211id) {
                        arrayList4.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (!z10) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        vx vxVar2 = new vx();
                        vxVar2.f30100b = tL_messages_stickerSet2.set;
                        vxVar2.f30101c = new ArrayList(tL_messages_stickerSet2.documents);
                        vxVar2.e = true;
                        vxVar2.f30102f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f19211id);
                        vxVar2.f30103g = false;
                        vxVar2.h = true;
                        arrayList3.add(vxVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z10) {
                    vx vxVar3 = new vx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    vxVar3.f30100b = stickerSet3;
                    vxVar3.f30101c = tL_messages_stickerSet3.documents;
                    vxVar3.e = false;
                    vxVar3.f30102f = mediaDataController.isStickerPackInstalled(stickerSet3.f19211id);
                    vxVar3.f30103g = false;
                    vxVar3.h = z12;
                    arrayList3.add(vxVar3);
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
                        vx vxVar4 = new vx();
                        vxVar4.f30100b = tL_messages_stickerSet3.set;
                        vxVar4.f30101c = new ArrayList(arrayList5);
                        vxVar4.e = z12;
                        i10 = i14;
                        vxVar4.f30102f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f19211id);
                        vxVar4.f30103g = false;
                        vxVar4.h = true;
                        arrayList3.add(vxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        vx vxVar5 = new vx();
                        vxVar5.f30100b = tL_messages_stickerSet3.set;
                        vxVar5.f30101c = new ArrayList(arrayList6);
                        vxVar5.e = false;
                        vxVar5.f30102f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f19211id);
                        vxVar5.f30103g = false;
                        vxVar5.h = arrayList2.contains(Long.valueOf(vxVar5.f30100b.f19211id));
                        arrayList3.add(vxVar5);
                    }
                }
                i14 = i10 + 1;
                z12 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                vx vxVar6 = new vx();
                vxVar6.f30102f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19211id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                vxVar6.f30100b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    vxVar6.f30101c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        vxVar6.f30101c = stickerSet5.documents;
                    } else {
                        vxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    vxVar6.f30101c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = vxVar6.f30101c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < vxVar6.f30101c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) vxVar6.f30101c.get(i17))) {
                                z11 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    vxVar6.e = !z11;
                    vxVar6.h = arrayList2.contains(Long.valueOf(vxVar6.f30100b.f19211id));
                    vxVar6.f30103g = true;
                    arrayList3.add(vxVar6);
                }
            }
            fw fwVar = kzVar.F;
            if (fwVar != null) {
                fwVar.p(kzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rx.H():void");
    }

    @Override
    public final int h() {
        return this.f28555y;
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
        if (i10 == this.f28548c || i10 == this.f28549f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f28551r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.C.f26410a0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f28553w.indexOfKey(i10) >= 0) {
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
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        vx vxVar;
        int i12;
        int i13 = i10;
        kz kzVar = this.C;
        String[] strArr = kzVar.X0;
        jx jxVar = kzVar.N;
        int i14 = kzVar.Z0;
        ArrayList arrayList = kzVar.f26451n1;
        int i15 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z4 = true;
        vx vxVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f28551r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        xx xxVar = (xx) view;
                        int i16 = this.f28553w.get(i13);
                        int i17 = jxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            vxVar2 = (vx) arrayList.get(i16);
                        }
                        if (vxVar2 != null) {
                            xxVar.f30765a.setText("+" + ((vxVar2.f30101c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                zx zxVar = (zx) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                vx vxVar3 = (vx) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    vxVar = (vx) arrayList.get(i18);
                } else {
                    vxVar = null;
                }
                if (vxVar3 == null || !vxVar3.f30103g || (vxVar != null && !vxVar.e && vxVar.f30102f && !UserConfig.getInstance(i14).isPremium())) {
                    z4 = false;
                }
                if (vxVar3 != null && vxVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(vxVar3.d, false);
                    vxVar3.d = null;
                }
                eg.c1 c1Var = zxVar.h;
                if (vxVar3 != null) {
                    zxVar.f31470s = vxVar3;
                    zxVar.v = z4;
                    zxVar.f31465b.l(vxVar3.f30100b.title, false);
                    TextView textView = zxVar.f31466c;
                    if (vxVar3.f30104i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (vxVar3.f30102f && !vxVar3.f30100b.official) {
                        c1Var.a(LocaleController.getString(R.string.Restore), new yx(zxVar, 5), false);
                    } else {
                        c1Var.a(LocaleController.getString(R.string.Unlock), new yx(zxVar, 6), false);
                    }
                    zxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f28548c) {
                m8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f28549f) {
                m8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    m8Var.b(0, ((vx) arrayList.get(i19 - strArr.length)).f30100b.title);
                    return;
                } catch (Exception unused) {
                    m8Var.b(0, "");
                    return;
                }
            } else {
                m8Var.b(0, strArr[i19]);
                return;
            }
        }
        sy syVar = (sy) view;
        syVar.f28828a = i13;
        syVar.e = null;
        if (kzVar.f26410a0) {
            i13--;
        }
        if (this.f28549f >= 0) {
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
                int i22 = jxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28554x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    vx vxVar4 = (vx) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((vxVar4.f30102f && !vxVar4.f30103g && (vxVar4.e || isPremium)) || vxVar4.h) {
                        min = vxVar4.f30101c.size();
                    } else {
                        min = Math.min(i22, vxVar4.f30101c.size());
                    }
                    int i24 = syVar.f28828a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        syVar.e = vxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) vxVar4.f30101c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f19190id);
                        }
                        Long l11 = valueOf;
                        document = document2;
                        l10 = l11;
                    } else {
                        i23++;
                    }
                }
            }
            l10 = null;
            document = null;
            z4 = false;
        }
        if (l10 != null) {
            syVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            syVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            syVar.a(null, z4);
            if (syVar.getSpan() == null || syVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    syVar.setSpan(new u5(document, (Paint.FontMetricsInt) null));
                } else {
                    syVar.setSpan(new u5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            syVar.a(Emoji.getEmojiBigDrawable(str), z4);
            syVar.setSpan(null);
        }
        syVar.setTag(str2);
        syVar.setContentDescription(str);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        lh.e1 e1Var;
        kz kzVar = this.C;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.W1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(kzVar.getContext());
                                view.setLayoutParams(new f2.w0(-1, kzVar.Y0));
                                e1Var = view;
                            } else {
                                Context context = kzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f30765a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, k7.b6.e(-2, -2, 17));
                                e1Var = frameLayout;
                            }
                        } else {
                            e1Var = new zx(kzVar, kzVar.getContext());
                        }
                    } else {
                        Context context2 = kzVar.getContext();
                        iz izVar = new iz(kzVar, true);
                        kzVar.Q = izVar;
                        lh.e1 e1Var2 = new lh.e1(kzVar, context2, izVar);
                        e1Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        e1Var2.setClipToPadding(false);
                        e1Var2.i(new nh.k(1));
                        e1Var2.setOnItemClickListener(new k(this, 5));
                        e1Var = e1Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(kzVar.getContext());
                    k6 k6Var = new k6(frameLayout2.getContext(), false, false, false);
                    k6Var.b(0.3f, 250L, nr.h);
                    k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    k6Var.setTypeface(AndroidUtilities.bold());
                    k6Var.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.Sh));
                    k6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, kzVar.A(org.telegram.ui.ActionBar.j6.Oh)));
                    frameLayout3.addView(k6Var, k7.b6.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, k7.b6.c(-1.0f, -1));
                    eg.c1 c1Var = new eg.c1(frameLayout2.getContext(), f6Var, false);
                    c1Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(c1Var, k7.b6.c(-1.0f, -1));
                    e1Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(kzVar.getContext(), true, false, kzVar.W1, kzVar.f26429f2);
                m8Var.setOnIconClickListener(new g0(this, 14));
                e1Var = m8Var;
            }
        } else {
            e1Var = new sy(kzVar.getContext());
        }
        return new f2.l1(e1Var);
    }
}
