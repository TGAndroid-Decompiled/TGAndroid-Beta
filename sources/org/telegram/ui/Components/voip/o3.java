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
    public final m5 f29102a;
    public ValueAnimator f29103b;
    public int f29104c;
    public int d;
    public int e;
    public int f29105f;
    public int f29106g;
    public int h;
    public int f29107i;
    public int f29108j;
    public final z2 f29109k;
    public final int f29110l;
    public int f29111m = 0;
    public float f29112n = 0.0f;
    public int f29113o;
    public int f29114p;
    public boolean f29115q;
    public ValueAnimator f29116r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29109k = z2Var;
        this.f29110l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            m5 m5Var = new m5(i10, 13, z2Var, false);
            this.f29102a = m5Var;
            m5Var.j(profileEmojiId, false);
            m5Var.k(-16777216);
            m5Var.v = this.f29111m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29103b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29104c;
            this.f29105f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29104c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29103b.setInterpolator(new LinearInterpolator());
            this.f29103b.addListener(new n3(this));
            this.f29103b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        m5 m5Var = this.f29102a;
        if (m5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29112n;
        canvas.scale(f7, f7, this.f29113o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29107i - this.f29114p, this.f29108j);
        int i10 = this.f29106g;
        int i11 = this.h;
        int i12 = this.f29110l;
        m5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        m5Var.v = this.f29111m;
        m5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        m5 m5Var = this.f29102a;
        if (m5Var != null) {
            this.f29107i = i10;
            this.f29108j = i11;
            this.f29109k.invalidate();
            if (!this.f29115q) {
                Drawable drawable = m5Var.f26057f[0];
                if ((drawable instanceof o5) && ((l4Var = ((o5) drawable).f26639k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29115q = true;
                if (this.f29107i > this.f29113o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29114p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new qr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(qr.f27383f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
