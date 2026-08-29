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
public abstract class f00 extends FrameLayout {
    public static final int f28225w0 = 0;
    public boolean A;
    public final jh.e1 B;
    public final int C;
    public final org.telegram.ui.vq D;
    public final b00 E;
    public a00 F;
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
    public final org.telegram.ui.ActionBar.c6 f28226a;
    public int f28227a0;
    public final TextPaint f28228b;
    public int f28229b0;
    public final TextPaint f28230c;
    public int f28231c0;
    public final TextPaint d;
    public boolean f28232d0;
    public final Paint f28233e;
    public final jr f28234e0;
    public PorterDuffColorFilter f28235f;
    public final SparseIntArray f28236f0;
    public final SparseIntArray f28237g0;
    public final ArrayList h;
    public final SparseIntArray f28238h0;
    public final SparseIntArray f28239i0;
    public final SparseIntArray f28240j0;
    public final SparseIntArray f28241k0;
    public float f28242l0;
    public int m0;
    public boolean f28243n;
    public int f28244n0;
    public final xz f28245o0;
    public Drawable f28246p0;
    public int f28247q0;
    public long f28248r;
    public final lh.m7 f28249r0;
    public boolean f28250s;
    public float f28251s0;
    public final org.telegram.ui.Cells.b2 f28252t0;
    public ng.d f28253u0;
    public float v;
    public final Path f28254v0;
    public float f28255w;
    public AnimatorSet f28256x;
    public boolean f28257y;

    public f00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f28228b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f28230c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f28233e = new Paint(1);
        this.f28235f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.g6.K8;
        this.R = org.telegram.ui.ActionBar.g6.I8;
        this.S = org.telegram.ui.ActionBar.g6.J8;
        this.T = org.telegram.ui.ActionBar.g6.L8;
        this.U = org.telegram.ui.ActionBar.g6.f23329s8;
        this.V = -1;
        this.W = -1;
        this.f28227a0 = -1;
        this.f28229b0 = -1;
        this.f28234e0 = jr.h;
        this.f28236f0 = new SparseIntArray(5);
        this.f28237g0 = new SparseIntArray(5);
        this.f28238h0 = new SparseIntArray(5);
        this.f28239i0 = new SparseIntArray(5);
        this.f28240j0 = new SparseIntArray(5);
        this.f28241k0 = new SparseIntArray(5);
        this.f28249r0 = new lh.m7(this, 22);
        this.f28252t0 = new org.telegram.ui.Cells.b2(3, this);
        this.f28254v0 = new Path();
        this.f28226a = c6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.v0(this.Q, c6Var));
        setHorizontalScrollBarEnabled(false);
        jh.e1 e1Var = new jh.e1(this, context, 15);
        this.B = e1Var;
        e1Var.setClipChildren(false);
        xz xzVar = new xz(this);
        this.f28245o0 = xzVar;
        xzVar.C = false;
        e1Var.setItemAnimator(xzVar);
        e1Var.setSelectorType(9);
        e1Var.setSelectorRadius(6);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 1);
        this.D = vqVar;
        e1Var.setLayoutManager(vqVar);
        new f2.e0(new e00(this)).d(e1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.C = max;
        e1Var.setPadding(max, 0, max, 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        b00 b00Var = new b00(this, context);
        this.E = b00Var;
        b00Var.C(true);
        e1Var.setAdapter(b00Var);
        e1Var.setOnItemClickListener(new vz(this));
        e1Var.setOnItemLongClickListener(new vz(this));
        e1Var.setOnScrollListener(new cg.g2(this, 29));
        e1Var.f29729v2 = true;
        e1Var.setOverScrollMode(2);
        addView(e1Var, i7.f6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.H == -1) {
            this.H = i10;
        }
        this.f28236f0.put(size, i10);
        this.f28237g0.put(size, i11);
        this.f28238h0.put(i10, size);
        int i12 = this.H;
        if (i12 != -1 && i12 == i10) {
            this.G = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f28228b;
        c00 c00Var = new c00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        c00Var.f27254e = z11;
        c00Var.f27255f = z12;
        this.I = org.telegram.messenger.x3.C(24.0f, c00Var.a(true), this.I);
        arrayList2.add(c00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f28256x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V = i10;
        this.W = i11;
        this.f28227a0 = i12;
        this.f28229b0 = i14;
        this.T = i13;
        this.B.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(i13, this.f28226a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28256x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f28252t0, 0.0f, 1.0f));
        this.f28256x.setDuration(320L);
        this.f28256x.addListener(new zz(this, 0));
        this.f28256x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f00.c():void");
    }

    public final c00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((c00) arrayList.get(i10)).f27254e) {
                    return (c00) arrayList.get(i10);
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
        canvas.clipPath(this.f28254v0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f00.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.O != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.O = i10;
            this.B.x0(i10);
        }
    }

    public final void f(c00 c00Var, int i10) {
        boolean z10;
        if (c00Var.f27255f) {
            a00 a00Var = this.F;
            if (a00Var != null) {
                ((org.telegram.ui.fw) a00Var).c(c00Var, false);
                return;
            }
            return;
        }
        int i11 = this.G;
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = -1;
        this.m0 = i11;
        this.f28244n0 = this.H;
        this.G = i10;
        this.H = c00Var.f27251a;
        boolean z11 = this.K;
        lh.m7 m7Var = this.f28249r0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            this.K = false;
        }
        this.f28242l0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(m7Var, 16L);
        a00 a00Var2 = this.F;
        if (a00Var2 != null) {
            ((org.telegram.ui.fw) a00Var2).c(c00Var, z10);
        }
        e(i10);
    }

    public final void g(float f9, int i10) {
        int i11 = this.f28238h0.get(i10, -1);
        if (i11 >= 0) {
            if (f9 < 0.0f) {
                f9 = 0.0f;
            } else if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (f9 > 0.0f) {
                this.M = i11;
                this.N = i10;
            } else {
                this.M = -1;
                this.N = -1;
            }
            this.L = f9;
            jh.e1 e1Var = this.B;
            e1Var.f1();
            e1Var.invalidate();
            invalidate();
            e(i11);
            if (f9 >= 1.0f) {
                this.M = -1;
                this.N = -1;
                this.G = i11;
                this.H = i10;
            }
        }
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getCurrentTabStableId() {
        return this.f28237g0.get(this.G, -1);
    }

    public int getDefaultTabId() {
        c00 d = d();
        if (d == null) {
            return -1;
        }
        return d.f27251a;
    }

    public int getFirstTabId() {
        return this.f28236f0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f28236f0.get(getTabsCount() - 1, 0);
    }

    public jl0 getListView() {
        return this.B;
    }

    public int getSelectorColorKey() {
        return this.T;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public jl0 getTabsContainer() {
        return this.B;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f28237g0.get(i11, -1) == i10) {
                this.G = i11;
                this.H = this.f28236f0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            jh.e1 e1Var = this.B;
            if (i11 < e1Var.getChildCount()) {
                if (e1Var.getChildAt(i11) instanceof d00) {
                    d00 d00Var = (d00) e1Var.getChildAt(i11);
                    if (d00Var.f27608b.f27251a == i10) {
                        d00Var.b(1.0f, 0);
                        try {
                            d00Var.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f28241k0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.f28239i0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f28240j0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.C;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((c00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((c00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.J / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.J;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f28231c0 != i14) {
            this.f28231c0 = i14;
            this.O = -1;
            if (this.K) {
                AndroidUtilities.cancelRunOnUIThread(this.f28249r0);
                this.K = false;
                setEnabled(true);
                a00 a00Var = this.F;
                if (a00Var != null) {
                    ((org.telegram.ui.fw) a00Var).b(1.0f);
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
            int size = View.MeasureSpec.getSize(i10) - (this.C * 2);
            c00 d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                if (this.I > size) {
                    i12 = R.string.FilterAllChatsShort;
                } else {
                    i12 = R.string.FilterAllChats;
                }
                d.b(LocaleController.getString(i12));
                int a10 = d.a(false) + (this.I - a2);
                int i14 = this.J;
                if (a10 < size) {
                    i13 = (size - a10) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.J = i13;
                if (i14 != i13) {
                    this.A = true;
                    jh.e1 e1Var = this.B;
                    f2.u0 itemAnimator = e1Var.getItemAnimator();
                    e1Var.setItemAnimator(null);
                    this.E.l();
                    e1Var.setItemAnimator(itemAnimator);
                    this.A = false;
                }
                j();
                this.f28232d0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f28254v0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.A) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f9) {
        this.L = f9;
        jh.e1 e1Var = this.B;
        e1Var.f1();
        e1Var.invalidate();
        invalidate();
        a00 a00Var = this.F;
        if (a00Var != null) {
            ((org.telegram.ui.fw) a00Var).b(f9);
        }
    }

    public void setBlurredBackground(ng.d dVar) {
        this.f28253u0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(a00 a00Var) {
        this.F = a00Var;
    }

    public void setIsEditing(boolean z10) {
        this.f28243n = z10;
        this.f28250s = true;
        jh.e1 e1Var = this.B;
        e1Var.f1();
        e1Var.invalidate();
        this.E.l();
        invalidate();
        if (!this.f28243n && this.f28257y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f19620id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new lh.o5(11));
            this.f28257y = false;
        }
    }
}
