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
public final class is {
    public static TextPaint f46380f0;
    public static volatile is f46381g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.nb0 C;
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
    public l0 O;
    public org.telegram.ui.Components.jb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final es U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.ry X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f46382a;
    public TLRPC.InputStickerSet f46383a0;
    public int f46384b;
    public Object f46385b0;
    public float f46386c;
    public org.telegram.ui.ActionBar.e6 f46387c0;
    public float d;
    public VibrationEffect f46388d0;
    public boolean f46390e0;
    public float f46391f;
    public float f46392g;
    public View h;
    public boolean f46393i;
    public org.telegram.ui.Components.zo0 f46394j;
    public org.telegram.ui.ActionBar.f1 f46395k;
    public gs f46396l;
    public boolean f46397m;
    public boolean f46398n;
    public ArrayList f46399o;
    public boolean f46400p;
    public int f46402r;
    public final si.b f46403s;
    public final eh.c f46404t;
    public final ColorDrawable f46405u;
    public Bitmap v;
    public Activity f46406w;
    public WindowManager.LayoutParams f46407x;
    public l0 f46408y;
    public ai.c0 f46409z;
    public float f46389e = 0.0f;
    public i0.b f46401q = i0.b.f14494e;

    public is() {
        si.b bVar = new si.b();
        this.f46403s = bVar;
        this.f46404t = new eh.c(bVar, bVar, bVar);
        this.f46405u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new es(this);
    }

    public static void a(is isVar, Bitmap bitmap, Bitmap bitmap2) {
        si.b bVar = isVar.f46403s;
        Paint paint = isVar.N;
        isVar.A.O0(true, false);
        isVar.v = bitmap;
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
        jh.d.c(bVar, isVar.f46408y);
        isVar.f46404t.d();
        isVar.f46390e0 = false;
        ai.c0 c0Var = isVar.f46409z;
        if (c0Var != null) {
            c0Var.invalidate();
        }
    }

    public static boolean g(is isVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        int i3;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        th.n nVar;
        String str2;
        th.n nVar2;
        org.telegram.ui.ActionBar.d2 d2Var;
        gs gsVar = isVar.f46396l;
        if (gsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = gsVar.d();
        TLRPC.PollAnswer g7 = isVar.f46396l.g();
        if (d == null || d.poll == null || g7 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.zi.F1(d, g7.option);
        if (F1 != null && F1.voters > 0 && org.telegram.messenger.zi.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.zi.X4(d) && !d.poll.closed && !isVar.f46396l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && org.telegram.messenger.zi.D(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            th.n nVar3 = new th.n(isVar.f46402r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), isVar.f46387c0);
            org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(actionBarPopupWindow$ActionBarPopupWindowLayout, isVar.f46387c0);
            View view = f60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.k6.E8;
            f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, isVar.f46387c0)));
            eh.c cVar = isVar.f46404t;
            hh.e k10 = b8.cd.k(isVar.f46387c0);
            if (view != null) {
                nVar = nVar3;
                str2 = null;
                gh.g c2 = cVar.c(view, null, true);
                c2.p(k10);
                view.setBackground(c2);
            } else {
                nVar = nVar3;
                str2 = null;
            }
            f60Var.c(2131231240, org.telegram.messenger.bd.M0(2131753756, str2), new xg(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            f60Var.k();
            org.telegram.messenger.zi z13 = isVar.f46396l.z();
            Activity activity = isVar.f46406w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    d2Var = launchActivity.M().getLastFragment();
                } else {
                    d2Var = null;
                }
                if (d2Var != null) {
                    org.telegram.ui.Components.l41 a10 = nVar.a(d2Var, org.telegram.messenger.zi.B0(z13.f26868k), z13.f1(), g7.option, F1.voters, new org.telegram.ui.Components.ei(11, isVar, d2Var));
                    nVar2 = nVar;
                    f60Var.q(a10);
                    nVar2.setText(org.telegram.messenger.bd.G(F1.voters, "PollVotesCount", new Object[0]));
                    nVar2.f55437a.d(F1.recent_voters, false);
                    nVar2.setLayoutParams(b8.mf.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.k6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, isVar.f46387c0), 12, 0);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    org.telegram.ui.ActionBar.e6 e6Var = isVar.f46387c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(nVar2, a02, null, N, e6Var);
                    nVar2.setOnClickListener(new bi.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View c1Var = new org.telegram.ui.ActionBar.c1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), isVar.f46387c0);
                    c1Var.setTag(2131296437, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.r6.j(c1Var, org.telegram.ui.ActionBar.r6.L(0.06f, i11), isVar.f46387c0);
                    i3 = -1;
                    c1Var.setLayoutParams(b8.mf.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.bd.G(F1.voters, "PollVotesCount", new Object[0]));
            nVar2.f55437a.d(F1.recent_voters, false);
            nVar2.setLayoutParams(b8.mf.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.k6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i122, isVar.f46387c0), 12, 0);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i122);
            org.telegram.ui.ActionBar.e6 e6Var2 = isVar.f46387c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.r6.k(nVar2, a022, null, N2, e6Var2);
            nVar2.setOnClickListener(new bi.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View c1Var2 = new org.telegram.ui.ActionBar.c1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), isVar.f46387c0);
            c1Var2.setTag(2131296437, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.r6.j(c1Var2, org.telegram.ui.ActionBar.r6.L(0.06f, i11), isVar.f46387c0);
            i3 = -1;
            c1Var2.setLayoutParams(b8.mf.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c1Var2);
        } else {
            f10 = 0.06f;
            i3 = -1;
        }
        if (z11) {
            i10 = i3;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232357, org.telegram.messenger.bd.M0(2131747164, null), false, isVar.f46387c0).setOnClickListener(new xr(isVar, 2));
        } else {
            f11 = f10;
            i10 = i3;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232414, org.telegram.messenger.bd.M0(2131743834, str), false, isVar.f46387c0).setOnClickListener(new xr(isVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View c1Var3 = new org.telegram.ui.ActionBar.c1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), isVar.f46387c0);
            c1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.r6.j(c1Var3, org.telegram.ui.ActionBar.r6.L(f11, org.telegram.ui.ActionBar.k6.E8), isVar.f46387c0);
            c1Var3.setLayoutParams(b8.mf.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(c1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static is p() {
        is isVar;
        is isVar2 = f46381g0;
        if (isVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    isVar = f46381g0;
                    if (isVar == null) {
                        isVar = new is();
                        f46381g0 = isVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return isVar;
        }
        return isVar2;
    }

    public final void m() {
        if (this.f46406w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f46409z.invalidate();
            this.W = null;
            this.f46383a0 = null;
            this.Y = null;
            this.f46396l = null;
            this.E = false;
            org.telegram.messenger.g0.i3(new vr(this, 0), 200L);
            l0 l0Var = this.O;
            if (l0Var != null) {
                l0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 8);
        }
    }

    public final void n() {
        dh.a0 reactionsWindow;
        org.telegram.ui.Components.jb jbVar = this.P;
        if (jbVar != null && (reactionsWindow = jbVar.getReactionsWindow()) != null && !reactionsWindow.f8945q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.f1 f1Var = this.f46395k;
        if (f1Var != null) {
            f1Var.dismiss();
            this.f46395k = null;
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

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.tj0 tj0Var, gs gsVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        this.f46396l = gsVar;
        if (gsVar != null) {
            this.f46397m = gsVar.j();
            this.f46398n = this.f46396l.p();
        }
        gs gsVar2 = this.f46396l;
        if ((gsVar2 == null || gsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            int childCount = tj0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tj0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y9 && bottom >= y9 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.y7;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.y7) childAt).f30992a.L()) {
                            imageReceiver.J0(0);
                            i3 = 0;
                        }
                        i3 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                        if (((org.telegram.ui.Cells.w7) childAt).f30813a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i3 = 0;
                        }
                        i3 = -1;
                    } else {
                        i3 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f29294a.n() != null) {
                                int i11 = h2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i3 = 0;
                                } else if (i11 == 2 && h2Var.f29312w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i3 = 1;
                                }
                            }
                            i3 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.iu) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.nx) && ((org.telegram.ui.Components.nx) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.nw0) && (((org.telegram.ui.Components.nw0) childAt).f36632b instanceof org.telegram.ui.Components.g5)) {
                                imageReceiver.J0(0);
                            }
                            i3 = -1;
                        }
                    }
                    if (i3 != -1) {
                        this.f46382a = x10;
                        this.f46384b = y9;
                        this.h = childAt;
                        org.telegram.ui.Components.zo0 zo0Var = new org.telegram.ui.Components.zo0(this, tj0Var, i3, e6Var, 7);
                        this.f46394j = zo0Var;
                        org.telegram.messenger.g0.i3(zo0Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.tj0 r18, java.lang.Object r19, org.telegram.ui.gs r20, org.telegram.ui.ActionBar.e6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.is.r(android.view.MotionEvent, org.telegram.ui.Components.tj0, java.lang.Object, org.telegram.ui.gs, org.telegram.ui.ActionBar.e6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.ry r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.e6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.is.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ry, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.e6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.zo0 zo0Var = this.f46394j;
        if (zo0Var != null) {
            org.telegram.messenger.g0.r(zo0Var);
            this.f46394j = null;
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

    public final void u(gs gsVar) {
        this.f46396l = gsVar;
        if (gsVar != null) {
            this.f46397m = gsVar.j();
            this.f46398n = this.f46396l.p();
        }
    }

    public final void v(Activity activity) {
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f46402r = i3;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i3;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f46402r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f46406w == activity) {
            return;
        }
        this.f46406w = activity;
        this.J = activity.getResources().getDrawable(2131232572);
        this.f46408y = new l0(6, activity, this);
        kh.k kVar = new kh.k(this.f46408y);
        l0 l0Var = this.f46408y;
        eh.c cVar = this.f46404t;
        cVar.h = kVar;
        cVar.f9986i = l0Var;
        cVar.f9985g = new ue.b();
        this.f46408y.setFocusable(true);
        this.f46408y.setFocusableInTouchMode(true);
        this.f46408y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f46408y;
        wr wrVar = new wr(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(l0Var2, wrVar);
        ai.c0 c0Var = new ai.c0(this, activity);
        this.f46409z = c0Var;
        c0Var.setFocusable(false);
        this.f46408y.addView(this.f46409z, b8.mf.e(-1, -1, 51));
        this.f46409z.setOnTouchListener(new e0(this, 1));
        org.telegram.messenger.hp.s1(this.f46402r);
        this.I = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f46407x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(this.f46409z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.H0(this.f46409z);
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
        org.telegram.messenger.ry stickerPath = y7Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.zi.V(y7Var.getSticker(), null, Integer.valueOf(this.f46402r));
        gs gsVar = this.f46396l;
        if (gsVar != null) {
            str = gsVar.F(false);
        }
        s(sticker, stickerPath, V, str, null, 0, y7Var.E, y7Var.getParentObject(), this.f46387c0, 0);
        es esVar = this.U;
        org.telegram.messenger.g0.r(esVar);
        org.telegram.messenger.g0.i3(esVar, 16L);
        y7Var.setScaled(true);
        return true;
    }
}
