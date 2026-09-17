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
    public final m5 f29099a;
    public ValueAnimator f29100b;
    public int f29101c;
    public int d;
    public int e;
    public int f29102f;
    public int f29103g;
    public int h;
    public int f29104i;
    public int f29105j;
    public final z2 f29106k;
    public final int f29107l;
    public int f29108m = 0;
    public float f29109n = 0.0f;
    public int f29110o;
    public int f29111p;
    public boolean f29112q;
    public ValueAnimator f29113r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29106k = z2Var;
        this.f29107l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            m5 m5Var = new m5(i10, 13, z2Var, false);
            this.f29099a = m5Var;
            m5Var.j(profileEmojiId, false);
            m5Var.k(-16777216);
            m5Var.v = this.f29108m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29100b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29101c;
            this.f29102f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29101c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29100b.setInterpolator(new LinearInterpolator());
            this.f29100b.addListener(new n3(this));
            this.f29100b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        m5 m5Var = this.f29099a;
        if (m5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29109n;
        canvas.scale(f7, f7, this.f29110o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29104i - this.f29111p, this.f29105j);
        int i10 = this.f29103g;
        int i11 = this.h;
        int i12 = this.f29107l;
        m5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        m5Var.v = this.f29108m;
        m5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        m5 m5Var = this.f29099a;
        if (m5Var != null) {
            this.f29104i = i10;
            this.f29105j = i11;
            this.f29106k.invalidate();
            if (!this.f29112q) {
                Drawable drawable = m5Var.f26054f[0];
                if ((drawable instanceof o5) && ((l4Var = ((o5) drawable).f26636k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29112q = true;
                if (this.f29104i > this.f29110o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29111p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new qr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(qr.f27380f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
