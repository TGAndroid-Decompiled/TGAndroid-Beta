package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ms {
    public static TextPaint f47954f0;
    public static volatile ms f47955g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.tb0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public k0 O;
    public org.telegram.ui.Components.lb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final is U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.zy X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f47956a;
    public TLRPC.InputStickerSet f47957a0;
    public int f47958b;
    public Object f47959b0;
    public float f47960c;
    public org.telegram.ui.ActionBar.g6 f47961c0;
    public float d;
    public VibrationEffect f47962d0;
    public boolean f47964e0;
    public float f47965f;
    public float f47966g;
    public View h;
    public boolean f47967i;
    public org.telegram.ui.Components.qp0 f47968j;
    public org.telegram.ui.ActionBar.g1 f47969k;
    public ks f47970l;
    public boolean f47971m;
    public boolean f47972n;
    public ArrayList f47973o;
    public boolean f47974p;
    public int f47976r;
    public final ri.b f47977s;
    public final dh.c f47978t;
    public final ColorDrawable f47979u;
    public Bitmap v;
    public Activity f47980w;
    public WindowManager.LayoutParams f47981x;
    public k0 f47982y;
    public bi.x5 f47983z;
    public float f47963e = 0.0f;
    public i0.b f47975q = i0.b.f15119e;

    public ms() {
        ri.b bVar = new ri.b();
        this.f47977s = bVar;
        this.f47978t = new dh.c(bVar, bVar, bVar);
        this.f47979u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new is(this);
    }

    public static void a(ms msVar, Bitmap bitmap, Bitmap bitmap2) {
        ri.b bVar = msVar.f47977s;
        Paint paint = msVar.N;
        msVar.A.O0(true, false);
        msVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        ih.d.c(bVar, msVar.f47982y);
        msVar.f47978t.d();
        msVar.f47964e0 = false;
        bi.x5 x5Var = msVar.f47983z;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    public static boolean g(ms msVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f10;
        int i7;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.o oVar;
        String str2;
        sh.o oVar2;
        org.telegram.ui.ActionBar.f2 f2Var;
        ks ksVar = msVar.f47970l;
        if (ksVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ksVar.d();
        TLRPC.PollAnswer g10 = msVar.f47970l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.ij.E1(d, g10.option);
        if (E1 != null && E1.voters > 0 && org.telegram.messenger.ij.A(d)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!org.telegram.messenger.ij.W4(d) && !d.poll.closed && !msVar.f47970l.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && org.telegram.messenger.ij.D(d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9) {
            sh.o oVar3 = new sh.o(msVar.f47976r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), msVar.f47961c0);
            org.telegram.ui.Components.l60 l60Var = new org.telegram.ui.Components.l60(actionBarPopupWindow$ActionBarPopupWindowLayout, msVar.f47961c0);
            View view = l60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.l6.E8;
            l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i11, msVar.f47961c0)));
            dh.c cVar = msVar.f47978t;
            gh.e k10 = c8.g0.k(msVar.f47961c0);
            if (view != null) {
                oVar = oVar3;
                str2 = null;
                fh.g c10 = cVar.c(view, null, true);
                c10.p(k10);
                view.setBackground(c10);
            } else {
                oVar = oVar3;
                str2 = null;
            }
            l60Var.c(2131231240, org.telegram.messenger.id.M0(2131753756, str2), new dh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            l60Var.k();
            org.telegram.messenger.ij A = msVar.f47970l.A();
            Activity activity = msVar.f47980w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    f2Var = launchActivity.M().getLastFragment();
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    org.telegram.ui.Components.r41 a10 = oVar.a(f2Var, org.telegram.messenger.ij.B0(A.f23262k), A.e1(), g10.option, E1.voters, new org.telegram.ui.Components.fx(8, msVar, f2Var));
                    oVar2 = oVar;
                    l60Var.q(a10);
                    oVar2.setText(org.telegram.messenger.id.G(E1.voters, "PollVotesCount", new Object[0]));
                    oVar2.f55344a.d(E1.recent_voters, false);
                    oVar2.setLayoutParams(c8.ha.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.l6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i12, msVar.f47961c0), 12, 0);
                    org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i12);
                    org.telegram.ui.ActionBar.g6 g6Var = msVar.f47961c0;
                    oVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.s6.j(oVar2, a02, null, M, g6Var);
                    oVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(oVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), msVar.f47961c0);
                    d1Var.setTag(2131296437, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.s6.i(d1Var, org.telegram.ui.ActionBar.s6.K(0.06f, i11), msVar.f47961c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ha.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            oVar2 = oVar;
            oVar2.setText(org.telegram.messenger.id.G(E1.voters, "PollVotesCount", new Object[0]));
            oVar2.f55344a.d(E1.recent_voters, false);
            oVar2.setLayoutParams(c8.ha.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.l6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i122, msVar.f47961c0), 12, 0);
            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i122);
            org.telegram.ui.ActionBar.g6 g6Var2 = msVar.f47961c0;
            oVar2.setBackground(a022);
            org.telegram.ui.ActionBar.s6.j(oVar2, a022, null, M2, g6Var2);
            oVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(oVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), msVar.f47961c0);
            d1Var2.setTag(2131296437, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.s6.i(d1Var2, org.telegram.ui.ActionBar.s6.K(0.06f, i11), msVar.f47961c0);
            i7 = -1;
            d1Var2.setLayoutParams(c8.ha.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z10) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232357, org.telegram.messenger.id.M0(2131747156, null), false, msVar.f47961c0).setOnClickListener(new bs(msVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232414, org.telegram.messenger.id.M0(2131743824, str), false, msVar.f47961c0).setOnClickListener(new bs(msVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z9 && (z10 || z11)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), msVar.f47961c0);
            d1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.s6.i(d1Var3, org.telegram.ui.ActionBar.s6.K(f11, org.telegram.ui.ActionBar.l6.E8), msVar.f47961c0);
            d1Var3.setLayoutParams(c8.ha.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        if (z9 || z10 || z11) {
            return true;
        }
        return false;
    }

    public static ms p() {
        ms msVar;
        ms msVar2 = f47955g0;
        if (msVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    msVar = f47955g0;
                    if (msVar == null) {
                        msVar = new ms();
                        f47955g0 = msVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return msVar;
        }
        return msVar2;
    }

    public final void m() {
        if (this.f47980w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f47983z.invalidate();
            this.W = null;
            this.f47957a0 = null;
            this.Y = null;
            this.f47970l = null;
            this.E = false;
            org.telegram.messenger.g0.i3(new zr(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40458f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.xq.f40458f).start();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25026k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.lb lbVar = this.P;
        if (lbVar != null && (reactionsWindow = lbVar.getReactionsWindow()) != null && !reactionsWindow.f6195q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f47969k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.f47969k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.camera.q.l(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.xq.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.qj0 qj0Var, ks ksVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i7;
        this.f47970l = ksVar;
        if (ksVar != null) {
            this.f47971m = ksVar.j();
            this.f47972n = this.f47970l.p();
        }
        ks ksVar2 = this.f47970l;
        if ((ksVar2 == null || ksVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = qj0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = qj0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z9 = childAt instanceof org.telegram.ui.Cells.z7;
                    ImageReceiver imageReceiver = this.A;
                    if (z9) {
                        if (((org.telegram.ui.Cells.z7) childAt).f30977a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                        if (((org.telegram.ui.Cells.x7) childAt).f30900a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f29235a.n() != null) {
                                int i11 = h2Var.P;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && h2Var.f29252w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.ku) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.qx) && ((org.telegram.ui.Components.qx) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.ow0) && (((org.telegram.ui.Components.ow0) childAt).f36817b instanceof org.telegram.ui.Components.i5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f47956a = x10;
                        this.f47958b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.qp0 qp0Var = new org.telegram.ui.Components.qp0(this, qj0Var, i7, g6Var, 6);
                        this.f47968j = qp0Var;
                        org.telegram.messenger.g0.i3(qp0Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.qj0 r18, java.lang.Object r19, org.telegram.ui.ks r20, org.telegram.ui.ActionBar.g6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ms.r(android.view.MotionEvent, org.telegram.ui.Components.qj0, java.lang.Object, org.telegram.ui.ks, org.telegram.ui.ActionBar.g6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.zy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.g6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ms.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.zy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.g6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.qp0 qp0Var = this.f47968j;
        if (qp0Var != null) {
            org.telegram.messenger.g0.r(qp0Var);
            this.f47968j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.x7) {
                ((org.telegram.ui.Cells.x7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(ks ksVar) {
        this.f47970l = ksVar;
        if (ksVar != null) {
            this.f47971m = ksVar.j();
            this.f47972n = this.f47970l.p();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f47976r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f47976r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f47980w == activity) {
            return;
        }
        this.f47980w = activity;
        this.J = activity.getResources().getDrawable(2131232574);
        this.f47982y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f47982y);
        k0 k0Var = this.f47982y;
        dh.c cVar = this.f47978t;
        cVar.h = kVar;
        cVar.f8706i = k0Var;
        cVar.f8705g = new xe.b();
        this.f47982y.setFocusable(true);
        this.f47982y.setFocusableInTouchMode(true);
        this.f47982y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f47982y;
        as asVar = new as(this);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(k0Var2, asVar);
        bi.x5 x5Var = new bi.x5(this, activity);
        this.f47983z = x5Var;
        x5Var.setFocusable(false);
        this.f47982y.addView(this.f47983z, c8.ha.e(-1, -1, 51));
        this.f47983z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.qp.s1(this.f47976r);
        this.I = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f47981x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(this.f47983z);
        imageReceiver2.R0 = true;
        imageReceiver2.J0 = true;
        imageReceiver2.H0(this.f47983z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.z7)) {
            return false;
        }
        Activity W = org.telegram.messenger.g0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.z7) {
            ((org.telegram.ui.Cells.z7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.x7) {
            ((org.telegram.ui.Cells.x7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = z7Var;
        TLRPC.Document sticker = z7Var.getSticker();
        org.telegram.messenger.zy stickerPath = z7Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.ij.V(z7Var.getSticker(), null, Integer.valueOf(this.f47976r));
        ks ksVar = this.f47970l;
        if (ksVar != null) {
            str = ksVar.G(false);
        }
        s(sticker, stickerPath, V, str, null, 0, z7Var.D, z7Var.getParentObject(), this.f47961c0, 0);
        is isVar = this.U;
        org.telegram.messenger.g0.r(isVar);
        org.telegram.messenger.g0.i3(isVar, 16L);
        z7Var.setScaled(true);
        return true;
    }
}
