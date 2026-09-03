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
    public static final int f26089x0 = 0;
    public boolean B;
    public final lh.e1 C;
    public final int D;
    public final org.telegram.ui.dr E;
    public final g00 F;
    public f00 G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public float M;
    public int N;
    public int O;
    public int P;
    public final GradientDrawable Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.f6 f26090a;
    public int f26091a0;
    public final TextPaint f26092b;
    public int f26093b0;
    public final TextPaint f26094c;
    public int f26095c0;
    public final TextPaint d;
    public int f26096d0;
    public final Paint e;
    public boolean f26097e0;
    public PorterDuffColorFilter f26098f;
    public final mr f26099f0;
    public final SparseIntArray f26100g0;
    public final ArrayList h;
    public final SparseIntArray f26101h0;
    public final SparseIntArray f26102i0;
    public final SparseIntArray f26103j0;
    public final SparseIntArray f26104k0;
    public final SparseIntArray f26105l0;
    public float m0;
    public boolean f26106n;
    public int f26107n0;
    public int f26108o0;
    public final d00 f26109p0;
    public Drawable f26110q0;
    public long f26111r;
    public int f26112r0;
    public boolean f26113s;
    public final m2.b f26114s0;
    public float f26115t0;
    public final org.telegram.ui.Cells.b2 f26116u0;
    public float v;
    public pg.b f26117v0;
    public float f26118w;
    public final Path f26119w0;
    public AnimatorSet f26120x;
    public boolean f26121y;

    public k00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f26092b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f26094c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f26098f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.I = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.R = org.telegram.ui.ActionBar.j6.K8;
        this.S = org.telegram.ui.ActionBar.j6.I8;
        this.T = org.telegram.ui.ActionBar.j6.J8;
        this.U = org.telegram.ui.ActionBar.j6.L8;
        this.V = org.telegram.ui.ActionBar.j6.f20151s8;
        this.W = -1;
        this.f26091a0 = -1;
        this.f26093b0 = -1;
        this.f26095c0 = -1;
        this.f26099f0 = mr.h;
        this.f26100g0 = new SparseIntArray(5);
        this.f26101h0 = new SparseIntArray(5);
        this.f26102i0 = new SparseIntArray(5);
        this.f26103j0 = new SparseIntArray(5);
        this.f26104k0 = new SparseIntArray(5);
        this.f26105l0 = new SparseIntArray(5);
        this.f26114s0 = new m2.b(this, 21);
        this.f26116u0 = new org.telegram.ui.Cells.b2(3, this);
        this.f26119w0 = new Path();
        this.f26090a = f6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.Q = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.R, f6Var));
        setHorizontalScrollBarEnabled(false);
        lh.e1 e1Var = new lh.e1(this, context, 14);
        this.C = e1Var;
        e1Var.setClipChildren(false);
        d00 d00Var = new d00(this);
        this.f26109p0 = d00Var;
        d00Var.C = false;
        e1Var.setItemAnimator(d00Var);
        e1Var.setSelectorType(9);
        e1Var.setSelectorRadius(6);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.U, f6Var));
        org.telegram.ui.dr drVar = new org.telegram.ui.dr((ViewGroup) this, 1);
        this.E = drVar;
        e1Var.setLayoutManager(drVar);
        new f2.e0(new j00(this)).d(e1Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.D = max;
        e1Var.setPadding(max, 0, max, 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        g00 g00Var = new g00(this, context);
        this.F = g00Var;
        g00Var.C(true);
        e1Var.setAdapter(g00Var);
        e1Var.setOnItemClickListener(new b00(this));
        e1Var.setOnItemLongClickListener(new b00(this));
        e1Var.setOnScrollListener(new eg.f2(this, 27));
        e1Var.f28531w2 = true;
        e1Var.setOverScrollMode(2);
        addView(e1Var, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z4, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.I == -1) {
            this.I = i10;
        }
        this.f26100g0.put(size, i10);
        this.f26101h0.put(size, i11);
        this.f26102i0.put(i10, size);
        int i12 = this.I;
        if (i12 != -1 && i12 == i10) {
            this.H = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f26092b;
        h00 h00Var = new h00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z4);
        h00Var.e = z10;
        h00Var.f25283f = z11;
        this.J = org.telegram.messenger.y3.C(24.0f, h00Var.a(true), this.J);
        arrayList2.add(h00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f26120x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.W = i10;
        this.f26091a0 = i11;
        this.f26093b0 = i12;
        this.f26095c0 = i14;
        this.U = i13;
        this.C.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i13, this.f26090a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26120x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f26116u0, 0.0f, 1.0f));
        this.f26120x.setDuration(320L);
        this.f26120x.addListener(new a9(this, 21));
        this.f26120x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k00.c():void");
    }

    public final h00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((h00) arrayList.get(i10)).e) {
                    return (h00) arrayList.get(i10);
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
        canvas.clipPath(this.f26119w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k00.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.P != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.P = i10;
            this.C.x0(i10);
        }
    }

    public final void f(h00 h00Var, int i10) {
        boolean z4;
        if (h00Var.f25283f) {
            f00 f00Var = this.G;
            if (f00Var != null) {
                ((org.telegram.ui.qw) f00Var).c(h00Var, false);
                return;
            }
            return;
        }
        int i11 = this.H;
        if (i11 < i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.P = -1;
        this.f26107n0 = i11;
        this.f26108o0 = this.I;
        this.H = i10;
        this.I = h00Var.f25280a;
        boolean z10 = this.L;
        m2.b bVar = this.f26114s0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.L = false;
        }
        this.m0 = 0.0f;
        this.M = 0.0f;
        this.L = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(bVar, 16L);
        f00 f00Var2 = this.G;
        if (f00Var2 != null) {
            ((org.telegram.ui.qw) f00Var2).c(h00Var, z4);
        }
        e(i10);
    }

    public final void g(float f10, int i10) {
        int i11 = this.f26102i0.get(i10, -1);
        if (i11 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.N = i11;
                this.O = i10;
            } else {
                this.N = -1;
                this.O = -1;
            }
            this.M = f10;
            lh.e1 e1Var = this.C;
            e1Var.e1();
            e1Var.invalidate();
            invalidate();
            e(i11);
            if (f10 >= 1.0f) {
                this.N = -1;
                this.O = -1;
                this.H = i11;
                this.I = i10;
            }
        }
    }

    public int getCurrentTabId() {
        return this.I;
    }

    public int getCurrentTabStableId() {
        return this.f26101h0.get(this.H, -1);
    }

    public int getDefaultTabId() {
        h00 d = d();
        if (d == null) {
            return -1;
        }
        return d.f25280a;
    }

    public int getFirstTabId() {
        return this.f26100g0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f26100g0.get(getTabsCount() - 1, 0);
    }

    public rl0 getListView() {
        return this.C;
    }

    public int getSelectorColorKey() {
        return this.U;
    }

    public Drawable getSelectorDrawable() {
        return this.Q;
    }

    public rl0 getTabsContainer() {
        return this.C;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f26101h0.get(i11, -1) == i10) {
                this.H = i11;
                this.I = this.f26100g0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            lh.e1 e1Var = this.C;
            if (i11 < e1Var.getChildCount()) {
                if (e1Var.getChildAt(i11) instanceof i00) {
                    i00 i00Var = (i00) e1Var.getChildAt(i11);
                    if (i00Var.f25534b.f25280a == i10) {
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
        SparseIntArray sparseIntArray = this.f26105l0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.f26103j0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f26104k0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.D;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((h00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((h00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.K / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.K;
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f26096d0 != i14) {
            this.f26096d0 = i14;
            this.P = -1;
            if (this.L) {
                AndroidUtilities.cancelRunOnUIThread(this.f26114s0);
                this.L = false;
                setEnabled(true);
                f00 f00Var = this.G;
                if (f00Var != null) {
                    ((org.telegram.ui.qw) f00Var).b(1.0f);
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
            int size = View.MeasureSpec.getSize(i10) - (this.D * 2);
            h00 d = d();
            if (d != null) {
                d.b(LocaleController.getString(R.string.FilterAllChats));
                int a2 = d.a(false);
                if (this.J > size) {
                    i12 = R.string.FilterAllChatsShort;
                } else {
                    i12 = R.string.FilterAllChats;
                }
                d.b(LocaleController.getString(i12));
                int a10 = d.a(false) + (this.J - a2);
                int i14 = this.K;
                if (a10 < size) {
                    i13 = (size - a10) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.K = i13;
                if (i14 != i13) {
                    this.B = true;
                    lh.e1 e1Var = this.C;
                    f2.t0 itemAnimator = e1Var.getItemAnimator();
                    e1Var.setItemAnimator(null);
                    this.F.l();
                    e1Var.setItemAnimator(itemAnimator);
                    this.B = false;
                }
                j();
                this.f26097e0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f26119w0;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.B) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.M = f10;
        lh.e1 e1Var = this.C;
        e1Var.e1();
        e1Var.invalidate();
        invalidate();
        f00 f00Var = this.G;
        if (f00Var != null) {
            ((org.telegram.ui.qw) f00Var).b(f10);
        }
    }

    public void setBlurredBackground(pg.b bVar) {
        this.f26117v0 = bVar;
        setBackground(bVar);
    }

    public void setDelegate(f00 f00Var) {
        this.G = f00Var;
    }

    public void setIsEditing(boolean z4) {
        this.f26106n = z4;
        this.f26113s = true;
        lh.e1 e1Var = this.C;
        e1Var.e1();
        e1Var.invalidate();
        this.F.l();
        invalidate();
        if (!this.f26106n && this.f26121y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f16649id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new nh.p5(10));
            this.f26121y = false;
        }
    }
}
