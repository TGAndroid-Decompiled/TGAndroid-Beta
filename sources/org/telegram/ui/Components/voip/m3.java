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
    public final p5 f31615a;
    public ValueAnimator f31616b;
    public int f31617c;
    public int d;
    public int e;
    public int f31618f;
    public int f31619g;
    public int h;
    public int f31620i;
    public int f31621j;
    public final x2 f31622k;
    public final int f31623l;
    public int f31624m = 0;
    public float f31625n = 0.0f;
    public int f31626o;
    public int f31627p;
    public boolean f31628q;
    public ValueAnimator f31629r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31622k = x2Var;
        this.f31623l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            p5 p5Var = new p5(i10, 13, x2Var, false);
            this.f31615a = p5Var;
            p5Var.j(profileEmojiId, false);
            p5Var.k(-16777216);
            p5Var.v = this.f31624m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31616b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, x2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f31617c;
            this.f31618f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31617c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31616b.setInterpolator(new LinearInterpolator());
            this.f31616b.addListener(new l3(this));
            this.f31616b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f31615a;
        if (p5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31625n;
        canvas.scale(f7, f7, this.f31626o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31620i - this.f31627p, this.f31621j);
        int i10 = this.f31619g;
        int i11 = this.h;
        int i12 = this.f31623l;
        p5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        p5Var.v = this.f31624m;
        p5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ci.g3 g3Var;
        p5 p5Var = this.f31615a;
        if (p5Var != null) {
            this.f31620i = i10;
            this.f31621j = i11;
            this.f31622k.invalidate();
            if (!this.f31628q) {
                Drawable drawable = p5Var.f29167f[0];
                if ((drawable instanceof r5) && ((g3Var = ((r5) drawable).f29853k) == null || !g3Var.hasImageLoaded())) {
                    return;
                }
                this.f31628q = true;
                if (this.f31620i > this.f31626o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31627p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new bs(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(bs.f25014f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
