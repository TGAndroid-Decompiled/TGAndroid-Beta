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
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pr;
public final class p3 {
    public final j5 f32262a;
    public ValueAnimator f32263b;
    public int f32264c;
    public int d;
    public int f32265e;
    public int f32266f;
    public int f32267g;
    public int h;
    public int f32268i;
    public int f32269j;
    public final a3 f32270k;
    public final int f32271l;
    public int f32272m = 0;
    public float f32273n = 0.0f;
    public int f32274o;
    public int f32275p;
    public boolean f32276q;
    public ValueAnimator f32277r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f32270k = a3Var;
        this.f32271l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            j5 j5Var = new j5(i10, 13, a3Var, false);
            this.f32262a = j5Var;
            j5Var.j(profileEmojiId, false);
            j5Var.k(-16777216);
            j5Var.v = this.f32272m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32263b = ofFloat;
            ofFloat.addUpdateListener(new bg.a(19, this, a3Var));
            this.f32265e = AndroidUtilities.dp(12.0f) + this.f32264c;
            this.f32266f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32264c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32263b.setInterpolator(new LinearInterpolator());
            this.f32263b.addListener(new o3(this));
            this.f32263b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        j5 j5Var = this.f32262a;
        if (j5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f32273n;
        canvas.scale(f10, f10, this.f32274o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32268i - this.f32275p, this.f32269j);
        int i10 = this.f32267g;
        int i11 = this.h;
        int i12 = this.f32271l;
        j5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        j5Var.v = this.f32272m;
        j5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        oh.z2 z2Var;
        j5 j5Var = this.f32262a;
        if (j5Var != null) {
            this.f32268i = i10;
            this.f32269j = i11;
            this.f32270k.invalidate();
            if (!this.f32276q) {
                Drawable drawable = j5Var.f27998f[0];
                if ((drawable instanceof l5) && ((z2Var = ((l5) drawable).f28604k) == null || !z2Var.hasImageLoaded())) {
                    return;
                }
                this.f32276q = true;
                if (this.f32268i > this.f32274o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32275p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new pr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(pr.f30183f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
