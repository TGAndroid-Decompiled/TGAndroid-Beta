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
public abstract class vz extends FrameLayout {
    public static final int f34029w0 = 0;
    public boolean A;
    public final gh.f1 B;
    public final int C;
    public final of.g0 D;
    public final rz E;
    public qz F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public float L;
    public int M;
    public int N;
    public int O;
    public final GradientDrawable P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.b6 f34030a;
    public int f34031a0;
    public final TextPaint f34032b;
    public int f34033b0;
    public final TextPaint f34034c;
    public int f34035c0;
    public final TextPaint d;
    public boolean f34036d0;
    public final Paint f34037e;
    public final gr f34038e0;
    public PorterDuffColorFilter f34039f;
    public final SparseIntArray f34040f0;
    public final SparseIntArray f34041g0;
    public final ArrayList h;
    public final SparseIntArray f34042h0;
    public final SparseIntArray f34043i0;
    public final SparseIntArray f34044j0;
    public final SparseIntArray f34045k0;
    public float f34046l0;
    public int m0;
    public boolean f34047n;
    public int f34048n0;
    public final oz f34049o0;
    public Drawable f34050p0;
    public int f34051q0;
    public long f34052r;
    public final m.i3 f34053r0;
    public boolean f34054s;
    public float f34055s0;
    public final org.telegram.ui.Cells.c2 f34056t0;
    public kg.d f34057u0;
    public float v;
    public final Path f34058v0;
    public float f34059w;
    public AnimatorSet f34060x;
    public boolean f34061y;

    public vz(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f34032b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f34034c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f34037e = new Paint(1);
        this.f34039f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.f6.K8;
        this.R = org.telegram.ui.ActionBar.f6.I8;
        this.S = org.telegram.ui.ActionBar.f6.J8;
        this.T = org.telegram.ui.ActionBar.f6.L8;
        this.U = org.telegram.ui.ActionBar.f6.f23269s8;
        this.V = -1;
        this.W = -1;
        this.f34031a0 = -1;
        this.f34033b0 = -1;
        this.f34038e0 = gr.h;
        this.f34040f0 = new SparseIntArray(5);
        this.f34041g0 = new SparseIntArray(5);
        this.f34042h0 = new SparseIntArray(5);
        this.f34043i0 = new SparseIntArray(5);
        this.f34044j0 = new SparseIntArray(5);
        this.f34045k0 = new SparseIntArray(5);
        this.f34053r0 = new m.i3(this, 19);
        this.f34056t0 = new org.telegram.ui.Cells.c2(3, this);
        this.f34058v0 = new Path();
        this.f34030a = b6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.P = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.v0(this.Q, b6Var));
        setHorizontalScrollBarEnabled(false);
        gh.f1 f1Var = new gh.f1(this, context, 16);
        this.B = f1Var;
        f1Var.setClipChildren(false);
        oz ozVar = new oz(this);
        this.f34049o0 = ozVar;
        ozVar.C = false;
        f1Var.setItemAnimator(ozVar);
        f1Var.setSelectorType(9);
        f1Var.setSelectorRadius(6);
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(this.T, b6Var));
        of.g0 g0Var = new of.g0((ViewGroup) this, 2);
        this.D = g0Var;
        f1Var.setLayoutManager(g0Var);
        new f2.h0(new uz(this)).d(f1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.C = max;
        f1Var.setPadding(max, 0, max, 0);
        f1Var.setClipToPadding(false);
        f1Var.setDrawSelectorBehind(true);
        rz rzVar = new rz(this, context);
        this.E = rzVar;
        rzVar.C(true);
        f1Var.setAdapter(rzVar);
        f1Var.setOnItemClickListener(new mz(this));
        f1Var.setOnItemLongClickListener(new mz(this));
        f1Var.setOnScrollListener(new kn(this, 3));
        f1Var.f34280v2 = true;
        f1Var.setOverScrollMode(2);
        addView(f1Var, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9, int i10, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.H == -1) {
            this.H = i9;
        }
        this.f34040f0.put(size, i9);
        this.f34041g0.put(size, i10);
        this.f34042h0.put(i9, size);
        int i11 = this.H;
        if (i11 != -1 && i11 == i9) {
            this.G = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f34032b;
        sz szVar = new sz(this, i9, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        szVar.f32575e = z11;
        szVar.f32576f = z12;
        this.I = org.telegram.messenger.l0.C(24.0f, szVar.a(true), this.I);
        arrayList2.add(szVar);
    }

    public final void b(int i9, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.f34060x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V = i9;
        this.W = i10;
        this.f34031a0 = i11;
        this.f34033b0 = i13;
        this.T = i12;
        this.B.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(i12, this.f34030a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34060x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f34056t0, 0.0f, 1.0f));
        this.f34060x.setDuration(320L);
        this.f34060x.addListener(new org.telegram.ui.xp(this, 28));
        this.f34060x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vz.c():void");
    }

    public final sz d() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                if (((sz) arrayList.get(i9)).f32575e) {
                    return (sz) arrayList.get(i9);
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f34058v0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vz.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i9) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.O != i9 && i9 >= 0 && i9 < arrayList.size()) {
            this.O = i9;
            this.B.x0(i9);
        }
    }

    public final void f(sz szVar, int i9) {
        boolean z10;
        if (szVar.f32576f) {
            qz qzVar = this.F;
            if (qzVar != null) {
                ((org.telegram.ui.dw) qzVar).c(szVar, false);
                return;
            }
            return;
        }
        int i10 = this.G;
        if (i10 < i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = -1;
        this.m0 = i10;
        this.f34048n0 = this.H;
        this.G = i9;
        this.H = szVar.f32572a;
        boolean z11 = this.K;
        m.i3 i3Var = this.f34053r0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            this.K = false;
        }
        this.f34046l0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(i3Var, 16L);
        qz qzVar2 = this.F;
        if (qzVar2 != null) {
            ((org.telegram.ui.dw) qzVar2).c(szVar, z10);
        }
        e(i9);
    }

    public final void g(float f10, int i9) {
        int i10 = this.f34042h0.get(i9, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.M = i10;
                this.N = i9;
            } else {
                this.M = -1;
                this.N = -1;
            }
            this.L = f10;
            gh.f1 f1Var = this.B;
            f1Var.f1();
            f1Var.invalidate();
            invalidate();
            e(i10);
            if (f10 >= 1.0f) {
                this.M = -1;
                this.N = -1;
                this.G = i10;
                this.H = i9;
            }
        }
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getCurrentTabStableId() {
        return this.f34041g0.get(this.G, -1);
    }

    public int getDefaultTabId() {
        sz d = d();
        if (d == null) {
            return -1;
        }
        return d.f32572a;
    }

    public int getFirstTabId() {
        return this.f34040f0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f34040f0.get(getTabsCount() - 1, 0);
    }

    public wk0 getListView() {
        return this.B;
    }

    public int getSelectorColorKey() {
        return this.T;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public wk0 getTabsContainer() {
        return this.B;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i9) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.f34041g0.get(i10, -1) == i9) {
                this.G = i10;
                this.H = this.f34040f0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i9) {
        int i10 = 0;
        while (true) {
            gh.f1 f1Var = this.B;
            if (i10 < f1Var.getChildCount()) {
                if (f1Var.getChildAt(i10) instanceof tz) {
                    tz tzVar = (tz) f1Var.getChildAt(i10);
                    if (tzVar.f32841b.f32572a == i9) {
                        tzVar.b(1.0f, 0);
                        try {
                            tzVar.performHapticFeedback(3);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.f34045k0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.f34043i0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f34044j0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i9 = this.C;
        for (int i10 = 0; i10 < size; i10++) {
            int a2 = ((sz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a2);
            sparseIntArray3.put(i10, ((sz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.J / 2) + i9);
            i9 += AndroidUtilities.dp(24.0f) + a2 + this.J;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        if (this.f34035c0 != i13) {
            this.f34035c0 = i13;
            this.O = -1;
            if (this.K) {
                AndroidUtilities.cancelRunOnUIThread(this.f34053r0);
                this.K = false;
                setEnabled(true);
                qz qzVar = this.F;
                if (qzVar != null) {
                    ((org.telegram.ui.dw) qzVar).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i9) - (this.C * 2);
            sz d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                if (this.I > size) {
                    i11 = R.string.FilterAllChatsShort;
                } else {
                    i11 = R.string.FilterAllChats;
                }
                d.b(LocaleController.getString(i11));
                int a3 = d.a(false) + (this.I - a2);
                int i13 = this.J;
                if (a3 < size) {
                    i12 = (size - a3) / arrayList.size();
                } else {
                    i12 = 0;
                }
                this.J = i12;
                if (i13 != i12) {
                    this.A = true;
                    gh.f1 f1Var = this.B;
                    f2.w0 itemAnimator = f1Var.getItemAnimator();
                    f1Var.setItemAnimator(null);
                    this.E.l();
                    f1Var.setItemAnimator(itemAnimator);
                    this.A = false;
                }
                j();
                this.f34036d0 = false;
            }
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Path path = this.f34058v0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i9 - AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.A) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        gh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        invalidate();
        qz qzVar = this.F;
        if (qzVar != null) {
            ((org.telegram.ui.dw) qzVar).b(f10);
        }
    }

    public void setBlurredBackground(kg.d dVar) {
        this.f34057u0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(qz qzVar) {
        this.F = qzVar;
    }

    public void setIsEditing(boolean z10) {
        this.f34047n = z10;
        this.f34054s = true;
        gh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        this.E.l();
        invalidate();
        if (!this.f34047n && this.f34061y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i9 = 0; i9 < size; i9++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i9);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f19649id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new ih.q5(11));
            this.f34061y = false;
        }
    }
}
