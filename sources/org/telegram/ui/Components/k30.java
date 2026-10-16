package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class k30 extends FrameLayout {
    public float f26195a;
    public float f26196b;
    public boolean f26197c;
    public AnimatorSet d;
    public final j30 e;
    public final ve f26198f;
    public final float h;
    public final m30 f26199n;

    public k30(m30 m30Var, Context context, float f7) {
        super(context);
        this.f26199n = m30Var;
        this.h = f7;
        this.e = new j30(this);
        this.f26198f = new ve(7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        m30 m30Var = this.f26199n;
        if (i12 != m30Var.I || m30Var.J != point.y) {
            m30Var.I = i12;
            m30Var.J = point.y;
            if (m30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f26199n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f26199n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            m30 m30Var2 = m30.f26893d0;
            if (m30Var2 != null) {
                m30 m30Var3 = this.f26199n;
                float f7 = m30Var3.K;
                float f10 = m30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                m30Var2.f26903r.x = (int) com.google.android.gms.internal.play_billing.k3.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                m30Var2.f26903r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                m30Var2.h();
                k30 k30Var = m30Var2.f26895a;
                if (k30Var.getParent() != null) {
                    m30Var2.f26902n.updateViewLayout(k30Var, m30Var2.f26903r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
