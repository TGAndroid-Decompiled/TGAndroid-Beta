package org.telegram.messenger;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class ye extends se {
    public static q5 Z;
    public final int B;
    public final int C;
    public final long D;
    public int E;
    public final int F;
    public final int G;
    public final long H;
    public final String I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public Boolean O;
    public long P;
    public int Q;
    public boolean R;
    public TLRPC.VideoSize S;
    public int T;
    public int U;
    public volatile boolean V;
    public boolean W;
    public boolean X;
    public ArrayList Y;

    public ye(int i3, int i10, long j10, String str, int i11, int i12, boolean z10, int i13, int i14, long j11) {
        this.Q = -1;
        this.B = i3;
        this.C = i10;
        this.D = j10;
        this.I = str;
        this.F = i13;
        this.G = i14;
        this.H = j11;
        this.E = i12;
        this.J = i11;
        this.f25310b = z10;
    }

    @Override
    public final String a() {
        return this.I;
    }

    @Override
    public final boolean d() {
        if (this.V) {
            return this.W;
        }
        synchronized (this) {
            try {
                if (!this.V) {
                    if (!this.f25310b) {
                        l();
                    }
                    this.V = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.W;
    }

    @Override
    public final void e() {
        if (this.f25310b && this.f25315i != null) {
            new File(this.f25315i).delete();
            this.f25315i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final ye clone() {
        ye yeVar = new ye(this.B, this.C, this.D, this.I, this.J, this.E, this.f25310b, this.F, this.G, this.H);
        yeVar.K = this.K;
        yeVar.L = this.L;
        yeVar.M = this.M;
        yeVar.N = this.N;
        yeVar.R = this.R;
        yeVar.S = this.S;
        yeVar.T = this.T;
        yeVar.U = this.U;
        yeVar.O = this.O;
        yeVar.g(this);
        return yeVar;
    }

    public final void g(ye yeVar) {
        this.f25309a = yeVar.f25309a;
        this.f25311c = yeVar.f25311c;
        this.h = yeVar.h;
        this.f25315i = yeVar.f25315i;
        this.f25316j = yeVar.f25316j;
        this.f25317k = yeVar.f25317k;
        this.f25318l = yeVar.f25318l;
        this.f25320n = yeVar.f25320n;
        this.f25321o = yeVar.f25321o;
        this.f25322p = yeVar.f25322p;
        this.f25323q = yeVar.f25323q;
        this.f25324r = yeVar.f25324r;
        this.f25325s = yeVar.f25325s;
        this.f25326t = yeVar.f25326t;
        this.f25327u = yeVar.f25327u;
        this.v = yeVar.v;
        this.f25328w = yeVar.f25328w;
        this.f25319m = yeVar.f25319m;
        this.f25329x = yeVar.f25329x;
        this.A = yeVar.A;
        this.f25314g = yeVar.f25314g;
        this.f25331z = yeVar.f25331z;
        this.M = yeVar.M;
        this.N = yeVar.N;
        this.V = yeVar.V;
        this.W = yeVar.W;
        this.f25319m = yeVar.f25319m;
        this.P = yeVar.P;
    }

    public final void h() {
        String str = this.I;
        if (str != null) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
        if (this.f25318l != null) {
            try {
                new File(this.f25318l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f25316j != null) {
            try {
                new File(this.f25316j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f25315i != null) {
            try {
                new File(this.f25315i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f25317k != null) {
            try {
                new File(this.f25317k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (!this.V) {
            if (!this.f25310b || this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Boolean bool = this.O;
        if (bool == null) {
            return !az.f21636i1;
        }
        return bool.booleanValue();
    }

    public final boolean k(org.telegram.ui.Cells.f fVar) {
        if (i()) {
            return true;
        }
        if (fVar != null) {
            if (this.Y == null) {
                this.Y = new ArrayList();
            }
            if (!this.Y.contains(fVar)) {
                this.Y.add(fVar);
            }
        }
        if (!this.X) {
            this.X = true;
            if (Z == null) {
                Z = new q5("livePhotoQueue", true);
            }
            Z.postRunnable(new xe(this, 0));
            return false;
        }
        return false;
    }

    public final void l() {
        c3.x xVar;
        b8.ig igVar;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        m3.c cVar = null;
        try {
            xVar = c3.x.b(new File(str));
        } catch (Exception e10) {
            a8.g(e10, true);
            xVar = null;
        }
        if (xVar != null) {
            long j10 = xVar.f4119a;
            if (j10 > 0) {
                this.f25310b = true;
                this.W = true;
                this.f25319m = j10;
                this.P = xVar.f4120b;
            }
        } else {
            try {
                String b10 = new t1.g(new File(str)).b("Xmp");
                if (b10 != null) {
                    try {
                        igVar = m3.d.a(b10);
                    } catch (d2.v0 | NumberFormatException | XmlPullParserException unused) {
                        g2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        igVar = null;
                    }
                    if (igVar != null) {
                        g9.s1 s1Var = (g9.s1) igVar.f2683c;
                        m3.c cVar2 = null;
                        for (int i3 = 0; i3 < s1Var.d; i3++) {
                            m3.c cVar3 = (m3.c) s1Var.get(i3);
                            String str2 = cVar3.f19061b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null && cVar2.f19062c > 0) {
                            try {
                                this.f25310b = true;
                                this.W = true;
                                this.f25319m = new File(str).length() - cVar2.f19062c;
                                this.P = igVar.f2682b;
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                a8.g(e12, true);
                this.W = false;
            }
        }
        StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
        sb2.append(this.W);
        sb2.append(" in ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        k2.p1.w("ms", sb2);
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ye.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ye(int i3, String str, int i10, boolean z10, int i11, int i12) {
        this.Q = -1;
        this.B = 0;
        this.C = i3;
        this.D = 0L;
        this.I = str;
        this.F = i11;
        this.G = i12;
        this.H = 0L;
        if (z10) {
            this.E = i10;
        } else {
            this.J = i10;
        }
        this.f25310b = z10;
    }
}
