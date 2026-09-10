package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class r00 extends FrameLayout {
    public static final int A0 = 0;
    public boolean E;
    public final bi.y1 F;
    public final int G;
    public final fg.i0 H;
    public final m00 I;
    public l00 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final GradientDrawable T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.f6 f26512a;
    public int f26513a0;
    public final TextPaint f26514b;
    public int f26515b0;
    public final TextPaint f26516c;
    public int f26517c0;
    public final TextPaint d;
    public int f26518d0;
    public final Paint e;
    public int f26519e0;
    public PorterDuffColorFilter f26520f;
    public int f26521f0;
    public int f26522g0;
    public final ArrayList h;
    public boolean f26523h0;
    public final wr f26524i0;
    public final SparseIntArray f26525j0;
    public final SparseIntArray f26526k0;
    public final SparseIntArray f26527l0;
    public final SparseIntArray m0;
    public boolean f26528n;
    public final SparseIntArray f26529n0;
    public final SparseIntArray f26530o0;
    public float f26531p0;
    public int f26532q0;
    public long f26533r;
    public int f26534r0;
    public boolean f26535s;
    public final j00 f26536s0;
    public Drawable f26537t0;
    public int f26538u0;
    public float v;
    public final org.telegram.ui.Cells.l9 f26539v0;
    public float f26540w;
    public float f26541w0;
    public AnimatorSet f26542x;
    public final org.telegram.ui.Cells.c2 f26543x0;
    public boolean f26544y;
    public bh.d f26545y0;
    public final Path f26546z0;

    public r00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f26514b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f26516c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f26520f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.j6.K8;
        this.V = org.telegram.ui.ActionBar.j6.I8;
        this.W = org.telegram.ui.ActionBar.j6.J8;
        this.f26513a0 = org.telegram.ui.ActionBar.j6.L8;
        this.f26515b0 = org.telegram.ui.ActionBar.j6.f18201s8;
        this.f26517c0 = -1;
        this.f26518d0 = -1;
        this.f26519e0 = -1;
        this.f26521f0 = -1;
        this.f26524i0 = wr.h;
        this.f26525j0 = new SparseIntArray(5);
        this.f26526k0 = new SparseIntArray(5);
        this.f26527l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f26529n0 = new SparseIntArray(5);
        this.f26530o0 = new SparseIntArray(5);
        this.f26539v0 = new org.telegram.ui.Cells.l9(this, 10);
        this.f26543x0 = new org.telegram.ui.Cells.c2(3, this);
        this.f26546z0 = new Path();
        this.f26512a = f6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.T = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.U, f6Var));
        setHorizontalScrollBarEnabled(false);
        bi.y1 y1Var = new bi.y1(this, context, 15);
        this.F = y1Var;
        y1Var.setClipChildren(false);
        j00 j00Var = new j00(this);
        this.f26536s0 = j00Var;
        j00Var.C = false;
        y1Var.setItemAnimator(j00Var);
        y1Var.setSelectorType(9);
        y1Var.setSelectorRadius(6);
        y1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.f26513a0, f6Var));
        fg.i0 i0Var = new fg.i0((ViewGroup) this, 2);
        this.H = i0Var;
        y1Var.setLayoutManager(i0Var);
        new s4.y(new q00(this)).d(y1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.G = max;
        y1Var.setPadding(max, 0, max, 0);
        y1Var.setClipToPadding(false);
        y1Var.setDrawSelectorBehind(true);
        m00 m00Var = new m00(this, context);
        this.I = m00Var;
        m00Var.C(true);
        y1Var.setAdapter(m00Var);
        y1Var.setOnItemClickListener(new h00(this));
        y1Var.setOnItemLongClickListener(new h00(this));
        y1Var.setOnScrollListener(new bi.a2(this, 24));
        y1Var.f28007z2 = true;
        y1Var.setOverScrollMode(2);
        addView(y1Var, w7.a6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.f26525j0.put(size, i10);
        this.f26526k0.put(size, i11);
        this.f26527l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f26514b;
        n00 n00Var = new n00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        n00Var.e = z11;
        n00Var.f25352f = z12;
        this.M = org.telegram.messenger.a2.C(24.0f, n00Var.a(true), this.M);
        arrayList2.add(n00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f26542x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f26517c0 = i10;
        this.f26518d0 = i11;
        this.f26519e0 = i12;
        this.f26521f0 = i14;
        this.f26513a0 = i13;
        this.F.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i13, this.f26512a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26542x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f26543x0, 0.0f, 1.0f));
        this.f26542x.setDuration(320L);
        this.f26542x.addListener(new rm(this, 12));
        this.f26542x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r00.c():void");
    }

    public final n00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((n00) arrayList.get(i10)).e) {
                    return (n00) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f26546z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r00.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.S = i10;
            this.F.x0(i10);
        }
    }

    public final void f(n00 n00Var, int i10) {
        boolean z10;
        if (n00Var.f25352f) {
            l00 l00Var = this.J;
            if (l00Var != null) {
                ((org.telegram.ui.vw) l00Var).c(n00Var, false);
                return;
            }
            return;
        }
        int i11 = this.K;
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S = -1;
        this.f26532q0 = i11;
        this.f26534r0 = this.L;
        this.K = i10;
        this.L = n00Var.f25349a;
        boolean z11 = this.O;
        org.telegram.ui.Cells.l9 l9Var = this.f26539v0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            this.O = false;
        }
        this.f26531p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(l9Var, 16L);
        l00 l00Var2 = this.J;
        if (l00Var2 != null) {
            ((org.telegram.ui.vw) l00Var2).c(n00Var, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.f26527l0.get(i10, -1);
        if (i11 >= 0) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (f7 > 0.0f) {
                this.Q = i11;
                this.R = i10;
            } else {
                this.Q = -1;
                this.R = -1;
            }
            this.P = f7;
            bi.y1 y1Var = this.F;
            y1Var.e1();
            y1Var.invalidate();
            invalidate();
            e(i11);
            if (f7 >= 1.0f) {
                this.Q = -1;
                this.R = -1;
                this.K = i11;
                this.L = i10;
            }
        }
    }

    public int getCurrentTabId() {
        return this.L;
    }

    public int getCurrentTabStableId() {
        return this.f26526k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        n00 d = d();
        if (d == null) {
            return -1;
        }
        return d.f25349a;
    }

    public int getFirstTabId() {
        return this.f26525j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f26525j0.get(getTabsCount() - 1, 0);
    }

    public vl0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f26513a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public vl0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f26526k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.f26525j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            bi.y1 y1Var = this.F;
            if (i11 < y1Var.getChildCount()) {
                if (y1Var.getChildAt(i11) instanceof p00) {
                    p00 p00Var = (p00) y1Var.getChildAt(i11);
                    if (p00Var.f25950b.f25349a == i10) {
                        p00Var.b(1.0f, 0);
                        try {
                            p00Var.performHapticFeedback(3);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.f26530o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f26529n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((n00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((n00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f26522g0 != i14) {
            this.f26522g0 = i14;
            this.S = -1;
            if (this.O) {
                AndroidUtilities.cancelRunOnUIThread(this.f26539v0);
                this.O = false;
                setEnabled(true);
                l00 l00Var = this.J;
                if (l00Var != null) {
                    ((org.telegram.ui.vw) l00Var).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.G * 2);
            n00 d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                if (this.M > size) {
                    i12 = R.string.FilterAllChatsShort;
                } else {
                    i12 = R.string.FilterAllChats;
                }
                d.b(LocaleController.getString(i12));
                int a10 = d.a(false) + (this.M - a2);
                int i14 = this.N;
                if (a10 < size) {
                    i13 = (size - a10) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.N = i13;
                if (i14 != i13) {
                    this.E = true;
                    bi.y1 y1Var = this.F;
                    s4.m0 itemAnimator = y1Var.getItemAnimator();
                    y1Var.setItemAnimator(null);
                    this.I.l();
                    y1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.f26523h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f26546z0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.P = f7;
        bi.y1 y1Var = this.F;
        y1Var.e1();
        y1Var.invalidate();
        invalidate();
        l00 l00Var = this.J;
        if (l00Var != null) {
            ((org.telegram.ui.vw) l00Var).b(f7);
        }
    }

    public void setBlurredBackground(bh.d dVar) {
        this.f26545y0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(l00 l00Var) {
        this.J = l00Var;
    }

    public void setIsEditing(boolean z10) {
        this.f26528n = z10;
        this.f26535s = true;
        bi.y1 y1Var = this.F;
        y1Var.e1();
        y1Var.invalidate();
        this.I.l();
        invalidate();
        if (!this.f26528n && this.f26544y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f14645id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new bi.g1(10));
            this.f26544y = false;
        }
    }
}
