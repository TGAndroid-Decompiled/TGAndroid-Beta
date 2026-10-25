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
    public final r5 f34003a;
    public ValueAnimator f34004b;
    public int f34005c;
    public int d;
    public int e;
    public int f34006f;
    public int f34007g;
    public int h;
    public int f34008i;
    public int f34009j;
    public final a3 f34010k;
    public final int f34011l;
    public int f34012m = 0;
    public float f34013n = 0.0f;
    public int f34014o;
    public int f34015p;
    public boolean f34016q;
    public ValueAnimator f34017r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f34010k = a3Var;
        this.f34011l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            r5 r5Var = new r5(i10, 13, a3Var, false);
            this.f34003a = r5Var;
            r5Var.j(profileEmojiId, false);
            r5Var.k(-16777216);
            r5Var.v = this.f34012m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f34004b = ofFloat;
            ofFloat.addUpdateListener(new bh.b0(21, this, a3Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f34005c;
            this.f34006f = AndroidUtilities.dp(12.0f) + this.d;
            this.f34005c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f34004b.setInterpolator(new LinearInterpolator());
            this.f34004b.addListener(new o3(this));
            this.f34004b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        r5 r5Var = this.f34003a;
        if (r5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f34013n;
        canvas.scale(f7, f7, this.f34014o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f34008i - this.f34015p, this.f34009j);
        int i10 = this.f34007g;
        int i11 = this.h;
        int i12 = this.f34011l;
        r5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        r5Var.v = this.f34012m;
        r5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        di.f3 f3Var;
        r5 r5Var = this.f34003a;
        if (r5Var != null) {
            this.f34008i = i10;
            this.f34009j = i11;
            this.f34010k.invalidate();
            if (!this.f34016q) {
                Drawable drawable = r5Var.f32094f[0];
                if ((drawable instanceof t5) && ((f3Var = ((t5) drawable).f32849k) == null || !f3Var.hasImageLoaded())) {
                    return;
                }
                this.f34016q = true;
                if (this.f34008i > this.f34014o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f34015p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new ds(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(ds.f27584f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
