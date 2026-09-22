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
    public static oc f26744w;
    public int f26745a;
    public int f26746b;
    public cb f26747c;
    public o1.k d;
    public final sb e;
    public final gb f26748f;
    public final org.telegram.ui.ActionBar.n2 f26749g;
    public final FrameLayout h;
    public final Runnable f26750i;
    public int f26751j;
    public boolean f26752k;
    public boolean f26753l;
    public boolean f26754m;
    public boolean f26755n;
    public int f26756o;
    public mb f26757p;
    public rb f26758q;
    public boolean f26759r;
    public boolean f26760s;
    public boolean f26761t;
    public boolean f26762u;
    public Runnable v;

    public oc() {
        this.f26750i = new bb(this, 0);
        this.f26755n = true;
        this.f26759r = true;
        this.f26762u = true;
        this.e = null;
        this.f26748f = null;
        this.f26749g = null;
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
        oc ocVar = f26744w;
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

    public static oc g(org.telegram.ui.ActionBar.n2 n2Var, lb lbVar, int i10) {
        if (n2Var == null) {
            return new oc();
        }
        if (n2Var instanceof org.telegram.ui.bo) {
            sb.access$000(lbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.uy) {
            sb.access$000(lbVar, -1, 0);
        }
        return new oc(n2Var, n2Var.getBulletinLayoutContainer(), lbVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        sb sbVar = this.e;
        if (sbVar != null && this.f26753l) {
            this.f26753l = false;
            if (f26744w == this) {
                f26744w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f41839a;
            if (sbVar.isLaidOut() || this.f26761t) {
                sbVar.removeCallbacks(this.f26750i);
                if (z10) {
                    sbVar.transitionRunningExit = true;
                    sbVar.delegate = this.f26757p;
                    sbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f3795a = j3;
                        this.f26758q = obj;
                    } else if (sbVar != null && this.f26758q == null) {
                        this.f26758q = sbVar.createTransition();
                    }
                    rb rbVar = this.f26758q;
                    Objects.requireNonNull(sbVar);
                    rbVar.g(sbVar, new db(sbVar, 0), new bb(this, 1), new eb(this, 0));
                    return;
                }
            }
            mb mbVar = this.f26757p;
            if (mbVar != null && !sbVar.top) {
                mbVar.c(0.0f);
                this.f26757p.d(this);
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
        if (z10 && this.f26755n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26754m != z11 && (sbVar = this.e) != null) {
            this.f26754m = z11;
            Runnable runnable = this.f26750i;
            if (z11) {
                int i10 = this.f26751j;
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
        if (!this.f26753l && (frameLayout = this.h) != 0) {
            this.f26753l = true;
            sb sbVar = this.e;
            sbVar.setTop(z10);
            CharSequence accessibilityText = sbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = sbVar.getParent();
            gb gbVar = this.f26748f;
            if (parent == gbVar) {
                oc ocVar = f26744w;
                if (ocVar != null) {
                    ocVar.b();
                }
                f26744w = this;
                sbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        oc ocVar2 = oc.this;
                        mb mbVar = ocVar2.f26757p;
                        if ((mbVar == null || mbVar.a()) && !z10) {
                            mb mbVar2 = ocVar2.f26757p;
                            if (mbVar2 != null) {
                                i18 = mbVar2.f(ocVar2.f26745a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = ocVar2.f26756o;
                            if (i19 != i18) {
                                o1.k kVar = ocVar2.d;
                                if (kVar != null && kVar.f15342f) {
                                    kVar.f15349u.f15355i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f15355i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f15349u = lVar;
                                    ocVar2.d = kVar2;
                                    kVar2.b(new i7(ocVar2, 1));
                                    ocVar2.d.a(new fb(ocVar2, 0));
                                }
                                ocVar2.d.f();
                            }
                        }
                    }
                };
                this.f26747c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                sbVar.addOnLayoutChangeListener(new hb(this, z10));
                if (!this.f26761t) {
                    sbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
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

    public oc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, sb sbVar, int i10) {
        this.f26750i = new bb(this, 0);
        this.f26759r = true;
        this.f26762u = true;
        this.e = sbVar;
        this.f26755n = true ^ (sbVar instanceof tb);
        this.f26748f = new gb(this, sbVar, frameLayout);
        this.f26749g = n2Var;
        this.h = frameLayout;
        this.f26751j = i10;
    }
}
