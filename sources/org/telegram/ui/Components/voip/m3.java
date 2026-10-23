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
    public final p5 f31569a;
    public ValueAnimator f31570b;
    public int f31571c;
    public int d;
    public int e;
    public int f31572f;
    public int f31573g;
    public int h;
    public int f31574i;
    public int f31575j;
    public final x2 f31576k;
    public final int f31577l;
    public int f31578m = 0;
    public float f31579n = 0.0f;
    public int f31580o;
    public int f31581p;
    public boolean f31582q;
    public ValueAnimator f31583r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31576k = x2Var;
        this.f31577l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            p5 p5Var = new p5(i10, 13, x2Var, false);
            this.f31569a = p5Var;
            p5Var.j(profileEmojiId, false);
            p5Var.k(-16777216);
            p5Var.v = this.f31578m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31570b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, x2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f31571c;
            this.f31572f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31571c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31570b.setInterpolator(new LinearInterpolator());
            this.f31570b.addListener(new l3(this));
            this.f31570b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f31569a;
        if (p5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31579n;
        canvas.scale(f7, f7, this.f31580o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31574i - this.f31581p, this.f31575j);
        int i10 = this.f31573g;
        int i11 = this.h;
        int i12 = this.f31577l;
        p5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        p5Var.v = this.f31578m;
        p5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ci.g3 g3Var;
        p5 p5Var = this.f31569a;
        if (p5Var != null) {
            this.f31574i = i10;
            this.f31575j = i11;
            this.f31576k.invalidate();
            if (!this.f31582q) {
                Drawable drawable = p5Var.f29215f[0];
                if ((drawable instanceof r5) && ((g3Var = ((r5) drawable).f29842k) == null || !g3Var.hasImageLoaded())) {
                    return;
                }
                this.f31582q = true;
                if (this.f31574i > this.f31580o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31581p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new bs(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(bs.f25025f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
