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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;
public final class q3 {
    public final n5 f33944a;
    public ValueAnimator f33945b;
    public int f33946c;
    public int d;
    public int f33947e;
    public int f33948f;
    public int f33949g;
    public int h;
    public int f33950i;
    public int f33951j;
    public final b3 f33952k;
    public final int f33953l;
    public int f33954m = 0;
    public float f33955n = 0.0f;
    public int f33956o;
    public int f33957p;
    public boolean f33958q;
    public ValueAnimator f33959r;

    public q3(TLRPC.User user, b3 b3Var, int i10) {
        this.f33952k = b3Var;
        this.f33953l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            n5 n5Var = new n5(i10, 13, b3Var, false);
            this.f33944a = n5Var;
            n5Var.j(profileEmojiId, false);
            n5Var.k(-16777216);
            n5Var.v = this.f33954m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f33945b = ofFloat;
            ofFloat.addUpdateListener(new bg.b3(18, this, b3Var));
            this.f33947e = AndroidUtilities.dp(12.0f) + this.f33946c;
            this.f33948f = AndroidUtilities.dp(12.0f) + this.d;
            this.f33946c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f33945b.setInterpolator(new LinearInterpolator());
            this.f33945b.addListener(new p3(this));
            this.f33945b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f33944a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f9 = this.f33955n;
        canvas.scale(f9, f9, this.f33956o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f33950i - this.f33957p, this.f33951j);
        int i10 = this.f33949g;
        int i11 = this.h;
        int i12 = this.f33953l;
        n5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        n5Var.v = this.f33954m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        lh.x2 x2Var;
        n5 n5Var = this.f33944a;
        if (n5Var != null) {
            this.f33950i = i10;
            this.f33951j = i11;
            this.f33952k.invalidate();
            if (!this.f33958q) {
                Drawable drawable = n5Var.f30849f[0];
                if ((drawable instanceof p5) && ((x2Var = ((p5) drawable).f31593k) == null || !x2Var.hasImageLoaded())) {
                    return;
                }
                this.f33958q = true;
                if (this.f33950i > this.f33956o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f33957p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new jr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new o3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(jr.f29800f);
                ofInt.addUpdateListener(new o3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
