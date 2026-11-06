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
import bi.nd;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
public class y4 extends FrameLayout implements te.b, ls, a6, s4 {
    public CharSequence D;
    public CharSequence E;
    public boolean F;
    public boolean G;
    public fh.g H;
    public fh.g I;
    public fh.g J;
    public float K;
    public dh.c L;
    public gh.e M;
    public gh.a N;
    public dh.c O;
    public u10 P;
    public i5 Q;
    public r0 R;
    public final te.a S;
    public final te.a T;
    public final te.a U;
    public j V;
    public boolean W;
    public final f6 f28777a;
    public int f28778a0;
    public final nd f28779b;
    public boolean f28780b0;
    public final x4 f28781c;
    public boolean f28782c0;
    public e5 d;
    public int f28783d0;
    public e5 f28784e;
    public int f28785e0;
    public org.telegram.ui.Components.j6 f28786f;
    public int f28787f0;
    public int f28788g0;
    public org.telegram.ui.Components.j6 h;
    public int f28789h0;
    public int f28790i0;
    public boolean f28791j0;
    public boolean f28792k0;
    public boolean f28793l0;
    public boolean m0;
    public b5 f28794n;
    public dh.c f28795n0;
    public ri.d f28796o0;
    public final RectF f28797p0;
    public boolean f28798q0;
    public FrameLayout f28799r;
    public float f28800r0;
    public ah.i f28801s;
    public ImageView f28802w;
    public TextView f28803x;
    public f5 f28804y;

    public y4(Context context, f6 f6Var) {
        super(context);
        this.K = -1.0f;
        xq xqVar = xq.h;
        this.S = new te.a(0, this, xqVar, 380L, false);
        this.T = new te.a(1, this, xqVar, 380L, false);
        this.U = new te.a(2, this, xqVar, 250L, false);
        this.W = true;
        this.m0 = true;
        this.f28797p0 = new RectF();
        this.f28800r0 = 1.0f;
        this.f28777a = f6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        w();
        x4 x4Var = new x4(this, context);
        this.f28781c = x4Var;
        addView(x4Var, ha.e(-1, -2, 51));
        nd ndVar = new nd(this, context);
        this.f28779b = ndVar;
        ndVar.setVisibility(8);
        ndVar.setContentDescription(hd.M0(2131754878, null));
        ndVar.setOnClickListener(new v4(this, 0));
        addView(ndVar, ha.e(46, 46, 51));
    }

    public static void e(y4 y4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.g0.v1(y4Var.f28801s);
        n0 searchListener = y4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(y4Var.f28801s);
        }
    }

    public static n0 f(y4 y4Var) {
        return y4Var.getSearchListener();
    }

    private int getRowTop() {
        if (this.W) {
            return org.telegram.messenger.g0.f22531m;
        }
        return 0;
    }

    public n0 getSearchListener() {
        f5 f5Var = this.f28804y;
        if (f5Var != null) {
            return f5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f10;
        if (((Drawable) this.f28779b.f4439c) != null) {
            f10 = 58.0f;
        } else {
            f10 = 6.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public static void y(View view, float f10) {
        int i7;
        view.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        view.setVisibility(i7);
    }

    public static void z(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public final void A(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        int L;
        if (!t()) {
            setTitle(charSequence);
            return;
        }
        x4 x4Var = this.f28781c;
        x4Var.b(0);
        x4Var.b(1);
        k5[] k5VarArr = (k5[]) x4Var.f28746c;
        k5 k5Var = k5VarArr[0];
        k5 k5Var2 = k5VarArr[1];
        k5VarArr[0] = k5Var2;
        k5VarArr[1] = k5Var;
        k5Var2.animate().cancel();
        k5Var2.k(charSequence);
        k5Var2.setVisibility(0);
        k5Var2.setAlpha(0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        if (!z9) {
            L2 = -L2;
        }
        k5Var2.setTranslationY(L2);
        k5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        k5Var.animate().cancel();
        ViewPropertyAnimator alpha = k5Var.animate().alpha(0.0f);
        if (z9) {
            L = -org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        alpha.translationY(L).setDuration(j3).setInterpolator(interpolator).withEndAction(new w4(k5Var, 1)).start();
        x4Var.requestLayout();
    }

    public final void B() {
        if (this.f28784e != null && !this.G) {
            this.G = true;
            e5 e5Var = this.d;
            if (e5Var != null) {
                e5Var.g();
            }
            ah.i iVar = this.f28801s;
            if (iVar != null && this.F) {
                org.telegram.messenger.g0.v1(iVar);
            }
            this.T.a(true, t());
            g();
            this.f28779b.b(true, t());
            qs.e().k(qs.f25051r4, new Object[0]);
        }
    }

    public final void C() {
        ah.i iVar = this.f28801s;
        int i7 = k6.G6;
        f6 f6Var = this.f28777a;
        iVar.setTextColor(k6.w0(i7, f6Var));
        this.f28803x.setTextColor(k6.w0(i7, f6Var));
        this.f28801s.setHintTextColor(k6.w0(k6.H6, f6Var));
        this.f28801s.setCursorColor(k6.w0(i7, f6Var));
        this.f28801s.setHighlightColor(k6.w0(k6.f27948ig, f6Var));
        this.f28801s.setHandlesColor(k6.w0(k6.f27967jg, f6Var));
        this.f28802w.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.f28013m6, f6Var), PorterDuff.Mode.SRC_IN));
        this.f28802w.setBackground(k6.h0(this.f28789h0, 1, -1));
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 2) {
            ImageView imageView = this.f28802w;
            if (imageView != null) {
                imageView.setAlpha(f10);
                float f12 = (f10 * 0.5f) + 0.5f;
                this.f28802w.setScaleX(f12);
                this.f28802w.setScaleY(f12);
                ImageView imageView2 = this.f28802w;
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
    public final boolean a(r0 r0Var, RectF rectF) {
        float f10 = 0.0f;
        if (r0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            k(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) r0Var.getParent();
        if (view != null) {
            f10 = view.getX();
        }
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + f10;
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override
    public final boolean b() {
        return this.m0;
    }

    @Override
    public final fh.g c(i5 i5Var) {
        dh.c cVar = this.f28795n0;
        if (cVar == null) {
            cVar = this.L;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(i5Var, null, false);
        c10.p(this.M);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public final void d(i5 i5Var, r0 r0Var) {
        this.Q = i5Var;
        this.R = r0Var;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25027n4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        b5 b5Var;
        this.f28780b0 = this.f28782c0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.H != null) {
            nd ndVar = this.f28779b;
            if (ndVar.getVisibility() == 0 && ndVar.getAlpha() > 0.0f) {
                float width = (ndVar.getWidth() / 2.0f) + ndVar.getX();
                float height = (ndVar.getHeight() / 2.0f) + ndVar.getY();
                float scaleX = ndVar.getScaleX() * (ndVar.getWidth() / 2.0f);
                float scaleY = ndVar.getScaleY() * (ndVar.getHeight() / 2.0f);
                this.H.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.H.setAlpha((int) (ndVar.getAlpha() * 255.0f));
                this.H.draw(canvas);
            }
        }
        if (this.J != null && (b5Var = this.f28794n) != null && b5Var.f27346c == a5.f27327a && b5Var.getVisibility() == 0 && this.f28794n.getAlpha() > 0.0f) {
            float width2 = (this.f28794n.getWidth() / 2.0f) + this.f28794n.getX();
            float height2 = (this.f28794n.getHeight() / 2.0f) + this.f28794n.getY();
            float scaleX2 = this.f28794n.getScaleX() * (this.f28794n.getWidth() / 2.0f);
            float scaleY2 = this.f28794n.getScaleY() * (this.f28794n.getHeight() / 2.0f);
            this.J.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.J.setAlpha((int) (this.f28794n.getAlpha() * 255.0f));
            this.J.draw(canvas);
        }
        if (this.I != null) {
            RectF rectF = this.f28797p0;
            float k10 = k(rectF);
            r0 r0Var = this.R;
            if (r0Var != null && r0Var.getParent() == this.d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (k10 > 0.0f && rectF.width() > 0.0f && !z9) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.r(height3);
                }
                this.I.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.I.setAlpha((int) (k10 * 255.0f));
                this.I.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r0 r0Var;
        if (view == this.d && (r0Var = this.R) != null && r0Var.getParent() == this.d) {
            return false;
        }
        if (view == this.f28799r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f28797p0;
            k(rectF);
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
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
        x4 x4Var = this.f28781c;
        y(x4Var, this.f28800r0 * f12);
        x4Var.setScaleX(T12);
        x4Var.setScaleY(T12);
        b5 b5Var = this.f28794n;
        if (b5Var != null) {
            float visibleFactor = b5Var.getVisibleFactor() * f12;
            y(this.f28794n, visibleFactor);
            if (this.f28794n.f27346c == a5.f27327a) {
                T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor);
            } else {
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            }
            this.f28794n.setScaleX(T1);
            this.f28794n.setScaleY(T1);
        }
        e5 e5Var5 = this.d;
        int i7 = 0;
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
        e5 e5Var6 = this.f28784e;
        if (e5Var6 != null) {
            y(e5Var6, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.f28784e.setPivotX(e5Var.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.f28784e.setPivotY(e5Var2.getHeight() / 2.0f);
            this.f28784e.setScaleX(T14);
            this.f28784e.setScaleY(T14);
        }
        org.telegram.ui.Components.j6 j6Var = this.f28786f;
        if (j6Var != null) {
            y(j6Var, actionModeFactor);
            this.f28786f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            y(j6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.f28799r;
        if (frameLayout != null) {
            y(frameLayout, f11);
            RectF rectF = this.f28797p0;
            k(rectF);
            this.f28799r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        nd ndVar = this.f28779b;
        if (((Drawable) ndVar.f4439c) != null) {
            ndVar.setVisibility(0);
            ndVar.setAlpha(1.0f);
            ndVar.setScaleX(1.0f);
            ndVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i7 = 8;
            }
            ndVar.setVisibility(i7);
            ndVar.setAlpha(actionModeFactor);
            ndVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            ndVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        ndVar.invalidate();
        invalidate();
    }

    public j getActionBarMenuOnItemClick() {
        return this.V;
    }

    public e5 getActionMode() {
        return this.f28784e;
    }

    public float getActionModeFactor() {
        return this.T.f55395e;
    }

    public org.telegram.ui.Components.j6 getActionModeTitle() {
        l();
        return this.f28786f;
    }

    public View getBackButton() {
        return this.f28779b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.f28779b.f4439c;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        if (aVar != null) {
            return aVar.e1();
        }
        return 0;
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        gh.a aVar = this.N;
        if (aVar != null) {
            return aVar;
        }
        return this.M;
    }

    public b5 getDoneButton() {
        return this.f28794n;
    }

    public int getExtraHeight() {
        return this.f28778a0;
    }

    public e5 getMenu() {
        return this.d;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return this.M;
    }

    public i5 getMenuOverlay() {
        u10 u10Var = this.P;
        if (u10Var != null) {
            return (i5) u10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.f28797p0;
        k(rectF);
        return rectF.left;
    }

    @Override
    public f6 getMenuResourcesProvider() {
        return this.f28777a;
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
        return this.W;
    }

    @Override
    public i5 getOpenMenuOverlay() {
        return this.Q;
    }

    public float getSearchFactor() {
        return this.S.f55395e;
    }

    public EditTextBoldCursor getSearchField() {
        p();
        return this.f28801s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f28781c.f28748f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public k5 getSubtitleTextView() {
        return (k5) this.f28781c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        k5 k5Var = ((k5[]) this.f28781c.f28746c)[0];
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
        x4 x4Var = this.f28781c;
        x4Var.b(0);
        return ((k5[]) x4Var.f28746c)[0].getTextPaint().getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return ((k5[]) this.f28781c.f28746c)[0];
    }

    public k5 getTitleTextView2() {
        return ((k5[]) this.f28781c.f28746c)[1];
    }

    public float getTitlesAlpha() {
        return this.f28800r0;
    }

    public final void h() {
        boolean z9;
        TextView textView;
        if (this.f28801s == null) {
            return;
        }
        n0 searchListener = getSearchListener();
        boolean z10 = true;
        if (this.f28801s.length() <= 0 && (((textView = this.f28803x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!t() || !this.F) {
            z10 = false;
        }
        this.U.a(z9, z10);
        this.f28802w.setEnabled(z9);
    }

    public final void i() {
        n0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f28803x.setVisibility(8);
            h();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void j(boolean z9) {
        if (this.F) {
            n0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.f28801s.clearFocus();
                if (z9) {
                    org.telegram.messenger.g0.v1(this.f28801s);
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
        e5 e5Var2 = this.f28784e;
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
            float v = com.google.android.recaptcha.internal.a.v(1.0f, T1, L2, (width - max) / 2.0f);
            float f21 = f20 - v;
            width = f20 + v;
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
        if (this.f28784e == null) {
            e5 e5Var = new e5(getContext(), this, true);
            this.f28784e = e5Var;
            View view = this.f28779b;
            addView(e5Var, indexOfChild(view), ha.e(-2, -2, 53));
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), true, true, true);
            this.f28786f = j6Var;
            j6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f28786f.setTypeface(org.telegram.messenger.g0.o());
            this.f28786f.setTextColor(this.f28788g0);
            this.f28786f.setGravity(19);
            this.f28786f.setEllipsizeByGradient(true);
            this.f28786f.b(0.6f, 320L, xq.h);
            addView(this.f28786f, indexOfChild(view), ha.e(-1, -2, 51));
            g();
        }
        return this.f28784e;
    }

    public final void m() {
        dh.c cVar = this.O;
        if (cVar == null) {
            cVar = this.L;
        }
        if (cVar == null) {
            return;
        }
        gh.a aVar = this.N;
        if (aVar == null) {
            aVar = this.M;
        }
        fh.g c10 = cVar.c(this, null, false);
        c10.p(aVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.H = c10;
        fh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(aVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c12;
        this.K = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final b5 n(String str) {
        if (this.f28794n == null) {
            b5 b5Var = new b5(getContext(), this, str);
            this.f28794n = b5Var;
            addView(b5Var, indexOfChild(this.f28779b), ha.e(-2, 46, 53));
            g();
        }
        return this.f28794n;
    }

    public final e5 o() {
        if (this.d == null) {
            e5 e5Var = new e5(getContext(), this, false);
            this.d = e5Var;
            addView(e5Var, indexOfChild(this.f28779b), ha.e(-2, -2, 53));
            g();
        }
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28782c0 = true;
        qs.e().c(this, qs.f25027n4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28782c0 = false;
        this.f28780b0 = false;
        qs.e().n(this, qs.f25027n4);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z9, i7, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i16 = i11 - i7;
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
                    int D = (jg.g.D(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i13, D, measuredWidth + i13, measuredHeight + D);
                }
                i13 = i14 - i15;
                int D2 = (jg.g.D(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i13, D2, measuredWidth + i13, measuredHeight + D2);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        float f10;
        int L;
        int L2;
        int size = View.MeasureSpec.getSize(i7);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.f28778a0;
        nd ndVar = this.f28779b;
        if (((Drawable) ndVar.f4439c) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int L3 = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        z(ndVar, org.telegram.messenger.g0.L(6.0f), L3, 0);
        e5 e5Var = this.d;
        float f11 = 0.0f;
        if (e5Var != null && e5Var.getVisibility() != 8) {
            f10 = this.d.getTargetPillWidth();
        } else {
            f10 = 0.0f;
        }
        float q10 = q(true);
        if (z9) {
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
        x4 x4Var = this.f28781c;
        if (x4Var.f28745b != max) {
            x4Var.f28745b = max;
            x4Var.requestLayout();
        }
        z(x4Var, 0, rowTop, 0);
        x4Var.getLayoutParams().height = currentActionBarHeight;
        e5 e5Var2 = this.d;
        if (e5Var2 != null) {
            z(e5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        e5 e5Var3 = this.f28784e;
        if (e5Var3 != null) {
            z(e5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.f28784e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f28786f != null) {
            e5 e5Var4 = this.f28784e;
            if (e5Var4 != null) {
                f11 = e5Var4.getTargetPillWidth();
            }
            int L4 = org.telegram.messenger.g0.L(18.0f) + ((int) f11);
            org.telegram.ui.Components.j6 j6Var = this.h;
            if (j6Var != null && j6Var.getTag() != null) {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                z(this.f28786f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L4);
                this.f28786f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                z(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L4);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            } else {
                z(this.f28786f, org.telegram.messenger.g0.L(66.0f), rowTop, L4);
                this.f28786f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f28799r;
        if (frameLayout != null) {
            z(frameLayout, (int) getSearchPillLeft(), L3, org.telegram.messenger.g0.L(6.0f));
        }
        b5 b5Var = this.f28794n;
        if (b5Var != null) {
            z(b5Var, 0, L3, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f28798q0;
    }

    public final void p() {
        if (this.f28799r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28799r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f28799r, indexOfChild(this.f28779b), ha.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f28799r.addView(linearLayout, ha.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28803x = textView;
        textView.setTextSize(1, 17.0f);
        this.f28803x.setSingleLine(true);
        this.f28803x.setEllipsize(TextUtils.TruncateAt.END);
        this.f28803x.setGravity(19);
        this.f28803x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f28803x.setVisibility(8);
        linearLayout.addView(this.f28803x, ha.o(-2, -1));
        ah.i iVar = new ah.i(4, context, this);
        this.f28801s = iVar;
        iVar.setTextSize(1, 17.0f);
        this.f28801s.setSingleLine(true);
        this.f28801s.setBackground(null);
        this.f28801s.setPadding(0, 0, 0, 0);
        this.f28801s.setGravity(19);
        ah.i iVar2 = this.f28801s;
        iVar2.setInputType(iVar2.getInputType() | 524288);
        this.f28801s.setImeOptions(33554435);
        this.f28801s.setTextIsSelectable(false);
        this.f28801s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f28801s.setCursorWidth(1.5f);
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            this.f28801s.setHint(charSequence);
        }
        this.f28801s.setOnEditorActionListener(new bi.p(this, 4));
        this.f28801s.addTextChangedListener(new ah.j(this, 13));
        linearLayout.addView(this.f28801s, ha.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.f28802w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f28802w.setImageResource(2131231269);
        this.f28802w.setContentDescription(hd.M0(2131752099, null));
        this.f28802w.setOnClickListener(new v4(this, 1));
        this.f28799r.addView(this.f28802w, ha.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        C();
        h();
        Y(2, this.U.f55395e, 0.0f, null);
    }

    public final float q(boolean z9) {
        float actionModeFactor;
        b5 b5Var = this.f28794n;
        if (b5Var != null) {
            if (b5Var.getVisibility() != 8 || !z9) {
                if (z9) {
                    actionModeFactor = this.f28794n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f28794n.getVisibleFactor();
                }
                return (org.telegram.messenger.g0.L(12.0f) + this.f28794n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void r() {
        e5 e5Var = this.f28784e;
        if (e5Var != null && this.G) {
            this.G = false;
            e5Var.g();
            this.T.a(false, t());
            g();
            this.f28779b.b(false, t());
            qs.e().k(qs.f25051r4, new Object[0]);
        }
    }

    public final boolean s() {
        if (this.f28784e != null && this.G) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.V = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f28779b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f28779b.c(drawable);
        g();
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
        boolean z9;
        Drawable mutate = getContext().getDrawable(i7).mutate();
        nd ndVar = this.f28779b;
        Drawable drawable = (Drawable) ndVar.f4439c;
        if (drawable != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.c cVar = (te.c) ndVar.f4441f;
        if (drawable != null && ((y4) ndVar.h).t()) {
            ndVar.c(mutate);
            ndVar.d = (Drawable) ndVar.f4439c;
            cVar.c(0.0f);
            cVar.a(1.0f);
        } else {
            ndVar.c(mutate);
        }
        if (!z9) {
            g();
            requestLayout();
        }
    }

    public void setButtonsGlass(dh.c cVar) {
        this.O = cVar;
        if (this.L != null) {
            m();
        }
    }

    public void setButtonsGlassColorProvider(gh.a aVar) {
        this.N = aVar;
        if (aVar == null) {
            aVar = this.M;
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.p(aVar);
            this.I.p(aVar);
            this.J.p(aVar);
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f28779b.setEnabled(z9);
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.setEnabled(z9);
        }
        b5 b5Var = this.f28794n;
        if (b5Var != null) {
            b5Var.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.f28778a0 != i7) {
            this.f28778a0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.f28798q0 = z9;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = this.f28796o0;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    public void setMenuGlassStroke(boolean z9) {
        this.m0 = z9;
    }

    public void setMenuOverlayProvider(u10 u10Var) {
        this.P = u10Var;
    }

    public void setOccupyStatusBar(boolean z9) {
        if (this.W != z9) {
            this.W = z9;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i7;
        p();
        this.f28803x.setText(charSequence);
        TextView textView = this.f28803x;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        textView.setVisibility(i7);
        h();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.D = charSequence;
        ah.i iVar = this.f28801s;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        ah.i iVar = this.f28801s;
        if (iVar == null) {
            this.E = charSequence;
            return;
        }
        iVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f28801s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(f5 f5Var) {
        if (f5Var == null && this.f28804y != null && this.F) {
            j(true);
        }
        this.f28804y = f5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f28781c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!t()) {
            setSubtitle(charSequence);
            return;
        }
        x4 x4Var = this.f28781c;
        k5 k5Var = (k5) x4Var.d;
        if (k5Var != null && k5Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) x4Var.f28748f, charSequence)) {
            x4Var.f28748f = charSequence;
            if (((k5) x4Var.f28747e) == null) {
                x4Var.f28747e = x4Var.a();
            }
            k5 k5Var2 = (k5) x4Var.d;
            k5 k5Var3 = (k5) x4Var.f28747e;
            x4Var.d = k5Var3;
            x4Var.f28747e = k5Var2;
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
        } else if (!TextUtils.equals((CharSequence) x4Var.f28748f, charSequence)) {
            x4Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i7) {
        this.f28792k0 = true;
        this.f28785e0 = i7;
        this.f28781c.d();
    }

    public void setTitle(CharSequence charSequence) {
        x4 x4Var = this.f28781c;
        int i7 = 0;
        x4Var.b(0);
        k5[] k5VarArr = (k5[]) x4Var.f28746c;
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
            i7 = 4;
        }
        k5Var2.setVisibility(i7);
    }

    public void setTitleColor(int i7) {
        this.f28791j0 = true;
        this.f28783d0 = i7;
        this.f28781c.d();
    }

    public void setTitlesAlpha(float f10) {
        if (this.f28800r0 != f10) {
            this.f28800r0 = f10;
            g();
        }
    }

    public final boolean t() {
        if (this.f28780b0 && this.f28782c0) {
            return true;
        }
        return false;
    }

    public final boolean u(View view) {
        if (view != this.f28779b && view != this.f28781c && view != this.d && view != this.f28784e && view != this.f28786f && view != this.h && view != this.f28799r && view != this.f28794n) {
            return false;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        w();
        this.f28781c.d();
        this.f28779b.d();
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.i();
        }
        e5 e5Var2 = this.f28784e;
        if (e5Var2 != null) {
            e5Var2.i();
        }
        org.telegram.ui.Components.j6 j6Var = this.f28786f;
        if (j6Var != null) {
            j6Var.setTextColor(this.f28788g0);
        }
        b5 b5Var = this.f28794n;
        if (b5Var != null) {
            b5Var.c();
        }
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            j6Var2.setTextColor(this.f28785e0);
        }
        if (this.f28801s != null) {
            C();
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.I;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    public final boolean v(boolean z9, boolean z10) {
        n0 searchListener;
        boolean z11 = false;
        if (this.f28804y == null || this.F || this.G || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        p();
        this.F = true;
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.g();
        }
        ah.i iVar = this.f28801s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        iVar.setText(charSequence);
        this.E = null;
        this.f28801s.requestFocus();
        if (z9) {
            org.telegram.messenger.g0.K3(this.f28801s);
        }
        if (z10 && t()) {
            z11 = true;
        }
        this.S.a(true, z11);
        g();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void w() {
        boolean z9 = this.f28791j0;
        f6 f6Var = this.f28777a;
        if (!z9) {
            this.f28783d0 = k6.w0(k6.G6, f6Var);
        }
        if (!this.f28792k0) {
            this.f28785e0 = k6.w0(k6.f28240y6, f6Var);
        }
        if (!this.f28793l0) {
            this.f28787f0 = k6.w0(k6.G6, f6Var);
        }
        this.f28788g0 = k6.w0(k6.G6, f6Var);
        int i7 = k6.f27940i6;
        this.f28789h0 = k6.w0(i7, f6Var);
        this.f28790i0 = k6.w0(i7, f6Var);
    }

    public final void x(int i7, boolean z9) {
        boolean z10;
        String E = hd.E(i7, ' ');
        l();
        org.telegram.ui.Components.j6 j6Var = this.f28786f;
        if (z9 && t() && this.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        j6Var.c(E, z10, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
