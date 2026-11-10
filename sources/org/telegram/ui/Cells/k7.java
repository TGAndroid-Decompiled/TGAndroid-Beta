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
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.kv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x70;
public final class k7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public xh.f M;
    public int N;
    public final int O;
    public StaticLayout P;
    public int Q;
    public StaticLayout R;
    public final AtomicReference S;
    public int T;
    public StaticLayout U;
    public final AtomicReference V;
    public int W;
    public boolean f29447a;
    public StaticLayout f29448a0;
    public androidx.emoji2.text.j f29449b;
    public ij f29450b0;
    public int f29451c;
    public final TextPaint f29452c0;
    public m.f3 d;
    public final TextPaint f29453d0;
    public final n2.n0 f29454e;
    public final TextPaint f29455e0;
    public boolean f29456f;
    public final TextPaint f29457f0;
    public int f29458g0;
    public int h;
    public StaticLayout f29459h0;
    public int f29460i0;
    public StaticLayout f29461j0;
    public org.telegram.ui.Components.m5 f29462k0;
    public final org.telegram.ui.ActionBar.h6 f29463l0;
    public final int m0;
    public x70 f29464n;
    public final ImageReceiver f29465r;
    public boolean f29466s;
    public final g70 f29467w;
    public final wo f29468x;
    public j7 f29469y;

    public k7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f29447a = false;
        this.f29449b = null;
        this.f29451c = 0;
        this.d = null;
        this.f29454e = new n2.n0(this);
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.H = new SparseArray();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new Stack();
        this.L = new Path();
        this.N = -1;
        this.O = org.telegram.messenger.g0.L(10.0f);
        this.Q = org.telegram.messenger.g0.L(30.0f);
        this.S = new AtomicReference();
        this.T = org.telegram.messenger.g0.L(30.0f);
        this.V = new AtomicReference();
        this.W = org.telegram.messenger.g0.L(30.0f);
        this.f29460i0 = org.telegram.messenger.g0.L(30.0f);
        this.f29463l0 = h6Var;
        this.m0 = i7;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f29452c0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f29453d0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29465r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        this.f29467w = new g70(0, h6Var);
        wo woVar = new wo(21, context, h6Var);
        this.f29468x = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        boolean z9 = id.f23161a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i11 = i10 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        if (z9) {
            f11 = 44.0f;
        } else {
            f11 = 0.0f;
        }
        addView(woVar, c8.ha.d(24, 24.0f, i11, f10, 44.0f, f11, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f29455e0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f29457f0 = textPaint4;
        textPaint4.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (org.telegram.messenger.g0.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
                    trim = "http://".concat(trim);
                }
                this.E.add(SpannableString.valueOf(trim));
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
            a(kv.x(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + kv.x(richText));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                d(richText.texts.get(i7));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f29454e.f(true);
        this.h = -1;
        this.f29464n = null;
        this.f29456f = false;
        this.f29447a = false;
        androidx.emoji2.text.j jVar = this.f29449b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m.f3 f3Var = this.d;
        if (f3Var != null) {
            removeCallbacks(f3Var);
        }
        invalidate();
    }

    public final void f(boolean z9, boolean z10) {
        wo woVar = this.f29468x;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
    }

    public final void g(int i7, int i10, int i11) {
        float f10;
        xh.f fVar;
        xh.f fVar2;
        if (id.f23161a0) {
            f10 = 8.0f;
        } else {
            f10 = org.telegram.messenger.g0.C;
        }
        int L = org.telegram.messenger.g0.L(f10);
        e();
        this.M.f58811q = new i7(this, 0);
        int i12 = i7 - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i13 = this.N;
        SparseArray sparseArray = this.H;
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.J;
        ArrayList arrayList3 = this.G;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList2.get(i14);
                        i14++;
                        ((xh.f) obj).j(i12, i10 - this.T, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((xh.f) obj2).j(i12, i10 - this.Q, sqrt, false);
                }
            }
        } else {
            float f11 = 0.0f;
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                Layout layout = (Layout) arrayList3.get(i16);
                f11 += layout.getLineBottom(layout.getLineCount() - 1);
                for (xh.f fVar3 : (List) sparseArray.get(i16)) {
                    fVar3.j(i12, ((i10 - this.F) - i11) + f11, sqrt, false);
                }
            }
        }
        for (int i17 = 0; i17 <= 2; i17++) {
            if (i17 != this.N) {
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            int size3 = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size3) {
                                Object obj3 = arrayList2.get(i18);
                                i18++;
                                ((xh.f) obj3).j(fVar2.getBounds().centerX(), fVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i19 = 0;
                        while (i19 < size4) {
                            Object obj4 = arrayList.get(i19);
                            i19++;
                            ((xh.f) obj4).j(fVar.getBounds().centerX(), fVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        Layout layout2 = (Layout) arrayList3.get(i20);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (xh.f fVar4 : (List) sparseArray.get(i20)) {
                            fVar4.j(fVar4.getBounds().centerX(), fVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.N = -1;
        this.M = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f29465r;
    }

    public ij getMessage() {
        return this.f29450b0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29466s) {
            this.f29465r.P();
        }
        this.f29462k0 = org.telegram.ui.Components.q5.update(0, this, this.f29462k0, this.f29461j0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29466s) {
            this.f29465r.R();
        }
        org.telegram.ui.Components.q5.release(this, this.f29462k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k7 k7Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float L;
        float f15;
        int i7;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.h6 h6Var = this.f29463l0;
        if (this.m0 == 1) {
            this.f29455e0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A6, h6Var));
        }
        StaticLayout staticLayout = this.f29459h0;
        int i10 = this.O;
        float f16 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (id.f23161a0) {
                f15 = 8.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f15);
            if (id.f23161a0) {
                i7 = 0;
            } else {
                i7 = this.f29458g0;
            }
            canvas2.translate(L2 + i7, i10);
            this.f29459h0.draw(canvas2);
            canvas2.restore();
        }
        if (this.P != null) {
            canvas2.save();
            if (id.f23161a0) {
                f14 = 8.0f;
            } else {
                f14 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f14);
            if (id.f23161a0) {
                StaticLayout staticLayout2 = this.f29459h0;
                if (staticLayout2 == null) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(4.0f) + staticLayout2.getWidth();
                }
                L3 += L;
            }
            canvas2.translate(L3, i10);
            this.P.draw(canvas2);
            canvas2.restore();
        }
        if (this.f29448a0 != null) {
            this.f29457f0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
            canvas2.save();
            if (id.f23161a0) {
                f13 = 8.0f;
            } else {
                f13 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f13), this.W);
            this.f29448a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.R;
        TextPaint textPaint = this.f29453d0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
            canvas2.save();
            if (id.f23161a0) {
                f12 = 8.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f12), this.Q);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
            canvas2.save();
            if (id.f23161a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f11), this.T);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            k7Var = this;
            canvas2.restore();
        } else {
            k7Var = this;
        }
        ArrayList arrayList = k7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.J6, h6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i12);
                List<xh.f> list = (List) k7Var.H.get(i12);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (id.f23161a0) {
                        f10 = 8.0f;
                    } else {
                        f10 = org.telegram.messenger.g0.C;
                    }
                    canvas2.translate(org.telegram.messenger.g0.L(f10), k7Var.F + i11);
                    Path path = k7Var.L;
                    path.rewind();
                    if (list != null) {
                        for (xh.f fVar : list) {
                            Rect bounds = fVar.getBounds();
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
                        ((xh.f) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (xh.f fVar2 : list) {
                            fVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i11 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (k7Var.f29454e.h(canvas2)) {
                k7Var.invalidate();
            }
        }
        if (k7Var.f29461j0 != null) {
            canvas2.save();
            if (!id.f23161a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f16), k7Var.f29460i0);
            k7Var.f29461j0.draw(canvas2);
            org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, k7Var.f29461j0, k7Var.f29462k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        k7Var.f29467w.draw(canvas2);
        if (k7Var.f29466s) {
            k7Var.f29465r.h(canvas2, null);
        }
        if (k7Var.D) {
            if (id.f23161a0) {
                canvas2.drawLine(0.0f, k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
                return;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth(), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.P;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.R != null) {
            sb2.append(", ");
            sb2.append(this.R.getText());
        }
        if (this.U != null) {
            sb2.append(", ");
            sb2.append(this.U.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        if (this.f29468x.f40026a.f31279q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(j7 j7Var) {
        this.f29469y = j7Var;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f29452c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f29463l0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
