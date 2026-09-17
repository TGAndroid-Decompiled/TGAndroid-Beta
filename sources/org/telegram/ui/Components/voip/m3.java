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
    public final o5 f31650a;
    public ValueAnimator f31651b;
    public int f31652c;
    public int d;
    public int f31653e;
    public int f31654f;
    public int f31655g;
    public int h;
    public int f31656i;
    public int f31657j;
    public final x2 f31658k;
    public final int f31659l;
    public int f31660m = 0;
    public float f31661n = 0.0f;
    public int f31662o;
    public int f31663p;
    public boolean f31664q;
    public ValueAnimator f31665r;

    public m3(TLRPC.User user, x2 x2Var, int i10) {
        this.f31658k = x2Var;
        this.f31659l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, x2Var, false);
            this.f31650a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f31660m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31651b = ofFloat;
            ofFloat.addUpdateListener(new ah.m0(21, this, x2Var));
            this.f31653e = AndroidUtilities.dp(12.0f) + this.f31652c;
            this.f31654f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31652c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31651b.setInterpolator(new LinearInterpolator());
            this.f31651b.addListener(new l3(this));
            this.f31651b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f31650a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31661n;
        canvas.scale(f7, f7, this.f31662o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31656i - this.f31663p, this.f31657j);
        int i10 = this.f31655g;
        int i11 = this.h;
        int i12 = this.f31659l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f31660m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        y3 y3Var;
        o5 o5Var = this.f31650a;
        if (o5Var != null) {
            this.f31656i = i10;
            this.f31657j = i11;
            this.f31658k.invalidate();
            if (!this.f31664q) {
                Drawable drawable = o5Var.f28962f[0];
                if ((drawable instanceof q5) && ((y3Var = ((q5) drawable).f29585k) == null || !y3Var.hasImageLoaded())) {
                    return;
                }
                this.f31664q = true;
                if (this.f31656i > this.f31662o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31663p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new pr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new k3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(pr.f29467f);
                ofInt.addUpdateListener(new k3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
