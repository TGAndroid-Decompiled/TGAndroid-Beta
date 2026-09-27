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
public class o20 extends org.telegram.ui.Components.wc0 {
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public final Paint G0;
    public Boolean H0;
    public final p20 I0;

    public o20(p20 p20Var, Context context) {
        super(context);
        this.I0 = p20Var;
        new Paint(1);
        this.G0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.H0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.I0.fragmentView;
        this.H0 = Boolean.valueOf(z10);
        AndroidUtilities.setLightStatusBar(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.l lVar7;
        p20 p20Var = this.I0;
        Paint paint = p20Var.K;
        m20 m20Var = p20Var.f36312y;
        int i11 = 0;
        if (!p20Var.f36306f) {
            if (p20Var.h) {
                float f10 = p20Var.f36307n + 0.016f;
                p20Var.f36307n = f10;
                if (f10 > 3.0f) {
                    p20Var.h = false;
                }
            } else {
                float f11 = p20Var.f36307n - 0.016f;
                p20Var.f36307n = f11;
                if (f11 < 1.0f) {
                    p20Var.h = true;
                }
            }
        }
        if (p20Var.f36305c.getLayoutManager() != null) {
            view = p20Var.f36305c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        p20Var.f36308r = i11;
        lVar = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
        float f12 = 1.0f - ((p20Var.f36308r - dp) / (p20Var.J - dp));
        p20Var.v = f12;
        float f13 = 0.0f;
        p20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
        if (p20Var.f36308r < dp2) {
            p20Var.f36308r = dp2;
        }
        float f14 = p20Var.f36311x;
        p20Var.f36311x = 0.0f;
        if (p20Var.f36308r < AndroidUtilities.dp(30.0f) + dp2) {
            p20Var.f36311x = ((AndroidUtilities.dp(30.0f) + dp2) - p20Var.f36308r) / AndroidUtilities.dp(30.0f);
        }
        if (p20Var.H) {
            p20Var.f36311x = 1.0f;
            p20Var.v = 1.0f;
        }
        if (f14 != p20Var.f36311x) {
            p20Var.f36305c.invalidate();
        }
        int i12 = p20Var.f36308r;
        lVar3 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        int measuredHeight = lVar3.getMeasuredHeight();
        int measuredHeight2 = m20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) m20Var.d;
        TextView textView = (TextView) m20Var.f35494b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - p20Var.I));
        lVar4 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - p20Var.I) - textView.getMeasuredHeight()) / 2.0f) + p20Var.I) - m20Var.getTop()) - textView.getTop(), dp3);
        m20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f15 = p20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f15, 0.4f, 0.6f);
        if (f15 > 0.5f) {
            f7 = (f15 - 0.5f) / 0.5f;
        } else {
            f7 = 0.0f;
        }
        float f16 = 1.0f - f7;
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f16);
        ((FrameLayout) m20Var.e).setAlpha(f16);
        ((org.telegram.ui.Components.p90) m20Var.f35495c).setAlpha(f16);
        p20Var.e.setAlpha(1.0f - p20Var.v);
        p20Var.e.setTranslationY((frameLayout.getY() + m20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f17 = p20Var.v;
        if (f17 > 0.3f) {
            f13 = (f17 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.sr.h.getInterpolation(1.0f - f13)) * dp4);
        if (!p20Var.f36306f) {
            invalidate();
        }
        p20Var.f36303a.d(0, (-getMeasuredWidth()) * 0.1f * p20Var.f36307n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (p20Var.M) {
            int themedColor = p20Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7);
            Paint paint2 = this.G0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p20Var.f36303a.f42885f);
        }
        int themedColor2 = p20Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19164j5);
        if (p20Var.M) {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.Tj;
        }
        int d = i0.a.d(f16, themedColor2, p20Var.getThemedColor(i10));
        lVar5 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        lVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f16) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.i6.Sj;
        e6Var = ((org.telegram.ui.ActionBar.o2) p20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i13, e6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        lVar6 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, lVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f16 <= 0.01f && p20Var.q0()) {
            d5Var = ((org.telegram.ui.ActionBar.o2) p20Var).parentLayout;
            lVar7 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
            ((ActionBarLayout) d5Var).p(canvas, 255, lVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.l lVar2;
        p20 p20Var = this.I0;
        lVar = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
            ImageView backButton = lVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (hh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.F0 = true;
                    }
                }
                if (this.F0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.F0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        m20 m20Var = p20Var.f36312y;
        float x10 = m20Var.getX();
        FrameLayout frameLayout = (FrameLayout) m20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) m20Var.d;
        org.telegram.ui.Components.p90 p90Var = (org.telegram.ui.Components.p90) m20Var.f35495c;
        float x11 = p90Var.getX() + x10;
        float y3 = p90Var.getY() + m20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, p90Var.getMeasuredWidth() + x11, p90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.D0) || p20Var.f36305c.K1 || (layout = p90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && p20Var.f36311x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.D0 = false;
                        }
                    } else {
                        this.D0 = true;
                    }
                    p90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + m20Var.getX();
        float y10 = frameLayout2.getY() + m20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !p20Var.f36305c.K1 && isClickable && p20Var.f36311x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.C0 = false;
                }
            } else {
                this.C0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + m20Var.getX();
        float y11 = frameLayout.getY() + m20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.E0) && !p20Var.f36305c.K1 && p20Var.f36311x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.E0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.E0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.E0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        p20 p20Var = this.I0;
        if (view == p20Var.f36305c) {
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
            canvas.clipRect(0, lVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o20.onMeasure(int, int):void");
    }
}
