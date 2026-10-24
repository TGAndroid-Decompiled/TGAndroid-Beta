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
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.zr;
public final class m3 {
    public final n5 f31720a;
    public ValueAnimator f31721b;
    public int f31722c;
    public int d;
    public int e;
    public int f31723f;
    public int f31724g;
    public int h;
    public int f31725i;
    public int f31726j;
    public final x2 f31727k;
    public final int f31728l;
    public int f31729m = 0;
    public float f31730n = 0.0f;
    public int f31731o;
    public int f31732p;
    public boolean f31733q;
    public ValueAnimator f31734r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31727k = x2Var;
        this.f31728l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            n5 n5Var = new n5(i10, 13, x2Var, false);
            this.f31720a = n5Var;
            n5Var.j(profileEmojiId, false);
            n5Var.k(-16777216);
            n5Var.v = this.f31729m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31721b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, x2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f31722c;
            this.f31723f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31722c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31721b.setInterpolator(new LinearInterpolator());
            this.f31721b.addListener(new l3(this));
            this.f31721b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f31720a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31730n;
        canvas.scale(f7, f7, this.f31731o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31725i - this.f31732p, this.f31726j);
        int i10 = this.f31724g;
        int i11 = this.h;
        int i12 = this.f31728l;
        n5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        n5Var.v = this.f31729m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ci.f3 f3Var;
        n5 n5Var = this.f31720a;
        if (n5Var != null) {
            this.f31725i = i10;
            this.f31726j = i11;
            this.f31727k.invalidate();
            if (!this.f31733q) {
                Drawable drawable = n5Var.f28782f[0];
                if ((drawable instanceof p5) && ((f3Var = ((p5) drawable).f29484k) == null || !f3Var.hasImageLoaded())) {
                    return;
                }
                this.f31733q = true;
                if (this.f31725i > this.f31731o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31732p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new zr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(zr.f33337f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
