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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.iv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.j70;
public final class j7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
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
    public boolean f30494a;
    public int f30495a0;
    public androidx.emoji2.text.j f30496b;
    public StaticLayout f30497b0;
    public int f30498c;
    public gj f30499c0;
    public j6.o d;
    public final TextPaint f30500d0;
    public final n2.o0 f30501e;
    public final TextPaint f30502e0;
    public boolean f30503f;
    public final TextPaint f30504f0;
    public final TextPaint f30505g0;
    public int h;
    public int f30506h0;
    public StaticLayout f30507i0;
    public int f30508j0;
    public StaticLayout f30509k0;
    public org.telegram.ui.Components.l5 f30510l0;
    public final org.telegram.ui.ActionBar.e6 m0;
    public a80 f30511n;
    public final int f30512n0;
    public final ImageReceiver f30513r;
    public boolean f30514s;
    public final j70 f30515w;
    public final fp f30516x;
    public i7 f30517y;

    public j7(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f30494a = false;
        this.f30496b = null;
        this.f30498c = 0;
        this.d = null;
        this.f30501e = new n2.o0(this);
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
        this.f30495a0 = org.telegram.messenger.g0.L(30.0f);
        this.f30508j0 = org.telegram.messenger.g0.L(30.0f);
        this.m0 = e6Var;
        this.f30512n0 = i7;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f30500d0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f30502e0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30513r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        this.f30515w = new j70(0, e6Var);
        fp fpVar = new fp(21, context, e6Var);
        this.f30516x = fpVar;
        fpVar.setVisibility(4);
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(2);
        boolean z10 = hd.f24101a0;
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
        addView(fpVar, c8.ja.d(24, 24.0f, i11, f10, 44.0f, f11, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f30504f0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f30505g0 = textPaint4;
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
            a(iv.x(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + iv.x(richText));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                d(richText.texts.get(i7));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f30501e.f(true);
        this.h = -1;
        this.f30511n = null;
        this.f30503f = false;
        this.f30494a = false;
        androidx.emoji2.text.j jVar = this.f30496b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        j6.o oVar = this.d;
        if (oVar != null) {
            removeCallbacks(oVar);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        fp fpVar = this.f30516x;
        if (fpVar.getVisibility() != 0) {
            fpVar.setVisibility(0);
        }
        fpVar.a(z10, z11);
    }

    public final void g(int i7, int i10, int i11) {
        float f10;
        xh.f fVar;
        xh.f fVar2;
        if (hd.f24101a0) {
            f10 = 8.0f;
        } else {
            f10 = org.telegram.messenger.g0.C;
        }
        int L = org.telegram.messenger.g0.L(f10);
        e();
        this.N.f59995q = new h7(this, 0);
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
        return this.f30513r;
    }

    public gj getMessage() {
        return this.f30499c0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30514s) {
            this.f30513r.P();
        }
        this.f30510l0 = org.telegram.ui.Components.p5.update(0, this, this.f30510l0, this.f30509k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30514s) {
            this.f30513r.R();
        }
        org.telegram.ui.Components.p5.release(this, this.f30510l0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        j7 j7Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float L;
        float f15;
        int i7;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.e6 e6Var = this.m0;
        if (this.f30512n0 == 1) {
            this.f30504f0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A6, e6Var));
        }
        StaticLayout staticLayout = this.f30507i0;
        int i10 = this.P;
        float f16 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (hd.f24101a0) {
                f15 = 8.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f15);
            if (hd.f24101a0) {
                i7 = 0;
            } else {
                i7 = this.f30506h0;
            }
            canvas2.translate(L2 + i7, i10);
            this.f30507i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            if (hd.f24101a0) {
                f14 = 8.0f;
            } else {
                f14 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f14);
            if (hd.f24101a0) {
                StaticLayout staticLayout2 = this.f30507i0;
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
        if (this.f30497b0 != null) {
            this.f30505g0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            canvas2.save();
            if (hd.f24101a0) {
                f13 = 8.0f;
            } else {
                f13 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f13), this.f30495a0);
            this.f30497b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.S;
        TextPaint textPaint = this.f30502e0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            canvas2.save();
            if (hd.f24101a0) {
                f12 = 8.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f12), this.R);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            canvas2.save();
            if (hd.f24101a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f11), this.U);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            j7Var = this;
            canvas2.restore();
        } else {
            j7Var = this;
        }
        ArrayList arrayList = j7Var.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.J6, e6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i12);
                List<xh.f> list = (List) j7Var.I.get(i12);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (hd.f24101a0) {
                        f10 = 8.0f;
                    } else {
                        f10 = org.telegram.messenger.g0.C;
                    }
                    canvas2.translate(org.telegram.messenger.g0.L(f10), j7Var.G + i11);
                    Path path = j7Var.M;
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
            if (j7Var.f30501e.h(canvas2)) {
                j7Var.invalidate();
            }
        }
        if (j7Var.f30509k0 != null) {
            canvas2.save();
            if (!hd.f24101a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f16), j7Var.f30508j0);
            j7Var.f30509k0.draw(canvas2);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, j7Var.f30509k0, j7Var.f30510l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        j7Var.f30515w.draw(canvas2);
        if (j7Var.f30514s) {
            j7Var.f30513r.h(canvas2, null);
        }
        if (j7Var.E) {
            if (hd.f24101a0) {
                canvas2.drawLine(0.0f, j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
                return;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth(), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
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
        if (this.f30516x.f34663a.f32441q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(i7 i7Var) {
        this.f30517y = i7Var;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f30500d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.m0));
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
