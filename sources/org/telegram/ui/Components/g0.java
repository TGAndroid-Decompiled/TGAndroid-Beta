package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
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
public final class g0 extends ha implements org.telegram.messenger.us {
    public String A2;
    public boolean B2;
    public boolean C2;
    public boolean D2;
    public String E2;
    public bi0 F2;
    public p51 G2;
    public boolean H2;
    public int I2;
    public boolean J2;
    public final TLRPC.TL_messages_composeMessageWithAI[] K2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] L2;
    public int M2;
    public CharSequence P1;
    public TL_iv.RichMessage Q1;
    public boolean R1;
    public Spannable S1;
    public TL_iv.RichMessage T1;
    public boolean U1;
    public Spannable V1;
    public TL_iv.RichMessage W1;
    public boolean X1;
    public Spannable Y1;
    public TL_iv.RichMessage Z1;
    public Spannable a2;
    public org.telegram.messenger.q20 f26179b2;
    public org.telegram.messenger.q20 f26180c2;
    public long f26181d2;
    public boolean f26182e2;
    public org.telegram.messenger.n20 f26183f2;
    public gd f26184g2;
    public final boolean[] f26185h2;
    public final boolean[] f26186i2;
    public String f26187j2;
    public String f26188k2;
    public boolean f26189l2;
    public final org.telegram.messenger.e f26190m2;
    public final FrameLayout f26191n2;
    public final f0 f26192o2;
    public final f0 f26193p2;
    public final ImageView f26194q2;
    public final FrameLayout f26195r2;
    public final org.telegram.ui.Cells.m3 f26196s2;
    public vh.p2 f26197t2;
    public final LinearLayout f26198u2;
    public final vh.d f26199v2;
    public final vh.d f26200w2;
    public final vh.d f26201x2;
    public final FrameLayout f26202y2;
    public boolean f26203z2;

    public g0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, 2, p6Var);
        this.f26185h2 = new boolean[1];
        this.f26186i2 = new boolean[1];
        this.H2 = true;
        this.I2 = -1;
        this.K2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.L2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e Q1 = org.telegram.messenger.vp.r1(this.f21583a).Q1();
        this.f26190m2 = Q1;
        Q1.b();
        Q1.d = true;
        ImageView imageView = new ImageView(context);
        this.f26194q2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231270);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
        this.l1.addView(imageView, w7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26191n2 = frameLayout;
        f0 f0Var = new f0(this.f21583a, context, p6Var, false);
        this.f26192o2 = f0Var;
        f0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        int L2 = org.telegram.messenger.i0.L(28.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        f0Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f0Var, d02, N, null, p6Var);
        f0Var.setRoundRadius(28);
        f0Var.a(2131232475, org.telegram.messenger.cd.L0(2131754962, null), new f(this, 3));
        f0Var.a(2131231876, org.telegram.messenger.cd.L0(2131754963, null), new f(this, 3));
        f0Var.a(2131231863, org.telegram.messenger.cd.L0(2131754964, null), new f(this, 3));
        f0Var.c(1);
        frameLayout.addView(f0Var, w7.b6.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26195r2 = frameLayout2;
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131754058, null), true, false, ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(this.f21583a).f18957y7.R.f10700a).f16658c, p6Var);
        this.f26196s2 = m3Var;
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        k3Var.setImeOptions(6);
        k3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i11);
        m3Var.setBackground(d03);
        org.telegram.ui.ActionBar.a7.k(m3Var, d03, N2, null, p6Var);
        k3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(m3Var, w7.b6.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        k3Var.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(53.0f), org.telegram.messenger.i0.L(15.0f));
        f0 f0Var2 = new f0(this.f21583a, context, p6Var, true);
        this.f26193p2 = f0Var2;
        f0Var2.setDivider(true);
        f0Var2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        f0Var2.setRoundRadius(12);
        f0Var2.f25904n = new i(this, p6Var, context, 0);
        x1();
        f0Var2.c(-1);
        String M0 = m31.M0();
        this.f26188k2 = M0;
        if (M0 == null) {
            this.f26188k2 = org.telegram.messenger.t10.j();
        }
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.f26672r1 = 0.35f;
        int i12 = org.telegram.ui.ActionBar.t6.f20872a7;
        v0(org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26198u2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i12, this.I0)), org.telegram.ui.ActionBar.t6.w0(i12, this.I0), org.telegram.ui.ActionBar.t6.w0(i12, this.I0)}));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setRoundRadius(24);
        this.f26200w2 = dVar;
        linearLayout.addView(dVar, w7.b6.p(-1, 48, 1.0f, 119));
        vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.f26201x2 = i13;
        i13.setOnClickListener(new c(this, 9));
        i13.setOnLongClickListener(new j(this, p6Var, context, 0));
        linearLayout.addView(i13, w7.b6.t(48, 48, 5, 10, 0, 0, 0));
        vh.d i14 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.f26199v2 = i14;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new ag.x2(), length, spannableStringBuilder.length(), 33);
        i14.setText(spannableStringBuilder);
        i14.setOnClickListener(new org.telegram.ui.ud(9, this, p6Var));
        FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 80);
        int i15 = e.leftMargin;
        int i16 = this.f21615t0;
        e.leftMargin = i15 + i16;
        e.rightMargin += i16;
        this.f21586b.addView(linearLayout, e);
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i17 = d.leftMargin;
        int i18 = this.f21615t0;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.f21586b.addView(i14, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26202y2 = frameLayout3;
        FrameLayout.LayoutParams d10 = w7.b6.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i19 = d10.leftMargin;
        int i20 = this.f21615t0;
        d10.leftMargin = i19 + i20;
        d10.rightMargin += i20;
        this.f21586b.addView(frameLayout3, d10);
        u1(false);
        tk0 tk0Var = this.f26666k1;
        int i21 = this.f21615t0;
        tk0Var.setPadding(i21, 0, i21, org.telegram.messenger.i0.L(66.0f));
        this.f26666k1.setClipToPadding(false);
        this.f26666k1.r1();
        this.f26666k1.setOnItemClickListener(new k(this, 0));
        this.F1 = true;
        n nVar = new n(this);
        nVar.f47927m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.f26666k1.setItemAnimator(nVar);
        this.f26666k1.setOnScrollListener(new ag.u(this, 10));
        this.G2.O(false);
        org.telegram.messenger.i0.g3(new a(this, 0));
        org.telegram.messenger.zs.f(this.f21583a).c(this, org.telegram.messenger.zs.Y3);
    }

    public static void d1(g0 g0Var, View view) {
        g0Var.f26189l2 = !g0Var.f26189l2;
        g0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof ep) {
                ((ep) linearLayout.getChildAt(0)).a(g0Var.f26189l2, true);
            }
        }
    }

    public static void e1(g0 g0Var, int i10) {
        f0 f0Var = g0Var.f26192o2;
        if (f0Var.getSelectedTab() == i10) {
            return;
        }
        vh.p2 p2Var = g0Var.f26197t2;
        if (p2Var != null) {
            p2Var.e(true);
        }
        f0Var.c(i10);
        g0Var.p1();
        g0Var.G2.O(true);
    }

    public static void f1(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i10;
        f0 f0Var = g0Var.f26193p2;
        vh.p2 p2Var = g0Var.f26197t2;
        if (p2Var != null) {
            p2Var.e(true);
        }
        if (aiComposeTone instanceof a0) {
            f0Var.d(aiComposeTone);
            g0Var.G2.O(true);
            org.telegram.messenger.i0.h3(new a(g0Var, 3), 150L);
        } else if (aiComposeTone == null) {
            ArrayList arrayList = g0Var.f26190m2.f15336b;
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (arrayList.get(i12) instanceof TL_aicompose.TL_aiComposeTone) {
                    i11++;
                }
            }
            int i13 = i11 + 1;
            if (org.telegram.messenger.d20.i(g0Var.f21583a).q()) {
                i10 = ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(g0Var.f21583a).f18957y7.T.f10700a).f16658c;
            } else {
                i10 = ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(g0Var.f21583a).f18957y7.S.f10700a).f16658c;
            }
            if (i13 > i10) {
                t1(new cc(g0Var.f26202y2, g0Var.I0), g0Var.f21583a);
                return;
            }
            z zVar = new z(g0Var.getContext(), g0Var.I0);
            zVar.f32854c2 = new f(g0Var, 1);
            zVar.show();
        } else if (f0Var.getSelectedTone() != aiComposeTone) {
            f0Var.d(aiComposeTone);
            g0Var.p1();
            g0Var.G2.O(true);
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
                    for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                        if (i10 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            j1(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (i11 > 0) {
                                    sb2.append("\n");
                                }
                                i1(arrayList.get(i11), sb2);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                        if (i12 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            j1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (i13 > 0) {
                                    sb2.append("\n");
                                }
                                i1(arrayList2.get(i13), sb2);
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
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                j1(textconcat.texts.get(i10), sb2);
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
                        spannableStringBuilder.append((CharSequence) bi.s6.r(richText, null, true));
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                        if (i10 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            spannableStringBuilder.append((CharSequence) bi.s6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (i11 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                k1(arrayList.get(i11), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                        if (i12 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            spannableStringBuilder.append((CharSequence) bi.s6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (i13 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                k1(arrayList2.get(i13), spannableStringBuilder);
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
                spannableStringBuilder.append((CharSequence) bi.s6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) bi.s6.r(pageBlock.text, pageBlock, true));
    }

    public static void t1(cc ccVar, int i10) {
        int i11;
        String a02;
        if (ccVar.W() == null) {
            return;
        }
        org.telegram.messenger.s0 s0Var = org.telegram.messenger.vp.r1(i10).f18957y7;
        boolean q6 = org.telegram.messenger.d20.i(i10).q();
        if (!q6) {
            i11 = 2131624214;
        } else {
            i11 = 2131624011;
        }
        String L0 = org.telegram.messenger.cd.L0(2131754976, null);
        if (!q6) {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.l0) s0Var.S.f10700a).f16658c), Integer.valueOf(((org.telegram.messenger.l0) s0Var.T.f10700a).f16658c));
        } else {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.l0) s0Var.T.f10700a).f16658c));
        }
        ccVar.I(i11, L0, org.telegram.messenger.i0.T2(a02, new tf(ccVar, 1))).j();
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, 0, true, new d(this, 0), this.I0);
        this.G2 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.E2 == null) {
            this.E2 = org.telegram.messenger.cd.L0(2131755006, null);
            bi0 bi0Var = new bi0(2131624010, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            this.F2 = bi0Var;
            bi0Var.J(true);
            this.F2.K(1);
        }
        return this.E2;
    }

    @Override
    public final void Q0(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.f26194q2;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.Y3) {
            x1();
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.Y3);
        org.telegram.messenger.e eVar = this.f26190m2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(z60 z60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, getContext(), this.I0, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(str);
        b1Var.setChecked(z10);
        b1Var.d(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        b1Var.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)));
        b1Var.setOnClickListener(new h(z60Var, z10, runnable, 0));
        linearLayout.addView(b1Var, w7.b6.o(-1, -2));
    }

    @Override
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        LinearLayout linearLayout = this.f26198u2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.I2 >= 0) {
            ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.I2, true);
            this.I2 = -1;
        }
        this.J2 = false;
        org.telegram.ui.ActionBar.u5 titleTextView = this.l1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (!this.J2) {
            int selectedTab = this.f26192o2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.R1) {
                    return this.T1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.X1) {
                    return this.Z1;
                }
                return null;
            } else if (this.U1) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.W1;
                if (richMessage == null) {
                    return this.Q1;
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
                for (int i10 = 0; i10 < l1.blocks.size(); i10++) {
                    if (i10 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    k1(l1.blocks.get(i10), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.J2) {
            int selectedTab = this.f26192o2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.R1) {
                    return this.S1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.X1) {
                    return this.a2;
                }
                return null;
            } else if (this.U1) {
                return null;
            } else {
                Spannable spannable = this.V1;
                if (spannable == null) {
                    return this.P1;
                }
                return spannable;
            }
        } else {
            return null;
        }
    }

    public final boolean n1() {
        if (this.Q1 != null) {
            return true;
        }
        return false;
    }

    public final a51 o1(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.Q1;
        }
        int i11 = org.telegram.messenger.ku.f16636b;
        a51 K = a51.K(org.telegram.messenger.ku.class);
        K.G = richMessage;
        K.d = i10;
        K.e = z10;
        return K;
    }

    public final void p1() {
        String charSequence;
        String str;
        Spannable spannable;
        Spannable spannable2;
        Spannable spannable3;
        Spannable spannable4;
        String str2;
        String str3;
        String str4;
        boolean n12 = n1();
        da daVar = this.l1;
        f0 f0Var = this.f26193p2;
        f0 f0Var2 = this.f26192o2;
        if (n12) {
            int selectedTab = f0Var2.getSelectedTab();
            String str5 = "";
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.Q1;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str2 = str5;
                str3 = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                    tL_inputRichMessage.blocks.add(org.telegram.messenger.qz.y0(richMessage.blocks.get(i10)));
                }
                ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputRichMessage.flags |= 4;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Photo photo = arrayList2.get(i11);
                        i11++;
                        TLRPC.Photo photo2 = photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        String str6 = str5;
                        tL_inputPhoto.f19812id = photo2.f19817id;
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
                    int i12 = 0;
                    while (i12 < size2) {
                        TLRPC.Document document = arrayList4.get(i12);
                        i12++;
                        TLRPC.Document document2 = document;
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f19805id = document2.f19799id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.t10.D(this.f26188k2);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f26189l2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (TextUtils.isEmpty(this.A2)) {
                        str4 = str2;
                    } else {
                        str4 = this.A2;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str4;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f20006id = tL_aiComposeTone.f20005id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f26189l2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.L2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.J2 = true;
                    this.B2 = false;
                    u1(true);
                    org.telegram.ui.ActionBar.u5 titleTextView = daVar.getTitleTextView();
                    titleTextView.i(this.F2);
                    this.F2.start();
                    if (selectedTab == 0) {
                        this.R1 = true;
                    } else if (selectedTab == 1) {
                        this.U1 = true;
                    } else if (selectedTab == 2) {
                        this.X1 = true;
                    }
                    this.I2 = ConnectionsManager.getInstance(this.f21583a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new a3.b(1), new org.telegram.ui.f0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 2));
                    this.G2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.P1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.f21583a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        int selectedTab2 = f0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.t10.D(this.f26188k2);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f26189l2;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = f0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.A2)) {
                    str = "";
                } else {
                    str = this.A2;
                }
                inputaicomposetonesingleuse2.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f20006id = tL_aiComposeTone2.f20005id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f26189l2;
        } else if (selectedTab2 == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.K2[selectedTab2];
        if (tL_messages_composeMessageWithAI2 == null || tL_messages_composeMessageWithAI2.proofread != tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI2.emojify != tL_messages_composeMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            if (!tL_messages_composeMessageWithAI.emojify && !tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI.tone == null && tL_messages_composeMessageWithAI.translate_to_lang == null) {
                return;
            }
            this.J2 = true;
            this.B2 = false;
            u1(true);
            org.telegram.ui.ActionBar.u5 titleTextView2 = daVar.getTitleTextView();
            titleTextView2.i(this.F2);
            this.F2.start();
            int selectedTab3 = f0Var2.getSelectedTab();
            Spannable spannable5 = this.P1;
            if (selectedTab3 == 0 && (spannable4 = this.S1) != null) {
                spannable5 = spannable4;
            }
            if (selectedTab3 == 1 && (spannable3 = this.V1) != null) {
                spannable5 = spannable3;
            }
            if (selectedTab3 == 2 && (spannable2 = this.Y1) != null) {
                spannable = spannable2;
            } else {
                spannable = spannable5;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            int L = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(64.0f);
            int i13 = this.f21615t0;
            int b10 = w7.u.b(new StaticLayout(spannable, textPaint, (L - i13) - i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < b10; i14++) {
                if (i14 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = org.telegram.messenger.i0.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131748789, null));
                u80 u80Var = new u80(null, L2, 0, null);
                u80Var.f30869f = org.telegram.messenger.i0.L(6.0f);
                u80Var.h = 0.5f;
                u80Var.f30870n = true;
                spannableStringBuilder.setSpan(u80Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.R1 = true;
                this.S1 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.U1 = true;
                this.V1 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.X1 = true;
                this.Y1 = spannableStringBuilder;
            }
            this.I2 = ConnectionsManager.getInstance(this.f21583a).sendRequestTyped(tL_messages_composeMessageWithAI, new a3.b(1), new org.telegram.ui.f0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 1));
            this.G2.O(true);
        }
    }

    public final void q1(int i10, int i11, boolean z10) {
        if (this.f26184g2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.f26184g2.a(l1, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
            }
        } else if (this.f26183f2 != null && m1() != null) {
            this.f26183f2.a(m1(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
        }
    }

    public final void r1(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!c3.i0.t(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {zz0.class, di.i.class, gv0.class, h51.class, g51.class, d51.class, e51.class, n00.class, c51.class, b51.class, o5.class};
            for (int i10 = 0; i10 < 11; i10++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i10])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.P1 = spannableStringBuilder;
        org.telegram.messenger.js.d(editable.toString(), new b(this, 0), new org.telegram.ui.Cells.m5(17), false);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0);
            if (w02 != this.M2) {
                this.M2 = w02;
                v0(w02);
                this.f26198u2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        this.Q1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
            if (i10 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i10), sb2);
        }
        org.telegram.messenger.js.d(sb2.toString(), new b(this, 1), new org.telegram.ui.Cells.m5(18), false);
        x1();
    }

    @Override
    public final void show() {
        int i10;
        int i11;
        super.show();
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle(O0());
        }
        if (!this.f26182e2 && (this.f26184g2 != null || this.f26183f2 != null)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        vh.d dVar = this.f26201x2;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131745657, null));
        if (this.f26182e2) {
            i11 = 2131231152;
        } else {
            i11 = 2131232691;
        }
        dq dqVar = new dq(i11, 0);
        dqVar.f25509s = org.telegram.messenger.i0.L(1.0f);
        spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.G2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        boolean z11 = this.B2;
        int i12 = 0;
        vh.d dVar = this.f26200w2;
        if (z11) {
            dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
            dVar.setOnClickListener(new c(this, 0));
        } else {
            f0 f0Var = this.f26192o2;
            if (f0Var != null) {
                i10 = f0Var.getSelectedTab();
            } else {
                i10 = 0;
            }
            if (i10 == 1 && (this.f26193p2.getSelectedTone() instanceof a0) && !TextUtils.equals(this.f26196s2.getText().toString(), this.A2)) {
                dVar.setText(org.telegram.messenger.cd.L0(2131754059, null));
                dVar.setOnClickListener(new c(this, 1));
            } else if (this.f26180c2 == null && this.f26179b2 == null) {
                dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.cd.L0(2131755002, null));
                dVar.setOnClickListener(new c(this, 2));
            }
        }
        dVar.setLoading(this.J2);
        if (z10 && this.D2 == this.C2) {
            return;
        }
        boolean z12 = this.C2;
        this.D2 = z12;
        float f11 = 0.0f;
        LinearLayout linearLayout = this.f26198u2;
        vh.d dVar2 = this.f26199v2;
        if (z10) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.C2) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            gr grVar = gr.h;
            alpha.setInterpolator(grVar).setDuration(320L).withEndAction(new a(this, 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.C2) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(grVar).setDuration(320L).withEndAction(new a(this, 2)).start();
            return;
        }
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        dVar2.setVisibility(i11);
        if (this.C2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        dVar2.setAlpha(f7);
        if (this.C2) {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        if (!this.C2) {
            f11 = 1.0f;
        }
        linearLayout.setAlpha(f11);
    }

    public final void v1() {
        float f7;
        String str = this.A2;
        org.telegram.ui.Cells.m3 m3Var = this.f26196s2;
        boolean equals = TextUtils.equals(str, m3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.f26203z2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = m3Var.d.animate();
        this.f26203z2 = z10;
        if (!equals) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        org.telegram.messenger.z20.l(animate, f7, 320L);
        this.G2.O(true);
    }

    public final void w1() {
        tk0 tk0Var;
        View view;
        if (this.f26197t2 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            tk0Var = this.f26666k1;
            if (i10 < tk0Var.getChildCount()) {
                view = tk0Var.getChildAt(i10);
                a51 G = this.G2.G(RecyclerView.R(view) - 1);
                if (G != null && G.f24286c == this.f26193p2) {
                    break;
                }
                i10++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f26197t2.setVisibility(0);
            this.f26197t2.setTranslationY(view.getY() + tk0Var.getY() + view.getHeight());
            return;
        }
        this.f26197t2.setVisibility(4);
        this.f26197t2.e(true);
    }

    public final void x1() {
        f0 f0Var = this.f26193p2;
        TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
        f0Var.f25902c.removeAllViews();
        if (n1()) {
            f0Var.b(new TL_aicompose.AiComposeTone(), new f(this, 0));
        }
        f0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.f26190m2.f15336b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != f0Var.getSelectedTone()) {
            f0Var.d(null);
        }
    }
}
