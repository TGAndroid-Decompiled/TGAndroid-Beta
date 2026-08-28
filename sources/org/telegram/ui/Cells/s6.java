package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s6 extends FrameLayout {
    public final org.telegram.ui.Components.i6 A;
    public final int f25269a;
    public final org.telegram.ui.ActionBar.h5 f25270b;
    public final org.telegram.ui.ActionBar.h5 f25271c;
    public final ImageView d;
    public long f25272e;
    public final RectF f25273f;
    public final boolean h;
    public final boolean f25274n;
    public final org.telegram.ui.ActionBar.b6 f25275r;
    public boolean f25276s;
    public final m.i3 v;
    public final org.telegram.ui.Components.y5 f25277w;
    public final org.telegram.ui.Components.y5 f25278x;
    public final org.telegram.ui.Components.y5 f25279y;

    public s6(android.content.Context r22, org.telegram.ui.ActionBar.b6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s6.<init>(android.content.Context, org.telegram.ui.ActionBar.b6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        long j10;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.f25269a).getSharingLocationInfo(this.f25272e);
        if (sharingLocationInfo != null) {
            if (this.f25274n) {
                String string = LocaleController.getString(R.string.StopLiveLocation);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                int i9 = message.edit_date;
                if (i9 != 0) {
                    j10 = i9;
                } else {
                    j10 = message.date;
                }
                b(string, LocaleController.formatLocationUpdateDate(j10));
                return;
            }
            b(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        b(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
    }

    public final void b(String str, String str2) {
        this.f25271c.l(str, false);
        this.f25270b.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25273f != null) {
            m.i3 i3Var = this.v;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d;
        float f10;
        int i9;
        Paint T0;
        float dp;
        int i10;
        boolean z10 = this.f25276s;
        org.telegram.ui.ActionBar.b6 b6Var = this.f25275r;
        if (z10 && (T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var)) != null) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(73.0f);
            } else {
                i10 = 0;
            }
            float f11 = dp;
            canvas2 = canvas;
            canvas2.drawRect(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight(), T0);
        } else {
            canvas2 = canvas;
        }
        if (!this.f25274n) {
            int i11 = this.f25269a;
            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i11).getSharingLocationInfo(this.f25272e);
            org.telegram.ui.Components.y5 y5Var = this.f25277w;
            float f12 = y5Var.f34854c;
            int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
            org.telegram.ui.Components.y5 y5Var2 = this.f25278x;
            if (sharingLocationInfo != null && (i9 = sharingLocationInfo.stopTime) >= currentTime && sharingLocationInfo.period != Integer.MAX_VALUE) {
                f12 = Math.abs(i9 - currentTime) / sharingLocationInfo.period;
                d = y5Var2.e(true);
            } else {
                y5Var2.getClass();
                d = y5Var2.d(0.0f, false);
            }
            float f13 = d;
            float f14 = f12;
            if (f13 <= 0.0f) {
                return;
            }
            if (LocaleController.isRTL) {
                this.f25273f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            } else {
                this.f25273f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            }
            canvas2.save();
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f13);
            canvas2.scale(lerp, lerp, this.f25273f.centerX(), this.f25273f.centerY());
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.si, b6Var);
            org.telegram.ui.ActionBar.f6.f23140l2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.f6.f23140l2.getAlpha();
            float f15 = alpha;
            org.telegram.ui.ActionBar.f6.f23140l2.setAlpha((int) (0.2f * f15 * f13));
            canvas2.drawArc(this.f25273f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.f6.f23140l2);
            org.telegram.ui.ActionBar.f6.f23140l2.setAlpha((int) (f15 * f13));
            canvas.drawArc(this.f25273f, -90.0f, y5Var.d(f14, false) * (-360.0f), false, org.telegram.ui.ActionBar.f6.f23140l2);
            org.telegram.ui.ActionBar.f6.f23140l2.setAlpha(alpha);
            org.telegram.ui.Components.i6 i6Var = this.A;
            if (sharingLocationInfo != null) {
                i6Var.q(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
            }
            int length = i6Var.f29337g.length();
            if (length > 4) {
                f10 = 0.75f;
            } else if (length > 3) {
                f10 = 0.85f;
            } else {
                f10 = 1.0f;
            }
            float d9 = this.f25279y.d(f10, false);
            canvas.scale(d9, d9, this.f25273f.centerX(), this.f25273f.centerY());
            i6Var.r(v02);
            i6Var.f29351w = (int) (f13 * 255.0f);
            RectF rectF = this.f25273f;
            RectF rectF2 = this.f25273f;
            i6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - AndroidUtilities.dp(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.f25272e = j10;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f10;
        float f11;
        if (LocationController.getInstance(this.f25269a).getSharingLocationInfo(this.f25272e) == null) {
            float f12 = 0.5f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f25271c.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.f25270b.setAlpha(f11);
            if (z10) {
                f12 = 1.0f;
            }
            this.d.setAlpha(f12);
        }
        if (this.h) {
            a();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.A && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
