package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gs0;
import org.telegram.ui.lo0;
import org.telegram.ui.ma0;
import org.telegram.ui.mo0;
import org.telegram.ui.mr0;
import org.telegram.ui.oo0;
import org.telegram.ui.pq0;
import org.telegram.ui.u71;
import org.telegram.ui.un;
import org.telegram.ui.zr0;
public final class c0 implements View.OnClickListener {
    public final int f20191a;
    public final boolean f20192b;
    public final Object f20193c;

    public c0(int i10, Object obj, boolean z10) {
        this.f20191a = i10;
        this.f20193c = obj;
        this.f20192b = z10;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        pe peVar;
        boolean z11;
        View view2;
        int i10;
        int i11;
        switch (this.f20191a) {
            case 0:
                t0 t0Var = (t0) this.f20193c;
                boolean z12 = this.f20192b;
                if (t0Var.x() && z12) {
                    if (!t0Var.T) {
                        t0Var.T = true;
                        t0Var.q();
                    } else {
                        return;
                    }
                }
                y yVar = t0Var.f20828c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                o0 o0Var = t0Var.P;
                if (o0Var != null) {
                    o0Var.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 1:
                u71 u71Var = (u71) this.f20193c;
                boolean z13 = this.f20192b;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.u0 u0Var = ((org.telegram.ui.Cells.u0[]) u71Var.f42064b)[i12];
                    org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) u0Var.d;
                    if (u0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t0Var2.a(z10, true);
                }
                tz.f18173p1 = z13;
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.putBoolean("useThreeLinesLayout", tz.f18173p1);
                edit.apply();
                zs.e().k(3, Boolean.TRUE);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20193c;
                boolean z14 = this.f20192b;
                tc tcVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z14 && (peVar = chatActivityEnterView.L0) != null) {
                    peVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                org.telegram.messenger.i0.r(tcVar);
                org.telegram.messenger.i0.h3(tcVar, 500L);
                return;
            case 3:
                bi biVar = (bi) this.f20193c;
                boolean z15 = this.f20192b;
                k2 k2Var = biVar.W1;
                if (biVar.K2 != 0) {
                    biVar.T3.N();
                    biVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                oo0 oo0Var = new oo0(hashMap, arrayList, 0, true, (un) k2Var);
                rh rhVar = new rh(biVar, hashMap, arrayList);
                lo0 lo0Var = oo0Var.f40349a;
                lo0Var.f39351s0 = rhVar;
                lo0 lo0Var2 = oo0Var.f40350b;
                lo0Var2.f39351s0 = rhVar;
                lo0Var.f39352t0 = new mo0(oo0Var, 1);
                lo0Var2.f39352t0 = new mo0(oo0Var, 2);
                int i13 = biVar.M3;
                boolean z16 = biVar.N3;
                lo0Var.j0(i13, z16);
                oo0Var.f40350b.j0(i13, z16);
                if (z15) {
                    k2Var.showAsSheet(oo0Var);
                } else {
                    k2Var.presentFragment(oo0Var);
                }
                biVar.dismiss();
                return;
            case 4:
                jf0 jf0Var = (jf0) this.f20193c;
                boolean z17 = this.f20192b;
                jf0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z17 && (!z11 || !LaunchActivity.G1)) {
                    LaunchActivity.H1 = new zt(0, view);
                    Context context = org.telegram.messenger.w0.f19025b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                hu huVar = jf0Var.U;
                if (huVar != null) {
                    huVar.J0();
                    return;
                }
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33430a9 != null) {
                        PhotoViewer.f33430a9.H0(false, true);
                    }
                    mr0 mr0Var = photoViewer.f33479f0;
                    if (mr0Var != null && mr0Var.f31237f != null) {
                        if (org.telegram.messenger.w0.f19032x) {
                            try {
                                mr0Var.getContext().startService(new Intent(org.telegram.messenger.w0.f19025b, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                f8.g(th2, true);
                            }
                        }
                        mr0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) mr0Var.f31237f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(mr0Var.f31237f);
                        }
                        mr0Var.addView(mr0Var.f31237f, 0, w7.b6.e(-1, -1, 51));
                        jf0.b(false);
                    }
                    PhotoViewer.f33430a9 = PhotoViewer.f33431b9;
                    PhotoViewer.f33431b9 = null;
                    if (photoViewer.f33479f0 == null) {
                        photoViewer.L3 = true;
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                        photoViewer.F3 = true;
                    }
                    photoViewer.J3 = false;
                    if (photoViewer.D2) {
                        view2 = photoViewer.C2;
                    } else {
                        view2 = photoViewer.B2;
                    }
                    View view3 = view2;
                    if (photoViewer.f33479f0 == null && view3 != null) {
                        org.telegram.messenger.i0.E2(view3);
                        view3.setVisibility(4);
                        photoViewer.f33652y2.addView(view3);
                    }
                    if (org.telegram.messenger.w0.f19032x) {
                        try {
                            photoViewer.D.startService(new Intent(org.telegram.messenger.w0.f19025b, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            f8.g(th3, true);
                        }
                    }
                    if (photoViewer.f33479f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            oj0 j10 = jf0.j(false, photoViewer.f33652y2.getAspectRatio());
                            float f7 = j10.f29086c / photoViewer.f33643x3.getLayoutParams().width;
                            photoViewer.f33643x3.setScaleX(f7);
                            photoViewer.f33643x3.setScaleY(f7);
                            photoViewer.f33643x3.setTranslationX(j10.f29084a);
                            photoViewer.f33643x3.setTranslationY(j10.f29085b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(j10.f29084a - photoViewer.f33652y2.getX());
                            view3.setTranslationY(j10.f29085b - photoViewer.f33652y2.getY());
                            zr0 zr0Var = photoViewer.E2;
                            if (zr0Var != null) {
                                zr0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            pq0 pq0Var = new pq0(photoViewer, f7, 1);
                            view3.setOutlineProvider(pq0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f33643x3.setOutlineProvider(pq0Var);
                            photoViewer.f33643x3.setClipToOutline(true);
                            zr0 zr0Var2 = photoViewer.E2;
                            if (zr0Var2 != null) {
                                zr0Var2.setOutlineProvider(pq0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            jf0.b(true);
                        }
                    } else {
                        photoViewer.f33544m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f33478f = true;
                        ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f33487g0, photoViewer.f33461d0);
                        Activity activity = photoViewer.D;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33350b1.add(photoViewer.f33594s1);
                        }
                        gs0 gs0Var = photoViewer.f33466d5;
                        if (gs0Var != null && !gs0Var.f37642s) {
                            gs0Var.f37627a.O0(false, false);
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    if (photoViewer.D2) {
                        i2.i0 i0Var = photoViewer.F2.d;
                        if (i0Var != null) {
                            i0Var.z1(null);
                        }
                        photoViewer.F2.z0(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f33470e0.invalidate();
                        photoViewer.f33623v3 = 4;
                        return;
                    }
                    photoViewer.f33623v3 = 4;
                    return;
                }
                return;
            case 5:
                ma0 ma0Var = (ma0) this.f20193c;
                if (!this.f20192b) {
                    t8 t8Var = ma0Var.f39614n;
                    if (t8Var != null && t8Var.e.h) {
                        int i14 = -ma0Var.M;
                        ma0Var.M = i14;
                        org.telegram.messenger.i0.F3(i14, t8Var, null);
                        return;
                    }
                    t8 t8Var2 = (t8) view;
                    boolean z18 = t8Var2.e.h;
                    t8Var2.setChecked(!z18);
                    ma0Var.d0(z18);
                    t8 t8Var3 = ma0Var.f39614n;
                    if (t8Var3 != null) {
                        if (t8Var2.e.h) {
                            t8Var3.setChecked(false);
                            ma0Var.f39614n.setCheckBoxIcon(2131232512);
                            ma0Var.f39615r.setVisibility(8);
                            return;
                        } else if (ma0Var.e == null) {
                            t8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                th.z2 z2Var = (th.z2) this.f20193c;
                boolean z19 = this.f20192b;
                boolean z20 = !z19;
                vp r12 = vp.r1(z2Var.f49730l2);
                if (r12.q6 != z20) {
                    SharedPreferences.Editor edit2 = r12.f7.edit();
                    r12.q6 = z20;
                    edit2.putBoolean("storyQualityFull", z20).apply();
                    r12.getNotificationCenter().k(209, new Object[0]);
                }
                cc ccVar = new cc(z2Var.L0, z2Var.f49725k0);
                if (!z19) {
                    i10 = 2131744533;
                } else {
                    i10 = 2131744536;
                }
                String L0 = cd.L0(i10, null);
                if (!z19) {
                    i11 = 2131744534;
                } else {
                    i11 = 2131744537;
                }
                ccVar.I(2131623981, L0, cd.L0(i11, null)).j();
                th.u2 u2Var = z2Var.f49696c1;
                if (u2Var != null) {
                    u2Var.a();
                    return;
                }
                return;
            default:
                th.u2 u2Var2 = (th.u2) this.f20193c;
                boolean z21 = this.f20192b;
                th.s0 s0Var = th.s0.W;
                if (s0Var != null) {
                    boolean z22 = !z21;
                    if (s0Var.f49423n && s0Var.f49424r != z22) {
                        s0Var.f49424r = z22;
                        NativeInstance nativeInstance = s0Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z22);
                        }
                    }
                }
                th.u2 u2Var3 = u2Var2.f49512x.f49696c1;
                if (u2Var3 != null) {
                    u2Var3.a();
                    return;
                }
                return;
        }
    }
}
