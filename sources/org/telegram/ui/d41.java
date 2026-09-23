package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class d41 extends AnimatorListenerAdapter {
    public final int f32504a;
    public final e41 f32505b;

    public d41(e41 e41Var, int i10) {
        this.f32504a = i10;
        this.f32505b = e41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32504a) {
            case 0:
                e41 e41Var = this.f32505b;
                if (e41Var.h != null) {
                    e41Var.h = null;
                    e41Var.e = 0.0f;
                    e41Var.g();
                    e41Var.f32798n.unlock();
                    sx sxVar = e41Var.f32794a;
                    if (sxVar != null) {
                        sxVar.onPause();
                        e41Var.f32794a.onFragmentDestroy();
                        e41Var.removeAllViews();
                        e41Var.f32794a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    e41Var.d(false);
                    return;
                }
                return;
            default:
                e41 e41Var2 = this.f32505b;
                if (e41Var2.h != null) {
                    e41Var2.h = null;
                    e41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
