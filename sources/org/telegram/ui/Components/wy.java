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
public final class wy extends il0 {
    public final Context f34509c;
    public int d;
    public final SparseArray f34510e = new SparseArray();
    public final HashMap f34511f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f34512n = new SparseArray();
    public final SparseIntArray f34513r = new SparseIntArray();
    public int f34514s;
    public final fz v;

    public wy(fz fzVar, Context context) {
        this.v = fzVar;
        this.f34509c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f6432a instanceof jl0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f34511f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i10) {
        int indexOf;
        int i11;
        fz fzVar = this.v;
        ArrayList arrayList = fzVar.Z0;
        Object obj = this.h.get(i10);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i10 == 0) {
                i10 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = fzVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.d = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i12 = this.f34513r.get(i10, Integer.MIN_VALUE);
            if (i12 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i11 = fzVar.A1;
            } else {
                Object obj2 = this.f34510e.get(i12);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return fzVar.E1;
                    }
                    if ("recent".equals(obj2)) {
                        return fzVar.B1;
                    }
                    return fzVar.C1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i11 = fzVar.A1;
            }
            return indexOf + i11;
        }
        int i13 = fzVar.C1;
        if (i13 >= 0) {
            return i13;
        }
        int i14 = fzVar.B1;
        if (i14 >= 0) {
            return i14;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wy.G():void");
    }

    @Override
    public final int h() {
        int i10 = this.f34514s;
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        String str;
        int i12;
        fz fzVar = this.v;
        int i13 = fzVar.Y0;
        int i14 = n1Var.f6436f;
        View view = n1Var.f6432a;
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
                            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                            if (MediaDataController.getInstance(i13).loadFeaturedPremium) {
                                i12 = R.string.FeaturedStickersPremium;
                            } else {
                                i12 = R.string.FeaturedStickers;
                            }
                            k8Var.c(LocaleController.getString(i12), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                    if (i10 != this.f34514s - 1) {
                        z10 = false;
                    }
                    j8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.k8 k8Var2 = (org.telegram.ui.Cells.k8) view;
                k8Var2.setHeaderOnClick(null);
                if (i10 == fzVar.f28579b1) {
                    if (fzVar.f28583c1 && fzVar.f28586d1 == null) {
                        i11 = 0;
                    } else if (fzVar.f28586d1 != null) {
                        i11 = R.drawable.msg_mini_customize;
                    } else {
                        i11 = R.drawable.msg_close;
                    }
                    if (fzVar.F1 != null) {
                        chat = MessagesController.getInstance(i13).getChat(Long.valueOf(fzVar.F1.f22393id));
                    }
                    int i16 = R.string.CurrentGroupStickers;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    k8Var2.b(i11, LocaleController.formatString("CurrentGroupStickers", i16, str));
                    return;
                }
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        k8Var2.b(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !fzVar.I2) {
                            k8Var2.setEdit(new View.OnClickListener(this) {
                                public final wy f33338b;

                                {
                                    this.f33338b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f33338b.v.f28623p1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f33338b.v.f28623p1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        k8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final wy f33338b;

                            {
                                this.f33338b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f33338b.v.f28623p1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f33338b.v.f28623p1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == fzVar.f28594f1) {
                    k8Var2.c(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle), 0, 0);
                    return;
                } else if (obj == fzVar.f28597g1) {
                    k8Var2.b(0, LocaleController.getString(R.string.FavoriteStickers));
                    return;
                } else if (obj == fzVar.f28600h1) {
                    k8Var2.b(0, LocaleController.getString(R.string.PremiumStickers));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
            if (i10 == this.f34514s) {
                int i17 = this.f34513r.get(i10 - 1, Integer.MIN_VALUE);
                if (i17 == Integer.MIN_VALUE) {
                    i3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f34510e.get(i17);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = fzVar.f28594f1;
                    } else {
                        arrayList = fzVar.f28597g1;
                    }
                }
                if (arrayList == null) {
                    i3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    i3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int z11 = org.telegram.ui.b.z(82.0f, (int) Math.ceil(arrayList.size() / this.d), fzVar.h.getHeight());
                    if (z11 > 0) {
                        i15 = z11;
                    }
                    i3Var.setHeight(i15);
                    return;
                }
            }
            i3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
        b8Var.d(document, null, this.f34512n.get(i10), null, false, false);
        b8Var.setRecent(fzVar.f28594f1.contains(document));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        fz fzVar = this.v;
        Context context = this.f34509c;
        FrameLayout frameLayout = null;
        switch (i10) {
            case 0:
                frameLayout = new vy(0, context, fzVar.V1, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(this.f34509c, false, false, fzVar.V1, fzVar.f28591e2);
                k8Var.setOnIconClickListener(new t2(20, this, k8Var));
                frameLayout = k8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.We, false));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(textView, i7.f6.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f24562a = textView2;
                textView2.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                textView2.setText(LocaleController.getString(R.string.ChooseStickerSet).toUpperCase());
                linearLayout.addView(textView2, i7.f6.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final wy f33059b;

                    {
                        this.f33059b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                fz fzVar2 = this.f33059b.v;
                                fy fyVar = fzVar2.f28623p1;
                                if (fyVar != null) {
                                    fyVar.y(fzVar2.F1.f22393id);
                                    return;
                                }
                                return;
                            case 1:
                                fz fzVar3 = this.f33059b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(fzVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(fzVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22419id).commit();
                                    wy wyVar = fzVar3.f28639u0;
                                    if (wyVar != null) {
                                        wyVar.t(1, 2);
                                    }
                                    fzVar3.Z(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.f33059b.v.U1;
                                if (o2Var instanceof org.telegram.ui.tn) {
                                    ((org.telegram.ui.tn) o2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new f2.x0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new f2.x0(-1, fzVar.X0));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f34509c, false, false, fzVar.V1, fzVar.f28591e2);
                k8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final wy f33059b;

                    {
                        this.f33059b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                fz fzVar2 = this.f33059b.v;
                                fy fyVar = fzVar2.f28623p1;
                                if (fyVar != null) {
                                    fyVar.y(fzVar2.F1.f22393id);
                                    return;
                                }
                                return;
                            case 1:
                                fz fzVar3 = this.f33059b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(fzVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(fzVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22419id).commit();
                                    wy wyVar = fzVar3.f28639u0;
                                    if (wyVar != null) {
                                        wyVar.t(1, 2);
                                    }
                                    fzVar3.Z(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.f33059b.v.U1;
                                if (o2Var instanceof org.telegram.ui.tn) {
                                    ((org.telegram.ui.tn) o2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = k8Var2;
                break;
            case 6:
                dz dzVar = new dz(fzVar, false);
                fzVar.B0 = dzVar;
                jh.e1 e1Var = new jh.e1(fzVar, context, dzVar);
                e1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                e1Var.setClipToPadding(false);
                e1Var.i(new lh.j(2));
                e1Var.setOnItemClickListener(new k(this, 6));
                e1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(52.0f)));
                frameLayout = e1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int dp = AndroidUtilities.dp(13.0f);
                int i11 = org.telegram.ui.ActionBar.g6.Me;
                linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, fzVar.A(i11))));
                i7.h6.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final wy f33059b;

                    {
                        this.f33059b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                fz fzVar2 = this.f33059b.v;
                                fy fyVar = fzVar2.f28623p1;
                                if (fyVar != null) {
                                    fyVar.y(fzVar2.F1.f22393id);
                                    return;
                                }
                                return;
                            case 1:
                                fz fzVar3 = this.f33059b.v;
                                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(fzVar3.Y0).getFeaturedStickerSets();
                                if (!featuredStickerSets.isEmpty()) {
                                    MessagesController.getEmojiSettings(fzVar3.Y0).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f22419id).commit();
                                    wy wyVar = fzVar3.f28639u0;
                                    if (wyVar != null) {
                                        wyVar.t(1, 2);
                                    }
                                    fzVar3.Z(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.o2 o2Var = this.f33059b.v.U1;
                                if (o2Var instanceof org.telegram.ui.tn) {
                                    ((org.telegram.ui.tn) o2Var).Y9();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                imageView.setColorFilter(new PorterDuffColorFilter(fzVar.A(i11), PorterDuff.Mode.SRC_IN));
                linearLayout2.addView(imageView, i7.f6.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                textView3.setTextColor(fzVar.A(i11));
                textView3.setTextSize(1, 11.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setText(LocaleController.getString(R.string.Create));
                linearLayout2.addView(textView3, i7.f6.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, i7.f6.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new f2.n1(frameLayout);
    }
}
