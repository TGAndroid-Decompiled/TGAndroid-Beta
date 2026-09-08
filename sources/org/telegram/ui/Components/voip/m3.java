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
    public final o5 f31676a;
    public ValueAnimator f31677b;
    public int f31678c;
    public int d;
    public int f31679e;
    public int f31680f;
    public int f31681g;
    public int h;
    public int f31682i;
    public int f31683j;
    public final x2 f31684k;
    public final int f31685l;
    public int f31686m = 0;
    public float f31687n = 0.0f;
    public int f31688o;
    public int f31689p;
    public boolean f31690q;
    public ValueAnimator f31691r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31684k = x2Var;
        this.f31685l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, x2Var, false);
            this.f31676a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f31686m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31677b = ofFloat;
            ofFloat.addUpdateListener(new ah.m0(21, this, x2Var));
            this.f31679e = AndroidUtilities.dp(12.0f) + this.f31678c;
            this.f31680f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31678c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31677b.setInterpolator(new LinearInterpolator());
            this.f31677b.addListener(new l3(this));
            this.f31677b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f31676a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31687n;
        canvas.scale(f7, f7, this.f31688o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31682i - this.f31689p, this.f31683j);
        int i10 = this.f31681g;
        int i11 = this.h;
        int i12 = this.f31685l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f31686m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        y3 y3Var;
        o5 o5Var = this.f31676a;
        if (o5Var != null) {
            this.f31682i = i10;
            this.f31683j = i11;
            this.f31684k.invalidate();
            if (!this.f31690q) {
                Drawable drawable = o5Var.f28988f[0];
                if ((drawable instanceof q5) && ((y3Var = ((q5) drawable).f29611k) == null || !y3Var.hasImageLoaded())) {
                    return;
                }
                this.f31690q = true;
                if (this.f31682i > this.f31688o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31689p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new pr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(pr.f29493f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
