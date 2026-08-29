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
public final class q6 extends FrameLayout {
    public final org.telegram.ui.Components.n6 A;
    public final int f25061a;
    public final org.telegram.ui.ActionBar.h5 f25062b;
    public final org.telegram.ui.ActionBar.h5 f25063c;
    public final ImageView d;
    public long f25064e;
    public final RectF f25065f;
    public final boolean h;
    public final boolean f25066n;
    public final org.telegram.ui.ActionBar.c6 f25067r;
    public boolean f25068s;
    public final lh.m7 v;
    public final org.telegram.ui.Components.d6 f25069w;
    public final org.telegram.ui.Components.d6 f25070x;
    public final org.telegram.ui.Components.d6 f25071y;

    public q6(android.content.Context r22, org.telegram.ui.ActionBar.c6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q6.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        long j10;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.f25061a).getSharingLocationInfo(this.f25064e);
        if (sharingLocationInfo != null) {
            if (this.f25066n) {
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
        this.f25063c.l(str, false);
        this.f25062b.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25065f != null) {
            lh.m7 m7Var = this.v;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 1000L);
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
        float f9;
        int i10;
        Paint T0;
        float dp;
        int i11;
        boolean z10 = this.f25068s;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25067r;
        if (z10 && (T0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var)) != null) {
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
            canvas2.drawRect(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight(), T0);
        } else {
            canvas2 = canvas;
        }
        if (!this.f25066n) {
            int i12 = this.f25061a;
            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i12).getSharingLocationInfo(this.f25064e);
            org.telegram.ui.Components.d6 d6Var = this.f25069w;
            float f11 = d6Var.f27666c;
            int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            org.telegram.ui.Components.d6 d6Var2 = this.f25070x;
            if (sharingLocationInfo != null && (i10 = sharingLocationInfo.stopTime) >= currentTime && sharingLocationInfo.period != Integer.MAX_VALUE) {
                f11 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
                d = d6Var2.e(true);
            } else {
                d6Var2.getClass();
                d = d6Var2.d(0.0f, false);
            }
            float f12 = d;
            float f13 = f11;
            if (f12 <= 0.0f) {
                return;
            }
            if (LocaleController.isRTL) {
                this.f25065f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            } else {
                this.f25065f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            }
            canvas2.save();
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f12);
            canvas2.scale(lerp, lerp, this.f25065f.centerX(), this.f25065f.centerY());
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.si, c6Var);
            org.telegram.ui.ActionBar.g6.f23202l2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.g6.f23202l2.getAlpha();
            float f14 = alpha;
            org.telegram.ui.ActionBar.g6.f23202l2.setAlpha((int) (0.2f * f14 * f12));
            canvas2.drawArc(this.f25065f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.g6.f23202l2);
            org.telegram.ui.ActionBar.g6.f23202l2.setAlpha((int) (f14 * f12));
            canvas.drawArc(this.f25065f, -90.0f, d6Var.d(f13, false) * (-360.0f), false, org.telegram.ui.ActionBar.g6.f23202l2);
            org.telegram.ui.ActionBar.g6.f23202l2.setAlpha(alpha);
            org.telegram.ui.Components.n6 n6Var = this.A;
            if (sharingLocationInfo != null) {
                n6Var.q(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
            }
            int length = n6Var.f30866g.length();
            if (length > 4) {
                f9 = 0.75f;
            } else if (length > 3) {
                f9 = 0.85f;
            } else {
                f9 = 1.0f;
            }
            float d10 = this.f25071y.d(f9, false);
            canvas.scale(d10, d10, this.f25065f.centerX(), this.f25065f.centerY());
            n6Var.r(v02);
            n6Var.f30880w = (int) (f12 * 255.0f);
            RectF rectF = this.f25065f;
            RectF rectF2 = this.f25065f;
            n6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - AndroidUtilities.dp(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.f25064e = j10;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f9;
        float f10;
        if (LocationController.getInstance(this.f25061a).getSharingLocationInfo(this.f25064e) == null) {
            float f11 = 0.5f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.5f;
            }
            this.f25063c.setAlpha(f9);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f25062b.setAlpha(f10);
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
        if (drawable != this.A && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
