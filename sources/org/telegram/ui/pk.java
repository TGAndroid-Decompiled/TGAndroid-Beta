package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
public final class pk extends org.telegram.ui.ActionBar.n5 {
    public final int N0;
    public final Object O0;

    public pk(int i7, Context context, Object obj) {
        super(context);
        this.N0 = i7;
        this.O0 = obj;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n5 n5Var;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get()) != null) {
                    n5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.N0) {
            case 2:
                super.onAttachedToWindow();
                ((jm0) this.O0).f48987s.a();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.N0) {
            case 2:
                super.onDetachedFromWindow();
                ((jm0) this.O0).f48987s.b();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.N0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.O0).t5();
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
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.f43600n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.f43600n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.f43600n);
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
    public void setTextColor(int i7) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                profileActivity.J5 = i7;
                super.setTextColor(i0.a.f(profileActivity.G5, i7, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, profileActivity.A0)));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.n5 n5Var;
        switch (this.N0) {
            case 0:
                super.setTranslationY(f10);
                bn bnVar = (bn) this.O0;
                if (this == bnVar.S2[0] && bnVar.W2[1] != null) {
                    if (bnVar.f45957c5 && f10 < 0.0f) {
                        bnVar.O2.setTranslationY(f10 / 2.0f);
                        return;
                    } else {
                        bnVar.O2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get()) != null) {
                    n5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public pk(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = 1;
        this.O0 = atomicReference;
    }
}
