package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
public final class qk extends org.telegram.ui.ActionBar.l5 {
    public final int M0;
    public final Object N0;

    public qk(int i7, Context context, Object obj) {
        super(context);
        this.M0 = i7;
        this.N0 = obj;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.l5 l5Var;
        switch (this.M0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get()) != null) {
                    l5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.M0) {
            case 2:
                super.onAttachedToWindow();
                ((hm0) this.N0).f46348s.a();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.M0) {
            case 2:
                super.onDetachedFromWindow();
                ((hm0) this.N0).f46348s.b();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.M0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.N0).t5();
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
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.f41790n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.f41790n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.f41790n);
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
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                profileActivity.F5 = i7;
                super.setTextColor(i0.a.f(profileActivity.C5, i7, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, profileActivity.f41876z0)));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.l5 l5Var;
        switch (this.M0) {
            case 0:
                super.setTranslationY(f10);
                cn cnVar = (cn) this.N0;
                if (this == cnVar.R2[0] && cnVar.V2[1] != null) {
                    if (cnVar.f44382a5 && f10 < 0.0f) {
                        cnVar.N2.setTranslationY(f10 / 2.0f);
                        return;
                    } else {
                        cnVar.N2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get()) != null) {
                    l5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public qk(Context context, AtomicReference atomicReference) {
        super(context);
        this.M0 = 1;
        this.N0 = atomicReference;
    }
}
