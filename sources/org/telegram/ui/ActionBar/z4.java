package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
import c8.na;
import di.yb;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.u60;
public class z4 extends FrameLayout implements te.b, fs, c6, t4, u60 {
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
    public o10 Q;
    public k5 R;
    public q0 S;
    public final te.a T;
    public final te.a U;
    public final te.a V;
    public j W;
    public final i6 f30379a;
    public boolean f30380a0;
    public final yb f30381b;
    public int f30382b0;
    public final y4 f30383c;
    public boolean f30384c0;
    public f5 d;
    public boolean f30385d0;
    public f5 f30386e;
    public int f30387e0;
    public org.telegram.ui.Components.n6 f30388f;
    public int f30389f0;
    public int f30390g0;
    public org.telegram.ui.Components.n6 h;
    public int f30391h0;
    public int f30392i0;
    public int f30393j0;
    public boolean f30394k0;
    public boolean f30395l0;
    public boolean m0;
    public c5 f30396n;
    public boolean f30397n0;
    public dh.c f30398o0;
    public ui.d f30399p0;
    public final RectF f30400q0;
    public FrameLayout f30401r;
    public final Path f30402r0;
    public ah.i f30403s;
    public final RectF f30404s0;
    public int f30405t0;
    public boolean f30406u0;
    public float f30407v0;
    public ImageView f30408w;
    public TextView f30409x;
    public g5 f30410y;

    public z4(Context context, i6 i6Var) {
        super(context);
        this.L = -1.0f;
        kr krVar = kr.h;
        this.T = new te.a(0, this, krVar, 380L, false);
        this.U = new te.a(1, this, krVar, 380L, false);
        this.V = new te.a(2, this, krVar, 250L, false);
        this.f30380a0 = true;
        this.f30397n0 = true;
        this.f30400q0 = new RectF();
        this.f30402r0 = new Path();
        this.f30404s0 = new RectF();
        this.f30407v0 = 1.0f;
        this.f30379a = i6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        C();
        y4 y4Var = new y4(this, context);
        this.f30383c = y4Var;
        addView(y4Var, na.e(-1, -2, 51));
        yb ybVar = new yb(this, context);
        this.f30381b = ybVar;
        ybVar.setVisibility(8);
        ybVar.setContentDescription(gd.N0(2131754878, null));
        ybVar.setOnClickListener(new w4(this, 0));
        addView(ybVar, na.e(46, 46, 51));
    }

    public static void E(View view, float f10) {
        int i7;
        view.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        view.setVisibility(i7);
    }

    public static void F(View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i11;
    }

    private int getRowTop() {
        if (this.f30380a0) {
            return org.telegram.messenger.g0.f24220m;
        }
        return 0;
    }

    public m0 getSearchListener() {
        g5 g5Var = this.f30410y;
        if (g5Var != null) {
            return g5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f10;
        if (((Drawable) this.f30381b.f10080b) != null) {
            f10 = 58.0f;
        } else {
            f10 = 6.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public static void i(z4 z4Var, int i7, KeyEvent keyEvent) {
        if (i7 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.g0.v1(z4Var.f30403s);
        m0 searchListener = z4Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(z4Var.f30403s);
        }
    }

    public static m0 j(z4 z4Var) {
        return z4Var.getSearchListener();
    }

    public final boolean A() {
        k5 k5Var = this.R;
        if (k5Var != null) {
            k5Var.a(true);
            return true;
        } else if (!this.H && this.G) {
            o(true);
            return true;
        } else {
            return false;
        }
    }

    public final boolean B(boolean z10, boolean z11) {
        m0 searchListener;
        boolean z12 = false;
        if (this.f30410y == null || this.G || this.H || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        u();
        this.G = true;
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.g();
        }
        ah.i iVar = this.f30403s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        iVar.setText(charSequence);
        this.F = null;
        this.f30403s.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.I3(this.f30403s);
        }
        if (z11 && y()) {
            z12 = true;
        }
        this.T.a(true, z12);
        l();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void C() {
        boolean z10 = this.f30394k0;
        i6 i6Var = this.f30379a;
        if (!z10) {
            this.f30387e0 = n6.w0(n6.G6, i6Var);
        }
        if (!this.f30395l0) {
            this.f30389f0 = n6.w0(n6.f29843y6, i6Var);
        }
        if (!this.m0) {
            this.f30390g0 = n6.w0(n6.G6, i6Var);
        }
        this.f30391h0 = n6.w0(n6.G6, i6Var);
        int i7 = n6.f29543i6;
        this.f30392i0 = n6.w0(i7, i6Var);
        this.f30393j0 = n6.w0(i7, i6Var);
    }

    public final void D(int i7, boolean z10) {
        boolean z11;
        String E = gd.E(i7, ' ');
        q();
        org.telegram.ui.Components.n6 n6Var = this.f30388f;
        if (z10 && y() && this.H) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6Var.c(E, z11, true);
    }

    public final void H(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        int L;
        if (!y()) {
            setTitle(charSequence);
            return;
        }
        y4 y4Var = this.f30383c;
        y4Var.b(0);
        y4Var.b(1);
        n5[] n5VarArr = (n5[]) y4Var.f30361c;
        n5 n5Var = n5VarArr[0];
        n5 n5Var2 = n5VarArr[1];
        n5VarArr[0] = n5Var2;
        n5VarArr[1] = n5Var;
        n5Var2.animate().cancel();
        n5Var2.k(charSequence);
        n5Var2.setVisibility(0);
        n5Var2.setAlpha(0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        if (!z10) {
            L2 = -L2;
        }
        n5Var2.setTranslationY(L2);
        n5Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j3).setInterpolator(interpolator).start();
        n5Var.animate().cancel();
        ViewPropertyAnimator alpha = n5Var.animate().alpha(0.0f);
        if (z10) {
            L = -org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        alpha.translationY(L).setDuration(j3).setInterpolator(interpolator).withEndAction(new x4(n5Var, 1)).start();
        y4Var.requestLayout();
    }

    public final void I() {
        if (this.f30386e != null && !this.H) {
            this.H = true;
            f5 f5Var = this.d;
            if (f5Var != null) {
                f5Var.g();
            }
            ah.i iVar = this.f30403s;
            if (iVar != null && this.G) {
                org.telegram.messenger.g0.v1(iVar);
            }
            this.U.a(true, y());
            l();
            this.f30381b.b(true, y());
            ks.e().k(ks.f25301u4, new Object[0]);
        }
    }

    public final void J() {
        ah.i iVar = this.f30403s;
        int i7 = n6.G6;
        i6 i6Var = this.f30379a;
        iVar.setTextColor(n6.w0(i7, i6Var));
        this.f30409x.setTextColor(n6.w0(i7, i6Var));
        this.f30403s.setHintTextColor(n6.w0(n6.H6, i6Var));
        this.f30403s.setCursorColor(n6.w0(i7, i6Var));
        this.f30403s.setHighlightColor(n6.w0(n6.f29607lg, i6Var));
        this.f30403s.setHandlesColor(n6.w0(n6.f29624mg, i6Var));
        this.f30408w.setColorFilter(new PorterDuffColorFilter(n6.w0(n6.f29616m6, i6Var), PorterDuff.Mode.SRC_IN));
        this.f30408w.setBackground(n6.h0(this.f30392i0, 1, -1));
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 2) {
            ImageView imageView = this.f30408w;
            if (imageView != null) {
                imageView.setAlpha(f10);
                float f12 = (f10 * 0.5f) + 0.5f;
                this.f30408w.setScaleX(f12);
                this.f30408w.setScaleY(f12);
                ImageView imageView2 = this.f30408w;
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
        l();
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final boolean b(q0 q0Var, RectF rectF) {
        float f10 = 0.0f;
        if (q0Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            p(rectF);
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
    public final void c(s60 s60Var) {
        c5 c5Var;
        if (this.I != null) {
            yb ybVar = this.f30381b;
            if (ybVar.getVisibility() == 0 && ybVar.getAlpha() > 0.0f) {
                k(ybVar, s60Var);
            }
        }
        if (this.K != null && (c5Var = this.f30396n) != null && c5Var.f28912c == b5.f28871a && c5Var.getVisibility() == 0 && this.f30396n.getAlpha() > 0.0f) {
            k(this.f30396n, s60Var);
        }
        fh.g gVar = this.J;
        Path path = this.f30402r0;
        if (gVar != null) {
            RectF rectF = this.f30404s0;
            if (p(rectF) > 0.0f && rectF.width() > 0.0f) {
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                s60Var.a(path);
            }
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!z(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof fh.g)) {
                path.rewind();
                path.addPath(((fh.g) childAt.getBackground()).R.f11638k, childAt.getX(), childAt.getY());
                s60Var.a(path);
            }
        }
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25274q4) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        c5 c5Var;
        this.f30384c0 = this.f30385d0;
        int L = org.telegram.messenger.g0.L(6.0f);
        if (this.I != null) {
            yb ybVar = this.f30381b;
            if (ybVar.getVisibility() == 0 && ybVar.getAlpha() > 0.0f) {
                float width = (ybVar.getWidth() / 2.0f) + ybVar.getX();
                float height = (ybVar.getHeight() / 2.0f) + ybVar.getY();
                float scaleX = ybVar.getScaleX() * (ybVar.getWidth() / 2.0f);
                float scaleY = ybVar.getScaleY() * (ybVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (ybVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (c5Var = this.f30396n) != null && c5Var.f28912c == b5.f28871a && c5Var.getVisibility() == 0 && this.f30396n.getAlpha() > 0.0f) {
            float width2 = (this.f30396n.getWidth() / 2.0f) + this.f30396n.getX();
            float height2 = (this.f30396n.getHeight() / 2.0f) + this.f30396n.getY();
            float scaleX2 = this.f30396n.getScaleX() * (this.f30396n.getWidth() / 2.0f);
            float scaleY2 = this.f30396n.getScaleY() * (this.f30396n.getHeight() / 2.0f);
            this.K.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.K.setAlpha((int) (this.f30396n.getAlpha() * 255.0f));
            this.K.draw(canvas);
        }
        if (this.J != null) {
            RectF rectF = this.f30400q0;
            float p10 = p(rectF);
            q0 q0Var = this.S;
            if (q0Var != null && q0Var.getParent() == this.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p10 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (p10 * 255.0f));
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
        if (view == this.f30401r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f30400q0;
            p(rectF);
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
        return this.f30397n0;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final fh.g g(k5 k5Var) {
        dh.c cVar = this.f30398o0;
        if (cVar == null) {
            cVar = this.M;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(k5Var, null, false);
        c10.p(this.N);
        m10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.W;
    }

    public f5 getActionMode() {
        return this.f30386e;
    }

    public float getActionModeFactor() {
        return this.U.f57779e;
    }

    public org.telegram.ui.Components.n6 getActionModeTitle() {
        q();
        return this.f30388f;
    }

    public View getBackButton() {
        return this.f30381b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.f30381b.f10080b;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.a aVar = this.O;
        if (aVar == null) {
            aVar = this.N;
        }
        if (aVar != null) {
            return aVar.x2();
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

    public c5 getDoneButton() {
        return this.f30396n;
    }

    public int getExtraHeight() {
        return this.f30382b0;
    }

    public f5 getMenu() {
        return this.d;
    }

    @Override
    public int getMenuAnchorTint() {
        return 0;
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

    public k5 getMenuOverlay() {
        o10 o10Var = this.Q;
        if (o10Var != null) {
            return (k5) o10Var.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.f30400q0;
        p(rectF);
        return rectF.left;
    }

    @Override
    public i6 getMenuResourcesProvider() {
        return this.f30379a;
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
        return this.f30380a0;
    }

    @Override
    public k5 getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.f57779e;
    }

    public EditTextBoldCursor getSearchField() {
        u();
        return this.f30403s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f30383c.f30363f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public n5 getSubtitleTextView() {
        return (n5) this.f30383c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        n5 n5Var = ((n5[]) this.f30383c.f30361c)[0];
        if (n5Var != null) {
            charSequence = n5Var.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        y4 y4Var = this.f30383c;
        y4Var.b(0);
        return ((n5[]) y4Var.f30361c)[0].getTextPaint().getFontMetricsInt();
    }

    public n5 getTitleTextView() {
        return ((n5[]) this.f30383c.f30361c)[0];
    }

    public n5 getTitleTextView2() {
        return ((n5[]) this.f30383c.f30361c)[1];
    }

    public float getTitlesAlpha() {
        return this.f30407v0;
    }

    @Override
    public final void h(k5 k5Var, q0 q0Var) {
        this.R = k5Var;
        this.S = q0Var;
        invalidate();
    }

    public final void k(View view, s60 s60Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.f30404s0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.f30402r0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        s60Var.a(path);
    }

    public final void l() {
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
        y4 y4Var = this.f30383c;
        E(y4Var, this.f30407v0 * f12);
        y4Var.setScaleX(T12);
        y4Var.setScaleY(T12);
        c5 c5Var = this.f30396n;
        if (c5Var != null) {
            float visibleFactor = c5Var.getVisibleFactor() * f12;
            E(this.f30396n, visibleFactor);
            if (this.f30396n.f28912c == b5.f28871a) {
                T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, visibleFactor);
            } else {
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f12);
            }
            this.f30396n.setScaleX(T1);
            this.f30396n.setScaleY(T1);
        }
        f5 f5Var5 = this.d;
        int i7 = 0;
        if (f5Var5 != null) {
            f5Var5.setTranslationX(-v(false));
            E(this.d, f12);
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f12);
            this.d.setPivotX(f5Var3.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.d.setPivotY(f5Var4.getHeight() / 2.0f);
            this.d.setScaleX(T13);
            this.d.setScaleY(T13);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!z(childAt) && childAt.getVisibility() != 8) {
                E(childAt, f12);
            }
        }
        f5 f5Var6 = this.f30386e;
        if (f5Var6 != null) {
            E(f5Var6, actionModeFactor);
            float T14 = org.telegram.messenger.g0.T1(0.7f, 1.0f, actionModeFactor);
            this.f30386e.setPivotX(f5Var.getWidth() - org.telegram.messenger.g0.L(19.0f));
            this.f30386e.setPivotY(f5Var2.getHeight() / 2.0f);
            this.f30386e.setScaleX(T14);
            this.f30386e.setScaleY(T14);
        }
        org.telegram.ui.Components.n6 n6Var = this.f30388f;
        if (n6Var != null) {
            E(n6Var, actionModeFactor);
            this.f30388f.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.h;
        if (n6Var2 != null) {
            E(n6Var2, actionModeFactor);
            this.h.setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f10);
        }
        FrameLayout frameLayout = this.f30401r;
        if (frameLayout != null) {
            E(frameLayout, f11);
            RectF rectF = this.f30400q0;
            p(rectF);
            this.f30401r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        yb ybVar = this.f30381b;
        if (((Drawable) ybVar.f10080b) != null) {
            ybVar.setVisibility(0);
            ybVar.setAlpha(1.0f);
            ybVar.setScaleX(1.0f);
            ybVar.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i7 = 8;
            }
            ybVar.setVisibility(i7);
            ybVar.setAlpha(actionModeFactor);
            ybVar.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
            ybVar.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, actionModeFactor));
        }
        ybVar.invalidate();
        invalidate();
    }

    public final void m() {
        boolean z10;
        TextView textView;
        if (this.f30403s == null) {
            return;
        }
        m0 searchListener = getSearchListener();
        boolean z11 = true;
        if (this.f30403s.length() <= 0 && (((textView = this.f30409x) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!y() || !this.G) {
            z11 = false;
        }
        this.V.a(z10, z11);
        this.f30408w.setEnabled(z10);
    }

    public final void n() {
        m0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f30409x.setVisibility(8);
            m();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void o(boolean z10) {
        if (this.G) {
            m0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.f30403s.clearFocus();
                if (z10) {
                    org.telegram.messenger.g0.v1(this.f30403s);
                }
                this.T.a(false, y());
                l();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30385d0 = true;
        ks.e().c(this, ks.f25274q4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30385d0 = false;
        this.f30384c0 = false;
        ks.e().n(this, ks.f25274q4);
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
            if (!z(childAt) && childAt.getVisibility() != 8) {
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
        int i11 = rowTop + currentActionBarHeight + this.f30382b0;
        yb ybVar = this.f30381b;
        if (((Drawable) ybVar.f10080b) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int L3 = ((currentActionBarHeight - org.telegram.messenger.g0.L(46.0f)) / 2) + rowTop;
        F(ybVar, org.telegram.messenger.g0.L(6.0f), L3, 0);
        f5 f5Var = this.d;
        float f11 = 0.0f;
        if (f5Var != null && f5Var.getVisibility() != 8) {
            f10 = this.d.getTargetPillWidth();
        } else {
            f10 = 0.0f;
        }
        float v = v(true);
        if (z10) {
            L = org.telegram.messenger.g0.L(64.0f);
        } else {
            L = org.telegram.messenger.g0.L(18.0f);
        }
        if (f10 <= 0.0f && v <= 0.0f) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(18.0f) + ((int) (f10 + v));
        }
        int max = Math.max(Math.max(L, L2), this.f30405t0);
        y4 y4Var = this.f30383c;
        if (y4Var.f30360b != max) {
            y4Var.f30360b = max;
            y4Var.requestLayout();
        }
        F(y4Var, 0, rowTop, 0);
        y4Var.getLayoutParams().height = currentActionBarHeight;
        f5 f5Var2 = this.d;
        if (f5Var2 != null) {
            F(f5Var2, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        f5 f5Var3 = this.f30386e;
        if (f5Var3 != null) {
            F(f5Var3, 0, rowTop, org.telegram.messenger.g0.L(10.0f));
            this.f30386e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f30388f != null) {
            f5 f5Var4 = this.f30386e;
            if (f5Var4 != null) {
                f11 = f5Var4.getTargetPillWidth();
            }
            int L4 = org.telegram.messenger.g0.L(18.0f) + ((int) f11);
            org.telegram.ui.Components.n6 n6Var = this.h;
            if (n6Var != null && n6Var.getTag() != null) {
                int i12 = (currentActionBarHeight / 2) + rowTop;
                F(this.f30388f, org.telegram.messenger.g0.L(66.0f), i12 - org.telegram.messenger.g0.L(22.0f), L4);
                this.f30388f.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f);
                F(this.h, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(1.0f) + i12, L4);
                this.h.getLayoutParams().height = org.telegram.messenger.g0.L(18.0f);
            } else {
                F(this.f30388f, org.telegram.messenger.g0.L(66.0f), rowTop, L4);
                this.f30388f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f30401r;
        if (frameLayout != null) {
            F(frameLayout, (int) getSearchPillLeft(), L3, org.telegram.messenger.g0.L(6.0f));
        }
        c5 c5Var = this.f30396n;
        if (c5Var != null) {
            F(c5Var, 0, L3, org.telegram.messenger.g0.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f30406u0;
    }

    public final float p(RectF rectF) {
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
        f5 f5Var = this.d;
        if (f5Var != null && f5Var.getVisibility() != 8) {
            f10 = this.d.getPillWidth();
        } else {
            f10 = 0.0f;
        }
        f5 f5Var2 = this.f30386e;
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
        float width = (getWidth() - L) - v(false);
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

    public final f5 q() {
        if (this.f30386e == null) {
            f5 f5Var = new f5(getContext(), this, true);
            this.f30386e = f5Var;
            View view = this.f30381b;
            addView(f5Var, indexOfChild(view), na.e(-2, -2, 53));
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getContext(), true, true, true);
            this.f30388f = n6Var;
            n6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            this.f30388f.setTypeface(org.telegram.messenger.g0.o());
            this.f30388f.setTextColor(this.f30391h0);
            this.f30388f.setGravity(19);
            this.f30388f.setEllipsizeByGradient(true);
            this.f30388f.b(0.6f, 320L, kr.h);
            addView(this.f30388f, indexOfChild(view), na.e(-1, -2, 51));
            l();
        }
        return this.f30386e;
    }

    public final void r() {
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
        m10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.I = c10;
        fh.g c11 = cVar.c(this, null, false);
        c11.p(aVar);
        m10.s(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.J = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(aVar);
        m10.s(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.K = c12;
        this.L = org.telegram.messenger.g0.L(23.0f);
        invalidate();
    }

    public final c5 s(String str) {
        if (this.f30396n == null) {
            c5 c5Var = new c5(getContext(), this, str);
            this.f30396n = c5Var;
            addView(c5Var, indexOfChild(this.f30381b), na.e(-2, 46, 53));
            l();
        }
        return this.f30396n;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.W = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f30381b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f30381b.c(drawable);
        l();
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
        yb ybVar = this.f30381b;
        Drawable drawable = (Drawable) ybVar.f10080b;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.c cVar = (te.c) ybVar.f10083f;
        if (drawable != null && ((z4) ybVar.h).y()) {
            ybVar.c(mutate);
            ybVar.f10081c = (Drawable) ybVar.f10080b;
            cVar.c(0.0f);
            cVar.a(1.0f);
        } else {
            ybVar.c(mutate);
        }
        if (!z10) {
            l();
            requestLayout();
        }
    }

    public void setButtonsGlass(dh.c cVar) {
        this.P = cVar;
        if (this.M != null) {
            r();
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
        this.f30381b.setEnabled(z10);
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.setEnabled(z10);
        }
        c5 c5Var = this.f30396n;
        if (c5Var != null) {
            c5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i7) {
        if (this.f30382b0 != i7) {
            this.f30382b0 = i7;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.f30406u0 = z10;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f30399p0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuGlassStroke(boolean z10) {
        this.f30397n0 = z10;
    }

    public void setMenuOverlayProvider(o10 o10Var) {
        this.Q = o10Var;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.f30380a0 != z10) {
            this.f30380a0 = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i7;
        u();
        this.f30409x.setText(charSequence);
        TextView textView = this.f30409x;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        textView.setVisibility(i7);
        m();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.E = charSequence;
        ah.i iVar = this.f30403s;
        if (iVar != null) {
            iVar.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        ah.i iVar = this.f30403s;
        if (iVar == null) {
            this.F = charSequence;
            return;
        }
        iVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f30403s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(g5 g5Var) {
        if (g5Var == null && this.f30410y != null && this.G) {
            o(true);
        }
        this.f30410y = g5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f30383c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!y()) {
            setSubtitle(charSequence);
            return;
        }
        y4 y4Var = this.f30383c;
        n5 n5Var = (n5) y4Var.d;
        if (n5Var != null && n5Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) y4Var.f30363f, charSequence)) {
            y4Var.f30363f = charSequence;
            if (((n5) y4Var.f30362e) == null) {
                y4Var.f30362e = y4Var.a();
            }
            n5 n5Var2 = (n5) y4Var.d;
            n5 n5Var3 = (n5) y4Var.f30362e;
            y4Var.d = n5Var3;
            y4Var.f30362e = n5Var2;
            n5Var3.animate().cancel();
            ((n5) y4Var.d).l(charSequence, false);
            ((n5) y4Var.d).setVisibility(0);
            ((n5) y4Var.d).setAlpha(0.0f);
            ((n5) y4Var.d).setTranslationY(org.telegram.messenger.g0.L(6.0f));
            ViewPropertyAnimator duration = ((n5) y4Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            kr krVar = kr.h;
            duration.setInterpolator(krVar).start();
            n5Var2.animate().cancel();
            n5Var2.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(6.0f)).setDuration(380L).setInterpolator(krVar).withEndAction(new x4(n5Var2, 0)).start();
            y4Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) y4Var.f30363f, charSequence)) {
            y4Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i7) {
        this.f30395l0 = true;
        this.f30389f0 = i7;
        this.f30383c.d();
    }

    public void setTitle(CharSequence charSequence) {
        y4 y4Var = this.f30383c;
        int i7 = 0;
        y4Var.b(0);
        n5[] n5VarArr = (n5[]) y4Var.f30361c;
        n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            n5Var.animate().cancel();
            n5VarArr[1].setVisibility(8);
        }
        n5VarArr[0].animate().cancel();
        n5VarArr[0].setAlpha(1.0f);
        n5VarArr[0].setTranslationY(0.0f);
        n5VarArr[0].k(charSequence);
        n5 n5Var2 = n5VarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 4;
        }
        n5Var2.setVisibility(i7);
    }

    public void setTitleColor(int i7) {
        this.f30394k0 = true;
        this.f30387e0 = i7;
        this.f30383c.d();
    }

    public void setTitleMinSideInset(int i7) {
        if (this.f30405t0 != i7) {
            this.f30405t0 = i7;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f10) {
        if (this.f30407v0 != f10) {
            this.f30407v0 = f10;
            l();
        }
    }

    public final f5 t() {
        if (this.d == null) {
            f5 f5Var = new f5(getContext(), this, false);
            this.d = f5Var;
            addView(f5Var, indexOfChild(this.f30381b), na.e(-2, -2, 53));
            l();
        }
        return this.d;
    }

    public final void u() {
        if (this.f30401r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30401r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f30401r, indexOfChild(this.f30381b), na.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f30401r.addView(linearLayout, na.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30409x = textView;
        textView.setTextSize(1, 17.0f);
        this.f30409x.setSingleLine(true);
        this.f30409x.setEllipsize(TextUtils.TruncateAt.END);
        this.f30409x.setGravity(19);
        this.f30409x.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f30409x.setVisibility(8);
        linearLayout.addView(this.f30409x, na.o(-2, -1));
        ah.i iVar = new ah.i(4, context, this);
        this.f30403s = iVar;
        iVar.setTextSize(1, 17.0f);
        this.f30403s.setSingleLine(true);
        this.f30403s.setBackground(null);
        this.f30403s.setPadding(0, 0, 0, 0);
        this.f30403s.setGravity(19);
        ah.i iVar2 = this.f30403s;
        iVar2.setInputType(iVar2.getInputType() | 524288);
        this.f30403s.setImeOptions(33554435);
        this.f30403s.setTextIsSelectable(false);
        this.f30403s.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f30403s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.f30403s.setHint(charSequence);
        }
        this.f30403s.setOnEditorActionListener(new di.n(this, 4));
        this.f30403s.addTextChangedListener(new ah.j(this, 16));
        linearLayout.addView(this.f30403s, na.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.f30408w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f30408w.setImageResource(2131231272);
        this.f30408w.setContentDescription(gd.N0(2131752087, null));
        this.f30408w.setOnClickListener(new w4(this, 1));
        this.f30401r.addView(this.f30408w, na.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        J();
        m();
        K(2, this.V.f57779e, 0.0f, null);
    }

    @Override
    public final void updateColors() {
        C();
        this.f30383c.d();
        this.f30381b.d();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.i();
        }
        f5 f5Var2 = this.f30386e;
        if (f5Var2 != null) {
            f5Var2.i();
        }
        org.telegram.ui.Components.n6 n6Var = this.f30388f;
        if (n6Var != null) {
            n6Var.setTextColor(this.f30391h0);
        }
        c5 c5Var = this.f30396n;
        if (c5Var != null) {
            c5Var.c();
        }
        org.telegram.ui.Components.n6 n6Var2 = this.h;
        if (n6Var2 != null) {
            n6Var2.setTextColor(this.f30389f0);
        }
        if (this.f30403s != null) {
            J();
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

    public final float v(boolean z10) {
        float actionModeFactor;
        c5 c5Var = this.f30396n;
        if (c5Var != null) {
            if (c5Var.getVisibility() != 8 || !z10) {
                if (z10) {
                    actionModeFactor = this.f30396n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f30396n.getVisibleFactor();
                }
                return (org.telegram.messenger.g0.L(12.0f) + this.f30396n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void w() {
        f5 f5Var = this.f30386e;
        if (f5Var != null && this.H) {
            this.H = false;
            f5Var.g();
            this.U.a(false, y());
            l();
            this.f30381b.b(false, y());
            ks.e().k(ks.f25301u4, new Object[0]);
        }
    }

    public final boolean x() {
        if (this.f30386e != null && this.H) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (this.f30384c0 && this.f30385d0) {
            return true;
        }
        return false;
    }

    public final boolean z(View view) {
        if (view != this.f30381b && view != this.f30383c && view != this.d && view != this.f30386e && view != this.f30388f && view != this.h && view != this.f30401r && view != this.f30396n) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
