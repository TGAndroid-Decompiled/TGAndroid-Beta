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
    public final q5 f31867a;
    public ValueAnimator f31868b;
    public int f31869c;
    public int d;
    public int f31870e;
    public int f31871f;
    public int f31872g;
    public int h;
    public int f31873i;
    public int f31874j;
    public final a3 f31875k;
    public final int f31876l;
    public int f31877m = 0;
    public float f31878n = 0.0f;
    public int f31879o;
    public int f31880p;
    public boolean f31881q;
    public ValueAnimator f31882r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f31875k = a3Var;
        this.f31876l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, a3Var, false);
            this.f31867a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f31877m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31868b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.f31870e = AndroidUtilities.dp(12.0f) + this.f31869c;
            this.f31871f = AndroidUtilities.dp(12.0f) + this.d;
            this.f31869c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f31868b.setInterpolator(new LinearInterpolator());
            this.f31868b.addListener(new o3(this));
            this.f31868b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f31867a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31878n;
        canvas.scale(f7, f7, this.f31879o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f31873i - this.f31880p, this.f31874j);
        int i10 = this.f31872g;
        int i11 = this.h;
        int i12 = this.f31876l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f31877m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        m4 m4Var;
        q5 q5Var = this.f31867a;
        if (q5Var != null) {
            this.f31873i = i10;
            this.f31874j = i11;
            this.f31875k.invalidate();
            if (!this.f31881q) {
                Drawable drawable = q5Var.f29669f[0];
                if ((drawable instanceof s5) && ((m4Var = ((s5) drawable).f30402k) == null || !m4Var.hasImageLoaded())) {
                    return;
                }
                this.f31881q = true;
                if (this.f31873i > this.f31879o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f31880p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new js(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(js.f27634f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
