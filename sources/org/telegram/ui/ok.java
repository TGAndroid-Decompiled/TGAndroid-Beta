package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
public final class ok extends org.telegram.ui.ActionBar.j5 {
    public final int N0;
    public final Object O0;

    public ok(int i7, Context context, Object obj) {
        super(context);
        this.N0 = i7;
        this.O0 = obj;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.j5 j5Var;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get()) != null) {
                    j5Var.k(charSequence);
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
                ((hm0) this.O0).f47738s.a();
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
                ((hm0) this.O0).f47738s.b();
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
                    ((ProfileActivity) this.O0).s5();
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
                    if (profileActivity.h != null || profileActivity.f43154n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.f43154n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.f43154n);
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
                profileActivity.H5 = i7;
                super.setTextColor(i0.a.f(profileActivity.E5, i7, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, profileActivity.A0)));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        switch (this.N0) {
            case 0:
                super.setTranslationY(f10);
                an anVar = (an) this.O0;
                if (this == anVar.S2[0] && anVar.W2[1] != null) {
                    if (anVar.f45137b5 && f10 < 0.0f) {
                        anVar.O2.setTranslationY(f10 / 2.0f);
                        return;
                    } else {
                        anVar.O2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get()) != null) {
                    j5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public ok(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = 1;
        this.O0 = atomicReference;
    }
}
