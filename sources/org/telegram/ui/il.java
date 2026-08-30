package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
public final class il extends org.telegram.ui.ActionBar.k5 {
    public final int J0;
    public final Object K0;

    public il(Object obj, Context context, int i10) {
        super(context);
        this.J0 = i10;
        this.K0 = obj;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k5 k5Var;
        switch (this.J0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.K0;
                if (atomicReference != null && (k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get()) != null) {
                    k5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.J0) {
            case 2:
                super.onAttachedToWindow();
                ((fp0) this.K0).f34307s.a();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.J0) {
            case 2:
                super.onDetachedFromWindow();
                ((fp0) this.K0).f34307s.b();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.J0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.K0).V4();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.J0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.K0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.f32118n != null) {
                        StringBuilder sb = new StringBuilder(getText());
                        if (profileActivity.f32118n != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.f32118n);
                        }
                        if (profileActivity.h != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.k5 k5Var;
        switch (this.J0) {
            case 0:
                super.setTranslationY(f10);
                xn xnVar = (xn) this.K0;
                if (this == xnVar.A2[0] && xnVar.E2[1] != null) {
                    if (xnVar.L4 && f10 < 0.0f) {
                        xnVar.f40222w2.setTranslationY(f10 / 2.0f);
                        return;
                    } else {
                        xnVar.f40222w2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.K0;
                if (atomicReference != null && (k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get()) != null) {
                    k5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public il(Context context, AtomicReference atomicReference) {
        super(context);
        this.J0 = 1;
        this.K0 = atomicReference;
    }
}
