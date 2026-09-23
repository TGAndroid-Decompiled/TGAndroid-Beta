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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.op;
public final class n7 extends FrameLayout {
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public vh.h M;
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
    public boolean f20448a;
    public StaticLayout f20449a0;
    public androidx.emoji2.text.j f20450b;
    public MessageObject f20451b0;
    public int f20452c;
    public final TextPaint f20453c0;
    public l7 d;
    public final TextPaint f20454d0;
    public final a90 e;
    public final TextPaint f20455e0;
    public boolean f20456f;
    public final TextPaint f20457f0;
    public int f20458g0;
    public int h;
    public StaticLayout f20459h0;
    public int f20460i0;
    public StaticLayout f20461j0;
    public org.telegram.ui.Components.v5 f20462k0;
    public final org.telegram.ui.ActionBar.d6 f20463l0;
    public final int m0;
    public e90 f20464n;
    public final ImageReceiver f20465r;
    public boolean f20466s;
    public final m80 v;
    public final op f20467w;
    public m7 f20468x;
    public boolean f20469y;

    public n7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        this.f20448a = false;
        this.f20450b = null;
        this.f20452c = 0;
        this.d = null;
        this.e = new a90(this);
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.H = new SparseArray();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new Stack();
        this.L = new Path();
        this.N = -1;
        this.O = AndroidUtilities.dp(10.0f);
        this.Q = AndroidUtilities.dp(30.0f);
        this.S = new AtomicReference();
        this.T = AndroidUtilities.dp(30.0f);
        this.V = new AtomicReference();
        this.W = AndroidUtilities.dp(30.0f);
        this.f20460i0 = AndroidUtilities.dp(30.0f);
        this.f20463l0 = d6Var;
        this.m0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f20453c0 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f20454d0 = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f20465r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new m80(0, d6Var);
        op opVar = new op(context, 21, d6Var);
        this.f20467w = opVar;
        opVar.setVisibility(4);
        opVar.b(-1, org.telegram.ui.ActionBar.h6.f18789d6, org.telegram.ui.ActionBar.h6.f18917k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(2);
        boolean z10 = LocaleController.isRTL;
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
        addView(opVar, w7.x5.d(24, 24.0f, i12, f7, 44.0f, f10, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f20455e0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f20457f0 = textPaint4;
        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (!AndroidUtilities.charSequenceContains(trim, "://") && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
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
        this.e.d(true);
        this.h = -1;
        this.f20464n = null;
        this.f20456f = false;
        this.f20448a = false;
        androidx.emoji2.text.j jVar = this.f20450b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        l7 l7Var = this.d;
        if (l7Var != null) {
            removeCallbacks(l7Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        op opVar = this.f20467w;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        float f7;
        vh.h hVar;
        vh.h hVar2;
        if (LocaleController.isRTL) {
            f7 = 8.0f;
        } else {
            f7 = AndroidUtilities.leftBaseline;
        }
        int dp = AndroidUtilities.dp(f7);
        e();
        this.M.f44367q = new k7(this, 0);
        int i13 = i10 - dp;
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
                        ((vh.h) obj).j(i13, i11 - this.T, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((vh.h) obj2).j(i13, i11 - this.Q, sqrt, false);
                }
            }
        } else {
            float f10 = 0.0f;
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                Layout layout = (Layout) arrayList3.get(i17);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                for (vh.h hVar3 : (List) sparseArray.get(i17)) {
                    hVar3.j(i13, ((i11 - this.F) - i12) + f10, sqrt, false);
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
                                ((vh.h) obj3).j(hVar2.getBounds().centerX(), hVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            Object obj4 = arrayList.get(i20);
                            i20++;
                            ((vh.h) obj4).j(hVar.getBounds().centerX(), hVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        Layout layout2 = (Layout) arrayList3.get(i21);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (vh.h hVar4 : (List) sparseArray.get(i21)) {
                            hVar4.j(hVar4.getBounds().centerX(), hVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.N = -1;
        this.M = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f20465r;
    }

    public MessageObject getMessage() {
        return this.f20451b0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20466s) {
            this.f20465r.onAttachedToWindow();
        }
        this.f20462k0 = org.telegram.ui.Components.z5.update(0, this, this.f20462k0, this.f20461j0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f20466s) {
            this.f20465r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.z5.release(this, this.f20462k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n7 n7Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        float f14;
        int i10;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.d6 d6Var = this.f20463l0;
        if (this.m0 == 1) {
            this.f20455e0.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
        }
        StaticLayout staticLayout = this.f20459h0;
        int i11 = this.O;
        float f15 = 8.0f;
        if (staticLayout != null) {
            canvas2.save();
            if (LocaleController.isRTL) {
                f14 = 8.0f;
            } else {
                f14 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                i10 = 0;
            } else {
                i10 = this.f20458g0;
            }
            canvas2.translate(dp2 + i10, i11);
            this.f20459h0.draw(canvas2);
            canvas2.restore();
        }
        if (this.P != null) {
            canvas2.save();
            if (LocaleController.isRTL) {
                f13 = 8.0f;
            } else {
                f13 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f13);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.f20459h0;
                if (staticLayout2 == null) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(4.0f) + staticLayout2.getWidth();
                }
                dp3 += dp;
            }
            canvas2.translate(dp3, i11);
            this.P.draw(canvas2);
            canvas2.restore();
        }
        if (this.f20449a0 != null) {
            this.f20457f0.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f12 = 8.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f12), this.W);
            this.f20449a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.R;
        TextPaint textPaint = this.f20454d0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f11), this.Q);
            vh.h.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f10), this.T);
            vh.h.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            n7Var = this;
            canvas2.restore();
        } else {
            n7Var = this;
        }
        ArrayList arrayList = n7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i13);
                List<vh.h> list = (List) n7Var.H.get(i13);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (LocaleController.isRTL) {
                        f7 = 8.0f;
                    } else {
                        f7 = AndroidUtilities.leftBaseline;
                    }
                    canvas2.translate(AndroidUtilities.dp(f7), n7Var.F + i12);
                    Path path = n7Var.L;
                    path.rewind();
                    if (list != null) {
                        for (vh.h hVar : list) {
                            Rect bounds = hVar.getBounds();
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
                        ((vh.h) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (vh.h hVar2 : list) {
                            hVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i12 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (n7Var.e.f(canvas2)) {
                n7Var.invalidate();
            }
        }
        if (n7Var.f20461j0 != null) {
            canvas2.save();
            if (!LocaleController.isRTL) {
                f15 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f15), n7Var.f20460i0);
            n7Var.f20461j0.draw(canvas2);
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, n7Var.f20461j0, n7Var.f20462k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        n7Var.v.draw(canvas2);
        if (n7Var.f20466s) {
            n7Var.f20465r.draw(canvas2);
        }
        if (n7Var.f20469y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, n7Var.getMeasuredHeight() - 1, n7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), n7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
                return;
            }
            canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), n7Var.getMeasuredHeight() - 1, n7Var.getMeasuredWidth(), n7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
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
        if (this.f20467w.f26827a.f21943q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(m7 m7Var) {
        this.f20468x = m7Var;
    }
}
