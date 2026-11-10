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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wq;
public class z4 extends FrameLayout implements te.b, ls, c6, t4 {
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
    public j5 Q;
    public r0 R;
    public final te.a S;
    public final te.a T;
    public final te.a U;
    public k V;
    public boolean W;
    public final h6 f28819a;
    public int f28820a0;
    public final nd f28821b;
    public boolean f28822b0;
    public final y4 f28823c;
    public boolean f28824c0;
    public f5 d;
    public int f28825d0;
    public f5 f28826e;
    public int f28827e0;
    public org.telegram.ui.Components.i6 f28828f;
    public int f28829f0;
    public int f28830g0;
    public org.telegram.ui.Components.i6 h;
    public int f28831h0;
    public int f28832i0;
    public boolean f28833j0;
    public boolean f28834k0;
    public boolean f28835l0;
    public boolean m0;
    public c5 f28836n;
    public dh.c f28837n0;
    public ri.d f28838o0;
    public final RectF f28839p0;
    public int f28840q0;
    public FrameLayout f28841r;
    public boolean f28842r0;
    public ah.i f28843s;
    public float f28844s0;
    public ImageView f28845w;
    public TextView f28846x;
    public g5 f28847y;

    public z4(Context context, h6 h6Var) {
        super(context);
        this.K = -1.0f;
        wq wqVar = wq.h;
        this.S = new te.a(0, this, wqVar, 380L, false);
        this.T = new te.a(1, this, wqVar, 380L, false);
        this.U = new te.a(2, this, wqVar, 250L, false);
        this.W = true;
        this.m0 = true;
        this.f28839p0 = new RectF();
        this.f28844s0 = 1.0f;
        this.f28819a = h6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        y();
        y4 y4Var = new y4(this, context);
        this.f28823c = y4Var;
        addView(y4Var, ha.e(-1, -2, 51));
        nd ndVar = new nd(this, context);
        this.f28821b = ndVar;
        ndVar.setVisibility(8);
        ndVar.setContentDescription(id.M0(2131754878, null));
        ndVar.setOnClickListener(new w4(this, 0));
        addView(ndVar, ha.e(46, 46, 51));
    }

    public static void A(View view, float f10) {
        int i7;
        view.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        view.setVisibility(i7);
    }

    public static void B(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    public static void c(z4 z4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.g0.v1(z4Var.f28843s);
        n0 searchListener = z4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(z4Var.f28843s);
        }
    }

    private int getRowTop() {
        if (this.W) {
            return org.telegram.messenger.g0.f22561m;
        }
        return 0;
    }

    public n0 getSearchListener() {
        g5 g5Var = this.f28847y;
        if (g5Var != null) {
            return g5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f10;
        if (((Drawable) this.f28821b.f4439c) != null) {
            f10 = 58.0f;
        } else {
            f10 = 6.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public static n0 h(z4 z4Var) {
        return z4Var.getSearchListener();
    }

    public final void C(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        int L;
        if (!v()) {
            setTitle(charSequence);
            return;
        }
        y4 y4Var = this.f28823c;
        y4Var.b(0);
        y4Var.b(1);
        m5[] m5VarArr = (m5[]) y4Var.f28792c;
        m5 m5Var = m5VarArr[0];
        m5 m5Var2 = m5VarArr[1];
        m5VarArr[0] = m5Var2;
        m5VarArr[1] = m5Var;
        m5Var2.animate().cancel();
        m5Var2.k(charSequence);
        m5Var2.setVisibility(0);
        m5Var2.setAlpha(0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        if (!z9) {
            L2 = -L2;
        }
        m5Var2.setTranslationY(L2);
        m5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        m5Var.animate().cancel();
        ViewPropertyAnimator alpha = m5Var.animate().alpha(0.0f);
        if (z9) {
            L = -org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        alpha.translationY(L).setDuration(j3).setInterpolator(interpolator).withEndAction(new x4(m5Var, 1)).start();
        y4Var.requestLayout();
    }

    public final void D() {
        if (this.f28826e != null && !this.G) {
            this.G = true;
            f5 f5Var = this.d;
            if (f5Var != null) {
                f5Var.g();
            }
            ah.i iVar = this.f28843s;
            if (iVar != null && this.F) {
                org.telegram.messenger.g0.v1(iVar);
            }
            this.T.a(true, v());
            i();
            this.f28821b.b(true, v());
            qs.e().k(qs.f25072r4, new Object[0]);
        }
    }

    public final void E() {
        ah.i iVar = this.f28843s;
        int i7 = m6.G6;
        h6 h6Var = this.f28819a;
        iVar.setTextColor(m6.w0(i7, h6Var));
        this.f28846x.setTextColor(m6.w0(i7, h6Var));
        this.f28843s.setHintTextColor(m6.w0(m6.H6, h6Var));
        this.f28843s.setCursorColor(m6.w0(i7, h6Var));
        this.f28843s.setHighlightColor(m6.w0(m6.f27990ig, h6Var));
        this.f28843s.setHandlesColor(m6.w0(m6.f28009jg, h6Var));
        this.f28845w.setColorFilter(new PorterDuffColorFilter(m6.w0(m6.f28055m6, h6Var), PorterDuff.Mode.SRC_IN));
        this.f28845w.setBackground(m6.h0(this.f28831h0, 1, -1));
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 2) {
            ImageView imageView = this.f28845w;
            if (imageView != null) {
                imageView.setAlpha(f10);
                float f12 = (f10 * 0.5f) + 0.5f;
                this.f28845w.setScaleX(f12);
                this.f28845w.setScaleY(f12);
                ImageView imageView2 = this.f28845w;
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
        i();
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final boolean b(r0 r0Var, RectF rectF) {
        float f10 = 0.0f;
        if (r0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            m(rectF);
            return true;
        }
        float L = org.telegram.messenger.g0.L(23.0f);
        View view = (View) r0Var.getParent();
        if (view != null) {
            f10 = view.getX();
        }
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + f10;
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25048n4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        c5 c5Var;
        this.f28822b0 = this.f28824c0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.H != null) {
            nd ndVar = this.f28821b;
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
        if (this.J != null && (c5Var = this.f28836n) != null && c5Var.f27372c == b5.f27352a && c5Var.getVisibility() == 0 && this.f28836n.getAlpha() > 0.0f) {
            float width2 = (this.f28836n.getWidth() / 2.0f) + this.f28836n.getX();
            float height2 = (this.f28836n.getHeight() / 2.0f) + this.f28836n.getY();
            float scaleX2 = this.f28836n.getScaleX() * (this.f28836n.getWidth() / 2.0f);
            float scaleY2 = this.f28836n.getScaleY() * (this.f28836n.getHeight() / 2.0f);
            this.J.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.J.setAlpha((int) (this.f28836n.getAlpha() * 255.0f));
            this.J.draw(canvas);
        }
        if (this.I != null) {
            RectF rectF = this.f28839p0;
            float m10 = m(rectF);
            r0 r0Var = this.R;
            if (r0Var != null && r0Var.getParent() == this.d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (m10 > 0.0f && rectF.width() > 0.0f && !z9) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.r(height3);
                }
                this.I.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.I.setAlpha((int) (m10 * 255.0f));
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
        if (view == this.f28841r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f28839p0;
            m(rectF);
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
        return this.m0;
    }

    @Override
    public final fh.g f(j5 j5Var) {
        dh.c cVar = this.f28837n0;
        if (cVar == null) {
            cVar = this.L;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(j5Var, null, false);
        c10.p(this.M);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public final void g(j5 j5Var, r0 r0Var) {
        this.Q = j5Var;
        this.R = r0Var;
        invalidate();
    }

    public k getActionBarMenuOnItemClick() {
        return this.V;
    }

    public f5 getActionMode() {
        return this.f28826e;
    }

    public float getActionModeFactor() {
        return this.T.f55498e;
    }

    public org.telegram.ui.Components.i6 getActionModeTitle() {
        n();
        return this.f28828f;
    }

    public View getBackButton() {
        return this.f28821b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.f28821b.f4439c;
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

    public c5 getDoneButton() {
        return this.f28836n;
    }

    public int getExtraHeight() {
        return this.f28820a0;
    }

    public f5 getMenu() {
        return this.d;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return this.M;
    }

    public j5 getMenuOverlay() {
        u10 u10Var = this.P;
        if (u10Var != null) {
            return (j5) u10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.f28839p0;
        m(rectF);
        return rectF.left;
    }

    @Override
    public h6 getMenuResourcesProvider() {
        return this.f28819a;
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
    public j5 getOpenMenuOverlay() {
        return this.Q;
    }

    public float getSearchFactor() {
        return this.S.f55498e;
    }

    public EditTextBoldCursor getSearchField() {
        r();
        return this.f28843s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f28823c.f28794f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public m5 getSubtitleTextView() {
        return (m5) this.f28823c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        m5 m5Var = ((m5[]) this.f28823c.f28792c)[0];
        if (m5Var != null) {
            charSequence = m5Var.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        y4 y4Var = this.f28823c;
        y4Var.b(0);
        return ((m5[]) y4Var.f28792c)[0].getTextPaint().getFontMetricsInt();
    }

    public m5 getTitleTextView() {
        return ((m5[]) this.f28823c.f28792c)[0];
    }

    public m5 getTitleTextView2() {
        return ((m5[]) this.f28823c.f28792c)[1];
    }

    public float getTitlesAlpha() {
        return this.f28844s0;
    }

    public final void i() {
        f5 f5Var;
        f5 f5Var2;
        f5 f5Var3;
        f5 f5Var4;
        float T1;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f10 = 1.0f - actionModeFactor;
        float f11 = searchFactor * f10;
        float f12 = (1.0f - searchFactor) * f10;
        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        y4 y4Var = this.f28823c;
        A(y4Var, this.f28844s0 * f12);
        y4Var.setScaleX(T12);
        y4Var.setScaleY(T12);
        c5 c5Var = this.f28836n;
        if (c5Var != null) {
            float visibleFactor = c5Var.getVisibleFactor() * f12;
            A(this.f28836n, visibleFactor);
            if (this.f28836n.f27372c == b5.f27352a) {
                T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor);
            } else {
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            }
            this.f28836n.setScaleX(T1);
            this.f28836n.setScaleY(T1);
        }
        f5 f5Var5 = this.d;
        int i7 = 0;
        if (f5Var5 != null) {
            f5Var5.setTranslationX(-s(false));
            A(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(f5Var3.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(f5Var4.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!w(childAt) && childAt.getVisibility() != 8) {
                A(childAt, f12);
            }
        }
        f5 f5Var6 = this.f28826e;
        if (f5Var6 != null) {
            A(f5Var6, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.f28826e.setPivotX(f5Var.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.f28826e.setPivotY(f5Var2.getHeight() / 2.0f);
            this.f28826e.setScaleX(T14);
            this.f28826e.setScaleY(T14);
        }
        org.telegram.ui.Components.i6 i6Var = this.f28828f;
        if (i6Var != null) {
            A(i6Var, actionModeFactor);
            this.f28828f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        if (i6Var2 != null) {
            A(i6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.f28841r;
        if (frameLayout != null) {
            A(frameLayout, f11);
            RectF rectF = this.f28839p0;
            m(rectF);
            this.f28841r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        nd ndVar = this.f28821b;
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

    public final void j() {
        boolean z9;
        TextView textView;
        if (this.f28843s == null) {
            return;
        }
        n0 searchListener = getSearchListener();
        boolean z10 = true;
        if (this.f28843s.length() <= 0 && (((textView = this.f28846x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!v() || !this.F) {
            z10 = false;
        }
        this.U.a(z9, z10);
        this.f28845w.setEnabled(z9);
    }

    public final void k() {
        n0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f28846x.setVisibility(8);
            j();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void l(boolean z9) {
        if (this.F) {
            n0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.f28843s.clearFocus();
                if (z9) {
                    org.telegram.messenger.g0.v1(this.f28843s);
                }
                this.S.a(false, v());
                i();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float m(RectF rectF) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(23.0f);
        float currentActionBarHeight = (l.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        f5 f5Var = this.d;
        if (f5Var != null && f5Var.getVisibility() != 8) {
            f10 = this.d.getPillWidth();
        } else {
            f10 = 0.0f;
        }
        f5 f5Var2 = this.f28826e;
        if (f5Var2 != null) {
            f11 = f5Var2.getPillWidth();
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
        float width = (getWidth() - L) - s(false);
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

    public final f5 n() {
        if (this.f28826e == null) {
            f5 f5Var = new f5(getContext(), this, true);
            this.f28826e = f5Var;
            View view = this.f28821b;
            addView(f5Var, indexOfChild(view), ha.e(-2, -2, 53));
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(getContext(), true, true, true);
            this.f28828f = i6Var;
            i6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f28828f.setTypeface(org.telegram.messenger.g0.o());
            this.f28828f.setTextColor(this.f28830g0);
            this.f28828f.setGravity(19);
            this.f28828f.setEllipsizeByGradient(true);
            this.f28828f.b(0.6f, 320L, wq.h);
            addView(this.f28828f, indexOfChild(view), ha.e(-1, -2, 51));
            i();
        }
        return this.f28826e;
    }

    public final void o() {
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28824c0 = true;
        qs.e().c(this, qs.f25048n4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28824c0 = false;
        this.f28822b0 = false;
        qs.e().n(this, qs.f25048n4);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onLayout(z9, i7, i10, i11, i12);
        int rowTop = getRowTop();
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i16 = i11 - i7;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (!w(childAt) && childAt.getVisibility() != 8) {
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
        int currentActionBarHeight = l.getCurrentActionBarHeight();
        int i11 = rowTop + currentActionBarHeight + this.f28820a0;
        nd ndVar = this.f28821b;
        if (((Drawable) ndVar.f4439c) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int L3 = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        B(ndVar, org.telegram.messenger.g0.L(6.0f), L3, 0);
        f5 f5Var = this.d;
        float f11 = 0.0f;
        if (f5Var != null && f5Var.getVisibility() != 8) {
            f10 = this.d.getTargetPillWidth();
        } else {
            f10 = 0.0f;
        }
        float s5 = s(true);
        if (z9) {
            L = org.telegram.messenger.g0.L(64.0f);
        } else {
            L = org.telegram.messenger.g0.L(18.0f);
        }
        if (f10 <= 0.0f && s5 <= 0.0f) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (f10 + s5));
        }
        int max = Math.max(Math.max(L, L2), this.f28840q0);
        y4 y4Var = this.f28823c;
        if (y4Var.f28791b != max) {
            y4Var.f28791b = max;
            y4Var.requestLayout();
        }
        B(y4Var, 0, rowTop, 0);
        y4Var.getLayoutParams().height = currentActionBarHeight;
        f5 f5Var2 = this.d;
        if (f5Var2 != null) {
            B(f5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        f5 f5Var3 = this.f28826e;
        if (f5Var3 != null) {
            B(f5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.f28826e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f28828f != null) {
            f5 f5Var4 = this.f28826e;
            if (f5Var4 != null) {
                f11 = f5Var4.getTargetPillWidth();
            }
            int L4 = org.telegram.messenger.g0.L(18.0f) + ((int) f11);
            org.telegram.ui.Components.i6 i6Var = this.h;
            if (i6Var != null && i6Var.getTag() != null) {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                B(this.f28828f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L4);
                this.f28828f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                B(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L4);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            } else {
                B(this.f28828f, org.telegram.messenger.g0.L(66.0f), rowTop, L4);
                this.f28828f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f28841r;
        if (frameLayout != null) {
            B(frameLayout, (int) getSearchPillLeft(), L3, org.telegram.messenger.g0.L(6.0f));
        }
        c5 c5Var = this.f28836n;
        if (c5Var != null) {
            B(c5Var, 0, L3, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f28842r0;
    }

    public final c5 p(String str) {
        if (this.f28836n == null) {
            c5 c5Var = new c5(getContext(), this, str);
            this.f28836n = c5Var;
            addView(c5Var, indexOfChild(this.f28821b), ha.e(-2, 46, 53));
            i();
        }
        return this.f28836n;
    }

    public final f5 q() {
        if (this.d == null) {
            f5 f5Var = new f5(getContext(), this, false);
            this.d = f5Var;
            addView(f5Var, indexOfChild(this.f28821b), ha.e(-2, -2, 53));
            i();
        }
        return this.d;
    }

    public final void r() {
        if (this.f28841r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28841r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f28841r, indexOfChild(this.f28821b), ha.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f28841r.addView(linearLayout, ha.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28846x = textView;
        textView.setTextSize(1, 17.0f);
        this.f28846x.setSingleLine(true);
        this.f28846x.setEllipsize(TextUtils.TruncateAt.END);
        this.f28846x.setGravity(19);
        this.f28846x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f28846x.setVisibility(8);
        linearLayout.addView(this.f28846x, ha.o(-2, -1));
        ah.i iVar = new ah.i(4, context, this);
        this.f28843s = iVar;
        iVar.setTextSize(1, 17.0f);
        this.f28843s.setSingleLine(true);
        this.f28843s.setBackground(null);
        this.f28843s.setPadding(0, 0, 0, 0);
        this.f28843s.setGravity(19);
        ah.i iVar2 = this.f28843s;
        iVar2.setInputType(iVar2.getInputType() | 524288);
        this.f28843s.setImeOptions(33554435);
        this.f28843s.setTextIsSelectable(false);
        this.f28843s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f28843s.setCursorWidth(1.5f);
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            this.f28843s.setHint(charSequence);
        }
        this.f28843s.setOnEditorActionListener(new bi.p(this, 4));
        this.f28843s.addTextChangedListener(new ah.j(this, 13));
        linearLayout.addView(this.f28843s, ha.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.f28845w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f28845w.setImageResource(2131231269);
        this.f28845w.setContentDescription(id.M0(2131752099, null));
        this.f28845w.setOnClickListener(new w4(this, 1));
        this.f28841r.addView(this.f28845w, ha.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        E();
        j();
        Y(2, this.U.f55498e, 0.0f, null);
    }

    public final float s(boolean z9) {
        float actionModeFactor;
        c5 c5Var = this.f28836n;
        if (c5Var != null) {
            if (c5Var.getVisibility() != 8 || !z9) {
                if (z9) {
                    actionModeFactor = this.f28836n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f28836n.getVisibleFactor();
                }
                return (org.telegram.messenger.g0.L(12.0f) + this.f28836n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.V = kVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f28821b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f28821b.c(drawable);
        i();
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
        nd ndVar = this.f28821b;
        Drawable drawable = (Drawable) ndVar.f4439c;
        if (drawable != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.c cVar = (te.c) ndVar.f4441f;
        if (drawable != null && ((z4) ndVar.h).v()) {
            ndVar.c(mutate);
            ndVar.d = (Drawable) ndVar.f4439c;
            cVar.c(0.0f);
            cVar.a(1.0f);
        } else {
            ndVar.c(mutate);
        }
        if (!z9) {
            i();
            requestLayout();
        }
    }

    public void setButtonsGlass(dh.c cVar) {
        this.O = cVar;
        if (this.L != null) {
            o();
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
        this.f28821b.setEnabled(z9);
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.setEnabled(z9);
        }
        c5 c5Var = this.f28836n;
        if (c5Var != null) {
            c5Var.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.f28820a0 != i7) {
            this.f28820a0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.f28842r0 = z9;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = this.f28838o0;
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
        r();
        this.f28846x.setText(charSequence);
        TextView textView = this.f28846x;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        textView.setVisibility(i7);
        j();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.D = charSequence;
        ah.i iVar = this.f28843s;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        ah.i iVar = this.f28843s;
        if (iVar == null) {
            this.E = charSequence;
            return;
        }
        iVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f28843s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(g5 g5Var) {
        if (g5Var == null && this.f28847y != null && this.F) {
            l(true);
        }
        this.f28847y = g5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f28823c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!v()) {
            setSubtitle(charSequence);
            return;
        }
        y4 y4Var = this.f28823c;
        m5 m5Var = (m5) y4Var.d;
        if (m5Var != null && m5Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) y4Var.f28794f, charSequence)) {
            y4Var.f28794f = charSequence;
            if (((m5) y4Var.f28793e) == null) {
                y4Var.f28793e = y4Var.a();
            }
            m5 m5Var2 = (m5) y4Var.d;
            m5 m5Var3 = (m5) y4Var.f28793e;
            y4Var.d = m5Var3;
            y4Var.f28793e = m5Var2;
            m5Var3.animate().cancel();
            ((m5) y4Var.d).l(charSequence, false);
            ((m5) y4Var.d).setVisibility(0);
            ((m5) y4Var.d).setAlpha(0.0f);
            ((m5) y4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
            ViewPropertyAnimator duration = ((m5) y4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            wq wqVar = wq.h;
            duration.setInterpolator(wqVar).start();
            m5Var2.animate().cancel();
            m5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(wqVar).withEndAction(new x4(m5Var2, 0)).start();
            y4Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) y4Var.f28794f, charSequence)) {
            y4Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i7) {
        this.f28834k0 = true;
        this.f28827e0 = i7;
        this.f28823c.d();
    }

    public void setTitle(CharSequence charSequence) {
        y4 y4Var = this.f28823c;
        int i7 = 0;
        y4Var.b(0);
        m5[] m5VarArr = (m5[]) y4Var.f28792c;
        m5 m5Var = m5VarArr[1];
        if (m5Var != null) {
            m5Var.animate().cancel();
            m5VarArr[1].setVisibility(8);
        }
        m5VarArr[0].animate().cancel();
        m5VarArr[0].setAlpha(1.0f);
        m5VarArr[0].setTranslationY(0.0f);
        m5VarArr[0].k(charSequence);
        m5 m5Var2 = m5VarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 4;
        }
        m5Var2.setVisibility(i7);
    }

    public void setTitleColor(int i7) {
        this.f28833j0 = true;
        this.f28825d0 = i7;
        this.f28823c.d();
    }

    public void setTitleMinSideInset(int i7) {
        if (this.f28840q0 != i7) {
            this.f28840q0 = i7;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f10) {
        if (this.f28844s0 != f10) {
            this.f28844s0 = f10;
            i();
        }
    }

    public final void t() {
        f5 f5Var = this.f28826e;
        if (f5Var != null && this.G) {
            this.G = false;
            f5Var.g();
            this.T.a(false, v());
            i();
            this.f28821b.b(false, v());
            qs.e().k(qs.f25072r4, new Object[0]);
        }
    }

    public final boolean u() {
        if (this.f28826e != null && this.G) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateColors() {
        y();
        this.f28823c.d();
        this.f28821b.d();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.i();
        }
        f5 f5Var2 = this.f28826e;
        if (f5Var2 != null) {
            f5Var2.i();
        }
        org.telegram.ui.Components.i6 i6Var = this.f28828f;
        if (i6Var != null) {
            i6Var.setTextColor(this.f28830g0);
        }
        c5 c5Var = this.f28836n;
        if (c5Var != null) {
            c5Var.c();
        }
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        if (i6Var2 != null) {
            i6Var2.setTextColor(this.f28827e0);
        }
        if (this.f28843s != null) {
            E();
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

    public final boolean v() {
        if (this.f28822b0 && this.f28824c0) {
            return true;
        }
        return false;
    }

    public final boolean w(View view) {
        if (view != this.f28821b && view != this.f28823c && view != this.d && view != this.f28826e && view != this.f28828f && view != this.h && view != this.f28841r && view != this.f28836n) {
            return false;
        }
        return true;
    }

    public final boolean x(boolean z9, boolean z10) {
        n0 searchListener;
        boolean z11 = false;
        if (this.f28847y == null || this.F || this.G || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        r();
        this.F = true;
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.g();
        }
        ah.i iVar = this.f28843s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        iVar.setText(charSequence);
        this.E = null;
        this.f28843s.requestFocus();
        if (z9) {
            org.telegram.messenger.g0.K3(this.f28843s);
        }
        if (z10 && v()) {
            z11 = true;
        }
        this.S.a(true, z11);
        i();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void y() {
        boolean z9 = this.f28833j0;
        h6 h6Var = this.f28819a;
        if (!z9) {
            this.f28825d0 = m6.w0(m6.G6, h6Var);
        }
        if (!this.f28834k0) {
            this.f28827e0 = m6.w0(m6.f28282y6, h6Var);
        }
        if (!this.f28835l0) {
            this.f28829f0 = m6.w0(m6.G6, h6Var);
        }
        this.f28830g0 = m6.w0(m6.G6, h6Var);
        int i7 = m6.f27982i6;
        this.f28831h0 = m6.w0(i7, h6Var);
        this.f28832i0 = m6.w0(i7, h6Var);
    }

    public final void z(int i7, boolean z9) {
        boolean z10;
        String E = id.E(i7, ' ');
        n();
        org.telegram.ui.Components.i6 i6Var = this.f28828f;
        if (z9 && v() && this.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        i6Var.c(E, z10, true);
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
