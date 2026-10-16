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
    public final q5 f30011a;
    public ValueAnimator f30012b;
    public int f30013c;
    public int d;
    public int e;
    public int f30014f;
    public int f30015g;
    public int h;
    public int f30016i;
    public int f30017j;
    public final y2 f30018k;
    public final int f30019l;
    public int f30020m = 0;
    public float f30021n = 0.0f;
    public int f30022o;
    public int f30023p;
    public boolean f30024q;
    public ValueAnimator f30025r;

    public n3(TLRPC.User user, y2 y2Var, int i10) {
        this.f30018k = y2Var;
        this.f30019l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            q5 q5Var = new q5(i10, 13, y2Var, false);
            this.f30011a = q5Var;
            q5Var.j(profileEmojiId, false);
            q5Var.k(-16777216);
            q5Var.v = this.f30020m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f30012b = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(21, this, y2Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f30013c;
            this.f30014f = AndroidUtilities.dp(12.0f) + this.d;
            this.f30013c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f30012b.setInterpolator(new LinearInterpolator());
            this.f30012b.addListener(new m3(this));
            this.f30012b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f30011a;
        if (q5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f30021n;
        canvas.scale(f7, f7, this.f30022o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f30016i - this.f30023p, this.f30017j);
        int i10 = this.f30015g;
        int i11 = this.h;
        int i12 = this.f30019l;
        q5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        q5Var.v = this.f30020m;
        q5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        b4 b4Var;
        q5 q5Var = this.f30011a;
        if (q5Var != null) {
            this.f30016i = i10;
            this.f30017j = i11;
            this.f30018k.invalidate();
            if (!this.f30024q) {
                Drawable drawable = q5Var.f28197f[0];
                if ((drawable instanceof s5) && ((b4Var = ((s5) drawable).f28739k) == null || !b4Var.hasImageLoaded())) {
                    return;
                }
                this.f30024q = true;
                if (this.f30016i > this.f30022o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f30023p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new es(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new l3(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(es.f24465f);
                ofInt.addUpdateListener(new l3(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
