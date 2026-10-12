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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.s5;
public final class p3 {
    public final q5 f31891a;
    public ValueAnimator f31892b;
    public int f31893c;
    public int d;
    public int f31894e;
    public int f31895f;
    public int f31896g;
    public int h;
    public int f31897i;
    public int f31898j;
    public final a3 f31899k;
    public final int f31900l;
    public int f31901m = 0;
    public float f31902n = 0.0f;
    public int f31903o;
    public int f31904p;
    public boolean f31905q;
    public ValueAnimator f31906r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f31899k = a3Var;
        this.f31900l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, a3Var, false);
            this.f31891a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f31901m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31892b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.f31894e = AndroidUtilities.dp(12.0f) + this.f31893c;
            this.f31895f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31893c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31892b.setInterpolator(new LinearInterpolator());
            this.f31892b.addListener(new o3(this));
            this.f31892b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f31891a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31902n;
        canvas.scale(f7, f7, this.f31903o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31897i - this.f31904p, this.f31898j);
        int i10 = this.f31896g;
        int i11 = this.h;
        int i12 = this.f31900l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f31901m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        m4 m4Var;
        q5 q5Var = this.f31891a;
        if (q5Var != null) {
            this.f31897i = i10;
            this.f31898j = i11;
            this.f31899k.invalidate();
            if (!this.f31905q) {
                Drawable drawable = q5Var.f29691f[0];
                if ((drawable instanceof s5) && ((m4Var = ((s5) drawable).f30406k) == null || !m4Var.hasImageLoaded())) {
                    return;
                }
                this.f31905q = true;
                if (this.f31897i > this.f31903o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31904p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new js(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(js.f27627f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
