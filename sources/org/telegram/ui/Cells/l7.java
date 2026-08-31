package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o80;
public final class l7 extends FrameLayout {
    public final ArrayList B;
    public int C;
    public final ArrayList D;
    public final SparseArray E;
    public final ArrayList F;
    public final ArrayList G;
    public final Stack H;
    public final Path I;
    public jh.k J;
    public int K;
    public final int L;
    public StaticLayout M;
    public int N;
    public StaticLayout O;
    public final AtomicReference P;
    public int Q;
    public StaticLayout R;
    public final AtomicReference S;
    public int T;
    public StaticLayout U;
    public MessageObject V;
    public final TextPaint W;
    public boolean f23112a;
    public final TextPaint f23113a0;
    public androidx.emoji2.text.j f23114b;
    public final TextPaint f23115b0;
    public int f23116c;
    public final TextPaint f23117c0;
    public m2.b d;
    public int f23118d0;
    public final d90 f23119e;
    public StaticLayout f23120e0;
    public boolean f23121f;
    public int f23122f0;
    public StaticLayout f23123g0;
    public int h;
    public org.telegram.ui.Components.q5 f23124h0;
    public final org.telegram.ui.ActionBar.g6 f23125i0;
    public final int f23126j0;
    public h90 f23127n;
    public final ImageReceiver f23128r;
    public boolean f23129s;
    public final o80 v;
    public final np f23130w;
    public k7 f23131x;
    public boolean f23132y;

    public l7(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i11;
        float f10;
        float f11;
        this.f23112a = false;
        this.f23114b = null;
        this.f23116c = 0;
        this.d = null;
        this.f23119e = new d90(this);
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.E = new SparseArray();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new Stack();
        this.I = new Path();
        this.K = -1;
        this.L = AndroidUtilities.dp(10.0f);
        this.N = AndroidUtilities.dp(30.0f);
        this.P = new AtomicReference();
        this.Q = AndroidUtilities.dp(30.0f);
        this.S = new AtomicReference();
        this.T = AndroidUtilities.dp(30.0f);
        this.f23122f0 = AndroidUtilities.dp(30.0f);
        this.f23125i0 = g6Var;
        this.f23126j0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.W = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f23113a0 = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f23128r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new o80(0, g6Var);
        np npVar = new np(context, 21, g6Var);
        this.f23130w = npVar;
        npVar.setVisibility(4);
        npVar.b(-1, org.telegram.ui.ActionBar.k6.f21659d6, org.telegram.ui.ActionBar.k6.f21786k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(2);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i12 = i11 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        if (z4) {
            f11 = 44.0f;
        } else {
            f11 = 0.0f;
        }
        addView(npVar, k7.c6.d(24, 24.0f, i12, f10, 44.0f, f11, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f23115b0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f23117c0 = textPaint4;
        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (!AndroidUtilities.charSequenceContains(trim, "://") && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
                    trim = "http://".concat(trim);
                }
                this.B.add(SpannableString.valueOf(trim));
            }
        }
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
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                c(((TL_iv.pageBlockCover) pageBlock).cover);
                return;
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                b(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
                return;
            } else {
                return;
            }
        }
        d(pageBlock.text);
    }

    public final void d(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textUrl) {
            a(richText.url);
        } else if (richText instanceof TL_iv.textAutoUrl) {
            a(RichMessageLayout.getString(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + RichMessageLayout.getString(richText));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                d(richText.texts.get(i10));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f23119e.d(true);
        this.h = -1;
        this.f23127n = null;
        this.f23121f = false;
        this.f23112a = false;
        androidx.emoji2.text.j jVar = this.f23114b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m2.b bVar = this.d;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        invalidate();
    }

    public final void f(boolean z4, boolean z10) {
        np npVar = this.f23130w;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z4, z10);
    }

    public final void g(int i10, int i11, int i12) {
        float f10;
        jh.k kVar;
        jh.k kVar2;
        if (LocaleController.isRTL) {
            f10 = 8.0f;
        } else {
            f10 = AndroidUtilities.leftBaseline;
        }
        int dp = AndroidUtilities.dp(f10);
        e();
        this.J.f10147q = new j7(this, 0);
        int i13 = i10 - dp;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i14 = this.K;
        SparseArray sparseArray = this.E;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.G;
        ArrayList arrayList3 = this.D;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList2.get(i15);
                        i15++;
                        ((jh.k) obj).j(i13, i11 - this.Q, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((jh.k) obj2).j(i13, i11 - this.N, sqrt, false);
                }
            }
        } else {
            float f11 = 0.0f;
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                Layout layout = (Layout) arrayList3.get(i17);
                f11 += layout.getLineBottom(layout.getLineCount() - 1);
                for (jh.k kVar3 : (List) sparseArray.get(i17)) {
                    kVar3.j(i13, ((i11 - this.C) - i12) + f11, sqrt, false);
                }
            }
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            if (i18 != this.K) {
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            int size3 = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size3) {
                                Object obj3 = arrayList2.get(i19);
                                i19++;
                                ((jh.k) obj3).j(kVar2.getBounds().centerX(), kVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            Object obj4 = arrayList.get(i20);
                            i20++;
                            ((jh.k) obj4).j(kVar.getBounds().centerX(), kVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        Layout layout2 = (Layout) arrayList3.get(i21);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (jh.k kVar4 : (List) sparseArray.get(i21)) {
                            kVar4.j(kVar4.getBounds().centerX(), kVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.K = -1;
        this.J = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f23128r;
    }

    public MessageObject getMessage() {
        return this.V;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23129s) {
            this.f23128r.onAttachedToWindow();
        }
        this.f23124h0 = org.telegram.ui.Components.u5.update(0, this, this.f23124h0, this.f23123g0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f23129s) {
            this.f23128r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.u5.release(this, this.f23124h0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        l7 l7Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float dp;
        float f15;
        int i10;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.g6 g6Var = this.f23125i0;
        if (this.f23126j0 == 1) {
            this.f23115b0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
        }
        StaticLayout staticLayout = this.f23120e0;
        int i11 = this.L;
        float f16 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (LocaleController.isRTL) {
                f15 = 8.0f;
            } else {
                f15 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f15);
            if (LocaleController.isRTL) {
                i10 = 0;
            } else {
                i10 = this.f23118d0;
            }
            canvas2.translate(dp2 + i10, i11);
            this.f23120e0.draw(canvas2);
            canvas2.restore();
        }
        if (this.M != null) {
            canvas2.save();
            if (LocaleController.isRTL) {
                f14 = 8.0f;
            } else {
                f14 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.f23120e0;
                if (staticLayout2 == null) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(4.0f) + staticLayout2.getWidth();
                }
                dp3 += dp;
            }
            canvas2.translate(dp3, i11);
            this.M.draw(canvas2);
            canvas2.restore();
        }
        if (this.U != null) {
            this.f23117c0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f13 = 8.0f;
            } else {
                f13 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f13), this.T);
            this.U.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.O;
        TextPaint textPaint = this.f23113a0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f12 = 8.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f12), this.N);
            jh.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.P, 0, this.O, this.F, canvas2, false);
            canvas2.restore();
        }
        if (this.R != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f11), this.Q);
            jh.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.S, 0, this.R, this.G, canvas2, false);
            l7Var = this;
            canvas2.restore();
        } else {
            l7Var = this;
        }
        ArrayList arrayList = l7Var.D;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, g6Var));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i13);
                List<jh.k> list = (List) l7Var.E.get(i13);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (LocaleController.isRTL) {
                        f10 = 8.0f;
                    } else {
                        f10 = AndroidUtilities.leftBaseline;
                    }
                    canvas2.translate(AndroidUtilities.dp(f10), l7Var.C + i12);
                    Path path = l7Var.I;
                    path.rewind();
                    if (list != null) {
                        for (jh.k kVar : list) {
                            Rect bounds = kVar.getBounds();
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
                        ((jh.k) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (jh.k kVar2 : list) {
                            kVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i12 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (l7Var.f23119e.f(canvas2)) {
                l7Var.invalidate();
            }
        }
        if (l7Var.f23123g0 != null) {
            canvas2.save();
            if (!LocaleController.isRTL) {
                f16 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f16), l7Var.f23122f0);
            l7Var.f23123g0.draw(canvas2);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, l7Var.f23123g0, l7Var.f23124h0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        l7Var.v.draw(canvas2);
        if (l7Var.f23129s) {
            l7Var.f23128r.draw(canvas2);
        }
        if (l7Var.f23132y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, l7Var.getMeasuredHeight() - 1, l7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), l7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
                return;
            }
            canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), l7Var.getMeasuredHeight() - 1, l7Var.getMeasuredWidth(), l7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.O != null) {
            sb.append(", ");
            sb.append(this.O.getText());
        }
        if (this.R != null) {
            sb.append(", ");
            sb.append(this.R.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        if (this.f23130w.f29606a.f24809q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(k7 k7Var) {
        this.f23131x = k7Var;
    }
}
