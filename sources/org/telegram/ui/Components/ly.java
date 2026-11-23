package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.tgnet.TLRPC;
public final class ly extends dk0 {
    public final Context f37283c;
    public int d;
    public final SparseArray f37284e = new SparseArray();
    public final HashMap f37285f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f37286n = new SparseArray();
    public final SparseIntArray f37287r = new SparseIntArray();
    public int f37288s;
    public final ty f37289w;

    public ly(ty tyVar, Context context) {
        this.f37289w = tyVar;
        this.f37283c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f59111a instanceof ek0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f37285f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i7) {
        int indexOf;
        int i10;
        ty tyVar = this.f37289w;
        ArrayList arrayList = tyVar.f40077e1;
        Object obj = this.h.get(i7);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i7 == 0) {
                i7 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = tyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f24010q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            }
            int i11 = this.f37287r.get(i7, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = tyVar.F1;
            } else {
                Object obj2 = this.f37284e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return tyVar.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return tyVar.G1;
                    }
                    return tyVar.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = tyVar.F1;
            }
            return indexOf + i10;
        }
        int i12 = tyVar.H1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = tyVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.G():void");
    }

    @Override
    public final int b() {
        int i7 = this.f37288s;
        if (i7 != 0) {
            return i7 + 1;
        }
        return 0;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 4;
        }
        Object obj = this.h.get(i7);
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
    public final void f() {
        G();
        super.f();
    }

    @Override
    public final void p(int i7, int i10) {
        G();
        super.p(i7, i10);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        TLRPC.Chat chat;
        String str;
        int i11;
        ty tyVar = this.f37289w;
        int i12 = tyVar.f40074d1;
        int i13 = e1Var.f59115f;
        View view = e1Var.f59111a;
        SparseArray sparseArray = this.h;
        if (i13 != 0) {
            int i14 = 1;
            boolean z10 = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 5) {
                            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                            if (org.telegram.messenger.si.d0(i12).f26815s0) {
                                i11 = 2131750820;
                            } else {
                                i11 = 2131750821;
                            }
                            k8Var.b(org.telegram.messenger.hd.N0(i11, null), 2131232098, org.telegram.messenger.hd.N0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                    if (i7 != this.f37288s - 1) {
                        z10 = false;
                    }
                    i8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.k8 k8Var2 = (org.telegram.ui.Cells.k8) view;
                k8Var2.setHeaderOnClick(null);
                if (i7 == tyVar.f40084g1) {
                    if (tyVar.f40087h1 && tyVar.f40090i1 == null) {
                        i10 = 0;
                    } else if (tyVar.f40090i1 != null) {
                        i10 = 2131232239;
                    } else {
                        i10 = 2131232098;
                    }
                    if (tyVar.K1 != null) {
                        chat = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(tyVar.K1.f28399id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    k8Var2.a(i10, org.telegram.messenger.hd.a0("CurrentGroupStickers", null, 2131751682, str));
                    return;
                }
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        k8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !tyVar.T2) {
                            k8Var2.setEdit(new View.OnClickListener(this) {
                                public final ly f36677b;

                                {
                                    this.f36677b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f36677b.f37289w.f40126u1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f36677b.f37289w.f40126u1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        k8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final ly f36677b;

                            {
                                this.f36677b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f36677b.f37289w.f40126u1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f36677b.f37289w.f40126u1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == tyVar.f40096k1) {
                    k8Var2.b(org.telegram.messenger.hd.N0(2131746168, null), 2131232098, org.telegram.messenger.hd.N0(2131752051, null), 0, 0);
                    return;
                } else if (obj == tyVar.l1) {
                    k8Var2.a(0, org.telegram.messenger.hd.N0(2131750829, null));
                    return;
                } else if (obj == tyVar.f40100m1) {
                    k8Var2.a(0, org.telegram.messenger.hd.N0(2131746753, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.n3 n3Var = (org.telegram.ui.Cells.n3) view;
            if (i7 == this.f37288s) {
                int i15 = this.f37287r.get(i7 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    n3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f37284e.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = tyVar.f40096k1;
                    } else {
                        arrayList = tyVar.l1;
                    }
                }
                if (arrayList == null) {
                    n3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    n3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.o10.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), tyVar.h.getHeight());
                    if (B > 0) {
                        i14 = B;
                    }
                    n3Var.setHeight(i14);
                    return;
                }
            }
            n3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        a8Var.d(document, null, this.f37286n.get(i7), null, false, false);
        a8Var.setRecent(tyVar.f40096k1.contains(document));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ty tyVar = this.f37289w;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40064a2;
        Context context = this.f37283c;
        FrameLayout frameLayout = null;
        switch (i7) {
            case 0:
                frameLayout = new jg.b2(1, context, h6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.n3(context);
                break;
            case 2:
                org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(this.f37283c, false, false, tyVar.f40064a2, tyVar.f40094j2);
                k8Var.setOnIconClickListener(new m8(12, this, k8Var));
                frameLayout = k8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Of, null);
                i5.c.r(14.0f, 1, 2131749203, textView, null);
                linearLayout.addView(textView, c8.na.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f30833a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.Ji, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
                textView2.setText(org.telegram.messenger.hd.N0(2131752104, null).toUpperCase());
                linearLayout.addView(textView2, c8.na.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final ly f36291b;

                    {
                        this.f36291b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                ty tyVar2 = this.f36291b.f37289w;
                                tx txVar = tyVar2.f40126u1;
                                if (txVar != null) {
                                    txVar.y(tyVar2.K1.f28399id);
                                    return;
                                }
                                return;
                            case 1:
                                ty tyVar3 = this.f36291b.f37289w;
                                ArrayList arrayList = org.telegram.messenger.si.d0(tyVar3.f40074d1).f26817t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.u1(tyVar3.f40074d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28425id).commit();
                                    ly lyVar = tyVar3.f40143z0;
                                    if (lyVar != null) {
                                        lyVar.p(1, 2);
                                    }
                                    tyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.f36291b.f37289w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new v4.p0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new v4.p0(-1, tyVar.f40071c1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f37283c, false, false, tyVar.f40064a2, tyVar.f40094j2);
                k8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final ly f36291b;

                    {
                        this.f36291b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ty tyVar2 = this.f36291b.f37289w;
                                tx txVar = tyVar2.f40126u1;
                                if (txVar != null) {
                                    txVar.y(tyVar2.K1.f28399id);
                                    return;
                                }
                                return;
                            case 1:
                                ty tyVar3 = this.f36291b.f37289w;
                                ArrayList arrayList = org.telegram.messenger.si.d0(tyVar3.f40074d1).f26817t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.u1(tyVar3.f40074d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28425id).commit();
                                    ly lyVar = tyVar3.f40143z0;
                                    if (lyVar != null) {
                                        lyVar.p(1, 2);
                                    }
                                    tyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.f36291b.f37289w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = k8Var2;
                break;
            case 6:
                ry ryVar = new ry(tyVar, false);
                tyVar.G0 = ryVar;
                di.b1 b1Var = new di.b1(tyVar, context, ryVar);
                b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                b1Var.setClipToPadding(false);
                b1Var.i(new fi.k(7));
                b1Var.setOnItemClickListener(new o(this, 6));
                b1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(52.0f)));
                frameLayout = b1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i10 = org.telegram.ui.ActionBar.m6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.12f, tyVar.z(i10)));
                org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i10);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(linearLayout2, d02, K, null, h6Var);
                c8.sa.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final ly f36291b;

                    {
                        this.f36291b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ty tyVar2 = this.f36291b.f37289w;
                                tx txVar = tyVar2.f40126u1;
                                if (txVar != null) {
                                    txVar.y(tyVar2.K1.f28399id);
                                    return;
                                }
                                return;
                            case 1:
                                ty tyVar3 = this.f36291b.f37289w;
                                ArrayList arrayList = org.telegram.messenger.si.d0(tyVar3.f40074d1).f26817t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.np.u1(tyVar3.f40074d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28425id).commit();
                                    ly lyVar = tyVar3.f40143z0;
                                    if (lyVar != null) {
                                        lyVar.p(1, 2);
                                    }
                                    tyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.f36291b.f37289w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231893);
                org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, c8.na.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.f3.l(textView3, i10, h6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.hd.N0(2131751741, null));
                linearLayout2.addView(textView3, c8.na.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, c8.na.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new v4.e1(frameLayout);
    }
}
