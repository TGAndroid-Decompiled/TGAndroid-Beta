package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class ac {
    public static ac f31784w;
    public int f31785a;
    public int f31786b;
    public pa f31787c;
    public q1.g d;
    public final fb f31788e;
    public final ta f31789f;
    public final org.telegram.ui.ActionBar.d2 f31790g;
    public final FrameLayout h;
    public final Runnable f31791i;
    public int f31792j;
    public boolean f31793k;
    public boolean f31794l;
    public boolean f31795m;
    public boolean f31796n;
    public int f31797o;
    public za f31798p;
    public eb f31799q;
    public boolean f31800r;
    public boolean f31801s;
    public boolean f31802t;
    public boolean f31803u;
    public Runnable v;

    public ac() {
        this.f31791i = new oa(this, 0);
        this.f31796n = true;
        this.f31800r = true;
        this.f31803u = true;
        this.f31788e = null;
        this.f31789f = null;
        this.f31790g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, za zaVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, zaVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        ac acVar;
        int childCount = frameLayout.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 < childCount) {
                View childAt = frameLayout.getChildAt(i3);
                if (childAt instanceof fb) {
                    acVar = ((fb) childAt).bulletin;
                    break;
                }
                i3++;
            } else {
                acVar = null;
                break;
            }
        }
        if (acVar != null) {
            acVar.c(0L, org.telegram.messenger.hp.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        ac acVar = f31784w;
        if (acVar != null) {
            acVar.b();
        }
    }

    public static ac f(FrameLayout frameLayout, fb fbVar, int i3) {
        if (frameLayout == null) {
            return new ac();
        }
        return new ac(null, frameLayout, fbVar, i3);
    }

    public static ac g(org.telegram.ui.ActionBar.d2 d2Var, ya yaVar, int i3) {
        if (d2Var == null) {
            return new ac();
        }
        if (d2Var instanceof org.telegram.ui.wm) {
            fb.access$000(yaVar, -2, 1);
        } else if (d2Var instanceof org.telegram.ui.uw) {
            fb.access$000(yaVar, -1, 0);
        }
        return new ac(d2Var, d2Var.getBulletinLayoutContainer(), yaVar, i3);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.hp.e1().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        fb fbVar = this.f31788e;
        if (fbVar != null && this.f31794l) {
            this.f31794l = false;
            if (f31784w == this) {
                f31784w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f54015a;
            if (fbVar.isLaidOut() || this.f31802t) {
                fbVar.removeCallbacks(this.f31791i);
                if (z10) {
                    fbVar.transitionRunningExit = true;
                    fbVar.delegate = this.f31798p;
                    fbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f9506a = j10;
                        this.f31799q = obj;
                    } else if (fbVar != null && this.f31799q == null) {
                        this.f31799q = fbVar.createTransition();
                    }
                    eb ebVar = this.f31799q;
                    Objects.requireNonNull(fbVar);
                    ebVar.e(fbVar, new qa(fbVar, 0), new oa(this, 1), new ra(this, 0));
                    return;
                }
            }
            za zaVar = this.f31798p;
            if (zaVar != null && !fbVar.top) {
                zaVar.c(0.0f);
                this.f31798p.d(this);
            }
            fbVar.onExitTransitionStart();
            fbVar.onExitTransitionEnd();
            fbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.h3(new oa(this, 2));
            }
            fbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        fb fbVar;
        if (z10 && this.f31796n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f31795m != z11 && (fbVar = this.f31788e) != null) {
            this.f31795m = z11;
            Runnable runnable = this.f31791i;
            if (z11) {
                int i3 = this.f31792j;
                if (i3 >= 0) {
                    fbVar.postDelayed(runnable, i3);
                    return;
                }
                return;
            }
            fbVar.removeCallbacks(runnable);
        }
    }

    public ac j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f31794l && (frameLayout = this.h) != 0) {
            this.f31794l = true;
            fb fbVar = this.f31788e;
            fbVar.setTop(z10);
            CharSequence accessibilityText = fbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = fbVar.getParent();
            ta taVar = this.f31789f;
            if (parent == taVar) {
                ac acVar = f31784w;
                if (acVar != null) {
                    acVar.b();
                }
                f31784w = this;
                fbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        ac acVar2 = ac.this;
                        za zaVar = acVar2.f31798p;
                        if ((zaVar == null || zaVar.a()) && !z10) {
                            za zaVar2 = acVar2.f31798p;
                            if (zaVar2 != null) {
                                i17 = zaVar2.f(acVar2.f31785a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = acVar2.f31797o;
                            if (i18 != i17) {
                                q1.g gVar = acVar2.d;
                                if (gVar != null && gVar.f53647f) {
                                    gVar.f53653m.f53661i = i17;
                                } else {
                                    q1.g gVar2 = new q1.g(new q1.f(i18));
                                    q1.h hVar = new q1.h();
                                    hVar.f53661i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f53653m = hVar;
                                    acVar2.d = gVar2;
                                    gVar2.b(new c7(acVar2, 1));
                                    acVar2.d.a(new sa(acVar2, 0));
                                }
                                acVar2.d.h();
                            }
                        }
                    }
                };
                this.f31787c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                fbVar.addOnLayoutChangeListener(new ua(this, z10));
                if (!this.f31802t) {
                    fbVar.addOnAttachStateChangeListener(new ai.f2(this, 12));
                }
                frameLayout.addView(taVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        fb fbVar = this.f31788e;
        if (fbVar != null) {
            fbVar.updatePosition();
        }
    }

    public ac(org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, fb fbVar, int i3) {
        this.f31791i = new oa(this, 0);
        this.f31800r = true;
        this.f31803u = true;
        this.f31788e = fbVar;
        this.f31796n = true ^ (fbVar instanceof gb);
        this.f31789f = new ta(this, fbVar, frameLayout);
        this.f31790g = d2Var;
        this.h = frameLayout;
        this.f31792j = i3;
    }
}
