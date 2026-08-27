package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

public final class bl extends org.telegram.ui.ActionBar.h5 {
    public final int I0;
    public final Object J0;

    public bl(Object obj, Context context, int i10) {
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
                ((zo0) this.J0).f45228s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.I0) {
            case 2:
                super.onDetachedFromWindow();
                ((zo0) this.J0).f45228s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
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
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.I0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.J0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.f36013n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.f36013n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.f36013n);
                        }
                        if (profileActivity.h != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb2);
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.I0) {
            case 0:
                super.setTranslationY(f10);
                rn rnVar = (rn) this.J0;
                if (this == rnVar.f42292z2[0] && rnVar.D2[1] != null) {
                    if (rnVar.K4 && f10 < 0.0f) {
                        rnVar.f42241v2.setTranslationY(f10 / 2.0f);
                    } else {
                        rnVar.f42241v2.setTranslationY(0.0f);
                    }
                    break;
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.J0;
                if (atomicReference != null && (h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get()) != null) {
                    h5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    public bl(Context context, AtomicReference atomicReference) {
        super(context);
        this.I0 = 1;
        this.J0 = atomicReference;
    }
}
