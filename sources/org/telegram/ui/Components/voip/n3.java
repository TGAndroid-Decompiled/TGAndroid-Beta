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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k5;

public final class n3 {

    public final i5 f33749a;

    public ValueAnimator f33750b;

    public int f33751c;
    public int d;

    public int f33752e;

    public int f33753f;

    public int f33754g;
    public int h;

    public int f33755i;

    public int f33756j;

    public final y2 f33757k;

    public final int f33758l;

    public int f33759m = 0;

    public float f33760n = 0.0f;

    public int f33761o;

    public int f33762p;

    public boolean f33763q;

    public ValueAnimator f33764r;

    public n3(TLRPC.User user, y2 y2Var, int i10) {
        this.f33757k = y2Var;
        this.f33758l = i10;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!zIsEnabled || profileEmojiId == 0) {
            return;
        }
        i5 i5Var = new i5(i10, 13, y2Var, false);
        this.f33749a = i5Var;
        i5Var.j(profileEmojiId, false);
        i5Var.k(-16777216);
        i5Var.v = this.f33759m;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33750b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.t2(17, this, y2Var));
        this.f33752e = AndroidUtilities.dp(12.0f) + this.f33751c;
        this.f33753f = AndroidUtilities.dp(12.0f) + this.d;
        this.f33751c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.f33750b.setInterpolator(new LinearInterpolator());
        this.f33750b.addListener(new m3(this));
        this.f33750b.setDuration(2000L);
    }

    public final void a(Canvas canvas) {
        i5 i5Var = this.f33749a;
        if (i5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f33760n;
        canvas.scale(f10, f10, this.f33761o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f33755i - this.f33762p, this.f33756j);
        int i10 = this.f33754g;
        int i11 = this.h;
        int i12 = this.f33758l;
        i5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        i5Var.v = this.f33759m;
        i5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        jh.y2 y2Var;
        i5 i5Var = this.f33749a;
        if (i5Var == null) {
            return;
        }
        this.f33755i = i10;
        this.f33756j = i11;
        this.f33757k.invalidate();
        if (this.f33763q) {
            return;
        }
        int i12 = 0;
        Drawable drawable = i5Var.f29229f[0];
        if (!(drawable instanceof k5) || ((y2Var = ((k5) drawable).f29961k) != null && y2Var.hasImageLoaded())) {
            int i13 = 1;
            this.f33763q = true;
            this.f33762p = this.f33755i > this.f33761o / 2 ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new er(0.34d, 1.36d, 0.64d, 1.0d));
            valueAnimatorOfFloat.addUpdateListener(new l3(this, i12));
            long j10 = 350;
            valueAnimatorOfFloat.setDuration(j10);
            long j11 = 180;
            valueAnimatorOfFloat.setStartDelay(j11);
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 255);
            valueAnimatorOfInt.setInterpolator(er.f28122f);
            valueAnimatorOfInt.addUpdateListener(new l3(this, i13));
            valueAnimatorOfInt.setStartDelay(j11);
            valueAnimatorOfInt.setDuration(j10);
            valueAnimatorOfInt.start();
        }
    }
}
