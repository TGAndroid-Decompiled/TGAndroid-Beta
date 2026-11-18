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
    public static TextPaint f50271f0;
    public static volatile ns f50272g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.dc0 C;
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
    public int f50273a;
    public TLRPC.InputStickerSet f50274a0;
    public int f50275b;
    public Object f50276b0;
    public float f50277c;
    public org.telegram.ui.ActionBar.i6 f50278c0;
    public float d;
    public VibrationEffect f50279d0;
    public boolean f50281e0;
    public float f50282f;
    public float f50283g;
    public View h;
    public boolean f50284i;
    public org.telegram.ui.Components.kp0 f50285j;
    public org.telegram.ui.ActionBar.h1 f50286k;
    public ls f50287l;
    public boolean f50288m;
    public boolean f50289n;
    public ArrayList f50290o;
    public boolean f50291p;
    public int f50293r;
    public final ui.b f50294s;
    public final dh.c f50295t;
    public final ColorDrawable f50296u;
    public Bitmap v;
    public Activity f50297w;
    public WindowManager.LayoutParams f50298x;
    public k0 f50299y;
    public ai.k0 f50300z;
    public float f50280e = 0.0f;
    public i0.b f50292q = i0.b.f15888e;

    public ns() {
        ui.b bVar = new ui.b();
        this.f50294s = bVar;
        this.f50295t = new dh.c(bVar, bVar, bVar);
        this.f50296u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new js(this);
    }

    public static void a(ns nsVar, Bitmap bitmap, Bitmap bitmap2) {
        ui.b bVar = nsVar.f50294s;
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
        ih.d.c(bVar, nsVar.f50299y);
        nsVar.f50295t.d();
        nsVar.f50281e0 = false;
        ai.k0 k0Var = nsVar.f50300z;
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
        sh.o oVar;
        String str2;
        sh.o oVar2;
        org.telegram.ui.ActionBar.h2 h2Var;
        ls lsVar = nsVar.f50287l;
        if (lsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = lsVar.d();
        TLRPC.PollAnswer g10 = nsVar.f50287l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.fj.E1(d, g10.option);
        if (E1 != null && E1.voters > 0 && org.telegram.messenger.fj.A(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.fj.W4(d) && !d.poll.closed && !nsVar.f50287l.c()) {
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
            sh.o oVar3 = new sh.o(nsVar.f50293r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50278c0);
            org.telegram.ui.Components.y60 y60Var = new org.telegram.ui.Components.y60(actionBarPopupWindow$ActionBarPopupWindowLayout, nsVar.f50278c0);
            View view = y60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.n6.E8;
            y60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i11, nsVar.f50278c0)));
            dh.c cVar = nsVar.f50295t;
            gh.e l10 = c8.i0.l(nsVar.f50278c0);
            if (view != null) {
                oVar = oVar3;
                str2 = null;
                fh.g c10 = cVar.c(view, null, true);
                c10.p(l10);
                view.setBackground(c10);
            } else {
                oVar = oVar3;
                str2 = null;
            }
            y60Var.c(2131231240, org.telegram.messenger.gd.M0(2131753754, str2), new bh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            y60Var.k();
            org.telegram.messenger.fj z13 = nsVar.f50287l.z();
            Activity activity = nsVar.f50297w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                    h2Var = launchActivity.M().getLastFragment();
                } else {
                    h2Var = null;
                }
                if (h2Var != null) {
                    org.telegram.ui.Components.e51 a10 = oVar.a(h2Var, org.telegram.messenger.fj.B0(z13.f23965k), z13.e1(), g10.option, E1.voters, new org.telegram.ui.Components.ph(12, nsVar, h2Var));
                    oVar2 = oVar;
                    y60Var.q(a10);
                    oVar2.setText(org.telegram.messenger.gd.G(E1.voters, "PollVotesCount", new Object[0]));
                    oVar2.f57472a.d(E1.recent_voters, false);
                    oVar2.setLayoutParams(c8.ma.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.n6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i12, nsVar.f50278c0), 12, 0);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                    org.telegram.ui.ActionBar.i6 i6Var = nsVar.f50278c0;
                    oVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.u6.j(oVar2, a02, null, M, i6Var);
                    oVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(oVar2);
                    View e1Var = new org.telegram.ui.ActionBar.e1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50278c0);
                    e1Var.setTag(2131296437, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.u6.i(e1Var, org.telegram.ui.ActionBar.u6.K(0.06f, i11), nsVar.f50278c0);
                    i7 = -1;
                    e1Var.setLayoutParams(c8.ma.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                }
            }
            oVar2 = oVar;
            oVar2.setText(org.telegram.messenger.gd.G(E1.voters, "PollVotesCount", new Object[0]));
            oVar2.f57472a.d(E1.recent_voters, false);
            oVar2.setLayoutParams(c8.ma.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.n6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i122, nsVar.f50278c0), 12, 0);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i122);
            org.telegram.ui.ActionBar.i6 i6Var2 = nsVar.f50278c0;
            oVar2.setBackground(a022);
            org.telegram.ui.ActionBar.u6.j(oVar2, a022, null, M2, i6Var2);
            oVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(oVar2);
            View e1Var2 = new org.telegram.ui.ActionBar.e1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.f50278c0);
            e1Var2.setTag(2131296437, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.u6.i(e1Var2, org.telegram.ui.ActionBar.u6.K(0.06f, i11), nsVar.f50278c0);
            i7 = -1;
            e1Var2.setLayoutParams(c8.ma.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z11) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232359, org.telegram.messenger.gd.M0(2131746963, null), false, nsVar.f50278c0).setOnClickListener(new cs(nsVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232416, org.telegram.messenger.gd.M0(2131743587, str), false, nsVar.f50278c0).setOnClickListener(new cs(nsVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View e1Var3 = new org.telegram.ui.ActionBar.e1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), nsVar.f50278c0);
            e1Var3.setTag(2131296437, 1);
            org.telegram.ui.ActionBar.u6.i(e1Var3, org.telegram.ui.ActionBar.u6.K(f11, org.telegram.ui.ActionBar.n6.E8), nsVar.f50278c0);
            e1Var3.setLayoutParams(c8.ma.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(e1Var3);
        }
        if (z10 || z11 || z12) {
            return true;
        }
        return false;
    }

    public static ns p() {
        ns nsVar;
        ns nsVar2 = f50272g0;
        if (nsVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    nsVar = f50272g0;
                    if (nsVar == null) {
                        nsVar = new ns();
                        f50272g0 = nsVar;
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
        if (this.f50297w != null && !this.K) {
            org.telegram.messenger.g0.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f50300z.invalidate();
            this.W = null;
            this.f50274a0 = null;
            this.Y = null;
            this.f50287l = null;
            this.E = false;
            org.telegram.messenger.g0.h3(new as(this, 0), 200L);
            k0 k0Var = this.O;
            if (k0Var != null) {
                k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f37208f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.lr.f37208f).start();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25140k1, 8);
        }
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.pb pbVar = this.P;
        if (pbVar != null && (reactionsWindow = pbVar.getReactionsWindow()) != null && !reactionsWindow.f5308q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.h1 h1Var = this.f50286k;
        if (h1Var != null) {
            h1Var.dismiss();
            this.f50286k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.n10.o(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.lr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.ck0 ck0Var, ls lsVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        this.f50287l = lsVar;
        if (lsVar != null) {
            this.f50288m = lsVar.j();
            this.f50289n = this.f50287l.o();
        }
        ls lsVar2 = this.f50287l;
        if ((lsVar2 == null || lsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = ck0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ck0Var.getChildAt(i10);
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
                        if (((org.telegram.ui.Cells.a8) childAt).f30386a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                        if (((org.telegram.ui.Cells.y7) childAt).f32475a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.i2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                            if (i2Var.f30778a.n() != null) {
                                int i11 = i2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && i2Var.f30796w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.uu) {
                            imageReceiver.J0(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.zx) && ((org.telegram.ui.Components.zx) childAt).getSpan() != null) {
                            imageReceiver.J0(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.xw0) && (((org.telegram.ui.Components.xw0) childAt).f42201b instanceof org.telegram.ui.Components.o5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        }
                    }
                    if (i7 != -1) {
                        this.f50273a = x10;
                        this.f50275b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(this, ck0Var, i7, i6Var, 7);
                        this.f50285j = kp0Var;
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

    public final boolean r(android.view.MotionEvent r17, org.telegram.ui.Components.ck0 r18, java.lang.Object r19, org.telegram.ui.ls r20, org.telegram.ui.ActionBar.i6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.r(android.view.MotionEvent, org.telegram.ui.Components.ck0, java.lang.Object, org.telegram.ui.ls, org.telegram.ui.ActionBar.i6):boolean");
    }

    public final void s(org.telegram.tgnet.TLRPC.Document r38, org.telegram.messenger.sy r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, org.telegram.ui.ActionBar.i6 r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.s(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.sy, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, org.telegram.ui.ActionBar.i6, int):void");
    }

    public final void t() {
        org.telegram.ui.Components.kp0 kp0Var = this.f50285j;
        if (kp0Var != null) {
            org.telegram.messenger.g0.r(kp0Var);
            this.f50285j = null;
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
        this.f50287l = lsVar;
        if (lsVar != null) {
            this.f50288m = lsVar.j();
            this.f50289n = this.f50287l.o();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.j10.f24770t0;
        this.f50293r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(Integer.MAX_VALUE);
        int i10 = this.f50293r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(Integer.MAX_VALUE);
        if (this.f50297w == activity) {
            return;
        }
        this.f50297w = activity;
        this.J = activity.getResources().getDrawable(2131232576);
        this.f50299y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.f50299y);
        k0 k0Var = this.f50299y;
        dh.c cVar = this.f50295t;
        cVar.h = kVar;
        cVar.f8377i = k0Var;
        cVar.f8376g = new xe.b();
        this.f50299y.setFocusable(true);
        this.f50299y.setFocusableInTouchMode(true);
        this.f50299y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f50299y;
        bs bsVar = new bs(this);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(k0Var2, bsVar);
        ai.k0 k0Var3 = new ai.k0(this, activity);
        this.f50300z = k0Var3;
        k0Var3.setFocusable(false);
        this.f50299y.addView(this.f50300z, c8.ma.e(-1, -1, 51));
        this.f50300z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.mp.u1(this.f50293r);
        this.I = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f50298x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(this.f50300z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.H0(this.f50300z);
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
        String V = org.telegram.messenger.fj.V(a8Var.getSticker(), null, Integer.valueOf(this.f50293r));
        ls lsVar = this.f50287l;
        if (lsVar != null) {
            str = lsVar.G(false);
        }
        s(sticker, stickerPath, V, str, null, 0, a8Var.E, a8Var.getParentObject(), this.f50278c0, 0);
        js jsVar = this.U;
        org.telegram.messenger.g0.r(jsVar);
        org.telegram.messenger.g0.h3(jsVar, 16L);
        a8Var.setScaled(true);
        return true;
    }
}
