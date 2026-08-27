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
import android.os.SystemClock;
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

public abstract class yz extends FrameLayout {

    public static final int f35067w0 = 0;
    public boolean A;
    public final hh.f1 B;
    public final int C;
    public final org.telegram.ui.vq D;
    public final uz E;
    public tz F;
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

    public final org.telegram.ui.ActionBar.c6 f35068a;

    public int f35069a0;

    public final TextPaint f35070b;

    public int f35071b0;

    public final TextPaint f35072c;

    public int f35073c0;
    public final TextPaint d;

    public boolean f35074d0;

    public final Paint f35075e;

    public final er f35076e0;

    public PorterDuffColorFilter f35077f;

    public final SparseIntArray f35078f0;

    public final SparseIntArray f35079g0;
    public final ArrayList h;

    public final SparseIntArray f35080h0;

    public final SparseIntArray f35081i0;

    public final SparseIntArray f35082j0;

    public final SparseIntArray f35083k0;

    public float f35084l0;
    public int m0;

    public boolean f35085n;

    public int f35086n0;

    public final qz f35087o0;

    public Drawable f35088p0;

    public int f35089q0;

    public long f35090r;

    public final m.i3 f35091r0;

    public boolean f35092s;

    public float f35093s0;

    public final org.telegram.ui.Cells.b2 f35094t0;

    public lg.d f35095u0;
    public float v;

    public final Path f35096v0;

    public float f35097w;

    public AnimatorSet f35098x;

    public boolean f35099y;

    public yz(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f35070b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f35072c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f35075e = new Paint(1);
        this.f35077f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.g6.K8;
        this.R = org.telegram.ui.ActionBar.g6.I8;
        this.S = org.telegram.ui.ActionBar.g6.J8;
        this.T = org.telegram.ui.ActionBar.g6.L8;
        this.U = org.telegram.ui.ActionBar.g6.f23322s8;
        this.V = -1;
        this.W = -1;
        this.f35069a0 = -1;
        this.f35071b0 = -1;
        this.f35076e0 = er.h;
        this.f35078f0 = new SparseIntArray(5);
        this.f35079g0 = new SparseIntArray(5);
        this.f35080h0 = new SparseIntArray(5);
        this.f35081i0 = new SparseIntArray(5);
        this.f35082j0 = new SparseIntArray(5);
        this.f35083k0 = new SparseIntArray(5);
        this.f35091r0 = new m.i3(this, 19);
        this.f35094t0 = new org.telegram.ui.Cells.b2(3, this);
        this.f35096v0 = new Path();
        this.f35068a = c6Var;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.P = gradientDrawable;
        float fDpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.v0(this.Q, c6Var));
        setHorizontalScrollBarEnabled(false);
        hh.f1 f1Var = new hh.f1(this, context, 16);
        this.B = f1Var;
        f1Var.setClipChildren(false);
        qz qzVar = new qz(this);
        this.f35087o0 = qzVar;
        qzVar.C = false;
        f1Var.setItemAnimator(qzVar);
        f1Var.setSelectorType(9);
        f1Var.setSelectorRadius(6);
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 1);
        this.D = vqVar;
        f1Var.setLayoutManager(vqVar);
        new f2.f0(new xz(this)).d(f1Var);
        int iMax = Math.max(0, AndroidUtilities.dp(11.5f));
        this.C = iMax;
        f1Var.setPadding(iMax, 0, iMax, 0);
        f1Var.setClipToPadding(false);
        f1Var.setDrawSelectorBehind(true);
        uz uzVar = new uz(this, context);
        this.E = uzVar;
        uzVar.C(true);
        f1Var.setAdapter(uzVar);
        f1Var.setOnItemClickListener(new oz(this));
        f1Var.setOnItemLongClickListener(new oz(this));
        f1Var.setOnScrollListener(new xm(this, 4));
        f1Var.f35297v2 = true;
        f1Var.setOverScrollMode(2);
        addView(f1Var, h7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.H == -1) {
            this.H = i10;
        }
        this.f35078f0.put(size, i10);
        this.f35079g0.put(size, i11);
        this.f35080h0.put(i10, size);
        int i12 = this.H;
        if (i12 != -1 && i12 == i10) {
            this.G = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f35070b;
        vz vzVar = new vz(this, i10, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), arrayList, textPaint.getFontMetricsInt()), z10);
        vzVar.f34075e = z11;
        vzVar.f34076f = z12;
        this.I = org.telegram.messenger.y1.C(24.0f, vzVar.a(true), this.I);
        arrayList2.add(vzVar);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f35098x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V = i10;
        this.W = i11;
        this.f35069a0 = i12;
        this.f35071b0 = i14;
        this.T = i13;
        this.B.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(i13, this.f35068a));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35098x = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f35094t0, 0.0f, 1.0f));
        this.f35098x.setDuration(320L);
        this.f35098x.addListener(new sz(this, 0));
        this.f35098x.start();
    }

    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            vz vzVar = (vz) arrayList.get(i10);
            if (vzVar.d != ((org.telegram.ui.gw) this.F).a(vzVar.f34072a)) {
                if (((org.telegram.ui.gw) this.F).a(vzVar.f34072a) < 0) {
                    continue;
                } else {
                    if (this.f35081i0.get(i10) != vzVar.a(true) || this.f35074d0) {
                        this.f35074d0 = true;
                        requestLayout();
                        this.I = 0;
                        vz vzVarD = d();
                        if (vzVarD != null) {
                            vzVarD.b(LocaleController.getString(R.string.FilterAllChats));
                        }
                        for (int i11 = 0; i11 < size; i11++) {
                            this.I = org.telegram.messenger.y1.C(24.0f, ((vz) arrayList.get(i11)).a(true), this.I);
                        }
                        z10 = true;
                        break;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.B.setItemAnimator(this.f35087o0);
            this.E.l();
        }
    }

    public final vz d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((vz) arrayList.get(i10)).f34075e) {
                return (vz) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f35096v0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        f2.o1 o1VarK;
        int i10;
        int i11;
        float f15;
        float f16;
        float fDp;
        float fMax;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        hh.f1 f1Var = this.B;
        if (view == f1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (f1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.P;
            gradientDrawable.setAlpha(alpha);
            if (this.K || this.M != -1) {
                int iL0 = this.D.L0();
                if (iL0 == -1 || (o1VarK = f1Var.K(iL0)) == null) {
                    f15 = 2.0f;
                    f16 = 0.0f;
                    fDp = 0.0f;
                    fMax = 0.0f;
                } else {
                    if (this.K) {
                        i10 = this.m0;
                        i11 = this.G;
                    } else {
                        i10 = this.G;
                        i11 = this.M;
                    }
                    SparseIntArray sparseIntArray = this.f35083k0;
                    int i12 = sparseIntArray.get(i10);
                    int i13 = sparseIntArray.get(i11);
                    f15 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.f35081i0;
                    int i14 = sparseIntArray2.get(i10);
                    int i15 = sparseIntArray2.get(i11);
                    f16 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.f35082j0;
                    float f17 = sparseIntArray3.get(i10) != 0 ? 1.0f : 0.0f;
                    float f18 = sparseIntArray3.get(i11) != 0 ? 1.0f : 0.0f;
                    fDp = this.J != 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.lerp(i12, i13, this.L) : AndroidUtilities.dp(12.0f) + (AndroidUtilities.lerp(i12, i13, this.L) - (sparseIntArray.get(iL0) - o1VarK.f5789a.getLeft()));
                    float fLerp = AndroidUtilities.lerp(i14, i15, this.L);
                    AndroidUtilities.lerp(f17, f18, this.L);
                    fMax = fLerp;
                }
            } else {
                f2.o1 o1VarK2 = f1Var.K(this.G);
                if (o1VarK2 != null) {
                    wz wzVar = (wz) o1VarK2.f5789a;
                    fMax = Math.max(AndroidUtilities.dp(16.0f), wzVar.S ? AndroidUtilities.lerp(wzVar.f34386e0, wzVar.d, wzVar.f34396x) : wzVar.d);
                    fDp = (int) com.google.android.recaptcha.internal.a.A(wzVar.S ? AndroidUtilities.lerp(wzVar.f34386e0 + AndroidUtilities.dp(20.0f), wzVar.getMeasuredWidth(), wzVar.f34396x) : wzVar.getMeasuredWidth(), fMax, 2.0f, wzVar.getX());
                    f15 = 2.0f;
                    f16 = 0.0f;
                } else {
                    f15 = 2.0f;
                    f16 = 0.0f;
                    fDp = 0.0f;
                    fMax = 0.0f;
                }
            }
            if (fMax != f16) {
                canvas.save();
                canvas.translate(f1Var.getTranslationX(), 0.0f);
                canvas.scale(f1Var.getScaleX(), 1.0f, f1Var.getX() + f1Var.getPivotX(), f1Var.getPivotY());
                float f19 = this.J / f15;
                int iDp = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                gradientDrawable.setBounds((int) ((fDp - AndroidUtilities.dp(12.5f)) - f19), iDp, (int) (fDp + fMax + AndroidUtilities.dp(12.5f) + f19), AndroidUtilities.dp(28.0f) + iDp);
                gradientDrawable.setAlpha(31);
                gradientDrawable.draw(canvas);
                canvas.restore();
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = Math.min(17L, jElapsedRealtime - this.f35090r);
        this.f35090r = jElapsedRealtime;
        boolean z10 = this.f35085n;
        boolean z11 = false;
        boolean z12 = true;
        if (!z10) {
            f10 = 0.0f;
            if (this.v != 0.0f) {
            }
            if (z10) {
                f13 = this.f35097w;
                if (f13 < 1.0f) {
                    f14 = (jMin / 180.0f) + f13;
                    this.f35097w = f14;
                    if (f14 > 1.0f) {
                        this.f35097w = 1.0f;
                    }
                } else {
                    z12 = z11;
                }
            } else if (z10) {
                z12 = z11;
            } else {
                f11 = this.f35097w;
                if (f11 > 0.0f) {
                    f12 = f11 - (jMin / 180.0f);
                    this.f35097w = f12;
                    if (f12 < 0.0f) {
                        this.f35097w = 0.0f;
                    }
                } else {
                    z12 = z11;
                }
            }
            if (z12) {
                f1Var.f1();
                f1Var.invalidate();
                invalidate();
            }
            return zDrawChild;
        }
        f10 = 0.0f;
        if (this.f35092s) {
            float f20 = this.v;
            boolean z13 = f20 <= f10;
            float f21 = (jMin / 420.0f) + f20;
            this.v = f21;
            if (!z10 && z13 && f21 >= f10) {
                this.v = f10;
            }
            if (this.v >= 1.0f) {
                this.v = 1.0f;
                this.f35092s = false;
            }
        } else {
            float f22 = this.v;
            z11 = f22 >= 0.0f;
            float f23 = f22 - (jMin / 420.0f);
            this.v = f23;
            if (!z10 && z11 && f23 <= 0.0f) {
                this.v = 0.0f;
            }
            if (this.v <= -1.0f) {
                this.v = -1.0f;
                this.f35092s = true;
            }
        }
        z11 = true;
        if (z10) {
            f13 = this.f35097w;
            if (f13 < 1.0f) {
                f14 = (jMin / 180.0f) + f13;
                this.f35097w = f14;
                if (f14 > 1.0f) {
                    this.f35097w = 1.0f;
                }
            } else {
                z12 = z11;
            }
        } else if (z10) {
            f11 = this.f35097w;
            if (f11 > 0.0f) {
                f12 = f11 - (jMin / 180.0f);
                this.f35097w = f12;
                if (f12 < 0.0f) {
                    this.f35097w = 0.0f;
                }
            } else {
                z12 = z11;
            }
        } else {
            z12 = z11;
        }
        if (z12) {
            f1Var.f1();
            f1Var.invalidate();
            invalidate();
        }
        return zDrawChild;
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.O == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.O = i10;
        this.B.x0(i10);
    }

    public final void f(vz vzVar, int i10) {
        if (vzVar.f34076f) {
            tz tzVar = this.F;
            if (tzVar != null) {
                ((org.telegram.ui.gw) tzVar).c(vzVar, false);
                return;
            }
            return;
        }
        int i11 = this.G;
        boolean z10 = i11 < i10;
        this.O = -1;
        this.m0 = i11;
        this.f35086n0 = this.H;
        this.G = i10;
        this.H = vzVar.f34072a;
        boolean z11 = this.K;
        m.i3 i3Var = this.f35091r0;
        if (z11) {
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            this.K = false;
        }
        this.f35084l0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(i3Var, 16L);
        tz tzVar2 = this.F;
        if (tzVar2 != null) {
            ((org.telegram.ui.gw) tzVar2).c(vzVar, z10);
        }
        e(i10);
    }

    public final void g(float f10, int i10) {
        int i11 = this.f35080h0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.M = i11;
            this.N = i10;
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f10;
        hh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        invalidate();
        e(i11);
        if (f10 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i11;
            this.H = i10;
        }
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getCurrentTabStableId() {
        return this.f35079g0.get(this.G, -1);
    }

    public int getDefaultTabId() {
        vz vzVarD = d();
        if (vzVarD == null) {
            return -1;
        }
        return vzVarD.f34072a;
    }

    public int getFirstTabId() {
        return this.f35078f0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f35078f0.get(getTabsCount() - 1, 0);
    }

    public zk0 getListView() {
        return this.B;
    }

    public int getSelectorColorKey() {
        return this.T;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public zk0 getTabsContainer() {
        return this.B;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f35079g0.get(i11, -1) == i10) {
                this.G = i11;
                this.H = this.f35078f0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            hh.f1 f1Var = this.B;
            if (i11 >= f1Var.getChildCount()) {
                return;
            }
            if (f1Var.getChildAt(i11) instanceof wz) {
                wz wzVar = (wz) f1Var.getChildAt(i11);
                if (wzVar.f34380b.f34072a == i10) {
                    wzVar.b(1.0f, 0);
                    try {
                        wzVar.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            i11++;
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.f35083k0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.f35081i0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f35082j0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int iDp = this.C;
        for (int i10 = 0; i10 < size; i10++) {
            int iA = ((vz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, iA);
            sparseIntArray3.put(i10, ((vz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.J / 2) + iDp);
            iDp += AndroidUtilities.dp(24.0f) + iA + this.J;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f35073c0 != i14) {
            this.f35073c0 = i14;
            this.O = -1;
            if (this.K) {
                AndroidUtilities.cancelRunOnUIThread(this.f35091r0);
                this.K = false;
                setEnabled(true);
                tz tzVar = this.F;
                if (tzVar != null) {
                    ((org.telegram.ui.gw) tzVar).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.C * 2);
            vz vzVarD = d();
            if (vzVarD != null) {
                vzVarD.b(LocaleController.getString(R.string.FilterAllChats));
                int iA = vzVarD.a(false);
                vzVarD.b(LocaleController.getString(this.I > size ? R.string.FilterAllChatsShort : R.string.FilterAllChats));
                int iA2 = vzVarD.a(false) + (this.I - iA);
                int i12 = this.J;
                int size2 = iA2 < size ? (size - iA2) / arrayList.size() : 0;
                this.J = size2;
                if (i12 != size2) {
                    this.A = true;
                    hh.f1 f1Var = this.B;
                    f2.v0 itemAnimator = f1Var.getItemAnimator();
                    f1Var.setItemAnimator(null);
                    this.E.l();
                    f1Var.setItemAnimator(itemAnimator);
                    this.A = false;
                }
                j();
                this.f35074d0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f35096v0;
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

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        hh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        invalidate();
        tz tzVar = this.F;
        if (tzVar != null) {
            ((org.telegram.ui.gw) tzVar).b(f10);
        }
    }

    public void setBlurredBackground(lg.d dVar) {
        this.f35095u0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(tz tzVar) {
        this.F = tzVar;
    }

    public void setIsEditing(boolean z10) {
        this.f35085n = z10;
        this.f35092s = true;
        hh.f1 f1Var = this.B;
        f1Var.f1();
        f1Var.invalidate();
        this.E.l();
        invalidate();
        if (this.f35085n || !this.f35099y) {
            return;
        }
        MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
        int size = dialogFilters.size();
        for (int i10 = 0; i10 < size; i10++) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            if (dialogFilter.isDefault()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.f19622id));
            }
        }
        MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new jh.m5(11));
        this.f35099y = false;
    }
}
