package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.f6 E;
    public final org.telegram.ui.Components.f6 F;
    public final org.telegram.ui.Components.f6 G;
    public final org.telegram.ui.Components.p6 H;
    public final y f23694a;
    public final int f23695b;
    public int f23696c;
    public final int d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final org.telegram.ui.ActionBar.n5 f23697f;
    public final ImageView h;
    public long f23698n;
    public final RectF f23699r;
    public final boolean f23700s;
    public final boolean v;
    public final org.telegram.ui.ActionBar.g6 f23701w;
    public boolean f23702x;
    public final u5 f23703y;

    public t6(android.content.Context r22, org.telegram.ui.ActionBar.g6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t6.<init>(android.content.Context, org.telegram.ui.ActionBar.g6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j10;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.d).getSharingLocationInfo(this.f23698n);
        if (sharingLocationInfo != null) {
            if (this.v) {
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.f23695b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public final void b(String str, String str2) {
        this.f23697f.l(str, false);
        this.e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23699r != null) {
            u5 u5Var = this.f23703y;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f23703y);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d;
        float f7;
        int i10;
        Paint V0;
        float dp;
        int i11;
        boolean z10 = this.f23702x;
        org.telegram.ui.ActionBar.g6 g6Var = this.f23701w;
        if (z10 && (V0 = org.telegram.ui.ActionBar.k6.V0("paintDivider", g6Var)) != null) {
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
            canvas2.drawRect(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight(), V0);
        } else {
            canvas2 = canvas;
        }
        if (!this.v) {
            int i12 = this.d;
            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i12).getSharingLocationInfo(this.f23698n);
            org.telegram.ui.Components.f6 f6Var = this.E;
            float f11 = f6Var.f26180c;
            int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            org.telegram.ui.Components.f6 f6Var2 = this.F;
            if (sharingLocationInfo != null && (i10 = sharingLocationInfo.stopTime) >= currentTime && sharingLocationInfo.period != Integer.MAX_VALUE) {
                f11 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
                d = f6Var2.e(true);
            } else {
                f6Var2.getClass();
                d = f6Var2.d(0.0f, false);
            }
            float f12 = d;
            float f13 = f11;
            if (f12 <= 0.0f) {
                return;
            }
            if (LocaleController.isRTL) {
                this.f23699r.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            } else {
                this.f23699r.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
            }
            canvas2.save();
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f12);
            canvas2.scale(lerp, lerp, this.f23699r.centerX(), this.f23699r.centerY());
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21471si, g6Var);
            org.telegram.ui.ActionBar.k6.f21324l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.f21324l2.getAlpha();
            float f14 = alpha;
            org.telegram.ui.ActionBar.k6.f21324l2.setAlpha((int) (0.2f * f14 * f12));
            canvas2.drawArc(this.f23699r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.f21324l2);
            org.telegram.ui.ActionBar.k6.f21324l2.setAlpha((int) (f14 * f12));
            canvas.drawArc(this.f23699r, -90.0f, f6Var.d(f13, false) * (-360.0f), false, org.telegram.ui.ActionBar.k6.f21324l2);
            org.telegram.ui.ActionBar.k6.f21324l2.setAlpha(alpha);
            org.telegram.ui.Components.p6 p6Var = this.H;
            if (sharingLocationInfo != null) {
                p6Var.t(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
            }
            int length = p6Var.f29442i.length();
            if (length > 4) {
                f7 = 0.75f;
            } else if (length > 3) {
                f7 = 0.85f;
            } else {
                f7 = 1.0f;
            }
            float d10 = this.G.d(f7, false);
            canvas.scale(d10, d10, this.f23699r.centerX(), this.f23699r.centerY());
            p6Var.u(w02);
            p6Var.B = (int) (f12 * 255.0f);
            RectF rectF = this.f23699r;
            RectF rectF2 = this.f23699r;
            p6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - AndroidUtilities.dp(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
            p6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.f23698n = j10;
        if (this.f23700s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f7;
        float f10;
        if (LocationController.getInstance(this.d).getSharingLocationInfo(this.f23698n) == null) {
            float f11 = 0.5f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            this.f23697f.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.e.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            }
            this.h.setAlpha(f11);
        }
        if (this.f23700s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        int w02;
        try {
            if (this.f23694a != null && (i10 = this.f23695b) >= 0 && (w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.f23701w)) != this.f23696c) {
                this.f23696c = w02;
                org.telegram.ui.ActionBar.k6.E1(this.f23694a, w02, false);
                org.telegram.ui.ActionBar.k6.E1(this.f23694a, w02, true);
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
