package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class ww0 extends FrameLayout {

    public int f34350a;

    public final RectF f34351b;

    public boolean f34352c;
    public Boolean d;

    public final ex0 f34353e;

    public ww0(ex0 ex0Var, Context context) {
        super(context);
        this.f34353e = ex0Var;
        this.f34351b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fMin;
        int iMin;
        RectF rectF;
        boolean z10;
        Boolean bool;
        boolean z11;
        boolean z12;
        ex0 ex0Var = this.f34353e;
        int iDp = AndroidUtilities.dp(6.0f) + (ex0Var.f28170a0 - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop);
        int iDp2 = (ex0Var.f28170a0 - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
        int i10 = AndroidUtilities.statusBarHeight;
        int i11 = iDp2 + i10;
        int i12 = iDp + i10;
        if (this.f34352c) {
            int i13 = ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + i11;
            int i14 = AndroidUtilities.statusBarHeight;
            int i15 = i14 * 2;
            if (i13 < i15) {
                int iMin2 = Math.min(i14, (i15 - i11) - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop);
                i11 -= iMin2;
                fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
            } else {
                fMin = 1.0f;
            }
            int i16 = ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + i11;
            int i17 = AndroidUtilities.statusBarHeight;
            iMin = i16 < i17 ? Math.min(i17, (i17 - i11) - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop) : 0;
            ((org.telegram.ui.ActionBar.e3) ex0Var).shadowDrawable.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
            ((org.telegram.ui.ActionBar.e3) ex0Var).shadowDrawable.draw(canvas);
            rectF = this.f34351b;
            if (fMin != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                rectF.set(((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + i11, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + i11);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
            }
            int iDp3 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - iDp3) / 2, i12, (getMeasuredWidth() + iDp3) / 2, AndroidUtilities.dp(4.0f) + i12);
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            Paint paint = org.telegram.ui.ActionBar.g6.f23333t0;
            paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
            if (iMin > AndroidUtilities.statusBarHeight / 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = this.d;
            if (bool != null || bool.booleanValue() != z10) {
                if (AndroidUtilities.computePerceivedBrightness(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(ex0Var.getWindow(), z11);
            }
            if (iMin > 0) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                canvas.drawRect(((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
            }
        }
        fMin = 1.0f;
        ((org.telegram.ui.ActionBar.e3) ex0Var).shadowDrawable.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        ((org.telegram.ui.ActionBar.e3) ex0Var).shadowDrawable.draw(canvas);
        rectF = this.f34351b;
        if (fMin != 1.0f) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            rectF.set(((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + i11, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + i11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
        }
        int iDp4 = AndroidUtilities.dp(36.0f);
        rectF.set((getMeasuredWidth() - iDp4) / 2, i12, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i12);
        org.telegram.ui.ActionBar.g6.f23333t0.setColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
        Paint paint2 = org.telegram.ui.ActionBar.g6.f23333t0;
        paint2.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint2.getAlpha()));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
        if (iMin > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        bool = this.d;
        if (bool != null) {
            if (AndroidUtilities.computePerceivedBrightness(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f) {
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(ex0Var.getWindow(), z11);
        } else {
            if (AndroidUtilities.computePerceivedBrightness(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f) {
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(ex0Var.getWindow(), z11);
        }
        if (iMin > 0) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            canvas.drawRect(((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ex0 ex0Var = this.f34353e;
            if (ex0Var.f28170a0 != 0 && motionEvent.getY() < ex0Var.f28170a0) {
                ex0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f34350a;
        int i15 = i12 - i10;
        ex0 ex0Var = this.f34353e;
        if (i14 != i15) {
            this.f34350a = i15;
            ax0 ax0Var = ex0Var.d;
            if (ax0Var != null && ex0Var.S != null) {
                ax0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        ex0.O(ex0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMax;
        int size;
        int iMax2;
        int size2 = View.MeasureSpec.getSize(i11);
        ex0 ex0Var = this.f34353e;
        ArrayList arrayList = ex0Var.T;
        ex0Var.f28174c0 = true;
        setPadding(((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingLeft, 0);
        ex0Var.f28174c0 = false;
        if (ex0Var.s0()) {
            int measuredWidth = ex0Var.f28173c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            ex0Var.d.d = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
            int size3 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / ex0Var.d.d;
            ex0Var.K = size3;
            ex0Var.L = size3;
        } else {
            ex0Var.d.d = 5;
            ex0Var.K = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / ex0Var.d.d;
            ex0Var.L = AndroidUtilities.dp(82.0f);
        }
        float f10 = ex0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ex0Var.f28173c.getLayoutParams();
        if (arrayList != null) {
            iMax2 = ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * ex0Var.L) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.statusBarHeight;
        } else {
            if (ex0Var.S != null) {
                size = ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + (ex0Var.d.f26837n * ex0Var.L) + (ex0Var.S.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                iMax = AndroidUtilities.dp(24.0f);
            } else {
                int iDp = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                int i12 = ex0Var.s0() ? 2 : 3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
                iMax = ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop + (Math.max(i12, tL_messages_stickerSet != null ? (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10) : 0) * ex0Var.L) + iDp;
                size = AndroidUtilities.statusBarHeight;
            }
            iMax2 = size + iMax;
        }
        if (ex0Var.s0()) {
            iMax2 = (int) ((ex0Var.L * 0.15f) + iMax2);
        }
        float f11 = size2 / 5.0f;
        int iDp2 = ((double) iMax2) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (iDp2 != 0 && iMax2 < size2) {
            iDp2 -= size2 - iMax2;
        }
        if (iDp2 == 0) {
            iDp2 = ((org.telegram.ui.ActionBar.e3) ex0Var).backgroundPaddingTop;
        }
        if (ex0Var.S != null) {
            iDp2 += AndroidUtilities.dp(8.0f);
        }
        if (ex0Var.f28173c.getPaddingTop() != iDp2) {
            ex0Var.f28174c0 = true;
            ex0Var.f28173c.setPadding(AndroidUtilities.dp(10.0f), iDp2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            ex0Var.G.setPadding(0, iDp2, 0, 0);
            ex0Var.f28174c0 = false;
        }
        this.f34352c = iMax2 >= size2;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(iMax2, size2), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f34353e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f34353e.f28174c0) {
            return;
        }
        super.requestLayout();
    }
}
