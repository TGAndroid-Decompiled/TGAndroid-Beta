package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class my0 extends FrameLayout {
    public int f27238a;
    public final RectF f27239b;
    public boolean f27240c;
    public Boolean d;
    public final uy0 e;

    public my0(uy0 uy0Var, Context context) {
        super(context);
        this.e = uy0Var;
        this.f27239b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        float f7;
        Drawable drawable;
        Drawable drawable2;
        Paint paint;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int min;
        uy0 uy0Var = this.e;
        int i23 = uy0Var.f29494e0;
        i10 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i23 - i10);
        int i24 = uy0Var.f29494e0;
        i11 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
        int dp2 = (i24 - i11) - AndroidUtilities.dp(13.0f);
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp2 + i25;
        int i27 = dp + i25;
        boolean z12 = false;
        if (this.f27240c) {
            i19 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
            int i28 = i19 + i26;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i22 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
                i26 -= Math.min(i29, (i30 - i26) - i22);
                f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f7 = 1.0f;
            }
            i20 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
            int i31 = i20 + i26;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i21 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
                i12 = Math.min(i32, (i32 - i26) - i21);
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
            f7 = 1.0f;
        }
        drawable = ((org.telegram.ui.ActionBar.e3) uy0Var).shadowDrawable;
        drawable.setBounds(0, i26, getMeasuredWidth(), getMeasuredHeight());
        drawable2 = ((org.telegram.ui.ActionBar.e3) uy0Var).shadowDrawable;
        drawable2.draw(canvas);
        int i33 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        RectF rectF = this.f27239b;
        if (i33 != 0) {
            org.telegram.ui.ActionBar.g6.f19891t0.setColor(uy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
            i15 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
            rectF.set(i15, i16 + i26, measuredWidth - i17, AndroidUtilities.dp(24.0f) + i18 + i26);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.g6.f19891t0);
        }
        int dp3 = AndroidUtilities.dp(36.0f);
        rectF.set((getMeasuredWidth() - dp3) / 2, i27, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + i27);
        org.telegram.ui.ActionBar.g6.f19891t0.setColor(uy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
        org.telegram.ui.ActionBar.g6.f19891t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i27 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f19891t0);
        if (i12 > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (AndroidUtilities.computePerceivedBrightness(uy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(uy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19880s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(uy0Var.getWindow(), z11);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.g6.f19891t0.setColor(uy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
            i13 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingLeft;
            float f10 = i13;
            float f11 = AndroidUtilities.statusBarHeight - i12;
            int measuredWidth2 = getMeasuredWidth();
            i14 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingLeft;
            canvas.drawRect(f10, f11, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f19891t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            uy0 uy0Var = this.e;
            if (uy0Var.f29494e0 != 0 && motionEvent.getY() < uy0Var.f29494e0) {
                uy0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f27238a;
        int i15 = i12 - i10;
        uy0 uy0Var = this.e;
        if (i14 != i15) {
            this.f27238a = i15;
            qy0 qy0Var = uy0Var.d;
            if (qy0Var != null && uy0Var.W != null) {
                qy0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        uy0.P(uy0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f7;
        int size = View.MeasureSpec.getSize(i11);
        uy0 uy0Var = this.e;
        ArrayList arrayList = uy0Var.X;
        boolean z10 = true;
        uy0Var.f29497g0 = true;
        i12 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingLeft;
        int i22 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingLeft;
        setPadding(i12, i22, i13, 0);
        uy0Var.f29497g0 = false;
        if (uy0Var.t0()) {
            int measuredWidth = uy0Var.f29491c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            qy0 qy0Var = uy0Var.d;
            if (AndroidUtilities.isTablet()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            qy0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / uy0Var.d.d;
            uy0Var.O = size2;
            uy0Var.P = size2;
        } else {
            uy0Var.d.d = 5;
            uy0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / uy0Var.d.d;
            uy0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f10 = uy0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uy0Var.f29491c.getLayoutParams();
        int i23 = 3;
        if (arrayList != null) {
            int max = Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * uy0Var.P;
            i21 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
            i18 = i21 + max + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (uy0Var.W != null) {
                int size3 = (uy0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i19 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
                i17 = i19 + (uy0Var.d.f28380n * uy0Var.P) + size3;
                i16 = AndroidUtilities.dp(24.0f);
            } else {
                int dp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                if (uy0Var.t0()) {
                    i23 = 2;
                }
                if (uy0Var.S != null) {
                    i14 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i14 = 0;
                }
                int max2 = (Math.max(i23, i14) * uy0Var.P) + dp;
                i15 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
                i16 = i15 + max2;
                i17 = AndroidUtilities.statusBarHeight;
            }
            i18 = i17 + i16;
        }
        if (uy0Var.t0()) {
            i18 = (int) ((uy0Var.P * 0.15f) + i18);
        }
        float f11 = size / 5.0f;
        if (i18 < f11 * 3.2d) {
            i20 = 0;
        } else {
            i20 = (int) (f11 * 2.0f);
        }
        if (i20 != 0 && i18 < size) {
            i20 -= size - i18;
        }
        if (i20 == 0) {
            i20 = ((org.telegram.ui.ActionBar.e3) uy0Var).backgroundPaddingTop;
        }
        if (uy0Var.W != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (uy0Var.f29491c.getPaddingTop() != i20) {
            uy0Var.f29497g0 = true;
            uy0Var.f29491c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            uy0Var.K.setPadding(0, i20, 0, 0);
            uy0Var.f29497g0 = false;
        }
        if (i18 < size) {
            z10 = false;
        }
        this.f27240c = z10;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i18, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.e.f29497g0) {
            return;
        }
        super.requestLayout();
    }
}
