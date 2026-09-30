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
public abstract class n00 extends FrameLayout {
    public static final int A0 = 0;
    public boolean E;
    public final ai.w0 F;
    public final int G;
    public final gg.j0 H;
    public final i00 I;
    public h00 J;
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
    public final org.telegram.ui.ActionBar.d6 f26476a;
    public int f26477a0;
    public final TextPaint f26478b;
    public int f26479b0;
    public final TextPaint f26480c;
    public int f26481c0;
    public final TextPaint d;
    public int f26482d0;
    public final Paint e;
    public int f26483e0;
    public PorterDuffColorFilter f26484f;
    public int f26485f0;
    public int f26486g0;
    public final ArrayList h;
    public boolean f26487h0;
    public final tr f26488i0;
    public final SparseIntArray f26489j0;
    public final SparseIntArray f26490k0;
    public final SparseIntArray f26491l0;
    public final SparseIntArray m0;
    public boolean f26492n;
    public final SparseIntArray f26493n0;
    public final SparseIntArray f26494o0;
    public float f26495p0;
    public int f26496q0;
    public long f26497r;
    public int f26498r0;
    public boolean f26499s;
    public final f00 f26500s0;
    public Drawable f26501t0;
    public int f26502u0;
    public float v;
    public final org.telegram.ui.Cells.t6 f26503v0;
    public float f26504w;
    public float f26505w0;
    public AnimatorSet f26506x;
    public final org.telegram.ui.Cells.d2 f26507x0;
    public boolean f26508y;
    public ch.d f26509y0;
    public final Path f26510z0;

    public n00(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f26478b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f26480c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f26484f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.h6.K8;
        this.V = org.telegram.ui.ActionBar.h6.I8;
        this.W = org.telegram.ui.ActionBar.h6.J8;
        this.f26477a0 = org.telegram.ui.ActionBar.h6.L8;
        this.f26479b0 = org.telegram.ui.ActionBar.h6.f19354s8;
        this.f26481c0 = -1;
        this.f26482d0 = -1;
        this.f26483e0 = -1;
        this.f26485f0 = -1;
        this.f26488i0 = tr.h;
        this.f26489j0 = new SparseIntArray(5);
        this.f26490k0 = new SparseIntArray(5);
        this.f26491l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f26493n0 = new SparseIntArray(5);
        this.f26494o0 = new SparseIntArray(5);
        this.f26503v0 = new org.telegram.ui.Cells.t6(this, 13);
        this.f26507x0 = new org.telegram.ui.Cells.d2(3, this);
        this.f26510z0 = new Path();
        this.f26476a = d6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.h6.v0(this.U, d6Var));
        setHorizontalScrollBarEnabled(false);
        ai.w0 w0Var = new ai.w0(this, context, 16);
        this.F = w0Var;
        w0Var.setClipChildren(false);
        f00 f00Var = new f00(this);
        this.f26500s0 = f00Var;
        f00Var.C = false;
        w0Var.setItemAnimator(f00Var);
        w0Var.setSelectorType(9);
        w0Var.setSelectorRadius(6);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(this.f26477a0, d6Var));
        gg.j0 j0Var = new gg.j0((ViewGroup) this, 2);
        this.H = j0Var;
        w0Var.setLayoutManager(j0Var);
        new s4.y(new m00(this)).e(w0Var);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.G = max;
        w0Var.setPadding(max, 0, max, 0);
        w0Var.setClipToPadding(false);
        w0Var.setDrawSelectorBehind(true);
        i00 i00Var = new i00(this, context);
        this.I = i00Var;
        i00Var.C(true);
        w0Var.setAdapter(i00Var);
        w0Var.setOnItemClickListener(new d00(this));
        w0Var.setOnItemLongClickListener(new d00(this));
        w0Var.setOnScrollListener(new ai.r(this, 26));
        w0Var.f31035z2 = true;
        w0Var.setOverScrollMode(2);
        addView(w0Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.f26489j0.put(size, i10);
        this.f26490k0.put(size, i11);
        this.f26491l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f26478b;
        j00 j00Var = new j00(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        j00Var.e = z11;
        j00Var.f25254f = z12;
        this.M = org.telegram.messenger.f0.C(24.0f, j00Var.a(true), this.M);
        arrayList2.add(j00Var);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f26506x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f26481c0 = i10;
        this.f26482d0 = i11;
        this.f26483e0 = i12;
        this.f26485f0 = i14;
        this.f26477a0 = i13;
        this.F.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(i13, this.f26476a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26506x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f26507x0, 0.0f, 1.0f));
        this.f26506x.setDuration(320L);
        this.f26506x.addListener(new r8(this, 22));
        this.f26506x.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n00.c():void");
    }

    public final j00 d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((j00) arrayList.get(i10)).e) {
                    return (j00) arrayList.get(i10);
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
        canvas.clipPath(this.f26510z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r18, android.view.View r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n00.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.S = i10;
            this.F.y0(i10);
        }
    }

    public final void f(j00 j00Var, int i10) {
        boolean z10;
        if (j00Var.f25254f) {
            h00 h00Var = this.J;
            if (h00Var != null) {
                ((org.telegram.ui.pw) h00Var).c(j00Var, false);
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
        this.f26496q0 = i11;
        this.f26498r0 = this.L;
        this.K = i10;
        this.L = j00Var.f25251a;
        boolean z11 = this.O;
        org.telegram.ui.Cells.t6 t6Var = this.f26503v0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            this.O = false;
        }
        this.f26495p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(t6Var, 16L);
        h00 h00Var2 = this.J;
        if (h00Var2 != null) {
            ((org.telegram.ui.pw) h00Var2).c(j00Var, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.f26491l0.get(i10, -1);
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
            ai.w0 w0Var = this.F;
            w0Var.h1();
            w0Var.invalidate();
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
        return this.f26490k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        j00 d = d();
        if (d == null) {
            return -1;
        }
        return d.f25251a;
    }

    public int getFirstTabId() {
        return this.f26489j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f26489j0.get(getTabsCount() - 1, 0);
    }

    public zl0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f26477a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public zl0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f26490k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.f26489j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            ai.w0 w0Var = this.F;
            if (i11 < w0Var.getChildCount()) {
                if (w0Var.getChildAt(i11) instanceof l00) {
                    l00 l00Var = (l00) w0Var.getChildAt(i11);
                    if (l00Var.f25846b.f25251a == i10) {
                        l00Var.b(1.0f, 0);
                        try {
                            l00Var.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f26494o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f26493n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((j00) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((j00) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += AndroidUtilities.dp(24.0f) + a2 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f26486g0 != i14) {
            this.f26486g0 = i14;
            this.S = -1;
            if (this.O) {
                AndroidUtilities.cancelRunOnUIThread(this.f26503v0);
                this.O = false;
                setEnabled(true);
                h00 h00Var = this.J;
                if (h00Var != null) {
                    ((org.telegram.ui.pw) h00Var).b(1.0f);
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
            j00 d = d();
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
                    ai.w0 w0Var = this.F;
                    s4.m0 itemAnimator = w0Var.getItemAnimator();
                    w0Var.setItemAnimator(null);
                    this.I.l();
                    w0Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.f26487h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f26510z0;
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
        ai.w0 w0Var = this.F;
        w0Var.h1();
        w0Var.invalidate();
        invalidate();
        h00 h00Var = this.J;
        if (h00Var != null) {
            ((org.telegram.ui.pw) h00Var).b(f7);
        }
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f26509y0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(h00 h00Var) {
        this.J = h00Var;
    }

    public void setIsEditing(boolean z10) {
        this.f26492n = z10;
        this.f26499s = true;
        ai.w0 w0Var = this.F;
        w0Var.h1();
        w0Var.invalidate();
        this.I.l();
        invalidate();
        if (!this.f26492n && this.f26508y) {
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                if (dialogFilter.isDefault()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f15849id));
                }
            }
            MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new ai.u7(14));
            this.f26508y = false;
        }
    }
}
