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
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
public final class p3 {
    public final o5 f29554a;
    public ValueAnimator f29555b;
    public int f29556c;
    public int d;
    public int e;
    public int f29557f;
    public int f29558g;
    public int h;
    public int f29559i;
    public int f29560j;
    public final a3 f29561k;
    public final int f29562l;
    public int f29563m = 0;
    public float f29564n = 0.0f;
    public int f29565o;
    public int f29566p;
    public boolean f29567q;
    public ValueAnimator f29568r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f29561k = a3Var;
        this.f29562l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, a3Var, false);
            this.f29554a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f29563m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29555b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29556c;
            this.f29557f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29556c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29555b.setInterpolator(new LinearInterpolator());
            this.f29555b.addListener(new o3(this));
            this.f29555b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f29554a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29564n;
        canvas.scale(f7, f7, this.f29565o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29559i - this.f29566p, this.f29560j);
        int i10 = this.f29558g;
        int i11 = this.h;
        int i12 = this.f29562l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f29563m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        o5 o5Var = this.f29554a;
        if (o5Var != null) {
            this.f29559i = i10;
            this.f29560j = i11;
            this.f29561k.invalidate();
            if (!this.f29567q) {
                Drawable drawable = o5Var.f26921f[0];
                if ((drawable instanceof q5) && ((l4Var = ((q5) drawable).f27505k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29567q = true;
                if (this.f29559i > this.f29565o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29566p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new rr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(rr.f28031f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
