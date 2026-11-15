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
import c8.ja;
import di.ub;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
public class w4 extends FrameLayout implements te.b, is, z5, q4 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public fh.g I;
    public fh.g J;
    public fh.g K;
    public float L;
    public dh.c M;
    public gh.e N;
    public gh.a O;
    public dh.c P;
    public r10 Q;
    public g5 R;
    public q0 S;
    public final te.a T;
    public final te.a U;
    public final te.a V;
    public j W;
    public final e6 f29806a;
    public boolean f29807a0;
    public final ub f29808b;
    public int f29809b0;
    public final v4 f29810c;
    public boolean f29811c0;
    public c5 d;
    public boolean f29812d0;
    public c5 f29813e;
    public int f29814e0;
    public org.telegram.ui.Components.h6 f29815f;
    public int f29816f0;
    public int f29817g0;
    public org.telegram.ui.Components.h6 h;
    public int f29818h0;
    public int f29819i0;
    public int f29820j0;
    public boolean f29821k0;
    public boolean f29822l0;
    public boolean m0;
    public z4 f29823n;
    public boolean f29824n0;
    public dh.c f29825o0;
    public ui.d f29826p0;
    public final RectF f29827q0;
    public FrameLayout f29828r;
    public int f29829r0;
    public ah.i f29830s;
    public boolean f29831s0;
    public float f29832t0;
    public ImageView f29833w;
    public TextView f29834x;
    public d5 f29835y;

    public w4(Context context, e6 e6Var) {
        super(context);
        this.L = -1.0f;
        er erVar = er.h;
        this.T = new te.a(0, this, erVar, 380L, false);
        this.U = new te.a(1, this, erVar, 380L, false);
        this.V = new te.a(2, this, erVar, 250L, false);
        this.f29807a0 = true;
        this.f29824n0 = true;
        this.f29827q0 = new RectF();
        this.f29832t0 = 1.0f;
        this.f29806a = e6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        z();
        v4 v4Var = new v4(this, context);
        this.f29810c = v4Var;
        addView(v4Var, ja.e(-1, -2, 51));
        ub ubVar = new ub(this, context);
        this.f29808b = ubVar;
        ubVar.setVisibility(8);
        ubVar.setContentDescription(hd.M0(2131754878, null));
        ubVar.setOnClickListener(new t4(this, 0));
        addView(ubVar, ja.e(46, 46, 51));
    }

    public static void B(View view, float f10) {
        int i7;
        view.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        view.setVisibility(i7);
    }

    public static void C(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public static void c(w4 w4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.g0.v1(w4Var.f29830s);
        m0 searchListener = w4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(w4Var.f29830s);
        }
    }

    private int getRowTop() {
        if (this.f29807a0) {
            return org.telegram.messenger.g0.f23605m;
        }
        return 0;
    }

    public m0 getSearchListener() {
        d5 d5Var = this.f29835y;
        if (d5Var != null) {
            return d5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f10;
        if (((Drawable) this.f29808b.f9564c) != null) {
            f10 = 58.0f;
        } else {
            f10 = 6.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public static m0 i(w4 w4Var) {
        return w4Var.getSearchListener();
    }

    public final void A(int i7, boolean z10) {
        boolean z11;
        String E = hd.E(i7, ' ');
        o();
        org.telegram.ui.Components.h6 h6Var = this.f29815f;
        if (z10 && w() && this.H) {
            z11 = true;
        } else {
            z11 = false;
        }
        h6Var.c(E, z11, true);
    }

    public final void D(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        int L;
        if (!w()) {
            setTitle(charSequence);
            return;
        }
        v4 v4Var = this.f29810c;
        v4Var.b(0);
        v4Var.b(1);
        j5[] j5VarArr = (j5[]) v4Var.f29756c;
        j5 j5Var = j5VarArr[0];
        j5 j5Var2 = j5VarArr[1];
        j5VarArr[0] = j5Var2;
        j5VarArr[1] = j5Var;
        j5Var2.animate().cancel();
        j5Var2.k(charSequence);
        j5Var2.setVisibility(0);
        j5Var2.setAlpha(0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        if (!z10) {
            L2 = -L2;
        }
        j5Var2.setTranslationY(L2);
        j5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        j5Var.animate().cancel();
        ViewPropertyAnimator alpha = j5Var.animate().alpha(0.0f);
        if (z10) {
            L = -org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        alpha.translationY(L).setDuration(j3).setInterpolator(interpolator).withEndAction(new u4(j5Var, 1)).start();
        v4Var.requestLayout();
    }

    public final void F() {
        if (this.f29813e != null && !this.H) {
            this.H = true;
            c5 c5Var = this.d;
            if (c5Var != null) {
                c5Var.g();
            }
            ah.i iVar = this.f29830s;
            if (iVar != null && this.G) {
                org.telegram.messenger.g0.v1(iVar);
            }
            this.U.a(true, w());
            j();
            this.f29808b.b(true, w());
            ns.e().k(ns.f25565r4, new Object[0]);
        }
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 2) {
            ImageView imageView = this.f29833w;
            if (imageView != null) {
                imageView.setAlpha(f10);
                float f12 = (f10 * 0.5f) + 0.5f;
                this.f29833w.setScaleX(f12);
                this.f29833w.setScaleY(f12);
                ImageView imageView2 = this.f29833w;
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView2.setVisibility(i10);
                return;
            }
            return;
        }
        j();
    }

    public final void H() {
        ah.i iVar = this.f29830s;
        int i7 = j6.G6;
        e6 e6Var = this.f29806a;
        iVar.setTextColor(j6.w0(i7, e6Var));
        this.f29834x.setTextColor(j6.w0(i7, e6Var));
        this.f29830s.setHintTextColor(j6.w0(j6.H6, e6Var));
        this.f29830s.setCursorColor(j6.w0(i7, e6Var));
        this.f29830s.setHighlightColor(j6.w0(j6.f29005lg, e6Var));
        this.f29830s.setHandlesColor(j6.w0(j6.f29022mg, e6Var));
        this.f29833w.setColorFilter(new PorterDuffColorFilter(j6.w0(j6.f29014m6, e6Var), PorterDuff.Mode.SRC_IN));
        this.f29833w.setBackground(j6.h0(this.f29819i0, 1, -1));
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final boolean b(q0 q0Var, RectF rectF) {
        float f10 = 0.0f;
        if (q0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            n(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) q0Var.getParent();
        if (view != null) {
            f10 = view.getX();
        }
        float width = (q0Var.getWidth() / 2.0f) + q0Var.getX() + f10;
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25541n4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        z4 z4Var;
        this.f29811c0 = this.f29812d0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.I != null) {
            ub ubVar = this.f29808b;
            if (ubVar.getVisibility() == 0 && ubVar.getAlpha() > 0.0f) {
                float width = (ubVar.getWidth() / 2.0f) + ubVar.getX();
                float height = (ubVar.getHeight() / 2.0f) + ubVar.getY();
                float scaleX = ubVar.getScaleX() * (ubVar.getWidth() / 2.0f);
                float scaleY = ubVar.getScaleY() * (ubVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (ubVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (z4Var = this.f29823n) != null && z4Var.f29942c == y4.f29892a && z4Var.getVisibility() == 0 && this.f29823n.getAlpha() > 0.0f) {
            float width2 = (this.f29823n.getWidth() / 2.0f) + this.f29823n.getX();
            float height2 = (this.f29823n.getHeight() / 2.0f) + this.f29823n.getY();
            float scaleX2 = this.f29823n.getScaleX() * (this.f29823n.getWidth() / 2.0f);
            float scaleY2 = this.f29823n.getScaleY() * (this.f29823n.getHeight() / 2.0f);
            this.K.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.K.setAlpha((int) (this.f29823n.getAlpha() * 255.0f));
            this.K.draw(canvas);
        }
        if (this.J != null) {
            RectF rectF = this.f29827q0;
            float n10 = n(rectF);
            q0 q0Var = this.S;
            if (q0Var != null && q0Var.getParent() == this.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (n10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (n10 * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        q0 q0Var;
        if (view == this.d && (q0Var = this.S) != null && q0Var.getParent() == this.d) {
            return false;
        }
        if (view == this.f29828r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f29827q0;
            n(rectF);
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final boolean e() {
        return this.f29824n0;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final fh.g g(g5 g5Var) {
        dh.c cVar = this.f29825o0;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(g5Var, null, false);
        c10.p(this.N);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.W;
    }

    public c5 getActionMode() {
        return this.f29813e;
    }

    public float getActionModeFactor() {
        return this.U.f57085e;
    }

    public org.telegram.ui.Components.h6 getActionModeTitle() {
        o();
        return this.f29815f;
    }

    public View getBackButton() {
        return this.f29808b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.f29808b.f9564c;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        if (aVar != null) {
            return aVar.A2();
        }
        return 0;
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        gh.a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        return this.N;
    }

    public z4 getDoneButton() {
        return this.f29823n;
    }

    public int getExtraHeight() {
        return this.f29809b0;
    }

    public c5 getMenu() {
        return this.d;
    }

    @Override
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return this.N;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    public g5 getMenuOverlay() {
        r10 r10Var = this.Q;
        if (r10Var != null) {
            return (g5) r10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.f29827q0;
        n(rectF);
        return rectF.left;
    }

    @Override
    public e6 getMenuResourcesProvider() {
        return this.f29806a;
    }

    @Override
    public int getMenuRise() {
        return 0;
    }

    @Override
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.f29807a0;
    }

    @Override
    public g5 getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.f57085e;
    }

    public EditTextBoldCursor getSearchField() {
        s();
        return this.f29830s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f29810c.f29758f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public j5 getSubtitleTextView() {
        return (j5) this.f29810c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        j5 j5Var = ((j5[]) this.f29810c.f29756c)[0];
        if (j5Var != null) {
            charSequence = j5Var.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        v4 v4Var = this.f29810c;
        v4Var.b(0);
        return ((j5[]) v4Var.f29756c)[0].getTextPaint().getFontMetricsInt();
    }

    public j5 getTitleTextView() {
        return ((j5[]) this.f29810c.f29756c)[0];
    }

    public j5 getTitleTextView2() {
        return ((j5[]) this.f29810c.f29756c)[1];
    }

    public float getTitlesAlpha() {
        return this.f29832t0;
    }

    @Override
    public final void h(g5 g5Var, q0 q0Var) {
        this.R = g5Var;
        this.S = q0Var;
        invalidate();
    }

    public final void j() {
        c5 c5Var;
        c5 c5Var2;
        c5 c5Var3;
        c5 c5Var4;
        float T1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        v4 v4Var = this.f29810c;
        B(v4Var, this.f29832t0 * f12);
        v4Var.setScaleX(T12);
        v4Var.setScaleY(T12);
        z4 z4Var = this.f29823n;
        if (z4Var != null) {
            float visibleFactor = z4Var.getVisibleFactor() * f12;
            B(this.f29823n, visibleFactor);
            if (this.f29823n.f29942c == y4.f29892a) {
                T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor);
            } else {
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            }
            this.f29823n.setScaleX(T1);
            this.f29823n.setScaleY(T1);
        }
        c5 c5Var5 = this.d;
        int i7 = 0;
        if (c5Var5 != null) {
            c5Var5.setTranslationX(-t(false));
            B(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(c5Var3.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(c5Var4.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!x(childAt) && childAt.getVisibility() != 8) {
                B(childAt, f12);
            }
        }
        c5 c5Var6 = this.f29813e;
        if (c5Var6 != null) {
            B(c5Var6, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.f29813e.setPivotX(c5Var.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.f29813e.setPivotY(c5Var2.getHeight() / 2.0f);
            this.f29813e.setScaleX(T14);
            this.f29813e.setScaleY(T14);
        }
        org.telegram.ui.Components.h6 h6Var = this.f29815f;
        if (h6Var != null) {
            B(h6Var, actionModeFactor);
            this.f29815f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            B(h6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.f29828r;
        if (frameLayout != null) {
            B(frameLayout, f11);
            RectF rectF = this.f29827q0;
            n(rectF);
            this.f29828r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        ub ubVar = this.f29808b;
        if (((Drawable) ubVar.f9564c) != null) {
            ubVar.setVisibility(0);
            ubVar.setAlpha(1.0f);
            ubVar.setScaleX(1.0f);
            ubVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i7 = 8;
            }
            ubVar.setVisibility(i7);
            ubVar.setAlpha(actionModeFactor);
            ubVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            ubVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        ubVar.invalidate();
        invalidate();
    }

    public final void k() {
        boolean z10;
        TextView textView;
        if (this.f29830s == null) {
            return;
        }
        m0 searchListener = getSearchListener();
        boolean z11 = true;
        if (this.f29830s.length() <= 0 && (((textView = this.f29834x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!w() || !this.G) {
            z11 = false;
        }
        this.V.a(z10, z11);
        this.f29833w.setEnabled(z10);
    }

    public final void l() {
        m0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f29834x.setVisibility(8);
            k();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void m(boolean z10) {
        if (this.G) {
            m0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.f29830s.clearFocus();
                if (z10) {
                    org.telegram.messenger.g0.v1(this.f29830s);
                }
                this.T.a(false, w());
                j();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float n(RectF rectF) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(23.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        c5 c5Var = this.d;
        if (c5Var != null && c5Var.getVisibility() != 8) {
            f10 = this.d.getPillWidth();
        } else {
            f10 = 0.0f;
        }
        c5 c5Var2 = this.f29813e;
        if (c5Var2 != null) {
            f11 = c5Var2.getPillWidth();
        } else {
            f11 = 0.0f;
        }
        if (f10 <= 0.0f) {
            f12 = actionModeFactor;
            f10 = f11;
        } else if (f11 <= 0.0f) {
            f12 = 1.0f - actionModeFactor;
        } else {
            f10 = org.telegram.messenger.g0.T1(f10, f11, actionModeFactor);
            f12 = 1.0f;
        }
        float f15 = (1.0f - actionModeFactor) * searchFactor;
        float f16 = L2 * 2.0f;
        float f17 = f10 / f16;
        float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f12) * Math.min(1.0f, f17);
        float width = (getWidth() - L) - t(false);
        float max = width - Math.max(f10, f16);
        float f18 = currentActionBarHeight - L2;
        float f19 = currentActionBarHeight + L2;
        if (T1 < 1.0f) {
            float f20 = (max + width) / 2.0f;
            float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, T1, L2, (width - max) / 2.0f);
            float f21 = f20 - t6;
            width = f20 + t6;
            float f22 = L2 * T1;
            float f23 = currentActionBarHeight - f22;
            f14 = currentActionBarHeight + f22;
            f13 = f23;
            max = f21;
        } else {
            f13 = f18;
            f14 = f19;
        }
        rectF.set(org.telegram.messenger.g0.T1(max, getSearchPillLeft(), f15), org.telegram.messenger.g0.T1(f13, f18, f15), org.telegram.messenger.g0.T1(width, getWidth() - L, f15), org.telegram.messenger.g0.T1(f14, f19, f15));
        return org.telegram.messenger.g0.T1(Math.min(1.0f, f17) * f12, 1.0f, f15);
    }

    public final c5 o() {
        if (this.f29813e == null) {
            c5 c5Var = new c5(getContext(), this, true);
            this.f29813e = c5Var;
            View view = this.f29808b;
            addView(c5Var, indexOfChild(view), ja.e(-2, -2, 53));
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), true, true, true);
            this.f29815f = h6Var;
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f29815f.setTypeface(org.telegram.messenger.g0.o());
            this.f29815f.setTextColor(this.f29818h0);
            this.f29815f.setGravity(19);
            this.f29815f.setEllipsizeByGradient(true);
            this.f29815f.b(0.6f, 320L, er.h);
            addView(this.f29815f, indexOfChild(view), ja.e(-1, -2, 51));
            j();
        }
        return this.f29813e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29812d0 = true;
        ns.e().c(this, ns.f25541n4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29812d0 = false;
        this.f29811c0 = false;
        ns.e().n(this, ns.f25541n4);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z10, i7, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i16 = i11 - i7;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (!x(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    i14 = i16 - measuredWidth;
                    i15 = layoutParams.rightMargin;
                } else if (absoluteGravity == 1) {
                    i14 = ((i16 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else {
                    i13 = layoutParams.leftMargin;
                    int e10 = (i5.c.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i13, e10, measuredWidth + i13, measuredHeight + e10);
                }
                i13 = i14 - i15;
                int e102 = (i5.c.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i13, e102, measuredWidth + i13, measuredHeight + e102);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        float f10;
        int L;
        int L2;
        int size = View.MeasureSpec.getSize(i7);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.f29809b0;
        ub ubVar = this.f29808b;
        if (((Drawable) ubVar.f9564c) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int L3 = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        C(ubVar, org.telegram.messenger.g0.L(6.0f), L3, 0);
        c5 c5Var = this.d;
        float f11 = 0.0f;
        if (c5Var != null && c5Var.getVisibility() != 8) {
            f10 = this.d.getTargetPillWidth();
        } else {
            f10 = 0.0f;
        }
        float t6 = t(true);
        if (z10) {
            L = org.telegram.messenger.g0.L(64.0f);
        } else {
            L = org.telegram.messenger.g0.L(18.0f);
        }
        if (f10 <= 0.0f && t6 <= 0.0f) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (f10 + t6));
        }
        int max = Math.max(Math.max(L, L2), this.f29829r0);
        v4 v4Var = this.f29810c;
        if (v4Var.f29755b != max) {
            v4Var.f29755b = max;
            v4Var.requestLayout();
        }
        C(v4Var, 0, rowTop, 0);
        v4Var.getLayoutParams().height = currentActionBarHeight;
        c5 c5Var2 = this.d;
        if (c5Var2 != null) {
            C(c5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        c5 c5Var3 = this.f29813e;
        if (c5Var3 != null) {
            C(c5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.f29813e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f29815f != null) {
            c5 c5Var4 = this.f29813e;
            if (c5Var4 != null) {
                f11 = c5Var4.getTargetPillWidth();
            }
            int L4 = org.telegram.messenger.g0.L(18.0f) + ((int) f11);
            org.telegram.ui.Components.h6 h6Var = this.h;
            if (h6Var != null && h6Var.getTag() != null) {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                C(this.f29815f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L4);
                this.f29815f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                C(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L4);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            } else {
                C(this.f29815f, org.telegram.messenger.g0.L(66.0f), rowTop, L4);
                this.f29815f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f29828r;
        if (frameLayout != null) {
            C(frameLayout, (int) getSearchPillLeft(), L3, org.telegram.messenger.g0.L(6.0f));
        }
        z4 z4Var = this.f29823n;
        if (z4Var != null) {
            C(z4Var, 0, L3, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f29831s0;
    }

    public final void p() {
        dh.c cVar = this.P;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return;
        }
        gh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        fh.g c10 = cVar.c(this, null, false);
        c10.p(aVar);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c10;
        fh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        i20.r(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(aVar);
        i20.r(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.K = c12;
        this.L = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final z4 q(String str) {
        if (this.f29823n == null) {
            z4 z4Var = new z4(getContext(), this, str);
            this.f29823n = z4Var;
            addView(z4Var, indexOfChild(this.f29808b), ja.e(-2, 46, 53));
            j();
        }
        return this.f29823n;
    }

    public final c5 r() {
        if (this.d == null) {
            c5 c5Var = new c5(getContext(), this, false);
            this.d = c5Var;
            addView(c5Var, indexOfChild(this.f29808b), ja.e(-2, -2, 53));
            j();
        }
        return this.d;
    }

    public final void s() {
        if (this.f29828r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29828r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f29828r, indexOfChild(this.f29808b), ja.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f29828r.addView(linearLayout, ja.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29834x = textView;
        textView.setTextSize(1, 17.0f);
        this.f29834x.setSingleLine(true);
        this.f29834x.setEllipsize(TextUtils.TruncateAt.END);
        this.f29834x.setGravity(19);
        this.f29834x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f29834x.setVisibility(8);
        linearLayout.addView(this.f29834x, ja.o(-2, -1));
        ah.i iVar = new ah.i(4, context, this);
        this.f29830s = iVar;
        iVar.setTextSize(1, 17.0f);
        this.f29830s.setSingleLine(true);
        this.f29830s.setBackground(null);
        this.f29830s.setPadding(0, 0, 0, 0);
        this.f29830s.setGravity(19);
        ah.i iVar2 = this.f29830s;
        iVar2.setInputType(iVar2.getInputType() | 524288);
        this.f29830s.setImeOptions(33554435);
        this.f29830s.setTextIsSelectable(false);
        this.f29830s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f29830s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.f29830s.setHint(charSequence);
        }
        this.f29830s.setOnEditorActionListener(new di.m(this, 4));
        this.f29830s.addTextChangedListener(new ah.j(this, 15));
        linearLayout.addView(this.f29830s, ja.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.f29833w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f29833w.setImageResource(2131231269);
        this.f29833w.setContentDescription(hd.M0(2131752099, null));
        this.f29833w.setOnClickListener(new t4(this, 1));
        this.f29828r.addView(this.f29833w, ja.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        H();
        k();
        G(2, this.V.f57085e, 0.0f, null);
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.W = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f29808b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f29808b.c(drawable);
        j();
        requestLayout();
    }

    public void setBackButtonImage(int i7) {
        Drawable drawable;
        if (i7 != 0) {
            drawable = getContext().getDrawable(i7).mutate();
        } else {
            drawable = null;
        }
        setBackButtonDrawable(drawable);
    }

    public void setBackButtonImageAnimated(int i7) {
        boolean z10;
        Drawable mutate = getContext().getDrawable(i7).mutate();
        ub ubVar = this.f29808b;
        Drawable drawable = (Drawable) ubVar.f9564c;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.c cVar = (te.c) ubVar.f9566f;
        if (drawable != null && ((w4) ubVar.h).w()) {
            ubVar.c(mutate);
            ubVar.d = (Drawable) ubVar.f9564c;
            cVar.c(0.0f);
            cVar.a(1.0f);
        } else {
            ubVar.c(mutate);
        }
        if (!z10) {
            j();
            requestLayout();
        }
    }

    public void setButtonsGlass(dh.c cVar) {
        this.P = cVar;
        if (this.M != null) {
            p();
        }
    }

    public void setButtonsGlassColorProvider(gh.a aVar) {
        this.O = aVar;
        if (aVar == null) {
            aVar = this.N;
        }
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.p(aVar);
            this.J.p(aVar);
            this.K.p(aVar);
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f29808b.setEnabled(z10);
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.setEnabled(z10);
        }
        z4 z4Var = this.f29823n;
        if (z4Var != null) {
            z4Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.f29809b0 != i7) {
            this.f29809b0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.f29831s0 = z10;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f29826p0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.f29824n0 = z10;
    }

    public void setMenuOverlayProvider(r10 r10Var) {
        this.Q = r10Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.f29807a0 != z10) {
            this.f29807a0 = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i7;
        s();
        this.f29834x.setText(charSequence);
        TextView textView = this.f29834x;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        textView.setVisibility(i7);
        k();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.E = charSequence;
        ah.i iVar = this.f29830s;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        ah.i iVar = this.f29830s;
        if (iVar == null) {
            this.F = charSequence;
            return;
        }
        iVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f29830s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(d5 d5Var) {
        if (d5Var == null && this.f29835y != null && this.G) {
            m(true);
        }
        this.f29835y = d5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f29810c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!w()) {
            setSubtitle(charSequence);
            return;
        }
        v4 v4Var = this.f29810c;
        j5 j5Var = (j5) v4Var.d;
        if (j5Var != null && j5Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) v4Var.f29758f, charSequence)) {
            v4Var.f29758f = charSequence;
            if (((j5) v4Var.f29757e) == null) {
                v4Var.f29757e = v4Var.a();
            }
            j5 j5Var2 = (j5) v4Var.d;
            j5 j5Var3 = (j5) v4Var.f29757e;
            v4Var.d = j5Var3;
            v4Var.f29757e = j5Var2;
            j5Var3.animate().cancel();
            ((j5) v4Var.d).l(charSequence, false);
            ((j5) v4Var.d).setVisibility(0);
            ((j5) v4Var.d).setAlpha(0.0f);
            ((j5) v4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
            ViewPropertyAnimator duration = ((j5) v4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            j5Var2.animate().cancel();
            j5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(erVar).withEndAction(new u4(j5Var2, 0)).start();
            v4Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) v4Var.f29758f, charSequence)) {
            v4Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i7) {
        this.f29822l0 = true;
        this.f29816f0 = i7;
        this.f29810c.d();
    }

    public void setTitle(CharSequence charSequence) {
        v4 v4Var = this.f29810c;
        int i7 = 0;
        v4Var.b(0);
        j5[] j5VarArr = (j5[]) v4Var.f29756c;
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            j5Var.animate().cancel();
            j5VarArr[1].setVisibility(8);
        }
        j5VarArr[0].animate().cancel();
        j5VarArr[0].setAlpha(1.0f);
        j5VarArr[0].setTranslationY(0.0f);
        j5VarArr[0].k(charSequence);
        j5 j5Var2 = j5VarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 4;
        }
        j5Var2.setVisibility(i7);
    }

    public void setTitleColor(int i7) {
        this.f29821k0 = true;
        this.f29814e0 = i7;
        this.f29810c.d();
    }

    public void setTitleMinSideInset(int i7) {
        if (this.f29829r0 != i7) {
            this.f29829r0 = i7;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f10) {
        if (this.f29832t0 != f10) {
            this.f29832t0 = f10;
            j();
        }
    }

    public final float t(boolean z10) {
        float actionModeFactor;
        z4 z4Var = this.f29823n;
        if (z4Var != null) {
            if (z4Var.getVisibility() != 8 || !z10) {
                if (z10) {
                    actionModeFactor = this.f29823n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f29823n.getVisibleFactor();
                }
                return (org.telegram.messenger.g0.L(12.0f) + this.f29823n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void u() {
        c5 c5Var = this.f29813e;
        if (c5Var != null && this.H) {
            this.H = false;
            c5Var.g();
            this.U.a(false, w());
            j();
            this.f29808b.b(false, w());
            ns.e().k(ns.f25565r4, new Object[0]);
        }
    }

    @Override
    public final void updateColors() {
        z();
        this.f29810c.d();
        this.f29808b.d();
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.i();
        }
        c5 c5Var2 = this.f29813e;
        if (c5Var2 != null) {
            c5Var2.i();
        }
        org.telegram.ui.Components.h6 h6Var = this.f29815f;
        if (h6Var != null) {
            h6Var.setTextColor(this.f29818h0);
        }
        z4 z4Var = this.f29823n;
        if (z4Var != null) {
            z4Var.c();
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            h6Var2.setTextColor(this.f29816f0);
        }
        if (this.f29830s != null) {
            H();
        }
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    public final boolean v() {
        if (this.f29813e != null && this.H) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if (this.f29811c0 && this.f29812d0) {
            return true;
        }
        return false;
    }

    public final boolean x(View view) {
        if (view != this.f29808b && view != this.f29810c && view != this.d && view != this.f29813e && view != this.f29815f && view != this.h && view != this.f29828r && view != this.f29823n) {
            return false;
        }
        return true;
    }

    public final boolean y(boolean z10, boolean z11) {
        m0 searchListener;
        boolean z12 = false;
        if (this.f29835y == null || this.G || this.H || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        s();
        this.G = true;
        c5 c5Var = this.d;
        if (c5Var != null) {
            c5Var.g();
        }
        ah.i iVar = this.f29830s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        iVar.setText(charSequence);
        this.F = null;
        this.f29830s.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.J3(this.f29830s);
        }
        if (z11 && w()) {
            z12 = true;
        }
        this.T.a(true, z12);
        j();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void z() {
        boolean z10 = this.f29821k0;
        e6 e6Var = this.f29806a;
        if (!z10) {
            this.f29814e0 = j6.w0(j6.G6, e6Var);
        }
        if (!this.f29822l0) {
            this.f29816f0 = j6.w0(j6.f29241y6, e6Var);
        }
        if (!this.m0) {
            this.f29817g0 = j6.w0(j6.G6, e6Var);
        }
        this.f29818h0 = j6.w0(j6.G6, e6Var);
        int i7 = j6.f28941i6;
        this.f29819i0 = j6.w0(i7, e6Var);
        this.f29820j0 = j6.w0(i7, e6Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
