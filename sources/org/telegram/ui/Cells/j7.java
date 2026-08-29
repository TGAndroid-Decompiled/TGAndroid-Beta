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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;
public final class j7 extends FrameLayout {
    public final ArrayList A;
    public int B;
    public final ArrayList C;
    public final SparseArray D;
    public final ArrayList E;
    public final ArrayList F;
    public final Stack G;
    public final Path H;
    public gh.k I;
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
    public boolean f24542a;
    public final TextPaint f24543a0;
    public androidx.emoji2.text.j f24544b;
    public final TextPaint f24545b0;
    public int f24546c;
    public int f24547c0;
    public lh.m7 d;
    public StaticLayout f24548d0;
    public final v80 f24549e;
    public int f24550e0;
    public boolean f24551f;
    public StaticLayout f24552f0;
    public org.telegram.ui.Components.u5 f24553g0;
    public int h;
    public final org.telegram.ui.ActionBar.c6 f24554h0;
    public final int f24555i0;
    public z80 f24556n;
    public final ImageReceiver f24557r;
    public boolean f24558s;
    public final h80 v;
    public final hp f24559w;
    public i7 f24560x;
    public boolean f24561y;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        float f9;
        float f10;
        this.f24542a = false;
        this.f24544b = null;
        this.f24546c = 0;
        this.d = null;
        this.f24549e = new v80(this);
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
        this.f24550e0 = AndroidUtilities.dp(30.0f);
        this.f24554h0 = c6Var;
        this.f24555i0 = i10;
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
        this.f24557r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new h80(0, c6Var);
        hp hpVar = new hp(context, 21, c6Var);
        this.f24559w = hpVar;
        hpVar.setVisibility(4);
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(2);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i12 = i11 | 48;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 44.0f;
        }
        if (z10) {
            f10 = 44.0f;
        } else {
            f10 = 0.0f;
        }
        addView(hpVar, i7.f6.d(24, 24.0f, i12, f9, 44.0f, f10, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24543a0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f24545b0 = textPaint4;
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
        this.f24549e.d(true);
        this.h = -1;
        this.f24556n = null;
        this.f24551f = false;
        this.f24542a = false;
        androidx.emoji2.text.j jVar = this.f24544b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        lh.m7 m7Var = this.d;
        if (m7Var != null) {
            removeCallbacks(m7Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        hp hpVar = this.f24559w;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        float f9;
        gh.k kVar;
        gh.k kVar2;
        if (LocaleController.isRTL) {
            f9 = 8.0f;
        } else {
            f9 = AndroidUtilities.leftBaseline;
        }
        int dp = AndroidUtilities.dp(f9);
        e();
        this.I.f7417q = new h7(this, 0);
        int i13 = i10 - dp;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i14 = this.J;
        SparseArray sparseArray = this.D;
        ArrayList arrayList = this.E;
        ArrayList arrayList2 = this.F;
        ArrayList arrayList3 = this.C;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList2.get(i15);
                        i15++;
                        ((gh.k) obj).j(i13, i11 - this.P, sqrt, false);
                    }
                }
            } else {
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((gh.k) obj2).j(i13, i11 - this.M, sqrt, false);
                }
            }
        } else {
            float f10 = 0.0f;
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                Layout layout = (Layout) arrayList3.get(i17);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                for (gh.k kVar3 : (List) sparseArray.get(i17)) {
                    kVar3.j(i13, ((i11 - this.B) - i12) + f10, sqrt, false);
                }
            }
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            if (i18 != this.J) {
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            int size3 = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size3) {
                                Object obj3 = arrayList2.get(i19);
                                i19++;
                                ((gh.k) obj3).j(kVar2.getBounds().centerX(), kVar2.getBounds().centerY(), sqrt, false);
                            }
                        }
                    } else {
                        int size4 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            Object obj4 = arrayList.get(i20);
                            i20++;
                            ((gh.k) obj4).j(kVar.getBounds().centerX(), kVar.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        Layout layout2 = (Layout) arrayList3.get(i21);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (gh.k kVar4 : (List) sparseArray.get(i21)) {
                            kVar4.j(kVar4.getBounds().centerX(), kVar4.getBounds().centerY(), sqrt, false);
                        }
                    }
                }
            }
        }
        this.J = -1;
        this.I = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.f24557r;
    }

    public MessageObject getMessage() {
        return this.U;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24558s) {
            this.f24557r.onAttachedToWindow();
        }
        this.f24553g0 = org.telegram.ui.Components.y5.update(0, this, this.f24553g0, this.f24552f0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24558s) {
            this.f24557r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.y5.release(this, this.f24553g0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        j7 j7Var;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        float f14;
        int i10;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24554h0;
        if (this.f24555i0 == 1) {
            this.f24543a0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        }
        StaticLayout staticLayout = this.f24548d0;
        int i11 = this.K;
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
                i10 = this.f24547c0;
            }
            canvas2.translate(dp2 + i10, i11);
            this.f24548d0.draw(canvas2);
            canvas2.restore();
        }
        if (this.L != null) {
            canvas2.save();
            if (LocaleController.isRTL) {
                f13 = 8.0f;
            } else {
                f13 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f13);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.f24548d0;
                if (staticLayout2 == null) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(4.0f) + staticLayout2.getWidth();
                }
                dp3 += dp;
            }
            canvas2.translate(dp3, i11);
            this.L.draw(canvas2);
            canvas2.restore();
        }
        if (this.T != null) {
            this.f24545b0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f12 = 8.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f12), this.S);
            this.T.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.N;
        TextPaint textPaint = this.W;
        if (staticLayout3 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f11), this.M);
            gh.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.O, 0, this.N, this.E, canvas2, false);
            canvas2.restore();
        }
        if (this.Q != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas2.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f10), this.P);
            gh.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.R, 0, this.Q, this.F, canvas2, false);
            j7Var = this;
            canvas2.restore();
        } else {
            j7Var = this;
        }
        ArrayList arrayList = j7Var.C;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i13);
                List<gh.k> list = (List) j7Var.D.get(i13);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    if (LocaleController.isRTL) {
                        f9 = 8.0f;
                    } else {
                        f9 = AndroidUtilities.leftBaseline;
                    }
                    canvas2.translate(AndroidUtilities.dp(f9), j7Var.B + i12);
                    Path path = j7Var.H;
                    path.rewind();
                    if (list != null) {
                        for (gh.k kVar : list) {
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
                        ((gh.k) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        for (gh.k kVar2 : list) {
                            kVar2.draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i12 += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (j7Var.f24549e.f(canvas2)) {
                j7Var.invalidate();
            }
        }
        if (j7Var.f24552f0 != null) {
            canvas2.save();
            if (!LocaleController.isRTL) {
                f15 = AndroidUtilities.leftBaseline;
            }
            canvas2.translate(AndroidUtilities.dp(f15), j7Var.f24550e0);
            j7Var.f24552f0.draw(canvas2);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, j7Var.f24552f0, j7Var.f24553g0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        j7Var.v.draw(canvas2);
        if (j7Var.f24558s) {
            j7Var.f24557r.draw(canvas2);
        }
        if (j7Var.f24561y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
                return;
            }
            canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth(), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
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
        if (this.f24559w.f29211a.f26324q) {
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
        this.f24560x = i7Var;
    }
}
