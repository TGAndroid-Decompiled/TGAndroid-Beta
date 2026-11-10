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
public final class ns {
    public static TextPaint f48251f0;
    public static volatile ns f48252g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.sb0 C;
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
    public org.telegram.ui.Components.kb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final js U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.zy X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f48253a;
    public TLRPC.InputStickerSet f48254a0;
    public int f48255b;
    public Object f48256b0;
    public float f48257c;
    public org.telegram.ui.ActionBar.h6 f48258c0;
    public float d;
    public VibrationEffect f48259d0;
    public boolean f48261e0;
    public float f48262f;
    public float f48263g;
    public View h;
    public boolean f48264i;
    public org.telegram.ui.Components.pp0 f48265j;
    public org.telegram.ui.ActionBar.g1 f48266k;
    public ls f48267l;
    public boolean f48268m;
    public boolean f48269n;
    public ArrayList f48270o;
    public boolean f48271p;
    public int f48273r;
    public final ri.b f48274s;
    public final dh.c f48275t;
    public final ColorDrawable f48276u;
    public Bitmap v;
    public Activity f48277w;
    public WindowManager.LayoutParams f48278x;
    public k0 f48279y;
    public bi.x5 f48280z;
    public float f48260e = 0.0f;
    public i0.b f48272q = i0.b.f15121e;

    public ns() {
        ri.b bVar = new ri.b();
        this.f48274s = bVar;
        this.f48275t = new dh.c(bVar, bVar, bVar);
        this.f48276u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new js(this);
    }

    public static void a(ns nsVar, Bitmap bitmap, Bitmap bitmap2) {
        ri.b bVar = nsVar.f48274s;
        Paint paint = nsVar.N;
        nsVar.A.O0(true, false);
        nsVar.v = bitmap;
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
        ih.d.c(bVar, nsVar.f48279y);
        nsVar.f48275t.d();
        nsVar.f48261e0 = false;
        bi.x5 x5Var = nsVar.f48280z;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    public static boolean g(ns nsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
        ls lsVar = nsVar.f48267l;
        if (lsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = lsVar.d();
        TLRPC.PollAnswer g10 = nsVar.f48267l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.ij.E1(d, g10.option);
        if (E1 != null && E1.voters > 0 && org.telegram.messenger.ij.A(d)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!org.telegram.messenger.ij.W4(d) && !d.poll.closed && !nsVar.f48267l.c()) {
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
            sh.o oVar3 = new sh.o(nsVar.f48273r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f48258c0);
            org.telegram.ui.Components.k60 k60Var = new org.telegram.ui.Components.k60(actionBarPopupWindow$ActionBarPopupWindowLayout, nsVar.f48258c0);
            View view = k60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.m6.E8;
            k60Var.T(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i11, nsVar.f48258c0)));
            dh.c cVar = nsVar.f48275t;
            gh.e k10 = c8.g0.k(nsVar.f48258c0);
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
            k60Var.c(2131231240, org.telegram.messenger.id.M0(2131753756, str2), new dh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            k60Var.k();
            org.telegram.messenger.ij A = nsVar.f48267l.A();
            Activity activity = nsVar.f48277w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    f2Var = launchActivity.M().getLastFragment();
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    org.telegram.ui.Components.r41 a10 = oVar.a(f2Var, org.telegram.messenger.ij.B0(A.f23266k), A.e1(), g10.option, E1.voters, new org.telegram.ui.Components.ex(8, nsVar, f2Var));
                    oVar2 = oVar;
                    k60Var.q(a10);
                    oVar2.setText(org.telegram.messenger.id.G(E1.voters, "PollVotesCount", new Object[0]));
                    oVar2.f55343a.d(E1.recent_voters, false);
                    oVar2.setLayoutParams(c8.ha.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.m6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i12, nsVar.f48258c0), 12, 0);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                    org.telegram.ui.ActionBar.h6 h6Var = nsVar.f48258c0;
                    oVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.t6.j(oVar2, a02, null, M, h6Var);
                    oVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(oVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f48258c0);
                    d1Var.setTag(2131296437, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.t6.i(d1Var, org.telegram.ui.ActionBar.t6.K(0.06f, i11), nsVar.f48258c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ha.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            oVar2 = oVar;
            oVar2.setText(org.telegram.messenger.id.G(E1.voters, "PollVotesCount", new Object[0]));
            oVar2.f55343a.d(E1.recent_voters, false);
            oVar2.setLayoutParams(c8.ha.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.m6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i122, nsVar.f48258c0), 12, 0);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i122);
            org.telegram.ui.ActionBar.h6 h6Var2 = nsVar.f48258c0;
            oVar2.setBackground(a022);
            org.telegram.ui.ActionBar.t6.j(oVar2, a022, null, M2, h6Var2);
            oVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(oVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f48258c0);
            d1Var2.setTag(2131296437, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.t6.i(d1Var2, org.telegram.ui.ActionBar.t6.K(0.06f, i11), nsVar.f48258c0);
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
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232357, org.telegram.messenger.id.M0(2131747156, null), false, nsVar.f48258c0).setOnClickListener(new cs(nsVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232414, org.telegram.messenger.id.M0(2131743824, str), false, nsVar.f48258c0).setOnClickListener(new cs(nsVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z9 && (z10 || z11)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), nsVar.f48258c0);
            d1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.t6.i(d1Var3, org.telegram.ui.ActionBar.t6.K(f11, org.telegram.ui.ActionBar.m6.E8), nsVar.f48258c0);
            d1Var3.setLayoutParams(c8.ha.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        if (z9 || z10 || z11) {
            return true;
        }
        return false;
    }

    public static ns p() {
        ns nsVar;
        ns nsVar2 = f48252g0;
        if (nsVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    nsVar = f48252g0;
                    if (nsVar == null) {
                        nsVar = new ns();
                        f48252g0 = nsVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return nsVar;
        }
        return nsVar2;
    }

    public final void m() {
        if (this.f48277w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f48280z.invalidate();
            this.W = null;
            this.f48254a0 = null;
            this.Y = null;
            this.f48267l = null;
            this.E = false;
            org.telegram.messenger.g0.i3(new as(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f40046f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.wq.f40046f).start();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.kb kbVar = this.P;
        if (kbVar != null && (reactionsWindow = kbVar.getReactionsWindow()) != null && !reactionsWindow.f6200q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f48266k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.f48266k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.camera.q.l(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.wq.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.pj0 pj0Var, ls lsVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        this.f48267l = lsVar;
        if (lsVar != null) {
            this.f48268m = lsVar.j();
            this.f48269n = this.f48267l.p();
        }
        ls lsVar2 = this.f48267l;
        if ((lsVar2 == null || lsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = pj0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = pj0Var.getChildAt(i10);
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
                        if (((org.telegram.ui.Cells.z7) childAt).f30988a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                        if (((org.telegram.ui.Cells.x7) childAt).f30911a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f29246a.n() != null) {
                                int i11 = h2Var.P;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && h2Var.f29263w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.ju) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.px) && ((org.telegram.ui.Components.px) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.nw0) && (((org.telegram.ui.Components.nw0) childAt).f36408b instanceof org.telegram.ui.Components.h5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f48253a = x10;
                        this.f48255b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.pp0 pp0Var = new org.telegram.ui.Components.pp0(this, pj0Var, i7, h6Var, 6);
                        this.f48265j = pp0Var;
                        org.telegram.messenger.g0.i3(pp0Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.pj0 r18, java.lang.Object r19, org.telegram.ui.ls r20, org.telegram.ui.ActionBar.h6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.r(android.view.MotionEvent, org.telegram.ui.Components.pj0, java.lang.Object, org.telegram.ui.ls, org.telegram.ui.ActionBar.h6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.zy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.h6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.zy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.h6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.pp0 pp0Var = this.f48265j;
        if (pp0Var != null) {
            org.telegram.messenger.g0.r(pp0Var);
            this.f48265j = null;
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

    public final void u(ls lsVar) {
        this.f48267l = lsVar;
        if (lsVar != null) {
            this.f48268m = lsVar.j();
            this.f48269n = this.f48267l.p();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.p10.f24474s0;
        this.f48273r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f48273r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f48277w == activity) {
            return;
        }
        this.f48277w = activity;
        this.J = activity.getResources().getDrawable(2131232574);
        this.f48279y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f48279y);
        k0 k0Var = this.f48279y;
        dh.c cVar = this.f48275t;
        cVar.h = kVar;
        cVar.f8711i = k0Var;
        cVar.f8710g = new xe.b();
        this.f48279y.setFocusable(true);
        this.f48279y.setFocusableInTouchMode(true);
        this.f48279y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f48279y;
        bs bsVar = new bs(this);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(k0Var2, bsVar);
        bi.x5 x5Var = new bi.x5(this, activity);
        this.f48280z = x5Var;
        x5Var.setFocusable(false);
        this.f48279y.addView(this.f48280z, c8.ha.e(-1, -1, 51));
        this.f48280z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.qp.s1(this.f48273r);
        this.I = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f48278x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(this.f48280z);
        imageReceiver2.R0 = true;
        imageReceiver2.J0 = true;
        imageReceiver2.H0(this.f48280z);
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
        String V = org.telegram.messenger.ij.V(z7Var.getSticker(), null, Integer.valueOf(this.f48273r));
        ls lsVar = this.f48267l;
        if (lsVar != null) {
            str = lsVar.G(false);
        }
        s(sticker, stickerPath, V, str, null, 0, z7Var.D, z7Var.getParentObject(), this.f48258c0, 0);
        js jsVar = this.U;
        org.telegram.messenger.g0.r(jsVar);
        org.telegram.messenger.g0.i3(jsVar, 16L);
        z7Var.setScaled(true);
        return true;
    }
}
