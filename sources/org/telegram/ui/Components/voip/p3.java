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
    public final o5 f32073a;
    public ValueAnimator f32074b;
    public int f32075c;
    public int d;
    public int f32076e;
    public int f32077f;
    public int f32078g;
    public int h;
    public int f32079i;
    public int f32080j;
    public final a3 f32081k;
    public final int f32082l;
    public int f32083m = 0;
    public float f32084n = 0.0f;
    public int f32085o;
    public int f32086p;
    public boolean f32087q;
    public ValueAnimator f32088r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f32081k = a3Var;
        this.f32082l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, a3Var, false);
            this.f32073a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f32083m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f32074b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.f32076e = AndroidUtilities.dp(12.0f) + this.f32075c;
            this.f32077f = AndroidUtilities.dp(12.0f) + this.d;
            this.f32075c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f32074b.setInterpolator(new LinearInterpolator());
            this.f32074b.addListener(new o3(this));
            this.f32074b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f32073a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f32084n;
        canvas.scale(f7, f7, this.f32085o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f32079i - this.f32086p, this.f32080j);
        int i10 = this.f32078g;
        int i11 = this.h;
        int i12 = this.f32082l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f32083m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        o5 o5Var = this.f32073a;
        if (o5Var != null) {
            this.f32079i = i10;
            this.f32080j = i11;
            this.f32081k.invalidate();
            if (!this.f32087q) {
                Drawable drawable = o5Var.f29226f[0];
                if ((drawable instanceof q5) && ((l4Var = ((q5) drawable).f29909k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f32087q = true;
                if (this.f32079i > this.f32085o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f32086p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new tr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(tr.f31141f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
