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
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.vv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.z70;
public final class o7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public nh.i M;
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
    public boolean f22385a;
    public StaticLayout f22386a0;
    public androidx.emoji2.text.j f22387b;
    public jj f22388b0;
    public int f22389c;
    public final TextPaint f22390c0;
    public mg.c2 d;
    public final TextPaint f22391d0;
    public final ji.a e;
    public final TextPaint f22392e0;
    public boolean f22393f;
    public final TextPaint f22394f0;
    public int f22395g0;
    public int h;
    public StaticLayout f22396h0;
    public int f22397i0;
    public StaticLayout f22398j0;
    public org.telegram.ui.Components.k5 f22399k0;
    public final org.telegram.ui.ActionBar.p6 f22400l0;
    public final int m0;
    public q80 f22401n;
    public final ImageReceiver f22402r;
    public boolean f22403s;
    public final z70 f22404w;
    public final ep f22405x;
    public n7 f22406y;

    public o7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        this.f22385a = false;
        this.f22387b = null;
        this.f22389c = 0;
        this.d = null;
        this.e = new ji.a(this);
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.H = new SparseArray();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new Stack();
        this.L = new Path();
        this.N = -1;
        this.O = org.telegram.messenger.i0.L(10.0f);
        this.Q = org.telegram.messenger.i0.L(30.0f);
        this.S = new AtomicReference();
        this.T = org.telegram.messenger.i0.L(30.0f);
        this.V = new AtomicReference();
        this.W = org.telegram.messenger.i0.L(30.0f);
        this.f22397i0 = org.telegram.messenger.i0.L(30.0f);
        this.f22400l0 = p6Var;
        this.m0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f22390c0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f22391d0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f22402r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(8.0f));
        this.f22404w = new z70(0, p6Var);
        ep epVar = new ep(21, context, p6Var);
        this.f22405x = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(2);
        boolean z10 = cd.X;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i12 = i11 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        if (z10) {
            f10 = 44.0f;
        } else {
            f10 = 0.0f;
        }
        addView(epVar, w7.b6.d(24, 24.0f, i12, f7, 44.0f, f10, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f22392e0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.i0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f22394f0 = textPaint4;
        textPaint4.setTextSize(org.telegram.messenger.i0.L(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (org.telegram.messenger.i0.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
                    trim = "http://".concat(trim);
                }
                this.E.add(SpannableString.valueOf(trim));
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
            a(vv.x(richText));
        } else if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
        } else if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + vv.x(richText));
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                d(richText.texts.get(i10));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.e.f(true);
        this.h = -1;
        this.f22401n = null;
        this.f22393f = false;
        this.f22385a = false;
        androidx.emoji2.text.j jVar = this.f22387b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        mg.c2 c2Var = this.d;
        if (c2Var != null) {
            removeCallbacks(c2Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        ep epVar = this.f22405x;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        float f7;
        nh.i iVar;
        nh.i iVar2;
        if (cd.X) {
            f7 = 8.0f;
        } else {
            f7 = org.telegram.messenger.i0.C;
        }
        int L = org.telegram.messenger.i0.L(f7);
        e();
        this.M.f13852q = new m7(this, 0);
        int i13 = i10 - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i14 = this.N;
        SparseArray sparseArray = this.H;
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.J;
        ArrayList arrayList3 = this.G;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList2.get(i15);
                        i15++;
                        ((nh.i) obj).j(i13, i11 - this.T, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((nh.i) obj2).j(i13, i11 - this.Q, sqrt, false);
                }
            }
        } else {
            float f10 = 0.0f;
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                Layout layout = (Layout) arrayList3.get(i17);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                for (nh.i iVar3 : (List) sparseArray.get(i17)) {
                    iVar3.j(i13, ((i11 - this.F) - i12) + f10, sqrt, false);
                }
            }
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            if (i18 != this.N) {
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            int size3 = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size3) {
                                Object obj3 = arrayList2.get(i19);
                                i19++;
                                ((nh.i) obj3).j(iVar2.getBounds().centerX(), iVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            Object obj4 = arrayList.get(i20);
                            i20++;
                            ((nh.i) obj4).j(iVar.getBounds().centerX(), iVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        Layout layout2 = (Layout) arrayList3.get(i21);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (nh.i iVar4 : (List) sparseArray.get(i21)) {
                            iVar4.j(iVar4.getBounds().centerX(), iVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.N = -1;
        this.M = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f22402r;
    }

    public jj getMessage() {
        return this.f22388b0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22403s) {
            this.f22402r.P();
        }
        this.f22399k0 = org.telegram.ui.Components.o5.update(0, this, this.f22399k0, this.f22398j0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22403s) {
            this.f22402r.R();
        }
        org.telegram.ui.Components.o5.release(this, this.f22399k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o7 o7Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float L;
        float f14;
        int i10;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.p6 p6Var = this.f22400l0;
        if (this.m0 == 1) {
            this.f22392e0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A6, p6Var));
        }
        StaticLayout staticLayout = this.f22396h0;
        int i11 = this.O;
        float f15 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (cd.X) {
                f14 = 8.0f;
            } else {
                f14 = org.telegram.messenger.i0.C;
            }
            int L2 = org.telegram.messenger.i0.L(f14);
            if (cd.X) {
                i10 = 0;
            } else {
                i10 = this.f22395g0;
            }
            canvas2.translate(L2 + i10, i11);
            this.f22396h0.draw(canvas2);
            canvas2.restore();
        }
        if (this.P != null) {
            canvas2.save();
            if (cd.X) {
                f13 = 8.0f;
            } else {
                f13 = org.telegram.messenger.i0.C;
            }
            float L3 = org.telegram.messenger.i0.L(f13);
            if (cd.X) {
                StaticLayout staticLayout2 = this.f22396h0;
                if (staticLayout2 == null) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(4.0f) + staticLayout2.getWidth();
                }
                L3 += L;
            }
            canvas2.translate(L3, i11);
            this.P.draw(canvas2);
            canvas2.restore();
        }
        if (this.f22386a0 != null) {
            this.f22394f0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas2.save();
            if (cd.X) {
                f12 = 8.0f;
            } else {
                f12 = org.telegram.messenger.i0.C;
            }
            canvas2.translate(org.telegram.messenger.i0.L(f12), this.W);
            this.f22386a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.R;
        TextPaint textPaint = this.f22391d0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas2.save();
            if (cd.X) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.i0.C;
            }
            canvas2.translate(org.telegram.messenger.i0.L(f11), this.Q);
            nh.i.g(this, false, textPaint.getColor(), -org.telegram.messenger.i0.L(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas2.save();
            if (cd.X) {
                f10 = 8.0f;
            } else {
                f10 = org.telegram.messenger.i0.C;
            }
            canvas2.translate(org.telegram.messenger.i0.L(f10), this.T);
            nh.i.g(this, false, textPaint.getColor(), -org.telegram.messenger.i0.L(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            o7Var = this;
            canvas2.restore();
        } else {
            o7Var = this;
        }
        ArrayList arrayList = o7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J6, p6Var));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i13);
                List<nh.i> list = (List) o7Var.H.get(i13);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (cd.X) {
                        f7 = 8.0f;
                    } else {
                        f7 = org.telegram.messenger.i0.C;
                    }
                    canvas2.translate(org.telegram.messenger.i0.L(f7), o7Var.F + i12);
                    Path path = o7Var.L;
                    path.rewind();
                    if (list != null) {
                        for (nh.i iVar : list) {
                            Rect bounds = iVar.getBounds();
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
                        ((nh.i) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (nh.i iVar2 : list) {
                            iVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i12 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (o7Var.e.h(canvas2)) {
                o7Var.invalidate();
            }
        }
        if (o7Var.f22398j0 != null) {
            canvas2.save();
            if (!cd.X) {
                f15 = org.telegram.messenger.i0.C;
            }
            canvas2.translate(org.telegram.messenger.i0.L(f15), o7Var.f22397i0);
            o7Var.f22398j0.draw(canvas2);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, o7Var.f22398j0, o7Var.f22399k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        o7Var.f22404w.draw(canvas2);
        if (o7Var.f22403s) {
            o7Var.f22402r.h(canvas2, null);
        }
        if (o7Var.D) {
            if (cd.X) {
                canvas2.drawLine(0.0f, o7Var.getMeasuredHeight() - 1, o7Var.getMeasuredWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), o7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            }
            canvas.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), o7Var.getMeasuredHeight() - 1, o7Var.getMeasuredWidth(), o7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
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
        if (this.f22405x.f25836a.f23919q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(n7 n7Var) {
        this.f22406y = n7Var;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f22390c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f22400l0));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
