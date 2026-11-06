package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class cc {
    public static cc f32515w;
    public int f32516a;
    public int f32517b;
    public qa f32518c;
    public r1.g d;
    public final gb f32519e;
    public final ua f32520f;
    public final org.telegram.ui.ActionBar.f2 f32521g;
    public final FrameLayout h;
    public final Runnable f32522i;
    public int f32523j;
    public boolean f32524k;
    public boolean f32525l;
    public boolean f32526m;
    public boolean f32527n;
    public int f32528o;
    public ab f32529p;
    public fb f32530q;
    public boolean f32531r;
    public boolean f32532s;
    public boolean f32533t;
    public boolean f32534u;
    public Runnable v;

    public cc() {
        this.f32522i = new pa(this, 0);
        this.f32527n = true;
        this.f32531r = true;
        this.f32534u = true;
        this.f32519e = null;
        this.f32520f = null;
        this.f32521g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ab abVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, abVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        cc ccVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = frameLayout.getChildAt(i7);
                if (childAt instanceof gb) {
                    ccVar = ((gb) childAt).bulletin;
                    break;
                }
                i7++;
            } else {
                ccVar = null;
                break;
            }
        }
        if (ccVar != null) {
            ccVar.c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        cc ccVar = f32515w;
        if (ccVar != null) {
            ccVar.b();
        }
    }

    public static cc f(FrameLayout frameLayout, gb gbVar, int i7) {
        if (frameLayout == null) {
            return new cc();
        }
        return new cc(null, frameLayout, gbVar, i7);
    }

    public static cc g(org.telegram.ui.ActionBar.f2 f2Var, za zaVar, int i7) {
        if (f2Var == null) {
            return new cc();
        }
        if (f2Var instanceof org.telegram.ui.an) {
            gb.access$000(zaVar, -2, 1);
        } else if (f2Var instanceof org.telegram.ui.ww) {
            gb.access$000(zaVar, -1, 0);
        }
        return new cc(f2Var, f2Var.getBulletinLayoutContainer(), zaVar, i7);
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
        gb gbVar = this.f32519e;
        if (gbVar != null && this.f32525l) {
            this.f32525l = false;
            if (f32515w == this) {
                f32515w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f54073a;
            if (gbVar.isLaidOut() || this.f32533t) {
                gbVar.removeCallbacks(this.f32522i);
                if (z9) {
                    gbVar.transitionRunningExit = true;
                    gbVar.delegate = this.f32529p;
                    gbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f11070a = j3;
                        this.f32530q = obj;
                    } else if (gbVar != null && this.f32530q == null) {
                        this.f32530q = gbVar.createTransition();
                    }
                    fb fbVar = this.f32530q;
                    Objects.requireNonNull(gbVar);
                    fbVar.c(gbVar, new ra(gbVar, 0), new pa(this, 1), new sa(this, 0));
                    return;
                }
            }
            ab abVar = this.f32529p;
            if (abVar != null && !gbVar.top) {
                abVar.c(0.0f);
                this.f32529p.d(this);
            }
            gbVar.onExitTransitionStart();
            gbVar.onExitTransitionEnd();
            gbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.h3(new pa(this, 2));
            }
            gbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z9) {
        boolean z10;
        gb gbVar;
        if (z9 && this.f32527n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32526m != z10 && (gbVar = this.f32519e) != null) {
            this.f32526m = z10;
            Runnable runnable = this.f32522i;
            if (z10) {
                int i7 = this.f32523j;
                if (i7 >= 0) {
                    gbVar.postDelayed(runnable, i7);
                    return;
                }
                return;
            }
            gbVar.removeCallbacks(runnable);
        }
    }

    public cc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z9) {
        FrameLayout frameLayout;
        if (!this.f32525l && (frameLayout = this.h) != 0) {
            this.f32525l = true;
            gb gbVar = this.f32519e;
            gbVar.setTop(z9);
            CharSequence accessibilityText = gbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = gbVar.getParent();
            ua uaVar = this.f32520f;
            if (parent == uaVar) {
                cc ccVar = f32515w;
                if (ccVar != null) {
                    ccVar.b();
                }
                f32515w = this;
                gbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        cc ccVar2 = cc.this;
                        ab abVar = ccVar2.f32529p;
                        if ((abVar == null || abVar.a()) && !z9) {
                            ab abVar2 = ccVar2.f32529p;
                            if (abVar2 != null) {
                                i17 = abVar2.f(ccVar2.f32516a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = ccVar2.f32528o;
                            if (i18 != i17) {
                                r1.g gVar = ccVar2.d;
                                if (gVar != null && gVar.f54144f) {
                                    gVar.f54150m.f54158i = i17;
                                } else {
                                    r1.g gVar2 = new r1.g(new r1.f(i18));
                                    r1.h hVar = new r1.h();
                                    hVar.f54158i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f54150m = hVar;
                                    ccVar2.d = gVar2;
                                    gVar2.b(new e7(ccVar2, 1));
                                    ccVar2.d.a(new ta(ccVar2, 0));
                                }
                                ccVar2.d.h();
                            }
                        }
                    }
                };
                this.f32518c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                gbVar.addOnLayoutChangeListener(new va(this, z9));
                if (!this.f32533t) {
                    gbVar.addOnAttachStateChangeListener(new bi.m6(this, 8));
                }
                frameLayout.addView(uaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        gb gbVar = this.f32519e;
        if (gbVar != null) {
            gbVar.updatePosition();
        }
    }

    public cc(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, gb gbVar, int i7) {
        this.f32522i = new pa(this, 0);
        this.f32531r = true;
        this.f32534u = true;
        this.f32519e = gbVar;
        this.f32527n = true ^ (gbVar instanceof hb);
        this.f32520f = new ua(this, gbVar, frameLayout);
        this.f32521g = f2Var;
        this.h = frameLayout;
        this.f32523j = i7;
    }
}
