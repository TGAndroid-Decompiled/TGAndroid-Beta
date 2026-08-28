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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.u70;
public final class l7 extends FrameLayout {
    public final ArrayList A;
    public int B;
    public final ArrayList C;
    public final SparseArray D;
    public final ArrayList E;
    public final ArrayList F;
    public final Stack G;
    public final Path H;
    public dh.l I;
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
    public boolean f24652a;
    public final TextPaint f24653a0;
    public androidx.emoji2.text.i f24654b;
    public final TextPaint f24655b0;
    public int f24656c;
    public int f24657c0;
    public m.i3 d;
    public StaticLayout f24658d0;
    public final i80 f24659e;
    public int f24660e0;
    public boolean f24661f;
    public StaticLayout f24662f0;
    public org.telegram.ui.Components.p5 f24663g0;
    public int h;
    public final org.telegram.ui.ActionBar.b6 f24664h0;
    public final int f24665i0;
    public m80 f24666n;
    public final ImageReceiver f24667r;
    public boolean f24668s;
    public final u70 v;
    public final dp f24669w;
    public k7 f24670x;
    public boolean f24671y;

    public l7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f24652a = false;
        this.f24654b = null;
        this.f24656c = 0;
        this.d = null;
        this.f24659e = new i80(this);
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
        this.f24660e0 = AndroidUtilities.dp(30.0f);
        this.f24664h0 = b6Var;
        this.f24665i0 = i9;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.V = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.W = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24667r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new u70(0, b6Var);
        dp dpVar = new dp(context, 21, b6Var);
        this.f24669w = dpVar;
        dpVar.setVisibility(4);
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(2);
        boolean z10 = LocaleController.isRTL;
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
        addView(dpVar, g7.e6.d(24, 24.0f, i11, f10, 44.0f, f11, 0.0f));
        if (i9 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24653a0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f24655b0 = textPaint4;
        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                if (!AndroidUtilities.charSequenceContains(trim, "://") && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
                    trim = "http://".concat(trim);
                }
                this.A.add(SpannableString.valueOf(trim));
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
            for (int i9 = 0; i9 < richText.texts.size(); i9++) {
                d(richText.texts.get(i9));
            }
        } else if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.f24659e.d(true);
        this.h = -1;
        this.f24666n = null;
        this.f24661f = false;
        this.f24652a = false;
        androidx.emoji2.text.i iVar = this.f24654b;
        if (iVar != null) {
            removeCallbacks(iVar);
        }
        m.i3 i3Var = this.d;
        if (i3Var != null) {
            removeCallbacks(i3Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        dp dpVar = this.f24669w;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
    }

    public final void g(int i9, int i10, int i11) {
        float f10;
        dh.l lVar;
        dh.l lVar2;
        if (LocaleController.isRTL) {
            f10 = 8.0f;
        } else {
            f10 = AndroidUtilities.leftBaseline;
        }
        int dp = AndroidUtilities.dp(f10);
        e();
        this.I.f4627q = new j7(this, 0);
        int i12 = i9 - dp;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i13 = this.J;
        SparseArray sparseArray = this.D;
        ArrayList arrayList = this.E;
        ArrayList arrayList2 = this.F;
        ArrayList arrayList3 = this.C;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList2.get(i14);
                        i14++;
                        ((dh.l) obj).j(i12, i10 - this.P, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((dh.l) obj2).j(i12, i10 - this.M, sqrt, false);
                }
            }
        } else {
            float f11 = 0.0f;
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                Layout layout = (Layout) arrayList3.get(i16);
                f11 += layout.getLineBottom(layout.getLineCount() - 1);
                for (dh.l lVar3 : (List) sparseArray.get(i16)) {
                    lVar3.j(i12, ((i10 - this.B) - i11) + f11, sqrt, false);
                }
            }
        }
        for (int i17 = 0; i17 <= 2; i17++) {
            if (i17 != this.J) {
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            int size3 = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size3) {
                                Object obj3 = arrayList2.get(i18);
                                i18++;
                                ((dh.l) obj3).j(lVar2.getBounds().centerX(), lVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i19 = 0;
                        while (i19 < size4) {
                            Object obj4 = arrayList.get(i19);
                            i19++;
                            ((dh.l) obj4).j(lVar.getBounds().centerX(), lVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        Layout layout2 = (Layout) arrayList3.get(i20);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (dh.l lVar4 : (List) sparseArray.get(i20)) {
                            lVar4.j(lVar4.getBounds().centerX(), lVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.J = -1;
        this.I = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f24667r;
    }

    public MessageObject getMessage() {
        return this.U;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24668s) {
            this.f24667r.onAttachedToWindow();
        }
        this.f24663g0 = org.telegram.ui.Components.t5.update(0, this, this.f24663g0, this.f24662f0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24668s) {
            this.f24667r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.t5.release(this, this.f24663g0);
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
        int i9;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24664h0;
        if (this.f24665i0 == 1) {
            this.f24653a0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        }
        StaticLayout staticLayout = this.f24658d0;
        int i10 = this.K;
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
                i9 = 0;
            } else {
                i9 = this.f24657c0;
            }
            canvas2.translate(dp2 + i9, i10);
            this.f24658d0.draw(canvas2);
            canvas2.restore();
        }
        if (this.L != null) {
            canvas2.save();
            if (LocaleController.isRTL) {
                f14 = 8.0f;
            } else {
                f14 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.f24658d0;
                if (staticLayout2 == null) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(4.0f) + staticLayout2.getWidth();
                }
                dp3 += dp;
            }
            canvas2.translate(dp3, i10);
            this.L.draw(canvas2);
            canvas2.restore();
        }
        if (this.T != null) {
            this.f24655b0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f13 = 8.0f;
            } else {
                f13 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f13), this.S);
            this.T.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.N;
        TextPaint textPaint = this.W;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f12 = 8.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f12), this.M);
            dh.l.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.O, 0, this.N, this.E, canvas2, false);
            canvas2.restore();
        }
        if (this.Q != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f11), this.P);
            dh.l.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.R, 0, this.Q, this.F, canvas2, false);
            l7Var = this;
            canvas2.restore();
        } else {
            l7Var = this;
        }
        ArrayList arrayList = l7Var.C;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i12);
                List<dh.l> list = (List) l7Var.D.get(i12);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (LocaleController.isRTL) {
                        f10 = 8.0f;
                    } else {
                        f10 = AndroidUtilities.leftBaseline;
                    }
                    canvas2.translate(AndroidUtilities.dp(f10), l7Var.B + i11);
                    Path path = l7Var.H;
                    path.rewind();
                    if (list != null) {
                        for (dh.l lVar : list) {
                            Rect bounds = lVar.getBounds();
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
                        ((dh.l) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (dh.l lVar2 : list) {
                            lVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i11 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (l7Var.f24659e.f(canvas2)) {
                l7Var.invalidate();
            }
        }
        if (l7Var.f24662f0 != null) {
            canvas2.save();
            if (!LocaleController.isRTL) {
                f16 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f16), l7Var.f24660e0);
            l7Var.f24662f0.draw(canvas2);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, l7Var.f24662f0, l7Var.f24663g0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        l7Var.v.draw(canvas2);
        if (l7Var.f24668s) {
            l7Var.f24667r.draw(canvas2);
        }
        if (l7Var.f24671y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, l7Var.getMeasuredHeight() - 1, l7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), l7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            }
            canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), l7Var.getMeasuredHeight() - 1, l7Var.getMeasuredWidth(), l7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
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
        if (this.f24669w.f27781a.f26313q) {
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
        this.f24670x = k7Var;
    }
}
