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
import org.telegram.ui.Components.rr;
public final class p3 {
    public final o5 f29544a;
    public ValueAnimator f29545b;
    public int f29546c;
    public int d;
    public int e;
    public int f29547f;
    public int f29548g;
    public int h;
    public int f29549i;
    public int f29550j;
    public final a3 f29551k;
    public final int f29552l;
    public int f29553m = 0;
    public float f29554n = 0.0f;
    public int f29555o;
    public int f29556p;
    public boolean f29557q;
    public ValueAnimator f29558r;

    public p3(TLRPC.User user, a3 a3Var, int i10) {
        this.f29551k = a3Var;
        this.f29552l = i10;
        boolean isEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (isEnabled && profileEmojiId != 0) {
            o5 o5Var = new o5(i10, 13, a3Var, false);
            this.f29544a = o5Var;
            o5Var.j(profileEmojiId, false);
            o5Var.k(-16777216);
            o5Var.v = this.f29553m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29545b = ofFloat;
            ofFloat.addUpdateListener(new ai.x(20, this, a3Var));
            this.e = AndroidUtilities.dp(12.0f) + this.f29546c;
            this.f29547f = AndroidUtilities.dp(12.0f) + this.d;
            this.f29546c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
            this.f29545b.setInterpolator(new LinearInterpolator());
            this.f29545b.addListener(new o3(this));
            this.f29545b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f29544a;
        if (o5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f29554n;
        canvas.scale(f7, f7, this.f29555o / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.f29549i - this.f29556p, this.f29550j);
        int i10 = this.f29548g;
        int i11 = this.h;
        int i12 = this.f29552l;
        o5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        o5Var.v = this.f29553m;
        o5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        l4 l4Var;
        o5 o5Var = this.f29544a;
        if (o5Var != null) {
            this.f29549i = i10;
            this.f29550j = i11;
            this.f29551k.invalidate();
            if (!this.f29557q) {
                Drawable drawable = o5Var.f26916f[0];
                if ((drawable instanceof q5) && ((l4Var = ((q5) drawable).f27498k) == null || !l4Var.hasImageLoaded())) {
                    return;
                }
                this.f29557q = true;
                if (this.f29549i > this.f29555o / 2) {
                    i12 = AndroidUtilities.dp(12);
                } else {
                    i12 = -AndroidUtilities.dp(12);
                }
                this.f29556p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new rr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new n3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(rr.f28022f);
                ofInt.addUpdateListener(new n3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
