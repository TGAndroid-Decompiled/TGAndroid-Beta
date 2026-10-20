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
    public final p5 f31564a;
    public ValueAnimator f31565b;
    public int f31566c;
    public int d;
    public int e;
    public int f31567f;
    public int f31568g;
    public int h;
    public int f31569i;
    public int f31570j;
    public final x2 f31571k;
    public final int f31572l;
    public int f31573m = 0;
    public float f31574n = 0.0f;
    public int f31575o;
    public int f31576p;
    public boolean f31577q;
    public ValueAnimator f31578r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31571k = x2Var;
        this.f31572l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            p5 p5Var = new p5(i10, 13, x2Var, false);
            this.f31564a = p5Var;
            p5Var.j(profileEmojiId, false);
            p5Var.k(-16777216);
            p5Var.v = this.f31573m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31565b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, x2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f31566c;
            this.f31567f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31566c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31565b.setInterpolator(new LinearInterpolator());
            this.f31565b.addListener(new l3(this));
            this.f31565b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f31564a;
        if (p5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31574n;
        canvas.scale(f7, f7, this.f31575o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31569i - this.f31576p, this.f31570j);
        int i10 = this.f31568g;
        int i11 = this.h;
        int i12 = this.f31572l;
        p5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        p5Var.v = this.f31573m;
        p5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ci.g3 g3Var;
        p5 p5Var = this.f31564a;
        if (p5Var != null) {
            this.f31569i = i10;
            this.f31570j = i11;
            this.f31571k.invalidate();
            if (!this.f31577q) {
                Drawable drawable = p5Var.f29210f[0];
                if ((drawable instanceof r5) && ((g3Var = ((r5) drawable).f29837k) == null || !g3Var.hasImageLoaded())) {
                    return;
                }
                this.f31577q = true;
                if (this.f31569i > this.f31575o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31576p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new bs(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(bs.f25021f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
