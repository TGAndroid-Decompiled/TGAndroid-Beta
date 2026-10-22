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
public final class kz extends im0 {
    public final Context f27985c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f27986f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f27987n = new SparseArray();
    public final SparseIntArray f27988r = new SparseIntArray();
    public int f27989s;
    public final tz v;

    public kz(tz tzVar, Context context) {
        this.v = tzVar;
        this.f27985c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f45920a instanceof jm0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f27986f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        tz tzVar = this.v;
        ArrayList arrayList = tzVar.f30729d1;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = tzVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i12 = this.f27988r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = tzVar.E1;
            } else {
                Object obj2 = this.e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return tzVar.I1;
                    }
                    if ("recent".equals(obj2)) {
                        return tzVar.F1;
                    }
                    return tzVar.G1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = tzVar.E1;
            }
            return indexOf + i11;
        }
        int i13 = tzVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = tzVar.F1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz.G():void");
    }

    @Override
    public final int h() {
        int i10 = this.f27989s;
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
        tz tzVar = this.v;
        int i13 = tzVar.f30726c1;
        int i14 = b1Var.f45923f;
        View view = b1Var.f45920a;
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
                            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                            if (MediaDataController.getInstance(i13).loadFeaturedPremium) {
                                i12 = R.string.FeaturedStickersPremium;
                            } else {
                                i12 = R.string.FeaturedStickers;
                            }
                            n8Var.c(LocaleController.getString(i12), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i10 != this.f27989s - 1) {
                        z10 = false;
                    }
                    m8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                n8Var2.setHeaderOnClick(null);
                if (i10 == tzVar.f30736f1) {
                    if (tzVar.f30739g1 && tzVar.f30742h1 == null) {
                        i11 = 0;
                    } else if (tzVar.f30742h1 != null) {
                        i11 = R.drawable.msg_mini_customize;
                    } else {
                        i11 = R.drawable.msg_close;
                    }
                    if (tzVar.J1 != null) {
                        chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tzVar.J1.f20280id));
                    }
                    int i16 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    n8Var2.b(i11, LocaleController.formatString("CurrentGroupStickers", i16, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        n8Var2.b(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !tzVar.M2) {
                            n8Var2.setEdit(new View.OnClickListener(this) {
                                public final kz f27683b;

                                {
                                    this.f27683b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f27683b.v.f30779t1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f27683b.v.f30779t1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        n8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final kz f27683b;

                            {
                                this.f27683b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f27683b.v.f30779t1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f27683b.v.f30779t1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == tzVar.f30748j1) {
                    n8Var2.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == tzVar.f30751k1) {
                    n8Var2.b(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == tzVar.l1) {
                    n8Var2.b(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 == this.f27989s) {
                int i17 = this.f27988r.get(i10 - 1, Integer.MIN_VALUE);
                if (i17 == Integer.MIN_VALUE) {
                    k3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.e.get(i17);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = tzVar.f30748j1;
                    } else {
                        arrayList = tzVar.f30751k1;
                    }
                }
                if (arrayList == null) {
                    k3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    k3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.ok.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), tzVar.h.getHeight());
                    if (B > 0) {
                        i15 = B;
                    }
                    k3Var.setHeight(i15);
                    return;
                }
            }
            k3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
        e8Var.d(document, null, this.f27987n.get(i10), null, false, false);
        e8Var.setRecent(tzVar.f30748j1.contains(document));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        tz tzVar = this.v;
        Context context = this.f27985c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new hg.d2(1, context, tzVar.Z1, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(this.f27985c, false, false, tzVar.Z1, tzVar.f30746i2);
                n8Var.setOnIconClickListener(new ca(12, this, n8Var));
                frameLayout = n8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, w7.z5.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f22612a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.g0.m(14.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), 1, textView2);
                textView2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, w7.z5.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final kz f27355b;

                    {
                        this.f27355b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                tz tzVar2 = this.f27355b.v;
                                uy uyVar = tzVar2.f30779t1;
                                if (uyVar != null) {
                                    uyVar.y(tzVar2.J1.f20280id);
                                    return;
                                }
                                return;
                            case 1:
                                tz tzVar3 = this.f27355b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tzVar3.f30726c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(tzVar3.f30726c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f20306id).commit();
                                    kz kzVar = tzVar3.f30796y0;
                                    if (kzVar != null) {
                                        kzVar.t(1, 2);
                                    }
                                    tzVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.f27355b.v.Y1;
                                if (n2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) n2Var).da();
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
                view.setLayoutParams(new s4.o0(-1, tzVar.f30722b1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(this.f27985c, false, false, tzVar.Z1, tzVar.f30746i2);
                n8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final kz f27355b;

                    {
                        this.f27355b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                tz tzVar2 = this.f27355b.v;
                                uy uyVar = tzVar2.f30779t1;
                                if (uyVar != null) {
                                    uyVar.y(tzVar2.J1.f20280id);
                                    return;
                                }
                                return;
                            case 1:
                                tz tzVar3 = this.f27355b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tzVar3.f30726c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(tzVar3.f30726c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f20306id).commit();
                                    kz kzVar = tzVar3.f30796y0;
                                    if (kzVar != null) {
                                        kzVar.t(1, 2);
                                    }
                                    tzVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.f27355b.v.Y1;
                                if (n2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) n2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = n8Var2;
                break;
            case 6:
                rz rzVar = new rz(tzVar, false);
                tzVar.F0 = rzVar;
                ai.u1 u1Var = new ai.u1(tzVar, context, rzVar);
                u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                u1Var.setClipToPadding(false);
                u1Var.i(new ci.l(4));
                u1Var.setOnItemClickListener(new j(this, 6));
                u1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = u1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i11 = org.telegram.ui.ActionBar.h6.Me;
                linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.12f, tzVar.A(i11))));
                w7.b6.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final kz f27355b;

                    {
                        this.f27355b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                tz tzVar2 = this.f27355b.v;
                                uy uyVar = tzVar2.f30779t1;
                                if (uyVar != null) {
                                    uyVar.y(tzVar2.J1.f20280id);
                                    return;
                                }
                                return;
                            case 1:
                                tz tzVar3 = this.f27355b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(tzVar3.f30726c1).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(tzVar3.f30726c1).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f20306id).commit();
                                    kz kzVar = tzVar3.f30796y0;
                                    if (kzVar != null) {
                                        kzVar.t(1, 2);
                                    }
                                    tzVar3.X(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.n2 n2Var = this.f27355b.v.Y1;
                                if (n2Var instanceof org.telegram.ui.qn) {
                                    ((org.telegram.ui.qn) n2Var).da();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(tzVar.A(i11), PorterDuff.Mode.SRC_IN));
                linearLayout2.addView(imageView, w7.z5.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(tzVar.A(i11));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, w7.z5.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, w7.z5.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new s4.b1(frameLayout);
    }
}
