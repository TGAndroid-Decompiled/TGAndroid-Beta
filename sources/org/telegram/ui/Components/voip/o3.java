package org.telegram.ui.Components.voip;

import ai.m4;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.s5;
public final class o3 {
    public final q5 f32122a;
    public ValueAnimator f32123b;
    public int f32124c;
    public int d;
    public int f32125e;
    public int f32126f;
    public int f32127g;
    public int h;
    public int f32128i;
    public int f32129j;
    public final z2 f32130k;
    public final int f32131l;
    public int f32132m = 0;
    public float f32133n = 0.0f;
    public int f32134o;
    public int f32135p;
    public boolean f32136q;
    public ValueAnimator f32137r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f32130k = z2Var;
        this.f32131l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, z2Var, false);
            this.f32122a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f32132m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32123b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.f32125e = AndroidUtilities.dp(12.0f) + this.f32124c;
            this.f32126f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32124c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32123b.setInterpolator(new LinearInterpolator());
            this.f32123b.addListener(new n3(this));
            this.f32123b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f32122a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f32133n;
        canvas.scale(f7, f7, this.f32134o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32128i - this.f32135p, this.f32129j);
        int i10 = this.f32127g;
        int i11 = this.h;
        int i12 = this.f32131l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f32132m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        m4 m4Var;
        q5 q5Var = this.f32122a;
        if (q5Var != null) {
            this.f32128i = i10;
            this.f32129j = i11;
            this.f32130k.invalidate();
            if (!this.f32136q) {
                Drawable drawable = q5Var.f30046f[0];
                if ((drawable instanceof s5) && ((m4Var = ((s5) drawable).f30654k) == null || !m4Var.hasImageLoaded())) {
                    return;
                }
                this.f32136q = true;
                if (this.f32128i > this.f32134o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32135p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new hs(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(hs.f27118f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
