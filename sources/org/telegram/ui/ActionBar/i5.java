package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.i20;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
public class i5 extends FrameLayout implements fe.e, us, k6, b5 {
    public CharSequence D;
    public CharSequence E;
    public boolean F;
    public boolean G;
    public vg.f H;
    public vg.f I;
    public vg.f J;
    public float K;
    public tg.b L;
    public wg.d M;
    public wg.a N;
    public tg.b O;
    public i20 P;
    public s5 Q;
    public t0 R;
    public final fe.b S;
    public final fe.b T;
    public final fe.b U;
    public k V;
    public boolean W;
    public final p6 f20405a;
    public int f20406a0;
    public final f5 f20407b;
    public boolean f20408b0;
    public final h5 f20409c;
    public boolean f20410c0;
    public o5 d;
    public int f20411d0;
    public o5 e;
    public int f20412e0;
    public org.telegram.ui.Components.f6 f20413f;
    public int f20414f0;
    public int f20415g0;
    public org.telegram.ui.Components.f6 h;
    public int f20416h0;
    public int f20417i0;
    public boolean f20418j0;
    public boolean f20419k0;
    public boolean f20420l0;
    public boolean m0;
    public l5 f20421n;
    public tg.b f20422n0;
    public hi.d f20423o0;
    public final RectF f20424p0;
    public boolean f20425q0;
    public FrameLayout f20426r;
    public float f20427r0;
    public n0 f20428s;
    public ImageView f20429w;
    public TextView f20430x;
    public p5 f20431y;

    public i5(Context context, p6 p6Var) {
        super(context);
        this.K = -1.0f;
        gr grVar = gr.h;
        this.S = new fe.b(0, this, grVar, 380L, false);
        this.T = new fe.b(1, this, grVar, 380L, false);
        this.U = new fe.b(2, this, grVar, 250L, false);
        this.W = true;
        this.m0 = true;
        this.f20424p0 = new RectF();
        this.f20427r0 = 1.0f;
        this.f20405a = p6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        x();
        h5 h5Var = new h5(this, context);
        this.f20409c = h5Var;
        addView(h5Var, w7.b6.e(-1, -2, 51));
        f5 f5Var = new f5(this, context);
        this.f20407b = f5Var;
        f5Var.setVisibility(8);
        f5Var.setContentDescription(cd.L0(2131754878, null));
        f5Var.setOnClickListener(new e5(this, 0));
        addView(f5Var, w7.b6.e(46, 46, 51));
    }

    public static void A(View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.rightMargin = i12;
    }

    public static void e(i5 i5Var, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.i0.v1(i5Var.f20428s);
        p0 searchListener = i5Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(i5Var.f20428s);
        }
    }

    public static p0 f(i5 i5Var) {
        return i5Var.getSearchListener();
    }

    private int getRowTop() {
        if (this.W) {
            return org.telegram.messenger.i0.f16020m;
        }
        return 0;
    }

    public p0 getSearchListener() {
        p5 p5Var = this.f20431y;
        if (p5Var != null) {
            return p5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f7;
        if (((Drawable) this.f20407b.f20324b) != null) {
            f7 = 58.0f;
        } else {
            f7 = 6.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public static void z(View view, float f7) {
        int i10;
        view.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        view.setVisibility(i10);
    }

    public final void B(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        int L;
        if (!t()) {
            setTitle(charSequence);
            return;
        }
        h5 h5Var = this.f20409c;
        h5Var.b(0);
        h5Var.b(1);
        u5[] u5VarArr = (u5[]) h5Var.f20380c;
        u5 u5Var = u5VarArr[0];
        u5 u5Var2 = u5VarArr[1];
        u5VarArr[0] = u5Var2;
        u5VarArr[1] = u5Var;
        u5Var2.animate().cancel();
        u5Var2.k(charSequence);
        u5Var2.setVisibility(0);
        u5Var2.setAlpha(0.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f);
        if (!z10) {
            L2 = -L2;
        }
        u5Var2.setTranslationY(L2);
        u5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j10).setInterpolator(interpolator).start();
        u5Var.animate().cancel();
        ViewPropertyAnimator alpha = u5Var.animate().alpha(0.0f);
        if (z10) {
            L = -org.telegram.messenger.i0.L(16.0f);
        } else {
            L = org.telegram.messenger.i0.L(16.0f);
        }
        alpha.translationY(L).setDuration(j10).setInterpolator(interpolator).withEndAction(new g5(u5Var, 1)).start();
        h5Var.requestLayout();
    }

    public final void C() {
        if (this.e != null && !this.G) {
            this.G = true;
            o5 o5Var = this.d;
            if (o5Var != null) {
                o5Var.g();
            }
            n0 n0Var = this.f20428s;
            if (n0Var != null && this.F) {
                org.telegram.messenger.i0.v1(n0Var);
            }
            this.T.a(true, t());
            g();
            this.f20407b.b(true, t());
            zs.e().k(zs.f19681r4, new Object[0]);
        }
    }

    public final void D() {
        n0 n0Var = this.f20428s;
        int i10 = t6.G6;
        p6 p6Var = this.f20405a;
        n0Var.setTextColor(t6.w0(i10, p6Var));
        this.f20430x.setTextColor(t6.w0(i10, p6Var));
        this.f20428s.setHintTextColor(t6.w0(t6.H6, p6Var));
        this.f20428s.setCursorColor(t6.w0(i10, p6Var));
        this.f20428s.setHighlightColor(t6.w0(t6.f21028ig, p6Var));
        this.f20428s.setHandlesColor(t6.w0(t6.f21048jg, p6Var));
        this.f20429w.setColorFilter(new PorterDuffColorFilter(t6.w0(t6.f21095m6, p6Var), PorterDuff.Mode.SRC_IN));
        this.f20429w.setBackground(t6.h0(this.f20416h0, 1, -1));
    }

    @Override
    public final boolean a(t0 t0Var, RectF rectF) {
        float f7 = 0.0f;
        if (t0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            k(rectF);
            return true;
        }
        float L = org.telegram.messenger.i0.L(23.0f);
        View view = (View) t0Var.getParent();
        if (view != null) {
            f7 = view.getX();
        }
        float width = (t0Var.getWidth() / 2.0f) + t0Var.getX() + f7;
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override
    public final boolean b() {
        return this.m0;
    }

    @Override
    public final vg.f c(s5 s5Var) {
        tg.b bVar = this.f20422n0;
        if (bVar == null) {
            bVar = this.L;
        }
        if (bVar == null) {
            return null;
        }
        vg.f c10 = bVar.c(s5Var, null, false);
        c10.o(this.M);
        z20.u(c10, org.telegram.messenger.i0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public final void d(s5 s5Var, t0 t0Var) {
        this.Q = s5Var;
        this.R = t0Var;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19657n4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        l5 l5Var;
        this.f20408b0 = this.f20410c0;
        int L = org.telegram.messenger.i0.L(6.0f);
        if (this.H != null) {
            f5 f5Var = this.f20407b;
            if (f5Var.getVisibility() == 0 && f5Var.getAlpha() > 0.0f) {
                float width = (f5Var.getWidth() / 2.0f) + f5Var.getX();
                float height = (f5Var.getHeight() / 2.0f) + f5Var.getY();
                float scaleX = f5Var.getScaleX() * (f5Var.getWidth() / 2.0f);
                float scaleY = f5Var.getScaleY() * (f5Var.getHeight() / 2.0f);
                this.H.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.H.setAlpha((int) (f5Var.getAlpha() * 255.0f));
                this.H.draw(canvas);
            }
        }
        if (this.J != null && (l5Var = this.f20421n) != null && l5Var.f20540c == k5.f20465a && l5Var.getVisibility() == 0 && this.f20421n.getAlpha() > 0.0f) {
            float width2 = (this.f20421n.getWidth() / 2.0f) + this.f20421n.getX();
            float height2 = (this.f20421n.getHeight() / 2.0f) + this.f20421n.getY();
            float scaleX2 = this.f20421n.getScaleX() * (this.f20421n.getWidth() / 2.0f);
            float scaleY2 = this.f20421n.getScaleY() * (this.f20421n.getHeight() / 2.0f);
            this.J.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.J.setAlpha((int) (this.f20421n.getAlpha() * 255.0f));
            this.J.draw(canvas);
        }
        if (this.I != null) {
            RectF rectF = this.f20424p0;
            float k10 = k(rectF);
            t0 t0Var = this.R;
            if (t0Var != null && t0Var.getParent() == this.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.q(height3);
                }
                this.I.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.I.setAlpha((int) (k10 * 255.0f));
                this.I.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t0 t0Var;
        if (view == this.d && (t0Var = this.R) != null && t0Var.getParent() == this.d) {
            return false;
        }
        if (view == this.f20426r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f20424p0;
            k(rectF);
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void g() {
        o5 o5Var;
        o5 o5Var2;
        o5 o5Var3;
        o5 o5Var4;
        float T1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f7 = 1.0f - actionModeFactor;
        float f10 = searchFactor * f7;
        float f11 = (1.0f - searchFactor) * f7;
        float T12 = org.telegram.messenger.i0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        h5 h5Var = this.f20409c;
        z(h5Var, this.f20427r0 * f11);
        h5Var.setScaleX(T12);
        h5Var.setScaleY(T12);
        l5 l5Var = this.f20421n;
        if (l5Var != null) {
            float visibleFactor = l5Var.getVisibleFactor() * f11;
            z(this.f20421n, visibleFactor);
            if (this.f20421n.f20540c == k5.f20465a) {
                T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, visibleFactor);
            } else {
                T1 = org.telegram.messenger.i0.T1(0.8f, 1.0f, f11);
            }
            this.f20421n.setScaleX(T1);
            this.f20421n.setScaleY(T1);
        }
        o5 o5Var5 = this.d;
        int i10 = 0;
        if (o5Var5 != null) {
            o5Var5.setTranslationX(-q(false));
            z(this.d, f11);
            float T13 = org.telegram.messenger.i0.T1(0.7f, 1.0f, f11);
            this.d.setPivotX(o5Var3.getWidth() - org.telegram.messenger.i0.L(19.0f));
            this.d.setPivotY(o5Var4.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                z(childAt, f11);
            }
        }
        o5 o5Var6 = this.e;
        if (o5Var6 != null) {
            z(o5Var6, actionModeFactor);
            float T14 = org.telegram.messenger.i0.T1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(o5Var.getWidth() - org.telegram.messenger.i0.L(19.0f));
            this.e.setPivotY(o5Var2.getHeight() / 2.0f);
            this.e.setScaleX(T14);
            this.e.setScaleY(T14);
        }
        org.telegram.ui.Components.f6 f6Var = this.f20413f;
        if (f6Var != null) {
            z(f6Var, actionModeFactor);
            this.f20413f.setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f7);
        }
        org.telegram.ui.Components.f6 f6Var2 = this.h;
        if (f6Var2 != null) {
            z(f6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f7);
        }
        FrameLayout frameLayout = this.f20426r;
        if (frameLayout != null) {
            z(frameLayout, f10);
            RectF rectF = this.f20424p0;
            k(rectF);
            this.f20426r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        f5 f5Var = this.f20407b;
        if (((Drawable) f5Var.f20324b) != null) {
            f5Var.setVisibility(0);
            f5Var.setAlpha(1.0f);
            f5Var.setScaleX(1.0f);
            f5Var.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i10 = 8;
            }
            f5Var.setVisibility(i10);
            f5Var.setAlpha(actionModeFactor);
            f5Var.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, actionModeFactor));
            f5Var.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, actionModeFactor));
        }
        f5Var.invalidate();
        invalidate();
    }

    public k getActionBarMenuOnItemClick() {
        return this.V;
    }

    public o5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.T.e;
    }

    public org.telegram.ui.Components.f6 getActionModeTitle() {
        l();
        return this.f20413f;
    }

    public View getBackButton() {
        return this.f20407b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.f20407b.f20324b;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        wg.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        if (aVar != null) {
            return aVar.n0();
        }
        return 0;
    }

    @Override
    public wg.a getButtonsGlassColorProvider() {
        wg.a aVar = this.N;
        if (aVar != null) {
            return aVar;
        }
        return this.M;
    }

    public l5 getDoneButton() {
        return this.f20421n;
    }

    public int getExtraHeight() {
        return this.f20406a0;
    }

    public o5 getMenu() {
        return this.d;
    }

    @Override
    public wg.a getMenuGlassColorProvider() {
        return this.M;
    }

    public s5 getMenuOverlay() {
        i20 i20Var = this.P;
        if (i20Var != null) {
            return (s5) i20Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.f20424p0;
        k(rectF);
        return rectF.left;
    }

    @Override
    public p6 getMenuResourcesProvider() {
        return this.f20405a;
    }

    @Override
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.W;
    }

    @Override
    public s5 getOpenMenuOverlay() {
        return this.Q;
    }

    public float getSearchFactor() {
        return this.S.e;
    }

    public EditTextBoldCursor getSearchField() {
        p();
        return this.f20428s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f20409c.f20381f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public u5 getSubtitleTextView() {
        return (u5) this.f20409c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        u5 u5Var = ((u5[]) this.f20409c.f20380c)[0];
        if (u5Var != null) {
            charSequence = u5Var.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        h5 h5Var = this.f20409c;
        h5Var.b(0);
        return ((u5[]) h5Var.f20380c)[0].getTextPaint().getFontMetricsInt();
    }

    public u5 getTitleTextView() {
        return ((u5[]) this.f20409c.f20380c)[0];
    }

    public u5 getTitleTextView2() {
        return ((u5[]) this.f20409c.f20380c)[1];
    }

    public float getTitlesAlpha() {
        return this.f20427r0;
    }

    public final void h() {
        boolean z10;
        TextView textView;
        if (this.f20428s == null) {
            return;
        }
        p0 searchListener = getSearchListener();
        boolean z11 = true;
        if (this.f20428s.length() <= 0 && (((textView = this.f20430x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!t() || !this.F) {
            z11 = false;
        }
        this.U.a(z10, z11);
        this.f20429w.setEnabled(z10);
    }

    public final void i() {
        p0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f20430x.setVisibility(8);
            h();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void j(boolean z10) {
        if (this.F) {
            p0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.f20428s.clearFocus();
                if (z10) {
                    org.telegram.messenger.i0.v1(this.f20428s);
                }
                this.S.a(false, t());
                g();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float k(RectF rectF) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int L = org.telegram.messenger.i0.L(6.0f);
        float L2 = org.telegram.messenger.i0.L(23.0f);
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        o5 o5Var = this.d;
        if (o5Var != null && o5Var.getVisibility() != 8) {
            f7 = this.d.getPillWidth();
        } else {
            f7 = 0.0f;
        }
        o5 o5Var2 = this.e;
        if (o5Var2 != null) {
            f10 = o5Var2.getPillWidth();
        } else {
            f10 = 0.0f;
        }
        if (f7 <= 0.0f) {
            f11 = actionModeFactor;
            f7 = f10;
        } else if (f10 <= 0.0f) {
            f11 = 1.0f - actionModeFactor;
        } else {
            f7 = org.telegram.messenger.i0.T1(f7, f10, actionModeFactor);
            f11 = 1.0f;
        }
        float f14 = (1.0f - actionModeFactor) * searchFactor;
        float f15 = L2 * 2.0f;
        float f16 = f7 / f15;
        float T1 = org.telegram.messenger.i0.T1(0.8f, 1.0f, f11) * Math.min(1.0f, f16);
        float width = (getWidth() - L) - q(false);
        float max = width - Math.max(f7, f15);
        float f17 = currentActionBarHeight - L2;
        float f18 = currentActionBarHeight + L2;
        if (T1 < 1.0f) {
            float f19 = (max + width) / 2.0f;
            float z10 = sc.e.z(1.0f, T1, L2, (width - max) / 2.0f);
            float f20 = f19 - z10;
            width = f19 + z10;
            float f21 = L2 * T1;
            float f22 = currentActionBarHeight - f21;
            f13 = currentActionBarHeight + f21;
            f12 = f22;
            max = f20;
        } else {
            f12 = f17;
            f13 = f18;
        }
        rectF.set(org.telegram.messenger.i0.T1(max, getSearchPillLeft(), f14), org.telegram.messenger.i0.T1(f12, f17, f14), org.telegram.messenger.i0.T1(width, getWidth() - L, f14), org.telegram.messenger.i0.T1(f13, f18, f14));
        return org.telegram.messenger.i0.T1(Math.min(1.0f, f16) * f11, 1.0f, f14);
    }

    public final o5 l() {
        if (this.e == null) {
            o5 o5Var = new o5(getContext(), this, true);
            this.e = o5Var;
            View view = this.f20407b;
            addView(o5Var, indexOfChild(view), w7.b6.e(-2, -2, 53));
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), true, true, true);
            this.f20413f = f6Var;
            f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
            this.f20413f.setTypeface(org.telegram.messenger.i0.o());
            this.f20413f.setTextColor(this.f20415g0);
            this.f20413f.setGravity(19);
            this.f20413f.setEllipsizeByGradient(true);
            this.f20413f.b(0.6f, 320L, gr.h);
            addView(this.f20413f, indexOfChild(view), w7.b6.e(-1, -2, 51));
            g();
        }
        return this.e;
    }

    public final void m() {
        tg.b bVar = this.O;
        if (bVar == null) {
            bVar = this.L;
        }
        if (bVar == null) {
            return;
        }
        wg.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        vg.f c10 = bVar.c(this, null, false);
        c10.o(aVar);
        z20.u(c10, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.H = c10;
        vg.f c11 = bVar.c(this, null, false);
        c11.o(aVar);
        z20.u(c11, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.I = c11;
        vg.f c12 = bVar.c(this, null, false);
        c12.o(aVar);
        z20.u(c12, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.J = c12;
        this.K = org.telegram.messenger.i0.L(23.0f);
        invalidate();
    }

    public final l5 n(String str) {
        if (this.f20421n == null) {
            l5 l5Var = new l5(getContext(), this, str);
            this.f20421n = l5Var;
            addView(l5Var, indexOfChild(this.f20407b), w7.b6.e(-2, 46, 53));
            g();
        }
        return this.f20421n;
    }

    public final o5 o() {
        if (this.d == null) {
            o5 o5Var = new o5(getContext(), this, false);
            this.d = o5Var;
            addView(o5Var, indexOfChild(this.f20407b), w7.b6.e(-2, -2, 53));
            g();
        }
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20410c0 = true;
        zs.e().c(this, zs.f19657n4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20410c0 = false;
        this.f20408b0 = false;
        zs.e().n(this, zs.f19657n4);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i10, i11, i12, i13);
        int rowTop = getRowTop();
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i17 = i12 - i10;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    i15 = i17 - measuredWidth;
                    i16 = layoutParams.rightMargin;
                } else if (absoluteGravity == 1) {
                    i15 = ((i17 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i16 = layoutParams.rightMargin;
                } else {
                    i14 = layoutParams.leftMargin;
                    int u10 = (i0.a.u(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i14, u10, measuredWidth + i14, measuredHeight + u10);
                }
                i14 = i15 - i16;
                int u102 = (i0.a.u(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i14, u102, measuredWidth + i14, measuredHeight + u102);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int L;
        int L2;
        int size = View.MeasureSpec.getSize(i10);
        int rowTop = getRowTop();
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i12 = rowTop + currentActionBarHeight + this.f20406a0;
        f5 f5Var = this.f20407b;
        if (((Drawable) f5Var.f20324b) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int L3 = ((currentActionBarHeight - org.telegram.messenger.i0.L(46.0f)) / 2) + rowTop;
        A(f5Var, org.telegram.messenger.i0.L(6.0f), L3, 0);
        o5 o5Var = this.d;
        float f10 = 0.0f;
        if (o5Var != null && o5Var.getVisibility() != 8) {
            f7 = this.d.getTargetPillWidth();
        } else {
            f7 = 0.0f;
        }
        float q6 = q(true);
        if (z10) {
            L = org.telegram.messenger.i0.L(64.0f);
        } else {
            L = org.telegram.messenger.i0.L(18.0f);
        }
        if (f7 <= 0.0f && q6 <= 0.0f) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.i0.L(18.0f) + ((int) (f7 + q6));
        }
        int max = Math.max(L, L2);
        h5 h5Var = this.f20409c;
        if (h5Var.f20379b != max) {
            h5Var.f20379b = max;
            h5Var.requestLayout();
        }
        A(h5Var, 0, rowTop, 0);
        h5Var.getLayoutParams().height = currentActionBarHeight;
        o5 o5Var2 = this.d;
        if (o5Var2 != null) {
            A(o5Var2, 0, rowTop, org.telegram.messenger.i0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        o5 o5Var3 = this.e;
        if (o5Var3 != null) {
            A(o5Var3, 0, rowTop, org.telegram.messenger.i0.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f20413f != null) {
            o5 o5Var4 = this.e;
            if (o5Var4 != null) {
                f10 = o5Var4.getTargetPillWidth();
            }
            int L4 = org.telegram.messenger.i0.L(18.0f) + ((int) f10);
            org.telegram.ui.Components.f6 f6Var = this.h;
            if (f6Var != null && f6Var.getTag() != null) {
                int i13 = (currentActionBarHeight / 2) + rowTop;
                A(this.f20413f, org.telegram.messenger.i0.L(66.0f), i13 - org.telegram.messenger.i0.L(22.0f), L4);
                this.f20413f.getLayoutParams().height = org.telegram.messenger.i0.L(22.0f);
                A(this.h, org.telegram.messenger.i0.L(66.0f), org.telegram.messenger.i0.L(1.0f) + i13, L4);
                this.h.getLayoutParams().height = org.telegram.messenger.i0.L(18.0f);
            } else {
                A(this.f20413f, org.telegram.messenger.i0.L(66.0f), rowTop, L4);
                this.f20413f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f20426r;
        if (frameLayout != null) {
            A(frameLayout, (int) getSearchPillLeft(), L3, org.telegram.messenger.i0.L(6.0f));
        }
        l5 l5Var = this.f20421n;
        if (l5Var != null) {
            A(l5Var, 0, L3, org.telegram.messenger.i0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f20425q0;
    }

    public final void p() {
        if (this.f20426r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20426r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f20426r, indexOfChild(this.f20407b), w7.b6.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f20426r.addView(linearLayout, w7.b6.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f20430x = textView;
        textView.setTextSize(1, 17.0f);
        this.f20430x.setSingleLine(true);
        this.f20430x.setEllipsize(TextUtils.TruncateAt.END);
        this.f20430x.setGravity(19);
        this.f20430x.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
        this.f20430x.setVisibility(8);
        linearLayout.addView(this.f20430x, w7.b6.o(-2, -1));
        n0 n0Var = new n0(this, context, 1);
        this.f20428s = n0Var;
        n0Var.setTextSize(1, 17.0f);
        this.f20428s.setSingleLine(true);
        this.f20428s.setBackground(null);
        this.f20428s.setPadding(0, 0, 0, 0);
        this.f20428s.setGravity(19);
        n0 n0Var2 = this.f20428s;
        n0Var2.setInputType(n0Var2.getInputType() | 524288);
        this.f20428s.setImeOptions(33554435);
        this.f20428s.setTextIsSelectable(false);
        this.f20428s.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f20428s.setCursorWidth(1.5f);
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            this.f20428s.setHint(charSequence);
        }
        this.f20428s.setOnEditorActionListener(new ag.r1(this, 3));
        this.f20428s.addTextChangedListener(new ag.a1(this, 8));
        linearLayout.addView(this.f20428s, w7.b6.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.f20429w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f20429w.setImageResource(2131231270);
        this.f20429w.setContentDescription(cd.L0(2131752099, null));
        this.f20429w.setOnClickListener(new e5(this, 1));
        this.f20426r.addView(this.f20429w, w7.b6.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        D();
        h();
        v(2, this.U.e, 0.0f, null);
    }

    public final float q(boolean z10) {
        float actionModeFactor;
        l5 l5Var = this.f20421n;
        if (l5Var != null) {
            if (l5Var.getVisibility() != 8 || !z10) {
                if (z10) {
                    actionModeFactor = this.f20421n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f20421n.getVisibleFactor();
                }
                return (org.telegram.messenger.i0.L(12.0f) + this.f20421n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void r() {
        o5 o5Var = this.e;
        if (o5Var != null && this.G) {
            this.G = false;
            o5Var.g();
            this.T.a(false, t());
            g();
            this.f20407b.b(false, t());
            zs.e().k(zs.f19681r4, new Object[0]);
        }
    }

    public final boolean s() {
        if (this.e != null && this.G) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.V = kVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f20407b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f20407b.c(drawable);
        g();
        requestLayout();
    }

    public void setBackButtonImage(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = getContext().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        setBackButtonDrawable(drawable);
    }

    public void setBackButtonImageAnimated(int i10) {
        boolean z10;
        Drawable mutate = getContext().getDrawable(i10).mutate();
        f5 f5Var = this.f20407b;
        Drawable drawable = (Drawable) f5Var.f20324b;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        fe.f fVar = (fe.f) f5Var.f20326f;
        if (drawable != null && ((i5) f5Var.h).t()) {
            f5Var.c(mutate);
            f5Var.f20325c = (Drawable) f5Var.f20324b;
            fVar.c(0.0f);
            fVar.a(1.0f);
        } else {
            f5Var.c(mutate);
        }
        if (!z10) {
            g();
            requestLayout();
        }
    }

    public void setButtonsGlass(tg.b bVar) {
        this.O = bVar;
        if (this.L != null) {
            m();
        }
    }

    public void setButtonsGlassColorProvider(wg.a aVar) {
        this.N = aVar;
        if (aVar == null) {
            aVar = this.M;
        }
        vg.f fVar = this.H;
        if (fVar != null) {
            fVar.o(aVar);
            this.I.o(aVar);
            this.J.o(aVar);
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f20407b.setEnabled(z10);
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.setEnabled(z10);
        }
        l5 l5Var = this.f20421n;
        if (l5Var != null) {
            l5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        if (this.f20406a0 != i10) {
            this.f20406a0 = i10;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.f20425q0 = z10;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f7) {
        hi.d dVar = this.f20423o0;
        if (dVar != null) {
            dVar.b(f7);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.m0 = z10;
    }

    public void setMenuOverlayProvider(i20 i20Var) {
        this.P = i20Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i10;
        p();
        this.f20430x.setText(charSequence);
        TextView textView = this.f20430x;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        h();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.D = charSequence;
        n0 n0Var = this.f20428s;
        if (n0Var != null) {
            n0Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        n0 n0Var = this.f20428s;
        if (n0Var == null) {
            this.E = charSequence;
            return;
        }
        n0Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f20428s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(p5 p5Var) {
        if (p5Var == null && this.f20431y != null && this.F) {
            j(true);
        }
        this.f20431y = p5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f20409c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!t()) {
            setSubtitle(charSequence);
            return;
        }
        h5 h5Var = this.f20409c;
        u5 u5Var = (u5) h5Var.d;
        if (u5Var != null && u5Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) h5Var.f20381f, charSequence)) {
            h5Var.f20381f = charSequence;
            if (((u5) h5Var.e) == null) {
                h5Var.e = h5Var.a();
            }
            u5 u5Var2 = (u5) h5Var.d;
            u5 u5Var3 = (u5) h5Var.e;
            h5Var.d = u5Var3;
            h5Var.e = u5Var2;
            u5Var3.animate().cancel();
            ((u5) h5Var.d).l(charSequence, false);
            ((u5) h5Var.d).setVisibility(0);
            ((u5) h5Var.d).setAlpha(0.0f);
            ((u5) h5Var.d).setTranslationY(org.telegram.messenger.i0.L(6.0f));
            ViewPropertyAnimator duration = ((u5) h5Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            u5Var2.animate().cancel();
            u5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(6.0f)).setDuration(380L).setInterpolator(grVar).withEndAction(new g5(u5Var2, 0)).start();
            h5Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) h5Var.f20381f, charSequence)) {
            h5Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i10) {
        this.f20419k0 = true;
        this.f20412e0 = i10;
        this.f20409c.d();
    }

    public void setTitle(CharSequence charSequence) {
        h5 h5Var = this.f20409c;
        int i10 = 0;
        h5Var.b(0);
        u5[] u5VarArr = (u5[]) h5Var.f20380c;
        u5 u5Var = u5VarArr[1];
        if (u5Var != null) {
            u5Var.animate().cancel();
            u5VarArr[1].setVisibility(8);
        }
        u5VarArr[0].animate().cancel();
        u5VarArr[0].setAlpha(1.0f);
        u5VarArr[0].setTranslationY(0.0f);
        u5VarArr[0].k(charSequence);
        u5 u5Var2 = u5VarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 4;
        }
        u5Var2.setVisibility(i10);
    }

    public void setTitleColor(int i10) {
        this.f20418j0 = true;
        this.f20411d0 = i10;
        this.f20409c.d();
    }

    public void setTitlesAlpha(float f7) {
        if (this.f20427r0 != f7) {
            this.f20427r0 = f7;
            g();
        }
    }

    public final boolean t() {
        if (this.f20408b0 && this.f20410c0) {
            return true;
        }
        return false;
    }

    public final boolean u(View view) {
        if (view != this.f20407b && view != this.f20409c && view != this.d && view != this.e && view != this.f20413f && view != this.h && view != this.f20426r && view != this.f20421n) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        x();
        this.f20409c.d();
        this.f20407b.d();
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.i();
        }
        o5 o5Var2 = this.e;
        if (o5Var2 != null) {
            o5Var2.i();
        }
        org.telegram.ui.Components.f6 f6Var = this.f20413f;
        if (f6Var != null) {
            f6Var.setTextColor(this.f20415g0);
        }
        l5 l5Var = this.f20421n;
        if (l5Var != null) {
            l5Var.c();
        }
        org.telegram.ui.Components.f6 f6Var2 = this.h;
        if (f6Var2 != null) {
            f6Var2.setTextColor(this.f20412e0);
        }
        if (this.f20428s != null) {
            D();
        }
        vg.f fVar = this.H;
        if (fVar != null) {
            fVar.updateColors();
        }
        vg.f fVar2 = this.I;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        invalidate();
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        if (i10 == 2) {
            ImageView imageView = this.f20429w;
            if (imageView != null) {
                imageView.setAlpha(f7);
                float f11 = (f7 * 0.5f) + 0.5f;
                this.f20429w.setScaleX(f11);
                this.f20429w.setScaleY(f11);
                ImageView imageView2 = this.f20429w;
                if (f7 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                imageView2.setVisibility(i11);
                return;
            }
            return;
        }
        g();
    }

    public final boolean w(boolean z10, boolean z11) {
        p0 searchListener;
        boolean z12 = false;
        if (this.f20431y == null || this.F || this.G || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        p();
        this.F = true;
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.g();
        }
        n0 n0Var = this.f20428s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        n0Var.setText(charSequence);
        this.E = null;
        this.f20428s.requestFocus();
        if (z10) {
            org.telegram.messenger.i0.J3(this.f20428s);
        }
        if (z11 && t()) {
            z12 = true;
        }
        this.S.a(true, z12);
        g();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void x() {
        boolean z10 = this.f20418j0;
        p6 p6Var = this.f20405a;
        if (!z10) {
            this.f20411d0 = t6.w0(t6.G6, p6Var);
        }
        if (!this.f20419k0) {
            this.f20412e0 = t6.w0(t6.f21311y6, p6Var);
        }
        if (!this.f20420l0) {
            this.f20414f0 = t6.w0(t6.G6, p6Var);
        }
        this.f20415g0 = t6.w0(t6.G6, p6Var);
        int i10 = t6.f21020i6;
        this.f20416h0 = t6.w0(i10, p6Var);
        this.f20417i0 = t6.w0(i10, p6Var);
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        String E = cd.E(i10, ' ');
        l();
        org.telegram.ui.Components.f6 f6Var = this.f20413f;
        if (z10 && t() && this.G) {
            z11 = true;
        } else {
            z11 = false;
        }
        f6Var.c(E, z11, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
