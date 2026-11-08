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
public final class g0 extends na implements org.telegram.messenger.ls {
    public String A2;
    public boolean B2;
    public boolean C2;
    public boolean D2;
    public String E2;
    public zg0 F2;
    public l41 G2;
    public boolean H2;
    public int I2;
    public boolean J2;
    public final TLRPC.TL_messages_composeMessageWithAI[] K2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] L2;
    public int M2;
    public CharSequence P1;
    public TL_iv.RichMessage Q1;
    public boolean R1;
    public CharSequence S1;
    public TL_iv.RichMessage T1;
    public boolean U1;
    public CharSequence V1;
    public TL_iv.RichMessage W1;
    public boolean X1;
    public CharSequence Y1;
    public TL_iv.RichMessage Z1;
    public CharSequence f33737a2;
    public org.telegram.messenger.c20 f33738b2;
    public org.telegram.messenger.c20 f33739c2;
    public long d2;
    public boolean f33740e2;
    public org.telegram.messenger.z10 f33741f2;
    public md f33742g2;
    public final boolean[] f33743h2;
    public final boolean[] f33744i2;
    public String f33745j2;
    public String f33746k2;
    public boolean f33747l2;
    public final org.telegram.messenger.e f33748m2;
    public final FrameLayout f33749n2;
    public final f0 f33750o2;
    public final f0 f33751p2;
    public final ImageView f33752q2;
    public final FrameLayout f33753r2;
    public final org.telegram.ui.Cells.k3 f33754s2;
    public fi.m3 f33755t2;
    public final LinearLayout f33756u2;
    public final fi.d f33757v2;
    public final fi.d f33758w2;
    public final fi.d f33759x2;
    public final FrameLayout f33760y2;
    public boolean f33761z2;

    public g0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        this.f33743h2 = new boolean[1];
        this.f33744i2 = new boolean[1];
        this.H2 = true;
        this.I2 = -1;
        this.K2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.L2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e R1 = org.telegram.messenger.qp.s1(this.f28616a).R1();
        this.f33748m2 = R1;
        R1.b();
        R1.d = true;
        ImageView imageView = new ImageView(context);
        this.f33752q2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i7, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, f6Var);
        this.l1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33749n2 = frameLayout;
        f0 f0Var = new f0(this.f28616a, context, f6Var, false);
        this.f33750o2 = f0Var;
        f0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        f0Var.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f0Var, d02, N, null, f6Var);
        f0Var.setRoundRadius(28);
        f0Var.a(2131232476, org.telegram.messenger.id.M0(2131754962, null), new g(this, 3));
        f0Var.a(2131231877, org.telegram.messenger.id.M0(2131754963, null), new g(this, 3));
        f0Var.a(2131231864, org.telegram.messenger.id.M0(2131754964, null), new g(this, 3));
        f0Var.c(1);
        frameLayout.addView(f0Var, c8.ha.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33753r2 = frameLayout2;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28616a).f24942x7.R.f13555b).f23460c, f6Var);
        this.f33754s2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        k3Var.setBackground(d03);
        org.telegram.ui.ActionBar.r6.k(k3Var, d03, N2, null, f6Var);
        i3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(k3Var, c8.ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        i3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        f0 f0Var2 = new f0(this.f28616a, context, f6Var, true);
        this.f33751p2 = f0Var2;
        f0Var2.setDivider(true);
        f0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        f0Var2.setRoundRadius(12);
        f0Var2.f33423n = new fi.u4(this, f6Var, context, 1);
        x1();
        f0Var2.c(-1);
        String M0 = k21.M0();
        this.f33746k2 = M0;
        if (M0 == null) {
            this.f33746k2 = org.telegram.messenger.f10.j();
        }
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.f36282r1 = 0.35f;
        int i11 = org.telegram.ui.ActionBar.k6.f27796a7;
        v0(org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33756u2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i11, this.I0)), org.telegram.ui.ActionBar.k6.w0(i11, this.I0), org.telegram.ui.ActionBar.k6.w0(i11, this.I0)}));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.f33758w2 = dVar;
        linearLayout.addView(dVar, c8.ha.p(-1, 48, 1.0f, 119));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.f33759x2 = h;
        h.setOnClickListener(new c(this, 9));
        h.setOnLongClickListener(new j(this, f6Var, context, 0));
        linearLayout.addView(h, c8.ha.t(48, 48, 5, 10, 0, 0, 0));
        fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.f33757v2 = h7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.o1(), length, spannableStringBuilder.length(), 33);
        h7.setText(spannableStringBuilder);
        h7.setOnClickListener(new org.telegram.ui.ActionBar.l1(17, this, f6Var));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.f28649t0;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.f28619b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28649t0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28619b.addView(h7, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33760y2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i16 = d2.leftMargin;
        int i17 = this.f28649t0;
        d2.leftMargin = i16 + i17;
        d2.rightMargin += i17;
        this.f28619b.addView(frameLayout3, d2);
        u1(false);
        pj0 pj0Var = this.f36277k1;
        int i18 = this.f28649t0;
        pj0Var.setPadding(i18, 0, i18, org.telegram.messenger.g0.L(66.0f));
        this.f36277k1.setClipToPadding(false);
        this.f36277k1.r1();
        this.f36277k1.setOnItemClickListener(new k(this, 0));
        this.F1 = true;
        o oVar = new o(this);
        oVar.f57071m = false;
        oVar.C = false;
        oVar.o(xq.h);
        oVar.n(350L);
        this.f36277k1.setItemAnimator(oVar);
        this.f36277k1.setOnScrollListener(new ai.b(this, 25));
        this.G2.O(false);
        org.telegram.messenger.g0.h3(new a(this, 0));
        org.telegram.messenger.qs.f(this.f28616a).c(this, org.telegram.messenger.qs.Y3);
    }

    public static void d1(g0 g0Var, View view) {
        g0Var.f33747l2 = !g0Var.f33747l2;
        g0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof wo) {
                ((wo) linearLayout.getChildAt(0)).a(g0Var.f33747l2, true);
            }
        }
    }

    public static void e1(g0 g0Var, int i7) {
        f0 f0Var = g0Var.f33750o2;
        if (f0Var.getSelectedTab() == i7) {
            return;
        }
        fi.m3 m3Var = g0Var.f33755t2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        f0Var.c(i7);
        g0Var.p1();
        g0Var.G2.O(true);
    }

    public static void f1(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i7;
        f0 f0Var = g0Var.f33751p2;
        fi.m3 m3Var = g0Var.f33755t2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (aiComposeTone instanceof b0) {
            f0Var.d(aiComposeTone);
            g0Var.G2.O(true);
            org.telegram.messenger.g0.i3(new a(g0Var, 3), 150L);
        } else if (aiComposeTone == null) {
            ArrayList arrayList = g0Var.f33748m2.f22155b;
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                    i10++;
                }
            }
            int i12 = i10 + 1;
            if (org.telegram.messenger.p10.i(g0Var.f28616a).q()) {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(g0Var.f28616a).f24942x7.T.f13555b).f23460c;
            } else {
                i7 = ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(g0Var.f28616a).f24942x7.S.f13555b).f23460c;
            }
            if (i12 > i7) {
                t1(new hc(g0Var.f33760y2, g0Var.I0), g0Var.f28616a);
                return;
            }
            a0 a0Var = new a0(g0Var.getContext(), g0Var.I0);
            a0Var.f31621c2 = new g(g0Var, 1);
            a0Var.show();
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

    public static void t1(hc hcVar, int i7) {
        int i10;
        String a02;
        if (hcVar.W() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.qp.s1(i7).f24942x7;
        boolean q10 = org.telegram.messenger.p10.i(i7).q();
        if (!q10) {
            i10 = 2131624216;
        } else {
            i10 = 2131624011;
        }
        String M0 = org.telegram.messenger.id.M0(2131754976, null);
        if (!q10) {
            a02 = org.telegram.messenger.id.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.S.f13555b).f23460c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f13555b).f23460c));
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.f13555b).f23460c));
        }
        hcVar.I(i10, M0, org.telegram.messenger.g0.U2(a02, new xf(hcVar, 1))).j();
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.f28616a, 0, true, new d(this, 0), this.I0);
        this.G2 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.E2 == null) {
            this.E2 = org.telegram.messenger.id.M0(2131755006, null);
            zg0 zg0Var = new zg0(2131624010, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.F2 = zg0Var;
            zg0Var.J(true);
            this.F2.K(1);
        }
        return this.E2;
    }

    @Override
    public final void Q0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f33752q2;
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
        org.telegram.messenger.qs.f(this.f28616a).n(this, org.telegram.messenger.qs.Y3);
        org.telegram.messenger.e eVar = this.f33748m2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(k60 k60Var, LinearLayout linearLayout, boolean z9, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.I0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z9);
        z0Var.d(org.telegram.ui.ActionBar.k6.w0(i7, this.I0), org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i7, this.I0)));
        z0Var.setOnClickListener(new i(k60Var, z9, runnable, 0));
        linearLayout.addView(z0Var, c8.ha.o(-1, -2));
    }

    @Override
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        LinearLayout linearLayout = this.f33756u2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.I2 >= 0) {
            ConnectionsManager.getInstance(this.f28616a).cancelRequest(this.I2, true);
            this.I2 = -1;
        }
        this.J2 = false;
        org.telegram.ui.ActionBar.k5 titleTextView = this.l1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (!this.J2) {
            int selectedTab = this.f33750o2.getSelectedTab();
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
                for (int i7 = 0; i7 < l1.blocks.size(); i7++) {
                    if (i7 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    k1(l1.blocks.get(i7), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.J2) {
            int selectedTab = this.f33750o2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.R1) {
                    return this.S1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.X1) {
                    return this.f33737a2;
                }
                return null;
            } else if (this.U1) {
                return null;
            } else {
                CharSequence charSequence = this.V1;
                if (charSequence == null) {
                    return this.P1;
                }
                return charSequence;
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

    public final x31 o1(int i7, TL_iv.RichMessage richMessage, boolean z9) {
        if (richMessage == null) {
            richMessage = this.Q1;
        }
        int i10 = org.telegram.messenger.zt.f26923b;
        x31 K = x31.K(org.telegram.messenger.zt.class);
        K.G = richMessage;
        K.d = i7;
        K.f40174e = z9;
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
        ja jaVar = this.l1;
        f0 f0Var = this.f33751p2;
        f0 f0Var2 = this.f33750o2;
        if (n1) {
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
                        tL_inputPhoto.f26975id = photo2.f26980id;
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
                        tL_inputDocument.f26968id = document2.f26962id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.f10.D(this.f33746k2);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f33747l2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
                if (selectedTone instanceof b0) {
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
                    inputaicomposetoneid.f27170id = tL_aiComposeTone.f27169id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f33747l2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.L2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.J2 = true;
                    this.B2 = false;
                    u1(true);
                    org.telegram.ui.ActionBar.k5 titleTextView = jaVar.getTitleTextView();
                    titleTextView.i(this.F2);
                    this.F2.start();
                    if (selectedTab == 0) {
                        this.R1 = true;
                    } else if (selectedTab == 1) {
                        this.U1 = true;
                    } else if (selectedTab == 2) {
                        this.X1 = true;
                    }
                    this.I2 = ConnectionsManager.getInstance(this.f28616a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(1), new bi.v0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 6));
                    this.G2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.P1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.f28616a).W(charSequenceArr, true, true);
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence6.toString();
        }
        tL_textWithEntities.text = charSequence;
        int selectedTab2 = f0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.f10.D(this.f33746k2);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f33747l2;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = f0Var.getSelectedTone();
            if (selectedTone2 instanceof b0) {
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
                inputaicomposetoneid2.f27170id = tL_aiComposeTone2.f27169id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f33747l2;
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
            org.telegram.ui.ActionBar.k5 titleTextView2 = jaVar.getTitleTextView();
            titleTextView2.i(this.F2);
            this.F2.start();
            int selectedTab3 = f0Var2.getSelectedTab();
            CharSequence charSequence7 = this.P1;
            if (selectedTab3 == 0 && (charSequence5 = this.S1) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.V1) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.Y1) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            int L = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(64.0f);
            int i12 = this.f28649t0;
            int b10 = c8.j9.b(new StaticLayout(charSequence2, textPaint, (L - i12) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < b10; i13++) {
                if (i13 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748780, null));
                b80 b80Var = new b80(null, L2, 0, null);
                b80Var.f32128f = org.telegram.messenger.g0.L(6.0f);
                b80Var.h = 0.5f;
                b80Var.f32129n = true;
                spannableStringBuilder.setSpan(b80Var, length, spannableStringBuilder.length(), 33);
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
            this.I2 = ConnectionsManager.getInstance(this.f28616a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new bi.v0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 5));
            this.G2.O(true);
        }
    }

    public final void q1(int i7, int i10, boolean z9) {
        if (this.f33742g2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.f33742g2.a(l1, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z9));
            }
        } else if (this.f33741f2 != null && m1() != null) {
            this.f33741f2.a(m1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z9));
        }
    }

    public final void r1(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!com.google.android.recaptcha.internal.a.u(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {vy0.class, ni.j.class, eu0.class, e41.class, d41.class, a41.class, b41.class, a00.class, z31.class, y31.class, r5.class};
            for (int i7 = 0; i7 < 11; i7++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i7])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.P1 = spannableStringBuilder;
        org.telegram.messenger.b6.d(editable.toString(), new b(this, 0), new org.telegram.ui.zq(3), false);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, this.I0);
            if (w02 != this.M2) {
                this.M2 = w02;
                v0(w02);
                this.f33756u2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        this.Q1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.b6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.zq(4), false);
        x1();
    }

    @Override
    public final void show() {
        int i7;
        int i10;
        super.show();
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle(O0());
        }
        if (!this.f33740e2 && (this.f33742g2 != null || this.f33741f2 != null)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        fi.d dVar = this.f33759x2;
        dVar.setVisibility(i7);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131745643, null));
        if (this.f33740e2) {
            i10 = 2131231152;
        } else {
            i10 = 2131232694;
        }
        wp wpVar = new wp(i10, 0);
        wpVar.f40021s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.G2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z9) {
        int i7;
        int i10;
        float f10;
        float f11;
        boolean z10 = this.B2;
        int i11 = 0;
        fi.d dVar = this.f33758w2;
        if (z10) {
            dVar.setText(org.telegram.messenger.id.M0(2131747832, null));
            dVar.setOnClickListener(new c(this, 0));
        } else {
            f0 f0Var = this.f33750o2;
            if (f0Var != null) {
                i7 = f0Var.getSelectedTab();
            } else {
                i7 = 0;
            }
            if (i7 == 1 && (this.f33751p2.getSelectedTone() instanceof b0) && !TextUtils.equals(this.f33754s2.getText().toString(), this.A2)) {
                dVar.setText(org.telegram.messenger.id.M0(2131754059, null));
                dVar.setOnClickListener(new c(this, 1));
            } else if (this.f33739c2 == null && this.f33738b2 == null) {
                dVar.setText(org.telegram.messenger.id.M0(2131747832, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.id.M0(2131755002, null));
                dVar.setOnClickListener(new c(this, 2));
            }
        }
        dVar.setLoading(this.J2);
        if (z9 && this.D2 == this.C2) {
            return;
        }
        boolean z11 = this.C2;
        this.D2 = z11;
        float f12 = 0.0f;
        LinearLayout linearLayout = this.f33756u2;
        fi.d dVar2 = this.f33757v2;
        if (z9) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.C2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            xq xqVar = xq.h;
            alpha.setInterpolator(xqVar).setDuration(320L).withEndAction(new a(this, 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.C2) {
                f12 = 1.0f;
            }
            animate2.alpha(f12).setInterpolator(xqVar).setDuration(320L).withEndAction(new a(this, 2)).start();
            return;
        }
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        if (this.C2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        dVar2.setAlpha(f10);
        if (this.C2) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (!this.C2) {
            f12 = 1.0f;
        }
        linearLayout.setAlpha(f12);
    }

    public final void v1() {
        float f10;
        String str = this.A2;
        org.telegram.ui.Cells.k3 k3Var = this.f33754s2;
        boolean equals = TextUtils.equals(str, k3Var.d.getText().toString());
        boolean z9 = !equals;
        if (this.f33761z2 == z9) {
            return;
        }
        ViewPropertyAnimator animate = k3Var.d.animate();
        this.f33761z2 = z9;
        if (!equals) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 320L);
        this.G2.O(true);
    }

    public final void w1() {
        pj0 pj0Var;
        View view;
        if (this.f33755t2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            pj0Var = this.f36277k1;
            if (i7 < pj0Var.getChildCount()) {
                view = pj0Var.getChildAt(i7);
                x31 G = this.G2.G(RecyclerView.R(view) - 1);
                if (G != null && G.f40173c == this.f33751p2) {
                    break;
                }
                i7++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f33755t2.setVisibility(0);
            this.f33755t2.setTranslationY(view.getY() + pj0Var.getY() + view.getHeight());
            return;
        }
        this.f33755t2.setVisibility(4);
        this.f33755t2.f(true);
    }

    public final void x1() {
        f0 f0Var = this.f33751p2;
        TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
        f0Var.f33420c.removeAllViews();
        if (n1()) {
            f0Var.b(new TL_aicompose.AiComposeTone(), new g(this, 0));
        }
        f0Var.b(null, new g(this, 0));
        ArrayList arrayList = this.f33748m2.f22155b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0Var.b((TL_aicompose.AiComposeTone) obj, new g(this, 0));
        }
        if (selectedTone != f0Var.getSelectedTone()) {
            f0Var.d(null);
        }
    }
}
