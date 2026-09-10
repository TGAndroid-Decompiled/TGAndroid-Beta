package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.eo;
import org.telegram.ui.ev0;
import org.telegram.ui.fr0;
import org.telegram.ui.gc1;
import org.telegram.ui.gr0;
import org.telegram.ui.gt0;
import org.telegram.ui.hu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wg0;
import org.telegram.ui.xb0;
import org.telegram.ui.xg0;
public final class e0 implements View.OnClickListener {
    public final int f17660a;
    public final boolean f17661b;
    public final Object f17662c;

    public e0(int i10, Object obj, boolean z10) {
        this.f17660a = i10;
        this.f17662c = obj;
        this.f17661b = z10;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        of ofVar;
        boolean z11;
        View view2;
        int i10;
        int i11;
        switch (this.f17660a) {
            case 0:
                w0 w0Var = (w0) this.f17662c;
                boolean z12 = this.f17661b;
                p1 p1Var = w0Var.d;
                if (p1Var != null && p1Var.isShowing() && z12) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.d.d(w0Var.R);
                    } else {
                        return;
                    }
                }
                z zVar = w0Var.f18688c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var.P;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 1:
                gc1 gc1Var = (gc1) this.f17662c;
                boolean z13 = this.f17661b;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) gc1Var.f33059b)[i12];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f20740a;
                    if (y0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x0Var.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z13);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17662c;
                boolean z14 = this.f17661b;
                qd qdVar = chatActivityEnterView.E4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z14 && (ofVar = chatActivityEnterView.L0) != null) {
                    ofVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.D4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                AndroidUtilities.runOnUIThread(qdVar, 500L);
                return;
            case 3:
                yi yiVar = (yi) this.f17662c;
                boolean z15 = this.f17661b;
                p2 p2Var = yiVar.f29366f0;
                if (yiVar.Q0 != 0) {
                    yiVar.Z1.v0();
                    yiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (eo) p2Var);
                xh xhVar = new xh(yiVar, hashMap, arrayList);
                br0 br0Var = gr0Var.f33166a;
                br0Var.f31387s0 = xhVar;
                br0 br0Var2 = gr0Var.f33167b;
                br0Var2.f31387s0 = xhVar;
                br0Var.f31388t0 = new fr0(gr0Var, 0);
                br0Var2.f31388t0 = new fr0(gr0Var, 1);
                int i13 = yiVar.S1;
                boolean z16 = yiVar.T1;
                br0Var.f0(i13, z16);
                gr0Var.f33167b.f0(i13, z16);
                if (z15) {
                    p2Var.showAsSheet(gr0Var);
                } else {
                    p2Var.presentFragment(gr0Var);
                }
                yiVar.dismiss();
                return;
            case 4:
                og0 og0Var = (og0) this.f17662c;
                boolean z17 = this.f17661b;
                og0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z17 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new ru(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                zu zuVar = og0Var.U;
                if (zuVar != null) {
                    zuVar.I();
                    return;
                }
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.Z8 != null) {
                        PhotoViewer.Z8.G0(false, true);
                    }
                    hu0 hu0Var = photoViewer.f30058f0;
                    if (hu0Var != null && hu0Var.f29661f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                hu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        hu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) hu0Var.f29661f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(hu0Var.f29661f);
                        }
                        hu0Var.addView(hu0Var.f29661f, 0, w7.a6.e(-1, -1, 51));
                        og0.j(false);
                    }
                    PhotoViewer.Z8 = PhotoViewer.f30010a9;
                    PhotoViewer.f30010a9 = null;
                    if (photoViewer.f30058f0 == null) {
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
                    if (photoViewer.f30058f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f30230y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f30227y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f30058f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            rk0 o9 = og0.o(photoViewer.f30230y2.getAspectRatio(), false);
                            float f7 = o9.f26683c / photoViewer.f30221x3.getLayoutParams().width;
                            photoViewer.f30221x3.setScaleX(f7);
                            photoViewer.f30221x3.setScaleY(f7);
                            photoViewer.f30221x3.setTranslationX(o9.f26681a);
                            photoViewer.f30221x3.setTranslationY(o9.f26682b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f26681a - photoViewer.f30230y2.getX());
                            view3.setTranslationY(o9.f26682b - photoViewer.f30230y2.getY());
                            vu0 vu0Var = photoViewer.E2;
                            if (vu0Var != null) {
                                vu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            gt0 gt0Var = new gt0(photoViewer, f7, 1);
                            view3.setOutlineProvider(gt0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f30221x3.setOutlineProvider(gt0Var);
                            photoViewer.f30221x3.setClipToOutline(true);
                            vu0 vu0Var2 = photoViewer.E2;
                            if (vu0Var2 != null) {
                                vu0Var2.setOutlineProvider(gt0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            og0.j(true);
                        }
                    } else {
                        photoViewer.f30122m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f30057f = true;
                        ((WindowManager) photoViewer.f30227y.getSystemService("window")).addView(photoViewer.f30066g0, photoViewer.f30040d0);
                        Activity activity = photoViewer.f30227y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f29928a1.add(photoViewer.f30172s1);
                        }
                        ev0 ev0Var = photoViewer.f30045d5;
                        if (ev0Var != null && !ev0Var.f32631s) {
                            ev0Var.f32616a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.e0 e0Var = photoViewer.F2.d;
                        if (e0Var != null) {
                            e0Var.v1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f30049e0.invalidate();
                        photoViewer.f30201v3 = 4;
                        return;
                    }
                    photoViewer.f30201v3 = 4;
                    return;
                }
                return;
            case 5:
                xb0 xb0Var = (xb0) this.f17662c;
                if (!this.f17661b) {
                    x8 x8Var = xb0Var.f38665n;
                    if (x8Var != null && x8Var.e.h) {
                        int i14 = -xb0Var.N;
                        xb0Var.N = i14;
                        AndroidUtilities.shakeViewSpring(x8Var, i14);
                        return;
                    }
                    x8 x8Var2 = (x8) view;
                    boolean z18 = x8Var2.e.h;
                    x8Var2.setChecked(!z18);
                    xb0Var.Z(z18);
                    x8 x8Var3 = xb0Var.f38665n;
                    if (x8Var3 != null) {
                        if (x8Var2.e.h) {
                            x8Var3.setChecked(false);
                            xb0Var.f38665n.setCheckBoxIcon(R.drawable.permission_locked);
                            xb0Var.f38666r.setVisibility(8);
                            return;
                        } else if (xb0Var.e == null) {
                            x8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                wg0 wg0Var = (wg0) this.f17662c;
                boolean z19 = this.f17661b;
                xg0 xg0Var = wg0Var.V;
                if (xg0Var.getParentActivity() != null) {
                    boolean z20 = true;
                    boolean z21 = !xg0Var.E;
                    xg0Var.E = z21;
                    ((org.telegram.ui.Cells.z1) view).c(z21, true);
                    if (((z19 && xg0Var.getConnectionsManager().isTestBackend()) ? false : false) != xg0Var.E) {
                        xg0Var.getConnectionsManager().switchBackend(false);
                    }
                    wg0Var.s();
                    return;
                }
                return;
            case 7:
                zh.a3 a3Var = (zh.a3) this.f17662c;
                boolean z22 = this.f17661b;
                MessagesController.getInstance(a3Var.C2).setStoryQuality(!z22);
                wc wcVar = new wc(a3Var.f48160c1, a3Var.B0);
                int i15 = R.raw.chats_infotip;
                if (!z22) {
                    i10 = R.string.StoryQualityIncreasedTitle;
                } else {
                    i10 = R.string.StoryQualityDecreasedTitle;
                }
                String string = LocaleController.getString(i10);
                if (!z22) {
                    i11 = R.string.StoryQualityIncreasedMessage;
                } else {
                    i11 = R.string.StoryQualityDecreasedMessage;
                }
                wcVar.M(string, LocaleController.getString(i11), i15).j();
                zh.v2 v2Var = a3Var.f48211t1;
                if (v2Var != null) {
                    v2Var.a();
                    return;
                }
                return;
            default:
                zh.v2 v2Var2 = (zh.v2) this.f17662c;
                boolean z23 = this.f17661b;
                zh.t0 t0Var = zh.t0.W;
                if (t0Var != null) {
                    boolean z24 = !z23;
                    if (t0Var.f48882n && t0Var.f48883r != z24) {
                        t0Var.f48883r = z24;
                        NativeInstance nativeInstance = t0Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z24);
                        }
                    }
                }
                zh.v2 v2Var3 = v2Var2.f48986l.f48211t1;
                if (v2Var3 != null) {
                    v2Var3.a();
                    return;
                }
                return;
        }
    }
}
