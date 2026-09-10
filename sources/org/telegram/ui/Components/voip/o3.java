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
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.wr;
public final class o3 {
    public final n5 f28312a;
    public ValueAnimator f28313b;
    public int f28314c;
    public int d;
    public int e;
    public int f28315f;
    public int f28316g;
    public int h;
    public int f28317i;
    public int f28318j;
    public final z2 f28319k;
    public final int f28320l;
    public int f28321m = 0;
    public float f28322n = 0.0f;
    public int f28323o;
    public int f28324p;
    public boolean f28325q;
    public ValueAnimator f28326r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f28319k = z2Var;
        this.f28320l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            n5 n5Var = new n5(i10, 13, z2Var, false);
            this.f28312a = n5Var;
            n5Var.j(profileEmojiId, false);
            n5Var.k(-16777216);
            n5Var.v = this.f28321m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28313b = ofFloat;
            ofFloat.addUpdateListener(new gg.t1(18, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f28314c;
            this.f28315f = AndroidUtilities.dp(12.0f) + this.d;
            this.f28314c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f28313b.setInterpolator(new LinearInterpolator());
            this.f28313b.addListener(new n3(this));
            this.f28313b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f28312a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f28322n;
        canvas.scale(f7, f7, this.f28323o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f28317i - this.f28324p, this.f28318j);
        int i10 = this.f28316g;
        int i11 = this.h;
        int i12 = this.f28320l;
        n5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        n5Var.v = this.f28321m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        gg.h1 h1Var;
        n5 n5Var = this.f28312a;
        if (n5Var != null) {
            this.f28317i = i10;
            this.f28318j = i11;
            this.f28319k.invalidate();
            if (!this.f28325q) {
                Drawable drawable = n5Var.f25412f[0];
                if ((drawable instanceof p5) && ((h1Var = ((p5) drawable).f26033k) == null || !h1Var.hasImageLoaded())) {
                    return;
                }
                this.f28325q = true;
                if (this.f28317i > this.f28323o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f28324p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new wr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(wr.f28819f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
