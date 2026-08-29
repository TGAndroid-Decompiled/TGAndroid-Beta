package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
public final class cl extends org.telegram.ui.ActionBar.h5 {
    public final int I0;
    public final Object J0;

    public cl(Object obj, Context context, int i10) {
        super(context);
        this.I0 = i10;
        this.J0 = obj;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.I0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.J0;
                if (atomicReference != null && (h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get()) != null) {
                    h5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.I0) {
            case 2:
                super.onAttachedToWindow();
                ((xo0) this.J0).f44633s.a();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.I0) {
            case 2:
                super.onDetachedFromWindow();
                ((xo0) this.J0).f44633s.b();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.I0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.J0).V4();
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
        switch (this.I0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.J0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.f36075n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.f36075n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.f36075n);
                        }
                        if (profileActivity.h != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb2);
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
    public void setTranslationY(float f9) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.I0) {
            case 0:
                super.setTranslationY(f9);
                tn tnVar = (tn) this.J0;
                if (this == tnVar.f43052z2[0] && tnVar.D2[1] != null) {
                    if (tnVar.K4 && f9 < 0.0f) {
                        tnVar.f43001v2.setTranslationY(f9 / 2.0f);
                        return;
                    } else {
                        tnVar.f43001v2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.J0;
                if (atomicReference != null && (h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get()) != null) {
                    h5Var.setTranslationY(f9);
                }
                super.setTranslationY(f9);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public cl(Context context, AtomicReference atomicReference) {
        super(context);
        this.I0 = 1;
        this.J0 = atomicReference;
    }
}
