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
public final class p3 {
    public final q5 f32245a;
    public ValueAnimator f32246b;
    public int f32247c;
    public int d;
    public int f32248e;
    public int f32249f;
    public int f32250g;
    public int h;
    public int f32251i;
    public int f32252j;
    public final a3 f32253k;
    public final int f32254l;
    public int f32255m = 0;
    public float f32256n = 0.0f;
    public int f32257o;
    public int f32258p;
    public boolean f32259q;
    public ValueAnimator f32260r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f32253k = a3Var;
        this.f32254l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, a3Var, false);
            this.f32245a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f32255m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32246b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.f32248e = AndroidUtilities.dp(12.0f) + this.f32247c;
            this.f32249f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32247c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32246b.setInterpolator(new LinearInterpolator());
            this.f32246b.addListener(new o3(this));
            this.f32246b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f32245a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f32256n;
        canvas.scale(f7, f7, this.f32257o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32251i - this.f32258p, this.f32252j);
        int i10 = this.f32250g;
        int i11 = this.h;
        int i12 = this.f32254l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f32255m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        m4 m4Var;
        q5 q5Var = this.f32245a;
        if (q5Var != null) {
            this.f32251i = i10;
            this.f32252j = i11;
            this.f32253k.invalidate();
            if (!this.f32259q) {
                Drawable drawable = q5Var.f30114f[0];
                if ((drawable instanceof s5) && ((m4Var = ((s5) drawable).f30739k) == null || !m4Var.hasImageLoaded())) {
                    return;
                }
                this.f32259q = true;
                if (this.f32251i > this.f32257o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32258p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new is(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(is.f27500f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
