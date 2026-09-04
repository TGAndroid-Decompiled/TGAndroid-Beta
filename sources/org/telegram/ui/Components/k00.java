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
public abstract class k00 extends FrameLayout {
    public static final int A0 = 0;
    public boolean E;
    public final bi.o0 F;
    public final int G;
    public final hg.j0 H;
    public final f00 I;
    public e00 J;
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
    public final org.telegram.ui.ActionBar.f6 f27604a;
    public int f27605a0;
    public final TextPaint f27606b;
    public int f27607b0;
    public final TextPaint f27608c;
    public int f27609c0;
    public final TextPaint d;
    public int f27610d0;
    public final Paint f27611e;
    public int f27612e0;
    public PorterDuffColorFilter f27613f;
    public int f27614f0;
    public int f27615g0;
    public final ArrayList h;
    public boolean f27616h0;
    public final pr f27617i0;
    public final SparseIntArray f27618j0;
    public final SparseIntArray f27619k0;
    public final SparseIntArray f27620l0;
    public final SparseIntArray m0;
    public boolean f27621n;
    public final SparseIntArray f27622n0;
    public final SparseIntArray f27623o0;
    public float f27624p0;
    public int f27625q0;
    public long f27626r;
    public int f27627r0;
    public boolean f27628s;
    public final c00 f27629s0;
    public Drawable f27630t0;
    public int f27631u0;
    public float v;
    public final org.telegram.ui.Cells.l7 f27632v0;
    public float f27633w;
    public float f27634w0;
    public AnimatorSet f27635x;
    public final org.telegram.ui.Cells.c2 f27636x0;
    public boolean f27637y;
    public dh.d f27638y0;
    public final Path f27639z0;

    public k00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f27606b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f27608c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f27611e = new Paint(1);
        this.f27613f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.j6.K8;
        this.V = org.telegram.ui.ActionBar.j6.I8;
        this.W = org.telegram.ui.ActionBar.j6.J8;
        this.f27605a0 = org.telegram.ui.ActionBar.j6.L8;
        this.f27607b0 = org.telegram.ui.ActionBar.j6.f20937s8;
        this.f27609c0 = -1;
        this.f27610d0 = -1;
        this.f27612e0 = -1;
        this.f27614f0 = -1;
        this.f27617i0 = pr.h;
        this.f27618j0 = new SparseIntArray(5);
        this.f27619k0 = new SparseIntArray(5);
        this.f27620l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f27622n0 = new SparseIntArray(5);
        this.f27623o0 = new SparseIntArray(5);
        this.f27632v0 = new org.telegram.ui.Cells.l7(this, 12);
        this.f27636x0 = new org.telegram.ui.Cells.c2(3, this);
        this.f27639z0 = new Path();
        this.f27604a = f6Var;
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
        bi.o0 o0Var = new bi.o0(this, context, 16);
        this.F = o0Var;
        o0Var.setClipChildren(false);
        c00 c00Var = new c00(this);
        this.f27629s0 = c00Var;
        c00Var.C = false;
        o0Var.setItemAnimator(c00Var);
        o0Var.setSelectorType(9);
        o0Var.setSelectorRadius(6);
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.f27605a0, f6Var));
        hg.j0 j0Var = new hg.j0((ViewGroup) this, 2);
        this.H = j0Var;
        o0Var.setLayoutManager(j0Var);
        new s4.y(new j00(this)).d(o0Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.G = max;
        o0Var.setPadding(max, 0, max, 0);
        o0Var.setClipToPadding(false);
        o0Var.setDrawSelectorBehind(true);
        f00 f00Var = new f00(this, context);
        this.I = f00Var;
        f00Var.C(true);
        o0Var.setAdapter(f00Var);
        o0Var.setOnItemClickListener(new a00(this));
        o0Var.setOnItemLongClickListener(new a00(this));
        o0Var.setOnScrollListener(new ah.e0(this, 27));
        o0Var.f28244z2 = true;
        o0Var.setOverScrollMode(2);
        addView(o0Var, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.f27618j0.put(size, i10);
        this.f27619k0.put(size, i11);
        this.f27620l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f27606b;
        g00 g00Var = new g00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        g00Var.f26220e = z11;
        g00Var.f26221f = z12;
        this.M = org.telegram.messenger.w1.C(24.0f, g00Var.a(true), this.M);
        arrayList2.add(g00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f27635x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f27609c0 = i10;
        this.f27610d0 = i11;
        this.f27612e0 = i12;
        this.f27614f0 = i14;
        this.f27605a0 = i13;
        this.F.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i13, this.f27604a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27635x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f27636x0, 0.0f, 1.0f));
        this.f27635x.setDuration(320L);
        this.f27635x.addListener(new j6(this, 25));
        this.f27635x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k00.c():void");
    }

    public final g00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((g00) arrayList.get(i10)).f26220e) {
                    return (g00) arrayList.get(i10);
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
        canvas.clipPath(this.f27639z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k00.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.S = i10;
            this.F.x0(i10);
        }
    }

    public final void f(g00 g00Var, int i10) {
        boolean z10;
        if (g00Var.f26221f) {
            e00 e00Var = this.J;
            if (e00Var != null) {
                ((org.telegram.ui.tw) e00Var).c(g00Var, false);
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
        this.f27625q0 = i11;
        this.f27627r0 = this.L;
        this.K = i10;
        this.L = g00Var.f26217a;
        boolean z11 = this.O;
        org.telegram.ui.Cells.l7 l7Var = this.f27632v0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            this.O = false;
        }
        this.f27624p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(l7Var, 16L);
        e00 e00Var2 = this.J;
        if (e00Var2 != null) {
            ((org.telegram.ui.tw) e00Var2).c(g00Var, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.f27620l0.get(i10, -1);
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
            bi.o0 o0Var = this.F;
            o0Var.e1();
            o0Var.invalidate();
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
        return this.f27619k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        g00 d = d();
        if (d == null) {
            return -1;
        }
        return d.f26217a;
    }

    public int getFirstTabId() {
        return this.f27618j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f27618j0.get(getTabsCount() - 1, 0);
    }

    public ll0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f27605a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public ll0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f27619k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.f27618j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            bi.o0 o0Var = this.F;
            if (i11 < o0Var.getChildCount()) {
                if (o0Var.getChildAt(i11) instanceof i00) {
                    i00 i00Var = (i00) o0Var.getChildAt(i11);
                    if (i00Var.f26900b.f26217a == i10) {
                        i00Var.b(1.0f, 0);
                        try {
                            i00Var.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f27623o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f27622n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((g00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((g00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f27615g0 != i14) {
            this.f27615g0 = i14;
            this.S = -1;
            if (this.O) {
                AndroidUtilities.cancelRunOnUIThread(this.f27632v0);
                this.O = false;
                setEnabled(true);
                e00 e00Var = this.J;
                if (e00Var != null) {
                    ((org.telegram.ui.tw) e00Var).b(1.0f);
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
            g00 d = d();
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
                    bi.o0 o0Var = this.F;
                    s4.m0 itemAnimator = o0Var.getItemAnimator();
                    o0Var.setItemAnimator(null);
                    this.I.l();
                    o0Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.f27616h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f27639z0;
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
        bi.o0 o0Var = this.F;
        o0Var.e1();
        o0Var.invalidate();
        invalidate();
        e00 e00Var = this.J;
        if (e00Var != null) {
            ((org.telegram.ui.tw) e00Var).b(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f27638y0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(e00 e00Var) {
        this.J = e00Var;
    }

    public void setIsEditing(boolean z10) {
        this.f27621n = z10;
        this.f27628s = true;
        bi.o0 o0Var = this.F;
        o0Var.e1();
        o0Var.invalidate();
        this.I.l();
        invalidate();
        if (!this.f27621n && this.f27637y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f17080id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new bi.c7(14));
            this.f27637y = false;
        }
    }
}
