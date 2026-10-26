package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t5;
public final class p3 {
    public final r5 f34006a;
    public ValueAnimator f34007b;
    public int f34008c;
    public int d;
    public int e;
    public int f34009f;
    public int f34010g;
    public int h;
    public int f34011i;
    public int f34012j;
    public final a3 f34013k;
    public final int f34014l;
    public int f34015m = 0;
    public float f34016n = 0.0f;
    public int f34017o;
    public int f34018p;
    public boolean f34019q;
    public ValueAnimator f34020r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f34013k = a3Var;
        this.f34014l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            r5 r5Var = new r5(i10, 13, a3Var, false);
            this.f34006a = r5Var;
            r5Var.j(profileEmojiId, false);
            r5Var.k(-16777216);
            r5Var.v = this.f34015m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f34007b = ofFloat;
            ofFloat.addUpdateListener(new bh.b0(21, this, a3Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f34008c;
            this.f34009f = AndroidUtilities.dp(12.0f) + this.d;
            this.f34008c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f34007b.setInterpolator(new LinearInterpolator());
            this.f34007b.addListener(new o3(this));
            this.f34007b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        r5 r5Var = this.f34006a;
        if (r5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f34016n;
        canvas.scale(f7, f7, this.f34017o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f34011i - this.f34018p, this.f34012j);
        int i10 = this.f34010g;
        int i11 = this.h;
        int i12 = this.f34014l;
        r5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        r5Var.v = this.f34015m;
        r5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        di.f3 f3Var;
        r5 r5Var = this.f34006a;
        if (r5Var != null) {
            this.f34011i = i10;
            this.f34012j = i11;
            this.f34013k.invalidate();
            if (!this.f34019q) {
                Drawable drawable = r5Var.f32096f[0];
                if ((drawable instanceof t5) && ((f3Var = ((t5) drawable).f32852k) == null || !f3Var.hasImageLoaded())) {
                    return;
                }
                this.f34019q = true;
                if (this.f34011i > this.f34017o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f34018p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new ds(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(ds.f27586f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
