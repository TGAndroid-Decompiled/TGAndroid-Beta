package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.RadioButton;

public final class n0 extends FrameLayout {

    public final int f40616a;

    public Object f40617b;

    public n0(Context context) {
        super(context);
        this.f40616a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f40616a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.o71 o71Var;
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver imageReceiver;
        switch (this.f40616a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                l6 l6Var = (l6) this.f40617b;
                int iD = ((measuredWidth - ((int) l6Var.f39955c.d())) + ((int) l6Var.f39954b.d())) / 2;
                if (!LocaleController.isRTL) {
                    l6Var.f39954b.setBounds(0, 0, iD, getHeight());
                    l6Var.f39954b.draw(canvas);
                    l6Var.f39955c.setBounds(AndroidUtilities.dp(8.0f) + iD, 0, getWidth(), getHeight());
                    l6Var.f39955c.draw(canvas);
                } else {
                    super.dispatchDraw(canvas);
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                ru ruVar = (ru) this.f40617b;
                if (ruVar.getParentLayout() != null && (o71Var = ruVar.f42339b) != null) {
                    float measuredHeight = o71Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.g6.f23175k0);
                    break;
                }
                break;
            case 7:
                o60 o60Var = (o60) this.f40617b;
                jg.e eVar = o60Var.f41009l0;
                og.d dVar = o60Var.m0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    o60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f19455n && dVar.e(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, o60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), o60Var.f41006i0);
                break;
            case 9:
                t70 t70Var = (t70) this.f40617b;
                jg.e eVar2 = t70Var.H;
                og.d dVar2 = t70Var.I;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    t70Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f19455n && dVar2.e(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f40617b;
                View view = launchActivity.C0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f35536t1 == null) {
                        launchActivity.f35536t1 = new int[2];
                    }
                    launchActivity.C0.getLocationInWindow(launchActivity.f35536t1);
                    int[] iArr = launchActivity.f35536t1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.f35536t1;
                    int i12 = i10 - iArr2[0];
                    int i13 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i12, i13);
                    launchActivity.C0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
                qg0 qg0Var = (qg0) this.f40617b;
                qg0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.g6.f22999a7;
                int themedColor = qg0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.g6.f23053d6;
                int themedColor2 = qg0Var.getThemedColor(i15);
                rg1 rg1Var = qg0Var.f42640c;
                int iD2 = i0.b.d(rg1Var != null ? rg1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = qg0Var.I;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.g6.l0(iD2));
                }
                if (qg0Var.J != 0) {
                    canvas.drawRect(getWidth() - qg0Var.J, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.l0(iD2));
                }
                super.dispatchDraw(canvas);
                qg0Var.d0();
                og.c cVar = qg0Var.O;
                int themedColor3 = qg0Var.getThemedColor(i14);
                int themedColor4 = qg0Var.getThemedColor(i15);
                rg1 rg1Var2 = qg0Var.f42640c;
                cVar.a(i0.b.d(rg1Var2 != null ? rg1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = qg0Var.D;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            case 22:
                c41 c41Var = (c41) this.f40617b;
                if (c41Var.f36944s > 0.0f && c41Var.f36942n != null) {
                    c41Var.f36943r.reset();
                    float width = getWidth() / c41Var.f36941f.getWidth();
                    c41Var.f36943r.postScale(width, width);
                    c41Var.h.setLocalMatrix(c41Var.f36943r);
                    c41Var.f36942n.setAlpha((int) (c41Var.f36944s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), c41Var.f36942n);
                }
                if (c41Var.S && (s1Var = c41Var.K) != null) {
                    s1Var.setVisibility(4);
                    c41Var.S = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                p41 p41Var = (p41) this.f40617b;
                ImageReceiver imageReceiver2 = p41Var.f43611b;
                Rect rect = p41Var.f43613e;
                a61 a61Var = p41Var.L;
                j51 j51Var = p41Var.f43610a;
                if (p41Var.f43615n != null && p41Var.f43616r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    p41Var.f43616r.setAlpha((int) (p41Var.E * 255.0f));
                    canvas.drawBitmap(p41Var.f43615n, 0.0f, 0.0f, p41Var.f43616r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (j51Var != null) {
                    Drawable drawable = j51Var.A;
                    if (drawable != null) {
                        if (p41Var.f43619x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(p41Var.E, a61Var.f36405i1, a61Var.f36388b1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(a61Var.f36401g1);
                        }
                        drawable.setAlpha((int) ((1.0f - p41Var.E) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f10 = j51Var.J;
                        float fMax = (f10 != 0.0f || j51Var.O > 0.0f) ? (((1.0f - Math.max(j51Var.O * 0.8f, f10)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * fMax)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * fMax)), (int) (((rectF.width() / 2.0f) * fMax) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * fMax) + rectF.centerY()));
                        float f11 = 1.0f - ((1.0f - p41Var.E) * (1.0f - j51Var.K));
                        canvas.save();
                        if (f11 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f11, 0.0f, 0.0f);
                            canvas.skew((1.0f - f11) * (1.0f - ((j51Var.L * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (p41Var.E * AndroidUtilities.dp(45.0f)) + p41Var.B);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = j51Var.L;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f11 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f11 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f11 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f11 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - p41Var.E) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (a61Var.T.getX() + a61Var.f36408k0.getX() + p41Var.f43620y), a61Var.T.getY() + ((int) a61Var.f36408k0.getY()) + p41Var.A);
                        a61Var.f36408k0.draw(canvas);
                        canvas.restore();
                    } else if (j51Var.f39263s && (imageReceiver = j51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - p41Var.E);
                        j51Var.h.setImageCoords(rect);
                        j51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(p41Var.E);
                    imageReceiver2.setImageCoords(rect);
                    imageReceiver2.draw(canvas);
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f40616a) {
            case 5:
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                kt ktVar = (kt) this.f40617b;
                if (ktVar.f39870n || ktVar.K) {
                    ktVar.o();
                    return true;
                }
                ktVar.n();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40616a) {
            case 22:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((c41) this.f40617b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        int i11;
        boolean zDrawChild;
        q3[] q3VarArr;
        switch (this.f40616a) {
            case 0:
                m4 m4Var = (m4) this.f40617b;
                ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40333b0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.f24027e || articleViewer$WindowView.f24028f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) m4Var.f40347q0[0].getTranslationX();
                q3[] q3VarArr2 = m4Var.f40347q0;
                if (view != q3VarArr2[1]) {
                    i10 = measuredWidth;
                    i11 = view == q3VarArr2[0] ? translationX : 0;
                    int iSave = canvas.save();
                    canvas.clipRect(i11, 0, i10, getHeight());
                    zDrawChild = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(iSave);
                    if (translationX != 0) {
                        return zDrawChild;
                    }
                    q3VarArr = m4Var.f40347q0;
                    if (view == q3VarArr[0]) {
                        float fMax = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                        Drawable drawable = m4Var.f40340i0;
                        drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                        m4Var.f40340i0.setAlpha((int) (fMax * 255.0f));
                        m4Var.f40340i0.draw(canvas);
                        return zDrawChild;
                    }
                    if (view == q3VarArr[1]) {
                        return zDrawChild;
                    }
                    float fMin = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                    m4Var.f40341j0.setColor(((int) ((fMin >= 0.0f ? fMin : 0.0f) * 153.0f)) << 24);
                    canvas.drawRect(i11, 0.0f, i10, getHeight(), m4Var.f40341j0);
                    return zDrawChild;
                }
                i10 = translationX;
                int iSave2 = canvas.save();
                canvas.clipRect(i11, 0, i10, getHeight());
                zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(iSave2);
                if (translationX != 0) {
                    return zDrawChild;
                }
                q3VarArr = m4Var.f40347q0;
                if (view == q3VarArr[0]) {
                    float fMax2 = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                    Drawable drawable2 = m4Var.f40340i0;
                    drawable2.setBounds(translationX - drawable2.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                    m4Var.f40340i0.setAlpha((int) (fMax2 * 255.0f));
                    m4Var.f40340i0.draw(canvas);
                    return zDrawChild;
                }
                if (view == q3VarArr[1]) {
                    return zDrawChild;
                }
                float fMin2 = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                m4Var.f40341j0.setColor(((int) ((fMin2 >= 0.0f ? fMin2 : 0.0f) * 153.0f)) << 24);
                canvas.drawRect(i11, 0.0f, i10, getHeight(), m4Var.f40341j0);
                return zDrawChild;
            case 24:
                boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                nc1 nc1Var = (nc1) this.f40617b;
                if (view == ((org.telegram.ui.ActionBar.n2) nc1Var).actionBar && ((org.telegram.ui.ActionBar.n2) nc1Var).parentLayout != null) {
                    ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) nc1Var).parentLayout).q(canvas, ((org.telegram.ui.ActionBar.n2) nc1Var).actionBar.getVisibility() == 0 ? ((org.telegram.ui.ActionBar.n2) nc1Var).actionBar.getMeasuredHeight() : 0);
                }
                return zDrawChild2;
            case 25:
                we1 we1Var = (we1) this.f40617b;
                if (view == we1Var.W0 && we1Var.isInPreviewMode()) {
                    ((ActionBarLayout) we1Var.getParentLayout()).p(canvas, (int) (we1Var.S * 255.0f), (int) (we1Var.W0.getY() + we1Var.W0.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f40616a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((kh0) this.f40617b).m0, 500L);
                break;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((p41) this.f40617b).f43611b;
                if (imageReceiver != null) {
                    imageReceiver.onAttachedToWindow();
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f40616a) {
            case 23:
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f40616a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((kh0) this.f40617b).m0);
                break;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((p41) this.f40617b).f43611b;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f40616a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f40617b).f26504f);
                accessibilityNodeInfo.setCheckable(true);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((jp0) this.f40617b).f39462b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((aq0) this.f40617b).f36598b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f40616a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                return ((PopupNotificationActivity) this.f40617b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Activity activity;
        switch (this.f40616a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int iMin = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int iMin2 = Math.min(AndroidUtilities.dp(60.0f), iMin);
                int iDp = (paddingTop - iMin2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f40617b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
                int iB = h7.n.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), iMin2, iMin);
                c5Var.f36950c.measure(View.MeasureSpec.makeMeasureSpec(iB, 1073741824), View.MeasureSpec.makeMeasureSpec(iB, 1073741824));
                int iX = org.telegram.messenger.rl.x(48.0f, (paddingTop - iB) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.f36950c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + iX;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y1.C(8.0f, iX, iB);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                o60 o60Var = (o60) this.f40617b;
                o60Var.g0();
                o60Var.h0();
                org.telegram.ui.Components.p10 p10Var = o60Var.f41002f;
                ud.c cVar = o60Var.f40995b;
                p10Var.setTranslationY(cVar.f48502e);
                o60Var.i0();
                o60Var.f41000e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.f48502e);
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.f40617b;
                TextView textView = e70Var.f37645b;
                if (textView != null) {
                    int measuredWidth = ((e70Var.f37645b.getMeasuredWidth() / 2) + textView.getLeft()) - (e70Var.f37646c.getMeasuredWidth() / 2);
                    int top = (e70Var.f37647e.getTop() + ((e70Var.f37645b.getMeasuredHeight() - e70Var.f37646c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = e70Var.f37646c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, e70Var.f37646c.getMeasuredHeight() + top);
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                t70 t70Var = (t70) this.f40617b;
                t70Var.Z();
                t70Var.b0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ig0 ig0Var = (ig0) this.f40617b;
                for (org.telegram.ui.Components.ev0 ev0Var : ig0Var.f39081b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ev0Var.getLayoutParams();
                    int iDp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!ev0Var.a() && ig0Var.f39083c.getVisibility() == 0) {
                        iDp2 += AndroidUtilities.dp(230.0f);
                    }
                    ev0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, iDp2);
                }
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                qg0 qg0Var = (qg0) this.f40617b;
                qg0Var.i0();
                qg0Var.h0();
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40617b;
                WindowInsets windowInsets = secretMediaViewer.f36126c0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ag.y1 y1Var = secretMediaViewer.f36130e;
                y1Var.layout(systemWindowInsetLeft, 0, y1Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.f36130e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.G0 == null) {
                        secretMediaViewer.f36164u0 = 1.0f;
                        secretMediaViewer.f36161s0 = 0.0f;
                        secretMediaViewer.f36163t0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f36164u0);
                }
                break;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((c41) this.f40617b).d();
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                p41 p41Var = (p41) this.f40617b;
                Context context = p41Var.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    View decorView = activity.getWindow().getDecorView();
                    Bitmap bitmap = p41Var.f43615n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || p41Var.f43615n.getHeight() != decorView.getMeasuredHeight()) {
                        p41Var.f();
                    }
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40616a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                break;
            case 6:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            case 7:
                o60 o60Var = (o60) this.f40617b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    o60Var.Y = AndroidUtilities.dp(144.0f);
                } else {
                    o60Var.Y = AndroidUtilities.dp(56.0f);
                }
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) o60Var).actionBar, i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) o60Var.f41016s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((org.telegram.ui.ActionBar.n2) o60Var).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) o60Var.f41000e.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) o60Var).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) o60Var.f41002f.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) o60Var).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) o60Var.h.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) o60Var).actionBar.getMeasuredHeight();
                o60Var.h.getLayoutParams().height = o60Var.Y;
                ((ViewGroup.MarginLayoutParams) o60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + ((org.telegram.ui.ActionBar.n2) o60Var).actionBar.getMeasuredHeight() + o60Var.Y;
                o60Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                t70 t70Var = (t70) this.f40617b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    t70Var.f42803x = AndroidUtilities.dp(144.0f);
                } else {
                    t70Var.f42803x = AndroidUtilities.dp(56.0f);
                }
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) t70Var).actionBar, i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) t70Var.f42800r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((org.telegram.ui.ActionBar.n2) t70Var).actionBar.getMeasuredHeight();
                t70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + t70Var.f42803x;
                t70Var.a0();
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                qc0 qc0Var = ((tc0) this.f40617b).f42886x;
                if (qc0Var != null) {
                    qc0Var.a();
                }
                break;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ig0 ig0Var = (ig0) this.f40617b;
                for (org.telegram.ui.Components.ev0 ev0Var : ig0Var.f39081b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ev0Var.getLayoutParams();
                    int iDp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!ev0Var.a() && ig0Var.f39083c.getVisibility() == 0) {
                        iDp += AndroidUtilities.dp(230.0f);
                    }
                    ev0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
                }
                break;
            case 15:
                ap0 ap0Var = (ap0) this.f40617b;
                FrameLayout frameLayout = ap0Var.C;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) ap0Var.C.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                break;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f40617b);
                break;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40617b;
                WindowInsets windowInsets = secretMediaViewer.f36126c0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i12 = AndroidUtilities.displaySize.y;
                        if (size6 > i12) {
                            size6 = i12;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = AndroidUtilities.displaySize.y;
                    if (size6 > i13) {
                        size6 = i13;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f36126c0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f36130e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                break;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                nc1 nc1Var = (nc1) this.f40617b;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) nc1Var).actionBar, i10, 0, i11, 0);
                int measuredHeight2 = ((org.telegram.ui.ActionBar.n2) nc1Var).actionBar.getMeasuredHeight();
                if (((org.telegram.ui.ActionBar.n2) nc1Var).actionBar.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) nc1Var.f40763j0.getLayoutParams()).topMargin = measuredHeight2;
                nc1Var.f40763j0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(nc1Var.f40767l0, i10, 0, i11, 0);
                break;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((zf1) this.f40617b).H.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40616a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                kt ktVar = (kt) this.f40617b;
                pg.c.c(ktVar.f39875s, ktVar.f39880y);
                ktVar.f39876t.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40616a) {
            case 19:
                return ((PopupNotificationActivity) this.f40617b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f40616a) {
            case 19:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z10);
                break;
            default:
                super.requestDisallowInterceptTouchEvent(z10);
                break;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f40616a) {
            case 20:
                super.setScaleX(f10);
                ProfileActivity.V0((ProfileActivity) this.f40617b);
                break;
            default:
                super.setScaleX(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f40616a) {
            case 4:
                super.setTranslationY(f10);
                ((qb) this.f40617b).X.invalidate();
                break;
            case 18:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f40617b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.F1();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f40616a) {
            case 3:
                l6 l6Var = (l6) this.f40617b;
                return drawable == l6Var.f39955c || drawable == l6Var.f39954b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n0(Object obj, Context context, int i10) {
        super(context);
        this.f40616a = i10;
        this.f40617b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
