package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class xa extends FrameLayout {

    public final jb f34559a;

    public final Rect f34560b;

    public final GestureDetector f34561c;
    public boolean d;

    public boolean f34562e;

    public float f34563f;
    public float h;

    public float f34564n;

    public boolean f34565r;

    public boolean f34566s;
    public boolean v;

    public boolean f34567w;

    public final FrameLayout f34568x;

    public final ec f34569y;

    public xa(ec ecVar, jb jbVar, FrameLayout frameLayout) {
        super(jbVar.getContext());
        this.f34569y = ecVar;
        this.f34568x = frameLayout;
        this.f34560b = new Rect();
        this.f34559a = jbVar;
        GestureDetector gestureDetector = new GestureDetector(jbVar.getContext(), new tb(this, jbVar));
        this.f34561c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(jbVar);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = this.f34562e;
        jb jbVar = this.f34559a;
        if (!z10) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = this.f34560b;
            jbVar.getHitRect(rect);
            if (!rect.contains((int) x8, (int) y10)) {
                return false;
            }
        }
        this.f34561c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.f34568x;
        ec ecVar = this.f34569y;
        if (actionMasked == 0) {
            if (!this.f34562e && !this.f34566s) {
                jbVar.animate().cancel();
                this.f34564n = 0.0f;
                this.h = 0.0f;
                this.f34565r = false;
                this.f34563f = jbVar.getTranslationX();
                System.currentTimeMillis();
                ec ecVar2 = jbVar.bulletin;
                this.d = ecVar2 == null || ecVar2.f28023m;
                this.f34562e = true;
                ecVar.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (jbVar.onClickListener != null) {
                    jbVar.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f34562e) {
            if (this.f34566s) {
                if (actionMasked == 1 && jbVar.isPressed() && (onClickListener = jbVar.onClickListener) != null && !this.f34565r) {
                    onClickListener.onClick(jbVar);
                }
            } else if (Math.abs(this.f34563f) > jbVar.getWidth() / 3.0f) {
                float fSignum = Math.signum(this.f34563f) * jbVar.getWidth();
                float f10 = this.f34563f;
                jbVar.animate().translationX(fSignum).alpha(((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) < 0 && this.v) || ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 && this.f34567w) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.e0(this, fSignum, 1)).start();
            } else {
                jbVar.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                if (actionMasked == 1) {
                    onClickListener.onClick(jbVar);
                }
            }
            this.f34562e = false;
            ecVar.i(true);
            if (frameLayout.getParent() != null) {
                frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (jbVar.onClickListener != null) {
                jbVar.setPressed(false);
            }
        }
        return true;
    }
}
