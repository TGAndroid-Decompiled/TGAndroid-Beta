package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class oc {
    public static oc f29196w;
    public int f29197a;
    public int f29198b;
    public cb f29199c;
    public o1.k d;
    public final sb e;
    public final gb f29200f;
    public final org.telegram.ui.ActionBar.o2 f29201g;
    public final FrameLayout h;
    public final Runnable f29202i;
    public int f29203j;
    public boolean f29204k;
    public boolean f29205l;
    public boolean f29206m;
    public boolean f29207n;
    public int f29208o;
    public mb f29209p;
    public rb f29210q;
    public boolean f29211r;
    public boolean f29212s;
    public boolean f29213t;
    public boolean f29214u;
    public Runnable v;

    public oc() {
        this.f29202i = new bb(this, 0);
        this.f29207n = true;
        this.f29211r = true;
        this.f29214u = true;
        this.e = null;
        this.f29200f = null;
        this.f29201g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, mb mbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, mbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        oc ocVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof sb) {
                    ocVar = ((sb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                ocVar = null;
                break;
            }
        }
        if (ocVar != null) {
            ocVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        oc ocVar = f29196w;
        if (ocVar != null) {
            ocVar.b();
        }
    }

    public static oc f(FrameLayout frameLayout, sb sbVar, int i10) {
        if (frameLayout == null) {
            return new oc();
        }
        return new oc(null, frameLayout, sbVar, i10);
    }

    public static oc g(org.telegram.ui.ActionBar.o2 o2Var, lb lbVar, int i10) {
        if (o2Var == null) {
            return new oc();
        }
        if (o2Var instanceof org.telegram.ui.sn) {
            sb.access$000(lbVar, -2, 1);
        } else if (o2Var instanceof org.telegram.ui.ey) {
            sb.access$000(lbVar, -1, 0);
        }
        return new oc(o2Var, o2Var.getBulletinLayoutContainer(), lbVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        sb sbVar = this.e;
        if (sbVar != null && this.f29205l) {
            this.f29205l = false;
            if (f29196w == this) {
                f29196w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f45241a;
            if (sbVar.isLaidOut() || this.f29213t) {
                sbVar.removeCallbacks(this.f29202i);
                if (z10) {
                    sbVar.transitionRunningExit = true;
                    sbVar.delegate = this.f29209p;
                    sbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f4664a = j10;
                        this.f29210q = obj;
                    } else if (sbVar != null && this.f29210q == null) {
                        this.f29210q = sbVar.createTransition();
                    }
                    rb rbVar = this.f29210q;
                    Objects.requireNonNull(sbVar);
                    rbVar.c(sbVar, new db(sbVar, 0), new bb(this, 1), new eb(this, 0));
                    return;
                }
            }
            mb mbVar = this.f29209p;
            if (mbVar != null && !sbVar.top) {
                mbVar.c(0.0f);
                this.f29209p.d(this);
            }
            sbVar.onExitTransitionStart();
            sbVar.onExitTransitionEnd();
            sbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new bb(this, 2));
            }
            sbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        sb sbVar;
        if (z10 && this.f29207n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29206m != z11 && (sbVar = this.e) != null) {
            this.f29206m = z11;
            Runnable runnable = this.f29202i;
            if (z11) {
                int i10 = this.f29203j;
                if (i10 >= 0) {
                    sbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            sbVar.removeCallbacks(runnable);
        }
    }

    public oc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f29205l && (frameLayout = this.h) != 0) {
            this.f29205l = true;
            sb sbVar = this.e;
            sbVar.setTop(z10);
            CharSequence accessibilityText = sbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = sbVar.getParent();
            gb gbVar = this.f29200f;
            if (parent == gbVar) {
                oc ocVar = f29196w;
                if (ocVar != null) {
                    ocVar.b();
                }
                f29196w = this;
                sbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        oc ocVar2 = oc.this;
                        mb mbVar = ocVar2.f29209p;
                        if ((mbVar == null || mbVar.a()) && !z10) {
                            mb mbVar2 = ocVar2.f29209p;
                            if (mbVar2 != null) {
                                i18 = mbVar2.f(ocVar2.f29197a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = ocVar2.f29208o;
                            if (i19 != i18) {
                                o1.k kVar = ocVar2.d;
                                if (kVar != null && kVar.f17615f) {
                                    kVar.f17622u.f17628i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f17628i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f17622u = lVar;
                                    ocVar2.d = kVar2;
                                    kVar2.b(new j7(ocVar2, 1));
                                    ocVar2.d.a(new fb(ocVar2, 0));
                                }
                                ocVar2.d.h();
                            }
                        }
                    }
                };
                this.f29199c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                sbVar.addOnLayoutChangeListener(new hb(this, z10));
                if (!this.f29213t) {
                    sbVar.addOnAttachStateChangeListener(new ai.n6(this, 7));
                }
                frameLayout.addView(gbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        sb sbVar = this.e;
        if (sbVar != null) {
            sbVar.updatePosition();
        }
    }

    public oc(org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, sb sbVar, int i10) {
        this.f29202i = new bb(this, 0);
        this.f29211r = true;
        this.f29214u = true;
        this.e = sbVar;
        this.f29207n = true ^ (sbVar instanceof tb);
        this.f29200f = new gb(this, sbVar, frameLayout);
        this.f29201g = o2Var;
        this.h = frameLayout;
        this.f29203j = i10;
    }
}
