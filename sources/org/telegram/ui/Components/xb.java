package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class xb {
    public static xb f41627w;
    public int f41628a;
    public int f41629b;
    public ma f41630c;
    public r1.g d;
    public final cb f41631e;
    public final qa f41632f;
    public final org.telegram.ui.ActionBar.e2 f41633g;
    public final FrameLayout h;
    public final Runnable f41634i;
    public int f41635j;
    public boolean f41636k;
    public boolean f41637l;
    public boolean f41638m;
    public boolean f41639n;
    public int f41640o;
    public wa f41641p;
    public bb f41642q;
    public boolean f41643r;
    public boolean f41644s;
    public boolean f41645t;
    public boolean f41646u;
    public Runnable v;

    public xb() {
        this.f41634i = new la(this, 0);
        this.f41639n = true;
        this.f41643r = true;
        this.f41646u = true;
        this.f41631e = null;
        this.f41632f = null;
        this.f41633g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, wa waVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, waVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        xb xbVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = frameLayout.getChildAt(i7);
                if (childAt instanceof cb) {
                    xbVar = ((cb) childAt).bulletin;
                    break;
                }
                i7++;
            } else {
                xbVar = null;
                break;
            }
        }
        if (xbVar != null) {
            xbVar.c(0L, org.telegram.messenger.np.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        xb xbVar = f41627w;
        if (xbVar != null) {
            xbVar.b();
        }
    }

    public static xb f(FrameLayout frameLayout, cb cbVar, int i7) {
        if (frameLayout == null) {
            return new xb();
        }
        return new xb(null, frameLayout, cbVar, i7);
    }

    public static xb g(org.telegram.ui.ActionBar.e2 e2Var, va vaVar, int i7) {
        if (e2Var == null) {
            return new xb();
        }
        if (e2Var instanceof org.telegram.ui.an) {
            cb.access$000(vaVar, -2, 1);
        } else if (e2Var instanceof org.telegram.ui.yw) {
            cb.access$000(vaVar, -1, 0);
        }
        return new xb(e2Var, e2Var.getBulletinLayoutContainer(), vaVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.np.e1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        cb cbVar = this.f41631e;
        if (cbVar != null && this.f41637l) {
            this.f41637l = false;
            if (f41627w == this) {
                f41627w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f55671a;
            if (cbVar.isLaidOut() || this.f41645t) {
                cbVar.removeCallbacks(this.f41634i);
                if (z10) {
                    cbVar.transitionRunningExit = true;
                    cbVar.delegate = this.f41641p;
                    cbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f10877a = j3;
                        this.f41642q = obj;
                    } else if (cbVar != null && this.f41642q == null) {
                        this.f41642q = cbVar.createTransition();
                    }
                    bb bbVar = this.f41642q;
                    Objects.requireNonNull(cbVar);
                    bbVar.b(cbVar, new na(cbVar, 0), new la(this, 1), new oa(this, 0));
                    return;
                }
            }
            wa waVar = this.f41641p;
            if (waVar != null && !cbVar.top) {
                waVar.c(0.0f);
                this.f41641p.d(this);
            }
            cbVar.onExitTransitionStart();
            cbVar.onExitTransitionEnd();
            cbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.h3(new la(this, 2));
            }
            cbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        cb cbVar;
        if (z10 && this.f41639n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41638m != z11 && (cbVar = this.f41631e) != null) {
            this.f41638m = z11;
            Runnable runnable = this.f41634i;
            if (z11) {
                int i7 = this.f41635j;
                if (i7 >= 0) {
                    cbVar.postDelayed(runnable, i7);
                    return;
                }
                return;
            }
            cbVar.removeCallbacks(runnable);
        }
    }

    public xb j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f41637l && (frameLayout = this.h) != 0) {
            this.f41637l = true;
            cb cbVar = this.f41631e;
            cbVar.setTop(z10);
            CharSequence accessibilityText = cbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = cbVar.getParent();
            qa qaVar = this.f41632f;
            if (parent == qaVar) {
                xb xbVar = f41627w;
                if (xbVar != null) {
                    xbVar.b();
                }
                f41627w = this;
                cbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        xb xbVar2 = xb.this;
                        wa waVar = xbVar2.f41641p;
                        if ((waVar == null || waVar.a()) && !z10) {
                            wa waVar2 = xbVar2.f41641p;
                            if (waVar2 != null) {
                                i17 = waVar2.f(xbVar2.f41628a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = xbVar2.f41640o;
                            if (i18 != i17) {
                                r1.g gVar = xbVar2.d;
                                if (gVar != null && gVar.f55742f) {
                                    gVar.f55748m.f55756i = i17;
                                } else {
                                    r1.g gVar2 = new r1.g(new r1.f(i18));
                                    r1.h hVar = new r1.h();
                                    hVar.f55756i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f55748m = hVar;
                                    xbVar2.d = gVar2;
                                    gVar2.b(new c7(xbVar2, 1));
                                    xbVar2.d.a(new pa(xbVar2, 0));
                                }
                                xbVar2.d.h();
                            }
                        }
                    }
                };
                this.f41630c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                cbVar.addOnLayoutChangeListener(new ra(this, z10));
                if (!this.f41645t) {
                    cbVar.addOnAttachStateChangeListener(new bi.x1(this, 12));
                }
                frameLayout.addView(qaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        cb cbVar = this.f41631e;
        if (cbVar != null) {
            cbVar.updatePosition();
        }
    }

    public xb(org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, cb cbVar, int i7) {
        this.f41634i = new la(this, 0);
        this.f41643r = true;
        this.f41646u = true;
        this.f41631e = cbVar;
        this.f41639n = true ^ (cbVar instanceof db);
        this.f41632f = new qa(this, cbVar, frameLayout);
        this.f41633g = e2Var;
        this.h = frameLayout;
        this.f41635j = i7;
    }
}
