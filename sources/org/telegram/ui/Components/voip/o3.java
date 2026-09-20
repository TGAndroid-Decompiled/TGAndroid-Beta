package org.telegram.ui.Components.voip;

import ai.l4;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qr;
public final class o3 {
    public final n5 f29525a;
    public ValueAnimator f29526b;
    public int f29527c;
    public int d;
    public int e;
    public int f29528f;
    public int f29529g;
    public int h;
    public int f29530i;
    public int f29531j;
    public final z2 f29532k;
    public final int f29533l;
    public int f29534m = 0;
    public float f29535n = 0.0f;
    public int f29536o;
    public int f29537p;
    public boolean f29538q;
    public ValueAnimator f29539r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29532k = z2Var;
        this.f29533l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            n5 n5Var = new n5(i10, 13, z2Var, false);
            this.f29525a = n5Var;
            n5Var.j(profileEmojiId, false);
            n5Var.k(-16777216);
            n5Var.v = this.f29534m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29526b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29527c;
            this.f29528f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29527c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29526b.setInterpolator(new LinearInterpolator());
            this.f29526b.addListener(new n3(this));
            this.f29526b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f29525a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29535n;
        canvas.scale(f7, f7, this.f29536o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29530i - this.f29537p, this.f29531j);
        int i10 = this.f29529g;
        int i11 = this.h;
        int i12 = this.f29533l;
        n5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        n5Var.v = this.f29534m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        n5 n5Var = this.f29525a;
        if (n5Var != null) {
            this.f29530i = i10;
            this.f29531j = i11;
            this.f29532k.invalidate();
            if (!this.f29538q) {
                Drawable drawable = n5Var.f26565f[0];
                if ((drawable instanceof p5) && ((l4Var = ((p5) drawable).f27162k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29538q = true;
                if (this.f29530i > this.f29536o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29537p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new qr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(qr.f27642f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
