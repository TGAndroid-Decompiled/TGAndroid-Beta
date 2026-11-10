package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
public final class f0 extends ma implements org.telegram.messenger.ls {
    public final fi.d A2;
    public final FrameLayout B2;
    public boolean C2;
    public String D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public String H2;
    public zg0 I2;
    public m41 J2;
    public boolean K2;
    public int L2;
    public boolean M2;
    public final TLRPC.TL_messages_composeMessageWithAI[] N2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] O2;
    public int P2;
    public CharSequence S1;
    public TL_iv.RichMessage T1;
    public boolean U1;
    public CharSequence V1;
    public TL_iv.RichMessage W1;
    public boolean X1;
    public CharSequence Y1;
    public TL_iv.RichMessage Z1;
    public boolean f33405a2;
    public CharSequence f33406b2;
    public TL_iv.RichMessage f33407c2;
    public CharSequence d2;
    public org.telegram.messenger.c20 f33408e2;
    public org.telegram.messenger.c20 f33409f2;
    public long f33410g2;
    public boolean f33411h2;
    public org.telegram.messenger.z10 f33412i2;
    public ld f33413j2;
    public final boolean[] f33414k2;
    public final boolean[] f33415l2;
    public String f33416m2;
    public String f33417n2;
    public boolean f33418o2;
    public final org.telegram.messenger.e f33419p2;
    public final FrameLayout f33420q2;
    public final e0 f33421r2;
    public final e0 f33422s2;
    public final ImageView f33423t2;
    public final FrameLayout f33424u2;
    public final org.telegram.ui.Cells.k3 f33425v2;
    public fi.m3 f33426w2;
    public final LinearLayout f33427x2;
    public final fi.d f33428y2;
    public final fi.d f33429z2;

    public f0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, 2, h6Var);
        this.f33414k2 = new boolean[1];
        this.f33415l2 = new boolean[1];
        this.K2 = true;
        this.L2 = -1;
        this.N2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.O2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e R1 = org.telegram.messenger.qp.s1(this.f28669a).R1();
        this.f33419p2 = R1;
        R1.b();
        R1.d = true;
        ImageView imageView = new ImageView(context);
        this.f33423t2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.f35902o1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33420q2 = frameLayout;
        e0 e0Var = new e0(this.f28669a, context, h6Var, false);
        this.f33421r2 = e0Var;
        e0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(28.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        e0Var.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(e0Var, d02, M, null, h6Var);
        e0Var.setRoundRadius(28);
        e0Var.a(2131232476, org.telegram.messenger.id.M0(2131754962, null), new f(this, 3));
        e0Var.a(2131231877, org.telegram.messenger.id.M0(2131754963, null), new f(this, 3));
        e0Var.a(2131231864, org.telegram.messenger.id.M0(2131754964, null), new f(this, 3));
        e0Var.c(1);
        frameLayout.addView(e0Var, c8.ha.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33424u2 = frameLayout2;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28669a).f24946x7.R.f13557b).f23464c, h6Var);
        this.f33425v2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
        k3Var.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(k3Var, d03, M2, null, h6Var);
        i3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(k3Var, c8.ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        i3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        e0 e0Var2 = new e0(this.f28669a, context, h6Var, true);
        this.f33422s2 = e0Var2;
        e0Var2.setDivider(true);
        e0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        e0Var2.setRoundRadius(12);
        e0Var2.f33117n = new fi.u4(this, h6Var, context, 1);
        x1();
        e0Var2.c(-1);
        String M0 = k21.M0();
        this.f33417n2 = M0;
        if (M0 == null) {
            this.f33417n2 = org.telegram.messenger.f10.j();
        }
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        this.f35908u1 = 0.35f;
        int i11 = org.telegram.ui.ActionBar.m6.f27834a7;
        v0(org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33427x2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i11, this.I0)), org.telegram.ui.ActionBar.m6.w0(i11, this.I0), org.telegram.ui.ActionBar.m6.w0(i11, this.I0)}));
        fi.d dVar = new fi.d(context, h6Var, true);
        dVar.setRoundRadius(24);
        this.f33429z2 = dVar;
        linearLayout.addView(dVar, c8.ha.p(-1, 48, 1.0f, 119));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.A2 = h;
        h.setOnClickListener(new c(this, 9));
        h.setOnLongClickListener(new i(this, h6Var, context, 0));
        linearLayout.addView(h, c8.ha.t(48, 48, 5, 10, 0, 0, 0));
        fi.d h7 = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f33428y2 = h7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.o1(), length, spannableStringBuilder.length(), 33);
        h7.setText(spannableStringBuilder);
        h7.setOnClickListener(new org.telegram.ui.ActionBar.l1(17, this, h6Var));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.f28705t0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.f28672b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28705t0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28672b.addView(h7, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.B2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i16 = d2.leftMargin;
        int i17 = this.f28705t0;
        d2.leftMargin = i16 + i17;
        d2.rightMargin += i17;
        this.f28672b.addView(frameLayout3, d2);
        u1(false);
        pj0 pj0Var = this.n1;
        int i18 = this.f28705t0;
        pj0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new j(this, 0));
        this.I1 = true;
        n nVar = new n(this);
        nVar.f57079m = false;
        nVar.C = false;
        nVar.o(wq.h);
        nVar.n(350L);
        this.n1.setItemAnimator(nVar);
        this.n1.setOnScrollListener(new ai.b(this, 25));
        this.J2.O(false);
        org.telegram.messenger.g0.h3(new a(this, 0));
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.Y3);
    }

    public static void d1(f0 f0Var, View view) {
        f0Var.f33418o2 = !f0Var.f33418o2;
        f0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof wo) {
                ((wo) linearLayout.getChildAt(0)).a(f0Var.f33418o2, true);
            }
        }
    }

    public static void e1(f0 f0Var, int i7) {
        e0 e0Var = f0Var.f33421r2;
        if (e0Var.getSelectedTab() == i7) {
            return;
        }
        fi.m3 m3Var = f0Var.f33426w2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        e0Var.c(i7);
        f0Var.p1();
        f0Var.J2.O(true);
    }

    public static void f1(f0 f0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i7;
        e0 e0Var = f0Var.f33422s2;
        fi.m3 m3Var = f0Var.f33426w2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (aiComposeTone instanceof a0) {
            e0Var.d(aiComposeTone);
            f0Var.J2.O(true);
            org.telegram.messenger.g0.i3(new a(f0Var, 3), 150L);
        } else if (aiComposeTone == null) {
            ArrayList arrayList = f0Var.f33419p2.f22159b;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                    i10++;
                }
            }
            int i12 = i10 + 1;
            if (org.telegram.messenger.p10.i(f0Var.f28669a).q()) {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(f0Var.f28669a).f24946x7.T.f13557b).f23464c;
            } else {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(f0Var.f28669a).f24946x7.S.f13557b).f23464c;
            }
            if (i12 > i7) {
                t1(new gc(f0Var.B2, f0Var.I0), f0Var.f28669a);
                return;
            }
            z zVar = new z(f0Var.getContext(), f0Var.I0);
            zVar.f40782f2 = new f(f0Var, 1);
            zVar.show();
        } else if (e0Var.getSelectedTone() != aiComposeTone) {
            e0Var.d(aiComposeTone);
            f0Var.p1();
            f0Var.J2.O(true);
        }
    }

    public static void i1(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        j1(richText, sb2);
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i7 = 0; i7 < pageblocklist.items.size(); i7++) {
                        if (i7 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i7);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            j1(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (i10 > 0) {
                                    sb2.append("\n");
                                }
                                i1(arrayList.get(i10), sb2);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i11 = 0; i11 < pageblockorderedlist.items.size(); i11++) {
                        if (i11 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i11);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            j1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    sb2.append("\n");
                                }
                                i1(arrayList2.get(i12), sb2);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                j1(pageCaption.text, sb2);
                return;
            }
            return;
        }
        j1(pageBlock.text, sb2);
    }

    public static void j1(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i7 = 0; i7 < textconcat.texts.size(); i7++) {
                j1(textconcat.texts.get(i7), sb2);
            }
        } else if (richText != null) {
            j1(richText.text, sb2);
        }
    }

    public static void k1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        spannableStringBuilder.append((CharSequence) li.c6.r(richText, null, true));
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i7 = 0; i7 < pageblocklist.items.size(); i7++) {
                        if (i7 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i7);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            spannableStringBuilder.append((CharSequence) li.c6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (i10 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                k1(arrayList.get(i10), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i11 = 0; i11 < pageblockorderedlist.items.size(); i11++) {
                        if (i11 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i11);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            spannableStringBuilder.append((CharSequence) li.c6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                k1(arrayList2.get(i12), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) li.c6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) li.c6.r(pageBlock.text, pageBlock, true));
    }

    public static void t1(gc gcVar, int i7) {
        int i10;
        String a02;
        if (gcVar.W() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.qp.s1(i7).f24946x7;
        boolean q10 = org.telegram.messenger.p10.i(i7).q();
        if (!q10) {
            i10 = 2131624216;
        } else {
            i10 = 2131624011;
        }
        String M0 = org.telegram.messenger.id.M0(2131754976, null);
        if (!q10) {
            a02 = org.telegram.messenger.id.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.S.f13557b).f23464c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f13557b).f23464c));
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f13557b).f23464c));
        }
        gcVar.I(i10, M0, org.telegram.messenger.g0.U2(a02, new wf(gcVar, 1))).j();
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new d(this, 0), this.I0);
        this.J2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.H2 == null) {
            this.H2 = org.telegram.messenger.id.M0(2131755006, null);
            zg0 zg0Var = new zg0(2131624010, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.I2 = zg0Var;
            zg0Var.J(true);
            this.I2.K(1);
        }
        return this.H2;
    }

    @Override
    public final void Q0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f33423t2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Y3) {
            x1();
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.Y3);
        org.telegram.messenger.e eVar = this.f33419p2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(k60 k60Var, LinearLayout linearLayout, boolean z9, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.I0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z9);
        z0Var.d(org.telegram.ui.ActionBar.m6.w0(i7, this.I0), org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)));
        z0Var.setOnClickListener(new h(k60Var, z9, runnable, 0));
        linearLayout.addView(z0Var, c8.ha.o(-1, -2));
    }

    @Override
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        LinearLayout linearLayout = this.f33427x2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.L2 >= 0) {
            ConnectionsManager.getInstance(this.f28669a).cancelRequest(this.L2, true);
            this.L2 = -1;
        }
        this.M2 = false;
        org.telegram.ui.ActionBar.m5 titleTextView = this.f35902o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (!this.M2) {
            int selectedTab = this.f33421r2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.U1) {
                    return this.W1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f33405a2) {
                    return this.f33407c2;
                }
                return null;
            } else if (this.X1) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.Z1;
                if (richMessage == null) {
                    return this.T1;
                }
                return richMessage;
            }
        }
        return null;
    }

    public final CharSequence m1() {
        if (n1()) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i7 = 0; i7 < l1.blocks.size(); i7++) {
                    if (i7 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    k1(l1.blocks.get(i7), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.M2) {
            int selectedTab = this.f33421r2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.U1) {
                    return this.V1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f33405a2) {
                    return this.d2;
                }
                return null;
            } else if (this.X1) {
                return null;
            } else {
                CharSequence charSequence = this.Y1;
                if (charSequence == null) {
                    return this.S1;
                }
                return charSequence;
            }
        } else {
            return null;
        }
    }

    public final boolean n1() {
        if (this.T1 != null) {
            return true;
        }
        return false;
    }

    public final x31 o1(int i7, TL_iv.RichMessage richMessage, boolean z9) {
        if (richMessage == null) {
            richMessage = this.T1;
        }
        int i10 = org.telegram.messenger.zt.f26927b;
        x31 K = x31.K(org.telegram.messenger.zt.class);
        K.G = richMessage;
        K.d = i7;
        K.f40150e = z9;
        return K;
    }

    public final void p1() {
        String charSequence;
        String str;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        String str2;
        String str3;
        String str4;
        boolean n1 = n1();
        ia iaVar = this.f35902o1;
        e0 e0Var = this.f33422s2;
        e0 e0Var2 = this.f33421r2;
        if (n1) {
            int selectedTab = e0Var2.getSelectedTab();
            String str5 = "";
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.T1;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str2 = str5;
                str3 = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
                    tL_inputRichMessage.blocks.add(org.telegram.messenger.gz.y0(richMessage.blocks.get(i7)));
                }
                ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputRichMessage.flags |= 4;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Photo photo = arrayList2.get(i10);
                        i10++;
                        TLRPC.Photo photo2 = photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        String str6 = str5;
                        tL_inputPhoto.f26979id = photo2.f26984id;
                        tL_inputPhoto.access_hash = photo2.access_hash;
                        byte[] bArr = photo2.file_reference;
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        tL_inputPhoto.file_reference = bArr;
                        tL_inputRichMessage.photos.add(tL_inputPhoto);
                        str5 = str6;
                    }
                }
                str2 = str5;
                str3 = null;
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    tL_inputRichMessage.flags |= 8;
                    ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                    int size2 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TLRPC.Document document = arrayList4.get(i11);
                        i11++;
                        TLRPC.Document document2 = document;
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f26972id = document2.f26966id;
                        tL_inputDocument.access_hash = document2.access_hash;
                        byte[] bArr2 = document2.file_reference;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        tL_inputDocument.file_reference = bArr2;
                        tL_inputRichMessage.documents.add(tL_inputDocument);
                    }
                }
            }
            tL_messages_composeRichMessageWithAI.text = tL_inputRichMessage;
            if (selectedTab == 0) {
                tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.f10.D(this.f33417n2);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f33418o2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (TextUtils.isEmpty(this.D2)) {
                        str4 = str2;
                    } else {
                        str4 = this.D2;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str4;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f27174id = tL_aiComposeTone.f27173id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f33418o2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.O2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.M2 = true;
                    this.E2 = false;
                    u1(true);
                    org.telegram.ui.ActionBar.m5 titleTextView = iaVar.getTitleTextView();
                    titleTextView.i(this.I2);
                    this.I2.start();
                    if (selectedTab == 0) {
                        this.U1 = true;
                    } else if (selectedTab == 1) {
                        this.X1 = true;
                    } else if (selectedTab == 2) {
                        this.f33405a2 = true;
                    }
                    this.L2 = ConnectionsManager.getInstance(this.f28669a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(1), new bi.v0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 6));
                    this.J2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.f28669a).W(charSequenceArr, true, true);
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence6.toString();
        }
        tL_textWithEntities.text = charSequence;
        int selectedTab2 = e0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.f10.D(this.f33417n2);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f33418o2;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = e0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.D2)) {
                    str = "";
                } else {
                    str = this.D2;
                }
                inputaicomposetonesingleuse2.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f27174id = tL_aiComposeTone2.f27173id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f33418o2;
        } else if (selectedTab2 == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.N2[selectedTab2];
        if (tL_messages_composeMessageWithAI2 == null || tL_messages_composeMessageWithAI2.proofread != tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI2.emojify != tL_messages_composeMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            if (!tL_messages_composeMessageWithAI.emojify && !tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI.tone == null && tL_messages_composeMessageWithAI.translate_to_lang == null) {
                return;
            }
            this.M2 = true;
            this.E2 = false;
            u1(true);
            org.telegram.ui.ActionBar.m5 titleTextView2 = iaVar.getTitleTextView();
            titleTextView2.i(this.I2);
            this.I2.start();
            int selectedTab3 = e0Var2.getSelectedTab();
            CharSequence charSequence7 = this.S1;
            if (selectedTab3 == 0 && (charSequence5 = this.V1) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.Y1) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.f33406b2) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            int L = org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(64.0f);
            int i12 = this.f28705t0;
            int b10 = c8.j9.b(new StaticLayout(charSequence2, textPaint, (L - i12) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < b10; i13++) {
                if (i13 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748779, null));
                b80 b80Var = new b80(null, L2, 0, null);
                b80Var.f32163f = org.telegram.messenger.g0.L(6.0f);
                b80Var.h = 0.5f;
                b80Var.f32164n = true;
                spannableStringBuilder.setSpan(b80Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.U1 = true;
                this.V1 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.X1 = true;
                this.Y1 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f33405a2 = true;
                this.f33406b2 = spannableStringBuilder;
            }
            this.L2 = ConnectionsManager.getInstance(this.f28669a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new bi.v0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 5));
            this.J2.O(true);
        }
    }

    public final void q1(int i7, int i10, boolean z9) {
        if (this.f33413j2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.f33413j2.a(l1, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z9));
            }
        } else if (this.f33412i2 != null && m1() != null) {
            this.f33412i2.a(m1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z9));
        }
    }

    public final void r1(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!com.google.android.recaptcha.internal.a.u(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {vy0.class, ni.j.class, fu0.class, e41.class, d41.class, a41.class, b41.class, zz.class, z31.class, y31.class, q5.class};
            for (int i7 = 0; i7 < 11; i7++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i7])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.S1 = spannableStringBuilder;
        org.telegram.messenger.b6.d(editable.toString(), new b(this, 0), new org.telegram.ui.cr(3), false);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
            if (w02 != this.P2) {
                this.P2 = w02;
                v0(w02);
                this.f33427x2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        this.T1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.b6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.cr(4), false);
        x1();
    }

    @Override
    public final void show() {
        int i7;
        int i10;
        super.show();
        ia iaVar = this.f35902o1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
        if (!this.f33411h2 && (this.f33413j2 != null || this.f33412i2 != null)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        fi.d dVar = this.A2;
        dVar.setVisibility(i7);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131745640, null));
        if (this.f33411h2) {
            i10 = 2131231152;
        } else {
            i10 = 2131232694;
        }
        wp wpVar = new wp(i10, 0);
        wpVar.f40039s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.J2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z9) {
        int i7;
        int i10;
        float f10;
        float f11;
        boolean z10 = this.E2;
        int i11 = 0;
        fi.d dVar = this.f33429z2;
        if (z10) {
            dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
            dVar.setOnClickListener(new c(this, 0));
        } else {
            e0 e0Var = this.f33421r2;
            if (e0Var != null) {
                i7 = e0Var.getSelectedTab();
            } else {
                i7 = 0;
            }
            if (i7 == 1 && (this.f33422s2.getSelectedTone() instanceof a0) && !TextUtils.equals(this.f33425v2.getText().toString(), this.D2)) {
                dVar.setText(org.telegram.messenger.id.M0(2131754059, null));
                dVar.setOnClickListener(new c(this, 1));
            } else if (this.f33409f2 == null && this.f33408e2 == null) {
                dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.id.M0(2131755002, null));
                dVar.setOnClickListener(new c(this, 2));
            }
        }
        dVar.setLoading(this.M2);
        if (z9 && this.G2 == this.F2) {
            return;
        }
        boolean z11 = this.F2;
        this.G2 = z11;
        float f12 = 0.0f;
        LinearLayout linearLayout = this.f33427x2;
        fi.d dVar2 = this.f33428y2;
        if (z9) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.F2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            wq wqVar = wq.h;
            alpha.setInterpolator(wqVar).setDuration(320L).withEndAction(new a(this, 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.F2) {
                f12 = 1.0f;
            }
            animate2.alpha(f12).setInterpolator(wqVar).setDuration(320L).withEndAction(new a(this, 2)).start();
            return;
        }
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        if (this.F2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        dVar2.setAlpha(f10);
        if (this.F2) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (!this.F2) {
            f12 = 1.0f;
        }
        linearLayout.setAlpha(f12);
    }

    public final void v1() {
        float f10;
        String str = this.D2;
        org.telegram.ui.Cells.k3 k3Var = this.f33425v2;
        boolean equals = TextUtils.equals(str, k3Var.d.getText().toString());
        boolean z9 = !equals;
        if (this.C2 == z9) {
            return;
        }
        ViewPropertyAnimator animate = k3Var.d.animate();
        this.C2 = z9;
        if (!equals) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 320L);
        this.J2.O(true);
    }

    public final void w1() {
        pj0 pj0Var;
        View view;
        if (this.f33426w2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            pj0Var = this.n1;
            if (i7 < pj0Var.getChildCount()) {
                view = pj0Var.getChildAt(i7);
                x31 G = this.J2.G(RecyclerView.R(view) - 1);
                if (G != null && G.f40149c == this.f33422s2) {
                    break;
                }
                i7++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f33426w2.setVisibility(0);
            this.f33426w2.setTranslationY(view.getY() + pj0Var.getY() + view.getHeight());
            return;
        }
        this.f33426w2.setVisibility(4);
        this.f33426w2.f(true);
    }

    public final void x1() {
        e0 e0Var = this.f33422s2;
        TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
        e0Var.f33114c.removeAllViews();
        if (n1()) {
            e0Var.b(new TL_aicompose.AiComposeTone(), new f(this, 0));
        }
        e0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.f33419p2.f22159b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != e0Var.getSelectedTone()) {
            e0Var.d(null);
        }
    }
}
