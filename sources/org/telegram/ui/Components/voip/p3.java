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
    public final q5 f32181a;
    public ValueAnimator f32182b;
    public int f32183c;
    public int d;
    public int f32184e;
    public int f32185f;
    public int f32186g;
    public int h;
    public int f32187i;
    public int f32188j;
    public final a3 f32189k;
    public final int f32190l;
    public int f32191m = 0;
    public float f32192n = 0.0f;
    public int f32193o;
    public int f32194p;
    public boolean f32195q;
    public ValueAnimator f32196r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f32189k = a3Var;
        this.f32190l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, a3Var, false);
            this.f32181a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f32191m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32182b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.f32184e = AndroidUtilities.dp(12.0f) + this.f32183c;
            this.f32185f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32183c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32182b.setInterpolator(new LinearInterpolator());
            this.f32182b.addListener(new o3(this));
            this.f32182b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f32181a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f32192n;
        canvas.scale(f7, f7, this.f32193o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32187i - this.f32194p, this.f32188j);
        int i10 = this.f32186g;
        int i11 = this.h;
        int i12 = this.f32190l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f32191m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        m4 m4Var;
        q5 q5Var = this.f32181a;
        if (q5Var != null) {
            this.f32187i = i10;
            this.f32188j = i11;
            this.f32189k.invalidate();
            if (!this.f32195q) {
                Drawable drawable = q5Var.f29998f[0];
                if ((drawable instanceof s5) && ((m4Var = ((s5) drawable).f30634k) == null || !m4Var.hasImageLoaded())) {
                    return;
                }
                this.f32195q = true;
                if (this.f32187i > this.f32193o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32194p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new is(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(is.f27451f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
