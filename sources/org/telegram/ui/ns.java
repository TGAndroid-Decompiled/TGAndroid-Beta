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
    public static TextPaint f49640f0;
    public static volatile ns f49641g0;
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
    public org.telegram.ui.Components.gb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final js U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.xy X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f49642a;
    public TLRPC.InputStickerSet f49643a0;
    public int f49644b;
    public Object f49645b0;
    public float f49646c;
    public org.telegram.ui.ActionBar.e6 f49647c0;
    public float d;
    public VibrationEffect f49648d0;
    public boolean f49650e0;
    public float f49651f;
    public float f49652g;
    public View h;
    public boolean f49653i;
    public org.telegram.ui.Components.sp0 f49654j;
    public org.telegram.ui.ActionBar.g1 f49655k;
    public ls f49656l;
    public boolean f49657m;
    public boolean f49658n;
    public ArrayList f49659o;
    public boolean f49660p;
    public int f49662r;
    public final ui.b f49663s;
    public final dh.c f49664t;
    public final ColorDrawable f49665u;
    public Bitmap v;
    public Activity f49666w;
    public WindowManager.LayoutParams f49667x;
    public k0 f49668y;
    public ai.k0 f49669z;
    public float f49649e = 0.0f;
    public i0.c f49661q = i0.c.f15573e;

    public ns() {
        ui.b bVar = new ui.b();
        this.f49663s = bVar;
        this.f49664t = new dh.c(bVar, bVar, bVar);
        this.f49665u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new js(this);
    }

    public static void a(ns nsVar, Bitmap bitmap, Bitmap bitmap2) {
        ui.b bVar = nsVar.f49663s;
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
        ih.d.c(bVar, nsVar.f49668y);
        nsVar.f49664t.d();
        nsVar.f49650e0 = false;
        ai.k0 k0Var = nsVar.f49669z;
        if (k0Var != null) {
            k0Var.invalidate();
        }
    }

    public static boolean g(ns nsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        int i7;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.n nVar;
        String str2;
        sh.n nVar2;
        org.telegram.ui.ActionBar.e2 e2Var;
        ls lsVar = nsVar.f49656l;
        if (lsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = lsVar.d();
        TLRPC.PollAnswer g10 = nsVar.f49656l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.gj.E1(d, g10.option);
        if (E1 != null && E1.voters > 0 && org.telegram.messenger.gj.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.gj.W4(d) && !d.poll.closed && !nsVar.f49656l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && org.telegram.messenger.gj.D(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            sh.n nVar3 = new sh.n(nsVar.f49662r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f49647c0);
            org.telegram.ui.Components.m60 m60Var = new org.telegram.ui.Components.m60(actionBarPopupWindow$ActionBarPopupWindowLayout, nsVar.f49647c0);
            View view = m60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.j6.E8;
            m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i11, nsVar.f49647c0)));
            dh.c cVar = nsVar.f49664t;
            gh.e k10 = c8.g0.k(nsVar.f49647c0);
            if (view != null) {
                nVar = nVar3;
                str2 = null;
                fh.g c10 = cVar.c(view, null, true);
                c10.p(k10);
                view.setBackground(c10);
            } else {
                nVar = nVar3;
                str2 = null;
            }
            m60Var.c(2131231240, org.telegram.messenger.hd.M0(2131753756, str2), new bh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            m60Var.k();
            org.telegram.messenger.gj z13 = nsVar.f49656l.z();
            Activity activity = nsVar.f49666w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    e2Var = launchActivity.M().getLastFragment();
                } else {
                    e2Var = null;
                }
                if (e2Var != null) {
                    org.telegram.ui.Components.u41 a10 = nVar.a(e2Var, org.telegram.messenger.gj.B0(z13.f23819k), z13.e1(), g10.option, E1.voters, new org.telegram.ui.Components.gh(13, nsVar, e2Var));
                    nVar2 = nVar;
                    m60Var.q(a10);
                    nVar2.setText(org.telegram.messenger.hd.G(E1.voters, "PollVotesCount", new Object[0]));
                    nVar2.f56896a.d(E1.recent_voters, false);
                    nVar2.setLayoutParams(c8.ja.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.j6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i12, nsVar.f49647c0), 12, 0);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
                    org.telegram.ui.ActionBar.e6 e6Var = nsVar.f49647c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.q6.j(nVar2, a02, null, M, e6Var);
                    nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f49647c0);
                    d1Var.setTag(2131296437, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.q6.i(d1Var, org.telegram.ui.ActionBar.q6.K(0.06f, i11), nsVar.f49647c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ja.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.hd.G(E1.voters, "PollVotesCount", new Object[0]));
            nVar2.f56896a.d(E1.recent_voters, false);
            nVar2.setLayoutParams(c8.ja.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.j6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i122, nsVar.f49647c0), 12, 0);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i122);
            org.telegram.ui.ActionBar.e6 e6Var2 = nsVar.f49647c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.q6.j(nVar2, a022, null, M2, e6Var2);
            nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f49647c0);
            d1Var2.setTag(2131296437, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.q6.i(d1Var2, org.telegram.ui.ActionBar.q6.K(0.06f, i11), nsVar.f49647c0);
            i7 = -1;
            d1Var2.setLayoutParams(c8.ja.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z11) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232358, org.telegram.messenger.hd.M0(2131747156, null), false, nsVar.f49647c0).setOnClickListener(new cs(nsVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232415, org.telegram.messenger.hd.M0(2131743824, str), false, nsVar.f49647c0).setOnClickListener(new cs(nsVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), nsVar.f49647c0);
            d1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.q6.i(d1Var3, org.telegram.ui.ActionBar.q6.K(f11, org.telegram.ui.ActionBar.j6.E8), nsVar.f49647c0);
            d1Var3.setLayoutParams(c8.ja.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static ns p() {
        ns nsVar;
        ns nsVar2 = f49641g0;
        if (nsVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    nsVar = f49641g0;
                    if (nsVar == null) {
                        nsVar = new ns();
                        f49641g0 = nsVar;
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
        if (this.f49666w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f49669z.invalidate();
            this.W = null;
            this.f49643a0 = null;
            this.Y = null;
            this.f49656l = null;
            this.E = false;
            org.telegram.messenger.g0.i3(new as(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25523k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.gb gbVar = this.P;
        if (gbVar != null && (reactionsWindow = gbVar.getReactionsWindow()) != null && !reactionsWindow.f5025q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f49655k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.f49655k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.i20.n(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.er.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.uj0 uj0Var, ls lsVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        this.f49656l = lsVar;
        if (lsVar != null) {
            this.f49657m = lsVar.j();
            this.f49658n = this.f49656l.o();
        }
        ls lsVar2 = this.f49656l;
        if ((lsVar2 == null || lsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = uj0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = uj0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.y7;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.y7) childAt).f32067a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                        if (((org.telegram.ui.Cells.w7) childAt).f31889a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f30353a.n() != null) {
                                int i11 = h2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && h2Var.f30371w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.pu) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.ux) && ((org.telegram.ui.Components.ux) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.qw0) && (((org.telegram.ui.Components.qw0) childAt).f38776b instanceof org.telegram.ui.Components.g5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f49642a = x10;
                        this.f49644b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.sp0 sp0Var = new org.telegram.ui.Components.sp0(this, uj0Var, i7, e6Var, 6);
                        this.f49654j = sp0Var;
                        org.telegram.messenger.g0.i3(sp0Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.uj0 r18, java.lang.Object r19, org.telegram.ui.ls r20, org.telegram.ui.ActionBar.e6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.r(android.view.MotionEvent, org.telegram.ui.Components.uj0, java.lang.Object, org.telegram.ui.ls, org.telegram.ui.ActionBar.e6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.xy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.e6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.xy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.e6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.sp0 sp0Var = this.f49654j;
        if (sp0Var != null) {
            org.telegram.messenger.g0.r(sp0Var);
            this.f49654j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.w7) {
                ((org.telegram.ui.Cells.w7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(ls lsVar) {
        this.f49656l = lsVar;
        if (lsVar != null) {
            this.f49657m = lsVar.j();
            this.f49658n = this.f49656l.o();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.m10.f24940t0;
        this.f49662r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f49662r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f49666w == activity) {
            return;
        }
        this.f49666w = activity;
        this.J = activity.getResources().getDrawable(2131232575);
        this.f49668y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f49668y);
        k0 k0Var = this.f49668y;
        dh.c cVar = this.f49664t;
        cVar.h = kVar;
        cVar.f8098i = k0Var;
        cVar.f8097g = new xe.b();
        this.f49668y.setFocusable(true);
        this.f49668y.setFocusableInTouchMode(true);
        this.f49668y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f49668y;
        bs bsVar = new bs(this);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(k0Var2, bsVar);
        ai.k0 k0Var3 = new ai.k0(this, activity);
        this.f49669z = k0Var3;
        k0Var3.setFocusable(false);
        this.f49668y.addView(this.f49669z, c8.ja.e(-1, -1, 51));
        this.f49669z.setOnTouchListener(new c0(this, 1));
        org.telegram.messenger.np.s1(this.f49662r);
        this.I = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f49667x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(this.f49669z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.H0(this.f49669z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.y7)) {
            return false;
        }
        Activity W = org.telegram.messenger.g0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.y7) {
            ((org.telegram.ui.Cells.y7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.w7) {
            ((org.telegram.ui.Cells.w7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = y7Var;
        TLRPC.Document sticker = y7Var.getSticker();
        org.telegram.messenger.xy stickerPath = y7Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.gj.V(y7Var.getSticker(), null, Integer.valueOf(this.f49662r));
        ls lsVar = this.f49656l;
        if (lsVar != null) {
            str = lsVar.G(false);
        }
        s(sticker, stickerPath, V, str, null, 0, y7Var.E, y7Var.getParentObject(), this.f49647c0, 0);
        js jsVar = this.U;
        org.telegram.messenger.g0.r(jsVar);
        org.telegram.messenger.g0.i3(jsVar, 16L);
        y7Var.setScaled(true);
        return true;
    }
}
