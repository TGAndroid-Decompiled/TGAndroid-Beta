package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import org.telegram.ui.ActionBar.k5;
public final class k5 implements t4 {
    public boolean f27654a;
    public int f27655b;
    public final Object f27656c;
    public final Object d;
    public final Object f27657e;
    public Object f27658f;
    public Object h;

    public k5(j5 j5Var, oi.a aVar, h6 h6Var) {
        this.f27655b = 0;
        this.f27656c = j5Var;
        this.d = aVar;
        this.f27657e = h6Var;
        this.f27658f = c8.g0.l(h6Var);
    }

    public static void c(k5 k5Var) {
        f3.m mVar = (f3.m) k5Var.f27656c;
        synchronized (mVar) {
            mVar.f11072f = 1;
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b(r0 r0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.h).getWidth(), ((View) this.h).getHeight());
        return true;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public fh.g f(j5 j5Var) {
        fh.g c10 = ((oi.a) this.d).d.c(j5Var, null, false);
        c10.p((gh.e) this.f27658f);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override
    public void g(j5 j5Var, r0 r0Var) {
        boolean z9;
        if (j5Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f27654a != z9) {
            this.f27654a = z9;
            if (z9) {
                this.f27655b = ((View) this.h).getVisibility();
                ((View) this.h).setVisibility(4);
            } else if (((View) this.h).getVisibility() == 4) {
                ((View) this.h).setVisibility(this.f27655b);
            }
        }
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f27658f;
        return eVar.a(eVar.f13973e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f27658f;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return (gh.e) this.f27658f;
    }

    @Override
    public View getMenuHostView() {
        return (View) this.h;
    }

    @Override
    public h6 getMenuResourcesProvider() {
        return (h6) this.f27657e;
    }

    @Override
    public int getMenuRise() {
        return 0;
    }

    @Override
    public View getMenuView() {
        return (View) this.h;
    }

    @Override
    public j5 getOpenMenuOverlay() {
        if (this.f27654a) {
            return (j5) this.f27656c;
        }
        return null;
    }

    public x2.e0 h(int i7) {
        g9.u uVar;
        g9.u mVar;
        HashMap hashMap = (HashMap) this.f27657e;
        x2.e0 e0Var = (x2.e0) hashMap.get(Integer.valueOf(i7));
        if (e0Var != null) {
            return e0Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        g9.u uVar2 = (g9.u) hashMap2.get(Integer.valueOf(i7));
        if (uVar2 == null) {
            final j2.n nVar = (j2.n) this.f27658f;
            nVar.getClass();
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                mVar = new g9.u() {
                                    @Override
                                    public final Object get() {
                                        switch (r3) {
                                            case 0:
                                                return p.e((Class) this, nVar);
                                            case 1:
                                                return p.e((Class) this, nVar);
                                            case 2:
                                                return p.e((Class) this, nVar);
                                            default:
                                                return new w0(nVar, (f3.m) ((k5) this).f27656c);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(jg.g.j(i7, "Unrecognized contentType: "));
                            }
                        } else {
                            mVar = new l2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(x2.e0.class), 3);
                        }
                        uVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(x2.e0.class);
                        uVar = new g9.u() {
                            @Override
                            public final Object get() {
                                switch (r3) {
                                    case 0:
                                        return p.e((Class) asSubclass, nVar);
                                    case 1:
                                        return p.e((Class) asSubclass, nVar);
                                    case 2:
                                        return p.e((Class) asSubclass, nVar);
                                    default:
                                        return new w0(nVar, (f3.m) ((k5) asSubclass).f27656c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(x2.e0.class);
                    uVar = new g9.u() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return p.e((Class) asSubclass2, nVar);
                                case 1:
                                    return p.e((Class) asSubclass2, nVar);
                                case 2:
                                    return p.e((Class) asSubclass2, nVar);
                                default:
                                    return new w0(nVar, (f3.m) ((k5) asSubclass2).f27656c);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(x2.e0.class);
                uVar2 = new g9.u() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return p.e((Class) asSubclass3, nVar);
                            case 1:
                                return p.e((Class) asSubclass3, nVar);
                            case 2:
                                return p.e((Class) asSubclass3, nVar);
                            default:
                                return new w0(nVar, (f3.m) ((k5) asSubclass3).f27656c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), uVar2);
        }
        x2.e0 e0Var2 = (x2.e0) uVar2.get();
        e0Var2.a((w7.s) this.h);
        e0Var2.c(this.f27654a);
        e0Var2.d(this.f27655b);
        hashMap.put(Integer.valueOf(i7), e0Var2);
        return e0Var2;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = ((oi.a) this.d).f21027e;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    public k5(f3.m mVar, w7.s sVar) {
        this.f27656c = mVar;
        this.h = sVar;
        this.d = new HashMap();
        this.f27657e = new HashMap();
        this.f27654a = true;
        this.f27655b = 3;
    }
}
