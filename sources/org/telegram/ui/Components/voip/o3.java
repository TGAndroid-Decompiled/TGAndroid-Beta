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
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qr;
public final class o3 {
    public final m5 f29122a;
    public ValueAnimator f29123b;
    public int f29124c;
    public int d;
    public int e;
    public int f29125f;
    public int f29126g;
    public int h;
    public int f29127i;
    public int f29128j;
    public final z2 f29129k;
    public final int f29130l;
    public int f29131m = 0;
    public float f29132n = 0.0f;
    public int f29133o;
    public int f29134p;
    public boolean f29135q;
    public ValueAnimator f29136r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29129k = z2Var;
        this.f29130l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            m5 m5Var = new m5(i10, 13, z2Var, false);
            this.f29122a = m5Var;
            m5Var.j(profileEmojiId, false);
            m5Var.k(-16777216);
            m5Var.v = this.f29131m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29123b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29124c;
            this.f29125f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29124c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29123b.setInterpolator(new LinearInterpolator());
            this.f29123b.addListener(new n3(this));
            this.f29123b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        m5 m5Var = this.f29122a;
        if (m5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29132n;
        canvas.scale(f7, f7, this.f29133o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29127i - this.f29134p, this.f29128j);
        int i10 = this.f29126g;
        int i11 = this.h;
        int i12 = this.f29130l;
        m5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        m5Var.v = this.f29131m;
        m5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        m5 m5Var = this.f29122a;
        if (m5Var != null) {
            this.f29127i = i10;
            this.f29128j = i11;
            this.f29129k.invalidate();
            if (!this.f29135q) {
                Drawable drawable = m5Var.f26073f[0];
                if ((drawable instanceof o5) && ((l4Var = ((o5) drawable).f26692k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29135q = true;
                if (this.f29127i > this.f29133o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29134p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new qr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(qr.f27423f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
