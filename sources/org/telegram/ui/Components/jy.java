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
public final class jy extends bk0 {
    public final Context f36554c;
    public int d;
    public final SparseArray f36555e = new SparseArray();
    public final HashMap f36556f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36557n = new SparseArray();
    public final SparseIntArray f36558r = new SparseIntArray();
    public int f36559s;
    public final ry f36560w;

    public jy(ry ryVar, Context context) {
        this.f36560w = ryVar;
        this.f36554c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f59122a instanceof ck0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f36556f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i7) {
        int indexOf;
        int i10;
        ry ryVar = this.f36560w;
        ArrayList arrayList = ryVar.f39348e1;
        Object obj = this.h.get(i7);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i7 == 0) {
                i7 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = ryVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f24121q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            }
            int i11 = this.f36558r.get(i7, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = ryVar.F1;
            } else {
                Object obj2 = this.f36555e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return ryVar.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return ryVar.G1;
                    }
                    return ryVar.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = ryVar.F1;
            }
            return indexOf + i10;
        }
        int i12 = ryVar.H1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = ryVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy.G():void");
    }

    @Override
    public final int b() {
        int i7 = this.f36559s;
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        TLRPC.Chat chat;
        String str;
        int i11;
        ry ryVar = this.f36560w;
        int i12 = ryVar.f39345d1;
        int i13 = f1Var.f59126f;
        View view = f1Var.f59122a;
        SparseArray sparseArray = this.h;
        if (i13 != 0) {
            int i14 = 1;
            boolean z10 = true;
            ArrayList<TLRPC.Document> arrayList = null;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 5) {
                            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                            if (org.telegram.messenger.ri.d0(i12).f26639s0) {
                                i11 = 2131750821;
                            } else {
                                i11 = 2131750822;
                            }
                            j8Var.b(org.telegram.messenger.gd.M0(i11, null), 2131232098, org.telegram.messenger.gd.M0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view;
                    if (i7 != this.f36559s - 1) {
                        z10 = false;
                    }
                    h8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.j8 j8Var2 = (org.telegram.ui.Cells.j8) view;
                j8Var2.setHeaderOnClick(null);
                if (i7 == ryVar.f39355g1) {
                    if (ryVar.f39358h1 && ryVar.f39361i1 == null) {
                        i10 = 0;
                    } else if (ryVar.f39361i1 != null) {
                        i10 = 2131232239;
                    } else {
                        i10 = 2131232098;
                    }
                    if (ryVar.K1 != null) {
                        chat = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(ryVar.K1.f28406id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    j8Var2.a(i10, org.telegram.messenger.gd.a0("CurrentGroupStickers", null, 2131751683, str));
                    return;
                }
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        j8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !ryVar.T2) {
                            j8Var2.setEdit(new View.OnClickListener(this) {
                                public final jy f36008b;

                                {
                                    this.f36008b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f36008b.f36560w.f39397u1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f36008b.f36560w.f39397u1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        j8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final jy f36008b;

                            {
                                this.f36008b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f36008b.f36560w.f39397u1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f36008b.f36560w.f39397u1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == ryVar.f39367k1) {
                    j8Var2.b(org.telegram.messenger.gd.M0(2131746169, null), 2131232098, org.telegram.messenger.gd.M0(2131752052, null), 0, 0);
                    return;
                } else if (obj == ryVar.l1) {
                    j8Var2.a(0, org.telegram.messenger.gd.M0(2131750830, null));
                    return;
                } else if (obj == ryVar.f39371m1) {
                    j8Var2.a(0, org.telegram.messenger.gd.M0(2131746754, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i7 == this.f36559s) {
                int i15 = this.f36558r.get(i7 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f36555e.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = ryVar.f39367k1;
                    } else {
                        arrayList = ryVar.l1;
                    }
                }
                if (arrayList == null) {
                    m3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.n10.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), ryVar.h.getHeight());
                    if (B > 0) {
                        i14 = B;
                    }
                    m3Var.setHeight(i14);
                    return;
                }
            }
            m3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        z7Var.d(document, null, this.f36557n.get(i7), null, false, false);
        z7Var.setRecent(ryVar.f39367k1.contains(document));
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ry ryVar = this.f36560w;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
        Context context = this.f36554c;
        FrameLayout frameLayout = null;
        switch (i7) {
            case 0:
                frameLayout = new jg.b2(1, context, i6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.f36554c, false, false, ryVar.f39335a2, ryVar.f39365j2);
                j8Var.setOnIconClickListener(new y7(13, this, j8Var));
                frameLayout = j8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Of, null);
                i5.c.r(14.0f, 1, 2131749204, textView, null);
                linearLayout.addView(textView, c8.ma.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f30788a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.Ji, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
                textView2.setText(org.telegram.messenger.gd.M0(2131752105, null).toUpperCase());
                linearLayout.addView(textView2, c8.ma.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final jy f35666b;

                    {
                        this.f35666b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                ry ryVar2 = this.f35666b.f36560w;
                                rx rxVar = ryVar2.f39397u1;
                                if (rxVar != null) {
                                    rxVar.y(ryVar2.K1.f28406id);
                                    return;
                                }
                                return;
                            case 1:
                                ry ryVar3 = this.f35666b.f36560w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(ryVar3.f39345d1).f26641t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(ryVar3.f39345d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28432id).commit();
                                    jy jyVar = ryVar3.f39414z0;
                                    if (jyVar != null) {
                                        jyVar.p(1, 2);
                                    }
                                    ryVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.h2 h2Var = this.f35666b.f36560w.Z1;
                                if (h2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) h2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.setLayoutParams(new v4.q0(-1, -2));
                frameLayout = linearLayout;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new v4.q0(-1, ryVar.f39342c1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f36554c, false, false, ryVar.f39335a2, ryVar.f39365j2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final jy f35666b;

                    {
                        this.f35666b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ry ryVar2 = this.f35666b.f36560w;
                                rx rxVar = ryVar2.f39397u1;
                                if (rxVar != null) {
                                    rxVar.y(ryVar2.K1.f28406id);
                                    return;
                                }
                                return;
                            case 1:
                                ry ryVar3 = this.f35666b.f36560w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(ryVar3.f39345d1).f26641t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(ryVar3.f39345d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28432id).commit();
                                    jy jyVar = ryVar3.f39414z0;
                                    if (jyVar != null) {
                                        jyVar.p(1, 2);
                                    }
                                    ryVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.h2 h2Var = this.f35666b.f36560w.Z1;
                                if (h2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) h2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = j8Var2;
                break;
            case 6:
                py pyVar = new py(ryVar, false);
                ryVar.G0 = pyVar;
                di.b1 b1Var = new di.b1(ryVar, context, pyVar);
                b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                b1Var.setClipToPadding(false);
                b1Var.i(new fi.k(7));
                b1Var.setOnItemClickListener(new n(this, 6));
                b1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(52.0f)));
                frameLayout = b1Var;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                int L = org.telegram.messenger.g0.L(13.0f);
                int i10 = org.telegram.ui.ActionBar.n6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, ryVar.z(i10)));
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i10);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(linearLayout2, d02, K, null, i6Var);
                c8.ra.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final jy f35666b;

                    {
                        this.f35666b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ry ryVar2 = this.f35666b.f36560w;
                                rx rxVar = ryVar2.f39397u1;
                                if (rxVar != null) {
                                    rxVar.y(ryVar2.K1.f28406id);
                                    return;
                                }
                                return;
                            case 1:
                                ry ryVar3 = this.f35666b.f36560w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(ryVar3.f39345d1).f26641t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(ryVar3.f39345d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28432id).commit();
                                    jy jyVar = ryVar3.f39414z0;
                                    if (jyVar != null) {
                                        jyVar.p(1, 2);
                                    }
                                    ryVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.h2 h2Var = this.f35666b.f36560w.Z1;
                                if (h2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) h2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231893);
                org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, c8.ma.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.f3.l(textView3, i10, i6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.gd.M0(2131751742, null));
                linearLayout2.addView(textView3, c8.ma.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, c8.ma.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new v4.f1(frameLayout);
    }
}
