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
public final class iy extends dk0 {
    public final Context f36197c;
    public int d;
    public final SparseArray f36198e = new SparseArray();
    public final HashMap f36199f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36200n = new SparseArray();
    public final SparseIntArray f36201r = new SparseIntArray();
    public int f36202s;
    public final qy f36203w;

    public iy(qy qyVar, Context context) {
        this.f36203w = qyVar;
        this.f36197c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f59245a instanceof ek0;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f36199f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i7) {
        int indexOf;
        int i10;
        qy qyVar = this.f36203w;
        ArrayList arrayList = qyVar.f39050e1;
        Object obj = this.h.get(i7);
        if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
            if (i7 == 0) {
                i7 = 1;
            }
            if (this.d == 0) {
                int measuredWidth = qyVar.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f24226q.x;
                }
                this.d = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            }
            int i11 = this.f36201r.get(i7, Integer.MIN_VALUE);
            if (i11 == Integer.MIN_VALUE) {
                indexOf = arrayList.size() - 1;
                i10 = qyVar.F1;
            } else {
                Object obj2 = this.f36198e.get(i11);
                if (obj2 instanceof String) {
                    if ("premium".equals(obj2)) {
                        return qyVar.J1;
                    }
                    if ("recent".equals(obj2)) {
                        return qyVar.G1;
                    }
                    return qyVar.H1;
                }
                indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                i10 = qyVar.F1;
            }
            return indexOf + i10;
        }
        int i12 = qyVar.H1;
        if (i12 >= 0) {
            return i12;
        }
        int i13 = qyVar.G1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iy.G():void");
    }

    @Override
    public final int b() {
        int i7 = this.f36202s;
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
        qy qyVar = this.f36203w;
        int i12 = qyVar.f39047d1;
        int i13 = f1Var.f59249f;
        View view = f1Var.f59245a;
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
                            if (org.telegram.messenger.ri.d0(i12).f26738s0) {
                                i11 = 2131750820;
                            } else {
                                i11 = 2131750821;
                            }
                            j8Var.b(org.telegram.messenger.gd.N0(i11, null), 2131232101, org.telegram.messenger.gd.N0(2131754898, null), 0, 0);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view;
                    if (i7 != this.f36202s - 1) {
                        z10 = false;
                    }
                    h8Var.setIsLast(z10);
                    return;
                }
                org.telegram.ui.Cells.j8 j8Var2 = (org.telegram.ui.Cells.j8) view;
                j8Var2.setHeaderOnClick(null);
                if (i7 == qyVar.f39057g1) {
                    if (qyVar.f39060h1 && qyVar.f39063i1 == null) {
                        i10 = 0;
                    } else if (qyVar.f39063i1 != null) {
                        i10 = 2131232242;
                    } else {
                        i10 = 2131232101;
                    }
                    if (qyVar.K1 != null) {
                        chat = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(qyVar.K1.f28493id));
                    } else {
                        chat = null;
                    }
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "Group Stickers";
                    }
                    j8Var2.a(i10, org.telegram.messenger.gd.a0("CurrentGroupStickers", null, 2131751682, str));
                    return;
                }
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        j8Var2.a(0, stickerSet.title);
                        if (tL_messages_stickerSet.set.creator && !qyVar.T2) {
                            j8Var2.setEdit(new View.OnClickListener(this) {
                                public final iy f35568b;

                                {
                                    this.f35568b = this;
                                }

                                @Override
                                public final void onClick(View view2) {
                                    switch (r3) {
                                        case 0:
                                            this.f35568b.f36203w.f39099u1.d(tL_messages_stickerSet.set, null, true);
                                            return;
                                        default:
                                            this.f35568b.f36203w.f39099u1.d(tL_messages_stickerSet.set, null, false);
                                            return;
                                    }
                                }
                            });
                        }
                        j8Var2.setHeaderOnClick(new View.OnClickListener(this) {
                            public final iy f35568b;

                            {
                                this.f35568b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        this.f35568b.f36203w.f39099u1.d(tL_messages_stickerSet.set, null, true);
                                        return;
                                    default:
                                        this.f35568b.f36203w.f39099u1.d(tL_messages_stickerSet.set, null, false);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } else if (obj == qyVar.f39069k1) {
                    j8Var2.b(org.telegram.messenger.gd.N0(2131746168, null), 2131232101, org.telegram.messenger.gd.N0(2131752051, null), 0, 0);
                    return;
                } else if (obj == qyVar.l1) {
                    j8Var2.a(0, org.telegram.messenger.gd.N0(2131750829, null));
                    return;
                } else if (obj == qyVar.f39073m1) {
                    j8Var2.a(0, org.telegram.messenger.gd.N0(2131746753, null));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.n3 n3Var = (org.telegram.ui.Cells.n3) view;
            if (i7 == this.f36202s) {
                int i15 = this.f36201r.get(i7 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    n3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f36198e.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
                } else if (obj2 instanceof String) {
                    if ("recent".equals(obj2)) {
                        arrayList = qyVar.f39069k1;
                    } else {
                        arrayList = qyVar.l1;
                    }
                }
                if (arrayList == null) {
                    n3Var.setHeight(1);
                    return;
                } else if (arrayList.isEmpty()) {
                    n3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.m10.B(82.0f, (int) Math.ceil(arrayList.size() / this.d), qyVar.h.getHeight());
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
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        z7Var.d(document, null, this.f36200n.get(i7), null, false, false);
        z7Var.setRecent(qyVar.f39069k1.contains(document));
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        qy qyVar = this.f36203w;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        Context context = this.f36197c;
        FrameLayout frameLayout = null;
        switch (i7) {
            case 0:
                frameLayout = new jg.b2(1, context, i6Var, true);
                break;
            case 1:
                frameLayout = new org.telegram.ui.Cells.n3(context);
                break;
            case 2:
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.f36197c, false, false, qyVar.f39037a2, qyVar.f39067j2);
                j8Var.setOnIconClickListener(new l8(12, this, j8Var));
                frameLayout = j8Var;
                break;
            case 3:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Of, null);
                i5.c.r(14.0f, 1, 2131749203, textView, null);
                linearLayout.addView(textView, c8.na.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                linearLayout.f30855a = textView2;
                textView2.setPadding(org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f), 0);
                textView2.setGravity(17);
                org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.Ji, null, 1, 14.0f);
                textView2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
                textView2.setText(org.telegram.messenger.gd.N0(2131752104, null).toUpperCase());
                linearLayout.addView(textView2, c8.na.t(-2, 28, 51, 17, 10, 14, 8));
                linearLayout.setAddOnClickListener(new View.OnClickListener(this) {
                    public final iy f35231b;

                    {
                        this.f35231b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                qy qyVar2 = this.f35231b.f36203w;
                                qx qxVar = qyVar2.f39099u1;
                                if (qxVar != null) {
                                    qxVar.y(qyVar2.K1.f28493id);
                                    return;
                                }
                                return;
                            case 1:
                                qy qyVar3 = this.f35231b.f36203w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(qyVar3.f39047d1).f26740t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(qyVar3.f39047d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28519id).commit();
                                    iy iyVar = qyVar3.f39116z0;
                                    if (iyVar != null) {
                                        iyVar.p(1, 2);
                                    }
                                    qyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.f35231b.f36203w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
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
                view.setLayoutParams(new v4.q0(-1, qyVar.f39044c1));
                frameLayout = view;
                break;
            case 5:
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f36197c, false, false, qyVar.f39037a2, qyVar.f39067j2);
                j8Var2.setOnIconClickListener(new View.OnClickListener(this) {
                    public final iy f35231b;

                    {
                        this.f35231b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                qy qyVar2 = this.f35231b.f36203w;
                                qx qxVar = qyVar2.f39099u1;
                                if (qxVar != null) {
                                    qxVar.y(qyVar2.K1.f28493id);
                                    return;
                                }
                                return;
                            case 1:
                                qy qyVar3 = this.f35231b.f36203w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(qyVar3.f39047d1).f26740t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(qyVar3.f39047d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28519id).commit();
                                    iy iyVar = qyVar3.f39116z0;
                                    if (iyVar != null) {
                                        iyVar.p(1, 2);
                                    }
                                    qyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.f35231b.f36203w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                frameLayout = j8Var2;
                break;
            case 6:
                oy oyVar = new oy(qyVar, false);
                qyVar.G0 = oyVar;
                di.b1 b1Var = new di.b1(qyVar, context, oyVar);
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
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, qyVar.z(i10)));
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i10);
                linearLayout2.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(linearLayout2, d02, K, null, i6Var);
                c8.sa.b(linearLayout2, 0.1f, 1.5f);
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final iy f35231b;

                    {
                        this.f35231b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                qy qyVar2 = this.f35231b.f36203w;
                                qx qxVar = qyVar2.f39099u1;
                                if (qxVar != null) {
                                    qxVar.y(qyVar2.K1.f28493id);
                                    return;
                                }
                                return;
                            case 1:
                                qy qyVar3 = this.f35231b.f36203w;
                                ArrayList arrayList = org.telegram.messenger.ri.d0(qyVar3.f39047d1).f26740t0[0];
                                if (!arrayList.isEmpty()) {
                                    org.telegram.messenger.mp.u1(qyVar3.f39047d1).i7.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f28519id).commit();
                                    iy iyVar = qyVar3.f39116z0;
                                    if (iyVar != null) {
                                        iyVar.p(1, 2);
                                    }
                                    qyVar3.Y(false);
                                    return;
                                }
                                return;
                            default:
                                org.telegram.ui.ActionBar.g2 g2Var = this.f35231b.f36203w.Z1;
                                if (g2Var instanceof org.telegram.ui.bn) {
                                    ((org.telegram.ui.bn) g2Var).Ba();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131231896);
                org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
                linearLayout2.addView(imageView, c8.na.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                org.telegram.messenger.f3.l(textView3, i10, i6Var, 1, 11.0f);
                textView3.setText(org.telegram.messenger.gd.N0(2131751741, null));
                linearLayout2.addView(textView3, c8.na.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout2.addView(linearLayout2, c8.na.d(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout = frameLayout2;
                break;
        }
        return new v4.f1(frameLayout);
    }
}
