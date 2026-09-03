package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class l20 extends org.telegram.ui.Components.qc0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final Paint E0;
    public Boolean F0;
    public final m20 G0;

    public l20(m20 m20Var, Context context) {
        super(context);
        this.G0 = m20Var;
        new Paint(1);
        this.E0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z4;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.F0;
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        View view = this.G0.fragmentView;
        this.F0 = Boolean.valueOf(z4);
        AndroidUtilities.setLightStatusBar(view, z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f10;
        int i10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.k kVar7;
        m20 m20Var = this.G0;
        Paint paint = m20Var.H;
        lg.a aVar = m20Var.f38842y;
        int i11 = 0;
        if (!m20Var.f38836f) {
            if (m20Var.h) {
                float f11 = m20Var.f38837n + 0.016f;
                m20Var.f38837n = f11;
                if (f11 > 3.0f) {
                    m20Var.h = false;
                }
            } else {
                float f12 = m20Var.f38837n - 0.016f;
                m20Var.f38837n = f12;
                if (f12 < 1.0f) {
                    m20Var.h = true;
                }
            }
        }
        if (m20Var.f38834c.getLayoutManager() != null) {
            view = m20Var.f38834c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        m20Var.f38838r = i11;
        kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f13 = 1.0f - ((m20Var.f38838r - dp) / (m20Var.G - dp));
        m20Var.v = f13;
        float f14 = 0.0f;
        m20Var.v = Utilities.clamp(f13, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (m20Var.f38838r < dp2) {
            m20Var.f38838r = dp2;
        }
        float f15 = m20Var.f38841x;
        m20Var.f38841x = 0.0f;
        if (m20Var.f38838r < AndroidUtilities.dp(30.0f) + dp2) {
            m20Var.f38841x = ((AndroidUtilities.dp(30.0f) + dp2) - m20Var.f38838r) / AndroidUtilities.dp(30.0f);
        }
        if (m20Var.E) {
            m20Var.f38841x = 1.0f;
            m20Var.v = 1.0f;
        }
        if (f15 != m20Var.f38841x) {
            m20Var.f38834c.invalidate();
        }
        int i12 = m20Var.f38838r;
        kVar3 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.f12531b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - m20Var.F));
        kVar4 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - m20Var.F) - textView.getMeasuredHeight()) / 2.0f) + m20Var.F) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f16 = m20Var.v;
        float w10 = e2.c.w(1.0f, f16, 0.4f, 0.6f);
        if (f16 > 0.5f) {
            f10 = (f16 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f17 = 1.0f - f10;
        frameLayout.setScaleX(w10);
        frameLayout.setScaleY(w10);
        frameLayout.setAlpha(f17);
        ((FrameLayout) aVar.f12533e).setAlpha(f17);
        ((org.telegram.ui.Components.g90) aVar.f12532c).setAlpha(f17);
        m20Var.f38835e.setAlpha(1.0f - m20Var.v);
        m20Var.f38835e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f18 = m20Var.v;
        if (f18 > 0.3f) {
            f14 = (f18 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - f14)) * dp4);
        if (!m20Var.f38836f) {
            invalidate();
        }
        m20Var.f38832a.d(0, (-getMeasuredWidth()) * 0.1f * m20Var.f38837n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (m20Var.J) {
            int themedColor = m20Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7);
            Paint paint2 = this.E0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m20Var.f38832a.f6490f);
        }
        int themedColor2 = m20Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21768j5);
        if (m20Var.J) {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.Tj;
        }
        int d = i0.a.d(f17, themedColor2, m20Var.getThemedColor(i10));
        kVar5 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f17) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.k6.Sj;
        g6Var = ((org.telegram.ui.ActionBar.p2) m20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(i13, g6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f17 <= 0.01f && m20Var.q0()) {
            f5Var = ((org.telegram.ui.ActionBar.p2) m20Var).parentLayout;
            kVar7 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
            ((ActionBarLayout) f5Var).p(canvas, 255, kVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        m20 m20Var = this.G0;
        kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (vg.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.D0 = true;
                    }
                }
                if (this.D0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.D0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        lg.a aVar = m20Var.f38842y;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.f12533e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) aVar.f12532c;
        float x11 = g90Var.getX() + x10;
        float y10 = g90Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y10, g90Var.getMeasuredWidth() + x11, g90Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.B0) || m20Var.f38834c.H1 || (layout = g90Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && m20Var.f38841x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.B0 = false;
                        }
                    } else {
                        this.B0 = true;
                    }
                    g90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.A0) && !m20Var.f38834c.H1 && isClickable && m20Var.f38841x < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.A0 = false;
                }
            } else {
                this.A0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !m20Var.f38834c.H1 && m20Var.f38841x < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.C0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.C0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.C0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        m20 m20Var = this.G0;
        if (view == m20Var.f38834c) {
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
            canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l20.onMeasure(int, int):void");
    }
}
