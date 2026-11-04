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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.cv;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.wo;
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
    public yh.f N;
    public int O;
    public final int P;
    public StaticLayout Q;
    public int R;
    public StaticLayout S;
    public final AtomicReference T;
    public int U;
    public StaticLayout V;
    public final AtomicReference W;
    public boolean f29433a;
    public int f29434a0;
    public androidx.emoji2.text.j f29435b;
    public StaticLayout f29436b0;
    public int f29437c;
    public zi f29438c0;
    public mi.b0 d;
    public final TextPaint f29439d0;
    public final m2.p0 f29440e;
    public final TextPaint f29441e0;
    public boolean f29442f;
    public final TextPaint f29443f0;
    public final TextPaint f29444g0;
    public int h;
    public int f29445h0;
    public StaticLayout f29446i0;
    public int f29447j0;
    public StaticLayout f29448k0;
    public org.telegram.ui.Components.l5 f29449l0;
    public final org.telegram.ui.ActionBar.e6 m0;
    public t70 f29450n;
    public final int f29451n0;
    public final ImageReceiver f29452r;
    public boolean f29453s;
    public final c70 f29454w;
    public final wo f29455x;
    public i7 f29456y;

    public j7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f29433a = false;
        this.f29435b = null;
        this.f29437c = 0;
        this.d = null;
        this.f29440e = new m2.p0(this);
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
        this.f29434a0 = org.telegram.messenger.g0.L(30.0f);
        this.f29447j0 = org.telegram.messenger.g0.L(30.0f);
        this.m0 = e6Var;
        this.f29451n0 = i3;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f29439d0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f29441e0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29452r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        this.f29454w = new c70(0, e6Var);
        wo woVar = new wo(21, context, e6Var);
        this.f29455x = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        boolean z10 = bd.f21784a0;
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
        addView(woVar, mf.d(24, 24.0f, i11, f10, 44.0f, f11, 0.0f));
        if (i3 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f29443f0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f29444g0 = textPaint4;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
            a(cv.x(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + cv.x(richText));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i3 = 0; i3 < richText.texts.size(); i3++) {
                d(richText.texts.get(i3));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f29440e.f(true);
        this.h = -1;
        this.f29450n = null;
        this.f29442f = false;
        this.f29433a = false;
        androidx.emoji2.text.j jVar = this.f29435b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        mi.b0 b0Var = this.d;
        if (b0Var != null) {
            removeCallbacks(b0Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        wo woVar = this.f29455x;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
    }

    public final void g(int i3, int i10, int i11) {
        float f10;
        yh.f fVar;
        yh.f fVar2;
        if (bd.f21784a0) {
            f10 = 8.0f;
        } else {
            f10 = org.telegram.messenger.g0.C;
        }
        int L = org.telegram.messenger.g0.L(f10);
        e();
        this.N.f59521q = new h7(this, 0);
        int i12 = i3 - L;
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
                        ((yh.f) obj).j(i12, i10 - this.U, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((yh.f) obj2).j(i12, i10 - this.R, sqrt, false);
                }
            }
        } else {
            float f11 = 0.0f;
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                Layout layout = (Layout) arrayList3.get(i16);
                f11 += layout.getLineBottom(layout.getLineCount() - 1);
                for (yh.f fVar3 : (List) sparseArray.get(i16)) {
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
                                ((yh.f) obj3).j(fVar2.getBounds().centerX(), fVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i19 = 0;
                        while (i19 < size4) {
                            Object obj4 = arrayList.get(i19);
                            i19++;
                            ((yh.f) obj4).j(fVar.getBounds().centerX(), fVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        Layout layout2 = (Layout) arrayList3.get(i20);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (yh.f fVar4 : (List) sparseArray.get(i20)) {
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
        return this.f29452r;
    }

    public zi getMessage() {
        return this.f29438c0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29453s) {
            this.f29452r.P();
        }
        this.f29449l0 = org.telegram.ui.Components.p5.update(0, this, this.f29449l0, this.f29448k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29453s) {
            this.f29452r.R();
        }
        org.telegram.ui.Components.p5.release(this, this.f29449l0);
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
        int i3;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.e6 e6Var = this.m0;
        if (this.f29451n0 == 1) {
            this.f29443f0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, e6Var));
        }
        StaticLayout staticLayout = this.f29446i0;
        int i10 = this.P;
        float f16 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (bd.f21784a0) {
                f15 = 8.0f;
            } else {
                f15 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f15);
            if (bd.f21784a0) {
                i3 = 0;
            } else {
                i3 = this.f29445h0;
            }
            canvas2.translate(L2 + i3, i10);
            this.f29446i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            if (bd.f21784a0) {
                f14 = 8.0f;
            } else {
                f14 = org.telegram.messenger.g0.C;
            }
            float L3 = org.telegram.messenger.g0.L(f14);
            if (bd.f21784a0) {
                StaticLayout staticLayout2 = this.f29446i0;
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
        if (this.f29436b0 != null) {
            this.f29444g0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas2.save();
            if (bd.f21784a0) {
                f13 = 8.0f;
            } else {
                f13 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f13), this.f29434a0);
            this.f29436b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.S;
        TextPaint textPaint = this.f29441e0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas2.save();
            if (bd.f21784a0) {
                f12 = 8.0f;
            } else {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f12), this.R);
            yh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas2.save();
            if (bd.f21784a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f11), this.U);
            yh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            j7Var = this;
            canvas2.restore();
        } else {
            j7Var = this;
        }
        ArrayList arrayList = j7Var.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, e6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i12);
                List<yh.f> list = (List) j7Var.I.get(i12);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (bd.f21784a0) {
                        f10 = 8.0f;
                    } else {
                        f10 = org.telegram.messenger.g0.C;
                    }
                    canvas2.translate(org.telegram.messenger.g0.L(f10), j7Var.G + i11);
                    Path path = j7Var.M;
                    path.rewind();
                    if (list != null) {
                        for (yh.f fVar : list) {
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
                        ((yh.f) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (yh.f fVar2 : list) {
                            fVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i11 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (j7Var.f29440e.h(canvas2)) {
                j7Var.invalidate();
            }
        }
        if (j7Var.f29448k0 != null) {
            canvas2.save();
            if (!bd.f21784a0) {
                f16 = org.telegram.messenger.g0.C;
            }
            canvas2.translate(org.telegram.messenger.g0.L(f16), j7Var.f29447j0);
            j7Var.f29448k0.draw(canvas2);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, j7Var.f29448k0, j7Var.f29449l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        j7Var.f29454w.draw(canvas2);
        if (j7Var.f29453s) {
            j7Var.f29452r.h(canvas2, null);
        }
        if (j7Var.E) {
            if (bd.f21784a0) {
                canvas2.drawLine(0.0f, j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth(), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
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
        if (this.f29455x.f40035a.f31334q) {
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
        this.f29456y = i7Var;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f29439d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.m0));
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
