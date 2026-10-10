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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.s5;
public final class o3 {
    public final q5 f32187a;
    public ValueAnimator f32188b;
    public int f32189c;
    public int d;
    public int f32190e;
    public int f32191f;
    public int f32192g;
    public int h;
    public int f32193i;
    public int f32194j;
    public final z2 f32195k;
    public final int f32196l;
    public int f32197m = 0;
    public float f32198n = 0.0f;
    public int f32199o;
    public int f32200p;
    public boolean f32201q;
    public ValueAnimator f32202r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f32195k = z2Var;
        this.f32196l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, z2Var, false);
            this.f32187a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f32197m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32188b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.f32190e = AndroidUtilities.dp(12.0f) + this.f32189c;
            this.f32191f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32189c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32188b.setInterpolator(new LinearInterpolator());
            this.f32188b.addListener(new n3(this));
            this.f32188b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f32187a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f32198n;
        canvas.scale(f7, f7, this.f32199o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32193i - this.f32200p, this.f32194j);
        int i10 = this.f32192g;
        int i11 = this.h;
        int i12 = this.f32196l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f32197m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        m4 m4Var;
        q5 q5Var = this.f32187a;
        if (q5Var != null) {
            this.f32193i = i10;
            this.f32194j = i11;
            this.f32195k.invalidate();
            if (!this.f32201q) {
                Drawable drawable = q5Var.f30011f[0];
                if ((drawable instanceof s5) && ((m4Var = ((s5) drawable).f30680k) == null || !m4Var.hasImageLoaded())) {
                    return;
                }
                this.f32201q = true;
                if (this.f32193i > this.f32199o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32200p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new is(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(is.f27443f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
