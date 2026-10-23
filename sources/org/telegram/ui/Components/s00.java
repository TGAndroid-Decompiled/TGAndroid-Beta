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
public abstract class s00 extends FrameLayout {
    public static final int A0 = 0;
    public boolean E;
    public final ai.u1 F;
    public final int G;
    public final hg.i0 H;
    public final o00 I;
    public n00 J;
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
    public final org.telegram.ui.ActionBar.g6 f30304a;
    public int f30305a0;
    public final TextPaint f30306b;
    public int f30307b0;
    public final TextPaint f30308c;
    public int f30309c0;
    public final TextPaint d;
    public int f30310d0;
    public final Paint e;
    public int f30311e0;
    public PorterDuffColorFilter f30312f;
    public int f30313f0;
    public int f30314g0;
    public final ArrayList h;
    public boolean f30315h0;
    public final bs f30316i0;
    public final SparseIntArray f30317j0;
    public final SparseIntArray f30318k0;
    public final SparseIntArray f30319l0;
    public final SparseIntArray m0;
    public boolean f30320n;
    public final SparseIntArray f30321n0;
    public final SparseIntArray f30322o0;
    public float f30323p0;
    public int f30324q0;
    public long f30325r;
    public int f30326r0;
    public boolean f30327s;
    public final l00 f30328s0;
    public Drawable f30329t0;
    public int f30330u0;
    public float v;
    public final org.telegram.ui.Cells.u5 f30331v0;
    public float f30332w;
    public float f30333w0;
    public AnimatorSet f30334x;
    public final org.telegram.ui.Cells.c2 f30335x0;
    public boolean f30336y;
    public dh.d f30337y0;
    public final Path f30338z0;

    public s00(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f30306b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f30308c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f30312f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.k6.K8;
        this.V = org.telegram.ui.ActionBar.k6.I8;
        this.W = org.telegram.ui.ActionBar.k6.J8;
        this.f30305a0 = org.telegram.ui.ActionBar.k6.L8;
        this.f30307b0 = org.telegram.ui.ActionBar.k6.f21462s8;
        this.f30309c0 = -1;
        this.f30310d0 = -1;
        this.f30311e0 = -1;
        this.f30313f0 = -1;
        this.f30316i0 = bs.h;
        this.f30317j0 = new SparseIntArray(5);
        this.f30318k0 = new SparseIntArray(5);
        this.f30319l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f30321n0 = new SparseIntArray(5);
        this.f30322o0 = new SparseIntArray(5);
        this.f30331v0 = new org.telegram.ui.Cells.u5(this, 13);
        this.f30335x0 = new org.telegram.ui.Cells.c2(3, this);
        this.f30338z0 = new Path();
        this.f30304a = g6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.U, g6Var));
        setHorizontalScrollBarEnabled(false);
        ai.u1 u1Var = new ai.u1(this, context, 17);
        this.F = u1Var;
        u1Var.setClipChildren(false);
        l00 l00Var = new l00(this);
        this.f30328s0 = l00Var;
        l00Var.C = false;
        u1Var.setItemAnimator(l00Var);
        u1Var.setSelectorType(9);
        u1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.r6.m(u1Var, 20, this.f30305a0, g6Var);
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 2);
        this.H = i0Var;
        u1Var.setLayoutManager(i0Var);
        new s4.y(new r00(this)).d(u1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.G = max;
        u1Var.setPadding(max, 0, max, 0);
        u1Var.setClipToPadding(false);
        u1Var.setDrawSelectorBehind(true);
        o00 o00Var = new o00(this, context);
        this.I = o00Var;
        o00Var.C(true);
        u1Var.setAdapter(o00Var);
        u1Var.setOnItemClickListener(new j00(this));
        u1Var.setOnItemLongClickListener(new j00(this));
        u1Var.setOnScrollListener(new kv(this, 1));
        u1Var.f28727y2 = true;
        u1Var.setOverScrollMode(2);
        addView(u1Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.f30317j0.put(size, i10);
        this.f30318k0.put(size, i11);
        this.f30319l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f30306b;
        p00 p00Var = new p00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        p00Var.e = z11;
        p00Var.f29377f = z12;
        this.M = org.telegram.messenger.v0.C(24.0f, p00Var.a(true), this.M);
        arrayList2.add(p00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f30334x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f30309c0 = i10;
        this.f30310d0 = i11;
        this.f30311e0 = i12;
        this.f30313f0 = i14;
        this.f30305a0 = i13;
        org.telegram.ui.ActionBar.r6.L(this.F, i13, this.f30304a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30334x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f30335x0, 0.0f, 1.0f));
        this.f30334x.setDuration(320L);
        this.f30334x.addListener(new org.telegram.ui.pq(this, 28));
        this.f30334x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s00.c():void");
    }

    public final p00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((p00) arrayList.get(i10)).e) {
                    return (p00) arrayList.get(i10);
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
        canvas.clipPath(this.f30338z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s00.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.S = i10;
            this.F.x0(i10);
        }
    }

    public final void f(p00 p00Var, int i10) {
        boolean z10;
        if (p00Var.f29377f) {
            n00 n00Var = this.J;
            if (n00Var != null) {
                ((org.telegram.ui.dw) n00Var).c(p00Var, false);
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
        this.f30324q0 = i11;
        this.f30326r0 = this.L;
        this.K = i10;
        this.L = p00Var.f29374a;
        boolean z11 = this.O;
        org.telegram.ui.Cells.u5 u5Var = this.f30331v0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            this.O = false;
        }
        this.f30323p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(u5Var, 16L);
        n00 n00Var2 = this.J;
        if (n00Var2 != null) {
            ((org.telegram.ui.dw) n00Var2).c(p00Var, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.f30319l0.get(i10, -1);
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
            ai.u1 u1Var = this.F;
            u1Var.g1();
            u1Var.invalidate();
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
        return this.f30318k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        p00 d = d();
        if (d == null) {
            return -1;
        }
        return d.f29374a;
    }

    public int getFirstTabId() {
        return this.f30317j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f30317j0.get(getTabsCount() - 1, 0);
    }

    public mm0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f30305a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public mm0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f30318k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.f30317j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            ai.u1 u1Var = this.F;
            if (i11 < u1Var.getChildCount()) {
                if (u1Var.getChildAt(i11) instanceof q00) {
                    q00 q00Var = (q00) u1Var.getChildAt(i11);
                    if (q00Var.f29720b.f29374a == i10) {
                        q00Var.b(1.0f, 0);
                        try {
                            q00Var.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f30322o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f30321n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((p00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((p00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f30314g0 != i14) {
            this.f30314g0 = i14;
            this.S = -1;
            if (this.O) {
                AndroidUtilities.cancelRunOnUIThread(this.f30331v0);
                this.O = false;
                setEnabled(true);
                n00 n00Var = this.J;
                if (n00Var != null) {
                    ((org.telegram.ui.dw) n00Var).b(1.0f);
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
            p00 d = d();
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
                    ai.u1 u1Var = this.F;
                    s4.l0 itemAnimator = u1Var.getItemAnimator();
                    u1Var.setItemAnimator(null);
                    this.I.l();
                    u1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.f30315h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f30338z0;
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
        ai.u1 u1Var = this.F;
        u1Var.g1();
        u1Var.invalidate();
        invalidate();
        n00 n00Var = this.J;
        if (n00Var != null) {
            ((org.telegram.ui.dw) n00Var).b(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f30337y0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(n00 n00Var) {
        this.J = n00Var;
    }

    public void setIsEditing(boolean z10) {
        this.f30320n = z10;
        this.f30327s = true;
        ai.u1 u1Var = this.F;
        u1Var.g1();
        u1Var.invalidate();
        this.I.l();
        invalidate();
        if (!this.f30320n && this.f30336y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f17862id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new ci.d6(14));
            this.f30336y = false;
        }
    }
}
