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
public final class ux extends vl0 {
    public int E;
    public final lz F;
    public ArrayList h;
    public int f28943y;
    public int f28936c = -1;
    public int d = -1;
    public int e = -1;
    public int f28937f = -1;
    public final ArrayList f28938n = new ArrayList();
    public final SparseIntArray f28939r = new SparseIntArray();
    public final SparseIntArray f28940s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f28941w = new SparseIntArray();
    public final ArrayList f28942x = new ArrayList();

    public ux(lz lzVar) {
        this.F = lzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42963f;
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
        lz lzVar = this.F;
        ArrayList arrayList = lzVar.f26278q1;
        int i11 = this.f28941w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            yx yxVar = (yx) arrayList.get(i11);
            if (!yxVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f28942x.get(i11)).intValue();
                lzVar.f26272o1.add(Long.valueOf(yxVar.f30715b.f18362id));
                if (!UserConfig.getInstance(lzVar.f26236c1).isPremium() && !lzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = lzVar.Q.J * 3;
                if ((yxVar.f30717f && !yxVar.f30718g && (yxVar.e || z11)) || yxVar.h) {
                    min = yxVar.f30716c.size();
                } else {
                    min = Math.min(i12, yxVar.f30716c.size());
                }
                Integer num2 = null;
                if (yxVar.f30716c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                yxVar.h = true;
                int size = yxVar.f30716c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    lzVar.f26283r2 = view;
                    lzVar.f26287s2 = num.intValue();
                    lzVar.f26290t2 = num2.intValue() + num.intValue();
                    lzVar.f26293u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        lzVar.post(new tx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        lz lzVar = this.F;
        ArrayList arrayList = lzVar.f26269n1;
        if (lzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f28938n);
        MediaDataController mediaDataController = MediaDataController.getInstance(lzVar.f26236c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18362id) || lzVar.f26275p1.contains(Long.valueOf(stickerSetCovered.set.f18362id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        jz jzVar = lzVar.T;
        if (jzVar != null) {
            jzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        lz lzVar = this.F;
        ArrayList arrayList = lzVar.f26269n1;
        ArrayList arrayList2 = lzVar.f26272o1;
        int i11 = lzVar.f26236c1;
        ArrayList arrayList3 = lzVar.f26278q1;
        arrayList3.clear();
        if (lzVar.f26237c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !lzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = lzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                yx yxVar = new yx();
                yxVar.f30715b = lzVar.J1.emojiset;
                yxVar.f30716c = new ArrayList(groupStickerSetById.documents);
                yxVar.e = true;
                yxVar.f30717f = true;
                yxVar.f30718g = false;
                yxVar.h = true;
                yxVar.f30719i = true;
                arrayList3.add(yxVar);
                TLRPC.StickerSet stickerSet2 = yxVar.f30715b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f18362id == stickerSet2.f18362id) {
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
                        yx yxVar2 = new yx();
                        yxVar2.f30715b = tL_messages_stickerSet2.set;
                        yxVar2.f30716c = new ArrayList(tL_messages_stickerSet2.documents);
                        yxVar2.e = true;
                        yxVar2.f30717f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f18362id);
                        yxVar2.f30718g = false;
                        yxVar2.h = true;
                        arrayList3.add(yxVar2);
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
                    yx yxVar3 = new yx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    yxVar3.f30715b = stickerSet3;
                    yxVar3.f30716c = tL_messages_stickerSet3.documents;
                    yxVar3.e = false;
                    yxVar3.f30717f = mediaDataController.isStickerPackInstalled(stickerSet3.f18362id);
                    yxVar3.f30718g = false;
                    yxVar3.h = z13;
                    arrayList3.add(yxVar3);
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
                        yx yxVar4 = new yx();
                        yxVar4.f30715b = tL_messages_stickerSet3.set;
                        yxVar4.f30716c = new ArrayList(arrayList5);
                        yxVar4.e = z13;
                        i10 = i14;
                        yxVar4.f30717f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18362id);
                        yxVar4.f30718g = false;
                        yxVar4.h = true;
                        arrayList3.add(yxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        yx yxVar5 = new yx();
                        yxVar5.f30715b = tL_messages_stickerSet3.set;
                        yxVar5.f30716c = new ArrayList(arrayList6);
                        yxVar5.e = false;
                        yxVar5.f30717f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18362id);
                        yxVar5.f30718g = false;
                        yxVar5.h = arrayList2.contains(Long.valueOf(yxVar5.f30715b.f18362id));
                        arrayList3.add(yxVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                yx yxVar6 = new yx();
                yxVar6.f30717f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18362id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                yxVar6.f30715b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    yxVar6.f30716c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        yxVar6.f30716c = stickerSet5.documents;
                    } else {
                        yxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    yxVar6.f30716c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = yxVar6.f30716c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < yxVar6.f30716c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) yxVar6.f30716c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    yxVar6.e = !z12;
                    yxVar6.h = arrayList2.contains(Long.valueOf(yxVar6.f30715b.f18362id));
                    yxVar6.f30718g = true;
                    arrayList3.add(yxVar6);
                }
            }
            px pxVar = lzVar.I;
            if (pxVar != null) {
                pxVar.p(lzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.H():void");
    }

    @Override
    public final int h() {
        return this.f28943y;
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
        if (i10 == this.f28936c || i10 == this.f28937f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f28939r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f26238d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f28941w.indexOfKey(i10) >= 0) {
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
        yx yxVar;
        int i12;
        int i13 = i10;
        lz lzVar = this.F;
        String[] strArr = lzVar.f26229a1;
        lx lxVar = lzVar.Q;
        int i14 = lzVar.f26236c1;
        ArrayList arrayList = lzVar.f26278q1;
        int i15 = c1Var.f42963f;
        View view = c1Var.f42960a;
        boolean z10 = true;
        yx yxVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f28939r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        ay ayVar = (ay) view;
                        int i16 = this.f28941w.get(i13);
                        int i17 = lxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            yxVar2 = (yx) arrayList.get(i16);
                        }
                        if (yxVar2 != null) {
                            ayVar.f22818a.setText("+" + ((yxVar2.f30716c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                dy dyVar = (dy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                yx yxVar3 = (yx) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    yxVar = (yx) arrayList.get(i18);
                } else {
                    yxVar = null;
                }
                if (yxVar3 == null || !yxVar3.f30718g || (yxVar != null && !yxVar.e && yxVar.f30717f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (yxVar3 != null && yxVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(yxVar3.d, false);
                    yxVar3.d = null;
                }
                rg.p0 p0Var = dyVar.h;
                if (yxVar3 != null) {
                    dyVar.f23759s = yxVar3;
                    dyVar.v = z10;
                    dyVar.f23754b.l(yxVar3.f30715b.title, false);
                    TextView textView = dyVar.f23755c;
                    if (yxVar3.f30719i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (yxVar3.f30717f && !yxVar3.f30715b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new cy(dyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new cy(dyVar, 6), false);
                    }
                    dyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f28936c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f28937f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((yx) arrayList.get(i19 - strArr.length)).f30715b.title);
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
        uy uyVar = (uy) view;
        uyVar.f28945a = i13;
        uyVar.e = null;
        if (lzVar.f26238d0) {
            i13--;
        }
        if (this.f28937f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = lzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = lzVar.getRecentEmoji().get(i13);
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
                            str = lz.g(str4, str5);
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
                int i22 = lxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28942x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    yx yxVar4 = (yx) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((yxVar4.f30717f && !yxVar4.f30718g && (yxVar4.e || isPremium)) || yxVar4.h) {
                        min = yxVar4.f30716c.size();
                    } else {
                        min = Math.min(i22, yxVar4.f30716c.size());
                    }
                    int i24 = uyVar.f28945a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        uyVar.e = yxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) yxVar4.f30716c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f18341id);
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
            uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            uyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            uyVar.a(null, z10);
            if (uyVar.getSpan() == null || uyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    uyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                } else {
                    uyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            uyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            uyVar.setSpan(null);
        }
        uyVar.setTag(str2);
        uyVar.setContentDescription(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        lz lzVar = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = lzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(lzVar.getContext());
                                view.setLayoutParams(new s4.p0(-1, lzVar.f26232b1));
                                w0Var = view;
                            } else {
                                Context context = lzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f22818a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new dy(lzVar, lzVar.getContext());
                        }
                    } else {
                        Context context2 = lzVar.getContext();
                        jz jzVar = new jz(lzVar, true);
                        lzVar.T = jzVar;
                        ai.w0 w0Var2 = new ai.w0(lzVar, context2, jzVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(lzVar.getContext());
                    p6 p6Var = new p6(frameLayout2.getContext(), false, false, false);
                    p6Var.b(0.3f, 250L, rr.h);
                    p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    p6Var.setTypeface(AndroidUtilities.bold());
                    p6Var.setTextColor(lzVar.z(org.telegram.ui.ActionBar.h6.Sh));
                    p6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, lzVar.z(org.telegram.ui.ActionBar.h6.Oh)));
                    frameLayout3.addView(p6Var, w7.y5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(lzVar.getContext(), true, false, lzVar.Z1, lzVar.f26256i2);
                o8Var.setOnIconClickListener(new f0(this, 14));
                w0Var = o8Var;
            }
        } else {
            w0Var = new uy(lzVar.getContext());
        }
        return new s4.c1(w0Var);
    }
}
