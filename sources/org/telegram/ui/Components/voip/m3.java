package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import bi.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
public final class m3 {
    public final o5 f31677a;
    public ValueAnimator f31678b;
    public int f31679c;
    public int d;
    public int f31680e;
    public int f31681f;
    public int f31682g;
    public int h;
    public int f31683i;
    public int f31684j;
    public final x2 f31685k;
    public final int f31686l;
    public int f31687m = 0;
    public float f31688n = 0.0f;
    public int f31689o;
    public int f31690p;
    public boolean f31691q;
    public ValueAnimator f31692r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31685k = x2Var;
        this.f31686l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, x2Var, false);
            this.f31677a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f31687m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31678b = ofFloat;
            ofFloat.addUpdateListener(new ah.m0(21, this, x2Var));
            this.f31680e = AndroidUtilities.dp(12.0f) + this.f31679c;
            this.f31681f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31679c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31678b.setInterpolator(new LinearInterpolator());
            this.f31678b.addListener(new l3(this));
            this.f31678b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f31677a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31688n;
        canvas.scale(f7, f7, this.f31689o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31683i - this.f31690p, this.f31684j);
        int i10 = this.f31682g;
        int i11 = this.h;
        int i12 = this.f31686l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f31687m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        y3 y3Var;
        o5 o5Var = this.f31677a;
        if (o5Var != null) {
            this.f31683i = i10;
            this.f31684j = i11;
            this.f31685k.invalidate();
            if (!this.f31691q) {
                Drawable drawable = o5Var.f28989f[0];
                if ((drawable instanceof q5) && ((y3Var = ((q5) drawable).f29612k) == null || !y3Var.hasImageLoaded())) {
                    return;
                }
                this.f31691q = true;
                if (this.f31683i > this.f31689o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31690p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new pr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(pr.f29494f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
