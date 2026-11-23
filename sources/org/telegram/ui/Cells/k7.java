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
import org.telegram.messenger.ev;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.t70;
public final class k7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public final ArrayList F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final ArrayList J;
    public final ArrayList K;
    public final Stack L;
    public final Path M;
    public xh.f N;
    public int O;
    public final int P;
    public StaticLayout Q;
    public int R;
    public StaticLayout S;
    public final AtomicReference T;
    public int U;
    public StaticLayout V;
    public final AtomicReference W;
    public boolean f31017a;
    public int f31018a0;
    public androidx.emoji2.text.j f31019b;
    public StaticLayout f31020b0;
    public int f31021c;
    public fj f31022c0;
    public i6.g d;
    public final TextPaint f31023d0;
    public final n2.p0 f31024e;
    public final TextPaint f31025e0;
    public boolean f31026f;
    public final TextPaint f31027f0;
    public final TextPaint f31028g0;
    public int h;
    public int f31029h0;
    public StaticLayout f31030i0;
    public int f31031j0;
    public StaticLayout f31032k0;
    public org.telegram.ui.Components.t5 f31033l0;
    public final org.telegram.ui.ActionBar.i6 m0;
    public k80 f31034n;
    public final int f31035n0;
    public final ImageReceiver f31036r;
    public boolean f31037s;
    public final t70 f31038w;
    public final lp f31039x;
    public j7 f31040y;

    public k7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f31017a = false;
        this.f31019b = null;
        this.f31021c = 0;
        this.d = null;
        this.f31024e = new n2.p0(this);
        this.F = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new Stack();
        this.M = new Path();
        this.O = -1;
        this.P = org.telegram.messenger.g0.L(10.0f);
        this.R = org.telegram.messenger.g0.L(30.0f);
        this.T = new AtomicReference();
        this.U = org.telegram.messenger.g0.L(30.0f);
        this.W = new AtomicReference();
        this.f31018a0 = org.telegram.messenger.g0.L(30.0f);
        this.f31031j0 = org.telegram.messenger.g0.L(30.0f);
        this.m0 = i6Var;
        this.f31035n0 = i7;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f31023d0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f31025e0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f31036r = imageReceiver;
        imageReceiver.K0(org.telegram.messenger.g0.L(8.0f));
        this.f31038w = new t70(0, i6Var);
        lp lpVar = new lp(21, context, i6Var);
        this.f31039x = lpVar;
        lpVar.setVisibility(4);
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(2);
        boolean z10 = gd.f24314a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i11 = i10 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        if (z10) {
            f11 = 44.0f;
        } else {
            f11 = 0.0f;
        }
        addView(lpVar, c8.na.d(24, 24.0f, i11, f10, 44.0f, f11, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f31027f0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f31028g0 = textPaint4;
        textPaint4.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (org.telegram.messenger.g0.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
                    trim = "http://".concat(trim);
                }
                this.F.add(SpannableString.valueOf(trim));
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
            a(ev.x(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + ev.x(richText));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                d(richText.texts.get(i7));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f31024e.f(true);
        this.h = -1;
        this.f31034n = null;
        this.f31026f = false;
        this.f31017a = false;
        androidx.emoji2.text.j jVar = this.f31019b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        i6.g gVar = this.d;
        if (gVar != null) {
            removeCallbacks(gVar);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        lp lpVar = this.f31039x;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z10, z11);
    }

    public final void g(int i7, int i10, int i11) {
        float f10;
        xh.f fVar;
        xh.f fVar2;
        if (gd.f24314a0) {
            f10 = 8.0f;
        } else {
            f10 = org.telegram.messenger.g0.C;
        }
        int L = org.telegram.messenger.g0.L(f10);
        e();
        this.N.f60689q = new i7(this, 0);
        int i12 = i7 - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i13 = this.O;
        SparseArray sparseArray = this.I;
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.H;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList2.get(i14);
                        i14++;
                        ((xh.f) obj).j(i12, i10 - this.U, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((xh.f) obj2).j(i12, i10 - this.R, sqrt, false);
                }
            }
        } else {
            float f11 = 0.0f;
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                Layout layout = (Layout) arrayList3.get(i16);
                f11 += layout.getLineBottom(layout.getLineCount() - 1);
                for (xh.f fVar3 : (List) sparseArray.get(i16)) {
                    fVar3.j(i12, ((i10 - this.G) - i11) + f11, sqrt, false);
                }
            }
        }
        for (int i17 = 0; i17 <= 2; i17++) {
            if (i17 != this.O) {
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
        this.O = -1;
        this.N = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f31036r;
    }

    public fj getMessage() {
        return this.f31022c0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31037s) {
            this.f31036r.Q();
        }
        this.f31033l0 = org.telegram.ui.Components.x5.update(0, this, this.f31033l0, this.f31032k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f31037s) {
            this.f31036r.S();
        }
        org.telegram.ui.Components.x5.release(this, this.f31033l0);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.m0;
        if (this.f31035n0 == 1) {
            this.f31027f0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A6, i6Var));
        }
        StaticLayout staticLayout = this.f31030i0;
        int i10 = this.P;
        float f16 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (gd.f24314a0) {
                f15 = 8.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f15);
            if (gd.f24314a0) {
                i7 = 0;
            } else {
                i7 = this.f31029h0;
            }
            canvas2.translate(L2 + i7, i10);
            this.f31030i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            if (gd.f24314a0) {
                f14 = 8.0f;
            } else {
                f14 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f14);
            if (gd.f24314a0) {
                StaticLayout staticLayout2 = this.f31030i0;
                if (staticLayout2 == null) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(4.0f) + staticLayout2.getWidth();
                }
                L3 += L;
            }
            canvas2.translate(L3, i10);
            this.Q.draw(canvas2);
            canvas2.restore();
        }
        if (this.f31020b0 != null) {
            this.f31028g0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas2.save();
            if (gd.f24314a0) {
                f13 = 8.0f;
            } else {
                f13 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f13), this.f31018a0);
            this.f31020b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.S;
        TextPaint textPaint = this.f31025e0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas2.save();
            if (gd.f24314a0) {
                f12 = 8.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f12), this.R);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas2.save();
            if (gd.f24314a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f11), this.U);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            k7Var = this;
            canvas2.restore();
        } else {
            k7Var = this;
        }
        ArrayList arrayList = k7Var.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J6, i6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i12);
                List<xh.f> list = (List) k7Var.I.get(i12);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (gd.f24314a0) {
                        f10 = 8.0f;
                    } else {
                        f10 = org.telegram.messenger.g0.C;
                    }
                    canvas2.translate(org.telegram.messenger.g0.L(f10), k7Var.G + i11);
                    Path path = k7Var.M;
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
            if (k7Var.f31024e.h(canvas2)) {
                k7Var.invalidate();
            }
        }
        if (k7Var.f31032k0 != null) {
            canvas2.save();
            if (!gd.f24314a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f16), k7Var.f31031j0);
            k7Var.f31032k0.draw(canvas2);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, k7Var.f31032k0, k7Var.f31033l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        k7Var.f31038w.draw(canvas2);
        if (k7Var.f31037s) {
            k7Var.f31036r.h(canvas2, null);
        }
        if (k7Var.E) {
            if (gd.f24314a0) {
                canvas2.drawLine(0.0f, k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
                return;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth(), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.S != null) {
            sb2.append(", ");
            sb2.append(this.S.getText());
        }
        if (this.V != null) {
            sb2.append(", ");
            sb2.append(this.V.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        if (this.f31039x.f37189a.f32938q) {
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
        this.f31040y = j7Var;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f31023d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.m0));
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
