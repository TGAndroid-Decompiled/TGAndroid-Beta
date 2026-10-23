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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r5;
public final class m3 {
    public final p5 f31750a;
    public ValueAnimator f31751b;
    public int f31752c;
    public int d;
    public int e;
    public int f31753f;
    public int f31754g;
    public int h;
    public int f31755i;
    public int f31756j;
    public final x2 f31757k;
    public final int f31758l;
    public int f31759m = 0;
    public float f31760n = 0.0f;
    public int f31761o;
    public int f31762p;
    public boolean f31763q;
    public ValueAnimator f31764r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31757k = x2Var;
        this.f31758l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            p5 p5Var = new p5(i10, 13, x2Var, false);
            this.f31750a = p5Var;
            p5Var.j(profileEmojiId, false);
            p5Var.k(-16777216);
            p5Var.v = this.f31759m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31751b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, x2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f31752c;
            this.f31753f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31752c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31751b.setInterpolator(new LinearInterpolator());
            this.f31751b.addListener(new l3(this));
            this.f31751b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f31750a;
        if (p5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31760n;
        canvas.scale(f7, f7, this.f31761o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31755i - this.f31762p, this.f31756j);
        int i10 = this.f31754g;
        int i11 = this.h;
        int i12 = this.f31758l;
        p5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        p5Var.v = this.f31759m;
        p5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ci.f3 f3Var;
        p5 p5Var = this.f31750a;
        if (p5Var != null) {
            this.f31755i = i10;
            this.f31756j = i11;
            this.f31757k.invalidate();
            if (!this.f31763q) {
                Drawable drawable = p5Var.f29416f[0];
                if ((drawable instanceof r5) && ((f3Var = ((r5) drawable).f30098k) == null || !f3Var.hasImageLoaded())) {
                    return;
                }
                this.f31763q = true;
                if (this.f31755i > this.f31761o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31762p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new bs(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(bs.f25133f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
