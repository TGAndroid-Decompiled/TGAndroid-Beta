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
public final class t6 extends FrameLayout {
    public final org.telegram.ui.Components.q6 E;
    public final int f22822a;
    public final org.telegram.ui.ActionBar.h5 f22823b;
    public final org.telegram.ui.ActionBar.h5 f22824c;
    public final ImageView d;
    public long f22825e;
    public final RectF f22826f;
    public final boolean h;
    public final boolean f22827n;
    public final org.telegram.ui.ActionBar.c6 f22828r;
    public boolean f22829s;
    public final ai.r4 v;
    public final org.telegram.ui.Components.g6 f22830w;
    public final org.telegram.ui.Components.g6 f22831x;
    public final org.telegram.ui.Components.g6 f22832y;

    public t6(android.content.Context r22, org.telegram.ui.ActionBar.c6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t6.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        long j3;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.f22822a).getSharingLocationInfo(this.f22825e);
        if (sharingLocationInfo != null) {
            if (this.f22827n) {
                String string = LocaleController.getString(R.string.StopLiveLocation);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                int i10 = message.edit_date;
                if (i10 != 0) {
                    j3 = i10;
                } else {
                    j3 = message.date;
                }
                b(string, LocaleController.formatLocationUpdateDate(j3));
                return;
            }
            b(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        b(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
    }

    public final void b(String str, String str2) {
        this.f22824c.l(str, false);
        this.f22823b.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22826f != null) {
            ai.r4 r4Var = this.v;
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            AndroidUtilities.runOnUIThread(r4Var, 1000L);
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
        float f7;
        int i10;
        Paint U0;
        float dp;
        int i11;
        boolean z10 = this.f22829s;
        org.telegram.ui.ActionBar.c6 c6Var = this.f22828r;
        if (z10 && (U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", c6Var)) != null) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(73.0f);
            } else {
                i11 = 0;
            }
            float f10 = dp;
            canvas2 = canvas;
            canvas2.drawRect(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight(), U0);
        } else {
            canvas2 = canvas;
        }
        if (!this.f22827n) {
            int i12 = this.f22822a;
            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i12).getSharingLocationInfo(this.f22825e);
            org.telegram.ui.Components.g6 g6Var = this.f22830w;
            float f11 = g6Var.f26303c;
            int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            org.telegram.ui.Components.g6 g6Var2 = this.f22831x;
            if (sharingLocationInfo != null && (i10 = sharingLocationInfo.stopTime) >= currentTime && sharingLocationInfo.period != Integer.MAX_VALUE) {
                f11 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
                d = g6Var2.e(true);
            } else {
                g6Var2.getClass();
                d = g6Var2.d(0.0f, false);
            }
            float f12 = d;
            float f13 = f11;
            if (f12 <= 0.0f) {
                return;
            }
            if (LocaleController.isRTL) {
                this.f22826f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            } else {
                this.f22826f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            }
            canvas2.save();
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f12);
            canvas2.scale(lerp, lerp, this.f22826f.centerX(), this.f22826f.centerY());
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.si, c6Var);
            org.telegram.ui.ActionBar.h6.f20702l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.h6.f20702l2.getAlpha();
            float f14 = alpha;
            org.telegram.ui.ActionBar.h6.f20702l2.setAlpha((int) (0.2f * f14 * f12));
            canvas2.drawArc(this.f22826f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.h6.f20702l2);
            org.telegram.ui.ActionBar.h6.f20702l2.setAlpha((int) (f14 * f12));
            canvas.drawArc(this.f22826f, -90.0f, g6Var.d(f13, false) * (-360.0f), false, org.telegram.ui.ActionBar.h6.f20702l2);
            org.telegram.ui.ActionBar.h6.f20702l2.setAlpha(alpha);
            org.telegram.ui.Components.q6 q6Var = this.E;
            if (sharingLocationInfo != null) {
                q6Var.t(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
            }
            int length = q6Var.f29718i.length();
            if (length > 4) {
                f7 = 0.75f;
            } else if (length > 3) {
                f7 = 0.85f;
            } else {
                f7 = 1.0f;
            }
            float d10 = this.f22832y.d(f7, false);
            canvas.scale(d10, d10, this.f22826f.centerX(), this.f22826f.centerY());
            q6Var.u(w02);
            q6Var.B = (int) (f12 * 255.0f);
            RectF rectF = this.f22826f;
            RectF rectF2 = this.f22826f;
            q6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - AndroidUtilities.dp(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
            q6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j3) {
        this.f22825e = j3;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f7;
        float f10;
        if (LocationController.getInstance(this.f22822a).getSharingLocationInfo(this.f22825e) == null) {
            float f11 = 0.5f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            this.f22824c.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f22823b.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            }
            this.d.setAlpha(f11);
        }
        if (this.h) {
            a();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
