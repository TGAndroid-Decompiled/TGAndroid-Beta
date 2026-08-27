package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tp0;

public final class p6 extends FrameLayout {
    public final org.telegram.ui.Components.i6 A;

    public final int f24981a;

    public final org.telegram.ui.ActionBar.h5 f24982b;

    public final org.telegram.ui.ActionBar.h5 f24983c;
    public final ImageView d;

    public long f24984e;

    public final RectF f24985f;
    public final boolean h;

    public final boolean f24986n;

    public final org.telegram.ui.ActionBar.c6 f24987r;

    public boolean f24988s;
    public final m.i3 v;

    public final org.telegram.ui.Components.y5 f24989w;

    public final org.telegram.ui.Components.y5 f24990x;

    public final org.telegram.ui.Components.y5 f24991y;

    public p6(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        z zVarH0;
        super(context);
        this.f24981a = UserConfig.selectedAccount;
        m.i3 i3Var = new m.i3(this, 6);
        this.v = i3Var;
        er erVar = er.h;
        this.f24989w = new org.telegram.ui.Components.y5(this, 350L, erVar);
        this.f24990x = new org.telegram.ui.Components.y5(this, 350L, erVar);
        this.f24991y = new org.telegram.ui.Components.y5(this, 350L, erVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, false, false);
        this.A = i6Var;
        i6Var.k(0.3f, 320L, erVar);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.u(Typeface.DEFAULT_BOLD);
        i6Var.f29239b = 17;
        i6Var.setCallback(this);
        this.f24987r = c6Var;
        this.h = z10;
        this.f24986n = z11;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        boolean z12 = LocaleController.isRTL;
        addView(imageView, h7.z5.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24983c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setTypeface(AndroidUtilities.bold());
        boolean z13 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24982b = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        if (z10) {
            i10 = z11 ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.ri;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.oi;
        }
        h5Var.setTag(Integer.valueOf(i10));
        if (z10) {
            i11 = z11 ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.ri;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.oi;
        }
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (z10) {
            if (z11) {
                i14 = org.telegram.ui.ActionBar.g6.wj;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.pi;
                i13 = org.telegram.ui.ActionBar.g6.qi;
            }
            imageView.setTag(Integer.valueOf(i14));
            int iDp = AndroidUtilities.dp(46.0f);
            if (z10) {
                i15 = org.telegram.ui.ActionBar.g6.mi;
            } else if (z11) {
                i15 = org.telegram.ui.ActionBar.g6.wj;
            } else {
                i15 = org.telegram.ui.ActionBar.g6.pi;
            }
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
            if (z10) {
                i16 = org.telegram.ui.ActionBar.g6.mi;
            } else if (z11) {
                i16 = org.telegram.ui.ActionBar.g6.wj;
            } else {
                i16 = org.telegram.ui.ActionBar.g6.pi;
            }
            zVarH0 = org.telegram.ui.ActionBar.g6.h0(iDp, iV0, org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
            if (z10) {
                this.f24985f = new RectF();
                tp0 tp0Var = new tp0(getContext(), z11 ? 5 : 4);
                tp0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.qi, c6Var), PorterDuff.Mode.MULTIPLY));
                dq dqVar = new dq(zVarH0, tp0Var);
                int iDp2 = AndroidUtilities.dp(46.0f);
                int iDp3 = AndroidUtilities.dp(46.0f);
                dqVar.h = iDp2;
                dqVar.f27825n = iDp3;
                imageView.setBackgroundDrawable(dqVar);
                if (!z11) {
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var, 1000L);
                }
            } else {
                Drawable drawableMutate = getResources().getDrawable(R.drawable.pin).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
                dq dqVar2 = new dq(zVarH0, drawableMutate);
                int iDp4 = AndroidUtilities.dp(46.0f);
                int iDp5 = AndroidUtilities.dp(46.0f);
                dqVar2.h = iDp4;
                dqVar2.f27825n = iDp5;
                int iDp6 = AndroidUtilities.dp(24.0f);
                int iDp7 = AndroidUtilities.dp(24.0f);
                dqVar2.f27823e = iDp6;
                dqVar2.f27824f = iDp7;
                imageView.setBackgroundDrawable(dqVar2);
            }
            setWillNotDraw(false);
        }
        i12 = org.telegram.ui.ActionBar.g6.mi;
        i13 = org.telegram.ui.ActionBar.g6.ni;
        i14 = i12 + i13;
        imageView.setTag(Integer.valueOf(i14));
        int iDp8 = AndroidUtilities.dp(46.0f);
        if (z10) {
            i15 = org.telegram.ui.ActionBar.g6.mi;
        } else if (z11) {
            i15 = org.telegram.ui.ActionBar.g6.wj;
        } else {
            i15 = org.telegram.ui.ActionBar.g6.pi;
        }
        int iV1 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
        if (z10) {
            i16 = org.telegram.ui.ActionBar.g6.mi;
        } else if (z11) {
            i16 = org.telegram.ui.ActionBar.g6.wj;
        } else {
            i16 = org.telegram.ui.ActionBar.g6.pi;
        }
        zVarH0 = org.telegram.ui.ActionBar.g6.h0(iDp8, iV1, org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
        if (z10) {
            this.f24985f = new RectF();
            tp0 tp0Var2 = new tp0(getContext(), z11 ? 5 : 4);
            tp0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.qi, c6Var), PorterDuff.Mode.MULTIPLY));
            dq dqVar3 = new dq(zVarH0, tp0Var2);
            int iDp9 = AndroidUtilities.dp(46.0f);
            int iDp10 = AndroidUtilities.dp(46.0f);
            dqVar3.h = iDp9;
            dqVar3.f27825n = iDp10;
            imageView.setBackgroundDrawable(dqVar3);
            if (!z11) {
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                AndroidUtilities.runOnUIThread(i3Var, 1000L);
            }
        } else {
            Drawable drawableMutate2 = getResources().getDrawable(R.drawable.pin).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            dq dqVar4 = new dq(zVarH0, drawableMutate2);
            int iDp11 = AndroidUtilities.dp(46.0f);
            int iDp12 = AndroidUtilities.dp(46.0f);
            dqVar4.h = iDp11;
            dqVar4.f27825n = iDp12;
            int iDp13 = AndroidUtilities.dp(24.0f);
            int iDp14 = AndroidUtilities.dp(24.0f);
            dqVar4.f27823e = iDp13;
            dqVar4.f27824f = iDp14;
            imageView.setBackgroundDrawable(dqVar4);
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.f24981a).getSharingLocationInfo(this.f24984e);
        if (sharingLocationInfo == null) {
            b(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
            return;
        }
        if (!this.f24986n) {
            b(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        String string = LocaleController.getString(R.string.StopLiveLocation);
        TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
        int i10 = message.edit_date;
        b(string, LocaleController.formatLocationUpdateDate(i10 != 0 ? i10 : message.date));
    }

    public final void b(String str, String str2) {
        this.f24983c.l(str, false);
        this.f24982b.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24985f != null) {
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
        float fD;
        float f10;
        int i10;
        Paint paintT0;
        boolean z10 = this.f24988s;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24987r;
        if (!z10 || (paintT0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(73.0f) : 0), getMeasuredHeight(), paintT0);
        }
        if (this.f24986n) {
            return;
        }
        int i11 = this.f24981a;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i11).getSharingLocationInfo(this.f24984e);
        org.telegram.ui.Components.y5 y5Var = this.f24989w;
        float fAbs = y5Var.f34812c;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        org.telegram.ui.Components.y5 y5Var2 = this.f24990x;
        if (sharingLocationInfo == null || (i10 = sharingLocationInfo.stopTime) < currentTime || sharingLocationInfo.period == Integer.MAX_VALUE) {
            y5Var2.getClass();
            fD = y5Var2.d(0.0f, false);
        } else {
            fAbs = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
            fD = y5Var2.e(true);
        }
        float f11 = fD;
        float f12 = fAbs;
        if (f11 <= 0.0f) {
            return;
        }
        if (LocaleController.isRTL) {
            this.f24985f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        } else {
            this.f24985f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        }
        canvas2.save();
        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f11);
        canvas2.scale(fLerp, fLerp, this.f24985f.centerX(), this.f24985f.centerY());
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.si, c6Var);
        org.telegram.ui.ActionBar.g6.f23194l2.setColor(iV0);
        int alpha = org.telegram.ui.ActionBar.g6.f23194l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.g6.f23194l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.f24985f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.g6.f23194l2);
        org.telegram.ui.ActionBar.g6.f23194l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.f24985f, -90.0f, y5Var.d(f12, false) * (-360.0f), false, org.telegram.ui.ActionBar.g6.f23194l2);
        org.telegram.ui.ActionBar.g6.f23194l2.setAlpha(alpha);
        org.telegram.ui.Components.i6 i6Var = this.A;
        if (sharingLocationInfo != null) {
            i6Var.q(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
        }
        int length = i6Var.f29243g.length();
        if (length > 4) {
            f10 = 0.75f;
        } else {
            f10 = length > 3 ? 0.85f : 1.0f;
        }
        float fD2 = this.f24991y.d(f10, false);
        canvas.scale(fD2, fD2, this.f24985f.centerX(), this.f24985f.centerY());
        i6Var.r(iV0);
        i6Var.f29257w = (int) (f11 * 255.0f);
        RectF rectF = this.f24985f;
        int i12 = (int) rectF.left;
        int iCenterY = (int) (rectF.centerY() - AndroidUtilities.dp(13.0f));
        RectF rectF2 = this.f24985f;
        i6Var.setBounds(i12, iCenterY, (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
        i6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.f24984e = j10;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        if (LocationController.getInstance(this.f24981a).getSharingLocationInfo(this.f24984e) == null) {
            this.f24983c.setAlpha(z10 ? 1.0f : 0.5f);
            this.f24982b.setAlpha(z10 ? 1.0f : 0.5f);
            this.d.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.h) {
            a();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A || super.verifyDrawable(drawable);
    }
}
