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
public final class e0 extends ma implements org.telegram.messenger.cs {
    public boolean A2;
    public String B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public String F2;
    public ch0 G2;
    public f41 H2;
    public boolean I2;
    public int J2;
    public boolean K2;
    public final TLRPC.TL_messages_composeMessageWithAI[] L2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] M2;
    public int N2;
    public CharSequence Q1;
    public TL_iv.RichMessage R1;
    public boolean S1;
    public CharSequence T1;
    public TL_iv.RichMessage U1;
    public boolean V1;
    public CharSequence W1;
    public TL_iv.RichMessage X1;
    public boolean Y1;
    public CharSequence Z1;
    public TL_iv.RichMessage f33234a2;
    public CharSequence f33235b2;
    public org.telegram.messenger.u10 c2;
    public org.telegram.messenger.u10 f33236d2;
    public long f33237e2;
    public boolean f33238f2;
    public org.telegram.messenger.r10 f33239g2;
    public kd f33240h2;
    public final boolean[] f33241i2;
    public final boolean[] f33242j2;
    public String f33243k2;
    public String f33244l2;
    public boolean f33245m2;
    public final org.telegram.messenger.e f33246n2;
    public final FrameLayout f33247o2;
    public final d0 f33248p2;
    public final d0 f33249q2;
    public final ImageView f33250r2;
    public final FrameLayout f33251s2;
    public final org.telegram.ui.Cells.k3 f33252t2;
    public gi.l3 f33253u2;
    public final LinearLayout f33254v2;
    public final gi.d f33255w2;
    public final gi.d f33256x2;
    public final gi.d f33257y2;
    public final FrameLayout f33258z2;

    public e0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        this.f33241i2 = new boolean[1];
        this.f33242j2 = new boolean[1];
        this.I2 = true;
        this.J2 = -1;
        this.L2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.M2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e R1 = org.telegram.messenger.hp.s1(this.f28583a).R1();
        this.f33246n2 = R1;
        R1.b();
        R1.d = true;
        ImageView imageView = new ImageView(context);
        this.f33250r2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i3);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
        this.m1.addView(imageView, b8.mf.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        b8.pf.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new d(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33247o2 = frameLayout;
        d0 d0Var = new d0(this.f28583a, context, e6Var, false);
        this.f33248p2 = d0Var;
        d0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        d0Var.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(d0Var, d02, N, null, e6Var);
        d0Var.setRoundRadius(28);
        d0Var.a(2131232476, org.telegram.messenger.bd.M0(2131754962, null), new g(this, 3));
        d0Var.a(2131231877, org.telegram.messenger.bd.M0(2131754963, null), new g(this, 3));
        d0Var.a(2131231864, org.telegram.messenger.bd.M0(2131754964, null), new g(this, 3));
        d0Var.c(1);
        frameLayout.addView(d0Var, b8.mf.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33251s2 = frameLayout2;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.f28583a).f23167x7.R.f13798b).f23620c, e6Var);
        this.f33252t2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        k3Var.setBackground(d03);
        org.telegram.ui.ActionBar.r6.k(k3Var, d03, N2, null, e6Var);
        i3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(k3Var, b8.mf.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        i3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        d0 d0Var2 = new d0(this.f28583a, context, e6Var, true);
        this.f33249q2 = d0Var2;
        d0Var2.setDivider(true);
        d0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        d0Var2.setRoundRadius(12);
        d0Var2.f32879n = new gi.s4(this, e6Var, context, 1);
        x1();
        d0Var2.c(-1);
        String M0 = f21.M0();
        this.f33244l2 = M0;
        if (M0 == null) {
            this.f33244l2 = org.telegram.messenger.x00.j();
        }
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.f36108s1 = 0.35f;
        int i11 = org.telegram.ui.ActionBar.k6.f27824a7;
        v0(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33254v2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i11, this.J0)), org.telegram.ui.ActionBar.k6.w0(i11, this.J0), org.telegram.ui.ActionBar.k6.w0(i11, this.J0)}));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        this.f33256x2 = dVar;
        linearLayout.addView(dVar, b8.mf.p(-1, 48, 1.0f, 119));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f33257y2 = h;
        h.setOnClickListener(new d(this, 9));
        h.setOnLongClickListener(new j(this, e6Var, context, 0));
        linearLayout.addView(h, b8.mf.t(48, 48, 5, 10, 0, 0, 0));
        gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f33255w2 = h7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new lg.p1(), length, spannableStringBuilder.length(), 33);
        h7.setText(spannableStringBuilder);
        h7.setOnClickListener(new org.telegram.messenger.video.g(23, this, e6Var));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.f28618u0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.f28586b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28618u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28586b.addView(h7, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33258z2 = frameLayout3;
        FrameLayout.LayoutParams d10 = b8.mf.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i16 = d10.leftMargin;
        int i17 = this.f28618u0;
        d10.leftMargin = i16 + i17;
        d10.rightMargin += i17;
        this.f28586b.addView(frameLayout3, d10);
        u1(false);
        tj0 tj0Var = this.f36102l1;
        int i18 = this.f28618u0;
        tj0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(66.0f));
        this.f36102l1.setClipToPadding(false);
        this.f36102l1.r1();
        this.f36102l1.setOnItemClickListener(new k(this, 0));
        this.G1 = true;
        n nVar = new n(this);
        nVar.f55567m = false;
        nVar.C = false;
        nVar.o(xq.h);
        nVar.n(350L);
        this.f36102l1.setItemAnimator(nVar);
        this.f36102l1.setOnScrollListener(new ai.j5(this, 27));
        this.H2.O(false);
        org.telegram.messenger.g0.h3(new a(this, 0));
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.Y3);
    }

    public static void d1(e0 e0Var, View view) {
        e0Var.f33245m2 = !e0Var.f33245m2;
        e0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof wo) {
                ((wo) linearLayout.getChildAt(0)).a(e0Var.f33245m2, true);
            }
        }
    }

    public static void e1(e0 e0Var, int i3) {
        d0 d0Var = e0Var.f33248p2;
        if (d0Var.getSelectedTab() == i3) {
            return;
        }
        gi.l3 l3Var = e0Var.f33253u2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        d0Var.c(i3);
        e0Var.p1();
        e0Var.H2.O(true);
    }

    public static void f1(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i3;
        d0 d0Var = e0Var.f33249q2;
        gi.l3 l3Var = e0Var.f33253u2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (aiComposeTone instanceof a0) {
            d0Var.d(aiComposeTone);
            e0Var.H2.O(true);
            org.telegram.messenger.g0.i3(new a(e0Var, 3), 150L);
        } else if (aiComposeTone == null) {
            ArrayList arrayList = e0Var.f33246n2.f22272b;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                    i10++;
                }
            }
            int i12 = i10 + 1;
            if (org.telegram.messenger.h10.i(e0Var.f28583a).q()) {
                i3 = ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(e0Var.f28583a).f23167x7.T.f13798b).f23620c;
            } else {
                i3 = ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(e0Var.f28583a).f23167x7.S.f13798b).f23620c;
            }
            if (i12 > i3) {
                t1(new fc(e0Var.f33258z2, e0Var.J0), e0Var.f28583a);
                return;
            }
            z zVar = new z(e0Var.getContext(), e0Var.J0);
            zVar.f40878d2 = new g(e0Var, 1);
            zVar.show();
        } else if (d0Var.getSelectedTone() != aiComposeTone) {
            d0Var.d(aiComposeTone);
            e0Var.p1();
            e0Var.H2.O(true);
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
                    for (int i3 = 0; i3 < pageblocklist.items.size(); i3++) {
                        if (i3 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i3);
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
            for (int i3 = 0; i3 < textconcat.texts.size(); i3++) {
                j1(textconcat.texts.get(i3), sb2);
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
                        spannableStringBuilder.append((CharSequence) mi.d6.r(richText, null, true));
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i3 = 0; i3 < pageblocklist.items.size(); i3++) {
                        if (i3 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i3);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            spannableStringBuilder.append((CharSequence) mi.d6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
                            spannableStringBuilder.append((CharSequence) mi.d6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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
                spannableStringBuilder.append((CharSequence) mi.d6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) mi.d6.r(pageBlock.text, pageBlock, true));
    }

    public static void t1(fc fcVar, int i3) {
        int i10;
        String a02;
        if (fcVar.W() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.hp.s1(i3).f23167x7;
        boolean q10 = org.telegram.messenger.h10.i(i3).q();
        if (!q10) {
            i10 = 2131624216;
        } else {
            i10 = 2131624011;
        }
        String M0 = org.telegram.messenger.bd.M0(2131754976, null);
        if (!q10) {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.S.f13798b).f23620c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f13798b).f23620c));
        } else {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f13798b).f23620c));
        }
        fcVar.I(i10, M0, org.telegram.messenger.g0.U2(a02, new vf(fcVar, 1))).j();
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new e(this, 0), this.J0);
        this.H2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.F2 == null) {
            this.F2 = org.telegram.messenger.bd.M0(2131755006, null);
            ch0 ch0Var = new ch0(2131624010, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.G2 = ch0Var;
            ch0Var.J(true);
            this.G2.K(1);
        }
        return this.F2;
    }

    @Override
    public final void Q0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f33250r2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.Y3) {
            x1();
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.Y3);
        org.telegram.messenger.e eVar = this.f33246n2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(f60 f60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)));
        y0Var.setOnClickListener(new i(f60Var, z10, runnable, 0));
        linearLayout.addView(y0Var, b8.mf.o(-1, -2));
    }

    @Override
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.f33254v2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.J2 >= 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.J2, true);
            this.J2 = -1;
        }
        this.K2 = false;
        org.telegram.ui.ActionBar.k5 titleTextView = this.m1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (!this.K2) {
            int selectedTab = this.f33248p2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.S1) {
                    return this.U1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.Y1) {
                    return this.f33234a2;
                }
                return null;
            } else if (this.V1) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.X1;
                if (richMessage == null) {
                    return this.R1;
                }
                return richMessage;
            }
        }
        return null;
    }

    public final CharSequence m1() {
        if (n1()) {
            TL_iv.RichMessage l12 = l1();
            if (l12 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i3 = 0; i3 < l12.blocks.size(); i3++) {
                    if (i3 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    k1(l12.blocks.get(i3), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.K2) {
            int selectedTab = this.f33248p2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.S1) {
                    return this.T1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.Y1) {
                    return this.f33235b2;
                }
                return null;
            } else if (this.V1) {
                return null;
            } else {
                CharSequence charSequence = this.W1;
                if (charSequence == null) {
                    return this.Q1;
                }
                return charSequence;
            }
        } else {
            return null;
        }
    }

    public final boolean n1() {
        if (this.R1 != null) {
            return true;
        }
        return false;
    }

    public final r31 o1(int i3, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.R1;
        }
        int i10 = org.telegram.messenger.rt.f25231b;
        r31 K = r31.K(org.telegram.messenger.rt.class);
        K.G = richMessage;
        K.d = i3;
        K.f37621e = z10;
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
        boolean n12 = n1();
        ia iaVar = this.m1;
        d0 d0Var = this.f33249q2;
        d0 d0Var2 = this.f33248p2;
        if (n12) {
            int selectedTab = d0Var2.getSelectedTab();
            String str5 = "";
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.R1;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str2 = str5;
                str3 = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i3 = 0; i3 < richMessage.blocks.size(); i3++) {
                    tL_inputRichMessage.blocks.add(org.telegram.messenger.yy.y0(richMessage.blocks.get(i3)));
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
                        tL_inputPhoto.f27020id = photo2.f27025id;
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
                        tL_inputDocument.f27013id = document2.f27007id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.x00.D(this.f33244l2);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f33245m2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (TextUtils.isEmpty(this.B2)) {
                        str4 = str2;
                    } else {
                        str4 = this.B2;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str4;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f27215id = tL_aiComposeTone.f27214id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f33245m2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.M2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.K2 = true;
                    this.C2 = false;
                    u1(true);
                    org.telegram.ui.ActionBar.k5 titleTextView = iaVar.getTitleTextView();
                    titleTextView.i(this.G2);
                    this.G2.start();
                    if (selectedTab == 0) {
                        this.S1 = true;
                    } else if (selectedTab == 1) {
                        this.V1 = true;
                    } else if (selectedTab == 2) {
                        this.Y1 = true;
                    }
                    this.J2 = ConnectionsManager.getInstance(this.f28583a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new c3.b(1), new ci.o0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 6));
                    this.H2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.Q1};
        tL_textWithEntities.entities = org.telegram.messenger.li.b0(this.f28583a).W(charSequenceArr, true, true);
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence6.toString();
        }
        tL_textWithEntities.text = charSequence;
        int selectedTab2 = d0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.x00.D(this.f33244l2);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f33245m2;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = d0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.B2)) {
                    str = "";
                } else {
                    str = this.B2;
                }
                inputaicomposetonesingleuse2.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f27215id = tL_aiComposeTone2.f27214id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f33245m2;
        } else if (selectedTab2 == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.L2[selectedTab2];
        if (tL_messages_composeMessageWithAI2 == null || tL_messages_composeMessageWithAI2.proofread != tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI2.emojify != tL_messages_composeMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            if (!tL_messages_composeMessageWithAI.emojify && !tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI.tone == null && tL_messages_composeMessageWithAI.translate_to_lang == null) {
                return;
            }
            this.K2 = true;
            this.C2 = false;
            u1(true);
            org.telegram.ui.ActionBar.k5 titleTextView2 = iaVar.getTitleTextView();
            titleTextView2.i(this.G2);
            this.G2.start();
            int selectedTab3 = d0Var2.getSelectedTab();
            CharSequence charSequence7 = this.Q1;
            if (selectedTab3 == 0 && (charSequence5 = this.T1) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.W1) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.Z1) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            int L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(64.0f);
            int i12 = this.f28618u0;
            int b10 = b8.be.b(new StaticLayout(charSequence2, textPaint, (L - i12) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < b10; i13++) {
                if (i13 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748787, null));
                x70 x70Var = new x70(null, L2, 0, null);
                x70Var.f40263f = org.telegram.messenger.g0.L(6.0f);
                x70Var.h = 0.5f;
                x70Var.f40264n = true;
                spannableStringBuilder.setSpan(x70Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.S1 = true;
                this.T1 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.V1 = true;
                this.W1 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.Y1 = true;
                this.Z1 = spannableStringBuilder;
            }
            this.J2 = ConnectionsManager.getInstance(this.f28583a).sendRequestTyped(tL_messages_composeMessageWithAI, new c3.b(1), new ci.o0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 5));
            this.H2.O(true);
        }
    }

    public final void q1(int i3, int i10, boolean z10) {
        if (this.f33240h2 != null) {
            TL_iv.RichMessage l12 = l1();
            if (l12 != null) {
                this.f33240h2.a(l12, Integer.valueOf(i3), Integer.valueOf(i10), Boolean.valueOf(z10));
            }
        } else if (this.f33239g2 != null && m1() != null) {
            this.f33239g2.a(m1(), Integer.valueOf(i3), Integer.valueOf(i10), Boolean.valueOf(z10));
        }
    }

    public final void r1(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!com.google.android.recaptcha.internal.a.u(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {uy0.class, oi.h.class, du0.class, y31.class, x31.class, u31.class, v31.class, vz.class, t31.class, s31.class, p5.class};
            for (int i3 = 0; i3 < 11; i3++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i3])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.Q1 = spannableStringBuilder;
        org.telegram.messenger.b6.d(editable.toString(), new b(this, 0), new c(0), false);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
            if (w02 != this.N2) {
                this.N2 = w02;
                v0(w02);
                this.f33254v2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        this.R1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < richMessage.blocks.size(); i3++) {
            if (i3 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i3), sb2);
        }
        org.telegram.messenger.b6.d(sb2.toString(), new b(this, 1), new c(1), false);
        x1();
    }

    @Override
    public final void show() {
        int i3;
        int i10;
        super.show();
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
        if (!this.f33238f2 && (this.f33240h2 != null || this.f33239g2 != null)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        gi.d dVar = this.f33257y2;
        dVar.setVisibility(i3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131745650, null));
        if (this.f33238f2) {
            i10 = 2131231152;
        } else {
            i10 = 2131232692;
        }
        wp wpVar = new wp(i10, 0);
        wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.H2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z10) {
        int i3;
        int i10;
        float f10;
        float f11;
        boolean z11 = this.C2;
        int i11 = 0;
        gi.d dVar = this.f33256x2;
        if (z11) {
            dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
            dVar.setOnClickListener(new d(this, 0));
        } else {
            d0 d0Var = this.f33248p2;
            if (d0Var != null) {
                i3 = d0Var.getSelectedTab();
            } else {
                i3 = 0;
            }
            if (i3 == 1 && (this.f33249q2.getSelectedTone() instanceof a0) && !TextUtils.equals(this.f33252t2.getText().toString(), this.B2)) {
                dVar.setText(org.telegram.messenger.bd.M0(2131754059, null));
                dVar.setOnClickListener(new d(this, 1));
            } else if (this.f33236d2 == null && this.c2 == null) {
                dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
                dVar.setOnClickListener(new d(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.bd.M0(2131755002, null));
                dVar.setOnClickListener(new d(this, 2));
            }
        }
        dVar.setLoading(this.K2);
        if (z10 && this.E2 == this.D2) {
            return;
        }
        boolean z12 = this.D2;
        this.E2 = z12;
        float f12 = 0.0f;
        LinearLayout linearLayout = this.f33254v2;
        gi.d dVar2 = this.f33255w2;
        if (z10) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.D2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            xq xqVar = xq.h;
            alpha.setInterpolator(xqVar).setDuration(320L).withEndAction(new a(this, 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.D2) {
                f12 = 1.0f;
            }
            animate2.alpha(f12).setInterpolator(xqVar).setDuration(320L).withEndAction(new a(this, 2)).start();
            return;
        }
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        if (this.D2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        dVar2.setAlpha(f10);
        if (this.D2) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (!this.D2) {
            f12 = 1.0f;
        }
        linearLayout.setAlpha(f12);
    }

    public final void v1() {
        float f10;
        String str = this.B2;
        org.telegram.ui.Cells.k3 k3Var = this.f33252t2;
        boolean equals = TextUtils.equals(str, k3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.A2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = k3Var.d.animate();
        this.A2 = z10;
        if (!equals) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 320L);
        this.H2.O(true);
    }

    public final void w1() {
        tj0 tj0Var;
        View view;
        if (this.f33253u2 == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            tj0Var = this.f36102l1;
            if (i3 < tj0Var.getChildCount()) {
                view = tj0Var.getChildAt(i3);
                r31 G = this.H2.G(RecyclerView.R(view) - 1);
                if (G != null && G.f37620c == this.f33249q2) {
                    break;
                }
                i3++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f33253u2.setVisibility(0);
            this.f33253u2.setTranslationY(view.getY() + tj0Var.getY() + view.getHeight());
            return;
        }
        this.f33253u2.setVisibility(4);
        this.f33253u2.f(true);
    }

    public final void x1() {
        d0 d0Var = this.f33249q2;
        TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
        d0Var.f32876c.removeAllViews();
        if (n1()) {
            d0Var.b(new TL_aicompose.AiComposeTone(), new g(this, 0));
        }
        d0Var.b(null, new g(this, 0));
        ArrayList arrayList = this.f33246n2.f22272b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d0Var.b((TL_aicompose.AiComposeTone) obj, new g(this, 0));
        }
        if (selectedTone != d0Var.getSelectedTone()) {
            d0Var.d(null);
        }
    }
}
