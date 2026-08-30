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
public final class bz extends rl0 {
    public final Context f23764c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f23765f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f23766n = new SparseArray();
    public final SparseIntArray f23767r = new SparseIntArray();
    public int f23768s;
    public final kz v;

    public bz(kz kzVar, Context context) {
        this.v = kzVar;
        this.f23764c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f5785a instanceof sl0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f23765f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        kz kzVar = this.v;
        ArrayList arrayList = kzVar.f26411a1;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = kzVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i12 = this.f23767r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = kzVar.B1;
            } else {
                Object obj2 = this.e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return kzVar.F1;
                    }
                    if ("recent".equals(obj2)) {
                        return kzVar.C1;
                    }
                    return kzVar.D1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = kzVar.B1;
            }
            return indexOf + i11;
        }
        int i13 = kzVar.D1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = kzVar.C1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bz.G():void");
    }

    @Override
    public final int h() {
        int i10 = this.f23768s;
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String str;
        int i12;
        kz kzVar = this.v;
        int i13 = kzVar.Z0;
        int i14 = l1Var.f5788f;
        View view = l1Var.f5785a;
        SparseArray sparseArray = this.h;
        if (i14 != 0) {
            ArrayList<TLRPC.Document> arrayList = null;
            TLRPC.Chat chat = null;
            int i15 = 1;
            boolean z4 = true;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 5) {
                            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                            if (MediaDataController.getInstance(i13).loadFeaturedPremium) {
                                i12 = R.string.FeaturedStickersPremium;
                            } else {
                                i12 = R.string.FeaturedStickers;
                            }
                            m8Var.c(LocaleController.getString(i12), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i10 != this.f23768s - 1) {
                        z4 = false;
                    }
                    l8Var.setIsLast(z4);
                    return;
                }
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.setHeaderOnClick(null);
                if (i10 == kzVar.f26418c1) {
                    if (kzVar.f26421d1 && kzVar.f26424e1 == null) {
                        i11 = 0;
                    } else if (kzVar.f26424e1 != null) {
                        i11 = R.drawable.msg_mini_customize;
                    } else {
                        i11 = R.drawable.msg_close;
                    }
                    if (kzVar.G1 != null) {
                        chat = MessagesController.getInstance(i13).getChat(Long.valueOf(kzVar.G1.f19185id));
                    }
                    int i16 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    m8Var2.b(i11, LocaleController.formatString("CurrentGroupStickers", i16, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        m8Var2.b(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !kzVar.J2) {
                            m8Var2.setEdit(new View.OnClickListener(this) {
                                public final bz f31476b;

                                {
                                    this.f31476b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f31476b.v.f26460q1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f31476b.v.f26460q1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        m8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final bz f31476b;

                            {
                                this.f31476b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f31476b.v.f26460q1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f31476b.v.f26460q1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == kzVar.f26431g1) {
                    m8Var2.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == kzVar.f26434h1) {
                    m8Var2.b(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == kzVar.f26437i1) {
                    m8Var2.b(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 == this.f23768s) {
                int i17 = this.f23767r.get(i10 - 1, Integer.MIN_VALUE);
                if (i17 == Integer.MIN_VALUE) {
                    k3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i17);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = kzVar.f26431g1;
                    } else {
                        arrayList = kzVar.f26434h1;
                    }
                }
                if (arrayList == null) {
                    k3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    k3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int z10 = org.telegram.ui.b.z(82.0f, (int) Math.ceil(arrayList.size() / this.d), kzVar.h.getHeight());
                    if (z10 > 0) {
                        i15 = z10;
                    }
                    k3Var.setHeight(i15);
                    return;
                }
            }
            k3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        d8Var.d(document, null, this.f23766n.get(i10), null, false, false);
        d8Var.setRecent(kzVar.f26431g1.contains(document));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        kz kzVar = this.v;
        Context context = this.f23764c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new az(0, context, kzVar.W1, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(this.f23764c, false, false, kzVar.W1, kzVar.f26429f2);
                m8Var.setOnIconClickListener(new w2(17, this, m8Var));
                frameLayout = m8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, k7.b6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f21363a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, k7.b6.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final bz f31181b;

                    {
                        this.f31181b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                kz kzVar2 = this.f31181b.v;
                                ky kyVar = kzVar2.f26460q1;
                                if (kyVar != null) {
                                    kyVar.y(kzVar2.G1.f19185id);
                                    return;
                                }
                                return;
                            case 1:
                                kz kzVar3 = this.f31181b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(kzVar3.Z0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(kzVar3.Z0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f19211id).commit();
                                    bz bzVar = kzVar3.f26476v0;
                                    if (bzVar != null) {
                                        bzVar.t(1, 2);
                                    }
                                    kzVar3.Z(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.p2 p2Var = this.f31181b.v.V1;
                                if (p2Var instanceof org.telegram.ui.xn) {
                                    ((org.telegram.ui.xn) p2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new f2.w0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new f2.w0(-1, kzVar.Y0));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(this.f23764c, false, false, kzVar.W1, kzVar.f26429f2);
                m8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final bz f31181b;

                    {
                        this.f31181b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                kz kzVar2 = this.f31181b.v;
                                ky kyVar = kzVar2.f26460q1;
                                if (kyVar != null) {
                                    kyVar.y(kzVar2.G1.f19185id);
                                    return;
                                }
                                return;
                            case 1:
                                kz kzVar3 = this.f31181b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(kzVar3.Z0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(kzVar3.Z0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f19211id).commit();
                                    bz bzVar = kzVar3.f26476v0;
                                    if (bzVar != null) {
                                        bzVar.t(1, 2);
                                    }
                                    kzVar3.Z(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.p2 p2Var = this.f31181b.v.V1;
                                if (p2Var instanceof org.telegram.ui.xn) {
                                    ((org.telegram.ui.xn) p2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = m8Var2;
                break;
            case 6:
                iz izVar = new iz(kzVar, false);
                kzVar.C0 = izVar;
                lh.e1 e1Var = new lh.e1(kzVar, context, izVar);
                e1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                e1Var.setClipToPadding(false);
                e1Var.i(new nh.k(2));
                e1Var.setOnItemClickListener(new k(this, 6));
                e1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = e1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i11 = org.telegram.ui.ActionBar.j6.Me;
                linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, kzVar.A(i11))));
                k7.d6.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final bz f31181b;

                    {
                        this.f31181b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                kz kzVar2 = this.f31181b.v;
                                ky kyVar = kzVar2.f26460q1;
                                if (kyVar != null) {
                                    kyVar.y(kzVar2.G1.f19185id);
                                    return;
                                }
                                return;
                            case 1:
                                kz kzVar3 = this.f31181b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(kzVar3.Z0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(kzVar3.Z0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f19211id).commit();
                                    bz bzVar = kzVar3.f26476v0;
                                    if (bzVar != null) {
                                        bzVar.t(1, 2);
                                    }
                                    kzVar3.Z(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.p2 p2Var = this.f31181b.v.V1;
                                if (p2Var instanceof org.telegram.ui.xn) {
                                    ((org.telegram.ui.xn) p2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i11), PorterDuff.Mode.SRC_IN));
                linearLayout2.addView(imageView, k7.b6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(kzVar.A(i11));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, k7.b6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, k7.b6.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new f2.l1(frameLayout);
    }
}
