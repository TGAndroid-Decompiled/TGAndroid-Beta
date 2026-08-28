package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class gc {
    public static gc f28729w;
    public int f28730a;
    public int f28731b;
    public va f28732c;
    public o1.j d;
    public final lb f28733e;
    public final za f28734f;
    public final org.telegram.ui.ActionBar.o2 f28735g;
    public final FrameLayout h;
    public final Runnable f28736i;
    public int f28737j;
    public boolean f28738k;
    public boolean f28739l;
    public boolean f28740m;
    public boolean f28741n;
    public int f28742o;
    public fb f28743p;
    public kb f28744q;
    public boolean f28745r;
    public boolean f28746s;
    public boolean f28747t;
    public boolean f28748u;
    public Runnable v;

    public gc() {
        this.f28736i = new ua(this, 0);
        this.f28741n = true;
        this.f28745r = true;
        this.f28748u = true;
        this.f28733e = null;
        this.f28734f = null;
        this.f28735g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, fb fbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, fbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        gc gcVar;
        int childCount = frameLayout.getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                View childAt = frameLayout.getChildAt(i9);
                if (childAt instanceof lb) {
                    gcVar = ((lb) childAt).bulletin;
                    break;
                }
                i9++;
            } else {
                gcVar = null;
                break;
            }
        }
        if (gcVar != null) {
            gcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        gc gcVar = f28729w;
        if (gcVar != null) {
            gcVar.b();
        }
    }

    public static gc f(FrameLayout frameLayout, lb lbVar, int i9) {
        if (frameLayout == null) {
            return new gc();
        }
        return new gc(null, frameLayout, lbVar, i9);
    }

    public static gc g(org.telegram.ui.ActionBar.o2 o2Var, eb ebVar, int i9) {
        if (o2Var == null) {
            return new gc();
        }
        if (o2Var instanceof org.telegram.ui.qn) {
            lb.access$000(ebVar, -2, 1);
        } else if (o2Var instanceof org.telegram.ui.dy) {
            lb.access$000(ebVar, -1, 0);
        }
        return new gc(o2Var, o2Var.getBulletinLayoutContainer(), ebVar, i9);
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
        lb lbVar = this.f28733e;
        if (lbVar != null && this.f28739l) {
            this.f28739l = false;
            if (f28729w == this) {
                f28729w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f46915a;
            if (lbVar.isLaidOut() || this.f28747t) {
                lbVar.removeCallbacks(this.f28736i);
                if (z10) {
                    lbVar.transitionRunningExit = true;
                    lbVar.delegate = this.f28743p;
                    lbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f17244a = j10;
                        this.f28744q = obj;
                    } else if (lbVar != null && this.f28744q == null) {
                        this.f28744q = lbVar.createTransition();
                    }
                    kb kbVar = this.f28744q;
                    Objects.requireNonNull(lbVar);
                    kbVar.e(lbVar, new wa(lbVar, 0), new ua(this, 1), new xa(this, 0));
                    return;
                }
            }
            fb fbVar = this.f28743p;
            if (fbVar != null && !lbVar.top) {
                fbVar.c(0.0f);
                this.f28743p.d(this);
            }
            lbVar.onExitTransitionStart();
            lbVar.onExitTransitionEnd();
            lbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new ua(this, 2));
            }
            lbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        lb lbVar;
        if (z10 && this.f28741n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f28740m != z11 && (lbVar = this.f28733e) != null) {
            this.f28740m = z11;
            Runnable runnable = this.f28736i;
            if (z11) {
                int i9 = this.f28737j;
                if (i9 >= 0) {
                    lbVar.postDelayed(runnable, i9);
                    return;
                }
                return;
            }
            lbVar.removeCallbacks(runnable);
        }
    }

    public gc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f28739l && (frameLayout = this.h) != 0) {
            this.f28739l = true;
            lb lbVar = this.f28733e;
            lbVar.setTop(z10);
            CharSequence accessibilityText = lbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = lbVar.getParent();
            za zaVar = this.f28734f;
            if (parent == zaVar) {
                gc gcVar = f28729w;
                if (gcVar != null) {
                    gcVar.b();
                }
                f28729w = this;
                lbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        gc gcVar2 = gc.this;
                        fb fbVar = gcVar2.f28743p;
                        if ((fbVar == null || fbVar.a()) && !z10) {
                            fb fbVar2 = gcVar2.f28743p;
                            if (fbVar2 != null) {
                                i17 = fbVar2.f(gcVar2.f28730a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = gcVar2.f28742o;
                            if (i18 != i17) {
                                o1.j jVar = gcVar2.d;
                                if (jVar != null && jVar.f18794f) {
                                    jVar.f18800u.f18807i = i17;
                                } else {
                                    o1.j jVar2 = new o1.j(new gb.a(i18));
                                    o1.k kVar = new o1.k();
                                    kVar.f18807i = i17;
                                    kVar.b(900.0f);
                                    kVar.a(1.0f);
                                    jVar2.f18800u = kVar;
                                    gcVar2.d = jVar2;
                                    jVar2.b(new e7(gcVar2, 1));
                                    gcVar2.d.a(new ya(gcVar2, 0));
                                }
                                gcVar2.d.f();
                            }
                        }
                    }
                };
                this.f28732c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                lbVar.addOnLayoutChangeListener(new ab(this, z10));
                if (!this.f28747t) {
                    lbVar.addOnAttachStateChangeListener(new af.b(this, 10));
                }
                frameLayout.addView(zaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        lb lbVar = this.f28733e;
        if (lbVar != null) {
            lbVar.updatePosition();
        }
    }

    public gc(org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, lb lbVar, int i9) {
        this.f28736i = new ua(this, 0);
        this.f28745r = true;
        this.f28748u = true;
        this.f28733e = lbVar;
        this.f28741n = true ^ (lbVar instanceof mb);
        this.f28734f = new za(this, lbVar, frameLayout);
        this.f28735g = o2Var;
        this.h = frameLayout;
        this.f28737j = i9;
    }
}
