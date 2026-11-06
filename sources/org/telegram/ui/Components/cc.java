package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class cc {
    public static cc f32506w;
    public int f32507a;
    public int f32508b;
    public qa f32509c;
    public r1.g d;
    public final gb f32510e;
    public final ua f32511f;
    public final org.telegram.ui.ActionBar.f2 f32512g;
    public final FrameLayout h;
    public final Runnable f32513i;
    public int f32514j;
    public boolean f32515k;
    public boolean f32516l;
    public boolean f32517m;
    public boolean f32518n;
    public int f32519o;
    public ab f32520p;
    public fb f32521q;
    public boolean f32522r;
    public boolean f32523s;
    public boolean f32524t;
    public boolean f32525u;
    public Runnable v;

    public cc() {
        this.f32513i = new pa(this, 0);
        this.f32518n = true;
        this.f32522r = true;
        this.f32525u = true;
        this.f32510e = null;
        this.f32511f = null;
        this.f32512g = null;
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
        cc ccVar = f32506w;
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
        gb gbVar = this.f32510e;
        if (gbVar != null && this.f32516l) {
            this.f32516l = false;
            if (f32506w == this) {
                f32506w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f54097a;
            if (gbVar.isLaidOut() || this.f32524t) {
                gbVar.removeCallbacks(this.f32513i);
                if (z9) {
                    gbVar.transitionRunningExit = true;
                    gbVar.delegate = this.f32520p;
                    gbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f11070a = j3;
                        this.f32521q = obj;
                    } else if (gbVar != null && this.f32521q == null) {
                        this.f32521q = gbVar.createTransition();
                    }
                    fb fbVar = this.f32521q;
                    Objects.requireNonNull(gbVar);
                    fbVar.c(gbVar, new ra(gbVar, 0), new pa(this, 1), new sa(this, 0));
                    return;
                }
            }
            ab abVar = this.f32520p;
            if (abVar != null && !gbVar.top) {
                abVar.c(0.0f);
                this.f32520p.d(this);
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
        if (z9 && this.f32518n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32517m != z10 && (gbVar = this.f32510e) != null) {
            this.f32517m = z10;
            Runnable runnable = this.f32513i;
            if (z10) {
                int i7 = this.f32514j;
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
        if (!this.f32516l && (frameLayout = this.h) != 0) {
            this.f32516l = true;
            gb gbVar = this.f32510e;
            gbVar.setTop(z9);
            CharSequence accessibilityText = gbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = gbVar.getParent();
            ua uaVar = this.f32511f;
            if (parent == uaVar) {
                cc ccVar = f32506w;
                if (ccVar != null) {
                    ccVar.b();
                }
                f32506w = this;
                gbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        cc ccVar2 = cc.this;
                        ab abVar = ccVar2.f32520p;
                        if ((abVar == null || abVar.a()) && !z9) {
                            ab abVar2 = ccVar2.f32520p;
                            if (abVar2 != null) {
                                i17 = abVar2.f(ccVar2.f32507a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = ccVar2.f32519o;
                            if (i18 != i17) {
                                r1.g gVar = ccVar2.d;
                                if (gVar != null && gVar.f54168f) {
                                    gVar.f54174m.f54182i = i17;
                                } else {
                                    r1.g gVar2 = new r1.g(new r1.f(i18));
                                    r1.h hVar = new r1.h();
                                    hVar.f54182i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f54174m = hVar;
                                    ccVar2.d = gVar2;
                                    gVar2.b(new e7(ccVar2, 1));
                                    ccVar2.d.a(new ta(ccVar2, 0));
                                }
                                ccVar2.d.h();
                            }
                        }
                    }
                };
                this.f32509c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                gbVar.addOnLayoutChangeListener(new va(this, z9));
                if (!this.f32524t) {
                    gbVar.addOnAttachStateChangeListener(new bi.m6(this, 8));
                }
                frameLayout.addView(uaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        gb gbVar = this.f32510e;
        if (gbVar != null) {
            gbVar.updatePosition();
        }
    }

    public cc(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, gb gbVar, int i7) {
        this.f32513i = new pa(this, 0);
        this.f32522r = true;
        this.f32525u = true;
        this.f32510e = gbVar;
        this.f32518n = true ^ (gbVar instanceof hb);
        this.f32511f = new ua(this, gbVar, frameLayout);
        this.f32512g = f2Var;
        this.h = frameLayout;
        this.f32514j = i7;
    }
}
