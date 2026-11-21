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
    public static TextPaint f50278f0;
    public static volatile ns f50279g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.ec0 C;
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
    public org.telegram.ui.Components.pb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final js U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.sy X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f50280a;
    public TLRPC.InputStickerSet f50281a0;
    public int f50282b;
    public Object f50283b0;
    public float f50284c;
    public org.telegram.ui.ActionBar.h6 f50285c0;
    public float d;
    public VibrationEffect f50286d0;
    public boolean f50288e0;
    public float f50289f;
    public float f50290g;
    public View h;
    public boolean f50291i;
    public org.telegram.ui.Components.mp0 f50292j;
    public org.telegram.ui.ActionBar.g1 f50293k;
    public ls f50294l;
    public boolean f50295m;
    public boolean f50296n;
    public ArrayList f50297o;
    public boolean f50298p;
    public int f50300r;
    public final ui.b f50301s;
    public final dh.c f50302t;
    public final ColorDrawable f50303u;
    public Bitmap v;
    public Activity f50304w;
    public WindowManager.LayoutParams f50305x;
    public k0 f50306y;
    public ai.l0 f50307z;
    public float f50287e = 0.0f;
    public i0.b f50299q = i0.b.f15913e;

    public ns() {
        ui.b bVar = new ui.b();
        this.f50301s = bVar;
        this.f50302t = new dh.c(bVar, bVar, bVar);
        this.f50303u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new js(this);
    }

    public static void a(ns nsVar, Bitmap bitmap, Bitmap bitmap2) {
        ui.b bVar = nsVar.f50301s;
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
        ih.d.c(bVar, nsVar.f50306y);
        nsVar.f50302t.d();
        nsVar.f50288e0 = false;
        ai.l0 l0Var = nsVar.f50307z;
        if (l0Var != null) {
            l0Var.invalidate();
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
        org.telegram.ui.ActionBar.g2 g2Var;
        ls lsVar = nsVar.f50294l;
        if (lsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = lsVar.d();
        TLRPC.PollAnswer g10 = nsVar.f50294l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.fj.E1(d, g10.option);
        if (E1 != null && E1.voters > 0 && org.telegram.messenger.fj.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.fj.W4(d) && !d.poll.closed && !nsVar.f50294l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && org.telegram.messenger.fj.D(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            sh.n nVar3 = new sh.n(nsVar.f50300r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50285c0);
            org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(actionBarPopupWindow$ActionBarPopupWindowLayout, nsVar.f50285c0);
            View view = a70Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.m6.E8;
            a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i11, nsVar.f50285c0)));
            dh.c cVar = nsVar.f50302t;
            gh.e l10 = c8.i0.l(nsVar.f50285c0);
            if (view != null) {
                nVar = nVar3;
                str2 = null;
                fh.g c10 = cVar.c(view, null, true);
                c10.p(l10);
                view.setBackground(c10);
            } else {
                nVar = nVar3;
                str2 = null;
            }
            a70Var.c(2131231240, org.telegram.messenger.gd.N0(2131753753, str2), new bh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            a70Var.k();
            org.telegram.messenger.fj z13 = nsVar.f50294l.z();
            Activity activity = nsVar.f50304w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    g2Var = launchActivity.M().getLastFragment();
                } else {
                    g2Var = null;
                }
                if (g2Var != null) {
                    org.telegram.ui.Components.h51 a10 = nVar.a(g2Var, org.telegram.messenger.fj.B0(z13.f23993k), z13.e1(), g10.option, E1.voters, new org.telegram.ui.Components.rh(12, nsVar, g2Var));
                    nVar2 = nVar;
                    a70Var.q(a10);
                    nVar2.setText(org.telegram.messenger.gd.G(E1.voters, "PollVotesCount", new Object[0]));
                    nVar2.f57511a.d(E1.recent_voters, false);
                    nVar2.setLayoutParams(c8.ma.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.m6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i12, nsVar.f50285c0), 12, 0);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                    org.telegram.ui.ActionBar.h6 h6Var = nsVar.f50285c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.t6.j(nVar2, a02, null, M, h6Var);
                    nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50285c0);
                    d1Var.setTag(2131296439, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.t6.i(d1Var, org.telegram.ui.ActionBar.t6.K(0.06f, i11), nsVar.f50285c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ma.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.gd.G(E1.voters, "PollVotesCount", new Object[0]));
            nVar2.f57511a.d(E1.recent_voters, false);
            nVar2.setLayoutParams(c8.ma.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.m6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i122, nsVar.f50285c0), 12, 0);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i122);
            org.telegram.ui.ActionBar.h6 h6Var2 = nsVar.f50285c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.t6.j(nVar2, a022, null, M2, h6Var2);
            nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50285c0);
            d1Var2.setTag(2131296439, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.t6.i(d1Var2, org.telegram.ui.ActionBar.t6.K(0.06f, i11), nsVar.f50285c0);
            i7 = -1;
            d1Var2.setLayoutParams(c8.ma.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z11) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232359, org.telegram.messenger.gd.N0(2131746962, null), false, nsVar.f50285c0).setOnClickListener(new cs(nsVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232416, org.telegram.messenger.gd.N0(2131743581, str), false, nsVar.f50285c0).setOnClickListener(new cs(nsVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), nsVar.f50285c0);
            d1Var3.setTag(2131296439, 1);
            org.telegram.ui.ActionBar.t6.i(d1Var3, org.telegram.ui.ActionBar.t6.K(f11, org.telegram.ui.ActionBar.m6.E8), nsVar.f50285c0);
            d1Var3.setLayoutParams(c8.ma.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static ns p() {
        ns nsVar;
        ns nsVar2 = f50279g0;
        if (nsVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    nsVar = f50279g0;
                    if (nsVar == null) {
                        nsVar = new ns();
                        f50279g0 = nsVar;
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
        if (this.f50304w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f50307z.invalidate();
            this.W = null;
            this.f50281a0 = null;
            this.Y = null;
            this.f50294l = null;
            this.E = false;
            org.telegram.messenger.g0.h3(new as(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.nr.f37956f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.nr.f37956f).start();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25168k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.pb pbVar = this.P;
        if (pbVar != null && (reactionsWindow = pbVar.getReactionsWindow()) != null && !reactionsWindow.f5337q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f50293k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.f50293k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.n10.o(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.nr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.ek0 ek0Var, ls lsVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        this.f50294l = lsVar;
        if (lsVar != null) {
            this.f50295m = lsVar.j();
            this.f50296n = this.f50294l.o();
        }
        ls lsVar2 = this.f50294l;
        if ((lsVar2 == null || lsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = ek0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ek0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.a8) childAt).f30414a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                        if (((org.telegram.ui.Cells.y7) childAt).f32503a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.i2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                            if (i2Var.f30806a.n() != null) {
                                int i11 = i2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && i2Var.f30824w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.xu) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.cy) && ((org.telegram.ui.Components.cy) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.zw0) && (((org.telegram.ui.Components.zw0) childAt).f42996b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f50280a = x10;
                        this.f50282b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(this, ek0Var, i7, h6Var, 7);
                        this.f50292j = mp0Var;
                        org.telegram.messenger.g0.h3(mp0Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.ek0 r18, java.lang.Object r19, org.telegram.ui.ls r20, org.telegram.ui.ActionBar.h6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.r(android.view.MotionEvent, org.telegram.ui.Components.ek0, java.lang.Object, org.telegram.ui.ls, org.telegram.ui.ActionBar.h6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.sy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.h6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.sy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.h6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.mp0 mp0Var = this.f50292j;
        if (mp0Var != null) {
            org.telegram.messenger.g0.r(mp0Var);
            this.f50292j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.i2) {
                ((org.telegram.ui.Cells.i2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(ls lsVar) {
        this.f50294l = lsVar;
        if (lsVar != null) {
            this.f50295m = lsVar.j();
            this.f50296n = this.f50294l.o();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.j10.f24798t0;
        this.f50300r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f50300r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f50304w == activity) {
            return;
        }
        this.f50304w = activity;
        this.J = activity.getResources().getDrawable(2131232576);
        this.f50306y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f50306y);
        k0 k0Var = this.f50306y;
        dh.c cVar = this.f50302t;
        cVar.h = kVar;
        cVar.f8406i = k0Var;
        cVar.f8405g = new xe.b();
        this.f50306y.setFocusable(true);
        this.f50306y.setFocusableInTouchMode(true);
        this.f50306y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f50306y;
        bs bsVar = new bs(this);
        WeakHashMap weakHashMap = r0.i0.f56285a;
        r0.a0.i(k0Var2, bsVar);
        ai.l0 l0Var = new ai.l0(this, activity);
        this.f50307z = l0Var;
        l0Var.setFocusable(false);
        this.f50306y.addView(this.f50307z, c8.ma.e(-1, -1, 51));
        this.f50307z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.mp.u1(this.f50300r);
        this.I = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f50305x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(this.f50307z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.H0(this.f50307z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.a8)) {
            return false;
        }
        Activity W = org.telegram.messenger.g0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.a8) {
            ((org.telegram.ui.Cells.a8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.y7) {
            ((org.telegram.ui.Cells.y7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.i2) {
            ((org.telegram.ui.Cells.i2) view2).setScaled(false);
        }
        this.h = a8Var;
        TLRPC.Document sticker = a8Var.getSticker();
        org.telegram.messenger.sy stickerPath = a8Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.fj.V(a8Var.getSticker(), null, Integer.valueOf(this.f50300r));
        ls lsVar = this.f50294l;
        if (lsVar != null) {
            str = lsVar.G(false);
        }
        s(sticker, stickerPath, V, str, null, 0, a8Var.E, a8Var.getParentObject(), this.f50285c0, 0);
        js jsVar = this.U;
        org.telegram.messenger.g0.r(jsVar);
        org.telegram.messenger.g0.h3(jsVar, 16L);
        a8Var.setScaled(true);
        return true;
    }
}
