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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zp;
public final class r7 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public xh.g M;
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
    public boolean f24974a;
    public StaticLayout f24975a0;
    public androidx.emoji2.text.j f24976b;
    public MessageObject f24977b0;
    public int f24978c;
    public final TextPaint f24979c0;
    public m.g3 d;
    public final TextPaint f24980d0;
    public final w90 e;
    public final TextPaint f24981e0;
    public boolean f24982f;
    public final TextPaint f24983f0;
    public int f24984g0;
    public int h;
    public StaticLayout f24985h0;
    public int f24986i0;
    public StaticLayout f24987j0;
    public org.telegram.ui.Components.y5 f24988k0;
    public final org.telegram.ui.ActionBar.u6 f24989l0;
    public final int m0;
    public aa0 f24990n;
    public final ImageReceiver f24991r;
    public boolean f24992s;
    public final h90 v;
    public final zp f24993w;
    public q7 f24994x;
    public boolean f24995y;

    public r7(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        this.f24974a = false;
        this.f24976b = null;
        this.f24978c = 0;
        this.d = null;
        this.e = new w90(this);
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
        this.f24986i0 = AndroidUtilities.dp(30.0f);
        this.f24989l0 = u6Var;
        this.m0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f24979c0 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.f24980d0 = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24991r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new h90(0, u6Var);
        zp zpVar = new zp(context, 21, u6Var);
        this.f24993w = zpVar;
        zpVar.setVisibility(4);
        zpVar.b(-1, org.telegram.ui.ActionBar.y6.f23356d6, org.telegram.ui.ActionBar.y6.f23485k7);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(2);
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
        addView(zpVar, gb1.h(24, 24.0f, i12, f7, 44.0f, f10, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24981e0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f24983f0 = textPaint4;
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
        this.f24990n = null;
        this.f24982f = false;
        this.f24974a = false;
        androidx.emoji2.text.j jVar = this.f24976b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m.g3 g3Var = this.d;
        if (g3Var != null) {
            removeCallbacks(g3Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        zp zpVar = this.f24993w;
        if (zpVar.getVisibility() != 0) {
            zpVar.setVisibility(0);
        }
        zpVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        float f7;
        xh.g gVar;
        xh.g gVar2;
        if (LocaleController.isRTL) {
            f7 = 8.0f;
        } else {
            f7 = AndroidUtilities.leftBaseline;
        }
        int dp = AndroidUtilities.dp(f7);
        e();
        this.M.f51873q = new p7(this, 0);
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
                        ((xh.g) obj).j(i13, i11 - this.T, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((xh.g) obj2).j(i13, i11 - this.Q, sqrt, false);
                }
            }
        } else {
            float f10 = 0.0f;
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                Layout layout = (Layout) arrayList3.get(i17);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                for (xh.g gVar3 : (List) sparseArray.get(i17)) {
                    gVar3.j(i13, ((i11 - this.F) - i12) + f10, sqrt, false);
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
                                ((xh.g) obj3).j(gVar2.getBounds().centerX(), gVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            Object obj4 = arrayList.get(i20);
                            i20++;
                            ((xh.g) obj4).j(gVar.getBounds().centerX(), gVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        Layout layout2 = (Layout) arrayList3.get(i21);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (xh.g gVar4 : (List) sparseArray.get(i21)) {
                            gVar4.j(gVar4.getBounds().centerX(), gVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.N = -1;
        this.M = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f24991r;
    }

    public MessageObject getMessage() {
        return this.f24977b0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24992s) {
            this.f24991r.onAttachedToWindow();
        }
        this.f24988k0 = org.telegram.ui.Components.c6.update(0, this, this.f24988k0, this.f24987j0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24992s) {
            this.f24991r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.c6.release(this, this.f24988k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        r7 r7Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        float f14;
        int i10;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.u6 u6Var = this.f24989l0;
        if (this.m0 == 1) {
            this.f24981e0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A6, u6Var));
        }
        StaticLayout staticLayout = this.f24985h0;
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
                i10 = this.f24984g0;
            }
            canvas2.translate(dp2 + i10, i11);
            this.f24985h0.draw(canvas2);
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
                StaticLayout staticLayout2 = this.f24985h0;
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
        if (this.f24975a0 != null) {
            this.f24983f0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f12 = 8.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f12), this.W);
            this.f24975a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.R;
        TextPaint textPaint = this.f24980d0;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f11), this.Q);
            xh.g.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f10), this.T);
            xh.g.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            r7Var = this;
            canvas2.restore();
        } else {
            r7Var = this;
        }
        ArrayList arrayList = r7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J6, u6Var));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i13);
                List<xh.g> list = (List) r7Var.H.get(i13);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (LocaleController.isRTL) {
                        f7 = 8.0f;
                    } else {
                        f7 = AndroidUtilities.leftBaseline;
                    }
                    canvas2.translate(AndroidUtilities.dp(f7), r7Var.F + i12);
                    Path path = r7Var.L;
                    path.rewind();
                    if (list != null) {
                        for (xh.g gVar : list) {
                            Rect bounds = gVar.getBounds();
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
                        ((xh.g) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (xh.g gVar2 : list) {
                            gVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i12 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (r7Var.e.f(canvas2)) {
                r7Var.invalidate();
            }
        }
        if (r7Var.f24987j0 != null) {
            canvas2.save();
            if (!LocaleController.isRTL) {
                f15 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f15), r7Var.f24986i0);
            r7Var.f24987j0.draw(canvas2);
            org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas, r7Var.f24987j0, r7Var.f24988k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        r7Var.v.draw(canvas2);
        if (r7Var.f24992s) {
            r7Var.f24991r.draw(canvas2);
        }
        if (r7Var.f24995y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, r7Var.getMeasuredHeight() - 1, r7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), r7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
                return;
            }
            canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), r7Var.getMeasuredHeight() - 1, r7Var.getMeasuredWidth(), r7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
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
        if (this.f24993w.f35382a.f26089q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(q7 q7Var) {
        this.f24994x = q7Var;
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f24979c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f24989l0));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
