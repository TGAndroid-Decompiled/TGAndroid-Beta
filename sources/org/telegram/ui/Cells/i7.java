package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.i10;

public final class i7 extends FrameLayout {
    public final ArrayList A;
    public int B;
    public final ArrayList C;
    public final SparseArray D;
    public final ArrayList E;
    public final ArrayList F;
    public final Stack G;
    public final Path H;
    public eh.k I;
    public int J;
    public final int K;
    public StaticLayout L;
    public int M;
    public StaticLayout N;
    public final AtomicReference O;
    public int P;
    public StaticLayout Q;
    public final AtomicReference R;
    public int S;
    public StaticLayout T;
    public MessageObject U;
    public final TextPaint V;
    public final TextPaint W;

    public boolean f24478a;

    public final TextPaint f24479a0;

    public androidx.emoji2.text.j f24480b;

    public final TextPaint f24481b0;

    public int f24482c;

    public int f24483c0;
    public m.i3 d;

    public StaticLayout f24484d0;

    public final m80 f24485e;

    public int f24486e0;

    public boolean f24487f;

    public StaticLayout f24488f0;

    public org.telegram.ui.Components.p5 f24489g0;
    public int h;

    public final org.telegram.ui.ActionBar.c6 f24490h0;

    public final int f24491i0;

    public q80 f24492n;

    public final ImageReceiver f24493r;

    public boolean f24494s;
    public final y70 v;

    public final bp f24495w;

    public h7 f24496x;

    public boolean f24497y;

    public i7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24478a = false;
        this.f24480b = null;
        this.f24482c = 0;
        this.d = null;
        this.f24485e = new m80(this);
        this.A = new ArrayList();
        this.C = new ArrayList();
        this.D = new SparseArray();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new Stack();
        this.H = new Path();
        this.J = -1;
        this.K = AndroidUtilities.dp(10.0f);
        this.M = AndroidUtilities.dp(30.0f);
        this.O = new AtomicReference();
        this.P = AndroidUtilities.dp(30.0f);
        this.R = new AtomicReference();
        this.S = AndroidUtilities.dp(30.0f);
        this.f24486e0 = AndroidUtilities.dp(30.0f);
        this.f24490h0 = c6Var;
        this.f24491i0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.V = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.W = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24493r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new y70(0, c6Var);
        bp bpVar = new bp(context, 21, c6Var);
        this.f24495w = bpVar;
        bpVar.setVisibility(4);
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(2);
        boolean z10 = LocaleController.isRTL;
        addView(bpVar, h7.z5.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 44.0f, 44.0f, z10 ? 44.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24479a0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f24481b0 = textPaint4;
        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("#")) {
            return;
        }
        if (!AndroidUtilities.charSequenceContains(strTrim, "://") && strTrim.toString().toLowerCase().indexOf("http") != 0 && strTrim.toString().toLowerCase().indexOf("mailto") != 0) {
            strTrim = "http://".concat(strTrim);
        }
        this.A.add(SpannableString.valueOf(strTrim));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c((TL_iv.PageBlock) obj);
        }
    }

    public final void c(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            d(pageBlock.text);
        } else if (pageBlock instanceof TL_iv.pageBlockCover) {
            c(((TL_iv.pageBlockCover) pageBlock).cover);
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            b(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
        }
    }

    public final void d(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textUrl) {
            a(richText.url);
            return;
        }
        if (richText instanceof TL_iv.textAutoUrl) {
            a(RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                d(richText.texts.get(i10));
            }
            return;
        }
        if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f24485e.d(true);
        this.h = -1;
        this.f24492n = null;
        this.f24487f = false;
        this.f24478a = false;
        androidx.emoji2.text.j jVar = this.f24480b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m.i3 i3Var = this.d;
        if (i3Var != null) {
            removeCallbacks(i3Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        bp bpVar = this.f24495w;
        if (bpVar.getVisibility() != 0) {
            bpVar.setVisibility(0);
        }
        bpVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        e();
        this.I.f5525q = new g7(this, 0);
        int i13 = i10 - iDp;
        float fSqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i14 = this.J;
        SparseArray sparseArray = this.D;
        ArrayList arrayList = this.E;
        ArrayList arrayList2 = this.F;
        ArrayList arrayList3 = this.C;
        if (i14 == 0) {
            float lineBottom = 0.0f;
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                Layout layout = (Layout) arrayList3.get(i15);
                lineBottom += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i15)).iterator();
                while (it.hasNext()) {
                    ((eh.k) it.next()).j(i13, ((i11 - this.B) - i12) + lineBottom, fSqrt, false);
                }
            }
        } else if (i14 == 1) {
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                ((eh.k) obj).j(i13, i11 - this.M, fSqrt, false);
            }
        } else if (i14 == 2) {
            int size2 = arrayList2.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList2.get(i17);
                i17++;
                ((eh.k) obj2).j(i13, i11 - this.P, fSqrt, false);
            }
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            if (i18 != this.J) {
                if (i18 == 0) {
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        Layout layout2 = (Layout) arrayList3.get(i19);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (eh.k kVar : (List) sparseArray.get(i19)) {
                            kVar.j(kVar.getBounds().centerX(), kVar.getBounds().centerY(), fSqrt, false);
                        }
                    }
                } else if (i18 == 1) {
                    int size3 = arrayList.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj3 = arrayList.get(i20);
                        i20++;
                        eh.k kVar2 = (eh.k) obj3;
                        kVar2.j(kVar2.getBounds().centerX(), kVar2.getBounds().centerY(), fSqrt, false);
                    }
                } else if (i18 == 2) {
                    int size4 = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj4 = arrayList2.get(i21);
                        i21++;
                        eh.k kVar3 = (eh.k) obj4;
                        kVar3.j(kVar3.getBounds().centerX(), kVar3.getBounds().centerY(), fSqrt, false);
                    }
                }
            }
        }
        this.J = -1;
        this.I = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f24493r;
    }

    public MessageObject getMessage() {
        return this.U;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24494s) {
            this.f24493r.onAttachedToWindow();
        }
        this.f24489g0 = org.telegram.ui.Components.t5.update(0, this, this.f24489g0, this.f24488f0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24494s) {
            this.f24493r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.t5.release(this, this.f24489g0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24490h0;
        if (this.f24491i0 == 1) {
            this.f24479a0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        }
        StaticLayout staticLayout = this.f24484d0;
        int i10 = this.K;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.f24483c0), i10);
            this.f24484d0.draw(canvas2);
            canvas2.restore();
        }
        if (this.L != null) {
            canvas2.save();
            float fDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.f24484d0;
                fDp += staticLayout2 == null ? 0.0f : AndroidUtilities.dp(4.0f) + staticLayout2.getWidth();
            }
            canvas2.translate(fDp, i10);
            this.L.draw(canvas2);
            canvas2.restore();
        }
        if (this.T != null) {
            this.f24481b0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.S);
            this.T.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.N;
        TextPaint textPaint = this.W;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.M);
            eh.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.O, 0, this.N, this.E, canvas2, false);
            canvas2.restore();
        }
        if (this.Q != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.P);
            eh.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.R, 0, this.Q, this.F, canvas2, false);
            canvas2.restore();
        }
        ArrayList arrayList = this.C;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
            int lineBottom = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i11);
                List list = (List) this.D.get(i11);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.B + lineBottom);
                    Path path = this.H;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((eh.k) it.next()).getBounds();
                            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                        }
                    }
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipPath(path);
                    path.rewind();
                    if (list != null && !list.isEmpty()) {
                        ((eh.k) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((eh.k) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    lineBottom += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (this.f24485e.f(canvas2)) {
                invalidate();
            }
        }
        if (this.f24488f0 != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.f24486e0);
            this.f24488f0.draw(canvas2);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f24488f0, this.f24489g0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        this.v.draw(canvas2);
        if (this.f24494s) {
            this.f24493r.draw(canvas2);
        }
        if (this.f24497y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.L;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.N != null) {
            sb2.append(", ");
            sb2.append(this.N.getText());
        }
        if (this.Q != null) {
            sb2.append(", ");
            sb2.append(this.Q.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        if (this.f24495w.f27188a.f26309q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        String str;
        String string;
        String str2;
        boolean z10;
        float f10;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        TextPaint textPaint;
        int iDp;
        CharSequence charSequence2;
        int i12;
        TLRPC.PhotoSize photoSize;
        int i13;
        float f11;
        int lineBottom;
        int iC;
        float f12;
        SparseArray sparseArray;
        TLRPC.PhotoSize photoSize2;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i14;
        SparseArray sparseArray2;
        int i15;
        StaticLayout staticLayout;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int iLastIndexOf;
        int i16;
        SpannableStringBuilder spannableStringBuilder2;
        CharSequence charSequence3;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilderValueOf;
        int iLastIndexOf2;
        int i17;
        String str3;
        CharSequence charSequence4;
        ArrayList arrayList2 = this.F;
        ArrayList arrayList3 = this.E;
        this.f24494s = false;
        this.N = null;
        this.L = null;
        this.Q = null;
        this.T = null;
        ArrayList arrayList4 = this.C;
        arrayList4.clear();
        ArrayList arrayList5 = this.A;
        arrayList5.clear();
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        MessageObject messageObject = this.U;
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        int i18 = 1;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (messageObject.photoThumbs == null && webPage.photo != null) {
                    messageObject.generateThumbs(true);
                }
                boolean z11 = (webPage.photo == null || this.U.photoThumbs == null) ? false : true;
                string = webPage.title;
                if (string == null) {
                    string = webPage.site_name;
                }
                String str4 = webPage.description;
                str = webPage.url;
                z10 = z11;
                str2 = str4;
            } else {
                str = null;
                string = null;
                str2 = null;
                z10 = false;
            }
        } else {
            str = null;
            string = null;
            str2 = null;
            z10 = false;
        }
        MessageObject messageObject2 = this.U;
        if (messageObject2 == null || messageObject2.messageOwner.entities.isEmpty()) {
            f10 = 8.0f;
            spannableStringBuilder = null;
            charSequence = str2;
        } else {
            SpannableStringBuilder spannableStringBuilderValueOf2 = null;
            f10 = 8.0f;
            int i19 = 0;
            CharSequence charSequence5 = str2;
            while (i19 < this.U.messageOwner.entities.size()) {
                TLRPC.MessageEntity messageEntity = this.U.messageOwner.entities.get(i19);
                if (messageEntity.length > 0 && (i16 = messageEntity.offset) >= 0 && i16 < this.U.messageOwner.message.length()) {
                    if (messageEntity.offset + messageEntity.length > this.U.messageOwner.message.length()) {
                        messageEntity.length = this.U.messageOwner.message.length() - messageEntity.offset;
                    }
                    if (i19 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.U.messageOwner.message.length())) {
                        if (this.U.messageOwner.entities.size() != i18) {
                            spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                            MediaDataController.addTextStyleRuns(this.U, spannableStringBuilderValueOf2);
                        } else if (charSequence5 == null) {
                            spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                            MediaDataController.addTextStyleRuns(this.U, spannableStringBuilderValueOf2);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilderValueOf2;
                    try {
                        if ((messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                String str5 = this.U.messageOwner.message;
                                int i20 = messageEntity.offset;
                                strSubstring = str5.substring(i20, messageEntity.length + i20);
                            } else {
                                strSubstring = messageEntity.url;
                            }
                            if (string == null || string.length() == 0) {
                                charSequence5 = charSequence5;
                                string = Uri.parse(strSubstring.toString()).getHost();
                                if (string == null) {
                                    string = strSubstring.toString();
                                }
                                if (string != null && (iLastIndexOf2 = string.lastIndexOf(46)) >= 0) {
                                    String strSubstring2 = string.substring(0, iLastIndexOf2);
                                    int iLastIndexOf3 = strSubstring2.lastIndexOf(46);
                                    if (iLastIndexOf3 >= 0) {
                                        strSubstring2 = strSubstring2.substring(iLastIndexOf3 + 1);
                                    }
                                    string = strSubstring2.substring(0, 1).toUpperCase() + strSubstring2.substring(1);
                                }
                                if (messageEntity.offset != 0 || messageEntity.length != this.U.messageOwner.message.length()) {
                                    charSequence5 = charSequence5;
                                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.U, spannableStringBuilderValueOf);
                                    charSequence5 = spannableStringBuilderValueOf;
                                }
                                FileLog.e(e);
                                charSequence5 = charSequence3;
                                spannableStringBuilderValueOf2 = spannableStringBuilder2;
                            }
                        } else if ((messageEntity instanceof TLRPC.TL_messageEntityEmail) && (string == null || string.length() == 0)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("mailto:");
                            String str6 = this.U.messageOwner.message;
                            int i21 = messageEntity.offset;
                            sb2.append(str6.substring(i21, messageEntity.length + i21));
                            strSubstring = sb2.toString();
                            String str7 = this.U.messageOwner.message;
                            int i22 = messageEntity.offset;
                            string = str7.substring(i22, messageEntity.length + i22);
                            if (messageEntity.offset != 0 || messageEntity.length != this.U.messageOwner.message.length()) {
                                charSequence5 = charSequence5;
                                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                                MediaDataController.addTextStyleRuns(this.U, spannableStringBuilderValueOf);
                                charSequence5 = spannableStringBuilderValueOf;
                            }
                            FileLog.e(e);
                            charSequence5 = charSequence3;
                            spannableStringBuilderValueOf2 = spannableStringBuilder2;
                        } else {
                            strSubstring = null;
                            charSequence5 = charSequence5;
                        }
                        if (strSubstring != null) {
                            try {
                                if (AndroidUtilities.charSequenceContains(strSubstring, "://") || strSubstring.toString().toLowerCase().indexOf("http") == 0 || strSubstring.toString().toLowerCase().indexOf("mailto") == 0) {
                                    i17 = 0;
                                } else {
                                    strSubstring = "http://" + ((Object) strSubstring);
                                    i17 = 7;
                                }
                                SpannableString spannableStringValueOf = SpannableString.valueOf(strSubstring);
                                int i23 = messageEntity.offset;
                                int i24 = messageEntity.length + i23;
                                ArrayList<TLRPC.MessageEntity> arrayList6 = this.U.messageOwner.entities;
                                str3 = string;
                                try {
                                    int size2 = arrayList6.size();
                                    int i25 = i17;
                                    int i26 = 0;
                                    charSequence5 = charSequence5;
                                    while (i26 < size2) {
                                        TLRPC.MessageEntity messageEntity2 = arrayList6.get(i26);
                                        int i27 = i26 + 1;
                                        int i28 = size2;
                                        TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                        int i29 = messageEntity3.offset;
                                        CharSequence charSequence6 = charSequence5;
                                        try {
                                            int i30 = messageEntity3.length + i29;
                                            if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i23 > i30 || i24 < i29) {
                                                spannableStringBuilder2 = spannableStringBuilder3;
                                            } else {
                                                xz0 xz0Var = new xz0();
                                                spannableStringBuilder2 = spannableStringBuilder3;
                                                try {
                                                    xz0Var.f34734a |= 256;
                                                    spannableStringValueOf.setSpan(new yz0(xz0Var, 0), Math.max(i23, i29), Math.min(i24, i30) + i25, 33);
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    string = str3;
                                                    charSequence3 = charSequence6;
                                                    FileLog.e(e);
                                                    charSequence5 = charSequence3;
                                                    spannableStringBuilderValueOf2 = spannableStringBuilder2;
                                                    i19++;
                                                    i18 = 1;
                                                    charSequence5 = charSequence5;
                                                }
                                            }
                                            i26 = i27;
                                            size2 = i28;
                                            charSequence5 = charSequence6;
                                            spannableStringBuilder3 = spannableStringBuilder2;
                                            arrayList6 = arrayList6;
                                        } catch (Exception e10) {
                                            e = e10;
                                            spannableStringBuilder2 = spannableStringBuilder3;
                                        }
                                    }
                                    charSequence4 = charSequence5;
                                    spannableStringBuilder2 = spannableStringBuilder3;
                                    arrayList5.add(spannableStringValueOf);
                                } catch (Exception e11) {
                                    e = e11;
                                    spannableStringBuilder2 = spannableStringBuilder3;
                                    string = str3;
                                    charSequence3 = charSequence5;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                spannableStringBuilder2 = spannableStringBuilder3;
                                charSequence3 = charSequence5;
                            }
                        } else {
                            str3 = string;
                            charSequence4 = charSequence5;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        string = str3;
                        charSequence5 = charSequence4;
                    } catch (Exception e13) {
                        e = e13;
                    }
                    spannableStringBuilderValueOf2 = spannableStringBuilder2;
                }
                i19++;
                i18 = 1;
                charSequence5 = charSequence5;
            }
            spannableStringBuilder = spannableStringBuilderValueOf2;
            charSequence = charSequence5;
        }
        if (str != null && arrayList5.isEmpty()) {
            arrayList5.add(str);
        }
        MessageObject messageObject3 = this.U;
        if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (richMessage = message.rich_message) != null) {
            b(richMessage.blocks);
            if (!arrayList5.isEmpty()) {
                String string2 = ((CharSequence) arrayList5.get(0)).toString();
                if (string == null || string.length() == 0) {
                    String host = Uri.parse(string2.toString()).getHost();
                    string = host == null ? string2.toString() : host;
                    if (string != null && (iLastIndexOf = string.lastIndexOf(46)) >= 0) {
                        String strSubstring3 = string.substring(0, iLastIndexOf);
                        int iLastIndexOf4 = strSubstring3.lastIndexOf(46);
                        if (iLastIndexOf4 >= 0) {
                            strSubstring3 = strSubstring3.substring(iLastIndexOf4 + 1);
                        }
                        string = strSubstring3.substring(0, 1).toUpperCase() + strSubstring3.substring(1);
                    }
                }
            }
        }
        int i31 = this.f24491i0;
        TextPaint textPaint3 = this.f24479a0;
        if (i31 == 1) {
            String strStringForMessageListDate = LocaleController.stringForMessageListDate(this.U.messageOwner.date);
            int iCeil = (int) Math.ceil(textPaint3.measureText(strStringForMessageListDate));
            textPaint = textPaint3;
            this.f24484d0 = s1.t2(strStringForMessageListDate, textPaint3, iCeil, iCeil, 0, 1);
            this.f24483c0 = (size - iCeil) - AndroidUtilities.dp(f10);
            iDp = AndroidUtilities.dp(12.0f) + iCeil;
        } else {
            textPaint = textPaint3;
            iDp = 0;
        }
        y70 y70Var = this.v;
        if (string != null) {
            try {
                CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(string, this.U.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                int i32 = size - iDp;
                StaticLayout staticLayoutT2 = s1.t2(charSequenceHighlightText != null ? charSequenceHighlightText : string, this.V, i32 - AndroidUtilities.dp(4.0f), i32 - AndroidUtilities.dp(4.0f), 0, 3);
                this.L = staticLayoutT2;
                if (staticLayoutT2.getLineCount() > 0) {
                    int i33 = this.K;
                    StaticLayout staticLayout2 = this.L;
                    this.M = i33 + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
                }
            } catch (Exception e14) {
                FileLog.e(e14);
            }
            y70Var.a(string);
        }
        this.P = this.M;
        StaticLayout staticLayout3 = this.L;
        int iMax = Math.max(1, 4 - (staticLayout3 != null ? staticLayout3.getLineCount() : 0));
        if (i31 == 1) {
            spannableStringBuilder = null;
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        TextPaint textPaint4 = this.W;
        Stack stack = this.G;
        if (charSequence2 != null) {
            try {
                StaticLayout staticLayoutT3 = s1.t2(charSequence2, textPaint4, size, size, 0, iMax);
                this.N = staticLayoutT3;
                if (staticLayoutT3.getLineCount() > 0) {
                    int i34 = this.M;
                    StaticLayout staticLayout4 = this.N;
                    this.P = i34 + staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                }
                stack.addAll(arrayList3);
                arrayList3.clear();
                if (!this.U.isSpoilersRevealed) {
                    eh.k.c(this, this.N, stack, arrayList3);
                }
            } catch (Exception e15) {
                FileLog.e(e15);
            }
        }
        if (spannableStringBuilder != null) {
            try {
                i12 = iMax;
                try {
                    this.Q = s1.t2(spannableStringBuilder, textPaint4, size, size, 0, iMax);
                    if (this.N != null) {
                        this.P += AndroidUtilities.dp(10.0f);
                    }
                    stack.addAll(arrayList2);
                    arrayList2.clear();
                    if (!this.U.isSpoilersRevealed) {
                        eh.k.c(this, this.Q, stack, arrayList2);
                    }
                } catch (Exception e16) {
                    e = e16;
                    FileLog.e(e);
                }
            } catch (Exception e17) {
                e = e17;
                i12 = iMax;
            }
        } else {
            i12 = iMax;
        }
        MessageObject messageObject4 = this.U;
        if (messageObject4 == null || TextUtils.isEmpty(messageObject4.messageOwner.message)) {
            photoSize = null;
        } else {
            photoSize = null;
            CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(Emoji.replaceEmoji(this.U.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), false), this.U.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
            if (charSequenceHighlightText2 != null) {
                String str8 = this.U.highlightedWords.get(0);
                TextPaint textPaint5 = this.f24481b0;
                this.T = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, str8, size, textPaint5, 130), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, AndroidUtilities.dp(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        }
        StaticLayout staticLayout5 = this.T;
        if (staticLayout5 != null) {
            int i35 = this.M;
            this.S = i35;
            int iC2 = org.telegram.messenger.y1.C(5.0f, staticLayout5.getLineBottom(staticLayout5.getLineCount() - 1), i35);
            this.M = iC2;
            this.P = iC2;
        }
        if (!arrayList5.isEmpty()) {
            int i36 = 0;
            while (true) {
                sparseArray = this.D;
                if (i36 >= sparseArray.size()) {
                    break;
                }
                stack.addAll((Collection) sparseArray.get(i36));
                i36++;
            }
            sparseArray.clear();
            int i37 = 0;
            while (i37 < arrayList5.size()) {
                try {
                    CharSequence charSequence7 = (CharSequence) arrayList5.get(i37);
                    stack = stack;
                    try {
                        CharSequence charSequenceEllipsize = TextUtils.ellipsize(AndroidUtilities.replaceNewLines(SpannableStringBuilder.valueOf(charSequence7)), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(charSequence7, 0, charSequence7.length())), size), TextUtils.TruncateAt.MIDDLE);
                        int i38 = size;
                        TextPaint textPaint6 = textPaint4;
                        try {
                            StaticLayout staticLayout6 = new StaticLayout(charSequenceEllipsize, textPaint6, i38, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            textPaint2 = textPaint6;
                            try {
                                this.B = this.P;
                                StaticLayout staticLayout7 = this.Q;
                                if (staticLayout7 != null) {
                                    try {
                                        if (staticLayout7.getLineCount() != 0) {
                                            int i39 = this.B;
                                            StaticLayout staticLayout8 = this.Q;
                                            this.B = staticLayout8.getLineBottom(staticLayout8.getLineCount() - 1) + AndroidUtilities.dp(5.0f) + i39;
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        photoSize2 = photoSize;
                                        i15 = i37;
                                        arrayList = arrayList5;
                                        i14 = i38;
                                        sparseArray2 = sparseArray;
                                        FileLog.e(e);
                                        i37 = i15 + 1;
                                        size = i14;
                                        sparseArray = sparseArray2;
                                        y70Var = y70Var;
                                        textPaint4 = textPaint2;
                                        arrayList5 = arrayList;
                                        photoSize = photoSize2;
                                    }
                                }
                                if (this.U.isSpoilersRevealed) {
                                    stack = stack;
                                    photoSize2 = photoSize;
                                    i15 = i37;
                                    arrayList = arrayList5;
                                    i14 = i38;
                                    sparseArray2 = sparseArray;
                                    staticLayout = staticLayout6;
                                    y70Var = y70Var;
                                } else {
                                    TLRPC.PhotoSize photoSize3 = photoSize;
                                    try {
                                        ArrayList arrayList7 = new ArrayList();
                                        if (charSequenceEllipsize instanceof Spannable) {
                                            i15 = i37;
                                            stack = stack;
                                            ArrayList arrayList8 = arrayList5;
                                            sparseArray2 = sparseArray;
                                            staticLayout = staticLayout6;
                                            y70Var = y70Var;
                                            arrayList = arrayList8;
                                            photoSize2 = photoSize3;
                                            i14 = i38;
                                            try {
                                                eh.k.a(this, staticLayout, -1, -1, (Spannable) charSequenceEllipsize, stack, arrayList7, null);
                                            } catch (Exception e19) {
                                                e = e19;
                                                FileLog.e(e);
                                            }
                                        } else {
                                            stack = stack;
                                            photoSize2 = photoSize3;
                                            i15 = i37;
                                            arrayList = arrayList5;
                                            i14 = i38;
                                            sparseArray2 = sparseArray;
                                            staticLayout = staticLayout6;
                                            y70Var = y70Var;
                                        }
                                        sparseArray2.put(i15, arrayList7);
                                    } catch (Exception e20) {
                                        e = e20;
                                        photoSize2 = photoSize3;
                                        i15 = i37;
                                        arrayList = arrayList5;
                                        i14 = i38;
                                        sparseArray2 = sparseArray;
                                        FileLog.e(e);
                                        i37 = i15 + 1;
                                        size = i14;
                                        sparseArray = sparseArray2;
                                        y70Var = y70Var;
                                        textPaint4 = textPaint2;
                                        arrayList5 = arrayList;
                                        photoSize = photoSize2;
                                    }
                                }
                                arrayList4.add(staticLayout);
                            } catch (Exception e21) {
                                e = e21;
                            }
                        } catch (Exception e22) {
                            e = e22;
                            stack = stack;
                            y70Var = y70Var;
                            photoSize2 = photoSize;
                            i15 = i37;
                            arrayList = arrayList5;
                            i14 = i38;
                            sparseArray2 = sparseArray;
                            textPaint2 = textPaint6;
                        }
                    } catch (Exception e23) {
                        e = e23;
                        stack = stack;
                        y70Var = y70Var;
                        photoSize2 = photoSize;
                        arrayList = arrayList5;
                        textPaint2 = textPaint4;
                        i14 = size;
                        sparseArray2 = sparseArray;
                        i15 = i37;
                        FileLog.e(e);
                        i37 = i15 + 1;
                        size = i14;
                        sparseArray = sparseArray2;
                        y70Var = y70Var;
                        textPaint4 = textPaint2;
                        arrayList5 = arrayList;
                        photoSize = photoSize2;
                    }
                } catch (Exception e24) {
                    e = e24;
                }
                i37 = i15 + 1;
                size = i14;
                sparseArray = sparseArray2;
                y70Var = y70Var;
                textPaint4 = textPaint2;
                arrayList5 = arrayList;
                photoSize = photoSize2;
            }
        }
        y70 y70Var2 = y70Var;
        TLRPC.PhotoSize photoSize4 = photoSize;
        int i40 = size;
        int iDp2 = AndroidUtilities.dp(52.0f);
        int iB = LocaleController.isRTL ? org.telegram.messenger.y1.B(10.0f, View.MeasureSpec.getSize(i10), iDp2) : AndroidUtilities.dp(10.0f);
        y70Var2.setBounds(iB, AndroidUtilities.dp(11.0f), iB + iDp2, AndroidUtilities.dp(63.0f));
        if (z10) {
            i13 = 1;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.U.photoThumbs, iDp2, true);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.U.photoThumbs, 80);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize2 = photoSize4;
            }
            if (closestPhotoSizeWithSize != null) {
                closestPhotoSizeWithSize.size = -1;
            }
            if (closestPhotoSizeWithSize2 != null) {
                closestPhotoSizeWithSize2.size = -1;
            }
            float fDp = AndroidUtilities.dp(11.0f);
            float f13 = iDp2;
            ImageReceiver imageReceiver = this.f24493r;
            imageReceiver.setImageCoords(iB, fDp, f13, f13);
            FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            Locale locale = Locale.US;
            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.U.photoThumbsObject), com.google.android.recaptcha.internal.a.l(iDp2, "_", iDp2), ImageLocation.getForObject(closestPhotoSizeWithSize2, this.U.photoThumbsObject), iDp2 + "_" + iDp2 + "_b", 0L, null, this.U, 0);
            this.f24494s = true;
        } else {
            i13 = 1;
        }
        if (i31 == i13) {
            f11 = 10.0f;
            StaticLayout staticLayoutT4 = s1.t2(i10.d(this.U, i13, 2, textPaint), textPaint, i40, i40, 0, i12);
            this.f24488f0 = staticLayoutT4;
            org.telegram.ui.Components.p5 p5Var = this.f24489g0;
            Layout[] layoutArr = new Layout[i13];
            lineBottom = 0;
            layoutArr[0] = staticLayoutT4;
            this.f24489g0 = org.telegram.ui.Components.t5.update(0, this, p5Var, layoutArr);
        } else {
            f11 = 10.0f;
            lineBottom = 0;
        }
        StaticLayout staticLayout9 = this.L;
        if (staticLayout9 == null || staticLayout9.getLineCount() == 0) {
            iC = 0;
        } else {
            StaticLayout staticLayout10 = this.L;
            iC = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i13) + AndroidUtilities.dp(4.0f);
        }
        StaticLayout staticLayout11 = this.T;
        if (staticLayout11 == null || staticLayout11.getLineCount() == 0) {
            f12 = 5.0f;
        } else {
            StaticLayout staticLayout12 = this.T;
            f12 = 5.0f;
            iC = org.telegram.messenger.y1.C(5.0f, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i13), iC);
        }
        StaticLayout staticLayout13 = this.N;
        if (staticLayout13 != null && staticLayout13.getLineCount() != 0) {
            StaticLayout staticLayout14 = this.N;
            iC = org.telegram.messenger.y1.C(f12, staticLayout14.getLineBottom(staticLayout14.getLineCount() - i13), iC);
        }
        StaticLayout staticLayout15 = this.Q;
        if (staticLayout15 != null && staticLayout15.getLineCount() != 0) {
            StaticLayout staticLayout16 = this.Q;
            iC = org.telegram.messenger.y1.C(f12, staticLayout16.getLineBottom(staticLayout16.getLineCount() - i13), iC);
            if (this.N != null) {
                iC += AndroidUtilities.dp(f11);
            }
        }
        for (int i41 = 0; i41 < arrayList4.size(); i41++) {
            StaticLayout staticLayout17 = (StaticLayout) arrayList4.get(i41);
            if (staticLayout17.getLineCount() > 0) {
                lineBottom = staticLayout17.getLineBottom(staticLayout17.getLineCount() - i13) + lineBottom;
            }
        }
        int iC3 = iC + lineBottom;
        if (this.f24488f0 != null) {
            this.f24486e0 = AndroidUtilities.dp(f12) + this.B + lineBottom;
            StaticLayout staticLayout18 = this.f24488f0;
            iC3 = org.telegram.messenger.y1.C(f12, staticLayout18.getLineBottom(staticLayout18.getLineCount() - i13), iC3);
        }
        this.f24495w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y1.b(17.0f, iC3, AndroidUtilities.dp(76.0f)) + (this.f24497y ? 1 : 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h7 h7Var;
        boolean z11;
        int i10;
        int i11;
        int i12;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.U != null) {
            ArrayList arrayList = this.C;
            if (arrayList.isEmpty() || (h7Var = this.f24496x) == null || !h7Var.d()) {
                e();
            } else if (motionEvent.getAction() == 0 || ((this.f24487f || this.I != null) && motionEvent.getAction() == 1)) {
                int x8 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z10 = false;
                        z11 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i13);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f10 = x8;
                        float f11 = iDp;
                        if (f10 >= staticLayout.getLineLeft(0) + f11 && f10 <= staticLayout.getLineWidth(0) + f11 && y10 >= (i12 = this.B + i14) && y10 <= i12 + lineBottom) {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() != 0) {
                                if (!this.f24487f) {
                                    if (this.I != null) {
                                        g(x8, y10, i14);
                                    } else {
                                        z10 = false;
                                    }
                                    z11 = true;
                                    break;
                                }
                                try {
                                    if (this.h == 0 && (messageMedia = this.U.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.f24496x.a(((CharSequence) this.A.get(this.h)).toString(), false);
                                    } else {
                                        this.f24496x.b(webPage, this.U);
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                e();
                            } else {
                                this.I = null;
                                SparseArray sparseArray = this.D;
                                if (sparseArray.get(i13, null) != null) {
                                    for (eh.k kVar : (List) sparseArray.get(i13)) {
                                        if (kVar.getBounds().contains(x8 - iDp, (y10 - this.B) - i14)) {
                                            e();
                                            this.I = kVar;
                                            this.J = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.I == null && (this.h != i13 || this.f24492n == null || !this.f24487f)) {
                                    e();
                                    this.h = i13;
                                    q80 q80Var = new q80(null, this.f24490h0, x8 - iDp, (y10 - this.B) - i14, 0);
                                    this.f24492n = q80Var;
                                    j80 j80VarB = q80Var.b();
                                    this.f24487f = true;
                                    this.f24485e.a(this.f24492n, null);
                                    if (!this.f24478a) {
                                        this.f24478a = true;
                                        if (this.d == null) {
                                            this.d = new m.i3(this, 7);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        j80VarB.e(staticLayout, 0, f11, this.B + i14);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), j80VarB);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            }
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        i14 += lineBottom;
                    }
                    i13++;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 && this.I != null) {
                        g(x8, y10, 0);
                        z10 = true;
                        z11 = true;
                        break;
                    }
                    break;
                }
                int iDp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                StaticLayout staticLayout2 = this.N;
                if (staticLayout2 != null && x8 >= iDp2 && x8 <= staticLayout2.getWidth() + iDp2 && y10 >= (i11 = this.M) && y10 <= this.N.getHeight() + i11) {
                    ArrayList arrayList2 = this.E;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList2.get(i15);
                        i15++;
                        eh.k kVar2 = (eh.k) obj;
                        if (kVar2.getBounds().contains(x8 - iDp2, y10 - this.M)) {
                            this.I = kVar2;
                            this.J = 1;
                            z10 = true;
                            z11 = true;
                            break;
                        }
                    }
                }
                StaticLayout staticLayout3 = this.Q;
                if (staticLayout3 != null && x8 >= iDp2 && x8 <= staticLayout3.getWidth() + iDp2 && y10 >= (i10 = this.P) && y10 <= this.Q.getHeight() + i10) {
                    ArrayList arrayList3 = this.F;
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj2 = arrayList3.get(i16);
                        i16++;
                        eh.k kVar3 = (eh.k) obj2;
                        if (kVar3.getBounds().contains(x8 - iDp2, y10 - this.P)) {
                            this.I = kVar3;
                            this.J = 2;
                            z10 = true;
                            z11 = true;
                            break;
                        }
                    }
                }
                if (!z11) {
                    e();
                }
            } else if (motionEvent.getAction() == 3) {
                e();
            }
            z10 = false;
        } else {
            e();
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void setDelegate(h7 h7Var) {
        this.f24496x = h7Var;
    }
}
