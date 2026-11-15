package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.h5;
public final class h5 implements q4 {
    public boolean f28635a;
    public int f28636b;
    public final Object f28637c;
    public final Object d;
    public final Object f28638e;
    public Object f28639f;
    public Object h;

    public h5(g5 g5Var, ri.a aVar, e6 e6Var) {
        this.f28636b = 0;
        this.f28637c = g5Var;
        this.d = aVar;
        this.f28638e = e6Var;
        this.f28639f = c8.g0.l(e6Var);
    }

    public static void c(h5 h5Var) {
        f3.m mVar = (f3.m) h5Var.f28637c;
        synchronized (mVar) {
            mVar.f10874f = 1;
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b(q0 q0Var, RectF rectF) {
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
    public boolean f() {
        return false;
    }

    @Override
    public fh.g g(g5 g5Var) {
        fh.g c10 = ((ri.a) this.d).d.c(g5Var, null, false);
        c10.p((gh.e) this.f28639f);
        i20.r(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f28639f;
        return eVar.a(eVar.f13313e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f28639f;
    }

    @Override
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return (gh.e) this.f28639f;
    }

    @Override
    public View getMenuHostView() {
        return (View) this.h;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public e6 getMenuResourcesProvider() {
        return (e6) this.f28638e;
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
    public g5 getOpenMenuOverlay() {
        if (this.f28635a) {
            return (g5) this.f28637c;
        }
        return null;
    }

    @Override
    public void h(g5 g5Var, q0 q0Var) {
        boolean z10;
        if (g5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28635a != z10) {
            this.f28635a = z10;
            if (z10) {
                this.f28636b = ((View) this.h).getVisibility();
                ((View) this.h).setVisibility(4);
            } else if (((View) this.h).getVisibility() == 4) {
                ((View) this.h).setVisibility(this.f28636b);
            }
        }
    }

    public x2.e0 i(int i7) {
        g9.t tVar;
        g9.t mVar;
        HashMap hashMap = (HashMap) this.f28638e;
        x2.e0 e0Var = (x2.e0) hashMap.get(Integer.valueOf(i7));
        if (e0Var != null) {
            return e0Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        g9.t tVar2 = (g9.t) hashMap2.get(Integer.valueOf(i7));
        if (tVar2 == null) {
            final wf.b bVar = (wf.b) this.f28639f;
            bVar.getClass();
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                mVar = new g9.t() {
                                    @Override
                                    public final Object get() {
                                        switch (r3) {
                                            case 0:
                                                return p.e((Class) this, bVar);
                                            case 1:
                                                return p.e((Class) this, bVar);
                                            case 2:
                                                return p.e((Class) this, bVar);
                                            default:
                                                return new w0(bVar, (f3.m) ((h5) this).f28637c);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(i5.c.i(i7, "Unrecognized contentType: "));
                            }
                        } else {
                            mVar = new l2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(x2.e0.class), 3);
                        }
                        tVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(x2.e0.class);
                        tVar = new g9.t() {
                            @Override
                            public final Object get() {
                                switch (r3) {
                                    case 0:
                                        return p.e((Class) asSubclass, bVar);
                                    case 1:
                                        return p.e((Class) asSubclass, bVar);
                                    case 2:
                                        return p.e((Class) asSubclass, bVar);
                                    default:
                                        return new w0(bVar, (f3.m) ((h5) asSubclass).f28637c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(x2.e0.class);
                    tVar = new g9.t() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return p.e((Class) asSubclass2, bVar);
                                case 1:
                                    return p.e((Class) asSubclass2, bVar);
                                case 2:
                                    return p.e((Class) asSubclass2, bVar);
                                default:
                                    return new w0(bVar, (f3.m) ((h5) asSubclass2).f28637c);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(x2.e0.class);
                tVar2 = new g9.t() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return p.e((Class) asSubclass3, bVar);
                            case 1:
                                return p.e((Class) asSubclass3, bVar);
                            case 2:
                                return p.e((Class) asSubclass3, bVar);
                            default:
                                return new w0(bVar, (f3.m) ((h5) asSubclass3).f28637c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), tVar2);
        }
        x2.e0 e0Var2 = (x2.e0) tVar2.get();
        e0Var2.a((nb.a) this.h);
        e0Var2.c(this.f28635a);
        e0Var2.d(this.f28636b);
        hashMap.put(Integer.valueOf(i7), e0Var2);
        return e0Var2;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((ri.a) this.d).f56043e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public h5(f3.m mVar, nb.a aVar) {
        this.f28637c = mVar;
        this.h = aVar;
        this.d = new HashMap();
        this.f28638e = new HashMap();
        this.f28635a = true;
        this.f28636b = 3;
    }
}
