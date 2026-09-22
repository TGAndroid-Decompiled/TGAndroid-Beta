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
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qr;
public final class o3 {
    public final n5 f29487a;
    public ValueAnimator f29488b;
    public int f29489c;
    public int d;
    public int e;
    public int f29490f;
    public int f29491g;
    public int h;
    public int f29492i;
    public int f29493j;
    public final z2 f29494k;
    public final int f29495l;
    public int f29496m = 0;
    public float f29497n = 0.0f;
    public int f29498o;
    public int f29499p;
    public boolean f29500q;
    public ValueAnimator f29501r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29494k = z2Var;
        this.f29495l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            n5 n5Var = new n5(i10, 13, z2Var, false);
            this.f29487a = n5Var;
            n5Var.j(profileEmojiId, false);
            n5Var.k(-16777216);
            n5Var.v = this.f29496m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29488b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29489c;
            this.f29490f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29489c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29488b.setInterpolator(new LinearInterpolator());
            this.f29488b.addListener(new n3(this));
            this.f29488b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f29487a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29497n;
        canvas.scale(f7, f7, this.f29498o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29492i - this.f29499p, this.f29493j);
        int i10 = this.f29491g;
        int i11 = this.h;
        int i12 = this.f29495l;
        n5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        n5Var.v = this.f29496m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        n5 n5Var = this.f29487a;
        if (n5Var != null) {
            this.f29492i = i10;
            this.f29493j = i11;
            this.f29494k.invalidate();
            if (!this.f29500q) {
                Drawable drawable = n5Var.f26634f[0];
                if ((drawable instanceof p5) && ((l4Var = ((p5) drawable).f27256k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29500q = true;
                if (this.f29492i > this.f29498o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29499p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new qr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(qr.f27653f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
