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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k5;
public final class n3 {
    public final i5 f33699a;
    public ValueAnimator f33700b;
    public int f33701c;
    public int d;
    public int f33702e;
    public int f33703f;
    public int f33704g;
    public int h;
    public int f33705i;
    public int f33706j;
    public final y2 f33707k;
    public final int f33708l;
    public int f33709m = 0;
    public float f33710n = 0.0f;
    public int f33711o;
    public int f33712p;
    public boolean f33713q;
    public ValueAnimator f33714r;

    public n3(TLRPC.User user, y2 y2Var, int i9) {
        this.f33707k = y2Var;
        this.f33708l = i9;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            i5 i5Var = new i5(i9, 13, y2Var, false);
            this.f33699a = i5Var;
            i5Var.j(profileEmojiId, false);
            i5Var.k(-16777216);
            i5Var.v = this.f33709m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f33700b = ofFloat;
            ofFloat.addUpdateListener(new f2.g(16, this, y2Var));
            this.f33702e = AndroidUtilities.dp(12.0f) + this.f33701c;
            this.f33703f = AndroidUtilities.dp(12.0f) + this.d;
            this.f33701c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f33700b.setInterpolator(new LinearInterpolator());
            this.f33700b.addListener(new m3(this));
            this.f33700b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        i5 i5Var = this.f33699a;
        if (i5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f33710n;
        canvas.scale(f10, f10, this.f33711o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f33705i - this.f33712p, this.f33706j);
        int i9 = this.f33704g;
        int i10 = this.h;
        int i11 = this.f33708l;
        i5Var.setBounds(i9, i10, i9 + i11, i11 + i10);
        i5Var.v = this.f33709m;
        i5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i9, int i10) {
        int i11;
        ih.z2 z2Var;
        i5 i5Var = this.f33699a;
        if (i5Var != null) {
            this.f33705i = i9;
            this.f33706j = i10;
            this.f33707k.invalidate();
            if (!this.f33713q) {
                Drawable drawable = i5Var.f29319f[0];
                if ((drawable instanceof k5) && ((z2Var = ((k5) drawable).f29951k) == null || !z2Var.hasImageLoaded())) {
                    return;
                }
                this.f33713q = true;
                if (this.f33705i > this.f33711o / 2) {
                    i11 = AndroidUtilities.dp(12);
                } else {
                    i11 = -AndroidUtilities.dp(12);
                }
                this.f33712p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new gr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new l3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(gr.f28844f);
                ofInt.addUpdateListener(new l3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
