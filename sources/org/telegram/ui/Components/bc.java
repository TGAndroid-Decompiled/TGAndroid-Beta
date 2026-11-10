package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class bc {
    public static bc f32195w;
    public int f32196a;
    public int f32197b;
    public pa f32198c;
    public r1.g d;
    public final fb f32199e;
    public final ta f32200f;
    public final org.telegram.ui.ActionBar.f2 f32201g;
    public final FrameLayout h;
    public final Runnable f32202i;
    public int f32203j;
    public boolean f32204k;
    public boolean f32205l;
    public boolean f32206m;
    public boolean f32207n;
    public int f32208o;
    public za f32209p;
    public eb f32210q;
    public boolean f32211r;
    public boolean f32212s;
    public boolean f32213t;
    public boolean f32214u;
    public Runnable v;

    public bc() {
        this.f32202i = new oa(this, 0);
        this.f32207n = true;
        this.f32211r = true;
        this.f32214u = true;
        this.f32199e = null;
        this.f32200f = null;
        this.f32201g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, za zaVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, zaVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        bc bcVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = frameLayout.getChildAt(i7);
                if (childAt instanceof fb) {
                    bcVar = ((fb) childAt).bulletin;
                    break;
                }
                i7++;
            } else {
                bcVar = null;
                break;
            }
        }
        if (bcVar != null) {
            bcVar.c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        bc bcVar = f32195w;
        if (bcVar != null) {
            bcVar.b();
        }
    }

    public static bc f(FrameLayout frameLayout, fb fbVar, int i7) {
        if (frameLayout == null) {
            return new bc();
        }
        return new bc(null, frameLayout, fbVar, i7);
    }

    public static bc g(org.telegram.ui.ActionBar.f2 f2Var, ya yaVar, int i7) {
        if (f2Var == null) {
            return new bc();
        }
        if (f2Var instanceof org.telegram.ui.cn) {
            fb.access$000(yaVar, -2, 1);
        } else if (f2Var instanceof org.telegram.ui.zw) {
            fb.access$000(yaVar, -1, 0);
        }
        return new bc(f2Var, f2Var.getBulletinLayoutContainer(), yaVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z9) {
        fb fbVar = this.f32199e;
        if (fbVar != null && this.f32205l) {
            this.f32205l = false;
            if (f32195w == this) {
                f32195w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f54202a;
            if (fbVar.isLaidOut() || this.f32213t) {
                fbVar.removeCallbacks(this.f32202i);
                if (z9) {
                    fbVar.transitionRunningExit = true;
                    fbVar.delegate = this.f32209p;
                    fbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f11075a = j3;
                        this.f32210q = obj;
                    } else if (fbVar != null && this.f32210q == null) {
                        this.f32210q = fbVar.createTransition();
                    }
                    eb ebVar = this.f32210q;
                    Objects.requireNonNull(fbVar);
                    ebVar.c(fbVar, new qa(fbVar, 0), new oa(this, 1), new ra(this, 0));
                    return;
                }
            }
            za zaVar = this.f32209p;
            if (zaVar != null && !fbVar.top) {
                zaVar.c(0.0f);
                this.f32209p.d(this);
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

    public final void i(boolean z9) {
        boolean z10;
        fb fbVar;
        if (z9 && this.f32207n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32206m != z10 && (fbVar = this.f32199e) != null) {
            this.f32206m = z10;
            Runnable runnable = this.f32202i;
            if (z10) {
                int i7 = this.f32203j;
                if (i7 >= 0) {
                    fbVar.postDelayed(runnable, i7);
                    return;
                }
                return;
            }
            fbVar.removeCallbacks(runnable);
        }
    }

    public bc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z9) {
        FrameLayout frameLayout;
        if (!this.f32205l && (frameLayout = this.h) != 0) {
            this.f32205l = true;
            fb fbVar = this.f32199e;
            fbVar.setTop(z9);
            CharSequence accessibilityText = fbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = fbVar.getParent();
            ta taVar = this.f32200f;
            if (parent == taVar) {
                bc bcVar = f32195w;
                if (bcVar != null) {
                    bcVar.b();
                }
                f32195w = this;
                fbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        bc bcVar2 = bc.this;
                        za zaVar = bcVar2.f32209p;
                        if ((zaVar == null || zaVar.a()) && !z9) {
                            za zaVar2 = bcVar2.f32209p;
                            if (zaVar2 != null) {
                                i17 = zaVar2.f(bcVar2.f32196a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = bcVar2.f32208o;
                            if (i18 != i17) {
                                r1.g gVar = bcVar2.d;
                                if (gVar != null && gVar.f54273f) {
                                    gVar.f54279m.f54287i = i17;
                                } else {
                                    r1.g gVar2 = new r1.g(new r1.f(i18));
                                    r1.h hVar = new r1.h();
                                    hVar.f54287i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f54279m = hVar;
                                    bcVar2.d = gVar2;
                                    gVar2.b(new d7(bcVar2, 1));
                                    bcVar2.d.a(new sa(bcVar2, 0));
                                }
                                bcVar2.d.h();
                            }
                        }
                    }
                };
                this.f32198c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                fbVar.addOnLayoutChangeListener(new ua(this, z9));
                if (!this.f32213t) {
                    fbVar.addOnAttachStateChangeListener(new bi.m6(this, 8));
                }
                frameLayout.addView(taVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        fb fbVar = this.f32199e;
        if (fbVar != null) {
            fbVar.updatePosition();
        }
    }

    public bc(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, fb fbVar, int i7) {
        this.f32202i = new oa(this, 0);
        this.f32211r = true;
        this.f32214u = true;
        this.f32199e = fbVar;
        this.f32207n = true ^ (fbVar instanceof gb);
        this.f32200f = new ta(this, fbVar, frameLayout);
        this.f32201g = f2Var;
        this.h = frameLayout;
        this.f32203j = i7;
    }
}
