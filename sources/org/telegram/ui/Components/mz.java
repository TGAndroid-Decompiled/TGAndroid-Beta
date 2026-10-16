package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mz extends lm0 {
    public final Context f27241c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f27242f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f27243n = new SparseArray();
    public final SparseIntArray f27244r = new SparseIntArray();
    public int f27245s;
    public final wz v;

    public mz(wz wzVar, Context context) {
        this.v = wzVar;
        this.f27241c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f44838a instanceof mm0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f27242f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        wz wzVar = this.v;
        ArrayList arrayList = wzVar.f30710d1;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = wzVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i12 = this.f27244r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = wzVar.E1;
            } else {
                Object obj2 = this.e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return wzVar.I1;
                    }
                    if ("recent".equals(obj2)) {
                        return wzVar.F1;
                    }
                    return wzVar.G1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = wzVar.E1;
            }
            return indexOf + i11;
        }
        int i13 = wzVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = wzVar.F1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mz.G():void");
    }

    @Override
    public final int h() {
        int i10 = this.f27245s;
        if (i10 != 0) {
            return i10 + 1;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 4;
        }
        Object obj = this.h.get(i10);
        if (obj != null) {
            if (obj instanceof TLRPC.Document) {
                if (obj instanceof TLRPC.TL_documentEmpty) {
                    return 7;
                }
                return 0;
            } else if (obj instanceof String) {
                if ("trend1".equals(obj)) {
                    return 5;
                }
                if ("trend2".equals(obj)) {
                    return 6;
                }
                return 3;
            } else {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void l() {
        G();
        super.l();
    }

    @Override
    public final void t(int i10, int i11) {
        G();
        super.t(i10, i11);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String str;
        int i12;
        wz wzVar = this.v;
        int i13 = wzVar.f30707c1;
        int i14 = b1Var.f44841f;
        View view = b1Var.f44838a;
        SparseArray sparseArray = this.h;
        if (i14 != 0) {
            ArrayList<TLRPC.Document> arrayList = null;
            TLRPC.Chat chat = null;
            int i15 = 1;
            boolean z10 = true;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 5) {
                            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                            if (MediaDataController.getInstance(i13).loadFeaturedPremium) {
                                i12 = R.string.FeaturedStickersPremium;
                            } else {
                                i12 = R.string.FeaturedStickers;
                            }
                            o8Var.c(LocaleController.getString(i12), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i10 != this.f27245s - 1) {
                        z10 = false;
                    }
                    n8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) view;
                o8Var2.setHeaderOnClick(null);
                if (i10 == wzVar.f30717f1) {
                    if (wzVar.f30720g1 && wzVar.f30723h1 == null) {
                        i11 = 0;
                    } else if (wzVar.f30723h1 != null) {
                        i11 = R.drawable.msg_mini_customize;
                    } else {
                        i11 = R.drawable.msg_close;
                    }
                    if (wzVar.J1 != null) {
                        chat = MessagesController.getInstance(i13).getChat(Long.valueOf(wzVar.J1.f18917id));
                    }
                    int i16 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    o8Var2.b(i11, LocaleController.formatString("CurrentGroupStickers", i16, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        o8Var2.b(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !wzVar.M2) {
                            o8Var2.setEdit(new View.OnClickListener(this) {
                                public final mz f26845b;

                                {
                                    this.f26845b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f26845b.v.f30760t1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f26845b.v.f30760t1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        o8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final mz f26845b;

                            {
                                this.f26845b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f26845b.v.f30760t1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f26845b.v.f30760t1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == wzVar.f30729j1) {
                    o8Var2.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == wzVar.f30732k1) {
                    o8Var2.b(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == wzVar.l1) {
                    o8Var2.b(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) view;
            if (i10 == this.f27245s) {
                int i17 = this.f27244r.get(i10 - 1, Integer.MIN_VALUE);
                if (i17 == Integer.MIN_VALUE) {
                    l3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i17);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = wzVar.f30729j1;
                    } else {
                        arrayList = wzVar.f30732k1;
                    }
                }
                if (arrayList == null) {
                    l3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    l3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.sk.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), wzVar.h.getHeight());
                    if (B > 0) {
                        i15 = B;
                    }
                    l3Var.setHeight(i15);
                    return;
                }
            }
            l3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        f8Var.d(document, null, this.f27243n.get(i10), null, false, false);
        f8Var.setRecent(wzVar.f30729j1.contains(document));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        wz wzVar = this.v;
        Context context = this.f27241c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new hg.d2(1, context, wzVar.Z1, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.l3(context);
                break;
            case 2:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(this.f27241c, false, false, wzVar.Z1, wzVar.f30727i2);
                o8Var.setOnIconClickListener(new rt(2, this, o8Var));
                frameLayout = o8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, w7.z5.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f21296a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.g0.m(14.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, textView2);
                textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, w7.z5.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final mz f26507b;

                    {
                        this.f26507b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                wz wzVar2 = this.f26507b.v;
                                wy wyVar = wzVar2.f30760t1;
                                if (wyVar != null) {
                                    wyVar.y(wzVar2.J1.f18917id);
                                    return;
                                }
                                return;
                            case 1:
                                wz wzVar3 = this.f26507b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wzVar3.f30707c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wzVar3.f30707c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f18943id).commit();
                                    mz mzVar = wzVar3.f30777y0;
                                    if (mzVar != null) {
                                        mzVar.t(1, 2);
                                    }
                                    wzVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.m2 m2Var = this.f26507b.v.Y1;
                                if (m2Var instanceof org.telegram.ui.fo) {
                                    ((org.telegram.ui.fo) m2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new s4.o0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new s4.o0(-1, wzVar.f30703b1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f27241c, false, false, wzVar.Z1, wzVar.f30727i2);
                o8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final mz f26507b;

                    {
                        this.f26507b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wz wzVar2 = this.f26507b.v;
                                wy wyVar = wzVar2.f30760t1;
                                if (wyVar != null) {
                                    wyVar.y(wzVar2.J1.f18917id);
                                    return;
                                }
                                return;
                            case 1:
                                wz wzVar3 = this.f26507b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wzVar3.f30707c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wzVar3.f30707c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f18943id).commit();
                                    mz mzVar = wzVar3.f30777y0;
                                    if (mzVar != null) {
                                        mzVar.t(1, 2);
                                    }
                                    wzVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.m2 m2Var = this.f26507b.v.Y1;
                                if (m2Var instanceof org.telegram.ui.fo) {
                                    ((org.telegram.ui.fo) m2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = o8Var2;
                break;
            case 6:
                uz uzVar = new uz(wzVar, false);
                wzVar.F0 = uzVar;
                bi.o0 o0Var = new bi.o0(wzVar, context, uzVar);
                o0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                o0Var.setClipToPadding(false);
                o0Var.i(new bi.o(4));
                o0Var.setOnItemClickListener(new j(this, 6));
                o0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = o0Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i11 = org.telegram.ui.ActionBar.g6.Me;
                linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(0.12f, wzVar.B(i11))));
                w7.b6.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final mz f26507b;

                    {
                        this.f26507b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wz wzVar2 = this.f26507b.v;
                                wy wyVar = wzVar2.f30760t1;
                                if (wyVar != null) {
                                    wyVar.y(wzVar2.J1.f18917id);
                                    return;
                                }
                                return;
                            case 1:
                                wz wzVar3 = this.f26507b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(wzVar3.f30707c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(wzVar3.f30707c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f18943id).commit();
                                    mz mzVar = wzVar3.f30777y0;
                                    if (mzVar != null) {
                                        mzVar.t(1, 2);
                                    }
                                    wzVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.m2 m2Var = this.f26507b.v.Y1;
                                if (m2Var instanceof org.telegram.ui.fo) {
                                    ((org.telegram.ui.fo) m2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(wzVar.B(i11), PorterDuff.Mode.SRC_IN));
                linearLayout2.addView(imageView, w7.z5.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(wzVar.B(i11));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, w7.z5.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, w7.z5.a(-1.0f, 8.0f, 8.0f, 8.0f, 8.0f, -1, 119));
                frameLayout = frameLayout2;
                break;
        }
        return new s4.b1(frameLayout);
    }
}
