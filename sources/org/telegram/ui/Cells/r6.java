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
public final class r6 extends FrameLayout {
    public final org.telegram.ui.Components.j6 B;
    public final int f21866a;
    public final org.telegram.ui.ActionBar.k5 f21867b;
    public final org.telegram.ui.ActionBar.k5 f21868c;
    public final ImageView d;
    public long e;
    public final RectF f21869f;
    public final boolean h;
    public final boolean f21870n;
    public final org.telegram.ui.ActionBar.f6 f21871r;
    public boolean f21872s;
    public final m2.b v;
    public final org.telegram.ui.Components.z5 f21873w;
    public final org.telegram.ui.Components.z5 f21874x;
    public final org.telegram.ui.Components.z5 f21875y;

    public r6(android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r6.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        long j10;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.f21866a).getSharingLocationInfo(this.e);
        if (sharingLocationInfo != null) {
            if (this.f21870n) {
                String string = LocaleController.getString(R.string.StopLiveLocation);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                int i10 = message.edit_date;
                if (i10 != 0) {
                    j10 = i10;
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
        this.f21868c.l(str, false);
        this.f21867b.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21869f != null) {
            m2.b bVar = this.v;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 1000L);
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
        int i10;
        Paint T0;
        float dp;
        int i11;
        boolean z4 = this.f21872s;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21871r;
        if (z4 && (T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var)) != null) {
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
            float f11 = dp;
            canvas2 = canvas;
            canvas2.drawRect(f11, measuredHeight, measuredWidth - i11, getMeasuredHeight(), T0);
        } else {
            canvas2 = canvas;
        }
        if (!this.f21870n) {
            int i12 = this.f21866a;
            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i12).getSharingLocationInfo(this.e);
            org.telegram.ui.Components.z5 z5Var = this.f21873w;
            float f12 = z5Var.f31253c;
            int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            org.telegram.ui.Components.z5 z5Var2 = this.f21874x;
            if (sharingLocationInfo != null && (i10 = sharingLocationInfo.stopTime) >= currentTime && sharingLocationInfo.period != Integer.MAX_VALUE) {
                f12 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
                d = z5Var2.e(true);
            } else {
                z5Var2.getClass();
                d = z5Var2.d(0.0f, false);
            }
            float f13 = d;
            float f14 = f12;
            if (f13 <= 0.0f) {
                return;
            }
            if (LocaleController.isRTL) {
                this.f21869f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            } else {
                this.f21869f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            }
            canvas2.save();
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f13);
            canvas2.scale(lerp, lerp, this.f21869f.centerX(), this.f21869f.centerY());
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.si, f6Var);
            org.telegram.ui.ActionBar.j6.f20020l2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.j6.f20020l2.getAlpha();
            float f15 = alpha;
            org.telegram.ui.ActionBar.j6.f20020l2.setAlpha((int) (0.2f * f15 * f13));
            canvas2.drawArc(this.f21869f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.f20020l2);
            org.telegram.ui.ActionBar.j6.f20020l2.setAlpha((int) (f15 * f13));
            canvas.drawArc(this.f21869f, -90.0f, z5Var.d(f14, false) * (-360.0f), false, org.telegram.ui.ActionBar.j6.f20020l2);
            org.telegram.ui.ActionBar.j6.f20020l2.setAlpha(alpha);
            org.telegram.ui.Components.j6 j6Var = this.B;
            if (sharingLocationInfo != null) {
                j6Var.q(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
            }
            int length = j6Var.f25850g.length();
            if (length > 4) {
                f10 = 0.75f;
            } else if (length > 3) {
                f10 = 0.85f;
            } else {
                f10 = 1.0f;
            }
            float d10 = this.f21875y.d(f10, false);
            canvas.scale(d10, d10, this.f21869f.centerX(), this.f21869f.centerY());
            j6Var.r(v02);
            j6Var.f25864w = (int) (f13 * 255.0f);
            RectF rectF = this.f21869f;
            RectF rectF2 = this.f21869f;
            j6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - AndroidUtilities.dp(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
            j6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.e = j10;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z4) {
        float f10;
        float f11;
        if (LocationController.getInstance(this.f21866a).getSharingLocationInfo(this.e) == null) {
            float f12 = 0.5f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f21868c.setAlpha(f10);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.f21867b.setAlpha(f11);
            if (z4) {
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
        if (drawable != this.B && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
