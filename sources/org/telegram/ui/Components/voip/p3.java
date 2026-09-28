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
import org.telegram.ui.Components.sr;
public final class p3 {
    public final o5 f29474a;
    public ValueAnimator f29475b;
    public int f29476c;
    public int d;
    public int e;
    public int f29477f;
    public int f29478g;
    public int h;
    public int f29479i;
    public int f29480j;
    public final a3 f29481k;
    public final int f29482l;
    public int f29483m = 0;
    public float f29484n = 0.0f;
    public int f29485o;
    public int f29486p;
    public boolean f29487q;
    public ValueAnimator f29488r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f29481k = a3Var;
        this.f29482l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, a3Var, false);
            this.f29474a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f29483m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29475b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29476c;
            this.f29477f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29476c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29475b.setInterpolator(new LinearInterpolator());
            this.f29475b.addListener(new o3(this));
            this.f29475b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f29474a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29484n;
        canvas.scale(f7, f7, this.f29485o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29479i - this.f29486p, this.f29480j);
        int i10 = this.f29478g;
        int i11 = this.h;
        int i12 = this.f29482l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f29483m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        o5 o5Var = this.f29474a;
        if (o5Var != null) {
            this.f29479i = i10;
            this.f29480j = i11;
            this.f29481k.invalidate();
            if (!this.f29487q) {
                Drawable drawable = o5Var.f26936f[0];
                if ((drawable instanceof q5) && ((l4Var = ((q5) drawable).f27552k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29487q = true;
                if (this.f29479i > this.f29485o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29486p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new sr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(sr.f28348f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
