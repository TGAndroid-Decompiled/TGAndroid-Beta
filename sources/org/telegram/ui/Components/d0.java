package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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
public final class d0 extends ja implements org.telegram.messenger.is {
    public final hi.d A2;
    public final hi.d B2;
    public final FrameLayout C2;
    public boolean D2;
    public String E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public String I2;
    public ch0 J2;
    public p41 K2;
    public boolean L2;
    public int M2;
    public boolean N2;
    public final TLRPC.TL_messages_composeMessageWithAI[] O2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] P2;
    public int Q2;
    public CharSequence T1;
    public TL_iv.RichMessage U1;
    public boolean V1;
    public CharSequence W1;
    public TL_iv.RichMessage X1;
    public boolean Y1;
    public CharSequence Z1;
    public TL_iv.RichMessage f33749a2;
    public boolean f33750b2;
    public CharSequence f33751c2;
    public TL_iv.RichMessage d2;
    public CharSequence f33752e2;
    public org.telegram.messenger.z10 f33753f2;
    public org.telegram.messenger.z10 f33754g2;
    public long f33755h2;
    public boolean f33756i2;
    public org.telegram.messenger.w10 f33757j2;
    public ld f33758k2;
    public final boolean[] f33759l2;
    public final boolean[] f33760m2;
    public String f33761n2;
    public String f33762o2;
    public boolean f33763p2;
    public final org.telegram.messenger.e f33764q2;
    public final FrameLayout f33765r2;
    public final c0 f33766s2;
    public final c0 f33767t2;
    public final ImageView f33768u2;
    public final FrameLayout f33769v2;
    public final org.telegram.ui.Cells.k3 f33770w2;
    public hi.l3 f33771x2;
    public final LinearLayout f33772y2;
    public final hi.d f33773z2;

    public d0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        this.f33759l2 = new boolean[1];
        this.f33760m2 = new boolean[1];
        this.L2 = true;
        this.M2 = -1;
        this.O2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.P2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e R1 = org.telegram.messenger.np.s1(this.f29679a).R1();
        this.f33764q2 = R1;
        R1.b();
        R1.d = true;
        ImageView imageView = new ImageView(context);
        this.f33768u2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i7, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var);
        this.f35932p1.addView(imageView, c8.ja.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.na.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33765r2 = frameLayout;
        c0 c0Var = new c0(this.f29679a, context, e6Var, false);
        this.f33766s2 = c0Var;
        c0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(28.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        c0Var.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(c0Var, d02, M, null, e6Var);
        c0Var.setRoundRadius(28);
        c0Var.a(2131232477, org.telegram.messenger.hd.M0(2131754962, null), new f(this, 3));
        c0Var.a(2131231877, org.telegram.messenger.hd.M0(2131754963, null), new f(this, 3));
        c0Var.a(2131231864, org.telegram.messenger.hd.M0(2131754964, null), new f(this, 3));
        c0Var.c(1);
        frameLayout.addView(c0Var, c8.ja.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33769v2 = frameLayout2;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.f29679a).f25451y7.R.f15881b).f24498c, e6Var);
        this.f33770w2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i10);
        k3Var.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(k3Var, d03, M2, null, e6Var);
        i3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(k3Var, c8.ja.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        i3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        c0 c0Var2 = new c0(this.f29679a, context, e6Var, true);
        this.f33767t2 = c0Var2;
        c0Var2.setDivider(true);
        c0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        c0Var2.setRoundRadius(12);
        c0Var2.f33445n = new hi.s4(this, e6Var, context, 1);
        x1();
        c0Var2.c(-1);
        String M0 = p21.M0();
        this.f33762o2 = M0;
        if (M0 == null) {
            this.f33762o2 = org.telegram.messenger.c10.j();
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f35938v1 = 0.35f;
        int i11 = org.telegram.ui.ActionBar.j6.f28792a7;
        v0(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33772y2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, org.telegram.ui.ActionBar.j6.w0(i11, this.J0)), org.telegram.ui.ActionBar.j6.w0(i11, this.J0), org.telegram.ui.ActionBar.j6.w0(i11, this.J0)}));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        this.A2 = dVar;
        linearLayout.addView(dVar, c8.ja.p(-1, 48, 1.0f, 119));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.B2 = g10;
        g10.setOnClickListener(new c(this, 9));
        g10.setOnLongClickListener(new i(this, e6Var, context, 0));
        linearLayout.addView(g10, c8.ja.t(48, 48, 5, 10, 0, 0, 0));
        hi.d g11 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.f33773z2 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.p1(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new org.telegram.messenger.video.e(24, this, e6Var));
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.f29717u0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.f29682b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i14 = d.leftMargin;
        int i15 = this.f29717u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f29682b.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.C2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.ja.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i16 = d2.leftMargin;
        int i17 = this.f29717u0;
        d2.leftMargin = i16 + i17;
        d2.rightMargin += i17;
        this.f29682b.addView(frameLayout3, d2);
        u1(false);
        uj0 uj0Var = this.f35931o1;
        int i18 = this.f29717u0;
        uj0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(66.0f));
        this.f35931o1.setClipToPadding(false);
        this.f35931o1.r1();
        this.f35931o1.setOnItemClickListener(new j(this, 0));
        this.J1 = true;
        m mVar = new m(this);
        mVar.f58564m = false;
        mVar.C = false;
        mVar.o(er.h);
        mVar.n(350L);
        this.f35931o1.setItemAnimator(mVar);
        this.f35931o1.setOnScrollListener(new bi.z4(this, 27));
        this.K2.O(false);
        org.telegram.messenger.g0.h3(new a(this, 0));
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.Y3);
    }

    public static void d1(d0 d0Var, View view) {
        d0Var.f33763p2 = !d0Var.f33763p2;
        d0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof fp) {
                ((fp) linearLayout.getChildAt(0)).a(d0Var.f33763p2, true);
            }
        }
    }

    public static void e1(d0 d0Var, int i7) {
        c0 c0Var = d0Var.f33766s2;
        if (c0Var.getSelectedTab() == i7) {
            return;
        }
        hi.l3 l3Var = d0Var.f33771x2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        c0Var.c(i7);
        d0Var.p1();
        d0Var.K2.O(true);
    }

    public static void f1(d0 d0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i7;
        c0 c0Var = d0Var.f33767t2;
        hi.l3 l3Var = d0Var.f33771x2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (aiComposeTone instanceof z) {
            c0Var.d(aiComposeTone);
            d0Var.K2.O(true);
            org.telegram.messenger.g0.i3(new a(d0Var, 3), 150L);
        } else if (aiComposeTone == null) {
            ArrayList arrayList = d0Var.f33764q2.f23218b;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                    i10++;
                }
            }
            int i12 = i10 + 1;
            if (org.telegram.messenger.m10.i(d0Var.f29679a).q()) {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(d0Var.f29679a).f25451y7.T.f15881b).f24498c;
            } else {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(d0Var.f29679a).f25451y7.S.f15881b).f24498c;
            }
            if (i12 > i7) {
                t1(new cc(d0Var.C2, d0Var.J0), d0Var.f29679a);
                return;
            }
            y yVar = new y(d0Var.getContext(), d0Var.J0);
            yVar.f41815g2 = new f(d0Var, 1);
            yVar.show();
        } else if (c0Var.getSelectedTone() != aiComposeTone) {
            c0Var.d(aiComposeTone);
            d0Var.p1();
            d0Var.K2.O(true);
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
                        spannableStringBuilder.append((CharSequence) oi.a6.r(richText, null, true));
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
                            spannableStringBuilder.append((CharSequence) oi.a6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
                            spannableStringBuilder.append((CharSequence) oi.a6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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
                spannableStringBuilder.append((CharSequence) oi.a6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) oi.a6.r(pageBlock.text, pageBlock, true));
    }

    public static void t1(cc ccVar, int i7) {
        int i10;
        String a02;
        if (ccVar.W() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.np.s1(i7).f25451y7;
        boolean q10 = org.telegram.messenger.m10.i(i7).q();
        if (!q10) {
            i10 = 2131624217;
        } else {
            i10 = 2131624012;
        }
        String M0 = org.telegram.messenger.hd.M0(2131754976, null);
        if (!q10) {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.S.f15881b).f24498c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f15881b).f24498c));
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f15881b).f24498c));
        }
        ccVar.I(i10, M0, org.telegram.messenger.g0.U2(a02, new dg(ccVar, 1))).j();
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, true, new d(this, 0), this.J0);
        this.K2 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.I2 == null) {
            this.I2 = org.telegram.messenger.hd.M0(2131755006, null);
            ch0 ch0Var = new ch0(2131624011, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.J2 = ch0Var;
            ch0Var.J(true);
            this.J2.K(1);
        }
        return this.I2;
    }

    @Override
    public final void Q0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f33768u2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.Y3) {
            x1();
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.Y3);
        org.telegram.messenger.e eVar = this.f33764q2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(m60 m60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        int i10 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.J0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z10);
        z0Var.d(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(i7, this.J0)));
        z0Var.setOnClickListener(new h(m60Var, z10, runnable, 0));
        linearLayout.addView(z0Var, c8.ja.o(-1, -2));
    }

    @Override
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.f33772y2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.M2 >= 0) {
            ConnectionsManager.getInstance(this.f29679a).cancelRequest(this.M2, true);
            this.M2 = -1;
        }
        this.N2 = false;
        org.telegram.ui.ActionBar.j5 titleTextView = this.f35932p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (!this.N2) {
            int selectedTab = this.f33766s2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.V1) {
                    return this.X1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f33750b2) {
                    return this.d2;
                }
                return null;
            } else if (this.Y1) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.f33749a2;
                if (richMessage == null) {
                    return this.U1;
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
        } else if (!this.N2) {
            int selectedTab = this.f33766s2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.V1) {
                    return this.W1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f33750b2) {
                    return this.f33752e2;
                }
                return null;
            } else if (this.Y1) {
                return null;
            } else {
                CharSequence charSequence = this.Z1;
                if (charSequence == null) {
                    return this.T1;
                }
                return charSequence;
            }
        } else {
            return null;
        }
    }

    public final boolean n1() {
        if (this.U1 != null) {
            return true;
        }
        return false;
    }

    public final b41 o1(int i7, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U1;
        }
        int i10 = org.telegram.messenger.wt.f27394b;
        b41 K = b41.K(org.telegram.messenger.wt.class);
        K.G = richMessage;
        K.d = i7;
        K.f33178e = z10;
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
        fa faVar = this.f35932p1;
        c0 c0Var = this.f33767t2;
        c0 c0Var2 = this.f33766s2;
        if (n1) {
            int selectedTab = c0Var2.getSelectedTab();
            String str5 = "";
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.U1;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str2 = str5;
                str3 = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
                    tL_inputRichMessage.blocks.add(org.telegram.messenger.ez.y0(richMessage.blocks.get(i7)));
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
                        tL_inputPhoto.f28070id = photo2.f28075id;
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
                        tL_inputDocument.f28063id = document2.f28057id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.c10.D(this.f33762o2);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f33763p2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = c0Var.getSelectedTone();
                if (selectedTone instanceof z) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (TextUtils.isEmpty(this.E2)) {
                        str4 = str2;
                    } else {
                        str4 = this.E2;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str4;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f28265id = tL_aiComposeTone.f28264id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f33763p2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.P2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.N2 = true;
                    this.F2 = false;
                    u1(true);
                    org.telegram.ui.ActionBar.j5 titleTextView = faVar.getTitleTextView();
                    titleTextView.i(this.J2);
                    this.J2.start();
                    if (selectedTab == 0) {
                        this.V1 = true;
                    } else if (selectedTab == 1) {
                        this.Y1 = true;
                    } else if (selectedTab == 2) {
                        this.f33750b2 = true;
                    }
                    this.M2 = ConnectionsManager.getInstance(this.f29679a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(1), new di.k0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 6));
                    this.K2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.T1};
        tL_textWithEntities.entities = org.telegram.messenger.si.b0(this.f29679a).W(charSequenceArr, true, true);
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence6.toString();
        }
        tL_textWithEntities.text = charSequence;
        int selectedTab2 = c0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.c10.D(this.f33762o2);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f33763p2;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = c0Var.getSelectedTone();
            if (selectedTone2 instanceof z) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.E2)) {
                    str = "";
                } else {
                    str = this.E2;
                }
                inputaicomposetonesingleuse2.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f28265id = tL_aiComposeTone2.f28264id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f33763p2;
        } else if (selectedTab2 == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.O2[selectedTab2];
        if (tL_messages_composeMessageWithAI2 == null || tL_messages_composeMessageWithAI2.proofread != tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI2.emojify != tL_messages_composeMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            if (!tL_messages_composeMessageWithAI.emojify && !tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI.tone == null && tL_messages_composeMessageWithAI.translate_to_lang == null) {
                return;
            }
            this.N2 = true;
            this.F2 = false;
            u1(true);
            org.telegram.ui.ActionBar.j5 titleTextView2 = faVar.getTitleTextView();
            titleTextView2.i(this.J2);
            this.J2.start();
            int selectedTab3 = c0Var2.getSelectedTab();
            CharSequence charSequence7 = this.T1;
            if (selectedTab3 == 0 && (charSequence5 = this.W1) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.Z1) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.f33751c2) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            int L = org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(64.0f);
            int i12 = this.f29717u0;
            int b10 = c8.i9.b(new StaticLayout(charSequence2, textPaint, (L - i12) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < b10; i13++) {
                if (i13 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748779, null));
                e80 e80Var = new e80(null, L2, 0, null);
                e80Var.f34244f = org.telegram.messenger.g0.L(6.0f);
                e80Var.h = 0.5f;
                e80Var.f34245n = true;
                spannableStringBuilder.setSpan(e80Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.V1 = true;
                this.W1 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.Y1 = true;
                this.Z1 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f33750b2 = true;
                this.f33751c2 = spannableStringBuilder;
            }
            this.M2 = ConnectionsManager.getInstance(this.f29679a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new di.k0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 5));
            this.K2.O(true);
        }
    }

    public final void q1(int i7, int i10, boolean z10) {
        if (this.f33758k2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.f33758k2.a(l1, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
            }
        } else if (this.f33757j2 != null && m1() != null) {
            this.f33757j2.a(m1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
        }
    }

    public final void r1(TL_iv.RichMessage richMessage) {
        this.U1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.b6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.br(8), false);
        x1();
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
            if (w02 != this.Q2) {
                this.Q2 = w02;
                v0(w02);
                this.f33772y2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(CharSequence charSequence) {
        String str;
        Object[] spans;
        if (!(charSequence instanceof Spanned)) {
            str = charSequence.toString();
        } else {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {xy0.class, qi.g.class, fu0.class, i41.class, h41.class, e41.class, f41.class, d00.class, d41.class, c41.class, p5.class};
            for (int i7 = 0; i7 < 11; i7++) {
                for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i7])) {
                    spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
                }
            }
            str = spannableStringBuilder;
        }
        this.T1 = str;
        org.telegram.messenger.b6.d(charSequence.toString(), new b(this, 0), new org.telegram.ui.br(7), false);
    }

    @Override
    public final void show() {
        int i7;
        int i10;
        super.show();
        fa faVar = this.f35932p1;
        if (faVar != null) {
            faVar.setTitle(O0());
        }
        if (!this.f33756i2 && (this.f33758k2 != null || this.f33757j2 != null)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hi.d dVar = this.B2;
        dVar.setVisibility(i7);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131745640, null));
        if (this.f33756i2) {
            i10 = 2131231152;
        } else {
            i10 = 2131232695;
        }
        eq eqVar = new eq(i10, 0);
        eqVar.f34415s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.K2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z10) {
        int i7;
        int i10;
        float f10;
        float f11;
        boolean z11 = this.F2;
        int i11 = 0;
        hi.d dVar = this.A2;
        if (z11) {
            dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
            dVar.setOnClickListener(new c(this, 0));
        } else {
            c0 c0Var = this.f33766s2;
            if (c0Var != null) {
                i7 = c0Var.getSelectedTab();
            } else {
                i7 = 0;
            }
            if (i7 == 1 && (this.f33767t2.getSelectedTone() instanceof z) && !TextUtils.equals(this.f33770w2.getText().toString(), this.E2)) {
                dVar.setText(org.telegram.messenger.hd.M0(2131754059, null));
                dVar.setOnClickListener(new c(this, 1));
            } else if (this.f33754g2 == null && this.f33753f2 == null) {
                dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.hd.M0(2131755002, null));
                dVar.setOnClickListener(new c(this, 2));
            }
        }
        dVar.setLoading(this.N2);
        if (z10 && this.H2 == this.G2) {
            return;
        }
        boolean z12 = this.G2;
        this.H2 = z12;
        float f12 = 0.0f;
        LinearLayout linearLayout = this.f33772y2;
        hi.d dVar2 = this.f33773z2;
        if (z10) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.G2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            er erVar = er.h;
            alpha.setInterpolator(erVar).setDuration(320L).withEndAction(new a(this, 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.G2) {
                f12 = 1.0f;
            }
            animate2.alpha(f12).setInterpolator(erVar).setDuration(320L).withEndAction(new a(this, 2)).start();
            return;
        }
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        if (this.G2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        dVar2.setAlpha(f10);
        if (this.G2) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (!this.G2) {
            f12 = 1.0f;
        }
        linearLayout.setAlpha(f12);
    }

    public final void v1() {
        float f10;
        String str = this.E2;
        org.telegram.ui.Cells.k3 k3Var = this.f33770w2;
        boolean equals = TextUtils.equals(str, k3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.D2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = k3Var.d.animate();
        this.D2 = z10;
        if (!equals) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.i20.m(animate, f10, 320L);
        this.K2.O(true);
    }

    public final void w1() {
        uj0 uj0Var;
        View view;
        if (this.f33771x2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            uj0Var = this.f35931o1;
            if (i7 < uj0Var.getChildCount()) {
                view = uj0Var.getChildAt(i7);
                b41 G = this.K2.G(RecyclerView.R(view) - 1);
                if (G != null && G.f33177c == this.f33767t2) {
                    break;
                }
                i7++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f33771x2.setVisibility(0);
            this.f33771x2.setTranslationY(view.getY() + uj0Var.getY() + view.getHeight());
            return;
        }
        this.f33771x2.setVisibility(4);
        this.f33771x2.f(true);
    }

    public final void x1() {
        c0 c0Var = this.f33767t2;
        TL_aicompose.AiComposeTone selectedTone = c0Var.getSelectedTone();
        c0Var.f33442c.removeAllViews();
        if (n1()) {
            c0Var.b(new TL_aicompose.AiComposeTone(), new f(this, 0));
        }
        c0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.f33764q2.f23218b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != c0Var.getSelectedTone()) {
            c0Var.d(null);
        }
    }
}
