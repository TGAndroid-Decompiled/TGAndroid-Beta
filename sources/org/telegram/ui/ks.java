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
public final class ks {
    public static TextPaint f47266f0;
    public static volatile ks f47267g0;
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
    public org.telegram.ui.Components.lb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final gs U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.zy X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f47268a;
    public TLRPC.InputStickerSet f47269a0;
    public int f47270b;
    public Object f47271b0;
    public float f47272c;
    public org.telegram.ui.ActionBar.f6 f47273c0;
    public float d;
    public VibrationEffect f47274d0;
    public boolean f47276e0;
    public float f47277f;
    public float f47278g;
    public View h;
    public boolean f47279i;
    public org.telegram.ui.Components.pp0 f47280j;
    public org.telegram.ui.ActionBar.g1 f47281k;
    public is f47282l;
    public boolean f47283m;
    public boolean f47284n;
    public ArrayList f47285o;
    public boolean f47286p;
    public int f47288r;
    public final ri.b f47289s;
    public final dh.c f47290t;
    public final ColorDrawable f47291u;
    public Bitmap v;
    public Activity f47292w;
    public WindowManager.LayoutParams f47293x;
    public k0 f47294y;
    public bi.x5 f47295z;
    public float f47275e = 0.0f;
    public i0.b f47287q = i0.b.f15116e;

    public ks() {
        ri.b bVar = new ri.b();
        this.f47289s = bVar;
        this.f47290t = new dh.c(bVar, bVar, bVar);
        this.f47291u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new gs(this);
    }

    public static void a(ks ksVar, Bitmap bitmap, Bitmap bitmap2) {
        ri.b bVar = ksVar.f47289s;
        Paint paint = ksVar.N;
        ksVar.A.O0(true, false);
        ksVar.v = bitmap;
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
        ih.d.c(bVar, ksVar.f47294y);
        ksVar.f47290t.d();
        ksVar.f47276e0 = false;
        bi.x5 x5Var = ksVar.f47295z;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    public static boolean g(ks ksVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f10;
        int i7;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.n nVar;
        String str2;
        sh.n nVar2;
        org.telegram.ui.ActionBar.f2 f2Var;
        is isVar = ksVar.f47282l;
        if (isVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = isVar.d();
        TLRPC.PollAnswer g10 = ksVar.f47282l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.ij.F1(d, g10.option);
        if (F1 != null && F1.voters > 0 && org.telegram.messenger.ij.A(d)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!org.telegram.messenger.ij.X4(d) && !d.poll.closed && !ksVar.f47282l.c()) {
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
            sh.n nVar3 = new sh.n(ksVar.f47288r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ksVar.f47273c0);
            org.telegram.ui.Components.k60 k60Var = new org.telegram.ui.Components.k60(actionBarPopupWindow$ActionBarPopupWindowLayout, ksVar.f47273c0);
            View view = k60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.k6.E8;
            k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, ksVar.f47273c0)));
            dh.c cVar = ksVar.f47290t;
            gh.e k10 = c8.g0.k(ksVar.f47273c0);
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
            k60Var.c(2131231240, org.telegram.messenger.hd.M0(2131753756, str2), new bh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            k60Var.k();
            org.telegram.messenger.ij A = ksVar.f47282l.A();
            Activity activity = ksVar.f47292w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    f2Var = launchActivity.M().getLastFragment();
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    org.telegram.ui.Components.p41 a10 = nVar.a(f2Var, org.telegram.messenger.ij.B0(A.f23237k), A.f1(), g10.option, F1.voters, new org.telegram.ui.Components.ex(8, ksVar, f2Var));
                    nVar2 = nVar;
                    k60Var.q(a10);
                    nVar2.setText(org.telegram.messenger.hd.G(F1.voters, "PollVotesCount", new Object[0]));
                    nVar2.f55240a.d(F1.recent_voters, false);
                    nVar2.setLayoutParams(c8.ha.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.k6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, ksVar.f47273c0), 12, 0);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    org.telegram.ui.ActionBar.f6 f6Var = ksVar.f47273c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(nVar2, a02, null, N, f6Var);
                    nVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ksVar.f47273c0);
                    d1Var.setTag(2131296437, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.r6.j(d1Var, org.telegram.ui.ActionBar.r6.L(0.06f, i11), ksVar.f47273c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ha.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.hd.G(F1.voters, "PollVotesCount", new Object[0]));
            nVar2.f55240a.d(F1.recent_voters, false);
            nVar2.setLayoutParams(c8.ha.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.k6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i122, ksVar.f47273c0), 12, 0);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i122);
            org.telegram.ui.ActionBar.f6 f6Var2 = ksVar.f47273c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.r6.k(nVar2, a022, null, N2, f6Var2);
            nVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ksVar.f47273c0);
            d1Var2.setTag(2131296437, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.r6.j(d1Var2, org.telegram.ui.ActionBar.r6.L(0.06f, i11), ksVar.f47273c0);
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
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232357, org.telegram.messenger.hd.M0(2131747155, null), false, ksVar.f47273c0).setOnClickListener(new zr(ksVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232414, org.telegram.messenger.hd.M0(2131743825, str), false, ksVar.f47273c0).setOnClickListener(new zr(ksVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z9 && (z10 || z11)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ksVar.f47273c0);
            d1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.r6.j(d1Var3, org.telegram.ui.ActionBar.r6.L(f11, org.telegram.ui.ActionBar.k6.E8), ksVar.f47273c0);
            d1Var3.setLayoutParams(c8.ha.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        if (z9 || z10 || z11) {
            return true;
        }
        return false;
    }

    public static ks p() {
        ks ksVar;
        ks ksVar2 = f47267g0;
        if (ksVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ksVar = f47267g0;
                    if (ksVar == null) {
                        ksVar = new ks();
                        f47267g0 = ksVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ksVar;
        }
        return ksVar2;
    }

    public final void m() {
        if (this.f47292w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f47295z.invalidate();
            this.W = null;
            this.f47269a0 = null;
            this.Y = null;
            this.f47282l = null;
            this.E = false;
            org.telegram.messenger.g0.i3(new xr(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40329f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.xq.f40329f).start();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25009k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.lb lbVar = this.P;
        if (lbVar != null && (reactionsWindow = lbVar.getReactionsWindow()) != null && !reactionsWindow.f6197q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f47281k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.f47281k = null;
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

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.pj0 pj0Var, is isVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        this.f47282l = isVar;
        if (isVar != null) {
            this.f47283m = isVar.j();
            this.f47284n = this.f47282l.p();
        }
        is isVar2 = this.f47282l;
        if ((isVar2 == null || isVar2.h()) && motionEvent.getAction() == 0) {
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
                        if (((org.telegram.ui.Cells.z7) childAt).f30967a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                        if (((org.telegram.ui.Cells.x7) childAt).f30890a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f29227a.n() != null) {
                                int i11 = h2Var.P;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && h2Var.f29244w) {
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
                            if ((childAt instanceof org.telegram.ui.Components.nw0) && (((org.telegram.ui.Components.nw0) childAt).f36399b instanceof org.telegram.ui.Components.i5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f47268a = x10;
                        this.f47270b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.pp0 pp0Var = new org.telegram.ui.Components.pp0(this, pj0Var, i7, f6Var, 6);
                        this.f47280j = pp0Var;
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

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.pj0 r18, java.lang.Object r19, org.telegram.ui.is r20, org.telegram.ui.ActionBar.f6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ks.r(android.view.MotionEvent, org.telegram.ui.Components.pj0, java.lang.Object, org.telegram.ui.is, org.telegram.ui.ActionBar.f6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.zy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.f6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ks.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.zy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.f6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.pp0 pp0Var = this.f47280j;
        if (pp0Var != null) {
            org.telegram.messenger.g0.r(pp0Var);
            this.f47280j = null;
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

    public final void u(is isVar) {
        this.f47282l = isVar;
        if (isVar != null) {
            this.f47283m = isVar.j();
            this.f47284n = this.f47282l.p();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.p10.f24459s0;
        this.f47288r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f47288r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f47292w == activity) {
            return;
        }
        this.f47292w = activity;
        this.J = activity.getResources().getDrawable(2131232574);
        this.f47294y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f47294y);
        k0 k0Var = this.f47294y;
        dh.c cVar = this.f47290t;
        cVar.h = kVar;
        cVar.f8708i = k0Var;
        cVar.f8707g = new xe.b();
        this.f47294y.setFocusable(true);
        this.f47294y.setFocusableInTouchMode(true);
        this.f47294y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f47294y;
        yr yrVar = new yr(this);
        WeakHashMap weakHashMap = r0.i0.f54098a;
        r0.a0.i(k0Var2, yrVar);
        bi.x5 x5Var = new bi.x5(this, activity);
        this.f47295z = x5Var;
        x5Var.setFocusable(false);
        this.f47294y.addView(this.f47295z, c8.ha.e(-1, -1, 51));
        this.f47295z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.qp.s1(this.f47288r);
        this.I = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f47293x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(this.f47295z);
        imageReceiver2.R0 = true;
        imageReceiver2.J0 = true;
        imageReceiver2.H0(this.f47295z);
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
        String V = org.telegram.messenger.ij.V(z7Var.getSticker(), null, Integer.valueOf(this.f47288r));
        is isVar = this.f47282l;
        if (isVar != null) {
            str = isVar.G(false);
        }
        s(sticker, stickerPath, V, str, null, 0, z7Var.D, z7Var.getParentObject(), this.f47273c0, 0);
        gs gsVar = this.U;
        org.telegram.messenger.g0.r(gsVar);
        org.telegram.messenger.g0.i3(gsVar, 16L);
        z7Var.setScaled(true);
        return true;
    }
}
