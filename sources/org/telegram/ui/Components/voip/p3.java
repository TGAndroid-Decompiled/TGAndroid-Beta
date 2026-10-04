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
import org.telegram.ui.Components.tr;
public final class p3 {
    public final o5 f32079a;
    public ValueAnimator f32080b;
    public int f32081c;
    public int d;
    public int f32082e;
    public int f32083f;
    public int f32084g;
    public int h;
    public int f32085i;
    public int f32086j;
    public final a3 f32087k;
    public final int f32088l;
    public int f32089m = 0;
    public float f32090n = 0.0f;
    public int f32091o;
    public int f32092p;
    public boolean f32093q;
    public ValueAnimator f32094r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f32087k = a3Var;
        this.f32088l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, a3Var, false);
            this.f32079a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f32089m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32080b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.f32082e = AndroidUtilities.dp(12.0f) + this.f32081c;
            this.f32083f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32081c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32080b.setInterpolator(new LinearInterpolator());
            this.f32080b.addListener(new o3(this));
            this.f32080b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f32079a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f32090n;
        canvas.scale(f7, f7, this.f32091o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32085i - this.f32092p, this.f32086j);
        int i10 = this.f32084g;
        int i11 = this.h;
        int i12 = this.f32088l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f32089m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        o5 o5Var = this.f32079a;
        if (o5Var != null) {
            this.f32085i = i10;
            this.f32086j = i11;
            this.f32087k.invalidate();
            if (!this.f32093q) {
                Drawable drawable = o5Var.f29231f[0];
                if ((drawable instanceof q5) && ((l4Var = ((q5) drawable).f29914k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f32093q = true;
                if (this.f32085i > this.f32091o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32092p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new tr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(tr.f31147f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
