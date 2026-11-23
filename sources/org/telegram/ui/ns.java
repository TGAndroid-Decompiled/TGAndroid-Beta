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
    public static TextPaint f50398f0;
    public static volatile ns f50399g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.cc0 C;
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
    public org.telegram.ui.Components.ob P;
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
    public int f50400a;
    public TLRPC.InputStickerSet f50401a0;
    public int f50402b;
    public Object f50403b0;
    public float f50404c;
    public org.telegram.ui.ActionBar.i6 f50405c0;
    public float d;
    public VibrationEffect f50406d0;
    public boolean f50408e0;
    public float f50409f;
    public float f50410g;
    public View h;
    public boolean f50411i;
    public org.telegram.ui.Components.kp0 f50412j;
    public org.telegram.ui.ActionBar.g1 f50413k;
    public ls f50414l;
    public boolean f50415m;
    public boolean f50416n;
    public ArrayList f50417o;
    public boolean f50418p;
    public int f50420r;
    public final ui.b f50421s;
    public final dh.c f50422t;
    public final ColorDrawable f50423u;
    public Bitmap v;
    public Activity f50424w;
    public WindowManager.LayoutParams f50425x;
    public k0 f50426y;
    public ai.h0 f50427z;
    public float f50407e = 0.0f;
    public i0.b f50419q = i0.b.f15977e;

    public ns() {
        ui.b bVar = new ui.b();
        this.f50421s = bVar;
        this.f50422t = new dh.c(bVar, bVar, bVar);
        this.f50423u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new js(this);
    }

    public static void a(ns nsVar, Bitmap bitmap, Bitmap bitmap2) {
        ui.b bVar = nsVar.f50421s;
        Paint paint = nsVar.N;
        nsVar.A.P0(true, false);
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
        ih.d.c(bVar, nsVar.f50426y);
        nsVar.f50422t.d();
        nsVar.f50408e0 = false;
        ai.h0 h0Var = nsVar.f50427z;
        if (h0Var != null) {
            h0Var.invalidate();
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
        ls lsVar = nsVar.f50414l;
        if (lsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = lsVar.d();
        TLRPC.PollAnswer g10 = nsVar.f50414l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.fj.E1(d, g10.option);
        if (E1 != null && E1.voters > 0 && org.telegram.messenger.fj.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.fj.W4(d) && !d.poll.closed && !nsVar.f50414l.c()) {
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
            sh.n nVar3 = new sh.n(nsVar.f50420r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50405c0);
            org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(actionBarPopupWindow$ActionBarPopupWindowLayout, nsVar.f50405c0);
            View view = x60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.n6.E8;
            x60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i11, nsVar.f50405c0)));
            dh.c cVar = nsVar.f50422t;
            gh.e l10 = c8.j0.l(nsVar.f50405c0);
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
            x60Var.c(2131231243, org.telegram.messenger.gd.N0(2131753753, str2), new ch(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            x60Var.k();
            org.telegram.messenger.fj y10 = nsVar.f50414l.y();
            Activity activity = nsVar.f50424w;
            if ((activity instanceof LaunchActivity) && y10 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    g2Var = launchActivity.M().getLastFragment();
                } else {
                    g2Var = null;
                }
                if (g2Var != null) {
                    org.telegram.ui.Components.g51 a10 = nVar.a(g2Var, org.telegram.messenger.fj.B0(y10.f24073k), y10.e1(), g10.option, E1.voters, new org.telegram.ui.Components.ph(13, nsVar, g2Var));
                    nVar2 = nVar;
                    x60Var.q(a10);
                    nVar2.setText(org.telegram.messenger.gd.G(E1.voters, "PollVotesCount", new Object[0]));
                    nVar2.f57591a.d(E1.recent_voters, false);
                    nVar2.setLayoutParams(c8.na.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.n6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i12, nsVar.f50405c0), 12, 0);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                    org.telegram.ui.ActionBar.i6 i6Var = nsVar.f50405c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.u6.j(nVar2, a02, null, M, i6Var);
                    nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50405c0);
                    d1Var.setTag(2131296439, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.u6.i(d1Var, org.telegram.ui.ActionBar.u6.K(0.06f, i11), nsVar.f50405c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.na.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.gd.G(E1.voters, "PollVotesCount", new Object[0]));
            nVar2.f57591a.d(E1.recent_voters, false);
            nVar2.setLayoutParams(c8.na.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.n6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i122, nsVar.f50405c0), 12, 0);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i122);
            org.telegram.ui.ActionBar.i6 i6Var2 = nsVar.f50405c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.u6.j(nVar2, a022, null, M2, i6Var2);
            nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50405c0);
            d1Var2.setTag(2131296439, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.u6.i(d1Var2, org.telegram.ui.ActionBar.u6.K(0.06f, i11), nsVar.f50405c0);
            i7 = -1;
            d1Var2.setLayoutParams(c8.na.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z11) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232362, org.telegram.messenger.gd.N0(2131746962, null), false, nsVar.f50405c0).setOnClickListener(new cs(nsVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232419, org.telegram.messenger.gd.N0(2131743577, str), false, nsVar.f50405c0).setOnClickListener(new cs(nsVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), nsVar.f50405c0);
            d1Var3.setTag(2131296439, 1);
            org.telegram.ui.ActionBar.u6.i(d1Var3, org.telegram.ui.ActionBar.u6.K(f11, org.telegram.ui.ActionBar.n6.E8), nsVar.f50405c0);
            d1Var3.setLayoutParams(c8.na.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static ns p() {
        ns nsVar;
        ns nsVar2 = f50399g0;
        if (nsVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    nsVar = f50399g0;
                    if (nsVar == null) {
                        nsVar = new ns();
                        f50399g0 = nsVar;
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
        if (this.f50424w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f50427z.invalidate();
            this.W = null;
            this.f50401a0 = null;
            this.Y = null;
            this.f50414l = null;
            this.E = false;
            org.telegram.messenger.g0.h3(new as(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25239k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.ob obVar = this.P;
        if (obVar != null && (reactionsWindow = obVar.getReactionsWindow()) != null && !reactionsWindow.f5303q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f50413k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.f50413k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.m10.o(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.kr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.ek0 ek0Var, ls lsVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        this.f50414l = lsVar;
        if (lsVar != null) {
            this.f50415m = lsVar.j();
            this.f50416n = this.f50414l.o();
        }
        ls lsVar2 = this.f50414l;
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
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.z7;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.z7) childAt).f32601a.M()) {
                            imageReceiver.K0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                        if (((org.telegram.ui.Cells.x7) childAt).f32421a.getImageReceiver().n() != null) {
                            imageReceiver.K0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.i2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                            if (i2Var.f30865a.n() != null) {
                                int i11 = i2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.K0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && i2Var.f30883w) {
                                    imageReceiver.K0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.uu) {
                            imageReceiver.K0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.yx) && ((org.telegram.ui.Components.yx) childAt).getSpan() != null) {
                            imageReceiver.K0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.yw0) && (((org.telegram.ui.Components.yw0) childAt).f42574b instanceof org.telegram.ui.Components.o5)) {
                                imageReceiver.K0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f50400a = x10;
                        this.f50402b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(this, ek0Var, i7, i6Var, 8);
                        this.f50412j = kp0Var;
                        org.telegram.messenger.g0.h3(kp0Var, 200L);
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.ek0 r18, java.lang.Object r19, org.telegram.ui.ls r20, org.telegram.ui.ActionBar.i6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.r(android.view.MotionEvent, org.telegram.ui.Components.ek0, java.lang.Object, org.telegram.ui.ls, org.telegram.ui.ActionBar.i6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.sy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.i6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.sy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.i6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.kp0 kp0Var = this.f50412j;
        if (kp0Var != null) {
            org.telegram.messenger.g0.r(kp0Var);
            this.f50412j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.x7) {
                ((org.telegram.ui.Cells.x7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.i2) {
                ((org.telegram.ui.Cells.i2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(ls lsVar) {
        this.f50414l = lsVar;
        if (lsVar != null) {
            this.f50415m = lsVar.j();
            this.f50416n = this.f50414l.o();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.i10.f24637t0;
        this.f50420r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.F0(Integer.MAX_VALUE);
        int i10 = this.f50420r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.F0(Integer.MAX_VALUE);
        if (this.f50424w == activity) {
            return;
        }
        this.f50424w = activity;
        this.J = activity.getResources().getDrawable(2131232579);
        this.f50426y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f50426y);
        k0 k0Var = this.f50426y;
        dh.c cVar = this.f50422t;
        cVar.h = kVar;
        cVar.f8371i = k0Var;
        cVar.f8370g = new xe.b();
        this.f50426y.setFocusable(true);
        this.f50426y.setFocusableInTouchMode(true);
        this.f50426y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f50426y;
        bs bsVar = new bs(this);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(k0Var2, bsVar);
        ai.h0 h0Var = new ai.h0(this, activity);
        this.f50427z = h0Var;
        h0Var.setFocusable(false);
        this.f50426y.addView(this.f50427z, c8.na.e(-1, -1, 51));
        this.f50427z.setOnTouchListener(new c0(this, 1));
        org.telegram.messenger.mp.u1(this.f50420r);
        this.I = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f50425x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.I0(this.f50427z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.I0(this.f50427z);
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
        } else if (view2 instanceof org.telegram.ui.Cells.i2) {
            ((org.telegram.ui.Cells.i2) view2).setScaled(false);
        }
        this.h = z7Var;
        TLRPC.Document sticker = z7Var.getSticker();
        org.telegram.messenger.sy stickerPath = z7Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.fj.V(z7Var.getSticker(), null, Integer.valueOf(this.f50420r));
        ls lsVar = this.f50414l;
        if (lsVar != null) {
            str = lsVar.F(false);
        }
        s(sticker, stickerPath, V, str, null, 0, z7Var.E, z7Var.getParentObject(), this.f50405c0, 0);
        js jsVar = this.U;
        org.telegram.messenger.g0.r(jsVar);
        org.telegram.messenger.g0.h3(jsVar, 16L);
        z7Var.setScaled(true);
        return true;
    }
}
