package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class wb {
    public static wb f32194w;
    public int f32195a;
    public int f32196b;
    public ka f32197c;
    public o1.j d;
    public final bb e;
    public final oa f32198f;
    public final org.telegram.ui.ActionBar.k2 f32199g;
    public final FrameLayout h;
    public final Runnable f32200i;
    public int f32201j;
    public boolean f32202k;
    public boolean f32203l;
    public boolean f32204m;
    public boolean f32205n;
    public int f32206o;
    public ua f32207p;
    public ab f32208q;
    public boolean f32209r;
    public boolean f32210s;
    public boolean f32211t;
    public boolean f32212u;
    public Runnable v;

    public wb() {
        this.f32200i = new ja(this, 0);
        this.f32205n = true;
        this.f32209r = true;
        this.f32212u = true;
        this.e = null;
        this.f32198f = null;
        this.f32199g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ua uaVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, uaVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        wb wbVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof bb) {
                    wbVar = ((bb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                wbVar = null;
                break;
            }
        }
        if (wbVar != null) {
            wbVar.c(0L, org.telegram.messenger.wp.d1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        wb wbVar = f32194w;
        if (wbVar != null) {
            wbVar.b();
        }
    }

    public static wb f(FrameLayout frameLayout, bb bbVar, int i10) {
        if (frameLayout == null) {
            return new wb();
        }
        return new wb(null, frameLayout, bbVar, i10);
    }

    public static wb g(org.telegram.ui.ActionBar.k2 k2Var, ta taVar, int i10) {
        if (k2Var == null) {
            return new wb();
        }
        if (k2Var instanceof org.telegram.ui.un) {
            bb.access$000(taVar, -2, 1);
        } else if (k2Var instanceof org.telegram.ui.zx) {
            bb.access$000(taVar, -1, 0);
        }
        return new wb(k2Var, k2Var.getBulletinLayoutContainer(), taVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.wp.d1().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        bb bbVar = this.e;
        if (bbVar != null && this.f32203l) {
            this.f32203l = false;
            if (f32194w == this) {
                f32194w = null;
            }
            WeakHashMap weakHashMap = r0.h0.f46134a;
            if (bbVar.isLaidOut() || this.f32211t) {
                bbVar.removeCallbacks(this.f32200i);
                if (z10) {
                    bbVar.transitionRunningExit = true;
                    bbVar.delegate = this.f32207p;
                    bbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f3687a = j10;
                        this.f32208q = obj;
                    } else if (bbVar != null && this.f32208q == null) {
                        this.f32208q = bbVar.createTransition();
                    }
                    ab abVar = this.f32208q;
                    Objects.requireNonNull(bbVar);
                    abVar.m(bbVar, new la(bbVar, 0), new ja(this, 1), new ma(this, 0));
                    return;
                }
            }
            ua uaVar = this.f32207p;
            if (uaVar != null && !bbVar.top) {
                uaVar.c(0.0f);
                this.f32207p.d(this);
            }
            bbVar.onExitTransitionStart();
            bbVar.onExitTransitionEnd();
            bbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.i0.g3(new ja(this, 2));
            }
            bbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        bb bbVar;
        if (z10 && this.f32205n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32204m != z11 && (bbVar = this.e) != null) {
            this.f32204m = z11;
            Runnable runnable = this.f32200i;
            if (z11) {
                int i10 = this.f32201j;
                if (i10 >= 0) {
                    bbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            bbVar.removeCallbacks(runnable);
        }
    }

    public wb j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f32203l && (frameLayout = this.h) != 0) {
            this.f32203l = true;
            bb bbVar = this.e;
            bbVar.setTop(z10);
            CharSequence accessibilityText = bbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.i0.i2(accessibilityText);
            }
            ViewParent parent = bbVar.getParent();
            oa oaVar = this.f32198f;
            if (parent == oaVar) {
                wb wbVar = f32194w;
                if (wbVar != null) {
                    wbVar.b();
                }
                f32194w = this;
                bbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        wb wbVar2 = wb.this;
                        ua uaVar = wbVar2.f32207p;
                        if ((uaVar == null || uaVar.a()) && !z10) {
                            ua uaVar2 = wbVar2.f32207p;
                            if (uaVar2 != null) {
                                i18 = uaVar2.f(wbVar2.f32195a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = wbVar2.f32206o;
                            if (i19 != i18) {
                                o1.j jVar = wbVar2.d;
                                if (jVar != null && jVar.f13952f) {
                                    jVar.f13958m.f13965i = i18;
                                } else {
                                    o1.j jVar2 = new o1.j(new o1.i(i19));
                                    o1.k kVar = new o1.k();
                                    kVar.f13965i = i18;
                                    kVar.b(900.0f);
                                    kVar.a(1.0f);
                                    jVar2.f13958m = kVar;
                                    wbVar2.d = jVar2;
                                    jVar2.b(new a7(wbVar2, 1));
                                    wbVar2.d.a(new na(wbVar2, 0));
                                }
                                wbVar2.d.h();
                            }
                        }
                    }
                };
                this.f32197c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                bbVar.addOnLayoutChangeListener(new pa(this, z10));
                if (!this.f32211t) {
                    bbVar.addOnAttachStateChangeListener(new l.d(this, 6));
                }
                frameLayout.addView(oaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        bb bbVar = this.e;
        if (bbVar != null) {
            bbVar.updatePosition();
        }
    }

    public wb(org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, bb bbVar, int i10) {
        this.f32200i = new ja(this, 0);
        this.f32209r = true;
        this.f32212u = true;
        this.e = bbVar;
        this.f32205n = true ^ (bbVar instanceof cb);
        this.f32198f = new oa(this, bbVar, frameLayout);
        this.f32199g = k2Var;
        this.h = frameLayout;
        this.f32201j = i10;
    }
}
