package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
public final class kl extends org.telegram.ui.ActionBar.u5 {
    public final int M0;
    public final Object N0;

    public kl(Object obj, Context context, int i10) {
        super(context);
        this.M0 = i10;
        this.N0 = obj;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u5 u5Var;
        switch (this.M0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get()) != null) {
                    u5Var.k(charSequence);
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
                ((rn0) this.N0).f41255s.a();
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
                ((rn0) this.N0).f41255s.b();
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
                    ((ProfileActivity) this.N0).p5();
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
                    if (profileActivity.h != null || profileActivity.f33863n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.f33863n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.f33863n);
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
    public void setTextColor(int i10) {
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                profileActivity.D5 = i10;
                super.setTextColor(i0.b.f(profileActivity.A5, i10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, profileActivity.f33950z0)));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        org.telegram.ui.ActionBar.u5 u5Var;
        switch (this.M0) {
            case 0:
                super.setTranslationY(f7);
                un unVar = (un) this.N0;
                if (this == unVar.R2[0] && unVar.V2[1] != null) {
                    if (unVar.f42183a5 && f7 < 0.0f) {
                        unVar.N2.setTranslationY(f7 / 2.0f);
                        return;
                    } else {
                        unVar.N2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get()) != null) {
                    u5Var.setTranslationY(f7);
                }
                super.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public kl(Context context, AtomicReference atomicReference) {
        super(context);
        this.M0 = 1;
        this.N0 = atomicReference;
    }
}
