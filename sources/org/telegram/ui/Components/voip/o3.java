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
import org.telegram.ui.Components.qr;
public final class o3 {
    public final o5 f29418a;
    public ValueAnimator f29419b;
    public int f29420c;
    public int d;
    public int e;
    public int f29421f;
    public int f29422g;
    public int h;
    public int f29423i;
    public int f29424j;
    public final z2 f29425k;
    public final int f29426l;
    public int f29427m = 0;
    public float f29428n = 0.0f;
    public int f29429o;
    public int f29430p;
    public boolean f29431q;
    public ValueAnimator f29432r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29425k = z2Var;
        this.f29426l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, z2Var, false);
            this.f29418a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f29427m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29419b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29420c;
            this.f29421f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29420c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29419b.setInterpolator(new LinearInterpolator());
            this.f29419b.addListener(new n3(this));
            this.f29419b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f29418a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29428n;
        canvas.scale(f7, f7, this.f29429o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29423i - this.f29430p, this.f29424j);
        int i10 = this.f29422g;
        int i11 = this.h;
        int i12 = this.f29426l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f29427m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        o5 o5Var = this.f29418a;
        if (o5Var != null) {
            this.f29423i = i10;
            this.f29424j = i11;
            this.f29425k.invalidate();
            if (!this.f29431q) {
                Drawable drawable = o5Var.f26855f[0];
                if ((drawable instanceof q5) && ((l4Var = ((q5) drawable).f27461k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29431q = true;
                if (this.f29423i > this.f29429o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29430p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new qr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(qr.f27715f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
