package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class mc {
    public static mc f30644w;
    public int f30645a;
    public int f30646b;
    public ab f30647c;
    public o1.k d;
    public final rb f30648e;
    public final eb f30649f;
    public final org.telegram.ui.ActionBar.o2 f30650g;
    public final FrameLayout h;
    public final Runnable f30651i;
    public int f30652j;
    public boolean f30653k;
    public boolean f30654l;
    public boolean f30655m;
    public boolean f30656n;
    public int f30657o;
    public kb f30658p;
    public qb f30659q;
    public boolean f30660r;
    public boolean f30661s;
    public boolean f30662t;
    public boolean f30663u;
    public Runnable v;

    public mc() {
        this.f30651i = new za(this, 0);
        this.f30656n = true;
        this.f30660r = true;
        this.f30663u = true;
        this.f30648e = null;
        this.f30649f = null;
        this.f30650g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, kb kbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, kbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        mc mcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof rb) {
                    mcVar = ((rb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                mcVar = null;
                break;
            }
        }
        if (mcVar != null) {
            mcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        mc mcVar = f30644w;
        if (mcVar != null) {
            mcVar.b();
        }
    }

    public static mc f(FrameLayout frameLayout, rb rbVar, int i10) {
        if (frameLayout == null) {
            return new mc();
        }
        return new mc(null, frameLayout, rbVar, i10);
    }

    public static mc g(org.telegram.ui.ActionBar.o2 o2Var, jb jbVar, int i10) {
        if (o2Var == null) {
            return new mc();
        }
        if (o2Var instanceof org.telegram.ui.tn) {
            rb.access$000(jbVar, -2, 1);
        } else if (o2Var instanceof org.telegram.ui.fy) {
            rb.access$000(jbVar, -1, 0);
        }
        return new mc(o2Var, o2Var.getBulletinLayoutContainer(), jbVar, i10);
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
        rb rbVar = this.f30648e;
        if (rbVar != null && this.f30654l) {
            this.f30654l = false;
            if (f30644w == this) {
                f30644w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f46829a;
            if (rbVar.isLaidOut() || this.f30662t) {
                rbVar.removeCallbacks(this.f30651i);
                if (z10) {
                    rbVar.transitionRunningExit = true;
                    rbVar.delegate = this.f30658p;
                    rbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f19103a = j10;
                        this.f30659q = obj;
                    } else if (rbVar != null && this.f30659q == null) {
                        this.f30659q = rbVar.createTransition();
                    }
                    qb qbVar = this.f30659q;
                    Objects.requireNonNull(rbVar);
                    qbVar.e(rbVar, new bb(rbVar, 0), new za(this, 1), new cb(this, 0));
                    return;
                }
            }
            kb kbVar = this.f30658p;
            if (kbVar != null && !rbVar.top) {
                kbVar.c(0.0f);
                this.f30658p.d(this);
            }
            rbVar.onExitTransitionStart();
            rbVar.onExitTransitionEnd();
            rbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new za(this, 2));
            }
            rbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        rb rbVar;
        if (z10 && this.f30656n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f30655m != z11 && (rbVar = this.f30648e) != null) {
            this.f30655m = z11;
            Runnable runnable = this.f30651i;
            if (z11) {
                int i10 = this.f30652j;
                if (i10 >= 0) {
                    rbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            rbVar.removeCallbacks(runnable);
        }
    }

    public mc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f30654l && (frameLayout = this.h) != 0) {
            this.f30654l = true;
            rb rbVar = this.f30648e;
            rbVar.setTop(z10);
            CharSequence accessibilityText = rbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = rbVar.getParent();
            eb ebVar = this.f30649f;
            if (parent == ebVar) {
                mc mcVar = f30644w;
                if (mcVar != null) {
                    mcVar.b();
                }
                f30644w = this;
                rbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        mc mcVar2 = mc.this;
                        kb kbVar = mcVar2.f30658p;
                        if ((kbVar == null || kbVar.a()) && !z10) {
                            kb kbVar2 = mcVar2.f30658p;
                            if (kbVar2 != null) {
                                i18 = kbVar2.f(mcVar2.f30645a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = mcVar2.f30657o;
                            if (i19 != i18) {
                                o1.k kVar = mcVar2.d;
                                if (kVar != null && kVar.f19039f) {
                                    kVar.f19045u.f19052i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new ib.a(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f19052i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f19045u = lVar;
                                    mcVar2.d = kVar2;
                                    kVar2.b(new j7(mcVar2, 1));
                                    mcVar2.d.a(new db(mcVar2, 0));
                                }
                                mcVar2.d.f();
                            }
                        }
                    }
                };
                this.f30647c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                rbVar.addOnLayoutChangeListener(new fb(this, z10));
                if (!this.f30662t) {
                    rbVar.addOnAttachStateChangeListener(new df.b(this, 10));
                }
                frameLayout.addView(ebVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        rb rbVar = this.f30648e;
        if (rbVar != null) {
            rbVar.updatePosition();
        }
    }

    public mc(org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, rb rbVar, int i10) {
        this.f30651i = new za(this, 0);
        this.f30660r = true;
        this.f30663u = true;
        this.f30648e = rbVar;
        this.f30656n = true ^ (rbVar instanceof sb);
        this.f30649f = new eb(this, rbVar, frameLayout);
        this.f30650g = o2Var;
        this.h = frameLayout;
        this.f30652j = i10;
    }
}
