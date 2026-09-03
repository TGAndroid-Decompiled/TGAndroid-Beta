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
import org.telegram.ui.Components.mr;
public final class o3 {
    public final j5 f29801a;
    public ValueAnimator f29802b;
    public int f29803c;
    public int d;
    public int e;
    public int f29804f;
    public int f29805g;
    public int h;
    public int f29806i;
    public int f29807j;
    public final z2 f29808k;
    public final int f29809l;
    public int f29810m = 0;
    public float f29811n = 0.0f;
    public int f29812o;
    public int f29813p;
    public boolean f29814q;
    public ValueAnimator f29815r;

    public o3(TLRPC.User user, z2 z2Var, int i10) {
        this.f29808k = z2Var;
        this.f29809l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            j5 j5Var = new j5(i10, 13, z2Var, false);
            this.f29801a = j5Var;
            j5Var.j(profileEmojiId, false);
            j5Var.k(-16777216);
            j5Var.v = this.f29810m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29802b = ofFloat;
            ofFloat.addUpdateListener(new ag.a(19, this, z2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29803c;
            this.f29804f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29803c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29802b.setInterpolator(new LinearInterpolator());
            this.f29802b.addListener(new n3(this));
            this.f29802b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        j5 j5Var = this.f29801a;
        if (j5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f29811n;
        canvas.scale(f10, f10, this.f29812o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29806i - this.f29813p, this.f29807j);
        int i10 = this.f29805g;
        int i11 = this.h;
        int i12 = this.f29809l;
        j5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        j5Var.v = this.f29810m;
        j5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        nh.y2 y2Var;
        j5 j5Var = this.f29801a;
        if (j5Var != null) {
            this.f29806i = i10;
            this.f29807j = i11;
            this.f29808k.invalidate();
            if (!this.f29814q) {
                Drawable drawable = j5Var.f25836f[0];
                if ((drawable instanceof l5) && ((y2Var = ((l5) drawable).f26587k) == null || !y2Var.hasImageLoaded())) {
                    return;
                }
                this.f29814q = true;
                if (this.f29806i > this.f29812o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29813p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new mr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new m3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(mr.f27122f);
                ofInt.addUpdateListener(new m3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
