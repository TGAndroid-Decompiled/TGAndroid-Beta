package org.telegram.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j4 extends org.telegram.ui.Components.rl0 {
    public TLRPC.WebPage B;
    public TL_iv.pageBlockChannel C;
    public boolean D;
    public final boolean E;
    public int[] F;
    public int G;
    public final l4 I;
    public final Context f35223c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f35224f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f35225n = new HashMap();
    public final HashMap f35226r = new HashMap();
    public final HashMap f35227s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final HashMap f35228w = new HashMap();
    public final ArrayList f35229x = new ArrayList();
    public final HashMap f35230y = new HashMap();
    public final rt0 H = new rt0(this, 11);

    public j4(l4 l4Var, Context context, boolean z4) {
        this.I = l4Var;
        this.f35223c = context;
        this.E = z4;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockHeader) && !l4.K(pageBlock)) {
            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                return 2;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                return 3;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                return 4;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return 5;
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return 6;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return 7;
            }
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                return 8;
            }
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return 9;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                return 10;
            }
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                return 11;
            }
            if (pageBlock instanceof b4) {
                return 12;
            }
            if (pageBlock instanceof TL_iv.pageBlockFooter) {
                return 13;
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return 14;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                return 15;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                return 16;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                return 17;
            }
            if (pageBlock instanceof TL_iv.pageBlockChannel) {
                return 18;
            }
            if (pageBlock instanceof TL_iv.pageBlockAudio) {
                return 19;
            }
            if (pageBlock instanceof TL_iv.pageBlockKicker) {
                return 20;
            }
            if (pageBlock instanceof d4) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof f4) {
                return 23;
            }
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return 24;
            }
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                return 25;
            }
            if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                return 26;
            }
            if (pageBlock instanceof g4) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof z3) {
                return I(((z3) pageBlock).f40661b);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return I(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }
        return 1;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 23 && i10 != 24) {
            return false;
        }
        return true;
    }

    public final void E(TL_iv.PageBlock pageBlock, j4 j4Var) {
        boolean z4 = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f35224f;
        if (z4) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e = i4.e(this.B, pageblockphoto.photo_id);
            if (e != null) {
                pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(e.sizes, 56, true);
                pageblockphoto.thumbObject = e;
                arrayList.add(pageBlock);
            }
        } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && i4.g(j4Var.B, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a2 = i4.a(this.B, pageblockvideo.video_id);
            if (a2 != null) {
                pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 56, true);
                pageblockvideo.thumbObject = a2;
                arrayList.add(pageBlock);
            }
        } else {
            boolean z10 = pageBlock instanceof TL_iv.pageBlockSlideshow;
            int i10 = 0;
            l4 l4Var = this.I;
            if (z10) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i10 < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i10);
                    pageBlock2.groupId = l4Var.V;
                    E(pageBlock2, j4Var);
                    i10++;
                }
                l4Var.V++;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i10 < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i10);
                    pageBlock3.groupId = l4Var.V;
                    E(pageBlock3, j4Var);
                    i10++;
                }
                l4Var.V++;
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(((TL_iv.pageBlockCover) pageBlock).cover, j4Var);
            }
        }
    }

    public final void F(org.telegram.ui.j4 r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.F(org.telegram.ui.j4, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (!(obj instanceof TL_iv.textEmpty)) {
            HashMap hashMap = this.f35228w;
            if (hashMap.containsKey(obj)) {
                return;
            }
            hashMap.put(obj, pageBlock);
            this.f35229x.add(obj);
        }
    }

    public final void H(int r32, f2.l1 r33, org.telegram.tgnet.tl.TL_iv.PageBlock r34, int r35, int r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.H(int, f2.l1, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean):void");
    }

    public final boolean J(z3 z3Var) {
        TL_iv.PageBlock z4 = l4.z(z3Var.f40660a);
        if (z4 instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) z4).open;
        }
        if (z4 instanceof z3) {
            z3 z3Var2 = (z3) z4;
            TL_iv.PageBlock z10 = l4.z(z3Var2.f40661b);
            if (!(z10 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) z10).open) {
                return J(z3Var2);
            }
            return false;
        }
        return false;
    }

    public final void K(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageBlock pageBlock2 = (TL_iv.pageBlockEmbedPost) pageBlock;
            L(null, pageBlock2.caption.text);
            L(null, pageBlock2.caption.credit);
            G(pageBlock2.caption.text, pageBlock2);
            G(pageBlock2.caption.credit, pageBlock2);
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
            L(null, pageBlock3.text);
            G(pageBlock3.text, pageBlock3);
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
            L(null, pageBlock4.text);
            G(pageBlock4.text, pageBlock4);
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
            L(null, pageBlock5.text);
            G(pageBlock5.text, pageBlock5);
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
            L(null, pageBlock6.text);
            G(pageBlock6.text, pageBlock6);
        } else if (l4.K(pageBlock)) {
            TL_iv.RichText richText = pageBlock.text;
            L(null, richText);
            G(richText, pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
            L(null, pageBlock7.text);
            G(pageBlock7.text, pageBlock7);
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
            L(null, pageBlock8.text);
            G(pageBlock8.text, pageBlock8);
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                L(null, pageblockslideshow.caption.text);
                L(null, pageblockslideshow.caption.credit);
                G(pageblockslideshow.caption.text, pageblockslideshow);
                G(pageblockslideshow.caption.credit, pageblockslideshow);
                int size = pageblockslideshow.items.size();
                while (i10 < size) {
                    K(pageblockslideshow.items.get(i10));
                    i10++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                L(null, pageBlock9.caption.text);
                L(null, pageBlock9.caption.credit);
                G(pageBlock9.caption.text, pageBlock9);
                G(pageBlock9.caption.credit, pageBlock9);
            } else if (pageBlock instanceof b4) {
                b4 b4Var = (b4) pageBlock;
                TL_iv.RichText richText2 = b4Var.e;
                if (richText2 != null) {
                    L(null, richText2);
                    G(b4Var.e, b4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock10 = b4Var.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                }
            } else if (pageBlock instanceof d4) {
                d4 d4Var = (d4) pageBlock;
                TL_iv.RichText richText3 = d4Var.e;
                if (richText3 != null) {
                    L(null, richText3);
                    G(d4Var.e, d4Var);
                    return;
                }
                TL_iv.PageBlock pageBlock11 = d4Var.d;
                if (pageBlock11 != null) {
                    K(pageBlock11);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                L(null, pageblockcollage.caption.text);
                L(null, pageblockcollage.caption.credit);
                G(pageblockcollage.caption.text, pageblockcollage);
                G(pageblockcollage.caption.credit, pageblockcollage);
                int size2 = pageblockcollage.items.size();
                while (i10 < size2) {
                    K(pageblockcollage.items.get(i10));
                    i10++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
                L(null, pageBlock12.caption.text);
                L(null, pageBlock12.caption.credit);
                G(pageBlock12.caption.text, pageBlock12);
                G(pageBlock12.caption.credit, pageBlock12);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
                L(null, pageBlock13.text);
                G(pageBlock13.text, pageBlock13);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                L(null, pageblockblockquote.text);
                L(null, pageblockblockquote.caption);
                G(pageblockblockquote.text, pageblockblockquote);
                G(pageblockblockquote.caption, pageblockblockquote);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                L(null, pageblockdetails.title);
                G(pageblockdetails.title, pageblockdetails);
                int size3 = pageblockdetails.blocks.size();
                while (i10 < size3) {
                    K(pageblockdetails.blocks.get(i10));
                    i10++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
                L(null, pageBlock14.caption.text);
                L(null, pageBlock14.caption.credit);
                G(pageBlock14.caption.text, pageBlock14);
                G(pageBlock14.caption.credit, pageBlock14);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                L(null, pageblockpullquote.text);
                L(null, pageblockpullquote.caption);
                G(pageblockpullquote.text, pageblockpullquote);
                G(pageblockpullquote.caption, pageblockpullquote);
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
                L(null, pageBlock15.caption.text);
                L(null, pageBlock15.caption.credit);
                G(pageBlock15.caption.text, pageBlock15);
                G(pageBlock15.caption.credit, pageBlock15);
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                L(null, pageblocktable.title);
                G(pageblocktable.title, pageblocktable);
                int size4 = pageblocktable.rows.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i11);
                    int size5 = pagetablerow.cells.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i12);
                        L(null, pagetablecell.text);
                        G(pagetablecell.text, pageblocktable);
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
                TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
                L(null, pageBlock16.text);
                G(pageBlock16.text, pageBlock16);
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                K(((TL_iv.pageBlockCover) pageBlock).cover);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
                L(null, pageblockauthordate.author);
                G(pageblockauthordate.author, pageblockauthordate);
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                L(null, pageBlock17.caption.text);
                L(null, pageBlock17.caption.credit);
                G(pageBlock17.caption.text, pageBlock17);
                G(pageBlock17.caption.credit, pageBlock17);
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                L(null, pageblockrelatedarticles.title);
                G(pageblockrelatedarticles.title, pageblockrelatedarticles);
            }
        }
    }

    public final void L(TL_iv.RichText richText, TL_iv.RichText richText2) {
        if (richText2 != null) {
            richText2.parentRichText = richText;
            if (richText2 instanceof TL_iv.textFixed) {
                L(richText2, ((TL_iv.textFixed) richText2).text);
            } else if (richText2 instanceof TL_iv.textItalic) {
                L(richText2, ((TL_iv.textItalic) richText2).text);
            } else if (richText2 instanceof TL_iv.textBold) {
                L(richText2, ((TL_iv.textBold) richText2).text);
            } else if (richText2 instanceof TL_iv.textUnderline) {
                L(richText2, ((TL_iv.textUnderline) richText2).text);
            } else if (richText2 instanceof TL_iv.textStrike) {
                L(richText2, ((TL_iv.textStrike) richText2).text);
            } else if (richText2 instanceof TL_iv.textEmail) {
                L(richText2, ((TL_iv.textEmail) richText2).text);
            } else if (richText2 instanceof TL_iv.textPhone) {
                L(richText2, ((TL_iv.textPhone) richText2).text);
            } else if (richText2 instanceof TL_iv.textUrl) {
                L(richText2, ((TL_iv.textUrl) richText2).text);
            } else if (richText2 instanceof TL_iv.textConcat) {
                int size = richText2.texts.size();
                for (int i10 = 0; i10 < size; i10++) {
                    L(richText2, richText2.texts.get(i10));
                }
            } else if (richText2 instanceof TL_iv.textSubscript) {
                L(richText2, ((TL_iv.textSubscript) richText2).text);
            } else if (richText2 instanceof TL_iv.textSuperscript) {
                L(richText2, ((TL_iv.textSuperscript) richText2).text);
            } else if (richText2 instanceof TL_iv.textMarked) {
                L(richText2, ((TL_iv.textMarked) richText2).text);
            } else if (richText2 instanceof TL_iv.textSpoiler) {
                L(richText2, ((TL_iv.textSpoiler) richText2).text);
            } else if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                L(richText2, textanchor.text);
                String lowerCase = textanchor.name.toLowerCase();
                this.h.put(lowerCase, Integer.valueOf(this.e.size()));
                TL_iv.RichText richText3 = textanchor.text;
                boolean z4 = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.f35226r;
                if (z4) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.f35225n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i10);
            TL_iv.PageBlock z4 = l4.z(pageBlock);
            if (!(z4 instanceof z3) || J((z3) z4)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.globalQueue.cancelRunnable(this.H);
            Utilities.globalQueue.postRunnable(this.H, 100L);
        }
    }

    @Override
    public final int h() {
        int i10;
        TLRPC.WebPage webPage = this.B;
        if (webPage != null && webPage.cached_page != null) {
            i10 = this.d.size();
            if (this.B.cached_page.local == null) {
                i10++;
            }
        } else {
            i10 = 0;
        }
        if (this.E) {
            return i10 + 1;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        TL_iv.Page page;
        if (this.E) {
            if (i10 == 0) {
                return 2147483646;
            }
            i10--;
        }
        ArrayList arrayList = this.d;
        if (i10 == arrayList.size()) {
            TLRPC.WebPage webPage = this.B;
            if (webPage != null && (page = webPage.cached_page) != null && page.web) {
                return 91;
            }
            return 90;
        }
        return I((TL_iv.PageBlock) arrayList.get(i10));
    }

    @Override
    public final void l() {
        M();
        super.l();
    }

    @Override
    public final void m(int i10) {
        M();
        super.m(i10);
    }

    @Override
    public final void p(int i10, int i11) {
        M();
        super.p(i10, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        M();
        super.q(i10, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        M();
        super.r(i10, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        M();
        super.s(i10, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        M();
        super.t(i10, i11);
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        if (this.E) {
            i10--;
        }
        int i11 = i10;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                H(l1Var.f5788f, l1Var, (TL_iv.PageBlock) arrayList.get(i11), i11, arrayList.size(), false);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        TextView textView;
        View z2Var;
        Context context = this.f35223c;
        if (i10 != 2147483646) {
            l4 l4Var = this.I;
            switch (i10) {
                case 0:
                    textView = new d2(context, l4Var, this);
                    break;
                case 1:
                    textView = new x1(context, l4Var, this);
                    break;
                case 2:
                    textView = new o1(context);
                    break;
                case 3:
                    textView = new u1(l4Var, context, this);
                    break;
                case 4:
                    textView = new u2(context, l4Var, this);
                    break;
                case 5:
                    z2Var = new z2(context, l4Var, this, 0);
                    textView = z2Var;
                    break;
                case 6:
                    textView = new j2(context, l4Var, this);
                    break;
                case 7:
                    textView = new d1(context, l4Var, this);
                    break;
                case 8:
                    textView = new s2(l4Var, context, this);
                    break;
                case 9:
                    z2Var = new e2(context, l4Var, this, 0);
                    textView = z2Var;
                    break;
                case 10:
                    textView = new c1(context, l4Var, this);
                    break;
                case 11:
                    textView = new x2(context, l4Var, this);
                    break;
                case 12:
                    textView = new z1(context, l4Var, this);
                    break;
                case 13:
                    textView = new w1(context, l4Var, this);
                    break;
                case 14:
                    textView = new i2(context, l4Var, this);
                    break;
                case 15:
                    textView = new t2(context, l4Var, this);
                    break;
                case 16:
                    textView = new v1(context, l4Var, this);
                    break;
                case 17:
                    textView = new l1(l4Var, context, this);
                    break;
                case 18:
                    z2Var = new e1(context, l4Var, this, 0);
                    textView = z2Var;
                    break;
                case 19:
                    textView = new b1(context, l4Var, this);
                    break;
                case 20:
                    textView = new y1(context, l4Var, this);
                    break;
                case 21:
                    textView = new c2(context, l4Var, this);
                    break;
                case 22:
                    textView = new a2(context, l4Var, this);
                    break;
                case 23:
                    textView = new k2(context, l4Var, this);
                    break;
                case 24:
                    textView = new n1(context, l4Var, this);
                    break;
                case 25:
                    textView = new w2(context, l4Var, this);
                    break;
                case 26:
                    textView = new l2(context, l4Var, this);
                    break;
                case 27:
                    View view = new View(context);
                    new RectF();
                    view.setImportantForAccessibility(2);
                    textView = view;
                    break;
                case 28:
                    textView = new m2(context, l4Var);
                    break;
                default:
                    switch (i10) {
                        case 90:
                            z2Var = new s3(l4Var, context, false);
                            textView = z2Var;
                            break;
                        case 91:
                            textView = new s3(l4Var, context, true);
                            break;
                        case 92:
                            textView = new b2(context, l4Var);
                            break;
                        default:
                            TextView textView2 = new TextView(context);
                            textView2.setBackgroundColor(-65536);
                            textView2.setTextColor(-16777216);
                            textView2.setTextSize(1, 20.0f);
                            textView = textView2;
                            break;
                    }
            }
        } else {
            View hnVar = new org.telegram.ui.Components.hn(context, 5);
            hnVar.setImportantForAccessibility(2);
            textView = hnVar;
        }
        textView.setLayoutParams(new f2.w0(-1, -2));
        textView.setFocusable(true);
        return new f2.l1(textView);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        int i11 = l1Var.f5788f;
        if (i11 != 90 && i11 != 91) {
            return;
        }
        s3 s3Var = (s3) l1Var.f5785a;
        TL_iv.Page page = this.B.cached_page;
        if (page != null) {
            i10 = page.views;
        } else {
            i10 = 0;
        }
        l4 l4Var = s3Var.e;
        TextView textView = s3Var.f38183a;
        TextView textView2 = s3Var.f38184b;
        if (i10 == 0) {
            s3Var.f38185c = false;
            textView2.setVisibility(8);
            textView.setGravity(17);
        } else {
            s3Var.f38185c = true;
            textView2.setVisibility(0);
            textView.setGravity(21);
            textView2.setText(LocaleController.formatPluralStringComma("Views", i10));
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        textView.setTextColor(l4Var.a());
        textView2.setTextColor(l4Var.a());
        textView.setBackgroundColor(Color.argb(34, Color.red(w02), Color.green(w02), Color.blue(w02)));
    }
}
