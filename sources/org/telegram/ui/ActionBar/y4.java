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
import b8.mf;
import ci.fc;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
public class y4 extends FrameLayout implements qe.b, cs, z5, s4 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public gh.g I;
    public gh.g J;
    public gh.g K;
    public float L;
    public eh.c M;
    public hh.e N;
    public hh.a O;
    public eh.c P;
    public m10 Q;
    public i5 R;
    public q0 S;
    public final qe.a T;
    public final qe.a U;
    public final qe.a V;
    public j W;
    public final e6 f28850a;
    public boolean f28851a0;
    public final fc f28852b;
    public int f28853b0;
    public final x4 f28854c;
    public boolean f28855c0;
    public e5 d;
    public boolean f28856d0;
    public e5 f28857e;
    public int f28858e0;
    public org.telegram.ui.Components.h6 f28859f;
    public int f28860f0;
    public int f28861g0;
    public org.telegram.ui.Components.h6 h;
    public int f28862h0;
    public int f28863i0;
    public int f28864j0;
    public boolean f28865k0;
    public boolean f28866l0;
    public boolean m0;
    public b5 f28867n;
    public boolean f28868n0;
    public eh.c f28869o0;
    public si.d f28870p0;
    public final RectF f28871q0;
    public FrameLayout f28872r;
    public boolean f28873r0;
    public bh.g f28874s;
    public float f28875s0;
    public ImageView f28876w;
    public TextView f28877x;
    public f5 f28878y;

    public y4(Context context, e6 e6Var) {
        super(context);
        this.L = -1.0f;
        xq xqVar = xq.h;
        this.T = new qe.a(0, this, xqVar, 380L, false);
        this.U = new qe.a(1, this, xqVar, 380L, false);
        this.V = new qe.a(2, this, xqVar, 250L, false);
        this.f28851a0 = true;
        this.f28868n0 = true;
        this.f28871q0 = new RectF();
        this.f28875s0 = 1.0f;
        this.f28850a = e6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        w();
        x4 x4Var = new x4(this, context);
        this.f28854c = x4Var;
        addView(x4Var, mf.e(-1, -2, 51));
        fc fcVar = new fc(this, context);
        this.f28852b = fcVar;
        fcVar.setVisibility(8);
        fcVar.setContentDescription(bd.M0(2131754878, null));
        fcVar.setOnClickListener(new v4(this, 0));
        addView(fcVar, mf.e(46, 46, 51));
    }

    public static void e(y4 y4Var, int i3, KeyEvent keyEvent) {
        if (i3 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.g0.v1(y4Var.f28874s);
        m0 searchListener = y4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(y4Var.f28874s);
        }
    }

    public static m0 f(y4 y4Var) {
        return y4Var.getSearchListener();
    }

    private int getRowTop() {
        if (this.f28851a0) {
            return org.telegram.messenger.g0.f22602m;
        }
        return 0;
    }

    public m0 getSearchListener() {
        f5 f5Var = this.f28878y;
        if (f5Var != null) {
            return f5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f10;
        if (((Drawable) this.f28852b.f5142c) != null) {
            f10 = 58.0f;
        } else {
            f10 = 6.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public static void y(View view, float f10) {
        int i3;
        view.setAlpha(f10);
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        view.setVisibility(i3);
    }

    public static void z(View view, int i3, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public final void A(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        int L;
        if (!t()) {
            setTitle(charSequence);
            return;
        }
        x4 x4Var = this.f28854c;
        x4Var.b(0);
        x4Var.b(1);
        k5[] k5VarArr = (k5[]) x4Var.f28804c;
        k5 k5Var = k5VarArr[0];
        k5 k5Var2 = k5VarArr[1];
        k5VarArr[0] = k5Var2;
        k5VarArr[1] = k5Var;
        k5Var2.animate().cancel();
        k5Var2.k(charSequence);
        k5Var2.setVisibility(0);
        k5Var2.setAlpha(0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        if (!z10) {
            L2 = -L2;
        }
        k5Var2.setTranslationY(L2);
        k5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j10).setInterpolator(interpolator).start();
        k5Var.animate().cancel();
        ViewPropertyAnimator alpha = k5Var.animate().alpha(0.0f);
        if (z10) {
            L = -org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        alpha.translationY(L).setDuration(j10).setInterpolator(interpolator).withEndAction(new w4(k5Var, 1)).start();
        x4Var.requestLayout();
    }

    public final void B() {
        if (this.f28857e != null && !this.H) {
            this.H = true;
            e5 e5Var = this.d;
            if (e5Var != null) {
                e5Var.g();
            }
            bh.g gVar = this.f28874s;
            if (gVar != null && this.G) {
                org.telegram.messenger.g0.v1(gVar);
            }
            this.U.a(true, t());
            g();
            this.f28852b.b(true, t());
            hs.e().k(hs.f23297r4, new Object[0]);
        }
    }

    public final void C() {
        bh.g gVar = this.f28874s;
        int i3 = k6.G6;
        e6 e6Var = this.f28850a;
        gVar.setTextColor(k6.w0(i3, e6Var));
        this.f28877x.setTextColor(k6.w0(i3, e6Var));
        this.f28874s.setHintTextColor(k6.w0(k6.H6, e6Var));
        this.f28874s.setCursorColor(k6.w0(i3, e6Var));
        this.f28874s.setHighlightColor(k6.w0(k6.ig, e6Var));
        this.f28874s.setHandlesColor(k6.w0(k6.f27998jg, e6Var));
        this.f28876w.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.f28043m6, e6Var), PorterDuff.Mode.SRC_IN));
        this.f28876w.setBackground(k6.h0(this.f28863i0, 1, -1));
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        if (i3 == 2) {
            ImageView imageView = this.f28876w;
            if (imageView != null) {
                imageView.setAlpha(f10);
                float f12 = (f10 * 0.5f) + 0.5f;
                this.f28876w.setScaleX(f12);
                this.f28876w.setScaleY(f12);
                ImageView imageView2 = this.f28876w;
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
        g();
    }

    @Override
    public final boolean a(q0 q0Var, RectF rectF) {
        float f10 = 0.0f;
        if (q0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            k(rectF);
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
    public final boolean b() {
        return this.f28868n0;
    }

    @Override
    public final gh.g c(i5 i5Var) {
        eh.c cVar = this.f28869o0;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return null;
        }
        gh.g c2 = cVar.c(i5Var, null, false);
        c2.p(this.N);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c2;
    }

    @Override
    public final void d(i5 i5Var, q0 q0Var) {
        this.R = i5Var;
        this.S = q0Var;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.n4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        b5 b5Var;
        this.f28855c0 = this.f28856d0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.I != null) {
            fc fcVar = this.f28852b;
            if (fcVar.getVisibility() == 0 && fcVar.getAlpha() > 0.0f) {
                float width = (fcVar.getWidth() / 2.0f) + fcVar.getX();
                float height = (fcVar.getHeight() / 2.0f) + fcVar.getY();
                float scaleX = fcVar.getScaleX() * (fcVar.getWidth() / 2.0f);
                float scaleY = fcVar.getScaleY() * (fcVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (fcVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (b5Var = this.f28867n) != null && b5Var.f27413c == a5.f27378a && b5Var.getVisibility() == 0 && this.f28867n.getAlpha() > 0.0f) {
            float width2 = (this.f28867n.getWidth() / 2.0f) + this.f28867n.getX();
            float height2 = (this.f28867n.getHeight() / 2.0f) + this.f28867n.getY();
            float scaleX2 = this.f28867n.getScaleX() * (this.f28867n.getWidth() / 2.0f);
            float scaleY2 = this.f28867n.getScaleY() * (this.f28867n.getHeight() / 2.0f);
            this.K.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.K.setAlpha((int) (this.f28867n.getAlpha() * 255.0f));
            this.K.draw(canvas);
        }
        if (this.J != null) {
            RectF rectF = this.f28871q0;
            float k10 = k(rectF);
            q0 q0Var = this.S;
            if (q0Var != null && q0Var.getParent() == this.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (k10 * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        q0 q0Var;
        if (view == this.d && (q0Var = this.S) != null && q0Var.getParent() == this.d) {
            return false;
        }
        if (view == this.f28872r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f28871q0;
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
        e5 e5Var;
        e5 e5Var2;
        e5 e5Var3;
        e5 e5Var4;
        float T1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        x4 x4Var = this.f28854c;
        y(x4Var, this.f28875s0 * f12);
        x4Var.setScaleX(T12);
        x4Var.setScaleY(T12);
        b5 b5Var = this.f28867n;
        if (b5Var != null) {
            float visibleFactor = b5Var.getVisibleFactor() * f12;
            y(this.f28867n, visibleFactor);
            if (this.f28867n.f27413c == a5.f27378a) {
                T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor);
            } else {
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            }
            this.f28867n.setScaleX(T1);
            this.f28867n.setScaleY(T1);
        }
        e5 e5Var5 = this.d;
        int i3 = 0;
        if (e5Var5 != null) {
            e5Var5.setTranslationX(-q(false));
            y(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(e5Var3.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(e5Var4.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!u(childAt) && childAt.getVisibility() != 8) {
                y(childAt, f12);
            }
        }
        e5 e5Var6 = this.f28857e;
        if (e5Var6 != null) {
            y(e5Var6, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.f28857e.setPivotX(e5Var.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.f28857e.setPivotY(e5Var2.getHeight() / 2.0f);
            this.f28857e.setScaleX(T14);
            this.f28857e.setScaleY(T14);
        }
        org.telegram.ui.Components.h6 h6Var = this.f28859f;
        if (h6Var != null) {
            y(h6Var, actionModeFactor);
            this.f28859f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            y(h6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.f28872r;
        if (frameLayout != null) {
            y(frameLayout, f11);
            RectF rectF = this.f28871q0;
            k(rectF);
            this.f28872r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        fc fcVar = this.f28852b;
        if (((Drawable) fcVar.f5142c) != null) {
            fcVar.setVisibility(0);
            fcVar.setAlpha(1.0f);
            fcVar.setScaleX(1.0f);
            fcVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i3 = 8;
            }
            fcVar.setVisibility(i3);
            fcVar.setAlpha(actionModeFactor);
            fcVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            fcVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        fcVar.invalidate();
        invalidate();
    }

    public j getActionBarMenuOnItemClick() {
        return this.W;
    }

    public e5 getActionMode() {
        return this.f28857e;
    }

    public float getActionModeFactor() {
        return this.U.f53840e;
    }

    public org.telegram.ui.Components.h6 getActionModeTitle() {
        l();
        return this.f28859f;
    }

    public View getBackButton() {
        return this.f28852b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.f28852b.f5142c;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        hh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        if (aVar != null) {
            return aVar.w0();
        }
        return 0;
    }

    @Override
    public hh.a getButtonsGlassColorProvider() {
        hh.a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        return this.N;
    }

    public b5 getDoneButton() {
        return this.f28867n;
    }

    public int getExtraHeight() {
        return this.f28853b0;
    }

    public e5 getMenu() {
        return this.d;
    }

    @Override
    public hh.a getMenuGlassColorProvider() {
        return this.N;
    }

    public i5 getMenuOverlay() {
        m10 m10Var = this.Q;
        if (m10Var != null) {
            return (i5) m10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.f28871q0;
        k(rectF);
        return rectF.left;
    }

    @Override
    public e6 getMenuResourcesProvider() {
        return this.f28850a;
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
        return this.f28851a0;
    }

    @Override
    public i5 getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.f53840e;
    }

    public EditTextBoldCursor getSearchField() {
        p();
        return this.f28874s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f28854c.f28806f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public k5 getSubtitleTextView() {
        return (k5) this.f28854c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        k5 k5Var = ((k5[]) this.f28854c.f28804c)[0];
        if (k5Var != null) {
            charSequence = k5Var.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        x4 x4Var = this.f28854c;
        x4Var.b(0);
        return ((k5[]) x4Var.f28804c)[0].getTextPaint().getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return ((k5[]) this.f28854c.f28804c)[0];
    }

    public k5 getTitleTextView2() {
        return ((k5[]) this.f28854c.f28804c)[1];
    }

    public float getTitlesAlpha() {
        return this.f28875s0;
    }

    public final void h() {
        boolean z10;
        TextView textView;
        if (this.f28874s == null) {
            return;
        }
        m0 searchListener = getSearchListener();
        boolean z11 = true;
        if (this.f28874s.length() <= 0 && (((textView = this.f28877x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!t() || !this.G) {
            z11 = false;
        }
        this.V.a(z10, z11);
        this.f28876w.setEnabled(z10);
    }

    public final void i() {
        m0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f28877x.setVisibility(8);
            h();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void j(boolean z10) {
        if (this.G) {
            m0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.f28874s.clearFocus();
                if (z10) {
                    org.telegram.messenger.g0.v1(this.f28874s);
                }
                this.T.a(false, t());
                g();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float k(RectF rectF) {
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
        e5 e5Var = this.d;
        if (e5Var != null && e5Var.getVisibility() != 8) {
            f10 = this.d.getPillWidth();
        } else {
            f10 = 0.0f;
        }
        e5 e5Var2 = this.f28857e;
        if (e5Var2 != null) {
            f11 = e5Var2.getPillWidth();
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
        float width = (getWidth() - L) - q(false);
        float max = width - Math.max(f10, f16);
        float f18 = currentActionBarHeight - L2;
        float f19 = currentActionBarHeight + L2;
        if (T1 < 1.0f) {
            float f20 = (max + width) / 2.0f;
            float D = a1.g.D(1.0f, T1, L2, (width - max) / 2.0f);
            float f21 = f20 - D;
            width = f20 + D;
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

    public final e5 l() {
        if (this.f28857e == null) {
            e5 e5Var = new e5(getContext(), this, true);
            this.f28857e = e5Var;
            View view = this.f28852b;
            addView(e5Var, indexOfChild(view), mf.e(-2, -2, 53));
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), true, true, true);
            this.f28859f = h6Var;
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f28859f.setTypeface(org.telegram.messenger.g0.o());
            this.f28859f.setTextColor(this.f28862h0);
            this.f28859f.setGravity(19);
            this.f28859f.setEllipsizeByGradient(true);
            this.f28859f.b(0.6f, 320L, xq.h);
            addView(this.f28859f, indexOfChild(view), mf.e(-1, -2, 51));
            g();
        }
        return this.f28857e;
    }

    public final void m() {
        eh.c cVar = this.P;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return;
        }
        hh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        gh.g c2 = cVar.c(this, null, false);
        c2.p(aVar);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c2;
        gh.g c10 = cVar.c(this, null, false);
        c10.p(aVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c10;
        gh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.K = c11;
        this.L = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final b5 n(String str) {
        if (this.f28867n == null) {
            b5 b5Var = new b5(getContext(), this, str);
            this.f28867n = b5Var;
            addView(b5Var, indexOfChild(this.f28852b), mf.e(-2, 46, 53));
            g();
        }
        return this.f28867n;
    }

    public final e5 o() {
        if (this.d == null) {
            e5 e5Var = new e5(getContext(), this, false);
            this.d = e5Var;
            addView(e5Var, indexOfChild(this.f28852b), mf.e(-2, -2, 53));
            g();
        }
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28856d0 = true;
        hs.e().c(this, hs.n4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28856d0 = false;
        this.f28855c0 = false;
        hs.e().n(this, hs.n4);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z10, i3, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i16 = i11 - i3;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (!u(childAt) && childAt.getVisibility() != 8) {
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
                    int e10 = (k2.p1.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i13, e10, measuredWidth + i13, measuredHeight + e10);
                }
                i13 = i14 - i15;
                int e102 = (k2.p1.e(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i13, e102, measuredWidth + i13, measuredHeight + e102);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        float f10;
        int L;
        int L2;
        int size = View.MeasureSpec.getSize(i3);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.f28853b0;
        fc fcVar = this.f28852b;
        if (((Drawable) fcVar.f5142c) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int L3 = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        z(fcVar, org.telegram.messenger.g0.L(6.0f), L3, 0);
        e5 e5Var = this.d;
        float f11 = 0.0f;
        if (e5Var != null && e5Var.getVisibility() != 8) {
            f10 = this.d.getTargetPillWidth();
        } else {
            f10 = 0.0f;
        }
        float q10 = q(true);
        if (z10) {
            L = org.telegram.messenger.g0.L(64.0f);
        } else {
            L = org.telegram.messenger.g0.L(18.0f);
        }
        if (f10 <= 0.0f && q10 <= 0.0f) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (f10 + q10));
        }
        int max = Math.max(L, L2);
        x4 x4Var = this.f28854c;
        if (x4Var.f28803b != max) {
            x4Var.f28803b = max;
            x4Var.requestLayout();
        }
        z(x4Var, 0, rowTop, 0);
        x4Var.getLayoutParams().height = currentActionBarHeight;
        e5 e5Var2 = this.d;
        if (e5Var2 != null) {
            z(e5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        e5 e5Var3 = this.f28857e;
        if (e5Var3 != null) {
            z(e5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.f28857e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f28859f != null) {
            e5 e5Var4 = this.f28857e;
            if (e5Var4 != null) {
                f11 = e5Var4.getTargetPillWidth();
            }
            int L4 = org.telegram.messenger.g0.L(18.0f) + ((int) f11);
            org.telegram.ui.Components.h6 h6Var = this.h;
            if (h6Var != null && h6Var.getTag() != null) {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                z(this.f28859f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L4);
                this.f28859f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                z(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L4);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            } else {
                z(this.f28859f, org.telegram.messenger.g0.L(66.0f), rowTop, L4);
                this.f28859f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f28872r;
        if (frameLayout != null) {
            z(frameLayout, (int) getSearchPillLeft(), L3, org.telegram.messenger.g0.L(6.0f));
        }
        b5 b5Var = this.f28867n;
        if (b5Var != null) {
            z(b5Var, 0, L3, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f28873r0;
    }

    public final void p() {
        if (this.f28872r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28872r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f28872r, indexOfChild(this.f28852b), mf.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f28872r.addView(linearLayout, mf.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28877x = textView;
        textView.setTextSize(1, 17.0f);
        this.f28877x.setSingleLine(true);
        this.f28877x.setEllipsize(TextUtils.TruncateAt.END);
        this.f28877x.setGravity(19);
        this.f28877x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f28877x.setVisibility(8);
        linearLayout.addView(this.f28877x, mf.o(-2, -1));
        bh.g gVar = new bh.g(4, context, this);
        this.f28874s = gVar;
        gVar.setTextSize(1, 17.0f);
        this.f28874s.setSingleLine(true);
        this.f28874s.setBackground(null);
        this.f28874s.setPadding(0, 0, 0, 0);
        this.f28874s.setGravity(19);
        bh.g gVar2 = this.f28874s;
        gVar2.setInputType(gVar2.getInputType() | 524288);
        this.f28874s.setImeOptions(33554435);
        this.f28874s.setTextIsSelectable(false);
        this.f28874s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f28874s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.f28874s.setHint(charSequence);
        }
        this.f28874s.setOnEditorActionListener(new ci.o(this, 4));
        this.f28874s.addTextChangedListener(new bh.h(this, 13));
        linearLayout.addView(this.f28874s, mf.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.f28876w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f28876w.setImageResource(2131231269);
        this.f28876w.setContentDescription(bd.M0(2131752099, null));
        this.f28876w.setOnClickListener(new v4(this, 1));
        this.f28872r.addView(this.f28876w, mf.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        C();
        h();
        Y(2, this.V.f53840e, 0.0f, null);
    }

    public final float q(boolean z10) {
        float actionModeFactor;
        b5 b5Var = this.f28867n;
        if (b5Var != null) {
            if (b5Var.getVisibility() != 8 || !z10) {
                if (z10) {
                    actionModeFactor = this.f28867n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f28867n.getVisibleFactor();
                }
                return (org.telegram.messenger.g0.L(12.0f) + this.f28867n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void r() {
        e5 e5Var = this.f28857e;
        if (e5Var != null && this.H) {
            this.H = false;
            e5Var.g();
            this.U.a(false, t());
            g();
            this.f28852b.b(false, t());
            hs.e().k(hs.f23297r4, new Object[0]);
        }
    }

    public final boolean s() {
        if (this.f28857e != null && this.H) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.W = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f28852b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f28852b.c(drawable);
        g();
        requestLayout();
    }

    public void setBackButtonImage(int i3) {
        Drawable drawable;
        if (i3 != 0) {
            drawable = getContext().getDrawable(i3).mutate();
        } else {
            drawable = null;
        }
        setBackButtonDrawable(drawable);
    }

    public void setBackButtonImageAnimated(int i3) {
        boolean z10;
        Drawable mutate = getContext().getDrawable(i3).mutate();
        fc fcVar = this.f28852b;
        Drawable drawable = (Drawable) fcVar.f5142c;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        qe.c cVar = (qe.c) fcVar.f5144f;
        if (drawable != null && ((y4) fcVar.h).t()) {
            fcVar.c(mutate);
            fcVar.d = (Drawable) fcVar.f5142c;
            cVar.c(0.0f);
            cVar.a(1.0f);
        } else {
            fcVar.c(mutate);
        }
        if (!z10) {
            g();
            requestLayout();
        }
    }

    public void setButtonsGlass(eh.c cVar) {
        this.P = cVar;
        if (this.M != null) {
            m();
        }
    }

    public void setButtonsGlassColorProvider(hh.a aVar) {
        this.O = aVar;
        if (aVar == null) {
            aVar = this.N;
        }
        gh.g gVar = this.I;
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
        this.f28852b.setEnabled(z10);
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.setEnabled(z10);
        }
        b5 b5Var = this.f28867n;
        if (b5Var != null) {
            b5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i3) {
        if (this.f28853b0 != i3) {
            this.f28853b0 = i3;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.f28873r0 = z10;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        si.d dVar = this.f28870p0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.f28868n0 = z10;
    }

    public void setMenuOverlayProvider(m10 m10Var) {
        this.Q = m10Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.f28851a0 != z10) {
            this.f28851a0 = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i3;
        p();
        this.f28877x.setText(charSequence);
        TextView textView = this.f28877x;
        if (TextUtils.isEmpty(charSequence)) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        textView.setVisibility(i3);
        h();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.E = charSequence;
        bh.g gVar = this.f28874s;
        if (gVar != null) {
            gVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        bh.g gVar = this.f28874s;
        if (gVar == null) {
            this.F = charSequence;
            return;
        }
        gVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f28874s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(f5 f5Var) {
        if (f5Var == null && this.f28878y != null && this.G) {
            j(true);
        }
        this.f28878y = f5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f28854c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!t()) {
            setSubtitle(charSequence);
            return;
        }
        x4 x4Var = this.f28854c;
        k5 k5Var = (k5) x4Var.d;
        if (k5Var != null && k5Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) x4Var.f28806f, charSequence)) {
            x4Var.f28806f = charSequence;
            if (((k5) x4Var.f28805e) == null) {
                x4Var.f28805e = x4Var.a();
            }
            k5 k5Var2 = (k5) x4Var.d;
            k5 k5Var3 = (k5) x4Var.f28805e;
            x4Var.d = k5Var3;
            x4Var.f28805e = k5Var2;
            k5Var3.animate().cancel();
            ((k5) x4Var.d).l(charSequence, false);
            ((k5) x4Var.d).setVisibility(0);
            ((k5) x4Var.d).setAlpha(0.0f);
            ((k5) x4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
            ViewPropertyAnimator duration = ((k5) x4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            k5Var2.animate().cancel();
            k5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(xqVar).withEndAction(new w4(k5Var2, 0)).start();
            x4Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) x4Var.f28806f, charSequence)) {
            x4Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i3) {
        this.f28866l0 = true;
        this.f28860f0 = i3;
        this.f28854c.d();
    }

    public void setTitle(CharSequence charSequence) {
        x4 x4Var = this.f28854c;
        int i3 = 0;
        x4Var.b(0);
        k5[] k5VarArr = (k5[]) x4Var.f28804c;
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            k5Var.animate().cancel();
            k5VarArr[1].setVisibility(8);
        }
        k5VarArr[0].animate().cancel();
        k5VarArr[0].setAlpha(1.0f);
        k5VarArr[0].setTranslationY(0.0f);
        k5VarArr[0].k(charSequence);
        k5 k5Var2 = k5VarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i3 = 4;
        }
        k5Var2.setVisibility(i3);
    }

    public void setTitleColor(int i3) {
        this.f28865k0 = true;
        this.f28858e0 = i3;
        this.f28854c.d();
    }

    public void setTitlesAlpha(float f10) {
        if (this.f28875s0 != f10) {
            this.f28875s0 = f10;
            g();
        }
    }

    public final boolean t() {
        if (this.f28855c0 && this.f28856d0) {
            return true;
        }
        return false;
    }

    public final boolean u(View view) {
        if (view != this.f28852b && view != this.f28854c && view != this.d && view != this.f28857e && view != this.f28859f && view != this.h && view != this.f28872r && view != this.f28867n) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        w();
        this.f28854c.d();
        this.f28852b.d();
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.i();
        }
        e5 e5Var2 = this.f28857e;
        if (e5Var2 != null) {
            e5Var2.i();
        }
        org.telegram.ui.Components.h6 h6Var = this.f28859f;
        if (h6Var != null) {
            h6Var.setTextColor(this.f28862h0);
        }
        b5 b5Var = this.f28867n;
        if (b5Var != null) {
            b5Var.c();
        }
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            h6Var2.setTextColor(this.f28860f0);
        }
        if (this.f28874s != null) {
            C();
        }
        gh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        gh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    public final boolean v(boolean z10, boolean z11) {
        m0 searchListener;
        boolean z12 = false;
        if (this.f28878y == null || this.G || this.H || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        p();
        this.G = true;
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.g();
        }
        bh.g gVar = this.f28874s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        gVar.setText(charSequence);
        this.F = null;
        this.f28874s.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.K3(this.f28874s);
        }
        if (z11 && t()) {
            z12 = true;
        }
        this.T.a(true, z12);
        g();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void w() {
        boolean z10 = this.f28865k0;
        e6 e6Var = this.f28850a;
        if (!z10) {
            this.f28858e0 = k6.w0(k6.G6, e6Var);
        }
        if (!this.f28866l0) {
            this.f28860f0 = k6.w0(k6.f28273y6, e6Var);
        }
        if (!this.m0) {
            this.f28861g0 = k6.w0(k6.G6, e6Var);
        }
        this.f28862h0 = k6.w0(k6.G6, e6Var);
        int i3 = k6.f27972i6;
        this.f28863i0 = k6.w0(i3, e6Var);
        this.f28864j0 = k6.w0(i3, e6Var);
    }

    public final void x(int i3, boolean z10) {
        boolean z11;
        String E = bd.E(i3, ' ');
        l();
        org.telegram.ui.Components.h6 h6Var = this.f28859f;
        if (z10 && t() && this.H) {
            z11 = true;
        } else {
            z11 = false;
        }
        h6Var.c(E, z11, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
