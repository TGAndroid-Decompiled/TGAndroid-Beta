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
public final class lt {
    public static TextPaint f39381f0;
    public static volatile lt f39382g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.lc0 C;
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
    public uc1 O;
    public org.telegram.ui.Components.fb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final gt U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.jz X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f39383a;
    public TLRPC.InputStickerSet f39384a0;
    public int f39385b;
    public Object f39386b0;
    public float f39387c;
    public org.telegram.ui.ActionBar.p6 f39388c0;
    public float d;
    public VibrationEffect f39389d0;
    public boolean f39390e0;
    public float f39391f;
    public float f39392g;
    public View h;
    public boolean f39393i;
    public org.telegram.ui.Components.c11 f39394j;
    public org.telegram.ui.ActionBar.k1 f39395k;
    public jt f39396l;
    public boolean f39397m;
    public boolean f39398n;
    public ArrayList f39399o;
    public boolean f39400p;
    public int f39402r;
    public final hi.b f39403s;
    public final tg.b f39404t;
    public final ColorDrawable f39405u;
    public Bitmap v;
    public Activity f39406w;
    public WindowManager.LayoutParams f39407x;
    public l0 f39408y;
    public fg.i f39409z;
    public float e = 0.0f;
    public i0.c f39401q = i0.c.e;

    public lt() {
        hi.b bVar = new hi.b();
        this.f39403s = bVar;
        this.f39404t = new tg.b(bVar);
        this.f39405u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.i0.L(200.0f);
        this.N = new Paint(1);
        this.U = new gt(this);
    }

    public static void a(lt ltVar, Bitmap bitmap, Bitmap bitmap2) {
        hi.b bVar = ltVar.f39403s;
        Paint paint = ltVar.N;
        ltVar.A.O0(true, false);
        ltVar.v = bitmap;
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
        yg.d.c(bVar, ltVar.f39408y);
        ltVar.f39404t.d();
        ltVar.f39390e0 = false;
        fg.i iVar = ltVar.f39409z;
        if (iVar != null) {
            iVar.invalidate();
        }
    }

    public static boolean g(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        float f10;
        int i11;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ih.r rVar;
        String str2;
        ih.r rVar2;
        org.telegram.ui.ActionBar.k2 k2Var;
        jt jtVar = ltVar.f39396l;
        if (jtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = jtVar.d();
        TLRPC.PollAnswer g10 = ltVar.f39396l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.jj.F1(d, g10.option);
        if (F1 != null && F1.voters > 0 && org.telegram.messenger.jj.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.jj.W4(d) && !d.poll.closed && !ltVar.f39396l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && org.telegram.messenger.jj.D(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            ih.r rVar3 = new ih.r(ltVar.f39402r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ltVar.f39388c0);
            org.telegram.ui.Components.z60 z60Var = new org.telegram.ui.Components.z60(actionBarPopupWindow$ActionBarPopupWindowLayout, ltVar.f39388c0);
            View view = z60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i12 = org.telegram.ui.ActionBar.t6.E8;
            z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i12, ltVar.f39388c0)));
            tg.b bVar = ltVar.f39404t;
            wg.d k10 = w7.b9.k(ltVar.f39388c0);
            if (view != null) {
                rVar = rVar3;
                str2 = null;
                vg.f c10 = bVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            } else {
                rVar = rVar3;
                str2 = null;
            }
            z60Var.c(2131231241, org.telegram.messenger.cd.L0(2131753756, str2), new rh(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            z60Var.k();
            org.telegram.messenger.jj y3 = ltVar.f39396l.y();
            Activity activity = ltVar.f39406w;
            if ((activity instanceof LaunchActivity) && y3 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    k2Var = launchActivity.M().getLastFragment();
                } else {
                    k2Var = null;
                }
                if (k2Var != null) {
                    org.telegram.ui.Components.u51 a2 = rVar.a(k2Var, org.telegram.messenger.jj.B0(y3.f16337k), y3.f1(), g10.option, F1.voters, new org.telegram.ui.Components.vg(14, ltVar, k2Var));
                    rVar2 = rVar;
                    z60Var.q(a2);
                    rVar2.setText(org.telegram.messenger.cd.G(F1.voters, "PollVotesCount", new Object[0]));
                    rVar2.f8574a.d(F1.recent_voters, false);
                    rVar2.setLayoutParams(w7.b6.o(-1, 48));
                    int i13 = org.telegram.ui.ActionBar.t6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i13, ltVar.f39388c0), 12, 0);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                    org.telegram.ui.ActionBar.p6 p6Var = ltVar.f39388c0;
                    rVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.a7.k(rVar2, a02, null, N, p6Var);
                    rVar2.setOnClickListener(new bh.f(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar2);
                    View h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ltVar.f39388c0);
                    h1Var.setTag(2131296437, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.a7.j(h1Var, org.telegram.ui.ActionBar.a7.L(0.06f, i12), ltVar.f39388c0);
                    i10 = -1;
                    h1Var.setLayoutParams(w7.b6.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(h1Var);
                }
            }
            rVar2 = rVar;
            rVar2.setText(org.telegram.messenger.cd.G(F1.voters, "PollVotesCount", new Object[0]));
            rVar2.f8574a.d(F1.recent_voters, false);
            rVar2.setLayoutParams(w7.b6.o(-1, 48));
            int i132 = org.telegram.ui.ActionBar.t6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i132, ltVar.f39388c0), 12, 0);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i132);
            org.telegram.ui.ActionBar.p6 p6Var2 = ltVar.f39388c0;
            rVar2.setBackground(a022);
            org.telegram.ui.ActionBar.a7.k(rVar2, a022, null, N2, p6Var2);
            rVar2.setOnClickListener(new bh.f(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar2);
            View h1Var2 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ltVar.f39388c0);
            h1Var2.setTag(2131296437, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.a7.j(h1Var2, org.telegram.ui.ActionBar.a7.L(0.06f, i12), ltVar.f39388c0);
            i10 = -1;
            h1Var2.setLayoutParams(w7.b6.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(h1Var2);
        } else {
            f7 = 0.06f;
            i10 = -1;
        }
        if (z11) {
            i11 = i10;
            str = null;
            f10 = f7;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232356, org.telegram.messenger.cd.L0(2131747171, null), false, ltVar.f39388c0).setOnClickListener(new zs(ltVar, 2));
        } else {
            f10 = f7;
            i11 = i10;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232413, org.telegram.messenger.cd.L0(2131743850, str), false, ltVar.f39388c0).setOnClickListener(new zs(ltVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View h1Var3 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ltVar.f39388c0);
            h1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.a7.j(h1Var3, org.telegram.ui.ActionBar.a7.L(f10, org.telegram.ui.ActionBar.t6.E8), ltVar.f39388c0);
            h1Var3.setLayoutParams(w7.b6.o(i11, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(h1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static lt p() {
        lt ltVar;
        lt ltVar2 = f39382g0;
        if (ltVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ltVar = f39382g0;
                    if (ltVar == null) {
                        ltVar = new lt();
                        f39382g0 = ltVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ltVar;
        }
        return ltVar2;
    }

    public final void m() {
        if (this.f39406w != null && !this.K) {
            org.telegram.messenger.i0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f39409z.invalidate();
            this.W = null;
            this.f39384a0 = null;
            this.Y = null;
            this.f39396l = null;
            this.E = false;
            org.telegram.messenger.i0.h3(new ws(this, 0), 200L);
            uc1 uc1Var = this.O;
            if (uc1Var != null) {
                uc1Var.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
            }
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 8);
        }
    }

    public final void n() {
        sg.b0 reactionsWindow;
        org.telegram.ui.Components.fb fbVar = this.P;
        if (fbVar != null && (reactionsWindow = fbVar.getReactionsWindow()) != null && !reactionsWindow.f48288q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.k1 k1Var = this.f39395k;
        if (k1Var != null) {
            k1Var.dismiss();
            this.f39395k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.z20.m(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.i0.L(-12.0f)), org.telegram.ui.Components.gr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.tk0 tk0Var, jt jtVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        this.f39396l = jtVar;
        if (jtVar != null) {
            this.f39397m = jtVar.j();
            this.f39398n = this.f39396l.o();
        }
        jt jtVar2 = this.f39396l;
        if ((jtVar2 == null || jtVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = tk0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = tk0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.d8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.d8) childAt).f21818a.L()) {
                            imageReceiver.J0(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                        if (((org.telegram.ui.Cells.b8) childAt).f21735a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.f21952a.n() != null) {
                                int i12 = h2Var.P;
                                if (i12 == 6) {
                                    imageReceiver.J0(0);
                                    i10 = 0;
                                } else if (i12 == 2 && h2Var.f21968w) {
                                    imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.vu) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.ey) && ((org.telegram.ui.Components.ey) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.rx0) && (((org.telegram.ui.Components.rx0) childAt).f30038b instanceof org.telegram.ui.Components.f5)) {
                                imageReceiver.J0(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f39383a = x10;
                        this.f39385b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.c11 c11Var = new org.telegram.ui.Components.c11(this, tk0Var, i10, p6Var, 1);
                        this.f39394j = c11Var;
                        org.telegram.messenger.i0.h3(c11Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.tk0 r18, java.lang.Object r19, org.telegram.ui.jt r20, org.telegram.ui.ActionBar.p6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lt.r(android.view.MotionEvent, org.telegram.ui.Components.tk0, java.lang.Object, org.telegram.ui.jt, org.telegram.ui.ActionBar.p6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.jz r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.p6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lt.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.jz, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.p6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.c11 c11Var = this.f39394j;
        if (c11Var != null) {
            org.telegram.messenger.i0.r(c11Var);
            this.f39394j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(jt jtVar) {
        this.f39396l = jtVar;
        if (jtVar != null) {
            this.f39397m = jtVar.j();
            this.f39398n = this.f39396l.o();
        }
    }

    public final void v(Activity activity) {
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.f39402r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i10;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i11 = this.f39402r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i11;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f39406w == activity) {
            return;
        }
        this.f39406w = activity;
        this.J = activity.getResources().getDrawable(2131232571);
        this.f39408y = new l0(this, activity, 6);
        zg.h hVar = new zg.h(this.f39408y);
        l0 l0Var = this.f39408y;
        tg.b bVar = this.f39404t;
        bVar.f48700f = hVar;
        bVar.f48701g = l0Var;
        bVar.e = new je.b();
        this.f39408y.setFocusable(true);
        this.f39408y.setFocusableInTouchMode(true);
        this.f39408y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f39408y;
        ys ysVar = new ys(this);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(l0Var2, ysVar);
        fg.i iVar = new fg.i(this, activity);
        this.f39409z = iVar;
        iVar.setFocusable(false);
        this.f39408y.addView(this.f39409z, w7.b6.e(-1, -1, 51));
        this.f39409z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.vp.r1(this.f39402r);
        this.I = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f39407x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.i0.m(layoutParams);
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(this.f39409z);
        imageReceiver2.R0 = true;
        imageReceiver2.J0 = true;
        imageReceiver2.H0(this.f39409z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.d8)) {
            return false;
        }
        Activity W = org.telegram.messenger.i0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = d8Var;
        TLRPC.Document sticker = d8Var.getSticker();
        org.telegram.messenger.jz stickerPath = d8Var.getStickerPath();
        String str = null;
        String V = org.telegram.messenger.jj.V(d8Var.getSticker(), null, Integer.valueOf(this.f39402r));
        jt jtVar = this.f39396l;
        if (jtVar != null) {
            str = jtVar.F(false);
        }
        s(sticker, stickerPath, V, str, null, 0, d8Var.D, d8Var.getParentObject(), this.f39388c0, 0);
        gt gtVar = this.U;
        org.telegram.messenger.i0.r(gtVar);
        org.telegram.messenger.i0.h3(gtVar, 16L);
        d8Var.setScaled(true);
        return true;
    }
}
