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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public class r5 extends FrameLayout implements oe.d, NotificationCenter.NotificationCenterDelegate, p6 {
    public CharSequence E;
    public boolean F;
    public boolean G;
    public eh.d H;
    public eh.d I;
    public eh.d J;
    public float K;
    public ch.b L;
    public fh.e M;
    public Utilities.Callback0Return N;
    public z5 O;
    public y5 P;
    public final oe.b Q;
    public final oe.b R;
    public final oe.b S;
    public j T;
    public boolean U;
    public int V;
    public boolean W;
    public final u6 f23028a;
    public boolean f23029a0;
    public final o5 f23030b;
    public int f23031b0;
    public final q5 f23032c;
    public int f23033c0;
    public x5 d;
    public int f23034d0;
    public x5 e;
    public int f23035e0;
    public org.telegram.ui.Components.s6 f23036f;
    public int f23037f0;
    public int f23038g0;
    public org.telegram.ui.Components.s6 h;
    public boolean f23039h0;
    public boolean f23040i0;
    public final RectF f23041j0;
    public boolean f23042k0;
    public float f23043l0;
    public u5 f23044n;
    public FrameLayout f23045r;
    public fi.c2 f23046s;
    public ImageView v;
    public TextView f23047w;
    public y5 f23048x;
    public CharSequence f23049y;

    public r5(Context context, u6 u6Var) {
        super(context);
        this.K = -1.0f;
        ds dsVar = ds.h;
        this.Q = new oe.b(0, this, dsVar, 380L, false);
        this.R = new oe.b(1, this, dsVar, 380L, false);
        this.S = new oe.b(2, this, dsVar, 250L, false);
        this.U = true;
        this.f23041j0 = new RectF();
        this.f23043l0 = 1.0f;
        this.f23028a = u6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        s();
        q5 q5Var = new q5(this, context);
        this.f23032c = q5Var;
        addView(q5Var, gb1.i(-1, -2, 51));
        o5 o5Var = new o5(this, context);
        this.f23030b = o5Var;
        o5Var.setVisibility(8);
        o5Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        o5Var.setOnClickListener(new n5(this, 0));
        addView(o5Var, gb1.i(46, 46, 51));
    }

    public static void a(r5 r5Var, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return;
                }
            } else {
                return;
            }
        }
        AndroidUtilities.hideKeyboard(r5Var.f23046s);
        s0 searchListener = r5Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(r5Var.f23046s);
        }
    }

    private int getRowTop() {
        if (this.U) {
            return AndroidUtilities.statusBarHeight;
        }
        return 0;
    }

    public s0 getSearchListener() {
        y5 y5Var = this.f23048x;
        if (y5Var != null) {
            return y5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        float f7;
        if (this.f23030b.f22917a != null) {
            f7 = 58.0f;
        } else {
            f7 = 6.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public static void u(View view, float f7) {
        int i10;
        view.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        view.setVisibility(i10);
    }

    public static void v(View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.rightMargin = i12;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        if (i10 == 2) {
            ImageView imageView = this.v;
            if (imageView != null) {
                imageView.setAlpha(f7);
                float f11 = (f7 * 0.5f) + 0.5f;
                this.v.setScaleX(f11);
                this.v.setScaleY(f11);
                ImageView imageView2 = this.v;
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
        c();
    }

    public final void c() {
        x5 x5Var;
        x5 x5Var2;
        x5 x5Var3;
        x5 x5Var4;
        float lerp;
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f7 = 1.0f - actionModeFactor;
        float f10 = searchFactor * f7;
        float f11 = (1.0f - searchFactor) * f7;
        float lerp2 = AndroidUtilities.lerp(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        q5 q5Var = this.f23032c;
        u(q5Var, this.f23043l0 * f11);
        q5Var.setScaleX(lerp2);
        q5Var.setScaleY(lerp2);
        u5 u5Var = this.f23044n;
        if (u5Var != null) {
            float visibleFactor = u5Var.getVisibleFactor() * f11;
            u(this.f23044n, visibleFactor);
            if (this.f23044n.f23133c == t5.f23102a) {
                lerp = AndroidUtilities.lerp(0.6f, 1.0f, visibleFactor);
            } else {
                lerp = AndroidUtilities.lerp(0.8f, 1.0f, f11);
            }
            this.f23044n.setScaleX(lerp);
            this.f23044n.setScaleY(lerp);
        }
        x5 x5Var5 = this.d;
        int i10 = 0;
        if (x5Var5 != null) {
            x5Var5.setTranslationX(-l(false));
            u(this.d, f11);
            float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f11);
            this.d.setPivotX(x5Var3.getWidth() - AndroidUtilities.dp(19.0f));
            this.d.setPivotY(x5Var4.getHeight() / 2.0f);
            this.d.setScaleX(lerp3);
            this.d.setScaleY(lerp3);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!q(childAt) && childAt.getVisibility() != 8) {
                u(childAt, f11);
            }
        }
        x5 x5Var6 = this.e;
        if (x5Var6 != null) {
            u(x5Var6, actionModeFactor);
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(x5Var.getWidth() - AndroidUtilities.dp(19.0f));
            this.e.setPivotY(x5Var2.getHeight() / 2.0f);
            this.e.setScaleX(lerp4);
            this.e.setScaleY(lerp4);
        }
        org.telegram.ui.Components.s6 s6Var = this.f23036f;
        if (s6Var != null) {
            u(s6Var, actionModeFactor);
            this.f23036f.setTranslationX((-AndroidUtilities.dp(16.0f)) * f7);
        }
        org.telegram.ui.Components.s6 s6Var2 = this.h;
        if (s6Var2 != null) {
            u(s6Var2, actionModeFactor);
            this.h.setTranslationX((-AndroidUtilities.dp(16.0f)) * f7);
        }
        FrameLayout frameLayout = this.f23045r;
        if (frameLayout != null) {
            u(frameLayout, f10);
            RectF rectF = this.f23041j0;
            g(rectF);
            this.f23045r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        o5 o5Var = this.f23030b;
        if (o5Var.f22917a != null) {
            o5Var.setVisibility(0);
            o5Var.setAlpha(1.0f);
            o5Var.setScaleX(1.0f);
            o5Var.setScaleY(1.0f);
        } else {
            if (actionModeFactor <= 0.0f) {
                i10 = 8;
            }
            o5Var.setVisibility(i10);
            o5Var.setAlpha(actionModeFactor);
            o5Var.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, actionModeFactor));
            o5Var.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, actionModeFactor));
        }
        o5Var.invalidate();
        invalidate();
    }

    public final void d() {
        boolean z10;
        TextView textView;
        if (this.f23046s == null) {
            return;
        }
        s0 searchListener = getSearchListener();
        boolean z11 = true;
        if (this.f23046s.length() <= 0 && (((textView = this.f23047w) == null || textView.getVisibility() != 0 || (searchListener != null && !searchListener.m())) && (searchListener == null || !searchListener.d()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!p() || !this.F) {
            z11 = false;
        }
        this.S.a(z10, z11);
        this.v.setEnabled(z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            updateColors();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        u5 u5Var;
        this.W = this.f23029a0;
        int dp = AndroidUtilities.dp(6.0f);
        if (this.H != null) {
            o5 o5Var = this.f23030b;
            if (o5Var.getVisibility() == 0 && o5Var.getAlpha() > 0.0f) {
                float width = (o5Var.getWidth() / 2.0f) + o5Var.getX();
                float height = (o5Var.getHeight() / 2.0f) + o5Var.getY();
                float scaleX = o5Var.getScaleX() * (o5Var.getWidth() / 2.0f);
                float scaleY = o5Var.getScaleY() * (o5Var.getHeight() / 2.0f);
                this.H.setBounds(((int) (width - scaleX)) - dp, ((int) (height - scaleY)) - dp, ((int) (width + scaleX)) + dp, ((int) (height + scaleY)) + dp);
                this.H.setAlpha((int) (o5Var.getAlpha() * 255.0f));
                this.H.draw(canvas);
            }
        }
        if (this.J != null && (u5Var = this.f23044n) != null && u5Var.f23133c == t5.f23102a && u5Var.getVisibility() == 0 && this.f23044n.getAlpha() > 0.0f) {
            float width2 = (this.f23044n.getWidth() / 2.0f) + this.f23044n.getX();
            float height2 = (this.f23044n.getHeight() / 2.0f) + this.f23044n.getY();
            float scaleX2 = this.f23044n.getScaleX() * (this.f23044n.getWidth() / 2.0f);
            float scaleY2 = this.f23044n.getScaleY() * (this.f23044n.getHeight() / 2.0f);
            this.J.setBounds(((int) (width2 - scaleX2)) - dp, ((int) (height2 - scaleY2)) - dp, ((int) (width2 + scaleX2)) + dp, ((int) (height2 + scaleY2)) + dp);
            this.J.setAlpha((int) (this.f23044n.getAlpha() * 255.0f));
            this.J.draw(canvas);
        }
        if (this.I != null) {
            RectF rectF = this.f23041j0;
            float g7 = g(rectF);
            y5 y5Var = this.P;
            if (y5Var != null && y5Var.getParent() == this.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g7 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.x(height3);
                }
                this.I.setBounds(((int) rectF.left) - dp, ((int) rectF.top) - dp, ((int) rectF.right) + dp, ((int) rectF.bottom) + dp);
                this.I.setAlpha((int) (g7 * 255.0f));
                this.I.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y5 y5Var;
        if (view == this.d && (y5Var = this.P) != null && y5Var.getParent() == this.d) {
            return false;
        }
        if (view == this.f23045r && getSearchFactor() < 1.0f) {
            RectF rectF = this.f23041j0;
            g(rectF);
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        s0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.f23047w.setVisibility(8);
            d();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void f(boolean z10) {
        if (this.F) {
            s0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.f23046s.clearFocus();
                if (z10) {
                    AndroidUtilities.hideKeyboard(this.f23046s);
                }
                this.Q.a(false, p());
                c();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float g(RectF rectF) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int dp = AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(23.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        x5 x5Var = this.d;
        if (x5Var != null && x5Var.getVisibility() != 8) {
            f7 = this.d.getPillWidth();
        } else {
            f7 = 0.0f;
        }
        x5 x5Var2 = this.e;
        if (x5Var2 != null) {
            f10 = x5Var2.getPillWidth();
        } else {
            f10 = 0.0f;
        }
        if (f7 <= 0.0f) {
            f11 = actionModeFactor;
            f7 = f10;
        } else if (f10 <= 0.0f) {
            f11 = 1.0f - actionModeFactor;
        } else {
            f7 = AndroidUtilities.lerp(f7, f10, actionModeFactor);
            f11 = 1.0f;
        }
        float f14 = (1.0f - actionModeFactor) * searchFactor;
        float f15 = dp2 * 2.0f;
        float f16 = f7 / f15;
        float lerp = AndroidUtilities.lerp(0.8f, 1.0f, f11) * Math.min(1.0f, f16);
        float width = (getWidth() - dp) - l(false);
        float max = width - Math.max(f7, f15);
        float f17 = currentActionBarHeight - dp2;
        float f18 = currentActionBarHeight + dp2;
        if (lerp < 1.0f) {
            float f19 = (max + width) / 2.0f;
            float d = ic.a.d(1.0f, lerp, dp2, (width - max) / 2.0f);
            float f20 = f19 - d;
            width = f19 + d;
            float f21 = dp2 * lerp;
            float f22 = currentActionBarHeight - f21;
            f13 = currentActionBarHeight + f21;
            f12 = f22;
            max = f20;
        } else {
            f12 = f17;
            f13 = f18;
        }
        rectF.set(AndroidUtilities.lerp(max, getSearchPillLeft(), f14), AndroidUtilities.lerp(f12, f17, f14), AndroidUtilities.lerp(width, getWidth() - dp, f14), AndroidUtilities.lerp(f13, f18, f14));
        return AndroidUtilities.lerp(Math.min(1.0f, f16) * f11, 1.0f, f14);
    }

    public j getActionBarMenuOnItemClick() {
        return this.T;
    }

    public x5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.R.e;
    }

    public org.telegram.ui.Components.s6 getActionModeTitle() {
        h();
        return this.f23036f;
    }

    public View getBackButton() {
        return this.f23030b;
    }

    public Drawable getBackButtonDrawable() {
        return this.f23030b.f22917a;
    }

    public u5 getDoneButton() {
        return this.f23044n;
    }

    public int getExtraHeight() {
        return this.V;
    }

    public x5 getMenu() {
        return this.d;
    }

    public z5 getMenuOverlay() {
        Utilities.Callback0Return callback0Return = this.N;
        if (callback0Return != null) {
            return (z5) callback0Return.run();
        }
        return null;
    }

    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.U;
    }

    public z5 getOpenMenuOverlay() {
        return this.O;
    }

    public float getSearchFactor() {
        return this.Q.e;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f23046s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.f23032c.f22991f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public b6 getSubtitleTextView() {
        return (b6) this.f23032c.d;
    }

    public String getTitle() {
        CharSequence charSequence;
        b6 b6Var = ((b6[]) this.f23032c.f22990c)[0];
        if (b6Var != null) {
            charSequence = b6Var.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        q5 q5Var = this.f23032c;
        q5Var.b(0);
        return ((b6[]) q5Var.f22990c)[0].getTextPaint().getFontMetricsInt();
    }

    public b6 getTitleTextView() {
        return ((b6[]) this.f23032c.f22990c)[0];
    }

    public b6 getTitleTextView2() {
        return ((b6[]) this.f23032c.f22990c)[1];
    }

    public float getTitlesAlpha() {
        return this.f23043l0;
    }

    public final x5 h() {
        if (this.e == null) {
            x5 x5Var = new x5(getContext(), this, true);
            this.e = x5Var;
            View view = this.f23030b;
            addView(x5Var, indexOfChild(view), gb1.i(-2, -2, 53));
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getContext(), true, true, true);
            this.f23036f = s6Var;
            s6Var.setTextSize(AndroidUtilities.dp(18.0f));
            this.f23036f.setTypeface(AndroidUtilities.bold());
            this.f23036f.setTextColor(this.f23035e0);
            this.f23036f.setGravity(19);
            this.f23036f.setEllipsizeByGradient(true);
            this.f23036f.b(0.6f, 320L, ds.h);
            addView(this.f23036f, indexOfChild(view), gb1.i(-1, -2, 51));
            c();
        }
        return this.e;
    }

    public final u5 i(String str) {
        if (this.f23044n == null) {
            u5 u5Var = new u5(getContext(), this, str);
            this.f23044n = u5Var;
            addView(u5Var, indexOfChild(this.f23030b), gb1.i(-2, 46, 53));
            c();
        }
        return this.f23044n;
    }

    public final x5 j() {
        if (this.d == null) {
            x5 x5Var = new x5(getContext(), this, false);
            this.d = x5Var;
            addView(x5Var, indexOfChild(this.f23030b), gb1.i(-2, -2, 53));
            c();
        }
        return this.d;
    }

    public final void k() {
        if (this.f23045r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23045r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.f23045r, indexOfChild(this.f23030b), gb1.i(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.f23045r.addView(linearLayout, gb1.h(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23047w = textView;
        textView.setTextSize(1, 17.0f);
        this.f23047w.setSingleLine(true);
        this.f23047w.setEllipsize(TextUtils.TruncateAt.END);
        this.f23047w.setGravity(19);
        this.f23047w.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        this.f23047w.setVisibility(8);
        linearLayout.addView(this.f23047w, gb1.r(-2, -1));
        fi.c2 c2Var = new fi.c2(this, context, 3);
        this.f23046s = c2Var;
        c2Var.setTextSize(1, 17.0f);
        this.f23046s.setSingleLine(true);
        this.f23046s.setBackground(null);
        this.f23046s.setPadding(0, 0, 0, 0);
        this.f23046s.setGravity(19);
        fi.c2 c2Var2 = this.f23046s;
        c2Var2.setInputType(c2Var2.getInputType() | 524288);
        this.f23046s.setImeOptions(33554435);
        this.f23046s.setTextIsSelectable(false);
        this.f23046s.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f23046s.setCursorWidth(1.5f);
        CharSequence charSequence = this.f23049y;
        if (charSequence != null) {
            this.f23046s.setHint(charSequence);
        }
        this.f23046s.setOnEditorActionListener(new a0(1, this));
        this.f23046s.addTextChangedListener(new j0(1, this));
        linearLayout.addView(this.f23046s, gb1.p(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.v.setImageResource(R.drawable.ic_close_white);
        this.v.setContentDescription(LocaleController.getString(R.string.ClearButton));
        this.v.setOnClickListener(new n5(this, 1));
        this.f23045r.addView(this.v, gb1.h(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        y();
        d();
        E(2, this.S.e, 0.0f, null);
    }

    public final float l(boolean z10) {
        float actionModeFactor;
        u5 u5Var = this.f23044n;
        if (u5Var != null) {
            if (u5Var.getVisibility() != 8 || !z10) {
                if (z10) {
                    actionModeFactor = this.f23044n.getTargetVisibleFactor();
                } else {
                    actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.f23044n.getVisibleFactor();
                }
                return (AndroidUtilities.dp(12.0f) + this.f23044n.getButtonWidth()) * actionModeFactor;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final boolean m(y5 y5Var, RectF rectF) {
        float f7 = 0.0f;
        if (y5Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            g(rectF);
            return true;
        }
        float dp = AndroidUtilities.dp(23.0f);
        View view = (View) y5Var.getParent();
        if (view != null) {
            f7 = view.getX();
        }
        float width = (y5Var.getWidth() / 2.0f) + y5Var.getX() + f7;
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - dp, currentActionBarHeight - dp, width + dp, currentActionBarHeight + dp);
        return false;
    }

    public final void n() {
        x5 x5Var = this.e;
        if (x5Var != null && this.G) {
            this.G = false;
            x5Var.f();
            this.R.a(false, p());
            c();
            this.f23030b.b(false, p());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
    }

    public final boolean o() {
        if (this.e != null && this.G) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23029a0 = true;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23029a0 = false;
        this.W = false;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i10, i11, i12, i13);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i17 = i12 - i10;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (!q(childAt) && childAt.getVisibility() != 8) {
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
                    int A = (ic.a.A(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i14, A, measuredWidth + i14, measuredHeight + A);
                }
                i14 = i15 - i16;
                int A2 = (ic.a.A(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i14, A2, measuredWidth + i14, measuredHeight + A2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        int dp2;
        int size = View.MeasureSpec.getSize(i10);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i12 = rowTop + currentActionBarHeight + this.V;
        o5 o5Var = this.f23030b;
        if (o5Var.f22917a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int dp3 = ((currentActionBarHeight - AndroidUtilities.dp(46.0f)) / 2) + rowTop;
        v(o5Var, AndroidUtilities.dp(6.0f), dp3, 0);
        x5 x5Var = this.d;
        float f10 = 0.0f;
        if (x5Var != null && x5Var.getVisibility() != 8) {
            f7 = this.d.getTargetPillWidth();
        } else {
            f7 = 0.0f;
        }
        float l4 = l(true);
        if (z10) {
            dp = AndroidUtilities.dp(64.0f);
        } else {
            dp = AndroidUtilities.dp(18.0f);
        }
        if (f7 <= 0.0f && l4 <= 0.0f) {
            dp2 = 0;
        } else {
            dp2 = AndroidUtilities.dp(18.0f) + ((int) (f7 + l4));
        }
        int max = Math.max(dp, dp2);
        q5 q5Var = this.f23032c;
        if (q5Var.f22989b != max) {
            q5Var.f22989b = max;
            q5Var.requestLayout();
        }
        v(q5Var, 0, rowTop, 0);
        q5Var.getLayoutParams().height = currentActionBarHeight;
        x5 x5Var2 = this.d;
        if (x5Var2 != null) {
            v(x5Var2, 0, rowTop, AndroidUtilities.dp(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        x5 x5Var3 = this.e;
        if (x5Var3 != null) {
            v(x5Var3, 0, rowTop, AndroidUtilities.dp(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f23036f != null) {
            x5 x5Var4 = this.e;
            if (x5Var4 != null) {
                f10 = x5Var4.getTargetPillWidth();
            }
            int dp4 = AndroidUtilities.dp(18.0f) + ((int) f10);
            org.telegram.ui.Components.s6 s6Var = this.h;
            if (s6Var != null && s6Var.getTag() != null) {
                int i13 = (currentActionBarHeight / 2) + rowTop;
                v(this.f23036f, AndroidUtilities.dp(66.0f), i13 - AndroidUtilities.dp(22.0f), dp4);
                this.f23036f.getLayoutParams().height = AndroidUtilities.dp(22.0f);
                v(this.h, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(1.0f) + i13, dp4);
                this.h.getLayoutParams().height = AndroidUtilities.dp(18.0f);
            } else {
                v(this.f23036f, AndroidUtilities.dp(66.0f), rowTop, dp4);
                this.f23036f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.f23045r;
        if (frameLayout != null) {
            v(frameLayout, (int) getSearchPillLeft(), dp3, AndroidUtilities.dp(6.0f));
        }
        u5 u5Var = this.f23044n;
        if (u5Var != null) {
            v(u5Var, 0, dp3, AndroidUtilities.dp(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.f23042k0;
    }

    public final boolean p() {
        if (this.W && this.f23029a0) {
            return true;
        }
        return false;
    }

    public final boolean q(View view) {
        if (view != this.f23030b && view != this.f23032c && view != this.d && view != this.e && view != this.f23036f && view != this.h && view != this.f23045r && view != this.f23044n) {
            return false;
        }
        return true;
    }

    public final boolean r(boolean z10, boolean z11) {
        s0 searchListener;
        boolean z12 = false;
        if (this.f23048x == null || this.F || this.G || ((searchListener = getSearchListener()) != null && !searchListener.c())) {
            return false;
        }
        k();
        this.F = true;
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.f();
        }
        fi.c2 c2Var = this.f23046s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        c2Var.setText(charSequence);
        this.E = null;
        this.f23046s.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.f23046s);
        }
        if (z11 && p()) {
            z12 = true;
        }
        this.Q.a(true, z12);
        c();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void s() {
        boolean z10 = this.f23039h0;
        u6 u6Var = this.f23028a;
        if (!z10) {
            this.f23031b0 = y6.w0(y6.G6, u6Var);
        }
        if (!this.f23040i0) {
            this.f23033c0 = y6.w0(y6.f23748y6, u6Var);
        }
        int i10 = y6.G6;
        this.f23034d0 = y6.w0(i10, u6Var);
        this.f23035e0 = y6.w0(i10, u6Var);
        int i11 = y6.f23448i6;
        this.f23037f0 = y6.w0(i11, u6Var);
        this.f23038g0 = y6.w0(i11, u6Var);
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.T = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.f23030b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.f23030b.c(drawable);
        c();
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
        o5 o5Var = this.f23030b;
        Drawable drawable = o5Var.f22917a;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        oe.e eVar = o5Var.e;
        if (drawable != null && o5Var.f22920f.p()) {
            Drawable drawable2 = o5Var.f22917a;
            o5Var.c(mutate);
            o5Var.f22918b = drawable2;
            eVar.c(0.0f);
            eVar.a(1.0f);
        } else {
            o5Var.c(mutate);
        }
        if (!z10) {
            c();
            requestLayout();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f23030b.setEnabled(z10);
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.setEnabled(z10);
        }
        u5 u5Var = this.f23044n;
        if (u5Var != null) {
            u5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        if (this.V != i10) {
            this.V = i10;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.f23042k0 = z10;
    }

    public void setMenuOverlayProvider(Utilities.Callback0Return<z5> callback0Return) {
        this.N = callback0Return;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        int i10;
        k();
        this.f23047w.setText(charSequence);
        TextView textView = this.f23047w;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        d();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.f23049y = charSequence;
        fi.c2 c2Var = this.f23046s;
        if (c2Var != null) {
            c2Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        fi.c2 c2Var = this.f23046s;
        if (c2Var == null) {
            this.E = charSequence;
            return;
        }
        c2Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f23046s.setSelection(charSequence.length());
        }
    }

    public void setSearchItem(y5 y5Var) {
        if (y5Var == null && this.f23048x != null && this.F) {
            f(true);
        }
        this.f23048x = y5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f23032c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!p()) {
            setSubtitle(charSequence);
            return;
        }
        q5 q5Var = this.f23032c;
        b6 b6Var = (b6) q5Var.d;
        if (b6Var != null && b6Var.getVisibility() != 8 && !TextUtils.isEmpty(charSequence) && !TextUtils.equals((CharSequence) q5Var.f22991f, charSequence)) {
            q5Var.f22991f = charSequence;
            if (((b6) q5Var.e) == null) {
                q5Var.e = q5Var.a();
            }
            b6 b6Var2 = (b6) q5Var.d;
            b6 b6Var3 = (b6) q5Var.e;
            q5Var.d = b6Var3;
            q5Var.e = b6Var2;
            b6Var3.animate().cancel();
            ((b6) q5Var.d).l(charSequence, false);
            ((b6) q5Var.d).setVisibility(0);
            ((b6) q5Var.d).setAlpha(0.0f);
            ((b6) q5Var.d).setTranslationY(AndroidUtilities.dp(6.0f));
            ViewPropertyAnimator duration = ((b6) q5Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            b6Var2.animate().cancel();
            b6Var2.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(6.0f)).setDuration(380L).setInterpolator(dsVar).withEndAction(new p5(b6Var2, 0)).start();
            q5Var.requestLayout();
        } else if (!TextUtils.equals((CharSequence) q5Var.f22991f, charSequence)) {
            q5Var.c(charSequence);
        }
    }

    public void setSubtitleColor(int i10) {
        this.f23040i0 = true;
        this.f23033c0 = i10;
        this.f23032c.d();
    }

    public void setTitle(CharSequence charSequence) {
        q5 q5Var = this.f23032c;
        int i10 = 0;
        q5Var.b(0);
        b6[] b6VarArr = (b6[]) q5Var.f22990c;
        b6 b6Var = b6VarArr[1];
        if (b6Var != null) {
            b6Var.animate().cancel();
            b6VarArr[1].setVisibility(8);
        }
        b6VarArr[0].animate().cancel();
        b6VarArr[0].setAlpha(1.0f);
        b6VarArr[0].setTranslationY(0.0f);
        b6VarArr[0].k(charSequence);
        b6 b6Var2 = b6VarArr[0];
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 4;
        }
        b6Var2.setVisibility(i10);
    }

    public void setTitleColor(int i10) {
        this.f23039h0 = true;
        this.f23031b0 = i10;
        this.f23032c.d();
    }

    public void setTitlesAlpha(float f7) {
        if (this.f23043l0 != f7) {
            this.f23043l0 = f7;
            c();
        }
    }

    public final void t(int i10, boolean z10) {
        boolean z11;
        String formatNumber = LocaleController.formatNumber(i10, ' ');
        h();
        org.telegram.ui.Components.s6 s6Var = this.f23036f;
        if (z10 && p() && this.G) {
            z11 = true;
        } else {
            z11 = false;
        }
        s6Var.c(formatNumber, z11, true);
    }

    @Override
    public final void updateColors() {
        s();
        this.f23032c.d();
        this.f23030b.d();
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.h();
        }
        x5 x5Var2 = this.e;
        if (x5Var2 != null) {
            x5Var2.h();
        }
        org.telegram.ui.Components.s6 s6Var = this.f23036f;
        if (s6Var != null) {
            s6Var.setTextColor(this.f23035e0);
        }
        u5 u5Var = this.f23044n;
        if (u5Var != null) {
            u5Var.c();
        }
        org.telegram.ui.Components.s6 s6Var2 = this.h;
        if (s6Var2 != null) {
            s6Var2.setTextColor(this.f23033c0);
        }
        if (this.f23046s != null) {
            y();
        }
        eh.d dVar = this.H;
        if (dVar != null) {
            dVar.updateColors();
        }
        eh.d dVar2 = this.I;
        if (dVar2 != null) {
            dVar2.updateColors();
        }
        invalidate();
    }

    public final void w(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        int dp;
        if (!p()) {
            setTitle(charSequence);
            return;
        }
        q5 q5Var = this.f23032c;
        q5Var.b(0);
        q5Var.b(1);
        b6[] b6VarArr = (b6[]) q5Var.f22990c;
        b6 b6Var = b6VarArr[0];
        b6 b6Var2 = b6VarArr[1];
        b6VarArr[0] = b6Var2;
        b6VarArr[1] = b6Var;
        b6Var2.animate().cancel();
        b6Var2.k(charSequence);
        b6Var2.setVisibility(0);
        b6Var2.setAlpha(0.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        if (!z10) {
            dp2 = -dp2;
        }
        b6Var2.setTranslationY(dp2);
        b6Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j10).setInterpolator(interpolator).start();
        b6Var.animate().cancel();
        ViewPropertyAnimator alpha = b6Var.animate().alpha(0.0f);
        if (z10) {
            dp = -AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        alpha.translationY(dp).setDuration(j10).setInterpolator(interpolator).withEndAction(new p5(b6Var, 1)).start();
        q5Var.requestLayout();
    }

    public final void x() {
        if (this.e != null && !this.G) {
            this.G = true;
            x5 x5Var = this.d;
            if (x5Var != null) {
                x5Var.f();
            }
            fi.c2 c2Var = this.f23046s;
            if (c2Var != null && this.F) {
                AndroidUtilities.hideKeyboard(c2Var);
            }
            this.R.a(true, p());
            c();
            this.f23030b.b(true, p());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
    }

    public final void y() {
        fi.c2 c2Var = this.f23046s;
        int i10 = y6.G6;
        u6 u6Var = this.f23028a;
        c2Var.setTextColor(y6.w0(i10, u6Var));
        this.f23047w.setTextColor(y6.w0(i10, u6Var));
        this.f23046s.setHintTextColor(y6.w0(y6.H6, u6Var));
        this.f23046s.setCursorColor(y6.w0(i10, u6Var));
        this.f23046s.setHighlightColor(y6.w0(y6.f23682uf, u6Var));
        this.f23046s.setHandlesColor(y6.w0(y6.f23700vf, u6Var));
        this.v.setColorFilter(new PorterDuffColorFilter(y6.w0(y6.f23520m6, u6Var), PorterDuff.Mode.SRC_IN));
        this.v.setBackground(y6.g0(this.f23037f0, 1, -1));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
