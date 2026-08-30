package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.nr;
public final class o3 {
    public final j5 f29829a;
    public ValueAnimator f29830b;
    public int f29831c;
    public int d;
    public int e;
    public int f29832f;
    public int f29833g;
    public int h;
    public int f29834i;
    public int f29835j;
    public final z2 f29836k;
    public final int f29837l;
    public int f29838m = 0;
    public float f29839n = 0.0f;
    public int f29840o;
    public int f29841p;
    public boolean f29842q;
    public ValueAnimator f29843r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29836k = z2Var;
        this.f29837l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            j5 j5Var = new j5(i10, 13, z2Var, false);
            this.f29829a = j5Var;
            j5Var.j(profileEmojiId, false);
            j5Var.k(-16777216);
            j5Var.v = this.f29838m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29830b = ofFloat;
            ofFloat.addUpdateListener(new ag.a(19, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29831c;
            this.f29832f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29831c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29830b.setInterpolator(new LinearInterpolator());
            this.f29830b.addListener(new n3(this));
            this.f29830b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        j5 j5Var = this.f29829a;
        if (j5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f29839n;
        canvas.scale(f10, f10, this.f29840o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29834i - this.f29841p, this.f29835j);
        int i10 = this.f29833g;
        int i11 = this.h;
        int i12 = this.f29837l;
        j5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        j5Var.v = this.f29838m;
        j5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        nh.y2 y2Var;
        j5 j5Var = this.f29829a;
        if (j5Var != null) {
            this.f29834i = i10;
            this.f29835j = i11;
            this.f29836k.invalidate();
            if (!this.f29842q) {
                Drawable drawable = j5Var.f25875f[0];
                if ((drawable instanceof l5) && ((y2Var = ((l5) drawable).f26569k) == null || !y2Var.hasImageLoaded())) {
                    return;
                }
                this.f29842q = true;
                if (this.f29834i > this.f29840o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29841p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new nr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(nr.f27346f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
