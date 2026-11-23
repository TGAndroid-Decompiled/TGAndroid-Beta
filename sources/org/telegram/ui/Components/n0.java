package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
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
public final class n0 extends sa implements org.telegram.messenger.gs {
    public final LinearLayout A2;
    public final hi.e B2;
    public final hi.e C2;
    public final hi.e D2;
    public final FrameLayout E2;
    public boolean F2;
    public String G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public boolean K2;
    public long L2;
    public ch.k M2;
    public String N2;
    public oh0 O2;
    public c51 P2;
    public boolean Q2;
    public z R2;
    public dd S2;
    public CharSequence T1;
    public boolean T2;
    public TL_iv.RichMessage U1;
    public a0 U2;
    public boolean V1;
    public int V2;
    public CharSequence W1;
    public boolean W2;
    public TL_iv.RichMessage X1;
    public final TLRPC.TL_messages_composeMessageWithAI[] X2;
    public boolean Y1;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] Y2;
    public CharSequence Z1;
    public int Z2;
    public TL_iv.RichMessage f37682a2;
    public boolean f37683b2;
    public CharSequence f37684c2;
    public TL_iv.RichMessage d2;
    public CharSequence f37685e2;
    public org.telegram.messenger.y10 f37686f2;
    public org.telegram.messenger.y10 f37687g2;
    public long f37688h2;
    public boolean f37689i2;
    public org.telegram.messenger.v10 f37690j2;
    public vd f37691k2;
    public final boolean[] f37692l2;
    public final boolean[] f37693m2;
    public String f37694n2;
    public String f37695o2;
    public String f37696p2;
    public TL_aicompose.AiComposeTone f37697q2;
    public boolean f37698r2;
    public final org.telegram.messenger.e f37699s2;
    public final FrameLayout f37700t2;
    public final m0 f37701u2;
    public final m0 f37702v2;
    public final ImageView f37703w2;
    public final FrameLayout f37704x2;
    public final org.telegram.ui.Cells.l3 f37705y2;
    public hi.l3 f37706z2;

    public n0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, true, 2, h6Var);
        this.f37692l2 = new boolean[1];
        this.f37693m2 = new boolean[1];
        this.Q2 = true;
        this.V2 = -1;
        this.X2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.Y2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e T1 = org.telegram.messenger.np.u1(this.f30173a).T1();
        this.f37699s2 = T1;
        T1.b();
        T1.d = true;
        ImageView imageView = new ImageView(context);
        this.f37703w2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.f39533p1.addView(imageView, c8.ma.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ra.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37700t2 = frameLayout;
        m0 m0Var = new m0(context, this.f30173a, 0, false, h6Var);
        this.f37701u2 = m0Var;
        m0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(28.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        m0Var.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(m0Var, d02, M, null, h6Var);
        m0Var.setRoundRadius(28);
        m0Var.a(2131232478, org.telegram.messenger.hd.N0(2131754962, null), new f(this, 3));
        m0Var.a(2131231878, org.telegram.messenger.hd.N0(2131754963, null), new f(this, 3));
        m0Var.a(2131231865, org.telegram.messenger.hd.N0(2131754964, null), new f(this, 3));
        m0Var.c(1, true);
        frameLayout.addView(m0Var, c8.ma.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f37704x2 = frameLayout2;
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.hd.N0(2131754055, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(this.f30173a).A7.W.f15508b).f24812c, h6Var);
        this.f37705y2 = l3Var;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
        l3Var.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(l3Var, d03, M2, null, h6Var);
        j3Var.addTextChangedListener(new p(this));
        frameLayout2.addView(l3Var, c8.ma.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        j3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        m0 m0Var2 = new m0(context, this.f30173a, 0, true, h6Var);
        this.f37702v2 = m0Var2;
        m0Var2.setDivider(true);
        m0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        m0Var2.setRoundRadius(12);
        m0Var2.f37366w = new hi.q4(this, h6Var, context, 1);
        E1();
        m0Var2.c(-1, true);
        String N0 = b31.N0();
        this.f37695o2 = N0;
        if (N0 == null) {
            this.f37695o2 = org.telegram.messenger.a10.j();
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f39539v1 = 0.35f;
        int i11 = org.telegram.ui.ActionBar.m6.f29324a7;
        v0(org.telegram.ui.ActionBar.m6.w0(i11, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.A2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i11, this.J0)), org.telegram.ui.ActionBar.m6.w0(i11, this.J0), org.telegram.ui.ActionBar.m6.w0(i11, this.J0)}));
        hi.e eVar = new hi.e(context, h6Var, true);
        eVar.setRoundRadius(24);
        this.C2 = eVar;
        eVar.setScaleLoading(true);
        linearLayout.addView(eVar, c8.ma.p(-1, 48, 1.0f, 119));
        hi.e g10 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        this.D2 = g10;
        g10.setOnClickListener(new c(this, 10));
        g10.setOnLongClickListener(new n(this, h6Var, context, 0));
        linearLayout.addView(g10, c8.ma.t(48, 48, 5, 10, 0, 0, 0));
        hi.e g11 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        this.B2 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.q1(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new oi.i1(19, this, h6Var));
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.f30211u0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.f30176b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i14 = d.leftMargin;
        int i15 = this.f30211u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f30176b.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.E2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.ma.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i16 = d2.leftMargin;
        int i17 = this.f30211u0;
        d2.leftMargin = i16 + i17;
        d2.rightMargin += i17;
        this.f30176b.addView(frameLayout3, d2);
        B1(false);
        ek0 ek0Var = this.f39532o1;
        int i18 = this.f30211u0;
        ek0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(66.0f));
        this.f39532o1.setClipToPadding(false);
        this.f39532o1.r1();
        this.f39532o1.setOnItemClickListener(new o(this, 0));
        this.J1 = true;
        r rVar = new r(this);
        rVar.f59194m = false;
        rVar.C = false;
        rVar.o(nr.h);
        rVar.n(300L);
        this.f39532o1.setItemAnimator(rVar);
        this.f39532o1.setOnScrollListener(new bi.u1(this, 28));
        this.P2.O(false);
        org.telegram.messenger.g0.g3(new a(this, 0));
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25285b4);
    }

    public static void e1(n0 n0Var, View view) {
        n0Var.f37698r2 = !n0Var.f37698r2;
        n0Var.t1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof op) {
                ((op) linearLayout.getChildAt(0)).a(n0Var.f37698r2, true);
            }
        }
    }

    public static void f1(n0 n0Var, int i7) {
        m0 m0Var = n0Var.f37701u2;
        if (m0Var.getSelectedTab() == i7) {
            return;
        }
        hi.l3 l3Var = n0Var.f37706z2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        m0Var.c(i7, true);
        n0Var.t1();
        n0Var.P2.O(true);
    }

    public static void g1(n0 n0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i7;
        m0 m0Var = n0Var.f37702v2;
        hi.l3 l3Var = n0Var.f37706z2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (aiComposeTone instanceof j0) {
            m0Var.d(aiComposeTone, true);
            n0Var.P2.O(true);
            org.telegram.messenger.g0.h3(new a(n0Var, 3), 150L);
            return;
        }
        if (aiComposeTone == null) {
            ArrayList arrayList = n0Var.f37699s2.f23645b;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                    i10++;
                }
            }
            int i12 = i10 + 1;
            if (org.telegram.messenger.k10.i(n0Var.f30173a).q()) {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(n0Var.f30173a).A7.Y.f15508b).f24812c;
            } else {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(n0Var.f30173a).A7.X.f15508b).f24812c;
            }
            if (i12 > i7) {
                z1(new lc(n0Var.E2, n0Var.J0), n0Var.f30173a);
                return;
            }
            i0 i0Var = new i0(n0Var.getContext(), n0Var.J0);
            i0Var.f36063g2 = new f(n0Var, 1);
            i0Var.show();
        } else if (m0Var.getSelectedTone() == aiComposeTone) {
            if (n0Var.W2 || n0Var.Y1) {
                n0Var.j1();
            }
            m0Var.c(-1, true);
            n0Var.Y1 = false;
            n0Var.Z1 = null;
            n0Var.f37682a2 = null;
            n0Var.X2[1] = null;
            if (n0Var.q1() && s0.b(n0Var.f30173a, n0Var.f37688h2) != null) {
                s0.e(n0Var.f30173a, n0Var.f37688h2, null);
                dd ddVar = n0Var.S2;
                if (ddVar != null) {
                    ddVar.run();
                }
            }
            n0Var.B1(true);
            n0Var.t1();
            n0Var.P2.O(true);
        } else {
            m0Var.d(aiComposeTone, true);
            n0Var.t1();
            n0Var.P2.O(true);
        }
    }

    public static void l1(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        m1(richText, sb2);
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
                            m1(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (i10 > 0) {
                                    sb2.append("\n");
                                }
                                l1(arrayList.get(i10), sb2);
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
                            m1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    sb2.append("\n");
                                }
                                l1(arrayList2.get(i12), sb2);
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
                m1(pageCaption.text, sb2);
                return;
            }
            return;
        }
        m1(pageBlock.text, sb2);
    }

    public static void m1(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i7 = 0; i7 < textconcat.texts.size(); i7++) {
                m1(textconcat.texts.get(i7), sb2);
            }
        } else if (richText != null) {
            m1(richText.text, sb2);
        }
    }

    public static void n1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        spannableStringBuilder.append((CharSequence) oi.c6.r(richText, null, true));
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
                            spannableStringBuilder.append((CharSequence) oi.c6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (i10 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                n1(arrayList.get(i10), spannableStringBuilder);
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
                            spannableStringBuilder.append((CharSequence) oi.c6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                n1(arrayList2.get(i12), spannableStringBuilder);
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
                spannableStringBuilder.append((CharSequence) oi.c6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) oi.c6.r(pageBlock.text, pageBlock, true));
    }

    public static void z1(lc lcVar, int i7) {
        int i10;
        String a02;
        if (lcVar.X() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.np.u1(i7).A7;
        boolean q10 = org.telegram.messenger.k10.i(i7).q();
        if (!q10) {
            i10 = 2131624217;
        } else {
            i10 = 2131624012;
        }
        String N0 = org.telegram.messenger.hd.N0(2131754976, null);
        if (!q10) {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.X.f15508b).f24812c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.Y.f15508b).f24812c));
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.Y.f15508b).f24812c));
        }
        lcVar.I(i10, N0, org.telegram.messenger.g0.T2(a02, new og(lcVar, 1))).j();
    }

    public final void A1() {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        boolean z11;
        float f10;
        if (!q1()) {
            return;
        }
        r0 b10 = s0.b(this.f30173a, this.f37688h2);
        r0 k12 = k1();
        if (b10 != null && k12 != null && (b10.f39027f != k12.f39027f || b10.f39023a != k12.f39023a || b10.f39024b != k12.f39024b || !TextUtils.equals(b10.f39025c, k12.f39025c) || !TL_aicompose.InputAiComposeTone.equals(s0.d(b10.d), s0.d(k12.d)) || !TextUtils.equals(b10.f39026e, k12.f39026e))) {
            s0.e(this.f30173a, this.f37688h2, k12);
            dd ddVar = this.S2;
            if (ddVar != null) {
                ddVar.run();
            }
            b10 = k12;
        }
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k12 = b10;
        }
        z zVar = this.R2;
        if (!zVar.L) {
            zVar.L = true;
            zVar.g("Always use in this chat", "", false, false, false);
        }
        if (k12 != null) {
            if (this.U2 == null) {
                this.U2 = new a0();
            }
            spannableStringBuilder = new SpannableStringBuilder("→");
            spannableStringBuilder.setSpan(this.U2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k12.f39026e);
        } else {
            spannableStringBuilder = null;
        }
        z zVar2 = this.R2;
        if (zVar2.isLaidOut() && this.R2.isAttachedToWindow()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (spannableStringBuilder != null) {
            zVar2.getValueTextView().setText(spannableStringBuilder);
        }
        if (spannableStringBuilder != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (zVar2.N != f10 || (zVar2.O == null && zVar2.M != f10)) {
            zVar2.N = f10;
            ValueAnimator valueAnimator = zVar2.O;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                zVar2.O.cancel();
                zVar2.O = null;
            }
            if (!z11) {
                zVar2.M = f10;
                zVar2.requestLayout();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zVar2.M, f10);
                zVar2.O = ofFloat;
                ofFloat.addUpdateListener(new x(zVar2, 0));
                zVar2.O.addListener(new y(zVar2, 0));
                zVar2.O.setDuration(240L);
                zVar2.O.setInterpolator(nr.h);
                zVar2.O.start();
            }
        }
        this.R2.setChecked(z10);
    }

    public final void B1(boolean z10) {
        int i7;
        int i10;
        float f10;
        float f11;
        long max;
        boolean z11 = this.H2;
        int i11 = 0;
        hi.e eVar = this.C2;
        if (z11) {
            eVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
            eVar.setOnClickListener(new c(this, 0));
        } else {
            m0 m0Var = this.f37701u2;
            if (m0Var != null) {
                i7 = m0Var.getSelectedTab();
            } else {
                i7 = 0;
            }
            if (i7 == 1 && (this.f37702v2.getSelectedTone() instanceof j0) && !TextUtils.equals(this.f37705y2.getText().toString(), this.G2)) {
                eVar.setText(org.telegram.messenger.hd.N0(2131754056, null));
                eVar.setOnClickListener(new c(this, 1));
            } else if (this.f37687g2 == null && this.f37686f2 == null) {
                eVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
                eVar.setOnClickListener(new c(this, 3));
            } else {
                eVar.setText(org.telegram.messenger.hd.N0(2131755002, null));
                eVar.setOnClickListener(new c(this, 2));
            }
        }
        boolean z12 = this.W2;
        ch.k kVar = this.M2;
        if (kVar != null) {
            org.telegram.messenger.g0.r(kVar);
            this.M2 = null;
        }
        if (z12 != this.K2) {
            if (z12) {
                max = 150;
            } else {
                max = Math.max(0L, 300 - (SystemClock.uptimeMillis() - this.L2));
            }
            ch.k kVar2 = new ch.k(22, this, z12);
            this.M2 = kVar2;
            if (max <= 0) {
                kVar2.run();
            } else {
                org.telegram.messenger.g0.h3(kVar2, max);
            }
        }
        if (z10 && this.J2 == this.I2) {
            return;
        }
        boolean z13 = this.I2;
        this.J2 = z13;
        float f12 = 0.0f;
        LinearLayout linearLayout = this.A2;
        hi.e eVar2 = this.B2;
        if (z10) {
            eVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = eVar2.animate();
            if (this.I2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            nr nrVar = nr.h;
            alpha.setInterpolator(nrVar).setDuration(320L).withEndAction(new a(this, 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.I2) {
                f12 = 1.0f;
            }
            animate2.alpha(f12).setInterpolator(nrVar).setDuration(320L).withEndAction(new a(this, 2)).start();
            return;
        }
        if (z13) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        eVar2.setVisibility(i10);
        if (this.I2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        eVar2.setAlpha(f10);
        if (this.I2) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (!this.I2) {
            f12 = 1.0f;
        }
        linearLayout.setAlpha(f12);
    }

    public final void C1() {
        float f10;
        String str = this.G2;
        org.telegram.ui.Cells.l3 l3Var = this.f37705y2;
        boolean equals = TextUtils.equals(str, l3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.F2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = l3Var.d.animate();
        this.F2 = z10;
        if (!equals) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.o10.n(animate, f10, 320L);
        this.P2.O(true);
    }

    public final void D1() {
        ek0 ek0Var;
        View view;
        if (this.f37706z2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            ek0Var = this.f39532o1;
            if (i7 < ek0Var.getChildCount()) {
                view = ek0Var.getChildAt(i7);
                o41 G = this.P2.G(RecyclerView.R(view) - 1);
                if (G != null && G.f38084c == this.f37702v2) {
                    break;
                }
                i7++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f37706z2.setVisibility(0);
            this.f37706z2.setTranslationY(view.getY() + ek0Var.getY() + view.getHeight());
            return;
        }
        this.f37706z2.setVisibility(4);
        this.f37706z2.f(true);
    }

    public final void E1() {
        m0 m0Var = this.f37702v2;
        TL_aicompose.AiComposeTone selectedTone = m0Var.getSelectedTone();
        m0Var.f37360c.removeAllViews();
        if (r1()) {
            m0Var.b(new TL_aicompose.AiComposeTone(), new f(this, 0));
        }
        m0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.f37699s2.f23645b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            m0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != m0Var.getSelectedTone()) {
            m0Var.d(null, true);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30173a, 0, true, new d(this, 0), this.J0);
        this.P2 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        if (this.N2 == null) {
            this.N2 = org.telegram.messenger.hd.N0(2131755006, null);
            oh0 oh0Var = new oh0(2131624011, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.O2 = oh0Var;
            oh0Var.J(true);
            this.O2.K(1);
        }
        return this.N2;
    }

    @Override
    public final void R0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f37703w2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25285b4) {
            E1();
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25285b4);
        org.telegram.messenger.e eVar = this.f37699s2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    @Override
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.A2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1(a70 a70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i7, this.J0)));
        y0Var.setOnClickListener(new m(a70Var, z10, runnable, 0));
        linearLayout.addView(y0Var, c8.ma.o(-1, -2));
    }

    public final TLRPC.TL_messages_composeMessageWithAI i1(int i7) {
        String str;
        TL_aicompose.InputAiComposeTone fromDefault;
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        if (i7 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.a10.D(this.f37695o2);
            TL_aicompose.AiComposeTone aiComposeTone = this.f37697q2;
            if (aiComposeTone != null) {
                fromDefault = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            } else {
                fromDefault = TL_aicompose.InputAiComposeTone.fromDefault(null);
            }
            tL_messages_composeMessageWithAI.tone = fromDefault;
            tL_messages_composeMessageWithAI.emojify = this.f37698r2;
            return tL_messages_composeMessageWithAI;
        } else if (i7 == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.f37702v2.getSelectedTone();
            if (selectedTone instanceof j0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.G2)) {
                    str = "";
                } else {
                    str = this.G2;
                }
                inputaicomposetonesingleuse.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse;
            } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                inputaicomposetoneid.f28648id = tL_aiComposeTone.f28647id;
                inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid;
            } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault;
            }
            tL_messages_composeMessageWithAI.emojify = this.f37698r2;
            return tL_messages_composeMessageWithAI;
        } else {
            if (i7 == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            return tL_messages_composeMessageWithAI;
        }
    }

    public final void j1() {
        if (this.V2 >= 0) {
            ConnectionsManager.getInstance(this.f30173a).cancelRequest(this.V2, true);
            this.V2 = -1;
        }
        this.W2 = false;
        org.telegram.ui.ActionBar.m5 titleTextView = this.f39533p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final r0 k1() {
        String str;
        m0 m0Var = this.f37701u2;
        if (m0Var == null) {
            return null;
        }
        int selectedTab = m0Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI i12 = i1(selectedTab);
        boolean z10 = i12.proofread;
        if (!z10 && i12.translate_to_lang == null && i12.tone == null) {
            return null;
        }
        TL_aicompose.InputAiComposeTone inputAiComposeTone = i12.tone;
        if (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse) {
            return null;
        }
        ?? obj = new Object();
        obj.f39027f = selectedTab;
        obj.f39023a = z10;
        obj.f39024b = i12.emojify;
        obj.f39025c = i12.translate_to_lang;
        obj.d = inputAiComposeTone;
        if (selectedTab == 0) {
            String L0 = b31.L0(b31.P0(this.f37695o2, null, null));
            if (this.f37696p2 != null) {
                L0 = p5.c.m(this.f37696p2, " ", L0, new StringBuilder());
            }
            obj.f39026e = L0;
        } else if (selectedTab == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.f37702v2.getSelectedTone();
            if ((selectedTone instanceof j0) || selectedTone == null || TextUtils.isEmpty(selectedTone.title)) {
                str = org.telegram.messenger.hd.N0(2131754963, null);
            } else {
                str = selectedTone.title;
            }
            obj.f39026e = str;
        } else {
            obj.f39026e = org.telegram.messenger.hd.N0(2131754964, null);
        }
        if (obj.f39024b) {
            obj.f39026e = a8.p0.s(new StringBuilder(), obj.f39026e, " + Emoji");
        }
        return obj;
    }

    public final TL_iv.RichMessage o1() {
        if (!this.W2) {
            int selectedTab = this.f37701u2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.V1) {
                    return this.X1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f37683b2) {
                    return this.d2;
                }
                return null;
            } else if (this.Y1) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.f37682a2;
                if (richMessage == null) {
                    return this.U1;
                }
                return richMessage;
            }
        }
        return null;
    }

    public final CharSequence p1() {
        if (r1()) {
            TL_iv.RichMessage o12 = o1();
            if (o12 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i7 = 0; i7 < o12.blocks.size(); i7++) {
                    if (i7 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    n1(o12.blocks.get(i7), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.W2) {
            int selectedTab = this.f37701u2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.V1) {
                    return this.W1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f37683b2) {
                    return this.f37685e2;
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

    public final boolean q1() {
        if (this.R2 != null && this.f37690j2 != null && !this.f37689i2 && !r1() && this.f37688h2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        if (this.U1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0);
            if (w02 != this.Z2) {
                this.Z2 = w02;
                v0(w02);
                this.A2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final o41 s1(int i7, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U1;
        }
        int i10 = org.telegram.messenger.ut.f27266b;
        o41 K = o41.K(org.telegram.messenger.ut.class);
        K.H = richMessage;
        K.d = i7;
        K.f38085e = z10;
        return K;
    }

    @Override
    public final void show() {
        int i7;
        int i10;
        String str;
        m0 m0Var;
        super.show();
        na naVar = this.f39533p1;
        if (naVar != null) {
            naVar.setTitle(P0());
        }
        if (!this.f37689i2 && (this.f37691k2 != null || this.f37690j2 != null)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hi.e eVar = this.D2;
        eVar.setVisibility(i7);
        String str2 = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131745444, null));
        if (this.f37689i2) {
            i10 = 2131231152;
        } else {
            i10 = 2131232696;
        }
        nq nqVar = new nq(i10, 0);
        nqVar.f37952s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
        eVar.setText(spannableStringBuilder);
        if (!this.T2 && q1()) {
            this.T2 = true;
            r0 b10 = s0.b(this.f30173a, this.f37688h2);
            if (b10 != null) {
                int i11 = b10.f39027f;
                m0 m0Var2 = this.f37701u2;
                if (i11 == 1) {
                    TL_aicompose.AiComposeTone a10 = s0.a(this.f30173a, b10.d);
                    if (a10 != null && (m0Var = this.f37702v2) != null) {
                        this.f37698r2 = b10.f39024b;
                        m0Var2.c(1, false);
                        m0Var.d(a10, false);
                    }
                } else if (i11 == 0 && (str = b10.f39025c) != null) {
                    this.f37698r2 = b10.f39024b;
                    this.f37695o2 = str;
                    TL_aicompose.AiComposeTone a11 = s0.a(this.f30173a, b10.d);
                    this.f37697q2 = a11;
                    if (a11 != null && !TextUtils.isEmpty(a11.title)) {
                        str2 = this.f37697q2.title;
                    }
                    this.f37696p2 = str2;
                    m0Var2.c(0, false);
                } else if (i11 == 2) {
                    m0Var2.c(2, false);
                }
            }
        }
        this.P2.O(false);
        t1();
        B1(true);
    }

    public final void t1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str;
        TL_aicompose.InputAiComposeTone fromDefault;
        A1();
        boolean r12 = r1();
        na naVar = this.f39533p1;
        m0 m0Var = this.f37701u2;
        if (r12) {
            String str2 = "";
            int selectedTab = m0Var.getSelectedTab();
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.U1;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
                    tL_inputRichMessage.blocks.add(org.telegram.messenger.az.y0(richMessage.blocks.get(i7)));
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
                        tL_inputPhoto.f28453id = photo2.f28458id;
                        tL_inputPhoto.access_hash = photo2.access_hash;
                        byte[] bArr = photo2.file_reference;
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        tL_inputPhoto.file_reference = bArr;
                        tL_inputRichMessage.photos.add(tL_inputPhoto);
                    }
                }
                str = null;
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
                        tL_inputDocument.f28446id = document2.f28440id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.a10.D(this.f37695o2);
                TL_aicompose.AiComposeTone aiComposeTone = this.f37697q2;
                if (aiComposeTone != null) {
                    fromDefault = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                } else {
                    fromDefault = TL_aicompose.InputAiComposeTone.fromDefault(str);
                }
                tL_messages_composeRichMessageWithAI.tone = fromDefault;
                tL_messages_composeRichMessageWithAI.emojify = this.f37698r2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = this.f37702v2.getSelectedTone();
                if (selectedTone instanceof j0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (!TextUtils.isEmpty(this.G2)) {
                        str2 = this.G2;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str2;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f28648id = tL_aiComposeTone.f28647id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f37698r2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.Y2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.W2 = true;
                    this.H2 = false;
                    B1(true);
                    org.telegram.ui.ActionBar.m5 titleTextView = naVar.getTitleTextView();
                    titleTextView.i(this.O2);
                    this.O2.start();
                    if (selectedTab == 0) {
                        this.V1 = true;
                    } else if (selectedTab == 1) {
                        this.Y1 = true;
                    } else if (selectedTab == 2) {
                        this.f37683b2 = true;
                    }
                    this.V2 = ConnectionsManager.getInstance(this.f30173a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(1), new di.j0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 6));
                    this.P2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        String str3 = "";
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.T1};
        tL_textWithEntities.entities = org.telegram.messenger.si.d0(this.f30173a).Y(charSequenceArr, true, true);
        CharSequence charSequence5 = charSequenceArr[0];
        if (charSequence5 != null) {
            str3 = charSequence5.toString();
        }
        tL_textWithEntities.text = str3;
        int selectedTab2 = m0Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI i12 = i1(selectedTab2);
        i12.text = tL_textWithEntities;
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = this.X2[selectedTab2];
        if (tL_messages_composeMessageWithAI == null || tL_messages_composeMessageWithAI.proofread != i12.proofread || tL_messages_composeMessageWithAI.emojify != i12.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI.tone, i12.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI.translate_to_lang, i12.translate_to_lang)) {
            if (!i12.emojify && !i12.proofread && i12.tone == null && i12.translate_to_lang == null) {
                return;
            }
            this.W2 = true;
            this.H2 = false;
            B1(true);
            org.telegram.ui.ActionBar.m5 titleTextView2 = naVar.getTitleTextView();
            titleTextView2.i(this.O2);
            this.O2.start();
            int selectedTab3 = m0Var.getSelectedTab();
            CharSequence charSequence6 = this.T1;
            if (selectedTab3 == 0 && (charSequence4 = this.W1) != null) {
                charSequence6 = charSequence4;
            }
            if (selectedTab3 == 1 && (charSequence3 = this.Z1) != null) {
                charSequence6 = charSequence3;
            }
            if (selectedTab3 == 2 && (charSequence2 = this.f37684c2) != null) {
                charSequence = charSequence2;
            } else {
                charSequence = charSequence6;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            int L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(64.0f);
            int i13 = this.f30211u0;
            int b10 = c8.l9.b(new StaticLayout(charSequence, textPaint, (L - i13) - i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < b10; i14++) {
                if (i14 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131748586, null));
                r80 r80Var = new r80(null, L2, 0, null);
                r80Var.f39119f = org.telegram.messenger.g0.L(6.0f);
                r80Var.h = 0.5f;
                r80Var.f39120n = true;
                spannableStringBuilder.setSpan(r80Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.V1 = true;
                this.W1 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.Y1 = true;
                this.Z1 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f37683b2 = true;
                this.f37684c2 = spannableStringBuilder;
            }
            this.V2 = ConnectionsManager.getInstance(this.f30173a).sendRequestTyped(i12, new d3.b(1), new di.j0(this, titleTextView2, selectedTab2, i12, 5));
            this.P2.O(true);
        }
    }

    public final void u1(int i7, int i10, boolean z10) {
        if (this.f37691k2 != null) {
            TL_iv.RichMessage o12 = o1();
            if (o12 != null) {
                this.f37691k2.a(o12, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
            }
        } else if (this.f37690j2 != null && p1() != null) {
            this.f37690j2.a(p1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
        }
    }

    public final void v1(long j3, boolean z10, org.telegram.messenger.v10 v10Var) {
        this.f37688h2 = j3;
        this.f37689i2 = z10;
        this.f37690j2 = v10Var;
        if (this.R2 != null) {
            return;
        }
        ?? s8Var = new org.telegram.ui.Cells.s8(21, getContext(), this.J0, false);
        this.R2 = s8Var;
        Switch checkBox = s8Var.getCheckBox();
        int i7 = org.telegram.ui.ActionBar.m6.M6;
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        int i11 = org.telegram.ui.ActionBar.m6.f29381d6;
        checkBox.d(i7, i10, i11, i11);
        this.R2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29490j6, this.J0), 2, -1));
        this.R2.setOnClickListener(new c(this, 4));
    }

    public final void w1(TL_iv.RichMessage richMessage) {
        this.U1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            l1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.c6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.cr(9), false);
        E1();
    }

    public final void x1(CharSequence charSequence) {
        String str;
        Object[] spans;
        if (!(charSequence instanceof Spanned)) {
            str = charSequence.toString();
        } else {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {gz0.class, qi.g.class, qu0.class, v41.class, u41.class, r41.class, s41.class, m00.class, q41.class, p41.class, y5.class};
            for (int i7 = 0; i7 < 11; i7++) {
                for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i7])) {
                    spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
                }
            }
            str = spannableStringBuilder;
        }
        this.T1 = str;
        org.telegram.messenger.c6.d(charSequence.toString(), new b(this, 0), new org.telegram.ui.cr(8), false);
    }

    public final void y1(TL_aicompose.AiComposeTone aiComposeTone) {
        String str;
        this.f37697q2 = aiComposeTone;
        if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
            str = aiComposeTone.title;
        } else {
            str = null;
        }
        this.f37696p2 = str;
        j1();
        t1();
        this.P2.O(true);
    }
}
