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
    public final int f22823a;
    public final org.telegram.ui.ActionBar.h5 f22824b;
    public final org.telegram.ui.ActionBar.h5 f22825c;
    public final ImageView d;
    public long f22826e;
    public final RectF f22827f;
    public final boolean h;
    public final boolean f22828n;
    public final org.telegram.ui.ActionBar.c6 f22829r;
    public boolean f22830s;
    public final ai.r4 v;
    public final org.telegram.ui.Components.g6 f22831w;
    public final org.telegram.ui.Components.g6 f22832x;
    public final org.telegram.ui.Components.g6 f22833y;

    public t6(android.content.Context r22, org.telegram.ui.ActionBar.c6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t6.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        long j3;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.f22823a).getSharingLocationInfo(this.f22826e);
        if (sharingLocationInfo != null) {
            if (this.f22828n) {
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
        this.f22825c.l(str, false);
        this.f22824b.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22827f != null) {
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
        boolean z10 = this.f22830s;
        org.telegram.ui.ActionBar.c6 c6Var = this.f22829r;
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
        if (!this.f22828n) {
            int i12 = this.f22823a;
            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i12).getSharingLocationInfo(this.f22826e);
            org.telegram.ui.Components.g6 g6Var = this.f22831w;
            float f11 = g6Var.f26301c;
            int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            org.telegram.ui.Components.g6 g6Var2 = this.f22832x;
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
                this.f22827f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            } else {
                this.f22827f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            }
            canvas2.save();
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f12);
            canvas2.scale(lerp, lerp, this.f22827f.centerX(), this.f22827f.centerY());
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.si, c6Var);
            org.telegram.ui.ActionBar.h6.f20703l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.h6.f20703l2.getAlpha();
            float f14 = alpha;
            org.telegram.ui.ActionBar.h6.f20703l2.setAlpha((int) (0.2f * f14 * f12));
            canvas2.drawArc(this.f22827f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.h6.f20703l2);
            org.telegram.ui.ActionBar.h6.f20703l2.setAlpha((int) (f14 * f12));
            canvas.drawArc(this.f22827f, -90.0f, g6Var.d(f13, false) * (-360.0f), false, org.telegram.ui.ActionBar.h6.f20703l2);
            org.telegram.ui.ActionBar.h6.f20703l2.setAlpha(alpha);
            org.telegram.ui.Components.q6 q6Var = this.E;
            if (sharingLocationInfo != null) {
                q6Var.t(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
            }
            int length = q6Var.f29696i.length();
            if (length > 4) {
                f7 = 0.75f;
            } else if (length > 3) {
                f7 = 0.85f;
            } else {
                f7 = 1.0f;
            }
            float d10 = this.f22833y.d(f7, false);
            canvas.scale(d10, d10, this.f22827f.centerX(), this.f22827f.centerY());
            q6Var.u(w02);
            q6Var.B = (int) (f12 * 255.0f);
            RectF rectF = this.f22827f;
            RectF rectF2 = this.f22827f;
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
        this.f22826e = j3;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f7;
        float f10;
        if (LocationController.getInstance(this.f22823a).getSharingLocationInfo(this.f22826e) == null) {
            float f11 = 0.5f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            this.f22825c.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f22824b.setAlpha(f10);
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
