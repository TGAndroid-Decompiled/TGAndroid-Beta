package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import bi.b4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.s5;
public final class n3 {
    public final q5 f30339a;
    public ValueAnimator f30340b;
    public int f30341c;
    public int d;
    public int e;
    public int f30342f;
    public int f30343g;
    public int h;
    public int f30344i;
    public int f30345j;
    public final y2 f30346k;
    public final int f30347l;
    public int f30348m = 0;
    public float f30349n = 0.0f;
    public int f30350o;
    public int f30351p;
    public boolean f30352q;
    public ValueAnimator f30353r;

    public n3(TLRPC.User user, y2 y2Var, int i10) {
        this.f30346k = y2Var;
        this.f30347l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, y2Var, false);
            this.f30339a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f30348m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f30340b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(21, this, y2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f30341c;
            this.f30342f = AndroidUtilities.dp(12.0f) + this.d;
            this.f30341c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f30340b.setInterpolator(new LinearInterpolator());
            this.f30340b.addListener(new m3(this));
            this.f30340b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f30339a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f30349n;
        canvas.scale(f7, f7, this.f30350o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f30344i - this.f30351p, this.f30345j);
        int i10 = this.f30343g;
        int i11 = this.h;
        int i12 = this.f30347l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f30348m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        b4 b4Var;
        q5 q5Var = this.f30339a;
        if (q5Var != null) {
            this.f30344i = i10;
            this.f30345j = i11;
            this.f30346k.invalidate();
            if (!this.f30352q) {
                Drawable drawable = q5Var.f28516f[0];
                if ((drawable instanceof s5) && ((b4Var = ((s5) drawable).f29031k) == null || !b4Var.hasImageLoaded())) {
                    return;
                }
                this.f30352q = true;
                if (this.f30344i > this.f30350o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f30351p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new es(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new l3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(es.f24771f);
                ofInt.addUpdateListener(new l3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
